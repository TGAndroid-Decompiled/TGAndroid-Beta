package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import di.pc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.co;
import org.telegram.ui.d40;
import org.telegram.ui.i51;
import org.telegram.ui.j60;
import org.telegram.ui.k51;
import org.telegram.ui.le1;
import org.telegram.ui.lw0;
import org.telegram.ui.v3;
import org.telegram.ui.wg0;
import org.telegram.ui.xo;
import org.telegram.ui.yd;
import rg.v2;
public final class r0 extends AnimatorListenerAdapter {
    public final int f665a;
    public final boolean f666b;
    public final Object f667c;
    public final Object d;

    public r0(Object obj, Object obj2, boolean z10, int i10) {
        this.f665a = i10;
        this.d = obj;
        this.f667c = obj2;
        this.f666b = z10;
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
        i51 i51Var;
        float f14;
        float f15;
        switch (this.f665a) {
            case 0:
                super.onAnimationEnd(anim);
                u0 u0Var = (u0) this.d;
                u0Var.E.remove((ValueAnimator) this.f667c);
                u0.a(u0Var, this.f666b);
                return;
            case 1:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.f667c).endViewTransition(null);
                if (!this.f666b) {
                    throw null;
                }
                throw null;
            case 2:
                ((pc) this.d).n0();
                if (!this.f666b) {
                    ((View) this.f667c).setVisibility(8);
                    return;
                }
                return;
            case 3:
                v3 v3Var = (v3) this.d;
                if (this.f666b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                v3Var.f41402x = f7;
                if (!v3Var.f41398n) {
                    v3Var.n();
                }
                v3Var.i();
                Runnable runnable = (Runnable) this.f667c;
                if (runnable != null) {
                    runnable.run();
                }
                v3Var.h();
                return;
            case 4:
                co coVar = (co) this.d;
                if (!this.f666b) {
                    Bitmap bitmap = coVar.B8;
                    if (bitmap != null) {
                        coVar.C8 = null;
                        coVar.D8 = null;
                        bitmap.recycle();
                        coVar.B8 = null;
                    }
                    t1 t1Var = (t1) this.f667c;
                    if (t1Var != null) {
                        t1Var.invalidate();
                    }
                    coVar.ob(null);
                    coVar.M8 = null;
                    coVar.X0.invalidate();
                    coVar.f35473x0.invalidate();
                    return;
                }
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.f667c;
                r8 r8Var = ((xo) this.d).N;
                if (this.f666b) {
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
                am0 am0Var = (am0) this.d;
                if (this.f666b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                am0Var.f24423r = f10;
                am0Var.f24427y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
                am0Var.f24427y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, am0Var.f24423r));
                am0Var.f24427y.setAlpha(am0Var.f24423r);
                am0Var.f24424s.invalidate();
                am0Var.v.invalidate();
                Runnable runnable2 = (Runnable) this.f667c;
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f667c;
                tVar2.setScaleX(1.0f);
                tVar2.setScaleY(1.0f);
                tVar2.setAlpha(1.0f);
                if (this.f666b) {
                    tVar.f31835x.removeView(tVar2);
                    tVar.e();
                }
                tVar2.setVisibility(8);
                return;
            case 8:
                j60 j60Var = (j60) this.d;
                d40 d40Var = j60Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.f667c;
                if (tVar3 != null) {
                    tVar3.f31813f = false;
                }
                j60Var.d.getNotificationCenter().onAnimationFinish(j60Var.f37528d3);
                j60Var.f37524c3 = false;
                boolean z10 = this.f666b;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                j60Var.f37527d2 = f11;
                j60Var.a2.f31612n = f11;
                if (!z10) {
                    j60Var.W2.setAlpha(0);
                    j60Var.b1();
                    if (j60Var.f37532e2.getParent() != null) {
                        viewGroup2 = ((f3) j60Var).containerView;
                        viewGroup2.removeView(j60Var.f37532e2);
                    }
                    j60Var.f37532e2 = null;
                    d40Var.setVisibility(8);
                    j60Var.f37537f2 = false;
                    j60Var.Y.X = true;
                    j60Var.f37518b2.setVisibility(8);
                    if (j60Var.f37587s0) {
                        j60Var.f37587s0 = false;
                        j60Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = j60Var.Z2;
                    if (tVar4 != null) {
                        tVar4.f31804a.setRoundCorners(0.0f);
                    }
                } else {
                    d40Var.setAlpha(1.0f);
                    d40Var.setScaleX(1.0f);
                    d40Var.setScaleY(1.0f);
                    d40Var.setTranslationX(0.0f);
                    d40Var.setTranslationY(0.0f);
                }
                j60Var.S0();
                viewGroup = ((f3) j60Var).containerView;
                viewGroup.invalidate();
                j60Var.f37515b.invalidate();
                j60Var.Q.invalidate();
                return;
            case 9:
                tv0 tv0Var = (tv0) this.f667c;
                wg0 wg0Var = (wg0) this.d;
                if (wg0Var.J == 0 && this.f666b) {
                    wg0Var.v1(true, true);
                }
                tv0Var.setVisibility(8);
                tv0Var.g();
                tv0Var.setX(0.0f);
                return;
            case 10:
                lw0 lw0Var = (lw0) this.d;
                if (this.f666b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                lw0Var.f38507y = f12;
                lw0Var.f38494c.invalidate();
                lw0Var.d.invalidate();
                lw0Var.e();
                Runnable runnable3 = (Runnable) this.f667c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 11:
                k51 k51Var = (k51) this.d;
                if (this.f666b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                k51Var.f37929s = f13;
                k51Var.f37919b.invalidate();
                k51Var.f37921c.invalidate();
                k51Var.e();
                TextView textView = k51Var.f37932y;
                if (textView != null) {
                    textView.setAlpha(k51Var.f37929s);
                }
                if (k51Var.S) {
                    k51Var.N.invalidate();
                }
                if (!k51Var.S && (i51Var = k51Var.N) != null && i51Var.getSeekBarWaveform() != null) {
                    io0 seekBarWaveform = k51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = k51Var.f37929s;
                    t1 t1Var2 = seekBarWaveform.f27219n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                    }
                }
                Runnable runnable4 = (Runnable) this.f667c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 12:
                le1 le1Var = (le1) this.d;
                if (this.f666b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                le1Var.f38329x = f14;
                le1Var.f38317b.invalidate();
                le1Var.f38319c.invalidate();
                le1Var.e();
                Runnable runnable5 = (Runnable) this.f667c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                v2 v2Var = (v2) this.d;
                yd ydVar = v2Var.f45526c;
                if (this.f666b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                v2Var.f45534y = f15;
                ydVar.setAlpha(f15);
                ydVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f45534y));
                ydVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f45534y));
                v2Var.f45525b.invalidate();
                Runnable runnable6 = (Runnable) this.f667c;
                if (runnable6 != null) {
                    AndroidUtilities.runOnUIThread(runnable6);
                    return;
                }
                return;
        }
    }

    public r0(Object obj, boolean z10, Object obj2, int i10) {
        this.f665a = i10;
        this.d = obj;
        this.f666b = z10;
        this.f667c = obj2;
    }

    public r0(ViewGroup viewGroup, boolean z10, androidx.fragment.app.t0 t0Var, androidx.fragment.app.g gVar) {
        this.f665a = 1;
        this.f667c = viewGroup;
        this.f666b = z10;
        this.d = gVar;
    }
}
