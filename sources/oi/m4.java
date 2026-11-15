package oi;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.m60;
public final class m4 implements View.OnClickListener {
    public final int f21815a;
    public final p4 f21816b;

    public m4(p4 p4Var, int i7) {
        this.f21815a = i7;
        this.f21816b = p4Var;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        int i11 = this.f21815a;
        final p4 p4Var = this.f21816b;
        switch (i11) {
            case 0:
                ArrayList arrayList = p4Var.F;
                int indexOf = arrayList.indexOf(view);
                if (p4Var.O != null && p4Var.f22106a != null) {
                    List n10 = p4Var.n();
                    if (indexOf >= 0 && indexOf < n10.size() && indexOf < arrayList.size()) {
                        final r rVar = (r) n10.get(indexOf);
                        m60 g02 = p4Var.O.f21757a.f21931p3.g0((View) arrayList.get(indexOf));
                        boolean z10 = rVar.f21968n;
                        if (z10) {
                            i7 = 2131232378;
                        } else {
                            i7 = 2131232377;
                        }
                        if (z10) {
                            i10 = 2131751430;
                        } else {
                            i10 = 2131751154;
                        }
                        g02.c(i7, hd.M0(i10, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        p4 p4Var2 = p4Var;
                                        j3 j3Var = p4Var2.O;
                                        if (j3Var != null && (aVar3 = p4Var2.f22106a) != null) {
                                            q3 q3Var = j3Var.f21757a;
                                            q3Var.getClass();
                                            r rVar2 = rVar;
                                            if (rVar2 != null) {
                                                d2 d2Var = q3Var.R3;
                                                if (d2Var != null) {
                                                    d2Var.d();
                                                }
                                                rVar2.f21968n = !rVar2.f21968n;
                                                TL_iv.PageBlock Q3 = q3.Q3(aVar3, rVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = rVar2.f21968n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = rVar2.f21968n;
                                                }
                                                q3Var.q4(aVar3);
                                                d2 d2Var2 = q3Var.R3;
                                                if (d2Var2 != null) {
                                                    d2Var2.h();
                                                }
                                                q3Var.f21931p3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        p4 p4Var3 = p4Var;
                                        j3 j3Var2 = p4Var3.O;
                                        if (j3Var2 != null && (aVar4 = p4Var3.f22106a) != null) {
                                            q3.R1(aVar4, rVar, j3Var2.f21757a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        g02.c(2131232109, hd.M0(2131751598, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        p4 p4Var2 = p4Var;
                                        j3 j3Var = p4Var2.O;
                                        if (j3Var != null && (aVar3 = p4Var2.f22106a) != null) {
                                            q3 q3Var = j3Var.f21757a;
                                            q3Var.getClass();
                                            r rVar2 = rVar;
                                            if (rVar2 != null) {
                                                d2 d2Var = q3Var.R3;
                                                if (d2Var != null) {
                                                    d2Var.d();
                                                }
                                                rVar2.f21968n = !rVar2.f21968n;
                                                TL_iv.PageBlock Q3 = q3.Q3(aVar3, rVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = rVar2.f21968n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = rVar2.f21968n;
                                                }
                                                q3Var.q4(aVar3);
                                                d2 d2Var2 = q3Var.R3;
                                                if (d2Var2 != null) {
                                                    d2Var2.h();
                                                }
                                                q3Var.f21931p3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        p4 p4Var3 = p4Var;
                                        j3 j3Var2 = p4Var3.O;
                                        if (j3Var2 != null && (aVar4 = p4Var3.f22106a) != null) {
                                            q3.R1(aVar4, rVar, j3Var2.f21757a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        g02.a0(0.0f, -org.telegram.messenger.g0.L(38.0f));
                        if (p4Var.I) {
                            g02.f37113u = false;
                            g02.v = true;
                            g02.f37111s = 0;
                        }
                        g02.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                j3 j3Var = p4Var.O;
                if (j3Var != null && (aVar = p4Var.f22106a) != null) {
                    q3 q3Var = j3Var.f21757a;
                    q3Var.f21924j4 = aVar;
                    q3Var.f21931p3.s(0);
                    return;
                }
                return;
            default:
                j3 j3Var2 = p4Var.O;
                if (j3Var2 != null && (aVar2 = p4Var.f22106a) != null) {
                    q3 q3Var2 = j3Var2.f21757a;
                    q3Var2.getClass();
                    if (q3.E3(aVar2.f21544b)) {
                        d2 d2Var = q3Var2.R3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> j3 = q3.j3(aVar2.f21544b);
                        TL_iv.PageBlock pageBlock = aVar2.f21544b;
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
                        aVar2.f21544b = pageblockslideshow;
                        d2 d2Var2 = q3Var2.R3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        View C1 = q3Var2.C1(aVar2);
                        if (C1 instanceof p4) {
                            p4 p4Var2 = (p4) C1;
                            ValueAnimator valueAnimator = p4Var2.f21889j0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                p4Var2.f21889j0 = null;
                            }
                            if (p4Var2.getParent() != null) {
                                p4Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = p4Var2.f21888i0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                p4Var2.f21888i0 = null;
                            }
                            p4Var2.f21880a0 = 0;
                            p4Var2.f21881b0 = 0.0f;
                            p4Var2.q(true);
                            p4Var2.requestLayout();
                            p4Var2.invalidate();
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
