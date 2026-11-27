package defpackage;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_iv;
public final class jj9 implements View.OnClickListener {
    public final byte a;
    public final mj9 b;

    public jj9(mj9 mj9Var, byte b) {
        this.a = b;
        this.b = mj9Var;
    }

    @Override
    public final void onClick(View view) {
        int i;
        int i2;
        mk0 mk0Var;
        mk0 mk0Var2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        byte b = this.a;
        final mj9 mj9Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = mj9Var.F;
                int indexOf = arrayList.indexOf(view);
                if (mj9Var.O != null && mj9Var.a != null) {
                    List o = mj9Var.o();
                    if (indexOf >= 0 && indexOf < o.size() && indexOf < arrayList.size()) {
                        final p07 p07Var = (p07) o.get(indexOf);
                        fu5 O = mj9Var.O.a.p3.O((View) arrayList.get(indexOf));
                        if (p07Var.n) {
                            i = 2131232382;
                            i2 = 2131751395;
                        } else {
                            i = 2131232381;
                            i2 = 2131751119;
                        }
                        O.b(i, ob6.M0(i2, null), new Runnable() {
                            @Override
                            public final void run() {
                                mk0 mk0Var3;
                                mk0 mk0Var4;
                                byte b2 = r3;
                                p07 p07Var2 = p07Var;
                                mj9 mj9Var2 = mj9Var;
                                switch (b2) {
                                    case 0:
                                        ii9 ii9Var = mj9Var2.O;
                                        if (ii9Var != null && (mk0Var3 = mj9Var2.a) != null) {
                                            pi9 pi9Var = ii9Var.a;
                                            ch9 ch9Var = pi9Var.R3;
                                            if (ch9Var != null) {
                                                ch9Var.d();
                                            }
                                            p07Var2.n = !p07Var2.n;
                                            TL_iv.PageBlock K3 = pi9.K3(mk0Var3, p07Var2);
                                            if (K3 instanceof TL_iv.pageBlockPhoto) {
                                                ((TL_iv.pageBlockPhoto) K3).spoiler = p07Var2.n;
                                            } else if (K3 instanceof TL_iv.pageBlockVideo) {
                                                ((TL_iv.pageBlockVideo) K3).spoiler = p07Var2.n;
                                            }
                                            pi9Var.p4(mk0Var3);
                                            ch9 ch9Var2 = pi9Var.R3;
                                            if (ch9Var2 != null) {
                                                ch9Var2.h();
                                            }
                                            pi9Var.p3.onContentChanged();
                                            return;
                                        }
                                        return;
                                    default:
                                        ii9 ii9Var2 = mj9Var2.O;
                                        if (ii9Var2 != null && (mk0Var4 = mj9Var2.a) != null) {
                                            ii9Var2.a.o2(mk0Var4, p07Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        O.b(2131232113, ob6.M0(2131751563, null), new Runnable() {
                            @Override
                            public final void run() {
                                mk0 mk0Var3;
                                mk0 mk0Var4;
                                byte b2 = r3;
                                p07 p07Var2 = p07Var;
                                mj9 mj9Var2 = mj9Var;
                                switch (b2) {
                                    case 0:
                                        ii9 ii9Var = mj9Var2.O;
                                        if (ii9Var != null && (mk0Var3 = mj9Var2.a) != null) {
                                            pi9 pi9Var = ii9Var.a;
                                            ch9 ch9Var = pi9Var.R3;
                                            if (ch9Var != null) {
                                                ch9Var.d();
                                            }
                                            p07Var2.n = !p07Var2.n;
                                            TL_iv.PageBlock K3 = pi9.K3(mk0Var3, p07Var2);
                                            if (K3 instanceof TL_iv.pageBlockPhoto) {
                                                ((TL_iv.pageBlockPhoto) K3).spoiler = p07Var2.n;
                                            } else if (K3 instanceof TL_iv.pageBlockVideo) {
                                                ((TL_iv.pageBlockVideo) K3).spoiler = p07Var2.n;
                                            }
                                            pi9Var.p4(mk0Var3);
                                            ch9 ch9Var2 = pi9Var.R3;
                                            if (ch9Var2 != null) {
                                                ch9Var2.h();
                                            }
                                            pi9Var.p3.onContentChanged();
                                            return;
                                        }
                                        return;
                                    default:
                                        ii9 ii9Var2 = mj9Var2.O;
                                        if (ii9Var2 != null && (mk0Var4 = mj9Var2.a) != null) {
                                            ii9Var2.a.o2(mk0Var4, p07Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        O.b0(0.0f, -hl.L(38.0f));
                        if (mj9Var.I) {
                            O.u = false;
                            O.v = true;
                            O.s = (short) 0;
                        }
                        O.a0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ii9 ii9Var = mj9Var.O;
                if (ii9Var != null && (mk0Var = mj9Var.a) != null) {
                    pi9 pi9Var = ii9Var.a;
                    pi9Var.j4 = mk0Var;
                    pi9Var.p3.d(0);
                    return;
                }
                return;
            default:
                ii9 ii9Var2 = mj9Var.O;
                if (ii9Var2 != null && (mk0Var2 = mj9Var.a) != null) {
                    pi9 pi9Var2 = ii9Var2.a;
                    if (pi9.y3(mk0Var2.b)) {
                        ch9 ch9Var = pi9Var2.R3;
                        if (ch9Var != null) {
                            ch9Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> d3 = pi9.d3(mk0Var2.b);
                        TL_iv.PageBlock pageBlock = mk0Var2.b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (d3 == null) {
                                d3 = new ArrayList<>();
                            }
                            pageblockcollage.items = d3;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (d3 == null) {
                                d3 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = d3;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        mk0Var2.b = pageblockslideshow;
                        ch9 ch9Var2 = pi9Var2.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.h();
                        }
                        View D1 = pi9Var2.D1(mk0Var2);
                        if (D1 instanceof mj9) {
                            mj9 mj9Var2 = (mj9) D1;
                            ValueAnimator valueAnimator = mj9Var2.j0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                mj9Var2.j0 = null;
                            }
                            if (mj9Var2.getParent() != null) {
                                mj9Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = mj9Var2.i0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                mj9Var2.i0 = null;
                            }
                            mj9Var2.a0 = 0;
                            mj9Var2.b0 = 0.0f;
                            mj9Var2.q(true);
                            mj9Var2.requestLayout();
                            mj9Var2.invalidate();
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
