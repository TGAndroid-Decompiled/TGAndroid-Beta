package bi;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.dd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.z60;
public final class b5 implements View.OnClickListener {
    public final int f2865a;
    public final f5 f2866b;

    public b5(f5 f5Var, int i10) {
        this.f2865a = i10;
        this.f2866b = f5Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        int i12 = this.f2865a;
        final f5 f5Var = this.f2866b;
        switch (i12) {
            case 0:
                ArrayList arrayList = f5Var.E;
                int indexOf = arrayList.indexOf(view);
                if (f5Var.N != null && f5Var.f2881a != null) {
                    List n10 = f5Var.n();
                    if (indexOf >= 0 && indexOf < n10.size() && indexOf < arrayList.size()) {
                        final w wVar = (w) n10.get(indexOf);
                        z60 U = f5Var.N.f3436a.f2938o3.U((View) arrayList.get(indexOf));
                        boolean z10 = wVar.f3426n;
                        if (z10) {
                            i10 = 2131232376;
                        } else {
                            i10 = 2131232375;
                        }
                        if (z10) {
                            i11 = 2131751431;
                        } else {
                            i11 = 2131751155;
                        }
                        U.c(i10, dd.L0(i11, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        f5 f5Var2 = f5Var;
                                        w3 w3Var = f5Var2.N;
                                        if (w3Var != null && (aVar3 = f5Var2.f2881a) != null) {
                                            d4 d4Var = w3Var.f3436a;
                                            d4Var.getClass();
                                            w wVar2 = wVar;
                                            if (wVar2 != null) {
                                                o2 o2Var = d4Var.Q3;
                                                if (o2Var != null) {
                                                    o2Var.d();
                                                }
                                                wVar2.f3426n = !wVar2.f3426n;
                                                TL_iv.PageBlock Q3 = d4.Q3(aVar3, wVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = wVar2.f3426n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = wVar2.f3426n;
                                                }
                                                d4Var.q4(aVar3);
                                                o2 o2Var2 = d4Var.Q3;
                                                if (o2Var2 != null) {
                                                    o2Var2.h();
                                                }
                                                d4Var.f2938o3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        f5 f5Var3 = f5Var;
                                        w3 w3Var2 = f5Var3.N;
                                        if (w3Var2 != null && (aVar4 = f5Var3.f2881a) != null) {
                                            d4.Q1(aVar4, wVar, w3Var2.f3436a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        U.c(2131232107, dd.L0(2131751599, null), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        f5 f5Var2 = f5Var;
                                        w3 w3Var = f5Var2.N;
                                        if (w3Var != null && (aVar3 = f5Var2.f2881a) != null) {
                                            d4 d4Var = w3Var.f3436a;
                                            d4Var.getClass();
                                            w wVar2 = wVar;
                                            if (wVar2 != null) {
                                                o2 o2Var = d4Var.Q3;
                                                if (o2Var != null) {
                                                    o2Var.d();
                                                }
                                                wVar2.f3426n = !wVar2.f3426n;
                                                TL_iv.PageBlock Q3 = d4.Q3(aVar3, wVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = wVar2.f3426n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = wVar2.f3426n;
                                                }
                                                d4Var.q4(aVar3);
                                                o2 o2Var2 = d4Var.Q3;
                                                if (o2Var2 != null) {
                                                    o2Var2.h();
                                                }
                                                d4Var.f2938o3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        f5 f5Var3 = f5Var;
                                        w3 w3Var2 = f5Var3.N;
                                        if (w3Var2 != null && (aVar4 = f5Var3.f2881a) != null) {
                                            d4.Q1(aVar4, wVar, w3Var2.f3436a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        U.a0(0.0f, -org.telegram.messenger.i0.L(38.0f));
                        if (f5Var.H) {
                            U.f33046u = false;
                            U.v = true;
                            U.f33044s = 0;
                        }
                        U.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                w3 w3Var = f5Var.N;
                if (w3Var != null && (aVar = f5Var.f2881a) != null) {
                    d4 d4Var = w3Var.f3436a;
                    d4Var.f2931i4 = aVar;
                    d4Var.f2938o3.p(0);
                    return;
                }
                return;
            default:
                w3 w3Var2 = f5Var.N;
                if (w3Var2 != null && (aVar2 = f5Var.f2881a) != null) {
                    d4 d4Var2 = w3Var2.f3436a;
                    d4Var2.getClass();
                    if (d4.E3(aVar2.f2818b)) {
                        o2 o2Var = d4Var2.Q3;
                        if (o2Var != null) {
                            o2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> j32 = d4.j3(aVar2.f2818b);
                        TL_iv.PageBlock pageBlock = aVar2.f2818b;
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
                        aVar2.f2818b = pageblockslideshow;
                        o2 o2Var2 = d4Var2.Q3;
                        if (o2Var2 != null) {
                            o2Var2.h();
                        }
                        View C1 = d4Var2.C1(aVar2);
                        if (C1 instanceof f5) {
                            f5 f5Var2 = (f5) C1;
                            ValueAnimator valueAnimator = f5Var2.f3009i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                f5Var2.f3009i0 = null;
                            }
                            if (f5Var2.getParent() != null) {
                                f5Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = f5Var2.f3008h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                f5Var2.f3008h0 = null;
                            }
                            f5Var2.W = 0;
                            f5Var2.f3001a0 = 0.0f;
                            f5Var2.q(true);
                            f5Var2.requestLayout();
                            f5Var2.invalidate();
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
