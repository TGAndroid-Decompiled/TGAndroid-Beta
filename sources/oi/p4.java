package oi;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.x60;
public final class p4 implements View.OnClickListener {
    public final int f22379a;
    public final s4 f22380b;

    public p4(s4 s4Var, int i7) {
        this.f22379a = i7;
        this.f22380b = s4Var;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        int i11 = this.f22379a;
        final s4 s4Var = this.f22380b;
        switch (i11) {
            case 0:
                ArrayList arrayList = s4Var.F;
                int indexOf = arrayList.indexOf(view);
                if (s4Var.O != null && s4Var.f22598a != null) {
                    List n10 = s4Var.n();
                    if (indexOf >= 0 && indexOf < n10.size() && indexOf < arrayList.size()) {
                        final s sVar = (s) n10.get(indexOf);
                        x60 i02 = s4Var.O.f22306a.f22495p3.i0((View) arrayList.get(indexOf));
                        boolean z10 = sVar.f22432n;
                        if (z10) {
                            i7 = 2131232382;
                        } else {
                            i7 = 2131232381;
                        }
                        if (z10) {
                            i10 = 2131751418;
                        } else {
                            i10 = 2131751142;
                        }
                        i02.c(i7, gd.N0(i10, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        s4 s4Var2 = s4Var;
                                        m3 m3Var = s4Var2.O;
                                        if (m3Var != null && (aVar3 = s4Var2.f22598a) != null) {
                                            t3 t3Var = m3Var.f22306a;
                                            t3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                g2 g2Var = t3Var.R3;
                                                if (g2Var != null) {
                                                    g2Var.d();
                                                }
                                                sVar2.f22432n = !sVar2.f22432n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, sVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = sVar2.f22432n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = sVar2.f22432n;
                                                }
                                                t3Var.q4(aVar3);
                                                g2 g2Var2 = t3Var.R3;
                                                if (g2Var2 != null) {
                                                    g2Var2.h();
                                                }
                                                t3Var.f22495p3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        s4 s4Var3 = s4Var;
                                        m3 m3Var2 = s4Var3.O;
                                        if (m3Var2 != null && (aVar4 = s4Var3.f22598a) != null) {
                                            t3.R1(aVar4, sVar, m3Var2.f22306a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        i02.c(2131232113, gd.N0(2131751586, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        s4 s4Var2 = s4Var;
                                        m3 m3Var = s4Var2.O;
                                        if (m3Var != null && (aVar3 = s4Var2.f22598a) != null) {
                                            t3 t3Var = m3Var.f22306a;
                                            t3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                g2 g2Var = t3Var.R3;
                                                if (g2Var != null) {
                                                    g2Var.d();
                                                }
                                                sVar2.f22432n = !sVar2.f22432n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, sVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = sVar2.f22432n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = sVar2.f22432n;
                                                }
                                                t3Var.q4(aVar3);
                                                g2 g2Var2 = t3Var.R3;
                                                if (g2Var2 != null) {
                                                    g2Var2.h();
                                                }
                                                t3Var.f22495p3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        s4 s4Var3 = s4Var;
                                        m3 m3Var2 = s4Var3.O;
                                        if (m3Var2 != null && (aVar4 = s4Var3.f22598a) != null) {
                                            t3.R1(aVar4, sVar, m3Var2.f22306a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        i02.b0(0.0f, -org.telegram.messenger.g0.L(38.0f));
                        if (s4Var.I) {
                            i02.f41896u = false;
                            i02.v = true;
                            i02.f41892s = 0;
                        }
                        i02.a0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m3 m3Var = s4Var.O;
                if (m3Var != null && (aVar = s4Var.f22598a) != null) {
                    t3 t3Var = m3Var.f22306a;
                    t3Var.f22488j4 = aVar;
                    t3Var.f22495p3.r(0);
                    return;
                }
                return;
            default:
                m3 m3Var2 = s4Var.O;
                if (m3Var2 != null && (aVar2 = s4Var.f22598a) != null) {
                    t3 t3Var2 = m3Var2.f22306a;
                    t3Var2.getClass();
                    if (t3.E3(aVar2.f22001b)) {
                        g2 g2Var = t3Var2.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> j3 = t3.j3(aVar2.f22001b);
                        TL_iv.PageBlock pageBlock = aVar2.f22001b;
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
                        aVar2.f22001b = pageblockslideshow;
                        g2 g2Var2 = t3Var2.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        View C1 = t3Var2.C1(aVar2);
                        if (C1 instanceof s4) {
                            s4 s4Var2 = (s4) C1;
                            ValueAnimator valueAnimator = s4Var2.f22453j0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                s4Var2.f22453j0 = null;
                            }
                            if (s4Var2.getParent() != null) {
                                s4Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = s4Var2.f22452i0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                s4Var2.f22452i0 = null;
                            }
                            s4Var2.f22444a0 = 0;
                            s4Var2.f22445b0 = 0.0f;
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
