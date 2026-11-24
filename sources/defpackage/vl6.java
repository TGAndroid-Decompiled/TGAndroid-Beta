package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.a;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
public final class vl6 implements Runnable {
    public final byte a;
    public final Object b;

    public vl6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        float f;
        int i;
        float max;
        yla ylaVar;
        int i2;
        String d;
        TelephonyManager telephonyManager;
        byte b = this.a;
        int i3 = 8;
        Integer num = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wl6) obj).e.l(true, true, false, false);
                return;
            case 1:
                hd1 hd1Var = (hd1) obj;
                if (PhotoViewer.r0().U0()) {
                    vl6 vl6Var = new vl6(hd1Var, (byte) 1);
                    MediaController.Z1 = vl6Var;
                    gl.e3(vl6Var, 2000L);
                    return;
                }
                MediaController.Z1 = null;
                MediaController.N(0);
                return;
            case 2:
                ((gm6) obj).d();
                return;
            case 3:
                om6 om6Var = (om6) obj;
                try {
                    ez3 ez3Var = new ez3();
                    ez3Var.b = om6Var;
                    Thread thread = new Thread(ez3Var, "VideoConvertRunnable");
                    thread.start();
                    thread.join();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 4:
                kk7.e().k(295, 0, (TLRPC.Document) obj, 7);
                return;
            case 5:
                ((k21) obj).f();
                return;
            case 6:
                e77 e77Var = (e77) obj;
                if (e77Var != null) {
                    e77Var.a(null);
                    return;
                }
                return;
            case 7:
                ((bs6) obj).n = -1;
                return;
            case 8:
                wy6 wy6Var = (wy6) obj;
                wy6Var.f();
                wy6Var.e(true);
                return;
            case 9:
                final uz6 uz6Var = (uz6) obj;
                boolean z = uz6Var.J;
                boolean z2 = !z;
                or7 or7Var = uz6Var.e;
                tz6 tz6Var = uz6Var.b;
                if (tz6Var != null && or7Var != null) {
                    if (uz6Var.M && (ylaVar = uz6Var.L) != null && ylaVar.f && !z) {
                        uz6Var.P = 0;
                        return;
                    }
                    boolean g = uz6Var.g();
                    if (!z) {
                        f = (-uz6Var.s) - gl.L(6.0f);
                    } else {
                        int computeVerticalScrollRange = tz6Var.computeVerticalScrollRange();
                        f = (computeVerticalScrollRange - or7Var.h) + uz6Var.s;
                        if (computeVerticalScrollRange <= 0 && uz6Var.f.K() > 0 && (i = uz6Var.P) < 3) {
                            uz6Var.P = i + 1;
                            uz6Var.o(true);
                            return;
                        }
                    }
                    uz6Var.P = 0;
                    float f2 = uz6Var.w;
                    final float f3 = 0.0f;
                    if (g) {
                        max = -Math.max(0.0f, f2 - f);
                    } else {
                        max = Math.max(0.0f, f2 - f) + (-f2);
                    }
                    if (!z && !g) {
                        max += tz6Var.computeVerticalScrollOffset();
                    }
                    final float f4 = max;
                    yla ylaVar2 = uz6Var.L;
                    if (ylaVar2 != null) {
                        ylaVar2.d();
                    }
                    uz6Var.M = z2;
                    final float translationY = tz6Var.getTranslationY();
                    final float f5 = uz6Var.N;
                    if (!z) {
                        f3 = 1.0f;
                    }
                    if (translationY == f4) {
                        uz6Var.L = null;
                        if (z) {
                            i3 = 0;
                        }
                        num = Integer.valueOf(i3);
                        if (uz6Var.O && !z) {
                            uz6Var.O = false;
                            tz6Var.setLayoutManager(uz6Var.getNeededLayoutManager());
                            uz6Var.J = true;
                            uz6Var.o(true);
                        }
                    } else {
                        yla ylaVar3 = new yla(new ti4(translationY));
                        zla zlaVar = new zla(f4);
                        zlaVar.a(1.0f);
                        zlaVar.b(550.0f);
                        ylaVar3.m = zlaVar;
                        uz6Var.L = ylaVar3;
                        ylaVar3.b(new yr3() {
                            @Override
                            public final void a(yla ylaVar4, float f6, float f7) {
                                uz6 uz6Var2 = uz6.this;
                                uz6Var2.b.setTranslationY(f6);
                                uz6Var2.i();
                                float f8 = translationY;
                                uz6Var2.N = gl.R1(f5, f3, (f6 - f8) / (f4 - f8));
                            }
                        });
                        if (!z) {
                            uz6Var.L.a(new aw5(uz6Var, z2, (byte) 2));
                        }
                        uz6Var.L.a(new Object());
                        uz6Var.L.h();
                    }
                    if (num != null && uz6Var.getVisibility() != num.intValue()) {
                        uz6Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                uz6Var.P = 0;
                return;
            case 10:
                ((w02) obj).setVisibility(8);
                return;
            case 11:
                ot7 ot7Var = (ot7) obj;
                ot7Var.z0 = true;
                ot7Var.s();
                return;
            case 12:
                ((f37) ((s17) obj).T).n.f();
                return;
            case 13:
                ((n37) obj).a();
                return;
            case 14:
                gl.F3(((t47) obj).p1);
                return;
            case 15:
                ((vm1) obj).run();
                return;
            case 16:
                t1b t1bVar = ((ra7) obj).E;
                if (t1bVar != null) {
                    t1bVar.p(3, true);
                    return;
                }
                return;
            case 17:
                ((be2) obj).a(null);
                return;
            case 18:
                ((gk2) obj).invalidateSelf();
                return;
            case 19:
                p6b p6bVar = (p6b) obj;
                if (p6bVar.J) {
                    p6bVar.J = false;
                    p6bVar.invalidate();
                    return;
                }
                return;
            case 20:
                ((MusicPlayerService) obj).stopSelf();
                return;
            case 21:
                ((za2) obj).invalidateSelf();
                return;
            case 22:
                aj7 aj7Var = (aj7) obj;
                r93 r93Var = (r93) aj7Var.a.get();
                if (r93Var != null) {
                    int h = aj7Var.c.h();
                    s93 s93Var = r93Var.a;
                    synchronized (s93Var) {
                        int i4 = s93Var.n;
                        if (i4 == 0 || s93Var.e) {
                            if (i4 != h || s93Var.o == null) {
                                s93Var.n = h;
                                if (h != 1 && h != 0 && h != 8) {
                                    if (s93Var.o == null) {
                                        Context context = s93Var.a;
                                        String str = g8c.a;
                                        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (!TextUtils.isEmpty(networkCountryIso)) {
                                                d = smd.d(networkCountryIso);
                                                s93Var.o = d;
                                            }
                                        }
                                        d = smd.d(Locale.getDefault().getCountry());
                                        s93Var.o = d;
                                    }
                                    s93Var.l = s93Var.c(h);
                                    s93Var.d.getClass();
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    if (s93Var.g > 0) {
                                        i2 = (int) (elapsedRealtime - s93Var.h);
                                    } else {
                                        i2 = 0;
                                    }
                                    s93Var.e(s93Var.i, i2, s93Var.l);
                                    s93Var.h = elapsedRealtime;
                                    s93Var.i = 0L;
                                    s93Var.k = 0L;
                                    s93Var.j = 0L;
                                    nja njaVar = s93Var.f;
                                    njaVar.a.clear();
                                    njaVar.c = -1;
                                    njaVar.d = 0;
                                    njaVar.e = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 23:
                gl.F3(((jj7) ((pj4) obj).b).J1);
                return;
            case 24:
                try {
                    a.b.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, (Bundle) obj);
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 25:
                ((NotificationsSettingsActivity) obj).z0();
                return;
            case 26:
                kk7.f(((wm7) obj).a).k(42, new Object[0]);
                return;
            case 27:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) obj);
                return;
            case 28:
                ((fq7) obj).run();
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = ((jq7) obj).n1;
                editTextBoldCursor.requestFocus();
                gl.F3(editTextBoldCursor);
                return;
        }
    }
}
