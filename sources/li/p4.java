package li;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.k60;
public final class p4 implements View.OnClickListener {
    public final int f18773a;
    public final s4 f18774b;

    public p4(s4 s4Var, int i7) {
        this.f18773a = i7;
        this.f18774b = s4Var;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        int i11 = this.f18773a;
        final s4 s4Var = this.f18774b;
        switch (i11) {
            case 0:
                ArrayList arrayList = s4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (s4Var.N != null && s4Var.f18986a != null) {
                    List n10 = s4Var.n();
                    if (indexOf >= 0 && indexOf < n10.size() && indexOf < arrayList.size()) {
                        final s sVar = (s) n10.get(indexOf);
                        k60 J = s4Var.N.f18698a.f18887o3.J((View) arrayList.get(indexOf));
                        boolean z9 = sVar.f18822n;
                        if (z9) {
                            i7 = 2131232377;
                        } else {
                            i7 = 2131232376;
                        }
                        if (z9) {
                            i10 = 2131751431;
                        } else {
                            i10 = 2131751155;
                        }
                        J.c(i7, hd.M0(i10, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        s4 s4Var2 = s4Var;
                                        m3 m3Var = s4Var2.N;
                                        if (m3Var != null && (aVar3 = s4Var2.f18986a) != null) {
                                            t3 t3Var = m3Var.f18698a;
                                            t3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                f2 f2Var = t3Var.Q3;
                                                if (f2Var != null) {
                                                    f2Var.d();
                                                }
                                                sVar2.f18822n = !sVar2.f18822n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, sVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = sVar2.f18822n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = sVar2.f18822n;
                                                }
                                                t3Var.q4(aVar3);
                                                f2 f2Var2 = t3Var.Q3;
                                                if (f2Var2 != null) {
                                                    f2Var2.h();
                                                }
                                                t3Var.f18887o3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        s4 s4Var3 = s4Var;
                                        m3 m3Var2 = s4Var3.N;
                                        if (m3Var2 != null && (aVar4 = s4Var3.f18986a) != null) {
                                            t3.R1(aVar4, sVar, m3Var2.f18698a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        J.c(2131232108, hd.M0(2131751599, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        s4 s4Var2 = s4Var;
                                        m3 m3Var = s4Var2.N;
                                        if (m3Var != null && (aVar3 = s4Var2.f18986a) != null) {
                                            t3 t3Var = m3Var.f18698a;
                                            t3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                f2 f2Var = t3Var.Q3;
                                                if (f2Var != null) {
                                                    f2Var.d();
                                                }
                                                sVar2.f18822n = !sVar2.f18822n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, sVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = sVar2.f18822n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = sVar2.f18822n;
                                                }
                                                t3Var.q4(aVar3);
                                                f2 f2Var2 = t3Var.Q3;
                                                if (f2Var2 != null) {
                                                    f2Var2.h();
                                                }
                                                t3Var.f18887o3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        s4 s4Var3 = s4Var;
                                        m3 m3Var2 = s4Var3.N;
                                        if (m3Var2 != null && (aVar4 = s4Var3.f18986a) != null) {
                                            t3.R1(aVar4, sVar, m3Var2.f18698a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        J.a0(0.0f, -org.telegram.messenger.g0.L(38.0f));
                        if (s4Var.H) {
                            J.f35218u = false;
                            J.v = true;
                            J.f35216s = 0;
                        }
                        J.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m3 m3Var = s4Var.N;
                if (m3Var != null && (aVar = s4Var.f18986a) != null) {
                    t3 t3Var = m3Var.f18698a;
                    t3Var.f18879i4 = aVar;
                    t3Var.f18887o3.g(0);
                    return;
                }
                return;
            default:
                m3 m3Var2 = s4Var.N;
                if (m3Var2 != null && (aVar2 = s4Var.f18986a) != null) {
                    t3 t3Var2 = m3Var2.f18698a;
                    t3Var2.getClass();
                    if (t3.E3(aVar2.f18389b)) {
                        f2 f2Var = t3Var2.Q3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> j3 = t3.j3(aVar2.f18389b);
                        TL_iv.PageBlock pageBlock = aVar2.f18389b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (j3 == null) {
                                j3 = new ArrayList<>();
                            }
                            pageblockcollage.items = j3;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (j3 == null) {
                                j3 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = j3;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.f18389b = pageblockslideshow;
                        f2 f2Var2 = t3Var2.Q3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        View C1 = t3Var2.C1(aVar2);
                        if (C1 instanceof s4) {
                            s4 s4Var2 = (s4) C1;
                            ValueAnimator valueAnimator = s4Var2.f18846i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                s4Var2.f18846i0 = null;
                            }
                            if (s4Var2.getParent() != null) {
                                s4Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = s4Var2.f18845h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                s4Var2.f18845h0 = null;
                            }
                            s4Var2.W = 0;
                            s4Var2.f18838a0 = 0.0f;
                            s4Var2.q(true);
                            s4Var2.requestLayout();
                            s4Var2.invalidate();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
