package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import di.kc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.bh0;
import org.telegram.ui.ee;
import org.telegram.ui.fo;
import org.telegram.ui.h40;
import org.telegram.ui.n60;
import org.telegram.ui.p51;
import org.telegram.ui.r51;
import org.telegram.ui.se1;
import org.telegram.ui.sw0;
import org.telegram.ui.x3;
import org.telegram.ui.zo;
import rg.v2;
public final class q0 extends AnimatorListenerAdapter {
    public final int f845a;
    public final boolean f846b;
    public final Object f847c;
    public final Object d;

    public q0(Object obj, Object obj2, boolean z10, int i10) {
        this.f845a = i10;
        this.d = obj;
        this.f847c = obj2;
        this.f846b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator anim) {
        float f7;
        int i10;
        float f10;
        float f11;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        float f12;
        float f13;
        p51 p51Var;
        float f14;
        float f15;
        switch (this.f845a) {
            case 0:
                super.onAnimationEnd(anim);
                t0 t0Var = (t0) this.d;
                t0Var.E.remove((ValueAnimator) this.f847c);
                t0.a(t0Var, this.f846b);
                return;
            case 1:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.f847c).endViewTransition(null);
                if (!this.f846b) {
                    throw null;
                }
                throw null;
            case 2:
                ((kc) this.d).m0();
                if (!this.f846b) {
                    ((View) this.f847c).setVisibility(8);
                    return;
                }
                return;
            case 3:
                x3 x3Var = (x3) this.d;
                if (this.f846b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                x3Var.f41736x = f7;
                if (!x3Var.f41732n) {
                    x3Var.n();
                }
                x3Var.i();
                Runnable runnable = (Runnable) this.f847c;
                if (runnable != null) {
                    runnable.run();
                }
                x3Var.h();
                return;
            case 4:
                fo foVar = (fo) this.d;
                if (!this.f846b) {
                    Bitmap bitmap = foVar.B8;
                    if (bitmap != null) {
                        foVar.C8 = null;
                        foVar.D8 = null;
                        bitmap.recycle();
                        foVar.B8 = null;
                    }
                    u1 u1Var = (u1) this.f847c;
                    if (u1Var != null) {
                        u1Var.invalidate();
                    }
                    foVar.sb(null);
                    foVar.M8 = null;
                    foVar.X0.invalidate();
                    foVar.f36160x0.invalidate();
                    return;
                }
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.f847c;
                r8 r8Var = ((zo) this.d).N;
                if (this.f846b) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                r8Var.setVisibility(i10);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((View) arrayList.get(i11)).setTranslationY(0.0f);
                }
                return;
            case 6:
                cn0 cn0Var = (cn0) this.d;
                if (this.f846b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                cn0Var.f24145r = f10;
                cn0Var.f24149y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
                cn0Var.f24149y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, cn0Var.f24145r));
                cn0Var.f24149y.setAlpha(cn0Var.f24145r);
                cn0Var.f24146s.invalidate();
                cn0Var.v.invalidate();
                Runnable runnable2 = (Runnable) this.f847c;
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f847c;
                tVar2.setScaleX(1.0f);
                tVar2.setScaleY(1.0f);
                tVar2.setAlpha(1.0f);
                if (this.f846b) {
                    tVar.f30506x.removeView(tVar2);
                    tVar.e();
                }
                tVar2.setVisibility(8);
                return;
            case 8:
                n60 n60Var = (n60) this.d;
                h40 h40Var = n60Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.f847c;
                if (tVar3 != null) {
                    tVar3.f30484f = false;
                }
                n60Var.d.getNotificationCenter().onAnimationFinish(n60Var.f38457d3);
                n60Var.f38453c3 = false;
                boolean z10 = this.f846b;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n60Var.f38456d2 = f11;
                n60Var.a2.f30295n = f11;
                if (!z10) {
                    n60Var.W2.setAlpha(0);
                    n60Var.c1();
                    if (n60Var.f38460e2.getParent() != null) {
                        viewGroup2 = ((e3) n60Var).containerView;
                        viewGroup2.removeView(n60Var.f38460e2);
                    }
                    n60Var.f38460e2 = null;
                    h40Var.setVisibility(8);
                    n60Var.f38465f2 = false;
                    n60Var.Y.X = true;
                    n60Var.f38447b2.setVisibility(8);
                    if (n60Var.f38516s0) {
                        n60Var.f38516s0 = false;
                        n60Var.P0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = n60Var.Z2;
                    if (tVar4 != null) {
                        tVar4.f30476a.setRoundCorners(0.0f);
                    }
                } else {
                    h40Var.setAlpha(1.0f);
                    h40Var.setScaleX(1.0f);
                    h40Var.setScaleY(1.0f);
                    h40Var.setTranslationX(0.0f);
                    h40Var.setTranslationY(0.0f);
                }
                n60Var.T0();
                viewGroup = ((e3) n60Var).containerView;
                viewGroup.invalidate();
                n60Var.f38444b.invalidate();
                n60Var.Q.invalidate();
                return;
            case 9:
                tw0 tw0Var = (tw0) this.f847c;
                bh0 bh0Var = (bh0) this.d;
                if (bh0Var.J == 0 && this.f846b) {
                    bh0Var.v1(true, true);
                }
                tw0Var.setVisibility(8);
                tw0Var.g();
                tw0Var.setX(0.0f);
                return;
            case 10:
                sw0 sw0Var = (sw0) this.d;
                if (this.f846b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                sw0Var.f40244y = f12;
                sw0Var.f40232c.invalidate();
                sw0Var.d.invalidate();
                sw0Var.e();
                Runnable runnable3 = (Runnable) this.f847c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 11:
                r51 r51Var = (r51) this.d;
                if (this.f846b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                r51Var.f39607s = f13;
                r51Var.f39598b.invalidate();
                r51Var.f39600c.invalidate();
                r51Var.e();
                TextView textView = r51Var.f39610y;
                if (textView != null) {
                    textView.setAlpha(r51Var.f39607s);
                }
                if (r51Var.S) {
                    r51Var.N.invalidate();
                }
                if (!r51Var.S && (p51Var = r51Var.N) != null && p51Var.getSeekBarWaveform() != null) {
                    jp0 seekBarWaveform = r51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = r51Var.f39607s;
                    u1 u1Var2 = seekBarWaveform.f26439n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                    }
                }
                Runnable runnable4 = (Runnable) this.f847c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 12:
                se1 se1Var = (se1) this.d;
                if (this.f846b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                se1Var.f40121x = f14;
                se1Var.f40110b.invalidate();
                se1Var.f40112c.invalidate();
                se1Var.e();
                Runnable runnable5 = (Runnable) this.f847c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                v2 v2Var = (v2) this.d;
                ee eeVar = v2Var.f44583c;
                if (this.f846b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                v2Var.f44590y = f15;
                eeVar.setAlpha(f15);
                eeVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f44590y));
                eeVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f44590y));
                v2Var.f44582b.invalidate();
                Runnable runnable6 = (Runnable) this.f847c;
                if (runnable6 != null) {
                    AndroidUtilities.runOnUIThread(runnable6);
                    return;
                }
                return;
        }
    }

    public q0(Object obj, boolean z10, Object obj2, int i10) {
        this.f845a = i10;
        this.d = obj;
        this.f846b = z10;
        this.f847c = obj2;
    }

    public q0(ViewGroup viewGroup, boolean z10, androidx.fragment.app.t0 t0Var, androidx.fragment.app.g gVar) {
        this.f845a = 1;
        this.f847c = viewGroup;
        this.f846b = z10;
        this.d = gVar;
    }
}
