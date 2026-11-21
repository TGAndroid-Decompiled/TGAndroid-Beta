package oi;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a70;
public final class p4 implements View.OnClickListener {
    public final int f22310a;
    public final s4 f22311b;

    public p4(s4 s4Var, int i7) {
        this.f22310a = i7;
        this.f22311b = s4Var;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        int i11 = this.f22310a;
        final s4 s4Var = this.f22311b;
        switch (i11) {
            case 0:
                ArrayList arrayList = s4Var.F;
                int indexOf = arrayList.indexOf(view);
                if (s4Var.O != null && s4Var.f22528a != null) {
                    List n10 = s4Var.n();
                    if (indexOf >= 0 && indexOf < n10.size() && indexOf < arrayList.size()) {
                        final r rVar = (r) n10.get(indexOf);
                        a70 G0 = s4Var.O.f22235a.f22425p3.G0((View) arrayList.get(indexOf));
                        boolean z10 = rVar.f22352n;
                        if (z10) {
                            i7 = 2131232379;
                        } else {
                            i7 = 2131232378;
                        }
                        if (z10) {
                            i10 = 2131751418;
                        } else {
                            i10 = 2131751142;
                        }
                        G0.c(i7, gd.N0(i10, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        s4 s4Var2 = s4Var;
                                        m3 m3Var = s4Var2.O;
                                        if (m3Var != null && (aVar3 = s4Var2.f22528a) != null) {
                                            t3 t3Var = m3Var.f22235a;
                                            t3Var.getClass();
                                            r rVar2 = rVar;
                                            if (rVar2 != null) {
                                                g2 g2Var = t3Var.R3;
                                                if (g2Var != null) {
                                                    g2Var.d();
                                                }
                                                rVar2.f22352n = !rVar2.f22352n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, rVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = rVar2.f22352n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = rVar2.f22352n;
                                                }
                                                t3Var.q4(aVar3);
                                                g2 g2Var2 = t3Var.R3;
                                                if (g2Var2 != null) {
                                                    g2Var2.h();
                                                }
                                                t3Var.f22425p3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        s4 s4Var3 = s4Var;
                                        m3 m3Var2 = s4Var3.O;
                                        if (m3Var2 != null && (aVar4 = s4Var3.f22528a) != null) {
                                            t3.R1(aVar4, rVar, m3Var2.f22235a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        G0.c(2131232110, gd.N0(2131751586, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        s4 s4Var2 = s4Var;
                                        m3 m3Var = s4Var2.O;
                                        if (m3Var != null && (aVar3 = s4Var2.f22528a) != null) {
                                            t3 t3Var = m3Var.f22235a;
                                            t3Var.getClass();
                                            r rVar2 = rVar;
                                            if (rVar2 != null) {
                                                g2 g2Var = t3Var.R3;
                                                if (g2Var != null) {
                                                    g2Var.d();
                                                }
                                                rVar2.f22352n = !rVar2.f22352n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, rVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = rVar2.f22352n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = rVar2.f22352n;
                                                }
                                                t3Var.q4(aVar3);
                                                g2 g2Var2 = t3Var.R3;
                                                if (g2Var2 != null) {
                                                    g2Var2.h();
                                                }
                                                t3Var.f22425p3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        s4 s4Var3 = s4Var;
                                        m3 m3Var2 = s4Var3.O;
                                        if (m3Var2 != null && (aVar4 = s4Var3.f22528a) != null) {
                                            t3.R1(aVar4, rVar, m3Var2.f22235a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        G0.b0(0.0f, -org.telegram.messenger.g0.L(38.0f));
                        if (s4Var.I) {
                            G0.f33388u = false;
                            G0.v = true;
                            G0.f33384s = 0;
                        }
                        G0.a0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m3 m3Var = s4Var.O;
                if (m3Var != null && (aVar = s4Var.f22528a) != null) {
                    t3 t3Var = m3Var.f22235a;
                    t3Var.f22418j4 = aVar;
                    t3Var.f22425p3.D(0);
                    return;
                }
                return;
            default:
                m3 m3Var2 = s4Var.O;
                if (m3Var2 != null && (aVar2 = s4Var.f22528a) != null) {
                    t3 t3Var2 = m3Var2.f22235a;
                    t3Var2.getClass();
                    if (t3.E3(aVar2.f21932b)) {
                        g2 g2Var = t3Var2.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> j3 = t3.j3(aVar2.f21932b);
                        TL_iv.PageBlock pageBlock = aVar2.f21932b;
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
                        aVar2.f21932b = pageblockslideshow;
                        g2 g2Var2 = t3Var2.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        View C1 = t3Var2.C1(aVar2);
                        if (C1 instanceof s4) {
                            s4 s4Var2 = (s4) C1;
                            ValueAnimator valueAnimator = s4Var2.f22382j0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                s4Var2.f22382j0 = null;
                            }
                            if (s4Var2.getParent() != null) {
                                s4Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = s4Var2.f22381i0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                s4Var2.f22381i0 = null;
                            }
                            s4Var2.f22373a0 = 0;
                            s4Var2.f22374b0 = 0.0f;
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
