package org.telegram.messenger.voip;

import ai.e3;
import ai.f3;
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
import android.util.Log;
import android.util.LruCache;
import android.view.KeyEvent;
import android.widget.Toast;
import b8.nf;
import ci.a2;
import ci.e1;
import ci.v6;
import ei.d1;
import gi.b3;
import ii.g2;
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
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import k2.p1;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.bz;
import org.telegram.messenger.cs;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.p3;
import org.telegram.messenger.p5;
import org.telegram.messenger.q3;
import org.telegram.messenger.qr;
import org.telegram.messenger.r2;
import org.telegram.messenger.r3;
import org.telegram.messenger.sr;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.us;
import org.telegram.messenger.vc;
import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.lm;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.voip.n1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.VoIPFeedbackActivity;
import org.telegram.ui.VoIPPermissionActivity;
import org.telegram.ui.sb1;
import org.telegram.ui.x30;
import org.telegram.ui.zb1;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public class VoIPService extends Service implements SensorEventListener, AudioManager.OnAudioFocusChangeListener, cs, VoIPServiceState {
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
    private static final int PROXIMITY_SCREEN_OFF_WAKE_LOCK = 32;
    public static final int QUALITY_FULL = 2;
    public static final int QUALITY_MEDIUM = 1;
    public static final int QUALITY_SMALL = 0;
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
    public r3 groupCall;
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
    private int scheduleDate;
    private Runnable shortPollRunnable;
    private int signalBarCount;
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
    private long[] captureDevice = new long[2];
    private boolean[] destroyCaptureDevice = {true, true};
    private int[] videoState = {0, 0};
    private int remoteAudioState = 1;
    private int audioRouteToSet = 2;
    public final SharedUIParams sharedUIParams = new SharedUIParams();
    private ArrayList<TL_phone.PhoneCall> pendingUpdates = new ArrayList<>();
    private HashMap<String, Integer> currentStreamRequestTimestamp = new HashMap<>();
    private Runnable afterSoundRunnable = new AnonymousClass1();
    private BluetoothProfile.ServiceListener serviceListener = new BluetoothProfile.ServiceListener() {
        {
            VoIPService.this = this;
        }

        @Override
        public void onServiceConnected(int i3, BluetoothProfile bluetoothProfile) {
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
                BluetoothAdapter.getDefaultAdapter().closeProfileProxy(i3, bluetoothProfile);
                VoIPService.this.fetchingBluetoothDeviceName = false;
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }

        @Override
        public void onServiceDisconnected(int i3) {
        }
    };
    private BroadcastReceiver receiver = new BroadcastReceiver() {
        {
            VoIPService.this = this;
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13 = true;
            int i3 = 0;
            if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                VoIPService voIPService = VoIPService.this;
                if (intent.getIntExtra("state", 0) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                voIPService.isHeadsetPlugged = z12;
                if (VoIPService.this.isHeadsetPlugged && VoIPService.this.proximityWakelock != null && VoIPService.this.proximityWakelock.isHeld()) {
                    VoIPService.this.proximityWakelock.release();
                }
                if (VoIPService.this.isHeadsetPlugged) {
                    VoipAudioManager voipAudioManager = VoipAudioManager.get();
                    if (voipAudioManager.isSpeakerphoneOn()) {
                        VoIPService.this.previousAudioOutput = 0;
                    } else if (voipAudioManager.isBluetoothOn()) {
                        VoIPService.this.previousAudioOutput = 2;
                    } else {
                        VoIPService.this.previousAudioOutput = 1;
                    }
                    VoIPService.this.setAudioOutput(1);
                } else if (VoIPService.this.previousAudioOutput >= 0) {
                    VoIPService voIPService2 = VoIPService.this;
                    voIPService2.setAudioOutput(voIPService2.previousAudioOutput);
                    VoIPService.this.previousAudioOutput = -1;
                }
                VoIPService.this.isProximityNear = false;
                VoIPService.this.updateOutputGainControlState();
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                VoIPService.this.updateNetworkType();
            } else if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                if (r2.f25040a) {
                    a8.d("bt headset state = " + intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0));
                }
                VoIPService voIPService3 = VoIPService.this;
                if (intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0) != 2) {
                    z13 = false;
                }
                voIPService3.updateBluetoothHeadsetState(z13);
            } else if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
                if (r2.f25040a) {
                    a8.d("Bluetooth SCO state updated: " + intExtra);
                }
                if (intExtra == 0 && VoIPService.this.isBtHeadsetConnected && (Build.VERSION.SDK_INT < 31 ? !VoIPService.this.btAdapter.isEnabled() || !nf.d("android.permission.BLUETOOTH_CONNECT") || VoIPService.this.btAdapter.getProfileConnectionState(1) != 2 : VoipAudioManager.get().findBluetoothDevice() == null)) {
                    VoIPService.this.updateBluetoothHeadsetState(false);
                    return;
                }
                VoIPService voIPService4 = VoIPService.this;
                if (intExtra == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                voIPService4.bluetoothScoConnecting = z10;
                VoIPService voIPService5 = VoIPService.this;
                if (intExtra == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                voIPService5.bluetoothScoActive = z11;
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
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((StateListener) obj).onAudioSettingsChanged();
                }
            } else if ("android.intent.action.PHONE_STATE".equals(intent.getAction())) {
                if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(intent.getStringExtra("state"))) {
                    VoIPService.this.hangUp();
                }
            } else if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
                if (VoIPService.this.currentState == 15 && VoIPService.this.user != null) {
                    if (((AudioManager) VoIPService.this.getSystemService("audio")).getRingerMode() == 0) {
                        VoIPService.this.stopRinging();
                    } else if (VoIPService.this.ringtonePlayer == null) {
                        VoIPService voIPService6 = VoIPService.this;
                        voIPService6.startRingtoneAndVibration(voIPService6.user.f27150id);
                    }
                }
            } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                while (i3 < VoIPService.this.stateListeners.size()) {
                    ((StateListener) VoIPService.this.stateListeners.get(i3)).onScreenOnChange(true);
                    i3++;
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                for (int i10 = 0; i10 < VoIPService.this.stateListeners.size(); i10++) {
                    ((StateListener) VoIPService.this.stateListeners.get(i10)).onScreenOnChange(false);
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
        public void entryRemoved(boolean z10, String str, ProxyVideoSink proxyVideoSink, ProxyVideoSink proxyVideoSink2) {
            super.entryRemoved(z10, (boolean) str, proxyVideoSink, proxyVideoSink2);
            VoIPService.this.tgVoip[0].removeIncomingVideoOutput(proxyVideoSink.nativeInstance);
        }
    };
    private ProxyVideoSink[] localSink = new ProxyVideoSink[2];
    private ProxyVideoSink[] remoteSink = new ProxyVideoSink[2];
    private ProxyVideoSink[] currentBackgroundSink = new ProxyVideoSink[2];
    private String[] currentBackgroundEndpointId = new String[2];
    private HashMap<String, ProxyVideoSink> remoteSinks = new HashMap<>();
    private final Runnable destroyConvertingRunnable = new n0(this, 0);

    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
            VoIPService.this = r1;
        }

        public void lambda$run$0() {
            VoIPService.this.soundPool.release();
        }

        public static void lambda$run$1(AudioManager audioManager) {
            synchronized (VoIPService.sync) {
                try {
                    if (VoIPService.setModeRunnable != null) {
                        Runnable unused = VoIPService.setModeRunnable = null;
                        try {
                            audioManager.setMode(0);
                        } catch (SecurityException e10) {
                            if (r2.f25040a) {
                                a8.e("Error setting audio more to normal", e10);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
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
            Utilities.f21387e.c(new p0(this, 0));
            Utilities.f21387e.c(VoIPService.setModeRunnable = new q0(audioManager, 0));
        }
    }

    public class AnonymousClass5 implements VideoSink {
        final String val$endpointId;
        final boolean val$screencast;

        public AnonymousClass5(String str, boolean z10) {
            VoIPService.this = r1;
            this.val$endpointId = str;
            this.val$screencast = z10;
        }

        public void lambda$onFrame$0(String str, VideoSink videoSink, boolean z10) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) VoIPService.this.waitingFrameParticipant.remove(str);
            ProxyVideoSink proxyVideoSink = (ProxyVideoSink) VoIPService.this.remoteSinks.get(str);
            if (proxyVideoSink != null && proxyVideoSink.target == videoSink) {
                VoIPService.this.proxyVideoSinkLruCache.put(str, proxyVideoSink);
                VoIPService.this.remoteSinks.remove(str);
                proxyVideoSink.setTarget(null);
            }
            if (groupCallParticipant != null) {
                if (z10) {
                    groupCallParticipant.hasPresentationFrame = 2;
                } else {
                    groupCallParticipant.hasCameraFrame = 2;
                }
            }
            r3 r3Var = VoIPService.this.groupCall;
            if (r3Var != null) {
                r3Var.B();
            }
        }

        @Override
        public void onFrame(VideoFrame videoFrame) {
            if (videoFrame != null && videoFrame.getBuffer().getHeight() != 0 && videoFrame.getBuffer().getWidth() != 0) {
                org.telegram.messenger.g0.h3(new r0(this, this.val$endpointId, this, this.val$screencast, 0));
            }
        }

        @Override
        public final void setParentSink(VideoSink videoSink) {
            org.webrtc.e0.a(this, videoSink);
        }
    }

    public class AnonymousClass9 implements Runnable {
        public AnonymousClass9() {
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
                org.telegram.messenger.g0.i3(this, 100L);
            }
        }

        @Override
        public void run() {
            if (VoIPService.sharedInstance == null) {
                return;
            }
            Utilities.f21387e.c(new p0(this, 1));
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
            if (r2.f25040a) {
                a8.b("ConnectionService call audio state changed: " + callAudioState);
            }
            ArrayList arrayList = VoIPService.this.stateListeners;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((StateListener) obj).onAudioSettingsChanged();
            }
        }

        @Override
        public void onCallEvent(String str, Bundle bundle) {
            super.onCallEvent(str, bundle);
            if (r2.f25040a) {
                a8.b("ConnectionService onCallEvent " + str);
            }
        }

        @Override
        public void onDisconnect() {
            if (r2.f25040a) {
                a8.b("ConnectionService onDisconnect");
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
            if (r2.f25040a) {
                a8.b("onSlience");
            }
            VoIPService.this.stopRinging();
        }

        @Override
        public void onStateChanged(int i3) {
            super.onStateChanged(i3);
            if (r2.f25040a) {
                a8.b("ConnectionService onStateChanged " + Connection.stateToString(i3));
            }
            if (i3 == 4) {
                g5.r(VoIPService.this.currentAccount).h();
                VoIPService.this.didDeleteConnectionServiceContact = true;
            }
        }
    }

    public static class ProxyVideoSink implements VideoSink {
        private VideoSink background;
        private long nativeInstance;
        private VideoSink target;

        @Override
        public synchronized void onFrame(VideoFrame videoFrame) {
            try {
                VideoSink videoSink = this.target;
                if (videoSink != null) {
                    videoSink.onFrame(videoFrame);
                }
                VideoSink videoSink2 = this.background;
                if (videoSink2 != null) {
                    videoSink2.onFrame(videoFrame);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void removeBackground(VideoSink videoSink) {
            if (this.background == videoSink) {
                this.background = null;
            }
        }

        public synchronized void removeTarget(VideoSink videoSink) {
            if (this.target == videoSink) {
                this.target = null;
            }
        }

        public synchronized void setBackground(VideoSink videoSink) {
            try {
                VideoSink videoSink2 = this.background;
                if (videoSink2 != null) {
                    videoSink2.setParentSink(null);
                }
                this.background = videoSink;
                if (videoSink != null) {
                    videoSink.setParentSink(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override
        public final void setParentSink(VideoSink videoSink) {
            org.webrtc.e0.a(this, videoSink);
        }

        public synchronized void setTarget(VideoSink videoSink) {
            try {
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
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void swap() {
            VideoSink videoSink;
            if (this.target != null && (videoSink = this.background) != null) {
                this.target = videoSink;
                this.background = null;
            }
        }
    }

    public static class RequestedParticipant {
        public int audioSsrc;
        public TLRPC.GroupCallParticipant participant;
        public long userId;

        public RequestedParticipant(TLRPC.GroupCallParticipant groupCallParticipant, int i3) {
            long o10;
            this.participant = groupCallParticipant;
            this.audioSsrc = i3;
            if (groupCallParticipant == null) {
                o10 = 0;
            } else {
                o10 = m5.o(groupCallParticipant.peer);
            }
            this.userId = o10;
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

        void onCameraSwitch(boolean z10);

        void onMediaStateUpdated(int i3, int i10);

        void onScreenOnChange(boolean z10);

        void onSignalBarsCountChanged(int i3);

        void onStateChanged(int i3);

        void onVideoAvailableChange(boolean z10);
    }

    public void acceptIncomingCallFromNotification() {
        showNotification();
        if (checkSelfPermission("android.permission.RECORD_AUDIO") == 0 && (!this.privateCall.video || checkSelfPermission("android.permission.CAMERA") == 0)) {
            acceptIncomingCall();
            try {
                PendingIntent.getActivity(this, 0, new Intent(this, getUIActivityClass()).setAction("voip"), 33554432).send();
                return;
            } catch (Exception e10) {
                if (r2.f25040a) {
                    a8.e("Error starting incall activity", e10);
                    return;
                }
                return;
            }
        }
        try {
            PendingIntent.getActivity(this, 0, new Intent(this, VoIPPermissionActivity.class).addFlags(268435456), 1107296256).send();
        } catch (Exception e11) {
            if (r2.f25040a) {
                a8.e("Error starting permission activity", e11);
            }
        }
    }

    private void acknowledgeCall(boolean z10) {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        if (phoneCall == null) {
            if (r2.f25040a) {
                a8.l("Call is null, wtf");
            }
            stopSelf();
        } else if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            if (r2.f25040a) {
                a8.l("Call " + this.privateCall.f27229id + " was discarded before the service started, stopping");
            }
            stopSelf();
        } else if (sr.i() && !sr.g() && ((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (r2.f25040a) {
                a8.d("MIUI: no permission to show when locked but the screen is locked. ¯\\_(ツ)_/¯");
            }
            stopSelf();
        } else {
            TL_phone.receivedCall receivedcall = new TL_phone.receivedCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            receivedcall.peer = tL_inputPhoneCall;
            TL_phone.PhoneCall phoneCall2 = this.privateCall;
            tL_inputPhoneCall.f27066id = phoneCall2.f27229id;
            tL_inputPhoneCall.access_hash = phoneCall2.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(receivedcall, new b3(1, this, z10), 65536);
        }
    }

    private PhoneAccountHandle addAccountToTelecomManager() {
        TLRPC.User f10 = h10.i(this.currentAccount).f();
        ComponentName componentName = new ComponentName(this, TelegramConnectionService.class);
        PhoneAccountHandle phoneAccountHandle = new PhoneAccountHandle(componentName, "" + f10.f27150id);
        ((TelecomManager) getSystemService("telecom")).registerPhoneAccount(new PhoneAccount.Builder(phoneAccountHandle, g5.m(0, f10.first_name, f10.last_name)).setCapabilities(2048).setIcon(Icon.createWithResource(this, 2131231308)).setHighlightColor(-13851168).addSupportedUriScheme("sip").build());
        return phoneAccountHandle;
    }

    private void broadcastUnknownParticipants(long j10, int[] iArr) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (this.groupCall != null && this.tgVoip[0] != null) {
            long selfId = getSelfId();
            int length = iArr.length;
            ArrayList arrayList = null;
            for (int i3 = 0; i3 < length; i3++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.groupCall.f25061p.get(iArr[i3]);
                if (groupCallParticipant2 == null && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.groupCall.f25062q.get(iArr[i3])) == null) {
                    groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.groupCall.f25063r.get(iArr[i3]);
                }
                if (groupCallParticipant2 != null && zi.C1(groupCallParticipant2.peer) != selfId && groupCallParticipant2.source != 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(new RequestedParticipant(groupCallParticipant2, iArr[i3]));
                }
            }
            if (arrayList != null) {
                this.tgVoip[0].onMediaDescriptionAvailable(j10, (RequestedParticipant[]) arrayList.toArray(new RequestedParticipant[0]));
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    RequestedParticipant requestedParticipant = (RequestedParticipant) arrayList.get(i10);
                    if (requestedParticipant.participant.muted_by_you) {
                        this.tgVoip[0].setVolume(requestedParticipant.audioSsrc, 0.0d);
                    } else {
                        this.tgVoip[0].setVolume(requestedParticipant.audioSsrc, t3.H(groupCallParticipant) / 10000.0d);
                    }
                }
            }
        }
    }

    private void callEnded() {
        long j10;
        if (r2.f25040a) {
            a8.b("Call " + getCallID() + " ended");
        }
        this.isCallEnded = true;
        if (this.groupCall != null && (!this.playedConnectedSound || this.onDestroyRunnable != null)) {
            this.needPlayEndSound = false;
        }
        org.telegram.messenger.g0.h3(new q(this, 7));
        Utilities.f21387e.c(new q(this, 8));
        Runnable runnable = this.connectingSoundRunnable;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.connectingSoundRunnable = null;
        }
        int i3 = 700;
        if (this.needPlayEndSound) {
            this.playingSound = true;
            if (this.groupCall == null) {
                Utilities.f21387e.c(new q(this, 9));
            } else {
                Utilities.f21387e.e(new q(this, 10), 100L);
                i3 = 500;
            }
            org.telegram.messenger.g0.i3(this.afterSoundRunnable, i3);
        }
        Runnable runnable2 = this.timeoutRunnable;
        if (runnable2 != null) {
            org.telegram.messenger.g0.r(runnable2);
            this.timeoutRunnable = null;
        }
        if (this.needPlayEndSound) {
            j10 = i3;
        } else {
            j10 = 0;
        }
        endConnectionServiceCall(j10);
        stopSelf();
    }

    public void callFailed() {
        NativeInstance nativeInstance = this.tgVoip[0];
        callFailed(nativeInstance != null ? nativeInstance.getLastError() : "ERROR_UNKNOWN");
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
                org.telegram.messenger.g0.r(runnable);
                this.shortPollRunnable = null;
            }
        }
    }

    private void checkIsNear() {
        if (this.remoteVideoState == 2 || this.videoState[0] == 2) {
            checkIsNear(false);
        }
    }

    public void checkUpdateBluetoothHeadset() {
        BluetoothAdapter bluetoothAdapter;
        boolean z10;
        boolean z11;
        boolean z12;
        if (!USE_CONNECTION_SERVICE && (bluetoothAdapter = this.btAdapter) != null && bluetoothAdapter.isEnabled()) {
            try {
                MediaRouter mediaRouter = (MediaRouter) getSystemService("media_router");
                AudioManager audioManager = (AudioManager) getSystemService("audio");
                int i3 = Build.VERSION.SDK_INT;
                int i10 = 0;
                if (i3 >= 31) {
                    AudioDeviceInfo findBluetoothDevice = VoipAudioManager.get().findBluetoothDevice();
                    if (findBluetoothDevice != null) {
                        this.currentBluetoothDeviceName = findBluetoothDevice.getProductName().toString();
                    }
                    if (findBluetoothDevice != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    updateBluetoothHeadsetState(z12);
                    ArrayList<StateListener> arrayList = this.stateListeners;
                    int size = arrayList.size();
                    while (i10 < size) {
                        StateListener stateListener = arrayList.get(i10);
                        i10++;
                        stateListener.onAudioSettingsChanged();
                    }
                } else if (i3 < 24) {
                    if (this.btAdapter.getProfileConnectionState(1) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    updateBluetoothHeadsetState(z11);
                    ArrayList<StateListener> arrayList2 = this.stateListeners;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        StateListener stateListener2 = arrayList2.get(i10);
                        i10++;
                        stateListener2.onAudioSettingsChanged();
                    }
                } else {
                    MediaRouter.RouteInfo selectedRoute = mediaRouter.getSelectedRoute(1);
                    if (nf.d("android.permission.BLUETOOTH_CONNECT") && selectedRoute.getDeviceType() == 3) {
                        if (this.btAdapter.getProfileConnectionState(1) == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        updateBluetoothHeadsetState(z10);
                        ArrayList<StateListener> arrayList3 = this.stateListeners;
                        int size3 = arrayList3.size();
                        while (i10 < size3) {
                            StateListener stateListener3 = arrayList3.get(i10);
                            i10++;
                            stateListener3.onAudioSettingsChanged();
                        }
                        return;
                    }
                    updateBluetoothHeadsetState(audioManager.isBluetoothA2dpOn());
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
    }

    private void configureDeviceForCall() {
        int i3;
        int i10;
        if (r2.f25040a) {
            p1.q(this.audioRouteToSet, new StringBuilder("configureDeviceForCall, route to set = "));
        }
        if (hasRtmpStream()) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        WebRtcAudioTrack.setAudioTrackUsageAttribute(i3);
        if (hasRtmpStream()) {
            i10 = Integer.MIN_VALUE;
        } else {
            i10 = 0;
        }
        WebRtcAudioTrack.setAudioStreamType(i10);
        this.needPlayEndSound = true;
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (!USE_CONNECTION_SERVICE) {
            Utilities.f21387e.c(new c0(this, audioManager, 1));
        }
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        if (defaultSensor != null) {
            try {
                this.proximityWakelock = ((PowerManager) getSystemService("power")).newWakeLock(32, "telegram-voip-prx");
                sensorManager.registerListener(this, defaultSensor, 3);
            } catch (Exception e10) {
                if (r2.f25040a) {
                    a8.e("Error initializing proximity sensor", e10);
                }
            }
        }
    }

    private int convertDataSavingMode(int i3) {
        if (i3 != 3) {
            return i3;
        }
        return org.telegram.messenger.t0.t() ? 1 : 0;
    }

    public static String convertStreamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb2.append(readLine);
                sb2.append("\n");
            } else {
                bufferedReader.close();
                return sb2.toString();
            }
        }
    }

    private void createGroupInstance(int i3, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        boolean z15;
        if (z10) {
            this.mySource[i3] = 0;
            if (i3 == 0) {
                this.switchingAccount = z10;
            }
        }
        cancelGroupCheckShortPoll();
        if (i3 == 0) {
            this.wasConnected = false;
        } else if (!this.wasConnected) {
            this.reconnectScreenCapture = true;
            return;
        }
        if (this.tgVoip[i3] == null) {
            if (this.groupCall != null) {
                str = "" + this.groupCall.f25049b.f27011id;
            } else {
                TLRPC.InputGroupCall inputGroupCall = this.joinConference;
                if (inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) {
                    str = inputGroupCall.slug;
                } else if (inputGroupCall instanceof TLRPC.TL_inputGroupCall) {
                    str = "" + this.joinConference.f27018id;
                } else {
                    str = "0";
                }
            }
            boolean[] zArr = {z11};
            boolean z16 = r2.f25040a;
            String d = n1.d("voip_" + i3 + "_" + str);
            NativeInstance[] nativeInstanceArr = this.tgVoip;
            long j10 = this.captureDevice[i3];
            if (i3 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i3 == 0 && az.I0) {
                z14 = true;
            } else {
                z14 = false;
            }
            k2.y yVar = new k2.y(this, i3, zArr, 5);
            m0 m0Var = new m0(this, i3, 0);
            m0 m0Var2 = new m0(this, i3, 1);
            m0 m0Var3 = new m0(this, i3, 2);
            m0 m0Var4 = new m0(this, i3, 3);
            i10 = 1;
            m0 m0Var5 = new m0(this, i3, 4);
            if (this.conference != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            nativeInstanceArr[i3] = NativeInstance.makeGroup(d, j10, z13, z14, yVar, m0Var, m0Var2, m0Var3, m0Var4, m0Var5, z15);
            this.tgVoip[i3].setOnStateUpdatedListener(new m0(this, i3, 5));
            z12 = true;
        } else {
            i10 = 1;
            z12 = false;
        }
        this.tgVoip[i3].resetGroupInstance(!z12, false);
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null && conferenceCall.getCallId() != -1) {
            this.tgVoip[i3].setConferenceCallId(this.conference.getCallId());
        }
        if (this.captureDevice[i3] != 0) {
            this.destroyCaptureDevice[i3] = false;
        }
        if (i3 == 0) {
            dispatchStateChanged(i10);
        }
    }

    private NativeInstance.SsrcGroup[] createSsrcGroups(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo) {
        if (tL_groupCallParticipantVideo.source_groups.isEmpty()) {
            return null;
        }
        int size = tL_groupCallParticipantVideo.source_groups.size();
        NativeInstance.SsrcGroup[] ssrcGroupArr = new NativeInstance.SsrcGroup[size];
        for (int i3 = 0; i3 < size; i3++) {
            ssrcGroupArr[i3] = new NativeInstance.SsrcGroup();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i3);
            NativeInstance.SsrcGroup ssrcGroup = ssrcGroupArr[i3];
            ssrcGroup.semantics = tL_groupCallParticipantVideoSourceGroup.semantics;
            ssrcGroup.ssrcs = new int[tL_groupCallParticipantVideoSourceGroup.sources.size()];
            int i10 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i3].ssrcs;
                if (i10 < iArr.length) {
                    iArr[i10] = tL_groupCallParticipantVideoSourceGroup.sources.get(i10).intValue();
                    i10++;
                }
            }
        }
        return ssrcGroupArr;
    }

    public void destroyConverting() {
        org.telegram.messenger.g0.r(this.destroyConvertingRunnable);
        if (this.convertingVoip != null) {
            a8.e("destroyConverting!!", new Exception());
            this.callStartTime = 0L;
            bz e10 = bz.e(this.currentAccount);
            int statsNetworkType = getStatsNetworkType();
            int[] iArr = e10.f21914n;
            iArr[statsNetworkType] = iArr[statsNetworkType] + (((int) (getCallDuration() / 1000)) % 5);
            e10.m();
            onTgVoipPreStop();
            Instance.FinalState stop = this.convertingVoip.stop();
            updateTrafficStats(this.convertingVoip, stop.trafficStats);
            onTgVoipStop(stop);
            Instance.destroyInstance();
            this.convertingVoip = null;
            for (int i3 = 0; i3 < this.stateListeners.size(); i3++) {
                this.stateListeners.get(i3).onStateChanged(getCallState());
            }
            NativeInstance nativeInstance = this.tgVoip[0];
            if (nativeInstance != null) {
                nativeInstance.setMuteMicrophone(this.micMute);
            }
        }
    }

    private void dispatchStateChanged(int i3) {
        CallConnection callConnection;
        if (r2.f25040a) {
            a8.b("== Call " + getCallID() + " state changed to " + i3 + " ==");
        }
        this.currentState = i3;
        if (i3 == 3) {
            destroyConverting();
        }
        if (USE_CONNECTION_SERVICE && i3 == 3 && (callConnection = this.systemCallConnection) != null) {
            callConnection.setActive();
        }
        for (int i10 = 0; i10 < this.stateListeners.size(); i10++) {
            this.stateListeners.get(i10).onStateChanged(i3);
        }
    }

    private void endConnectionServiceCall(long j10) {
        if (USE_CONNECTION_SERVICE) {
            q qVar = new q(this, 15);
            if (j10 > 0) {
                org.telegram.messenger.g0.i3(qVar, j10);
            } else {
                qVar.run();
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
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    private NetworkInfo getActiveNetworkInfo() {
        return ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
    }

    private int getCurrentForegroundType() {
        return getCurrentForegroundType(this, this.gotMediaProjection);
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

    public static Bitmap getRoundAvatarBitmap(Context context, int i3, TLObject tLObject) {
        u8 u8Var;
        TLRPC.ChatPhoto chatPhoto;
        Bitmap bitmap = null;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                    BitmapDrawable C = zb.D().C(user.photo.photo_small);
                    if (C != null) {
                        bitmap = C.getBitmap().copy(Bitmap.Config.ARGB_8888, true);
                    } else {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inMutable = true;
                        w7.G(i3);
                        bitmap = BitmapFactory.decodeFile(w7.K(user.photo.photo_small, null, true, true).toString(), options);
                    }
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                if (chat != null && (chatPhoto = chat.photo) != null && chatPhoto.photo_small != null) {
                    BitmapDrawable C2 = zb.D().C(chat.photo.photo_small);
                    if (C2 != null) {
                        bitmap = C2.getBitmap().copy(Bitmap.Config.ARGB_8888, true);
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inMutable = true;
                        w7.G(i3);
                        bitmap = BitmapFactory.decodeFile(w7.K(chat.photo.photo_small, null, true, true).toString(), options2);
                    }
                }
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        if (bitmap == null) {
            k6.T(context);
            if (tLObject instanceof TLRPC.User) {
                u8Var = new u8(0, (TLRPC.User) tLObject);
            } else {
                u8Var = new u8((TLRPC.Chat) tLObject);
            }
            bitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), Bitmap.Config.ARGB_8888);
            u8Var.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            u8Var.draw(new Canvas(bitmap));
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
        if (getSharedInstance() != null && getSharedInstance().groupCall != null && getSharedInstance().groupCall.f25049b.rtmp_stream) {
            return true;
        }
        return false;
    }

    private void initializeAccountRelatedThings() {
        updateServerConfig();
        hs.f(this.currentAccount).b(this, hs.I2);
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
        int i3 = this.currentState;
        if (i3 != 11 && i3 != 4) {
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

    public static void lambda$acceptIncomingCall$100() {
        hs.e().k(hs.f23321v2, new Object[0]);
    }

    public void lambda$acceptIncomingCall$101(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            if (r2.f25040a) {
                a8.l("accept call ok! " + tLObject);
            }
            TL_phone.PhoneCall phoneCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
            this.privateCall = phoneCall;
            if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
                onCallUpdated(phoneCall);
                return;
            }
            return;
        }
        if (r2.f25040a) {
            a8.d("Error on phone.acceptCall: " + tL_error);
        }
        callFailed();
    }

    public void lambda$acceptIncomingCall$102(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new z(2, this, tLObject, tL_error));
    }

    public void lambda$acceptIncomingCall$103(qr qrVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
            if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                byte[] bArr = messages_dhconfig.f27158p;
                int i3 = messages_dhconfig.f27157g;
                Pattern pattern = Utilities.f21384a;
                if (!ConnectionsManager.native_isGoodPrime(bArr, i3)) {
                    if (r2.f25040a) {
                        a8.d("stopping VoIP service, bad prime");
                    }
                    callFailed();
                    return;
                }
                byte[] bArr2 = messages_dhconfig.f27158p;
                qrVar.H();
                qrVar.f24949y = bArr2;
                int i10 = messages_dhconfig.f27157g;
                qrVar.H();
                qrVar.E = i10;
                int i11 = messages_dhconfig.version;
                qrVar.H();
                qrVar.f24948x = i11;
                qr a02 = qr.a0(this.currentAccount);
                qrVar.H();
                int i12 = qrVar.f24948x;
                qrVar.H();
                int i13 = qrVar.E;
                qrVar.H();
                a02.f24934a.c(new k2.a0(a02, i12, i13, qrVar.f24949y, 7));
            }
            byte[] bArr3 = new byte[256];
            for (int i14 = 0; i14 < 256; i14++) {
                bArr3[i14] = (byte) (((byte) (Utilities.f21385b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i14]);
            }
            if (this.privateCall == null) {
                if (r2.f25040a) {
                    a8.d("call is null");
                }
                callFailed();
                return;
            }
            this.a_or_b = bArr3;
            qrVar.H();
            BigInteger valueOf = BigInteger.valueOf(qrVar.E);
            qrVar.H();
            BigInteger modPow = valueOf.modPow(new BigInteger(1, bArr3), new BigInteger(1, qrVar.f24949y));
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
            tL_inputPhoneCall.f27066id = phoneCall.f27229id;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol = new TL_phone.TL_phoneCallProtocol();
            acceptcall.protocol = tL_phoneCallProtocol;
            tL_phoneCallProtocol.udp_reflector = true;
            tL_phoneCallProtocol.udp_p2p = true;
            tL_phoneCallProtocol.min_layer = 65;
            tL_phoneCallProtocol.max_layer = Instance.getConnectionMaxLayer();
            Collections.addAll(acceptcall.protocol.library_versions, NativeInstance.getAllVersions());
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(acceptcall, new s(this, 8), 65536);
            return;
        }
        callFailed();
    }

    public void lambda$acknowledgeCall$12(TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        if (sharedInstance != null) {
            if (r2.f25040a) {
                a8.l("receivedCall response = " + tLObject);
            }
            if (tL_error != null) {
                if (r2.f25040a) {
                    a8.d("error on receivedCall: " + tL_error);
                }
                stopSelf();
                return;
            }
            if (USE_CONNECTION_SERVICE) {
                g5 r5 = g5.r(this.currentAccount);
                TLRPC.User user = this.user;
                r5.g(user.f27150id, user.first_name, user.last_name);
                ((TelecomManager) getSystemService("telecom")).addNewIncomingCall(addAccountToTelecomManager(), f1.k(1, "call_type"));
            }
            if (z10) {
                startRinging();
            }
        }
    }

    public void lambda$acknowledgeCall$13(boolean z10, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new r0(this, tLObject, tL_error, z10, 1));
    }

    public void lambda$callEnded$123() {
        dispatchStateChanged(11);
    }

    public void lambda$callEnded$124() {
        int i3 = this.spPlayId;
        if (i3 != 0) {
            this.soundPool.stop(i3);
            this.spPlayId = 0;
        }
    }

    public void lambda$callEnded$125() {
        this.soundPool.play(this.spEndId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void lambda$callEnded$126() {
        this.soundPool.play(this.spVoiceChatEndId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public static void lambda$callFailed$114(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (r2.f25040a) {
                a8.d("error on phone.discardCall: " + tL_error);
            }
        } else if (r2.f25040a) {
            a8.b("phone.discardCall " + tLObject);
        }
    }

    public void lambda$callFailed$115() {
        dispatchStateChanged(4);
    }

    public void lambda$callFailed$116() {
        this.soundPool.play(this.spFailedID, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public static void lambda$configureDeviceForCall$110() {
        if (!MediaController.B().H()) {
            MediaController.B().R(MediaController.B().f21348v0, true);
        }
    }

    public void lambda$configureDeviceForCall$111(AudioManager audioManager) {
        boolean z10;
        if (audioManager.requestAudioFocus(this, 0, 2) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.hasAudioFocus = z10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (isBluetoothHeadsetConnected() && hasEarpiece()) {
            int i3 = this.audioRouteToSet;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (!this.bluetoothScoActive) {
                            this.needSwitchToBluetoothAfterScoActivates = true;
                            try {
                                voipAudioManager.startBluetooth();
                            } catch (Throwable th2) {
                                a8.g(th2, true);
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
        } else if (isBluetoothHeadsetConnected()) {
            voipAudioManager.setBluetoothOn(this.speakerphoneStateToSet);
        } else {
            voipAudioManager.setSpeakerphoneOn(this.speakerphoneStateToSet);
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
        updateOutputGainControlState();
        this.audioConfigured = true;
    }

    public void lambda$configureDeviceForCall$112(AudioManager audioManager) {
        try {
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (hasRtmpStream()) {
            audioManager.setMode(0);
            VoipAudioManager.get().setBluetoothOn(false);
            org.telegram.messenger.g0.h3(new i(4));
            return;
        }
        audioManager.setMode(3);
        org.telegram.messenger.g0.h3(new c0(this, audioManager, 0));
    }

    public void lambda$convertToConferenceCall$30() {
        startConferenceGroupCall(true, 0, null, false);
    }

    public void lambda$createGroupInstance$66(int i3, boolean[] zArr, int i10, String str) {
        if (i3 == 0) {
            if (this.conference != null) {
                startConferenceGroupCall(false, i10, str, !zArr[0]);
            } else {
                startGroupCall(i10, str, true);
            }
            zArr[0] = false;
            return;
        }
        startScreenCapture(i10, str);
    }

    public void lambda$createGroupInstance$68(int i3, int[] iArr, float[] fArr, boolean[] zArr) {
        r3 r3Var;
        boolean z10;
        int i10;
        int i11;
        TLRPC.GroupCallParticipant groupCallParticipant;
        long j10;
        long j11;
        boolean z11;
        String str;
        String str2;
        String str3;
        String str4;
        if (sharedInstance != null && (r3Var = this.groupCall) != null && i3 == 0) {
            p3 p3Var = r3Var.Q;
            a0.h hVar = r3Var.P;
            int currentTime = ConnectionsManager.getInstance(r3Var.C.f21919a).getCurrentTime();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long uptimeMillis = SystemClock.uptimeMillis();
            int i12 = 1;
            int i13 = 0;
            hs.f(r3Var.C.f21919a).k(hs.B2, Long.valueOf(elapsedRealtime));
            boolean z12 = false;
            boolean z13 = false;
            ArrayList arrayList = null;
            while (true) {
                z10 = z12;
                if (i13 >= iArr.length) {
                    break;
                }
                int i14 = iArr[i13];
                if (i14 == 0) {
                    i11 = i13;
                    groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(r3Var.h());
                } else {
                    i11 = i13;
                    groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.f25061p.get(i14);
                }
                if (groupCallParticipant != null) {
                    boolean z14 = zArr[i11];
                    groupCallParticipant.hasVoice = z14;
                    z11 = z13;
                    if (z14 || elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime > 500) {
                        groupCallParticipant.hasVoiceDelayed = z14;
                        groupCallParticipant.lastVoiceUpdateTime = elapsedRealtime;
                    }
                    long C1 = zi.C1(groupCallParticipant.peer);
                    float f10 = fArr[i11];
                    j10 = elapsedRealtime;
                    if (f10 > 0.1f) {
                        if (zArr[i11] && groupCallParticipant.lastTypingDate + 1 < currentTime) {
                            if (j10 != groupCallParticipant.lastVisibleDate) {
                                groupCallParticipant.active_date = currentTime;
                            }
                            groupCallParticipant.lastTypingDate = currentTime;
                            z10 = true;
                        }
                        groupCallParticipant.lastSpeakTime = uptimeMillis;
                        groupCallParticipant.amplitude = f10;
                        if (hVar.g(null, C1) == null) {
                            if (C1 > 0) {
                                TLRPC.User a22 = hp.s1(r3Var.C.f21919a).a2(Long.valueOf(C1));
                                StringBuilder t10 = a1.g.t(C1, "add to current speaking ", " ");
                                if (a22 == null) {
                                    str4 = null;
                                } else {
                                    str4 = a22.first_name;
                                }
                                t10.append(str4);
                                Log.d("GroupCall", t10.toString());
                                j11 = uptimeMillis;
                            } else {
                                j11 = uptimeMillis;
                                TLRPC.Chat M0 = hp.s1(r3Var.C.f21919a).M0(Long.valueOf(-C1));
                                StringBuilder t11 = a1.g.t(C1, "add to current speaking ", " ");
                                if (M0 == null) {
                                    str3 = null;
                                } else {
                                    str3 = M0.title;
                                }
                                t11.append(str3);
                                Log.d("GroupCall", t11.toString());
                            }
                            hVar.k(groupCallParticipant, C1);
                            z11 = true;
                        } else {
                            j11 = uptimeMillis;
                        }
                    } else {
                        j11 = uptimeMillis;
                        if (j11 - groupCallParticipant.lastSpeakTime >= 500 && hVar.g(null, C1) != null) {
                            hVar.l(C1);
                            if (C1 > 0) {
                                TLRPC.User a23 = hp.s1(r3Var.C.f21919a).a2(Long.valueOf(C1));
                                StringBuilder t12 = a1.g.t(C1, "remove from speaking ", " ");
                                if (a23 == null) {
                                    str2 = null;
                                } else {
                                    str2 = a23.first_name;
                                }
                                t12.append(str2);
                                Log.d("GroupCall", t12.toString());
                            } else {
                                TLRPC.Chat M02 = hp.s1(r3Var.C.f21919a).M0(Long.valueOf(-C1));
                                StringBuilder t13 = a1.g.t(C1, "remove from speaking ", " ");
                                if (M02 == null) {
                                    str = null;
                                } else {
                                    str = M02.title;
                                }
                                t13.append(str);
                                Log.d("GroupCall", t13.toString());
                            }
                            z11 = true;
                        }
                        groupCallParticipant.amplitude = 0.0f;
                    }
                } else {
                    j10 = elapsedRealtime;
                    j11 = uptimeMillis;
                    z11 = z13;
                    ArrayList arrayList2 = arrayList;
                    if (iArr[i11] != 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(Long.valueOf(iArr[i11]));
                        arrayList = arrayList2;
                    }
                }
                z12 = z10;
                z13 = z11;
                i13 = i11 + 1;
                elapsedRealtime = j10;
                uptimeMillis = j11;
            }
            boolean z15 = z13;
            ArrayList arrayList3 = arrayList;
            if (arrayList3 != null) {
                r3Var.l(arrayList3, false, null);
            }
            if (z10) {
                r3Var.z();
                hs.f(r3Var.C.f21919a).k(hs.f23328w2, Long.valueOf(r3Var.f25050c), Long.valueOf(r3Var.f25049b.f27011id), Boolean.FALSE);
            }
            if (z15) {
                if (hVar.m() > 0) {
                    org.telegram.messenger.g0.r(p3Var);
                    org.telegram.messenger.g0.i3(p3Var, 550L);
                }
                hs.f(r3Var.C.f21919a).k(hs.f23342y2, Long.valueOf(r3Var.f25050c), Long.valueOf(r3Var.f25049b.f27011id), Boolean.FALSE);
            }
            float f11 = 0.0f;
            boolean z16 = false;
            int i15 = 0;
            while (i15 < iArr.length) {
                if (iArr[i15] == 0) {
                    if (this.chat != null && this.lastTypingTimeSend < SystemClock.uptimeMillis() - 5000 && fArr[i15] > 0.1f && zArr[i15]) {
                        this.lastTypingTimeSend = SystemClock.uptimeMillis();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        tL_messages_setTyping.action = new TLRPC.TL_speakingInGroupCallAction();
                        tL_messages_setTyping.peer = hp.l1(this.chat);
                        i10 = i12;
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setTyping, new y(i10));
                    } else {
                        i10 = i12;
                    }
                    hs e10 = hs.e();
                    Object[] objArr = new Object[i10];
                    objArr[0] = Float.valueOf(fArr[i15]);
                    e10.k(hs.N4, objArr);
                } else {
                    f11 = Math.max(f11, fArr[i15]);
                    z16 = true;
                }
                i15++;
                i12 = 1;
            }
            if (z16) {
                hs.e().k(hs.O4, Float.valueOf(f11));
                NativeInstance.AudioLevelsCallback audioLevelsCallback2 = audioLevelsCallback;
                if (audioLevelsCallback2 != null) {
                    audioLevelsCallback2.run(iArr, fArr, zArr);
                }
            }
        }
    }

    public void lambda$createGroupInstance$69(long j10, int[] iArr, ArrayList arrayList) {
        if (sharedInstance != null && this.groupCall != null) {
            broadcastUnknownParticipants(j10, iArr);
        }
    }

    public void lambda$createGroupInstance$70(int i3, long j10, int[] iArr) {
        r3 r3Var;
        if (sharedInstance != null && (r3Var = this.groupCall) != null && i3 == 0) {
            ci.i iVar = new ci.i(this, j10, iArr, 3);
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < iArr.length; i10++) {
                if (r3Var.f25061p.get(iArr[i10]) == null && r3Var.f25062q.get(iArr[i10]) == null && r3Var.f25063r.get(iArr[i10]) == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Long.valueOf(iArr[i10]));
                }
            }
            if (arrayList == null) {
                ((VoIPService) iVar.f5265c).lambda$createGroupInstance$69(iVar.f5264b, (int[]) iVar.d, null);
            } else {
                r3Var.l(arrayList, false, iVar);
            }
        }
    }

    public void lambda$createGroupInstance$71(String str) {
        this.currentStreamRequestTimestamp.remove(str);
    }

    public void lambda$createGroupInstance$72(int i3) {
        createGroupInstance(i3, false, true);
    }

    public void lambda$createGroupInstance$73(String str, int i3, long j10, int i10, int i11, TLObject tLObject, TLRPC.TL_error tL_error, long j11) {
        int i12;
        org.telegram.messenger.g0.h3(new m2.s(28, this, str));
        NativeInstance nativeInstance = this.tgVoip[i3];
        if (nativeInstance == null) {
            return;
        }
        if (tLObject != null) {
            NativeByteBuffer nativeByteBuffer = ((TLRPC.TL_upload_file) tLObject).bytes;
            nativeInstance.onStreamPartAvailable(j10, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j11, i10, i11);
        } else if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
            org.telegram.messenger.g0.h3(new x(this, i3, 4));
        } else {
            if (!"TIME_TOO_BIG".equals(tL_error.text) && !tL_error.text.startsWith("FLOOD_WAIT")) {
                i12 = -1;
            } else {
                i12 = 0;
            }
            this.tgVoip[i3].onStreamPartAvailable(j10, null, i12, j11, i10, i11);
        }
    }

    public void lambda$createGroupInstance$74(String str, int i3) {
        this.currentStreamRequestTimestamp.put(str, Integer.valueOf(i3));
    }

    public void lambda$createGroupInstance$75(final int i3, final long j10, long j11, final int i10, final int i11) {
        String str;
        if (i3 != 0) {
            return;
        }
        TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
        tL_upload_getFile.limit = 131072;
        TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
        r3 r3Var = this.groupCall;
        tL_inputGroupCallStream.call = r3Var.g(r3Var.f25048a);
        tL_inputGroupCallStream.time_ms = j10;
        if (j11 == 500) {
            tL_inputGroupCallStream.scale = 1;
        }
        if (i10 != 0) {
            tL_inputGroupCallStream.flags |= 1;
            tL_inputGroupCallStream.video_channel = i10;
            tL_inputGroupCallStream.video_quality = i11;
        }
        tL_upload_getFile.location = tL_inputGroupCallStream;
        if (i10 == 0) {
            str = a1.g.p(j10, "");
        } else {
            str = i10 + "_" + j10 + "_" + i11;
        }
        final String str2 = str;
        org.telegram.messenger.g0.h3(new e3(this, str2, ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.currentAccount).f21919a).sendRequest(tL_upload_getFile, new RequestDelegateTimestamp() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j12) {
                VoIPService.this.lambda$createGroupInstance$73(str2, i3, j10, i10, i11, tLObject, tL_error, j12);
            }
        }, 65536, 2, this.groupCall.f25049b.stream_dc_id), 25));
    }

    public void lambda$createGroupInstance$76(int i3, long j10, int i10) {
        String str;
        if (i3 == 0) {
            str = a1.g.p(j10, "");
        } else {
            str = i3 + "_" + j10 + "_" + i10;
        }
        Integer num = this.currentStreamRequestTimestamp.get(str);
        if (num != null) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.currentAccount).f21919a).cancelRequest(num.intValue(), true);
            this.currentStreamRequestTimestamp.remove(str);
        }
    }

    public void lambda$createGroupInstance$77(int i3, long j10, long j11, int i10, int i11) {
        if (i3 != 0) {
            return;
        }
        org.telegram.messenger.g0.h3(new d1(i10, i11, 3, j10, this));
    }

    public void lambda$createGroupInstance$78(int i3, long j10, TLObject tLObject, TLRPC.TL_error tL_error, long j11) {
        long j12 = 0;
        if (tL_error == null) {
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            if (!groupcallstreamchannels.channels.isEmpty()) {
                j12 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            }
            r3 r3Var = this.groupCall;
            if (!r3Var.B) {
                r3Var.f(groupcallstreamchannels.channels);
                this.groupCall.B = true;
            }
        }
        NativeInstance nativeInstance = this.tgVoip[i3];
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j10, j12);
        }
    }

    public void lambda$createGroupInstance$79(int i3, long j10) {
        TLRPC.GroupCall groupCall;
        r3 r3Var = this.groupCall;
        if (r3Var != null && (groupCall = r3Var.f25049b) != null && groupCall.rtmp_stream) {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            r3 r3Var2 = this.groupCall;
            getgroupcallstreamchannels.call = r3Var2.g(r3Var2.f25048a);
            r3 r3Var3 = this.groupCall;
            if (r3Var3 != null && r3Var3.f25049b != null && this.tgVoip[i3] != null) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamchannels, new b4.o(this, i3, j10, 4), 65536, 2, this.groupCall.f25049b.stream_dc_id);
                return;
            }
            NativeInstance nativeInstance = this.tgVoip[i3];
            if (nativeInstance != null) {
                nativeInstance.onRequestTimeComplete(j10, 0L);
                return;
            }
            return;
        }
        NativeInstance nativeInstance2 = this.tgVoip[i3];
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(j10, ConnectionsManager.getInstance(this.currentAccount).getCurrentTimeMillis());
        }
    }

    public void lambda$declineIncomingCall$104() {
        if (this.currentState == 10) {
            callEnded();
        }
    }

    public void lambda$declineIncomingCall$105(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (r2.f25040a) {
                a8.d("error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_updates) {
            hp.s1(this.currentAccount).O3((TLRPC.TL_updates) tLObject, false);
        }
        if (r2.f25040a) {
            a8.b("phone.discardCall " + tLObject);
        }
    }

    public void lambda$editCallMember$90(int i3, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            hp.s1(org.telegram.messenger.c.a(i3).f21919a).O3((TLRPC.Updates) tLObject, false);
        } else if (tL_error != null && "GROUPCALL_VIDEO_TOO_MUCH".equals(tL_error.text)) {
            this.groupCall.s();
        }
        if (runnable != null) {
            org.telegram.messenger.g0.h3(runnable);
        }
    }

    public void lambda$endConnectionServiceCall$127() {
        CallConnection callConnection = this.systemCallConnection;
        if (callConnection != null) {
            int i3 = this.callDiscardReason;
            int i10 = 2;
            if (i3 != 1) {
                if (i3 != 2) {
                    int i11 = 4;
                    if (i3 != 3) {
                        if (i3 != 4) {
                            callConnection.setDisconnected(new DisconnectCause(3));
                        } else {
                            callConnection.setDisconnected(new DisconnectCause(7));
                        }
                    } else {
                        if (!this.isOutgoing) {
                            i11 = 5;
                        }
                        callConnection.setDisconnected(new DisconnectCause(i11));
                    }
                } else {
                    callConnection.setDisconnected(new DisconnectCause(1));
                }
            } else {
                if (!this.isOutgoing) {
                    i10 = 6;
                }
                callConnection.setDisconnected(new DisconnectCause(i10));
            }
            this.systemCallConnection.destroy();
            this.systemCallConnection = null;
        }
    }

    public void lambda$getConnectionAndStartCall$106() {
        this.delayedStartOutgoingCall = null;
        startOutgoingCall();
    }

    public void lambda$hangUp$4(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_updates) {
            hp.s1(this.currentAccount).O3((TLRPC.TL_updates) tLObject, false);
        }
    }

    public void lambda$hangUp$5(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_updates) {
            hp.s1(this.currentAccount).O3((TLRPC.TL_updates) tLObject, false);
        }
    }

    public void lambda$initiateActualEncryptedCall$84() {
        Toast.makeText(this, "This call uses TCP which will degrade its quality.", 0).show();
    }

    public void lambda$initiateActualEncryptedCall$85(int[] iArr, float[] fArr, boolean[] zArr) {
        if (sharedInstance != null && this.privateCall != null) {
            hs.e().k(hs.N4, Float.valueOf(fArr[0]));
            hs.e().k(hs.O4, Float.valueOf(fArr[1]));
        }
    }

    public void lambda$initiateActualEncryptedCall$86(int i3, int i10) {
        this.remoteAudioState = i3;
        this.remoteVideoState = i10;
        checkIsNear();
        for (int i11 = 0; i11 < this.stateListeners.size(); i11++) {
            this.stateListeners.get(i11).onMediaStateUpdated(i3, i10);
        }
    }

    public void lambda$initiateActualEncryptedCall$87(int i3, int i10) {
        org.telegram.messenger.g0.h3(new k2.u(this, i3, i10, 7));
    }

    public void lambda$loadResources$109() {
        SoundPool soundPool = new SoundPool(1, 0, 0);
        this.soundPool = soundPool;
        this.spConnectingId = soundPool.load(this, 2131624341, 1);
        this.spRingbackID = this.soundPool.load(this, 2131624351, 1);
        this.spFailedID = this.soundPool.load(this, 2131624343, 1);
        this.spEndId = this.soundPool.load(this, 2131624342, 1);
        this.spBusyId = this.soundPool.load(this, 2131624340, 1);
        this.spVoiceChatEndId = this.soundPool.load(this, 2131624338, 1);
        this.spVoiceChatStartId = this.soundPool.load(this, 2131624337, 1);
        this.spVoiceChatConnecting = this.soundPool.load(this, 2131624336, 1);
        this.spAllowTalkId = this.soundPool.load(this, 2131624347, 1);
        this.spStartRecordId = this.soundPool.load(this, 2131624350, 1);
    }

    public void lambda$onCallUpdated$16() {
        this.soundPool.play(this.spBusyId, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public void lambda$onCallUpdated$17() {
        int i3 = this.spPlayId;
        if (i3 != 0) {
            this.soundPool.stop(i3);
        }
        this.spPlayId = this.soundPool.play(this.spRingbackID, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public void lambda$onCallUpdated$18() {
        this.timeoutRunnable = null;
        declineIncomingCall(3, null);
    }

    public void lambda$onConnectionStateChanged$117() {
        int i3 = this.spPlayId;
        if (i3 != 0) {
            this.soundPool.stop(i3);
            this.spPlayId = 0;
        }
    }

    public void lambda$onConnectionStateChanged$118() {
        int i3;
        int i10 = this.spPlayId;
        if (i10 != 0) {
            this.soundPool.stop(i10);
        }
        SoundPool soundPool = this.soundPool;
        if (this.groupCall != null) {
            i3 = this.spVoiceChatConnecting;
        } else {
            i3 = this.spConnectingId;
        }
        this.spPlayId = soundPool.play(i3, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public void lambda$onConnectionStateChanged$119(int i3) {
        if (this.convertingVoip != null) {
            return;
        }
        if (i3 == 3 && this.callStartTime == 0) {
            this.callStartTime = SystemClock.elapsedRealtime();
        }
        if (i3 == 4) {
            callFailed();
            return;
        }
        if (i3 == 3) {
            Runnable runnable = this.connectingSoundRunnable;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.connectingSoundRunnable = null;
            }
            Utilities.f21387e.c(new q(this, 28));
            if (this.groupCall == null && !this.wasEstablished) {
                this.wasEstablished = true;
                if (!this.isProximityNear && !this.privateCall.video) {
                    try {
                        LaunchActivity.Q().getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                org.telegram.messenger.g0.i3(new Runnable() {
                    {
                        VoIPService.this = this;
                    }

                    @Override
                    public void run() {
                        if (VoIPService.this.tgVoip[0] != null) {
                            bz e10 = bz.e(VoIPService.this.currentAccount);
                            int statsNetworkType = VoIPService.this.getStatsNetworkType();
                            int[] iArr = e10.f21914n;
                            iArr[statsNetworkType] = iArr[statsNetworkType] + 5;
                            e10.m();
                            org.telegram.messenger.g0.i3(this, 5000L);
                        }
                    }
                }, 5000L);
                if (this.isOutgoing) {
                    bz.e(this.currentAccount).k(getStatsNetworkType(), 0, 1);
                } else {
                    bz.e(this.currentAccount).i(getStatsNetworkType(), 0, 1);
                }
            }
        }
        if (i3 == 5 && !this.isCallEnded) {
            Utilities.f21387e.c(new n0(this, 2));
        }
        dispatchStateChanged(i3);
    }

    public void lambda$onCreate$108(AudioDeviceInfo audioDeviceInfo) {
        int i3 = 0;
        this.bluetoothScoConnecting = false;
        boolean isBluetoothDevice = VoipAudioManager.isBluetoothDevice(audioDeviceInfo);
        this.bluetoothScoActive = isBluetoothDevice;
        if (isBluetoothDevice) {
            this.needSwitchToBluetoothAfterScoActivates = false;
            this.currentBluetoothDeviceName = audioDeviceInfo.getProductName().toString();
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i3 < size) {
            StateListener stateListener = arrayList.get(i3);
            i3++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public static void lambda$onDestroy$97() {
        hs.e().k(hs.D2, new Object[0]);
    }

    public static void lambda$onDestroy$98(AudioManager audioManager) {
        synchronized (sync) {
            try {
                if (setModeRunnable == null) {
                    return;
                }
                setModeRunnable = null;
                try {
                    audioManager.setMode(0);
                } catch (SecurityException e10) {
                    if (r2.f25040a) {
                        a8.e("Error setting audio more to normal", e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void lambda$onDestroy$99() {
        SoundPool soundPool = this.soundPool;
        if (soundPool != null) {
            soundPool.release();
        }
    }

    public void lambda$onSignalBarCountChanged$122(int i3) {
        this.signalBarCount = i3;
        for (int i10 = 0; i10 < this.stateListeners.size(); i10++) {
            this.stateListeners.get(i10).onSignalBarsCountChanged(i3);
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
        hs.f(this.currentAccount).k(hs.M4, new Object[0]);
    }

    public void lambda$playAllowTalkSound$121() {
        this.soundPool.play(this.spAllowTalkId, 0.5f, 0.5f, 0, 0, 1.0f);
    }

    public void lambda$playConnectedSound$88() {
        this.soundPool.play(this.spVoiceChatStartId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void lambda$playStartRecordSound$120() {
        this.soundPool.play(this.spStartRecordId, 0.5f, 0.5f, 0, 0, 1.0f);
    }

    public void lambda$processAcceptedCall$19(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            callFailed();
            return;
        }
        this.privateCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
        initiateActualEncryptedCall();
    }

    public void lambda$processAcceptedCall$20(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new z(1, this, tLObject, tL_error));
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

    public void lambda$startConferenceGroupCall$31(TLObject tLObject, org.telegram.messenger.c cVar, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            hp.s1(this.currentAccount).Y3(updates.users, false);
            hp.s1(this.currentAccount).S3(updates.chats, false);
            ArrayList z02 = hp.z0(updates, TL_update.TL_updateGroupCall.class);
            int size = z02.size();
            TLRPC.GroupCall groupCall = null;
            int i3 = 0;
            while (i3 < size) {
                Object obj = z02.get(i3);
                i3++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (groupCall != null) {
                try {
                    this.groupCallBottomSheetLatch.await(800L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    a8.g(e10, true);
                }
                this.groupCall.v(cVar, groupCall);
                this.groupCall.k(true);
                hp.s1(this.currentAccount).W3(0L, this.groupCall);
                this.conference.inputGroupCall = new TLRPC.TL_inputGroupCall();
                ConferenceCall conferenceCall = this.conference;
                TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
                inputGroupCall.f27018id = groupCall.f27011id;
                inputGroupCall.access_hash = groupCall.access_hash;
                dg.d.a(conferenceCall.groupCall, groupCall);
                conferenceCall.groupCall = groupCall;
                startConferenceGroupCall(false, 0, null, false);
                HashSet<Long> hashSet = this.inviteUsersToConference;
                if (hashSet != null) {
                    Iterator<Long> it = hashSet.iterator();
                    while (it.hasNext()) {
                        long longValue = it.next().longValue();
                        r3 r3Var = this.groupCall;
                        if (r3Var != null) {
                            r3Var.a(longValue);
                        }
                    }
                }
                zb1 zb1Var = zb1.f52603o1;
                if (zb1Var != null) {
                    zb1Var.f();
                }
                x30.e1(LaunchActivity.K1, org.telegram.messenger.c.a(this.currentAccount), null, null, false, null);
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            try {
                this.groupCallBottomSheetLatch.await(800L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e11) {
                a8.g(e11, true);
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            this.groupCall.u(cVar, 0L, groupcall);
            this.groupCall.k(true);
            hp.s1(this.currentAccount).W3(0L, this.groupCall);
            this.conference.inputGroupCall = new TLRPC.TL_inputGroupCall();
            ConferenceCall conferenceCall2 = this.conference;
            TLRPC.InputGroupCall inputGroupCall2 = conferenceCall2.inputGroupCall;
            TLRPC.GroupCall groupCall2 = groupcall.call;
            inputGroupCall2.f27018id = groupCall2.f27011id;
            inputGroupCall2.access_hash = groupCall2.access_hash;
            conferenceCall2.groupCall = groupCall2;
            startConferenceGroupCall(false, 0, null, false);
            HashSet<Long> hashSet2 = this.inviteUsersToConference;
            if (hashSet2 != null) {
                Iterator<Long> it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    long longValue2 = it2.next().longValue();
                    r3 r3Var2 = this.groupCall;
                    if (r3Var2 != null) {
                        r3Var2.a(longValue2);
                    }
                }
            }
            zb1 zb1Var2 = zb1.f52603o1;
            if (zb1Var2 != null) {
                zb1Var2.f();
            }
            x30.e1(LaunchActivity.K1, org.telegram.messenger.c.a(this.currentAccount), null, null, false, null);
        } else {
            hs.f(this.currentAccount).k(hs.M0, 6, tL_error.text);
            hangUp(0);
        }
    }

    public void lambda$startConferenceGroupCall$32(org.telegram.messenger.c cVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new k(this, tLObject, cVar, tL_error, 3));
    }

    public void lambda$startConferenceGroupCall$33(TLObject tLObject, int i3, String str, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            hp.s1(this.currentAccount).Y3(groupcall.users, false);
            hp.s1(this.currentAccount).S3(groupcall.chats, false);
            this.groupCall.u(org.telegram.messenger.c.a(this.currentAccount), 0L, groupcall);
            ConferenceCall conferenceCall = this.conference;
            conferenceCall.groupCall = groupcall.call;
            conferenceCall.inputGroupCall = this.joinConference;
            startConferenceGroupCall(false, i3, str, false);
        } else if (tL_error != null) {
            hs.f(this.currentAccount).k(hs.M0, 6, tL_error.text);
            hangUp(0);
        }
    }

    public void lambda$startConferenceGroupCall$34(int i3, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new ai.p1(this, tLObject, i3, str, tL_error, 9));
    }

    public static void lambda$startConferenceGroupCall$35() {
        hs.e().k(hs.f23321v2, new Object[0]);
    }

    public void lambda$startConferenceGroupCall$36(int i3) {
        this.mySource[0] = i3;
    }

    public void lambda$startConferenceGroupCall$37(TLRPC.GroupCallParticipant groupCallParticipant) {
        this.mySource[0] = groupCallParticipant.source;
    }

    public void lambda$startConferenceGroupCall$38(TLRPC.Updates updates, long j10) {
        int i3;
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i3 = message.f27022id;
            }
            i3 = 0;
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i3 = ((TL_update.TL_updateMessageID) update).f27259id;
        } else {
            if (updates.updates != null) {
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update2 = updates.updates.get(i10);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                        if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                            i3 = message2.f27022id;
                            break;
                        }
                    } else if (update2 instanceof TL_update.TL_updateMessageID) {
                        i3 = ((TL_update.TL_updateMessageID) update2).f27259id;
                        break;
                    }
                }
            }
            i3 = 0;
        }
        r3 r3Var = this.groupCall;
        if (r3Var != null && i3 != 0) {
            HashMap hashMap = r3Var.f25056k;
            Long valueOf = Long.valueOf(j10);
            ?? obj = new Object();
            obj.f24848a = i3;
            obj.f24849b = true;
            obj.f24850c = System.currentTimeMillis();
            hashMap.put(valueOf, obj);
            hs.f(this.currentAccount).k(hs.f23328w2, 0L, Long.valueOf(this.groupCall.f25049b.f27011id), Boolean.FALSE);
        }
    }

    public void lambda$startConferenceGroupCall$39(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        d2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        vg.i0 i0Var = new vg.i0(34, this.currentAccount, T.getContext(), T, new ei.k0());
        i0Var.C1(null, arrayList, arrayList2, arrayList3, str);
        i0Var.show();
    }

    public static void lambda$startConferenceGroupCall$40(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i3 = 0; i3 < Math.min(arrayList.size(), vector.objects.size()); i3++) {
                if (vector.objects.get(i3) instanceof TL_account.requirementToContactPremium) {
                    arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i3)).f27150id));
                }
            }
        }
        runnable.run();
    }

    public static void lambda$startConferenceGroupCall$41(ArrayList arrayList, ArrayList arrayList2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new p(tLObject, arrayList, arrayList2, runnable, 1));
    }

    public void lambda$startConferenceGroupCall$42(HashSet hashSet, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            r3 r3Var = this.groupCall;
            if (r3Var != null) {
                r3Var.t(longValue);
            }
            arrayList.add(hp.s1(this.currentAccount).a2(l10));
            ArrayList<TLRPC.InputUser> arrayList4 = getrequirementstocontact.f27210id;
            hp s12 = hp.s1(this.currentAccount);
            arrayList4.add(s12.q1(s12.a2(l10)));
        }
        v vVar = new v(this, arrayList, arrayList2, arrayList3, str, 1);
        if (h10.i(this.currentAccount).q()) {
            vVar.run();
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getrequirementstocontact, new m(arrayList, arrayList2, vVar, 4));
        }
    }

    public void lambda$startConferenceGroupCall$43(long j10, HashSet hashSet, AtomicInteger atomicInteger, int i3, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            hp.s1(this.currentAccount).O3(updates, false);
            org.telegram.messenger.g0.h3(new t(this, updates, j10, 0));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() == i3 && !hashSet.isEmpty()) {
            org.telegram.messenger.g0.h3(new u(this, hashSet, str, 0));
        }
    }

    public void lambda$startConferenceGroupCall$44(TLObject tLObject, TL_phone.PhoneCall phoneCall, TL_phone.exportGroupCallInvite exportgroupcallinvite) {
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            TL_phone.exportedGroupCallInvite exportedgroupcallinvite = (TL_phone.exportedGroupCallInvite) tLObject;
            Uri parse = Uri.parse(exportedgroupcallinvite.link);
            char c2 = 1;
            TL_phone.discardCall discardcall = new TL_phone.discardCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            discardcall.peer = tL_inputPhoneCall;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            tL_inputPhoneCall.f27066id = phoneCall.f27229id;
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
                hp s12 = hp.s1(this.currentAccount);
                inviteconferencecallparticipant.user_id = s12.q1(s12.a2(next));
                inviteconferencecallparticipant.call = exportgroupcallinvite.call;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(inviteconferencecallparticipant, new w(this, longValue, hashSet, atomicInteger, size, str, 1));
                c2 = c2;
            }
            this.privateCall = null;
            hs f10 = hs.f(this.currentAccount);
            Long valueOf = Long.valueOf(this.groupCall.f25049b.f27011id);
            Object[] objArr = new Object[3];
            objArr[0] = 0L;
            objArr[c2] = valueOf;
            objArr[2] = Boolean.FALSE;
            f10.k(hs.f23328w2, objArr);
        }
    }

    public void lambda$startConferenceGroupCall$45(TL_phone.PhoneCall phoneCall, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new k(this, tLObject, phoneCall, exportgroupcallinvite, 4));
    }

    public void lambda$startConferenceGroupCall$46(TLRPC.Updates updates, long j10) {
        int i3;
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i3 = message.f27022id;
            }
            i3 = 0;
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i3 = ((TL_update.TL_updateMessageID) update).f27259id;
        } else {
            if (updates.updates != null) {
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update2 = updates.updates.get(i10);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                        if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                            i3 = message2.f27022id;
                            break;
                        }
                    } else if (update2 instanceof TL_update.TL_updateMessageID) {
                        i3 = ((TL_update.TL_updateMessageID) update2).f27259id;
                        break;
                    }
                }
            }
            i3 = 0;
        }
        r3 r3Var = this.groupCall;
        if (r3Var != null && i3 != 0) {
            HashMap hashMap = r3Var.f25056k;
            Long valueOf = Long.valueOf(j10);
            ?? obj = new Object();
            obj.f24848a = i3;
            obj.f24849b = true;
            obj.f24850c = System.currentTimeMillis();
            hashMap.put(valueOf, obj);
            hs.f(this.currentAccount).k(hs.f23328w2, 0L, Long.valueOf(this.groupCall.f25049b.f27011id), Boolean.FALSE);
        }
    }

    public void lambda$startConferenceGroupCall$47(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        d2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        vg.i0 i0Var = new vg.i0(34, this.currentAccount, T.getContext(), T, new ei.k0());
        i0Var.C1(null, arrayList, arrayList2, arrayList3, str);
        i0Var.show();
    }

    public static void lambda$startConferenceGroupCall$48(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i3 = 0; i3 < Math.min(arrayList.size(), vector.objects.size()); i3++) {
                if (vector.objects.get(i3) instanceof TL_account.requirementToContactPremium) {
                    arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i3)).f27150id));
                }
            }
        }
        runnable.run();
    }

    public static void lambda$startConferenceGroupCall$49(ArrayList arrayList, ArrayList arrayList2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new p(tLObject, arrayList, arrayList2, runnable, 0));
    }

    public void lambda$startConferenceGroupCall$50(HashSet hashSet, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            r3 r3Var = this.groupCall;
            if (r3Var != null) {
                r3Var.t(longValue);
            }
            arrayList.add(hp.s1(this.currentAccount).a2(l10));
            ArrayList<TLRPC.InputUser> arrayList4 = getrequirementstocontact.f27210id;
            hp s12 = hp.s1(this.currentAccount);
            arrayList4.add(s12.q1(s12.a2(l10)));
        }
        v vVar = new v(this, arrayList, arrayList2, arrayList3, str, 0);
        if (h10.i(this.currentAccount).q()) {
            vVar.run();
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getrequirementstocontact, new m(arrayList, arrayList2, vVar, 2));
        }
    }

    public void lambda$startConferenceGroupCall$51(long j10, HashSet hashSet, AtomicInteger atomicInteger, int i3, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            hp.s1(this.currentAccount).O3(updates, false);
            org.telegram.messenger.g0.h3(new t(this, updates, j10, 1));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() == i3 && !hashSet.isEmpty()) {
            org.telegram.messenger.g0.h3(new u(this, hashSet, str, 1));
        }
    }

    public void lambda$startConferenceGroupCall$52(ArrayList arrayList, boolean z10) {
        char c2;
        TL_phone.PhoneCall phoneCall;
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null) {
            conferenceCall.joined();
            int size = arrayList.size();
            char c10 = 0;
            int i3 = 0;
            while (true) {
                c2 = 1;
                if (i3 >= size) {
                    break;
                }
                Object obj = arrayList.get(i3);
                i3++;
                this.conference.applyUpdate(0, (TL_update.TL_updateGroupCallChainBlocks) obj, true, null);
            }
            this.conference.forcePoll();
            this.groupCall.k(z10);
            startGroupCheckShortpoll();
            long j10 = 0;
            if (this.captureDevice[1] != 0) {
                createGroupInstance(1, false, true);
            }
            for (int i10 = 0; i10 < 2; i10++) {
                NativeInstance nativeInstance = this.tgVoip[i10];
                if (nativeInstance != null) {
                    nativeInstance.setConferenceCallId(this.conference.getCallId());
                }
            }
            org.telegram.messenger.g0.i3(this.destroyConvertingRunnable, 5000L);
            if (this.inviteUsersToConference != null && (phoneCall = this.privateCall) != null && this.groupCall != null) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                exportgroupcallinvite.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall = this.groupCall.f25049b;
                tL_inputGroupCall.f27018id = groupCall.f27011id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new m(this, phoneCall, exportgroupcallinvite, 3));
            }
            long[] jArr = this.inviteUsers;
            if (jArr != null) {
                String str = this.groupCall.f25049b.invite_link;
                int length = jArr.length;
                AtomicInteger atomicInteger = new AtomicInteger(0);
                HashSet hashSet = new HashSet();
                long[] jArr2 = this.inviteUsers;
                int length2 = jArr2.length;
                int i11 = 0;
                while (i11 < length2) {
                    char c11 = c2;
                    long j11 = jArr2[i11];
                    this.groupCall.a(j11);
                    TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                    r3 r3Var = this.groupCall;
                    inviteconferencecallparticipant.call = r3Var.g(r3Var.f25048a);
                    inviteconferencecallparticipant.user_id = hp.s1(this.currentAccount).o1(j11);
                    inviteconferencecallparticipant.video = this.videoCall;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(inviteconferencecallparticipant, new w(this, j11, hashSet, atomicInteger, length, str, 0));
                    i11++;
                    j10 = j10;
                    length2 = length2;
                    c2 = c11;
                    c10 = c10;
                    jArr2 = jArr2;
                }
                this.inviteUsers = null;
                hs f10 = hs.f(this.currentAccount);
                Long valueOf = Long.valueOf(j10);
                Long valueOf2 = Long.valueOf(this.groupCall.f25049b.f27011id);
                Object[] objArr = new Object[3];
                objArr[c10] = valueOf;
                objArr[c2] = valueOf2;
                objArr[2] = Boolean.FALSE;
                f10.k(hs.f23328w2, objArr);
            }
        }
    }

    public void lambda$startConferenceGroupCall$53(TLRPC.TL_error tL_error, String str) {
        if ("JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            hangUp(2);
        } else if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
            startConferenceGroupCall(false, 0, str, false);
        } else if (tL_error.text.startsWith("CONF_WRITE_CHAIN_INVALID")) {
            stopSelf();
        } else if ("GROUPCALL_INVALID".equals(tL_error.text)) {
            d2 T = LaunchActivity.T();
            if (T != null) {
                fc.a0(T).Q(2131624079, 36, bd.M0(2131751822, null)).j().f31800r = false;
            }
            hangUp(0);
        } else {
            hs.f(this.currentAccount).k(hs.M0, 6, tL_error.text);
            hangUp(0);
        }
    }

    public void lambda$startConferenceGroupCall$54(int i3, boolean z10, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            org.telegram.messenger.g0.h3(new x(this, i3, 2));
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            long selfId = getSelfId();
            ArrayList z02 = hp.z0(updates, TL_update.TL_updateGroupCallChainBlocks.class);
            ArrayList y02 = hp.y0(updates, TL_update.TL_updateGroupCall.class);
            int size = y02.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = y02.get(i10);
                i10++;
                TLRPC.GroupCall groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                r3 r3Var = this.groupCall;
                if (r3Var != null) {
                    r3Var.v(org.telegram.messenger.c.a(this.currentAccount), groupCall);
                }
                ConferenceCall conferenceCall = this.conference;
                if (conferenceCall != null) {
                    dg.d.a(conferenceCall.groupCall, groupCall);
                    conferenceCall.groupCall = groupCall;
                }
            }
            ArrayList y03 = hp.y0(updates, TL_update.TL_updateGroupCallParticipants.class);
            int size2 = y03.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = y03.get(i11);
                i11++;
                TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
                int size3 = tL_updateGroupCallParticipants.participants.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size3) {
                        TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i12);
                        if (zi.C1(groupCallParticipant.peer) == selfId) {
                            org.telegram.messenger.g0.h3(new b0(this, groupCallParticipant, 0));
                            if (r2.f25040a) {
                                p1.q(groupCallParticipant.source, new StringBuilder("join source = "));
                            }
                        } else {
                            i12++;
                        }
                    }
                }
            }
            ArrayList y04 = hp.y0(updates, TL_update.TL_updateGroupCallConnection.class);
            int size4 = y04.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj3 = y04.get(i13);
                i13++;
                TL_update.TL_updateGroupCallConnection tL_updateGroupCallConnection = (TL_update.TL_updateGroupCallConnection) obj3;
                if (!tL_updateGroupCallConnection.presentation) {
                    this.myParams = tL_updateGroupCallConnection.params;
                }
            }
            hp.s1(this.currentAccount).O3(updates, false);
            org.telegram.messenger.g0.h3(new v6(this, z02, z10, 11));
            return;
        }
        org.telegram.messenger.g0.h3(new l(this, tL_error, str, 1));
    }

    public void lambda$startConferenceGroupCall$55(String str, int i3, boolean z10) {
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        joingroupcall.muted = this.micMute;
        boolean z11 = false;
        if (this.videoState[0] != 2) {
            z11 = true;
        }
        joingroupcall.video_stopped = z11;
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null) {
            joingroupcall.call = conferenceCall.inputGroupCall;
            joingroupcall.flags |= 8;
            joingroupcall.public_key = conferenceCall.getMyPublicKey();
            joingroupcall.block = this.conference.getLastBlock();
        } else {
            r3 r3Var = this.groupCall;
            if (r3Var != null) {
                joingroupcall.call = r3Var.g(r3Var.f25048a);
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
            tL_inputPeerUser.user_id = h10.i(org.telegram.messenger.c.a(this.currentAccount).f21919a).e();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcall, new i0(i3, str, this, z10));
    }

    public void lambda$startConferenceGroupCall$56(Runnable runnable) {
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null) {
            conferenceCall.generateAddSelfBlock();
            runnable.run();
            for (int i3 = 0; i3 < 2; i3++) {
                NativeInstance nativeInstance = this.tgVoip[i3];
                if (nativeInstance != null) {
                    nativeInstance.setConferenceCallId(this.conference.getCallId());
                }
            }
        }
    }

    public void lambda$startConnectingSound$89() {
        int i3 = this.spPlayId;
        if (i3 != 0) {
            this.soundPool.stop(i3);
        }
        int play = this.soundPool.play(this.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
        this.spPlayId = play;
        if (play == 0) {
            AnonymousClass9 anonymousClass9 = new AnonymousClass9();
            this.connectingSoundRunnable = anonymousClass9;
            org.telegram.messenger.g0.i3(anonymousClass9, 100L);
        }
    }

    public void lambda$startGroupCall$21(TL_update.TL_updateGroupCall tL_updateGroupCall) {
        if (sharedInstance == null) {
            return;
        }
        TLRPC.GroupCall groupCall = this.groupCall.f25049b;
        TLRPC.GroupCall groupCall2 = tL_updateGroupCall.call;
        groupCall.access_hash = groupCall2.access_hash;
        groupCall.f27011id = groupCall2.f27011id;
        hp s12 = hp.s1(this.currentAccount);
        r3 r3Var = this.groupCall;
        s12.W3(r3Var.f25050c, r3Var);
        startGroupCall(0, null, false);
    }

    public void lambda$startGroupCall$22(TLRPC.TL_error tL_error) {
        hs.f(this.currentAccount).k(hs.M0, 6, tL_error.text);
        hangUp(0);
    }

    public void lambda$startGroupCall$23(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            try {
                this.groupCallBottomSheetLatch.await(800L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                a8.g(e10, true);
            }
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            int i3 = 0;
            while (true) {
                if (i3 >= updates.updates.size()) {
                    break;
                }
                TLRPC.Update update = updates.updates.get(i3);
                if (update instanceof TL_update.TL_updateGroupCall) {
                    org.telegram.messenger.g0.h3(new m2.s(27, this, (TL_update.TL_updateGroupCall) update));
                    break;
                }
                i3++;
            }
            hp.s1(this.currentAccount).O3(updates, false);
            return;
        }
        org.telegram.messenger.g0.h3(new e0(this, tL_error, 1));
    }

    public static void lambda$startGroupCall$24() {
        hs.e().k(hs.f23321v2, new Object[0]);
    }

    public void lambda$startGroupCall$25(int i3) {
        this.mySource[0] = i3;
    }

    public void lambda$startGroupCall$26(TLRPC.GroupCallParticipant groupCallParticipant) {
        this.mySource[0] = groupCallParticipant.source;
    }

    public void lambda$startGroupCall$27(boolean z10) {
        this.groupCall.k(z10);
    }

    public void lambda$startGroupCall$28(TLRPC.TL_error tL_error) {
        TLRPC.ChatFull N0;
        if ("JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            if (this.chat != null && (N0 = hp.s1(this.currentAccount).N0(this.chat.f27001id)) != null) {
                if (N0 instanceof TLRPC.TL_chatFull) {
                    N0.flags &= -32769;
                } else {
                    N0.flags &= -67108865;
                }
                N0.groupcall_default_join_as = null;
                o60.A1 = null;
            }
            hangUp(2);
        } else if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
            createGroupInstance(0, false, false);
        } else {
            if ("GROUPCALL_INVALID".equals(tL_error.text) && this.chat != null) {
                hp.s1(this.currentAccount).V2(0, this.chat.f27001id, true);
            }
            hs.f(this.currentAccount).k(hs.M0, 6, tL_error.text);
            hangUp(0);
        }
    }

    public void lambda$startGroupCall$29(int i3, boolean z10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            org.telegram.messenger.g0.h3(new x(this, i3, 3));
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            long selfId = getSelfId();
            int size = updates.updates.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.Update update = updates.updates.get(i10);
                if (update instanceof TL_update.TL_updateGroupCallParticipants) {
                    TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) update;
                    int size2 = tL_updateGroupCallParticipants.participants.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i11);
                            if (zi.C1(groupCallParticipant.peer) == selfId) {
                                org.telegram.messenger.g0.h3(new b0(this, groupCallParticipant, 1));
                                if (r2.f25040a) {
                                    p1.q(groupCallParticipant.source, new StringBuilder("join source = "));
                                }
                            } else {
                                i11++;
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
            hp.s1(this.currentAccount).O3(updates, false);
            org.telegram.messenger.g0.h3(new e1(15, this, z10));
            startGroupCheckShortpoll();
            return;
        }
        org.telegram.messenger.g0.h3(new e0(this, tL_error, 0));
    }

    public void lambda$startGroupCheckShortpoll$61(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (this.shortPollRunnable != null && sharedInstance != null && this.groupCall != null) {
            if (tLObject instanceof TL_phone.groupCall) {
                TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                hp.s1(this.currentAccount).Y3(groupcall.users, false);
                hp.s1(this.currentAccount).S3(groupcall.chats, false);
                this.groupCall.v(org.telegram.messenger.c.a(this.currentAccount), groupcall.call);
                this.groupCall.k(true);
                this.shortPollRunnable = null;
                this.checkRequestId = 0;
                startGroupCheckShortpoll();
            } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                stopSelf();
            }
        }
    }

    public void lambda$startGroupCheckShortpoll$62(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new z(this, tLObject, tL_error));
    }

    public void lambda$startGroupCheckShortpoll$63(TLRPC.TL_error tL_error, TLObject tLObject, TL_phone.checkGroupCall checkgroupcall) {
        boolean z10;
        boolean z11;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable != null && sharedInstance != null && this.groupCall != null) {
            if (this.conference != null && tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text) && this.groupCall.g(true) != null && this.groupCall.g(false) != null) {
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = this.groupCall.g(false);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new s(this, 3));
                return;
            }
            this.shortPollRunnable = null;
            this.checkRequestId = 0;
            if (tLObject instanceof Vector) {
                ArrayList<Integer> intArray = ((Vector) tLObject).toIntArray();
                int i3 = this.mySource[0];
                if (i3 != 0 && checkgroupcall.sources.contains(Integer.valueOf(i3)) && !intArray.contains(Integer.valueOf(this.mySource[0]))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i10 = this.mySource[1];
                if (i10 != 0 && checkgroupcall.sources.contains(Integer.valueOf(i10)) && !intArray.contains(Integer.valueOf(this.mySource[1]))) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (tL_error != null && tL_error.code == 400) {
                    int i11 = this.mySource[1];
                    if (i11 != 0 && checkgroupcall.sources.contains(Integer.valueOf(i11))) {
                        z10 = true;
                    } else {
                        z11 = true;
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                z11 = z10;
            }
            if (z11) {
                createGroupInstance(0, false, false);
            }
            if (z10) {
                createGroupInstance(1, false, false);
            }
            int[] iArr = this.mySource;
            if (iArr[1] != 0 || iArr[0] != 0 || ((groupCall = this.groupCall.f25049b) != null && groupCall.rtmp_stream)) {
                startGroupCheckShortpoll();
            }
        }
    }

    public void lambda$startGroupCheckShortpoll$64(TL_phone.checkGroupCall checkgroupcall, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new k(this, tL_error, tLObject, checkgroupcall, 6));
    }

    public void lambda$startGroupCheckShortpoll$65() {
        r3 r3Var;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable != null && sharedInstance != null && (r3Var = this.groupCall) != null) {
            int[] iArr = this.mySource;
            int i3 = 0;
            if (iArr[0] != 0 || iArr[1] != 0 || ((groupCall = r3Var.f25049b) != null && groupCall.rtmp_stream)) {
                TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
                if (this.groupCall.g(true) != null) {
                    checkgroupcall.call = this.groupCall.g(true);
                } else {
                    checkgroupcall.call = this.groupCall.g(false);
                }
                while (true) {
                    int[] iArr2 = this.mySource;
                    if (i3 < iArr2.length) {
                        int i10 = iArr2[i3];
                        if (i10 != 0) {
                            checkgroupcall.sources.add(Integer.valueOf(i10));
                        }
                        i3++;
                    } else {
                        this.checkRequestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkgroupcall, new f3(26, this, checkgroupcall));
                        return;
                    }
                }
            }
        }
    }

    public void lambda$startOutgoingCall$10(byte[] bArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new k(this, tL_error, tLObject, bArr, 5));
    }

    public void lambda$startOutgoingCall$11(qr qrVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        qr qrVar2;
        this.callReqId = 0;
        if (this.endCallAfterRequest) {
            callEnded();
        } else if (tL_error == null) {
            TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
            if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                byte[] bArr = messages_dhconfig.f27158p;
                int i3 = messages_dhconfig.f27157g;
                Pattern pattern = Utilities.f21384a;
                if (!ConnectionsManager.native_isGoodPrime(bArr, i3)) {
                    callFailed();
                    return;
                }
                byte[] bArr2 = messages_dhconfig.f27158p;
                qrVar.H();
                qrVar.f24949y = bArr2;
                int i10 = messages_dhconfig.f27157g;
                qrVar.H();
                qrVar.E = i10;
                int i11 = messages_dhconfig.version;
                qrVar.H();
                qrVar.f24948x = i11;
                qrVar.H();
                int i12 = qrVar.f24948x;
                qrVar.H();
                int i13 = qrVar.E;
                qrVar.H();
                qrVar2 = qrVar;
                qrVar.f24934a.c(new k2.a0(qrVar2, i12, i13, qrVar.f24949y, 7));
            } else {
                qrVar2 = qrVar;
            }
            byte[] bArr3 = new byte[256];
            for (int i14 = 0; i14 < 256; i14++) {
                bArr3[i14] = (byte) (((byte) (Utilities.f21385b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i14]);
            }
            qrVar2.H();
            BigInteger valueOf = BigInteger.valueOf(qrVar2.E);
            BigInteger bigInteger = new BigInteger(1, bArr3);
            qrVar2.H();
            byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, qrVar2.f24949y)).toByteArray();
            if (byteArray.length > 256) {
                byte[] bArr4 = new byte[256];
                System.arraycopy(byteArray, 1, bArr4, 0, 256);
                byteArray = bArr4;
            }
            TL_phone.requestCall requestcall = new TL_phone.requestCall();
            requestcall.user_id = hp.s1(this.currentAccount).q1(this.user);
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
            requestcall.random_id = Utilities.f21385b.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(requestcall, new f3(27, this, bArr3), 65536);
        } else {
            if (r2.f25040a) {
                a8.d("Error on getDhConfig " + tL_error);
            }
            callFailed();
        }
    }

    public static void lambda$startOutgoingCall$6() {
        hs.e().k(hs.f23321v2, new Object[0]);
    }

    public void lambda$startOutgoingCall$7(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (r2.f25040a) {
            if (tL_error != null) {
                a8.d("error on phone.discardCall: " + tL_error);
            } else {
                a8.b("phone.discardCall " + tLObject);
            }
        }
        org.telegram.messenger.g0.h3(new q(this, 25));
    }

    public void lambda$startOutgoingCall$8() {
        this.timeoutRunnable = null;
        TL_phone.discardCall discardcall = new TL_phone.discardCall();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        discardcall.peer = tL_inputPhoneCall;
        TL_phone.PhoneCall phoneCall = this.privateCall;
        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
        tL_inputPhoneCall.f27066id = phoneCall.f27229id;
        discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonMissed();
        a8.d("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new s(this, 2), 65536);
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
                int i3 = 0;
                while (i3 < size) {
                    TL_phone.PhoneCall phoneCall = arrayList.get(i3);
                    i3++;
                    onCallUpdated(phoneCall);
                }
                this.pendingUpdates.clear();
            }
            q qVar = new q(this, 21);
            this.timeoutRunnable = qVar;
            org.telegram.messenger.g0.i3(qVar, hp.s1(this.currentAccount).f23022h3);
        } else if (tL_error.code == 400 && "PARTICIPANT_VERSION_OUTDATED".equals(tL_error.text)) {
            callFailed("ERROR_PEER_OUTDATED");
        } else {
            int i10 = tL_error.code;
            if (i10 == 403) {
                callFailed("ERROR_PRIVACY");
            } else if (i10 == 406) {
                callFailed("ERROR_LOCALIZED");
            } else {
                if (r2.f25040a) {
                    a8.d("Error on phone.requestCall: " + tL_error);
                }
                callFailed();
            }
        }
    }

    public void lambda$startRingtoneAndVibration$96(MediaPlayer mediaPlayer) {
        try {
            this.ringtonePlayer.start();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public void lambda$startScreenCapture$57(int i3) {
        this.mySource[1] = i3;
    }

    public void lambda$startScreenCapture$58(TLRPC.Updates updates) {
        if (this.tgVoip[1] != null) {
            long selfId = getSelfId();
            int size = updates.updates.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.Update update = updates.updates.get(i3);
                if (update instanceof TL_update.TL_updateGroupCallConnection) {
                    TL_update.TL_updateGroupCallConnection tL_updateGroupCallConnection = (TL_update.TL_updateGroupCallConnection) update;
                    if (tL_updateGroupCallConnection.presentation) {
                        this.tgVoip[1].setJoinResponsePayload(tL_updateGroupCallConnection.params.data);
                    }
                } else if (update instanceof TL_update.TL_updateGroupCallParticipants) {
                    TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) update;
                    int size2 = tL_updateGroupCallParticipants.participants.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i10);
                            if (zi.C1(groupCallParticipant.peer) == selfId) {
                                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.presentation;
                                if (tL_groupCallParticipantVideo != null) {
                                    if ((tL_groupCallParticipantVideo.flags & 2) != 0) {
                                        this.mySource[1] = tL_groupCallParticipantVideo.audio_source;
                                    } else {
                                        int size3 = tL_groupCallParticipantVideo.source_groups.size();
                                        for (int i11 = 0; i11 < size3; i11++) {
                                            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = groupCallParticipant.presentation.source_groups.get(i11);
                                            if (tL_groupCallParticipantVideoSourceGroup.sources.size() > 0) {
                                                this.mySource[1] = tL_groupCallParticipantVideoSourceGroup.sources.get(0).intValue();
                                            }
                                        }
                                    }
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            }
        }
    }

    public void lambda$startScreenCapture$59(TLRPC.TL_error tL_error) {
        TLRPC.ChatFull N0;
        if ("GROUPCALL_VIDEO_TOO_MUCH".equals(tL_error.text)) {
            this.groupCall.s();
        } else if ("JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            if (this.chat != null && (N0 = hp.s1(this.currentAccount).N0(this.chat.f27001id)) != null) {
                if (N0 instanceof TLRPC.TL_chatFull) {
                    N0.flags &= -32769;
                } else {
                    N0.flags &= -67108865;
                }
                N0.groupcall_default_join_as = null;
                o60.A1 = null;
            }
            hangUp(2);
        } else if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
            createGroupInstance(1, false, false);
        } else if ("GROUPCALL_INVALID".equals(tL_error.text) && this.chat != null) {
            hp.s1(this.currentAccount).V2(0, this.chat.f27001id, true);
        }
    }

    public void lambda$startScreenCapture$60(int i3, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            org.telegram.messenger.g0.h3(new x(this, i3, 5));
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            org.telegram.messenger.g0.h3(new l0(0, this, updates));
            hp.s1(this.currentAccount).O3(updates, false);
            startGroupCheckShortpoll();
            return;
        }
        org.telegram.messenger.g0.h3(new e0(this, tL_error, 2));
    }

    public void lambda$stopScreenCapture$15(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            hp.s1(this.currentAccount).O3((TLRPC.Updates) tLObject, false);
        }
    }

    public void lambda$switchToSpeaker$91(Boolean bool, Boolean bool2) {
        updateOutputGainControlState();
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            StateListener stateListener = arrayList.get(i3);
            i3++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public void lambda$switchToSpeaker$92() {
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if ((!isBluetoothHeadsetConnected() || !hasEarpiece()) && !this.isHeadsetPlugged && !isSpeakerphoneOn()) {
            voipAudioManager.setSpeakerphoneOn(true);
            voipAudioManager.isBluetoothAndSpeakerOnAsync(new r(this, 0));
        }
    }

    public void lambda$toggleSpeakerphoneOrShowRouteSheet$93(DialogInterface dialogInterface, int i3) {
        if (getSharedInstance() == null) {
            return;
        }
        setAudioOutput(i3);
    }

    public static void lambda$toggleSpeakerphoneOrShowRouteSheet$94(t2 t2Var, Integer num, DialogInterface dialogInterface) {
        for (int i3 = 0; i3 < t2Var.f28623x0.size(); i3++) {
            int i10 = k6.f27988j5;
            t2Var.C0(i3, k6.x0(null, i10, false), k6.x0(null, i10, false));
        }
        if (num != null) {
            int x02 = k6.x0(null, k6.f28006k5, false);
            t2Var.C0(num.intValue(), x02, x02);
        }
    }

    public void lambda$toggleSpeakerphoneOrShowRouteSheet$95(Boolean bool, Boolean bool2) {
        updateOutputGainControlState();
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            StateListener stateListener = arrayList.get(i3);
            i3++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public static void lambda$updateBluetoothHeadsetState$113(VoipAudioManager voipAudioManager) {
        try {
            voipAudioManager.startBluetooth();
        } catch (Throwable unused) {
        }
    }

    public void lambda$updateConnectionState$81(int i3) {
        if (this.switchingStreamTimeoutRunnable == null) {
            return;
        }
        this.switchingStream = false;
        lambda$createGroupInstance$80(i3, 0, true);
        this.switchingStreamTimeoutRunnable = null;
    }

    public void lambda$updateConnectionState$82() {
        int i3 = this.spPlayId;
        if (i3 != 0) {
            this.soundPool.stop(i3);
        }
        this.spPlayId = this.soundPool.play(this.spVoiceChatConnecting, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public void lambda$updateConnectionState$83() {
        int i3 = this.spPlayId;
        if (i3 != 0) {
            this.soundPool.stop(i3);
            this.spPlayId = 0;
        }
    }

    public static void lambda$updateServerConfig$107(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            String str = ((TLRPC.TL_dataJSON) tLObject).data;
            Instance.setGlobalServerConfig(str);
            sharedPreferences.edit().putString("voip_server_config", str).commit();
        }
    }

    private void loadResources() {
        WebRtcAudioTrack.setAudioTrackUsageAttribute(2);
        Utilities.f21387e.c(new q(this, 19));
    }

    private void onTgVoipStop(Instance.FinalState finalState) {
        if (this.user != null && this.privateCall != null && finalState != null) {
            if (TextUtils.isEmpty(finalState.debugLog)) {
                try {
                    finalState.debugLog = getStringFromFile(n1.e("" + this.privateCall.f27229id));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            hp s12 = hp.s1(this.currentAccount);
            if (s12.f23087p1 == null) {
                s12.f23087p1 = new VoIPDebugToSend(this.currentAccount);
            }
            VoIPDebugToSend voIPDebugToSend = s12.f23087p1;
            TL_phone.PhoneCall phoneCall = this.privateCall;
            voIPDebugToSend.push(phoneCall.f27229id, phoneCall.access_hash, finalState, this.lastLogFilePath);
            this.lastLogFilePath = null;
            boolean z10 = this.needSendDebugLog;
            if (z10) {
                s12.f23087p1.done(this.privateCall.f27229id, z10);
                this.needSendDebugLog = false;
            }
        }
    }

    private void processAcceptedCall() {
        byte[] bArr;
        dispatchStateChanged(12);
        qr a02 = qr.a0(this.currentAccount);
        a02.H();
        BigInteger bigInteger = new BigInteger(1, a02.f24949y);
        BigInteger bigInteger2 = new BigInteger(1, this.privateCall.g_b);
        if (!Utilities.w(bigInteger2, bigInteger)) {
            if (r2.f25040a) {
                a8.l("stopping VoIP service, bad Ga and Gb");
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
                for (int i3 = 0; i3 < 256 - byteArray.length; i3++) {
                    bArr[i3] = 0;
                }
            }
            byte[] n4 = Utilities.n(byteArray);
            byte[] bArr2 = new byte[8];
            System.arraycopy(n4, n4.length - 8, bArr2, 0, 8);
            long g7 = Utilities.g(bArr2);
            this.authKey = byteArray;
            this.keyFingerprint = g7;
            TL_phone.confirmCall confirmcall = new TL_phone.confirmCall();
            confirmcall.g_a = this.g_a;
            confirmcall.key_fingerprint = g7;
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            confirmcall.peer = tL_inputPhoneCall;
            TL_phone.PhoneCall phoneCall = this.privateCall;
            tL_inputPhoneCall.f27066id = phoneCall.f27229id;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol = new TL_phone.TL_phoneCallProtocol();
            confirmcall.protocol = tL_phoneCallProtocol;
            tL_phoneCallProtocol.max_layer = Instance.getConnectionMaxLayer();
            TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol2 = confirmcall.protocol;
            tL_phoneCallProtocol2.min_layer = 65;
            tL_phoneCallProtocol2.udp_reflector = true;
            tL_phoneCallProtocol2.udp_p2p = true;
            Collections.addAll(tL_phoneCallProtocol2.library_versions, NativeInstance.getAllVersions());
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmcall, new s(this, 5));
        }
        byteArray = bArr;
        byte[] n42 = Utilities.n(byteArray);
        byte[] bArr22 = new byte[8];
        System.arraycopy(n42, n42.length - 8, bArr22, 0, 8);
        long g72 = Utilities.g(bArr22);
        this.authKey = byteArray;
        this.keyFingerprint = g72;
        TL_phone.confirmCall confirmcall2 = new TL_phone.confirmCall();
        confirmcall2.g_a = this.g_a;
        confirmcall2.key_fingerprint = g72;
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall2 = new TLRPC.TL_inputPhoneCall();
        confirmcall2.peer = tL_inputPhoneCall2;
        TL_phone.PhoneCall phoneCall2 = this.privateCall;
        tL_inputPhoneCall2.f27066id = phoneCall2.f27229id;
        tL_inputPhoneCall2.access_hash = phoneCall2.access_hash;
        TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol3 = new TL_phone.TL_phoneCallProtocol();
        confirmcall2.protocol = tL_phoneCallProtocol3;
        tL_phoneCallProtocol3.max_layer = Instance.getConnectionMaxLayer();
        TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol22 = confirmcall2.protocol;
        tL_phoneCallProtocol22.min_layer = 65;
        tL_phoneCallProtocol22.udp_reflector = true;
        tL_phoneCallProtocol22.udp_p2p = true;
        Collections.addAll(tL_phoneCallProtocol22.library_versions, NativeInstance.getAllVersions());
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmcall2, new s(this, 5));
    }

    private void showIncomingNotification(java.lang.String r17, org.telegram.tgnet.TLObject r18, boolean r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPService.showIncomingNotification(java.lang.String, org.telegram.tgnet.TLObject, boolean, int):void");
    }

    private void showNotification(String str, Bitmap bitmap) {
        Intent action = new Intent(this, LaunchActivity.class).setAction(this.groupCall != null ? "voip_chat" : "voip");
        if (this.groupCall != null) {
            action.putExtra("currentAccount", this.currentAccount);
        }
        Notification.Builder contentIntent = new Notification.Builder(this).setContentText(str).setContentIntent(PendingIntent.getActivity(this, 50, action, 33554432));
        if (isConference()) {
            contentIntent.setContentTitle(bd.M0(2131743436, null));
            contentIntent.setSmallIcon(isMicMute() ? 2131232801 : 2131232800);
        } else if (this.groupCall != null) {
            contentIntent.setContentTitle(bd.M0(t3.W(this.chat) ? 2131743305 : 2131743229, null));
            contentIntent.setSmallIcon(isMicMute() ? 2131232801 : 2131232800);
        } else {
            contentIntent.setContentTitle(bd.M0(2131743275, null));
            contentIntent.setSmallIcon(2131230911);
            contentIntent.setOngoing(true);
        }
        int i3 = Build.VERSION.SDK_INT;
        Intent intent = new Intent(this, VoIPActionsReceiver.class);
        intent.setAction(getPackageName() + ".END_CALL");
        if (isConference()) {
            contentIntent.addAction(2131231263, bd.M0(2131743433, null), PendingIntent.getBroadcast(this, 0, intent, 167772160));
        } else if (this.groupCall != null) {
            contentIntent.addAction(2131231263, bd.M0(t3.W(this.chat) ? 2131743481 : 2131743371, null), PendingIntent.getBroadcast(this, 0, intent, 167772160));
        } else {
            contentIntent.addAction(2131231263, bd.M0(2131743422, null), PendingIntent.getBroadcast(this, 0, intent, 167772160));
        }
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(false);
        if (i3 >= 26) {
            contentIntent.setColor(-14143951);
            contentIntent.setColorized(true);
        } else {
            contentIntent.setColor(-13851168);
        }
        if (i3 >= 26) {
            us.i();
            contentIntent.setChannelId(us.f25747k0);
        }
        if (!isConference() && bitmap != null) {
            contentIntent.setLargeIcon(bitmap);
        }
        try {
            if (this.foregroundStarted) {
                try {
                    stopForeground(true);
                } catch (Exception e10) {
                    a8.g(e10, true);
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
        } catch (Exception e11) {
            if (bitmap == null || !(e11 instanceof IllegalArgumentException)) {
                return;
            }
            showNotification(str, null);
        }
    }

    private void startConferenceGroupCall(boolean z10, int i3, String str, boolean z11) {
        if (sharedInstance == this) {
            if (this.groupCallPeer == null) {
                this.groupCallPeer = hp.n1(h10.i(this.currentAccount).f());
            }
            if (z10) {
                org.telegram.messenger.c a10 = org.telegram.messenger.c.a(this.currentAccount);
                this.conference = new ConferenceCall(this.currentAccount, h10.i(a10.f21919a).e()) {
                    {
                        VoIPService.this = this;
                    }

                    @Override
                    public void gotCallId(long j10) {
                        for (int i10 = 0; i10 < 2; i10++) {
                            if (VoIPService.this.tgVoip[i10] != null) {
                                VoIPService.this.tgVoip[i10].setConferenceCallId(j10);
                            }
                        }
                    }
                };
                this.chat = null;
                r3 r3Var = new r3();
                this.groupCall = r3Var;
                r3Var.f25049b = new TLRPC.TL_groupCall();
                r3 r3Var2 = this.groupCall;
                TLRPC.GroupCall groupCall = r3Var2.f25049b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                groupCall.rtmp_stream = this.isRtmpStream;
                r3Var2.f25050c = 0L;
                r3Var2.C = org.telegram.messenger.c.a(this.currentAccount);
                this.groupCall.x(this.groupCallPeer);
                this.groupCall.e();
                dispatchStateChanged(6);
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.f21385b.nextInt();
                this.groupCallBottomSheetLatch = new CountDownLatch(1);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new f3(28, this, a10), 65536);
                return;
            }
            if (this.conference == null) {
                int i10 = this.currentAccount;
                ConferenceCall conferenceCall = new ConferenceCall(i10, h10.i(i10).e()) {
                    {
                        VoIPService.this = this;
                    }

                    @Override
                    public void gotCallId(long j10) {
                        for (int i11 = 0; i11 < 2; i11++) {
                            if (VoIPService.this.tgVoip[i11] != null) {
                                VoIPService.this.tgVoip[i11].setConferenceCallId(j10);
                            }
                        }
                    }
                };
                this.conference = conferenceCall;
                conferenceCall.inputGroupCall = this.joinConference;
            }
            if (this.groupCall == null) {
                r3 r3Var3 = new r3();
                this.groupCall = r3Var3;
                r3Var3.f25048a = true;
                r3Var3.f25049b = new TLRPC.TL_groupCall();
                TLRPC.GroupCall groupCall2 = this.groupCall.f25049b;
                groupCall2.participants_count = 0;
                groupCall2.version = 1;
                groupCall2.can_start_video = true;
                groupCall2.can_change_join_muted = true;
                groupCall2.rtmp_stream = this.isRtmpStream;
                if (this.joinConference instanceof TLRPC.TL_inputGroupCallSlug) {
                    groupCall2.invite_link = "https://t.me/call/" + this.joinConference.slug;
                }
                r3 r3Var4 = this.groupCall;
                r3Var4.f25050c = 0L;
                r3Var4.C = org.telegram.messenger.c.a(this.currentAccount);
                this.groupCall.x(this.groupCallPeer);
                this.groupCall.e();
                TLRPC.GroupCall groupCall3 = this.joinConferenceCall;
                if (groupCall3 != null) {
                    this.conference.groupCall = groupCall3;
                    this.groupCall.v(org.telegram.messenger.c.a(this.currentAccount), this.joinConferenceCall);
                    this.joinConferenceCall = null;
                }
            }
            if (this.conference.groupCall == null) {
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = this.joinConference;
                getgroupcall.limit = 10;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new kg.t(this, i3, str, 1));
            } else if (str == null) {
                configureDeviceForCall();
                showNotification();
                org.telegram.messenger.g0.h3(new i(5));
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
                    for (long j10 : jArr2) {
                        this.groupCall.a(j10);
                    }
                }
                zb1 zb1Var = zb1.f52603o1;
                if (zb1Var != null) {
                    zb1Var.f();
                }
                x30.e1(LaunchActivity.K1, org.telegram.messenger.c.a(h10.f22829t0), null, null, false, null);
            } else if (getSharedInstance() != null && (this.groupCall != null || this.conference != null)) {
                dispatchStateChanged(1);
                if (r2.f25040a) {
                    a8.b("initital source = " + i3);
                }
                j0 j0Var = new j0(i3, 0, this, str, z10);
                if (z11) {
                    this.conference.reset();
                }
                this.conference.requestLastBlock(new m2.s(29, this, j0Var));
            }
        }
    }

    private void startConnectingSound() {
        Utilities.f21387e.c(new q(this, 29));
    }

    private void startGroupCall(int i3, String str, boolean z10) {
        if (sharedInstance == this) {
            boolean z11 = true;
            if (this.createGroupCall) {
                r3 r3Var = new r3();
                this.groupCall = r3Var;
                r3Var.f25049b = new TLRPC.TL_groupCall();
                r3 r3Var2 = this.groupCall;
                TLRPC.GroupCall groupCall = r3Var2.f25049b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                groupCall.rtmp_stream = this.isRtmpStream;
                r3Var2.f25050c = this.chat.f27001id;
                r3Var2.C = org.telegram.messenger.c.a(this.currentAccount);
                this.groupCall.x(this.groupCallPeer);
                this.groupCall.e();
                dispatchStateChanged(6);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = hp.l1(this.chat);
                creategroupcall.random_id = Utilities.f21385b.nextInt();
                int i10 = this.scheduleDate;
                if (i10 != 0) {
                    creategroupcall.schedule_date = i10;
                    creategroupcall.flags |= 2;
                }
                if (this.isRtmpStream) {
                    creategroupcall.flags |= 4;
                }
                this.groupCallBottomSheetLatch = new CountDownLatch(1);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(creategroupcall, new s(this, 6), 65536);
                this.createGroupCall = false;
            } else if (str == null) {
                if (this.groupCall == null && this.chat != null) {
                    r3 g12 = hp.s1(this.currentAccount).g1(this.chat.f27001id, false, null);
                    this.groupCall = g12;
                    if (g12 != null) {
                        g12.x(this.groupCallPeer);
                    }
                }
                configureDeviceForCall();
                showNotification();
                org.telegram.messenger.g0.h3(new i(7));
                createGroupInstance(0, false, true);
            } else if (getSharedInstance() != null && this.groupCall != null) {
                dispatchStateChanged(1);
                if (r2.f25040a) {
                    a8.b("initital source = " + i3);
                }
                TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
                joingroupcall.muted = this.micMute;
                if (this.videoState[0] == 2) {
                    z11 = false;
                }
                joingroupcall.video_stopped = z11;
                r3 r3Var3 = this.groupCall;
                joingroupcall.call = r3Var3.g(r3Var3.f25048a);
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
                    tL_inputPeerUser.user_id = h10.i(org.telegram.messenger.c.a(this.currentAccount).f21919a).e();
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcall, new vc(this, i3, z10, 1));
            }
        }
    }

    private void startGroupCheckShortpoll() {
        r3 r3Var;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable == null && sharedInstance != null && (r3Var = this.groupCall) != null) {
            int[] iArr = this.mySource;
            if (iArr[0] != 0 || iArr[1] != 0 || ((groupCall = r3Var.f25049b) != null && groupCall.rtmp_stream)) {
                q qVar = new q(this, 26);
                this.shortPollRunnable = qVar;
                org.telegram.messenger.g0.i3(qVar, 4000L);
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
        org.telegram.messenger.g0.h3(new i(6));
        Utilities.f21385b.nextBytes(new byte[256]);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        qr a02 = qr.a0(this.currentAccount);
        a02.H();
        tL_messages_getDhConfig.version = a02.f24948x;
        this.callReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDhConfig, new a0(this, a02, 1), 65536);
    }

    private void startRatingActivity() {
        try {
            PendingIntent.getActivity(this, 0, new Intent(this, VoIPFeedbackActivity.class).putExtra("call_id", this.privateCall.f27229id).putExtra("call_access_hash", this.privateCall.access_hash).putExtra("call_video", this.privateCall.video).putExtra("account", this.currentAccount).addFlags(805306368), 33554432).send();
        } catch (Exception e10) {
            if (r2.f25040a) {
                a8.e("Error starting incall activity", e10);
            }
        }
    }

    public void startRinging() {
        CallConnection callConnection;
        if (this.currentState != 15) {
            if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null) {
                callConnection.setRinging();
            }
            if (r2.f25040a) {
                p1.r(this.privateCall.f27229id, new StringBuilder("starting ringing for call "));
            }
            dispatchStateChanged(15);
            if (!this.notificationsDisabled) {
                TLRPC.User user = this.user;
                showIncomingNotification(g5.m(0, user.first_name, user.last_name), this.user, this.privateCall.video, 0);
                if (r2.f25040a) {
                    a8.b("Showing incoming call notification");
                    return;
                }
                return;
            }
            startRingtoneAndVibration(this.user.f27150id);
            if (r2.f25040a) {
                a8.b("Starting incall activity for incoming call");
            }
            try {
                PendingIntent.getActivity(this, 12345, new Intent(this, LaunchActivity.class).setAction("voip"), 33554432).send();
            } catch (Exception e10) {
                if (r2.f25040a) {
                    a8.e("Error starting incall activity", e10);
                }
            }
        }
    }

    public void startRingtoneAndVibration(long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPService.startRingtoneAndVibration(long):void");
    }

    private void startScreenCapture(int i3, String str) {
        if (getSharedInstance() != null && this.groupCall != null) {
            this.mySource[1] = 0;
            TL_phone.joinGroupCallPresentation joingroupcallpresentation = new TL_phone.joinGroupCallPresentation();
            r3 r3Var = this.groupCall;
            joingroupcallpresentation.call = r3Var.g(r3Var.f25048a);
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            joingroupcallpresentation.params = tL_dataJSON;
            tL_dataJSON.data = str;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcallpresentation, new a2(this, i3, 5));
        }
    }

    public void updateBluetoothHeadsetState(boolean z10) {
        if (z10 != this.isBtHeadsetConnected) {
            if (r2.f25040a) {
                a8.b("updateBluetoothHeadsetState: " + z10);
            }
            this.isBtHeadsetConnected = z10;
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            int i3 = 0;
            if (z10 && !isRinging() && this.currentState != 0) {
                if (this.bluetoothScoActive) {
                    if (r2.f25040a) {
                        a8.b("SCO already active, setting audio routing");
                    }
                    if (!hasRtmpStream()) {
                        audioManager.setSpeakerphoneOn(false);
                        voipAudioManager.setBluetoothOn(true);
                    }
                } else {
                    if (r2.f25040a) {
                        a8.b("startBluetoothSco");
                    }
                    if (!hasRtmpStream()) {
                        this.needSwitchToBluetoothAfterScoActivates = true;
                        org.telegram.messenger.g0.i3(new p0(voipAudioManager, 4), 500L);
                    }
                }
            } else {
                this.bluetoothScoActive = false;
                this.bluetoothScoConnecting = false;
                voipAudioManager.setBluetoothOn(false);
            }
            ArrayList<StateListener> arrayList = this.stateListeners;
            int size = arrayList.size();
            while (i3 < size) {
                StateListener stateListener = arrayList.get(i3);
                i3++;
                stateListener.onAudioSettingsChanged();
            }
        }
    }

    public void lambda$createGroupInstance$80(int i3, int i10, boolean z10) {
        int i11;
        if (i3 == 0) {
            if (i10 != 1 && !this.switchingStream) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            dispatchStateChanged(i11);
            if (this.switchingStream && (i10 == 0 || (i10 == 1 && z10))) {
                x xVar = new x(this, i3, 6);
                this.switchingStreamTimeoutRunnable = xVar;
                org.telegram.messenger.g0.i3(xVar, 3000L);
            }
            if (i10 == 0) {
                startGroupCheckShortpoll();
                if (this.playedConnectedSound && this.spPlayId == 0 && !this.switchingStream && !this.switchingAccount) {
                    Utilities.f21387e.c(new n0(this, 1));
                    return;
                }
                return;
            }
            cancelGroupCheckShortPoll();
            if (!z10) {
                this.switchingStream = false;
                this.switchingAccount = false;
            }
            Runnable runnable = this.switchingStreamTimeoutRunnable;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.switchingStreamTimeoutRunnable = null;
            }
            if (this.playedConnectedSound) {
                Utilities.f21387e.c(new q(this, 0));
                Runnable runnable2 = this.connectingSoundRunnable;
                if (runnable2 != null) {
                    org.telegram.messenger.g0.r(runnable2);
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
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance != null) {
            if (nativeInstance.isGroup()) {
                return;
            }
            this.tgVoip[0].setNetworkType(getNetworkType());
            return;
        }
        this.lastNetInfo = getActiveNetworkInfo();
    }

    private void updateServerConfig() {
        SharedPreferences sharedPreferences = hp.s1(this.currentAccount).f22999e7;
        Instance.setGlobalServerConfig(sharedPreferences.getString("voip_server_config", "{}"));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_phone.getCallConfig(), new s(sharedPreferences, 9));
    }

    public void updateTrafficStats(NativeInstance nativeInstance, Instance.TrafficStats trafficStats) {
        long j10;
        long j11;
        long j12;
        long j13;
        int i3;
        if (nativeInstance != null) {
            if (trafficStats == null) {
                trafficStats = nativeInstance.getTrafficStats();
            }
            if (trafficStats != null) {
                long j14 = trafficStats.bytesSentWifi;
                Instance.TrafficStats trafficStats2 = this.prevTrafficStats;
                if (trafficStats2 != null) {
                    j10 = trafficStats2.bytesSentWifi;
                } else {
                    j10 = 0;
                }
                long j15 = j14 - j10;
                long j16 = trafficStats.bytesReceivedWifi;
                if (trafficStats2 != null) {
                    j11 = trafficStats2.bytesReceivedWifi;
                } else {
                    j11 = 0;
                }
                long j17 = j16 - j11;
                long j18 = trafficStats.bytesSentMobile;
                if (trafficStats2 != null) {
                    j12 = trafficStats2.bytesSentMobile;
                } else {
                    j12 = 0;
                }
                long j19 = j18 - j12;
                long j20 = trafficStats.bytesReceivedMobile;
                if (trafficStats2 != null) {
                    j13 = trafficStats2.bytesReceivedMobile;
                } else {
                    j13 = 0;
                }
                long j21 = j20 - j13;
                this.prevTrafficStats = trafficStats;
                if (j15 > 0) {
                    bz.e(this.currentAccount).j(1, 0, j15);
                }
                if (j17 > 0) {
                    bz.e(this.currentAccount).h(1, 0, j17);
                }
                int i10 = 2;
                if (j19 > 0) {
                    bz e10 = bz.e(this.currentAccount);
                    NetworkInfo networkInfo = this.lastNetInfo;
                    if (networkInfo != null && networkInfo.isRoaming()) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    e10.j(i3, 0, j19);
                }
                if (j21 > 0) {
                    bz e11 = bz.e(this.currentAccount);
                    NetworkInfo networkInfo2 = this.lastNetInfo;
                    if (networkInfo2 == null || !networkInfo2.isRoaming()) {
                        i10 = 0;
                    }
                    e11.h(i10, 0, j21);
                }
            }
        }
    }

    @Override
    public void acceptIncomingCall() {
        updateCurrentForegroundType();
        hp.s1(this.currentAccount).g7 = false;
        stopRinging();
        showNotification();
        configureDeviceForCall();
        startConnectingSound();
        dispatchStateChanged(12);
        org.telegram.messenger.g0.h3(new i(3));
        qr a02 = qr.a0(this.currentAccount);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        a02.H();
        tL_messages_getDhConfig.version = a02.f24948x;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDhConfig, new a0(this, a02, 0));
    }

    public ProxyVideoSink addRemoteSink(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10, VideoSink videoSink, VideoSink videoSink2) {
        String str;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        if (this.tgVoip[0] == null) {
            return null;
        }
        if (z10) {
            str = groupCallParticipant.presentationEndpoint;
        } else {
            str = groupCallParticipant.videoEndpoint;
        }
        String str2 = str;
        if (str2 == null) {
            return null;
        }
        ProxyVideoSink proxyVideoSink = this.remoteSinks.get(str2);
        if (proxyVideoSink != null && proxyVideoSink.target == videoSink) {
            return proxyVideoSink;
        }
        if (proxyVideoSink == null) {
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
        NativeInstance nativeInstance = this.tgVoip[0];
        if (z10) {
            tL_groupCallParticipantVideo = groupCallParticipant.presentation;
        } else {
            tL_groupCallParticipantVideo = groupCallParticipant.video;
        }
        proxyVideoSink2.nativeInstance = nativeInstance.addIncomingVideoOutput(1, str2, createSsrcGroups(tL_groupCallParticipantVideo), proxyVideoSink2, m5.o(groupCallParticipant.peer));
        return proxyVideoSink2;
    }

    public void callFailedFromConnectionService() {
        if (this.isOutgoing) {
            callFailed("ERROR_CONNECTION_SERVICE");
        } else {
            hangUp();
        }
    }

    public void checkVideoFrame(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        String str;
        if (z10) {
            str = groupCallParticipant.presentationEndpoint;
        } else {
            str = groupCallParticipant.videoEndpoint;
        }
        if (str != null) {
            if (!z10 || groupCallParticipant.hasPresentationFrame == 0) {
                if (!z10 && groupCallParticipant.hasCameraFrame != 0) {
                    return;
                }
                if (this.proxyVideoSinkLruCache.get(str) == null && (this.remoteSinks.get(str) == null || this.waitingFrameParticipant.get(str) != null)) {
                    if (this.waitingFrameParticipant.containsKey(str)) {
                        this.waitingFrameParticipant.put(str, groupCallParticipant);
                        if (z10) {
                            groupCallParticipant.hasPresentationFrame = 1;
                            return;
                        } else {
                            groupCallParticipant.hasCameraFrame = 1;
                            return;
                        }
                    }
                    if (z10) {
                        groupCallParticipant.hasPresentationFrame = 1;
                    } else {
                        groupCallParticipant.hasCameraFrame = 1;
                    }
                    this.waitingFrameParticipant.put(str, groupCallParticipant);
                    addRemoteSink(groupCallParticipant, z10, new AnonymousClass5(str, z10), null);
                } else if (z10) {
                    groupCallParticipant.hasPresentationFrame = 2;
                } else {
                    groupCallParticipant.hasCameraFrame = 2;
                }
            }
        }
    }

    public void clearCamera() {
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance != null) {
            nativeInstance.clearVideoCapturer();
        }
        long j10 = this.captureDevice[0];
        if (j10 != 0) {
            NativeInstance.destroyVideoCapturer(j10);
            this.captureDevice[0] = 0;
        }
    }

    public void clearRemoteSinks() {
        this.proxyVideoSinkLruCache.evictAll();
    }

    public void convertToConferenceCall(boolean z10, HashSet<Long> hashSet) {
        long j10;
        TLRPC.User user = this.user;
        if (user != null) {
            j10 = user.f27150id;
        } else {
            j10 = 0;
        }
        this.convertingFromCallWithUserId = j10;
        this.inviteUsersToConferenceVideo = z10;
        this.inviteUsersToConference = hashSet;
        stopRinging();
        NativeInstance[] nativeInstanceArr = this.tgVoip;
        NativeInstance nativeInstance = nativeInstanceArr[0];
        if (nativeInstance != null) {
            this.prevTrafficStats = null;
            this.convertingVoip = nativeInstance;
            nativeInstanceArr[0] = null;
        }
        org.telegram.messenger.g0.h3(new q(this, 17));
    }

    public void createCaptureDevice(boolean z10) {
        ?? r22;
        sb1 sb1Var;
        if (z10) {
            this.gotMediaProjection = true;
            updateCurrentForegroundType();
        }
        if (z10) {
            r22 = 2;
        } else {
            r22 = this.isFrontFaceCamera;
        }
        if (this.groupCall == null) {
            if (!this.isPrivateScreencast && z10) {
                setVideoState(false, 0);
            }
            this.isPrivateScreencast = z10;
            NativeInstance nativeInstance = this.tgVoip[0];
            if (nativeInstance != null) {
                nativeInstance.clearVideoCapturer();
            }
            long j10 = this.captureDevice[0];
            if (j10 != 0) {
                NativeInstance.destroyVideoCapturer(j10);
                this.captureDevice[0] = 0;
            }
        }
        if (z10) {
            if (this.groupCall != null) {
                long[] jArr = this.captureDevice;
                if (jArr[z10 ? 1 : 0] == 0) {
                    jArr[z10 ? 1 : 0] = NativeInstance.createVideoCapturer(this.localSink[z10 ? 1 : 0], r22);
                    createGroupInstance(1, false, true);
                    setVideoState(true, 2);
                    hs.f(org.telegram.messenger.c.a(this.currentAccount).f21919a).k(hs.f23349z2, new Object[0]);
                    return;
                }
                return;
            }
            requestVideoCall(true);
            setVideoState(true, 2);
            zb1 zb1Var = zb1.f52603o1;
            if (zb1Var != null && (sb1Var = zb1Var.f52636p0) != null) {
                sb1Var.a(true, true);
                return;
            }
            return;
        }
        long j11 = this.captureDevice[z10 ? 1 : 0];
        int i3 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i3 != 0 || this.tgVoip[z10 ? 1 : 0] == null) {
            NativeInstance nativeInstance2 = this.tgVoip[z10 ? 1 : 0];
            if (nativeInstance2 != null && i3 != 0) {
                nativeInstance2.activateVideoCapturer(j11);
            }
            if (this.captureDevice[z10 ? 1 : 0] != 0) {
                return;
            }
        }
        this.captureDevice[z10 ? 1 : 0] = NativeInstance.createVideoCapturer(this.localSink[z10 ? 1 : 0], r22);
    }

    public void declineIncomingCall(int i3, Runnable runnable) {
        if (this.groupCall != null) {
            stopScreenCapture();
        }
        stopRinging();
        this.callDiscardReason = i3;
        int i10 = this.currentState;
        if (i10 == 14) {
            Runnable runnable2 = this.delayedStartOutgoingCall;
            if (runnable2 != null) {
                org.telegram.messenger.g0.r(runnable2);
                callEnded();
                return;
            }
            dispatchStateChanged(10);
            this.endCallAfterRequest = true;
            org.telegram.messenger.g0.i3(new q(this, 24), 5000L);
        } else if (i10 == 10 || i10 == 11) {
        } else {
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
            tL_inputPhoneCall.f27066id = phoneCall.f27229id;
            discardcall.duration = (int) (getCallDuration() / 1000);
            NativeInstance nativeInstance = this.tgVoip[0];
            discardcall.connection_id = nativeInstance != null ? nativeInstance.getPreferredRelayId() : 0L;
            if (i3 == 2) {
                discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonDisconnect();
            } else if (i3 == 3) {
                discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonMissed();
            } else if (i3 == 4) {
                discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonBusy();
            } else if (i3 != 5) {
                discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonHangup();
            } else {
                TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall tL_phoneCallDiscardReasonMigrateConferenceCall = new TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall();
                discardcall.reason = tL_phoneCallDiscardReasonMigrateConferenceCall;
                tL_phoneCallDiscardReasonMigrateConferenceCall.slug = "";
            }
            a8.d("discardCall " + discardcall.reason);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new s(this, 4), 65536);
            this.onDestroyRunnable = runnable;
            callEnded();
        }
    }

    @Override
    public void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.I2) {
            callEnded();
        }
    }

    public void editCallMember(TLObject tLObject, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Runnable runnable) {
        TLRPC.InputPeer inputPeer;
        if (tLObject != null && this.groupCall != null) {
            TL_phone.editGroupCallParticipant editgroupcallparticipant = new TL_phone.editGroupCallParticipant();
            r3 r3Var = this.groupCall;
            editgroupcallparticipant.call = r3Var.g(r3Var.f25048a);
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (l10.B(user) && (inputPeer = this.groupCallPeer) != null) {
                    editgroupcallparticipant.participant = inputPeer;
                } else {
                    editgroupcallparticipant.participant = hp.n1(user);
                    if (r2.f25040a) {
                        StringBuilder sb2 = new StringBuilder("edit group call part id = ");
                        sb2.append(editgroupcallparticipant.participant.user_id);
                        sb2.append(" access_hash = ");
                        p1.r(editgroupcallparticipant.participant.user_id, sb2);
                    }
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                editgroupcallparticipant.participant = hp.l1((TLRPC.Chat) tLObject);
                if (r2.f25040a) {
                    StringBuilder sb3 = new StringBuilder("edit group call part id = ");
                    TLRPC.InputPeer inputPeer2 = editgroupcallparticipant.participant;
                    long j10 = inputPeer2.chat_id;
                    if (j10 == 0) {
                        j10 = inputPeer2.channel_id;
                    }
                    sb3.append(j10);
                    sb3.append(" access_hash = ");
                    p1.r(editgroupcallparticipant.participant.access_hash, sb3);
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
            if (r2.f25040a) {
                p1.q(editgroupcallparticipant.flags, new StringBuilder("edit group call flags = "));
            }
            int i3 = this.currentAccount;
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(i3).f21919a).sendRequest(editgroupcallparticipant, new kg.t(this, i3, runnable, 2));
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
            return phoneCall.f27229id;
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
            return user.f27150id;
        }
        TLRPC.Chat chat = this.chat;
        if (chat != null) {
            return -chat.f27001id;
        }
        return 0L;
    }

    public TLRPC.Chat getChat() {
        return this.chat;
    }

    public CallConnection getConnectionAndStartCall() {
        if (this.systemCallConnection == null) {
            if (r2.f25040a) {
                a8.b("creating call connection");
            }
            CallConnection callConnection = new CallConnection();
            this.systemCallConnection = callConnection;
            callConnection.setInitializing();
            if (this.isOutgoing) {
                q qVar = new q(this, 4);
                this.delayedStartOutgoingCall = qVar;
                org.telegram.messenger.g0.i3(qVar, 2000L);
            }
            CallConnection callConnection2 = this.systemCallConnection;
            callConnection2.setAddress(Uri.fromParts("tel", "+99084" + this.user.f27150id, null), 1);
            CallConnection callConnection3 = this.systemCallConnection;
            TLRPC.User user = this.user;
            callConnection3.setCallerDisplayName(g5.m(0, user.first_name, user.last_name), 1);
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
        r3 r3Var = this.groupCall;
        if (r3Var != null) {
            return r3Var.f25049b;
        }
        return null;
    }

    public CountDownLatch getGroupCallBottomSheetLatch() {
        return this.groupCallBottomSheetLatch;
    }

    public long getGroupCallID() {
        TLRPC.GroupCall groupCall;
        r3 r3Var = this.groupCall;
        if (r3Var != null && (groupCall = r3Var.f25049b) != null) {
            return groupCall.f27011id;
        }
        return 0L;
    }

    public TLRPC.InputPeer getGroupCallPeer() {
        return this.groupCallPeer;
    }

    @Override
    public ArrayList<TLRPC.GroupCallParticipant> getGroupParticipants() {
        r3 r3Var = this.groupCall;
        if (r3Var != null) {
            return r3Var.f25051e;
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
            return h10.i(this.currentAccount).f22848n;
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
            return g5.m(0, user.first_name, user.last_name);
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

    public int getVideoState(boolean z10) {
        return this.videoState[z10 ? 1 : 0];
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

    public void hangUp(int i3, Runnable runnable) {
        TLRPC.ChatFull N0;
        int i10 = this.currentState;
        declineIncomingCall((i10 == 16 || (i10 == 13 && this.isOutgoing)) ? 3 : 1, runnable);
        if (this.groupCall == null || i3 == 2) {
            return;
        }
        if (i3 == 1) {
            if (this.chat != null && (N0 = hp.s1(this.currentAccount).N0(this.chat.f27001id)) != null) {
                N0.flags &= -2097153;
                N0.call = null;
                hs.f(this.currentAccount).k(hs.f23328w2, Long.valueOf(this.chat.f27001id), Long.valueOf(this.groupCall.f25049b.f27011id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            r3 r3Var = this.groupCall;
            discardgroupcall.call = r3Var.g(r3Var.f25048a);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardgroupcall, new s(this, 0));
            return;
        }
        TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
        r3 r3Var2 = this.groupCall;
        leavegroupcall.call = r3Var2.g(r3Var2.f25048a);
        leavegroupcall.source = this.mySource[0];
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcall, new s(this, 1));
    }

    public boolean hasEarpiece() {
        CallConnection callConnection;
        if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null && callConnection.getCallAudioState() != null) {
            if ((this.systemCallConnection.getCallAudioState().getSupportedRouteMask() & 5) == 0) {
                return false;
            }
        } else if (((TelephonyManager) getSystemService("phone")).getPhoneType() == 0) {
            Boolean bool = this.mHasEarpiece;
            if (bool != null) {
                return bool.booleanValue();
            }
            try {
                Method method = AudioManager.class.getMethod("getDevicesForStream", Integer.TYPE);
                int i3 = AudioManager.class.getField("DEVICE_OUT_EARPIECE").getInt(null);
                if ((((Integer) method.invoke((AudioManager) getSystemService("audio"), 0)).intValue() & i3) == i3) {
                    this.mHasEarpiece = Boolean.TRUE;
                } else {
                    this.mHasEarpiece = Boolean.FALSE;
                }
            } catch (Throwable th2) {
                if (r2.f25040a) {
                    a8.e("Error while checking earpiece! ", th2);
                }
                this.mHasEarpiece = Boolean.TRUE;
            }
            return this.mHasEarpiece.booleanValue();
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

    public boolean isFullscreen(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        String str;
        if (this.currentBackgroundSink[z10 ? 1 : 0] != null) {
            String str2 = this.currentBackgroundEndpointId[z10 ? 1 : 0];
            if (z10) {
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
        int i3 = this.currentState;
        if (i3 != 1 && i3 != 6) {
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
        boolean z10 = USE_CONNECTION_SERVICE;
        if (z10 && (callConnection = this.systemCallConnection) != null && callConnection.getCallAudioState() != null) {
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
        } else if (this.audioConfigured && !z10) {
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
        r3 r3Var = this.groupCall;
        if (r3Var != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(getSelfId());
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !t3.w(14, this.chat)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void onAudioFocusChange(int i3) {
        if (i3 == 1) {
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
        for (int i3 = 0; i3 < this.stateListeners.size(); i3++) {
            this.stateListeners.get(i3).onCameraFirstFrameAvailable();
        }
    }

    public void onConnectionStateChanged(int i3, boolean z10) {
        org.telegram.messenger.g0.h3(new x(this, i3, 1));
    }

    @Override
    public void onCreate() {
        int i3;
        BluetoothAdapter bluetoothAdapter;
        super.onCreate();
        if (r2.f25040a) {
            a8.b("=============== VoIPService STARTING ===============");
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
                        VoIPService.this.lambda$onCreate$108(audioDeviceInfo);
                    }
                };
                this.communicationDeviceListener = onCommunicationDeviceChangedListener;
                audioManager.addOnCommunicationDeviceChangedListener(new c3.b(1), onCommunicationDeviceChangedListener);
            }
            audioManager.registerMediaButtonEventReceiver(new ComponentName(this, VoIPMediaButtonReceiver.class));
            checkUpdateBluetoothHeadset();
        } catch (Exception e10) {
            if (r2.f25040a) {
                a8.e("error initializing voip controller", e10);
            }
            callFailed();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            if (callIShouldHavePutIntoIntent != null) {
                us.i();
                Notification.Builder showWhen = new Notification.Builder(this, us.f25747k0).setContentTitle(bd.M0(2131743275, null)).setShowWhen(false);
                if (this.groupCall != null) {
                    if (isMicMute()) {
                        i3 = 2131232801;
                    } else {
                        i3 = 2131232800;
                    }
                    showWhen.setSmallIcon(i3);
                } else {
                    showWhen.setSmallIcon(2131230911);
                }
                this.foregroundStarted = true;
                if (i10 >= 33) {
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
            us.i();
            Notification.Builder showWhen2 = new Notification.Builder(this, us.f25747k0).setContentTitle(bd.M0(2131743500, null)).setShowWhen(false);
            showWhen2.setSmallIcon(2131230911);
            this.foregroundStarted = true;
            if (i10 >= 33) {
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
        if (r2.f25040a) {
            a8.b("=============== VoIPService STOPPING ===============");
        }
        stopForeground(true);
        stopRinging();
        if (this.currentAccount >= 0) {
            if (org.telegram.messenger.t0.f25465x || !org.telegram.messenger.t0.f25464w) {
                hp.s1(this.currentAccount).g7 = false;
            }
            hs.f(this.currentAccount).n(this, hs.I2);
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
            Utilities.f21387e.a(this.updateNotificationRunnable);
            this.updateNotificationRunnable = null;
        }
        Runnable runnable = this.switchingStreamTimeoutRunnable;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.switchingStreamTimeoutRunnable = null;
        }
        unregisterReceiver(this.receiver);
        Runnable runnable2 = this.timeoutRunnable;
        if (runnable2 != null) {
            org.telegram.messenger.g0.r(runnable2);
            this.timeoutRunnable = null;
        }
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null) {
            conferenceCall.destroy();
        }
        super.onDestroy();
        sharedInstance = null;
        a8.d("(5) set sharedInstance = null");
        Arrays.fill(this.mySource, 0);
        cancelGroupCheckShortPoll();
        org.telegram.messenger.g0.h3(new i(8));
        if (this.tgVoip[0] != null) {
            bz e10 = bz.e(this.currentAccount);
            int statsNetworkType = getStatsNetworkType();
            int[] iArr = e10.f21914n;
            iArr[statsNetworkType] = iArr[statsNetworkType] + (((int) (getCallDuration() / 1000)) % 5);
            e10.m();
            onTgVoipPreStop();
            if (this.tgVoip[0].isGroup()) {
                NativeInstance nativeInstance = this.tgVoip[0];
                p5 p5Var = Utilities.f21387e;
                Objects.requireNonNull(nativeInstance);
                p5Var.c(new p0(nativeInstance, 3));
                for (Map.Entry<String, Integer> entry : this.currentStreamRequestTimestamp.entrySet()) {
                    ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.currentAccount).f21919a).cancelRequest(entry.getValue().intValue(), true);
                }
                this.currentStreamRequestTimestamp.clear();
            } else {
                Instance.FinalState stop = this.tgVoip[0].stop();
                updateTrafficStats(this.tgVoip[0], stop.trafficStats);
                onTgVoipStop(stop);
            }
            this.prevTrafficStats = null;
            this.callStartTime = 0L;
            this.tgVoip[0] = null;
            Instance.destroyInstance();
        }
        destroyConverting();
        NativeInstance nativeInstance2 = this.tgVoip[1];
        if (nativeInstance2 != null) {
            Utilities.f21387e.c(new p0(nativeInstance2, 3));
            this.tgVoip[1] = null;
        }
        int i3 = 0;
        while (true) {
            long[] jArr = this.captureDevice;
            if (i3 >= jArr.length) {
                break;
            }
            long j10 = jArr[i3];
            if (j10 != 0) {
                if (this.destroyCaptureDevice[i3]) {
                    NativeInstance.destroyVideoCapturer(j10);
                }
                this.captureDevice[i3] = 0;
            }
            i3++;
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
                    p5 p5Var2 = Utilities.f21387e;
                    q0 q0Var = new q0(audioManager, 1);
                    setModeRunnable = q0Var;
                    p5Var2.c(q0Var);
                }
                audioManager.abandonAudioFocus(this);
            }
            try {
                audioManager.unregisterMediaButtonEventReceiver(new ComponentName(this, VoIPMediaButtonReceiver.class));
            } catch (Exception e11) {
                a8.g(e11, true);
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
            Utilities.f21387e.c(new q(this, 27));
        }
        if (this.hasAudioFocus) {
            audioManager.abandonAudioFocus(this);
        }
        if (USE_CONNECTION_SERVICE) {
            if (!this.didDeleteConnectionServiceContact) {
                g5.r(this.currentAccount).h();
            }
            CallConnection callConnection = this.systemCallConnection;
            if (callConnection != null && !this.playingSound) {
                callConnection.destroy();
            }
        }
        n1.f39494a = SystemClock.elapsedRealtime();
        setSinks(null, null);
        Runnable runnable3 = this.onDestroyRunnable;
        if (runnable3 != null) {
            runnable3.run();
        }
        int i10 = this.currentAccount;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i10).setAppPaused(true, false);
            if (t3.T(this.chat)) {
                hp.s1(this.currentAccount).V4(this.chat, this.classGuid, true, null);
            }
        }
    }

    public void onGroupCallParticipantsUpdate(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants) {
        r3 r3Var = this.groupCall;
        if (r3Var != null && r3Var.f25049b.f27011id == tL_updateGroupCallParticipants.call.f27018id) {
            r3Var.f25057l.clear();
            this.groupCall.f25058m.clear();
            if (this.conference != null) {
                this.groupCall.p(tL_updateGroupCallParticipants, false);
                this.conference.updateParticipants(this.groupCall.f25051e, true);
                for (int i3 = 0; i3 < this.stateListeners.size(); i3++) {
                    this.stateListeners.get(i3).onStateChanged(getCallState());
                }
                r3 r3Var2 = this.groupCall;
                r3Var2.f25057l.addAll(this.conference.getShadyLeftParticipants(r3Var2.f25051e));
                r3 r3Var3 = this.groupCall;
                r3Var3.f25058m.addAll(this.conference.getShadyJoiningParticipants(r3Var3.f25051e));
                hs.f(this.currentAccount).k(hs.f23328w2, 0L, Long.valueOf(this.groupCall.f25049b.f27011id), Boolean.FALSE);
            }
            long selfId = getSelfId();
            int size = tL_updateGroupCallParticipants.participants.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i10);
                if (groupCallParticipant.left) {
                    int i11 = groupCallParticipant.source;
                    if (i11 != 0 && i11 == this.mySource[0]) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < size; i13++) {
                            TLRPC.GroupCallParticipant groupCallParticipant2 = tL_updateGroupCallParticipants.participants.get(i13);
                            if (groupCallParticipant2.self || groupCallParticipant2.source == this.mySource[0]) {
                                i12++;
                            }
                        }
                        if (i12 > 1) {
                            hangUp(2);
                            return;
                        }
                    }
                } else if (zi.C1(groupCallParticipant.peer) != selfId) {
                    continue;
                } else {
                    int i14 = groupCallParticipant.source;
                    int i15 = this.mySource[0];
                    if (i14 != i15 && i15 != 0 && i14 != 0) {
                        if (r2.f25040a) {
                            StringBuilder sb2 = new StringBuilder("source mismatch my = ");
                            sb2.append(this.mySource[0]);
                            sb2.append(" psrc = ");
                            p1.q(groupCallParticipant.source, sb2);
                        }
                        hangUp(2);
                        return;
                    }
                    if (t3.T(this.chat) && this.currentGroupModeStreaming && groupCallParticipant.can_self_unmute) {
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
        boolean z10;
        this.lastSensorEvent = sensorEvent;
        if (!this.unmutedByHold && this.remoteVideoState != 2 && this.videoState[0] != 2 && sensorEvent.sensor.getType() == 8) {
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            if (this.audioRouteToSet == 0 && !this.isHeadsetPlugged && !voipAudioManager.isSpeakerphoneOn()) {
                if (!isBluetoothHeadsetConnected() || !voipAudioManager.isBluetoothOn()) {
                    if (sensorEvent.values[0] < Math.min(sensorEvent.sensor.getMaximumRange(), 3.0f)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    checkIsNear(z10);
                    hs.e().k(hs.G5, Boolean.valueOf(z10));
                }
            }
        }
    }

    public void onSignalBarCountChanged(int i3) {
        org.telegram.messenger.g0.h3(new x(this, i3, 0));
    }

    public void onSignalingData(TL_update.TL_updatePhoneCallSignalingData tL_updatePhoneCallSignalingData) {
        NativeInstance nativeInstance;
        if (this.user == null || (nativeInstance = this.tgVoip[0]) == null || nativeInstance.isGroup() || getCallID() != tL_updatePhoneCallSignalingData.phone_call_id) {
            return;
        }
        this.tgVoip[0].onSignalingDataReceive(tL_updatePhoneCallSignalingData.data);
    }

    @Override
    public int onStartCommand(Intent intent, int i3, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        int i11;
        if (sharedInstance != null) {
            if (r2.f25040a) {
                a8.d("Tried to start the VoIP service when it's already started");
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
                this.user = hp.s1(this.currentAccount).a2(Long.valueOf(longExtra));
            }
            int i12 = (longExtra2 > 0L ? 1 : (longExtra2 == 0L ? 0 : -1));
            if (i12 != 0) {
                TLRPC.Chat M0 = hp.s1(this.currentAccount).M0(Long.valueOf(longExtra2));
                this.chat = M0;
                if (t3.T(M0)) {
                    hp.s1(this.currentAccount).V4(this.chat, this.classGuid, false, null);
                }
            }
            loadResources();
            int i13 = 0;
            while (true) {
                ProxyVideoSink[] proxyVideoSinkArr = this.localSink;
                if (i13 < proxyVideoSinkArr.length) {
                    proxyVideoSinkArr[i13] = new ProxyVideoSink();
                    this.remoteSink[i13] = new ProxyVideoSink();
                    i13++;
                } else {
                    try {
                        break;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
            }
            this.isHeadsetPlugged = ((AudioManager) getSystemService("audio")).isWiredHeadsetOn();
            if (this.chat != null && !this.createGroupCall && hp.s1(this.currentAccount).g1(this.chat.f27001id, false, null) == null) {
                a8.l("VoIPService: trying to open group call without call " + this.chat.f27001id);
                stopSelf();
                return 2;
            }
            if (this.videoCall) {
                if (checkSelfPermission("android.permission.CAMERA") == 0) {
                    i11 = 0;
                    this.captureDevice[0] = NativeInstance.createVideoCapturer(this.localSink[0], this.isFrontFaceCamera ? 1 : 0);
                    if (i12 != 0) {
                        this.videoState[0] = 1;
                    } else {
                        this.videoState[0] = 2;
                    }
                } else {
                    i11 = 0;
                    this.videoState[0] = 1;
                }
                if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                    setAudioOutput(i11);
                }
            }
            if (this.user == null && this.chat == null && this.joinConference == null) {
                if (r2.f25040a) {
                    a8.l("VoIPService: user == null AND chat == null");
                }
                stopSelf();
                return 2;
            }
            sharedInstance = this;
            a8.d("(4) set sharedInstance = this");
            synchronized (sync) {
                try {
                    if (setModeRunnable != null) {
                        Utilities.f21387e.a(setModeRunnable);
                        setModeRunnable = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            VoIPGroupNotification.hide(this);
            if (this.joinConference != null) {
                if (!hp.e1().getBoolean("callmiconstart", true)) {
                    this.micMute = true;
                } else if (!nf.d("android.permission.RECORD_AUDIO")) {
                    this.micMute = true;
                    nf.e(new String[]{"android.permission.RECORD_AUDIO"}, new lm(new u10() {
                        @Override
                        public final void a(Object obj) {
                            VoIPService.this.lambda$onStartCommand$1((Boolean) obj);
                        }
                    }, 1));
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
                        g5 r5 = g5.r(this.currentAccount);
                        TLRPC.User user = this.user;
                        r5.g(user.f27150id, user.first_name, user.last_name);
                        ((TelecomManager) getSystemService("telecom")).placeCall(Uri.fromParts("tel", "+99084" + this.user.f27150id, null), bundle);
                    } else {
                        q qVar = new q(this, 22);
                        this.delayedStartOutgoingCall = qVar;
                        org.telegram.messenger.g0.i3(qVar, 2000L);
                    }
                    z12 = false;
                } else {
                    this.micMute = true;
                    z12 = false;
                    startGroupCall(0, null, false);
                    if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                        setAudioOutput(0);
                    }
                }
                if (intent.getBooleanExtra("start_incall_activity", z12)) {
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
                hs.e().k(hs.E2, new Object[0]);
                TL_phone.PhoneCall phoneCall = callIShouldHavePutIntoIntent;
                this.privateCall = phoneCall;
                if (phoneCall != null && phoneCall.video) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.videoCall = z10;
                if (z10) {
                    this.isVideoAvailable = true;
                }
                if (z10 && !this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                    z11 = false;
                    setAudioOutput(0);
                } else {
                    z11 = false;
                }
                callIShouldHavePutIntoIntent = null;
                a8.d("(3) set VoIPService.callIShouldHavePutIntoIntent = null");
                if (this.instantAccept) {
                    this.instantAccept = z11;
                    acceptIncomingCall();
                } else if (USE_CONNECTION_SERVICE) {
                    acknowledgeCall(z11);
                    showNotification();
                } else {
                    acknowledgeCall(true);
                }
                if (booleanExtra) {
                    Activity W = org.telegram.messenger.g0.W(this);
                    if (W == null) {
                        W = LaunchActivity.K1;
                    }
                    if (W == null) {
                        W = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f25457b);
                    }
                    if (W != null) {
                        zb1.v(W, this.currentAccount);
                    }
                }
            }
            initializeAccountRelatedThings();
            org.telegram.messenger.g0.h3(new q(this, 23));
            return 2;
        }
        throw new IllegalStateException("No account specified when starting VoIP service");
    }

    public void playAllowTalkSound() {
        Utilities.f21387e.c(new q(this, 3));
    }

    public void playConnectedSound() {
        Utilities.f21387e.c(new q(this, 1));
        this.playedConnectedSound = true;
    }

    public void playStartRecordSound() {
        Utilities.f21387e.c(new q(this, 2));
    }

    public void processMessageUpdate(zi ziVar) {
        TLRPC.Message message;
        q3 q3Var;
        boolean z10;
        if (ziVar != null && (message = ziVar.f26868k) != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
            long B0 = zi.B0(message);
            int f12 = ziVar.f1();
            TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) ziVar.f26868k.action;
            r3 r3Var = this.groupCall;
            if (r3Var != null && (q3Var = (q3) r3Var.f25056k.get(Long.valueOf(B0))) != null && q3Var.f24848a == f12) {
                if (!tL_messageActionConferenceCall.missed && !tL_messageActionConferenceCall.active) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (q3Var.a() != z10) {
                    q3Var.f24849b = z10;
                    this.groupCall.f25056k.put(Long.valueOf(B0), q3Var);
                    hs.f(this.currentAccount).k(hs.f23328w2, 0L, Long.valueOf(this.groupCall.f25049b.f27011id), Boolean.FALSE);
                }
            }
        }
    }

    public void registerStateListener(StateListener stateListener) {
        if (!this.stateListeners.contains(stateListener)) {
            this.stateListeners.add(stateListener);
            int i3 = this.currentState;
            if (i3 != 0) {
                stateListener.onStateChanged(i3);
            }
            int i10 = this.signalBarCount;
            if (i10 != 0) {
                stateListener.onSignalBarsCountChanged(i10);
            }
        }
    }

    public void removeRemoteSink(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        if (z10) {
            ProxyVideoSink remove = this.remoteSinks.remove(groupCallParticipant.presentationEndpoint);
            if (remove != null) {
                this.tgVoip[0].removeIncomingVideoOutput(remove.nativeInstance);
                return;
            }
            return;
        }
        ProxyVideoSink remove2 = this.remoteSinks.remove(groupCallParticipant.videoEndpoint);
        if (remove2 != null) {
            this.tgVoip[0].removeIncomingVideoOutput(remove2.nativeInstance);
        }
    }

    public void requestFullScreen(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10, boolean z11) {
        String str;
        if (z11) {
            str = groupCallParticipant.presentationEndpoint;
        } else {
            str = groupCallParticipant.videoEndpoint;
        }
        if (str == null) {
            return;
        }
        if (z10) {
            this.tgVoip[0].setVideoEndpointQuality(str, 2);
        } else {
            this.tgVoip[0].setVideoEndpointQuality(str, 1);
        }
    }

    public void requestVideoCall(boolean z10) {
        int i3 = 0;
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            return;
        }
        if (!z10) {
            long j10 = this.captureDevice[0];
            if (j10 != 0) {
                nativeInstance.setupOutgoingVideoCreated(j10);
                this.destroyCaptureDevice[0] = false;
                this.isPrivateScreencast = z10;
            }
        }
        ProxyVideoSink proxyVideoSink = this.localSink[0];
        if (z10) {
            i3 = 2;
        } else if (this.isFrontFaceCamera) {
            i3 = 1;
        }
        nativeInstance.setupOutgoingVideo(proxyVideoSink, i3);
        this.isPrivateScreencast = z10;
    }

    public void sendCallRating(int i3) {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        long j10 = phoneCall.f27229id;
        long j11 = phoneCall.access_hash;
        int i10 = this.currentAccount;
        int i11 = h10.f22829t0;
        TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
        setcallrating.rating = i3;
        setcallrating.comment = "";
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        setcallrating.peer = tL_inputPhoneCall;
        tL_inputPhoneCall.access_hash = j11;
        tL_inputPhoneCall.f27066id = j10;
        setcallrating.user_initiative = false;
        ConnectionsManager.getInstance(i10).sendRequest(setcallrating, new g2(i11, 4));
    }

    public void setAudioOutput(int i3) {
        CallConnection callConnection;
        if (r2.f25040a) {
            a8.b("setAudioOutput " + i3);
        }
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        boolean z10 = USE_CONNECTION_SERVICE;
        int i10 = 0;
        if (z10 && (callConnection = this.systemCallConnection) != null) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        callConnection.setAudioRoute(2);
                    }
                } else {
                    callConnection.setAudioRoute(5);
                }
            } else {
                callConnection.setAudioRoute(8);
            }
        } else if (this.audioConfigured && !z10) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (!this.bluetoothScoActive) {
                            this.needSwitchToBluetoothAfterScoActivates = true;
                            try {
                                voipAudioManager.startBluetooth();
                            } catch (Throwable th2) {
                                a8.g(th2, true);
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
        } else if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
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
        while (i10 < size) {
            StateListener stateListener = arrayList.get(i10);
            i10++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public void setAudioRoute(int i3) {
        if (i3 == 1) {
            setAudioOutput(0);
        } else if (i3 == 0) {
            setAudioOutput(1);
        } else if (i3 == 2) {
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
        r3 r3Var = this.groupCall;
        if (r3Var != null) {
            this.groupCallPeer = inputPeer;
            r3Var.x(inputPeer);
            TLRPC.ChatFull N0 = hp.s1(this.currentAccount).N0(this.groupCall.f25050c);
            if (N0 != null) {
                TLRPC.Peer peer = this.groupCall.J;
                N0.groupcall_default_join_as = peer;
                if (peer != null) {
                    if (N0 instanceof TLRPC.TL_chatFull) {
                        N0.flags |= 32768;
                    } else {
                        N0.flags |= 67108864;
                    }
                } else if (N0 instanceof TLRPC.TL_chatFull) {
                    N0.flags &= -32769;
                } else {
                    N0.flags &= -67108865;
                }
            }
            createGroupInstance(0, true, true);
            if (this.videoState[1] == 2) {
                createGroupInstance(1, true, true);
            }
        }
    }

    public void setLocalSink(VideoSink videoSink, boolean z10) {
        if (z10) {
            return;
        }
        this.localSink[0].setTarget(videoSink);
    }

    public void setMicMute(boolean r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPService.setMicMute(boolean, boolean, boolean):void");
    }

    public void setNoiseSupressionEnabled(boolean z10) {
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            return;
        }
        nativeInstance.setNoiseSuppressionEnabled(z10);
    }

    public void setParticipantVolume(TLRPC.GroupCallParticipant groupCallParticipant, int i3) {
        int i10;
        double d = i3 / 10000.0d;
        this.tgVoip[0].setVolume(groupCallParticipant.source, d);
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.presentation;
        if (tL_groupCallParticipantVideo != null && (i10 = tL_groupCallParticipantVideo.audio_source) != 0) {
            this.tgVoip[0].setVolume(i10, d);
        }
    }

    public void setParticipantsVolume() {
        if (this.tgVoip[0] != null) {
            int m10 = this.groupCall.d.m();
            for (int i3 = 0; i3 < m10; i3++) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.groupCall.d.n(i3);
                if (!groupCallParticipant.self && groupCallParticipant.source != 0 && (groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
                    if (groupCallParticipant.muted_by_you) {
                        setParticipantVolume(groupCallParticipant, 0);
                    } else {
                        setParticipantVolume(groupCallParticipant, t3.H(groupCallParticipant));
                    }
                }
            }
        }
    }

    public void setRemoteSink(VideoSink videoSink, boolean z10) {
        this.remoteSink[z10 ? 1 : 0].setTarget(videoSink);
    }

    public void setSinks(VideoSink videoSink, VideoSink videoSink2) {
        setSinks(videoSink, false, videoSink2);
    }

    public void setSwitchingCamera(boolean z10, boolean z11) {
        this.switchingCamera = z10;
        if (!z10) {
            this.isFrontFaceCamera = z11;
            for (int i3 = 0; i3 < this.stateListeners.size(); i3++) {
                this.stateListeners.get(i3).onCameraSwitch(this.isFrontFaceCamera);
            }
        }
    }

    public void setVideoState(boolean z10, int i3) {
        char c2;
        int i10;
        boolean z11 = false;
        int i11 = 0;
        if (this.groupCall != null) {
            c2 = z10 ? 1 : 0;
        } else {
            c2 = 0;
        }
        NativeInstance nativeInstance = this.tgVoip[c2];
        if (nativeInstance == null) {
            long[] jArr = this.captureDevice;
            long j10 = jArr[z10 ? 1 : 0];
            if (j10 != 0) {
                this.videoState[c2] = i3;
                NativeInstance.setVideoStateCapturer(j10, i3);
                return;
            } else if (i3 == 2 && (i10 = this.currentState) != 17 && i10 != 11) {
                ProxyVideoSink proxyVideoSink = this.localSink[c2];
                if (z10) {
                    i11 = 2;
                } else if (this.isFrontFaceCamera) {
                    i11 = 1;
                }
                jArr[z10 ? 1 : 0] = NativeInstance.createVideoCapturer(proxyVideoSink, i11);
                this.videoState[c2] = 2;
                return;
            } else {
                return;
            }
        }
        this.videoState[c2] = i3;
        nativeInstance.setVideoState(i3);
        long j11 = this.captureDevice[z10 ? 1 : 0];
        if (j11 != 0) {
            NativeInstance.setVideoStateCapturer(j11, this.videoState[c2]);
        }
        if (!z10) {
            if (this.groupCall != null) {
                TLRPC.User f10 = h10.i(this.currentAccount).f();
                if (this.videoState[0] != 2) {
                    z11 = true;
                }
                editCallMember(f10, null, Boolean.valueOf(z11), null, null, null);
            }
            checkIsNear();
        }
    }

    public void setupCaptureDevice(boolean z10, boolean z11) {
        NativeInstance nativeInstance;
        boolean z12 = false;
        if (!z10) {
            long j10 = this.captureDevice[z10 ? 1 : 0];
            if (j10 != 0 && (nativeInstance = this.tgVoip[z10 ? 1 : 0]) != null) {
                nativeInstance.setupOutgoingVideoCreated(j10);
                this.destroyCaptureDevice[z10 ? 1 : 0] = false;
                this.videoState[z10 ? 1 : 0] = 2;
            } else {
                return;
            }
        }
        if (this.micMute == z11) {
            setMicMute(!z11, false, false);
            this.micSwitching = true;
        }
        if (this.groupCall != null) {
            TLRPC.User f10 = h10.i(this.currentAccount).f();
            Boolean valueOf = Boolean.valueOf(!z11);
            if (this.videoState[0] != 2) {
                z12 = true;
            }
            editCallMember(f10, valueOf, Boolean.valueOf(z12), null, null, new q(this, 20));
        }
    }

    @Override
    public void stopRinging() {
        synchronized (sync) {
            try {
                MediaPlayer mediaPlayer = this.ringtonePlayer;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    this.ringtonePlayer.release();
                    this.ringtonePlayer = null;
                }
            } catch (Throwable th2) {
                throw th2;
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
            r3 r3Var = this.groupCall;
            leavegroupcallpresentation.call = r3Var.g(r3Var.f25048a);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcallpresentation, new s(this, 7));
            NativeInstance nativeInstance = this.tgVoip[1];
            if (nativeInstance != null) {
                Utilities.f21387e.c(new p0(nativeInstance, 3));
            }
            this.mySource[1] = 0;
            this.tgVoip[1] = null;
            this.destroyCaptureDevice[1] = true;
            this.captureDevice[1] = 0;
            this.videoState[1] = 0;
            hs.f(org.telegram.messenger.c.a(this.currentAccount).f21919a).k(hs.f23349z2, new Object[0]);
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
        long j10 = this.captureDevice[0];
        if (j10 != 0 && !this.switchingCamera) {
            NativeInstance.switchCameraCapturer(j10, !this.isFrontFaceCamera);
        }
    }

    public void switchToSpeaker() {
        org.telegram.messenger.g0.i3(new q(this, 16), 500L);
    }

    public void toggleSpeakerphoneOrShowRouteSheet(Context context, boolean z10) {
        toggleSpeakerphoneOrShowRouteSheet(context, z10, null);
    }

    public void unregisterStateListener(StateListener stateListener) {
        this.stateListeners.remove(stateListener);
    }

    public void updateCurrentForegroundType() {
        if (this.lastForegroundType != getCurrentForegroundType() && this.foregroundStarted) {
            stopForeground(true);
            if (Build.VERSION.SDK_INT >= 33) {
                int i3 = this.foregroundId;
                Notification notification = this.foregroundNotification;
                int currentForegroundType = getCurrentForegroundType();
                this.lastForegroundType = currentForegroundType;
                startForeground(i3, notification, currentForegroundType);
                return;
            }
            startForeground(this.foregroundId, this.foregroundNotification);
        }
    }

    public void updateOutputGainControlState() {
        hasRtmpStream();
    }

    private void callFailed(String str) {
        CallConnection callConnection;
        if (this.privateCall != null) {
            if (r2.f25040a) {
                a8.b("Discarding failed call");
            }
            TL_phone.discardCall discardcall = new TL_phone.discardCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            discardcall.peer = tL_inputPhoneCall;
            TL_phone.PhoneCall phoneCall = this.privateCall;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            tL_inputPhoneCall.f27066id = phoneCall.f27229id;
            discardcall.duration = (int) (getCallDuration() / 1000);
            NativeInstance nativeInstance = this.tgVoip[0];
            discardcall.connection_id = nativeInstance != null ? nativeInstance.getPreferredRelayId() : 0L;
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonDisconnect();
            a8.d("discardCall " + discardcall.reason);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new y(0));
        }
        try {
            throw new Exception("Call " + getCallID() + " failed with error: " + str);
        } catch (Exception e10) {
            a8.g(e10, true);
            this.lastError = str;
            org.telegram.messenger.g0.h3(new q(this, 5));
            if (TextUtils.equals(str, "ERROR_LOCALIZED") && this.soundPool != null) {
                this.playingSound = true;
                Utilities.f21387e.c(new q(this, 6));
                org.telegram.messenger.g0.i3(this.afterSoundRunnable, 1000L);
            }
            if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null) {
                callConnection.setDisconnected(new DisconnectCause(1));
                this.systemCallConnection.destroy();
                this.systemCallConnection = null;
            }
            stopSelf();
        }
    }

    private static int getCurrentForegroundType(ContextWrapper contextWrapper, boolean z10) {
        if (Build.VERSION.SDK_INT < 29) {
            return 226;
        }
        int i3 = contextWrapper.checkSelfPermission("android.permission.CAMERA") == 0 ? 64 : 0;
        if (contextWrapper.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            i3 |= 128;
        }
        if (z10) {
            i3 |= 32;
        }
        return i3 | 2;
    }

    public void setSinks(VideoSink videoSink, boolean z10, VideoSink videoSink2) {
        ProxyVideoSink proxyVideoSink = this.localSink[z10 ? 1 : 0];
        ProxyVideoSink proxyVideoSink2 = this.remoteSink[z10 ? 1 : 0];
        if (proxyVideoSink != null) {
            proxyVideoSink.setTarget(videoSink);
        }
        if (proxyVideoSink2 != null) {
            proxyVideoSink2.setTarget(videoSink2);
        }
    }

    public void toggleSpeakerphoneOrShowRouteSheet(Context context, boolean z10, Integer num) {
        CallConnection callConnection;
        int i3 = 0;
        if (isBluetoothHeadsetConnected() && hasEarpiece()) {
            t2 l10 = k5.l(1, context, null, false);
            l10.P = bd.M0(2131743274, null);
            l10.Q = true;
            l10.Y = num;
            l10.X = num != null ? 4 : 0;
            String M0 = bd.M0(2131743509, null);
            String M02 = bd.M0(this.isHeadsetPlugged ? 2131743511 : 2131743512, null);
            String str = this.currentBluetoothDeviceName;
            if (str == null) {
                str = bd.M0(2131743513, null);
            }
            CharSequence[] charSequenceArr = {M0, M02, str};
            int i10 = this.isHeadsetPlugged ? 2131230920 : 2131232079;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    VoIPService.this.lambda$toggleSpeakerphoneOrShowRouteSheet$93(dialogInterface, i11);
                }
            };
            l10.M = charSequenceArr;
            l10.N = new int[]{2131232081, i10, 2131232078};
            l10.L = onClickListener;
            l10.setOnShowListener(new lg.o(1, l10, num));
            if (z10) {
                if (Build.VERSION.SDK_INT >= 26) {
                    l10.getWindow().setType(2038);
                } else {
                    l10.getWindow().setType(2003);
                }
            }
            l10.show();
            return;
        }
        boolean z11 = USE_CONNECTION_SERVICE;
        if (z11 && (callConnection = this.systemCallConnection) != null && callConnection.getCallAudioState() != null) {
            if (hasEarpiece()) {
                CallConnection callConnection2 = this.systemCallConnection;
                callConnection2.setAudioRoute(callConnection2.getCallAudioState().getRoute() != 8 ? 8 : 5);
            } else {
                CallConnection callConnection3 = this.systemCallConnection;
                callConnection3.setAudioRoute(callConnection3.getCallAudioState().getRoute() == 2 ? 5 : 2);
            }
        } else if (this.audioConfigured && !z11) {
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            if (hasEarpiece()) {
                voipAudioManager.setSpeakerphoneOn(!voipAudioManager.isSpeakerphoneOn());
            } else {
                voipAudioManager.setBluetoothOn(!voipAudioManager.isBluetoothOn());
            }
            voipAudioManager.isBluetoothAndSpeakerOnAsync(new r(this, 1));
            return;
        } else {
            this.speakerphoneStateToSet = !this.speakerphoneStateToSet;
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i3 < size) {
            StateListener stateListener = arrayList.get(i3);
            i3++;
            stateListener.onAudioSettingsChanged();
        }
    }

    private void checkIsNear(boolean z10) {
        if (z10 != this.isProximityNear) {
            if (r2.f25040a) {
                a8.b("proximity " + z10);
            }
            this.isProximityNear = z10;
            try {
                if (z10) {
                    this.proximityWakelock.acquire();
                } else {
                    this.proximityWakelock.release(1);
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
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
        tL_inputPhoneCall.f27066id = phoneCall.f27229id;
        sendsignalingdata.data = bArr;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendsignalingdata, null);
    }

    public void hangUp() {
        hangUp(0, null);
    }

    private void onTgVoipPreStop() {
    }

    public void hangUp(int i3) {
        hangUp(i3, null);
    }

    public void hangUp(Runnable runnable) {
        hangUp(0, runnable);
    }

    @Override
    public void declineIncomingCall() {
        declineIncomingCall(1, null);
    }

    public void startRingtoneAndVibration() {
        if (this.startedRinging) {
            return;
        }
        startRingtoneAndVibration(this.user.f27150id);
        this.startedRinging = true;
    }

    public static void lambda$createGroupInstance$67(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i3) {
    }

    private void showNotification() {
        if (this.user != null) {
            showNotification(getTitle(), getRoundAvatarBitmap(this, this.currentAccount, this.user));
        } else {
            showNotification(getTitle(), getRoundAvatarBitmap(this, this.currentAccount, this.chat));
        }
    }
}
