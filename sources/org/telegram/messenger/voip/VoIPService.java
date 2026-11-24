package org.telegram.messenger.voip;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Icon;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaRouter;
import android.media.SoundPool;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Vibrator;
import android.telecom.CallAudioState;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.KeyEvent;
import android.widget.Toast;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.VoIPFeedbackActivity;
import org.telegram.ui.VoIPPermissionActivity;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public class VoIPService extends Service implements SensorEventListener, AudioManager.OnAudioFocusChangeListener, gk7, VoIPServiceState {
    public static final String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
    public static final int AUDIO_ROUTE_BLUETOOTH = 2;
    public static final int AUDIO_ROUTE_EARPIECE = 0;
    public static final int AUDIO_ROUTE_SPEAKER = 1;
    public static final int CALL_MIN_LAYER = 65;
    public static final int CAPTURE_DEVICE_CAMERA = 0;
    public static final int CAPTURE_DEVICE_SCREEN = 1;
    public static final int DISCARD_REASON_CONVERT = 5;
    public static final int DISCARD_REASON_DISCONNECT = 2;
    public static final int DISCARD_REASON_HANGUP = 1;
    public static final int DISCARD_REASON_LINE_BUSY = 4;
    public static final int DISCARD_REASON_MISSED = 3;
    private static final int ID_INCOMING_CALL_NOTIFICATION = 202;
    public static final int ID_INCOMING_CALL_PRENOTIFICATION = 203;
    private static final int ID_ONGOING_CALL_NOTIFICATION = 201;
    private static final int MAX_PENDING_SIGNALING_DATA = 256;
    private static final int PROXIMITY_SCREEN_OFF_WAKE_LOCK = 32;
    public static final int QUALITY_FULL = 2;
    public static final int QUALITY_MEDIUM = 1;
    public static final int QUALITY_SMALL = 0;
    private static final long RTMP_STREAM_OUTPUT = Long.MIN_VALUE;
    public static final int STATE_BUSY = 17;
    public static final int STATE_CREATING = 6;
    public static final int STATE_ENDED = 11;
    public static final int STATE_ESTABLISHED = 3;
    public static final int STATE_EXCHANGING_KEYS = 12;
    public static final int STATE_FAILED = 4;
    public static final int STATE_HANGING_UP = 10;
    public static final int STATE_RECONNECTING = 5;
    public static final int STATE_REQUESTING = 14;
    public static final int STATE_RINGING = 16;
    public static final int STATE_WAITING = 13;
    public static final int STATE_WAITING_INCOMING = 15;
    public static final int STATE_WAIT_INIT = 1;
    public static final int STATE_WAIT_INIT_ACK = 2;
    public static NativeInstance.AudioLevelsCallback audioLevelsCallback;
    public static TL_phone.PhoneCall callIShouldHavePutIntoIntent;
    private static Runnable setModeRunnable;
    private static VoIPService sharedInstance;
    private byte[] a_or_b;
    private boolean audioConfigured;
    private AudioDeviceCallback audioDeviceCallback;
    private byte[] authKey;
    private boolean bluetoothScoActive;
    private boolean bluetoothScoConnecting;
    private boolean broadcastListenerRejoining;
    private yz0 broadcastListenerSession;
    private BluetoothAdapter btAdapter;
    private int callDiscardReason;
    private int callReqId;
    private long callStartTime;
    private TLRPC.Chat chat;
    private int checkRequestId;
    private int classGuid;
    private AudioManager.OnCommunicationDeviceChangedListener communicationDeviceListener;
    public ConferenceCall conference;
    private Runnable connectingSoundRunnable;
    public long convertingFromCallWithUserId;
    private NativeInstance convertingVoip;
    private PowerManager.WakeLock cpuWakelock;
    private boolean createGroupCall;
    public String currentBluetoothDeviceName;
    public boolean currentGroupModeStreaming;
    private Runnable delayedStartOutgoingCall;
    private boolean didDeleteConnectionServiceContact;
    private boolean endCallAfterRequest;
    boolean fetchingBluetoothDeviceName;
    private boolean forceRating;
    private int foregroundId;
    private Notification foregroundNotification;
    private boolean foregroundStarted;
    private byte[] g_a;
    private byte[] g_a_hash;
    private boolean gotMediaProjection;
    public fc2 groupCall;
    private volatile CountDownLatch groupCallBottomSheetLatch;
    private TLRPC.InputPeer groupCallPeer;
    private boolean hasAudioFocus;
    public boolean hasFewPeers;
    private boolean instantAccept;
    private long[] inviteUsers;
    private HashSet<Long> inviteUsersToConference;
    private boolean inviteUsersToConferenceVideo;
    private boolean isBtHeadsetConnected;
    private volatile boolean isCallEnded;
    private boolean isHeadsetPlugged;
    private boolean isOutgoing;
    private boolean isPrivateScreencast;
    private boolean isProximityNear;
    public boolean isRtmpStream;
    private boolean isVideoAvailable;
    private TLRPC.InputGroupCall joinConference;
    private TLRPC.GroupCall joinConferenceCall;
    private String joinHash;
    private long keyFingerprint;
    private String lastError;
    private int lastForegroundType;
    private TLRPC.GroupCall lastGroupCallUpdate;
    private String lastLogFilePath;
    private NetworkInfo lastNetInfo;
    private SensorEvent lastSensorEvent;
    private long lastTypingTimeSend;
    private Boolean mHasEarpiece;
    private boolean micMute;
    public boolean micSwitching;
    private Boolean muteOnStart;
    private TLRPC.TL_dataJSON myParams;
    private boolean needPlayEndSound;
    private boolean needRateCall;
    private boolean needSendDebugLog;
    private boolean needSwitchToBluetoothAfterScoActivates;
    private boolean notificationsDisabled;
    private Runnable onDestroyRunnable;
    private boolean playedConnectedSound;
    private boolean playingSound;
    private Instance.TrafficStats prevTrafficStats;
    public TL_phone.PhoneCall privateCall;
    private PowerManager.WakeLock proximityWakelock;
    private boolean reconnectScreenCapture;
    private MediaPlayer ringtonePlayer;
    private ao9 rtmpStreamPlayer;
    private boolean rtmpStreamPlayerStarted;
    private boolean rtmpStreamRejoining;
    private bo9 rtmpStreamVideoSinks;
    private int scheduleDate;
    private Runnable shortPollRunnable;
    private int signalBarCount;
    private NativeInstance signalingTarget;
    private long signalingTargetCallId;
    private SoundPool soundPool;
    private int spAllowTalkId;
    private int spBusyId;
    private int spConnectingId;
    private int spEndId;
    private int spFailedID;
    private int spPlayId;
    private int spRingbackID;
    private int spStartRecordId;
    private int spVoiceChatConnecting;
    private int spVoiceChatEndId;
    private int spVoiceChatStartId;
    private boolean speakerphoneStateToSet;
    private boolean startedRinging;
    private boolean switchingAccount;
    private boolean switchingCamera;
    private boolean switchingStream;
    private Runnable switchingStreamTimeoutRunnable;
    private CallConnection systemCallConnection;
    private Runnable timeoutRunnable;
    private boolean unmutedByHold;
    private Runnable updateNotificationRunnable;
    private TLRPC.User user;
    private Vibrator vibrator;
    public boolean videoCall;
    private boolean wasConnected;
    private boolean wasEstablished;
    public static final boolean USE_CONNECTION_SERVICE = isDeviceCompatibleWithConnectionServiceAPI();
    private static final Object sync = new Object();
    private int currentAccount = -1;
    private int currentState = 0;
    private boolean isFrontFaceCamera = true;
    private int previousAudioOutput = -1;
    private ArrayList<StateListener> stateListeners = new ArrayList<>();
    private int remoteVideoState = 0;
    private int[] mySource = new int[2];
    private NativeInstance[] tgVoip = new NativeInstance[2];
    private final Object signalingLock = new Object();
    private final ArrayList<TL_update.TL_updatePhoneCallSignalingData> pendingSignalingData = new ArrayList<>();
    private long[] captureDevice = new long[2];
    private boolean[] destroyCaptureDevice = {true, true};
    private int[] videoState = {0, 0};
    private int remoteAudioState = 1;
    private int audioRouteToSet = 2;
    public final SharedUIParams sharedUIParams = new SharedUIParams();
    private ArrayList<TL_phone.PhoneCall> pendingUpdates = new ArrayList<>();
    private Runnable afterSoundRunnable = new AnonymousClass1();
    private BluetoothProfile.ServiceListener serviceListener = new BluetoothProfile.ServiceListener() {
        {
            VoIPService.this = this;
        }

        @Override
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            try {
                if (Build.VERSION.SDK_INT < 31) {
                    Iterator<BluetoothDevice> it = bluetoothProfile.getConnectedDevices().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        BluetoothDevice next = it.next();
                        if (bluetoothProfile.getConnectionState(next) == 2) {
                            VoIPService.this.currentBluetoothDeviceName = next.getName();
                            break;
                        }
                    }
                }
                BluetoothAdapter.getDefaultAdapter().closeProfileProxy(i, bluetoothProfile);
                VoIPService.this.fetchingBluetoothDeviceName = false;
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }

        @Override
        public void onServiceDisconnected(int i) {
        }
    };
    private BroadcastReceiver receiver = new BroadcastReceiver() {
        {
            VoIPService.this = this;
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = true;
            int i = 0;
            if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                VoIPService voIPService = VoIPService.this;
                if (intent.getIntExtra("state", 0) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                voIPService.isHeadsetPlugged = z3;
                if (VoIPService.this.isHeadsetPlugged && VoIPService.this.proximityWakelock != null && VoIPService.this.proximityWakelock.isHeld()) {
                    VoIPService.this.proximityWakelock.release();
                }
                if (VoIPService.this.isHeadsetPlugged) {
                    VoipAudioManager voipAudioManager = VoipAudioManager.get();
                    if (voipAudioManager.isSpeakerphoneOn()) {
                        VoIPService.this.previousAudioOutput = 0;
                    } else {
                        boolean isBluetoothOn = voipAudioManager.isBluetoothOn();
                        VoIPService voIPService2 = VoIPService.this;
                        if (isBluetoothOn) {
                            voIPService2.previousAudioOutput = 2;
                        } else {
                            voIPService2.previousAudioOutput = 1;
                        }
                    }
                    VoIPService.this.setAudioOutput(1);
                } else if (VoIPService.this.previousAudioOutput >= 0) {
                    VoIPService voIPService3 = VoIPService.this;
                    voIPService3.setAudioOutput(voIPService3.previousAudioOutput);
                    VoIPService.this.previousAudioOutput = -1;
                }
                VoIPService.this.isProximityNear = false;
                VoIPService.this.updateOutputGainControlState();
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                VoIPService.this.updateNetworkType();
            } else if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                if (w01.a) {
                    fa4.d("bt headset state = " + intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0));
                }
                VoIPService voIPService4 = VoIPService.this;
                if (intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0) != 2) {
                    z4 = false;
                }
                voIPService4.updateBluetoothHeadsetState(z4);
            } else if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
                if (w01.a) {
                    fa4.d("Bluetooth SCO state updated: " + intExtra);
                }
                if (intExtra == 0 && VoIPService.this.isBtHeadsetConnected && (Build.VERSION.SDK_INT < 31 ? !VoIPService.this.btAdapter.isEnabled() || !rqe.d("android.permission.BLUETOOTH_CONNECT") || VoIPService.this.btAdapter.getProfileConnectionState(1) != 2 : VoipAudioManager.get().findBluetoothDevice() == null)) {
                    VoIPService.this.updateBluetoothHeadsetState(false);
                    return;
                }
                VoIPService voIPService5 = VoIPService.this;
                if (intExtra == 2) {
                    z = true;
                } else {
                    z = false;
                }
                voIPService5.bluetoothScoConnecting = z;
                VoIPService voIPService6 = VoIPService.this;
                if (intExtra == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                voIPService6.bluetoothScoActive = z2;
                if (VoIPService.this.bluetoothScoActive) {
                    VoIPService.this.fetchBluetoothDeviceName();
                    if (VoIPService.this.needSwitchToBluetoothAfterScoActivates) {
                        VoIPService.this.needSwitchToBluetoothAfterScoActivates = false;
                        VoipAudioManager voipAudioManager2 = VoipAudioManager.get();
                        voipAudioManager2.setSpeakerphoneOn(false);
                        voipAudioManager2.setBluetoothOn(true);
                    }
                }
                ArrayList arrayList = VoIPService.this.stateListeners;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((StateListener) obj).onAudioSettingsChanged();
                }
            } else if ("android.intent.action.PHONE_STATE".equals(intent.getAction())) {
                if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(intent.getStringExtra("state"))) {
                    VoIPService.this.hangUp();
                }
            } else if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
                if (VoIPService.this.currentState == 15 && VoIPService.this.user != null) {
                    int ringerMode = ((AudioManager) VoIPService.this.getSystemService("audio")).getRingerMode();
                    VoIPService voIPService7 = VoIPService.this;
                    if (ringerMode == 0) {
                        voIPService7.stopRinging();
                    } else if (voIPService7.ringtonePlayer == null) {
                        VoIPService voIPService8 = VoIPService.this;
                        voIPService8.startRingtoneAndVibration(voIPService8.user.id);
                    }
                }
            } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                while (i < VoIPService.this.stateListeners.size()) {
                    ((StateListener) VoIPService.this.stateListeners.get(i)).onScreenOnChange(true);
                    i++;
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                for (int i2 = 0; i2 < VoIPService.this.stateListeners.size(); i2++) {
                    ((StateListener) VoIPService.this.stateListeners.get(i2)).onScreenOnChange(false);
                }
            }
        }
    };
    private final HashMap<String, TLRPC.GroupCallParticipant> waitingFrameParticipant = new HashMap<>();
    private final LruCache<String, ProxyVideoSink> proxyVideoSinkLruCache = new LruCache<String, ProxyVideoSink>(6) {
        {
            VoIPService.this = this;
        }

        @Override
        public void entryRemoved(boolean z, String str, ProxyVideoSink proxyVideoSink, ProxyVideoSink proxyVideoSink2) {
            super.entryRemoved(z, (boolean) str, proxyVideoSink, proxyVideoSink2);
            VoIPService.this.removeIncomingVideoOutput(proxyVideoSink);
        }
    };
    private ProxyVideoSink[] localSink = new ProxyVideoSink[2];
    private ProxyVideoSink[] remoteSink = new ProxyVideoSink[2];
    private ProxyVideoSink[] currentBackgroundSink = new ProxyVideoSink[2];
    private String[] currentBackgroundEndpointId = new String[2];
    private HashMap<String, ProxyVideoSink> remoteSinks = new HashMap<>();
    private final HashMap<String, Integer> broadcastVideoCeilings = new HashMap<>();
    private final Runnable destroyConvertingRunnable = new bhc(this, (byte) 29);

    class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
            VoIPService.this = r1;
        }

        public void lambda$run$0() {
            VoIPService.this.soundPool.release();
        }

        public static void lambda$run$1(AudioManager audioManager) {
            synchronized (VoIPService.sync) {
                if (VoIPService.setModeRunnable != null) {
                    Runnable unused = VoIPService.setModeRunnable = null;
                    try {
                        audioManager.setMode(0);
                    } catch (SecurityException e) {
                        if (w01.a) {
                            fa4.e("Error setting audio more to normal", e);
                        }
                    }
                }
            }
        }

        @Override
        public void run() {
            AudioManager audioManager = (AudioManager) VoIPService.this.getSystemService("audio");
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            audioManager.abandonAudioFocus(VoIPService.this);
            audioManager.unregisterMediaButtonEventReceiver(new ComponentName(VoIPService.this, VoIPMediaButtonReceiver.class));
            if (VoIPService.this.audioDeviceCallback != null) {
                audioManager.unregisterAudioDeviceCallback(VoIPService.this.audioDeviceCallback);
            }
            if (VoIPService.this.communicationDeviceListener != null) {
                audioManager.removeOnCommunicationDeviceChangedListener(VoIPService.this.communicationDeviceListener);
                VoIPService.this.communicationDeviceListener = null;
            }
            if (!VoIPService.USE_CONNECTION_SERVICE && VoIPService.sharedInstance == null) {
                if (VoIPService.this.isBtHeadsetConnected) {
                    voipAudioManager.stopBluetooth();
                    voipAudioManager.setBluetoothOn(false);
                    VoIPService.this.bluetoothScoActive = false;
                    VoIPService.this.bluetoothScoConnecting = false;
                }
                voipAudioManager.setSpeakerphoneOn(false);
            }
            Utilities.e.c(new e(this, (byte) 0));
            Utilities.e.c(VoIPService.setModeRunnable = new e(audioManager, (byte) 1));
        }
    }

    public class AnonymousClass10 implements Runnable {
        public AnonymousClass10() {
            VoIPService.this = r1;
        }

        public void lambda$run$0() {
            if (VoIPService.this.spPlayId == 0) {
                VoIPService voIPService = VoIPService.this;
                voIPService.spPlayId = voIPService.soundPool.play(VoIPService.this.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
            }
            if (VoIPService.this.spPlayId != 0) {
                VoIPService.this.connectingSoundRunnable = null;
            } else {
                gl.e3(this, 100L);
            }
        }

        @Override
        public void run() {
            if (VoIPService.sharedInstance == null) {
                return;
            }
            Utilities.e.c(new e(this, (byte) 2));
        }
    }

    public class AnonymousClass6 implements un9 {
        final fc2 val$call;

        public AnonymousClass6(fc2 fc2Var) {
            VoIPService.this = r1;
            this.val$call = fc2Var;
        }

        public void lambda$onRejoinRequested$1(fc2 fc2Var) {
            VoIPService voIPService = VoIPService.this;
            if (voIPService.groupCall == fc2Var) {
                voIPService.rtmpStreamRejoining = true;
                VoIPService.this.createGroupInstance(0, false, true);
            }
        }

        public void lambda$onStreamChannels$0(fc2 fc2Var, ArrayList arrayList) {
            if (VoIPService.this.groupCall == fc2Var && !fc2Var.B && !arrayList.isEmpty()) {
                fc2Var.g(arrayList);
                fc2Var.B = true;
            }
        }

        @Override
        public void onRejoinRequested() {
            final fc2 fc2Var = this.val$call;
            gl.d3(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.AnonymousClass6.this.lambda$onRejoinRequested$1(fc2Var);
                }
            });
        }

        @Override
        public void onStreamChannels(final ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList) {
            final fc2 fc2Var = this.val$call;
            gl.d3(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.AnonymousClass6.this.lambda$onStreamChannels$0(fc2Var, arrayList);
                }
            });
        }
    }

    public class CallConnection extends Connection {
        public CallConnection() {
            VoIPService.this = r1;
            setConnectionProperties(128);
            setAudioModeIsVoip(true);
        }

        @Override
        public void onAnswer() {
            VoIPService.this.acceptIncomingCallFromNotification();
        }

        @Override
        public void onCallAudioStateChanged(CallAudioState callAudioState) {
            if (w01.a) {
                fa4.b("ConnectionService call audio state changed: " + callAudioState);
            }
            ArrayList arrayList = VoIPService.this.stateListeners;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((StateListener) obj).onAudioSettingsChanged();
            }
        }

        @Override
        public void onCallEvent(String str, Bundle bundle) {
            super.onCallEvent(str, bundle);
            if (w01.a) {
                fa4.b("ConnectionService onCallEvent " + str);
            }
        }

        @Override
        public void onDisconnect() {
            if (w01.a) {
                fa4.b("ConnectionService onDisconnect");
            }
            setDisconnected(new DisconnectCause(2));
            destroy();
            VoIPService.this.systemCallConnection = null;
            VoIPService.this.hangUp();
        }

        @Override
        public void onReject() {
            VoIPService.this.needPlayEndSound = false;
            VoIPService.this.declineIncomingCall(1, null);
        }

        @Override
        public void onShowIncomingCallUi() {
            VoIPService.this.startRinging();
        }

        @Override
        public void onSilence() {
            if (w01.a) {
                fa4.b("onSlience");
            }
            VoIPService.this.stopRinging();
        }

        @Override
        public void onStateChanged(int i) {
            super.onStateChanged(i);
            if (w01.a) {
                fa4.b("ConnectionService onStateChanged " + Connection.stateToString(i));
            }
            if (i == 4) {
                qu2.r(VoIPService.this.currentAccount).h();
                VoIPService.this.didDeleteConnectionServiceContact = true;
            }
        }
    }

    public static class RequestedParticipant {
        public int audioSsrc;
        public TLRPC.GroupCallParticipant participant;
        public long userId;

        public RequestedParticipant(TLRPC.GroupCallParticipant groupCallParticipant, int i) {
            long n;
            this.participant = groupCallParticipant;
            this.audioSsrc = i;
            if (groupCallParticipant == null) {
                n = 0;
            } else {
                n = cf3.n(groupCallParticipant.peer);
            }
            this.userId = n;
        }
    }

    public static class SharedUIParams {
        public boolean cameraAlertWasShowed;
        public boolean tapToVideoTooltipWasShowed;
        public boolean wasVideoCall;
    }

    public interface StateListener {
        void onAudioSettingsChanged();

        void onCameraFirstFrameAvailable();

        void onCameraSwitch(boolean z);

        void onMediaStateUpdated(int i, int i2);

        void onScreenOnChange(boolean z);

        void onSignalBarsCountChanged(int i);

        void onStateChanged(int i);

        void onVideoAvailableChange(boolean z);
    }

    public void acceptIncomingCallFromNotification() {
        showNotification();
        if (checkSelfPermission("android.permission.RECORD_AUDIO") == 0 && (!this.privateCall.video || checkSelfPermission("android.permission.CAMERA") == 0)) {
            acceptIncomingCall();
            try {
                PendingIntent.getActivity(this, 0, new Intent(this, getUIActivityClass()).setAction("voip"), 33554432).send();
                return;
            } catch (Exception e) {
                if (w01.a) {
                    fa4.e("Error starting incall activity", e);
                    return;
                }
                return;
            }
        }
        try {
            PendingIntent.getActivity(this, 0, new Intent(this, VoIPPermissionActivity.class).addFlags(268435456), 1107296256).send();
        } catch (Exception e2) {
            if (w01.a) {
                fa4.e("Error starting permission activity", e2);
            }
        }
    }

    private void acknowledgeCall(boolean z) {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        if (phoneCall == null) {
            if (w01.a) {
                fa4.l("Call is null, wtf");
            }
            stopSelf();
        } else if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            if (w01.a) {
                fa4.l("Call " + this.privateCall.id + " was discarded before the service started, stopping");
            }
            stopSelf();
        } else if (nye.b() && !nye.a() && ((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (w01.a) {
                fa4.d("MIUI: no permission to show when locked but the screen is locked. ¯\\_(ツ)_/¯");
            }
            stopSelf();
        } else {
            TL_phone.receivedCall receivedcall = new TL_phone.receivedCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            receivedcall.peer = tL_inputPhoneCall;
            TL_phone.PhoneCall phoneCall2 = this.privateCall;
            tL_inputPhoneCall.id = phoneCall2.id;
            tL_inputPhoneCall.access_hash = phoneCall2.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(receivedcall, new i81((byte) 12, this, z), 65536);
        }
    }

    private PhoneAccountHandle addAccountToTelecomManager() {
        TLRPC.User f = y6c.h(this.currentAccount).f();
        PhoneAccountHandle phoneAccountHandle = new PhoneAccountHandle(new ComponentName(this, TelegramConnectionService.class), String.valueOf(f.id));
        ((TelecomManager) getSystemService("telecom")).registerPhoneAccount(new PhoneAccount.Builder(phoneAccountHandle, qu2.m(0, f.first_name, f.last_name)).setCapabilities(2048).setIcon(Icon.createWithResource(this, 2131231311)).setHighlightColor(-13851168).addSupportedUriScheme("sip").build());
        return phoneAccountHandle;
    }

    private long addIncomingVideoOutput(String str, TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo, ProxyVideoSink proxyVideoSink, long j) {
        if ("unified".equals(str) && isRtmpStreamCall() && getRtmpStreamPlayer() != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.rtmpStreamVideoSinks.a;
            if (proxyVideoSink != null && !copyOnWriteArrayList.contains(proxyVideoSink)) {
                copyOnWriteArrayList.add(proxyVideoSink);
                return Long.MIN_VALUE;
            }
            return Long.MIN_VALUE;
        }
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            return 0L;
        }
        long addIncomingVideoOutput = nativeInstance.addIncomingVideoOutput(1, str, createSsrcGroups(tL_groupCallParticipantVideo), proxyVideoSink, j);
        gl.d3(new bhc(this, (byte) 15));
        return addIncomingVideoOutput;
    }

    private void attachSignalingTarget(NativeInstance nativeInstance, long j) {
        synchronized (this.signalingLock) {
            this.signalingTarget = nativeInstance;
            this.signalingTargetCallId = j;
            int size = this.pendingSignalingData.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                TL_update.TL_updatePhoneCallSignalingData tL_updatePhoneCallSignalingData = this.pendingSignalingData.get(i2);
                if (tL_updatePhoneCallSignalingData.phone_call_id == j) {
                    nativeInstance.onSignalingDataReceive(tL_updatePhoneCallSignalingData.data);
                    i++;
                }
            }
            if (w01.a && !this.pendingSignalingData.isEmpty()) {
                fa4.b("delivered " + i + " of " + this.pendingSignalingData.size() + " signaling packets received before the call instance existed");
            }
            this.pendingSignalingData.clear();
        }
    }

    private void broadcastUnknownParticipants(long j, int[] iArr) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (this.groupCall != null && this.tgVoip[0] != null) {
            long selfId = getSelfId();
            int length = iArr.length;
            ArrayList arrayList = null;
            for (int i = 0; i < length; i++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.groupCall.p.get(iArr[i]);
                if (groupCallParticipant2 == null && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.groupCall.q.get(iArr[i])) == null) {
                    groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.groupCall.r.get(iArr[i]);
                }
                if (groupCallParticipant2 != null && k27.B1(groupCallParticipant2.peer) != selfId && groupCallParticipant2.source != 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(new RequestedParticipant(groupCallParticipant2, iArr[i]));
                }
            }
            if (arrayList != null) {
                this.tgVoip[0].onMediaDescriptionAvailable(j, (RequestedParticipant[]) arrayList.toArray(new RequestedParticipant[0]));
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    RequestedParticipant requestedParticipant = (RequestedParticipant) arrayList.get(i2);
                    boolean z = requestedParticipant.participant.muted_by_you;
                    NativeInstance[] nativeInstanceArr = this.tgVoip;
                    if (z) {
                        nativeInstanceArr[0].setVolume(requestedParticipant.audioSsrc, 0.0d);
                    } else {
                        nativeInstanceArr[0].setVolume(requestedParticipant.audioSsrc, hc2.H(groupCallParticipant) / 10000.0d);
                    }
                }
            }
        }
    }

    private void callEnded() {
        long j;
        if (w01.a) {
            fa4.b("Call " + getCallID() + " ended");
        }
        this.isCallEnded = true;
        if (this.groupCall != null && (!this.playedConnectedSound || this.onDestroyRunnable != null)) {
            this.needPlayEndSound = false;
        }
        gl.d3(new bhc(this, (byte) 5));
        Utilities.e.c(new bhc(this, (byte) 6));
        Runnable runnable = this.connectingSoundRunnable;
        if (runnable != null) {
            gl.r(runnable);
            this.connectingSoundRunnable = null;
        }
        int i = 700;
        if (this.needPlayEndSound) {
            this.playingSound = true;
            if (this.groupCall == null) {
                Utilities.e.c(new bhc(this, (byte) 7));
            } else {
                Utilities.e.d(new bhc(this, (byte) 8), 100L);
                i = 500;
            }
            gl.e3(this.afterSoundRunnable, i);
        }
        Runnable runnable2 = this.timeoutRunnable;
        if (runnable2 != null) {
            gl.r(runnable2);
            this.timeoutRunnable = null;
        }
        if (this.needPlayEndSound) {
            j = i;
        } else {
            j = 0;
        }
        endConnectionServiceCall(j);
        stopSelf();
    }

    private void callFailed(String str) {
        CallConnection callConnection;
        long j;
        if (this.privateCall != null) {
            if (w01.a) {
                fa4.b("Discarding failed call");
            }
            TL_phone.discardCall discardcall = new TL_phone.discardCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            discardcall.peer = tL_inputPhoneCall;
            TL_phone.PhoneCall phoneCall = this.privateCall;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            tL_inputPhoneCall.id = phoneCall.id;
            discardcall.duration = (int) (getCallDuration() / 1000);
            NativeInstance nativeInstance = this.tgVoip[0];
            if (nativeInstance != null) {
                j = nativeInstance.getPreferredRelayId();
            } else {
                j = 0;
            }
            discardcall.connection_id = j;
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonDisconnect();
            fa4.d("discardCall " + discardcall.reason);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new ce2((byte) 12));
        }
        try {
            throw new Exception("Call " + getCallID() + " failed with error: " + str);
        } catch (Exception e) {
            fa4.g(e, true);
            this.lastError = str;
            gl.d3(new bhc(this, (byte) 3));
            if (TextUtils.equals(str, "ERROR_LOCALIZED") && this.soundPool != null) {
                this.playingSound = true;
                Utilities.e.c(new bhc(this, (byte) 4));
                gl.e3(this.afterSoundRunnable, 1000L);
            }
            if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null) {
                callConnection.setDisconnected(new DisconnectCause(1));
                this.systemCallConnection.destroy();
                this.systemCallConnection = null;
            }
            stopSelf();
        }
    }

    private void cancelGroupCheckShortPoll() {
        int[] iArr = this.mySource;
        if (iArr[1] == 0 && iArr[0] == 0) {
            if (this.checkRequestId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.checkRequestId, false);
                this.checkRequestId = 0;
            }
            Runnable runnable = this.shortPollRunnable;
            if (runnable != null) {
                gl.r(runnable);
                this.shortPollRunnable = null;
            }
        }
    }

    private void checkIsNear(boolean z) {
        if (z != this.isProximityNear) {
            if (w01.a) {
                fa4.b("proximity " + z);
            }
            this.isProximityNear = z;
            try {
                PowerManager.WakeLock wakeLock = this.proximityWakelock;
                if (z) {
                    wakeLock.acquire();
                } else {
                    wakeLock.release(1);
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public void checkUpdateBluetoothHeadset() {
        BluetoothAdapter bluetoothAdapter;
        boolean z;
        boolean z2;
        boolean z3;
        if (!USE_CONNECTION_SERVICE && (bluetoothAdapter = this.btAdapter) != null && bluetoothAdapter.isEnabled()) {
            try {
                MediaRouter mediaRouter = (MediaRouter) getSystemService("media_router");
                AudioManager audioManager = (AudioManager) getSystemService("audio");
                int i = Build.VERSION.SDK_INT;
                int i2 = 0;
                if (i >= 31) {
                    AudioDeviceInfo findBluetoothDevice = VoipAudioManager.get().findBluetoothDevice();
                    if (findBluetoothDevice != null) {
                        this.currentBluetoothDeviceName = findBluetoothDevice.getProductName().toString();
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    updateBluetoothHeadsetState(z3);
                    ArrayList<StateListener> arrayList = this.stateListeners;
                    int size = arrayList.size();
                    while (i2 < size) {
                        StateListener stateListener = arrayList.get(i2);
                        i2++;
                        stateListener.onAudioSettingsChanged();
                    }
                } else if (i < 24) {
                    if (this.btAdapter.getProfileConnectionState(1) == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    updateBluetoothHeadsetState(z2);
                    ArrayList<StateListener> arrayList2 = this.stateListeners;
                    int size2 = arrayList2.size();
                    while (i2 < size2) {
                        StateListener stateListener2 = arrayList2.get(i2);
                        i2++;
                        stateListener2.onAudioSettingsChanged();
                    }
                } else {
                    MediaRouter.RouteInfo selectedRoute = mediaRouter.getSelectedRoute(1);
                    if (rqe.d("android.permission.BLUETOOTH_CONNECT") && selectedRoute.getDeviceType() == 3) {
                        if (this.btAdapter.getProfileConnectionState(1) == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        updateBluetoothHeadsetState(z);
                        ArrayList<StateListener> arrayList3 = this.stateListeners;
                        int size3 = arrayList3.size();
                        while (i2 < size3) {
                            StateListener stateListener3 = arrayList3.get(i2);
                            i2++;
                            stateListener3.onAudioSettingsChanged();
                        }
                        return;
                    }
                    updateBluetoothHeadsetState(audioManager.isBluetoothA2dpOn());
                }
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
    }

    private void configureDeviceForCall() {
        int i;
        int i2;
        if (w01.a) {
            b00.p(this.audioRouteToSet, new StringBuilder("configureDeviceForCall, route to set = "));
        }
        if (hasRtmpStream()) {
            i = 1;
        } else {
            i = 2;
        }
        WebRtcAudioTrack.setAudioTrackUsageAttribute(i);
        if (hasRtmpStream()) {
            i2 = Integer.MIN_VALUE;
        } else {
            i2 = 0;
        }
        WebRtcAudioTrack.setAudioStreamType(i2);
        this.needPlayEndSound = true;
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (!USE_CONNECTION_SERVICE) {
            Utilities.e.c(new jhc(this, audioManager, (byte) 1));
        }
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        if (defaultSensor != null) {
            try {
                this.proximityWakelock = ((PowerManager) getSystemService("power")).newWakeLock(32, "telegram-voip-prx");
                sensorManager.registerListener(this, defaultSensor, 3);
            } catch (Exception e) {
                if (w01.a) {
                    fa4.e("Error initializing proximity sensor", e);
                }
            }
        }
    }

    private int convertDataSavingMode(int i) {
        if (i != 3) {
            return i;
        }
        return org.telegram.messenger.a.s() ? 1 : 0;
    }

    public static String convertStreamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    public void createGroupInstance(int i, boolean z, boolean z2) {
        boolean z3;
        String str;
        boolean z4;
        boolean z5;
        boolean z6;
        if (z) {
            this.mySource[i] = 0;
            if (i == 0) {
                this.switchingAccount = z;
            }
        }
        cancelGroupCheckShortPoll();
        if (i == 0) {
            this.wasConnected = false;
            if (this.tgVoip[i] == null && isRtmpStreamCall()) {
                int nextInt = (Utilities.b.nextInt() & Integer.MAX_VALUE) | 1;
                startGroupCall(nextInt, tb4.n(nextInt, "{\"fingerprints\": [], \"ufrag\": \"\", \"pwd\": \"\", \"ssrc\": ", ", \"ssrc-groups\": []}"), true);
                return;
            }
        } else if (!this.wasConnected) {
            this.reconnectScreenCapture = true;
            return;
        }
        if (this.tgVoip[i] == null) {
            fc2 fc2Var = this.groupCall;
            if (fc2Var != null) {
                str = String.valueOf(fc2Var.b.id);
            } else {
                TLRPC.InputGroupCall inputGroupCall = this.joinConference;
                if (inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) {
                    str = inputGroupCall.slug;
                } else if (inputGroupCall instanceof TLRPC.TL_inputGroupCall) {
                    str = String.valueOf(inputGroupCall.id);
                } else {
                    str = "0";
                }
            }
            boolean[] zArr = {z2};
            boolean z7 = w01.a;
            String d = rgc.d("voip_" + i + "_" + str);
            NativeInstance[] nativeInstanceArr = this.tgVoip;
            long j = this.captureDevice[i];
            if (i == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i == 0 && gba.E0) {
                z5 = true;
            } else {
                z5 = false;
            }
            zf zfVar = new zf(this, i, zArr, (byte) 19);
            shc shcVar = new shc(this, i);
            shc shcVar2 = new shc(this, i);
            if (this.conference != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            nativeInstanceArr[i] = NativeInstance.makeGroup(d, j, z4, z5, zfVar, shcVar, shcVar2, z6);
            this.tgVoip[i].setOnStateUpdatedListener(new shc(this, i));
            if (i == 0) {
                this.tgVoip[i].setBroadcastStateCallback(new phc(this));
            }
            z3 = true;
        } else {
            z3 = false;
        }
        this.tgVoip[i].resetGroupInstance(!z3, false);
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null && conferenceCall.getCallId() != -1) {
            this.tgVoip[i].setConferenceCallId(this.conference.getCallId());
        }
        if (this.captureDevice[i] != 0) {
            this.destroyCaptureDevice[i] = false;
        }
        if (i == 0) {
            dispatchStateChanged(1);
        }
    }

    private NativeInstance.SsrcGroup[] createSsrcGroups(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo) {
        if (tL_groupCallParticipantVideo.source_groups.isEmpty()) {
            return null;
        }
        int size = tL_groupCallParticipantVideo.source_groups.size();
        NativeInstance.SsrcGroup[] ssrcGroupArr = new NativeInstance.SsrcGroup[size];
        for (int i = 0; i < size; i++) {
            ssrcGroupArr[i] = new NativeInstance.SsrcGroup();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i);
            NativeInstance.SsrcGroup ssrcGroup = ssrcGroupArr[i];
            ssrcGroup.semantics = tL_groupCallParticipantVideoSourceGroup.semantics;
            ssrcGroup.ssrcs = new int[tL_groupCallParticipantVideoSourceGroup.sources.size()];
            int i2 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i].ssrcs;
                if (i2 < iArr.length) {
                    iArr[i2] = tL_groupCallParticipantVideoSourceGroup.sources.get(i2).intValue();
                    i2++;
                }
            }
        }
        return ssrcGroupArr;
    }

    public void destroyConverting() {
        gl.r(this.destroyConvertingRunnable);
        if (this.convertingVoip != null) {
            fa4.e("destroyConverting!!", new Exception());
            this.callStartTime = 0L;
            yxa c = yxa.c(this.currentAccount);
            int statsNetworkType = getStatsNetworkType();
            int[] iArr = c.n;
            iArr[statsNetworkType] = iArr[statsNetworkType] + (((int) (getCallDuration() / 1000)) % 5);
            c.m();
            onTgVoipPreStop();
            Instance.FinalState stop = this.convertingVoip.stop();
            updateTrafficStats(this.convertingVoip, stop.trafficStats);
            onTgVoipStop(stop);
            Instance.destroyInstance();
            this.convertingVoip = null;
            for (int i = 0; i < this.stateListeners.size(); i++) {
                this.stateListeners.get(i).onStateChanged(getCallState());
            }
            NativeInstance nativeInstance = this.tgVoip[0];
            if (nativeInstance != null) {
                nativeInstance.setMuteMicrophone(this.micMute);
            }
        }
    }

    private void detachSignalingTarget() {
        synchronized (this.signalingLock) {
            this.signalingTarget = null;
            this.signalingTargetCallId = 0L;
            this.pendingSignalingData.clear();
        }
    }

    private void dispatchStateChanged(int i) {
        CallConnection callConnection;
        if (w01.a) {
            fa4.b("== Call " + getCallID() + " state changed to " + i + " ==");
        }
        this.currentState = i;
        if (i == 3) {
            destroyConverting();
        }
        if (USE_CONNECTION_SERVICE && i == 3 && (callConnection = this.systemCallConnection) != null) {
            callConnection.setActive();
        }
        for (int i2 = 0; i2 < this.stateListeners.size(); i2++) {
            this.stateListeners.get(i2).onStateChanged(i);
        }
    }

    private void endConnectionServiceCall(long j) {
        if (USE_CONNECTION_SERVICE) {
            bhc bhcVar = new bhc(this, (byte) 21);
            if (j > 0) {
                gl.e3(bhcVar, j);
            } else {
                bhcVar.run();
            }
        }
    }

    public void fetchBluetoothDeviceName() {
        if (this.fetchingBluetoothDeviceName) {
            return;
        }
        try {
            this.currentBluetoothDeviceName = null;
            this.fetchingBluetoothDeviceName = true;
            BluetoothAdapter.getDefaultAdapter().getProfileProxy(this, this.serviceListener, 1);
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    private NetworkInfo getActiveNetworkInfo() {
        return ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
    }

    private static int getCurrentForegroundType(ContextWrapper contextWrapper, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT < 29) {
            return 226;
        }
        if (contextWrapper.checkSelfPermission("android.permission.CAMERA") == 0) {
            i = 64;
        } else {
            i = 0;
        }
        if (contextWrapper.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            i |= 128;
        }
        if (z) {
            i |= 32;
        }
        return i | 2;
    }

    private String[] getEmoji() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.authKey);
            byteArrayOutputStream.write(this.g_a);
        } catch (IOException unused) {
        }
        return EncryptionKeyEmojifier.emojifyForCall(Utilities.o(byteArrayOutputStream.size(), byteArrayOutputStream.toByteArray()));
    }

    private int getNetworkType() {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        this.lastNetInfo = activeNetworkInfo;
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                        return 1;
                    case 2:
                    case 7:
                        return 2;
                    case 3:
                    case 5:
                        return 3;
                    case 4:
                    case 11:
                    case 14:
                    default:
                        return 11;
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 15:
                        return 4;
                    case 13:
                        return 5;
                }
            } else if (type != 1) {
                if (type == 9) {
                    return 7;
                }
                return 0;
            } else {
                return 6;
            }
        }
        return 0;
    }

    public static Bitmap getRoundAvatarBitmap(Context context, int i, TLObject tLObject) {
        pb0 pb0Var;
        TLRPC.ChatPhoto chatPhoto;
        Bitmap bitmap = null;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                    BitmapDrawable y = fl5.z().y(user.photo.photo_small);
                    if (y != null) {
                        bitmap = y.getBitmap().copy(Bitmap.Config.ARGB_8888, true);
                    } else {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inMutable = true;
                        ba4.G(i);
                        bitmap = BitmapFactory.decodeFile(ba4.J(user.photo.photo_small, null, true, true).toString(), options);
                    }
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                if (chat != null && (chatPhoto = chat.photo) != null && chatPhoto.photo_small != null) {
                    BitmapDrawable y2 = fl5.z().y(chat.photo.photo_small);
                    if (y2 != null) {
                        bitmap = y2.getBitmap().copy(Bitmap.Config.ARGB_8888, true);
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inMutable = true;
                        ba4.G(i);
                        bitmap = BitmapFactory.decodeFile(ba4.J(chat.photo.photo_small, null, true, true).toString(), options2);
                    }
                }
            }
        } catch (Throwable th) {
            fa4.g(th, true);
        }
        if (bitmap == null) {
            bkb.S(context);
            if (tLObject instanceof TLRPC.User) {
                pb0Var = new pb0(0, (TLRPC.User) tLObject);
            } else {
                pb0Var = new pb0((TLRPC.Chat) tLObject);
            }
            bitmap = Bitmap.createBitmap(gl.L(42.0f), gl.L(42.0f), Bitmap.Config.ARGB_8888);
            pb0Var.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            pb0Var.draw(new Canvas(bitmap));
        }
        Canvas canvas = new Canvas(bitmap);
        Path path = new Path();
        path.addCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, Path.Direction.CW);
        path.toggleInverseFillType();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(path, paint);
        return bitmap;
    }

    private ao9 getRtmpStreamPlayer() {
        if (this.rtmpStreamPlayer == null && isRtmpStreamCall()) {
            fc2 fc2Var = this.groupCall;
            ao9 ao9Var = new ao9(this.currentAccount, fc2Var.h(fc2Var.a), getStreamDatacenterId(), new AnonymousClass6(fc2Var));
            this.rtmpStreamPlayer = ao9Var;
            ao9Var.k(org.telegram.messenger.a.o());
            bo9 bo9Var = new bo9();
            this.rtmpStreamVideoSinks = bo9Var;
            this.rtmpStreamPlayer.l(bo9Var, null);
        }
        return this.rtmpStreamPlayer;
    }

    public static VoIPService getSharedInstance() {
        return sharedInstance;
    }

    public static VoIPServiceState getSharedState() {
        VoIPService voIPService = sharedInstance;
        if (voIPService != null) {
            return voIPService;
        }
        VoIPGroupNotification.State state = VoIPGroupNotification.currentState;
        if (state != null) {
            return state;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return VoIPPreNotificationService.getState();
        }
        return null;
    }

    public int getStatsNetworkType() {
        NetworkInfo networkInfo = this.lastNetInfo;
        if (networkInfo != null && networkInfo.getType() == 0) {
            if (this.lastNetInfo.isRoaming()) {
                return 2;
            }
            return 0;
        }
        return 1;
    }

    private int getStreamDatacenterId() {
        TLRPC.GroupCall groupCall;
        int i;
        fc2 fc2Var = this.groupCall;
        if (fc2Var != null && (groupCall = fc2Var.b) != null && (groupCall.flags & 16) != 0 && (i = groupCall.stream_dc_id) != 0) {
            return i;
        }
        return Integer.MAX_VALUE;
    }

    public static String getStringFromFile(String str) {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        String convertStreamToString = convertStreamToString(fileInputStream);
        fileInputStream.close();
        return convertStreamToString;
    }

    private Class<? extends Activity> getUIActivityClass() {
        return LaunchActivity.class;
    }

    public static boolean hasRtmpStream() {
        if (getSharedInstance() != null && getSharedInstance().groupCall != null && getSharedInstance().groupCall.b.rtmp_stream) {
            return true;
        }
        return false;
    }

    private void initializeAccountRelatedThings() {
        updateServerConfig();
        kk7.f(this.currentAccount).a(this, kk7.H2);
        ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
    }

    private void initiateActualEncryptedCall() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPService.initiateActualEncryptedCall():void");
    }

    public static boolean isAnyKindOfCallActive() {
        if (getSharedInstance() == null || getSharedInstance().getCallState() == 15) {
            return false;
        }
        return true;
    }

    private static boolean isDeviceCompatibleWithConnectionServiceAPI() {
        return false;
    }

    private boolean isFinished() {
        int i = this.currentState;
        if (i != 11 && i != 4) {
            return false;
        }
        return true;
    }

    private boolean isRinging() {
        if (this.currentState == 15) {
            return true;
        }
        return false;
    }

    private boolean isRtmpStreamCall() {
        TLRPC.GroupCall groupCall;
        fc2 fc2Var = this.groupCall;
        if (fc2Var != null && (groupCall = fc2Var.b) != null && groupCall.rtmp_stream) {
            return true;
        }
        return false;
    }

    public static void lambda$acceptIncomingCall$96() {
        kk7.e().k(kk7.u2, new Object[0]);
    }

    public void lambda$acceptIncomingCall$97(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            if (w01.a) {
                fa4.l("accept call ok! " + tLObject);
            }
            TL_phone.PhoneCall phoneCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
            this.privateCall = phoneCall;
            if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
                onCallUpdated(phoneCall);
                return;
            }
            return;
        }
        if (w01.a) {
            fa4.d("Error on phone.acceptCall: " + tL_error);
        }
        callFailed();
    }

    public void lambda$acceptIncomingCall$98(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new ahc(this, tL_error, tLObject, (byte) 0));
    }

    public void lambda$acceptIncomingCall$99(ad7 ad7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
            if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                byte[] bArr = messages_dhconfig.p;
                int i = messages_dhconfig.g;
                Pattern pattern = Utilities.a;
                if (!ConnectionsManager.native_isGoodPrime(bArr, i)) {
                    if (w01.a) {
                        fa4.d("stopping VoIP service, bad prime");
                    }
                    callFailed();
                    return;
                }
                byte[] bArr2 = messages_dhconfig.p;
                ad7Var.G();
                ad7Var.y = bArr2;
                int i2 = messages_dhconfig.g;
                ad7Var.G();
                ad7Var.E = i2;
                int i3 = messages_dhconfig.version;
                ad7Var.G();
                ad7Var.x = i3;
                ad7 Y = ad7.Y(this.currentAccount);
                ad7Var.G();
                int i4 = ad7Var.x;
                ad7Var.G();
                int i5 = ad7Var.E;
                ad7Var.G();
                Y.a.c(new mp1(Y, i4, i5, ad7Var.y, (byte) 10));
            }
            byte[] bArr3 = new byte[256];
            for (int i6 = 0; i6 < 256; i6++) {
                bArr3[i6] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i6]);
            }
            if (this.privateCall == null) {
                if (w01.a) {
                    fa4.d("call is null");
                }
                callFailed();
                return;
            }
            this.a_or_b = bArr3;
            ad7Var.G();
            BigInteger valueOf = BigInteger.valueOf(ad7Var.E);
            ad7Var.G();
            BigInteger modPow = valueOf.modPow(new BigInteger(1, bArr3), new BigInteger(1, ad7Var.y));
            this.g_a_hash = this.privateCall.g_a_hash;
            byte[] byteArray = modPow.toByteArray();
            if (byteArray.length > 256) {
                byte[] bArr4 = new byte[256];
                System.arraycopy(byteArray, 1, bArr4, 0, 256);
                byteArray = bArr4;
            }
            TL_phone.acceptCall acceptcall = new TL_phone.acceptCall();
            acceptcall.g_b = byteArray;
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            acceptcall.peer = tL_inputPhoneCall;
            TL_phone.PhoneCall phoneCall = this.privateCall;
            tL_inputPhoneCall.id = phoneCall.id;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol = new TL_phone.TL_phoneCallProtocol();
            acceptcall.protocol = tL_phoneCallProtocol;
            tL_phoneCallProtocol.udp_reflector = true;
            tL_phoneCallProtocol.udp_p2p = true;
            tL_phoneCallProtocol.min_layer = 65;
            tL_phoneCallProtocol.max_layer = Instance.getConnectionMaxLayer();
            Collections.addAll(acceptcall.protocol.library_versions, NativeInstance.getAllVersions());
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(acceptcall, new ihc(this, (byte) 0), 65536);
            return;
        }
        callFailed();
    }

    public void lambda$acknowledgeCall$12(TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        if (sharedInstance != null) {
            if (w01.a) {
                fa4.l("receivedCall response = " + tLObject);
            }
            if (tL_error != null) {
                if (w01.a) {
                    fa4.d("error on receivedCall: " + tL_error);
                }
                stopSelf();
                return;
            }
            if (USE_CONNECTION_SERVICE) {
                qu2 r = qu2.r(this.currentAccount);
                TLRPC.User user = this.user;
                r.g(user.id, user.first_name, user.last_name);
                ((TelecomManager) getSystemService("telecom")).addNewIncomingCall(addAccountToTelecomManager(), ls6.j(1, "call_type"));
            }
            if (z) {
                startRinging();
            }
        }
    }

    public void lambda$acknowledgeCall$13(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new d97(this, tLObject, tL_error, z, (byte) 19));
    }

    public void lambda$callEnded$119() {
        dispatchStateChanged(11);
    }

    public void lambda$callEnded$120() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
            this.spPlayId = 0;
        }
    }

    public void lambda$callEnded$121() {
        this.soundPool.play(this.spEndId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void lambda$callEnded$122() {
        this.soundPool.play(this.spVoiceChatEndId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public static void lambda$callFailed$110(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (w01.a) {
                fa4.d("error on phone.discardCall: " + tL_error);
            }
        } else if (w01.a) {
            fa4.b("phone.discardCall " + tLObject);
        }
    }

    public void lambda$callFailed$111() {
        dispatchStateChanged(4);
    }

    public void lambda$callFailed$112() {
        this.soundPool.play(this.spFailedID, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public static void lambda$configureDeviceForCall$106() {
        if (!MediaController.w().C()) {
            MediaController.w().Q(MediaController.w().v0, true);
        }
    }

    public void lambda$configureDeviceForCall$107(AudioManager audioManager) {
        boolean z;
        if (audioManager.requestAudioFocus(this, 0, 2) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.hasAudioFocus = z;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (isBluetoothHeadsetConnected() && hasEarpiece()) {
            int i = this.audioRouteToSet;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        if (!this.bluetoothScoActive) {
                            this.needSwitchToBluetoothAfterScoActivates = true;
                            try {
                                voipAudioManager.startBluetooth();
                            } catch (Throwable th) {
                                fa4.g(th, true);
                            }
                        } else {
                            voipAudioManager.setBluetoothOn(true);
                            voipAudioManager.setSpeakerphoneOn(false);
                        }
                    }
                } else {
                    voipAudioManager.setBluetoothOn(false);
                    voipAudioManager.setSpeakerphoneOn(true);
                }
            } else {
                voipAudioManager.setBluetoothOn(false);
                voipAudioManager.setSpeakerphoneOn(false);
            }
        } else {
            boolean isBluetoothHeadsetConnected = isBluetoothHeadsetConnected();
            boolean z2 = this.speakerphoneStateToSet;
            if (isBluetoothHeadsetConnected) {
                voipAudioManager.setBluetoothOn(z2);
            } else {
                voipAudioManager.setSpeakerphoneOn(z2);
                if (this.speakerphoneStateToSet) {
                    this.audioRouteToSet = 1;
                } else {
                    this.audioRouteToSet = 0;
                }
                SensorEvent sensorEvent = this.lastSensorEvent;
                if (sensorEvent != null) {
                    onSensorChanged(sensorEvent);
                }
            }
        }
        updateOutputGainControlState();
        this.audioConfigured = true;
    }

    public void lambda$configureDeviceForCall$108(AudioManager audioManager) {
        try {
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (hasRtmpStream()) {
            audioManager.setMode(0);
            VoipAudioManager.get().setBluetoothOn(false);
            gl.d3(new cza((byte) 10));
            return;
        }
        audioManager.setMode(3);
        gl.d3(new jhc(this, audioManager, (byte) 0));
    }

    public void lambda$convertToConferenceCall$33() {
        startConferenceGroupCall(true, 0, null, false);
    }

    public void lambda$createGroupInstance$69(int i, boolean[] zArr, int i2, String str) {
        if (i == 0) {
            if (this.conference != null) {
                startConferenceGroupCall(false, i2, str, !zArr[0]);
            } else {
                startGroupCall(i2, str, true);
            }
            zArr[0] = false;
            return;
        }
        startScreenCapture(i2, str);
    }

    public void lambda$createGroupInstance$71(int i, int[] iArr, float[] fArr, boolean[] zArr) {
        fc2 fc2Var;
        boolean z;
        int i2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        vf6 vf6Var;
        long j;
        long j2;
        boolean z2;
        int i3;
        String str;
        String str2;
        String str3;
        String str4;
        if (sharedInstance != null && (fc2Var = this.groupCall) != null && i == 0) {
            dc2 dc2Var = fc2Var.Q;
            vf6 vf6Var2 = fc2Var.P;
            int currentTime = ConnectionsManager.getInstance(fc2Var.C.a).getCurrentTime();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long uptimeMillis = SystemClock.uptimeMillis();
            int i4 = 1;
            int i5 = 0;
            kk7.f(fc2Var.C.a).k(kk7.A2, Long.valueOf(elapsedRealtime));
            boolean z3 = false;
            boolean z4 = false;
            ArrayList arrayList = null;
            while (true) {
                z = z3;
                if (i5 >= iArr.length) {
                    break;
                }
                int i6 = iArr[i5];
                if (i6 == 0) {
                    i2 = i5;
                    groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(fc2Var.i());
                } else {
                    i2 = i5;
                    groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.p.get(i6);
                }
                if (groupCallParticipant != null) {
                    boolean z5 = zArr[i2];
                    groupCallParticipant.hasVoice = z5;
                    z2 = z4;
                    if (z5 || elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime > 500) {
                        groupCallParticipant.hasVoiceDelayed = z5;
                        groupCallParticipant.lastVoiceUpdateTime = elapsedRealtime;
                    }
                    long B1 = k27.B1(groupCallParticipant.peer);
                    float f = fArr[i2];
                    j = elapsedRealtime;
                    if (f > 0.1f) {
                        if (zArr[i2] && groupCallParticipant.lastTypingDate + 1 < currentTime) {
                            if (j != groupCallParticipant.lastVisibleDate) {
                                groupCallParticipant.active_date = currentTime;
                            }
                            groupCallParticipant.lastTypingDate = currentTime;
                            z = true;
                        }
                        groupCallParticipant.lastSpeakTime = uptimeMillis;
                        groupCallParticipant.amplitude = f;
                        if (vf6Var2.g(null, B1) == null) {
                            int i7 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                            j5 j5Var = fc2Var.C;
                            if (i7 > 0) {
                                TLRPC.User V1 = na7.q1(j5Var.a).V1(Long.valueOf(B1));
                                StringBuilder o = ug8.o(B1, "add to current speaking ", " ");
                                if (V1 == null) {
                                    str4 = null;
                                } else {
                                    str4 = V1.first_name;
                                }
                                ir2.x(o, str4, "GroupCall");
                                j2 = uptimeMillis;
                            } else {
                                j2 = uptimeMillis;
                                TLRPC.Chat K0 = na7.q1(j5Var.a).K0(Long.valueOf(-B1));
                                StringBuilder o2 = ug8.o(B1, "add to current speaking ", " ");
                                if (K0 == null) {
                                    str3 = null;
                                } else {
                                    str3 = K0.title;
                                }
                                ir2.x(o2, str3, "GroupCall");
                            }
                            vf6Var2.k(groupCallParticipant, B1);
                            z2 = true;
                        } else {
                            j2 = uptimeMillis;
                        }
                        vf6Var = vf6Var2;
                        i3 = currentTime;
                    } else {
                        j2 = uptimeMillis;
                        if (j2 - groupCallParticipant.lastSpeakTime >= 500 && vf6Var2.g(null, B1) != null) {
                            vf6Var2.l(B1);
                            int i8 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                            j5 j5Var2 = fc2Var.C;
                            if (i8 > 0) {
                                TLRPC.User V12 = na7.q1(j5Var2.a).V1(Long.valueOf(B1));
                                StringBuilder o3 = ug8.o(B1, "remove from speaking ", " ");
                                if (V12 == null) {
                                    str2 = null;
                                } else {
                                    str2 = V12.first_name;
                                }
                                ir2.x(o3, str2, "GroupCall");
                                vf6Var = vf6Var2;
                                i3 = currentTime;
                            } else {
                                vf6Var = vf6Var2;
                                i3 = currentTime;
                                TLRPC.Chat K02 = na7.q1(j5Var2.a).K0(Long.valueOf(-B1));
                                StringBuilder o4 = ug8.o(B1, "remove from speaking ", " ");
                                if (K02 == null) {
                                    str = null;
                                } else {
                                    str = K02.title;
                                }
                                ir2.x(o4, str, "GroupCall");
                            }
                            z2 = true;
                        } else {
                            vf6Var = vf6Var2;
                            i3 = currentTime;
                        }
                        groupCallParticipant.amplitude = 0.0f;
                    }
                } else {
                    vf6Var = vf6Var2;
                    j = elapsedRealtime;
                    j2 = uptimeMillis;
                    z2 = z4;
                    i3 = currentTime;
                    if (iArr[i2] != 0) {
                        ArrayList arrayList2 = arrayList;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(Long.valueOf(iArr[i2]));
                        arrayList = arrayList2;
                    }
                }
                z3 = z;
                z4 = z2;
                i5 = i2 + 1;
                vf6Var2 = vf6Var;
                currentTime = i3;
                elapsedRealtime = j;
                uptimeMillis = j2;
            }
            vf6 vf6Var3 = vf6Var2;
            boolean z6 = z4;
            ArrayList arrayList3 = arrayList;
            if (arrayList3 != null) {
                fc2Var.m(arrayList3, false, null);
            }
            if (z) {
                fc2Var.B();
                kk7.f(fc2Var.C.a).k(kk7.v2, Long.valueOf(fc2Var.c), Long.valueOf(fc2Var.b.id), Boolean.FALSE);
            }
            if (z6) {
                if (vf6Var3.m() > 0) {
                    gl.r(dc2Var);
                    gl.e3(dc2Var, 550L);
                }
                kk7.f(fc2Var.C.a).k(kk7.x2, Long.valueOf(fc2Var.c), Long.valueOf(fc2Var.b.id), Boolean.FALSE);
            }
            float f2 = 0.0f;
            boolean z7 = false;
            int i9 = 0;
            while (i9 < iArr.length) {
                if (iArr[i9] == 0) {
                    if (this.chat != null && this.lastTypingTimeSend < SystemClock.uptimeMillis() - 5000 && fArr[i9] > 0.1f && zArr[i9]) {
                        this.lastTypingTimeSend = SystemClock.uptimeMillis();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        tL_messages_setTyping.action = new TLRPC.TL_speakingInGroupCallAction();
                        tL_messages_setTyping.peer = na7.j1(this.chat);
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setTyping, new ce2((byte) 13));
                    }
                    kk7 e = kk7.e();
                    Object[] objArr = new Object[i4];
                    objArr[0] = Float.valueOf(fArr[i9]);
                    e.k(kk7.P4, objArr);
                } else {
                    f2 = Math.max(f2, fArr[i9]);
                    z7 = true;
                }
                i9++;
                i4 = 1;
            }
            if (z7) {
                kk7.e().k(kk7.Q4, Float.valueOf(f2));
                NativeInstance.AudioLevelsCallback audioLevelsCallback2 = audioLevelsCallback;
                if (audioLevelsCallback2 != null) {
                    audioLevelsCallback2.run(iArr, fArr, zArr);
                }
            }
        }
    }

    public void lambda$createGroupInstance$72(long j, int[] iArr, ArrayList arrayList) {
        if (sharedInstance != null && this.groupCall != null) {
            broadcastUnknownParticipants(j, iArr);
        }
    }

    public void lambda$createGroupInstance$73(int i, long j, int[] iArr) {
        fc2 fc2Var;
        if (sharedInstance != null && (fc2Var = this.groupCall) != null && i == 0) {
            hs0 hs0Var = new hs0(this, j, iArr, (byte) 11);
            ArrayList arrayList = null;
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (fc2Var.p.get(iArr[i2]) == null && fc2Var.q.get(iArr[i2]) == null && fc2Var.r.get(iArr[i2]) == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Long.valueOf(iArr[i2]));
                }
            }
            if (arrayList == null) {
                ((VoIPService) hs0Var.c).lambda$createGroupInstance$72(hs0Var.b, (int[]) hs0Var.d, null);
            } else {
                fc2Var.m(arrayList, false, hs0Var);
            }
        }
    }

    public void lambda$createGroupInstance$76(boolean z, boolean z2) {
        gl.d3(new sy3(this, z, z2, (byte) 3));
    }

    public void lambda$declineIncomingCall$100() {
        if (this.currentState == 10) {
            callEnded();
        }
    }

    public void lambda$declineIncomingCall$101(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (w01.a) {
                fa4.d("error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_updates) {
            na7.q1(this.currentAccount).Q3((TLRPC.TL_updates) tLObject, false);
        }
        if (w01.a) {
            fa4.b("phone.discardCall " + tLObject);
        }
    }

    public void lambda$editCallMember$86(int i, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            na7.q1(j5.a(i).a).Q3((TLRPC.Updates) tLObject, false);
        } else if (tL_error != null && "GROUPCALL_VIDEO_TOO_MUCH".equals(tL_error.text)) {
            this.groupCall.t();
        }
        if (runnable != null) {
            gl.d3(runnable);
        }
    }

    public void lambda$endConnectionServiceCall$123() {
        CallConnection callConnection = this.systemCallConnection;
        if (callConnection != null) {
            int i = this.callDiscardReason;
            int i2 = 2;
            if (i != 1) {
                if (i != 2) {
                    int i3 = 4;
                    if (i != 3) {
                        if (i != 4) {
                            callConnection.setDisconnected(new DisconnectCause(3));
                        } else {
                            callConnection.setDisconnected(new DisconnectCause(7));
                        }
                    } else {
                        if (!this.isOutgoing) {
                            i3 = 5;
                        }
                        callConnection.setDisconnected(new DisconnectCause(i3));
                    }
                } else {
                    callConnection.setDisconnected(new DisconnectCause(1));
                }
            } else {
                if (!this.isOutgoing) {
                    i2 = 6;
                }
                callConnection.setDisconnected(new DisconnectCause(i2));
            }
            this.systemCallConnection.destroy();
            this.systemCallConnection = null;
        }
    }

    public void lambda$getConnectionAndStartCall$102() {
        this.delayedStartOutgoingCall = null;
        startOutgoingCall();
    }

    public void lambda$hangUp$4(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_updates) {
            na7.q1(this.currentAccount).Q3((TLRPC.TL_updates) tLObject, false);
        }
    }

    public void lambda$hangUp$5(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_updates) {
            na7.q1(this.currentAccount).Q3((TLRPC.TL_updates) tLObject, false);
        }
    }

    public void lambda$initiateActualEncryptedCall$80() {
        Toast.makeText(this, "This call uses TCP which will degrade its quality.", 0).show();
    }

    public void lambda$initiateActualEncryptedCall$81(int[] iArr, float[] fArr, boolean[] zArr) {
        if (sharedInstance != null && this.privateCall != null) {
            kk7.e().k(kk7.P4, Float.valueOf(Math.max(fArr[0], NativeInstance.getOwnAudioLevel())));
            kk7.e().k(kk7.Q4, Float.valueOf(fArr[1]));
        }
    }

    public void lambda$initiateActualEncryptedCall$82(int i, int i2) {
        this.remoteAudioState = i;
        this.remoteVideoState = i2;
        checkIsNear();
        for (int i3 = 0; i3 < this.stateListeners.size(); i3++) {
            this.stateListeners.get(i3).onMediaStateUpdated(i, i2);
        }
    }

    public void lambda$initiateActualEncryptedCall$83(int i, int i2) {
        gl.d3(new bt(this, i, i2, (byte) 19));
    }

    public void lambda$loadResources$105() {
        SoundPool soundPool = new SoundPool(1, 0, 0);
        this.soundPool = soundPool;
        this.spConnectingId = soundPool.load(this, 2131624337, 1);
        this.spRingbackID = this.soundPool.load(this, 2131624347, 1);
        this.spFailedID = this.soundPool.load(this, 2131624339, 1);
        this.spEndId = this.soundPool.load(this, 2131624338, 1);
        this.spBusyId = this.soundPool.load(this, 2131624336, 1);
        this.spVoiceChatEndId = this.soundPool.load(this, 2131624334, 1);
        this.spVoiceChatStartId = this.soundPool.load(this, 2131624333, 1);
        this.spVoiceChatConnecting = this.soundPool.load(this, 2131624332, 1);
        this.spAllowTalkId = this.soundPool.load(this, 2131624343, 1);
        this.spStartRecordId = this.soundPool.load(this, 2131624346, 1);
    }

    public void lambda$onBroadcastStateChanged$17(fc2 fc2Var, NativeInstance nativeInstance) {
        if (this.groupCall == fc2Var && this.tgVoip[0] == nativeInstance) {
            this.broadcastListenerRejoining = true;
            createGroupInstance(0, false, true);
        }
    }

    public void lambda$onBroadcastStateChanged$18(fc2 fc2Var, NativeInstance nativeInstance) {
        gl.d3(new wbc(this, fc2Var, nativeInstance, (byte) 6));
    }

    public void lambda$onCallUpdated$19() {
        this.soundPool.play(this.spBusyId, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public void lambda$onCallUpdated$20() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
        }
        this.spPlayId = this.soundPool.play(this.spRingbackID, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public void lambda$onCallUpdated$21() {
        this.timeoutRunnable = null;
        declineIncomingCall(3, null);
    }

    public void lambda$onConnectionStateChanged$113() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
            this.spPlayId = 0;
        }
    }

    public void lambda$onConnectionStateChanged$114() {
        int i;
        int i2 = this.spPlayId;
        if (i2 != 0) {
            this.soundPool.stop(i2);
        }
        SoundPool soundPool = this.soundPool;
        if (this.groupCall != null) {
            i = this.spVoiceChatConnecting;
        } else {
            i = this.spConnectingId;
        }
        this.spPlayId = soundPool.play(i, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public void lambda$onConnectionStateChanged$115(int i) {
        if (this.convertingVoip != null) {
            return;
        }
        if (i == 3 && this.callStartTime == 0) {
            this.callStartTime = SystemClock.elapsedRealtime();
        }
        if (i == 4) {
            callFailed();
            return;
        }
        if (i == 3) {
            Runnable runnable = this.connectingSoundRunnable;
            if (runnable != null) {
                gl.r(runnable);
                this.connectingSoundRunnable = null;
            }
            Utilities.e.c(new uhc(this, (byte) 2));
            if (this.groupCall == null && !this.wasEstablished) {
                this.wasEstablished = true;
                if (!this.isProximityNear && !this.privateCall.video) {
                    try {
                        LaunchActivity.Q().getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                gl.e3(new Runnable() {
                    {
                        VoIPService.this = this;
                    }

                    @Override
                    public void run() {
                        if (VoIPService.this.tgVoip[0] != null) {
                            yxa c = yxa.c(VoIPService.this.currentAccount);
                            int statsNetworkType = VoIPService.this.getStatsNetworkType();
                            int[] iArr = c.n;
                            iArr[statsNetworkType] = iArr[statsNetworkType] + 5;
                            c.m();
                            gl.e3(this, 5000L);
                        }
                    }
                }, 5000L);
                boolean z = this.isOutgoing;
                int i2 = this.currentAccount;
                if (z) {
                    yxa.c(i2).i(getStatsNetworkType(), 0, 1);
                } else {
                    yxa.c(i2).g(getStatsNetworkType(), 0, 1);
                }
            }
        }
        if (i == 5 && !this.isCallEnded) {
            Utilities.e.c(new uhc(this, (byte) 3));
        }
        dispatchStateChanged(i);
    }

    public void lambda$onCreate$104(AudioDeviceInfo audioDeviceInfo) {
        int i = 0;
        this.bluetoothScoConnecting = false;
        boolean isBluetoothDevice = VoipAudioManager.isBluetoothDevice(audioDeviceInfo);
        this.bluetoothScoActive = isBluetoothDevice;
        if (isBluetoothDevice) {
            this.needSwitchToBluetoothAfterScoActivates = false;
            this.currentBluetoothDeviceName = audioDeviceInfo.getProductName().toString();
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i < size) {
            StateListener stateListener = arrayList.get(i);
            i++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public static void lambda$onDestroy$93() {
        kk7.e().k(kk7.C2, new Object[0]);
    }

    public static void lambda$onDestroy$94(AudioManager audioManager) {
        synchronized (sync) {
            if (setModeRunnable == null) {
                return;
            }
            setModeRunnable = null;
            try {
                audioManager.setMode(0);
            } catch (SecurityException e) {
                if (w01.a) {
                    fa4.e("Error setting audio more to normal", e);
                }
            }
        }
    }

    public void lambda$onDestroy$95() {
        SoundPool soundPool = this.soundPool;
        if (soundPool != null) {
            soundPool.release();
        }
    }

    public void lambda$onGroupCallUpdated$16() {
        lambda$createGroupInstance$74(0, 1, false);
    }

    public void lambda$onSignalBarCountChanged$118(int i) {
        this.signalBarCount = i;
        for (int i2 = 0; i2 < this.stateListeners.size(); i2++) {
            this.stateListeners.get(i2).onSignalBarsCountChanged(i);
        }
    }

    public void lambda$onStartCommand$1(Boolean bool) {
        if (sharedInstance == null || !bool.booleanValue()) {
            return;
        }
        setMicMute(false, false, true);
    }

    public void lambda$onStartCommand$2() {
        this.delayedStartOutgoingCall = null;
        startOutgoingCall();
    }

    public void lambda$onStartCommand$3() {
        kk7.f(this.currentAccount).k(kk7.O4, new Object[0]);
    }

    public void lambda$playAllowTalkSound$117() {
        this.soundPool.play(this.spAllowTalkId, 0.5f, 0.5f, 0, 0, 1.0f);
    }

    public void lambda$playConnectedSound$84() {
        this.soundPool.play(this.spVoiceChatStartId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void lambda$playStartRecordSound$116() {
        this.soundPool.play(this.spStartRecordId, 0.5f, 0.5f, 0, 0, 1.0f);
    }

    public void lambda$processAcceptedCall$22(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            callFailed();
            return;
        }
        this.privateCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
        initiateActualEncryptedCall();
    }

    public void lambda$processAcceptedCall$23(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new ahc(this, tL_error, tLObject, (byte) 2));
    }

    public void lambda$setMicMute$0() {
        if (this.updateNotificationRunnable == null) {
            return;
        }
        this.updateNotificationRunnable = null;
        showNotification(getTitle(), getRoundAvatarBitmap(this, this.currentAccount, this.chat));
    }

    public void lambda$setupCaptureDevice$14() {
        this.micSwitching = false;
    }

    public void lambda$startConferenceGroupCall$34(TLObject tLObject, j5 j5Var, TLRPC.TL_error tL_error) {
        boolean z = tLObject instanceof TLRPC.Updates;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (z) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            na7.q1(this.currentAccount).a4(updates.users, false);
            na7.q1(this.currentAccount).U3(updates.chats, false);
            ArrayList x0 = na7.x0(updates, TL_update.TL_updateGroupCall.class);
            int size = x0.size();
            TLRPC.GroupCall groupCall = null;
            int i = 0;
            while (i < size) {
                Object obj = x0.get(i);
                i++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (groupCall != null) {
                try {
                    this.groupCallBottomSheetLatch.await(800L, timeUnit);
                } catch (InterruptedException e) {
                    fa4.g(e, true);
                }
                this.groupCall.w(j5Var, groupCall);
                this.groupCall.l(true);
                na7.q1(this.currentAccount).Y3(0L, this.groupCall);
                this.conference.inputGroupCall = new TLRPC.TL_inputGroupCall();
                ConferenceCall conferenceCall = this.conference;
                TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
                inputGroupCall.id = groupCall.id;
                inputGroupCall.access_hash = groupCall.access_hash;
                apb.a(conferenceCall.groupCall, groupCall);
                conferenceCall.groupCall = groupCall;
                startConferenceGroupCall(false, 0, null, false);
                HashSet<Long> hashSet = this.inviteUsersToConference;
                if (hashSet != null) {
                    Iterator<Long> it = hashSet.iterator();
                    while (it.hasNext()) {
                        long longValue = it.next().longValue();
                        fc2 fc2Var = this.groupCall;
                        if (fc2Var != null) {
                            fc2Var.a(longValue);
                        }
                    }
                }
                hgc hgcVar = hgc.m1;
                if (hgcVar != null) {
                    hgcVar.d();
                }
                h75.S0(LaunchActivity.H1, j5.a(this.currentAccount), null, null, false, null);
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            try {
                this.groupCallBottomSheetLatch.await(800L, timeUnit);
            } catch (InterruptedException e2) {
                fa4.g(e2, true);
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            this.groupCall.v(j5Var, 0L, groupcall);
            this.groupCall.l(true);
            na7.q1(this.currentAccount).Y3(0L, this.groupCall);
            this.conference.inputGroupCall = new TLRPC.TL_inputGroupCall();
            ConferenceCall conferenceCall2 = this.conference;
            TLRPC.InputGroupCall inputGroupCall2 = conferenceCall2.inputGroupCall;
            TLRPC.GroupCall groupCall2 = groupcall.call;
            inputGroupCall2.id = groupCall2.id;
            inputGroupCall2.access_hash = groupCall2.access_hash;
            conferenceCall2.groupCall = groupCall2;
            startConferenceGroupCall(false, 0, null, false);
            HashSet<Long> hashSet2 = this.inviteUsersToConference;
            if (hashSet2 != null) {
                Iterator<Long> it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    long longValue2 = it2.next().longValue();
                    fc2 fc2Var2 = this.groupCall;
                    if (fc2Var2 != null) {
                        fc2Var2.a(longValue2);
                    }
                }
            }
            hgc hgcVar2 = hgc.m1;
            if (hgcVar2 != null) {
                hgcVar2.d();
            }
            h75.S0(LaunchActivity.H1, j5.a(this.currentAccount), null, null, false, null);
        } else {
            kk7.f(this.currentAccount).k(kk7.L0, 6, tL_error.text);
            hangUp(0);
        }
    }

    public void lambda$startConferenceGroupCall$35(j5 j5Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new exa(this, tLObject, j5Var, tL_error, (byte) 25));
    }

    public void lambda$startConferenceGroupCall$36(TLObject tLObject, int i, String str, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            na7.q1(this.currentAccount).a4(groupcall.users, false);
            na7.q1(this.currentAccount).U3(groupcall.chats, false);
            this.groupCall.v(j5.a(this.currentAccount), 0L, groupcall);
            ConferenceCall conferenceCall = this.conference;
            conferenceCall.groupCall = groupcall.call;
            conferenceCall.inputGroupCall = this.joinConference;
            startConferenceGroupCall(false, i, str, false);
        } else if (tL_error != null) {
            kk7.f(this.currentAccount).k(kk7.L0, 6, tL_error.text);
            hangUp(0);
        }
    }

    public void lambda$startConferenceGroupCall$37(int i, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new i57(this, tLObject, i, str, tL_error, (byte) 28));
    }

    public static void lambda$startConferenceGroupCall$38() {
        kk7.e().k(kk7.u2, new Object[0]);
    }

    public void lambda$startConferenceGroupCall$39(int i) {
        this.mySource[0] = i;
    }

    public void lambda$startConferenceGroupCall$40(TLRPC.GroupCallParticipant groupCallParticipant) {
        this.mySource[0] = groupCallParticipant.source;
    }

    public void lambda$startConferenceGroupCall$41(TLRPC.Updates updates, long j) {
        int i;
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i = message.id;
            }
            i = 0;
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i = ((TL_update.TL_updateMessageID) update).id;
        } else {
            if (updates.updates != null) {
                for (int i2 = 0; i2 < updates.updates.size(); i2++) {
                    TLRPC.Update update2 = updates.updates.get(i2);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                        if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                            i = message2.id;
                            break;
                        }
                    } else if (update2 instanceof TL_update.TL_updateMessageID) {
                        i = ((TL_update.TL_updateMessageID) update2).id;
                        break;
                    }
                }
            }
            i = 0;
        }
        fc2 fc2Var = this.groupCall;
        if (fc2Var != null && i != 0) {
            HashMap hashMap = fc2Var.k;
            Long valueOf = Long.valueOf(j);
            ?? obj = new Object();
            obj.a = i;
            obj.b = true;
            obj.c = System.currentTimeMillis();
            hashMap.put(valueOf, obj);
            kk7.f(this.currentAccount).k(kk7.v2, 0L, Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
        }
    }

    public void lambda$startConferenceGroupCall$42(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        h26 h26Var = new h26(34, this.currentAccount, new e53(), S.getContext(), S);
        h26Var.t1(null, arrayList, arrayList2, arrayList3, str);
        h26Var.show();
    }

    public static void lambda$startConferenceGroupCall$43(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i = 0; i < Math.min(arrayList.size(), vector.objects.size()); i++) {
                if (vector.objects.get(i) instanceof TL_account.requirementToContactPremium) {
                    arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i)).id));
                }
            }
        }
        runnable.run();
    }

    public static void lambda$startConferenceGroupCall$44(ArrayList arrayList, ArrayList arrayList2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new hhc(tLObject, arrayList, arrayList2, runnable, (byte) 1));
    }

    public void lambda$startConferenceGroupCall$45(HashSet hashSet, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            fc2 fc2Var = this.groupCall;
            if (fc2Var != null) {
                fc2Var.u(longValue);
            }
            arrayList.add(na7.q1(this.currentAccount).V1(l));
            ArrayList<TLRPC.InputUser> arrayList4 = getrequirementstocontact.id;
            na7 q1 = na7.q1(this.currentAccount);
            arrayList4.add(q1.o1(q1.V1(l)));
        }
        khc khcVar = new khc(this, arrayList, arrayList2, arrayList3, str, (byte) 1);
        if (y6c.h(this.currentAccount).p()) {
            khcVar.run();
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getrequirementstocontact, new ck8(arrayList, arrayList2, khcVar, (byte) 29));
        }
    }

    public void lambda$startConferenceGroupCall$46(long j, HashSet hashSet, AtomicInteger atomicInteger, int i, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        VoIPService voIPService;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            na7.q1(this.currentAccount).Q3(updates, false);
            voIPService = this;
            gl.d3(new nhc(voIPService, updates, j, (byte) 1));
        } else {
            voIPService = this;
            if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                hashSet.add(Long.valueOf(j));
            }
        }
        if (atomicInteger.incrementAndGet() == i && !hashSet.isEmpty()) {
            gl.d3(new ohc(voIPService, hashSet, str, (byte) 1));
        }
    }

    public void lambda$startConferenceGroupCall$47(TLObject tLObject, TL_phone.PhoneCall phoneCall, TL_phone.exportGroupCallInvite exportgroupcallinvite) {
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            TL_phone.exportedGroupCallInvite exportedgroupcallinvite = (TL_phone.exportedGroupCallInvite) tLObject;
            Uri parse = Uri.parse(exportedgroupcallinvite.link);
            char c = 1;
            TL_phone.discardCall discardcall = new TL_phone.discardCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            discardcall.peer = tL_inputPhoneCall;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            tL_inputPhoneCall.id = phoneCall.id;
            TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall tL_phoneCallDiscardReasonMigrateConferenceCall = new TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall();
            discardcall.reason = tL_phoneCallDiscardReasonMigrateConferenceCall;
            tL_phoneCallDiscardReasonMigrateConferenceCall.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
            discardcall.duration = (int) (getCallDuration() / 1000);
            discardcall.connection_id = 0L;
            discardcall.video = this.inviteUsersToConferenceVideo;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, null);
            String str = exportedgroupcallinvite.link;
            int size = this.inviteUsersToConference.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet = new HashSet();
            Iterator<Long> it = this.inviteUsersToConference.iterator();
            while (it.hasNext()) {
                Long next = it.next();
                long longValue = next.longValue();
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                na7 q1 = na7.q1(this.currentAccount);
                inviteconferencecallparticipant.user_id = q1.o1(q1.V1(next));
                inviteconferencecallparticipant.call = exportgroupcallinvite.call;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(inviteconferencecallparticipant, new ghc(this, longValue, hashSet, atomicInteger, size, str, (byte) 1));
                c = c;
            }
            this.privateCall = null;
            kk7 f = kk7.f(this.currentAccount);
            Long valueOf = Long.valueOf(this.groupCall.b.id);
            Object[] objArr = new Object[3];
            objArr[0] = 0L;
            objArr[c] = valueOf;
            objArr[2] = Boolean.FALSE;
            f.k(kk7.v2, objArr);
        }
    }

    public void lambda$startConferenceGroupCall$48(TL_phone.PhoneCall phoneCall, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new exa(this, tLObject, phoneCall, exportgroupcallinvite, (byte) 27));
    }

    public void lambda$startConferenceGroupCall$49(TLRPC.Updates updates, long j) {
        int i;
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i = message.id;
            }
            i = 0;
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i = ((TL_update.TL_updateMessageID) update).id;
        } else {
            if (updates.updates != null) {
                for (int i2 = 0; i2 < updates.updates.size(); i2++) {
                    TLRPC.Update update2 = updates.updates.get(i2);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                        if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                            i = message2.id;
                            break;
                        }
                    } else if (update2 instanceof TL_update.TL_updateMessageID) {
                        i = ((TL_update.TL_updateMessageID) update2).id;
                        break;
                    }
                }
            }
            i = 0;
        }
        fc2 fc2Var = this.groupCall;
        if (fc2Var != null && i != 0) {
            HashMap hashMap = fc2Var.k;
            Long valueOf = Long.valueOf(j);
            ?? obj = new Object();
            obj.a = i;
            obj.b = true;
            obj.c = System.currentTimeMillis();
            hashMap.put(valueOf, obj);
            kk7.f(this.currentAccount).k(kk7.v2, 0L, Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
        }
    }

    public void lambda$startConferenceGroupCall$50(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        h26 h26Var = new h26(34, this.currentAccount, new e53(), S.getContext(), S);
        h26Var.t1(null, arrayList, arrayList2, arrayList3, str);
        h26Var.show();
    }

    public static void lambda$startConferenceGroupCall$51(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i = 0; i < Math.min(arrayList.size(), vector.objects.size()); i++) {
                if (vector.objects.get(i) instanceof TL_account.requirementToContactPremium) {
                    arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i)).id));
                }
            }
        }
        runnable.run();
    }

    public static void lambda$startConferenceGroupCall$52(ArrayList arrayList, ArrayList arrayList2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new hhc(tLObject, arrayList, arrayList2, runnable, (byte) 0));
    }

    public void lambda$startConferenceGroupCall$53(HashSet hashSet, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            fc2 fc2Var = this.groupCall;
            if (fc2Var != null) {
                fc2Var.u(longValue);
            }
            arrayList.add(na7.q1(this.currentAccount).V1(l));
            ArrayList<TLRPC.InputUser> arrayList4 = getrequirementstocontact.id;
            na7 q1 = na7.q1(this.currentAccount);
            arrayList4.add(q1.o1(q1.V1(l)));
        }
        khc khcVar = new khc(this, arrayList, arrayList2, arrayList3, str, (byte) 0);
        if (y6c.h(this.currentAccount).p()) {
            khcVar.run();
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getrequirementstocontact, new ck8(arrayList, arrayList2, khcVar, (byte) 28));
        }
    }

    public void lambda$startConferenceGroupCall$54(long j, HashSet hashSet, AtomicInteger atomicInteger, int i, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            na7.q1(this.currentAccount).Q3(updates, false);
            gl.d3(new nhc(this, updates, j, (byte) 0));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j));
        }
        if (atomicInteger.incrementAndGet() == i && !hashSet.isEmpty()) {
            gl.d3(new ohc(this, hashSet, str, (byte) 0));
        }
    }

    public void lambda$startConferenceGroupCall$55(ArrayList arrayList, boolean z) {
        char c;
        TL_phone.PhoneCall phoneCall;
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null) {
            conferenceCall.joined();
            int size = arrayList.size();
            int i = 0;
            while (true) {
                c = 1;
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                this.conference.applyUpdate(0, (TL_update.TL_updateGroupCallChainBlocks) obj, true, null);
            }
            this.conference.forcePoll();
            this.groupCall.l(z);
            startGroupCheckShortpoll();
            long j = 0;
            if (this.captureDevice[1] != 0) {
                createGroupInstance(1, false, true);
            }
            for (int i2 = 0; i2 < 2; i2++) {
                NativeInstance nativeInstance = this.tgVoip[i2];
                if (nativeInstance != null) {
                    nativeInstance.setConferenceCallId(this.conference.getCallId());
                }
            }
            gl.e3(this.destroyConvertingRunnable, 5000L);
            if (this.inviteUsersToConference != null && (phoneCall = this.privateCall) != null && this.groupCall != null) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                exportgroupcallinvite.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall = this.groupCall.b;
                tL_inputGroupCall.id = groupCall.id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new ck8(this, phoneCall, exportgroupcallinvite, (byte) 27));
            }
            long[] jArr = this.inviteUsers;
            if (jArr != null) {
                String str = this.groupCall.b.invite_link;
                int length = jArr.length;
                AtomicInteger atomicInteger = new AtomicInteger(0);
                HashSet hashSet = new HashSet();
                long[] jArr2 = this.inviteUsers;
                int length2 = jArr2.length;
                int i3 = 0;
                while (true) {
                    char c2 = c;
                    long j2 = j;
                    if (i3 < length2) {
                        long j3 = jArr2[i3];
                        this.groupCall.a(j3);
                        TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                        fc2 fc2Var = this.groupCall;
                        inviteconferencecallparticipant.call = fc2Var.h(fc2Var.a);
                        inviteconferencecallparticipant.user_id = na7.q1(this.currentAccount).m1(j3);
                        inviteconferencecallparticipant.video = this.videoCall;
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(inviteconferencecallparticipant, new ghc(this, j3, hashSet, atomicInteger, length, str, (byte) 0));
                        i3++;
                        j = j2;
                        c = c2;
                        length2 = length2;
                    } else {
                        this.inviteUsers = null;
                        kk7 f = kk7.f(this.currentAccount);
                        Long valueOf = Long.valueOf(j2);
                        Long valueOf2 = Long.valueOf(this.groupCall.b.id);
                        Object[] objArr = new Object[3];
                        objArr[0] = valueOf;
                        objArr[c2] = valueOf2;
                        objArr[2] = Boolean.FALSE;
                        f.k(kk7.v2, objArr);
                        return;
                    }
                }
            }
        }
    }

    public void lambda$startConferenceGroupCall$56(TLRPC.TL_error tL_error, String str) {
        if ("JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            hangUp(2);
        } else if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
            startConferenceGroupCall(false, 0, str, false);
        } else if (tL_error.text.startsWith("CONF_WRITE_CHAIN_INVALID")) {
            stopSelf();
        } else if ("GROUPCALL_INVALID".equals(tL_error.text)) {
            org.telegram.ui.ActionBar.d S = LaunchActivity.S();
            if (S != null) {
                u21.b0(S).Q(2131624080, 36, k96.M0(2131751810, null)).j().r = false;
            }
            hangUp(0);
        } else {
            kk7.f(this.currentAccount).k(kk7.L0, 6, tL_error.text);
            hangUp(0);
        }
    }

    public void lambda$startConferenceGroupCall$57(int i, boolean z, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            gl.d3(new chc(this, i, (byte) 3));
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            long selfId = getSelfId();
            ArrayList x0 = na7.x0(updates, TL_update.TL_updateGroupCallChainBlocks.class);
            ArrayList w0 = na7.w0(updates, TL_update.TL_updateGroupCall.class);
            int size = w0.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = w0.get(i2);
                i2++;
                TLRPC.GroupCall groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                fc2 fc2Var = this.groupCall;
                if (fc2Var != null) {
                    fc2Var.w(j5.a(this.currentAccount), groupCall);
                }
                ConferenceCall conferenceCall = this.conference;
                if (conferenceCall != null) {
                    apb.a(conferenceCall.groupCall, groupCall);
                    conferenceCall.groupCall = groupCall;
                }
            }
            ArrayList w02 = na7.w0(updates, TL_update.TL_updateGroupCallParticipants.class);
            int size2 = w02.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = w02.get(i3);
                i3++;
                TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
                int size3 = tL_updateGroupCallParticipants.participants.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size3) {
                        TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i4);
                        if (k27.B1(groupCallParticipant.peer) == selfId) {
                            gl.d3(new dhc(this, groupCallParticipant, (byte) 1));
                            if (w01.a) {
                                b00.p(groupCallParticipant.source, new StringBuilder("join source = "));
                            }
                        } else {
                            i4++;
                        }
                    }
                }
            }
            ArrayList w03 = na7.w0(updates, TL_update.TL_updateGroupCallConnection.class);
            int size4 = w03.size();
            int i5 = 0;
            while (i5 < size4) {
                Object obj3 = w03.get(i5);
                i5++;
                TL_update.TL_updateGroupCallConnection tL_updateGroupCallConnection = (TL_update.TL_updateGroupCallConnection) obj3;
                if (!tL_updateGroupCallConnection.presentation) {
                    this.myParams = tL_updateGroupCallConnection.params;
                }
            }
            na7.q1(this.currentAccount).Q3(updates, false);
            gl.d3(new vj6(this, x0, z, (byte) 28));
            return;
        }
        gl.d3(new wbc(this, tL_error, str, (byte) 5));
    }

    public void lambda$startConferenceGroupCall$58(String str, int i, boolean z) {
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        joingroupcall.muted = this.micMute;
        boolean z2 = false;
        if (this.videoState[0] != 2) {
            z2 = true;
        }
        joingroupcall.video_stopped = z2;
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null) {
            joingroupcall.call = conferenceCall.inputGroupCall;
            joingroupcall.flags |= 8;
            joingroupcall.public_key = conferenceCall.getMyPublicKey();
            joingroupcall.block = this.conference.getLastBlock();
        } else {
            fc2 fc2Var = this.groupCall;
            if (fc2Var != null) {
                joingroupcall.call = fc2Var.h(fc2Var.a);
            }
        }
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcall.params = tL_dataJSON;
        tL_dataJSON.data = str;
        if (!TextUtils.isEmpty(this.joinHash)) {
            joingroupcall.invite_hash = this.joinHash;
            joingroupcall.flags |= 2;
        }
        TLRPC.InputPeer inputPeer = this.groupCallPeer;
        if (inputPeer != null) {
            joingroupcall.join_as = inputPeer;
        } else {
            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            joingroupcall.join_as = tL_inputPeerUser;
            tL_inputPeerUser.user_id = y6c.h(j5.a(this.currentAccount).a).e();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcall, new rj3(i, str, this, z));
    }

    public void lambda$startConferenceGroupCall$59(Runnable runnable) {
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null) {
            conferenceCall.generateAddSelfBlock();
            runnable.run();
            for (int i = 0; i < 2; i++) {
                NativeInstance nativeInstance = this.tgVoip[i];
                if (nativeInstance != null) {
                    nativeInstance.setConferenceCallId(this.conference.getCallId());
                }
            }
        }
    }

    public void lambda$startConnectingSound$85() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
        }
        int play = this.soundPool.play(this.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
        this.spPlayId = play;
        if (play == 0) {
            AnonymousClass10 anonymousClass10 = new AnonymousClass10();
            this.connectingSoundRunnable = anonymousClass10;
            gl.e3(anonymousClass10, 100L);
        }
    }

    public void lambda$startGroupCall$24(TL_update.TL_updateGroupCall tL_updateGroupCall) {
        if (sharedInstance == null) {
            return;
        }
        TLRPC.GroupCall groupCall = this.groupCall.b;
        TLRPC.GroupCall groupCall2 = tL_updateGroupCall.call;
        groupCall.access_hash = groupCall2.access_hash;
        groupCall.id = groupCall2.id;
        na7 q1 = na7.q1(this.currentAccount);
        fc2 fc2Var = this.groupCall;
        q1.Y3(fc2Var.c, fc2Var);
        startGroupCall(0, null, false);
    }

    public void lambda$startGroupCall$25(TLRPC.TL_error tL_error) {
        kk7.f(this.currentAccount).k(kk7.L0, 6, tL_error.text);
        hangUp(0);
    }

    public void lambda$startGroupCall$26(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            try {
                this.groupCallBottomSheetLatch.await(800L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                fa4.g(e, true);
            }
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            int i = 0;
            while (true) {
                if (i >= updates.updates.size()) {
                    break;
                }
                TLRPC.Update update = updates.updates.get(i);
                if (update instanceof TL_update.TL_updateGroupCall) {
                    gl.d3(new mhc(this, (TL_update.TL_updateGroupCall) update, (byte) 1));
                    break;
                }
                i++;
            }
            na7.q1(this.currentAccount).Q3(updates, false);
            return;
        }
        gl.d3(new ehc(this, tL_error, (byte) 2));
    }

    public static void lambda$startGroupCall$27() {
        kk7.e().k(kk7.u2, new Object[0]);
    }

    public void lambda$startGroupCall$28(int i) {
        this.mySource[0] = i;
    }

    public void lambda$startGroupCall$29(TLRPC.GroupCallParticipant groupCallParticipant) {
        this.mySource[0] = groupCallParticipant.source;
    }

    public void lambda$startGroupCall$30(boolean z) {
        this.groupCall.l(z);
    }

    public void lambda$startGroupCall$31(TLRPC.TL_error tL_error) {
        TLRPC.ChatFull L0;
        if ("JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            if (this.chat != null && (L0 = na7.q1(this.currentAccount).L0(this.chat.id)) != null) {
                boolean z = L0 instanceof TLRPC.TL_chatFull;
                int i = L0.flags;
                if (z) {
                    L0.flags = i & (-32769);
                } else {
                    L0.flags = i & (-67108865);
                }
                L0.groupcall_default_join_as = null;
                xt5.C1 = null;
            }
            hangUp(2);
        } else if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
            createGroupInstance(0, false, false);
        } else {
            if ("GROUPCALL_INVALID".equals(tL_error.text) && this.chat != null) {
                na7.q1(this.currentAccount).X2(0, this.chat.id, true);
            }
            kk7.f(this.currentAccount).k(kk7.L0, 6, tL_error.text);
            hangUp(0);
        }
    }

    public void lambda$startGroupCall$32(int i, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            gl.d3(new chc(this, i, (byte) 0));
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            long selfId = getSelfId();
            int size = updates.updates.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC.Update update = updates.updates.get(i2);
                if (update instanceof TL_update.TL_updateGroupCallParticipants) {
                    TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) update;
                    int size2 = tL_updateGroupCallParticipants.participants.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i3);
                            if (k27.B1(groupCallParticipant.peer) == selfId) {
                                gl.d3(new dhc(this, groupCallParticipant, (byte) 0));
                                if (w01.a) {
                                    b00.p(groupCallParticipant.source, new StringBuilder("join source = "));
                                }
                            } else {
                                i3++;
                            }
                        }
                    }
                } else if (update instanceof TL_update.TL_updateGroupCallConnection) {
                    TL_update.TL_updateGroupCallConnection tL_updateGroupCallConnection = (TL_update.TL_updateGroupCallConnection) update;
                    if (!tL_updateGroupCallConnection.presentation) {
                        this.myParams = tL_updateGroupCallConnection.params;
                    }
                }
            }
            na7.q1(this.currentAccount).Q3(updates, false);
            gl.d3(new k08((byte) 26, this, z));
            startGroupCheckShortpoll();
            return;
        }
        gl.d3(new ehc(this, tL_error, (byte) 0));
    }

    public void lambda$startGroupCheckShortpoll$64(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (this.shortPollRunnable != null && sharedInstance != null && this.groupCall != null) {
            if (tLObject instanceof TL_phone.groupCall) {
                TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                na7.q1(this.currentAccount).a4(groupcall.users, false);
                na7.q1(this.currentAccount).U3(groupcall.chats, false);
                this.groupCall.w(j5.a(this.currentAccount), groupcall.call);
                this.groupCall.l(true);
                this.shortPollRunnable = null;
                this.checkRequestId = 0;
                startGroupCheckShortpoll();
            } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                stopSelf();
            }
        }
    }

    public void lambda$startGroupCheckShortpoll$65(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new ahc(this, tLObject, tL_error));
    }

    public void lambda$startGroupCheckShortpoll$66(TLRPC.TL_error tL_error, TLObject tLObject, TL_phone.checkGroupCall checkgroupcall) {
        boolean z;
        boolean z2;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable != null && sharedInstance != null && this.groupCall != null) {
            if (this.conference != null && tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text) && this.groupCall.h(true) != null && this.groupCall.h(false) != null) {
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = this.groupCall.h(false);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new ihc(this, (byte) 8));
                return;
            }
            this.shortPollRunnable = null;
            this.checkRequestId = 0;
            if (tLObject instanceof Vector) {
                ArrayList<Integer> intArray = ((Vector) tLObject).toIntArray();
                int i = this.mySource[0];
                if (i != 0 && checkgroupcall.sources.contains(Integer.valueOf(i)) && !intArray.contains(Integer.valueOf(this.mySource[0]))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i2 = this.mySource[1];
                if (i2 != 0 && checkgroupcall.sources.contains(Integer.valueOf(i2)) && !intArray.contains(Integer.valueOf(this.mySource[1]))) {
                    z = true;
                }
                z = false;
            } else {
                if (tL_error != null && tL_error.code == 400) {
                    int i3 = this.mySource[1];
                    if (i3 != 0 && checkgroupcall.sources.contains(Integer.valueOf(i3))) {
                        z = true;
                    } else {
                        z2 = true;
                        z = false;
                    }
                } else {
                    z = false;
                }
                z2 = z;
            }
            if (z2) {
                createGroupInstance(0, false, false);
            }
            if (z) {
                createGroupInstance(1, false, false);
            }
            int[] iArr = this.mySource;
            if (iArr[1] != 0 || iArr[0] != 0 || ((groupCall = this.groupCall.b) != null && groupCall.rtmp_stream)) {
                startGroupCheckShortpoll();
            }
        }
    }

    public void lambda$startGroupCheckShortpoll$67(TL_phone.checkGroupCall checkgroupcall, TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new exa(this, tL_error, tLObject, checkgroupcall, (byte) 24));
    }

    public void lambda$startGroupCheckShortpoll$68() {
        fc2 fc2Var;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable != null && sharedInstance != null && (fc2Var = this.groupCall) != null) {
            int[] iArr = this.mySource;
            int i = 0;
            if (iArr[0] != 0 || iArr[1] != 0 || ((groupCall = fc2Var.b) != null && groupCall.rtmp_stream)) {
                TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
                TLRPC.InputGroupCall h = this.groupCall.h(true);
                fc2 fc2Var2 = this.groupCall;
                if (h != null) {
                    checkgroupcall.call = fc2Var2.h(true);
                } else {
                    checkgroupcall.call = fc2Var2.h(false);
                }
                while (true) {
                    int[] iArr2 = this.mySource;
                    if (i < iArr2.length) {
                        int i2 = iArr2[i];
                        if (i2 != 0) {
                            checkgroupcall.sources.add(Integer.valueOf(i2));
                        }
                        i++;
                    } else {
                        this.checkRequestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkgroupcall, new apa(this, checkgroupcall, (byte) 23));
                        return;
                    }
                }
            }
        }
    }

    public void lambda$startOutgoingCall$10(byte[] bArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new exa(this, tL_error, tLObject, bArr, (byte) 26));
    }

    public void lambda$startOutgoingCall$11(ad7 ad7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        ad7 ad7Var2;
        this.callReqId = 0;
        if (this.endCallAfterRequest) {
            callEnded();
        } else if (tL_error == null) {
            TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
            if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                byte[] bArr = messages_dhconfig.p;
                int i = messages_dhconfig.g;
                Pattern pattern = Utilities.a;
                if (!ConnectionsManager.native_isGoodPrime(bArr, i)) {
                    callFailed();
                    return;
                }
                byte[] bArr2 = messages_dhconfig.p;
                ad7Var.G();
                ad7Var.y = bArr2;
                int i2 = messages_dhconfig.g;
                ad7Var.G();
                ad7Var.E = i2;
                int i3 = messages_dhconfig.version;
                ad7Var.G();
                ad7Var.x = i3;
                ad7Var.G();
                int i4 = ad7Var.x;
                ad7Var.G();
                int i5 = ad7Var.E;
                ad7Var.G();
                ad7Var2 = ad7Var;
                ad7Var.a.c(new mp1(ad7Var2, i4, i5, ad7Var.y, (byte) 10));
            } else {
                ad7Var2 = ad7Var;
            }
            byte[] bArr3 = new byte[256];
            for (int i6 = 0; i6 < 256; i6++) {
                bArr3[i6] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i6]);
            }
            ad7Var2.G();
            BigInteger valueOf = BigInteger.valueOf(ad7Var2.E);
            BigInteger bigInteger = new BigInteger(1, bArr3);
            ad7Var2.G();
            byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, ad7Var2.y)).toByteArray();
            if (byteArray.length > 256) {
                byte[] bArr4 = new byte[256];
                System.arraycopy(byteArray, 1, bArr4, 0, 256);
                byteArray = bArr4;
            }
            TL_phone.requestCall requestcall = new TL_phone.requestCall();
            requestcall.user_id = na7.q1(this.currentAccount).o1(this.user);
            TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol = new TL_phone.TL_phoneCallProtocol();
            requestcall.protocol = tL_phoneCallProtocol;
            requestcall.video = this.videoCall;
            tL_phoneCallProtocol.udp_p2p = true;
            tL_phoneCallProtocol.udp_reflector = true;
            tL_phoneCallProtocol.min_layer = 65;
            tL_phoneCallProtocol.max_layer = Instance.getConnectionMaxLayer();
            Collections.addAll(requestcall.protocol.library_versions, NativeInstance.getAllVersions());
            this.g_a = byteArray;
            requestcall.g_a_hash = Utilities.o(byteArray.length, byteArray);
            requestcall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(requestcall, new apa(this, bArr3, (byte) 24), 65536);
        } else {
            if (w01.a) {
                fa4.d("Error on getDhConfig " + tL_error);
            }
            callFailed();
        }
    }

    public static void lambda$startOutgoingCall$6() {
        kk7.e().k(kk7.u2, new Object[0]);
    }

    public void lambda$startOutgoingCall$7(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (w01.a) {
            if (tL_error != null) {
                fa4.d("error on phone.discardCall: " + tL_error);
            } else {
                fa4.b("phone.discardCall " + tLObject);
            }
        }
        gl.d3(new bhc(this, (byte) 24));
    }

    public void lambda$startOutgoingCall$8() {
        this.timeoutRunnable = null;
        TL_phone.discardCall discardcall = new TL_phone.discardCall();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        discardcall.peer = tL_inputPhoneCall;
        TL_phone.PhoneCall phoneCall = this.privateCall;
        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
        tL_inputPhoneCall.id = phoneCall.id;
        discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonMissed();
        fa4.d("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new ihc(this, (byte) 1), 65536);
    }

    public void lambda$startOutgoingCall$9(TLRPC.TL_error tL_error, TLObject tLObject, byte[] bArr) {
        if (tL_error == null) {
            this.privateCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
            this.a_or_b = bArr;
            dispatchStateChanged(13);
            if (this.endCallAfterRequest) {
                hangUp();
                return;
            }
            if (this.pendingUpdates.size() > 0 && this.privateCall != null) {
                ArrayList<TL_phone.PhoneCall> arrayList = this.pendingUpdates;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    TL_phone.PhoneCall phoneCall = arrayList.get(i);
                    i++;
                    onCallUpdated(phoneCall);
                }
                this.pendingUpdates.clear();
            }
            bhc bhcVar = new bhc(this, (byte) 18);
            this.timeoutRunnable = bhcVar;
            gl.e3(bhcVar, na7.q1(this.currentAccount).Z2);
        } else if (tL_error.code == 400 && "PARTICIPANT_VERSION_OUTDATED".equals(tL_error.text)) {
            callFailed("ERROR_PEER_OUTDATED");
        } else {
            int i2 = tL_error.code;
            if (i2 == 403) {
                callFailed("ERROR_PRIVACY");
            } else if (i2 == 406) {
                callFailed("ERROR_LOCALIZED");
            } else {
                if (w01.a) {
                    fa4.d("Error on phone.requestCall: " + tL_error);
                }
                callFailed();
            }
        }
    }

    public void lambda$startRingtoneAndVibration$92(MediaPlayer mediaPlayer) {
        try {
            this.ringtonePlayer.start();
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    public void lambda$startScreenCapture$60(int i) {
        this.mySource[1] = i;
    }

    public void lambda$startScreenCapture$61(TLRPC.Updates updates) {
        if (this.tgVoip[1] != null) {
            long selfId = getSelfId();
            int size = updates.updates.size();
            for (int i = 0; i < size; i++) {
                TLRPC.Update update = updates.updates.get(i);
                if (update instanceof TL_update.TL_updateGroupCallConnection) {
                    TL_update.TL_updateGroupCallConnection tL_updateGroupCallConnection = (TL_update.TL_updateGroupCallConnection) update;
                    if (tL_updateGroupCallConnection.presentation) {
                        this.tgVoip[1].setJoinResponsePayload(tL_updateGroupCallConnection.params.data);
                    }
                } else if (update instanceof TL_update.TL_updateGroupCallParticipants) {
                    TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) update;
                    int size2 = tL_updateGroupCallParticipants.participants.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size2) {
                            TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i2);
                            if (k27.B1(groupCallParticipant.peer) == selfId) {
                                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.presentation;
                                if (tL_groupCallParticipantVideo != null) {
                                    if ((tL_groupCallParticipantVideo.flags & 2) != 0) {
                                        this.mySource[1] = tL_groupCallParticipantVideo.audio_source;
                                    } else {
                                        int size3 = tL_groupCallParticipantVideo.source_groups.size();
                                        for (int i3 = 0; i3 < size3; i3++) {
                                            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = groupCallParticipant.presentation.source_groups.get(i3);
                                            if (tL_groupCallParticipantVideoSourceGroup.sources.size() > 0) {
                                                this.mySource[1] = tL_groupCallParticipantVideoSourceGroup.sources.get(0).intValue();
                                            }
                                        }
                                    }
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
        }
    }

    public void lambda$startScreenCapture$62(TLRPC.TL_error tL_error) {
        TLRPC.ChatFull L0;
        if ("GROUPCALL_VIDEO_TOO_MUCH".equals(tL_error.text)) {
            this.groupCall.t();
        } else if ("JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            if (this.chat != null && (L0 = na7.q1(this.currentAccount).L0(this.chat.id)) != null) {
                boolean z = L0 instanceof TLRPC.TL_chatFull;
                int i = L0.flags;
                if (z) {
                    L0.flags = i & (-32769);
                } else {
                    L0.flags = i & (-67108865);
                }
                L0.groupcall_default_join_as = null;
                xt5.C1 = null;
            }
            hangUp(2);
        } else if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
            createGroupInstance(1, false, false);
        } else if ("GROUPCALL_INVALID".equals(tL_error.text) && this.chat != null) {
            na7.q1(this.currentAccount).X2(0, this.chat.id, true);
        }
    }

    public void lambda$startScreenCapture$63(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            gl.d3(new chc(this, i, (byte) 4));
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            gl.d3(new mhc(this, updates, (byte) 0));
            na7.q1(this.currentAccount).Q3(updates, false);
            startGroupCheckShortpoll();
            return;
        }
        gl.d3(new ehc(this, tL_error, (byte) 1));
    }

    public void lambda$stopScreenCapture$15(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            na7.q1(this.currentAccount).Q3((TLRPC.Updates) tLObject, false);
        }
    }

    public void lambda$switchToSpeaker$87(Boolean bool, Boolean bool2) {
        updateOutputGainControlState();
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StateListener stateListener = arrayList.get(i);
            i++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public void lambda$switchToSpeaker$88() {
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if ((!isBluetoothHeadsetConnected() || !hasEarpiece()) && !this.isHeadsetPlugged && !isSpeakerphoneOn()) {
            voipAudioManager.setSpeakerphoneOn(true);
            voipAudioManager.isBluetoothAndSpeakerOnAsync(new thc(this, (byte) 0));
        }
    }

    public void lambda$toggleSpeakerphoneOrShowRouteSheet$89(DialogInterface dialogInterface, int i) {
        if (getSharedInstance() == null) {
            return;
        }
        setAudioOutput(i);
    }

    public static void lambda$toggleSpeakerphoneOrShowRouteSheet$90(fx0 fx0Var, Integer num, DialogInterface dialogInterface) {
        for (int i = 0; i < fx0Var.x0.size(); i++) {
            int i2 = bkb.i5;
            fx0Var.w0(i, bkb.w0(null, i2, false), bkb.w0(null, i2, false));
        }
        if (num != null) {
            int w0 = bkb.w0(null, bkb.j5, false);
            fx0Var.w0(num.intValue(), w0, w0);
        }
    }

    public void lambda$toggleSpeakerphoneOrShowRouteSheet$91(Boolean bool, Boolean bool2) {
        updateOutputGainControlState();
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StateListener stateListener = arrayList.get(i);
            i++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public static void lambda$updateBluetoothHeadsetState$109(VoipAudioManager voipAudioManager) {
        try {
            voipAudioManager.startBluetooth();
        } catch (Throwable unused) {
        }
    }

    public void lambda$updateConnectionState$77(int i) {
        if (this.switchingStreamTimeoutRunnable == null) {
            return;
        }
        this.switchingStream = false;
        lambda$createGroupInstance$74(i, 0, true);
        this.switchingStreamTimeoutRunnable = null;
    }

    public void lambda$updateConnectionState$78() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
        }
        this.spPlayId = this.soundPool.play(this.spVoiceChatConnecting, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public void lambda$updateConnectionState$79() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
            this.spPlayId = 0;
        }
    }

    public static void lambda$updateServerConfig$103(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            String str = ((TLRPC.TL_dataJSON) tLObject).data;
            Instance.setGlobalServerConfig(str);
            sharedPreferences.edit().putString("voip_server_config", str).commit();
        }
    }

    private void loadResources() {
        WebRtcAudioTrack.setAudioTrackUsageAttribute(2);
        Utilities.e.c(new bhc(this, (byte) 16));
    }

    public void lambda$createGroupInstance$75(boolean z, boolean z2) {
        fc2 fc2Var;
        if (!z2 && !isRtmpStreamCall()) {
            if (z) {
                NativeInstance nativeInstance = this.tgVoip[0];
                if (this.broadcastListenerSession == null && nativeInstance != null && (fc2Var = this.groupCall) != null) {
                    yz0 yz0Var = new yz0(this.currentAccount, fc2Var.h(fc2Var.a), getStreamDatacenterId(), nativeInstance, new io9(this, fc2Var, nativeInstance, (byte) 12));
                    this.broadcastListenerSession = yz0Var;
                    yz0Var.b.post(new x6c((byte) 6, yz0Var, org.telegram.messenger.a.o()));
                    updateBroadcastVideoRequests();
                    yz0 yz0Var2 = this.broadcastListenerSession;
                    Handler handler = yz0Var2.b;
                    pz0 pz0Var = yz0Var2.d;
                    Objects.requireNonNull(pz0Var);
                    handler.post(new yy0(pz0Var, (byte) 6));
                    return;
                }
                return;
            }
            stopBroadcastListenerSession();
        }
    }

    private void onTgVoipStop(Instance.FinalState finalState) {
        if (this.user != null && this.privateCall != null && finalState != null) {
            if (TextUtils.isEmpty(finalState.debugLog)) {
                try {
                    finalState.debugLog = getStringFromFile(rgc.e(String.valueOf(this.privateCall.id)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            na7 q1 = na7.q1(this.currentAccount);
            VoIPDebugToSend voIPDebugToSend = q1.f1;
            if (voIPDebugToSend == null) {
                voIPDebugToSend = new VoIPDebugToSend(this.currentAccount);
                q1.f1 = voIPDebugToSend;
            }
            VoIPDebugToSend voIPDebugToSend2 = voIPDebugToSend;
            TL_phone.PhoneCall phoneCall = this.privateCall;
            voIPDebugToSend2.push(phoneCall.id, phoneCall.access_hash, finalState, this.lastLogFilePath);
            this.lastLogFilePath = null;
            boolean z = this.needSendDebugLog;
            if (z) {
                q1.f1.done(this.privateCall.id, z);
                this.needSendDebugLog = false;
            }
        }
    }

    private void processAcceptedCall() {
        byte[] bArr;
        dispatchStateChanged(12);
        ad7 Y = ad7.Y(this.currentAccount);
        Y.G();
        BigInteger bigInteger = new BigInteger(1, Y.y);
        BigInteger bigInteger2 = new BigInteger(1, this.privateCall.g_b);
        if (!Utilities.w(bigInteger2, bigInteger)) {
            if (w01.a) {
                fa4.l("stopping VoIP service, bad Ga and Gb");
            }
            callFailed();
            return;
        }
        byte[] byteArray = bigInteger2.modPow(new BigInteger(1, this.a_or_b), bigInteger).toByteArray();
        if (byteArray.length > 256) {
            bArr = new byte[256];
            System.arraycopy(byteArray, byteArray.length - 256, bArr, 0, 256);
        } else {
            if (byteArray.length < 256) {
                bArr = new byte[256];
                System.arraycopy(byteArray, 0, bArr, 256 - byteArray.length, byteArray.length);
                for (int i = 0; i < 256 - byteArray.length; i++) {
                    bArr[i] = 0;
                }
            }
            byte[] n = Utilities.n(byteArray);
            byte[] bArr2 = new byte[8];
            System.arraycopy(n, n.length - 8, bArr2, 0, 8);
            long g = Utilities.g(bArr2);
            this.authKey = byteArray;
            this.keyFingerprint = g;
            TL_phone.confirmCall confirmcall = new TL_phone.confirmCall();
            confirmcall.g_a = this.g_a;
            confirmcall.key_fingerprint = g;
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            confirmcall.peer = tL_inputPhoneCall;
            TL_phone.PhoneCall phoneCall = this.privateCall;
            tL_inputPhoneCall.id = phoneCall.id;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol = new TL_phone.TL_phoneCallProtocol();
            confirmcall.protocol = tL_phoneCallProtocol;
            tL_phoneCallProtocol.max_layer = Instance.getConnectionMaxLayer();
            TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol2 = confirmcall.protocol;
            tL_phoneCallProtocol2.min_layer = 65;
            tL_phoneCallProtocol2.udp_reflector = true;
            tL_phoneCallProtocol2.udp_p2p = true;
            Collections.addAll(tL_phoneCallProtocol2.library_versions, NativeInstance.getAllVersions());
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmcall, new ihc(this, (byte) 3));
        }
        byteArray = bArr;
        byte[] n2 = Utilities.n(byteArray);
        byte[] bArr22 = new byte[8];
        System.arraycopy(n2, n2.length - 8, bArr22, 0, 8);
        long g2 = Utilities.g(bArr22);
        this.authKey = byteArray;
        this.keyFingerprint = g2;
        TL_phone.confirmCall confirmcall2 = new TL_phone.confirmCall();
        confirmcall2.g_a = this.g_a;
        confirmcall2.key_fingerprint = g2;
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall2 = new TLRPC.TL_inputPhoneCall();
        confirmcall2.peer = tL_inputPhoneCall2;
        TL_phone.PhoneCall phoneCall2 = this.privateCall;
        tL_inputPhoneCall2.id = phoneCall2.id;
        tL_inputPhoneCall2.access_hash = phoneCall2.access_hash;
        TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol3 = new TL_phone.TL_phoneCallProtocol();
        confirmcall2.protocol = tL_phoneCallProtocol3;
        tL_phoneCallProtocol3.max_layer = Instance.getConnectionMaxLayer();
        TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol22 = confirmcall2.protocol;
        tL_phoneCallProtocol22.min_layer = 65;
        tL_phoneCallProtocol22.udp_reflector = true;
        tL_phoneCallProtocol22.udp_p2p = true;
        Collections.addAll(tL_phoneCallProtocol22.library_versions, NativeInstance.getAllVersions());
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmcall2, new ihc(this, (byte) 3));
    }

    private void releaseRtmpStreamPlayer() {
        kbc kbcVar;
        ao9 ao9Var = this.rtmpStreamPlayer;
        if (ao9Var != null) {
            bo9 bo9Var = this.rtmpStreamVideoSinks;
            if (bo9Var != null) {
                kbcVar = new kbc(bo9Var, (byte) 13);
            } else {
                kbcVar = null;
            }
            if (!ao9Var.b.post(new tn9(ao9Var, kbcVar, (byte) 1)) && kbcVar != null) {
                kbcVar.run();
            }
            this.rtmpStreamPlayer = null;
            this.rtmpStreamVideoSinks = null;
        }
        this.rtmpStreamPlayerStarted = false;
        this.rtmpStreamRejoining = false;
    }

    public void removeIncomingVideoOutput(ProxyVideoSink proxyVideoSink) {
        if (proxyVideoSink.nativeInstance == Long.MIN_VALUE) {
            bo9 bo9Var = this.rtmpStreamVideoSinks;
            if (bo9Var != null) {
                bo9Var.a.remove(proxyVideoSink);
            }
        } else {
            NativeInstance nativeInstance = this.tgVoip[0];
            if (nativeInstance != null) {
                nativeInstance.removeIncomingVideoOutput(proxyVideoSink.nativeInstance);
            }
        }
        gl.d3(new bhc(this, (byte) 15));
    }

    private void showIncomingNotification(java.lang.String r17, org.telegram.tgnet.TLObject r18, boolean r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPService.showIncomingNotification(java.lang.String, org.telegram.tgnet.TLObject, boolean, int):void");
    }

    private void showNotification(String str, Bitmap bitmap) {
        String str2;
        int i;
        int i2;
        Intent intent = new Intent(this, LaunchActivity.class);
        if (this.groupCall != null) {
            str2 = "voip_chat";
        } else {
            str2 = "voip";
        }
        Intent action = intent.setAction(str2);
        if (this.groupCall != null) {
            action.putExtra("currentAccount", this.currentAccount);
        }
        Notification.Builder contentIntent = new Notification.Builder(this).setContentText(str).setContentIntent(PendingIntent.getActivity(this, 50, action, 33554432));
        int i3 = 2131232808;
        if (isConference()) {
            contentIntent.setContentTitle(k96.M0(2131743184, null));
            if (isMicMute()) {
                i3 = 2131232809;
            }
            contentIntent.setSmallIcon(i3);
        } else if (this.groupCall != null) {
            if (hc2.W(this.chat)) {
                i = 2131743053;
            } else {
                i = 2131742977;
            }
            contentIntent.setContentTitle(k96.M0(i, null));
            if (isMicMute()) {
                i3 = 2131232809;
            }
            contentIntent.setSmallIcon(i3);
        } else {
            contentIntent.setContentTitle(k96.M0(2131743023, null));
            contentIntent.setSmallIcon(2131230911);
            contentIntent.setOngoing(true);
        }
        Intent intent2 = new Intent(this, VoIPActionsReceiver.class);
        intent2.setAction(getPackageName() + ".END_CALL");
        if (isConference()) {
            contentIntent.addAction(2131231266, k96.M0(2131743181, null), PendingIntent.getBroadcast(this, 0, intent2, 167772160));
        } else if (this.groupCall != null) {
            if (hc2.W(this.chat)) {
                i2 = 2131743229;
            } else {
                i2 = 2131743119;
            }
            contentIntent.addAction(2131231266, k96.M0(i2, null), PendingIntent.getBroadcast(this, 0, intent2, 167772160));
        } else {
            contentIntent.addAction(2131231266, k96.M0(2131743170, null), PendingIntent.getBroadcast(this, 0, intent2, 167772160));
        }
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(false);
        if (Build.VERSION.SDK_INT >= 26) {
            contentIntent.setColor(-14143951);
            contentIntent.setColorized(true);
            im7.c();
            contentIntent.setChannelId(im7.k0);
        } else {
            contentIntent.setColor(-13851168);
        }
        if (!isConference() && bitmap != null) {
            contentIntent.setLargeIcon(bitmap);
        }
        try {
            if (this.foregroundStarted) {
                try {
                    stopForeground(true);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
            this.foregroundStarted = true;
            if (Build.VERSION.SDK_INT >= 33) {
                this.foregroundId = 201;
                Notification notification = contentIntent.getNotification();
                this.foregroundNotification = notification;
                int currentForegroundType = getCurrentForegroundType();
                this.lastForegroundType = currentForegroundType;
                startForeground(201, notification, currentForegroundType);
                return;
            }
            this.foregroundId = 201;
            Notification notification2 = contentIntent.getNotification();
            this.foregroundNotification = notification2;
            startForeground(201, notification2);
        } catch (Exception e2) {
            if (bitmap != null && (e2 instanceof IllegalArgumentException)) {
                showNotification(str, null);
            }
        }
    }

    private void startConferenceGroupCall(boolean z, int i, String str, boolean z2) {
        if (sharedInstance == this) {
            if (this.groupCallPeer == null) {
                this.groupCallPeer = na7.l1(y6c.h(this.currentAccount).f());
            }
            if (z) {
                j5 a = j5.a(this.currentAccount);
                this.conference = new ConferenceCall(this.currentAccount, y6c.h(a.a).e()) {
                    {
                        VoIPService.this = this;
                    }

                    @Override
                    public void gotCallId(long j) {
                        for (int i2 = 0; i2 < 2; i2++) {
                            if (VoIPService.this.tgVoip[i2] != null) {
                                VoIPService.this.tgVoip[i2].setConferenceCallId(j);
                            }
                        }
                    }
                };
                this.chat = null;
                fc2 fc2Var = new fc2();
                this.groupCall = fc2Var;
                fc2Var.b = new TLRPC.TL_groupCall();
                fc2 fc2Var2 = this.groupCall;
                TLRPC.GroupCall groupCall = fc2Var2.b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                groupCall.rtmp_stream = this.isRtmpStream;
                fc2Var2.c = 0L;
                fc2Var2.C = j5.a(this.currentAccount);
                this.groupCall.y(this.groupCallPeer);
                this.groupCall.f();
                dispatchStateChanged(6);
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.b.nextInt();
                this.groupCallBottomSheetLatch = new CountDownLatch(1);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new apa(this, a, (byte) 25), 65536);
                return;
            }
            if (this.conference == null) {
                int i2 = this.currentAccount;
                ConferenceCall conferenceCall = new ConferenceCall(i2, y6c.h(i2).e()) {
                    {
                        VoIPService.this = this;
                    }

                    @Override
                    public void gotCallId(long j) {
                        for (int i3 = 0; i3 < 2; i3++) {
                            if (VoIPService.this.tgVoip[i3] != null) {
                                VoIPService.this.tgVoip[i3].setConferenceCallId(j);
                            }
                        }
                    }
                };
                this.conference = conferenceCall;
                conferenceCall.inputGroupCall = this.joinConference;
            }
            if (this.groupCall == null) {
                fc2 fc2Var3 = new fc2();
                this.groupCall = fc2Var3;
                fc2Var3.a = true;
                fc2Var3.b = new TLRPC.TL_groupCall();
                TLRPC.GroupCall groupCall2 = this.groupCall.b;
                groupCall2.participants_count = 0;
                groupCall2.version = 1;
                groupCall2.can_start_video = true;
                groupCall2.can_change_join_muted = true;
                groupCall2.rtmp_stream = this.isRtmpStream;
                if (this.joinConference instanceof TLRPC.TL_inputGroupCallSlug) {
                    groupCall2.invite_link = "https://t.me/call/" + this.joinConference.slug;
                }
                fc2 fc2Var4 = this.groupCall;
                fc2Var4.c = 0L;
                fc2Var4.C = j5.a(this.currentAccount);
                this.groupCall.y(this.groupCallPeer);
                this.groupCall.f();
                TLRPC.GroupCall groupCall3 = this.joinConferenceCall;
                if (groupCall3 != null) {
                    this.conference.groupCall = groupCall3;
                    this.groupCall.w(j5.a(this.currentAccount), this.joinConferenceCall);
                    this.joinConferenceCall = null;
                }
            }
            if (this.conference.groupCall == null) {
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = this.joinConference;
                getgroupcall.limit = 10;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new b97(this, i, str, (byte) 11));
            } else if (str == null) {
                configureDeviceForCall();
                showNotification();
                gl.d3(new cza((byte) 11));
                if (this.convertingVoip != null && this.isPrivateScreencast) {
                    long[] jArr = this.captureDevice;
                    jArr[1] = jArr[0];
                    jArr[0] = 0;
                    boolean[] zArr = this.destroyCaptureDevice;
                    zArr[1] = true;
                    zArr[0] = true;
                    setVideoState(true, this.videoState[0]);
                    setVideoState(false, 0);
                    this.videoState[0] = 0;
                }
                createGroupInstance(0, false, true);
                long[] jArr2 = this.inviteUsers;
                if (jArr2 != null) {
                    for (long j : jArr2) {
                        this.groupCall.a(j);
                    }
                }
                hgc hgcVar = hgc.m1;
                if (hgcVar != null) {
                    hgcVar.d();
                }
                h75.S0(LaunchActivity.H1, j5.a(y6c.t0), null, null, false, null);
            } else if (getSharedInstance() != null) {
                if (this.groupCall != null || this.conference != null) {
                    dispatchStateChanged(1);
                    if (w01.a) {
                        fa4.b("initital source = " + i);
                    }
                    bs1 bs1Var = new bs1(this, str, i, z, (byte) 10);
                    if (z2) {
                        this.conference.reset();
                    }
                    this.conference.requestLastBlock(new mhc(this, bs1Var, (byte) 2));
                }
            }
        }
    }

    private void startConnectingSound() {
        Utilities.e.c(new bhc(this, (byte) 27));
    }

    private void startGroupCall(int i, String str, boolean z) {
        if (sharedInstance == this) {
            boolean z2 = true;
            if (this.createGroupCall) {
                fc2 fc2Var = new fc2();
                this.groupCall = fc2Var;
                fc2Var.b = new TLRPC.TL_groupCall();
                fc2 fc2Var2 = this.groupCall;
                TLRPC.GroupCall groupCall = fc2Var2.b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                groupCall.rtmp_stream = this.isRtmpStream;
                fc2Var2.c = this.chat.id;
                fc2Var2.C = j5.a(this.currentAccount);
                this.groupCall.y(this.groupCallPeer);
                this.groupCall.f();
                dispatchStateChanged(6);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = na7.j1(this.chat);
                creategroupcall.random_id = Utilities.b.nextInt();
                int i2 = this.scheduleDate;
                if (i2 != 0) {
                    creategroupcall.schedule_date = i2;
                    creategroupcall.flags |= 2;
                }
                if (this.isRtmpStream) {
                    creategroupcall.flags |= 4;
                }
                this.groupCallBottomSheetLatch = new CountDownLatch(1);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(creategroupcall, new ihc(this, (byte) 4), 65536);
                this.createGroupCall = false;
            } else if (str == null) {
                if (this.groupCall == null && this.chat != null) {
                    fc2 e1 = na7.q1(this.currentAccount).e1(this.chat.id, false, null);
                    this.groupCall = e1;
                    if (e1 != null) {
                        e1.y(this.groupCallPeer);
                    }
                }
                configureDeviceForCall();
                showNotification();
                gl.d3(new cza((byte) 13));
                createGroupInstance(0, false, true);
            } else if (getSharedInstance() != null && this.groupCall != null) {
                dispatchStateChanged(1);
                if (w01.a) {
                    fa4.b("initital source = " + i);
                }
                TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
                joingroupcall.muted = this.micMute;
                if (this.videoState[0] == 2) {
                    z2 = false;
                }
                joingroupcall.video_stopped = z2;
                fc2 fc2Var3 = this.groupCall;
                joingroupcall.call = fc2Var3.h(fc2Var3.a);
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                joingroupcall.params = tL_dataJSON;
                tL_dataJSON.data = str;
                if (!TextUtils.isEmpty(this.joinHash)) {
                    joingroupcall.invite_hash = this.joinHash;
                    joingroupcall.flags |= 2;
                }
                TLRPC.InputPeer inputPeer = this.groupCallPeer;
                if (inputPeer != null) {
                    joingroupcall.join_as = inputPeer;
                } else {
                    TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                    joingroupcall.join_as = tL_inputPeerUser;
                    tL_inputPeerUser.user_id = y6c.h(j5.a(this.currentAccount).a).e();
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcall, new c45(this, i, z, (byte) 2));
            }
        }
    }

    private void startGroupCheckShortpoll() {
        fc2 fc2Var;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable == null && sharedInstance != null && (fc2Var = this.groupCall) != null) {
            int[] iArr = this.mySource;
            if (iArr[0] != 0 || iArr[1] != 0 || ((groupCall = fc2Var.b) != null && groupCall.rtmp_stream)) {
                bhc bhcVar = new bhc(this, (byte) 25);
                this.shortPollRunnable = bhcVar;
                gl.e3(bhcVar, 4000L);
            }
        }
    }

    private void startOutgoingCall() {
        CallConnection callConnection;
        if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null) {
            callConnection.setDialing();
        }
        configureDeviceForCall();
        showNotification();
        startConnectingSound();
        dispatchStateChanged(14);
        gl.d3(new cza((byte) 12));
        Utilities.b.nextBytes(new byte[256]);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        ad7 Y = ad7.Y(this.currentAccount);
        Y.G();
        tL_messages_getDhConfig.version = Y.x;
        this.callReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDhConfig, new fhc(this, Y, (byte) 1), 65536);
    }

    private void startRatingActivity() {
        try {
            PendingIntent.getActivity(this, 0, new Intent(this, VoIPFeedbackActivity.class).putExtra("call_id", this.privateCall.id).putExtra("call_access_hash", this.privateCall.access_hash).putExtra("call_video", this.privateCall.video).putExtra("account", this.currentAccount).addFlags(805306368), 33554432).send();
        } catch (Exception e) {
            if (w01.a) {
                fa4.e("Error starting incall activity", e);
            }
        }
    }

    public void startRinging() {
        CallConnection callConnection;
        if (this.currentState != 15) {
            if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null) {
                callConnection.setRinging();
            }
            if (w01.a) {
                ug8.q(this.privateCall.id, new StringBuilder("starting ringing for call "));
            }
            dispatchStateChanged(15);
            boolean z = this.notificationsDisabled;
            TLRPC.User user = this.user;
            if (!z) {
                showIncomingNotification(qu2.m(0, user.first_name, user.last_name), this.user, this.privateCall.video, 0);
                if (w01.a) {
                    fa4.b("Showing incoming call notification");
                    return;
                }
                return;
            }
            startRingtoneAndVibration(user.id);
            if (w01.a) {
                fa4.b("Starting incall activity for incoming call");
            }
            try {
                PendingIntent.getActivity(this, 12345, new Intent(this, LaunchActivity.class).setAction("voip"), 33554432).send();
            } catch (Exception e) {
                if (w01.a) {
                    fa4.e("Error starting incall activity", e);
                }
            }
        }
    }

    public void startRingtoneAndVibration(long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPService.startRingtoneAndVibration(long):void");
    }

    private void startRtmpStreamPlayer() {
        ao9 rtmpStreamPlayer = getRtmpStreamPlayer();
        if (rtmpStreamPlayer != null) {
            Handler handler = rtmpStreamPlayer.b;
            if (!this.rtmpStreamPlayerStarted) {
                this.rtmpStreamPlayerStarted = true;
                handler.post(new qm9(rtmpStreamPlayer, (byte) 3));
            } else if (this.rtmpStreamRejoining) {
                this.rtmpStreamRejoining = false;
                pz0 pz0Var = rtmpStreamPlayer.e;
                Objects.requireNonNull(pz0Var);
                handler.post(new yy0(pz0Var, (byte) 7));
            }
        }
    }

    private void startScreenCapture(int i, String str) {
        if (getSharedInstance() != null && this.groupCall != null) {
            this.mySource[1] = 0;
            TL_phone.joinGroupCallPresentation joingroupcallpresentation = new TL_phone.joinGroupCallPresentation();
            fc2 fc2Var = this.groupCall;
            joingroupcallpresentation.call = fc2Var.h(fc2Var.a);
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            joingroupcallpresentation.params = tL_dataJSON;
            tL_dataJSON.data = str;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcallpresentation, new l12(this, i, (byte) 9));
        }
    }

    private void stopBroadcastListenerSession() {
        yz0 yz0Var = this.broadcastListenerSession;
        if (yz0Var != null) {
            yz0Var.k();
            this.broadcastListenerSession = null;
        }
        this.broadcastListenerRejoining = false;
    }

    public void updateBluetoothHeadsetState(boolean z) {
        if (z != this.isBtHeadsetConnected) {
            if (w01.a) {
                fa4.b("updateBluetoothHeadsetState: " + z);
            }
            this.isBtHeadsetConnected = z;
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            int i = 0;
            if (z && !isRinging() && this.currentState != 0) {
                if (this.bluetoothScoActive) {
                    if (w01.a) {
                        fa4.b("SCO already active, setting audio routing");
                    }
                    if (!hasRtmpStream()) {
                        audioManager.setSpeakerphoneOn(false);
                        voipAudioManager.setBluetoothOn(true);
                    }
                } else {
                    if (w01.a) {
                        fa4.b("startBluetoothSco");
                    }
                    if (!hasRtmpStream()) {
                        this.needSwitchToBluetoothAfterScoActivates = true;
                        gl.e3(new kbc(voipAudioManager, (byte) 14), 500L);
                    }
                }
            } else {
                this.bluetoothScoActive = false;
                this.bluetoothScoConnecting = false;
                voipAudioManager.setBluetoothOn(false);
            }
            ArrayList<StateListener> arrayList = this.stateListeners;
            int size = arrayList.size();
            while (i < size) {
                StateListener stateListener = arrayList.get(i);
                i++;
                stateListener.onAudioSettingsChanged();
            }
        }
    }

    public void updateBroadcastVideoRequests() {
        int i;
        if (this.broadcastListenerSession == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.remoteSinks.keySet()) {
            if (!"unified".equals(str)) {
                Integer num = this.broadcastVideoCeilings.get(str);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                arrayList.add(new mz0(str, i));
            }
        }
        yz0 yz0Var = this.broadcastListenerSession;
        yz0Var.getClass();
        yz0Var.b.post(new z20(yz0Var, new ArrayList(arrayList), (byte) 25));
    }

    public void lambda$createGroupInstance$74(int i, int i2, boolean z) {
        int i3;
        if (i == 0) {
            if (i2 != 1 && !this.switchingStream) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            dispatchStateChanged(i3);
            if (this.switchingStream && (i2 == 0 || (i2 == 1 && z))) {
                chc chcVar = new chc(this, i, (byte) 5);
                this.switchingStreamTimeoutRunnable = chcVar;
                gl.e3(chcVar, 3000L);
            }
            if (i2 == 0) {
                startGroupCheckShortpoll();
                if (this.playedConnectedSound && this.spPlayId == 0 && !this.switchingStream && !this.switchingAccount) {
                    Utilities.e.c(new uhc(this, (byte) 0));
                    return;
                }
                return;
            }
            cancelGroupCheckShortPoll();
            if (!z) {
                this.switchingStream = false;
                this.switchingAccount = false;
            }
            Runnable runnable = this.switchingStreamTimeoutRunnable;
            if (runnable != null) {
                gl.r(runnable);
                this.switchingStreamTimeoutRunnable = null;
            }
            if (this.playedConnectedSound) {
                Utilities.e.c(new uhc(this, (byte) 1));
                Runnable runnable2 = this.connectingSoundRunnable;
                if (runnable2 != null) {
                    gl.r(runnable2);
                    this.connectingSoundRunnable = null;
                }
            } else {
                playConnectedSound();
            }
            if (!this.wasConnected) {
                this.wasConnected = true;
                if (this.reconnectScreenCapture) {
                    createGroupInstance(1, false, true);
                    this.reconnectScreenCapture = false;
                }
                NativeInstance nativeInstance = this.tgVoip[0];
                if (nativeInstance != null && !this.micMute) {
                    nativeInstance.setMuteMicrophone(false);
                }
                setParticipantsVolume();
            }
        }
    }

    public void updateNetworkType() {
        ao9 ao9Var = this.rtmpStreamPlayer;
        if (ao9Var != null) {
            ao9Var.k(org.telegram.messenger.a.o());
        }
        yz0 yz0Var = this.broadcastListenerSession;
        if (yz0Var != null) {
            yz0Var.b.post(new x6c((byte) 6, yz0Var, org.telegram.messenger.a.o()));
        }
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance != null) {
            if (!nativeInstance.isGroup()) {
                this.tgVoip[0].setNetworkType(getNetworkType());
                return;
            }
            return;
        }
        this.lastNetInfo = getActiveNetworkInfo();
    }

    private void updateServerConfig() {
        SharedPreferences sharedPreferences = na7.q1(this.currentAccount).X3;
        Instance.setGlobalServerConfig(sharedPreferences.getString("voip_server_config", "{}"));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_phone.getCallConfig(), new wx9(sharedPreferences, (byte) 23));
    }

    public void updateTrafficStats(NativeInstance nativeInstance, Instance.TrafficStats trafficStats) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        if (nativeInstance != null) {
            if (trafficStats == null) {
                trafficStats = nativeInstance.getTrafficStats();
            }
            if (trafficStats != null) {
                long j5 = trafficStats.bytesSentWifi;
                Instance.TrafficStats trafficStats2 = this.prevTrafficStats;
                if (trafficStats2 != null) {
                    j = trafficStats2.bytesSentWifi;
                } else {
                    j = 0;
                }
                long j6 = j5 - j;
                long j7 = trafficStats.bytesReceivedWifi;
                if (trafficStats2 != null) {
                    j2 = trafficStats2.bytesReceivedWifi;
                } else {
                    j2 = 0;
                }
                long j8 = j7 - j2;
                long j9 = trafficStats.bytesSentMobile;
                if (trafficStats2 != null) {
                    j3 = trafficStats2.bytesSentMobile;
                } else {
                    j3 = 0;
                }
                long j10 = j9 - j3;
                long j11 = trafficStats.bytesReceivedMobile;
                if (trafficStats2 != null) {
                    j4 = trafficStats2.bytesReceivedMobile;
                } else {
                    j4 = 0;
                }
                long j12 = j11 - j4;
                this.prevTrafficStats = trafficStats;
                if (j6 > 0) {
                    yxa.c(this.currentAccount).h(1, 0, j6);
                }
                if (j8 > 0) {
                    yxa.c(this.currentAccount).f(1, 0, j8);
                }
                int i2 = 2;
                if (j10 > 0) {
                    yxa c = yxa.c(this.currentAccount);
                    NetworkInfo networkInfo = this.lastNetInfo;
                    if (networkInfo != null && networkInfo.isRoaming()) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    c.h(i, 0, j10);
                }
                if (j12 > 0) {
                    yxa c2 = yxa.c(this.currentAccount);
                    NetworkInfo networkInfo2 = this.lastNetInfo;
                    if (networkInfo2 == null || !networkInfo2.isRoaming()) {
                        i2 = 0;
                    }
                    c2.f(i2, 0, j12);
                }
            }
        }
    }

    @Override
    public void acceptIncomingCall() {
        updateCurrentForegroundType();
        na7.q1(this.currentAccount).Z3 = false;
        stopRinging();
        showNotification();
        configureDeviceForCall();
        startConnectingSound();
        dispatchStateChanged(12);
        gl.d3(new cza((byte) 15));
        ad7 Y = ad7.Y(this.currentAccount);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        Y.G();
        tL_messages_getDhConfig.version = Y.x;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDhConfig, new fhc(this, Y, (byte) 0));
    }

    public void addExtraLocalSink(VideoSink videoSink) {
        ProxyVideoSink proxyVideoSink = this.localSink[0];
        if (proxyVideoSink != null) {
            proxyVideoSink.addExtra(videoSink);
        }
    }

    public boolean addExtraRemoteSink(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, VideoSink videoSink) {
        String str;
        if (z) {
            str = groupCallParticipant.presentationEndpoint;
        } else {
            str = groupCallParticipant.videoEndpoint;
        }
        if (str == null || (this.tgVoip[0] == null && !isRtmpStreamCall())) {
            return false;
        }
        ProxyVideoSink proxyVideoSink = this.remoteSinks.get(str);
        if (proxyVideoSink == null) {
            proxyVideoSink = addRemoteSink(groupCallParticipant, z, null, null);
        }
        if (proxyVideoSink == null) {
            return false;
        }
        proxyVideoSink.addExtra(videoSink);
        return true;
    }

    public ProxyVideoSink addRemoteSink(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, VideoSink videoSink, VideoSink videoSink2) {
        String str;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        if (this.tgVoip[0] == null && !isRtmpStreamCall()) {
            return null;
        }
        if (z) {
            str = groupCallParticipant.presentationEndpoint;
        } else {
            str = groupCallParticipant.videoEndpoint;
        }
        String str2 = str;
        if (str2 == null) {
            return null;
        }
        ProxyVideoSink proxyVideoSink = this.remoteSinks.get(str2);
        if (proxyVideoSink != null) {
            if (proxyVideoSink.target == videoSink) {
                return proxyVideoSink;
            }
            if (proxyVideoSink.hasExtras()) {
                proxyVideoSink.setTarget(videoSink);
                if (videoSink2 != null) {
                    proxyVideoSink.setBackground(videoSink2);
                }
                return proxyVideoSink;
            }
        } else {
            proxyVideoSink = this.proxyVideoSinkLruCache.remove(str2);
        }
        if (proxyVideoSink == null) {
            proxyVideoSink = new ProxyVideoSink();
        }
        ProxyVideoSink proxyVideoSink2 = proxyVideoSink;
        if (videoSink != null) {
            proxyVideoSink2.setTarget(videoSink);
        }
        if (videoSink2 != null) {
            proxyVideoSink2.setBackground(videoSink2);
        }
        this.remoteSinks.put(str2, proxyVideoSink2);
        if (z) {
            tL_groupCallParticipantVideo = groupCallParticipant.presentation;
        } else {
            tL_groupCallParticipantVideo = groupCallParticipant.video;
        }
        proxyVideoSink2.nativeInstance = addIncomingVideoOutput(str2, tL_groupCallParticipantVideo, proxyVideoSink2, cf3.n(groupCallParticipant.peer));
        return proxyVideoSink2;
    }

    public void callFailedFromConnectionService() {
        if (this.isOutgoing) {
            callFailed("ERROR_CONNECTION_SERVICE");
        } else {
            hangUp();
        }
    }

    public void checkVideoFrame(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        String str;
        if (z) {
            str = groupCallParticipant.presentationEndpoint;
        } else {
            str = groupCallParticipant.videoEndpoint;
        }
        if (str != null) {
            if (z) {
                if (groupCallParticipant.hasPresentationFrame != 0) {
                    return;
                }
            } else if (groupCallParticipant.hasCameraFrame != 0) {
                return;
            }
            if (this.proxyVideoSinkLruCache.get(str) == null && (this.remoteSinks.get(str) == null || this.waitingFrameParticipant.get(str) != null)) {
                if (this.waitingFrameParticipant.containsKey(str)) {
                    this.waitingFrameParticipant.put(str, groupCallParticipant);
                    if (z) {
                        groupCallParticipant.hasPresentationFrame = 1;
                        return;
                    } else {
                        groupCallParticipant.hasCameraFrame = 1;
                        return;
                    }
                }
                if (z) {
                    groupCallParticipant.hasPresentationFrame = 1;
                } else {
                    groupCallParticipant.hasCameraFrame = 1;
                }
                this.waitingFrameParticipant.put(str, groupCallParticipant);
                addRemoteSink(groupCallParticipant, z, new AnonymousClass5(str, z), null);
            } else if (z) {
                groupCallParticipant.hasPresentationFrame = 2;
            } else {
                groupCallParticipant.hasCameraFrame = 2;
            }
        }
    }

    public void clearCamera() {
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance != null) {
            nativeInstance.clearVideoCapturer();
        }
        long j = this.captureDevice[0];
        if (j != 0) {
            NativeInstance.destroyVideoCapturer(j);
            this.captureDevice[0] = 0;
        }
    }

    public void clearRemoteSinks() {
        this.proxyVideoSinkLruCache.evictAll();
    }

    public void convertToConferenceCall(boolean z, HashSet<Long> hashSet) {
        long j;
        TLRPC.User user = this.user;
        if (user != null) {
            j = user.id;
        } else {
            j = 0;
        }
        this.convertingFromCallWithUserId = j;
        this.inviteUsersToConferenceVideo = z;
        this.inviteUsersToConference = hashSet;
        stopRinging();
        detachSignalingTarget();
        NativeInstance[] nativeInstanceArr = this.tgVoip;
        NativeInstance nativeInstance = nativeInstanceArr[0];
        if (nativeInstance != null) {
            this.prevTrafficStats = null;
            this.convertingVoip = nativeInstance;
            nativeInstanceArr[0] = null;
        }
        gl.d3(new bhc(this, (byte) 14));
    }

    public void createCaptureDevice(boolean z) {
        ?? r2;
        bgc bgcVar;
        if (z) {
            this.gotMediaProjection = true;
            updateCurrentForegroundType();
            r2 = 2;
        } else {
            r2 = this.isFrontFaceCamera;
        }
        if (this.groupCall == null) {
            if (!this.isPrivateScreencast && z) {
                setVideoState(false, 0);
            }
            this.isPrivateScreencast = z;
            NativeInstance nativeInstance = this.tgVoip[0];
            if (nativeInstance != null) {
                nativeInstance.clearVideoCapturer();
            }
            long j = this.captureDevice[0];
            if (j != 0) {
                NativeInstance.destroyVideoCapturer(j);
                this.captureDevice[0] = 0;
            }
        }
        if (z) {
            if (this.groupCall != null) {
                long[] jArr = this.captureDevice;
                if (jArr[z ? 1 : 0] == 0) {
                    jArr[z ? 1 : 0] = NativeInstance.createVideoCapturer(this.localSink[z ? 1 : 0], r2);
                    createGroupInstance(1, false, true);
                    setVideoState(true, 2);
                    kk7.f(j5.a(this.currentAccount).a).k(kk7.y2, new Object[0]);
                    return;
                }
                return;
            }
            requestVideoCall(true);
            setVideoState(true, 2);
            hgc hgcVar = hgc.m1;
            if (hgcVar != null && (bgcVar = hgcVar.o0) != null) {
                bgcVar.a(true, true);
                return;
            }
            return;
        }
        long[] jArr2 = this.captureDevice;
        long j2 = jArr2[z ? 1 : 0];
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i != 0 || this.tgVoip[z ? 1 : 0] == null) {
            NativeInstance nativeInstance2 = this.tgVoip[z ? 1 : 0];
            if (nativeInstance2 != null && i != 0) {
                nativeInstance2.activateVideoCapturer(j2);
            }
            jArr2 = this.captureDevice;
            if (jArr2[z ? 1 : 0] != 0) {
                return;
            }
        }
        jArr2[z ? 1 : 0] = NativeInstance.createVideoCapturer(this.localSink[z ? 1 : 0], r2);
    }

    public void declineIncomingCall(int i, Runnable runnable) {
        long j;
        if (this.groupCall != null) {
            stopScreenCapture();
        }
        stopRinging();
        this.callDiscardReason = i;
        int i2 = this.currentState;
        if (i2 == 14) {
            Runnable runnable2 = this.delayedStartOutgoingCall;
            if (runnable2 != null) {
                gl.r(runnable2);
                callEnded();
                return;
            }
            dispatchStateChanged(10);
            this.endCallAfterRequest = true;
            gl.e3(new bhc(this, (byte) 23), 5000L);
        } else if (i2 != 10 && i2 != 11) {
            dispatchStateChanged(10);
            if (this.privateCall == null) {
                this.onDestroyRunnable = runnable;
                callEnded();
                if (this.callReqId != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.callReqId, false);
                    this.callReqId = 0;
                    return;
                }
                return;
            }
            TL_phone.discardCall discardcall = new TL_phone.discardCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            discardcall.peer = tL_inputPhoneCall;
            TL_phone.PhoneCall phoneCall = this.privateCall;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            tL_inputPhoneCall.id = phoneCall.id;
            discardcall.duration = (int) (getCallDuration() / 1000);
            NativeInstance nativeInstance = this.tgVoip[0];
            if (nativeInstance != null) {
                j = nativeInstance.getPreferredRelayId();
            } else {
                j = 0;
            }
            discardcall.connection_id = j;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonHangup();
                        } else {
                            TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall tL_phoneCallDiscardReasonMigrateConferenceCall = new TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall();
                            discardcall.reason = tL_phoneCallDiscardReasonMigrateConferenceCall;
                            tL_phoneCallDiscardReasonMigrateConferenceCall.slug = "";
                        }
                    } else {
                        discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonBusy();
                    }
                } else {
                    discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonMissed();
                }
            } else {
                discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonDisconnect();
            }
            fa4.d("discardCall " + discardcall.reason);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new ihc(this, (byte) 2), 65536);
            this.onDestroyRunnable = runnable;
            callEnded();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.H2) {
            callEnded();
        }
    }

    public void editCallMember(TLObject tLObject, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Runnable runnable) {
        TLRPC.InputPeer inputPeer;
        if (tLObject != null && this.groupCall != null) {
            TL_phone.editGroupCallParticipant editgroupcallparticipant = new TL_phone.editGroupCallParticipant();
            fc2 fc2Var = this.groupCall;
            editgroupcallparticipant.call = fc2Var.h(fc2Var.a);
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (l7c.C(user) && (inputPeer = this.groupCallPeer) != null) {
                    editgroupcallparticipant.participant = inputPeer;
                } else {
                    editgroupcallparticipant.participant = na7.l1(user);
                    if (w01.a) {
                        StringBuilder sb = new StringBuilder("edit group call part id = ");
                        sb.append(editgroupcallparticipant.participant.user_id);
                        sb.append(" access_hash = ");
                        ug8.q(editgroupcallparticipant.participant.user_id, sb);
                    }
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                editgroupcallparticipant.participant = na7.j1((TLRPC.Chat) tLObject);
                if (w01.a) {
                    StringBuilder sb2 = new StringBuilder("edit group call part id = ");
                    TLRPC.InputPeer inputPeer2 = editgroupcallparticipant.participant;
                    long j = inputPeer2.chat_id;
                    if (j == 0) {
                        j = inputPeer2.channel_id;
                    }
                    sb2.append(j);
                    sb2.append(" access_hash = ");
                    ug8.q(editgroupcallparticipant.participant.access_hash, sb2);
                }
            }
            if (bool != null) {
                editgroupcallparticipant.muted = bool.booleanValue();
                editgroupcallparticipant.flags |= 1;
            }
            if (num != null) {
                editgroupcallparticipant.volume = num.intValue();
                editgroupcallparticipant.flags |= 2;
            }
            if (bool3 != null) {
                editgroupcallparticipant.raise_hand = bool3.booleanValue();
                editgroupcallparticipant.flags |= 4;
            }
            if (bool2 != null) {
                editgroupcallparticipant.video_stopped = bool2.booleanValue();
                editgroupcallparticipant.flags |= 8;
            }
            if (w01.a) {
                b00.p(editgroupcallparticipant.flags, new StringBuilder("edit group call flags = "));
            }
            int i = this.currentAccount;
            ConnectionsManager.getInstance(j5.a(i).a).sendRequest(editgroupcallparticipant, new b97(this, i, runnable, (byte) 12));
        }
    }

    public void forceRating() {
        this.forceRating = true;
    }

    public int getAccount() {
        return this.currentAccount;
    }

    @Override
    public long getCallDuration() {
        if (this.callStartTime == 0) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.callStartTime;
    }

    public long getCallID() {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        if (phoneCall != null) {
            return phoneCall.id;
        }
        return 0L;
    }

    @Override
    public int getCallState() {
        return this.currentState;
    }

    public long getCallerId() {
        TLRPC.User user = this.user;
        if (user != null) {
            return user.id;
        }
        TLRPC.Chat chat = this.chat;
        if (chat != null) {
            return -chat.id;
        }
        return 0L;
    }

    public TLRPC.Chat getChat() {
        return this.chat;
    }

    public CallConnection getConnectionAndStartCall() {
        if (this.systemCallConnection == null) {
            if (w01.a) {
                fa4.b("creating call connection");
            }
            CallConnection callConnection = new CallConnection();
            this.systemCallConnection = callConnection;
            callConnection.setInitializing();
            if (this.isOutgoing) {
                bhc bhcVar = new bhc(this, (byte) 2);
                this.delayedStartOutgoingCall = bhcVar;
                gl.e3(bhcVar, 2000L);
            }
            CallConnection callConnection2 = this.systemCallConnection;
            callConnection2.setAddress(Uri.fromParts("tel", "+99084" + this.user.id, null), 1);
            CallConnection callConnection3 = this.systemCallConnection;
            TLRPC.User user = this.user;
            callConnection3.setCallerDisplayName(qu2.m(0, user.first_name, user.last_name), 1);
        }
        return this.systemCallConnection;
    }

    public int getCurrentAudioRoute() {
        if (USE_CONNECTION_SERVICE) {
            CallConnection callConnection = this.systemCallConnection;
            if (callConnection != null && callConnection.getCallAudioState() != null) {
                int route = this.systemCallConnection.getCallAudioState().getRoute();
                if (route != 1) {
                    if (route == 2) {
                        return 2;
                    }
                    if (route != 4) {
                        if (route == 8) {
                            return 1;
                        }
                    }
                }
                return 0;
            }
            return this.audioRouteToSet;
        } else if (this.audioConfigured) {
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            if (voipAudioManager.isBluetoothOn()) {
                return 2;
            }
            if (!voipAudioManager.isSpeakerphoneOn()) {
                return 0;
            }
            return 1;
        } else {
            return this.audioRouteToSet;
        }
    }

    public String getDebugString() {
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance != null) {
            return nativeInstance.getDebugInfo();
        }
        return "";
    }

    public byte[] getEncryptionKey() {
        return this.authKey;
    }

    public byte[] getGA() {
        return this.g_a;
    }

    @Override
    public TLRPC.GroupCall getGroupCall() {
        fc2 fc2Var = this.groupCall;
        if (fc2Var != null) {
            return fc2Var.b;
        }
        return null;
    }

    public CountDownLatch getGroupCallBottomSheetLatch() {
        return this.groupCallBottomSheetLatch;
    }

    public long getGroupCallID() {
        TLRPC.GroupCall groupCall;
        fc2 fc2Var = this.groupCall;
        if (fc2Var != null && (groupCall = fc2Var.b) != null) {
            return groupCall.id;
        }
        return 0L;
    }

    public TLRPC.InputPeer getGroupCallPeer() {
        return this.groupCallPeer;
    }

    @Override
    public ArrayList<TLRPC.GroupCallParticipant> getGroupParticipants() {
        fc2 fc2Var = this.groupCall;
        if (fc2Var != null) {
            return fc2Var.e;
        }
        return null;
    }

    public String getLastError() {
        return this.lastError;
    }

    @Override
    public TL_phone.PhoneCall getPrivateCall() {
        return this.privateCall;
    }

    public int getRemoteAudioState() {
        return this.remoteAudioState;
    }

    public int getRemoteVideoState() {
        return this.remoteVideoState;
    }

    public long getSelfId() {
        TLRPC.InputPeer inputPeer = this.groupCallPeer;
        if (inputPeer == null) {
            return y6c.h(this.currentAccount).n;
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
            return inputPeer.user_id;
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            return -inputPeer.channel_id;
        }
        return -inputPeer.chat_id;
    }

    public String getTitle() {
        TLRPC.User user = this.user;
        if (user != null) {
            return qu2.m(0, user.first_name, user.last_name);
        }
        TLRPC.Chat chat = this.chat;
        if (chat != null) {
            return chat.title;
        }
        return "";
    }

    @Override
    public TLRPC.User getUser() {
        return this.user;
    }

    public int getVideoState(boolean z) {
        return this.videoState[z ? 1 : 0];
    }

    public void handleNotificationAction(Intent intent) {
        if ((getPackageName() + ".END_CALL").equals(intent.getAction())) {
            stopForeground(true);
            hangUp();
            return;
        }
        if ((getPackageName() + ".DECLINE_CALL").equals(intent.getAction())) {
            stopForeground(true);
            declineIncomingCall(4, null);
            return;
        }
        if ((getPackageName() + ".ANSWER_CALL").equals(intent.getAction())) {
            acceptIncomingCallFromNotification();
        }
    }

    public void hangUp(int i, Runnable runnable) {
        int i2;
        TLRPC.ChatFull L0;
        int i3 = this.currentState;
        if (i3 != 16 && (i3 != 13 || !this.isOutgoing)) {
            i2 = 1;
        } else {
            i2 = 3;
        }
        declineIncomingCall(i2, runnable);
        if (this.groupCall != null && i != 2) {
            if (i == 1) {
                if (this.chat != null && (L0 = na7.q1(this.currentAccount).L0(this.chat.id)) != null) {
                    L0.flags &= -2097153;
                    L0.call = null;
                    kk7.f(this.currentAccount).k(kk7.v2, Long.valueOf(this.chat.id), Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
                }
                TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                fc2 fc2Var = this.groupCall;
                discardgroupcall.call = fc2Var.h(fc2Var.a);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardgroupcall, new ihc(this, (byte) 6));
                return;
            }
            TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
            fc2 fc2Var2 = this.groupCall;
            leavegroupcall.call = fc2Var2.h(fc2Var2.a);
            leavegroupcall.source = this.mySource[0];
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcall, new ihc(this, (byte) 7));
        }
    }

    public boolean hasEarpiece() {
        Boolean bool;
        CallConnection callConnection;
        if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null && callConnection.getCallAudioState() != null) {
            if ((this.systemCallConnection.getCallAudioState().getSupportedRouteMask() & 5) == 0) {
                return false;
            }
        } else if (((TelephonyManager) getSystemService("phone")).getPhoneType() == 0) {
            Boolean bool2 = this.mHasEarpiece;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            try {
                Method method = AudioManager.class.getMethod("getDevicesForStream", Integer.TYPE);
                int i = AudioManager.class.getField("DEVICE_OUT_EARPIECE").getInt(null);
                if ((((Integer) method.invoke((AudioManager) getSystemService("audio"), 0)).intValue() & i) == i) {
                    bool = Boolean.TRUE;
                    this.mHasEarpiece = bool;
                } else {
                    bool = Boolean.FALSE;
                    this.mHasEarpiece = bool;
                }
            } catch (Throwable th) {
                if (w01.a) {
                    fa4.e("Error while checking earpiece! ", th);
                }
                bool = Boolean.TRUE;
                this.mHasEarpiece = bool;
            }
            return bool.booleanValue();
        }
        return true;
    }

    public boolean hasRate() {
        if (!this.needRateCall && !this.forceRating) {
            return false;
        }
        return true;
    }

    public boolean hasVideoCapturer() {
        if (this.captureDevice[0] == 0) {
            return false;
        }
        return true;
    }

    public boolean isBluetoothHeadsetConnected() {
        CallConnection callConnection;
        if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null && callConnection.getCallAudioState() != null) {
            if ((this.systemCallConnection.getCallAudioState().getSupportedRouteMask() & 2) != 0) {
                return true;
            }
            return false;
        }
        return this.isBtHeadsetConnected;
    }

    public boolean isBluetoothOn() {
        return VoipAudioManager.get().isBluetoothOn();
    }

    public boolean isBluetoothWillOn() {
        return this.needSwitchToBluetoothAfterScoActivates;
    }

    @Override
    public boolean isCallingVideo() {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        if (phoneCall != null) {
            return phoneCall.video;
        }
        return false;
    }

    @Override
    public boolean isConference() {
        if (this.joinConference == null && this.conference == null) {
            return false;
        }
        return true;
    }

    public boolean isConverting() {
        if (this.convertingVoip != null) {
            return true;
        }
        return false;
    }

    public boolean isFrontFaceCamera() {
        return this.isFrontFaceCamera;
    }

    public boolean isFullscreen(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        String str;
        if (this.currentBackgroundSink[z ? 1 : 0] != null) {
            String str2 = this.currentBackgroundEndpointId[z ? 1 : 0];
            if (z) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            if (TextUtils.equals(str2, str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isHangingUp() {
        if (this.currentState == 10) {
            return true;
        }
        return false;
    }

    public boolean isHeadsetPlugged() {
        return this.isHeadsetPlugged;
    }

    public boolean isJoined() {
        int i = this.currentState;
        if (i != 1 && i != 6) {
            return true;
        }
        return false;
    }

    public boolean isMicMute() {
        return this.micMute;
    }

    @Override
    public boolean isOutgoing() {
        return this.isOutgoing;
    }

    public boolean isScreencast() {
        return this.isPrivateScreencast;
    }

    public boolean isSpeakerphoneOn() {
        CallConnection callConnection;
        boolean z = USE_CONNECTION_SERVICE;
        if (z && (callConnection = this.systemCallConnection) != null && callConnection.getCallAudioState() != null) {
            int route = this.systemCallConnection.getCallAudioState().getRoute();
            if (hasEarpiece()) {
                if (route != 8) {
                    return false;
                }
                return true;
            } else if (route != 2) {
                return false;
            } else {
                return true;
            }
        } else if (this.audioConfigured && !z) {
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            if (hasEarpiece()) {
                return voipAudioManager.isSpeakerphoneOn();
            }
            return voipAudioManager.isBluetoothOn();
        } else {
            return this.speakerphoneStateToSet;
        }
    }

    public boolean isSwitchingCamera() {
        return this.switchingCamera;
    }

    public boolean isSwitchingStream() {
        return this.switchingStream;
    }

    public boolean isVideoAvailable() {
        return this.isVideoAvailable;
    }

    public void migrateToChat(TLRPC.Chat chat) {
        this.chat = chat;
    }

    public boolean mutedByAdmin() {
        fc2 fc2Var = this.groupCall;
        if (fc2Var != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(getSelfId());
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !hc2.w(14, this.chat)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void onAudioFocusChange(int i) {
        if (i == 1) {
            this.hasAudioFocus = true;
        } else {
            this.hasAudioFocus = false;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCallUpdated(org.telegram.tgnet.tl.TL_phone.PhoneCall r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPService.onCallUpdated(org.telegram.tgnet.tl.TL_phone$PhoneCall):void");
    }

    public void onCameraFirstFrameAvailable() {
        for (int i = 0; i < this.stateListeners.size(); i++) {
            this.stateListeners.get(i).onCameraFirstFrameAvailable();
        }
    }

    public void onConnectionStateChanged(int i, boolean z) {
        gl.d3(new chc(this, i, (byte) 2));
    }

    @Override
    public void onCreate() {
        int i;
        BluetoothAdapter bluetoothAdapter;
        super.onCreate();
        if (w01.a) {
            fa4.b("=============== VoIPService STARTING ===============");
        }
        try {
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            if (audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER") != null) {
                Instance.setBufferSize(Integer.parseInt(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER")));
            } else {
                Instance.setBufferSize(AudioTrack.getMinBufferSize(48000, 4, 2) / 2);
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "telegram-voip");
            this.cpuWakelock = newWakeLock;
            newWakeLock.acquire();
            if (audioManager.isBluetoothScoAvailableOffCall()) {
                bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
            } else {
                bluetoothAdapter = null;
            }
            this.btAdapter = bluetoothAdapter;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (!USE_CONNECTION_SERVICE) {
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                if (this.btAdapter != null) {
                    intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                    intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                }
                intentFilter.addAction("android.intent.action.PHONE_STATE");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.media.RINGER_MODE_CHANGED");
            }
            registerReceiver(this.receiver, intentFilter);
            fetchBluetoothDeviceName();
            if (this.audioDeviceCallback == null) {
                this.audioDeviceCallback = new AudioDeviceCallback() {
                    {
                        VoIPService.this = this;
                    }

                    @Override
                    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                        VoIPService.this.checkUpdateBluetoothHeadset();
                    }

                    @Override
                    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                        VoIPService.this.checkUpdateBluetoothHeadset();
                    }
                };
            }
            AudioDeviceCallback audioDeviceCallback = this.audioDeviceCallback;
            if (audioDeviceCallback != null) {
                audioManager.registerAudioDeviceCallback(audioDeviceCallback, new Handler(Looper.getMainLooper()));
            }
            if (Build.VERSION.SDK_INT >= 31 && this.communicationDeviceListener == null) {
                AudioManager.OnCommunicationDeviceChangedListener onCommunicationDeviceChangedListener = new AudioManager.OnCommunicationDeviceChangedListener() {
                    @Override
                    public final void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
                        VoIPService.this.lambda$onCreate$104(audioDeviceInfo);
                    }
                };
                this.communicationDeviceListener = onCommunicationDeviceChangedListener;
                audioManager.addOnCommunicationDeviceChangedListener(new hc((byte) 0), onCommunicationDeviceChangedListener);
            }
            audioManager.registerMediaButtonEventReceiver(new ComponentName(this, VoIPMediaButtonReceiver.class));
            checkUpdateBluetoothHeadset();
        } catch (Exception e) {
            if (w01.a) {
                fa4.e("error initializing voip controller", e);
            }
            callFailed();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            if (callIShouldHavePutIntoIntent != null) {
                im7.c();
                ir2.q();
                Notification.Builder showWhen = new Notification.Builder(this, im7.k0).setContentTitle(k96.M0(2131743023, null)).setShowWhen(false);
                if (this.groupCall != null) {
                    if (isMicMute()) {
                        i = 2131232809;
                    } else {
                        i = 2131232808;
                    }
                    showWhen.setSmallIcon(i);
                } else {
                    showWhen.setSmallIcon(2131230911);
                }
                this.foregroundStarted = true;
                if (i2 >= 33) {
                    this.foregroundId = 201;
                    Notification build = showWhen.build();
                    this.foregroundNotification = build;
                    int currentForegroundType = getCurrentForegroundType();
                    this.lastForegroundType = currentForegroundType;
                    startForeground(201, build, currentForegroundType);
                    return;
                }
                this.foregroundId = 201;
                Notification build2 = showWhen.build();
                this.foregroundNotification = build2;
                startForeground(201, build2);
                return;
            }
            im7.c();
            ir2.q();
            Notification.Builder showWhen2 = new Notification.Builder(this, im7.k0).setContentTitle(k96.M0(2131743248, null)).setShowWhen(false);
            showWhen2.setSmallIcon(2131230911);
            this.foregroundStarted = true;
            if (i2 >= 33) {
                this.foregroundId = 201;
                Notification build3 = showWhen2.build();
                this.foregroundNotification = build3;
                int currentForegroundType2 = getCurrentForegroundType();
                this.lastForegroundType = currentForegroundType2;
                startForeground(201, build3, currentForegroundType2);
                return;
            }
            this.foregroundId = 201;
            Notification build4 = showWhen2.build();
            this.foregroundNotification = build4;
            startForeground(201, build4);
        }
    }

    @Override
    public void onDestroy() {
        if (w01.a) {
            fa4.b("=============== VoIPService STOPPING ===============");
        }
        stopForeground(true);
        stopRinging();
        if (this.currentAccount >= 0) {
            if (org.telegram.messenger.a.x || !org.telegram.messenger.a.w) {
                na7.q1(this.currentAccount).Z3 = false;
            }
            kk7.f(this.currentAccount).n(this, kk7.H2);
        }
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        if (sensorManager.getDefaultSensor(8) != null) {
            sensorManager.unregisterListener(this);
        }
        PowerManager.WakeLock wakeLock = this.proximityWakelock;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.proximityWakelock.release();
        }
        if (this.updateNotificationRunnable != null) {
            Utilities.e.a(this.updateNotificationRunnable);
            this.updateNotificationRunnable = null;
        }
        Runnable runnable = this.switchingStreamTimeoutRunnable;
        if (runnable != null) {
            gl.r(runnable);
            this.switchingStreamTimeoutRunnable = null;
        }
        unregisterReceiver(this.receiver);
        Runnable runnable2 = this.timeoutRunnable;
        if (runnable2 != null) {
            gl.r(runnable2);
            this.timeoutRunnable = null;
        }
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null) {
            conferenceCall.destroy();
        }
        super.onDestroy();
        sharedInstance = null;
        fa4.d("(5) set sharedInstance = null");
        Arrays.fill(this.mySource, 0);
        cancelGroupCheckShortPoll();
        gl.d3(new cza((byte) 14));
        detachSignalingTarget();
        if (this.tgVoip[0] != null) {
            yxa c = yxa.c(this.currentAccount);
            int statsNetworkType = getStatsNetworkType();
            int[] iArr = c.n;
            iArr[statsNetworkType] = iArr[statsNetworkType] + (((int) (getCallDuration() / 1000)) % 5);
            c.m();
            onTgVoipPreStop();
            if (this.tgVoip[0].isGroup()) {
                NativeInstance nativeInstance = this.tgVoip[0];
                stopBroadcastListenerSession();
                co3 co3Var = Utilities.e;
                Objects.requireNonNull(nativeInstance);
                co3Var.c(new jm9(nativeInstance, (byte) 1));
                releaseRtmpStreamPlayer();
            } else {
                NativeInstance.setOwnAudioLevelMeter(false);
                Instance.FinalState stop = this.tgVoip[0].stop();
                updateTrafficStats(this.tgVoip[0], stop.trafficStats);
                onTgVoipStop(stop);
            }
            this.prevTrafficStats = null;
            this.callStartTime = 0L;
            this.tgVoip[0] = null;
            Instance.destroyInstance();
        } else {
            releaseRtmpStreamPlayer();
        }
        destroyConverting();
        NativeInstance nativeInstance2 = this.tgVoip[1];
        if (nativeInstance2 != null) {
            Utilities.e.c(new jm9(nativeInstance2, (byte) 1));
            this.tgVoip[1] = null;
        }
        int i = 0;
        while (true) {
            long[] jArr = this.captureDevice;
            if (i >= jArr.length) {
                break;
            }
            long j = jArr[i];
            if (j != 0) {
                if (this.destroyCaptureDevice[i]) {
                    NativeInstance.destroyVideoCapturer(j);
                }
                this.captureDevice[i] = 0;
            }
            i++;
        }
        this.cpuWakelock.release();
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (!this.playingSound) {
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            if (!USE_CONNECTION_SERVICE) {
                if (this.isBtHeadsetConnected || this.bluetoothScoActive || this.bluetoothScoConnecting) {
                    voipAudioManager.stopBluetooth();
                    voipAudioManager.setBluetoothOn(false);
                    voipAudioManager.setSpeakerphoneOn(false);
                    this.bluetoothScoActive = false;
                    this.bluetoothScoConnecting = false;
                }
                if (this.onDestroyRunnable == null) {
                    co3 co3Var2 = Utilities.e;
                    rhc rhcVar = new rhc(audioManager, (byte) 0);
                    setModeRunnable = rhcVar;
                    co3Var2.c(rhcVar);
                }
                audioManager.abandonAudioFocus(this);
            }
            try {
                audioManager.unregisterMediaButtonEventReceiver(new ComponentName(this, VoIPMediaButtonReceiver.class));
            } catch (Exception e) {
                fa4.g(e, true);
            }
            AudioDeviceCallback audioDeviceCallback = this.audioDeviceCallback;
            if (audioDeviceCallback != null) {
                audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
            }
            AudioManager.OnCommunicationDeviceChangedListener onCommunicationDeviceChangedListener = this.communicationDeviceListener;
            if (onCommunicationDeviceChangedListener != null) {
                audioManager.removeOnCommunicationDeviceChangedListener(onCommunicationDeviceChangedListener);
                this.communicationDeviceListener = null;
            }
            Utilities.e.c(new bhc(this, (byte) 26));
        }
        if (this.hasAudioFocus) {
            audioManager.abandonAudioFocus(this);
        }
        if (USE_CONNECTION_SERVICE) {
            if (!this.didDeleteConnectionServiceContact) {
                qu2.r(this.currentAccount).h();
            }
            CallConnection callConnection = this.systemCallConnection;
            if (callConnection != null && !this.playingSound) {
                callConnection.destroy();
            }
        }
        rgc.a = SystemClock.elapsedRealtime();
        setSinks(null, null);
        Runnable runnable3 = this.onDestroyRunnable;
        if (runnable3 != null) {
            runnable3.run();
        }
        int i2 = this.currentAccount;
        if (i2 >= 0) {
            ConnectionsManager.getInstance(i2).setAppPaused(true, false);
            if (hc2.T(this.chat)) {
                na7.q1(this.currentAccount).a5(this.chat, this.classGuid, true, null);
            }
        }
    }

    public void onGroupCallParticipantsUpdate(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants) {
        fc2 fc2Var = this.groupCall;
        if (fc2Var != null && fc2Var.b.id == tL_updateGroupCallParticipants.call.id) {
            fc2Var.l.clear();
            this.groupCall.m.clear();
            if (this.conference != null) {
                this.groupCall.q(tL_updateGroupCallParticipants, false);
                this.conference.updateParticipants(this.groupCall.e, true);
                for (int i = 0; i < this.stateListeners.size(); i++) {
                    this.stateListeners.get(i).onStateChanged(getCallState());
                }
                fc2 fc2Var2 = this.groupCall;
                fc2Var2.l.addAll(this.conference.getShadyLeftParticipants(fc2Var2.e));
                fc2 fc2Var3 = this.groupCall;
                fc2Var3.m.addAll(this.conference.getShadyJoiningParticipants(fc2Var3.e));
                kk7.f(this.currentAccount).k(kk7.v2, 0L, Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
            }
            long selfId = getSelfId();
            int size = tL_updateGroupCallParticipants.participants.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i2);
                if (groupCallParticipant.left) {
                    int i3 = groupCallParticipant.source;
                    if (i3 != 0 && i3 == this.mySource[0]) {
                        int i4 = 0;
                        for (int i5 = 0; i5 < size; i5++) {
                            TLRPC.GroupCallParticipant groupCallParticipant2 = tL_updateGroupCallParticipants.participants.get(i5);
                            if (groupCallParticipant2.self || groupCallParticipant2.source == this.mySource[0]) {
                                i4++;
                            }
                        }
                        if (i4 > 1) {
                            hangUp(2);
                            return;
                        }
                    }
                } else if (k27.B1(groupCallParticipant.peer) != selfId) {
                    continue;
                } else {
                    int i6 = groupCallParticipant.source;
                    int i7 = this.mySource[0];
                    if (i6 != i7 && i7 != 0 && i6 != 0) {
                        if (w01.a) {
                            StringBuilder sb = new StringBuilder("source mismatch my = ");
                            sb.append(this.mySource[0]);
                            sb.append(" psrc = ");
                            b00.p(groupCallParticipant.source, sb);
                        }
                        hangUp(2);
                        return;
                    }
                    if (hc2.T(this.chat) && this.currentGroupModeStreaming && groupCallParticipant.can_self_unmute) {
                        this.switchingStream = true;
                        createGroupInstance(0, false, true);
                    }
                    if (groupCallParticipant.muted) {
                        setMicMute(true, false, false);
                    }
                }
            }
        }
    }

    public void onGroupCallUpdated(org.telegram.tgnet.TLRPC.GroupCall r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPService.onGroupCallUpdated(org.telegram.tgnet.TLRPC$GroupCall):void");
    }

    public void onMediaButtonEvent(KeyEvent keyEvent) {
        if (keyEvent != null) {
            if ((keyEvent.getKeyCode() == 79 || keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 85) && keyEvent.getAction() == 1) {
                if (this.currentState == 15) {
                    acceptIncomingCall();
                } else {
                    setMicMute(!isMicMute(), false, true);
                }
            }
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z;
        this.lastSensorEvent = sensorEvent;
        if (!this.unmutedByHold && this.remoteVideoState != 2 && this.videoState[0] != 2 && sensorEvent.sensor.getType() == 8) {
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            if (this.audioRouteToSet == 0 && !this.isHeadsetPlugged && !voipAudioManager.isSpeakerphoneOn()) {
                if (!isBluetoothHeadsetConnected() || !voipAudioManager.isBluetoothOn()) {
                    if (sensorEvent.values[0] < Math.min(sensorEvent.sensor.getMaximumRange(), 3.0f)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    checkIsNear(z);
                    kk7.e().k(kk7.I5, Boolean.valueOf(z));
                }
            }
        }
    }

    public void onSignalBarCountChanged(int i) {
        gl.d3(new chc(this, i, (byte) 1));
    }

    public void onSignalingData(TL_update.TL_updatePhoneCallSignalingData tL_updatePhoneCallSignalingData) {
        synchronized (this.signalingLock) {
            NativeInstance nativeInstance = this.signalingTarget;
            if (nativeInstance != null) {
                if (this.signalingTargetCallId == tL_updatePhoneCallSignalingData.phone_call_id) {
                    nativeInstance.onSignalingDataReceive(tL_updatePhoneCallSignalingData.data);
                }
                return;
            }
            if (this.pendingSignalingData.size() < 256) {
                this.pendingSignalingData.add(tL_updatePhoneCallSignalingData);
            }
        }
    }

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        String str;
        if (sharedInstance != null) {
            if (w01.a) {
                fa4.d("Tried to start the VoIP service when it's already started");
            }
            return 2;
        }
        int intExtra = intent.getIntExtra("account", -1);
        this.currentAccount = intExtra;
        if (intExtra != -1) {
            this.classGuid = ConnectionsManager.generateClassGuid();
            long longExtra = intent.getLongExtra("user_id", 0L);
            long longExtra2 = intent.getLongExtra("chat_id", 0L);
            this.createGroupCall = intent.getBooleanExtra("createGroupCall", false);
            byte[] byteArrayExtra = intent.getByteArrayExtra("joinConference");
            if (byteArrayExtra != null) {
                SerializedData serializedData = new SerializedData(byteArrayExtra);
                this.joinConference = TLRPC.InputGroupCall.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (intent.hasExtra("mute_on_start")) {
                this.muteOnStart = Boolean.valueOf(intent.getBooleanExtra("mute_on_start", false));
            }
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("joinConferenceCall");
            if (byteArrayExtra2 != null) {
                SerializedData serializedData2 = new SerializedData(byteArrayExtra2);
                this.joinConferenceCall = TLRPC.GroupCall.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
            }
            this.inviteUsers = intent.getLongArrayExtra("inviteUsers");
            this.hasFewPeers = intent.getBooleanExtra("hasFewPeers", false);
            this.isRtmpStream = intent.getBooleanExtra("isRtmpStream", false);
            this.joinHash = intent.getStringExtra("hash");
            long longExtra3 = intent.getLongExtra("peerChannelId", 0L);
            long longExtra4 = intent.getLongExtra("peerChatId", 0L);
            long longExtra5 = intent.getLongExtra("peerUserId", 0L);
            if (longExtra4 != 0) {
                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                this.groupCallPeer = tL_inputPeerChat;
                tL_inputPeerChat.chat_id = longExtra4;
                tL_inputPeerChat.access_hash = intent.getLongExtra("peerAccessHash", 0L);
            } else if (longExtra3 != 0) {
                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                this.groupCallPeer = tL_inputPeerChannel;
                tL_inputPeerChannel.channel_id = longExtra3;
                tL_inputPeerChannel.access_hash = intent.getLongExtra("peerAccessHash", 0L);
            } else if (longExtra5 != 0) {
                TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                this.groupCallPeer = tL_inputPeerUser;
                tL_inputPeerUser.user_id = longExtra5;
                tL_inputPeerUser.access_hash = intent.getLongExtra("peerAccessHash", 0L);
            }
            this.scheduleDate = intent.getIntExtra("scheduleDate", 0);
            this.isOutgoing = intent.getBooleanExtra("is_outgoing", false);
            this.videoCall = intent.getBooleanExtra("video_call", false);
            this.isVideoAvailable = intent.getBooleanExtra("can_video_call", false);
            this.notificationsDisabled = intent.getBooleanExtra("notifications_disabled", false);
            this.instantAccept = intent.getBooleanExtra("accept", false);
            boolean booleanExtra = intent.getBooleanExtra("openFragment", false);
            if (longExtra != 0) {
                this.user = na7.q1(this.currentAccount).V1(Long.valueOf(longExtra));
            }
            int i3 = (longExtra2 > 0L ? 1 : (longExtra2 == 0L ? 0 : -1));
            if (i3 != 0) {
                TLRPC.Chat K0 = na7.q1(this.currentAccount).K0(Long.valueOf(longExtra2));
                this.chat = K0;
                if (hc2.T(K0)) {
                    na7.q1(this.currentAccount).a5(this.chat, this.classGuid, false, null);
                }
            }
            loadResources();
            int i4 = 0;
            while (true) {
                ProxyVideoSink[] proxyVideoSinkArr = this.localSink;
                if (i4 < proxyVideoSinkArr.length) {
                    proxyVideoSinkArr[i4] = new ProxyVideoSink();
                    this.remoteSink[i4] = new ProxyVideoSink();
                    i4++;
                } else {
                    try {
                        break;
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
            }
            this.isHeadsetPlugged = ((AudioManager) getSystemService("audio")).isWiredHeadsetOn();
            if (this.chat != null && !this.createGroupCall && na7.q1(this.currentAccount).e1(this.chat.id, false, null) == null) {
                fa4.l("VoIPService: trying to open group call without call " + this.chat.id);
                stopSelf();
                return 2;
            }
            if (this.videoCall) {
                if (checkSelfPermission("android.permission.CAMERA") == 0) {
                    this.captureDevice[0] = NativeInstance.createVideoCapturer(this.localSink[0], this.isFrontFaceCamera ? 1 : 0);
                    int[] iArr = this.videoState;
                    if (i3 != 0) {
                        iArr[0] = 1;
                    } else {
                        iArr[0] = 2;
                    }
                } else {
                    this.videoState[0] = 1;
                }
                if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                    setAudioOutput(0);
                }
            }
            if (this.user == null && this.chat == null && this.joinConference == null) {
                if (w01.a) {
                    fa4.l("VoIPService: user == null AND chat == null");
                }
                stopSelf();
                return 2;
            }
            sharedInstance = this;
            fa4.d("(4) set sharedInstance = this");
            synchronized (sync) {
                if (setModeRunnable != null) {
                    Utilities.e.a(setModeRunnable);
                    setModeRunnable = null;
                }
            }
            VoIPGroupNotification.hide(this);
            if (this.joinConference != null) {
                if (!na7.c1().getBoolean("callmiconstart", true)) {
                    this.micMute = true;
                } else if (!rqe.d("android.permission.RECORD_AUDIO")) {
                    this.micMute = true;
                    rqe.e(new String[]{"android.permission.RECORD_AUDIO"}, new w52(new ae9(this, (byte) 25), (byte) 3));
                }
                startConferenceGroupCall(false, 0, null, false);
                if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                    setAudioOutput(0);
                }
            } else if (this.isOutgoing) {
                if (this.user != null) {
                    dispatchStateChanged(14);
                    if (USE_CONNECTION_SERVICE) {
                        Bundle bundle = new Bundle();
                        Bundle bundle2 = new Bundle();
                        bundle.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", addAccountToTelecomManager());
                        bundle2.putInt("call_type", 1);
                        bundle.putBundle("android.telecom.extra.OUTGOING_CALL_EXTRAS", bundle2);
                        qu2 r = qu2.r(this.currentAccount);
                        TLRPC.User user = this.user;
                        r.g(user.id, user.first_name, user.last_name);
                        ((TelecomManager) getSystemService("telecom")).placeCall(Uri.fromParts("tel", "+99084" + this.user.id, null), bundle);
                    } else {
                        bhc bhcVar = new bhc(this, (byte) 19);
                        this.delayedStartOutgoingCall = bhcVar;
                        gl.e3(bhcVar, 2000L);
                    }
                } else {
                    this.micMute = true;
                    startGroupCall(0, null, false);
                    if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                        setAudioOutput(0);
                    }
                }
                if (intent.getBooleanExtra("start_incall_activity", false)) {
                    Intent intent2 = new Intent(this, LaunchActivity.class);
                    if (this.user != null) {
                        str = "voip";
                    } else {
                        str = "voip_chat";
                    }
                    Intent addFlags = intent2.setAction(str).addFlags(268435456);
                    if (this.chat != null) {
                        addFlags.putExtra("currentAccount", this.currentAccount);
                    }
                    startActivity(addFlags);
                }
            } else {
                kk7.e().k(kk7.D2, new Object[0]);
                TL_phone.PhoneCall phoneCall = callIShouldHavePutIntoIntent;
                this.privateCall = phoneCall;
                if (phoneCall != null && phoneCall.video) {
                    z = true;
                } else {
                    z = false;
                }
                this.videoCall = z;
                if (z) {
                    this.isVideoAvailable = true;
                    if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                        setAudioOutput(0);
                    }
                }
                callIShouldHavePutIntoIntent = null;
                fa4.d("(3) set VoIPService.callIShouldHavePutIntoIntent = null");
                if (this.instantAccept) {
                    this.instantAccept = false;
                    acceptIncomingCall();
                } else if (USE_CONNECTION_SERVICE) {
                    acknowledgeCall(false);
                    showNotification();
                } else {
                    acknowledgeCall(true);
                }
                if (booleanExtra) {
                    Activity W = gl.W(this);
                    if (W == null) {
                        W = LaunchActivity.H1;
                    }
                    if (W == null) {
                        W = gl.W(org.telegram.messenger.a.b);
                    }
                    if (W != null) {
                        hgc.n(W, this.currentAccount);
                    }
                }
            }
            initializeAccountRelatedThings();
            gl.d3(new bhc(this, (byte) 20));
            return 2;
        }
        sc8.j("No account specified when starting VoIP service");
        return 0;
    }

    public void playAllowTalkSound() {
        Utilities.e.c(new bhc(this, (byte) 1));
    }

    public void playConnectedSound() {
        Utilities.e.c(new uhc(this, (byte) 4));
        this.playedConnectedSound = true;
    }

    public void playStartRecordSound() {
        Utilities.e.c(new bhc(this, (byte) 0));
    }

    public void processMessageUpdate(k27 k27Var) {
        TLRPC.Message message;
        ec2 ec2Var;
        boolean z;
        if (k27Var != null && (message = k27Var.k) != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
            long B0 = k27.B0(message);
            int e1 = k27Var.e1();
            TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) k27Var.k.action;
            fc2 fc2Var = this.groupCall;
            if (fc2Var != null && (ec2Var = (ec2) fc2Var.k.get(Long.valueOf(B0))) != null && ec2Var.a == e1) {
                if (!tL_messageActionConferenceCall.missed && !tL_messageActionConferenceCall.active) {
                    z = true;
                } else {
                    z = false;
                }
                if (ec2Var.a() != z) {
                    ec2Var.b = z;
                    this.groupCall.k.put(Long.valueOf(B0), ec2Var);
                    kk7.f(this.currentAccount).k(kk7.v2, 0L, Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
                }
            }
        }
    }

    public void registerStateListener(StateListener stateListener) {
        if (!this.stateListeners.contains(stateListener)) {
            this.stateListeners.add(stateListener);
            int i = this.currentState;
            if (i != 0) {
                stateListener.onStateChanged(i);
            }
            int i2 = this.signalBarCount;
            if (i2 != 0) {
                stateListener.onSignalBarsCountChanged(i2);
            }
        }
    }

    public void removeExtraLocalSink(VideoSink videoSink) {
        ProxyVideoSink proxyVideoSink = this.localSink[0];
        if (proxyVideoSink != null) {
            proxyVideoSink.removeExtra(videoSink);
        }
    }

    public void removeExtraRemoteSink(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, VideoSink videoSink) {
        String str;
        if (z) {
            str = groupCallParticipant.presentationEndpoint;
        } else {
            str = groupCallParticipant.videoEndpoint;
        }
        ProxyVideoSink proxyVideoSink = this.remoteSinks.get(str);
        if (proxyVideoSink != null) {
            proxyVideoSink.removeExtra(videoSink);
            if (proxyVideoSink.isUnused()) {
                this.remoteSinks.remove(str);
                removeIncomingVideoOutput(proxyVideoSink);
            }
        }
    }

    public void removeRemoteSink(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        String str;
        if (z) {
            str = groupCallParticipant.presentationEndpoint;
        } else {
            str = groupCallParticipant.videoEndpoint;
        }
        ProxyVideoSink proxyVideoSink = this.remoteSinks.get(str);
        if (proxyVideoSink == null) {
            return;
        }
        if (proxyVideoSink.hasExtras()) {
            proxyVideoSink.setTarget(null);
            proxyVideoSink.setBackground(null);
            return;
        }
        this.remoteSinks.remove(str);
        removeIncomingVideoOutput(proxyVideoSink);
    }

    public void requestFullScreen(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, boolean z2) {
        String str;
        int i;
        if (z2) {
            str = groupCallParticipant.presentationEndpoint;
        } else {
            str = groupCallParticipant.videoEndpoint;
        }
        if (str != null) {
            if ("unified".equals(str) && isRtmpStreamCall()) {
                return;
            }
            HashMap<String, Integer> hashMap = this.broadcastVideoCeilings;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            hashMap.put(str, Integer.valueOf(i));
            updateBroadcastVideoRequests();
            NativeInstance[] nativeInstanceArr = this.tgVoip;
            if (z) {
                nativeInstanceArr[0].setVideoEndpointQuality(str, 2);
            } else {
                nativeInstanceArr[0].setVideoEndpointQuality(str, 1);
            }
        }
    }

    public void requestVideoCall(boolean z) {
        int i = 0;
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            return;
        }
        if (!z) {
            long j = this.captureDevice[0];
            if (j != 0) {
                nativeInstance.setupOutgoingVideoCreated(j);
                this.destroyCaptureDevice[0] = false;
                this.isPrivateScreencast = z;
            }
        }
        ProxyVideoSink proxyVideoSink = this.localSink[0];
        if (z) {
            i = 2;
        } else if (this.isFrontFaceCamera) {
            i = 1;
        }
        nativeInstance.setupOutgoingVideo(proxyVideoSink, i);
        this.isPrivateScreencast = z;
    }

    public void sendCallRating(int i) {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        long j = phoneCall.id;
        long j2 = phoneCall.access_hash;
        int i2 = this.currentAccount;
        int i3 = y6c.t0;
        TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
        setcallrating.rating = i;
        setcallrating.comment = "";
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        setcallrating.peer = tL_inputPhoneCall;
        tL_inputPhoneCall.access_hash = j2;
        tL_inputPhoneCall.id = j;
        setcallrating.user_initiative = false;
        ConnectionsManager.getInstance(i2).sendRequest(setcallrating, new vv0(i3, (byte) 5));
    }

    public void setAudioOutput(int i) {
        CallConnection callConnection;
        if (w01.a) {
            fa4.b("setAudioOutput " + i);
        }
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        boolean z = USE_CONNECTION_SERVICE;
        int i2 = 0;
        if (z && (callConnection = this.systemCallConnection) != null) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        callConnection.setAudioRoute(2);
                    }
                } else {
                    callConnection.setAudioRoute(5);
                }
            } else {
                callConnection.setAudioRoute(8);
            }
        } else if (this.audioConfigured && !z) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        if (!this.bluetoothScoActive) {
                            this.needSwitchToBluetoothAfterScoActivates = true;
                            try {
                                voipAudioManager.startBluetooth();
                            } catch (Throwable th) {
                                fa4.g(th, true);
                            }
                        } else {
                            voipAudioManager.setBluetoothOn(true);
                            voipAudioManager.setSpeakerphoneOn(false);
                        }
                        this.audioRouteToSet = 2;
                    }
                } else {
                    this.needSwitchToBluetoothAfterScoActivates = false;
                    if (this.bluetoothScoActive || this.bluetoothScoConnecting) {
                        voipAudioManager.stopBluetooth();
                        this.bluetoothScoActive = false;
                        this.bluetoothScoConnecting = false;
                    }
                    voipAudioManager.setSpeakerphoneOn(false);
                    voipAudioManager.setBluetoothOn(false);
                    this.audioRouteToSet = 0;
                }
            } else {
                this.needSwitchToBluetoothAfterScoActivates = false;
                if (this.bluetoothScoActive || this.bluetoothScoConnecting) {
                    voipAudioManager.stopBluetooth();
                    this.bluetoothScoActive = false;
                    this.bluetoothScoConnecting = false;
                }
                voipAudioManager.setBluetoothOn(false);
                voipAudioManager.setSpeakerphoneOn(true);
                this.audioRouteToSet = 1;
            }
            updateOutputGainControlState();
        } else if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.audioRouteToSet = 2;
                    this.speakerphoneStateToSet = false;
                }
            } else {
                this.audioRouteToSet = 0;
                this.speakerphoneStateToSet = false;
            }
        } else {
            this.audioRouteToSet = 1;
            this.speakerphoneStateToSet = true;
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i2 < size) {
            StateListener stateListener = arrayList.get(i2);
            i2++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public void setAudioRoute(int i) {
        if (i == 1) {
            setAudioOutput(0);
        } else if (i == 0) {
            setAudioOutput(1);
        } else if (i == 2) {
            setAudioOutput(2);
        }
    }

    public void setBackgroundSinks(VideoSink videoSink, VideoSink videoSink2) {
        this.localSink[0].setBackground(videoSink);
        this.remoteSink[0].setBackground(videoSink2);
    }

    public void setGroupCallHash(String str) {
        if (this.currentGroupModeStreaming && !TextUtils.isEmpty(str) && !str.equals(this.joinHash)) {
            this.joinHash = str;
            createGroupInstance(0, false, true);
        }
    }

    public void setGroupCallPeer(TLRPC.InputPeer inputPeer) {
        fc2 fc2Var = this.groupCall;
        if (fc2Var != null) {
            this.groupCallPeer = inputPeer;
            fc2Var.y(inputPeer);
            TLRPC.ChatFull L0 = na7.q1(this.currentAccount).L0(this.groupCall.c);
            if (L0 != null) {
                TLRPC.Peer peer = this.groupCall.J;
                L0.groupcall_default_join_as = peer;
                if (peer != null) {
                    boolean z = L0 instanceof TLRPC.TL_chatFull;
                    int i = L0.flags;
                    if (z) {
                        L0.flags = i | 32768;
                    } else {
                        L0.flags = i | 67108864;
                    }
                } else {
                    boolean z2 = L0 instanceof TLRPC.TL_chatFull;
                    int i2 = L0.flags;
                    if (z2) {
                        L0.flags = i2 & (-32769);
                    } else {
                        L0.flags = i2 & (-67108865);
                    }
                }
            }
            createGroupInstance(0, true, true);
            if (this.videoState[1] == 2) {
                createGroupInstance(1, true, true);
            }
        }
    }

    public void setLocalSink(VideoSink videoSink, boolean z) {
        if (z) {
            return;
        }
        this.localSink[0].setTarget(videoSink);
    }

    public void setMicMute(boolean r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPService.setMicMute(boolean, boolean, boolean):void");
    }

    public void setNoiseSupressionEnabled(boolean z) {
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            return;
        }
        nativeInstance.setNoiseSuppressionEnabled(z);
    }

    public void setParticipantVolume(TLRPC.GroupCallParticipant groupCallParticipant, int i) {
        int i2;
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            ao9 ao9Var = this.rtmpStreamPlayer;
            if (ao9Var != null) {
                ao9Var.b.post(new kt(ao9Var, i / 10000.0f, (byte) 5));
                return;
            }
            return;
        }
        double d = i / 10000.0d;
        nativeInstance.setVolume(groupCallParticipant.source, d);
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.presentation;
        if (tL_groupCallParticipantVideo != null && (i2 = tL_groupCallParticipantVideo.audio_source) != 0) {
            this.tgVoip[0].setVolume(i2, d);
        }
    }

    public void setParticipantsVolume() {
        if (this.tgVoip[0] != null) {
            int m = this.groupCall.d.m();
            for (int i = 0; i < m; i++) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.groupCall.d.n(i);
                if (!groupCallParticipant.self && groupCallParticipant.source != 0 && (groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
                    if (groupCallParticipant.muted_by_you) {
                        setParticipantVolume(groupCallParticipant, 0);
                    } else {
                        setParticipantVolume(groupCallParticipant, hc2.H(groupCallParticipant));
                    }
                }
            }
        }
    }

    public void setRemoteSink(VideoSink videoSink, boolean z) {
        this.remoteSink[z ? 1 : 0].setTarget(videoSink);
    }

    public void setRtmpStreamVideoOutput(zn9 zn9Var, Runnable runnable) {
        ao9 rtmpStreamPlayer = getRtmpStreamPlayer();
        if (rtmpStreamPlayer == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (zn9Var == null) {
            zn9Var = this.rtmpStreamVideoSinks;
        }
        rtmpStreamPlayer.l(zn9Var, runnable);
    }

    public void setSinks(VideoSink videoSink, boolean z, VideoSink videoSink2) {
        ProxyVideoSink proxyVideoSink = this.localSink[z ? 1 : 0];
        ProxyVideoSink proxyVideoSink2 = this.remoteSink[z ? 1 : 0];
        if (proxyVideoSink != null) {
            proxyVideoSink.setTarget(videoSink);
        }
        if (proxyVideoSink2 != null) {
            proxyVideoSink2.setTarget(videoSink2);
        }
    }

    public void setSwitchingCamera(boolean z, boolean z2) {
        this.switchingCamera = z;
        if (!z) {
            this.isFrontFaceCamera = z2;
            for (int i = 0; i < this.stateListeners.size(); i++) {
                this.stateListeners.get(i).onCameraSwitch(this.isFrontFaceCamera);
            }
        }
    }

    public void setVideoState(boolean z, int i) {
        char c;
        int i2;
        boolean z2 = false;
        int i3 = 0;
        if (this.groupCall != null) {
            c = z ? 1 : 0;
        } else {
            c = 0;
        }
        NativeInstance nativeInstance = this.tgVoip[c];
        if (nativeInstance == null) {
            long[] jArr = this.captureDevice;
            long j = jArr[z ? 1 : 0];
            if (j != 0) {
                this.videoState[c] = i;
                NativeInstance.setVideoStateCapturer(j, i);
                return;
            } else if (i == 2 && (i2 = this.currentState) != 17 && i2 != 11) {
                ProxyVideoSink proxyVideoSink = this.localSink[c];
                if (z) {
                    i3 = 2;
                } else if (this.isFrontFaceCamera) {
                    i3 = 1;
                }
                jArr[z ? 1 : 0] = NativeInstance.createVideoCapturer(proxyVideoSink, i3);
                this.videoState[c] = 2;
                return;
            } else {
                return;
            }
        }
        this.videoState[c] = i;
        nativeInstance.setVideoState(i);
        long j2 = this.captureDevice[z ? 1 : 0];
        if (j2 != 0) {
            NativeInstance.setVideoStateCapturer(j2, this.videoState[c]);
        }
        if (!z) {
            if (this.groupCall != null) {
                TLRPC.User f = y6c.h(this.currentAccount).f();
                if (this.videoState[0] != 2) {
                    z2 = true;
                }
                editCallMember(f, null, Boolean.valueOf(z2), null, null, null);
            }
            checkIsNear();
        }
    }

    public void setupCaptureDevice(boolean z, boolean z2) {
        NativeInstance nativeInstance;
        boolean z3 = false;
        if (!z) {
            long j = this.captureDevice[z ? 1 : 0];
            if (j != 0 && (nativeInstance = this.tgVoip[z ? 1 : 0]) != null) {
                nativeInstance.setupOutgoingVideoCreated(j);
                this.destroyCaptureDevice[z ? 1 : 0] = false;
                this.videoState[z ? 1 : 0] = 2;
            } else {
                return;
            }
        }
        if (this.micMute == z2) {
            setMicMute(!z2, false, false);
            this.micSwitching = true;
        }
        if (this.groupCall != null) {
            TLRPC.User f = y6c.h(this.currentAccount).f();
            Boolean valueOf = Boolean.valueOf(!z2);
            if (this.videoState[0] != 2) {
                z3 = true;
            }
            editCallMember(f, valueOf, Boolean.valueOf(z3), null, null, new bhc(this, (byte) 17));
        }
    }

    @Override
    public void stopRinging() {
        synchronized (sync) {
            MediaPlayer mediaPlayer = this.ringtonePlayer;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                this.ringtonePlayer.release();
                this.ringtonePlayer = null;
            }
        }
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
            this.vibrator = null;
        }
    }

    public void stopScreenCapture() {
        if (this.groupCall != null && this.videoState[1] == 2) {
            TL_phone.leaveGroupCallPresentation leavegroupcallpresentation = new TL_phone.leaveGroupCallPresentation();
            fc2 fc2Var = this.groupCall;
            leavegroupcallpresentation.call = fc2Var.h(fc2Var.a);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcallpresentation, new ihc(this, (byte) 5));
            NativeInstance nativeInstance = this.tgVoip[1];
            if (nativeInstance != null) {
                Utilities.e.c(new jm9(nativeInstance, (byte) 1));
            }
            this.mySource[1] = 0;
            this.tgVoip[1] = null;
            this.destroyCaptureDevice[1] = true;
            this.captureDevice[1] = 0;
            this.videoState[1] = 0;
            kk7.f(j5.a(this.currentAccount).a).k(kk7.y2, new Object[0]);
        }
    }

    public void swapSinks() {
        this.localSink[0].swap();
        this.remoteSink[0].swap();
    }

    public void switchCamera() {
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance != null && nativeInstance.hasVideoCapturer() && !this.switchingCamera) {
            this.switchingCamera = true;
            this.tgVoip[0].switchCamera(!this.isFrontFaceCamera);
            return;
        }
        long j = this.captureDevice[0];
        if (j != 0 && !this.switchingCamera) {
            NativeInstance.switchCameraCapturer(j, !this.isFrontFaceCamera);
        }
    }

    public void switchToSpeaker() {
        gl.e3(new bhc(this, (byte) 13), 500L);
    }

    public void toggleSpeakerphoneOrShowRouteSheet(Context context, boolean z, Integer num) {
        CallConnection callConnection;
        byte b;
        int i;
        int i2;
        int i3 = 2;
        int i4 = 0;
        if (isBluetoothHeadsetConnected() && hasEarpiece()) {
            fx0 h = de9.h(1, null, context, false);
            h.P = k96.M0(2131743022, null);
            h.Q = true;
            h.Y = num;
            if (num != null) {
                b = 4;
            } else {
                b = 0;
            }
            h.X = b;
            String M0 = k96.M0(2131743257, null);
            if (this.isHeadsetPlugged) {
                i = 2131743259;
            } else {
                i = 2131743260;
            }
            String M02 = k96.M0(i, null);
            String str = this.currentBluetoothDeviceName;
            if (str == null) {
                str = k96.M0(2131743261, null);
            }
            CharSequence[] charSequenceArr = {M0, M02, str};
            if (this.isHeadsetPlugged) {
                i2 = 2131230920;
            } else {
                i2 = 2131232084;
            }
            r20 r20Var = new r20(this, (byte) 4);
            h.M = charSequenceArr;
            h.N = new int[]{2131232086, i2, 2131232083};
            h.L = r20Var;
            h.setOnShowListener(new z31(h, num, (byte) 1));
            if (z) {
                if (Build.VERSION.SDK_INT >= 26) {
                    h.getWindow().setType(2038);
                } else {
                    h.getWindow().setType(2003);
                }
            }
            h.show();
            return;
        }
        boolean z2 = USE_CONNECTION_SERVICE;
        if (z2 && (callConnection = this.systemCallConnection) != null && callConnection.getCallAudioState() != null) {
            boolean hasEarpiece = hasEarpiece();
            CallConnection callConnection2 = this.systemCallConnection;
            int i5 = 5;
            if (hasEarpiece) {
                if (callConnection2.getCallAudioState().getRoute() != 8) {
                    i5 = 8;
                }
                callConnection2.setAudioRoute(i5);
            } else {
                if (callConnection2.getCallAudioState().getRoute() == 2) {
                    i3 = 5;
                }
                callConnection2.setAudioRoute(i3);
            }
        } else if (this.audioConfigured && !z2) {
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            if (hasEarpiece()) {
                voipAudioManager.setSpeakerphoneOn(!voipAudioManager.isSpeakerphoneOn());
            } else {
                voipAudioManager.setBluetoothOn(!voipAudioManager.isBluetoothOn());
            }
            voipAudioManager.isBluetoothAndSpeakerOnAsync(new thc(this, (byte) 1));
            return;
        } else {
            this.speakerphoneStateToSet = !this.speakerphoneStateToSet;
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i4 < size) {
            StateListener stateListener = arrayList.get(i4);
            i4++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public void unregisterStateListener(StateListener stateListener) {
        this.stateListeners.remove(stateListener);
    }

    public void updateCurrentForegroundType() {
        if (this.lastForegroundType != getCurrentForegroundType() && this.foregroundStarted) {
            stopForeground(true);
            int i = Build.VERSION.SDK_INT;
            int i2 = this.foregroundId;
            if (i >= 33) {
                Notification notification = this.foregroundNotification;
                int currentForegroundType = getCurrentForegroundType();
                this.lastForegroundType = currentForegroundType;
                startForeground(i2, notification, currentForegroundType);
                return;
            }
            startForeground(i2, this.foregroundNotification);
        }
    }

    public void updateOutputGainControlState() {
        hasRtmpStream();
    }

    public void setSinks(VideoSink videoSink, VideoSink videoSink2) {
        setSinks(videoSink, false, videoSink2);
    }

    private void onTgVoipPreStop() {
    }

    public class AnonymousClass5 implements VideoSink {
        final String val$endpointId;
        final boolean val$screencast;

        public AnonymousClass5(String str, boolean z) {
            VoIPService.this = r1;
            this.val$endpointId = str;
            this.val$screencast = z;
        }

        public void lambda$onFrame$0(String str, VideoSink videoSink, boolean z) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) VoIPService.this.waitingFrameParticipant.remove(str);
            ProxyVideoSink proxyVideoSink = (ProxyVideoSink) VoIPService.this.remoteSinks.get(str);
            if (proxyVideoSink != null && proxyVideoSink.target == videoSink && proxyVideoSink.hasExtras()) {
                proxyVideoSink.setTarget(null);
            } else if (proxyVideoSink != null && proxyVideoSink.target == videoSink) {
                VoIPService.this.proxyVideoSinkLruCache.put(str, proxyVideoSink);
                VoIPService.this.remoteSinks.remove(str);
                proxyVideoSink.setTarget(null);
            }
            if (groupCallParticipant != null) {
                if (z) {
                    groupCallParticipant.hasPresentationFrame = 2;
                } else {
                    groupCallParticipant.hasCameraFrame = 2;
                }
            }
            fc2 fc2Var = VoIPService.this.groupCall;
            if (fc2Var != null) {
                fc2Var.D();
            }
        }

        @Override
        public void onFrame(VideoFrame videoFrame) {
            if (videoFrame != null && videoFrame.getBuffer().getHeight() != 0 && videoFrame.getBuffer().getWidth() != 0) {
                final String str = this.val$endpointId;
                final boolean z = this.val$screencast;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        VoIPService.AnonymousClass5.this.lambda$onFrame$0(str, this, z);
                    }
                });
            }
        }

        @Override
        public final void setParentSink(VideoSink videoSink) {
        }
    }

    public static class ProxyVideoSink implements VideoSink {
        private VideoSink background;
        private final ArrayList<VideoSink> extras = new ArrayList<>(1);
        private long nativeInstance;
        private VideoSink target;

        public synchronized void addExtra(VideoSink videoSink) {
            if (!this.extras.contains(videoSink)) {
                this.extras.add(videoSink);
            }
        }

        public synchronized boolean hasExtras() {
            return !this.extras.isEmpty();
        }

        public synchronized boolean isUnused() {
            boolean z;
            if (this.target == null && this.background == null) {
                if (this.extras.isEmpty()) {
                    z = true;
                }
            }
            z = false;
            return z;
        }

        @Override
        public synchronized void onFrame(VideoFrame videoFrame) {
            VideoSink videoSink = this.target;
            if (videoSink != null) {
                videoSink.onFrame(videoFrame);
            }
            VideoSink videoSink2 = this.background;
            if (videoSink2 != null) {
                videoSink2.onFrame(videoFrame);
            }
            for (int i = 0; i < this.extras.size(); i++) {
                this.extras.get(i).onFrame(videoFrame);
            }
        }

        public synchronized void removeBackground(VideoSink videoSink) {
            if (this.background == videoSink) {
                this.background = null;
            }
        }

        public synchronized void removeExtra(VideoSink videoSink) {
            this.extras.remove(videoSink);
        }

        public synchronized void removeTarget(VideoSink videoSink) {
            if (this.target == videoSink) {
                this.target = null;
            }
        }

        public synchronized void setBackground(VideoSink videoSink) {
            VideoSink videoSink2 = this.background;
            if (videoSink2 != null) {
                videoSink2.setParentSink(null);
            }
            this.background = videoSink;
            if (videoSink != null) {
                videoSink.setParentSink(this);
            }
        }

        public synchronized void setTarget(VideoSink videoSink) {
            VideoSink videoSink2 = this.target;
            if (videoSink2 != videoSink) {
                if (videoSink2 != null) {
                    videoSink2.setParentSink(null);
                }
                this.target = videoSink;
                if (videoSink != null) {
                    videoSink.setParentSink(this);
                }
            }
        }

        public synchronized void swap() {
            VideoSink videoSink;
            if (this.target != null && (videoSink = this.background) != null) {
                this.target = videoSink;
                this.background = null;
            }
        }

        @Override
        public final void setParentSink(VideoSink videoSink) {
        }
    }

    private int getCurrentForegroundType() {
        return getCurrentForegroundType(this, this.gotMediaProjection);
    }

    public static void lambda$createGroupInstance$70(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSignalingData(byte[] bArr) {
        if (this.privateCall == null) {
            return;
        }
        TL_phone.sendSignalingData sendsignalingdata = new TL_phone.sendSignalingData();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        sendsignalingdata.peer = tL_inputPhoneCall;
        TL_phone.PhoneCall phoneCall = this.privateCall;
        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
        tL_inputPhoneCall.id = phoneCall.id;
        sendsignalingdata.data = bArr;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendsignalingdata, null);
    }

    private void checkIsNear() {
        if (this.remoteVideoState == 2 || this.videoState[0] == 2) {
            checkIsNear(false);
        }
    }

    public void hangUp() {
        hangUp(0, null);
    }

    public void hangUp(int i) {
        hangUp(i, null);
    }

    public void hangUp(Runnable runnable) {
        hangUp(0, runnable);
    }

    public void callFailed() {
        NativeInstance nativeInstance = this.tgVoip[0];
        callFailed(nativeInstance != null ? nativeInstance.getLastError() : "ERROR_UNKNOWN");
    }

    @Override
    public void declineIncomingCall() {
        declineIncomingCall(1, null);
    }

    public void toggleSpeakerphoneOrShowRouteSheet(Context context, boolean z) {
        toggleSpeakerphoneOrShowRouteSheet(context, z, null);
    }

    public void startRingtoneAndVibration() {
        if (this.startedRinging) {
            return;
        }
        startRingtoneAndVibration(this.user.id);
        this.startedRinging = true;
    }

    private void showNotification() {
        if (this.user != null) {
            showNotification(getTitle(), getRoundAvatarBitmap(this, this.currentAccount, this.user));
        } else {
            showNotification(getTitle(), getRoundAvatarBitmap(this, this.currentAccount, this.chat));
        }
    }
}
