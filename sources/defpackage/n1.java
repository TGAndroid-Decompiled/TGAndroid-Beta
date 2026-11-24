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
        ku0 ku0Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((s1) ((o1) obj).b).e();
                return;
            case 1:
                ((hd) obj).L = null;
                return;
            case 2:
                ((vm1) obj).run();
                return;
            case 3:
                gl.t1((hj) obj);
                return;
            case 4:
                gl.t1((mi) obj);
                return;
            case 5:
                ((io0) obj).a.x0(false);
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
                hv0 hv0Var = ((qu0) obj).e.R;
                if (hv0Var != null && (ku0Var = hv0Var.c) != null) {
                    ku0Var.z();
                    return;
                }
                return;
            case 8:
                ku0 ku0Var2 = ((yu0) obj).b.e.R.c;
                if (ku0Var2 != null) {
                    ku0Var2.z();
                    return;
                }
                return;
            case 9:
                gl.t1((c41) obj);
                return;
            case 10:
                ((z91) obj).l1.onFragmentDestroy();
                return;
            case 11:
                yh1 yh1Var = (yh1) obj;
                boolean g = yh1Var.x.g();
                oy8 oy8Var = yh1Var.L;
                if (!g) {
                    oy8Var.K(86);
                    yh1Var.n.d();
                    return;
                }
                oy8Var.I(0, false, false);
                return;
            case 12:
                gb2 gb2Var = (gb2) obj;
                if (gb2Var != null) {
                    gb2Var.i3(-1);
                    return;
                }
                return;
            case 13:
                m21 m21Var = ((m21[]) obj)[0];
                if (m21Var != null) {
                    m21Var.b();
                    return;
                }
                return;
            case 14:
                ((x02) obj).z4 = false;
                return;
            case 15:
                r32 r32Var = (r32) obj;
                r32Var.U0 = null;
                r32Var.T.post(new j32(r32Var, (byte) 2));
                return;
            case 16:
                ((e72) obj).P = null;
                return;
            case 17:
                p82 p82Var = (p82) obj;
                boolean g2 = p82Var.s.g();
                oy8 oy8Var2 = p82Var.S0;
                if (!g2) {
                    oy8Var2.K(86);
                    p82Var.c0.e.d();
                    return;
                }
                oy8Var2.I(0, false, false);
                return;
            case 18:
                gt3 gt3Var = (gt3) obj;
                gt3Var.b2 = null;
                gt3Var.requestFocus();
                return;
            case 19:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                return;
            case 20:
                gl.t1((r74) obj);
                return;
            case 21:
                float[] fArr = FragmentContextView.W0;
                ((FragmentContextView) obj).c(false);
                return;
            case 22:
                j35 j35Var = (j35) obj;
                if (!j35Var.e) {
                    j35Var.e = true;
                    sm3 sm3Var = j35Var.h;
                    if (sm3Var != null) {
                        sm3Var.run();
                    }
                    if (!j35Var.f) {
                        j35Var.f = true;
                        j35Var.b.c();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                wa5 wa5Var = (wa5) obj;
                boolean g3 = wa5Var.O.g();
                oy8 oy8Var3 = wa5Var.S;
                if (!g3) {
                    oy8Var3.K(86);
                    wa5Var.f.d();
                    return;
                }
                oy8Var3.I(0, false, false);
                return;
            case 24:
                h26 h26Var = (h26) obj;
                h26Var.a2 = false;
                h26Var.s2.e0 = true;
                h26Var.z2.invalidate();
                h26Var.s2.invalidate();
                return;
            case 25:
                ae6 ae6Var = (ae6) obj;
                oy8 oy8Var4 = ae6Var.K;
                boolean g4 = ae6Var.N.g();
                vh1 vh1Var = ae6Var.n;
                if (!g4) {
                    vh1Var.setAnimation(oy8Var4);
                    oy8Var4.K(86);
                    vh1Var.setOnAnimationEndListener(new nc6(ae6Var, (byte) 2));
                    vh1Var.d();
                    return;
                }
                vh1Var.setAnimation(oy8Var4);
                oy8Var4.I(0, false, false);
                ae6Var.M = true;
                return;
            case 26:
                ((xy6) obj).s = null;
                return;
            case 27:
                ((fx0) obj).dismiss();
                return;
            case 28:
                ((kya) obj).run();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.d9;
                ((PhotoViewer) obj).Q1 = null;
                return;
        }
    }
}
