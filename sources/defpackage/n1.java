package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.PhotoViewer;
public final class n1 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final Object b;

    public n1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        uv0 uv0Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((s1) ((o1) obj).b).e();
                return;
            case 1:
                ((he) obj).L = null;
                return;
            case 2:
                ((ho1) obj).run();
                return;
            case 3:
                gm.t1((hk) obj);
                return;
            case 4:
                gm.t1((mj) obj);
                return;
            case 5:
                ((ip0) obj).a.y0(false);
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    return;
                }
                return;
            case 7:
                qw0 qw0Var = ((aw0) obj).e.R;
                if (qw0Var != null && (uv0Var = qw0Var.c) != null) {
                    uv0Var.z();
                    return;
                }
                return;
            case 8:
                uv0 uv0Var2 = ((iw0) obj).b.e.R.c;
                if (uv0Var2 != null) {
                    uv0Var2.z();
                    return;
                }
                return;
            case 9:
                gm.t1((j51) obj);
                return;
            case 10:
                ((hb1) obj).l1.onFragmentDestroy();
                return;
            case 11:
                fj1 fj1Var = (fj1) obj;
                boolean g = fj1Var.x.g();
                p09 p09Var = fj1Var.L;
                if (!g) {
                    p09Var.K(86);
                    fj1Var.n.d();
                    return;
                }
                p09Var.I(0, false, false);
                return;
            case 12:
                rc2 rc2Var = (rc2) obj;
                if (rc2Var != null) {
                    rc2Var.i3(-1);
                    return;
                }
                return;
            case 13:
                u31 u31Var = ((u31[]) obj)[0];
                if (u31Var != null) {
                    u31Var.b();
                    return;
                }
                return;
            case 14:
                ((i22) obj).z4 = false;
                return;
            case 15:
                c52 c52Var = (c52) obj;
                c52Var.U0 = null;
                c52Var.T.post(new v42(c52Var, (byte) 2));
                return;
            case 16:
                ((p82) obj).P = null;
                return;
            case 17:
                ba2 ba2Var = (ba2) obj;
                boolean g2 = ba2Var.s.g();
                p09 p09Var2 = ba2Var.S0;
                if (!g2) {
                    p09Var2.K(86);
                    ba2Var.c0.e.d();
                    return;
                }
                p09Var2.I(0, false, false);
                return;
            case 18:
                qu3 qu3Var = (qu3) obj;
                qu3Var.b2 = null;
                qu3Var.requestFocus();
                return;
            case 19:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 20:
                gm.t1((a94) obj);
                return;
            case 21:
                float[] fArr = FragmentContextView.W0;
                ((FragmentContextView) obj).c(false);
                return;
            case 22:
                j55 j55Var = (j55) obj;
                if (!j55Var.e) {
                    j55Var.e = true;
                    bm3 bm3Var = j55Var.h;
                    if (bm3Var != null) {
                        bm3Var.run();
                    }
                    if (!j55Var.f) {
                        j55Var.f = true;
                        j55Var.b.c();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                uc5 uc5Var = (uc5) obj;
                boolean g3 = uc5Var.O.g();
                p09 p09Var3 = uc5Var.S;
                if (!g3) {
                    p09Var3.K(86);
                    uc5Var.f.d();
                    return;
                }
                p09Var3.I(0, false, false);
                return;
            case 24:
                i46 i46Var = (i46) obj;
                i46Var.a2 = false;
                i46Var.s2.e0 = true;
                i46Var.z2.invalidate();
                i46Var.s2.invalidate();
                return;
            case 25:
                zf6 zf6Var = (zf6) obj;
                p09 p09Var4 = zf6Var.K;
                boolean g4 = zf6Var.N.g();
                cj1 cj1Var = zf6Var.n;
                if (!g4) {
                    cj1Var.setAnimation(p09Var4);
                    p09Var4.K(86);
                    cj1Var.setOnAnimationEndListener(new me6(zf6Var, (byte) 2));
                    cj1Var.d();
                    return;
                }
                cj1Var.setAnimation(p09Var4);
                p09Var4.I(0, false, false);
                zf6Var.M = true;
                return;
            case 26:
                ((x07) obj).s = null;
                return;
            case 27:
                ((my0) obj).dismiss();
                return;
            case 28:
                ((nsa) obj).run();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.d9;
                ((PhotoViewer) obj).Q1 = null;
                return;
        }
    }
}
