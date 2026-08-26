package org.telegram.messenger.voip;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
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
import android.media.AudioAttributes;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaRouter;
import android.media.RingtoneManager;
import android.media.SoundPool;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
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
import android.provider.Settings;
import android.telecom.CallAudioState;
import android.telecom.Connection;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.LruCache;
import android.view.KeyEvent;
import android.widget.RemoteViews;
import android.widget.Toast;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzjj;
import j$.util.Map;
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
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import me.vkryl.android.util.ClickHelper$$ExternalSyntheticLambda0;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticApiModelOutline1;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatObject$Call$$ExternalSyntheticOutline0;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.StatsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.messenger.pip.PipSource$$ExternalSyntheticApiModelOutline0;
import org.telegram.messenger.utils.tlutils.TlUtils;
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
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda9;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda26;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda31;
import org.telegram.ui.CastSync$$ExternalSyntheticApiModelOutline0;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda208;
import org.telegram.ui.ChatActivity$70$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda42;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda63;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda52;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda89;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda22;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda75;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda102;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda9;
import org.telegram.ui.VoIPFeedbackActivity;
import org.telegram.ui.VoIPFragment;
import org.telegram.ui.VoIPPermissionActivity;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda3;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;

public class VoIPService extends Service implements SensorEventListener, AudioManager.OnAudioFocusChangeListener, VoIPController.ConnectionStateListener, NotificationCenter.NotificationCenterDelegate, VoIPServiceState {
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
    public ChatObject.Call groupCall;
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
        @Override
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            try {
                if (Build.VERSION.SDK_INT < 31) {
                    for (BluetoothDevice bluetoothDevice : bluetoothProfile.getConnectedDevices()) {
                        if (bluetoothProfile.getConnectionState(bluetoothDevice) == 2) {
                            VoIPService.this.currentBluetoothDeviceName = bluetoothDevice.getName();
                            break;
                        }
                    }
                }
                BluetoothAdapter.getDefaultAdapter().closeProfileProxy(i, bluetoothProfile);
                VoIPService.this.fetchingBluetoothDeviceName = false;
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        @Override
        public void onServiceDisconnected(int i) {
        }
    };
    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int i = 0;
            if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                VoIPService.this.isHeadsetPlugged = intent.getIntExtra("state", 0) == 1;
                if (VoIPService.this.isHeadsetPlugged && VoIPService.this.proximityWakelock != null && VoIPService.this.proximityWakelock.isHeld()) {
                    VoIPService.this.proximityWakelock.release();
                }
                if (VoIPService.this.isHeadsetPlugged) {
                    AudioManager audioManager = (AudioManager) VoIPService.this.getSystemService("audio");
                    if (VoipAudioManager.get().isSpeakerphoneOn()) {
                        VoIPService.this.previousAudioOutput = 0;
                    } else if (audioManager.isBluetoothScoOn()) {
                        VoIPService.this.previousAudioOutput = 2;
                    } else {
                        VoIPService.this.previousAudioOutput = 1;
                    }
                    VoIPService.this.setAudioOutput(1);
                } else if (VoIPService.this.previousAudioOutput >= 0) {
                    VoIPService voIPService = VoIPService.this;
                    voIPService.setAudioOutput(voIPService.previousAudioOutput);
                    VoIPService.this.previousAudioOutput = -1;
                }
                VoIPService.this.isProximityNear = false;
                VoIPService.this.updateOutputGainControlState();
                return;
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                VoIPService.this.updateNetworkType();
                return;
            }
            if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("bt headset state = " + intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0));
                }
                VoIPService.this.updateBluetoothHeadsetState(intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0) == 2);
                return;
            }
            if (!"android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
                if ("android.intent.action.PHONE_STATE".equals(intent.getAction())) {
                    if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(intent.getStringExtra("state"))) {
                        VoIPService.this.hangUp();
                        return;
                    }
                    return;
                } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                    while (i < VoIPService.this.stateListeners.size()) {
                        ((StateListener) VoIPService.this.stateListeners.get(i)).onScreenOnChange(true);
                        i++;
                    }
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        for (int i2 = 0; i2 < VoIPService.this.stateListeners.size(); i2++) {
                            ((StateListener) VoIPService.this.stateListeners.get(i2)).onScreenOnChange(false);
                        }
                        return;
                    }
                    return;
                }
            }
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Bluetooth SCO state updated: " + intExtra);
            }
            if (intExtra == 0 && VoIPService.this.isBtHeadsetConnected && (!VoIPService.this.btAdapter.isEnabled() || !PermissionRequest.hasPermission("android.permission.BLUETOOTH_CONNECT") || VoIPService.this.btAdapter.getProfileConnectionState(1) != 2)) {
                VoIPService.this.updateBluetoothHeadsetState(false);
                return;
            }
            VoIPService.this.bluetoothScoConnecting = intExtra == 2;
            VoIPService.this.bluetoothScoActive = intExtra == 1;
            if (VoIPService.this.bluetoothScoActive) {
                VoIPService.this.fetchBluetoothDeviceName();
                if (VoIPService.this.needSwitchToBluetoothAfterScoActivates) {
                    VoIPService.this.needSwitchToBluetoothAfterScoActivates = false;
                    AudioManager audioManager2 = (AudioManager) VoIPService.this.getSystemService("audio");
                    VoipAudioManager.get().setSpeakerphoneOn(false);
                    audioManager2.setBluetoothScoOn(true);
                }
            }
            ArrayList arrayList = VoIPService.this.stateListeners;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((StateListener) obj).onAudioSettingsChanged();
            }
        }
    };
    private final HashMap<String, TLRPC.GroupCallParticipant> waitingFrameParticipant = new HashMap<>();
    private final LruCache<String, ProxyVideoSink> proxyVideoSinkLruCache = new LruCache<String, ProxyVideoSink>(6) {
        @Override
        public void entryRemoved(boolean z, String str, ProxyVideoSink proxyVideoSink, ProxyVideoSink proxyVideoSink2) {
            super.entryRemoved(z, str, proxyVideoSink, proxyVideoSink2);
            VoIPService.this.tgVoip[0].removeIncomingVideoOutput(proxyVideoSink.nativeInstance);
        }
    };
    private ProxyVideoSink[] localSink = new ProxyVideoSink[2];
    private ProxyVideoSink[] remoteSink = new ProxyVideoSink[2];
    private ProxyVideoSink[] currentBackgroundSink = new ProxyVideoSink[2];
    private String[] currentBackgroundEndpointId = new String[2];
    private HashMap<String, ProxyVideoSink> remoteSinks = new HashMap<>();
    private final Runnable destroyConvertingRunnable = new VoIPService$$ExternalSyntheticLambda46(this, 5);

    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        public void lambda$run$0() {
            VoIPService.this.soundPool.release();
        }

        public static void lambda$run$1(AudioManager audioManager) {
            synchronized (VoIPService.sync) {
                try {
                    if (VoIPService.setModeRunnable == null) {
                        return;
                    }
                    Runnable unused = VoIPService.setModeRunnable = null;
                    try {
                        audioManager.setMode(0);
                    } catch (SecurityException e) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("Error setting audio more to normal", e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        public void run() {
            AudioManager audioManager = (AudioManager) VoIPService.this.getSystemService("audio");
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            audioManager.abandonAudioFocus(VoIPService.this);
            audioManager.unregisterMediaButtonEventReceiver(new ComponentName(VoIPService.this, (Class<?>) VoIPMediaButtonReceiver.class));
            if (VoIPService.this.audioDeviceCallback != null) {
                audioManager.unregisterAudioDeviceCallback(VoIPService.this.audioDeviceCallback);
            }
            if (!VoIPService.USE_CONNECTION_SERVICE && VoIPService.sharedInstance == null) {
                if (VoIPService.this.isBtHeadsetConnected) {
                    audioManager.stopBluetoothSco();
                    audioManager.setBluetoothScoOn(false);
                    VoIPService.this.bluetoothScoActive = false;
                    VoIPService.this.bluetoothScoConnecting = false;
                }
                voipAudioManager.setSpeakerphoneOn(false);
            }
            int i = 0;
            Utilities.globalQueue.postRunnable(new VoIPService$1$$ExternalSyntheticLambda0(this, i));
            Utilities.globalQueue.postRunnable(VoIPService.setModeRunnable = new VoIPService$1$$ExternalSyntheticLambda1(audioManager, i));
        }
    }

    public class AnonymousClass5 implements VideoSink {
        final String val$endpointId;
        final boolean val$screencast;

        public AnonymousClass5(String str, boolean z) {
            this.val$endpointId = str;
            this.val$screencast = z;
        }

        public void lambda$onFrame$0(String str, VideoSink videoSink, boolean z) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) VoIPService.this.waitingFrameParticipant.remove(str);
            ProxyVideoSink proxyVideoSink = (ProxyVideoSink) VoIPService.this.remoteSinks.get(str);
            if (proxyVideoSink != null && proxyVideoSink.target == videoSink) {
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
            ChatObject.Call call = VoIPService.this.groupCall;
            if (call != null) {
                call.updateVisibleParticipants();
            }
        }

        @Override
        public void onFrame(VideoFrame videoFrame) {
            if (videoFrame == null || videoFrame.getBuffer().getHeight() == 0 || videoFrame.getBuffer().getWidth() == 0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda64(this, this.val$endpointId, this, this.val$screencast, 1));
        }

        @Override
        public final void setParentSink(VideoSink videoSink) {
            VideoSink.CC.$default$setParentSink(this, videoSink);
        }
    }

    public class AnonymousClass9 implements Runnable {
        public AnonymousClass9() {
        }

        public void lambda$run$0() {
            if (VoIPService.this.spPlayId == 0) {
                VoIPService voIPService = VoIPService.this;
                voIPService.spPlayId = voIPService.soundPool.play(VoIPService.this.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
            }
            if (VoIPService.this.spPlayId == 0) {
                AndroidUtilities.runOnUIThread(this, 100L);
            } else {
                VoIPService.this.connectingSoundRunnable = null;
            }
        }

        @Override
        public void run() {
            if (VoIPService.sharedInstance == null) {
                return;
            }
            Utilities.globalQueue.postRunnable(new VoIPService$1$$ExternalSyntheticLambda0(this, 1));
        }
    }

    public class CallConnection extends Connection {
        public CallConnection() {
            setConnectionProperties(128);
            setAudioModeIsVoip(true);
        }

        @Override
        public void onAnswer() {
            VoIPService.this.acceptIncomingCallFromNotification();
        }

        @Override
        public void onCallAudioStateChanged(CallAudioState callAudioState) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("ConnectionService call audio state changed: " + callAudioState);
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
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("ConnectionService onCallEvent " + str);
            }
        }

        @Override
        public void onDisconnect() {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("ConnectionService onDisconnect");
            }
            setDisconnected(VoIPService$$ExternalSyntheticApiModelOutline2.m$3());
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
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("onSlience");
            }
            VoIPService.this.stopRinging();
        }

        @Override
        public void onStateChanged(int i) {
            super.onStateChanged(i);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("ConnectionService onStateChanged " + Connection.stateToString(i));
            }
            if (i == 4) {
                ContactsController.getInstance(VoIPService.this.currentAccount).deleteConnectionServiceContact();
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
            } catch (Throwable th) {
                throw th;
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
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override
        public final void setParentSink(VideoSink videoSink) {
            VideoSink.CC.$default$setParentSink(this, videoSink);
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
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized void swap() {
            VideoSink videoSink;
            if (this.target == null || (videoSink = this.background) == null) {
                return;
            }
            this.target = videoSink;
            this.background = null;
        }
    }

    public static class RequestedParticipant {
        public int audioSsrc;
        public TLRPC.GroupCallParticipant participant;
        public long userId;

        public RequestedParticipant(TLRPC.GroupCallParticipant groupCallParticipant, int i) {
            this.participant = groupCallParticipant;
            this.audioSsrc = i;
            this.userId = groupCallParticipant == null ? 0L : DialogObject.getPeerDialogId(groupCallParticipant.peer);
        }
    }

    public static class SharedUIParams {
        public boolean cameraAlertWasShowed;
        public boolean tapToVideoTooltipWasShowed;
        public boolean wasVideoCall;
    }

    public void acceptIncomingCallFromNotification() {
        showNotification();
        if (Build.VERSION.SDK_INT >= 23 && (checkSelfPermission("android.permission.RECORD_AUDIO") != 0 || (this.privateCall.video && checkSelfPermission("android.permission.CAMERA") != 0))) {
            try {
                PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) VoIPPermissionActivity.class).addFlags(268435456), 1107296256).send();
                return;
            } catch (Exception e) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("Error starting permission activity", e);
                    return;
                }
                return;
            }
        }
        acceptIncomingCall();
        try {
            PendingIntent.getActivity(this, 0, new Intent(this, getUIActivityClass()).setAction("voip"), 33554432).send();
        } catch (Exception e2) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error starting incall activity", e2);
            }
        }
    }

    private void acknowledgeCall(boolean z) {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        if (phoneCall == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("Call is null, wtf");
            }
            stopSelf();
            return;
        }
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("Call " + this.privateCall.id + " was discarded before the service started, stopping");
            }
            stopSelf();
            return;
        }
        if (XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020) && ((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("MIUI: no permission to show when locked but the screen is locked. ¯\\_(ツ)_/¯");
            }
            stopSelf();
            return;
        }
        TL_phone.receivedCall receivedcall = new TL_phone.receivedCall();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        receivedcall.peer = tL_inputPhoneCall;
        TL_phone.PhoneCall phoneCall2 = this.privateCall;
        tL_inputPhoneCall.id = phoneCall2.id;
        tL_inputPhoneCall.access_hash = phoneCall2.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(receivedcall, new CallLogActivity$$ExternalSyntheticLambda31(2, this, z), 65536);
    }

    private PhoneAccountHandle addAccountToTelecomManager() {
        TelecomManager telecomManager = (TelecomManager) getSystemService("telecom");
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        VoIPService$$ExternalSyntheticApiModelOutline2.m1040m$1();
        PhoneAccountHandle phoneAccountHandleM = VoIPService$$ExternalSyntheticApiModelOutline2.m(new ComponentName(this, (Class<?>) TelegramConnectionService.class), "" + currentUser.id);
        VoIPService$$ExternalSyntheticApiModelOutline2.m1041m$2();
        telecomManager.registerPhoneAccount(VoIPService$$ExternalSyntheticApiModelOutline2.m(phoneAccountHandleM, ContactsController.formatName(currentUser.first_name, currentUser.last_name)).setCapabilities(2048).setIcon(Icon.createWithResource(this, R.drawable.ic_launcher_dr)).setHighlightColor(-13851168).addSupportedUriScheme("sip").build());
        return phoneAccountHandleM;
    }

    private void broadcastUnknownParticipants(long j, int[] iArr) {
        if (this.groupCall == null || this.tgVoip[0] == null) {
            return;
        }
        long selfId = getSelfId();
        int length = iArr.length;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.groupCall.participantsBySources.get(iArr[i]);
            if (groupCallParticipant == null && (groupCallParticipant = this.groupCall.participantsByVideoSources.get(iArr[i])) == null) {
                groupCallParticipant = this.groupCall.participantsByPresentationSources.get(iArr[i]);
            }
            if (groupCallParticipant != null && MessageObject.getPeerId(groupCallParticipant.peer) != selfId && groupCallParticipant.source != 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(new RequestedParticipant(groupCallParticipant, iArr[i]));
            }
        }
        if (arrayList != null) {
            this.tgVoip[0].onMediaDescriptionAvailable(j, (RequestedParticipant[]) arrayList.toArray(new RequestedParticipant[0]));
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                RequestedParticipant requestedParticipant = (RequestedParticipant) arrayList.get(i2);
                TLRPC.GroupCallParticipant groupCallParticipant2 = requestedParticipant.participant;
                if (groupCallParticipant2.muted_by_you) {
                    this.tgVoip[0].setVolume(requestedParticipant.audioSsrc, 0.0d);
                } else {
                    this.tgVoip[0].setVolume(requestedParticipant.audioSsrc, ((double) ChatObject.getParticipantVolume(groupCallParticipant2)) / 10000.0d);
                }
            }
        }
    }

    private void callEnded() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Call " + getCallID() + " ended");
        }
        this.isCallEnded = true;
        if (this.groupCall != null && (!this.playedConnectedSound || this.onDestroyRunnable != null)) {
            this.needPlayEndSound = false;
        }
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda46(this, 14));
        Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 15));
        Runnable runnable = this.connectingSoundRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.connectingSoundRunnable = null;
        }
        int i = 700;
        if (this.needPlayEndSound) {
            this.playingSound = true;
            if (this.groupCall == null) {
                Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 16));
            } else {
                Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 17), 100L);
                i = 500;
            }
            AndroidUtilities.runOnUIThread(this.afterSoundRunnable, i);
        }
        Runnable runnable2 = this.timeoutRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.timeoutRunnable = null;
        }
        endConnectionServiceCall(this.needPlayEndSound ? i : 0L);
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
                AndroidUtilities.cancelRunOnUIThread(runnable);
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
        if (USE_CONNECTION_SERVICE || (bluetoothAdapter = this.btAdapter) == null || !bluetoothAdapter.isEnabled()) {
            return;
        }
        try {
            MediaRouter mediaRouter = (MediaRouter) getSystemService("media_router");
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            boolean z = true;
            int i = 0;
            if (Build.VERSION.SDK_INT < 24) {
                if (this.btAdapter.getProfileConnectionState(1) != 2) {
                    z = false;
                }
                updateBluetoothHeadsetState(z);
                ArrayList<StateListener> arrayList = this.stateListeners;
                int size = arrayList.size();
                while (i < size) {
                    StateListener stateListener = arrayList.get(i);
                    i++;
                    stateListener.onAudioSettingsChanged();
                }
                return;
            }
            MediaRouter.RouteInfo selectedRoute = mediaRouter.getSelectedRoute(1);
            if (!PermissionRequest.hasPermission("android.permission.BLUETOOTH_CONNECT") || selectedRoute.getDeviceType() != 3) {
                updateBluetoothHeadsetState(audioManager.isBluetoothA2dpOn());
                return;
            }
            if (this.btAdapter.getProfileConnectionState(1) != 2) {
                z = false;
            }
            updateBluetoothHeadsetState(z);
            ArrayList<StateListener> arrayList2 = this.stateListeners;
            int size2 = arrayList2.size();
            while (i < size2) {
                StateListener stateListener2 = arrayList2.get(i);
                i++;
                stateListener2.onAudioSettingsChanged();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    private void configureDeviceForCall() {
        if (BuildVars.LOGS_ENABLED) {
            ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("configureDeviceForCall, route to set = "), this.audioRouteToSet);
        }
        WebRtcAudioTrack.setAudioTrackUsageAttribute(hasRtmpStream() ? 1 : 2);
        WebRtcAudioTrack.setAudioStreamType(hasRtmpStream() ? Integer.MIN_VALUE : 0);
        this.needPlayEndSound = true;
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (!USE_CONNECTION_SERVICE) {
            Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda131(this, audioManager, 0));
        }
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        if (defaultSensor != null) {
            try {
                this.proximityWakelock = ((PowerManager) getSystemService("power")).newWakeLock(32, "telegram-voip-prx");
                sensorManager.registerListener(this, defaultSensor, 3);
            } catch (Exception e) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("Error initializing proximity sensor", e);
                }
            }
        }
    }

    private int convertDataSavingMode(int i) {
        return i != 3 ? i : ApplicationLoader.isRoaming() ? 1 : 0;
    }

    public static String convertStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(line);
            sb.append("\n");
        }
    }

    private void createGroupInstance(int i, boolean z, boolean z2) {
        boolean z3;
        String str;
        String logFilePath;
        int i2 = 3;
        int i3 = 1;
        int i4 = 0;
        if (z) {
            this.mySource[i] = 0;
            if (i == 0) {
                this.switchingAccount = z;
            }
        }
        cancelGroupCheckShortPoll();
        if (i == 0) {
            this.wasConnected = false;
        } else if (!this.wasConnected) {
            this.reconnectScreenCapture = true;
            return;
        }
        if (this.tgVoip[i] == null) {
            if (this.groupCall != null) {
                str = "" + this.groupCall.call.id;
            } else {
                TLRPC.InputGroupCall inputGroupCall = this.joinConference;
                if (inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) {
                    str = inputGroupCall.slug;
                } else if (inputGroupCall instanceof TLRPC.TL_inputGroupCall) {
                    str = "" + this.joinConference.id;
                } else {
                    str = "0";
                }
            }
            boolean[] zArr = {z2};
            if (BuildVars.DEBUG_VERSION) {
                logFilePath = VoIPHelper.getLogFilePath("voip_" + i + "_" + str);
            } else {
                logFilePath = VoIPHelper.getLogFilePath(str, false);
            }
            this.tgVoip[i] = NativeInstance.makeGroup(logFilePath, this.captureDevice[i], i == 1, i == 0 && SharedConfig.noiseSupression, new PassportActivity$$ExternalSyntheticLambda52(this, i, zArr, i2), new VoIPService$$ExternalSyntheticLambda121(this, i, i4), new VoIPService$$ExternalSyntheticLambda121(this, i, i3), new VoIPService$$ExternalSyntheticLambda121(this, i, 2), new VoIPService$$ExternalSyntheticLambda121(this, i, i2), new VoIPService$$ExternalSyntheticLambda121(this, i, 4), this.conference != null);
            this.tgVoip[i].setOnStateUpdatedListener(new VoIPService$$ExternalSyntheticLambda121(this, i, 5));
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
        AndroidUtilities.cancelRunOnUIThread(this.destroyConvertingRunnable);
        if (this.convertingVoip == null) {
            return;
        }
        FileLog.e("destroyConverting!!", new Exception());
        this.callStartTime = 0L;
        StatsController.getInstance(this.currentAccount).incrementTotalCallsTime(getStatsNetworkType(), ((int) (getCallDuration() / 1000)) % 5);
        onTgVoipPreStop();
        Instance.FinalState finalStateStop = this.convertingVoip.stop();
        updateTrafficStats(this.convertingVoip, finalStateStop.trafficStats);
        onTgVoipStop(finalStateStop);
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

    private void dispatchStateChanged(int i) {
        CallConnection callConnection;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("== Call " + getCallID() + " state changed to " + i + " ==");
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
            VoIPService$$ExternalSyntheticLambda46 voIPService$$ExternalSyntheticLambda46 = new VoIPService$$ExternalSyntheticLambda46(this, 0);
            if (j > 0) {
                AndroidUtilities.runOnUIThread(voIPService$$ExternalSyntheticLambda46, j);
            } else {
                voIPService$$ExternalSyntheticLambda46.run();
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
            FileLog.e(th);
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
        return EncryptionKeyEmojifier.emojifyForCall(Utilities.computeSHA256(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size()));
    }

    private int getNetworkType() {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        this.lastNetInfo = activeNetworkInfo;
        if (activeNetworkInfo == null) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                return type != 9 ? 0 : 7;
            }
            return 6;
        }
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
    }

    public static Bitmap getRoundAvatarBitmap(Context context, int i, TLObject tLObject) {
        TLRPC.ChatPhoto chatPhoto;
        Bitmap bitmapDecodeFile;
        Bitmap bitmapCreateBitmap = null;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
                    BitmapDrawable imageFromMemory = ImageLoader.getInstance().getImageFromMemory(user.photo.photo_small, null, "50_50");
                    if (imageFromMemory != null) {
                        bitmapDecodeFile = imageFromMemory.getBitmap().copy(Bitmap.Config.ARGB_8888, true);
                    } else {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inMutable = true;
                            bitmapDecodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i).getPathToAttach(user.photo.photo_small, true).toString(), options);
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                    bitmapCreateBitmap = bitmapDecodeFile;
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                if (chat != null && (chatPhoto = chat.photo) != null && chatPhoto.photo_small != null) {
                    BitmapDrawable imageFromMemory2 = ImageLoader.getInstance().getImageFromMemory(chat.photo.photo_small, null, "50_50");
                    if (imageFromMemory2 != null) {
                        bitmapDecodeFile = imageFromMemory2.getBitmap().copy(Bitmap.Config.ARGB_8888, true);
                    } else {
                        try {
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inMutable = true;
                            bitmapDecodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i).getPathToAttach(chat.photo.photo_small, true).toString(), options2);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    bitmapCreateBitmap = bitmapDecodeFile;
                }
            }
        } catch (Throwable th3) {
            FileLog.e(th3);
        }
        if (bitmapCreateBitmap == null) {
            Theme.createDialogsResources(context);
            AvatarDrawable avatarDrawable = tLObject instanceof TLRPC.User ? new AvatarDrawable((TLRPC.User) tLObject) : new AvatarDrawable((TLRPC.Chat) tLObject);
            bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), Bitmap.Config.ARGB_8888);
            avatarDrawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            avatarDrawable.draw(new Canvas(bitmapCreateBitmap));
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Path path = new Path();
        path.addCircle(bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight() / 2, bitmapCreateBitmap.getWidth() / 2, Path.Direction.CW);
        path.toggleInverseFillType();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
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
        if (networkInfo == null || networkInfo.getType() != 0) {
            return 1;
        }
        return this.lastNetInfo.isRoaming() ? 2 : 0;
    }

    public static String getStringFromFile(String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        String strConvertStreamToString = convertStreamToString(fileInputStream);
        fileInputStream.close();
        return strConvertStreamToString;
    }

    private Class<? extends Activity> getUIActivityClass() {
        return LaunchActivity.class;
    }

    public static boolean hasRtmpStream() {
        return (getSharedInstance() == null || getSharedInstance().groupCall == null || !getSharedInstance().groupCall.call.rtmp_stream) ? false : true;
    }

    private void initializeAccountRelatedThings() {
        updateServerConfig();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.appDidLogout);
        ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
    }

    private void initiateActualEncryptedCall() {
        boolean zIsAvailable;
        boolean zIsAvailable2;
        Instance.Proxy proxy;
        Runnable runnable = this.timeoutRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.timeoutRunnable = null;
        }
        try {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InitCall: keyID=" + this.keyFingerprint);
            }
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
            Set<String> stringSet = notificationsSettings.getStringSet("calls_access_hashes", null);
            HashSet hashSet = stringSet != null ? new HashSet(stringSet) : new HashSet();
            hashSet.add(this.privateCall.id + " " + this.privateCall.access_hash + " " + System.currentTimeMillis());
            while (hashSet.size() > 20) {
                Iterator it = hashSet.iterator();
                long j = Long.MAX_VALUE;
                String str = null;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    String[] strArrSplit = str2.split(" ");
                    if (strArrSplit.length < 2) {
                        it.remove();
                    } else {
                        try {
                            long j2 = Long.parseLong(strArrSplit[2]);
                            if (j2 < j) {
                                str = str2;
                                j = j2;
                            }
                        } catch (Exception unused) {
                            it.remove();
                        }
                    }
                }
                if (str != null) {
                    hashSet.remove(str);
                }
            }
            notificationsSettings.edit().putStringSet("calls_access_hashes", hashSet).commit();
            try {
                zIsAvailable = AcousticEchoCanceler.isAvailable();
            } catch (Exception unused2) {
                zIsAvailable = false;
            }
            try {
                zIsAvailable2 = NoiseSuppressor.isAvailable();
            } catch (Exception unused3) {
                zIsAvailable2 = false;
            }
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            double d = ((double) messagesController.callConnectTimeout) / 1000.0d;
            double d2 = ((double) messagesController.callPacketTimeout) / 1000.0d;
            int iConvertDataSavingMode = convertDataSavingMode(globalMainSettings.getInt("VoipDataSaving", VoIPHelper.getDataSavingDefault()));
            Instance.ServerConfig globalServerConfig = Instance.getGlobalServerConfig();
            boolean z = (zIsAvailable && globalServerConfig.useSystemAec) ? false : true;
            boolean z2 = (zIsAvailable2 && globalServerConfig.useSystemNs) ? false : true;
            String str3 = "";
            String logFilePath = BuildVars.DEBUG_VERSION ? VoIPHelper.getLogFilePath("voip" + this.privateCall.id) : VoIPHelper.getLogFilePath("" + this.privateCall.id, false);
            String logFilePath2 = VoIPHelper.getLogFilePath("" + this.privateCall.id, true);
            TL_phone.PhoneCall phoneCall = this.privateCall;
            boolean z3 = phoneCall.p2p_allowed;
            boolean z4 = globalServerConfig.enableStunMarking;
            int i = phoneCall.protocol.max_layer;
            TLRPC.TL_dataJSON tL_dataJSON = phoneCall.custom_parameters;
            if (tL_dataJSON != null) {
                str3 = tL_dataJSON.data;
            }
            Instance.Config config = new Instance.Config(d, d2, iConvertDataSavingMode, z3, z, z2, true, false, z4, logFilePath, logFilePath2, i, str3);
            this.lastLogFilePath = logFilePath;
            String absolutePath = new File(ApplicationLoader.applicationContext.getCacheDir(), "voip_persistent_state.json").getAbsolutePath();
            boolean z5 = globalMainSettings.getBoolean("dbg_force_tcp_in_calls", false);
            int i2 = z5 ? 3 : 2;
            int size = this.privateCall.connections.size();
            Instance.Endpoint[] endpointArr = new Instance.Endpoint[size];
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (i3 < size) {
                TLRPC.PhoneConnection phoneConnection = this.privateCall.connections.get(i3);
                ArrayList arrayList2 = arrayList;
                int i4 = i3;
                endpointArr[i4] = new Instance.Endpoint(phoneConnection instanceof TLRPC.TL_phoneConnectionWebrtc, phoneConnection.id, phoneConnection.ip, phoneConnection.ipv6, phoneConnection.port, i2, phoneConnection.peer_tag, phoneConnection.turn, phoneConnection.stun, phoneConnection.username, phoneConnection.password, phoneConnection.tcp);
                if (phoneConnection instanceof TLRPC.TL_phoneConnection) {
                    arrayList2.add(Long.valueOf(((TLRPC.TL_phoneConnection) phoneConnection).id));
                }
                i3 = i4 + 1;
                arrayList = arrayList2;
            }
            ArrayList arrayList3 = arrayList;
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3);
                HashMap map = new HashMap();
                int i5 = 0;
                while (i5 < arrayList3.size()) {
                    Long l = (Long) arrayList3.get(i5);
                    i5++;
                    map.put(l, Integer.valueOf(i5));
                }
                for (int i6 = 0; i6 < size; i6++) {
                    Instance.Endpoint endpoint = endpointArr[i6];
                    endpoint.reflectorId = ((Integer) Map.EL.getOrDefault(map, Long.valueOf(endpoint.id), 0)).intValue();
                }
            }
            if (z5) {
                AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda46(this, 21));
            }
            if (globalMainSettings.getBoolean("proxy_enabled", false) && globalMainSettings.getBoolean("proxy_enabled_calls", false)) {
                String string = globalMainSettings.getString("proxy_ip", null);
                String string2 = globalMainSettings.getString("proxy_secret", null);
                if (TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2)) {
                    proxy = null;
                } else {
                    proxy = new Instance.Proxy(string, globalMainSettings.getInt("proxy_port", 0), globalMainSettings.getString("proxy_user", null), globalMainSettings.getString("proxy_pass", null));
                }
            } else {
                proxy = null;
            }
            Instance.EncryptionKey encryptionKey = new Instance.EncryptionKey(this.authKey, this.isOutgoing);
            boolean z6 = "2.7.7".compareTo(this.privateCall.protocol.library_versions.get(0)) <= 0;
            long j3 = this.captureDevice[0];
            if (j3 != 0 && !z6) {
                NativeInstance.destroyVideoCapturer(j3);
                this.captureDevice[0] = 0;
                this.videoState[0] = 0;
            }
            if (!this.isOutgoing) {
                if (!this.videoCall || (Build.VERSION.SDK_INT >= 23 && checkSelfPermission("android.permission.CAMERA") != 0)) {
                    this.videoState[0] = 0;
                } else {
                    this.captureDevice[0] = NativeInstance.createVideoCapturer(this.localSink[0], this.isFrontFaceCamera ? 1 : 0);
                    this.videoState[0] = 2;
                }
            }
            this.tgVoip[0] = Instance.makeInstance(this.privateCall.protocol.library_versions.get(0), config, absolutePath, endpointArr, proxy, getNetworkType(), encryptionKey, this.remoteSink[0], this.captureDevice[0], new VoIPService$$ExternalSyntheticLambda48(this));
            this.tgVoip[0].setOnStateUpdatedListener(new VoIPService$$ExternalSyntheticLambda48(this));
            this.tgVoip[0].setOnSignalBarsUpdatedListener(new VoIPService$$ExternalSyntheticLambda48(this));
            this.tgVoip[0].setOnSignalDataListener(new VoIPService$$ExternalSyntheticLambda48(this));
            this.tgVoip[0].setOnRemoteMediaStateUpdatedListener(new VoIPService$$ExternalSyntheticLambda48(this));
            this.tgVoip[0].setMuteMicrophone(this.micMute);
            if (z6 != this.isVideoAvailable) {
                this.isVideoAvailable = z6;
                for (int i7 = 0; i7 < this.stateListeners.size(); i7++) {
                    this.stateListeners.get(i7).onVideoAvailableChange(this.isVideoAvailable);
                }
            }
            this.destroyCaptureDevice[0] = false;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public void run() {
                    if (VoIPService.this.tgVoip[0] != null) {
                        VoIPService voIPService = VoIPService.this;
                        voIPService.updateTrafficStats(voIPService.tgVoip[0], null);
                        AndroidUtilities.runOnUIThread(this, 5000L);
                    }
                }
            }, 5000L);
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("error starting call", e);
            }
            callFailed();
        }
    }

    public static boolean isAnyKindOfCallActive() {
        return (getSharedInstance() == null || getSharedInstance().getCallState() == 15) ? false : true;
    }

    private static boolean isDeviceCompatibleWithConnectionServiceAPI() {
        return false;
    }

    private boolean isFinished() {
        int i = this.currentState;
        return i == 11 || i == 4;
    }

    private boolean isRinging() {
        return this.currentState == 15;
    }

    public static void lambda$acceptIncomingCall$100() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }

    public void lambda$acceptIncomingCall$101(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error on phone.acceptCall: " + tL_error);
            }
            callFailed();
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.w("accept call ok! " + tLObject);
        }
        TL_phone.PhoneCall phoneCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
        this.privateCall = phoneCall;
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            onCallUpdated(phoneCall);
        }
    }

    public void lambda$acceptIncomingCall$102(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda90(2, this, tLObject, tL_error));
    }

    public void lambda$acceptIncomingCall$103(MessagesStorage messagesStorage, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            callFailed();
            return;
        }
        TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
        if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
            if (!Utilities.isGoodPrime(messages_dhconfig.p, messages_dhconfig.g)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("stopping VoIP service, bad prime");
                }
                callFailed();
                return;
            } else {
                messagesStorage.setSecretPBytes(messages_dhconfig.p);
                messagesStorage.setSecretG(messages_dhconfig.g);
                messagesStorage.setLastSecretVersion(messages_dhconfig.version);
                MessagesStorage.getInstance(this.currentAccount).saveSecretParams(messagesStorage.getLastSecretVersion(), messagesStorage.getSecretG(), messagesStorage.getSecretPBytes());
            }
        }
        byte[] bArr = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr[i] = (byte) (((byte) (Utilities.random.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i]);
        }
        if (this.privateCall == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("call is null");
            }
            callFailed();
            return;
        }
        this.a_or_b = bArr;
        BigInteger bigIntegerModPow = BigInteger.valueOf(messagesStorage.getSecretG()).modPow(new BigInteger(1, bArr), new BigInteger(1, messagesStorage.getSecretPBytes()));
        this.g_a_hash = this.privateCall.g_a_hash;
        byte[] byteArray = bigIntegerModPow.toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr2 = new byte[256];
            System.arraycopy(byteArray, 1, bArr2, 0, 256);
            byteArray = bArr2;
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(acceptcall, new VoIPService$$ExternalSyntheticLambda74(this, 3), 65536);
    }

    public void lambda$acknowledgeCall$12(TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        if (sharedInstance == null) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.w("receivedCall response = " + tLObject);
        }
        if (tL_error != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("error on receivedCall: " + tL_error);
            }
            stopSelf();
            return;
        }
        if (USE_CONNECTION_SERVICE) {
            ContactsController contactsController = ContactsController.getInstance(this.currentAccount);
            TLRPC.User user = this.user;
            contactsController.createOrUpdateConnectionServiceContact(user.id, user.first_name, user.last_name);
            ((TelecomManager) getSystemService("telecom")).addNewIncomingCall(addAccountToTelecomManager(), NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(1, "call_type"));
        }
        if (z) {
            startRinging();
        }
    }

    public void lambda$acknowledgeCall$13(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda64(this, tLObject, tL_error, z, 0));
    }

    public void lambda$callEnded$122() {
        dispatchStateChanged(11);
    }

    public void lambda$callEnded$123() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
            this.spPlayId = 0;
        }
    }

    public void lambda$callEnded$124() {
        this.soundPool.play(this.spEndId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void lambda$callEnded$125() {
        this.soundPool.play(this.spVoiceChatEndId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public static void lambda$callFailed$113(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("phone.discardCall " + tLObject);
        }
    }

    public void lambda$callFailed$114() {
        dispatchStateChanged(4);
    }

    public void lambda$callFailed$115() {
        this.soundPool.play(this.spFailedID, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public static void lambda$configureDeviceForCall$109() {
        if (MediaController.getInstance().isMessagePaused()) {
            return;
        }
        MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
    }

    public void lambda$configureDeviceForCall$110(AudioManager audioManager) {
        this.hasAudioFocus = audioManager.requestAudioFocus(this, 0, 2) == 1;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (isBluetoothHeadsetConnected() && hasEarpiece()) {
            int i = this.audioRouteToSet;
            if (i == 0) {
                audioManager.setBluetoothScoOn(false);
                voipAudioManager.setSpeakerphoneOn(false);
            } else if (i == 1) {
                audioManager.setBluetoothScoOn(false);
                voipAudioManager.setSpeakerphoneOn(true);
            } else if (i == 2) {
                if (this.bluetoothScoActive) {
                    audioManager.setBluetoothScoOn(true);
                    voipAudioManager.setSpeakerphoneOn(false);
                } else {
                    this.needSwitchToBluetoothAfterScoActivates = true;
                    try {
                        audioManager.startBluetoothSco();
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                }
            }
        } else if (isBluetoothHeadsetConnected()) {
            audioManager.setBluetoothScoOn(this.speakerphoneStateToSet);
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

    public void lambda$configureDeviceForCall$111(AudioManager audioManager) {
        try {
            if (!hasRtmpStream()) {
                audioManager.setMode(3);
                AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda131(this, audioManager, 1));
            } else {
                audioManager.setMode(0);
                audioManager.setBluetoothScoOn(false);
                AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda54(8));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$convertToConferenceCall$30() {
        startConferenceGroupCall(true, 0, null, false);
    }

    public void lambda$createGroupInstance$66(int i, boolean[] zArr, int i2, String str) {
        if (i != 0) {
            startScreenCapture(i2, str);
            return;
        }
        if (this.conference != null) {
            startConferenceGroupCall(false, i2, str, !zArr[0]);
        } else {
            startGroupCall(i2, str, true);
        }
        zArr[0] = false;
    }

    public static void lambda$createGroupInstance$67(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void lambda$createGroupInstance$68(int i, int[] iArr, float[] fArr, boolean[] zArr) {
        ChatObject.Call call;
        int i2 = 0;
        if (sharedInstance == null || (call = this.groupCall) == null || i != 0) {
            return;
        }
        call.processVoiceLevelsUpdate(iArr, fArr, zArr);
        float fMax = 0.0f;
        boolean z = false;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == 0) {
                if (this.chat != null && this.lastTypingTimeSend < SystemClock.uptimeMillis() - 5000 && fArr[i3] > 0.1f && zArr[i3]) {
                    this.lastTypingTimeSend = SystemClock.uptimeMillis();
                    TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                    tL_messages_setTyping.action = new TLRPC.TL_speakingInGroupCallAction();
                    tL_messages_setTyping.peer = MessagesController.getInputPeer(this.chat);
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setTyping, new VoIPService$$ExternalSyntheticLambda130(i2));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.webRtcMicAmplitudeEvent, Float.valueOf(fArr[i3]));
            } else {
                fMax = Math.max(fMax, fArr[i3]);
                z = true;
            }
        }
        if (z) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.webRtcSpeakerAmplitudeEvent, Float.valueOf(fMax));
            NativeInstance.AudioLevelsCallback audioLevelsCallback2 = audioLevelsCallback;
            if (audioLevelsCallback2 != null) {
                audioLevelsCallback2.run(iArr, fArr, zArr);
            }
        }
    }

    public void lambda$createGroupInstance$69(long j, int[] iArr, ArrayList arrayList) {
        if (sharedInstance == null || this.groupCall == null) {
            return;
        }
        broadcastUnknownParticipants(j, iArr);
    }

    public void lambda$createGroupInstance$70(int i, long j, int[] iArr) {
        ChatObject.Call call;
        if (sharedInstance == null || (call = this.groupCall) == null || i != 0) {
            return;
        }
        call.processUnknownVideoParticipants(iArr, new ProfileActivity$$ExternalSyntheticLambda22(this, j, iArr, 4));
    }

    public void lambda$createGroupInstance$71(String str) {
        this.currentStreamRequestTimestamp.remove(str);
    }

    public void lambda$createGroupInstance$72(int i) {
        createGroupInstance(i, false, true);
    }

    public void lambda$createGroupInstance$73(String str, int i, long j, int i2, int i3, TLObject tLObject, TLRPC.TL_error tL_error, long j2) {
        AndroidUtilities.runOnUIThread(new ClickHelper$$ExternalSyntheticLambda0(21, this, str));
        NativeInstance nativeInstance = this.tgVoip[i];
        if (nativeInstance == null) {
            return;
        }
        if (tLObject != null) {
            NativeByteBuffer nativeByteBuffer = ((TLRPC.TL_upload_file) tLObject).bytes;
            nativeInstance.onStreamPartAvailable(j, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j2, i2, i3);
        } else if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
            AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda56(this, i, 6));
        } else {
            this.tgVoip[i].onStreamPartAvailable(j, null, ("TIME_TOO_BIG".equals(tL_error.text) || tL_error.text.startsWith("FLOOD_WAIT")) ? 0 : -1, j2, i2, i3);
        }
    }

    public void lambda$createGroupInstance$74(String str, int i) {
        this.currentStreamRequestTimestamp.put(str, Integer.valueOf(i));
    }

    public void lambda$createGroupInstance$75(final int i, final long j, long j2, final int i2, final int i3) {
        String strM;
        if (i != 0) {
            return;
        }
        TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
        tL_upload_getFile.limit = 131072;
        TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
        tL_inputGroupCallStream.call = this.groupCall.getInputGroupCall();
        tL_inputGroupCallStream.time_ms = j;
        if (j2 == 500) {
            tL_inputGroupCallStream.scale = 1;
        }
        if (i2 != 0) {
            tL_inputGroupCallStream.flags |= 1;
            tL_inputGroupCallStream.video_channel = i2;
            tL_inputGroupCallStream.video_quality = i3;
        }
        tL_upload_getFile.location = tL_inputGroupCallStream;
        if (i2 == 0) {
            strM = Log.m(j, "");
        } else {
            strM = i2 + "_" + j + "_" + i3;
        }
        final String str = strM;
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda17(this, str, AccountInstance.getInstance(this.currentAccount).getConnectionsManager().sendRequest(tL_upload_getFile, new RequestDelegateTimestamp() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
                this.f$0.lambda$createGroupInstance$73(str, i, j, i2, i3, tLObject, tL_error, j3);
            }
        }, 65536, 2, this.groupCall.call.stream_dc_id), 5));
    }

    public void lambda$createGroupInstance$76(int i, long j, int i2) {
        String strM;
        if (i == 0) {
            strM = Log.m(j, "");
        } else {
            strM = i + "_" + j + "_" + i2;
        }
        Integer num = this.currentStreamRequestTimestamp.get(strM);
        if (num != null) {
            AccountInstance.getInstance(this.currentAccount).getConnectionsManager().cancelRequest(num.intValue(), true);
            this.currentStreamRequestTimestamp.remove(strM);
        }
    }

    public void lambda$createGroupInstance$77(int i, long j, long j2, int i2, int i3) {
        if (i != 0) {
            return;
        }
        AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda9(i2, i3, 1, j, this));
    }

    public void lambda$createGroupInstance$78(int i, long j, TLObject tLObject, TLRPC.TL_error tL_error, long j2) {
        long j3 = 0;
        if (tL_error == null) {
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            j3 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            ChatObject.Call call = this.groupCall;
            if (!call.loadedRtmpStreamParticipant) {
                call.createRtmpStreamParticipant(groupcallstreamchannels.channels);
                this.groupCall.loadedRtmpStreamParticipant = true;
            }
        }
        NativeInstance nativeInstance = this.tgVoip[i];
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j, j3);
        }
    }

    public void lambda$createGroupInstance$79(int i, long j) {
        TLRPC.GroupCall groupCall;
        ChatObject.Call call = this.groupCall;
        if (call == null || (groupCall = call.call) == null || !groupCall.rtmp_stream) {
            NativeInstance nativeInstance = this.tgVoip[i];
            if (nativeInstance != null) {
                nativeInstance.onRequestTimeComplete(j, ConnectionsManager.getInstance(this.currentAccount).getCurrentTimeMillis());
                return;
            }
            return;
        }
        TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
        getgroupcallstreamchannels.call = this.groupCall.getInputGroupCall();
        ChatObject.Call call2 = this.groupCall;
        if (call2 != null && call2.call != null && this.tgVoip[i] != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamchannels, new VoIPService$$ExternalSyntheticLambda80(this, i, j), 65536, 2, this.groupCall.call.stream_dc_id);
            return;
        }
        NativeInstance nativeInstance2 = this.tgVoip[i];
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(j, 0L);
        }
    }

    public void lambda$declineIncomingCall$104() {
        if (this.currentState == 10) {
            callEnded();
        }
    }

    public void lambda$declineIncomingCall$105(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.TL_updates) tLObject, false);
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("phone.discardCall " + tLObject);
        }
    }

    public void lambda$editCallMember$90(int i, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AccountInstance.getInstance(i).getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        } else if (tL_error != null && "GROUPCALL_VIDEO_TOO_MUCH".equals(tL_error.text)) {
            this.groupCall.reloadGroupCall();
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void lambda$endConnectionServiceCall$126() {
        CallConnection callConnection = this.systemCallConnection;
        if (callConnection != null) {
            int i = this.callDiscardReason;
            if (i == 1) {
                VoIPService$$ExternalSyntheticApiModelOutline2.m1038m();
                callConnection.setDisconnected(VoIPService$$ExternalSyntheticApiModelOutline2.m(this.isOutgoing ? 2 : 6));
            } else if (i != 2) {
                if (i == 3) {
                    VoIPService$$ExternalSyntheticApiModelOutline2.m1038m();
                    callConnection.setDisconnected(VoIPService$$ExternalSyntheticApiModelOutline2.m(this.isOutgoing ? 4 : 5));
                } else if (i != 4) {
                    callConnection.setDisconnected(VoIPService$$ExternalSyntheticApiModelOutline2.m());
                } else {
                    callConnection.setDisconnected(VoIPService$$ExternalSyntheticApiModelOutline2.m$1());
                }
            } else {
                callConnection.setDisconnected(VoIPService$$ExternalSyntheticApiModelOutline2.m$2());
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
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.TL_updates) tLObject, false);
        }
    }

    public void lambda$hangUp$5(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.TL_updates) tLObject, false);
        }
    }

    public void lambda$initiateActualEncryptedCall$84() {
        Toast.makeText(this, "This call uses TCP which will degrade its quality.", 0).show();
    }

    public void lambda$initiateActualEncryptedCall$85(int[] iArr, float[] fArr, boolean[] zArr) {
        if (sharedInstance == null || this.privateCall == null) {
            return;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.webRtcMicAmplitudeEvent, Float.valueOf(fArr[0]));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.webRtcSpeakerAmplitudeEvent, Float.valueOf(fArr[1]));
    }

    public void lambda$initiateActualEncryptedCall$86(int i, int i2) {
        this.remoteAudioState = i;
        this.remoteVideoState = i2;
        checkIsNear();
        for (int i3 = 0; i3 < this.stateListeners.size(); i3++) {
            this.stateListeners.get(i3).onMediaStateUpdated(i, i2);
        }
    }

    public void lambda$initiateActualEncryptedCall$87(int i, int i2) {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda26(this, i, i2, 4));
    }

    public void lambda$loadResources$108() {
        SoundPool soundPool = new SoundPool(1, 0, 0);
        this.soundPool = soundPool;
        this.spConnectingId = soundPool.load(this, R.raw.voip_connecting, 1);
        this.spRingbackID = this.soundPool.load(this, R.raw.voip_ringback, 1);
        this.spFailedID = this.soundPool.load(this, R.raw.voip_failed, 1);
        this.spEndId = this.soundPool.load(this, R.raw.voip_end, 1);
        this.spBusyId = this.soundPool.load(this, R.raw.voip_busy, 1);
        this.spVoiceChatEndId = this.soundPool.load(this, R.raw.voicechat_leave, 1);
        this.spVoiceChatStartId = this.soundPool.load(this, R.raw.voicechat_join, 1);
        this.spVoiceChatConnecting = this.soundPool.load(this, R.raw.voicechat_connecting, 1);
        this.spAllowTalkId = this.soundPool.load(this, R.raw.voip_onallowtalk, 1);
        this.spStartRecordId = this.soundPool.load(this, R.raw.voip_recordstart, 1);
    }

    public void lambda$onCallUpdated$16() {
        this.soundPool.play(this.spBusyId, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public void lambda$onCallUpdated$17() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
        }
        this.spPlayId = this.soundPool.play(this.spRingbackID, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public void lambda$onCallUpdated$18() {
        this.timeoutRunnable = null;
        declineIncomingCall(3, null);
    }

    public void lambda$onConnectionStateChanged$116() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
            this.spPlayId = 0;
        }
    }

    public void lambda$onConnectionStateChanged$117() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
        }
        this.spPlayId = this.soundPool.play(this.groupCall != null ? this.spVoiceChatConnecting : this.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public void lambda$onConnectionStateChanged$118(int i) {
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
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.connectingSoundRunnable = null;
            }
            Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 24));
            if (this.groupCall == null && !this.wasEstablished) {
                this.wasEstablished = true;
                if (!this.isProximityNear && !this.privateCall.video) {
                    try {
                        LaunchActivity.getLastFragment().getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public void run() {
                        if (VoIPService.this.tgVoip[0] != null) {
                            StatsController.getInstance(VoIPService.this.currentAccount).incrementTotalCallsTime(VoIPService.this.getStatsNetworkType(), 5);
                            AndroidUtilities.runOnUIThread(this, 5000L);
                        }
                    }
                }, 5000L);
                if (this.isOutgoing) {
                    StatsController.getInstance(this.currentAccount).incrementSentItemsCount(getStatsNetworkType(), 0, 1);
                } else {
                    StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(getStatsNetworkType(), 0, 1);
                }
            }
        }
        if (i == 5 && !this.isCallEnded) {
            Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 25));
        }
        dispatchStateChanged(i);
    }

    public static void lambda$onDestroy$97() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didEndCall, new Object[0]);
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
                } catch (SecurityException e) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("Error setting audio more to normal", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void lambda$onDestroy$99() {
        SoundPool soundPool = this.soundPool;
        if (soundPool != null) {
            soundPool.release();
        }
    }

    public void lambda$onSignalBarCountChanged$121(int i) {
        this.signalBarCount = i;
        for (int i2 = 0; i2 < this.stateListeners.size(); i2++) {
            this.stateListeners.get(i2).onSignalBarsCountChanged(i);
        }
    }

    public void lambda$onStartCommand$1(Boolean bool) {
        if (sharedInstance != null && bool.booleanValue()) {
            setMicMute(false, false, true);
        }
    }

    public void lambda$onStartCommand$2() {
        this.delayedStartOutgoingCall = null;
        startOutgoingCall();
    }

    public void lambda$onStartCommand$3() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voipServiceCreated, new Object[0]);
    }

    public void lambda$playAllowTalkSound$120() {
        this.soundPool.play(this.spAllowTalkId, 0.5f, 0.5f, 0, 0, 1.0f);
    }

    public void lambda$playConnectedSound$88() {
        this.soundPool.play(this.spVoiceChatStartId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void lambda$playStartRecordSound$119() {
        this.soundPool.play(this.spStartRecordId, 0.5f, 0.5f, 0, 0, 1.0f);
    }

    public void lambda$processAcceptedCall$19(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            callFailed();
        } else {
            this.privateCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
            initiateActualEncryptedCall();
        }
    }

    public void lambda$processAcceptedCall$20(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda90(0, this, tLObject, tL_error));
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

    public void lambda$startConferenceGroupCall$31(TLObject tLObject, AccountInstance accountInstance, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, tL_error.text);
                hangUp(0);
                return;
            }
            try {
                this.groupCallBottomSheetLatch.await(800L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                FileLog.e(e);
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            this.groupCall.setCall(accountInstance, 0L, groupcall);
            this.groupCall.loadMembers(true);
            MessagesController.getInstance(this.currentAccount).putGroupCall(0L, this.groupCall);
            this.conference.inputGroupCall = new TLRPC.TL_inputGroupCall();
            ConferenceCall conferenceCall = this.conference;
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            TLRPC.GroupCall groupCall = groupcall.call;
            inputGroupCall.id = groupCall.id;
            inputGroupCall.access_hash = groupCall.access_hash;
            conferenceCall.groupCall = groupCall;
            startConferenceGroupCall(false, 0, null, false);
            HashSet<Long> hashSet = this.inviteUsersToConference;
            if (hashSet != null) {
                Iterator<Long> it = hashSet.iterator();
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    ChatObject.Call call = this.groupCall;
                    if (call != null) {
                        call.addInvitedUser(jLongValue);
                    }
                }
            }
            VoIPFragment voIPFragment = VoIPFragment.instance;
            if (voIPFragment != null) {
                voIPFragment.windowView.finish(330L);
            }
            GroupCallActivity.create(LaunchActivity.instance, AccountInstance.getInstance(this.currentAccount), null, null, false, null);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(updates.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(updates.chats, false);
        ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
        int size = arrayListFindUpdatesAndRemove.size();
        TLRPC.GroupCall groupCall2 = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayListFindUpdatesAndRemove.get(i);
            i++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        if (groupCall2 == null) {
            return;
        }
        try {
            this.groupCallBottomSheetLatch.await(800L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            FileLog.e(e2);
        }
        this.groupCall.setCall(accountInstance, 0L, groupCall2);
        this.groupCall.loadMembers(true);
        MessagesController.getInstance(this.currentAccount).putGroupCall(0L, this.groupCall);
        this.conference.inputGroupCall = new TLRPC.TL_inputGroupCall();
        ConferenceCall conferenceCall2 = this.conference;
        TLRPC.InputGroupCall inputGroupCall2 = conferenceCall2.inputGroupCall;
        inputGroupCall2.id = groupCall2.id;
        inputGroupCall2.access_hash = groupCall2.access_hash;
        conferenceCall2.groupCall = TlUtils.applyGroupCallUpdate(conferenceCall2.groupCall, groupCall2);
        startConferenceGroupCall(false, 0, null, false);
        HashSet<Long> hashSet2 = this.inviteUsersToConference;
        if (hashSet2 != null) {
            Iterator<Long> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                long jLongValue2 = it2.next().longValue();
                ChatObject.Call call2 = this.groupCall;
                if (call2 != null) {
                    call2.addInvitedUser(jLongValue2);
                }
            }
        }
        VoIPFragment voIPFragment2 = VoIPFragment.instance;
        if (voIPFragment2 != null) {
            voIPFragment2.windowView.finish(330L);
        }
        GroupCallActivity.create(LaunchActivity.instance, AccountInstance.getInstance(this.currentAccount), null, null, false, null);
    }

    public void lambda$startConferenceGroupCall$32(AccountInstance accountInstance, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda53(this, tLObject, accountInstance, tL_error, 0));
    }

    public void lambda$startConferenceGroupCall$33(TLObject tLObject, int i, String str, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TL_phone.groupCall)) {
            if (tL_error != null) {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, tL_error.text);
                hangUp(0);
                return;
            }
            return;
        }
        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(groupcall.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(groupcall.chats, false);
        this.groupCall.setCall(AccountInstance.getInstance(this.currentAccount), 0L, groupcall);
        ConferenceCall conferenceCall = this.conference;
        conferenceCall.groupCall = groupcall.call;
        conferenceCall.inputGroupCall = this.joinConference;
        startConferenceGroupCall(false, i, str, false);
    }

    public void lambda$startConferenceGroupCall$34(int i, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3(this, tLObject, i, str, tL_error, 7));
    }

    public static void lambda$startConferenceGroupCall$35() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }

    public void lambda$startConferenceGroupCall$36(int i) {
        this.mySource[0] = i;
    }

    public void lambda$startConferenceGroupCall$37(TLRPC.GroupCallParticipant groupCallParticipant) {
        this.mySource[0] = groupCallParticipant.source;
    }

    public void lambda$startConferenceGroupCall$38(TLRPC.Updates updates, long j) {
        int i;
        TLRPC.Update update = updates.update;
        if (!(update instanceof TL_update.TL_updateNewMessage)) {
            if (!(update instanceof TL_update.TL_updateMessageID)) {
                if (updates.updates == null) {
                    i = 0;
                    break;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= updates.updates.size()) {
                        i = 0;
                        break;
                    }
                    TLRPC.Update update2 = updates.updates.get(i2);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        TLRPC.Message message = ((TL_update.TL_updateNewMessage) update2).message;
                        if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                            i = message.id;
                            break;
                        }
                        i2++;
                    } else {
                        if (update2 instanceof TL_update.TL_updateMessageID) {
                            i = ((TL_update.TL_updateMessageID) update2).id;
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                i = ((TL_update.TL_updateMessageID) update).id;
            }
        } else {
            TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update).message;
            if (message2 == null || !(message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i = 0;
                break;
            }
            i = message2.id;
        }
        ChatObject.Call call = this.groupCall;
        if (call == null || i == 0) {
            return;
        }
        call.invitedUsersMessageIds.put(Long.valueOf(j), ChatObject.Call.InvitedUser.make(i));
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, 0L, Long.valueOf(this.groupCall.call.id), Boolean.FALSE);
    }

    public void lambda$startConferenceGroupCall$39(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(34, this.currentAccount, safeLastFragment.getContext(), safeLastFragment, new ShareAlert.AnonymousClass3());
        limitReachedBottomSheet.setRestrictedUsers(null, arrayList, arrayList2, arrayList3, str);
        limitReachedBottomSheet.show();
    }

    public static void lambda$startConferenceGroupCall$40(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
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

    public static void lambda$startConferenceGroupCall$41(ArrayList arrayList, ArrayList arrayList2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda45(tLObject, arrayList, arrayList2, runnable, 1));
    }

    public void lambda$startConferenceGroupCall$42(HashSet hashSet, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            ChatObject.Call call = this.groupCall;
            if (call != null) {
                call.removeInvitedUser(jLongValue);
            }
            arrayList.add(MessagesController.getInstance(this.currentAccount).getUser(l));
            getrequirementstocontact.id.add(MessagesController.getInstance(this.currentAccount).getInputUser(jLongValue));
        }
        VoIPService$$ExternalSyntheticLambda76 voIPService$$ExternalSyntheticLambda76 = new VoIPService$$ExternalSyntheticLambda76(this, arrayList, arrayList2, arrayList3, str, 0);
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            voIPService$$ExternalSyntheticLambda76.run();
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getrequirementstocontact, new VoIPService$$ExternalSyntheticLambda77(arrayList, arrayList2, voIPService$$ExternalSyntheticLambda76, 0));
        }
    }

    public void lambda$startConferenceGroupCall$43(long j, HashSet hashSet, AtomicInteger atomicInteger, int i, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda84(this, updates, j, 1));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j));
        }
        if (atomicInteger.incrementAndGet() != i || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda85(this, hashSet, str, 1));
    }

    public void lambda$startConferenceGroupCall$44(TLObject tLObject, TL_phone.PhoneCall phoneCall, TL_phone.exportGroupCallInvite exportgroupcallinvite) {
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            TL_phone.exportedGroupCallInvite exportedgroupcallinvite = (TL_phone.exportedGroupCallInvite) tLObject;
            Uri uri = Uri.parse(exportedgroupcallinvite.link);
            String str = uri.getPathSegments().get(uri.getPathSegments().size() - 1);
            TL_phone.discardCall discardcall = new TL_phone.discardCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            discardcall.peer = tL_inputPhoneCall;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            tL_inputPhoneCall.id = phoneCall.id;
            TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall tL_phoneCallDiscardReasonMigrateConferenceCall = new TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall();
            discardcall.reason = tL_phoneCallDiscardReasonMigrateConferenceCall;
            tL_phoneCallDiscardReasonMigrateConferenceCall.slug = str;
            discardcall.duration = (int) (getCallDuration() / 1000);
            discardcall.connection_id = 0L;
            discardcall.video = this.inviteUsersToConferenceVideo;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, null);
            String str2 = exportedgroupcallinvite.link;
            int size = this.inviteUsersToConference.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet = new HashSet();
            Iterator<Long> it = this.inviteUsersToConference.iterator();
            while (it.hasNext()) {
                long jLongValue = it.next().longValue();
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(jLongValue);
                inviteconferencecallparticipant.call = exportgroupcallinvite.call;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(inviteconferencecallparticipant, new VoIPService$$ExternalSyntheticLambda111(this, jLongValue, hashSet, atomicInteger, size, str2, 0));
            }
            this.privateCall = null;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, 0L, Long.valueOf(this.groupCall.call.id), Boolean.FALSE);
        }
    }

    public void lambda$startConferenceGroupCall$45(TL_phone.PhoneCall phoneCall, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda53(this, tLObject, phoneCall, exportgroupcallinvite, 6));
    }

    public void lambda$startConferenceGroupCall$46(TLRPC.Updates updates, long j) {
        int i;
        TLRPC.Update update = updates.update;
        if (!(update instanceof TL_update.TL_updateNewMessage)) {
            if (!(update instanceof TL_update.TL_updateMessageID)) {
                if (updates.updates == null) {
                    i = 0;
                    break;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= updates.updates.size()) {
                        i = 0;
                        break;
                    }
                    TLRPC.Update update2 = updates.updates.get(i2);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        TLRPC.Message message = ((TL_update.TL_updateNewMessage) update2).message;
                        if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                            i = message.id;
                            break;
                        }
                        i2++;
                    } else {
                        if (update2 instanceof TL_update.TL_updateMessageID) {
                            i = ((TL_update.TL_updateMessageID) update2).id;
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                i = ((TL_update.TL_updateMessageID) update).id;
            }
        } else {
            TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update).message;
            if (message2 == null || !(message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i = 0;
                break;
            }
            i = message2.id;
        }
        ChatObject.Call call = this.groupCall;
        if (call == null || i == 0) {
            return;
        }
        call.invitedUsersMessageIds.put(Long.valueOf(j), ChatObject.Call.InvitedUser.make(i));
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, 0L, Long.valueOf(this.groupCall.call.id), Boolean.FALSE);
    }

    public void lambda$startConferenceGroupCall$47(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(34, this.currentAccount, safeLastFragment.getContext(), safeLastFragment, new ShareAlert.AnonymousClass3());
        limitReachedBottomSheet.setRestrictedUsers(null, arrayList, arrayList2, arrayList3, str);
        limitReachedBottomSheet.show();
    }

    public static void lambda$startConferenceGroupCall$48(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
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

    public static void lambda$startConferenceGroupCall$49(ArrayList arrayList, ArrayList arrayList2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda45(tLObject, arrayList, arrayList2, runnable, 0));
    }

    public void lambda$startConferenceGroupCall$50(HashSet hashSet, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            ChatObject.Call call = this.groupCall;
            if (call != null) {
                call.removeInvitedUser(jLongValue);
            }
            arrayList.add(MessagesController.getInstance(this.currentAccount).getUser(l));
            getrequirementstocontact.id.add(MessagesController.getInstance(this.currentAccount).getInputUser(jLongValue));
        }
        VoIPService$$ExternalSyntheticLambda76 voIPService$$ExternalSyntheticLambda76 = new VoIPService$$ExternalSyntheticLambda76(this, arrayList, arrayList2, arrayList3, str, 1);
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            voIPService$$ExternalSyntheticLambda76.run();
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getrequirementstocontact, new VoIPService$$ExternalSyntheticLambda77(arrayList, arrayList2, voIPService$$ExternalSyntheticLambda76, 3));
        }
    }

    public void lambda$startConferenceGroupCall$51(long j, HashSet hashSet, AtomicInteger atomicInteger, int i, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda84(this, updates, j, 0));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j));
        }
        if (atomicInteger.incrementAndGet() != i || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda85(this, hashSet, str, 0));
    }

    public void lambda$startConferenceGroupCall$52(ArrayList arrayList, boolean z) {
        TL_phone.PhoneCall phoneCall;
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall == null) {
            return;
        }
        conferenceCall.joined();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            this.conference.applyUpdate(0, (TL_update.TL_updateGroupCallChainBlocks) obj, true, null);
        }
        this.conference.forcePoll();
        this.groupCall.loadMembers(z);
        startGroupCheckShortpoll();
        if (this.captureDevice[1] != 0) {
            createGroupInstance(1, false, true);
        }
        for (int i2 = 0; i2 < 2; i2++) {
            NativeInstance nativeInstance = this.tgVoip[i2];
            if (nativeInstance != null) {
                nativeInstance.setConferenceCallId(this.conference.getCallId());
            }
        }
        AndroidUtilities.runOnUIThread(this.destroyConvertingRunnable, 5000L);
        if (this.inviteUsersToConference != null && (phoneCall = this.privateCall) != null && this.groupCall != null) {
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.groupCall.call;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new VoIPService$$ExternalSyntheticLambda77(this, phoneCall, exportgroupcallinvite, 4));
        }
        long[] jArr = this.inviteUsers;
        if (jArr != null) {
            String str = this.groupCall.call.invite_link;
            int length = jArr.length;
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet = new HashSet();
            long[] jArr2 = this.inviteUsers;
            int i3 = 0;
            for (int length2 = jArr2.length; i3 < length2; length2 = length2) {
                long j = jArr2[i3];
                this.groupCall.addInvitedUser(j);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                inviteconferencecallparticipant.call = this.groupCall.getInputGroupCall();
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(j);
                inviteconferencecallparticipant.video = this.videoCall;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(inviteconferencecallparticipant, new VoIPService$$ExternalSyntheticLambda111(this, j, hashSet, atomicInteger, length, str, 1));
                i3++;
            }
            this.inviteUsers = null;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, 0L, Long.valueOf(this.groupCall.call.id), Boolean.FALSE);
        }
    }

    public void lambda$startConferenceGroupCall$53(TLRPC.TL_error tL_error, String str) {
        if ("JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            hangUp(2);
            return;
        }
        if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
            startConferenceGroupCall(false, 0, str, false);
            return;
        }
        if (tL_error.text.startsWith("CONF_WRITE_CHAIN_INVALID")) {
            stopSelf();
            return;
        }
        if (!"GROUPCALL_INVALID".equals(tL_error.text)) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, tL_error.text);
            hangUp(0);
        } else {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletinWithIconSize(R.raw.linkbroken, 36, getString(R.string.ConferenceClosed)).show().hideAfterBottomSheet = false;
            }
            hangUp(0);
        }
    }

    public void lambda$startConferenceGroupCall$54(int i, boolean z, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda59(this, tL_error, str, 0));
            return;
        }
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda56(this, i, 0));
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        long selfId = getSelfId();
        ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCallChainBlocks.class);
        ArrayList arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
        int size = arrayListFindUpdates.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListFindUpdates.get(i2);
            i2++;
            TLRPC.GroupCall groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            ChatObject.Call call = this.groupCall;
            if (call != null) {
                call.setCall(AccountInstance.getInstance(this.currentAccount), 0L, groupCall);
            }
            ConferenceCall conferenceCall = this.conference;
            if (conferenceCall != null) {
                conferenceCall.groupCall = TlUtils.applyGroupCallUpdate(conferenceCall.groupCall, groupCall);
            }
        }
        ArrayList arrayListFindUpdates2 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallParticipants.class);
        int size2 = arrayListFindUpdates2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayListFindUpdates2.get(i3);
            i3++;
            TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
            int size3 = tL_updateGroupCallParticipants.participants.size();
            for (int i4 = 0; i4 < size3; i4++) {
                TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i4);
                if (MessageObject.getPeerId(groupCallParticipant.peer) == selfId) {
                    AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda57(this, groupCallParticipant, 0));
                    if (!BuildVars.LOGS_ENABLED) {
                        break;
                    }
                    ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("join source = "), groupCallParticipant.source);
                    break;
                }
            }
        }
        ArrayList arrayListFindUpdates3 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallConnection.class);
        int size4 = arrayListFindUpdates3.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj3 = arrayListFindUpdates3.get(i5);
            i5++;
            TL_update.TL_updateGroupCallConnection tL_updateGroupCallConnection = (TL_update.TL_updateGroupCallConnection) obj3;
            if (!tL_updateGroupCallConnection.presentation) {
                this.myParams = tL_updateGroupCallConnection.params;
            }
        }
        MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda89(this, arrayListFindUpdatesAndRemove, z, 3));
    }

    public void lambda$startConferenceGroupCall$55(String str, int i, boolean z) {
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        joingroupcall.muted = this.micMute;
        joingroupcall.video_stopped = this.videoState[0] != 2;
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null) {
            joingroupcall.call = conferenceCall.inputGroupCall;
            joingroupcall.flags |= 8;
            joingroupcall.public_key = conferenceCall.getMyPublicKey();
            joingroupcall.block = this.conference.getLastBlock();
        } else {
            ChatObject.Call call = this.groupCall;
            if (call != null) {
                joingroupcall.call = call.getInputGroupCall();
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
            tL_inputPeerUser.user_id = AccountInstance.getInstance(this.currentAccount).getUserConfig().getClientUserId();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcall, new VoIPService$$ExternalSyntheticLambda89(i, str, this, z));
    }

    public void lambda$startConferenceGroupCall$56(Runnable runnable) {
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall == null) {
            return;
        }
        conferenceCall.generateAddSelfBlock();
        runnable.run();
        for (int i = 0; i < 2; i++) {
            NativeInstance nativeInstance = this.tgVoip[i];
            if (nativeInstance != null) {
                nativeInstance.setConferenceCallId(this.conference.getCallId());
            }
        }
    }

    public void lambda$startConnectingSound$89() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
        }
        int iPlay = this.soundPool.play(this.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
        this.spPlayId = iPlay;
        if (iPlay == 0) {
            AnonymousClass9 anonymousClass9 = new AnonymousClass9();
            this.connectingSoundRunnable = anonymousClass9;
            AndroidUtilities.runOnUIThread(anonymousClass9, 100L);
        }
    }

    public void lambda$startGroupCall$21(TL_update.TL_updateGroupCall tL_updateGroupCall) {
        if (sharedInstance == null) {
            return;
        }
        TLRPC.GroupCall groupCall = this.groupCall.call;
        TLRPC.GroupCall groupCall2 = tL_updateGroupCall.call;
        groupCall.access_hash = groupCall2.access_hash;
        groupCall.id = groupCall2.id;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ChatObject.Call call = this.groupCall;
        messagesController.putGroupCall(call.chatId, call);
        startGroupCall(0, null, false);
    }

    public void lambda$startGroupCall$22(TLRPC.TL_error tL_error) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, tL_error.text);
        hangUp(0);
    }

    public void lambda$startGroupCall$23(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda70(this, tL_error, 2));
            return;
        }
        try {
            this.groupCallBottomSheetLatch.await(800L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            FileLog.e(e);
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        for (int i = 0; i < updates.updates.size(); i++) {
            TLRPC.Update update = updates.updates.get(i);
            if (update instanceof TL_update.TL_updateGroupCall) {
                AndroidUtilities.runOnUIThread(new ClickHelper$$ExternalSyntheticLambda0(20, this, (TL_update.TL_updateGroupCall) update));
                break;
            }
        }
        MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
    }

    public static void lambda$startGroupCall$24() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }

    public void lambda$startGroupCall$25(int i) {
        this.mySource[0] = i;
    }

    public void lambda$startGroupCall$26(TLRPC.GroupCallParticipant groupCallParticipant) {
        this.mySource[0] = groupCallParticipant.source;
    }

    public void lambda$startGroupCall$27(boolean z) {
        this.groupCall.loadMembers(z);
    }

    public void lambda$startGroupCall$28(TLRPC.TL_error tL_error) {
        TLRPC.ChatFull chatFull;
        if ("JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            if (this.chat != null && (chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.chat.id)) != null) {
                if (chatFull instanceof TLRPC.TL_chatFull) {
                    chatFull.flags &= -32769;
                } else {
                    chatFull.flags &= -67108865;
                }
                chatFull.groupcall_default_join_as = null;
                JoinCallAlert.cachedChats = null;
            }
            hangUp(2);
            return;
        }
        if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
            createGroupInstance(0, false, false);
            return;
        }
        if ("GROUPCALL_INVALID".equals(tL_error.text) && this.chat != null) {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.chat.id, 0, true);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, tL_error.text);
        hangUp(0);
    }

    public void lambda$startGroupCall$29(int i, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda70(this, tL_error, 0));
            return;
        }
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda56(this, i, 5));
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        long selfId = getSelfId();
        int size = updates.updates.size();
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.Update update = updates.updates.get(i2);
            if (update instanceof TL_update.TL_updateGroupCallParticipants) {
                TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) update;
                int size2 = tL_updateGroupCallParticipants.participants.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i3);
                    if (MessageObject.getPeerId(groupCallParticipant.peer) == selfId) {
                        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda57(this, groupCallParticipant, 1));
                        if (!BuildVars.LOGS_ENABLED) {
                            break;
                        }
                        ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("join source = "), groupCallParticipant.source);
                        break;
                    }
                }
            } else if (update instanceof TL_update.TL_updateGroupCallConnection) {
                TL_update.TL_updateGroupCallConnection tL_updateGroupCallConnection = (TL_update.TL_updateGroupCallConnection) update;
                if (!tL_updateGroupCallConnection.presentation) {
                    this.myParams = tL_updateGroupCallConnection.params;
                }
            }
        }
        MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
        AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda1(8, this, z));
        startGroupCheckShortpoll();
    }

    public void lambda$startGroupCheckShortpoll$61(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (this.shortPollRunnable == null || sharedInstance == null || this.groupCall == null) {
            return;
        }
        if (!(tLObject instanceof TL_phone.groupCall)) {
            if (tL_error == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                return;
            }
            stopSelf();
            return;
        }
        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(groupcall.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(groupcall.chats, false);
        this.groupCall.setCall(AccountInstance.getInstance(this.currentAccount), 0L, groupcall.call);
        this.groupCall.loadMembers(true);
        this.shortPollRunnable = null;
        this.checkRequestId = 0;
        startGroupCheckShortpoll();
    }

    public void lambda$startGroupCheckShortpoll$62(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda90(this, tLObject, tL_error));
    }

    public void lambda$startGroupCheckShortpoll$63(TLRPC.TL_error tL_error, TLObject tLObject, TL_phone.checkGroupCall checkgroupcall) {
        boolean z;
        boolean z2;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable == null || sharedInstance == null || this.groupCall == null) {
            return;
        }
        if (this.conference != null && tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text) && this.groupCall.getInputGroupCall(true) != null && this.groupCall.getInputGroupCall(false) != null) {
            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
            getgroupcall.call = this.groupCall.getInputGroupCall(false);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new VoIPService$$ExternalSyntheticLambda74(this, 6));
            return;
        }
        this.shortPollRunnable = null;
        this.checkRequestId = 0;
        if (tLObject instanceof Vector) {
            ArrayList<Integer> intArray = ((Vector) tLObject).toIntArray();
            int i = this.mySource[0];
            z2 = (i == 0 || !checkgroupcall.sources.contains(Integer.valueOf(i)) || intArray.contains(Integer.valueOf(this.mySource[0]))) ? false : true;
            int i2 = this.mySource[1];
            z = (i2 == 0 || !checkgroupcall.sources.contains(Integer.valueOf(i2)) || intArray.contains(Integer.valueOf(this.mySource[1]))) ? false : true;
        } else if (tL_error == null || tL_error.code != 400) {
            z = false;
            z2 = false;
        } else {
            int i3 = this.mySource[1];
            if (i3 == 0 || !checkgroupcall.sources.contains(Integer.valueOf(i3))) {
                z = false;
                z2 = true;
            } else {
                z2 = true;
            }
        }
        if (z2) {
            createGroupInstance(0, false, false);
        }
        if (z) {
            createGroupInstance(1, false, false);
        }
        int[] iArr = this.mySource;
        if (iArr[1] == 0 && iArr[0] == 0 && ((groupCall = this.groupCall.call) == null || !groupCall.rtmp_stream)) {
            return;
        }
        startGroupCheckShortpoll();
    }

    public void lambda$startGroupCheckShortpoll$64(TL_phone.checkGroupCall checkgroupcall, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda53(this, tL_error, tLObject, (Object) checkgroupcall, 5));
    }

    public void lambda$startGroupCheckShortpoll$65() {
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable == null || sharedInstance == null || (call = this.groupCall) == null) {
            return;
        }
        int[] iArr = this.mySource;
        int i = 0;
        if (iArr[0] == 0 && iArr[1] == 0 && ((groupCall = call.call) == null || !groupCall.rtmp_stream)) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        if (this.groupCall.getInputGroupCall(true) != null) {
            checkgroupcall.call = this.groupCall.getInputGroupCall(true);
        } else {
            checkgroupcall.call = this.groupCall.getInputGroupCall(false);
        }
        while (true) {
            int[] iArr2 = this.mySource;
            if (i >= iArr2.length) {
                this.checkRequestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkgroupcall, new ChatActivity$$ExternalSyntheticLambda208(2, this, checkgroupcall));
                return;
            }
            int i2 = iArr2[i];
            if (i2 != 0) {
                checkgroupcall.sources.add(Integer.valueOf(i2));
            }
            i++;
        }
    }

    public void lambda$startOutgoingCall$10(byte[] bArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda53(this, tL_error, tLObject, (Object) bArr, 4));
    }

    public void lambda$startOutgoingCall$11(MessagesStorage messagesStorage, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.callReqId = 0;
        if (this.endCallAfterRequest) {
            callEnded();
            return;
        }
        if (tL_error != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error on getDhConfig " + tL_error);
            }
            callFailed();
            return;
        }
        TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
        if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
            if (!Utilities.isGoodPrime(messages_dhconfig.p, messages_dhconfig.g)) {
                callFailed();
                return;
            }
            messagesStorage.setSecretPBytes(messages_dhconfig.p);
            messagesStorage.setSecretG(messages_dhconfig.g);
            messagesStorage.setLastSecretVersion(messages_dhconfig.version);
            messagesStorage.saveSecretParams(messagesStorage.getLastSecretVersion(), messagesStorage.getSecretG(), messagesStorage.getSecretPBytes());
        }
        byte[] bArr = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr[i] = (byte) (((byte) (Utilities.random.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i]);
        }
        byte[] byteArray = BigInteger.valueOf(messagesStorage.getSecretG()).modPow(new BigInteger(1, bArr), new BigInteger(1, messagesStorage.getSecretPBytes())).toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr2 = new byte[256];
            System.arraycopy(byteArray, 1, bArr2, 0, 256);
            byteArray = bArr2;
        }
        TL_phone.requestCall requestcall = new TL_phone.requestCall();
        requestcall.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(this.user);
        TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol = new TL_phone.TL_phoneCallProtocol();
        requestcall.protocol = tL_phoneCallProtocol;
        requestcall.video = this.videoCall;
        tL_phoneCallProtocol.udp_p2p = true;
        tL_phoneCallProtocol.udp_reflector = true;
        tL_phoneCallProtocol.min_layer = 65;
        tL_phoneCallProtocol.max_layer = Instance.getConnectionMaxLayer();
        Collections.addAll(requestcall.protocol.library_versions, NativeInstance.getAllVersions());
        this.g_a = byteArray;
        requestcall.g_a_hash = Utilities.computeSHA256(byteArray, 0, byteArray.length);
        requestcall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(requestcall, new ChatActivity$$ExternalSyntheticLambda208(3, this, bArr), 65536);
    }

    public static void lambda$startOutgoingCall$6() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }

    public void lambda$startOutgoingCall$7(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (BuildVars.LOGS_ENABLED) {
            if (tL_error != null) {
                FileLog.e("error on phone.discardCall: " + tL_error);
            } else {
                FileLog.d("phone.discardCall " + tLObject);
            }
        }
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda46(this, 1));
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
        FileLog.e("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new VoIPService$$ExternalSyntheticLambda74(this, 0), 65536);
    }

    public void lambda$startOutgoingCall$9(TLRPC.TL_error tL_error, TLObject tLObject, byte[] bArr) {
        if (tL_error != null) {
            if (tL_error.code == 400 && "PARTICIPANT_VERSION_OUTDATED".equals(tL_error.text)) {
                callFailed("ERROR_PEER_OUTDATED");
                return;
            }
            int i = tL_error.code;
            if (i == 403) {
                callFailed("ERROR_PRIVACY");
                return;
            }
            if (i == 406) {
                callFailed("ERROR_LOCALIZED");
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error on phone.requestCall: " + tL_error);
            }
            callFailed();
            return;
        }
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
            int i2 = 0;
            while (i2 < size) {
                TL_phone.PhoneCall phoneCall = arrayList.get(i2);
                i2++;
                onCallUpdated(phoneCall);
            }
            this.pendingUpdates.clear();
        }
        VoIPService$$ExternalSyntheticLambda46 voIPService$$ExternalSyntheticLambda46 = new VoIPService$$ExternalSyntheticLambda46(this, 29);
        this.timeoutRunnable = voIPService$$ExternalSyntheticLambda46;
        AndroidUtilities.runOnUIThread(voIPService$$ExternalSyntheticLambda46, MessagesController.getInstance(this.currentAccount).callReceiveTimeout);
    }

    public void lambda$startRingtoneAndVibration$96(MediaPlayer mediaPlayer) {
        try {
            this.ringtonePlayer.start();
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void lambda$startScreenCapture$57(int i) {
        this.mySource[1] = i;
    }

    public void lambda$startScreenCapture$58(TLRPC.Updates updates) {
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
                    for (int i2 = 0; i2 < size2; i2++) {
                        TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i2);
                        if (MessageObject.getPeerId(groupCallParticipant.peer) == selfId) {
                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.presentation;
                            if (tL_groupCallParticipantVideo != null) {
                                if ((tL_groupCallParticipantVideo.flags & 2) == 0) {
                                    int size3 = tL_groupCallParticipantVideo.source_groups.size();
                                    for (int i3 = 0; i3 < size3; i3++) {
                                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = groupCallParticipant.presentation.source_groups.get(i3);
                                        if (tL_groupCallParticipantVideoSourceGroup.sources.size() > 0) {
                                            this.mySource[1] = tL_groupCallParticipantVideoSourceGroup.sources.get(0).intValue();
                                        }
                                    }
                                    break;
                                }
                                this.mySource[1] = tL_groupCallParticipantVideo.audio_source;
                                break;
                            }
                            break;
                        }
                    }
                }
            }
        }
    }

    public void lambda$startScreenCapture$59(TLRPC.TL_error tL_error) {
        TLRPC.ChatFull chatFull;
        if ("GROUPCALL_VIDEO_TOO_MUCH".equals(tL_error.text)) {
            this.groupCall.reloadGroupCall();
            return;
        }
        if (!"JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
                createGroupInstance(1, false, false);
                return;
            } else {
                if (!"GROUPCALL_INVALID".equals(tL_error.text) || this.chat == null) {
                    return;
                }
                MessagesController.getInstance(this.currentAccount).loadFullChat(this.chat.id, 0, true);
                return;
            }
        }
        if (this.chat != null && (chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.chat.id)) != null) {
            if (chatFull instanceof TLRPC.TL_chatFull) {
                chatFull.flags &= -32769;
            } else {
                chatFull.flags &= -67108865;
            }
            chatFull.groupcall_default_join_as = null;
            JoinCallAlert.cachedChats = null;
        }
        hangUp(2);
    }

    public void lambda$startScreenCapture$60(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda70(this, tL_error, 1));
            return;
        }
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda56(this, i, 1));
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        AndroidUtilities.runOnUIThread(new ClickHelper$$ExternalSyntheticLambda0(19, this, updates));
        MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
        startGroupCheckShortpoll();
    }

    public void lambda$stopScreenCapture$15(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void lambda$switchToSpeaker$91(Boolean bool, Boolean bool2) {
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

    public void lambda$switchToSpeaker$92() {
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if ((isBluetoothHeadsetConnected() && hasEarpiece()) || this.isHeadsetPlugged || isSpeakerphoneOn()) {
            return;
        }
        voipAudioManager.setSpeakerphoneOn(true);
        voipAudioManager.isBluetoothAndSpeakerOnAsync(new VoIPService$$ExternalSyntheticLambda138(this, 1));
    }

    public void lambda$toggleSpeakerphoneOrShowRouteSheet$93(DialogInterface dialogInterface, int i) {
        if (getSharedInstance() == null) {
            return;
        }
        setAudioOutput(i);
    }

    public static void lambda$toggleSpeakerphoneOrShowRouteSheet$94(BottomSheet bottomSheet, Integer num, DialogInterface dialogInterface) {
        for (int i = 0; i < bottomSheet.getItemViews().size(); i++) {
            int i2 = Theme.key_dialogTextBlack;
            bottomSheet.setItemColor(i, Theme.getColor(null, i2, false), Theme.getColor(null, i2, false));
        }
        if (num != null) {
            int color = Theme.getColor(null, Theme.key_dialogTextLink, false);
            bottomSheet.setItemColor(num.intValue(), color, color);
        }
    }

    public void lambda$toggleSpeakerphoneOrShowRouteSheet$95(Boolean bool, Boolean bool2) {
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

    public static void lambda$updateBluetoothHeadsetState$112(AudioManager audioManager) {
        try {
            audioManager.startBluetoothSco();
        } catch (Throwable unused) {
        }
    }

    public void lambda$updateConnectionState$81(int i) {
        if (this.switchingStreamTimeoutRunnable == null) {
            return;
        }
        this.switchingStream = false;
        lambda$createGroupInstance$80(i, 0, true);
        this.switchingStreamTimeoutRunnable = null;
    }

    public void lambda$updateConnectionState$82() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
        }
        this.spPlayId = this.soundPool.play(this.spVoiceChatConnecting, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public void lambda$updateConnectionState$83() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
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
        Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 27));
    }

    private void onTgVoipPreStop() {
    }

    private void onTgVoipStop(Instance.FinalState finalState) {
        if (this.user == null || this.privateCall == null || finalState == null) {
            return;
        }
        if (TextUtils.isEmpty(finalState.debugLog)) {
            try {
                finalState.debugLog = getStringFromFile(VoIPHelper.getLogFilePath("" + this.privateCall.id, true));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (messagesController.voipDebug == null) {
            messagesController.voipDebug = new VoIPDebugToSend(this.currentAccount);
        }
        VoIPDebugToSend voIPDebugToSend = messagesController.voipDebug;
        TL_phone.PhoneCall phoneCall = this.privateCall;
        voIPDebugToSend.push(phoneCall.id, phoneCall.access_hash, finalState, this.lastLogFilePath);
        this.lastLogFilePath = null;
        boolean z = this.needSendDebugLog;
        if (z) {
            messagesController.voipDebug.done(this.privateCall.id, z);
            this.needSendDebugLog = false;
        }
    }

    private void processAcceptedCall() {
        byte[] bArr;
        dispatchStateChanged(12);
        BigInteger bigInteger = new BigInteger(1, MessagesStorage.getInstance(this.currentAccount).getSecretPBytes());
        BigInteger bigInteger2 = new BigInteger(1, this.privateCall.g_b);
        if (!Utilities.isGoodGaAndGb(bigInteger2, bigInteger)) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("stopping VoIP service, bad Ga and Gb");
            }
            callFailed();
            return;
        }
        byte[] byteArray = bigInteger2.modPow(new BigInteger(1, this.a_or_b), bigInteger).toByteArray();
        if (byteArray.length <= 256) {
            if (byteArray.length < 256) {
                bArr = new byte[256];
                System.arraycopy(byteArray, 0, bArr, 256 - byteArray.length, byteArray.length);
                for (int i = 0; i < 256 - byteArray.length; i++) {
                    bArr[i] = 0;
                }
            }
            byte[] bArrComputeSHA1 = Utilities.computeSHA1(byteArray);
            byte[] bArr2 = new byte[8];
            System.arraycopy(bArrComputeSHA1, bArrComputeSHA1.length - 8, bArr2, 0, 8);
            long jBytesToLong = Utilities.bytesToLong(bArr2);
            this.authKey = byteArray;
            this.keyFingerprint = jBytesToLong;
            TL_phone.confirmCall confirmcall = new TL_phone.confirmCall();
            confirmcall.g_a = this.g_a;
            confirmcall.key_fingerprint = jBytesToLong;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmcall, new VoIPService$$ExternalSyntheticLambda74(this, 8));
        }
        bArr = new byte[256];
        System.arraycopy(byteArray, byteArray.length - 256, bArr, 0, 256);
        byteArray = bArr;
        byte[] bArrComputeSHA2 = Utilities.computeSHA1(byteArray);
        byte[] bArr3 = new byte[8];
        System.arraycopy(bArrComputeSHA2, bArrComputeSHA2.length - 8, bArr3, 0, 8);
        long jBytesToLong2 = Utilities.bytesToLong(bArr3);
        this.authKey = byteArray;
        this.keyFingerprint = jBytesToLong2;
        TL_phone.confirmCall confirmcall2 = new TL_phone.confirmCall();
        confirmcall2.g_a = this.g_a;
        confirmcall2.key_fingerprint = jBytesToLong2;
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall2 = new TLRPC.TL_inputPhoneCall();
        confirmcall2.peer = tL_inputPhoneCall2;
        TL_phone.PhoneCall phoneCall2 = this.privateCall;
        tL_inputPhoneCall2.id = phoneCall2.id;
        tL_inputPhoneCall2.access_hash = phoneCall2.access_hash;
        TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol3 = new TL_phone.TL_phoneCallProtocol();
        confirmcall2.protocol = tL_phoneCallProtocol3;
        tL_phoneCallProtocol3.max_layer = Instance.getConnectionMaxLayer();
        TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol4 = confirmcall2.protocol;
        tL_phoneCallProtocol4.min_layer = 65;
        tL_phoneCallProtocol4.udp_reflector = true;
        tL_phoneCallProtocol4.udp_p2p = true;
        Collections.addAll(tL_phoneCallProtocol4.library_versions, NativeInstance.getAllVersions());
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmcall2, new VoIPService$$ExternalSyntheticLambda74(this, 8));
    }

    private void showIncomingNotification(String str, TLObject tLObject, boolean z, int i) {
        int i2;
        Notification notification;
        boolean z2;
        Intent intent = new Intent(this, (Class<?>) LaunchActivity.class);
        intent.setAction("voip");
        Notification.Builder contentIntent = new Notification.Builder(this).setContentTitle(LocaleController.getString(z ? R.string.VoipInVideoCallBranding : R.string.VoipInCallBranding)).setSmallIcon(R.drawable.call).setContentIntent(PendingIntent.getActivity(this, 0, intent, 33554432));
        if (Build.VERSION.SDK_INT >= 26) {
            SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
            int i3 = globalNotificationsSettings.getInt("calls_notification_channel", 0);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("incoming_calls2" + i3);
            if (notificationChannel != null) {
                notificationManager.deleteNotificationChannel(notificationChannel.getId());
            }
            NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("incoming_calls3" + i3);
            if (notificationChannel2 != null) {
                notificationManager.deleteNotificationChannel(notificationChannel2.getId());
            }
            NotificationChannel notificationChannel3 = notificationManager.getNotificationChannel("incoming_calls4" + i3);
            if (notificationChannel3 == null) {
                z2 = true;
            } else if (notificationChannel3.getImportance() < 4 || notificationChannel3.getSound() != null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("User messed up the notification channel; deleting it and creating a proper one");
                }
                notificationManager.deleteNotificationChannel("incoming_calls4" + i3);
                i3++;
                globalNotificationsSettings.edit().putInt("calls_notification_channel", i3).commit();
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
                AndroidUtilities$$ExternalSyntheticApiModelOutline1.m166m();
                NotificationChannel notificationChannelM = PipSource$$ExternalSyntheticApiModelOutline0.m(DiffUtil.m(i3, "incoming_calls4"), LocaleController.getString(R.string.IncomingCallsSystemSetting));
                try {
                    notificationChannelM.setSound(null, audioAttributesBuild);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                notificationChannelM.setDescription(LocaleController.getString(R.string.IncomingCallsSystemSettingDescription));
                notificationChannelM.enableVibration(false);
                notificationChannelM.enableLights(false);
                notificationChannelM.setBypassDnd(true);
                try {
                    notificationManager.createNotificationChannel(notificationChannelM);
                } catch (Exception e2) {
                    FileLog.e(e2);
                    stopSelf();
                    return;
                }
            }
            contentIntent.setChannelId("incoming_calls4" + i3);
        } else {
            contentIntent.setSound(null);
        }
        Intent intent2 = new Intent(this, (Class<?>) VoIPActionsReceiver.class);
        intent2.setAction(getPackageName() + ".DECLINE_CALL");
        intent2.putExtra("call_id", getCallID());
        int i4 = R.string.VoipDeclineCall;
        CharSequence string = LocaleController.getString(i4);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 24 && i5 < 31) {
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new ForegroundColorSpan(-769226), 0, spannableString.length(), 0);
            string = spannableString;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent2, 301989888);
        Intent intent3 = new Intent(this, (Class<?>) VoIPActionsReceiver.class);
        intent3.setAction(getPackageName() + ".ANSWER_CALL");
        intent3.putExtra("call_id", getCallID());
        int i6 = R.string.VoipAnswerCall;
        CharSequence string2 = LocaleController.getString(i6);
        if (i5 < 24 || i5 >= 31) {
            i2 = 0;
        } else {
            SpannableString spannableString2 = new SpannableString(string2);
            i2 = 0;
            spannableString2.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString2.length(), 0);
            string2 = spannableString2;
        }
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this, i2, intent3, 301989888);
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(i2);
        contentIntent.setColor(-13851168);
        contentIntent.setVibrate(new long[i2]);
        contentIntent.setCategory("call");
        contentIntent.setFullScreenIntent(PendingIntent.getActivity(this, i2, intent, 33554432), true);
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (!TextUtils.isEmpty(user.phone)) {
                contentIntent.addPerson("tel:" + user.phone);
            }
        }
        if (i5 >= 31) {
            Bitmap roundAvatarBitmap = getRoundAvatarBitmap(this, this.currentAccount, tLObject);
            String name = ContactsController.formatName(tLObject);
            if (TextUtils.isEmpty(name)) {
                name = "___";
            }
            contentIntent.setStyle(Notification.CallStyle.forIncomingCall(CastSync$$ExternalSyntheticApiModelOutline0.m().setName(name).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, broadcast2));
            notification = contentIntent.build();
        } else {
            contentIntent.addAction(R.drawable.ic_call_end_white_24dp, string, broadcast);
            contentIntent.addAction(R.drawable.call, string2, broadcast2);
            contentIntent.setContentText(str);
            RemoteViews remoteViews = new RemoteViews(getPackageName(), LocaleController.isRTL ? R.layout.call_notification_rtl : R.layout.call_notification);
            remoteViews.setTextViewText(R.id.name, str);
            remoteViews.setViewVisibility(R.id.subtitle, 8);
            if (UserConfig.getActivatedAccountsCount() > 1) {
                TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                remoteViews.setTextViewText(R.id.title, z ? LocaleController.formatString("VoipInVideoCallBrandingWithName", R.string.VoipInVideoCallBrandingWithName, ContactsController.formatName(currentUser.first_name, currentUser.last_name)) : LocaleController.formatString("VoipInCallBrandingWithName", R.string.VoipInCallBrandingWithName, ContactsController.formatName(currentUser.first_name, currentUser.last_name)));
            } else {
                remoteViews.setTextViewText(R.id.title, LocaleController.getString(z ? R.string.VoipInVideoCallBranding : R.string.VoipInCallBranding));
            }
            Bitmap roundAvatarBitmap2 = getRoundAvatarBitmap(this, this.currentAccount, tLObject);
            remoteViews.setTextViewText(R.id.answer_text, LocaleController.getString(i6));
            remoteViews.setTextViewText(R.id.decline_text, LocaleController.getString(i4));
            remoteViews.setImageViewBitmap(R.id.photo, roundAvatarBitmap2);
            remoteViews.setOnClickPendingIntent(R.id.answer_btn, broadcast2);
            remoteViews.setOnClickPendingIntent(R.id.decline_btn, broadcast);
            contentIntent.setLargeIcon(roundAvatarBitmap2);
            notification = contentIntent.getNotification();
            notification.bigContentView = remoteViews;
            notification.headsUpContentView = remoteViews;
        }
        this.foregroundStarted = true;
        if (i5 >= 33) {
            this.foregroundId = 202;
            this.foregroundNotification = notification;
            int currentForegroundType = getCurrentForegroundType();
            this.lastForegroundType = currentForegroundType;
            startForeground(202, notification, currentForegroundType);
        } else {
            this.foregroundId = 202;
            this.foregroundNotification = notification;
            startForeground(202, notification);
        }
        startRingtoneAndVibration();
    }

    private void showNotification(String str, Bitmap bitmap) {
        Intent action = new Intent(this, (Class<?>) LaunchActivity.class).setAction(this.groupCall != null ? "voip_chat" : "voip");
        if (this.groupCall != null) {
            action.putExtra("currentAccount", this.currentAccount);
        }
        Notification.Builder contentIntent = new Notification.Builder(this).setContentText(str).setContentIntent(PendingIntent.getActivity(this, 50, action, 33554432));
        if (isConference()) {
            contentIntent.setContentTitle(LocaleController.getString(R.string.VoipConference));
            contentIntent.setSmallIcon(isMicMute() ? R.drawable.voicechat_muted : R.drawable.voicechat_active);
        } else if (this.groupCall != null) {
            contentIntent.setContentTitle(LocaleController.getString(ChatObject.isChannelOrGiga(this.chat) ? R.string.VoipLiveStream : R.string.VoipVoiceChat));
            contentIntent.setSmallIcon(isMicMute() ? R.drawable.voicechat_muted : R.drawable.voicechat_active);
        } else {
            contentIntent.setContentTitle(LocaleController.getString(R.string.VoipOutgoingCall));
            contentIntent.setSmallIcon(R.drawable.call);
            contentIntent.setOngoing(true);
        }
        int i = Build.VERSION.SDK_INT;
        Intent intent = new Intent(this, (Class<?>) VoIPActionsReceiver.class);
        intent.setAction(getPackageName() + ".END_CALL");
        if (isConference()) {
            contentIntent.addAction(R.drawable.ic_call_end_white_24dp, LocaleController.getString(R.string.VoipConferenceLeave), PendingIntent.getBroadcast(this, 0, intent, 167772160));
        } else if (this.groupCall != null) {
            contentIntent.addAction(R.drawable.ic_call_end_white_24dp, LocaleController.getString(ChatObject.isChannelOrGiga(this.chat) ? R.string.VoipChannelLeaveAlertTitle : R.string.VoipGroupLeaveAlertTitle), PendingIntent.getBroadcast(this, 0, intent, 167772160));
        } else {
            contentIntent.addAction(R.drawable.ic_call_end_white_24dp, LocaleController.getString(R.string.VoipEndCall), PendingIntent.getBroadcast(this, 0, intent, 167772160));
        }
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(false);
        if (i >= 26) {
            contentIntent.setColor(-14143951);
            contentIntent.setColorized(true);
        } else {
            contentIntent.setColor(-13851168);
        }
        if (i >= 26) {
            NotificationsController.checkOtherNotificationsChannel();
            contentIntent.setChannelId(NotificationsController.OTHER_NOTIFICATIONS_CHANNEL);
        }
        if (!isConference() && bitmap != null) {
            contentIntent.setLargeIcon(bitmap);
        }
        try {
            if (this.foregroundStarted) {
                try {
                    stopForeground(true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            this.foregroundStarted = true;
            if (Build.VERSION.SDK_INT < 33) {
                this.foregroundId = 201;
                Notification notification = contentIntent.getNotification();
                this.foregroundNotification = notification;
                startForeground(201, notification);
                return;
            }
            this.foregroundId = 201;
            Notification notification2 = contentIntent.getNotification();
            this.foregroundNotification = notification2;
            int currentForegroundType = getCurrentForegroundType();
            this.lastForegroundType = currentForegroundType;
            startForeground(201, notification2, currentForegroundType);
        } catch (Exception e2) {
            if (bitmap == null || !(e2 instanceof IllegalArgumentException)) {
                return;
            }
            showNotification(str, null);
        }
    }

    private void startConferenceGroupCall(boolean z, int i, String str, boolean z2) {
        if (sharedInstance == this) {
            if (this.groupCallPeer == null) {
                this.groupCallPeer = MessagesController.getInputPeer(UserConfig.getInstance(this.currentAccount).getCurrentUser());
            }
            if (z) {
                AccountInstance accountInstance = AccountInstance.getInstance(this.currentAccount);
                this.conference = new ConferenceCall(this.currentAccount, accountInstance.getUserConfig().getClientUserId()) {
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
                ChatObject.Call call = new ChatObject.Call();
                this.groupCall = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = this.groupCall;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                groupCall.rtmp_stream = this.isRtmpStream;
                call2.chatId = 0L;
                call2.currentAccount = AccountInstance.getInstance(this.currentAccount);
                this.groupCall.setSelfPeer(this.groupCallPeer);
                this.groupCall.createNoVideoParticipant();
                dispatchStateChanged(6);
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                this.groupCallBottomSheetLatch = new CountDownLatch(1);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new ChatActivity$$ExternalSyntheticLambda208(4, this, accountInstance), 65536);
                return;
            }
            if (this.conference == null) {
                int i2 = this.currentAccount;
                ConferenceCall conferenceCall = new ConferenceCall(i2, UserConfig.getInstance(i2).getClientUserId()) {
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
                ChatObject.Call call3 = new ChatObject.Call();
                this.groupCall = call3;
                call3.isConference = true;
                call3.call = new TLRPC.TL_groupCall();
                TLRPC.GroupCall groupCall2 = this.groupCall.call;
                groupCall2.participants_count = 0;
                groupCall2.version = 1;
                groupCall2.can_start_video = true;
                groupCall2.can_change_join_muted = true;
                groupCall2.rtmp_stream = this.isRtmpStream;
                if (this.joinConference instanceof TLRPC.TL_inputGroupCallSlug) {
                    groupCall2.invite_link = "https://t.me/call/" + this.joinConference.slug;
                }
                ChatObject.Call call4 = this.groupCall;
                call4.chatId = 0L;
                call4.currentAccount = AccountInstance.getInstance(this.currentAccount);
                this.groupCall.setSelfPeer(this.groupCallPeer);
                this.groupCall.createNoVideoParticipant();
                TLRPC.GroupCall groupCall3 = this.joinConferenceCall;
                if (groupCall3 != null) {
                    this.conference.groupCall = groupCall3;
                    this.groupCall.setCall(AccountInstance.getInstance(this.currentAccount), 0L, this.joinConferenceCall);
                    this.joinConferenceCall = null;
                }
            }
            if (this.conference.groupCall == null) {
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = this.joinConference;
                getgroupcall.limit = 10;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new ProfileActivity$$ExternalSyntheticLambda75(this, i, str, 2));
                return;
            }
            if (str == null) {
                configureDeviceForCall();
                showNotification();
                AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda54(4));
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
                        this.groupCall.addInvitedUser(j);
                    }
                }
                VoIPFragment voIPFragment = VoIPFragment.instance;
                if (voIPFragment != null) {
                    voIPFragment.windowView.finish(330L);
                }
                GroupCallActivity.create(LaunchActivity.instance, AccountInstance.getInstance(UserConfig.selectedAccount), null, null, false, null);
                return;
            }
            if (getSharedInstance() != null && (this.groupCall != null || this.conference != null)) {
                dispatchStateChanged(1);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("initital source = " + i);
                }
                ChatActivity$70$$ExternalSyntheticLambda1 chatActivity$70$$ExternalSyntheticLambda1 = new ChatActivity$70$$ExternalSyntheticLambda1(i, 1, this, str, z);
                if (z2) {
                    this.conference.reset();
                }
                this.conference.requestLastBlock(new ClickHelper$$ExternalSyntheticLambda0(18, this, chatActivity$70$$ExternalSyntheticLambda1));
            }
        }
    }

    private void startConnectingSound() {
        Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 4));
    }

    private void startGroupCall(int i, String str, boolean z) {
        if (sharedInstance != this) {
            return;
        }
        if (this.createGroupCall) {
            ChatObject.Call call = new ChatObject.Call();
            this.groupCall = call;
            call.call = new TLRPC.TL_groupCall();
            ChatObject.Call call2 = this.groupCall;
            TLRPC.GroupCall groupCall = call2.call;
            groupCall.participants_count = 0;
            groupCall.version = 1;
            groupCall.can_start_video = true;
            groupCall.can_change_join_muted = true;
            groupCall.rtmp_stream = this.isRtmpStream;
            call2.chatId = this.chat.id;
            call2.currentAccount = AccountInstance.getInstance(this.currentAccount);
            this.groupCall.setSelfPeer(this.groupCallPeer);
            this.groupCall.createNoVideoParticipant();
            dispatchStateChanged(6);
            TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
            creategroupcall.peer = MessagesController.getInputPeer(this.chat);
            creategroupcall.random_id = Utilities.random.nextInt();
            int i2 = this.scheduleDate;
            if (i2 != 0) {
                creategroupcall.schedule_date = i2;
                creategroupcall.flags |= 2;
            }
            if (this.isRtmpStream) {
                creategroupcall.flags |= 4;
            }
            this.groupCallBottomSheetLatch = new CountDownLatch(1);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(creategroupcall, new VoIPService$$ExternalSyntheticLambda74(this, 1), 65536);
            this.createGroupCall = false;
            return;
        }
        if (str == null) {
            if (this.groupCall == null && this.chat != null) {
                ChatObject.Call groupCall2 = MessagesController.getInstance(this.currentAccount).getGroupCall(this.chat.id, false);
                this.groupCall = groupCall2;
                if (groupCall2 != null) {
                    groupCall2.setSelfPeer(this.groupCallPeer);
                }
            }
            configureDeviceForCall();
            showNotification();
            AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda54(6));
            createGroupInstance(0, false, true);
            return;
        }
        if (getSharedInstance() == null || this.groupCall == null) {
            return;
        }
        dispatchStateChanged(1);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("initital source = " + i);
        }
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        joingroupcall.muted = this.micMute;
        joingroupcall.video_stopped = this.videoState[0] != 2;
        joingroupcall.call = this.groupCall.getInputGroupCall();
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
            tL_inputPeerUser.user_id = AccountInstance.getInstance(this.currentAccount).getUserConfig().getClientUserId();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcall, new GroupCallActivity$$ExternalSyntheticLambda42(this, i, z, 1));
    }

    private void startGroupCheckShortpoll() {
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable != null || sharedInstance == null || (call = this.groupCall) == null) {
            return;
        }
        int[] iArr = this.mySource;
        if (iArr[0] == 0 && iArr[1] == 0 && ((groupCall = call.call) == null || !groupCall.rtmp_stream)) {
            return;
        }
        VoIPService$$ExternalSyntheticLambda46 voIPService$$ExternalSyntheticLambda46 = new VoIPService$$ExternalSyntheticLambda46(this, 2);
        this.shortPollRunnable = voIPService$$ExternalSyntheticLambda46;
        AndroidUtilities.runOnUIThread(voIPService$$ExternalSyntheticLambda46, 4000L);
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
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda54(5));
        Utilities.random.nextBytes(new byte[256]);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        tL_messages_getDhConfig.version = messagesStorage.getLastSecretVersion();
        this.callReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDhConfig, new VoIPService$$ExternalSyntheticLambda55(this, messagesStorage, 1), 65536);
    }

    private void startRatingActivity() {
        try {
            PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) VoIPFeedbackActivity.class).putExtra("call_id", this.privateCall.id).putExtra("call_access_hash", this.privateCall.access_hash).putExtra("call_video", this.privateCall.video).putExtra("account", this.currentAccount).addFlags(805306368), 33554432).send();
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error starting incall activity", e);
            }
        }
    }

    public void startRinging() {
        CallConnection callConnection;
        if (this.currentState == 15) {
            return;
        }
        if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null) {
            callConnection.setRinging();
        }
        if (BuildVars.LOGS_ENABLED) {
            zzjj.m(new StringBuilder("starting ringing for call "), this.privateCall.id);
        }
        dispatchStateChanged(15);
        if (!this.notificationsDisabled) {
            TLRPC.User user = this.user;
            showIncomingNotification(ContactsController.formatName(user.first_name, user.last_name), this.user, this.privateCall.video, 0);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("Showing incoming call notification");
                return;
            }
            return;
        }
        startRingtoneAndVibration(this.user.id);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Starting incall activity for incoming call");
        }
        try {
            PendingIntent.getActivity(this, 12345, new Intent(this, (Class<?>) LaunchActivity.class).setAction("voip"), 33554432).send();
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error starting incall activity", e);
            }
        }
    }

    private void startRingtoneAndVibration(long j) {
        int i;
        int i2;
        long j2;
        String string;
        Uri defaultUri;
        boolean z;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (audioManager.getRingerMode() == 0 || this.ringtonePlayer != null) {
            return;
        }
        synchronized (sync) {
            try {
                if (this.ringtonePlayer != null) {
                    return;
                }
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.ringtonePlayer = mediaPlayer;
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public final void onPrepared(MediaPlayer mediaPlayer2) {
                        this.f$0.lambda$startRingtoneAndVibration$96(mediaPlayer2);
                    }
                });
                this.ringtonePlayer.setLooping(true);
                if (this.isHeadsetPlugged) {
                    this.ringtonePlayer.setAudioStreamType(0);
                } else {
                    this.ringtonePlayer.setAudioStreamType(2);
                    if (!USE_CONNECTION_SERVICE) {
                        this.hasAudioFocus = audioManager.requestAudioFocus(this, 2, 2) == 1;
                    }
                }
                try {
                    if (notificationsSettings.getBoolean("custom_" + j, false)) {
                        string = notificationsSettings.getString("ringtone_path_" + j, null);
                    } else {
                        string = notificationsSettings.getString("CallsRingtonePath", null);
                    }
                    if (string != null) {
                        Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
                        if (uri == null || !string.equalsIgnoreCase(uri.getPath())) {
                            defaultUri = Uri.parse(string);
                            z = false;
                        } else {
                            defaultUri = RingtoneManager.getDefaultUri(1);
                        }
                        FileLog.d("start ringtone with " + z + " " + defaultUri);
                        this.ringtonePlayer.setDataSource(this, defaultUri);
                        this.ringtonePlayer.prepareAsync();
                        if (notificationsSettings.getBoolean("custom_" + j, false)) {
                            i = notificationsSettings.getInt("calls_vibrate_" + j, 0);
                        } else {
                            i = notificationsSettings.getInt("vibrate_calls", 0);
                        }
                        if ((i == 2 && i != 4 && (audioManager.getRingerMode() == 1 || audioManager.getRingerMode() == 2)) || (i == 4 && audioManager.getRingerMode() == 1)) {
                            Vibrator vibrator = (Vibrator) getSystemService("vibrator");
                            this.vibrator = vibrator;
                            if (i == 1) {
                                j2 = 350;
                                i2 = 3;
                            } else {
                                i2 = 3;
                                if (i == 3) {
                                    j2 = 1400;
                                } else {
                                    j2 = 700;
                                }
                            }
                            long[] jArr = new long[i2];
                            jArr[0] = 0;
                            jArr[1] = j2;
                            jArr[2] = 500;
                            vibrator.vibrate(jArr, 0);
                        }
                    }
                    defaultUri = RingtoneManager.getDefaultUri(1);
                    z = true;
                    FileLog.d("start ringtone with " + z + " " + defaultUri);
                    this.ringtonePlayer.setDataSource(this, defaultUri);
                    this.ringtonePlayer.prepareAsync();
                } catch (Exception e) {
                    FileLog.e(e);
                    MediaPlayer mediaPlayer2 = this.ringtonePlayer;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.release();
                        this.ringtonePlayer = null;
                    }
                }
                if (notificationsSettings.getBoolean("custom_" + j, false)) {
                    i = notificationsSettings.getInt("calls_vibrate_" + j, 0);
                } else {
                    i = notificationsSettings.getInt("vibrate_calls", 0);
                }
                if (i == 2) {
                    Vibrator vibrator2 = (Vibrator) getSystemService("vibrator");
                    this.vibrator = vibrator2;
                    if (i == 1) {
                        j2 = 350;
                        i2 = 3;
                    } else {
                        i2 = 3;
                        if (i == 3) {
                            j2 = 1400;
                        } else {
                            j2 = 700;
                        }
                    }
                    long[] jArr2 = new long[i2];
                    jArr2[0] = 0;
                    jArr2[1] = j2;
                    jArr2[2] = 500;
                    vibrator2.vibrate(jArr2, 0);
                } else {
                    Vibrator vibrator3 = (Vibrator) getSystemService("vibrator");
                    this.vibrator = vibrator3;
                    if (i == 1) {
                        j2 = 350;
                        i2 = 3;
                    } else {
                        i2 = 3;
                        if (i == 3) {
                            j2 = 1400;
                        } else {
                            j2 = 700;
                        }
                    }
                    long[] jArr3 = new long[i2];
                    jArr3[0] = 0;
                    jArr3[1] = j2;
                    jArr3[2] = 500;
                    vibrator3.vibrate(jArr3, 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void startScreenCapture(int i, String str) {
        if (getSharedInstance() == null || this.groupCall == null) {
            return;
        }
        this.mySource[1] = 0;
        TL_phone.joinGroupCallPresentation joingroupcallpresentation = new TL_phone.joinGroupCallPresentation();
        joingroupcallpresentation.call = this.groupCall.getInputGroupCall();
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcallpresentation.params = tL_dataJSON;
        tL_dataJSON.data = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcallpresentation, new LaunchActivity$$ExternalSyntheticLambda63(this, i, 1));
    }

    public void updateBluetoothHeadsetState(boolean z) {
        if (z == this.isBtHeadsetConnected) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("updateBluetoothHeadsetState: " + z);
        }
        this.isBtHeadsetConnected = z;
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        int i = 0;
        if (!z || isRinging() || this.currentState == 0) {
            this.bluetoothScoActive = false;
            this.bluetoothScoConnecting = false;
            audioManager.setBluetoothScoOn(false);
        } else if (this.bluetoothScoActive) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("SCO already active, setting audio routing");
            }
            if (!hasRtmpStream()) {
                audioManager.setSpeakerphoneOn(false);
                audioManager.setBluetoothScoOn(true);
            }
        } else {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("startBluetoothSco");
            }
            if (!hasRtmpStream()) {
                this.needSwitchToBluetoothAfterScoActivates = true;
                AndroidUtilities.runOnUIThread(new VoIPService$1$$ExternalSyntheticLambda1(audioManager, 2), 500L);
            }
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i < size) {
            StateListener stateListener = arrayList.get(i);
            i++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public void lambda$createGroupInstance$80(int i, int i2, boolean z) {
        if (i != 0) {
            return;
        }
        dispatchStateChanged((i2 == 1 || this.switchingStream) ? 3 : 5);
        if (this.switchingStream && (i2 == 0 || (i2 == 1 && z))) {
            VoIPService$$ExternalSyntheticLambda56 voIPService$$ExternalSyntheticLambda56 = new VoIPService$$ExternalSyntheticLambda56(this, i, 2);
            this.switchingStreamTimeoutRunnable = voIPService$$ExternalSyntheticLambda56;
            AndroidUtilities.runOnUIThread(voIPService$$ExternalSyntheticLambda56, 3000L);
        }
        if (i2 == 0) {
            startGroupCheckShortpoll();
            if (!this.playedConnectedSound || this.spPlayId != 0 || this.switchingStream || this.switchingAccount) {
                return;
            }
            Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 6));
            return;
        }
        cancelGroupCheckShortPoll();
        if (!z) {
            this.switchingStream = false;
            this.switchingAccount = false;
        }
        Runnable runnable = this.switchingStreamTimeoutRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.switchingStreamTimeoutRunnable = null;
        }
        if (this.playedConnectedSound) {
            Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 7));
            Runnable runnable2 = this.connectingSoundRunnable;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                this.connectingSoundRunnable = null;
            }
        } else {
            playConnectedSound();
        }
        if (this.wasConnected) {
            return;
        }
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

    public void updateNetworkType() {
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            this.lastNetInfo = getActiveNetworkInfo();
        } else {
            if (nativeInstance.isGroup()) {
                return;
            }
            this.tgVoip[0].setNetworkType(getNetworkType());
        }
    }

    private void updateServerConfig() {
        SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
        Instance.setGlobalServerConfig(mainSettings.getString("voip_server_config", "{}"));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_phone.getCallConfig(), new VoIPService$$ExternalSyntheticLambda74(mainSettings, 9));
    }

    public void updateTrafficStats(NativeInstance nativeInstance, Instance.TrafficStats trafficStats) {
        if (nativeInstance == null) {
            return;
        }
        if (trafficStats == null) {
            trafficStats = nativeInstance.getTrafficStats();
        }
        if (trafficStats == null) {
            return;
        }
        long j = trafficStats.bytesSentWifi;
        Instance.TrafficStats trafficStats2 = this.prevTrafficStats;
        long j2 = j - (trafficStats2 != null ? trafficStats2.bytesSentWifi : 0L);
        long j3 = trafficStats.bytesReceivedWifi - (trafficStats2 != null ? trafficStats2.bytesReceivedWifi : 0L);
        long j4 = trafficStats.bytesSentMobile - (trafficStats2 != null ? trafficStats2.bytesSentMobile : 0L);
        long j5 = trafficStats.bytesReceivedMobile - (trafficStats2 != null ? trafficStats2.bytesReceivedMobile : 0L);
        this.prevTrafficStats = trafficStats;
        if (j2 > 0) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(1, 0, j2);
        }
        if (j3 > 0) {
            StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(1, 0, j3);
        }
        if (j4 > 0) {
            StatsController statsController = StatsController.getInstance(this.currentAccount);
            NetworkInfo networkInfo = this.lastNetInfo;
            statsController.incrementSentBytesCount((networkInfo == null || !networkInfo.isRoaming()) ? 0 : 2, 0, j4);
        }
        if (j5 > 0) {
            StatsController statsController2 = StatsController.getInstance(this.currentAccount);
            NetworkInfo networkInfo2 = this.lastNetInfo;
            statsController2.incrementReceivedBytesCount((networkInfo2 == null || !networkInfo2.isRoaming()) ? 0 : 2, 0, j5);
        }
    }

    @Override
    public void acceptIncomingCall() {
        updateCurrentForegroundType();
        MessagesController.getInstance(this.currentAccount).ignoreSetOnline = false;
        stopRinging();
        showNotification();
        configureDeviceForCall();
        startConnectingSound();
        dispatchStateChanged(12);
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda54(0));
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        tL_messages_getDhConfig.version = messagesStorage.getLastSecretVersion();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDhConfig, new VoIPService$$ExternalSyntheticLambda55(this, messagesStorage, 0));
    }

    public ProxyVideoSink addRemoteSink(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, VideoSink videoSink, VideoSink videoSink2) {
        if (this.tgVoip[0] == null) {
            return null;
        }
        String str = z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
        if (str == null) {
            return null;
        }
        ProxyVideoSink proxyVideoSink = this.remoteSinks.get(str);
        if (proxyVideoSink != null && proxyVideoSink.target == videoSink) {
            return proxyVideoSink;
        }
        if (proxyVideoSink == null) {
            proxyVideoSink = this.proxyVideoSinkLruCache.remove(str);
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
        this.remoteSinks.put(str, proxyVideoSink2);
        proxyVideoSink2.nativeInstance = this.tgVoip[0].addIncomingVideoOutput(1, str, createSsrcGroups(z ? groupCallParticipant.presentation : groupCallParticipant.video), proxyVideoSink2, DialogObject.getPeerDialogId(groupCallParticipant.peer));
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
        String str = z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
        if (str == null) {
            return;
        }
        if (!z || groupCallParticipant.hasPresentationFrame == 0) {
            if (z || groupCallParticipant.hasCameraFrame == 0) {
                if (this.proxyVideoSinkLruCache.get(str) != null || (this.remoteSinks.get(str) != null && this.waitingFrameParticipant.get(str) == null)) {
                    if (z) {
                        groupCallParticipant.hasPresentationFrame = 2;
                        return;
                    } else {
                        groupCallParticipant.hasCameraFrame = 2;
                        return;
                    }
                }
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
        TLRPC.User user = this.user;
        this.convertingFromCallWithUserId = user != null ? user.id : 0L;
        this.inviteUsersToConferenceVideo = z;
        this.inviteUsersToConference = hashSet;
        stopRinging();
        NativeInstance[] nativeInstanceArr = this.tgVoip;
        NativeInstance nativeInstance = nativeInstanceArr[0];
        if (nativeInstance != null) {
            this.prevTrafficStats = null;
            this.convertingVoip = nativeInstance;
            nativeInstanceArr[0] = null;
        }
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda46(this, 26));
    }

    public void createCaptureDevice(boolean z) {
        VoIPFragment.AnonymousClass24 anonymousClass24;
        if (z) {
            this.gotMediaProjection = true;
            updateCurrentForegroundType();
        }
        ?? r2 = z ? 2 : this.isFrontFaceCamera;
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
        if (!z) {
            long j2 = this.captureDevice[z ? 1 : 0];
            if (j2 != 0 || this.tgVoip[z ? 1 : 0] == null) {
                NativeInstance nativeInstance2 = this.tgVoip[z ? 1 : 0];
                if (nativeInstance2 != null && j2 != 0) {
                    nativeInstance2.activateVideoCapturer(j2);
                }
                if (this.captureDevice[z ? 1 : 0] != 0) {
                    return;
                }
            }
            this.captureDevice[z ? 1 : 0] = NativeInstance.createVideoCapturer(this.localSink[z ? 1 : 0], r2);
            return;
        }
        if (this.groupCall != null) {
            long[] jArr = this.captureDevice;
            if (jArr[z ? 1 : 0] != 0) {
                return;
            }
            jArr[z ? 1 : 0] = NativeInstance.createVideoCapturer(this.localSink[z ? 1 : 0], r2);
            createGroupInstance(1, false, true);
            setVideoState(true, 2);
            AccountInstance.getInstance(this.currentAccount).getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallScreencastStateChanged, new Object[0]);
            return;
        }
        requestVideoCall(true);
        setVideoState(true, 2);
        VoIPFragment voIPFragment = VoIPFragment.instance;
        if (voIPFragment == null || (anonymousClass24 = voIPFragment.previewDialog) == null) {
            return;
        }
        anonymousClass24.dismiss(true, true);
    }

    public void declineIncomingCall(int i, Runnable runnable) {
        if (this.groupCall != null) {
            stopScreenCapture();
        }
        stopRinging();
        this.callDiscardReason = i;
        int i2 = this.currentState;
        if (i2 == 14) {
            Runnable runnable2 = this.delayedStartOutgoingCall;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                callEnded();
                return;
            } else {
                dispatchStateChanged(10);
                this.endCallAfterRequest = true;
                AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda82(this, 2), 5000L);
                return;
            }
        }
        if (i2 == 10 || i2 == 11) {
            return;
        }
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
        discardcall.connection_id = nativeInstance != null ? nativeInstance.getPreferredRelayId() : 0L;
        if (i == 2) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonDisconnect();
        } else if (i == 3) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonMissed();
        } else if (i == 4) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonBusy();
        } else if (i != 5) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonHangup();
        } else {
            TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall tL_phoneCallDiscardReasonMigrateConferenceCall = new TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall();
            discardcall.reason = tL_phoneCallDiscardReasonMigrateConferenceCall;
            tL_phoneCallDiscardReasonMigrateConferenceCall.slug = "";
        }
        FileLog.e("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new VoIPService$$ExternalSyntheticLambda74(this, 7), 65536);
        this.onDestroyRunnable = runnable;
        callEnded();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.appDidLogout) {
            callEnded();
        }
    }

    public void editCallMember(TLObject tLObject, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Runnable runnable) {
        TLRPC.InputPeer inputPeer;
        if (tLObject == null || this.groupCall == null) {
            return;
        }
        TL_phone.editGroupCallParticipant editgroupcallparticipant = new TL_phone.editGroupCallParticipant();
        editgroupcallparticipant.call = this.groupCall.getInputGroupCall();
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (!UserObject.isUserSelf(user) || (inputPeer = this.groupCallPeer) == null) {
                editgroupcallparticipant.participant = MessagesController.getInputPeer(user);
                if (BuildVars.LOGS_ENABLED) {
                    StringBuilder sb = new StringBuilder("edit group call part id = ");
                    sb.append(editgroupcallparticipant.participant.user_id);
                    sb.append(" access_hash = ");
                    zzjj.m(sb, editgroupcallparticipant.participant.user_id);
                }
            } else {
                editgroupcallparticipant.participant = inputPeer;
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            editgroupcallparticipant.participant = MessagesController.getInputPeer((TLRPC.Chat) tLObject);
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("edit group call part id = ");
                TLRPC.InputPeer inputPeer2 = editgroupcallparticipant.participant;
                long j = inputPeer2.chat_id;
                if (j == 0) {
                    j = inputPeer2.channel_id;
                }
                sb2.append(j);
                sb2.append(" access_hash = ");
                zzjj.m(sb2, editgroupcallparticipant.participant.access_hash);
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
        if (BuildVars.LOGS_ENABLED) {
            ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("edit group call flags = "), editgroupcallparticipant.flags);
        }
        int i = this.currentAccount;
        AccountInstance.getInstance(i).getConnectionsManager().sendRequest(editgroupcallparticipant, new ProfileActivity$$ExternalSyntheticLambda75(this, i, runnable, 1));
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
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("creating call connection");
            }
            CallConnection callConnection = new CallConnection();
            this.systemCallConnection = callConnection;
            callConnection.setInitializing();
            if (this.isOutgoing) {
                VoIPService$$ExternalSyntheticLambda46 voIPService$$ExternalSyntheticLambda46 = new VoIPService$$ExternalSyntheticLambda46(this, 11);
                this.delayedStartOutgoingCall = voIPService$$ExternalSyntheticLambda46;
                AndroidUtilities.runOnUIThread(voIPService$$ExternalSyntheticLambda46, 2000L);
            }
            this.systemCallConnection.setAddress(Uri.fromParts("tel", "+99084" + this.user.id, null), 1);
            CallConnection callConnection2 = this.systemCallConnection;
            TLRPC.User user = this.user;
            callConnection2.setCallerDisplayName(ContactsController.formatName(user.first_name, user.last_name), 1);
        }
        return this.systemCallConnection;
    }

    public int getCurrentAudioRoute() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPService.getCurrentAudioRoute():int");
    }

    public String getDebugString() {
        NativeInstance nativeInstance = this.tgVoip[0];
        return nativeInstance != null ? nativeInstance.getDebugInfo() : "";
    }

    public byte[] getEncryptionKey() {
        return this.authKey;
    }

    public byte[] getGA() {
        return this.g_a;
    }

    @Override
    public TLRPC.GroupCall getGroupCall() {
        ChatObject.Call call = this.groupCall;
        if (call != null) {
            return call.call;
        }
        return null;
    }

    public CountDownLatch getGroupCallBottomSheetLatch() {
        return this.groupCallBottomSheetLatch;
    }

    public long getGroupCallID() {
        TLRPC.GroupCall groupCall;
        ChatObject.Call call = this.groupCall;
        if (call == null || (groupCall = call.call) == null) {
            return 0L;
        }
        return groupCall.id;
    }

    public TLRPC.InputPeer getGroupCallPeer() {
        return this.groupCallPeer;
    }

    @Override
    public ArrayList<TLRPC.GroupCallParticipant> getGroupParticipants() {
        ChatObject.Call call = this.groupCall;
        if (call != null) {
            return call.sortedParticipants;
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
            return UserConfig.getInstance(this.currentAccount).clientUserId;
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
            return inputPeer.user_id;
        }
        return inputPeer instanceof TLRPC.TL_inputPeerChannel ? -inputPeer.channel_id : -inputPeer.chat_id;
    }

    public String getTitle() {
        TLRPC.User user = this.user;
        if (user != null) {
            return ContactsController.formatName(user.first_name, user.last_name);
        }
        TLRPC.Chat chat = this.chat;
        return chat != null ? chat.title : "";
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
        TLRPC.ChatFull chatFull;
        int i2 = this.currentState;
        declineIncomingCall((i2 == 16 || (i2 == 13 && this.isOutgoing)) ? 3 : 1, runnable);
        if (this.groupCall == null || i == 2) {
            return;
        }
        if (i != 1) {
            TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
            leavegroupcall.call = this.groupCall.getInputGroupCall();
            leavegroupcall.source = this.mySource[0];
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcall, new VoIPService$$ExternalSyntheticLambda74(this, 5));
            return;
        }
        if (this.chat != null && (chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.chat.id)) != null) {
            chatFull.flags &= -2097153;
            chatFull.call = null;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(this.chat.id), Long.valueOf(this.groupCall.call.id), Boolean.FALSE);
        }
        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
        discardgroupcall.call = this.groupCall.getInputGroupCall();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardgroupcall, new VoIPService$$ExternalSyntheticLambda74(this, 4));
    }

    public boolean hasEarpiece() {
        CallConnection callConnection;
        if (!USE_CONNECTION_SERVICE || (callConnection = this.systemCallConnection) == null || callConnection.getCallAudioState() == null) {
            if (((TelephonyManager) getSystemService("phone")).getPhoneType() == 0) {
                Boolean bool = this.mHasEarpiece;
                if (bool != null) {
                    return bool.booleanValue();
                }
                try {
                    AudioManager audioManager = (AudioManager) getSystemService("audio");
                    Method method = AudioManager.class.getMethod("getDevicesForStream", Integer.TYPE);
                    int i = AudioManager.class.getField("DEVICE_OUT_EARPIECE").getInt(null);
                    if ((((Integer) method.invoke(audioManager, 0)).intValue() & i) == i) {
                        this.mHasEarpiece = Boolean.TRUE;
                    } else {
                        this.mHasEarpiece = Boolean.FALSE;
                    }
                } catch (Throwable th) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("Error while checking earpiece! ", th);
                    }
                    this.mHasEarpiece = Boolean.TRUE;
                }
                return this.mHasEarpiece.booleanValue();
            }
        } else if ((this.systemCallConnection.getCallAudioState().getSupportedRouteMask() & 5) == 0) {
            return false;
        }
        return true;
    }

    public boolean hasRate() {
        return this.needRateCall || this.forceRating;
    }

    public boolean hasVideoCapturer() {
        return this.captureDevice[0] != 0;
    }

    public boolean isBluetoothHeadsetConnected() {
        CallConnection callConnection;
        if (!USE_CONNECTION_SERVICE || (callConnection = this.systemCallConnection) == null || callConnection.getCallAudioState() == null) {
            return this.isBtHeadsetConnected;
        }
        return (this.systemCallConnection.getCallAudioState().getSupportedRouteMask() & 2) != 0;
    }

    public boolean isBluetoothOn() {
        return ((AudioManager) getSystemService("audio")).isBluetoothScoOn();
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
        return (this.joinConference == null && this.conference == null) ? false : true;
    }

    public boolean isConverting() {
        return this.convertingVoip != null;
    }

    public boolean isFrontFaceCamera() {
        return this.isFrontFaceCamera;
    }

    public boolean isFullscreen(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        if (this.currentBackgroundSink[z ? 1 : 0] != null) {
            return TextUtils.equals(this.currentBackgroundEndpointId[z ? 1 : 0], z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        }
        return false;
    }

    public boolean isHangingUp() {
        return this.currentState == 10;
    }

    public boolean isHeadsetPlugged() {
        return this.isHeadsetPlugged;
    }

    public boolean isJoined() {
        int i = this.currentState;
        return (i == 1 || i == 6) ? false : true;
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
                return route == 8;
            }
            return route == 2;
        }
        if (!this.audioConfigured || z) {
            return this.speakerphoneStateToSet;
        }
        return hasEarpiece() ? VoipAudioManager.get().isSpeakerphoneOn() : ((AudioManager) getSystemService("audio")).isBluetoothScoOn();
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
        ChatObject.Call call = this.groupCall;
        if (call == null) {
            return false;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(getSelfId());
        return (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(this.chat)) ? false : true;
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
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

    public void onCallUpdated(TL_phone.PhoneCall phoneCall) {
        byte[] bArr;
        long jBytesToLong;
        if (this.user == null) {
            return;
        }
        TL_phone.PhoneCall phoneCall2 = this.privateCall;
        if (phoneCall2 == null) {
            this.pendingUpdates.add(phoneCall);
            return;
        }
        if (phoneCall == null) {
            return;
        }
        if (phoneCall.id != phoneCall2.id) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("onCallUpdated called with wrong call id (got " + phoneCall.id + ", expected " + this.privateCall.id + ")");
                return;
            }
            return;
        }
        if (phoneCall.access_hash == 0) {
            phoneCall.access_hash = phoneCall2.access_hash;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Call updated: " + phoneCall);
        }
        long j = this.privateCall.key_fingerprint;
        this.privateCall = phoneCall;
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            this.needSendDebugLog = phoneCall.need_debug;
            this.needRateCall = phoneCall.need_rating;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("call discarded, stopping service");
            }
            VoIPDebugToSend voIPDebugToSend = MessagesController.getInstance(this.currentAccount).voipDebug;
            if (voIPDebugToSend != null) {
                voIPDebugToSend.done(phoneCall.id, phoneCall.need_debug);
            }
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = phoneCall.reason;
            if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall)) {
                if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) {
                    callEnded();
                    return;
                }
                dispatchStateChanged(17);
                this.playingSound = true;
                Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 18));
                AndroidUtilities.runOnUIThread(this.afterSoundRunnable, 1500L);
                endConnectionServiceCall(1500L);
                stopSelf();
                return;
            }
            TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
            this.joinConference = tL_inputGroupCallSlug;
            tL_inputGroupCallSlug.slug = ((TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall) phoneCallDiscardReason).slug;
            stopRinging();
            NativeInstance[] nativeInstanceArr = this.tgVoip;
            NativeInstance nativeInstance = nativeInstanceArr[0];
            if (nativeInstance != null) {
                this.prevTrafficStats = null;
                this.convertingVoip = nativeInstance;
                nativeInstanceArr[0] = null;
            }
            startConferenceGroupCall(false, 0, null, false);
            return;
        }
        if (!(phoneCall instanceof TL_phone.TL_phoneCall) || this.authKey != null) {
            if ((phoneCall instanceof TL_phone.TL_phoneCallAccepted) && this.authKey == null) {
                processAcceptedCall();
                return;
            }
            if (this.currentState != 13 || phoneCall.receive_date == 0) {
                return;
            }
            dispatchStateChanged(16);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("!!!!!! CALL RECEIVED");
            }
            Runnable runnable = this.connectingSoundRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.connectingSoundRunnable = null;
            }
            Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 19));
            Runnable runnable2 = this.timeoutRunnable;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                this.timeoutRunnable = null;
            }
            VoIPService$$ExternalSyntheticLambda46 voIPService$$ExternalSyntheticLambda46 = new VoIPService$$ExternalSyntheticLambda46(this, 20);
            this.timeoutRunnable = voIPService$$ExternalSyntheticLambda46;
            AndroidUtilities.runOnUIThread(voIPService$$ExternalSyntheticLambda46, MessagesController.getInstance(this.currentAccount).callRingTimeout);
            return;
        }
        byte[] bArr2 = phoneCall.g_a_or_b;
        if (bArr2 == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("stopping VoIP service, Ga == null");
            }
            callFailed();
            return;
        }
        if (!Arrays.equals(this.g_a_hash, Utilities.computeSHA256(bArr2, 0, bArr2.length))) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("stopping VoIP service, Ga hash doesn't match");
            }
            callFailed();
            return;
        }
        this.g_a = phoneCall.g_a_or_b;
        BigInteger bigInteger = new BigInteger(1, phoneCall.g_a_or_b);
        BigInteger bigInteger2 = new BigInteger(1, MessagesStorage.getInstance(this.currentAccount).getSecretPBytes());
        if (!Utilities.isGoodGaAndGb(bigInteger, bigInteger2)) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("stopping VoIP service, bad Ga and Gb (accepting)");
            }
            callFailed();
            return;
        }
        byte[] byteArray = bigInteger.modPow(new BigInteger(1, this.a_or_b), bigInteger2).toByteArray();
        if (byteArray.length <= 256) {
            if (byteArray.length < 256) {
                bArr = new byte[256];
                System.arraycopy(byteArray, 0, bArr, 256 - byteArray.length, byteArray.length);
                for (int i = 0; i < 256 - byteArray.length; i++) {
                    bArr[i] = 0;
                }
            }
            byte[] bArrComputeSHA1 = Utilities.computeSHA1(byteArray);
            byte[] bArr3 = new byte[8];
            System.arraycopy(bArrComputeSHA1, bArrComputeSHA1.length - 8, bArr3, 0, 8);
            this.authKey = byteArray;
            jBytesToLong = Utilities.bytesToLong(bArr3);
            this.keyFingerprint = jBytesToLong;
            if (jBytesToLong != phoneCall.key_fingerprint) {
                initiateActualEncryptedCall();
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("key fingerprints don't match");
            }
            callFailed();
        }
        bArr = new byte[256];
        System.arraycopy(byteArray, byteArray.length - 256, bArr, 0, 256);
        byteArray = bArr;
        byte[] bArrComputeSHA2 = Utilities.computeSHA1(byteArray);
        byte[] bArr4 = new byte[8];
        System.arraycopy(bArrComputeSHA2, bArrComputeSHA2.length - 8, bArr4, 0, 8);
        this.authKey = byteArray;
        jBytesToLong = Utilities.bytesToLong(bArr4);
        this.keyFingerprint = jBytesToLong;
        if (jBytesToLong != phoneCall.key_fingerprint) {
            initiateActualEncryptedCall();
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.w("key fingerprints don't match");
        }
        callFailed();
    }

    public void onCameraFirstFrameAvailable() {
        for (int i = 0; i < this.stateListeners.size(); i++) {
            this.stateListeners.get(i).onCameraFirstFrameAvailable();
        }
    }

    @Override
    public void onConnectionStateChanged(int i, boolean z) {
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda56(this, i, 4));
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("=============== VoIPService STARTING ===============");
        }
        try {
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            if (audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER") != null) {
                Instance.setBufferSize(Integer.parseInt(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER")));
            } else {
                Instance.setBufferSize(AudioTrack.getMinBufferSize(48000, 4, 2) / 2);
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "telegram-voip");
            this.cpuWakelock = wakeLockNewWakeLock;
            wakeLockNewWakeLock.acquire();
            this.btAdapter = audioManager.isBluetoothScoAvailableOffCall() ? BluetoothAdapter.getDefaultAdapter() : null;
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
            }
            registerReceiver(this.receiver, intentFilter);
            fetchBluetoothDeviceName();
            if (this.audioDeviceCallback == null) {
                try {
                    this.audioDeviceCallback = new AudioDeviceCallback() {
                        @Override
                        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                            VoIPService.this.checkUpdateBluetoothHeadset();
                        }

                        @Override
                        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                            VoIPService.this.checkUpdateBluetoothHeadset();
                        }
                    };
                } catch (Throwable th) {
                    FileLog.e(th);
                    this.audioDeviceCallback = null;
                }
            }
            AudioDeviceCallback audioDeviceCallback = this.audioDeviceCallback;
            if (audioDeviceCallback != null) {
                audioManager.registerAudioDeviceCallback(audioDeviceCallback, new Handler(Looper.getMainLooper()));
            }
            audioManager.registerMediaButtonEventReceiver(new ComponentName(this, (Class<?>) VoIPMediaButtonReceiver.class));
            checkUpdateBluetoothHeadset();
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("error initializing voip controller", e);
            }
            callFailed();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (callIShouldHavePutIntoIntent == null) {
                NotificationsController.checkOtherNotificationsChannel();
                Notification.Builder showWhen = PipSource$$ExternalSyntheticApiModelOutline0.m(this, NotificationsController.OTHER_NOTIFICATIONS_CHANNEL).setContentTitle(LocaleController.getString(R.string.VoipCallEnded)).setShowWhen(false);
                showWhen.setSmallIcon(R.drawable.call);
                this.foregroundStarted = true;
                if (i < 33) {
                    this.foregroundId = 201;
                    Notification notificationBuild = showWhen.build();
                    this.foregroundNotification = notificationBuild;
                    startForeground(201, notificationBuild);
                    return;
                }
                this.foregroundId = 201;
                Notification notificationBuild2 = showWhen.build();
                this.foregroundNotification = notificationBuild2;
                int currentForegroundType = getCurrentForegroundType();
                this.lastForegroundType = currentForegroundType;
                startForeground(201, notificationBuild2, currentForegroundType);
                return;
            }
            NotificationsController.checkOtherNotificationsChannel();
            Notification.Builder showWhen2 = PipSource$$ExternalSyntheticApiModelOutline0.m(this, NotificationsController.OTHER_NOTIFICATIONS_CHANNEL).setContentTitle(LocaleController.getString(R.string.VoipOutgoingCall)).setShowWhen(false);
            if (this.groupCall != null) {
                showWhen2.setSmallIcon(isMicMute() ? R.drawable.voicechat_muted : R.drawable.voicechat_active);
            } else {
                showWhen2.setSmallIcon(R.drawable.call);
            }
            this.foregroundStarted = true;
            if (i < 33) {
                this.foregroundId = 201;
                Notification notificationBuild3 = showWhen2.build();
                this.foregroundNotification = notificationBuild3;
                startForeground(201, notificationBuild3);
                return;
            }
            this.foregroundId = 201;
            Notification notificationBuild4 = showWhen2.build();
            this.foregroundNotification = notificationBuild4;
            int currentForegroundType2 = getCurrentForegroundType();
            this.lastForegroundType = currentForegroundType2;
            startForeground(201, notificationBuild4, currentForegroundType2);
        }
    }

    @Override
    public void onDestroy() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("=============== VoIPService STOPPING ===============");
        }
        stopForeground(true);
        stopRinging();
        if (this.currentAccount >= 0) {
            if (ApplicationLoader.mainInterfacePaused || !ApplicationLoader.isScreenOn) {
                MessagesController.getInstance(this.currentAccount).ignoreSetOnline = false;
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.appDidLogout);
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
            Utilities.globalQueue.cancelRunnable(this.updateNotificationRunnable);
            this.updateNotificationRunnable = null;
        }
        Runnable runnable = this.switchingStreamTimeoutRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.switchingStreamTimeoutRunnable = null;
        }
        unregisterReceiver(this.receiver);
        Runnable runnable2 = this.timeoutRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.timeoutRunnable = null;
        }
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null) {
            conferenceCall.destroy();
        }
        super.onDestroy();
        sharedInstance = null;
        FileLog.e("(5) set sharedInstance = null");
        Arrays.fill(this.mySource, 0);
        cancelGroupCheckShortPoll();
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda54(7));
        if (this.tgVoip[0] != null) {
            StatsController.getInstance(this.currentAccount).incrementTotalCallsTime(getStatsNetworkType(), ((int) (getCallDuration() / 1000)) % 5);
            onTgVoipPreStop();
            if (this.tgVoip[0].isGroup()) {
                NativeInstance nativeInstance = this.tgVoip[0];
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                Objects.requireNonNull(nativeInstance);
                dispatchQueue.postRunnable(new VoIPService$1$$ExternalSyntheticLambda0(nativeInstance, 4));
                Iterator<java.util.Map.Entry<String, Integer>> it = this.currentStreamRequestTimestamp.entrySet().iterator();
                while (it.hasNext()) {
                    AccountInstance.getInstance(this.currentAccount).getConnectionsManager().cancelRequest(it.next().getValue().intValue(), true);
                }
                this.currentStreamRequestTimestamp.clear();
            } else {
                Instance.FinalState finalStateStop = this.tgVoip[0].stop();
                updateTrafficStats(this.tgVoip[0], finalStateStop.trafficStats);
                onTgVoipStop(finalStateStop);
            }
            this.prevTrafficStats = null;
            this.callStartTime = 0L;
            this.tgVoip[0] = null;
            Instance.destroyInstance();
        }
        destroyConverting();
        NativeInstance nativeInstance2 = this.tgVoip[1];
        if (nativeInstance2 != null) {
            Utilities.globalQueue.postRunnable(new VoIPService$1$$ExternalSyntheticLambda0(nativeInstance2, 4));
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
                    audioManager.stopBluetoothSco();
                    audioManager.setBluetoothScoOn(false);
                    voipAudioManager.setSpeakerphoneOn(false);
                    this.bluetoothScoActive = false;
                    this.bluetoothScoConnecting = false;
                }
                if (this.onDestroyRunnable == null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    VoIPService$1$$ExternalSyntheticLambda1 voIPService$1$$ExternalSyntheticLambda1 = new VoIPService$1$$ExternalSyntheticLambda1(audioManager, 1);
                    setModeRunnable = voIPService$1$$ExternalSyntheticLambda1;
                    dispatchQueue2.postRunnable(voIPService$1$$ExternalSyntheticLambda1);
                }
                audioManager.abandonAudioFocus(this);
            }
            try {
                audioManager.unregisterMediaButtonEventReceiver(new ComponentName(this, (Class<?>) VoIPMediaButtonReceiver.class));
            } catch (Exception e) {
                FileLog.e(e);
            }
            AudioDeviceCallback audioDeviceCallback = this.audioDeviceCallback;
            if (audioDeviceCallback != null) {
                audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
            }
            Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 3));
        }
        if (this.hasAudioFocus) {
            audioManager.abandonAudioFocus(this);
        }
        if (USE_CONNECTION_SERVICE) {
            if (!this.didDeleteConnectionServiceContact) {
                ContactsController.getInstance(this.currentAccount).deleteConnectionServiceContact();
            }
            CallConnection callConnection = this.systemCallConnection;
            if (callConnection != null && !this.playingSound) {
                callConnection.destroy();
            }
        }
        VoIPHelper.lastCallTime = SystemClock.elapsedRealtime();
        setSinks(null, null);
        Runnable runnable3 = this.onDestroyRunnable;
        if (runnable3 != null) {
            runnable3.run();
        }
        int i2 = this.currentAccount;
        if (i2 >= 0) {
            ConnectionsManager.getInstance(i2).setAppPaused(true, false);
            if (ChatObject.isChannel(this.chat)) {
                MessagesController.getInstance(this.currentAccount).startShortPoll(this.chat, this.classGuid, true);
            }
        }
    }

    public void onGroupCallParticipantsUpdate(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants) {
        ChatObject.Call call = this.groupCall;
        if (call == null || call.call.id != tL_updateGroupCallParticipants.call.id) {
            return;
        }
        call.shadyLeftParticipants.clear();
        this.groupCall.shadyJoinParticipants.clear();
        if (this.conference != null) {
            this.groupCall.processParticipantsUpdate(tL_updateGroupCallParticipants, false);
            this.conference.updateParticipants(this.groupCall.sortedParticipants, true);
            for (int i = 0; i < this.stateListeners.size(); i++) {
                this.stateListeners.get(i).onStateChanged(getCallState());
            }
            ChatObject.Call call2 = this.groupCall;
            call2.shadyLeftParticipants.addAll(this.conference.getShadyLeftParticipants(call2.sortedParticipants));
            ChatObject.Call call3 = this.groupCall;
            call3.shadyJoinParticipants.addAll(this.conference.getShadyJoiningParticipants(call3.sortedParticipants));
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, 0L, Long.valueOf(this.groupCall.call.id), Boolean.FALSE);
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
            } else if (MessageObject.getPeerId(groupCallParticipant.peer) != selfId) {
                continue;
            } else {
                int i6 = groupCallParticipant.source;
                int i7 = this.mySource[0];
                if (i6 != i7 && i7 != 0 && i6 != 0) {
                    if (BuildVars.LOGS_ENABLED) {
                        StringBuilder sb = new StringBuilder("source mismatch my = ");
                        sb.append(this.mySource[0]);
                        sb.append(" psrc = ");
                        ChatObject$Call$$ExternalSyntheticOutline0.m(sb, groupCallParticipant.source);
                    }
                    hangUp(2);
                    return;
                }
                if (ChatObject.isChannel(this.chat) && this.currentGroupModeStreaming && groupCallParticipant.can_self_unmute) {
                    this.switchingStream = true;
                    createGroupInstance(0, false, true);
                }
                if (groupCallParticipant.muted) {
                    setMicMute(true, false, false);
                }
            }
        }
    }

    public void onGroupCallUpdated(TLRPC.GroupCall groupCall) {
        boolean zOptBoolean;
        TLRPC.TL_dataJSON tL_dataJSON;
        ChatObject.Call call = this.groupCall;
        if (call != null) {
            TLRPC.GroupCall groupCall2 = call.call;
            if (groupCall2.id == groupCall.id) {
                if (groupCall2 instanceof TLRPC.TL_groupCallDiscarded) {
                    hangUp(2);
                    return;
                }
                boolean z = false;
                if (this.myParams != null) {
                    try {
                        zOptBoolean = new JSONObject(this.myParams.data).optBoolean("stream");
                    } catch (Exception e) {
                        FileLog.e(e);
                        zOptBoolean = false;
                    }
                } else {
                    zOptBoolean = false;
                }
                if (this.conference != null) {
                    this.groupCall.processGroupCallUpdate(groupCall);
                }
                if ((this.currentState == 1 || zOptBoolean != this.currentGroupModeStreaming) && (tL_dataJSON = this.myParams) != null) {
                    NativeInstance nativeInstance = this.tgVoip[0];
                    if (nativeInstance == null) {
                        this.lastGroupCallUpdate = groupCall;
                        return;
                    }
                    if (this.playedConnectedSound && zOptBoolean != this.currentGroupModeStreaming) {
                        this.switchingStream = true;
                    }
                    this.currentGroupModeStreaming = zOptBoolean;
                    try {
                        if (zOptBoolean) {
                            TLRPC.GroupCall groupCall3 = this.groupCall.call;
                            if (groupCall3 != null && groupCall3.rtmp_stream) {
                                z = true;
                            }
                            nativeInstance.prepareForStream(z);
                        } else {
                            nativeInstance.setJoinResponsePayload(tL_dataJSON.data);
                        }
                        dispatchStateChanged(2);
                        return;
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        return;
                    }
                }
                return;
            }
        }
        this.lastGroupCallUpdate = groupCall;
    }

    public void onMediaButtonEvent(KeyEvent keyEvent) {
        if (keyEvent == null) {
            return;
        }
        if ((keyEvent.getKeyCode() == 79 || keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 85) && keyEvent.getAction() == 1) {
            if (this.currentState == 15) {
                acceptIncomingCall();
            } else {
                setMicMute(!isMicMute(), false, true);
            }
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.lastSensorEvent = sensorEvent;
        if (this.unmutedByHold || this.remoteVideoState == 2 || this.videoState[0] == 2 || sensorEvent.sensor.getType() != 8) {
            return;
        }
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (this.audioRouteToSet != 0 || this.isHeadsetPlugged || voipAudioManager.isSpeakerphoneOn()) {
            return;
        }
        if (isBluetoothHeadsetConnected() && audioManager.isBluetoothScoOn()) {
            return;
        }
        boolean z = sensorEvent.values[0] < Math.min(sensorEvent.sensor.getMaximumRange(), 3.0f);
        checkIsNear(z);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.nearEarEvent, Boolean.valueOf(z));
    }

    @Override
    public void onSignalBarCountChanged(int i) {
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda56(this, i, 3));
    }

    public void onSignalingData(TL_update.TL_updatePhoneCallSignalingData tL_updatePhoneCallSignalingData) {
        NativeInstance nativeInstance;
        if (this.user == null || (nativeInstance = this.tgVoip[0]) == null || nativeInstance.isGroup() || getCallID() != tL_updatePhoneCallSignalingData.phone_call_id) {
            return;
        }
        this.tgVoip[0].onSignalingDataReceive(tL_updatePhoneCallSignalingData.data);
    }

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        if (sharedInstance != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Tried to start the VoIP service when it's already started");
            }
            return 2;
        }
        int intExtra = intent.getIntExtra("account", -1);
        this.currentAccount = intExtra;
        if (intExtra == -1) {
            throw new IllegalStateException("No account specified when starting VoIP service");
        }
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
            this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(longExtra));
        }
        if (longExtra2 != 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(longExtra2));
            this.chat = chat;
            if (ChatObject.isChannel(chat)) {
                MessagesController.getInstance(this.currentAccount).startShortPoll(this.chat, this.classGuid, false);
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
                    FileLog.e(e);
                }
            }
        }
        this.isHeadsetPlugged = ((AudioManager) getSystemService("audio")).isWiredHeadsetOn();
        if (this.chat != null && !this.createGroupCall && MessagesController.getInstance(this.currentAccount).getGroupCall(this.chat.id, false) == null) {
            FileLog.w("VoIPService: trying to open group call without call " + this.chat.id);
            stopSelf();
            return 2;
        }
        if (this.videoCall) {
            if (Build.VERSION.SDK_INT < 23 || checkSelfPermission("android.permission.CAMERA") == 0) {
                i3 = 0;
                this.captureDevice[0] = NativeInstance.createVideoCapturer(this.localSink[0], this.isFrontFaceCamera ? 1 : 0);
                if (longExtra2 != 0) {
                    this.videoState[0] = 1;
                } else {
                    this.videoState[0] = 2;
                }
            } else {
                i3 = 0;
                this.videoState[0] = 1;
            }
            if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                setAudioOutput(i3);
            }
        }
        if (this.user == null && this.chat == null && this.joinConference == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("VoIPService: user == null AND chat == null");
            }
            stopSelf();
            return 2;
        }
        sharedInstance = this;
        FileLog.e("(4) set sharedInstance = this");
        synchronized (sync) {
            try {
                if (setModeRunnable != null) {
                    Utilities.globalQueue.cancelRunnable(setModeRunnable);
                    setModeRunnable = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        VoIPGroupNotification.hide(this);
        if (this.joinConference != null) {
            if (!MessagesController.getGlobalMainSettings().getBoolean("callmiconstart", true)) {
                this.micMute = true;
            } else if (!PermissionRequest.hasPermission("android.permission.RECORD_AUDIO")) {
                this.micMute = true;
                PermissionRequest.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, new StarGiftSheet$$ExternalSyntheticLambda102(2, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$onStartCommand$1((Boolean) obj);
                    }
                }));
            }
            startConferenceGroupCall(false, 0, null, false);
            if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                setAudioOutput(0);
            }
        } else if (this.isOutgoing) {
            if (this.user != null) {
                dispatchStateChanged(14);
                if (USE_CONNECTION_SERVICE) {
                    TelecomManager telecomManager = (TelecomManager) getSystemService("telecom");
                    Bundle bundle = new Bundle();
                    Bundle bundle2 = new Bundle();
                    bundle.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", addAccountToTelecomManager());
                    bundle2.putInt("call_type", 1);
                    bundle.putBundle("android.telecom.extra.OUTGOING_CALL_EXTRAS", bundle2);
                    ContactsController contactsController = ContactsController.getInstance(this.currentAccount);
                    TLRPC.User user = this.user;
                    contactsController.createOrUpdateConnectionServiceContact(user.id, user.first_name, user.last_name);
                    telecomManager.placeCall(Uri.fromParts("tel", "+99084" + this.user.id, null), bundle);
                } else {
                    VoIPService$$ExternalSyntheticLambda82 voIPService$$ExternalSyntheticLambda82 = new VoIPService$$ExternalSyntheticLambda82(this, 0);
                    this.delayedStartOutgoingCall = voIPService$$ExternalSyntheticLambda82;
                    AndroidUtilities.runOnUIThread(voIPService$$ExternalSyntheticLambda82, 2000L);
                }
                z2 = false;
            } else {
                this.micMute = true;
                z2 = false;
                startGroupCall(0, null, false);
                if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                    setAudioOutput(0);
                }
            }
            if (intent.getBooleanExtra("start_incall_activity", z2)) {
                Intent intentAddFlags = new Intent(this, (Class<?>) LaunchActivity.class).setAction(this.user != null ? "voip" : "voip_chat").addFlags(268435456);
                if (this.chat != null) {
                    intentAddFlags.putExtra("currentAccount", this.currentAccount);
                }
                startActivity(intentAddFlags);
            }
        } else {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeInCallActivity, new Object[0]);
            TL_phone.PhoneCall phoneCall = callIShouldHavePutIntoIntent;
            this.privateCall = phoneCall;
            boolean z3 = phoneCall != null && phoneCall.video;
            this.videoCall = z3;
            if (z3) {
                this.isVideoAvailable = true;
            }
            if (!z3 || this.isBtHeadsetConnected || this.isHeadsetPlugged) {
                z = false;
            } else {
                z = false;
                setAudioOutput(0);
            }
            callIShouldHavePutIntoIntent = null;
            FileLog.e("(3) set VoIPService.callIShouldHavePutIntoIntent = null");
            if (this.instantAccept) {
                this.instantAccept = z;
                acceptIncomingCall();
            } else if (USE_CONNECTION_SERVICE) {
                acknowledgeCall(z);
                showNotification();
            } else {
                acknowledgeCall(true);
            }
            if (booleanExtra) {
                Activity activityFindActivity = AndroidUtilities.findActivity(this);
                if (activityFindActivity == null) {
                    activityFindActivity = LaunchActivity.instance;
                }
                if (activityFindActivity == null) {
                    activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                }
                if (activityFindActivity != null) {
                    VoIPFragment.show(activityFindActivity, this.currentAccount);
                }
            }
        }
        initializeAccountRelatedThings();
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda82(this, 1));
        return 2;
    }

    public void playAllowTalkSound() {
        Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 10));
    }

    public void playConnectedSound() {
        Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 8));
        this.playedConnectedSound = true;
    }

    public void playStartRecordSound() {
        Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 9));
    }

    public void processMessageUpdate(MessageObject messageObject) {
        TLRPC.Message message;
        ChatObject.Call.InvitedUser invitedUser;
        if (messageObject == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id = messageObject.getId();
        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageObject.messageOwner.action;
        ChatObject.Call call = this.groupCall;
        if (call == null || (invitedUser = call.invitedUsersMessageIds.get(Long.valueOf(dialogId))) == null || invitedUser.msg_id != id) {
            return;
        }
        boolean z = (tL_messageActionConferenceCall.missed || tL_messageActionConferenceCall.active) ? false : true;
        if (invitedUser.isCalling() != z) {
            invitedUser.calling = z;
            this.groupCall.invitedUsersMessageIds.put(Long.valueOf(dialogId), invitedUser);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, 0L, Long.valueOf(this.groupCall.call.id), Boolean.FALSE);
        }
    }

    public void registerStateListener(StateListener stateListener) {
        if (this.stateListeners.contains(stateListener)) {
            return;
        }
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

    public void removeRemoteSink(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        if (z) {
            ProxyVideoSink proxyVideoSinkRemove = this.remoteSinks.remove(groupCallParticipant.presentationEndpoint);
            if (proxyVideoSinkRemove != null) {
                this.tgVoip[0].removeIncomingVideoOutput(proxyVideoSinkRemove.nativeInstance);
                return;
            }
            return;
        }
        ProxyVideoSink proxyVideoSinkRemove2 = this.remoteSinks.remove(groupCallParticipant.videoEndpoint);
        if (proxyVideoSinkRemove2 != null) {
            this.tgVoip[0].removeIncomingVideoOutput(proxyVideoSinkRemove2.nativeInstance);
        }
    }

    public void requestFullScreen(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, boolean z2) {
        String str = z2 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
        if (str == null) {
            return;
        }
        if (z) {
            this.tgVoip[0].setVideoEndpointQuality(str, 2);
        } else {
            this.tgVoip[0].setVideoEndpointQuality(str, 1);
        }
    }

    public void requestVideoCall(boolean z) {
        int i = 0;
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            return;
        }
        if (z) {
            ProxyVideoSink proxyVideoSink = this.localSink[0];
            if (z) {
                i = 2;
            } else if (this.isFrontFaceCamera) {
                i = 1;
            }
            nativeInstance.setupOutgoingVideo(proxyVideoSink, i);
        } else {
            long j = this.captureDevice[0];
            if (j != 0) {
                nativeInstance.setupOutgoingVideoCreated(j);
                this.destroyCaptureDevice[0] = false;
            } else {
                ProxyVideoSink proxyVideoSink2 = this.localSink[0];
                if (z) {
                    i = 2;
                } else if (this.isFrontFaceCamera) {
                    i = 1;
                }
                nativeInstance.setupOutgoingVideo(proxyVideoSink2, i);
            }
        }
        this.isPrivateScreencast = z;
    }

    public void sendCallRating(int i) {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        long j = phoneCall.id;
        long j2 = phoneCall.access_hash;
        int i2 = this.currentAccount;
        int i3 = UserConfig.selectedAccount;
        TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
        setcallrating.rating = i;
        setcallrating.comment = "";
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        setcallrating.peer = tL_inputPhoneCall;
        tL_inputPhoneCall.access_hash = j2;
        tL_inputPhoneCall.id = j;
        setcallrating.user_initiative = false;
        ConnectionsManager.getInstance(i2).sendRequest(setcallrating, new Theme$$ExternalSyntheticLambda9(i3, 3));
    }

    public void setAudioOutput(int i) {
        CallConnection callConnection;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("setAudioOutput " + i);
        }
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        boolean z = USE_CONNECTION_SERVICE;
        int i2 = 0;
        if (!z || (callConnection = this.systemCallConnection) == null) {
            if (this.audioConfigured && !z) {
                if (i == 0) {
                    this.needSwitchToBluetoothAfterScoActivates = false;
                    if (this.bluetoothScoActive || this.bluetoothScoConnecting) {
                        audioManager.stopBluetoothSco();
                        this.bluetoothScoActive = false;
                        this.bluetoothScoConnecting = false;
                    }
                    audioManager.setBluetoothScoOn(false);
                    voipAudioManager.setSpeakerphoneOn(true);
                    this.audioRouteToSet = 1;
                } else if (i == 1) {
                    this.needSwitchToBluetoothAfterScoActivates = false;
                    if (this.bluetoothScoActive || this.bluetoothScoConnecting) {
                        audioManager.stopBluetoothSco();
                        this.bluetoothScoActive = false;
                        this.bluetoothScoConnecting = false;
                    }
                    voipAudioManager.setSpeakerphoneOn(false);
                    audioManager.setBluetoothScoOn(false);
                    this.audioRouteToSet = 0;
                } else if (i == 2) {
                    if (this.bluetoothScoActive) {
                        audioManager.setBluetoothScoOn(true);
                        voipAudioManager.setSpeakerphoneOn(false);
                    } else {
                        this.needSwitchToBluetoothAfterScoActivates = true;
                        try {
                            audioManager.startBluetoothSco();
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                    this.audioRouteToSet = 2;
                }
                updateOutputGainControlState();
            } else if (i == 0) {
                this.audioRouteToSet = 1;
                this.speakerphoneStateToSet = true;
            } else if (i == 1) {
                this.audioRouteToSet = 0;
                this.speakerphoneStateToSet = false;
            } else if (i == 2) {
                this.audioRouteToSet = 2;
                this.speakerphoneStateToSet = false;
            }
        } else if (i == 0) {
            callConnection.setAudioRoute(8);
        } else if (i == 1) {
            callConnection.setAudioRoute(5);
        } else if (i == 2) {
            callConnection.setAudioRoute(2);
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
        if (!this.currentGroupModeStreaming || TextUtils.isEmpty(str) || str.equals(this.joinHash)) {
            return;
        }
        this.joinHash = str;
        createGroupInstance(0, false, true);
    }

    public void setGroupCallPeer(TLRPC.InputPeer inputPeer) {
        ChatObject.Call call = this.groupCall;
        if (call == null) {
            return;
        }
        this.groupCallPeer = inputPeer;
        call.setSelfPeer(inputPeer);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.groupCall.chatId);
        if (chatFull != null) {
            TLRPC.Peer peer = this.groupCall.selfPeer;
            chatFull.groupcall_default_join_as = peer;
            if (peer != null) {
                if (chatFull instanceof TLRPC.TL_chatFull) {
                    chatFull.flags |= 32768;
                } else {
                    chatFull.flags |= 67108864;
                }
            } else if (chatFull instanceof TLRPC.TL_chatFull) {
                chatFull.flags &= -32769;
            } else {
                chatFull.flags &= -67108865;
            }
        }
        createGroupInstance(0, true, true);
        if (this.videoState[1] == 2) {
            createGroupInstance(1, true, true);
        }
    }

    public void setLocalSink(VideoSink videoSink, boolean z) {
        if (z) {
            return;
        }
        this.localSink[0].setTarget(videoSink);
    }

    public void setMicMute(boolean z, boolean z2, boolean z3) {
        VoIPService voIPService;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (this.micMute == z || this.micSwitching) {
            return;
        }
        this.micMute = z;
        ChatObject.Call call = this.groupCall;
        if (call == null) {
            voIPService = this;
        } else {
            if (!z3 && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(getSelfId())) != null && groupCallParticipant.muted && !groupCallParticipant.can_self_unmute) {
                z3 = true;
            }
            if (z3) {
                voIPService = this;
                voIPService.editCallMember(UserConfig.getInstance(this.currentAccount).getCurrentUser(), Boolean.valueOf(z), null, null, null, null);
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                VoIPService$$ExternalSyntheticLambda46 voIPService$$ExternalSyntheticLambda46 = new VoIPService$$ExternalSyntheticLambda46(this, 22);
                voIPService.updateNotificationRunnable = voIPService$$ExternalSyntheticLambda46;
                dispatchQueue.postRunnable(voIPService$$ExternalSyntheticLambda46);
            } else {
                voIPService = this;
            }
        }
        int i = 0;
        voIPService.unmutedByHold = !voIPService.micMute && z2;
        NativeInstance nativeInstance = voIPService.convertingVoip;
        if (nativeInstance != null) {
            nativeInstance.setMuteMicrophone(z);
        } else {
            NativeInstance nativeInstance2 = voIPService.tgVoip[0];
            if (nativeInstance2 != null) {
                nativeInstance2.setMuteMicrophone(z);
            }
        }
        ArrayList<StateListener> arrayList = voIPService.stateListeners;
        int size = arrayList.size();
        while (i < size) {
            StateListener stateListener = arrayList.get(i);
            i++;
            stateListener.onAudioSettingsChanged();
        }
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
        double d = ((double) i) / 10000.0d;
        this.tgVoip[0].setVolume(groupCallParticipant.source, d);
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.presentation;
        if (tL_groupCallParticipantVideo == null || (i2 = tL_groupCallParticipantVideo.audio_source) == 0) {
            return;
        }
        this.tgVoip[0].setVolume(i2, d);
    }

    public void setParticipantsVolume() {
        if (this.tgVoip[0] != null) {
            int size = this.groupCall.participants.size();
            for (int i = 0; i < size; i++) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.groupCall.participants.valueAt(i);
                if (!groupCallParticipant.self && groupCallParticipant.source != 0 && (groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
                    if (groupCallParticipant.muted_by_you) {
                        setParticipantVolume(groupCallParticipant, 0);
                    } else {
                        setParticipantVolume(groupCallParticipant, ChatObject.getParticipantVolume(groupCallParticipant));
                    }
                }
            }
        }
    }

    public void setRemoteSink(VideoSink videoSink, boolean z) {
        this.remoteSink[z ? 1 : 0].setTarget(videoSink);
    }

    public void setSinks(VideoSink videoSink, VideoSink videoSink2) {
        setSinks(videoSink, false, videoSink2);
    }

    public void setSwitchingCamera(boolean z, boolean z2) {
        this.switchingCamera = z;
        if (z) {
            return;
        }
        this.isFrontFaceCamera = z2;
        for (int i = 0; i < this.stateListeners.size(); i++) {
            this.stateListeners.get(i).onCameraSwitch(this.isFrontFaceCamera);
        }
    }

    public void setVideoState(boolean z, int i) {
        int i2;
        int i3 = 0;
        char c = this.groupCall != null ? z ? 1 : 0 : (char) 0;
        NativeInstance nativeInstance = this.tgVoip[c];
        if (nativeInstance != null) {
            this.videoState[c] = i;
            nativeInstance.setVideoState(i);
            long j = this.captureDevice[z ? 1 : 0];
            if (j != 0) {
                NativeInstance.setVideoStateCapturer(j, this.videoState[c]);
            }
            if (z) {
                return;
            }
            if (this.groupCall != null) {
                editCallMember(UserConfig.getInstance(this.currentAccount).getCurrentUser(), null, Boolean.valueOf(this.videoState[0] != 2), null, null, null);
            }
            checkIsNear();
            return;
        }
        long[] jArr = this.captureDevice;
        long j2 = jArr[z ? 1 : 0];
        if (j2 != 0) {
            this.videoState[c] = i;
            NativeInstance.setVideoStateCapturer(j2, i);
            return;
        }
        if (i != 2 || (i2 = this.currentState) == 17 || i2 == 11) {
            return;
        }
        ProxyVideoSink proxyVideoSink = this.localSink[c];
        if (z) {
            i3 = 2;
        } else if (this.isFrontFaceCamera) {
            i3 = 1;
        }
        jArr[z ? 1 : 0] = NativeInstance.createVideoCapturer(proxyVideoSink, i3);
        this.videoState[c] = 2;
    }

    public void setupCaptureDevice(boolean z, boolean z2) {
        NativeInstance nativeInstance;
        if (!z) {
            long j = this.captureDevice[z ? 1 : 0];
            if (j == 0 || (nativeInstance = this.tgVoip[z ? 1 : 0]) == null) {
                return;
            }
            nativeInstance.setupOutgoingVideoCreated(j);
            this.destroyCaptureDevice[z ? 1 : 0] = false;
            this.videoState[z ? 1 : 0] = 2;
        }
        if (this.micMute == z2) {
            setMicMute(!z2, false, false);
            this.micSwitching = true;
        }
        if (this.groupCall != null) {
            editCallMember(UserConfig.getInstance(this.currentAccount).getCurrentUser(), Boolean.valueOf(!z2), Boolean.valueOf(this.videoState[0] != 2), null, null, new VoIPService$$ExternalSyntheticLambda46(this, 28));
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
            } catch (Throwable th) {
                throw th;
            }
        }
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
            this.vibrator = null;
        }
    }

    public void stopScreenCapture() {
        if (this.groupCall == null || this.videoState[1] != 2) {
            return;
        }
        TL_phone.leaveGroupCallPresentation leavegroupcallpresentation = new TL_phone.leaveGroupCallPresentation();
        leavegroupcallpresentation.call = this.groupCall.getInputGroupCall();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcallpresentation, new VoIPService$$ExternalSyntheticLambda74(this, 2));
        NativeInstance nativeInstance = this.tgVoip[1];
        if (nativeInstance != null) {
            Utilities.globalQueue.postRunnable(new VoIPService$1$$ExternalSyntheticLambda0(nativeInstance, 4));
        }
        this.mySource[1] = 0;
        this.tgVoip[1] = null;
        this.destroyCaptureDevice[1] = true;
        this.captureDevice[1] = 0;
        this.videoState[1] = 0;
        AccountInstance.getInstance(this.currentAccount).getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallScreencastStateChanged, new Object[0]);
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
        if (j == 0 || this.switchingCamera) {
            return;
        }
        NativeInstance.switchCameraCapturer(j, !this.isFrontFaceCamera);
    }

    public void switchToSpeaker() {
        AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda46(this, 23), 500L);
    }

    public void toggleSpeakerphoneOrShowRouteSheet(Context context, boolean z) {
        toggleSpeakerphoneOrShowRouteSheet(context, z, null);
    }

    public void unregisterStateListener(StateListener stateListener) {
        this.stateListeners.remove(stateListener);
    }

    public void updateCurrentForegroundType() {
        if (this.lastForegroundType == getCurrentForegroundType() || !this.foregroundStarted) {
            return;
        }
        stopForeground(true);
        if (Build.VERSION.SDK_INT < 33) {
            startForeground(this.foregroundId, this.foregroundNotification);
            return;
        }
        int i = this.foregroundId;
        Notification notification = this.foregroundNotification;
        int currentForegroundType = getCurrentForegroundType();
        this.lastForegroundType = currentForegroundType;
        startForeground(i, notification, currentForegroundType);
    }

    public void updateOutputGainControlState() {
        hasRtmpStream();
    }

    private void callFailed(String str) {
        CallConnection callConnection;
        if (this.privateCall != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("Discarding failed call");
            }
            TL_phone.discardCall discardcall = new TL_phone.discardCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            discardcall.peer = tL_inputPhoneCall;
            TL_phone.PhoneCall phoneCall = this.privateCall;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            tL_inputPhoneCall.id = phoneCall.id;
            discardcall.duration = (int) (getCallDuration() / 1000);
            NativeInstance nativeInstance = this.tgVoip[0];
            discardcall.connection_id = nativeInstance != null ? nativeInstance.getPreferredRelayId() : 0L;
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonDisconnect();
            FileLog.e("discardCall " + discardcall.reason);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new VoIPService$$ExternalSyntheticLambda130(1));
        }
        try {
            throw new Exception("Call " + getCallID() + " failed with error: " + str);
        } catch (Exception e) {
            FileLog.e(e);
            this.lastError = str;
            AndroidUtilities.runOnUIThread(new VoIPService$$ExternalSyntheticLambda46(this, 12));
            if (TextUtils.equals(str, "ERROR_LOCALIZED") && this.soundPool != null) {
                this.playingSound = true;
                Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda46(this, 13));
                AndroidUtilities.runOnUIThread(this.afterSoundRunnable, 1000L);
            }
            if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null) {
                callConnection.setDisconnected(VoIPService$$ExternalSyntheticApiModelOutline2.m$2());
                this.systemCallConnection.destroy();
                this.systemCallConnection = null;
            }
            stopSelf();
        }
    }

    private static int getCurrentForegroundType(ContextWrapper contextWrapper, boolean z) {
        if (Build.VERSION.SDK_INT < 29) {
            return 226;
        }
        int i = contextWrapper.checkSelfPermission("android.permission.CAMERA") == 0 ? 64 : 0;
        if (contextWrapper.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            i |= 128;
        }
        if (z) {
            i |= 32;
        }
        return i | 2;
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

    public void toggleSpeakerphoneOrShowRouteSheet(Context context, boolean z, Integer num) {
        CallConnection callConnection;
        int i = 0;
        if (isBluetoothHeadsetConnected() && hasEarpiece()) {
            BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, null, false, false);
            bottomSheetM.title = LocaleController.getString(R.string.VoipOutputDevices);
            bottomSheetM.bigTitle = true;
            bottomSheetM.selectedPos = num;
            bottomSheetM.cellType = num != null ? 4 : 0;
            String string = LocaleController.getString(R.string.VoipAudioRoutingSpeaker);
            String string2 = LocaleController.getString(this.isHeadsetPlugged ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingEarpiece);
            String string3 = this.currentBluetoothDeviceName;
            if (string3 == null) {
                string3 = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
            }
            CharSequence[] charSequenceArr = {string, string2, string3};
            int[] iArr = {R.drawable.msg_call_speaker, this.isHeadsetPlugged ? R.drawable.calls_menu_headset : R.drawable.msg_call_earpiece, R.drawable.msg_call_bluetooth};
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f$0.lambda$toggleSpeakerphoneOrShowRouteSheet$93(dialogInterface, i2);
                }
            };
            bottomSheetM.items = charSequenceArr;
            bottomSheetM.itemIcons = iArr;
            bottomSheetM.onClickListener = onClickListener;
            bottomSheetM.setOnShowListener(new VoIPService$$ExternalSyntheticLambda137(bottomSheetM, num, i));
            if (z) {
                if (Build.VERSION.SDK_INT >= 26) {
                    bottomSheetM.getWindow().setType(2038);
                } else {
                    bottomSheetM.getWindow().setType(2003);
                }
            }
            bottomSheetM.show();
            return;
        }
        boolean z2 = USE_CONNECTION_SERVICE;
        if (z2 && (callConnection = this.systemCallConnection) != null && callConnection.getCallAudioState() != null) {
            if (hasEarpiece()) {
                CallConnection callConnection2 = this.systemCallConnection;
                callConnection2.setAudioRoute(callConnection2.getCallAudioState().getRoute() != 8 ? 8 : 5);
            } else {
                CallConnection callConnection3 = this.systemCallConnection;
                callConnection3.setAudioRoute(callConnection3.getCallAudioState().getRoute() == 2 ? 5 : 2);
            }
        } else {
            if (this.audioConfigured && !z2) {
                AudioManager audioManager = (AudioManager) getSystemService("audio");
                VoipAudioManager voipAudioManager = VoipAudioManager.get();
                if (hasEarpiece()) {
                    voipAudioManager.setSpeakerphoneOn(!voipAudioManager.isSpeakerphoneOn());
                } else {
                    audioManager.setBluetoothScoOn(!audioManager.isBluetoothScoOn());
                }
                voipAudioManager.isBluetoothAndSpeakerOnAsync(new VoIPService$$ExternalSyntheticLambda138(this, i));
                return;
            }
            this.speakerphoneStateToSet = !this.speakerphoneStateToSet;
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i < size) {
            StateListener stateListener = arrayList.get(i);
            i++;
            stateListener.onAudioSettingsChanged();
        }
    }

    private void checkIsNear(boolean z) {
        if (z != this.isProximityNear) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("proximity " + z);
            }
            this.isProximityNear = z;
            try {
                if (z) {
                    this.proximityWakelock.acquire();
                } else {
                    this.proximityWakelock.release(1);
                }
            } catch (Exception e) {
                FileLog.e(e);
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
        tL_inputPhoneCall.id = phoneCall.id;
        sendsignalingdata.data = bArr;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendsignalingdata, null);
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

    public interface StateListener {
        void onAudioSettingsChanged();

        void onCameraFirstFrameAvailable();

        void onCameraSwitch(boolean z);

        void onMediaStateUpdated(int i, int i2);

        void onScreenOnChange(boolean z);

        void onSignalBarsCountChanged(int i);

        void onStateChanged(int i);

        void onVideoAvailableChange(boolean z);

        public abstract class CC {
            public static void $default$onAudioSettingsChanged(StateListener stateListener) {
            }

            public static void $default$onCameraFirstFrameAvailable(StateListener stateListener) {
            }

            public static void $default$onCameraSwitch(StateListener stateListener, boolean z) {
            }

            public static void $default$onScreenOnChange(StateListener stateListener, boolean z) {
            }

            public static void $default$onSignalBarsCountChanged(StateListener stateListener, int i) {
            }

            public static void $default$onStateChanged(StateListener stateListener, int i) {
            }

            public static void $default$onVideoAvailableChange(StateListener stateListener, boolean z) {
            }

            public static void $default$onMediaStateUpdated(StateListener stateListener, int i, int i2) {
            }
        }
    }

    @Override
    public void declineIncomingCall() {
        declineIncomingCall(1, null);
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
