package d2;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Insets;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import g9.g2;
import java.util.List;
public abstract class d {
    public static void a(AudioAttributes.Builder builder, boolean z10) {
        builder.setHapticChannelsMuted(z10);
    }

    public static int b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i3, int i10, double d) {
        boolean z10;
        int i11;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i3, i10, (int) d);
            int i12 = 0;
            while (true) {
                z10 = true;
                if (i12 < supportedPerformancePoints.size()) {
                    if (t2.i.c(supportedPerformancePoints.get(i12)).covers(performancePoint)) {
                        i11 = 2;
                        break;
                    }
                    i12++;
                } else {
                    i11 = 1;
                    break;
                }
            }
            if (i11 == 1 && x7.w.f58488a == null) {
                int i13 = Build.VERSION.SDK_INT;
                if (i13 < 37) {
                    int c2 = c(true);
                    if (i13 < 35) {
                        x7.w.f58488a = Boolean.valueOf(z10);
                        if (z10) {
                        }
                    } else {
                        x7.w.f58488a = Boolean.valueOf(z10);
                        if (z10) {
                        }
                    }
                }
                z10 = false;
                x7.w.f58488a = Boolean.valueOf(z10);
                if (z10) {
                }
            }
            return i11;
        }
        return 0;
    }

    public static int c(boolean z10) {
        Iterable e10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            u uVar = new u();
            uVar.f8431r = u0.n("video/avc");
            v vVar = new v(uVar);
            String str = vVar.f8489s;
            if (str != null) {
                List e11 = t2.w.e(str, z10, false);
                String c2 = t2.w.c(vVar);
                if (c2 == null) {
                    e10 = g9.s1.f12146e;
                } else {
                    e10 = t2.w.e(c2, z10, false);
                }
                g9.f0 p10 = g9.i0.p();
                p10.d(e11);
                p10.d(e10);
                g9.s1 f10 = p10.f();
                for (int i3 = 0; i3 < f10.d; i3++) {
                    if (((t2.o) f10.get(i3)).d != null && (videoCapabilities = ((t2.o) f10.get(i3)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i10 = 0; i10 < supportedPerformancePoints.size(); i10++) {
                            if (t2.i.c(supportedPerformancePoints.get(i10)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (t2.t unused) {
        }
        return 0;
    }

    public static g9.s1 d(f fVar) {
        g9.f0 p10 = g9.i0.p();
        g9.l0 l0Var = m2.b.h;
        g9.t0 t0Var = l0Var.f12097b;
        if (t0Var == null) {
            t0Var = l0Var.d();
            l0Var.f12097b = t0Var;
        }
        g2 it = t0Var.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (Build.VERSION.SDK_INT >= g2.n0.s(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), fVar.b())) {
                p10.c(num);
            }
        }
        p10.c(2);
        return p10.f();
    }

    public static int e(int i3, int i10, f fVar) {
        for (int i11 = 10; i11 > 0; i11--) {
            int t10 = g2.n0.t(i11);
            if (t10 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i3).setSampleRate(i10).setChannelMask(t10).build(), fVar.b())) {
                return i11;
            }
        }
        return 0;
    }

    public static String f(Context context) {
        return context.getOpPackageName();
    }

    public static void g(android.content.Context r7) {
        throw new UnsupportedOperationException("Method not decompiled: d2.d.g(android.content.Context):void");
    }

    public static boolean h(Context context) {
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

    public static Insets i(int i3, int i10, int i11, int i12) {
        return Insets.of(i3, i10, i11, i12);
    }

    public static void j(Notification.Builder builder, boolean z10) {
        builder.setAllowSystemGeneratedContextualActions(z10);
    }

    public static void k(AudioAttributes.Builder builder, int i3) {
        builder.setAllowedCapturePolicy(i3);
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
