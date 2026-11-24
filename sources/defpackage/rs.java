package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.LocusId;
import android.graphics.Insets;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;
public abstract class rs {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            ul1.n();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 < supportedPerformancePoints.size()) {
                    if (u36.e(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                        i3 = 2;
                        break;
                    }
                    i4++;
                } else {
                    i3 = 1;
                    break;
                }
            }
            if (i3 == 1 && qqe.a == null) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 37) {
                    int d2 = d(true);
                    if (i5 < 35) {
                        qqe.a = Boolean.valueOf(z);
                        if (!z) {
                        }
                    } else {
                        qqe.a = Boolean.valueOf(z);
                        if (!z) {
                        }
                    }
                }
                z = false;
                qqe.a = Boolean.valueOf(z);
                if (!z) {
                }
            }
            return i3;
        }
        return 0;
    }

    public static int b(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new sn7(context).a()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        gxc.d("permission must be non-null");
        return 0;
    }

    public static LocusId c(String str) {
        return new LocusId(str);
    }

    public static int d(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            fo4 fo4Var = new fo4();
            fo4Var.s = wf7.n("video/avc");
            go4 go4Var = new go4(fo4Var);
            if (go4Var.t != null) {
                y79 g = tm6.g(go4Var, z, false);
                for (int i = 0; i < g.d; i++) {
                    if (((lm6) g.get(i)).d != null && (videoCapabilities = ((lm6) g.get(i)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        ul1.n();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (u36.e(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (qm6 unused) {
        }
        return 0;
    }

    public static android.content.res.ColorStateList e(android.content.Context r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs.e(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static y79 f(o00 o00Var) {
        jo5 p = mo5.p();
        qo5 qo5Var = r00.h;
        yo5 yo5Var = qo5Var.b;
        if (yo5Var == null) {
            yo5Var = qo5Var.d();
            qo5Var.b = yo5Var;
        }
        v7c n = yo5Var.n();
        while (n.hasNext()) {
            Integer num = (Integer) n.next();
            int intValue = num.intValue();
            if (Build.VERSION.SDK_INT >= hac.s(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), o00Var.b())) {
                p.c(num);
            }
        }
        p.c(2);
        return p.f();
    }

    public static Executor g(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return fp.i(context);
        }
        return new yj0(new Handler(context.getMainLooper()), (byte) 2);
    }

    public static int h(int i, int i2, o00 o00Var) {
        for (int i3 = 10; i3 > 0; i3--) {
            int t = hac.t(i3);
            if (t != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(t).build(), o00Var.b())) {
                return i3;
            }
        }
        return 0;
    }

    public static String i(Context context) {
        return context.getOpPackageName();
    }

    public static void j(android.content.Context r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs.j(android.content.Context):void");
    }

    public static boolean k(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "GMS core is set for proxying");
                        return true;
                    }
                    return true;
                }
            } else {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public static String l(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (tse.b(context, str) != 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
                if (tse.b(context, str) == 0) {
                    return str;
                }
            }
            zo4.k(kt6.o("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
            return null;
        }
        return str;
    }

    public static Insets m(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void n(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            nq5.g(context, broadcastReceiver, intentFilter, 2);
        } else if (i >= 26) {
            i10.h(context, broadcastReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }

    public static void o(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void p(AudioAttributes.Builder builder, int i) {
        builder.setAllowedCapturePolicy(i);
    }

    public static void q(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        builder.setBubbleMetadata(bubbleMetadata);
    }

    public static void r(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void s(RemoteInput.Builder builder) {
        builder.setEditChoicesBeforeSending(0);
    }

    public static void t(AudioAttributes.Builder builder, boolean z) {
        builder.setHapticChannelsMuted(z);
    }

    public static void u(Notification.Builder builder, Object obj) {
        builder.setLocusId((LocusId) obj);
    }
}
