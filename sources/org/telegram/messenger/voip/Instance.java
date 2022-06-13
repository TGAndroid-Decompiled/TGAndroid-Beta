package org.telegram.messenger.voip;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.NativeInstance;
import org.webrtc.ContextUtils;
import org.webrtc.VideoSink;

public final class Instance {
    public static final int AUDIO_STATE_ACTIVE = 1;
    public static final int AUDIO_STATE_MUTED = 0;
    public static final List<String> AVAILABLE_VERSIONS;
    public static final int DATA_SAVING_ALWAYS = 2;
    public static final int DATA_SAVING_MOBILE = 1;
    public static final int DATA_SAVING_NEVER = 0;
    public static final int DATA_SAVING_ROAMING = 3;
    public static final int ENDPOINT_TYPE_INET = 0;
    public static final int ENDPOINT_TYPE_LAN = 1;
    public static final int ENDPOINT_TYPE_TCP_RELAY = 3;
    public static final int ENDPOINT_TYPE_UDP_RELAY = 2;
    public static final String ERROR_AUDIO_IO = "ERROR_AUDIO_IO";
    public static final String ERROR_CONNECTION_SERVICE = "ERROR_CONNECTION_SERVICE";
    public static final String ERROR_INCOMPATIBLE = "ERROR_INCOMPATIBLE";
    public static final String ERROR_INSECURE_UPGRADE = "ERROR_INSECURE_UPGRADE";
    public static final String ERROR_LOCALIZED = "ERROR_LOCALIZED";
    public static final String ERROR_PEER_OUTDATED = "ERROR_PEER_OUTDATED";
    public static final String ERROR_PRIVACY = "ERROR_PRIVACY";
    public static final String ERROR_TIMEOUT = "ERROR_TIMEOUT";
    public static final String ERROR_UNKNOWN = "ERROR_UNKNOWN";
    public static final int NET_TYPE_3G = 3;
    public static final int NET_TYPE_DIALUP = 10;
    public static final int NET_TYPE_EDGE = 2;
    public static final int NET_TYPE_ETHERNET = 7;
    public static final int NET_TYPE_GPRS = 1;
    public static final int NET_TYPE_HSPA = 4;
    public static final int NET_TYPE_LTE = 5;
    public static final int NET_TYPE_OTHER_HIGH_SPEED = 8;
    public static final int NET_TYPE_OTHER_LOW_SPEED = 9;
    public static final int NET_TYPE_OTHER_MOBILE = 11;
    public static final int NET_TYPE_UNKNOWN = 0;
    public static final int NET_TYPE_WIFI = 6;
    public static final int PEER_CAP_GROUP_CALLS = 1;
    public static final int STATE_ESTABLISHED = 3;
    public static final int STATE_FAILED = 4;
    public static final int STATE_RECONNECTING = 5;
    public static final int STATE_WAIT_INIT = 1;
    public static final int STATE_WAIT_INIT_ACK = 2;
    public static final int VIDEO_STATE_ACTIVE = 2;
    public static final int VIDEO_STATE_INACTIVE = 0;
    public static final int VIDEO_STATE_PAUSED = 1;
    private static int bufferSize;
    private static ServerConfig globalServerConfig;
    private static NativeInstance instance;

    public interface OnRemoteMediaStateUpdatedListener {
        void onMediaStateUpdated(int i, int i2);
    }

    public interface OnSignalBarsUpdatedListener {
        void onSignalBarsUpdated(int i);
    }

    public interface OnSignalingDataListener {
        void onSignalingData(byte[] bArr);
    }

    public interface OnStateUpdatedListener {
        void onStateUpdated(int i, boolean z);
    }

    public static int getConnectionMaxLayer() {
        return 92;
    }

    static {
        AVAILABLE_VERSIONS = Build.VERSION.SDK_INT >= 18 ? Arrays.asList("4.1.2", "4.0.2", "4.0.1", "4.0.0", "3.0.0", "2.7.7", "2.4.4") : Arrays.asList("2.4.4");
        globalServerConfig = new ServerConfig(new JSONObject());
    }

    private Instance() {
    }

    public static ServerConfig getGlobalServerConfig() {
        return globalServerConfig;
    }

    public static void setGlobalServerConfig(String str) {
        try {
            globalServerConfig = new ServerConfig(new JSONObject(str));
            NativeInstance nativeInstance = instance;
            if (nativeInstance != null) {
                nativeInstance.setGlobalServerConfig(str);
            }
        } catch (JSONException e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("failed to parse tgvoip server config", e);
            }
        }
    }

    public static void destroyInstance() {
        instance = null;
    }

    public static NativeInstance makeInstance(String str, Config config, String str2, Endpoint[] endpointArr, Proxy proxy, int i, EncryptionKey encryptionKey, VideoSink videoSink, long j, NativeInstance.AudioLevelsCallback audioLevelsCallback) {
        if (!"2.4.4".equals(str)) {
            ContextUtils.initialize(ApplicationLoader.applicationContext);
        }
        instance = NativeInstance.make(str, config, str2, endpointArr, proxy, i, encryptionKey, videoSink, j, audioLevelsCallback);
        setGlobalServerConfig(globalServerConfig.jsonObject.toString());
        setBufferSize(bufferSize);
        return instance;
    }

    public static void setBufferSize(int i) {
        bufferSize = i;
        NativeInstance nativeInstance = instance;
        if (nativeInstance != null) {
            nativeInstance.setBufferSize(i);
        }
    }

    public static String getVersion() {
        NativeInstance nativeInstance = instance;
        if (nativeInstance != null) {
            return nativeInstance.getVersion();
        }
        return null;
    }

    private static void checkHasDelegate() {
        if (instance == null) {
            throw new IllegalStateException("tgvoip version is not set");
        }
    }

    public static final class Config {
        public final int dataSaving;
        public final boolean enableAec;
        public final boolean enableAgc;
        public final boolean enableCallUpgrade;
        public final boolean enableNs;
        public final boolean enableP2p;
        public final boolean enableSm;
        public final double initializationTimeout;
        public final String logPath;
        public final int maxApiLayer;
        public final double receiveTimeout;
        public final String statsLogPath;

        public Config(double d, double d2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, int i2) {
            this.initializationTimeout = d;
            this.receiveTimeout = d2;
            this.dataSaving = i;
            this.enableP2p = z;
            this.enableAec = z2;
            this.enableNs = z3;
            this.enableAgc = z4;
            this.enableCallUpgrade = z5;
            this.logPath = str;
            this.statsLogPath = str2;
            this.maxApiLayer = i2;
            this.enableSm = z6;
        }

        public String toString() {
            return "Config{initializationTimeout=" + this.initializationTimeout + ", receiveTimeout=" + this.receiveTimeout + ", dataSaving=" + this.dataSaving + ", enableP2p=" + this.enableP2p + ", enableAec=" + this.enableAec + ", enableNs=" + this.enableNs + ", enableAgc=" + this.enableAgc + ", enableCallUpgrade=" + this.enableCallUpgrade + ", logPath='" + this.logPath + "', statsLogPath='" + this.statsLogPath + "', maxApiLayer=" + this.maxApiLayer + ", enableSm=" + this.enableSm + '}';
        }
    }

    public static final class Endpoint {
        public final long id;
        public final String ipv4;
        public final String ipv6;
        public final boolean isRtc;
        public final String password;
        public final byte[] peerTag;
        public final int port;
        public final boolean stun;
        public final boolean tcp;
        public final boolean turn;
        public final int type;
        public final String username;

        public Endpoint(boolean z, long j, String str, String str2, int i, int i2, byte[] bArr, boolean z2, boolean z3, String str3, String str4, boolean z4) {
            this.isRtc = z;
            this.id = j;
            this.ipv4 = str;
            this.ipv6 = str2;
            this.port = i;
            this.type = i2;
            this.peerTag = bArr;
            this.turn = z2;
            this.stun = z3;
            this.username = str3;
            this.password = str4;
            this.tcp = z4;
        }

        public String toString() {
            return "Endpoint{id=" + this.id + ", ipv4='" + this.ipv4 + "', ipv6='" + this.ipv6 + "', port=" + this.port + ", type=" + this.type + ", peerTag=" + Arrays.toString(this.peerTag) + ", turn=" + this.turn + ", stun=" + this.stun + ", username=" + this.username + ", password=" + this.password + ", tcp=" + this.tcp + '}';
        }
    }

    public static final class Proxy {
        public final String host;
        public final String login;
        public final String password;
        public final int port;

        public Proxy(String str, int i, String str2, String str3) {
            this.host = str;
            this.port = i;
            this.login = str2;
            this.password = str3;
        }

        public String toString() {
            return "Proxy{host='" + this.host + "', port=" + this.port + ", login='" + this.login + "', password='" + this.password + "'}";
        }
    }

    public static final class EncryptionKey {
        public final boolean isOutgoing;
        public final byte[] value;

        public EncryptionKey(byte[] bArr, boolean z) {
            this.value = bArr;
            this.isOutgoing = z;
        }

        public String toString() {
            return "EncryptionKey{value=" + Arrays.toString(this.value) + ", isOutgoing=" + this.isOutgoing + '}';
        }
    }

    public static final class FinalState {
        public String debugLog;
        public final boolean isRatingSuggested;
        public final byte[] persistentState;
        public final TrafficStats trafficStats;

        public FinalState(byte[] bArr, String str, TrafficStats trafficStats, boolean z) {
            this.persistentState = bArr;
            this.debugLog = str;
            this.trafficStats = trafficStats;
            this.isRatingSuggested = z;
        }

        public String toString() {
            return "FinalState{persistentState=" + Arrays.toString(this.persistentState) + ", debugLog='" + this.debugLog + "', trafficStats=" + this.trafficStats + ", isRatingSuggested=" + this.isRatingSuggested + '}';
        }
    }

    public static final class TrafficStats {
        public final long bytesReceivedMobile;
        public final long bytesReceivedWifi;
        public final long bytesSentMobile;
        public final long bytesSentWifi;

        public TrafficStats(long j, long j2, long j3, long j4) {
            this.bytesSentWifi = j;
            this.bytesReceivedWifi = j2;
            this.bytesSentMobile = j3;
            this.bytesReceivedMobile = j4;
        }

        public String toString() {
            return "TrafficStats{bytesSentWifi=" + this.bytesSentWifi + ", bytesReceivedWifi=" + this.bytesReceivedWifi + ", bytesSentMobile=" + this.bytesSentMobile + ", bytesReceivedMobile=" + this.bytesReceivedMobile + '}';
        }
    }

    public static final class Fingerprint {
        public final String fingerprint;
        public final String hash;
        public final String setup;

        public Fingerprint(String str, String str2, String str3) {
            this.hash = str;
            this.setup = str2;
            this.fingerprint = str3;
        }

        public String toString() {
            return "Fingerprint{hash=" + this.hash + ", setup=" + this.setup + ", fingerprint=" + this.fingerprint + '}';
        }
    }

    public static final class Candidate {
        public final String component;
        public final String foundation;
        public final String generation;
        public final String id;
        public final String ip;
        public final String network;
        public final String port;
        public final String priority;
        public final String protocol;
        public final String relAddr;
        public final String relPort;
        public final String tcpType;
        public final String type;

        public Candidate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.port = str;
            this.protocol = str2;
            this.network = str3;
            this.generation = str4;
            this.id = str5;
            this.component = str6;
            this.foundation = str7;
            this.priority = str8;
            this.ip = str9;
            this.type = str10;
            this.tcpType = str11;
            this.relAddr = str12;
            this.relPort = str13;
        }

        public String toString() {
            return "Candidate{port=" + this.port + ", protocol=" + this.protocol + ", network=" + this.network + ", generation=" + this.generation + ", id=" + this.id + ", component=" + this.component + ", foundation=" + this.foundation + ", priority=" + this.priority + ", ip=" + this.ip + ", type=" + this.type + ", tcpType=" + this.tcpType + ", relAddr=" + this.relAddr + ", relPort=" + this.relPort + '}';
        }
    }

    public static final class ServerConfig {
        public final boolean enableStunMarking;
        public final boolean enable_h264_decoder;
        public final boolean enable_h264_encoder;
        public final boolean enable_h265_decoder;
        public final boolean enable_h265_encoder;
        public final boolean enable_vp8_decoder;
        public final boolean enable_vp8_encoder;
        public final boolean enable_vp9_decoder;
        public final boolean enable_vp9_encoder;
        public final double hangupUiTimeout;
        private final JSONObject jsonObject;
        public final boolean useSystemAec;
        public final boolean useSystemNs;

        private ServerConfig(JSONObject jSONObject) {
            this.jsonObject = jSONObject;
            this.useSystemNs = jSONObject.optBoolean("use_system_ns", true);
            this.useSystemAec = jSONObject.optBoolean("use_system_aec", true);
            this.enableStunMarking = jSONObject.optBoolean("voip_enable_stun_marking", false);
            this.hangupUiTimeout = jSONObject.optDouble("hangup_ui_timeout", 5.0d);
            this.enable_vp8_encoder = jSONObject.optBoolean("enable_vp8_encoder", true);
            this.enable_vp8_decoder = jSONObject.optBoolean("enable_vp8_decoder", true);
            this.enable_vp9_encoder = jSONObject.optBoolean("enable_vp9_encoder", true);
            this.enable_vp9_decoder = jSONObject.optBoolean("enable_vp9_decoder", true);
            this.enable_h265_encoder = jSONObject.optBoolean("enable_h265_encoder", true);
            this.enable_h265_decoder = jSONObject.optBoolean("enable_h265_decoder", true);
            this.enable_h264_encoder = jSONObject.optBoolean("enable_h264_encoder", true);
            this.enable_h264_decoder = jSONObject.optBoolean("enable_h264_decoder", true);
        }

        public String getString(String str) {
            return getString(str, "");
        }

        public String getString(String str, String str2) {
            return this.jsonObject.optString(str, str2);
        }
    }
}
