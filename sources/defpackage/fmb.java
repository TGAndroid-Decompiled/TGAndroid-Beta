package defpackage;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public final class fmb extends c6 {
    public final qmb a;

    public fmb(qmb qmbVar) {
        this.a = qmbVar;
    }

    @Override
    public final void b(int i) {
        File file;
        String str;
        String b;
        int i2;
        String str2;
        qmb qmbVar = this.a;
        if (i == -1) {
            if (qmbVar.Q0(true)) {
                qmbVar.O0(false);
            }
        } else if (i >= 1 && i <= 3) {
            qmbVar.c1(i, true);
        } else if (i == 4) {
            if (qmbVar.x) {
                bkb.t1(false);
            }
            zjb zjbVar = qmbVar.w;
            TLRPC.TL_wallPaper tL_wallPaper = qmbVar.Y0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            zjbVar.o = str2;
            zjbVar.p = qmbVar.n1;
            zjbVar.q = qmbVar.G1;
            if (((int) zjbVar.j) == 0) {
                zjbVar.j = 4294967296L;
            }
            if (((int) zjbVar.k) == 0) {
                zjbVar.k = 4294967296L;
            }
            if (((int) zjbVar.l) == 0) {
                zjbVar.l = 4294967296L;
            }
            if (((int) zjbVar.m) == 0) {
                zjbVar.m = 4294967296L;
            }
            qmbVar.a1();
            kk7.e().n(qmbVar, kk7.g4);
            bkb.x1(qmbVar.g0, true, false, false, true, false);
            bkb.o();
            kk7.e().k(kk7.v4, qmbVar.g0, Boolean.valueOf(qmbVar.h0), null, -1);
            qmbVar.finishFragment();
        } else if (i == 5) {
            if (qmbVar.getParentActivity() != null) {
                StringBuilder sb = new StringBuilder();
                if (qmbVar.H1) {
                    sb.append("blur");
                }
                if (qmbVar.G1) {
                    if (sb.length() > 0) {
                        sb.append("+");
                    }
                    sb.append("motion");
                }
                Object obj = qmbVar.D1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb2 = new StringBuilder("https://");
                    i2 = ((d) qmbVar).currentAccount;
                    sb2.append(na7.q1(i2).N2);
                    sb2.append("/bg/");
                    sb2.append(((TLRPC.TL_wallPaper) obj).slug);
                    b = sb2.toString();
                    if (sb.length() > 0) {
                        StringBuilder k = b00.k(b, "?mode=");
                        k.append(sb.toString());
                        b = k.toString();
                    }
                } else if (obj instanceof krc) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = qmbVar.Y0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    krc krcVar = new krc(str, qmbVar.b1, qmbVar.d1, qmbVar.e1, qmbVar.f1, qmbVar.j1, qmbVar.n1, qmbVar.G1);
                    krcVar.g = tL_wallPaper2;
                    b = krcVar.b();
                } else {
                    boolean z = w01.a;
                    return;
                }
                qmbVar.showDialog(new dmb(this, qmbVar.getParentActivity(), b, b));
            }
        } else if (i == 6) {
            if (gba.R <= 3) {
                gba.R = 10;
                SharedPreferences.Editor edit = na7.c1().edit();
                int i3 = gba.R + 1;
                gba.R = i3;
                edit.putInt("dayNightWallpaperSwitchHint", i3);
                edit.apply();
            }
            boolean a = qmbVar.r1.a();
            imb imbVar = qmbVar.r1;
            if (imbVar != null) {
                if (!imbVar.w()) {
                    qmbVar.k1();
                    return;
                }
                qmbVar.r1.E(true);
                oy8 oy8Var = qmbVar.P1;
                oy8Var.h = true;
                if (a) {
                    oy8Var.K(0);
                } else {
                    oy8Var.K(36);
                }
                qmbVar.P1.start();
                if (qmbVar.O1) {
                    imb imbVar2 = qmbVar.r1;
                    float f = 0.0f;
                    if (imbVar2 != null && imbVar2.a()) {
                        qmbVar.T1.setVisibility(0);
                        qmbVar.T1.a(qmbVar.p1);
                    } else {
                        qmbVar.T1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = qmbVar.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        qmbVar.R1.cancel();
                    }
                    float f2 = qmbVar.q1;
                    if (qmbVar.r1.a()) {
                        f = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    qmbVar.R1 = ofFloat;
                    ofFloat.addUpdateListener(new gja(this, (byte) 22));
                    qmbVar.R1.addListener(new iab(this, (byte) 2));
                    qmbVar.R1.setDuration(250L);
                    qmbVar.R1.setInterpolator(s33.f);
                    qmbVar.R1.start();
                }
            }
        } else if (i == 7) {
            Object obj2 = qmbVar.D1;
            if ((obj2 instanceof lrc) && (file = ((lrc) obj2).e) != null) {
                jm6 jm6Var = new jm6(0, file.getAbsolutePath(), 0, false, 0, 0);
                jm6Var.b = false;
                jm6Var.c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(jm6Var);
                PhotoViewer.r0().S1(qmbVar.getParentActivity(), null, null);
                PhotoViewer.r0().n1(arrayList, 0, 3, false, new emb(this, jm6Var), null);
            }
        }
    }
}
