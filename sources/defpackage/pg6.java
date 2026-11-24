package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class pg6 implements Runnable {
    public final byte a;
    public final Object b;

    public pg6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        float f;
        int i;
        float max;
        final float f2;
        zna znaVar;
        int i2;
        String d;
        TelephonyManager telephonyManager;
        byte b = this.a;
        Integer num = null;
        int i3 = 8;
        Object obj = this.b;
        switch (b) {
            case 0:
                double currentTimeMillis = System.currentTimeMillis();
                rg6 rg6Var = ((qg6) obj).b;
                double d2 = currentTimeMillis - rg6Var.e0;
                rg6Var.e0 = currentTimeMillis;
                int i4 = (int) (rg6Var.c0 - d2);
                rg6Var.c0 = i4;
                if (i4 <= 1000) {
                    rg6.n(rg6Var);
                    rg6Var.w.setVisibility(8);
                    ng6 ng6Var = rg6Var.y;
                    if (ng6Var != null) {
                        ng6Var.setVisibility(0);
                    }
                    rg6Var.s();
                    return;
                }
                return;
            case 1:
                double currentTimeMillis2 = System.currentTimeMillis();
                rg6 rg6Var2 = ((qg6) obj).b;
                double d3 = rg6Var2.d0;
                ng6 ng6Var2 = rg6Var2.w;
                rg6Var2.d0 = currentTimeMillis2;
                int i5 = (int) (rg6Var2.b0 - (currentTimeMillis2 - d3));
                rg6Var2.b0 = i5;
                if (i5 >= 1000) {
                    int i6 = i5 / 1000;
                    int i7 = i6 / 60;
                    int i8 = i6 - (i7 * 60);
                    int i9 = rg6Var2.j0;
                    if (i9 != 4 && i9 != 3 && i9 != 11) {
                        if (rg6Var2.i0 == 2 && (i9 == 2 || i9 == 17 || i9 == 16)) {
                            ng6Var2.setText(jb6.a0("ResendSmsAvailableIn", null, 2131745852, Integer.valueOf(i7), Integer.valueOf(i8)));
                            return;
                        } else if (i9 == 2 || i9 == 17 || i9 == 16) {
                            ng6Var2.setText(jb6.a0("SmsAvailableIn", null, 2131745031, Integer.valueOf(i7), Integer.valueOf(i8)));
                            return;
                        } else {
                            return;
                        }
                    }
                    ng6Var2.setText(jb6.a0("CallAvailableIn", null, 2131752583, Integer.valueOf(i7), Integer.valueOf(i8)));
                    return;
                }
                rg6Var2.t();
                int i10 = rg6Var2.j0;
                if (i10 == 3 || i10 == 4 || i10 == 2 || i10 == 17 || i10 == 16 || i10 == 11) {
                    if (i10 == 4) {
                        ng6Var2.setText(jb6.M0(2131745910, "RequestCallButton"));
                    } else if (i10 != 11 && i10 != 3) {
                        ng6Var2.setText(jb6.M0(2131745908, "RequestSmsButton"));
                    } else {
                        ng6Var2.setText(jb6.M0(2131745909, null));
                    }
                    int i11 = cmb.O9;
                    anb.X(ng6Var2, i11, null);
                    ng6Var2.setTag(2131296388, Integer.valueOf(i11));
                    return;
                }
                return;
            case 2:
                ((d65) obj).run();
                return;
            case 3:
                ((ej6) obj).q();
                return;
            case 4:
                hk6 hk6Var = (hk6) obj;
                hk6Var.k = false;
                hk6Var.c();
                return;
            case 5:
                fl6 fl6Var = (fl6) obj;
                if (fl6Var.d) {
                    fl6Var.e = true;
                    fl6Var.r = false;
                    fl6Var.f = 0.0f;
                    fl6Var.h = SystemClock.uptimeMillis();
                    fl6Var.invalidate();
                    return;
                }
                return;
            case 6:
                ((nn6) obj).d.l(true, true, false, false);
                return;
            case 7:
                ((xn6) obj).e.l(true, true, false, false);
                return;
            case 8:
                pe1 pe1Var = (pe1) obj;
                if (PhotoViewer.r0().V0()) {
                    pg6 pg6Var = new pg6(pe1Var, (byte) 8);
                    MediaController.Z1 = pg6Var;
                    gm.d3(pg6Var, 2000L);
                    return;
                }
                MediaController.Z1 = null;
                MediaController.N(0);
                return;
            case 9:
                ((ho6) obj).d();
                return;
            case 10:
                oo6 oo6Var = (oo6) obj;
                try {
                    o04 o04Var = new o04();
                    o04Var.b = oo6Var;
                    Thread thread = new Thread(o04Var, "VideoConvertRunnable");
                    thread.start();
                    thread.join();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 11:
                nm7.e().k(297, 0, (TLRPC.Document) obj, 7);
                return;
            case 12:
                ((s31) obj).f();
                return;
            case 13:
                h97 h97Var = (h97) obj;
                if (h97Var != null) {
                    h97Var.a(null);
                    return;
                }
                return;
            case 14:
                ((cu6) obj).n = -1;
                return;
            case 15:
                w07 w07Var = (w07) obj;
                w07Var.f();
                w07Var.e(true);
                return;
            case 16:
                final u17 u17Var = (u17) obj;
                boolean z = u17Var.J;
                boolean z2 = !z;
                pt7 pt7Var = u17Var.e;
                t17 t17Var = u17Var.b;
                if (t17Var != null && pt7Var != null) {
                    if (u17Var.M && (znaVar = u17Var.L) != null && znaVar.f && !z) {
                        u17Var.P = 0;
                        return;
                    }
                    boolean g = u17Var.g();
                    if (!z) {
                        f = (-u17Var.s) - gm.L(6.0f);
                    } else {
                        int computeVerticalScrollRange = t17Var.computeVerticalScrollRange();
                        f = (computeVerticalScrollRange - pt7Var.h) + u17Var.s;
                        if (computeVerticalScrollRange <= 0 && u17Var.f.K() > 0 && (i = u17Var.P) < 3) {
                            u17Var.P = i + 1;
                            u17Var.o(true);
                            return;
                        }
                    }
                    u17Var.P = 0;
                    float f3 = u17Var.w;
                    if (g) {
                        max = -Math.max(0.0f, f3 - f);
                    } else {
                        max = Math.max(0.0f, f3 - f) + (-f3);
                    }
                    if (!z && !g) {
                        max += t17Var.computeVerticalScrollOffset();
                    }
                    zna znaVar2 = u17Var.L;
                    if (znaVar2 != null) {
                        znaVar2.d();
                    }
                    u17Var.M = z2;
                    final float translationY = t17Var.getTranslationY();
                    final float f4 = u17Var.N;
                    if (!z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    if (translationY == max) {
                        u17Var.L = null;
                        if (z) {
                            i3 = 0;
                        }
                        num = Integer.valueOf(i3);
                        if (u17Var.O && !z) {
                            u17Var.O = false;
                            t17Var.setLayoutManager(u17Var.getNeededLayoutManager());
                            u17Var.J = true;
                            u17Var.o(true);
                        }
                    } else {
                        zna znaVar3 = new zna(new xk4(translationY));
                        aoa aoaVar = new aoa(max);
                        aoaVar.a(1.0f);
                        aoaVar.b(550.0f);
                        znaVar3.m = aoaVar;
                        u17Var.L = znaVar3;
                        final float f5 = max;
                        znaVar3.b(new it3() {
                            @Override
                            public final void a(zna znaVar4, float f6, float f7) {
                                u17 u17Var2 = u17.this;
                                u17Var2.b.setTranslationY(f6);
                                u17Var2.i();
                                float f8 = translationY;
                                u17Var2.N = gm.R1(f4, f2, (f6 - f8) / (f5 - f8));
                            }
                        });
                        if (!z) {
                            u17Var.L.a(new ay5(u17Var, z2, (byte) 2));
                        }
                        u17Var.L.a(new Object());
                        u17Var.L.h();
                    }
                    if (num != null && u17Var.getVisibility() != num.intValue()) {
                        u17Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                u17Var.P = 0;
                return;
            case 17:
                ((h22) obj).setVisibility(8);
                return;
            case 18:
                pv7 pv7Var = (pv7) obj;
                pv7Var.z0 = true;
                pv7Var.s();
                return;
            case 19:
                ((f57) ((s37) obj).T).n.f();
                return;
            case 20:
                ((n57) obj).a();
                return;
            case 21:
                gm.E3(((u67) obj).p1);
                return;
            case 22:
                ((ho1) obj).run();
                return;
            case 23:
                u3b u3bVar = ((sc7) obj).E;
                if (u3bVar != null) {
                    u3bVar.p(3, true);
                    return;
                }
                return;
            case 24:
                ((mf2) obj).a(null);
                return;
            case 25:
                ((tl2) obj).invalidateSelf();
                return;
            case 26:
                r8b r8bVar = (r8b) obj;
                if (r8bVar.J) {
                    r8bVar.J = false;
                    r8bVar.invalidate();
                    return;
                }
                return;
            case 27:
                ((MusicPlayerService) obj).stopSelf();
                return;
            case 28:
                ((kc2) obj).invalidateSelf();
                return;
            default:
                dl7 dl7Var = (dl7) obj;
                db3 db3Var = (db3) dl7Var.a.get();
                if (db3Var != null) {
                    int h = dl7Var.c.h();
                    eb3 eb3Var = db3Var.a;
                    synchronized (eb3Var) {
                        int i12 = eb3Var.n;
                        if (i12 == 0 || eb3Var.e) {
                            if (i12 != h || eb3Var.o == null) {
                                eb3Var.n = h;
                                if (h != 1 && h != 0 && h != 8) {
                                    if (eb3Var.o == null) {
                                        Context context = eb3Var.a;
                                        String str = hac.a;
                                        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (!TextUtils.isEmpty(networkCountryIso)) {
                                                d = vod.d(networkCountryIso);
                                                eb3Var.o = d;
                                            }
                                        }
                                        d = vod.d(Locale.getDefault().getCountry());
                                        eb3Var.o = d;
                                    }
                                    eb3Var.l = eb3Var.c(h);
                                    eb3Var.d.getClass();
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    if (eb3Var.g > 0) {
                                        i2 = (int) (elapsedRealtime - eb3Var.h);
                                    } else {
                                        i2 = 0;
                                    }
                                    eb3Var.e(eb3Var.i, i2, eb3Var.l);
                                    eb3Var.h = elapsedRealtime;
                                    eb3Var.i = 0L;
                                    eb3Var.k = 0L;
                                    eb3Var.j = 0L;
                                    ola olaVar = eb3Var.f;
                                    olaVar.a.clear();
                                    olaVar.c = -1;
                                    olaVar.d = 0;
                                    olaVar.e = 0;
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
        }
    }
}
