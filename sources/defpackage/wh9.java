package defpackage;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_iv;
public final class wh9 implements View.OnClickListener {
    public final byte a;
    public final zh9 b;

    public wh9(zh9 zh9Var, byte b) {
        this.a = b;
        this.b = zh9Var;
    }

    @Override
    public final void onClick(View view) {
        int i;
        int i2;
        ll0 ll0Var;
        ll0 ll0Var2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        byte b = this.a;
        final zh9 zh9Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = zh9Var.F;
                int indexOf = arrayList.indexOf(view);
                if (zh9Var.O != null && zh9Var.a != null) {
                    List o = zh9Var.o();
                    if (indexOf >= 0 && indexOf < o.size() && indexOf < arrayList.size()) {
                        final i07 i07Var = (i07) o.get(indexOf);
                        bu5 C = zh9Var.O.a.p3.C((View) arrayList.get(indexOf));
                        if (i07Var.n) {
                            i = 2131232383;
                            i2 = 2131751367;
                        } else {
                            i = 2131232382;
                            i2 = 2131751091;
                        }
                        C.b(i, jb6.M0(i2, null), new Runnable() {
                            @Override
                            public final void run() {
                                ll0 ll0Var3;
                                ll0 ll0Var4;
                                byte b2 = r3;
                                i07 i07Var2 = i07Var;
                                zh9 zh9Var2 = zh9Var;
                                switch (b2) {
                                    case 0:
                                        vg9 vg9Var = zh9Var2.O;
                                        if (vg9Var != null && (ll0Var3 = zh9Var2.a) != null) {
                                            ch9 ch9Var = vg9Var.a;
                                            of9 of9Var = ch9Var.R3;
                                            if (of9Var != null) {
                                                of9Var.d();
                                            }
                                            i07Var2.n = !i07Var2.n;
                                            TL_iv.PageBlock J3 = ch9.J3(ll0Var3, i07Var2);
                                            if (J3 instanceof TL_iv.pageBlockPhoto) {
                                                ((TL_iv.pageBlockPhoto) J3).spoiler = i07Var2.n;
                                            } else if (J3 instanceof TL_iv.pageBlockVideo) {
                                                ((TL_iv.pageBlockVideo) J3).spoiler = i07Var2.n;
                                            }
                                            ch9Var.o4(ll0Var3);
                                            of9 of9Var2 = ch9Var.R3;
                                            if (of9Var2 != null) {
                                                of9Var2.h();
                                            }
                                            ch9Var.p3.onContentChanged();
                                            return;
                                        }
                                        return;
                                    default:
                                        vg9 vg9Var2 = zh9Var2.O;
                                        if (vg9Var2 != null && (ll0Var4 = zh9Var2.a) != null) {
                                            vg9Var2.a.n2(ll0Var4, i07Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        C.b(2131232114, jb6.M0(2131751535, null), new Runnable() {
                            @Override
                            public final void run() {
                                ll0 ll0Var3;
                                ll0 ll0Var4;
                                byte b2 = r3;
                                i07 i07Var2 = i07Var;
                                zh9 zh9Var2 = zh9Var;
                                switch (b2) {
                                    case 0:
                                        vg9 vg9Var = zh9Var2.O;
                                        if (vg9Var != null && (ll0Var3 = zh9Var2.a) != null) {
                                            ch9 ch9Var = vg9Var.a;
                                            of9 of9Var = ch9Var.R3;
                                            if (of9Var != null) {
                                                of9Var.d();
                                            }
                                            i07Var2.n = !i07Var2.n;
                                            TL_iv.PageBlock J3 = ch9.J3(ll0Var3, i07Var2);
                                            if (J3 instanceof TL_iv.pageBlockPhoto) {
                                                ((TL_iv.pageBlockPhoto) J3).spoiler = i07Var2.n;
                                            } else if (J3 instanceof TL_iv.pageBlockVideo) {
                                                ((TL_iv.pageBlockVideo) J3).spoiler = i07Var2.n;
                                            }
                                            ch9Var.o4(ll0Var3);
                                            of9 of9Var2 = ch9Var.R3;
                                            if (of9Var2 != null) {
                                                of9Var2.h();
                                            }
                                            ch9Var.p3.onContentChanged();
                                            return;
                                        }
                                        return;
                                    default:
                                        vg9 vg9Var2 = zh9Var2.O;
                                        if (vg9Var2 != null && (ll0Var4 = zh9Var2.a) != null) {
                                            vg9Var2.a.n2(ll0Var4, i07Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        C.b0(0.0f, -gm.L(38.0f));
                        if (zh9Var.I) {
                            C.u = false;
                            C.v = true;
                            C.s = (short) 0;
                        }
                        C.a0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                vg9 vg9Var = zh9Var.O;
                if (vg9Var != null && (ll0Var = zh9Var.a) != null) {
                    ch9 ch9Var = vg9Var.a;
                    ch9Var.j4 = ll0Var;
                    ch9Var.p3.c(0);
                    return;
                }
                return;
            default:
                vg9 vg9Var2 = zh9Var.O;
                if (vg9Var2 != null && (ll0Var2 = zh9Var.a) != null) {
                    ch9 ch9Var2 = vg9Var2.a;
                    if (ch9.x3(ll0Var2.b)) {
                        of9 of9Var = ch9Var2.R3;
                        if (of9Var != null) {
                            of9Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> c3 = ch9.c3(ll0Var2.b);
                        TL_iv.PageBlock pageBlock = ll0Var2.b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (c3 == null) {
                                c3 = new ArrayList<>();
                            }
                            pageblockcollage.items = c3;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (c3 == null) {
                                c3 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = c3;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        ll0Var2.b = pageblockslideshow;
                        of9 of9Var2 = ch9Var2.R3;
                        if (of9Var2 != null) {
                            of9Var2.h();
                        }
                        View C1 = ch9Var2.C1(ll0Var2);
                        if (C1 instanceof zh9) {
                            zh9 zh9Var2 = (zh9) C1;
                            ValueAnimator valueAnimator = zh9Var2.j0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                zh9Var2.j0 = null;
                            }
                            if (zh9Var2.getParent() != null) {
                                zh9Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = zh9Var2.i0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                zh9Var2.i0 = null;
                            }
                            zh9Var2.a0 = 0;
                            zh9Var2.b0 = 0.0f;
                            zh9Var2.q(true);
                            zh9Var2.requestLayout();
                            zh9Var2.invalidate();
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
