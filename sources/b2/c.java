package b2;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.SharedPreferences;
import android.graphics.Insets;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import w7.z6;
public abstract class c {
    public static void a(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                SharedPreferences.Editor edit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("proxy_notification_initialized", true);
                edit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z10) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
                taskCompletionSource.trySetResult(null);
                return;
            }
            Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
            taskCompletionSource.trySetResult(null);
        } catch (Throwable th2) {
            taskCompletionSource.trySetResult(null);
            throw th2;
        }
    }

    public static int b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d) {
        boolean z10;
        int i12;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d);
            int i13 = 0;
            while (true) {
                z10 = true;
                if (i13 < supportedPerformancePoints.size()) {
                    if (r2.i.c(supportedPerformancePoints.get(i13)).covers(performancePoint)) {
                        i12 = 2;
                        break;
                    }
                    i13++;
                } else {
                    i12 = 1;
                    break;
                }
            }
            if (i12 == 1 && z6.f43842a == null) {
                if (Build.VERSION.SDK_INT < 35) {
                    int c10 = c(false);
                    int c11 = c(true);
                    if (c10 != 0) {
                        if (c11 == 0) {
                        }
                    }
                    z6.f43842a = Boolean.valueOf(z10);
                    if (!z10) {
                    }
                }
                z10 = false;
                z6.f43842a = Boolean.valueOf(z10);
                if (!z10) {
                }
            }
            return i12;
        }
        return 0;
    }

    public static int c(boolean z10) {
        Iterable d;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            r rVar = new r();
            rVar.f1946q = r0.n("video/avc");
            s sVar = new s(rVar);
            String str = sVar.f2002r;
            if (str != null) {
                List d10 = r2.w.d(str, z10, false);
                String b10 = r2.w.b(sVar);
                if (b10 == null) {
                    d = e9.a1.e;
                } else {
                    d = r2.w.d(b10, z10, false);
                }
                e9.f0 u10 = e9.i0.u();
                u10.d(d10);
                u10.d(d);
                e9.a1 i10 = u10.i();
                for (int i11 = 0; i11 < i10.d; i11++) {
                    if (((r2.o) i10.get(i11)).d != null && (videoCapabilities = ((r2.o) i10.get(i11)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                            if (r2.i.c(supportedPerformancePoints.get(i12)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (r2.t unused) {
        }
        return 0;
    }

    public static e9.a1 d(e eVar) {
        e9.f0 u10 = e9.i0.u();
        e9.k0 k0Var = k2.b.e;
        e9.m0 m0Var = k0Var.f7393b;
        if (m0Var == null) {
            m0Var = k0Var.c();
            k0Var.f7393b = m0Var;
        }
        e9.o1 it = m0Var.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (Build.VERSION.SDK_INT >= e2.d0.q(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), (AudioAttributes) eVar.b().f2037a)) {
                u10.b(num);
            }
        }
        u10.b(2);
        return u10.i();
    }

    public static int e(int i10, int i11, e eVar) {
        for (int i12 = 10; i12 > 0; i12--) {
            int s10 = e2.d0.s(i12);
            if (s10 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(s10).build(), (AudioAttributes) eVar.b().f2037a)) {
                return i12;
            }
        }
        return 0;
    }

    public static k2.e f(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return k2.e.d;
        }
        ?? obj = new Object();
        obj.f378a = true;
        obj.f380c = z10;
        return obj.a();
    }

    public static String g(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager h(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static Insets i(int i10, int i11, int i12, int i13) {
        return Insets.of(i10, i11, i12, i13);
    }

    public static void j(Notification.Builder builder, boolean z10) {
        builder.setAllowSystemGeneratedContextualActions(z10);
    }

    public static void k(AudioAttributes.Builder builder, int i10) {
        builder.setAllowedCapturePolicy(i10);
    }

    public static void l(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        builder.setBubbleMetadata(bubbleMetadata);
    }

    public static void m(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void n(RemoteInput.Builder builder) {
        builder.setEditChoicesBeforeSending(0);
    }

    public static void o(Notification.Builder builder, Object obj) {
        builder.setLocusId((LocusId) obj);
    }
}
