package oi;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a70;
public final class o4 implements View.OnClickListener {
    public final int f22251a;
    public final r4 f22252b;

    public o4(r4 r4Var, int i7) {
        this.f22251a = i7;
        this.f22252b = r4Var;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        int i11 = this.f22251a;
        final r4 r4Var = this.f22252b;
        switch (i11) {
            case 0:
                ArrayList arrayList = r4Var.F;
                int indexOf = arrayList.indexOf(view);
                if (r4Var.O != null && r4Var.f22468a != null) {
                    List n10 = r4Var.n();
                    if (indexOf >= 0 && indexOf < n10.size() && indexOf < arrayList.size()) {
                        final r rVar = (r) n10.get(indexOf);
                        a70 G0 = r4Var.O.f22176a.f22365p3.G0((View) arrayList.get(indexOf));
                        boolean z10 = rVar.f22300n;
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
                        G0.c(i7, hd.N0(i10, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        r4 r4Var2 = r4Var;
                                        l3 l3Var = r4Var2.O;
                                        if (l3Var != null && (aVar3 = r4Var2.f22468a) != null) {
                                            s3 s3Var = l3Var.f22176a;
                                            s3Var.getClass();
                                            r rVar2 = rVar;
                                            if (rVar2 != null) {
                                                e2 e2Var = s3Var.R3;
                                                if (e2Var != null) {
                                                    e2Var.d();
                                                }
                                                rVar2.f22300n = !rVar2.f22300n;
                                                TL_iv.PageBlock Q3 = s3.Q3(aVar3, rVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = rVar2.f22300n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = rVar2.f22300n;
                                                }
                                                s3Var.q4(aVar3);
                                                e2 e2Var2 = s3Var.R3;
                                                if (e2Var2 != null) {
                                                    e2Var2.h();
                                                }
                                                s3Var.f22365p3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        r4 r4Var3 = r4Var;
                                        l3 l3Var2 = r4Var3.O;
                                        if (l3Var2 != null && (aVar4 = r4Var3.f22468a) != null) {
                                            s3.R1(aVar4, rVar, l3Var2.f22176a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        G0.c(2131232110, hd.N0(2131751586, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        r4 r4Var2 = r4Var;
                                        l3 l3Var = r4Var2.O;
                                        if (l3Var != null && (aVar3 = r4Var2.f22468a) != null) {
                                            s3 s3Var = l3Var.f22176a;
                                            s3Var.getClass();
                                            r rVar2 = rVar;
                                            if (rVar2 != null) {
                                                e2 e2Var = s3Var.R3;
                                                if (e2Var != null) {
                                                    e2Var.d();
                                                }
                                                rVar2.f22300n = !rVar2.f22300n;
                                                TL_iv.PageBlock Q3 = s3.Q3(aVar3, rVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = rVar2.f22300n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = rVar2.f22300n;
                                                }
                                                s3Var.q4(aVar3);
                                                e2 e2Var2 = s3Var.R3;
                                                if (e2Var2 != null) {
                                                    e2Var2.h();
                                                }
                                                s3Var.f22365p3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        r4 r4Var3 = r4Var;
                                        l3 l3Var2 = r4Var3.O;
                                        if (l3Var2 != null && (aVar4 = r4Var3.f22468a) != null) {
                                            s3.R1(aVar4, rVar, l3Var2.f22176a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        G0.b0(0.0f, -org.telegram.messenger.g0.L(38.0f));
                        if (r4Var.I) {
                            G0.f33367u = false;
                            G0.v = true;
                            G0.f33363s = 0;
                        }
                        G0.a0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                l3 l3Var = r4Var.O;
                if (l3Var != null && (aVar = r4Var.f22468a) != null) {
                    s3 s3Var = l3Var.f22176a;
                    s3Var.f22358j4 = aVar;
                    s3Var.f22365p3.D(0);
                    return;
                }
                return;
            default:
                l3 l3Var2 = r4Var.O;
                if (l3Var2 != null && (aVar2 = r4Var.f22468a) != null) {
                    s3 s3Var2 = l3Var2.f22176a;
                    s3Var2.getClass();
                    if (s3.E3(aVar2.f21901b)) {
                        e2 e2Var = s3Var2.R3;
                        if (e2Var != null) {
                            e2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> j3 = s3.j3(aVar2.f21901b);
                        TL_iv.PageBlock pageBlock = aVar2.f21901b;
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
                        aVar2.f21901b = pageblockslideshow;
                        e2 e2Var2 = s3Var2.R3;
                        if (e2Var2 != null) {
                            e2Var2.h();
                        }
                        View C1 = s3Var2.C1(aVar2);
                        if (C1 instanceof r4) {
                            r4 r4Var2 = (r4) C1;
                            ValueAnimator valueAnimator = r4Var2.f22328j0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                r4Var2.f22328j0 = null;
                            }
                            if (r4Var2.getParent() != null) {
                                r4Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = r4Var2.f22327i0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                r4Var2.f22327i0 = null;
                            }
                            r4Var2.f22319a0 = 0;
                            r4Var2.f22320b0 = 0.0f;
                            r4Var2.q(true);
                            r4Var2.requestLayout();
                            r4Var2.invalidate();
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
