package li;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.l60;
public final class p4 implements View.OnClickListener {
    public final int f18776a;
    public final s4 f18777b;

    public p4(s4 s4Var, int i7) {
        this.f18776a = i7;
        this.f18777b = s4Var;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        int i11 = this.f18776a;
        final s4 s4Var = this.f18777b;
        switch (i11) {
            case 0:
                ArrayList arrayList = s4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (s4Var.N != null && s4Var.f18989a != null) {
                    List n10 = s4Var.n();
                    if (indexOf >= 0 && indexOf < n10.size() && indexOf < arrayList.size()) {
                        final s sVar = (s) n10.get(indexOf);
                        l60 J = s4Var.N.f18701a.f18890o3.J((View) arrayList.get(indexOf));
                        boolean z9 = sVar.f18825n;
                        if (z9) {
                            i7 = 2131232377;
                        } else {
                            i7 = 2131232376;
                        }
                        if (z9) {
                            i10 = 2131751430;
                        } else {
                            i10 = 2131751154;
                        }
                        J.c(i7, id.M0(i10, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        s4 s4Var2 = s4Var;
                                        m3 m3Var = s4Var2.N;
                                        if (m3Var != null && (aVar3 = s4Var2.f18989a) != null) {
                                            t3 t3Var = m3Var.f18701a;
                                            t3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                f2 f2Var = t3Var.Q3;
                                                if (f2Var != null) {
                                                    f2Var.d();
                                                }
                                                sVar2.f18825n = !sVar2.f18825n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, sVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = sVar2.f18825n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = sVar2.f18825n;
                                                }
                                                t3Var.q4(aVar3);
                                                f2 f2Var2 = t3Var.Q3;
                                                if (f2Var2 != null) {
                                                    f2Var2.h();
                                                }
                                                t3Var.f18890o3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        s4 s4Var3 = s4Var;
                                        m3 m3Var2 = s4Var3.N;
                                        if (m3Var2 != null && (aVar4 = s4Var3.f18989a) != null) {
                                            t3.R1(aVar4, sVar, m3Var2.f18701a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        J.c(2131232108, id.M0(2131751598, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        s4 s4Var2 = s4Var;
                                        m3 m3Var = s4Var2.N;
                                        if (m3Var != null && (aVar3 = s4Var2.f18989a) != null) {
                                            t3 t3Var = m3Var.f18701a;
                                            t3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                f2 f2Var = t3Var.Q3;
                                                if (f2Var != null) {
                                                    f2Var.d();
                                                }
                                                sVar2.f18825n = !sVar2.f18825n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, sVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = sVar2.f18825n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = sVar2.f18825n;
                                                }
                                                t3Var.q4(aVar3);
                                                f2 f2Var2 = t3Var.Q3;
                                                if (f2Var2 != null) {
                                                    f2Var2.h();
                                                }
                                                t3Var.f18890o3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        s4 s4Var3 = s4Var;
                                        m3 m3Var2 = s4Var3.N;
                                        if (m3Var2 != null && (aVar4 = s4Var3.f18989a) != null) {
                                            t3.R1(aVar4, sVar, m3Var2.f18701a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        J.a0(0.0f, -org.telegram.messenger.g0.L(38.0f));
                        if (s4Var.H) {
                            J.f35619u = false;
                            J.v = true;
                            J.f35617s = 0;
                        }
                        J.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m3 m3Var = s4Var.N;
                if (m3Var != null && (aVar = s4Var.f18989a) != null) {
                    t3 t3Var = m3Var.f18701a;
                    t3Var.f18882i4 = aVar;
                    t3Var.f18890o3.g(0);
                    return;
                }
                return;
            default:
                m3 m3Var2 = s4Var.N;
                if (m3Var2 != null && (aVar2 = s4Var.f18989a) != null) {
                    t3 t3Var2 = m3Var2.f18701a;
                    t3Var2.getClass();
                    if (t3.E3(aVar2.f18392b)) {
                        f2 f2Var = t3Var2.Q3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> j3 = t3.j3(aVar2.f18392b);
                        TL_iv.PageBlock pageBlock = aVar2.f18392b;
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
                        aVar2.f18392b = pageblockslideshow;
                        f2 f2Var2 = t3Var2.Q3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        View C1 = t3Var2.C1(aVar2);
                        if (C1 instanceof s4) {
                            s4 s4Var2 = (s4) C1;
                            ValueAnimator valueAnimator = s4Var2.f18849i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                s4Var2.f18849i0 = null;
                            }
                            if (s4Var2.getParent() != null) {
                                s4Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = s4Var2.f18848h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                s4Var2.f18848h0 = null;
                            }
                            s4Var2.W = 0;
                            s4Var2.f18841a0 = 0.0f;
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
