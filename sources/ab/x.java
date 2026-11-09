package ab;

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
import c8.oc;
import e2.s0;
import h9.h2;
import h9.t0;
import h9.t1;
import java.util.List;
public abstract class x {
    public static void a(AudioAttributes.Builder builder, boolean z9) {
        builder.setHapticChannelsMuted(z9);
    }

    public static int b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i10, double d) {
        boolean z9;
        int i11;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i7, i10, (int) d);
            int i12 = 0;
            while (true) {
                z9 = true;
                if (i12 < supportedPerformancePoints.size()) {
                    if (u2.i.b(supportedPerformancePoints.get(i12)).covers(performancePoint)) {
                        i11 = 2;
                        break;
                    }
                    i12++;
                } else {
                    i11 = 1;
                    break;
                }
            }
            if (i11 == 1 && oc.f5793a == null) {
                int i13 = Build.VERSION.SDK_INT;
                if (i13 < 37) {
                    int c10 = c(true);
                    if (i13 < 35) {
                        oc.f5793a = Boolean.valueOf(z9);
                        if (z9) {
                        }
                    } else {
                        oc.f5793a = Boolean.valueOf(z9);
                        if (z9) {
                        }
                    }
                }
                z9 = false;
                oc.f5793a = Boolean.valueOf(z9);
                if (z9) {
                }
            }
            return i11;
        }
        return 0;
    }

    public static int c(boolean z9) {
        Iterable e10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            e2.t tVar = new e2.t();
            tVar.f10563r = s0.n("video/avc");
            e2.u uVar = new e2.u(tVar);
            String str = uVar.f10615s;
            if (str != null) {
                List e11 = u2.w.e(str, z9, false);
                String c10 = u2.w.c(uVar);
                if (c10 == null) {
                    e10 = t1.f14397e;
                } else {
                    e10 = u2.w.e(c10, z9, false);
                }
                h9.f0 p10 = h9.i0.p();
                p10.d(e11);
                p10.d(e10);
                t1 f10 = p10.f();
                for (int i7 = 0; i7 < f10.d; i7++) {
                    if (((u2.o) f10.get(i7)).d != null && (videoCapabilities = ((u2.o) f10.get(i7)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i10 = 0; i10 < supportedPerformancePoints.size(); i10++) {
                            if (u2.i.b(supportedPerformancePoints.get(i10)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (u2.t unused) {
        }
        return 0;
    }

    public static t1 d(e2.e eVar) {
        h9.f0 p10 = h9.i0.p();
        h9.l0 l0Var = n2.b.h;
        t0 t0Var = l0Var.f14343b;
        if (t0Var == null) {
            t0Var = l0Var.d();
            l0Var.f14343b = t0Var;
        }
        h2 it = t0Var.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (Build.VERSION.SDK_INT >= h2.m0.s(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), eVar.b())) {
                p10.c(num);
            }
        }
        p10.c(2);
        return p10.f();
    }

    public static int e(int i7, int i10, e2.e eVar) {
        for (int i11 = 10; i11 > 0; i11--) {
            int t6 = h2.m0.t(i11);
            if (t6 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i7).setSampleRate(i10).setChannelMask(t6).build(), eVar.b())) {
                return i11;
            }
        }
        return 0;
    }

    public static String f(Context context) {
        return context.getOpPackageName();
    }

    public static void g(android.content.Context r7) {
        throw new UnsupportedOperationException("Method not decompiled: ab.x.g(android.content.Context):void");
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

    public static Insets i(int i7, int i10, int i11, int i12) {
        return Insets.of(i7, i10, i11, i12);
    }

    public static void j(Notification.Builder builder, boolean z9) {
        builder.setAllowSystemGeneratedContextualActions(z9);
    }

    public static void k(AudioAttributes.Builder builder, int i7) {
        builder.setAllowedCapturePolicy(i7);
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
