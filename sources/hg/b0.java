package hg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import ih.f1;
import ih.h2;
import ih.i4;
import ih.k1;
import ih.m9;
import kh.g6;
import kh.l9;
import kh.m4;
import kh.q3;
import kh.wb;
import mh.c3;
import of.i1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t5;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.b5;
import org.telegram.ui.fd;
import org.telegram.ui.ho;
import org.telegram.ui.id;
import org.telegram.ui.ja;
import org.telegram.ui.l4;
import org.telegram.ui.qn;
import org.telegram.ui.r4;
import org.telegram.ui.y4;
public final class b0 extends AnimatorListenerAdapter {
    public final int f10537a;
    public final boolean f10538b;
    public final Object f10539c;

    public b0(int i9, Object obj, boolean z10) {
        this.f10537a = i9;
        this.f10539c = obj;
        this.f10538b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f10537a) {
            case 16:
                ((nh.o) this.f10539c).f18690w = null;
                return;
            case 22:
                e2 e2Var = (e2) this.f10539c;
                AnimatorSet animatorSet = e2Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.N = null;
                    return;
                }
                return;
            case 23:
                t5 t5Var = (t5) this.f10539c;
                AnimatorSet animatorSet2 = t5Var.F;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.F = null;
                    return;
                }
                return;
            case 25:
                ya yaVar = (ya) this.f10539c;
                AnimatorSet animatorSet3 = yaVar.f26004f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    yaVar.f26004f = null;
                    return;
                }
                return;
            case 27:
                ((id) this.f10539c).f39118n = null;
                return;
            case 28:
                qn qnVar = (qn) this.f10539c;
                AnimatorSet animatorSet4 = qnVar.D0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    qnVar.D0 = null;
                    return;
                }
                return;
            case 29:
                ((ho) this.f10539c).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        float f12;
        f1 f1Var;
        float f13;
        float f14;
        float f15;
        View m10;
        float f16;
        float f17;
        int i9;
        float f18;
        RadialProgressView radialProgressView;
        float f19;
        boolean z10;
        int i10;
        float f20;
        float f21;
        boolean z11;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        int i11;
        fd fdVar;
        View view;
        RadialProgressView radialProgressView2;
        switch (this.f10537a) {
            case 0:
                e0 e0Var = (e0) this.f10539c;
                uj0 uj0Var = e0Var.f10585n;
                e0Var.k();
                e0Var.l();
                boolean z12 = this.f10538b;
                e0.a(e0Var, z12);
                e0Var.f10584m.invalidateOutline();
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                e0Var.f10581j = f10;
                boolean z13 = true;
                if (z12) {
                    e0Var.f10582k = true;
                    e0Var.f10574a.invalidate();
                }
                uj0Var.setCustomEmojiEnterProgress(Utilities.clamp(e0Var.f10581j, 1.0f, 0.0f));
                if (!z12) {
                    uj0Var.setImportantForAccessibility(0);
                    uj0Var.setSkipDraw(false);
                    e0Var.f();
                    Runtime.getRuntime().gc();
                    int i12 = e0Var.f10595y;
                    uj0Var.setCustomEmojiReactionsBackground((i12 == 4 || i12 == 5) ? false : false);
                }
                e0Var.C = false;
                return;
            case 1:
                ih.r rVar = (ih.r) this.f10539c;
                if (this.f10538b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                rVar.W = f11;
                rVar.b();
                return;
            case 2:
                h2 h2Var = (h2) this.f10539c;
                gh.f1 f1Var2 = h2Var.f12276c;
                float f27 = 0.0f;
                boolean z14 = this.f10538b;
                if (z14) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                f1Var2.setAlpha(f12);
                View view2 = h2Var.f12272a;
                if (!z14) {
                    f27 = 0.5f;
                }
                view2.setAlpha(f27);
                h2Var.invalidate();
                return;
            case 3:
                k1 k1Var = (k1) this.f10539c;
                k1Var.f11657b.removeViewImmediate(k1Var.d);
                k1Var.f11660f.b();
                if (this.f10538b && (f1Var = k1Var.v) != null && f1Var != f1.S) {
                    f1Var.e();
                }
                k1Var.v = null;
                k1Var.f11663s = true;
                k1Var.C = null;
                k1Var.A = false;
                return;
            case 4:
                m9 m9Var = (m9) this.f10539c;
                m9Var.F0.unlock();
                if (this.f10538b) {
                    f13 = m9Var.f11830w.f11892c;
                } else {
                    f13 = 0.0f;
                }
                m9Var.f11784a0 = f13;
                i4 currentPeerView = m9Var.f11806j0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                m9Var.v.invalidate();
                m9Var.f11823r1 = null;
                return;
            case 5:
                jh.u uVar = (jh.u) this.f10539c;
                float f28 = 0.0f;
                boolean z15 = this.f10538b;
                if (z15) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                uVar.f14386w = f14;
                m71 m71Var = uVar.f14384r;
                if (z15) {
                    f15 = 0.0f;
                } else {
                    f15 = -42.0f;
                }
                m71Var.setTranslationY(AndroidUtilities.dp(f15));
                jh.a aVar = uVar.f14383n;
                if (z15) {
                    f28 = 42.0f;
                }
                aVar.setTranslationY(AndroidUtilities.dp(f28));
                return;
            case 6:
                jh.q qVar = (jh.q) this.f10539c;
                jh.h hVar = qVar.h;
                jh.i iVar = qVar.f14367f;
                jh.l lVar = qVar.v;
                qVar.f14364b = false;
                boolean z16 = this.f10538b;
                if (z16) {
                    int i13 = qVar.f14366e;
                    qVar.d = i13;
                    qVar.S.f14388y = i13;
                    SharedConfig.setStoriesColumnsCount(i13);
                }
                int h = lVar.h();
                if (z16) {
                    hVar.y1(qVar.d);
                    iVar.a0();
                    if (lVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(iVar);
                    } else {
                        lVar.l();
                    }
                }
                qVar.f14369r.setVisibility(8);
                int i14 = qVar.O;
                if (i14 >= 0) {
                    if (z16 && (m10 = qVar.f14370s.m(i14)) != null) {
                        qVar.P = m10.getTop();
                    }
                    hVar.h1(qVar.O, (-iVar.getPaddingTop()) + qVar.P);
                }
                super.onAnimationEnd(animator);
                return;
            case 7:
                kh.d dVar = (kh.d) this.f10539c;
                if (this.f10538b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                dVar.I = f16;
                dVar.invalidate();
                return;
            case 8:
                kh.m mVar = (kh.m) this.f10539c;
                boolean z17 = this.f10538b;
                if (!z17) {
                    mVar.f15645r.setVisibility(8);
                    kh.i iVar2 = mVar.I;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z17) {
                    mVar.f15632f.getEditText().setAllowDrawCursor(true);
                }
                mVar.c(z17);
                return;
            case 9:
                kh.z zVar = (kh.z) this.f10539c;
                kh.w wVar = zVar.f16415a;
                boolean z18 = this.f10538b;
                if (z18) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                zVar.d = f17;
                wVar.invalidate();
                if (z18) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                wVar.setVisibility(i9);
                return;
            case 10:
                if (!this.f10538b) {
                    ((q3) this.f10539c).E.setVisibility(8);
                    return;
                }
                return;
            case 11:
                if (!this.f10538b) {
                    ((m4) this.f10539c).f15689b.setVisibility(8);
                    return;
                }
                return;
            case 12:
                g6 g6Var = (g6) this.f10539c;
                if (!this.f10538b) {
                    g6Var.V1.setVisibility(8);
                    g6Var.V1.n();
                    return;
                }
                return;
            case 13:
                l9 l9Var = (l9) this.f10539c;
                if (this.f10538b) {
                    l9Var.setVisibility(8);
                }
                l9Var.f15611c = null;
                return;
            case 14:
                wb wbVar = (wb) this.f10539c;
                if (!this.f10538b) {
                    wbVar.R0.setVisibility(8);
                }
                wbVar.f16252b2 = null;
                return;
            case 15:
                c3 c3Var = (c3) this.f10539c;
                if (this.f10538b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                c3Var.J0 = f18;
                c3Var.h();
                return;
            case 16:
                nh.o oVar = (nh.o) this.f10539c;
                if (oVar.f18690w != null && (radialProgressView = oVar.f18691x) != null) {
                    if (!this.f10538b) {
                        radialProgressView.setVisibility(4);
                        oVar.f18689s.setVisibility(4);
                    }
                    oVar.f18690w = null;
                    return;
                }
                return;
            case 17:
                i1 i1Var = (i1) this.f10539c;
                boolean z19 = this.f10538b;
                if (z19) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                i1Var.f19369e = f19;
                i1Var.invalidate();
                for (int i15 = 0; i15 < 2; i15++) {
                    i1Var.f19368c[i15].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), i1Var.f19369e));
                    TextView textView = i1Var.f19368c[i15];
                    if (i15 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i16 = 8;
                    if (z10 == z19) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    textView.setVisibility(i10);
                    TextView textView2 = i1Var.f19368c[i15];
                    if (i15 == 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    if (i15 == 1) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    textView2.setAlpha(AndroidUtilities.lerp(f20, f21, i1Var.f19369e));
                    i1Var.d[i15].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), i1Var.f19369e));
                    TextView textView3 = i1Var.d[i15];
                    if (i15 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 == z19) {
                        i16 = 0;
                    }
                    textView3.setVisibility(i16);
                    TextView textView4 = i1Var.d[i15];
                    if (i15 == 0) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i15 == 1) {
                        f23 = 1.0f;
                    } else {
                        f23 = 0.0f;
                    }
                    textView4.setAlpha(AndroidUtilities.lerp(f22, f23, i1Var.f19369e));
                }
                return;
            case 18:
                g1 g1Var = (g1) this.f10539c;
                if (this.f10538b) {
                    f24 = 1.0f;
                } else {
                    f24 = 0.0f;
                }
                g1Var.setTextColor(i0.a.d(f24, -1, -9194260));
                g1Var.setIconColor(i0.a.d(f24, -1, -9194260));
                return;
            case 19:
                l4 l4Var = (l4) this.f10539c;
                boolean z20 = this.f10538b;
                if (z20) {
                    f25 = 1.0f;
                } else {
                    f25 = 0.0f;
                }
                l4Var.U0 = f25;
                l4Var.m0.setTranslationY(((1.0f - f25) * AndroidUtilities.dp(51.0f)) + l4Var.f40022l0);
                if (!z20) {
                    l4Var.m0.setVisibility(8);
                    return;
                }
                return;
            case 20:
                b5 b5Var = (b5) this.f10539c;
                if (!this.f10538b) {
                    b5Var.setVisibility(4);
                    com.google.firebase.messaging.l lVar2 = ((r4) b5Var).C;
                    if (lVar2.f4157a) {
                        lVar2.f4157a = false;
                        if (((r4) lVar2.d).getParent() != null) {
                            ((WindowManager) lVar2.f4159c).removeView((r4) lVar2.d);
                        }
                        r4 r4Var = (r4) lVar2.d;
                        r4Var.A = true;
                        y4 y4Var = r4Var.f36644y;
                        if (y4Var != null) {
                            if (y4Var.f44716g) {
                                y4Var.f44716g = false;
                                y4Var.f44712b.removeObserver(y4Var.f44711a, y4Var.f44714e);
                            }
                            r4Var.f36644y = null;
                        }
                        lVar2.d = null;
                        ((ViewGroup) lVar2.f4158b).requestDisallowInterceptTouchEvent(false);
                        lVar2.f4158b = null;
                        lVar2.f4159c = null;
                        return;
                    }
                    return;
                }
                return;
            case 21:
                t1 t1Var = (t1) this.f10539c;
                s1 s1Var = t1Var.Vc;
                int g10 = s1Var.g();
                int i17 = t1Var.f25355dd;
                if (i17 != g10) {
                    t1Var.t1(i17, g10, this.f10538b);
                    return;
                }
                t1Var.f25399gd = false;
                s1Var.a2 = i17;
                return;
            case 22:
                e2 e2Var = (e2) this.f10539c;
                AnimatorSet animatorSet = e2Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.N = null;
                    if (!this.f10538b) {
                        e2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                t5 t5Var = (t5) this.f10539c;
                AnimatorSet animatorSet2 = t5Var.F;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.F = null;
                    if (!this.f10538b) {
                        t5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                r7 r7Var = (r7) this.f10539c;
                ValueAnimator valueAnimator = r7Var.f25120w0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f10538b) {
                        f26 = 1.0f;
                    } else {
                        f26 = 0.0f;
                    }
                    r7Var.f25122x0 = f26;
                    r7Var.f25120w0 = null;
                    return;
                }
                return;
            case 25:
                ya yaVar = (ya) this.f10539c;
                AnimatorSet animatorSet3 = yaVar.f26004f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    yaVar.f26004f = null;
                    if (!this.f10538b) {
                        yaVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ImageView imageView = ((ja) this.f10539c).d;
                if (this.f10538b) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                return;
            case 27:
                id idVar = (id) this.f10539c;
                if (idVar.f39118n != null && (fdVar = idVar.h) != null) {
                    if (this.f10538b) {
                        fdVar.setVisibility(4);
                    } else {
                        idVar.f39123r.setVisibility(4);
                    }
                    idVar.f39118n = null;
                    return;
                }
                return;
            case 28:
                qn qnVar = (qn) this.f10539c;
                AnimatorSet animatorSet4 = qnVar.D0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f10538b) {
                        qnVar.C0.setVisibility(4);
                        return;
                    }
                    if (qnVar.f42141y0) {
                        view = qnVar.f42153z0;
                    } else {
                        view = qnVar.f42127x0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            default:
                ho hoVar = (ho) this.f10539c;
                if (hoVar.h != null && (radialProgressView2 = hoVar.f38852n) != null) {
                    if (!this.f10538b) {
                        radialProgressView2.setVisibility(4);
                        hoVar.f38844f.setVisibility(4);
                    }
                    hoVar.h = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f10537a) {
            case 1:
                super.onAnimationStart(animator);
                try {
                    ((ih.r) this.f10539c).performHapticFeedback(3);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
