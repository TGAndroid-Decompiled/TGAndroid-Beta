package org.telegram.messenger.voip;

import java.util.Arrays;
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
    private static ServerConfig globalServerConfig = new ServerConfig(new JSONObject());
    private static NativeInstance instance;

    public static final class Candidate {
        public final String component;
        public final String foundation;
        public final String generation;
        public final String f19329id;
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
            this.f19329id = str5;
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
            return "Candidate{port=" + this.port + ", protocol=" + this.protocol + ", network=" + this.network + ", generation=" + this.generation + ", id=" + this.f19329id + ", component=" + this.component + ", foundation=" + this.foundation + ", priority=" + this.priority + ", ip=" + this.ip + ", type=" + this.type + ", tcpType=" + this.tcpType + ", relAddr=" + this.relAddr + ", relPort=" + this.relPort + '}';
        }
    }

    public static final class Config {
        public final String customParameters;
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

        public Config(double d, double d10, int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, String str2, int i11, String str3) {
            this.initializationTimeout = d;
            this.receiveTimeout = d10;
            this.dataSaving = i10;
            this.enableP2p = z10;
            this.enableAec = z11;
            this.enableNs = z12;
            this.enableAgc = z13;
            this.enableCallUpgrade = z14;
            this.logPath = str;
            this.statsLogPath = str2;
            this.maxApiLayer = i11;
            this.enableSm = z15;
            this.customParameters = str3;
        }

        public String toString() {
            return "Config{initializationTimeout=" + this.initializationTimeout + ", receiveTimeout=" + this.receiveTimeout + ", dataSaving=" + this.dataSaving + ", enableP2p=" + this.enableP2p + ", enableAec=" + this.enableAec + ", enableNs=" + this.enableNs + ", enableAgc=" + this.enableAgc + ", enableCallUpgrade=" + this.enableCallUpgrade + ", logPath='" + this.logPath + "', statsLogPath='" + this.statsLogPath + "', maxApiLayer=" + this.maxApiLayer + ", enableSm=" + this.enableSm + ", customParameters=" + this.customParameters + '}';
        }
    }

    public static final class EncryptionKey {
        public final boolean isOutgoing;
        public final byte[] value;

        public EncryptionKey(byte[] bArr, boolean z10) {
            this.value = bArr;
            this.isOutgoing = z10;
        }

        public String toString() {
            return "EncryptionKey{value=" + Arrays.toString(this.value) + ", isOutgoing=" + this.isOutgoing + '}';
        }
    }

    public static final class Endpoint {
        public final long f19330id;
        public final String ipv4;
        public final String ipv6;
        public final boolean isRtc;
        public final String password;
        public final byte[] peerTag;
        public final int port;
        public int reflectorId;
        public final boolean stun;
        public final boolean tcp;
        public final boolean turn;
        public final int type;
        public final String username;

        public Endpoint(boolean z10, long j3, String str, String str2, int i10, int i11, byte[] bArr, boolean z11, boolean z12, String str3, String str4, boolean z13) {
            this.isRtc = z10;
            this.f19330id = j3;
            this.ipv4 = str;
            this.ipv6 = str2;
            this.port = i10;
            this.type = i11;
            this.peerTag = bArr;
            this.turn = z11;
            this.stun = z12;
            if (z10) {
                this.username = str3;
                this.password = str4;
            } else if (bArr != null) {
                this.username = "reflector";
                this.password = e2.d0.c0(bArr);
            } else {
                this.username = null;
                this.password = null;
            }
            this.tcp = z13;
        }

        public String toString() {
            return "Endpoint{id=" + this.f19330id + ", ipv4='" + this.ipv4 + "', ipv6='" + this.ipv6 + "', port=" + this.port + ", type=" + this.type + ", peerTag=" + Arrays.toString(this.peerTag) + ", turn=" + this.turn + ", stun=" + this.stun + ", username=" + this.username + ", password=" + this.password + ", tcp=" + this.tcp + '}';
        }
    }

    public static final class FinalState {
        public String debugLog;
        public final boolean isRatingSuggested;
        public final byte[] persistentState;
        public final TrafficStats trafficStats;

        public FinalState(byte[] bArr, String str, TrafficStats trafficStats, boolean z10) {
            this.persistentState = bArr;
            this.debugLog = str;
            this.trafficStats = trafficStats;
            this.isRatingSuggested = z10;
        }

        public String toString() {
            return "FinalState{persistentState=" + Arrays.toString(this.persistentState) + ", debugLog='" + this.debugLog + "', trafficStats=" + this.trafficStats + ", isRatingSuggested=" + this.isRatingSuggested + '}';
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

    public interface OnRemoteMediaStateUpdatedListener {
        void onMediaStateUpdated(int i10, int i11);
    }

    public interface OnSignalBarsUpdatedListener {
        void onSignalBarsUpdated(int i10);
    }

    public interface OnSignalingDataListener {
        void onSignalingData(byte[] bArr);
    }

    public interface OnStateUpdatedListener {
        void onStateUpdated(int i10, boolean z10);
    }

    public static final class Proxy {
        public final String host;
        public final String login;
        public final String password;
        public final int port;

        public Proxy(String str, int i10, String str2, String str3) {
            this.host = str;
            this.port = i10;
            this.login = str2;
            this.password = str3;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Proxy{host='");
            sb2.append(this.host);
            sb2.append("', port=");
            sb2.append(this.port);
            sb2.append(", login='");
            sb2.append(this.login);
            sb2.append("', password='");
            return a4.a.s(sb2, this.password, "'}");
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

        public String getString(String str) {
            return getString(str, "");
        }

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

        public String getString(String str, String str2) {
            return this.jsonObject.optString(str, str2);
        }
    }

    public static final class TrafficStats {
        public final long bytesReceivedMobile;
        public final long bytesReceivedWifi;
        public final long bytesSentMobile;
        public final long bytesSentWifi;

        public TrafficStats(long j3, long j10, long j11, long j12) {
            this.bytesSentWifi = j3;
            this.bytesReceivedWifi = j10;
            this.bytesSentMobile = j11;
            this.bytesReceivedMobile = j12;
        }

        public String toString() {
            return "TrafficStats{bytesSentWifi=" + this.bytesSentWifi + ", bytesReceivedWifi=" + this.bytesReceivedWifi + ", bytesSentMobile=" + this.bytesSentMobile + ", bytesReceivedMobile=" + this.bytesReceivedMobile + '}';
        }
    }

    private Instance() {
    }

    private static void checkHasDelegate() {
        if (instance != null) {
            return;
        }
        throw new IllegalStateException("tgvoip version is not set");
    }

    public static void destroyInstance() {
        instance = null;
    }

    public static int getConnectionMaxLayer() {
        return 92;
    }

    public static ServerConfig getGlobalServerConfig() {
        return globalServerConfig;
    }

    public static NativeInstance makeInstance(String str, Config config, String str2, Endpoint[] endpointArr, Proxy proxy, int i10, EncryptionKey encryptionKey, VideoSink videoSink, long j3, NativeInstance.AudioLevelsCallback audioLevelsCallback) {
        if (!"2.4.4".equals(str)) {
            ContextUtils.initialize(ApplicationLoader.applicationContext);
        }
        instance = NativeInstance.make(str, config, str2, endpointArr, proxy, i10, encryptionKey, videoSink, j3, audioLevelsCallback);
        setGlobalServerConfig(globalServerConfig.jsonObject.toString());
        setBufferSize(bufferSize);
        return instance;
    }

    public static void setBufferSize(int i10) {
        bufferSize = i10;
        NativeInstance nativeInstance = instance;
        if (nativeInstance != null) {
            nativeInstance.setBufferSize(i10);
        }
    }

    public static void setGlobalServerConfig(String str) {
        try {
            globalServerConfig = new ServerConfig(new JSONObject(str));
            NativeInstance nativeInstance = instance;
            if (nativeInstance != null) {
                nativeInstance.setGlobalServerConfig(str);
            }
        } catch (JSONException e7) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("failed to parse tgvoip server config", e7);
            }
        }
    }
}
