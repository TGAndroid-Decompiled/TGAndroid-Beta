package mi;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f60;
public final class q4 implements View.OnClickListener {
    public final int f19840a;
    public final t4 f19841b;

    public q4(t4 t4Var, int i3) {
        this.f19840a = i3;
        this.f19841b = t4Var;
    }

    @Override
    public final void onClick(View view) {
        int i3;
        int i10;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        int i11 = this.f19840a;
        final t4 t4Var = this.f19841b;
        switch (i11) {
            case 0:
                ArrayList arrayList = t4Var.F;
                int indexOf = arrayList.indexOf(view);
                if (t4Var.O != null && t4Var.f20029a != null) {
                    List n4 = t4Var.n();
                    if (indexOf >= 0 && indexOf < n4.size() && indexOf < arrayList.size()) {
                        final s sVar = (s) n4.get(indexOf);
                        f60 D1 = t4Var.O.f19749a.f19916p3.D1((View) arrayList.get(indexOf));
                        boolean z10 = sVar.f19870n;
                        if (z10) {
                            i3 = 2131232377;
                        } else {
                            i3 = 2131232376;
                        }
                        if (z10) {
                            i10 = 2131751431;
                        } else {
                            i10 = 2131751155;
                        }
                        D1.c(i3, bd.M0(i10, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        t4 t4Var2 = t4Var;
                                        m3 m3Var = t4Var2.O;
                                        if (m3Var != null && (aVar3 = t4Var2.f20029a) != null) {
                                            t3 t3Var = m3Var.f19749a;
                                            t3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                g2 g2Var = t3Var.R3;
                                                if (g2Var != null) {
                                                    g2Var.d();
                                                }
                                                sVar2.f19870n = !sVar2.f19870n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, sVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = sVar2.f19870n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = sVar2.f19870n;
                                                }
                                                t3Var.q4(aVar3);
                                                g2 g2Var2 = t3Var.R3;
                                                if (g2Var2 != null) {
                                                    g2Var2.h();
                                                }
                                                t3Var.f19916p3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        t4 t4Var3 = t4Var;
                                        m3 m3Var2 = t4Var3.O;
                                        if (m3Var2 != null && (aVar4 = t4Var3.f20029a) != null) {
                                            t3.R1(aVar4, sVar, m3Var2.f19749a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        D1.c(2131232108, bd.M0(2131751599, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        t4 t4Var2 = t4Var;
                                        m3 m3Var = t4Var2.O;
                                        if (m3Var != null && (aVar3 = t4Var2.f20029a) != null) {
                                            t3 t3Var = m3Var.f19749a;
                                            t3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                g2 g2Var = t3Var.R3;
                                                if (g2Var != null) {
                                                    g2Var.d();
                                                }
                                                sVar2.f19870n = !sVar2.f19870n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, sVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = sVar2.f19870n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = sVar2.f19870n;
                                                }
                                                t3Var.q4(aVar3);
                                                g2 g2Var2 = t3Var.R3;
                                                if (g2Var2 != null) {
                                                    g2Var2.h();
                                                }
                                                t3Var.f19916p3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        t4 t4Var3 = t4Var;
                                        m3 m3Var2 = t4Var3.O;
                                        if (m3Var2 != null && (aVar4 = t4Var3.f20029a) != null) {
                                            t3.R1(aVar4, sVar, m3Var2.f19749a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        D1.a0(0.0f, -org.telegram.messenger.g0.L(38.0f));
                        if (t4Var.I) {
                            D1.f33749u = false;
                            D1.v = true;
                            D1.f33747s = 0;
                        }
                        D1.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m3 m3Var = t4Var.O;
                if (m3Var != null && (aVar = t4Var.f20029a) != null) {
                    t3 t3Var = m3Var.f19749a;
                    t3Var.f19909j4 = aVar;
                    t3Var.f19916p3.O(0);
                    return;
                }
                return;
            default:
                m3 m3Var2 = t4Var.O;
                if (m3Var2 != null && (aVar2 = t4Var.f20029a) != null) {
                    t3 t3Var2 = m3Var2.f19749a;
                    t3Var2.getClass();
                    if (t3.E3(aVar2.f19431b)) {
                        g2 g2Var = t3Var2.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> j32 = t3.j3(aVar2.f19431b);
                        TL_iv.PageBlock pageBlock = aVar2.f19431b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (j32 == null) {
                                j32 = new ArrayList<>();
                            }
                            pageblockcollage.items = j32;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (j32 == null) {
                                j32 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = j32;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.f19431b = pageblockslideshow;
                        g2 g2Var2 = t3Var2.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        View C1 = t3Var2.C1(aVar2);
                        if (C1 instanceof t4) {
                            t4 t4Var2 = (t4) C1;
                            ValueAnimator valueAnimator = t4Var2.f19948j0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                t4Var2.f19948j0 = null;
                            }
                            if (t4Var2.getParent() != null) {
                                t4Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = t4Var2.f19947i0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                t4Var2.f19947i0 = null;
                            }
                            t4Var2.f19939a0 = 0;
                            t4Var2.f19940b0 = 0.0f;
                            t4Var2.q(true);
                            t4Var2.requestLayout();
                            t4Var2.invalidate();
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
