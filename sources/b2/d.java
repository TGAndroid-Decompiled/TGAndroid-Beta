package b2;

import a8.tf;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.SharedPreferences;
import android.graphics.Insets;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import f9.g2;
import java.util.List;
public abstract class d {
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

    public static void b(AudioAttributes.Builder builder, boolean z10) {
        builder.setHapticChannelsMuted(z10);
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d) {
        boolean z10;
        int i12;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d);
            int i13 = 0;
            while (true) {
                z10 = true;
                if (i13 < supportedPerformancePoints.size()) {
                    if (r2.i.b(supportedPerformancePoints.get(i13)).covers(performancePoint)) {
                        i12 = 2;
                        break;
                    }
                    i13++;
                } else {
                    i12 = 1;
                    break;
                }
            }
            if (i12 == 1 && tf.f940a == null) {
                int i14 = Build.VERSION.SDK_INT;
                if (i14 < 37) {
                    int d10 = d(true);
                    if (i14 < 35) {
                        tf.f940a = Boolean.valueOf(z10);
                        if (z10) {
                        }
                    } else {
                        tf.f940a = Boolean.valueOf(z10);
                        if (z10) {
                        }
                    }
                }
                z10 = false;
                tf.f940a = Boolean.valueOf(z10);
                if (z10) {
                }
            }
            return i12;
        }
        return 0;
    }

    public static int d(boolean z10) {
        Iterable e;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            w wVar = new w();
            wVar.f3533r = w0.n("video/avc");
            x xVar = new x(wVar);
            String str = xVar.f3586s;
            if (str != null) {
                List e10 = r2.w.e(str, z10, false);
                String c10 = r2.w.c(xVar);
                if (c10 == null) {
                    e = f9.s1.e;
                } else {
                    e = r2.w.e(c10, z10, false);
                }
                f9.f0 t10 = f9.i0.t();
                t10.d(e10);
                t10.d(e);
                f9.s1 f7 = t10.f();
                for (int i10 = 0; i10 < f7.d; i10++) {
                    if (((r2.o) f7.get(i10)).d != null && (videoCapabilities = ((r2.o) f7.get(i10)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i11 = 0; i11 < supportedPerformancePoints.size(); i11++) {
                            if (r2.i.b(supportedPerformancePoints.get(i11)).covers(performancePoint)) {
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

    public static f9.s1 e(f fVar) {
        f9.f0 t10 = f9.i0.t();
        f9.l0 l0Var = k2.b.h;
        f9.t0 t0Var = l0Var.f10297b;
        if (t0Var == null) {
            t0Var = l0Var.c();
            l0Var.f10297b = t0Var;
        }
        g2 it = t0Var.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (Build.VERSION.SDK_INT >= e2.n0.s(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), fVar.b())) {
                t10.c(num);
            }
        }
        t10.c(2);
        return t10.f();
    }

    public static int f(int i10, int i11, f fVar) {
        for (int i12 = 10; i12 > 0; i12--) {
            int t10 = e2.n0.t(i12);
            if (t10 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(t10).build(), fVar.b())) {
                return i12;
            }
        }
        return 0;
    }

    public static String g(Context context) {
        return context.getOpPackageName();
    }

    public static Insets h(int i10, int i11, int i12, int i13) {
        return Insets.of(i10, i11, i12, i13);
    }

    public static void i(Notification.Builder builder, boolean z10) {
        builder.setAllowSystemGeneratedContextualActions(z10);
    }

    public static void j(AudioAttributes.Builder builder, int i10) {
        builder.setAllowedCapturePolicy(i10);
    }

    public static void k(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        builder.setBubbleMetadata(bubbleMetadata);
    }

    public static void l(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void m(RemoteInput.Builder builder) {
        builder.setEditChoicesBeforeSending(0);
    }

    public static void n(Notification.Builder builder, Object obj) {
        builder.setLocusId((LocusId) obj);
    }
}
