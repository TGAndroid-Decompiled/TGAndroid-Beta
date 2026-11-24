package defpackage;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public final class gob extends c6 {
    public final rob a;

    public gob(rob robVar) {
        this.a = robVar;
    }

    @Override
    public final void b(int i) {
        File file;
        String str;
        String b;
        int i2;
        String str2;
        rob robVar = this.a;
        if (i == -1) {
            if (robVar.R0(true)) {
                robVar.P0(false);
            }
        } else if (i >= 1 && i <= 3) {
            robVar.d1(i, true);
        } else if (i == 4) {
            if (robVar.x) {
                cmb.t1(false);
            }
            amb ambVar = robVar.w;
            TLRPC.TL_wallPaper tL_wallPaper = robVar.Y0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            ambVar.o = str2;
            ambVar.p = robVar.n1;
            ambVar.q = robVar.G1;
            if (((int) ambVar.j) == 0) {
                ambVar.j = 4294967296L;
            }
            if (((int) ambVar.k) == 0) {
                ambVar.k = 4294967296L;
            }
            if (((int) ambVar.l) == 0) {
                ambVar.l = 4294967296L;
            }
            if (((int) ambVar.m) == 0) {
                ambVar.m = 4294967296L;
            }
            robVar.b1();
            nm7.e().n(robVar, nm7.i4);
            cmb.x1(robVar.g0, true, false, false, true, false);
            cmb.o();
            nm7.e().k(nm7.x4, robVar.g0, Boolean.valueOf(robVar.h0), null, -1);
            robVar.finishFragment();
        } else if (i == 5) {
            if (robVar.getParentActivity() != null) {
                StringBuilder sb = new StringBuilder();
                if (robVar.H1) {
                    sb.append("blur");
                }
                if (robVar.G1) {
                    if (sb.length() > 0) {
                        sb.append("+");
                    }
                    sb.append("motion");
                }
                Object obj = robVar.D1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb2 = new StringBuilder("https://");
                    i2 = ((d) robVar).currentAccount;
                    sb2.append(oc7.r1(i2).N2);
                    sb2.append("/bg/");
                    sb2.append(((TLRPC.TL_wallPaper) obj).slug);
                    b = sb2.toString();
                    if (sb.length() > 0) {
                        StringBuilder k = b10.k(b, "?mode=");
                        k.append(sb.toString());
                        b = k.toString();
                    }
                } else if (obj instanceof mtc) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = robVar.Y0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    mtc mtcVar = new mtc(str, robVar.b1, robVar.d1, robVar.e1, robVar.f1, robVar.j1, robVar.n1, robVar.G1);
                    mtcVar.g = tL_wallPaper2;
                    b = mtcVar.b();
                } else {
                    boolean z = e21.a;
                    return;
                }
                robVar.showDialog(new eob(this, robVar.getParentActivity(), b, b));
            }
        } else if (i == 6) {
            if (gda.R <= 3) {
                gda.R = 10;
                SharedPreferences.Editor edit = oc7.d1().edit();
                int i3 = gda.R + 1;
                gda.R = i3;
                edit.putInt("dayNightWallpaperSwitchHint", i3);
                edit.apply();
            }
            boolean a = robVar.r1.a();
            job jobVar = robVar.r1;
            if (jobVar != null) {
                if (!jobVar.s()) {
                    robVar.l1();
                    return;
                }
                robVar.r1.w(true);
                p09 p09Var = robVar.P1;
                p09Var.h = true;
                if (a) {
                    p09Var.K(0);
                } else {
                    p09Var.K(36);
                }
                robVar.P1.start();
                if (robVar.O1) {
                    job jobVar2 = robVar.r1;
                    float f = 0.0f;
                    if (jobVar2 != null && jobVar2.a()) {
                        robVar.T1.setVisibility(0);
                        robVar.T1.a(robVar.p1);
                    } else {
                        robVar.T1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = robVar.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        robVar.R1.cancel();
                    }
                    float f2 = robVar.q1;
                    if (robVar.r1.a()) {
                        f = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    robVar.R1 = ofFloat;
                    ofFloat.addUpdateListener(new rha(this, (byte) 24));
                    robVar.R1.addListener(new q7b(this, (byte) 4));
                    robVar.R1.setDuration(250L);
                    robVar.R1.setInterpolator(d53.f);
                    robVar.R1.start();
                }
            }
        } else if (i == 7) {
            Object obj2 = robVar.D1;
            if ((obj2 instanceof ntc) && (file = ((ntc) obj2).e) != null) {
                jo6 jo6Var = new jo6(0, file.getAbsolutePath(), 0, false, 0, 0);
                jo6Var.b = false;
                jo6Var.c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(jo6Var);
                PhotoViewer.r0().T1(robVar.getParentActivity(), null, null);
                PhotoViewer.r0().o1(arrayList, 0, 3, false, new fob(this, jo6Var), null);
            }
        }
    }
}
