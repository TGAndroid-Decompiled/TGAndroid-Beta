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
public abstract class rr {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            mk1.n();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 < supportedPerformancePoints.size()) {
                    if (w26.d(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                        i3 = 2;
                        break;
                    }
                    i4++;
                } else {
                    i3 = 1;
                    break;
                }
            }
            if (i3 == 1 && noe.a == null) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 37) {
                    int d2 = d(true);
                    if (i5 < 35) {
                        noe.a = Boolean.valueOf(z);
                        if (!z) {
                        }
                    } else {
                        noe.a = Boolean.valueOf(z);
                        if (!z) {
                        }
                    }
                }
                z = false;
                noe.a = Boolean.valueOf(z);
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
                if (new pl7(context).a()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        fvc.f("permission must be non-null");
        return 0;
    }

    public static LocusId c(String str) {
        return new LocusId(str);
    }

    public static int d(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            em4 em4Var = new em4();
            em4Var.s = ud7.n("video/avc");
            fm4 fm4Var = new fm4(em4Var);
            if (fm4Var.t != null) {
                w59 g = qk6.g(fm4Var, z, false);
                for (int i = 0; i < g.d; i++) {
                    if (((ik6) g.get(i)).d != null && (videoCapabilities = ((ik6) g.get(i)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        mk1.n();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (w26.d(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (nk6 unused) {
        }
        return 0;
    }

    public static android.content.res.ColorStateList e(android.content.Context r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr.e(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static w59 f(nz nzVar) {
        jm5 p = mm5.p();
        qm5 qm5Var = rz.h;
        ym5 ym5Var = qm5Var.b;
        if (ym5Var == null) {
            ym5Var = qm5Var.d();
            qm5Var.b = ym5Var;
        }
        v5c n = ym5Var.n();
        while (n.hasNext()) {
            Integer num = (Integer) n.next();
            int intValue = num.intValue();
            if (Build.VERSION.SDK_INT >= g8c.s(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), nzVar.b())) {
                p.c(num);
            }
        }
        p.c(2);
        return p.f();
    }

    public static Executor g(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return fo.i(context);
        }
        return new yi0(new Handler(context.getMainLooper()), (byte) 2);
    }

    public static int h(int i, int i2, nz nzVar) {
        for (int i3 = 10; i3 > 0; i3--) {
            int t = g8c.t(i3);
            if (t != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(t).build(), nzVar.b())) {
                return i3;
            }
        }
        return 0;
    }

    public static String i(Context context) {
        return context.getOpPackageName();
    }

    public static void j(android.content.Context r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr.j(android.content.Context):void");
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
        if (qqe.b(context, str) != 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
                if (qqe.b(context, str) == 0) {
                    return str;
                }
            }
            wn4.j(tb4.y("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
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
            no5.g(context, broadcastReceiver, intentFilter, 2);
        } else if (i >= 26) {
            i00.h(context, broadcastReceiver, intentFilter, 2);
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
