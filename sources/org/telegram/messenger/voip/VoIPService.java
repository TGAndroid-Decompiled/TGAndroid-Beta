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
import com.google.android.gms.cast.framework.media.internal.zzo$$ExternalSyntheticApiModelOutline2;
import com.google.android.search.verification.client.SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2;
import com.microsoft.appcenter.distribute.Distribute$$ExternalSyntheticApiModelOutline0;
import com.microsoft.appcenter.distribute.Distribute$$ExternalSyntheticApiModelOutline1;
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
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.StatsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
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
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.DarkBlueThemeResourcesProvider;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.VoIPFeedbackActivity;
import org.telegram.ui.VoIPFragment;
import org.telegram.ui.VoIPPermissionActivity;
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
        public void onServiceDisconnected(int i) {
        }

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
                if (!VoIPService.this.isHeadsetPlugged) {
                    if (VoIPService.this.previousAudioOutput >= 0) {
                        VoIPService voIPService = VoIPService.this;
                        voIPService.setAudioOutput(voIPService.previousAudioOutput);
                        VoIPService.this.previousAudioOutput = -1;
                    }
                } else {
                    AudioManager audioManager = (AudioManager) VoIPService.this.getSystemService("audio");
                    if (VoipAudioManager.get().isSpeakerphoneOn()) {
                        VoIPService.this.previousAudioOutput = 0;
                    } else if (audioManager.isBluetoothScoOn()) {
                        VoIPService.this.previousAudioOutput = 2;
                    } else {
                        VoIPService.this.previousAudioOutput = 1;
                    }
                    VoIPService.this.setAudioOutput(1);
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
            if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
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
                return;
            }
            if ("android.intent.action.PHONE_STATE".equals(intent.getAction())) {
                if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(intent.getStringExtra("state"))) {
                    VoIPService.this.hangUp();
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
    private final Runnable destroyConvertingRunnable = new Runnable() {
        @Override
        public final void run() {
            this.f$0.destroyConverting();
        }
    };

    public static class SharedUIParams {
        public boolean cameraAlertWasShowed;
        public boolean tapToVideoTooltipWasShowed;
        public boolean wasVideoCall;
    }

    public interface StateListener {

        public abstract class CC {
            public static void $default$onAudioSettingsChanged(StateListener stateListener) {
            }

            public static void $default$onCameraFirstFrameAvailable(StateListener stateListener) {
            }

            public static void $default$onCameraSwitch(StateListener stateListener, boolean z) {
            }

            public static void $default$onMediaStateUpdated(StateListener stateListener, int i, int i2) {
            }

            public static void $default$onScreenOnChange(StateListener stateListener, boolean z) {
            }

            public static void $default$onSignalBarsCountChanged(StateListener stateListener, int i) {
            }

            public static void $default$onStateChanged(StateListener stateListener, int i) {
            }

            public static void $default$onVideoAvailableChange(StateListener stateListener, boolean z) {
            }
        }

        void onAudioSettingsChanged();

        void onCameraFirstFrameAvailable();

        void onCameraSwitch(boolean z);

        void onMediaStateUpdated(int i, int i2);

        void onScreenOnChange(boolean z);

        void onSignalBarsCountChanged(int i);

        void onStateChanged(int i);

        void onVideoAvailableChange(boolean z);
    }

    public static void $r8$lambda$ihf_TgQlMZ9hVpHd61S65tYUha4(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    private static boolean isDeviceCompatibleWithConnectionServiceAPI() {
        return false;
    }

    private void onTgVoipPreStop() {
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public TL_phone.PhoneCall getPrivateCall() {
        return this.privateCall;
    }

    public boolean isConverting() {
        return this.convertingVoip != null;
    }

    @Override
    public boolean isConference() {
        return (this.joinConference == null && this.conference == null) ? false : true;
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
    public TLRPC.GroupCall getGroupCall() {
        ChatObject.Call call = this.groupCall;
        if (call != null) {
            return call.call;
        }
        return null;
    }

    @Override
    public ArrayList<TLRPC.GroupCallParticipant> getGroupParticipants() {
        ChatObject.Call call = this.groupCall;
        if (call != null) {
            return call.sortedParticipants;
        }
        return null;
    }

    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override
        public void run() {
            final AudioManager audioManager = (AudioManager) VoIPService.this.getSystemService("audio");
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
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.this.soundPool.release();
                }
            });
            Utilities.globalQueue.postRunnable(VoIPService.setModeRunnable = new Runnable() {
                @Override
                public final void run() {
                    VoIPService.AnonymousClass1.$r8$lambda$qXIvjgGbxhfIMsMFKKrqpX5Uls4(audioManager);
                }
            });
        }

        public static void $r8$lambda$qXIvjgGbxhfIMsMFKKrqpX5Uls4(AudioManager audioManager) {
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
    }

    public CountDownLatch getGroupCallBottomSheetLatch() {
        return this.groupCallBottomSheetLatch;
    }

    public boolean isFrontFaceCamera() {
        return this.isFrontFaceCamera;
    }

    public boolean isScreencast() {
        return this.isPrivateScreencast;
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
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        VoIPService.$r8$lambda$CUMq4QoVuVOrSqQ908rYgL1cdho(this.f$0);
                    }
                };
                voIPService.updateNotificationRunnable = runnable;
                dispatchQueue.postRunnable(runnable);
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

    public static void $r8$lambda$CUMq4QoVuVOrSqQ908rYgL1cdho(VoIPService voIPService) {
        if (voIPService.updateNotificationRunnable == null) {
            return;
        }
        voIPService.updateNotificationRunnable = null;
        voIPService.showNotification(voIPService.getTitle(), getRoundAvatarBitmap(voIPService, voIPService.currentAccount, voIPService.chat));
    }

    public String getTitle() {
        TLRPC.User user = this.user;
        if (user != null) {
            return ContactsController.formatName(user.first_name, user.last_name);
        }
        TLRPC.Chat chat = this.chat;
        return chat != null ? chat.title : "";
    }

    public boolean mutedByAdmin() {
        ChatObject.Call call = this.groupCall;
        if (call == null) {
            return false;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(getSelfId());
        return (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(this.chat)) ? false : true;
    }

    public boolean hasVideoCapturer() {
        return this.captureDevice[0] != 0;
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

    class AnonymousClass5 implements VideoSink {
        final String val$endpointId;
        final boolean val$screencast;

        @Override
        public void setParentSink(VideoSink videoSink) {
            VideoSink.CC.$default$setParentSink(this, videoSink);
        }

        AnonymousClass5(String str, boolean z) {
            this.val$endpointId = str;
            this.val$screencast = z;
        }

        @Override
        public void onFrame(VideoFrame videoFrame) {
            if (videoFrame == null || videoFrame.getBuffer().getHeight() == 0 || videoFrame.getBuffer().getWidth() == 0) {
                return;
            }
            final String str = this.val$endpointId;
            final boolean z = this.val$screencast;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.AnonymousClass5.$r8$lambda$OAfTa4mQrq6CSL_n8fpQuzyfsdY(this.f$0, str, this, z);
                }
            });
        }

        public static void $r8$lambda$OAfTa4mQrq6CSL_n8fpQuzyfsdY(AnonymousClass5 anonymousClass5, String str, VideoSink videoSink, boolean z) {
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
    }

    public void clearRemoteSinks() {
        this.proxyVideoSinkLruCache.evictAll();
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

    public static class ProxyVideoSink implements VideoSink {
        private VideoSink background;
        private long nativeInstance;
        private VideoSink target;

        @Override
        public void setParentSink(VideoSink videoSink) {
            VideoSink.CC.$default$setParentSink(this, videoSink);
        }

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

        public synchronized void removeTarget(VideoSink videoSink) {
            if (this.target == videoSink) {
                this.target = null;
            }
        }

        public synchronized void removeBackground(VideoSink videoSink) {
            if (this.background == videoSink) {
                this.background = null;
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
                PermissionRequest.requestPermission("android.permission.RECORD_AUDIO", new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        VoIPService.$r8$lambda$aef9Uq7UfFgK11aCMJzOYS1esa0(this.f$0, (Boolean) obj);
                    }
                });
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
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            VoIPService.m1205$r8$lambda$eg6hqgUuQp7vrwttFzaqgsYk2s(this.f$0);
                        }
                    };
                    this.delayedStartOutgoingCall = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 2000L);
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
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.closeInCallActivity, new Object[0]);
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
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationCenter.getInstance(this.f$0.currentAccount).postNotificationName(NotificationCenter.voipServiceCreated, new Object[0]);
            }
        });
        return 2;
    }

    public static void $r8$lambda$aef9Uq7UfFgK11aCMJzOYS1esa0(VoIPService voIPService, Boolean bool) {
        voIPService.getClass();
        if (sharedInstance != null && bool.booleanValue()) {
            voIPService.setMicMute(false, false, true);
        }
    }

    public static void m1205$r8$lambda$eg6hqgUuQp7vrwttFzaqgsYk2s(VoIPService voIPService) {
        voIPService.delayedStartOutgoingCall = null;
        voIPService.startOutgoingCall();
    }

    public static boolean hasRtmpStream() {
        return (getSharedInstance() == null || getSharedInstance().groupCall == null || !getSharedInstance().groupCall.call.rtmp_stream) ? false : true;
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

    public static VoIPService getSharedInstance() {
        return sharedInstance;
    }

    @Override
    public TLRPC.User getUser() {
        return this.user;
    }

    public TLRPC.Chat getChat() {
        return this.chat;
    }

    public void setNoiseSupressionEnabled(boolean z) {
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            return;
        }
        nativeInstance.setNoiseSuppressionEnabled(z);
    }

    public void setGroupCallHash(String str) {
        if (!this.currentGroupModeStreaming || TextUtils.isEmpty(str) || str.equals(this.joinHash)) {
            return;
        }
        this.joinHash = str;
        createGroupInstance(0, false, true);
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

    public void hangUp(int i, Runnable runnable) {
        TLRPC.ChatFull chatFull;
        int i2 = this.currentState;
        declineIncomingCall((i2 == 16 || (i2 == 13 && this.isOutgoing)) ? 3 : 1, runnable);
        if (this.groupCall == null || i == 2) {
            return;
        }
        if (i == 1) {
            if (this.chat != null && (chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.chat.id)) != null) {
                chatFull.flags &= -2097153;
                chatFull.call = null;
                NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(this.chat.id), Long.valueOf(this.groupCall.call.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            discardgroupcall.call = this.groupCall.getInputGroupCall();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardgroupcall, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    VoIPService.$r8$lambda$TOhpnlKEPeRi7Fwe55d8khsWkik(this.f$0, tLObject, tL_error);
                }
            });
            return;
        }
        TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
        leavegroupcall.call = this.groupCall.getInputGroupCall();
        leavegroupcall.source = this.mySource[0];
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPService.$r8$lambda$avuG61nD21Yh4Hdfwhuam9iVCD4(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$TOhpnlKEPeRi7Fwe55d8khsWkik(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        voIPService.getClass();
        if (tLObject instanceof TLRPC.TL_updates) {
            MessagesController.getInstance(voIPService.currentAccount).processUpdates((TLRPC.TL_updates) tLObject, false);
        }
    }

    public static void $r8$lambda$avuG61nD21Yh4Hdfwhuam9iVCD4(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        voIPService.getClass();
        if (tLObject instanceof TLRPC.TL_updates) {
            MessagesController.getInstance(voIPService.currentAccount).processUpdates((TLRPC.TL_updates) tLObject, false);
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
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didStartedCall, new Object[0]);
            }
        });
        Utilities.random.nextBytes(new byte[256]);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        tL_messages_getDhConfig.version = messagesStorage.getLastSecretVersion();
        this.callReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDhConfig, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPService.$r8$lambda$YSogniXj0mXYiwwcuVv7Wq73C_w(this.f$0, messagesStorage, tLObject, tL_error);
            }
        }, 65536);
    }

    public static void $r8$lambda$YSogniXj0mXYiwwcuVv7Wq73C_w(final VoIPService voIPService, MessagesStorage messagesStorage, TLObject tLObject, TLRPC.TL_error tL_error) {
        voIPService.callReqId = 0;
        if (voIPService.endCallAfterRequest) {
            voIPService.callEnded();
            return;
        }
        if (tL_error == null) {
            TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
            if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                if (!Utilities.isGoodPrime(messages_dhconfig.p, messages_dhconfig.g)) {
                    voIPService.callFailed();
                    return;
                }
                messagesStorage.setSecretPBytes(messages_dhconfig.p);
                messagesStorage.setSecretG(messages_dhconfig.g);
                messagesStorage.setLastSecretVersion(messages_dhconfig.version);
                messagesStorage.saveSecretParams(messagesStorage.getLastSecretVersion(), messagesStorage.getSecretG(), messagesStorage.getSecretPBytes());
            }
            final byte[] bArr = new byte[256];
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
            requestcall.user_id = MessagesController.getInstance(voIPService.currentAccount).getInputUser(voIPService.user);
            TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol = new TL_phone.TL_phoneCallProtocol();
            requestcall.protocol = tL_phoneCallProtocol;
            requestcall.video = voIPService.videoCall;
            tL_phoneCallProtocol.udp_p2p = true;
            tL_phoneCallProtocol.udp_reflector = true;
            tL_phoneCallProtocol.min_layer = 65;
            tL_phoneCallProtocol.max_layer = Instance.getConnectionMaxLayer();
            Collections.addAll(requestcall.protocol.library_versions, NativeInstance.getAllVersions());
            voIPService.g_a = byteArray;
            requestcall.g_a_hash = Utilities.computeSHA256(byteArray, 0, byteArray.length);
            requestcall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(voIPService.currentAccount).sendRequest(requestcall, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    VoIPService.$r8$lambda$N5VMQy7umq8bHaETEaggOvIzl8k(this.f$0, bArr, tLObject2, tL_error2);
                }
            }, 65536);
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("Error on getDhConfig " + tL_error);
        }
        voIPService.callFailed();
    }

    public static void $r8$lambda$N5VMQy7umq8bHaETEaggOvIzl8k(final VoIPService voIPService, final byte[] bArr, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        voIPService.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$1r91KUNkxQ5TzxORrPyDFV6z4BE(this.f$0, tL_error, tLObject, bArr);
            }
        });
    }

    public static void $r8$lambda$1r91KUNkxQ5TzxORrPyDFV6z4BE(final VoIPService voIPService, TLRPC.TL_error tL_error, TLObject tLObject, byte[] bArr) {
        voIPService.getClass();
        if (tL_error == null) {
            voIPService.privateCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
            voIPService.a_or_b = bArr;
            voIPService.dispatchStateChanged(13);
            if (voIPService.endCallAfterRequest) {
                voIPService.hangUp();
                return;
            }
            if (voIPService.pendingUpdates.size() > 0 && voIPService.privateCall != null) {
                ArrayList<TL_phone.PhoneCall> arrayList = voIPService.pendingUpdates;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    TL_phone.PhoneCall phoneCall = arrayList.get(i);
                    i++;
                    voIPService.onCallUpdated(phoneCall);
                }
                voIPService.pendingUpdates.clear();
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    VoIPService.$r8$lambda$on6hMNiHxoTxo5KdxXf261km2AY(this.f$0);
                }
            };
            voIPService.timeoutRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, MessagesController.getInstance(voIPService.currentAccount).callReceiveTimeout);
            return;
        }
        if (tL_error.code == 400 && "PARTICIPANT_VERSION_OUTDATED".equals(tL_error.text)) {
            voIPService.callFailed("ERROR_PEER_OUTDATED");
            return;
        }
        int i2 = tL_error.code;
        if (i2 == 403) {
            voIPService.callFailed("ERROR_PRIVACY");
            return;
        }
        if (i2 == 406) {
            voIPService.callFailed("ERROR_LOCALIZED");
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("Error on phone.requestCall: " + tL_error);
        }
        voIPService.callFailed();
    }

    public static void $r8$lambda$on6hMNiHxoTxo5KdxXf261km2AY(final VoIPService voIPService) {
        voIPService.timeoutRunnable = null;
        TL_phone.discardCall discardcall = new TL_phone.discardCall();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        discardcall.peer = tL_inputPhoneCall;
        TL_phone.PhoneCall phoneCall = voIPService.privateCall;
        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
        tL_inputPhoneCall.id = phoneCall.id;
        discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonMissed();
        FileLog.e("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(voIPService.currentAccount).sendRequest(discardcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPService.m1175$r8$lambda$2b4qZU942ziZSS6T11isiix4(this.f$0, tLObject, tL_error);
            }
        }, 65536);
    }

    public static void m1175$r8$lambda$2b4qZU942ziZSS6T11isiix4(final VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        voIPService.getClass();
        if (BuildVars.LOGS_ENABLED) {
            if (tL_error != null) {
                FileLog.e("error on phone.discardCall: " + tL_error);
            } else {
                FileLog.d("phone.discardCall " + tLObject);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.callFailed();
            }
        });
    }

    private void acknowledgeCall(final boolean z) {
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(receivedcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPService.$r8$lambda$5kuGKJ6XYoF2b3W_XHBKQpaTHPI(this.f$0, z, tLObject, tL_error);
            }
        }, 65536);
    }

    public static void $r8$lambda$5kuGKJ6XYoF2b3W_XHBKQpaTHPI(final VoIPService voIPService, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        voIPService.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$h7xoDi9VMwC8AK5cxeMcfbjfOxw(this.f$0, tLObject, tL_error, z);
            }
        });
    }

    public static void $r8$lambda$h7xoDi9VMwC8AK5cxeMcfbjfOxw(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        voIPService.getClass();
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
            voIPService.stopSelf();
            return;
        }
        if (USE_CONNECTION_SERVICE) {
            ContactsController contactsController = ContactsController.getInstance(voIPService.currentAccount);
            TLRPC.User user = voIPService.user;
            contactsController.createOrUpdateConnectionServiceContact(user.id, user.first_name, user.last_name);
            TelecomManager telecomManager = (TelecomManager) voIPService.getSystemService("telecom");
            Bundle bundle = new Bundle();
            bundle.putInt("call_type", 1);
            telecomManager.addNewIncomingCall(voIPService.addAccountToTelecomManager(), bundle);
        }
        if (z) {
            voIPService.startRinging();
        }
    }

    private boolean isRinging() {
        return this.currentState == 15;
    }

    public boolean isJoined() {
        int i = this.currentState;
        return (i == 1 || i == 6) ? false : true;
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
            } else {
                ProxyVideoSink proxyVideoSink = this.localSink[0];
                if (z) {
                    i = 2;
                } else if (this.isFrontFaceCamera) {
                    i = 1;
                }
                nativeInstance.setupOutgoingVideo(proxyVideoSink, i);
            }
        } else {
            ProxyVideoSink proxyVideoSink2 = this.localSink[0];
            if (z) {
                i = 2;
            } else if (this.isFrontFaceCamera) {
                i = 1;
            }
            nativeInstance.setupOutgoingVideo(proxyVideoSink2, i);
        }
        this.isPrivateScreencast = z;
    }

    public void switchCamera() {
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null || !nativeInstance.hasVideoCapturer() || this.switchingCamera) {
            long j = this.captureDevice[0];
            if (j == 0 || this.switchingCamera) {
                return;
            }
            NativeInstance.switchCameraCapturer(j, !this.isFrontFaceCamera);
            return;
        }
        this.switchingCamera = true;
        this.tgVoip[0].switchCamera(!this.isFrontFaceCamera);
    }

    public boolean isSwitchingCamera() {
        return this.switchingCamera;
    }

    public void createCaptureDevice(boolean z) {
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
        if (z) {
            if (this.groupCall != null) {
                long[] jArr = this.captureDevice;
                if (jArr[z ? 1 : 0] != 0) {
                    return;
                }
                jArr[z ? 1 : 0] = NativeInstance.createVideoCapturer(this.localSink[z ? 1 : 0], r2);
                createGroupInstance(1, false, true);
                setVideoState(true, 2);
                AccountInstance.getInstance(this.currentAccount).getNotificationCenter().postNotificationName(NotificationCenter.groupCallScreencastStateChanged, new Object[0]);
                return;
            }
            requestVideoCall(true);
            setVideoState(true, 2);
            if (VoIPFragment.getInstance() != null) {
                VoIPFragment.getInstance().onScreenCastStart();
                return;
            }
            return;
        }
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
            editCallMember(UserConfig.getInstance(this.currentAccount).getCurrentUser(), Boolean.valueOf(!z2), Boolean.valueOf(this.videoState[0] != 2), null, null, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.micSwitching = false;
                }
            });
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

    public void setVideoState(boolean z, int i) {
        int i2;
        int i3 = 0;
        char c = this.groupCall != null ? z ? 1 : 0 : (char) 0;
        NativeInstance nativeInstance = this.tgVoip[c];
        if (nativeInstance == null) {
            long[] jArr = this.captureDevice;
            long j = jArr[z ? 1 : 0];
            if (j != 0) {
                this.videoState[c] = i;
                NativeInstance.setVideoStateCapturer(j, i);
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
            return;
        }
        this.videoState[c] = i;
        nativeInstance.setVideoState(i);
        long j2 = this.captureDevice[z ? 1 : 0];
        if (j2 != 0) {
            NativeInstance.setVideoStateCapturer(j2, this.videoState[c]);
        }
        if (z) {
            return;
        }
        if (this.groupCall != null) {
            editCallMember(UserConfig.getInstance(this.currentAccount).getCurrentUser(), null, Boolean.valueOf(this.videoState[0] != 2), null, null, null);
        }
        checkIsNear();
    }

    public void stopScreenCapture() {
        if (this.groupCall == null || this.videoState[1] != 2) {
            return;
        }
        TL_phone.leaveGroupCallPresentation leavegroupcallpresentation = new TL_phone.leaveGroupCallPresentation();
        leavegroupcallpresentation.call = this.groupCall.getInputGroupCall();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcallpresentation, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPService.$r8$lambda$6vl9ergidnKi2Jno7YbMnPfGbOM(this.f$0, tLObject, tL_error);
            }
        });
        NativeInstance nativeInstance = this.tgVoip[1];
        if (nativeInstance != null) {
            Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda105(nativeInstance));
        }
        this.mySource[1] = 0;
        this.tgVoip[1] = null;
        this.destroyCaptureDevice[1] = true;
        this.captureDevice[1] = 0;
        this.videoState[1] = 0;
        AccountInstance.getInstance(this.currentAccount).getNotificationCenter().postNotificationName(NotificationCenter.groupCallScreencastStateChanged, new Object[0]);
    }

    public static void $r8$lambda$6vl9ergidnKi2Jno7YbMnPfGbOM(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        voIPService.getClass();
        if (tLObject != null) {
            MessagesController.getInstance(voIPService.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public int getVideoState(boolean z) {
        return this.videoState[z ? 1 : 0];
    }

    public void setSinks(VideoSink videoSink, VideoSink videoSink2) {
        setSinks(videoSink, false, videoSink2);
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

    public void setLocalSink(VideoSink videoSink, boolean z) {
        if (z) {
            return;
        }
        this.localSink[0].setTarget(videoSink);
    }

    public void setRemoteSink(VideoSink videoSink, boolean z) {
        this.remoteSink[z ? 1 : 0].setTarget(videoSink);
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

    public boolean isFullscreen(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        if (this.currentBackgroundSink[z ? 1 : 0] != null) {
            return TextUtils.equals(this.currentBackgroundEndpointId[z ? 1 : 0], z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        }
        return false;
    }

    public void setBackgroundSinks(VideoSink videoSink, VideoSink videoSink2) {
        this.localSink[0].setBackground(videoSink);
        this.remoteSink[0].setBackground(videoSink2);
    }

    public void swapSinks() {
        this.localSink[0].swap();
        this.remoteSink[0].swap();
    }

    public boolean isHangingUp() {
        return this.currentState == 10;
    }

    public void onSignalingData(TL_update.TL_updatePhoneCallSignalingData tL_updatePhoneCallSignalingData) {
        NativeInstance nativeInstance;
        if (this.user == null || (nativeInstance = this.tgVoip[0]) == null || nativeInstance.isGroup() || getCallID() != tL_updatePhoneCallSignalingData.phone_call_id) {
            return;
        }
        this.tgVoip[0].onSignalingDataReceive(tL_updatePhoneCallSignalingData.data);
    }

    public long getSelfId() {
        TLRPC.InputPeer inputPeer = this.groupCallPeer;
        if (inputPeer == null) {
            return UserConfig.getInstance(this.currentAccount).clientUserId;
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
            return inputPeer.user_id;
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            return -inputPeer.channel_id;
        }
        return -inputPeer.chat_id;
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
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.groupCallUpdated, 0L, Long.valueOf(this.groupCall.call.id), Boolean.FALSE);
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
                        FileLog.d("source mismatch my = " + this.mySource[0] + " psrc = " + groupCallParticipant.source);
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
            if (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall) {
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
            if (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy) {
                dispatchStateChanged(17);
                this.playingSound = true;
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        VoIPService voIPService = this.f$0;
                        voIPService.soundPool.play(voIPService.spBusyId, 1.0f, 1.0f, 0, -1, 1.0f);
                    }
                });
                AndroidUtilities.runOnUIThread(this.afterSoundRunnable, 1500L);
                endConnectionServiceCall(1500L);
                stopSelf();
                return;
            }
            callEnded();
            return;
        }
        if ((phoneCall instanceof TL_phone.TL_phoneCall) && this.authKey == null) {
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
                byte[] bArrComputeSHA1 = Utilities.computeSHA1(byteArray);
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArrComputeSHA1, bArrComputeSHA1.length - 8, bArr3, 0, 8);
                this.authKey = byteArray;
                jBytesToLong = Utilities.bytesToLong(bArr3);
                this.keyFingerprint = jBytesToLong;
                if (jBytesToLong != phoneCall.key_fingerprint) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.w("key fingerprints don't match");
                    }
                    callFailed();
                    return;
                }
                initiateActualEncryptedCall();
                return;
            }
            byteArray = bArr;
            byte[] bArrComputeSHA2 = Utilities.computeSHA1(byteArray);
            byte[] bArr4 = new byte[8];
            System.arraycopy(bArrComputeSHA2, bArrComputeSHA2.length - 8, bArr4, 0, 8);
            this.authKey = byteArray;
            jBytesToLong = Utilities.bytesToLong(bArr4);
            this.keyFingerprint = jBytesToLong;
            if (jBytesToLong != phoneCall.key_fingerprint) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.w("key fingerprints don't match");
                }
                callFailed();
                return;
            }
            initiateActualEncryptedCall();
            return;
        }
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
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VoIPService.m1184$r8$lambda$DfDSwYdLKDS40DKI0VIJPUAMSs(this.f$0);
            }
        });
        Runnable runnable2 = this.timeoutRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.timeoutRunnable = null;
        }
        Runnable runnable3 = new Runnable() {
            @Override
            public final void run() {
                VoIPService.m1206$r8$lambda$uOPDaeMzMDarQPnST1v9lzWCNc(this.f$0);
            }
        };
        this.timeoutRunnable = runnable3;
        AndroidUtilities.runOnUIThread(runnable3, MessagesController.getInstance(this.currentAccount).callRingTimeout);
    }

    public static void m1184$r8$lambda$DfDSwYdLKDS40DKI0VIJPUAMSs(VoIPService voIPService) {
        int i = voIPService.spPlayId;
        if (i != 0) {
            voIPService.soundPool.stop(i);
        }
        voIPService.spPlayId = voIPService.soundPool.play(voIPService.spRingbackID, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public static void m1206$r8$lambda$uOPDaeMzMDarQPnST1v9lzWCNc(VoIPService voIPService) {
        voIPService.timeoutRunnable = null;
        voIPService.declineIncomingCall(3, null);
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

    public void sendCallRating(int i) {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        VoIPHelper.sendCallRating(phoneCall.id, phoneCall.access_hash, this.currentAccount, i);
    }

    public byte[] getEncryptionKey() {
        return this.authKey;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmcall, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    VoIPService.$r8$lambda$7RRrnE_Z8uWDw5t96mYJnTJ8oWo(this.f$0, tLObject, tL_error);
                }
            });
        }
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmcall2, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPService.$r8$lambda$7RRrnE_Z8uWDw5t96mYJnTJ8oWo(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$7RRrnE_Z8uWDw5t96mYJnTJ8oWo(final VoIPService voIPService, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        voIPService.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.m1179$r8$lambda$AEH9LFXMipXFKhJRGOX2FKSba8(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void m1179$r8$lambda$AEH9LFXMipXFKhJRGOX2FKSba8(VoIPService voIPService, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            voIPService.callFailed();
            return;
        }
        voIPService.getClass();
        voIPService.privateCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
        voIPService.initiateActualEncryptedCall();
    }

    private int convertDataSavingMode(int i) {
        return i != 3 ? i : ApplicationLoader.isRoaming() ? 1 : 0;
    }

    public void migrateToChat(TLRPC.Chat chat) {
        this.chat = chat;
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

    private void startGroupCall(final int i, String str, final boolean z) {
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(creategroupcall, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    VoIPService.$r8$lambda$wb5mRkDIriKbZbJiauCmsKP3UI4(this.f$0, tLObject, tL_error);
                }
            }, 65536);
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didStartedCall, new Object[0]);
                }
            });
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPService.$r8$lambda$JqqiSZzJwosQQGhwsfWF4aqosOo(this.f$0, i, z, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$wb5mRkDIriKbZbJiauCmsKP3UI4(final VoIPService voIPService, TLObject tLObject, final TLRPC.TL_error tL_error) {
        voIPService.getClass();
        if (tLObject != null) {
            try {
                voIPService.groupCallBottomSheetLatch.await(800L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                FileLog.e(e);
            }
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            for (int i = 0; i < updates.updates.size(); i++) {
                TLRPC.Update update = updates.updates.get(i);
                if (update instanceof TL_update.TL_updateGroupCall) {
                    final TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) update;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            VoIPService.$r8$lambda$RI_q9Uboqb79UOIzpkazhWh3pns(this.f$0, tL_updateGroupCall);
                        }
                    });
                    break;
                }
            }
            MessagesController.getInstance(voIPService.currentAccount).processUpdates(updates, false);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$GDw28TiO9V1kFanUseD7PrDLbN0(this.f$0, tL_error);
            }
        });
    }

    public static void $r8$lambda$RI_q9Uboqb79UOIzpkazhWh3pns(VoIPService voIPService, TL_update.TL_updateGroupCall tL_updateGroupCall) {
        if (sharedInstance == null) {
            voIPService.getClass();
            return;
        }
        TLRPC.GroupCall groupCall = voIPService.groupCall.call;
        TLRPC.GroupCall groupCall2 = tL_updateGroupCall.call;
        groupCall.access_hash = groupCall2.access_hash;
        groupCall.id = groupCall2.id;
        MessagesController messagesController = MessagesController.getInstance(voIPService.currentAccount);
        ChatObject.Call call = voIPService.groupCall;
        messagesController.putGroupCall(call.chatId, call);
        voIPService.startGroupCall(0, null, false);
    }

    public static void $r8$lambda$GDw28TiO9V1kFanUseD7PrDLbN0(VoIPService voIPService, TLRPC.TL_error tL_error) {
        NotificationCenter.getInstance(voIPService.currentAccount).postNotificationName(NotificationCenter.needShowAlert, 6, tL_error.text);
        voIPService.hangUp(0);
    }

    public static void $r8$lambda$JqqiSZzJwosQQGhwsfWF4aqosOo(final VoIPService voIPService, final int i, final boolean z, TLObject tLObject, final TLRPC.TL_error tL_error) {
        voIPService.getClass();
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.$r8$lambda$MiZnHRulNvE66p37kkBJ_XErhrY(this.f$0, i);
                }
            });
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            long selfId = voIPService.getSelfId();
            int size = updates.updates.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC.Update update = updates.updates.get(i2);
                if (update instanceof TL_update.TL_updateGroupCallParticipants) {
                    TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) update;
                    int size2 = tL_updateGroupCallParticipants.participants.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        final TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i3);
                        if (MessageObject.getPeerId(groupCallParticipant.peer) == selfId) {
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    VoIPService.m1182$r8$lambda$CWKr3GBtfPZfJhRL1nfuUjNJdI(this.f$0, groupCallParticipant);
                                }
                            });
                            if (!BuildVars.LOGS_ENABLED) {
                                break;
                            }
                            FileLog.d("join source = " + groupCallParticipant.source);
                            break;
                        }
                    }
                } else if (update instanceof TL_update.TL_updateGroupCallConnection) {
                    TL_update.TL_updateGroupCallConnection tL_updateGroupCallConnection = (TL_update.TL_updateGroupCallConnection) update;
                    if (!tL_updateGroupCallConnection.presentation) {
                        voIPService.myParams = tL_updateGroupCallConnection.params;
                    }
                }
            }
            MessagesController.getInstance(voIPService.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.groupCall.loadMembers(z);
                }
            });
            voIPService.startGroupCheckShortpoll();
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$z_f82bDjbAkvdPk5UmAPJ3DLhoc(this.f$0, tL_error);
            }
        });
    }

    public static void $r8$lambda$MiZnHRulNvE66p37kkBJ_XErhrY(VoIPService voIPService, int i) {
        voIPService.mySource[0] = i;
    }

    public static void m1182$r8$lambda$CWKr3GBtfPZfJhRL1nfuUjNJdI(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant) {
        voIPService.mySource[0] = groupCallParticipant.source;
    }

    public static void $r8$lambda$z_f82bDjbAkvdPk5UmAPJ3DLhoc(VoIPService voIPService, TLRPC.TL_error tL_error) {
        TLRPC.ChatFull chatFull;
        voIPService.getClass();
        if ("JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            if (voIPService.chat != null && (chatFull = MessagesController.getInstance(voIPService.currentAccount).getChatFull(voIPService.chat.id)) != null) {
                if (chatFull instanceof TLRPC.TL_chatFull) {
                    chatFull.flags &= -32769;
                } else {
                    chatFull.flags &= -67108865;
                }
                chatFull.groupcall_default_join_as = null;
                JoinCallAlert.resetCache();
            }
            voIPService.hangUp(2);
            return;
        }
        if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
            voIPService.createGroupInstance(0, false, false);
            return;
        }
        if ("GROUPCALL_INVALID".equals(tL_error.text) && voIPService.chat != null) {
            MessagesController.getInstance(voIPService.currentAccount).loadFullChat(voIPService.chat.id, 0, true);
        }
        NotificationCenter.getInstance(voIPService.currentAccount).postNotificationName(NotificationCenter.needShowAlert, 6, tL_error.text);
        voIPService.hangUp(0);
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
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.startConferenceGroupCall(true, 0, null, false);
            }
        });
    }

    public void startConferenceGroupCall(final boolean z, final int i, final String str, boolean z2) {
        if (sharedInstance != this) {
            return;
        }
        if (this.groupCallPeer == null) {
            this.groupCallPeer = MessagesController.getInputPeer(UserConfig.getInstance(this.currentAccount).getCurrentUser());
        }
        if (z) {
            final AccountInstance accountInstance = AccountInstance.getInstance(this.currentAccount);
            this.conference = new ConferenceCall(this.currentAccount, accountInstance.getUserConfig().getClientUserId()) {
                @Override
                protected void gotCallId(long j) {
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    VoIPService.$r8$lambda$NIwh3k2yHmmdWf1snt8C5dnUDIs(this.f$0, accountInstance, tLObject, tL_error);
                }
            }, 65536);
            return;
        }
        if (this.conference == null) {
            int i2 = this.currentAccount;
            ConferenceCall conferenceCall = new ConferenceCall(i2, UserConfig.getInstance(i2).getClientUserId()) {
                @Override
                protected void gotCallId(long j) {
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    VoIPService.$r8$lambda$zrVo2cH0VD3hhYXB5_ahzoaWYBs(this.f$0, i, str, tLObject, tL_error);
                }
            });
            return;
        }
        if (str == null) {
            configureDeviceForCall();
            showNotification();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didStartedCall, new Object[0]);
                }
            });
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
            if (VoIPFragment.getInstance() != null) {
                VoIPFragment.getInstance().finish();
            }
            GroupCallActivity.create(LaunchActivity.instance, AccountInstance.getInstance(UserConfig.selectedAccount), null, null, false, null);
            return;
        }
        if (getSharedInstance() != null) {
            if (this.groupCall == null && this.conference == null) {
                return;
            }
            dispatchStateChanged(1);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("initital source = " + i);
            }
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    VoIPService.$r8$lambda$xbyKokiMUVrj6m8pm_FYkiz5gI0(this.f$0, str, i, z);
                }
            };
            if (z2) {
                this.conference.reset();
            }
            this.conference.requestLastBlock(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.m1180$r8$lambda$ARrUTdhumhG8yHT58nc1Mb7mG4(this.f$0, runnable);
                }
            });
        }
    }

    public static void $r8$lambda$NIwh3k2yHmmdWf1snt8C5dnUDIs(final VoIPService voIPService, final AccountInstance accountInstance, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        voIPService.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$tk66FmaK9jU9I0bzwizZk1aAOGk(this.f$0, tLObject, accountInstance, tL_error);
            }
        });
    }

    public static void $r8$lambda$tk66FmaK9jU9I0bzwizZk1aAOGk(VoIPService voIPService, TLObject tLObject, AccountInstance accountInstance, TLRPC.TL_error tL_error) {
        voIPService.getClass();
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(voIPService.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(voIPService.currentAccount).putChats(updates.chats, false);
            ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
            int size = arrayListFindUpdatesAndRemove.size();
            TLRPC.GroupCall groupCall = null;
            int i = 0;
            while (i < size) {
                Object obj = arrayListFindUpdatesAndRemove.get(i);
                i++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (groupCall == null) {
                return;
            }
            try {
                voIPService.groupCallBottomSheetLatch.await(800L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                FileLog.e(e);
            }
            voIPService.groupCall.setCall(accountInstance, 0L, groupCall);
            voIPService.groupCall.loadMembers(true);
            MessagesController.getInstance(voIPService.currentAccount).putGroupCall(0L, voIPService.groupCall);
            voIPService.conference.inputGroupCall = new TLRPC.TL_inputGroupCall();
            ConferenceCall conferenceCall = voIPService.conference;
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            inputGroupCall.id = groupCall.id;
            inputGroupCall.access_hash = groupCall.access_hash;
            conferenceCall.groupCall = TlUtils.applyGroupCallUpdate(conferenceCall.groupCall, groupCall);
            voIPService.startConferenceGroupCall(false, 0, null, false);
            HashSet<Long> hashSet = voIPService.inviteUsersToConference;
            if (hashSet != null) {
                Iterator<Long> it = hashSet.iterator();
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    ChatObject.Call call = voIPService.groupCall;
                    if (call != null) {
                        call.addInvitedUser(jLongValue);
                    }
                }
            }
            if (VoIPFragment.getInstance() != null) {
                VoIPFragment.getInstance().finish();
            }
            GroupCallActivity.create(LaunchActivity.instance, AccountInstance.getInstance(voIPService.currentAccount), null, null, false, null);
            return;
        }
        if (tLObject instanceof TL_phone.groupCall) {
            try {
                voIPService.groupCallBottomSheetLatch.await(800L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                FileLog.e(e2);
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            voIPService.groupCall.setCall(accountInstance, 0L, groupcall);
            voIPService.groupCall.loadMembers(true);
            MessagesController.getInstance(voIPService.currentAccount).putGroupCall(0L, voIPService.groupCall);
            voIPService.conference.inputGroupCall = new TLRPC.TL_inputGroupCall();
            ConferenceCall conferenceCall2 = voIPService.conference;
            TLRPC.InputGroupCall inputGroupCall2 = conferenceCall2.inputGroupCall;
            TLRPC.GroupCall groupCall2 = groupcall.call;
            inputGroupCall2.id = groupCall2.id;
            inputGroupCall2.access_hash = groupCall2.access_hash;
            conferenceCall2.groupCall = groupCall2;
            voIPService.startConferenceGroupCall(false, 0, null, false);
            HashSet<Long> hashSet2 = voIPService.inviteUsersToConference;
            if (hashSet2 != null) {
                Iterator<Long> it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    long jLongValue2 = it2.next().longValue();
                    ChatObject.Call call2 = voIPService.groupCall;
                    if (call2 != null) {
                        call2.addInvitedUser(jLongValue2);
                    }
                }
            }
            if (VoIPFragment.getInstance() != null) {
                VoIPFragment.getInstance().finish();
            }
            GroupCallActivity.create(LaunchActivity.instance, AccountInstance.getInstance(voIPService.currentAccount), null, null, false, null);
            return;
        }
        NotificationCenter.getInstance(voIPService.currentAccount).postNotificationName(NotificationCenter.needShowAlert, 6, tL_error.text);
        voIPService.hangUp(0);
    }

    public static void $r8$lambda$zrVo2cH0VD3hhYXB5_ahzoaWYBs(final VoIPService voIPService, final int i, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        voIPService.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.m1183$r8$lambda$CWtxETwL7Ux5h4TGnfK4ZWdcVU(this.f$0, tLObject, i, str, tL_error);
            }
        });
    }

    public static void m1183$r8$lambda$CWtxETwL7Ux5h4TGnfK4ZWdcVU(VoIPService voIPService, TLObject tLObject, int i, String str, TLRPC.TL_error tL_error) {
        voIPService.getClass();
        if (!(tLObject instanceof TL_phone.groupCall)) {
            if (tL_error != null) {
                NotificationCenter.getInstance(voIPService.currentAccount).postNotificationName(NotificationCenter.needShowAlert, 6, tL_error.text);
                voIPService.hangUp(0);
                return;
            }
            return;
        }
        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
        MessagesController.getInstance(voIPService.currentAccount).putUsers(groupcall.users, false);
        MessagesController.getInstance(voIPService.currentAccount).putChats(groupcall.chats, false);
        voIPService.groupCall.setCall(AccountInstance.getInstance(voIPService.currentAccount), 0L, groupcall);
        ConferenceCall conferenceCall = voIPService.conference;
        conferenceCall.groupCall = groupcall.call;
        conferenceCall.inputGroupCall = voIPService.joinConference;
        voIPService.startConferenceGroupCall(false, i, str, false);
    }

    public static void $r8$lambda$xbyKokiMUVrj6m8pm_FYkiz5gI0(final VoIPService voIPService, final String str, final int i, final boolean z) {
        voIPService.getClass();
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        joingroupcall.muted = voIPService.micMute;
        joingroupcall.video_stopped = voIPService.videoState[0] != 2;
        ConferenceCall conferenceCall = voIPService.conference;
        if (conferenceCall != null) {
            joingroupcall.call = conferenceCall.inputGroupCall;
            joingroupcall.flags |= 8;
            joingroupcall.public_key = conferenceCall.getMyPublicKey();
            joingroupcall.block = voIPService.conference.getLastBlock();
        } else {
            ChatObject.Call call = voIPService.groupCall;
            if (call != null) {
                joingroupcall.call = call.getInputGroupCall();
            }
        }
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcall.params = tL_dataJSON;
        tL_dataJSON.data = str;
        if (!TextUtils.isEmpty(voIPService.joinHash)) {
            joingroupcall.invite_hash = voIPService.joinHash;
            joingroupcall.flags |= 2;
        }
        TLRPC.InputPeer inputPeer = voIPService.groupCallPeer;
        if (inputPeer != null) {
            joingroupcall.join_as = inputPeer;
        } else {
            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            joingroupcall.join_as = tL_inputPeerUser;
            tL_inputPeerUser.user_id = AccountInstance.getInstance(voIPService.currentAccount).getUserConfig().getClientUserId();
        }
        ConnectionsManager.getInstance(voIPService.currentAccount).sendRequest(joingroupcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPService.m1186$r8$lambda$GNaXxA8MARuhKTXk7s4Q9Jj20(this.f$0, i, z, str, tLObject, tL_error);
            }
        });
    }

    public static void m1186$r8$lambda$GNaXxA8MARuhKTXk7s4Q9Jj20(final VoIPService voIPService, final int i, final boolean z, final String str, TLObject tLObject, final TLRPC.TL_error tL_error) {
        voIPService.getClass();
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.$r8$lambda$V0KPPEKi0qGggA0R_ZHmn0vewEs(this.f$0, i);
                }
            });
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            long selfId = voIPService.getSelfId();
            final ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCallChainBlocks.class);
            ArrayList arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
            int size = arrayListFindUpdates.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListFindUpdates.get(i2);
                i2++;
                TLRPC.GroupCall groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                ChatObject.Call call = voIPService.groupCall;
                if (call != null) {
                    call.setCall(AccountInstance.getInstance(voIPService.currentAccount), 0L, groupCall);
                }
                ConferenceCall conferenceCall = voIPService.conference;
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
                    final TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i4);
                    if (MessageObject.getPeerId(groupCallParticipant.peer) == selfId) {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                VoIPService.m1196$r8$lambda$Rh7ALMumpH1d51T8oEbhk7shw(this.f$0, groupCallParticipant);
                            }
                        });
                        if (!BuildVars.LOGS_ENABLED) {
                            break;
                        }
                        FileLog.d("join source = " + groupCallParticipant.source);
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
                    voIPService.myParams = tL_updateGroupCallConnection.params;
                }
            }
            MessagesController.getInstance(voIPService.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.$r8$lambda$ugUmrBmSKS_zYwuqayFK2IVO3KQ(this.f$0, arrayListFindUpdatesAndRemove, z);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.m1189$r8$lambda$N893OrLCQ4Ksb6Sxy1wL99PBec(this.f$0, tL_error, str);
            }
        });
    }

    public static void $r8$lambda$V0KPPEKi0qGggA0R_ZHmn0vewEs(VoIPService voIPService, int i) {
        voIPService.mySource[0] = i;
    }

    public static void m1196$r8$lambda$Rh7ALMumpH1d51T8oEbhk7shw(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant) {
        voIPService.mySource[0] = groupCallParticipant.source;
    }

    public static void $r8$lambda$ugUmrBmSKS_zYwuqayFK2IVO3KQ(final VoIPService voIPService, ArrayList arrayList, boolean z) {
        final TL_phone.PhoneCall phoneCall;
        ConferenceCall conferenceCall = voIPService.conference;
        if (conferenceCall == null) {
            return;
        }
        conferenceCall.joined();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            voIPService.conference.applyUpdate(0, (TL_update.TL_updateGroupCallChainBlocks) obj, true, null);
        }
        voIPService.conference.forcePoll();
        voIPService.groupCall.loadMembers(z);
        voIPService.startGroupCheckShortpoll();
        if (voIPService.captureDevice[1] != 0) {
            voIPService.createGroupInstance(1, false, true);
        }
        for (int i2 = 0; i2 < 2; i2++) {
            NativeInstance nativeInstance = voIPService.tgVoip[i2];
            if (nativeInstance != null) {
                nativeInstance.setConferenceCallId(voIPService.conference.getCallId());
            }
        }
        AndroidUtilities.runOnUIThread(voIPService.destroyConvertingRunnable, 5000L);
        if (voIPService.inviteUsersToConference != null && (phoneCall = voIPService.privateCall) != null && voIPService.groupCall != null) {
            final TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = voIPService.groupCall.call;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(voIPService.currentAccount).sendRequest(exportgroupcallinvite, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    VoIPService.$r8$lambda$PcjiWoXrcYBobQyjD8WIWG1FNtE(this.f$0, phoneCall, exportgroupcallinvite, tLObject, tL_error);
                }
            });
        }
        long[] jArr = voIPService.inviteUsers;
        if (jArr != null) {
            final String str = voIPService.groupCall.call.invite_link;
            final int length = jArr.length;
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            final HashSet hashSet = new HashSet();
            for (final long j : voIPService.inviteUsers) {
                voIPService.groupCall.addInvitedUser(j);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                inviteconferencecallparticipant.call = voIPService.groupCall.getInputGroupCall();
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(voIPService.currentAccount).getInputUser(j);
                inviteconferencecallparticipant.video = voIPService.videoCall;
                ConnectionsManager.getInstance(voIPService.currentAccount).sendRequest(inviteconferencecallparticipant, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        VoIPService.$r8$lambda$AuGBFeMKofhI0SfZh4TcPVpUVOQ(this.f$0, j, hashSet, atomicInteger, length, str, tLObject, tL_error);
                    }
                });
            }
            voIPService.inviteUsers = null;
            NotificationCenter.getInstance(voIPService.currentAccount).postNotificationName(NotificationCenter.groupCallUpdated, 0L, Long.valueOf(voIPService.groupCall.call.id), Boolean.FALSE);
        }
    }

    public static void $r8$lambda$PcjiWoXrcYBobQyjD8WIWG1FNtE(final VoIPService voIPService, final TL_phone.PhoneCall phoneCall, final TL_phone.exportGroupCallInvite exportgroupcallinvite, final TLObject tLObject, TLRPC.TL_error tL_error) {
        voIPService.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$3tkNj3wQemNM0LGq4nbAVC9wMS0(this.f$0, tLObject, phoneCall, exportgroupcallinvite);
            }
        });
    }

    public static void $r8$lambda$3tkNj3wQemNM0LGq4nbAVC9wMS0(final VoIPService voIPService, TLObject tLObject, TL_phone.PhoneCall phoneCall, TL_phone.exportGroupCallInvite exportgroupcallinvite) {
        voIPService.getClass();
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
            discardcall.duration = (int) (voIPService.getCallDuration() / 1000);
            discardcall.connection_id = 0L;
            discardcall.video = voIPService.inviteUsersToConferenceVideo;
            ConnectionsManager.getInstance(voIPService.currentAccount).sendRequest(discardcall, null);
            final String str2 = exportedgroupcallinvite.link;
            final int size = voIPService.inviteUsersToConference.size();
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            final HashSet hashSet = new HashSet();
            Iterator<Long> it = voIPService.inviteUsersToConference.iterator();
            while (it.hasNext()) {
                final long jLongValue = it.next().longValue();
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(voIPService.currentAccount).getInputUser(jLongValue);
                inviteconferencecallparticipant.call = exportgroupcallinvite.call;
                ConnectionsManager.getInstance(voIPService.currentAccount).sendRequest(inviteconferencecallparticipant, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                        VoIPService.$r8$lambda$HlLUi9sVApUqBD9FjPNSSAraYlg(this.f$0, jLongValue, hashSet, atomicInteger, size, str2, tLObject2, tL_error);
                    }
                });
            }
            voIPService.privateCall = null;
            NotificationCenter.getInstance(voIPService.currentAccount).postNotificationName(NotificationCenter.groupCallUpdated, 0L, Long.valueOf(voIPService.groupCall.call.id), Boolean.FALSE);
        }
    }

    public static void $r8$lambda$HlLUi9sVApUqBD9FjPNSSAraYlg(final VoIPService voIPService, final long j, final HashSet hashSet, AtomicInteger atomicInteger, int i, final String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        voIPService.getClass();
        if (tLObject instanceof TLRPC.Updates) {
            final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(voIPService.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.$r8$lambda$Tdf6QOU8bFcxl1aBWa7XJWm1CsU(this.f$0, updates, j);
                }
            });
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j));
        }
        if (atomicInteger.incrementAndGet() != i || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.m1197$r8$lambda$Uh5RZOSjbwT9k_6eIHX6Ds5lc(this.f$0, hashSet, str);
            }
        });
    }

    public static void $r8$lambda$Tdf6QOU8bFcxl1aBWa7XJWm1CsU(VoIPService voIPService, TLRPC.Updates updates, long j) {
        int i;
        voIPService.getClass();
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message == null || !(message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i = 0;
                break;
            }
            i = message.id;
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i = ((TL_update.TL_updateMessageID) update).id;
        } else {
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
                    TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                    if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i = message2.id;
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
        }
        ChatObject.Call call = voIPService.groupCall;
        if (call == null || i == 0) {
            return;
        }
        call.invitedUsersMessageIds.put(Long.valueOf(j), ChatObject.Call.InvitedUser.make(i));
        NotificationCenter.getInstance(voIPService.currentAccount).postNotificationName(NotificationCenter.groupCallUpdated, 0L, Long.valueOf(voIPService.groupCall.call.id), Boolean.FALSE);
    }

    public static void m1197$r8$lambda$Uh5RZOSjbwT9k_6eIHX6Ds5lc(final VoIPService voIPService, HashSet hashSet, final String str) {
        voIPService.getClass();
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            ChatObject.Call call = voIPService.groupCall;
            if (call != null) {
                call.removeInvitedUser(jLongValue);
            }
            arrayList.add(MessagesController.getInstance(voIPService.currentAccount).getUser(l));
            getrequirementstocontact.id.add(MessagesController.getInstance(voIPService.currentAccount).getInputUser(jLongValue));
        }
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$0lyYIxfge6wzOWAjIY3cOMjF0eg(this.f$0, arrayList, arrayList2, arrayList3, str);
            }
        };
        if (UserConfig.getInstance(voIPService.currentAccount).isPremium()) {
            runnable.run();
        } else {
            ConnectionsManager.getInstance(voIPService.currentAccount).sendRequest(getrequirementstocontact, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            VoIPService.$r8$lambda$P8XeT5XImmvS6mi6z5zzcp8LAVk(tLObject, arrayList, arrayList, runnable);
                        }
                    });
                }
            });
        }
    }

    public static void $r8$lambda$0lyYIxfge6wzOWAjIY3cOMjF0eg(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        voIPService.getClass();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(safeLastFragment, safeLastFragment.getContext(), 34, voIPService.currentAccount, new DarkBlueThemeResourcesProvider());
        limitReachedBottomSheet.setRestrictedUsers(null, arrayList, arrayList2, arrayList3, str);
        limitReachedBottomSheet.show();
    }

    public static void $r8$lambda$P8XeT5XImmvS6mi6z5zzcp8LAVk(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
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

    public static void $r8$lambda$AuGBFeMKofhI0SfZh4TcPVpUVOQ(final VoIPService voIPService, final long j, final HashSet hashSet, AtomicInteger atomicInteger, int i, final String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        voIPService.getClass();
        if (tLObject instanceof TLRPC.Updates) {
            final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(voIPService.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.m1195$r8$lambda$ROpPpcjbHR2HmW3949NqUq9BrQ(this.f$0, updates, j);
                }
            });
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j));
        }
        if (atomicInteger.incrementAndGet() != i || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$vBDELjWAKSGI2zPEBzEeOoC4YB0(this.f$0, hashSet, str);
            }
        });
    }

    public static void m1195$r8$lambda$ROpPpcjbHR2HmW3949NqUq9BrQ(VoIPService voIPService, TLRPC.Updates updates, long j) {
        int i;
        voIPService.getClass();
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message == null || !(message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i = 0;
                break;
            }
            i = message.id;
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i = ((TL_update.TL_updateMessageID) update).id;
        } else {
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
                    TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                    if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i = message2.id;
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
        }
        ChatObject.Call call = voIPService.groupCall;
        if (call == null || i == 0) {
            return;
        }
        call.invitedUsersMessageIds.put(Long.valueOf(j), ChatObject.Call.InvitedUser.make(i));
        NotificationCenter.getInstance(voIPService.currentAccount).postNotificationName(NotificationCenter.groupCallUpdated, 0L, Long.valueOf(voIPService.groupCall.call.id), Boolean.FALSE);
    }

    public static void $r8$lambda$vBDELjWAKSGI2zPEBzEeOoC4YB0(final VoIPService voIPService, HashSet hashSet, final String str) {
        voIPService.getClass();
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            ChatObject.Call call = voIPService.groupCall;
            if (call != null) {
                call.removeInvitedUser(jLongValue);
            }
            arrayList.add(MessagesController.getInstance(voIPService.currentAccount).getUser(l));
            getrequirementstocontact.id.add(MessagesController.getInstance(voIPService.currentAccount).getInputUser(jLongValue));
        }
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$ulRthtGxFzTX73QvhL7d8CRVghI(this.f$0, arrayList, arrayList2, arrayList3, str);
            }
        };
        if (UserConfig.getInstance(voIPService.currentAccount).isPremium()) {
            runnable.run();
        } else {
            ConnectionsManager.getInstance(voIPService.currentAccount).sendRequest(getrequirementstocontact, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            VoIPService.m1193$r8$lambda$PaPBzqvxL3xvJckB30htjhFQH0(tLObject, arrayList, arrayList, runnable);
                        }
                    });
                }
            });
        }
    }

    public static void $r8$lambda$ulRthtGxFzTX73QvhL7d8CRVghI(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        voIPService.getClass();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(safeLastFragment, safeLastFragment.getContext(), 34, voIPService.currentAccount, new DarkBlueThemeResourcesProvider());
        limitReachedBottomSheet.setRestrictedUsers(null, arrayList, arrayList2, arrayList3, str);
        limitReachedBottomSheet.show();
    }

    public static void m1193$r8$lambda$PaPBzqvxL3xvJckB30htjhFQH0(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
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

    public static void m1189$r8$lambda$N893OrLCQ4Ksb6Sxy1wL99PBec(VoIPService voIPService, TLRPC.TL_error tL_error, String str) {
        voIPService.getClass();
        if ("JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            voIPService.hangUp(2);
            return;
        }
        if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
            voIPService.startConferenceGroupCall(false, 0, str, false);
            return;
        }
        if (tL_error.text.startsWith("CONF_WRITE_CHAIN_INVALID")) {
            voIPService.stopSelf();
            return;
        }
        if ("GROUPCALL_INVALID".equals(tL_error.text)) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.linkbroken, voIPService.getString(R.string.ConferenceClosed)).show().hideAfterBottomSheet = false;
            }
            voIPService.hangUp(0);
            return;
        }
        NotificationCenter.getInstance(voIPService.currentAccount).postNotificationName(NotificationCenter.needShowAlert, 6, tL_error.text);
        voIPService.hangUp(0);
    }

    public static void m1180$r8$lambda$ARrUTdhumhG8yHT58nc1Mb7mG4(VoIPService voIPService, Runnable runnable) {
        ConferenceCall conferenceCall = voIPService.conference;
        if (conferenceCall == null) {
            return;
        }
        conferenceCall.generateAddSelfBlock();
        runnable.run();
        for (int i = 0; i < 2; i++) {
            NativeInstance nativeInstance = voIPService.tgVoip[i];
            if (nativeInstance != null) {
                nativeInstance.setConferenceCallId(voIPService.conference.getCallId());
            }
        }
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

    private void startScreenCapture(final int i, String str) {
        if (getSharedInstance() == null || this.groupCall == null) {
            return;
        }
        this.mySource[1] = 0;
        TL_phone.joinGroupCallPresentation joingroupcallpresentation = new TL_phone.joinGroupCallPresentation();
        joingroupcallpresentation.call = this.groupCall.getInputGroupCall();
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcallpresentation.params = tL_dataJSON;
        tL_dataJSON.data = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcallpresentation, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPService.$r8$lambda$4eWzaGktRAbW8QbSLZUlsT_OtI4(this.f$0, i, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$4eWzaGktRAbW8QbSLZUlsT_OtI4(final VoIPService voIPService, final int i, TLObject tLObject, final TLRPC.TL_error tL_error) {
        voIPService.getClass();
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.$r8$lambda$WG7iGACq5k1BaVNTGvhMfNnTaQU(this.f$0, i);
                }
            });
            final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.m1200$r8$lambda$ah7hn0Dz_WsMMJMBipNVSp5Gs(this.f$0, updates);
                }
            });
            MessagesController.getInstance(voIPService.currentAccount).processUpdates(updates, false);
            voIPService.startGroupCheckShortpoll();
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.m1172$r8$lambda$O47cob9wN87f5c7LempkcLFbE(this.f$0, tL_error);
            }
        });
    }

    public static void $r8$lambda$WG7iGACq5k1BaVNTGvhMfNnTaQU(VoIPService voIPService, int i) {
        voIPService.mySource[1] = i;
    }

    public static void m1200$r8$lambda$ah7hn0Dz_WsMMJMBipNVSp5Gs(VoIPService voIPService, TLRPC.Updates updates) {
        if (voIPService.tgVoip[1] != null) {
            long selfId = voIPService.getSelfId();
            int size = updates.updates.size();
            for (int i = 0; i < size; i++) {
                TLRPC.Update update = updates.updates.get(i);
                if (update instanceof TL_update.TL_updateGroupCallConnection) {
                    TL_update.TL_updateGroupCallConnection tL_updateGroupCallConnection = (TL_update.TL_updateGroupCallConnection) update;
                    if (tL_updateGroupCallConnection.presentation) {
                        voIPService.tgVoip[1].setJoinResponsePayload(tL_updateGroupCallConnection.params.data);
                    }
                } else if (update instanceof TL_update.TL_updateGroupCallParticipants) {
                    TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) update;
                    int size2 = tL_updateGroupCallParticipants.participants.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i2);
                        if (MessageObject.getPeerId(groupCallParticipant.peer) == selfId) {
                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.presentation;
                            if (tL_groupCallParticipantVideo != null) {
                                if ((tL_groupCallParticipantVideo.flags & 2) != 0) {
                                    voIPService.mySource[1] = tL_groupCallParticipantVideo.audio_source;
                                    break;
                                }
                                int size3 = tL_groupCallParticipantVideo.source_groups.size();
                                for (int i3 = 0; i3 < size3; i3++) {
                                    TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = groupCallParticipant.presentation.source_groups.get(i3);
                                    if (tL_groupCallParticipantVideoSourceGroup.sources.size() > 0) {
                                        voIPService.mySource[1] = tL_groupCallParticipantVideoSourceGroup.sources.get(0).intValue();
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void m1172$r8$lambda$O47cob9wN87f5c7LempkcLFbE(VoIPService voIPService, TLRPC.TL_error tL_error) {
        TLRPC.ChatFull chatFull;
        voIPService.getClass();
        if ("GROUPCALL_VIDEO_TOO_MUCH".equals(tL_error.text)) {
            voIPService.groupCall.reloadGroupCall();
            return;
        }
        if ("JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            if (voIPService.chat != null && (chatFull = MessagesController.getInstance(voIPService.currentAccount).getChatFull(voIPService.chat.id)) != null) {
                if (chatFull instanceof TLRPC.TL_chatFull) {
                    chatFull.flags &= -32769;
                } else {
                    chatFull.flags &= -67108865;
                }
                chatFull.groupcall_default_join_as = null;
                JoinCallAlert.resetCache();
            }
            voIPService.hangUp(2);
            return;
        }
        if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
            voIPService.createGroupInstance(1, false, false);
        } else {
            if (!"GROUPCALL_INVALID".equals(tL_error.text) || voIPService.chat == null) {
                return;
            }
            MessagesController.getInstance(voIPService.currentAccount).loadFullChat(voIPService.chat.id, 0, true);
        }
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
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$fNYvcHfWGCoSBt36erqEh1XuRcM(this.f$0);
            }
        };
        this.shortPollRunnable = runnable;
        AndroidUtilities.runOnUIThread(runnable, 4000L);
    }

    public static void $r8$lambda$fNYvcHfWGCoSBt36erqEh1XuRcM(final VoIPService voIPService) {
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        if (voIPService.shortPollRunnable == null || sharedInstance == null || (call = voIPService.groupCall) == null) {
            return;
        }
        int[] iArr = voIPService.mySource;
        int i = 0;
        if (iArr[0] == 0 && iArr[1] == 0 && ((groupCall = call.call) == null || !groupCall.rtmp_stream)) {
            return;
        }
        final TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        if (voIPService.groupCall.getInputGroupCall(true) != null) {
            checkgroupcall.call = voIPService.groupCall.getInputGroupCall(true);
        } else {
            checkgroupcall.call = voIPService.groupCall.getInputGroupCall(false);
        }
        while (true) {
            int[] iArr2 = voIPService.mySource;
            if (i < iArr2.length) {
                int i2 = iArr2[i];
                if (i2 != 0) {
                    checkgroupcall.sources.add(Integer.valueOf(i2));
                }
                i++;
            } else {
                voIPService.checkRequestId = ConnectionsManager.getInstance(voIPService.currentAccount).sendRequest(checkgroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        VoIPService.m1192$r8$lambda$PYgQ7vPV1bvoJP9difQXEtcs(this.f$0, checkgroupcall, tLObject, tL_error);
                    }
                });
                return;
            }
        }
    }

    public static void m1192$r8$lambda$PYgQ7vPV1bvoJP9difQXEtcs(final VoIPService voIPService, final TL_phone.checkGroupCall checkgroupcall, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        voIPService.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.m1194$r8$lambda$QUMkkkmmspvGvdYJGw6WWYMjvg(this.f$0, tL_error, tLObject, checkgroupcall);
            }
        });
    }

    public static void m1194$r8$lambda$QUMkkkmmspvGvdYJGw6WWYMjvg(final VoIPService voIPService, TLRPC.TL_error tL_error, TLObject tLObject, TL_phone.checkGroupCall checkgroupcall) {
        boolean z;
        boolean z2;
        TLRPC.GroupCall groupCall;
        if (voIPService.shortPollRunnable == null || sharedInstance == null || voIPService.groupCall == null) {
            return;
        }
        if (voIPService.conference != null && tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text) && voIPService.groupCall.getInputGroupCall(true) != null && voIPService.groupCall.getInputGroupCall(false) != null) {
            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
            getgroupcall.call = voIPService.groupCall.getInputGroupCall(false);
            ConnectionsManager.getInstance(voIPService.currentAccount).sendRequest(getgroupcall, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    VoIPService.$r8$lambda$z8VS8GEABxQfwPxfh1cWUBiMNrs(this.f$0, tLObject2, tL_error2);
                }
            });
            return;
        }
        voIPService.shortPollRunnable = null;
        voIPService.checkRequestId = 0;
        if (tLObject instanceof Vector) {
            ArrayList<Integer> intArray = ((Vector) tLObject).toIntArray();
            int i = voIPService.mySource[0];
            z2 = (i == 0 || !checkgroupcall.sources.contains(Integer.valueOf(i)) || intArray.contains(Integer.valueOf(voIPService.mySource[0]))) ? false : true;
            int i2 = voIPService.mySource[1];
            z = (i2 == 0 || !checkgroupcall.sources.contains(Integer.valueOf(i2)) || intArray.contains(Integer.valueOf(voIPService.mySource[1]))) ? false : true;
        } else if (tL_error == null || tL_error.code != 400) {
            z = false;
            z2 = false;
        } else {
            int i3 = voIPService.mySource[1];
            if (i3 == 0 || !checkgroupcall.sources.contains(Integer.valueOf(i3))) {
                z = false;
                z2 = true;
            } else {
                z2 = true;
            }
        }
        if (z2) {
            voIPService.createGroupInstance(0, false, false);
        }
        if (z) {
            voIPService.createGroupInstance(1, false, false);
        }
        int[] iArr = voIPService.mySource;
        if (iArr[1] == 0 && iArr[0] == 0 && ((groupCall = voIPService.groupCall.call) == null || !groupCall.rtmp_stream)) {
            return;
        }
        voIPService.startGroupCheckShortpoll();
    }

    public static void $r8$lambda$z8VS8GEABxQfwPxfh1cWUBiMNrs(final VoIPService voIPService, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        voIPService.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$BzqEUKQoP4nz9jfc4ozhpXxwG4Q(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$BzqEUKQoP4nz9jfc4ozhpXxwG4Q(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (voIPService.shortPollRunnable == null || sharedInstance == null || voIPService.groupCall == null) {
            return;
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(voIPService.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(voIPService.currentAccount).putChats(groupcall.chats, false);
            voIPService.groupCall.setCall(AccountInstance.getInstance(voIPService.currentAccount), 0L, groupcall.call);
            voIPService.groupCall.loadMembers(true);
            voIPService.shortPollRunnable = null;
            voIPService.checkRequestId = 0;
            voIPService.startGroupCheckShortpoll();
            return;
        }
        if (tL_error == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            return;
        }
        voIPService.stopSelf();
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

    public void createGroupInstance(final int i, boolean z, boolean z2) {
        boolean z3;
        String str;
        String logFilePath;
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
            final boolean[] zArr = {z2};
            if (BuildVars.DEBUG_VERSION) {
                logFilePath = VoIPHelper.getLogFilePath("voip_" + i + "_" + str);
            } else {
                logFilePath = VoIPHelper.getLogFilePath(str, false);
            }
            this.tgVoip[i] = NativeInstance.makeGroup(logFilePath, this.captureDevice[i], i == 1, i == 0 && SharedConfig.noiseSupression, new NativeInstance.PayloadCallback() {
                @Override
                public final void run(int i2, String str2) {
                    VoIPService.$r8$lambda$WCWxve0nY4U0S36PetJWXDkgFBE(this.f$0, i, zArr, i2, str2);
                }
            }, new NativeInstance.AudioLevelsCallback() {
                @Override
                public final void run(int[] iArr, float[] fArr, boolean[] zArr2) {
                    VoIPService.m1203$r8$lambda$e_s3KWNzjJ3fRRmnO_OaT9djE(this.f$0, i, iArr, fArr, zArr2);
                }
            }, new NativeInstance.VideoSourcesCallback() {
                @Override
                public final void run(long j, int[] iArr) {
                    VoIPService.$r8$lambda$7uUFlSpayjC9p2go3nxqUj55u7A(this.f$0, i, j, iArr);
                }
            }, new NativeInstance.RequestBroadcastPartCallback() {
                @Override
                public final void run(long j, long j2, int i2, int i3) {
                    VoIPService.$r8$lambda$9LXeGBNReYbMbKUHQJhc_R5Z7b8(this.f$0, i, j, j2, i2, i3);
                }
            }, new NativeInstance.RequestBroadcastPartCallback() {
                @Override
                public final void run(long j, long j2, int i2, int i3) {
                    VoIPService.$r8$lambda$UunDNvjCxEcMyTp1N3y9lCdpxrM(this.f$0, i, j, j2, i2, i3);
                }
            }, new NativeInstance.RequestCurrentTimeCallback() {
                @Override
                public final void run(long j) {
                    VoIPService.$r8$lambda$1YV7NCCm4GaGaSPDFJARuVABgMw(this.f$0, i, j);
                }
            }, this.conference != null);
            this.tgVoip[i].setOnStateUpdatedListener(new Instance.OnStateUpdatedListener() {
                @Override
                public final void onStateUpdated(int i2, boolean z4) {
                    this.f$0.updateConnectionState(i, i2, z4);
                }
            });
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

    public static void $r8$lambda$WCWxve0nY4U0S36PetJWXDkgFBE(VoIPService voIPService, int i, boolean[] zArr, int i2, String str) {
        if (i == 0) {
            if (voIPService.conference != null) {
                voIPService.startConferenceGroupCall(false, i2, str, !zArr[0]);
            } else {
                voIPService.startGroupCall(i2, str, true);
            }
            zArr[0] = false;
            return;
        }
        voIPService.startScreenCapture(i2, str);
    }

    public static void m1203$r8$lambda$e_s3KWNzjJ3fRRmnO_OaT9djE(VoIPService voIPService, int i, int[] iArr, float[] fArr, boolean[] zArr) {
        if (sharedInstance == null) {
            voIPService.getClass();
            return;
        }
        ChatObject.Call call = voIPService.groupCall;
        if (call == null || i != 0) {
            return;
        }
        call.processVoiceLevelsUpdate(iArr, fArr, zArr);
        float fMax = 0.0f;
        boolean z = false;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == 0) {
                if (voIPService.chat != null && voIPService.lastTypingTimeSend < SystemClock.uptimeMillis() - 5000 && fArr[i2] > 0.1f && zArr[i2]) {
                    voIPService.lastTypingTimeSend = SystemClock.uptimeMillis();
                    TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                    tL_messages_setTyping.action = new TLRPC.TL_speakingInGroupCallAction();
                    tL_messages_setTyping.peer = MessagesController.getInputPeer(voIPService.chat);
                    ConnectionsManager.getInstance(voIPService.currentAccount).sendRequest(tL_messages_setTyping, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            VoIPService.$r8$lambda$ihf_TgQlMZ9hVpHd61S65tYUha4(tLObject, tL_error);
                        }
                    });
                }
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.webRtcMicAmplitudeEvent, Float.valueOf(fArr[i2]));
            } else {
                fMax = Math.max(fMax, fArr[i2]);
                z = true;
            }
        }
        if (z) {
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.webRtcSpeakerAmplitudeEvent, Float.valueOf(fMax));
            NativeInstance.AudioLevelsCallback audioLevelsCallback2 = audioLevelsCallback;
            if (audioLevelsCallback2 != null) {
                audioLevelsCallback2.run(iArr, fArr, zArr);
            }
        }
    }

    public static void $r8$lambda$7uUFlSpayjC9p2go3nxqUj55u7A(final VoIPService voIPService, int i, final long j, final int[] iArr) {
        if (sharedInstance == null) {
            voIPService.getClass();
            return;
        }
        ChatObject.Call call = voIPService.groupCall;
        if (call == null || i != 0) {
            return;
        }
        call.processUnknownVideoParticipants(iArr, new ChatObject.Call.OnParticipantsLoad() {
            @Override
            public final void onLoad(ArrayList arrayList) {
                VoIPService.$r8$lambda$O8s1FUu7Lv47vEE_GHMYYaDMWg0(this.f$0, j, iArr, arrayList);
            }
        });
    }

    public static void $r8$lambda$O8s1FUu7Lv47vEE_GHMYYaDMWg0(VoIPService voIPService, long j, int[] iArr, ArrayList arrayList) {
        if (sharedInstance == null) {
            voIPService.getClass();
        } else {
            if (voIPService.groupCall == null) {
                return;
            }
            voIPService.broadcastUnknownParticipants(j, iArr);
        }
    }

    public static void $r8$lambda$9LXeGBNReYbMbKUHQJhc_R5Z7b8(final VoIPService voIPService, final int i, final long j, long j2, final int i2, final int i3) {
        StringBuilder sb;
        voIPService.getClass();
        if (i != 0) {
            return;
        }
        TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
        tL_upload_getFile.limit = 131072;
        TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
        tL_inputGroupCallStream.call = voIPService.groupCall.getInputGroupCall();
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
            sb = new StringBuilder();
            sb.append("");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("_");
            sb.append(j);
            sb.append("_");
            sb.append(i3);
        }
        final String string = sb.toString();
        final int iSendRequest = AccountInstance.getInstance(voIPService.currentAccount).getConnectionsManager().sendRequest(tL_upload_getFile, new RequestDelegateTimestamp() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
                VoIPService.$r8$lambda$0mkA2wKfGPQs0wjOc9p0uSIuRVQ(this.f$0, string, i, j, i2, i3, tLObject, tL_error, j3);
            }
        }, 65536, 2, voIPService.groupCall.call.stream_dc_id);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.currentStreamRequestTimestamp.put(string, Integer.valueOf(iSendRequest));
            }
        });
    }

    public static void $r8$lambda$0mkA2wKfGPQs0wjOc9p0uSIuRVQ(final VoIPService voIPService, final String str, final int i, long j, int i2, int i3, TLObject tLObject, TLRPC.TL_error tL_error, long j2) {
        voIPService.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.currentStreamRequestTimestamp.remove(str);
            }
        });
        NativeInstance nativeInstance = voIPService.tgVoip[i];
        if (nativeInstance == null) {
            return;
        }
        if (tLObject != null) {
            NativeByteBuffer nativeByteBuffer = ((TLRPC.TL_upload_file) tLObject).bytes;
            nativeInstance.onStreamPartAvailable(j, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j2, i2, i3);
        } else if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.createGroupInstance(i, false, true);
                }
            });
        } else {
            voIPService.tgVoip[i].onStreamPartAvailable(j, null, ("TIME_TOO_BIG".equals(tL_error.text) || tL_error.text.startsWith("FLOOD_WAIT")) ? 0 : -1, j2, i2, i3);
        }
    }

    public static void $r8$lambda$UunDNvjCxEcMyTp1N3y9lCdpxrM(final VoIPService voIPService, int i, final long j, long j2, final int i2, final int i3) {
        voIPService.getClass();
        if (i != 0) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$_nW05YTsCbgLsNTQANupJ0EocgY(this.f$0, i2, j, i3);
            }
        });
    }

    public static void $r8$lambda$_nW05YTsCbgLsNTQANupJ0EocgY(VoIPService voIPService, int i, long j, int i2) {
        String str;
        voIPService.getClass();
        if (i == 0) {
            str = "" + j;
        } else {
            str = i + "_" + j + "_" + i2;
        }
        Integer num = voIPService.currentStreamRequestTimestamp.get(str);
        if (num != null) {
            AccountInstance.getInstance(voIPService.currentAccount).getConnectionsManager().cancelRequest(num.intValue(), true);
            voIPService.currentStreamRequestTimestamp.remove(str);
        }
    }

    public static void $r8$lambda$1YV7NCCm4GaGaSPDFJARuVABgMw(final VoIPService voIPService, final int i, final long j) {
        TLRPC.GroupCall groupCall;
        ChatObject.Call call = voIPService.groupCall;
        if (call != null && (groupCall = call.call) != null && groupCall.rtmp_stream) {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            getgroupcallstreamchannels.call = voIPService.groupCall.getInputGroupCall();
            ChatObject.Call call2 = voIPService.groupCall;
            if (call2 == null || call2.call == null || voIPService.tgVoip[i] == null) {
                NativeInstance nativeInstance = voIPService.tgVoip[i];
                if (nativeInstance != null) {
                    nativeInstance.onRequestTimeComplete(j, 0L);
                    return;
                }
                return;
            }
            ConnectionsManager.getInstance(voIPService.currentAccount).sendRequest(getgroupcallstreamchannels, new RequestDelegateTimestamp() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j2) {
                    VoIPService.$r8$lambda$iIswkx9iNuSkBlXfbMgugCc_AtQ(this.f$0, i, j, tLObject, tL_error, j2);
                }
            }, 65536, 2, voIPService.groupCall.call.stream_dc_id);
            return;
        }
        NativeInstance nativeInstance2 = voIPService.tgVoip[i];
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(j, ConnectionsManager.getInstance(voIPService.currentAccount).getCurrentTimeMillis());
        }
    }

    public static void $r8$lambda$iIswkx9iNuSkBlXfbMgugCc_AtQ(VoIPService voIPService, int i, long j, TLObject tLObject, TLRPC.TL_error tL_error, long j2) {
        long j3 = 0;
        if (tL_error == null) {
            voIPService.getClass();
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            j3 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            ChatObject.Call call = voIPService.groupCall;
            if (!call.loadedRtmpStreamParticipant) {
                call.createRtmpStreamParticipant(groupcallstreamchannels.channels);
                voIPService.groupCall.loadedRtmpStreamParticipant = true;
            }
        }
        NativeInstance nativeInstance = voIPService.tgVoip[i];
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j, j3);
        }
    }

    public void updateConnectionState(final int i, int i2, boolean z) {
        if (i != 0) {
            return;
        }
        dispatchStateChanged((i2 == 1 || this.switchingStream) ? 3 : 5);
        if (this.switchingStream && (i2 == 0 || (i2 == 1 && z))) {
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    VoIPService.m1199$r8$lambda$Z16JJjGa9Hqa5p5dBV1ZzlV5IA(this.f$0, i);
                }
            };
            this.switchingStreamTimeoutRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 3000L);
        }
        if (i2 == 0) {
            startGroupCheckShortpoll();
            if (!this.playedConnectedSound || this.spPlayId != 0 || this.switchingStream || this.switchingAccount) {
                return;
            }
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.m1185$r8$lambda$EUu2wxoAhhwVt9X1_17o2sioTg(this.f$0);
                }
            });
            return;
        }
        cancelGroupCheckShortPoll();
        if (!z) {
            this.switchingStream = false;
            this.switchingAccount = false;
        }
        Runnable runnable2 = this.switchingStreamTimeoutRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.switchingStreamTimeoutRunnable = null;
        }
        if (this.playedConnectedSound) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.m1201$r8$lambda$bOznTLrvFyyp2OwbaB480bA(this.f$0);
                }
            });
            Runnable runnable3 = this.connectingSoundRunnable;
            if (runnable3 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable3);
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

    public static void m1199$r8$lambda$Z16JJjGa9Hqa5p5dBV1ZzlV5IA(VoIPService voIPService, int i) {
        if (voIPService.switchingStreamTimeoutRunnable == null) {
            return;
        }
        voIPService.switchingStream = false;
        voIPService.updateConnectionState(i, 0, true);
        voIPService.switchingStreamTimeoutRunnable = null;
    }

    public static void m1185$r8$lambda$EUu2wxoAhhwVt9X1_17o2sioTg(VoIPService voIPService) {
        int i = voIPService.spPlayId;
        if (i != 0) {
            voIPService.soundPool.stop(i);
        }
        voIPService.spPlayId = voIPService.soundPool.play(voIPService.spVoiceChatConnecting, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public static void m1201$r8$lambda$bOznTLrvFyyp2OwbaB480bA(VoIPService voIPService) {
        int i = voIPService.spPlayId;
        if (i != 0) {
            voIPService.soundPool.stop(i);
            voIPService.spPlayId = 0;
        }
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

    public boolean isSwitchingStream() {
        return this.switchingStream;
    }

    private void initiateActualEncryptedCall() {
        HashSet hashSet;
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
            if (stringSet != null) {
                hashSet = new HashSet(stringSet);
            } else {
                hashSet = new HashSet();
            }
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
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        VoIPService.$r8$lambda$8mDJhFOhhnuynlB8eNsf2zV6W50(this.f$0);
                    }
                });
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
                if (this.videoCall && (Build.VERSION.SDK_INT < 23 || checkSelfPermission("android.permission.CAMERA") == 0)) {
                    this.captureDevice[0] = NativeInstance.createVideoCapturer(this.localSink[0], this.isFrontFaceCamera ? 1 : 0);
                    this.videoState[0] = 2;
                } else {
                    this.videoState[0] = 0;
                }
            }
            this.tgVoip[0] = Instance.makeInstance(this.privateCall.protocol.library_versions.get(0), config, absolutePath, endpointArr, proxy, getNetworkType(), encryptionKey, this.remoteSink[0], this.captureDevice[0], new NativeInstance.AudioLevelsCallback() {
                @Override
                public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
                    VoIPService.$r8$lambda$XWbbfJkWvsVgKJp__XfQWFhTkbw(this.f$0, iArr, fArr, zArr);
                }
            });
            this.tgVoip[0].setOnStateUpdatedListener(new Instance.OnStateUpdatedListener() {
                @Override
                public final void onStateUpdated(int i7, boolean z7) {
                    this.f$0.onConnectionStateChanged(i7, z7);
                }
            });
            this.tgVoip[0].setOnSignalBarsUpdatedListener(new Instance.OnSignalBarsUpdatedListener() {
                @Override
                public final void onSignalBarsUpdated(int i7) {
                    this.f$0.onSignalBarCountChanged(i7);
                }
            });
            this.tgVoip[0].setOnSignalDataListener(new Instance.OnSignalingDataListener() {
                @Override
                public final void onSignalingData(byte[] bArr) {
                    this.f$0.onSignalingData(bArr);
                }
            });
            this.tgVoip[0].setOnRemoteMediaStateUpdatedListener(new Instance.OnRemoteMediaStateUpdatedListener() {
                @Override
                public final void onMediaStateUpdated(int i7, int i8) {
                    VoIPService.$r8$lambda$MyaLnAPjo0qTErU2_bQjcRJxJB4(this.f$0, i7, i8);
                }
            });
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

    public static void $r8$lambda$8mDJhFOhhnuynlB8eNsf2zV6W50(VoIPService voIPService) {
        voIPService.getClass();
        Toast.makeText(voIPService, "This call uses TCP which will degrade its quality.", 0).show();
    }

    public static void $r8$lambda$XWbbfJkWvsVgKJp__XfQWFhTkbw(VoIPService voIPService, int[] iArr, float[] fArr, boolean[] zArr) {
        if (sharedInstance == null) {
            voIPService.getClass();
        } else {
            if (voIPService.privateCall == null) {
                return;
            }
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.webRtcMicAmplitudeEvent, Float.valueOf(fArr[0]));
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.webRtcSpeakerAmplitudeEvent, Float.valueOf(fArr[1]));
        }
    }

    public static void $r8$lambda$MyaLnAPjo0qTErU2_bQjcRJxJB4(final VoIPService voIPService, final int i, final int i2) {
        voIPService.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.m1177$r8$lambda$4JckTfrZx48zgks8FfKvqbEfME(this.f$0, i, i2);
            }
        });
    }

    public static void m1177$r8$lambda$4JckTfrZx48zgks8FfKvqbEfME(VoIPService voIPService, int i, int i2) {
        voIPService.remoteAudioState = i;
        voIPService.remoteVideoState = i2;
        voIPService.checkIsNear();
        for (int i3 = 0; i3 < voIPService.stateListeners.size(); i3++) {
            voIPService.stateListeners.get(i3).onMediaStateUpdated(i, i2);
        }
    }

    public void playConnectedSound() {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VoIPService voIPService = this.f$0;
                voIPService.soundPool.play(voIPService.spVoiceChatStartId, 1.0f, 1.0f, 0, 0, 1.0f);
            }
        });
        this.playedConnectedSound = true;
    }

    private void startConnectingSound() {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$lXHiLvkp5O1sG_WskScLwbL673Q(this.f$0);
            }
        });
    }

    public static void $r8$lambda$lXHiLvkp5O1sG_WskScLwbL673Q(VoIPService voIPService) {
        int i = voIPService.spPlayId;
        if (i != 0) {
            voIPService.soundPool.stop(i);
        }
        int iPlay = voIPService.soundPool.play(voIPService.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
        voIPService.spPlayId = iPlay;
        if (iPlay == 0) {
            AnonymousClass9 anonymousClass9 = voIPService.new AnonymousClass9();
            voIPService.connectingSoundRunnable = anonymousClass9;
            AndroidUtilities.runOnUIThread(anonymousClass9, 100L);
        }
    }

    class AnonymousClass9 implements Runnable {
        AnonymousClass9() {
        }

        @Override
        public void run() {
            if (VoIPService.sharedInstance == null) {
                return;
            }
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.AnonymousClass9.$r8$lambda$LCToz6LH5JQCd5rZg7r6MDStldo(this.f$0);
                }
            });
        }

        public static void $r8$lambda$LCToz6LH5JQCd5rZg7r6MDStldo(AnonymousClass9 anonymousClass9) {
            if (VoIPService.this.spPlayId == 0) {
                VoIPService voIPService = VoIPService.this;
                voIPService.spPlayId = voIPService.soundPool.play(VoIPService.this.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
            }
            if (VoIPService.this.spPlayId != 0) {
                VoIPService.this.connectingSoundRunnable = null;
            } else {
                AndroidUtilities.runOnUIThread(anonymousClass9, 100L);
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

    public boolean isVideoAvailable() {
        return this.isVideoAvailable;
    }

    void onMediaButtonEvent(KeyEvent keyEvent) {
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

    public byte[] getGA() {
        return this.g_a;
    }

    public void forceRating() {
        this.forceRating = true;
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

    public boolean hasEarpiece() {
        CallConnection callConnection;
        if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null && callConnection.getCallAudioState() != null) {
            return (this.systemCallConnection.getCallAudioState().getSupportedRouteMask() & 5) != 0;
        }
        if (((TelephonyManager) getSystemService("phone")).getPhoneType() != 0) {
            return true;
        }
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

    public int getStatsNetworkType() {
        NetworkInfo networkInfo = this.lastNetInfo;
        if (networkInfo == null || networkInfo.getType() != 0) {
            return 1;
        }
        return this.lastNetInfo.isRoaming() ? 2 : 0;
    }

    protected void setSwitchingCamera(boolean z, boolean z2) {
        this.switchingCamera = z;
        if (z) {
            return;
        }
        this.isFrontFaceCamera = z2;
        for (int i = 0; i < this.stateListeners.size(); i++) {
            this.stateListeners.get(i).onCameraSwitch(this.isFrontFaceCamera);
        }
    }

    protected void onCameraFirstFrameAvailable() {
        for (int i = 0; i < this.stateListeners.size(); i++) {
            this.stateListeners.get(i).onCameraFirstFrameAvailable();
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

    public void unregisterStateListener(StateListener stateListener) {
        this.stateListeners.remove(stateListener);
    }

    public void editCallMember(TLObject tLObject, Boolean bool, Boolean bool2, Integer num, Boolean bool3, final Runnable runnable) {
        TLRPC.InputPeer inputPeer;
        if (tLObject == null || this.groupCall == null) {
            return;
        }
        TL_phone.editGroupCallParticipant editgroupcallparticipant = new TL_phone.editGroupCallParticipant();
        editgroupcallparticipant.call = this.groupCall.getInputGroupCall();
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (UserObject.isUserSelf(user) && (inputPeer = this.groupCallPeer) != null) {
                editgroupcallparticipant.participant = inputPeer;
            } else {
                editgroupcallparticipant.participant = MessagesController.getInputPeer(user);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("edit group call part id = " + editgroupcallparticipant.participant.user_id + " access_hash = " + editgroupcallparticipant.participant.user_id);
                }
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            editgroupcallparticipant.participant = MessagesController.getInputPeer((TLRPC.Chat) tLObject);
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb = new StringBuilder();
                sb.append("edit group call part id = ");
                TLRPC.InputPeer inputPeer2 = editgroupcallparticipant.participant;
                long j = inputPeer2.chat_id;
                if (j == 0) {
                    j = inputPeer2.channel_id;
                }
                sb.append(j);
                sb.append(" access_hash = ");
                sb.append(editgroupcallparticipant.participant.access_hash);
                FileLog.d(sb.toString());
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
            FileLog.d("edit group call flags = " + editgroupcallparticipant.flags);
        }
        final int i = this.currentAccount;
        AccountInstance.getInstance(i).getConnectionsManager().sendRequest(editgroupcallparticipant, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                VoIPService.$r8$lambda$__7_OaqtpRnEyEEZwBy0fZwOygA(this.f$0, i, runnable, tLObject2, tL_error);
            }
        });
    }

    public static void $r8$lambda$__7_OaqtpRnEyEEZwBy0fZwOygA(VoIPService voIPService, int i, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        voIPService.getClass();
        if (tLObject != null) {
            AccountInstance.getInstance(i).getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        } else if (tL_error != null && "GROUPCALL_VIDEO_TOO_MUCH".equals(tL_error.text)) {
            voIPService.groupCall.reloadGroupCall();
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public boolean isMicMute() {
        return this.micMute;
    }

    public void toggleSpeakerphoneOrShowRouteSheet(Context context, boolean z) {
        toggleSpeakerphoneOrShowRouteSheet(context, z, null);
    }

    public void switchToSpeaker() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.m1191$r8$lambda$PEvuSZ7Kyv4FtLzmboLuw905to(this.f$0);
            }
        }, 500L);
    }

    public static void m1191$r8$lambda$PEvuSZ7Kyv4FtLzmboLuw905to(final VoIPService voIPService) {
        voIPService.getClass();
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if ((voIPService.isBluetoothHeadsetConnected() && voIPService.hasEarpiece()) || voIPService.isHeadsetPlugged || voIPService.isSpeakerphoneOn()) {
            return;
        }
        voipAudioManager.setSpeakerphoneOn(true);
        voipAudioManager.isBluetoothAndSpeakerOnAsync(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                VoIPService.$r8$lambda$Sj9IkSUWV1oIxYFCR8XXii95iM4(this.f$0, (Boolean) obj, (Boolean) obj2);
            }
        });
    }

    public static void $r8$lambda$Sj9IkSUWV1oIxYFCR8XXii95iM4(VoIPService voIPService, Boolean bool, Boolean bool2) {
        voIPService.updateOutputGainControlState();
        ArrayList<StateListener> arrayList = voIPService.stateListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StateListener stateListener = arrayList.get(i);
            i++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public void toggleSpeakerphoneOrShowRouteSheet(Context context, boolean z, final Integer num) {
        CallConnection callConnection;
        int i = 0;
        if (isBluetoothHeadsetConnected() && hasEarpiece()) {
            BottomSheet.Builder cellType = new BottomSheet.Builder(context).setTitle(LocaleController.getString(R.string.VoipOutputDevices), true).selectedPos(num).setCellType(num != null ? BottomSheet.Builder.CELL_TYPE_CALL : 0);
            String string = LocaleController.getString(R.string.VoipAudioRoutingSpeaker);
            String string2 = LocaleController.getString(this.isHeadsetPlugged ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingEarpiece);
            String string3 = this.currentBluetoothDeviceName;
            if (string3 == null) {
                string3 = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
            }
            BottomSheet.Builder items = cellType.setItems(new CharSequence[]{string, string2, string3}, new int[]{R.drawable.msg_call_speaker, this.isHeadsetPlugged ? R.drawable.calls_menu_headset : R.drawable.msg_call_earpiece, R.drawable.msg_call_bluetooth}, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    VoIPService.$r8$lambda$_ezcrWK1iGZdtik5O2Lx7JpTwKk(this.f$0, dialogInterface, i2);
                }
            });
            final BottomSheet bottomSheetCreate = items.create();
            bottomSheetCreate.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    VoIPService.m1202$r8$lambda$ehpzHbar0wrE5t2DJBpcihOqlU(bottomSheetCreate, num, dialogInterface);
                }
            });
            if (z) {
                if (Build.VERSION.SDK_INT >= 26) {
                    bottomSheetCreate.getWindow().setType(2038);
                } else {
                    bottomSheetCreate.getWindow().setType(2003);
                }
            }
            items.show();
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
                voipAudioManager.isBluetoothAndSpeakerOnAsync(new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        VoIPService.$r8$lambda$qjgLgIPg2vVc2JikEFgqmT7uVwA(this.f$0, (Boolean) obj, (Boolean) obj2);
                    }
                });
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

    public static void $r8$lambda$_ezcrWK1iGZdtik5O2Lx7JpTwKk(VoIPService voIPService, DialogInterface dialogInterface, int i) {
        voIPService.getClass();
        if (getSharedInstance() == null) {
            return;
        }
        voIPService.setAudioOutput(i);
    }

    public static void m1202$r8$lambda$ehpzHbar0wrE5t2DJBpcihOqlU(BottomSheet bottomSheet, Integer num, DialogInterface dialogInterface) {
        for (int i = 0; i < bottomSheet.getItemViews().size(); i++) {
            int i2 = Theme.key_dialogTextBlack;
            bottomSheet.setItemColor(i, Theme.getColor(i2), Theme.getColor(i2));
        }
        if (num != null) {
            int color = Theme.getColor(Theme.key_dialogTextLink);
            bottomSheet.setItemColor(num.intValue(), color, color);
        }
    }

    public static void $r8$lambda$qjgLgIPg2vVc2JikEFgqmT7uVwA(VoIPService voIPService, Boolean bool, Boolean bool2) {
        voIPService.updateOutputGainControlState();
        ArrayList<StateListener> arrayList = voIPService.stateListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StateListener stateListener = arrayList.get(i);
            i++;
            stateListener.onAudioSettingsChanged();
        }
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
                    if (!this.bluetoothScoActive) {
                        this.needSwitchToBluetoothAfterScoActivates = true;
                        try {
                            audioManager.startBluetoothSco();
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    } else {
                        audioManager.setBluetoothScoOn(true);
                        voipAudioManager.setSpeakerphoneOn(false);
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
        if (this.audioConfigured && !z) {
            return hasEarpiece() ? VoipAudioManager.get().isSpeakerphoneOn() : ((AudioManager) getSystemService("audio")).isBluetoothScoOn();
        }
        return this.speakerphoneStateToSet;
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
        }
        if (this.audioConfigured) {
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            if (audioManager.isBluetoothScoOn()) {
                return 2;
            }
            return voipAudioManager.isSpeakerphoneOn() ? 1 : 0;
        }
        return this.audioRouteToSet;
    }

    public String getDebugString() {
        NativeInstance nativeInstance = this.tgVoip[0];
        return nativeInstance != null ? nativeInstance.getDebugInfo() : "";
    }

    @Override
    public long getCallDuration() {
        if (this.callStartTime == 0) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.callStartTime;
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
            if (bitmap == null || !(e2 instanceof IllegalArgumentException)) {
                return;
            }
            showNotification(str, null);
        }
    }

    private void startRingtoneAndVibration(long j) {
        int i;
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
                        VoIPService.m1174$r8$lambda$fIOorHUu4TIrsbyV3VE0vQua0A(this.f$0, mediaPlayer2);
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
                    if (string == null) {
                        defaultUri = RingtoneManager.getDefaultUri(1);
                    } else {
                        Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
                        if (uri != null && string.equalsIgnoreCase(uri.getPath())) {
                            defaultUri = RingtoneManager.getDefaultUri(1);
                        } else {
                            defaultUri = Uri.parse(string);
                            z = false;
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
                            } else if (i == 3) {
                                j2 = 1400;
                            } else {
                                j2 = 700;
                            }
                            vibrator.vibrate(new long[]{0, j2, 500}, 0);
                        }
                    }
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
                    } else if (i == 3) {
                        j2 = 1400;
                    } else {
                        j2 = 700;
                    }
                    vibrator2.vibrate(new long[]{0, j2, 500}, 0);
                } else {
                    Vibrator vibrator3 = (Vibrator) getSystemService("vibrator");
                    this.vibrator = vibrator3;
                    if (i == 1) {
                        j2 = 350;
                    } else if (i == 3) {
                        j2 = 1400;
                    } else {
                        j2 = 700;
                    }
                    vibrator3.vibrate(new long[]{0, j2, 500}, 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void m1174$r8$lambda$fIOorHUu4TIrsbyV3VE0vQua0A(VoIPService voIPService, MediaPlayer mediaPlayer) {
        voIPService.getClass();
        try {
            voIPService.ringtonePlayer.start();
        } catch (Throwable th) {
            FileLog.e(th);
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
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didEndCall, new Object[0]);
            }
        });
        if (this.tgVoip[0] != null) {
            StatsController.getInstance(this.currentAccount).incrementTotalCallsTime(getStatsNetworkType(), ((int) (getCallDuration() / 1000)) % 5);
            onTgVoipPreStop();
            if (this.tgVoip[0].isGroup()) {
                NativeInstance nativeInstance = this.tgVoip[0];
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                Objects.requireNonNull(nativeInstance);
                dispatchQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda105(nativeInstance));
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
            Utilities.globalQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda105(nativeInstance2));
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
        final AudioManager audioManager = (AudioManager) getSystemService("audio");
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
                    Runnable runnable3 = new Runnable() {
                        @Override
                        public final void run() {
                            VoIPService.$r8$lambda$E5rDrTp9Td2_AhnvyRtiSASzdL0(audioManager);
                        }
                    };
                    setModeRunnable = runnable3;
                    dispatchQueue2.postRunnable(runnable3);
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
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.$r8$lambda$uHIAtJuYirzbAJcZ5sSsjCjkKAw(this.f$0);
                }
            });
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
        Runnable runnable4 = this.onDestroyRunnable;
        if (runnable4 != null) {
            runnable4.run();
        }
        int i2 = this.currentAccount;
        if (i2 >= 0) {
            ConnectionsManager.getInstance(i2).setAppPaused(true, false);
            if (ChatObject.isChannel(this.chat)) {
                MessagesController.getInstance(this.currentAccount).startShortPoll(this.chat, this.classGuid, true);
            }
        }
    }

    public static void $r8$lambda$E5rDrTp9Td2_AhnvyRtiSASzdL0(AudioManager audioManager) {
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

    public static void $r8$lambda$uHIAtJuYirzbAJcZ5sSsjCjkKAw(VoIPService voIPService) {
        SoundPool soundPool = voIPService.soundPool;
        if (soundPool != null) {
            soundPool.release();
        }
    }

    public long getCallID() {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        if (phoneCall != null) {
            return phoneCall.id;
        }
        return 0L;
    }

    public long getGroupCallID() {
        TLRPC.GroupCall groupCall;
        ChatObject.Call call = this.groupCall;
        if (call == null || (groupCall = call.call) == null) {
            return 0L;
        }
        return groupCall.id;
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

    @Override
    public void acceptIncomingCall() {
        updateCurrentForegroundType();
        MessagesController.getInstance(this.currentAccount).ignoreSetOnline = false;
        stopRinging();
        showNotification();
        configureDeviceForCall();
        startConnectingSound();
        dispatchStateChanged(12);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didStartedCall, new Object[0]);
            }
        });
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        tL_messages_getDhConfig.version = messagesStorage.getLastSecretVersion();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDhConfig, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPService.$r8$lambda$XqQjqyw7XY3RbWBhsTUFaHFkNlw(this.f$0, messagesStorage, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$XqQjqyw7XY3RbWBhsTUFaHFkNlw(final VoIPService voIPService, MessagesStorage messagesStorage, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            voIPService.getClass();
            TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
            if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                if (!Utilities.isGoodPrime(messages_dhconfig.p, messages_dhconfig.g)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("stopping VoIP service, bad prime");
                    }
                    voIPService.callFailed();
                    return;
                } else {
                    messagesStorage.setSecretPBytes(messages_dhconfig.p);
                    messagesStorage.setSecretG(messages_dhconfig.g);
                    messagesStorage.setLastSecretVersion(messages_dhconfig.version);
                    MessagesStorage.getInstance(voIPService.currentAccount).saveSecretParams(messagesStorage.getLastSecretVersion(), messagesStorage.getSecretG(), messagesStorage.getSecretPBytes());
                }
            }
            byte[] bArr = new byte[256];
            for (int i = 0; i < 256; i++) {
                bArr[i] = (byte) (((byte) (Utilities.random.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i]);
            }
            if (voIPService.privateCall == null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("call is null");
                }
                voIPService.callFailed();
                return;
            }
            voIPService.a_or_b = bArr;
            BigInteger bigIntegerModPow = BigInteger.valueOf(messagesStorage.getSecretG()).modPow(new BigInteger(1, bArr), new BigInteger(1, messagesStorage.getSecretPBytes()));
            voIPService.g_a_hash = voIPService.privateCall.g_a_hash;
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
            TL_phone.PhoneCall phoneCall = voIPService.privateCall;
            tL_inputPhoneCall.id = phoneCall.id;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol = new TL_phone.TL_phoneCallProtocol();
            acceptcall.protocol = tL_phoneCallProtocol;
            tL_phoneCallProtocol.udp_reflector = true;
            tL_phoneCallProtocol.udp_p2p = true;
            tL_phoneCallProtocol.min_layer = 65;
            tL_phoneCallProtocol.max_layer = Instance.getConnectionMaxLayer();
            Collections.addAll(acceptcall.protocol.library_versions, NativeInstance.getAllVersions());
            ConnectionsManager.getInstance(voIPService.currentAccount).sendRequest(acceptcall, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    VoIPService.$r8$lambda$FqRIzrpYkfR0VTljkrFPg2H0tX0(this.f$0, tLObject2, tL_error2);
                }
            }, 65536);
            return;
        }
        voIPService.callFailed();
    }

    public static void $r8$lambda$FqRIzrpYkfR0VTljkrFPg2H0tX0(final VoIPService voIPService, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        voIPService.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$bsXswpFmVIRPTakR0SjA7Oor6ZA(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void $r8$lambda$bsXswpFmVIRPTakR0SjA7Oor6ZA(VoIPService voIPService, TLRPC.TL_error tL_error, TLObject tLObject) {
        voIPService.getClass();
        if (tL_error == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("accept call ok! " + tLObject);
            }
            TL_phone.PhoneCall phoneCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
            voIPService.privateCall = phoneCall;
            if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
                voIPService.onCallUpdated(phoneCall);
                return;
            }
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("Error on phone.acceptCall: " + tL_error);
        }
        voIPService.callFailed();
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
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        VoIPService.m1178$r8$lambda$9WJqJHIL_F88sjqOlnyaCjHYBg(this.f$0);
                    }
                }, 5000L);
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
        } else if (i == 5) {
            TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall tL_phoneCallDiscardReasonMigrateConferenceCall = new TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall();
            discardcall.reason = tL_phoneCallDiscardReasonMigrateConferenceCall;
            tL_phoneCallDiscardReasonMigrateConferenceCall.slug = "";
        } else {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonHangup();
        }
        FileLog.e("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPService.$r8$lambda$vPwcfz38ieq7zLoAZOYcf9skq1Q(this.f$0, tLObject, tL_error);
            }
        }, 65536);
        this.onDestroyRunnable = runnable;
        callEnded();
    }

    public static void m1178$r8$lambda$9WJqJHIL_F88sjqOlnyaCjHYBg(VoIPService voIPService) {
        if (voIPService.currentState == 10) {
            voIPService.callEnded();
        }
    }

    public static void $r8$lambda$vPwcfz38ieq7zLoAZOYcf9skq1Q(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        voIPService.getClass();
        if (tL_error != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_updates) {
            MessagesController.getInstance(voIPService.currentAccount).processUpdates((TLRPC.TL_updates) tLObject, false);
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("phone.discardCall " + tLObject);
        }
    }

    @Override
    public void declineIncomingCall() {
        declineIncomingCall(1, null);
    }

    private Class<? extends Activity> getUIActivityClass() {
        return LaunchActivity.class;
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
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        VoIPService.m1188$r8$lambda$LLDYO9cNfOzRgqxSoZ6K5O7iQ0(this.f$0);
                    }
                };
                this.delayedStartOutgoingCall = runnable;
                AndroidUtilities.runOnUIThread(runnable, 2000L);
            }
            this.systemCallConnection.setAddress(Uri.fromParts("tel", "+99084" + this.user.id, null), 1);
            CallConnection callConnection2 = this.systemCallConnection;
            TLRPC.User user = this.user;
            callConnection2.setCallerDisplayName(ContactsController.formatName(user.first_name, user.last_name), 1);
        }
        return this.systemCallConnection;
    }

    public static void m1188$r8$lambda$LLDYO9cNfOzRgqxSoZ6K5O7iQ0(VoIPService voIPService) {
        voIPService.delayedStartOutgoingCall = null;
        voIPService.startOutgoingCall();
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
            FileLog.d("starting ringing for call " + this.privateCall.id);
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

    public void startRingtoneAndVibration() {
        if (this.startedRinging) {
            return;
        }
        startRingtoneAndVibration(this.user.id);
        this.startedRinging = true;
    }

    private void updateServerConfig() {
        final SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
        Instance.setGlobalServerConfig(mainSettings.getString("voip_server_config", "{}"));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_phone.getCallConfig(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPService.$r8$lambda$ky0Ni3_eN3vaYNjuGuhVV0p6TQM(mainSettings, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$ky0Ni3_eN3vaYNjuGuhVV0p6TQM(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            String str = ((TLRPC.TL_dataJSON) tLObject).data;
            Instance.setGlobalServerConfig(str);
            sharedPreferences.edit().putString("voip_server_config", str).commit();
        }
    }

    private void showNotification() {
        if (this.user != null) {
            showNotification(getTitle(), getRoundAvatarBitmap(this, this.currentAccount, this.user));
        } else {
            showNotification(getTitle(), getRoundAvatarBitmap(this, this.currentAccount, this.chat));
        }
    }

    public static String convertStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    public static String getStringFromFile(String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        String strConvertStreamToString = convertStreamToString(fileInputStream);
        fileInputStream.close();
        return strConvertStreamToString;
    }

    public boolean hasRate() {
        return this.needRateCall || this.forceRating;
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

    private void initializeAccountRelatedThings() {
        updateServerConfig();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.appDidLogout);
        ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
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
            if (callIShouldHavePutIntoIntent != null) {
                NotificationsController.checkOtherNotificationsChannel();
                Distribute$$ExternalSyntheticApiModelOutline1.m();
                Notification.Builder showWhen = Distribute$$ExternalSyntheticApiModelOutline0.m(this, NotificationsController.OTHER_NOTIFICATIONS_CHANNEL).setContentTitle(LocaleController.getString(R.string.VoipOutgoingCall)).setShowWhen(false);
                if (this.groupCall != null) {
                    showWhen.setSmallIcon(isMicMute() ? R.drawable.voicechat_muted : R.drawable.voicechat_active);
                } else {
                    showWhen.setSmallIcon(R.drawable.call);
                }
                this.foregroundStarted = true;
                if (i >= 33) {
                    this.foregroundId = 201;
                    Notification notificationBuild = showWhen.build();
                    this.foregroundNotification = notificationBuild;
                    int currentForegroundType = getCurrentForegroundType();
                    this.lastForegroundType = currentForegroundType;
                    startForeground(201, notificationBuild, currentForegroundType);
                    return;
                }
                this.foregroundId = 201;
                Notification notificationBuild2 = showWhen.build();
                this.foregroundNotification = notificationBuild2;
                startForeground(201, notificationBuild2);
                return;
            }
            NotificationsController.checkOtherNotificationsChannel();
            Distribute$$ExternalSyntheticApiModelOutline1.m();
            Notification.Builder showWhen2 = Distribute$$ExternalSyntheticApiModelOutline0.m(this, NotificationsController.OTHER_NOTIFICATIONS_CHANNEL).setContentTitle(LocaleController.getString(R.string.VoipCallEnded)).setShowWhen(false);
            showWhen2.setSmallIcon(R.drawable.call);
            this.foregroundStarted = true;
            if (i >= 33) {
                this.foregroundId = 201;
                Notification notificationBuild3 = showWhen2.build();
                this.foregroundNotification = notificationBuild3;
                int currentForegroundType2 = getCurrentForegroundType();
                this.lastForegroundType = currentForegroundType2;
                startForeground(201, notificationBuild3, currentForegroundType2);
                return;
            }
            this.foregroundId = 201;
            Notification notificationBuild4 = showWhen2.build();
            this.foregroundNotification = notificationBuild4;
            startForeground(201, notificationBuild4);
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
            int i = 0;
            boolean z = true;
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
            if (PermissionRequest.hasPermission("android.permission.BLUETOOTH_CONNECT") && selectedRoute.getDeviceType() == 3) {
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
                return;
            }
            updateBluetoothHeadsetState(audioManager.isBluetoothA2dpOn());
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    private void loadResources() {
        WebRtcAudioTrack.setAudioTrackUsageAttribute(2);
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$qJTa0sDyHNiZUWLO14xGDDoX1sM(this.f$0);
            }
        });
    }

    public static void $r8$lambda$qJTa0sDyHNiZUWLO14xGDDoX1sM(VoIPService voIPService) {
        voIPService.getClass();
        SoundPool soundPool = new SoundPool(1, 0, 0);
        voIPService.soundPool = soundPool;
        voIPService.spConnectingId = soundPool.load(voIPService, R.raw.voip_connecting, 1);
        voIPService.spRingbackID = voIPService.soundPool.load(voIPService, R.raw.voip_ringback, 1);
        voIPService.spFailedID = voIPService.soundPool.load(voIPService, R.raw.voip_failed, 1);
        voIPService.spEndId = voIPService.soundPool.load(voIPService, R.raw.voip_end, 1);
        voIPService.spBusyId = voIPService.soundPool.load(voIPService, R.raw.voip_busy, 1);
        voIPService.spVoiceChatEndId = voIPService.soundPool.load(voIPService, R.raw.voicechat_leave, 1);
        voIPService.spVoiceChatStartId = voIPService.soundPool.load(voIPService, R.raw.voicechat_join, 1);
        voIPService.spVoiceChatConnecting = voIPService.soundPool.load(voIPService, R.raw.voicechat_connecting, 1);
        voIPService.spAllowTalkId = voIPService.soundPool.load(voIPService, R.raw.voip_onallowtalk, 1);
        voIPService.spStartRecordId = voIPService.soundPool.load(voIPService, R.raw.voip_recordstart, 1);
    }

    public void dispatchStateChanged(int i) {
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

    private void configureDeviceForCall() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("configureDeviceForCall, route to set = " + this.audioRouteToSet);
        }
        WebRtcAudioTrack.setAudioTrackUsageAttribute(hasRtmpStream() ? 1 : 2);
        WebRtcAudioTrack.setAudioStreamType(hasRtmpStream() ? Integer.MIN_VALUE : 0);
        this.needPlayEndSound = true;
        final AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (!USE_CONNECTION_SERVICE) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.$r8$lambda$BromE5olAUSIpv1bhA_nBKrVvQE(this.f$0, audioManager);
                }
            });
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

    public static void $r8$lambda$BromE5olAUSIpv1bhA_nBKrVvQE(final VoIPService voIPService, final AudioManager audioManager) {
        voIPService.getClass();
        try {
            if (hasRtmpStream()) {
                audioManager.setMode(0);
                audioManager.setBluetoothScoOn(false);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        VoIPService.$r8$lambda$Th4iaD1c4X1DsGtbwwD7IR8H2pA();
                    }
                });
            } else {
                audioManager.setMode(3);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        VoIPService.$r8$lambda$yfcoxAq12BN5Fa5clAQgNzkQAKE(this.f$0, audioManager);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$Th4iaD1c4X1DsGtbwwD7IR8H2pA() {
        if (MediaController.getInstance().isMessagePaused()) {
            return;
        }
        MediaController.getInstance().pauseMessage(MediaController.getInstance().getPlayingMessageObject());
    }

    public static void $r8$lambda$yfcoxAq12BN5Fa5clAQgNzkQAKE(VoIPService voIPService, AudioManager audioManager) {
        voIPService.getClass();
        voIPService.hasAudioFocus = audioManager.requestAudioFocus(voIPService, 0, 2) == 1;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (voIPService.isBluetoothHeadsetConnected() && voIPService.hasEarpiece()) {
            int i = voIPService.audioRouteToSet;
            if (i == 0) {
                audioManager.setBluetoothScoOn(false);
                voipAudioManager.setSpeakerphoneOn(false);
            } else if (i == 1) {
                audioManager.setBluetoothScoOn(false);
                voipAudioManager.setSpeakerphoneOn(true);
            } else if (i == 2) {
                if (!voIPService.bluetoothScoActive) {
                    voIPService.needSwitchToBluetoothAfterScoActivates = true;
                    try {
                        audioManager.startBluetoothSco();
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                } else {
                    audioManager.setBluetoothScoOn(true);
                    voipAudioManager.setSpeakerphoneOn(false);
                }
            }
        } else if (voIPService.isBluetoothHeadsetConnected()) {
            audioManager.setBluetoothScoOn(voIPService.speakerphoneStateToSet);
        } else {
            voipAudioManager.setSpeakerphoneOn(voIPService.speakerphoneStateToSet);
            if (voIPService.speakerphoneStateToSet) {
                voIPService.audioRouteToSet = 1;
            } else {
                voIPService.audioRouteToSet = 0;
            }
            SensorEvent sensorEvent = voIPService.lastSensorEvent;
            if (sensorEvent != null) {
                voIPService.onSensorChanged(sensorEvent);
            }
        }
        voIPService.updateOutputGainControlState();
        voIPService.audioConfigured = true;
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
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.nearEarEvent, Boolean.valueOf(z));
    }

    private void checkIsNear() {
        if (this.remoteVideoState == 2 || this.videoState[0] == 2) {
            checkIsNear(false);
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

    public boolean isBluetoothHeadsetConnected() {
        CallConnection callConnection;
        if (!USE_CONNECTION_SERVICE || (callConnection = this.systemCallConnection) == null || callConnection.getCallAudioState() == null) {
            return this.isBtHeadsetConnected;
        }
        return (this.systemCallConnection.getCallAudioState().getSupportedRouteMask() & 2) != 0;
    }

    @Override
    public void onAudioFocusChange(int i) {
        if (i == 1) {
            this.hasAudioFocus = true;
        } else {
            this.hasAudioFocus = false;
        }
    }

    public void updateBluetoothHeadsetState(boolean z) {
        if (z == this.isBtHeadsetConnected) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("updateBluetoothHeadsetState: " + z);
        }
        this.isBtHeadsetConnected = z;
        final AudioManager audioManager = (AudioManager) getSystemService("audio");
        int i = 0;
        if (z && !isRinging() && this.currentState != 0) {
            if (this.bluetoothScoActive) {
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
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            audioManager.startBluetoothSco();
                        }
                    }, 500L);
                }
            }
        } else {
            this.bluetoothScoActive = false;
            this.bluetoothScoConnecting = false;
            audioManager.setBluetoothScoOn(false);
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i < size) {
            StateListener stateListener = arrayList.get(i);
            i++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public String getLastError() {
        return this.lastError;
    }

    @Override
    public int getCallState() {
        return this.currentState;
    }

    public TLRPC.InputPeer getGroupCallPeer() {
        return this.groupCallPeer;
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

    private NetworkInfo getActiveNetworkInfo() {
        return ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public void callFailed() {
        NativeInstance nativeInstance = this.tgVoip[0];
        callFailed(nativeInstance != null ? nativeInstance.getLastError() : "ERROR_UNKNOWN");
    }

    public static Bitmap getRoundAvatarBitmap(Context context, int i, TLObject tLObject) {
        AvatarDrawable avatarDrawable;
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
            if (tLObject instanceof TLRPC.User) {
                avatarDrawable = new AvatarDrawable((TLRPC.User) tLObject);
            } else {
                avatarDrawable = new AvatarDrawable((TLRPC.Chat) tLObject);
            }
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
                SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
                NotificationChannel notificationChannelM = zzo$$ExternalSyntheticApiModelOutline2.m("incoming_calls4" + i3, LocaleController.getString(R.string.IncomingCallsSystemSetting), 4);
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
            contentIntent.setStyle(Notification.CallStyle.forIncomingCall(VoIPGroupNotification$$ExternalSyntheticApiModelOutline7.m().setName(name).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, broadcast2));
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

    private int getCurrentForegroundType() {
        return getCurrentForegroundType(this, this.gotMediaProjection);
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

    public void updateCurrentForegroundType() {
        if (this.lastForegroundType == getCurrentForegroundType() || !this.foregroundStarted) {
            return;
        }
        stopForeground(true);
        if (Build.VERSION.SDK_INT >= 33) {
            int i = this.foregroundId;
            Notification notification = this.foregroundNotification;
            int currentForegroundType = getCurrentForegroundType();
            this.lastForegroundType = currentForegroundType;
            startForeground(i, notification, currentForegroundType);
            return;
        }
        startForeground(this.foregroundId, this.foregroundNotification);
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    VoIPService.$r8$lambda$qN6HCjTTJAV3pwMNo1mQyFRCfdk(tLObject, tL_error);
                }
            });
        }
        try {
            throw new Exception("Call " + getCallID() + " failed with error: " + str);
        } catch (Exception e) {
            FileLog.e(e);
            this.lastError = str;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.dispatchStateChanged(4);
                }
            });
            if (TextUtils.equals(str, "ERROR_LOCALIZED") && this.soundPool != null) {
                this.playingSound = true;
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        VoIPService voIPService = this.f$0;
                        voIPService.soundPool.play(voIPService.spFailedID, 1.0f, 1.0f, 0, 0, 1.0f);
                    }
                });
                AndroidUtilities.runOnUIThread(this.afterSoundRunnable, 1000L);
            }
            if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null) {
                callConnection.setDisconnected(VoIPService$$ExternalSyntheticApiModelOutline27.m(1));
                this.systemCallConnection.destroy();
                this.systemCallConnection = null;
            }
            stopSelf();
        }
    }

    public static void $r8$lambda$qN6HCjTTJAV3pwMNo1mQyFRCfdk(TLObject tLObject, TLRPC.TL_error tL_error) {
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

    void callFailedFromConnectionService() {
        if (this.isOutgoing) {
            callFailed("ERROR_CONNECTION_SERVICE");
        } else {
            hangUp();
        }
    }

    @Override
    public void onConnectionStateChanged(final int i, boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.m1204$r8$lambda$eca7UJ0mGhm6ane5QXrHd1NSAY(this.f$0, i);
            }
        });
    }

    public static void m1204$r8$lambda$eca7UJ0mGhm6ane5QXrHd1NSAY(final VoIPService voIPService, int i) {
        if (voIPService.convertingVoip != null) {
            return;
        }
        if (i == 3 && voIPService.callStartTime == 0) {
            voIPService.callStartTime = SystemClock.elapsedRealtime();
        }
        if (i == 4) {
            voIPService.callFailed();
            return;
        }
        if (i == 3) {
            Runnable runnable = voIPService.connectingSoundRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                voIPService.connectingSoundRunnable = null;
            }
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.$r8$lambda$aNxifRaDCgKz3C2rkRURkmqrWOo(this.f$0);
                }
            });
            if (voIPService.groupCall == null && !voIPService.wasEstablished) {
                voIPService.wasEstablished = true;
                if (!voIPService.isProximityNear && !voIPService.privateCall.video) {
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
                if (voIPService.isOutgoing) {
                    StatsController.getInstance(voIPService.currentAccount).incrementSentItemsCount(voIPService.getStatsNetworkType(), 0, 1);
                } else {
                    StatsController.getInstance(voIPService.currentAccount).incrementReceivedItemsCount(voIPService.getStatsNetworkType(), 0, 1);
                }
            }
        }
        if (i == 5 && !voIPService.isCallEnded) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    VoIPService.m1173$r8$lambda$X3lZ561g4VDtRHehdf0Htya8(this.f$0);
                }
            });
        }
        voIPService.dispatchStateChanged(i);
    }

    public static void $r8$lambda$aNxifRaDCgKz3C2rkRURkmqrWOo(VoIPService voIPService) {
        int i = voIPService.spPlayId;
        if (i != 0) {
            voIPService.soundPool.stop(i);
            voIPService.spPlayId = 0;
        }
    }

    public static void m1173$r8$lambda$X3lZ561g4VDtRHehdf0Htya8(VoIPService voIPService) {
        int i = voIPService.spPlayId;
        if (i != 0) {
            voIPService.soundPool.stop(i);
        }
        voIPService.spPlayId = voIPService.soundPool.play(voIPService.groupCall != null ? voIPService.spVoiceChatConnecting : voIPService.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    public void playStartRecordSound() {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VoIPService voIPService = this.f$0;
                voIPService.soundPool.play(voIPService.spStartRecordId, 0.5f, 0.5f, 0, 0, 1.0f);
            }
        });
    }

    public void playAllowTalkSound() {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VoIPService voIPService = this.f$0;
                voIPService.soundPool.play(voIPService.spAllowTalkId, 0.5f, 0.5f, 0, 0, 1.0f);
            }
        });
    }

    @Override
    public void onSignalBarCountChanged(final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPService.m1190$r8$lambda$NrfFTKHUxeIEstXKpz_aaDsOuI(this.f$0, i);
            }
        });
    }

    public static void m1190$r8$lambda$NrfFTKHUxeIEstXKpz_aaDsOuI(VoIPService voIPService, int i) {
        voIPService.signalBarCount = i;
        for (int i2 = 0; i2 < voIPService.stateListeners.size(); i2++) {
            voIPService.stateListeners.get(i2).onSignalBarsCountChanged(i);
        }
    }

    public boolean isBluetoothOn() {
        return ((AudioManager) getSystemService("audio")).isBluetoothScoOn();
    }

    public boolean isBluetoothWillOn() {
        return this.needSwitchToBluetoothAfterScoActivates;
    }

    public boolean isHeadsetPlugged() {
        return this.isHeadsetPlugged;
    }

    private void callEnded() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Call " + getCallID() + " ended");
        }
        this.isCallEnded = true;
        if (this.groupCall != null && (!this.playedConnectedSound || this.onDestroyRunnable != null)) {
            this.needPlayEndSound = false;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.dispatchStateChanged(11);
            }
        });
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VoIPService.$r8$lambda$apHu0ind_ZRxtp2fkc6P6Q8mIPA(this.f$0);
            }
        });
        Runnable runnable = this.connectingSoundRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.connectingSoundRunnable = null;
        }
        int i = 700;
        if (this.needPlayEndSound) {
            this.playingSound = true;
            if (this.groupCall == null) {
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        VoIPService voIPService = this.f$0;
                        voIPService.soundPool.play(voIPService.spEndId, 1.0f, 1.0f, 0, 0, 1.0f);
                    }
                });
            } else {
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        VoIPService voIPService = this.f$0;
                        voIPService.soundPool.play(voIPService.spVoiceChatEndId, 1.0f, 1.0f, 0, 0, 1.0f);
                    }
                }, 100L);
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

    public static void $r8$lambda$apHu0ind_ZRxtp2fkc6P6Q8mIPA(VoIPService voIPService) {
        int i = voIPService.spPlayId;
        if (i != 0) {
            voIPService.soundPool.stop(i);
            voIPService.spPlayId = 0;
        }
    }

    private void endConnectionServiceCall(long j) {
        if (USE_CONNECTION_SERVICE) {
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    VoIPService.$r8$lambda$TLD4COcl7HXBMzeDm5HPEYTF7Ds(this.f$0);
                }
            };
            if (j > 0) {
                AndroidUtilities.runOnUIThread(runnable, j);
            } else {
                runnable.run();
            }
        }
    }

    public static void $r8$lambda$TLD4COcl7HXBMzeDm5HPEYTF7Ds(VoIPService voIPService) {
        CallConnection callConnection = voIPService.systemCallConnection;
        if (callConnection != null) {
            int i = voIPService.callDiscardReason;
            if (i == 1) {
                VoIPService$$ExternalSyntheticApiModelOutline28.m();
                callConnection.setDisconnected(VoIPService$$ExternalSyntheticApiModelOutline27.m(voIPService.isOutgoing ? 2 : 6));
            } else if (i != 2) {
                if (i == 3) {
                    VoIPService$$ExternalSyntheticApiModelOutline28.m();
                    callConnection.setDisconnected(VoIPService$$ExternalSyntheticApiModelOutline27.m(voIPService.isOutgoing ? 4 : 5));
                } else if (i == 4) {
                    callConnection.setDisconnected(VoIPService$$ExternalSyntheticApiModelOutline27.m(7));
                } else {
                    callConnection.setDisconnected(VoIPService$$ExternalSyntheticApiModelOutline27.m(3));
                }
            } else {
                callConnection.setDisconnected(VoIPService$$ExternalSyntheticApiModelOutline27.m(1));
            }
            voIPService.systemCallConnection.destroy();
            voIPService.systemCallConnection = null;
        }
    }

    @Override
    public boolean isOutgoing() {
        return this.isOutgoing;
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

    public void updateOutputGainControlState() {
        hasRtmpStream();
    }

    public int getAccount() {
        return this.currentAccount;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.appDidLogout) {
            callEnded();
        }
    }

    public static boolean isAnyKindOfCallActive() {
        return (getSharedInstance() == null || getSharedInstance().getCallState() == 15) ? false : true;
    }

    private boolean isFinished() {
        int i = this.currentState;
        return i == 11 || i == 4;
    }

    public int getRemoteAudioState() {
        return this.remoteAudioState;
    }

    public int getRemoteVideoState() {
        return this.remoteVideoState;
    }

    private PhoneAccountHandle addAccountToTelecomManager() {
        TelecomManager telecomManager = (TelecomManager) getSystemService("telecom");
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        VoIPService$$ExternalSyntheticApiModelOutline31.m();
        PhoneAccountHandle phoneAccountHandleM = VoIPService$$ExternalSyntheticApiModelOutline29.m(new ComponentName(this, (Class<?>) TelegramConnectionService.class), "" + currentUser.id);
        VoIPService$$ExternalSyntheticApiModelOutline32.m();
        telecomManager.registerPhoneAccount(VoIPService$$ExternalSyntheticApiModelOutline30.m(phoneAccountHandleM, ContactsController.formatName(currentUser.first_name, currentUser.last_name)).setCapabilities(2048).setIcon(Icon.createWithResource(this, R.drawable.ic_launcher_dr)).setHighlightColor(-13851168).addSupportedUriScheme("sip").build());
        return phoneAccountHandleM;
    }

    public class CallConnection extends Connection {
        public CallConnection() {
            setConnectionProperties(128);
            setAudioModeIsVoip(true);
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
        public void onDisconnect() {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("ConnectionService onDisconnect");
            }
            setDisconnected(VoIPService$$ExternalSyntheticApiModelOutline27.m(2));
            destroy();
            VoIPService.this.systemCallConnection = null;
            VoIPService.this.hangUp();
        }

        @Override
        public void onAnswer() {
            VoIPService.this.acceptIncomingCallFromNotification();
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

        @Override
        public void onCallEvent(String str, Bundle bundle) {
            super.onCallEvent(str, bundle);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("ConnectionService onCallEvent " + str);
            }
        }

        @Override
        public void onSilence() {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("onSlience");
            }
            VoIPService.this.stopRinging();
        }
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
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.groupCallUpdated, 0L, Long.valueOf(this.groupCall.call.id), Boolean.FALSE);
        }
    }
}
