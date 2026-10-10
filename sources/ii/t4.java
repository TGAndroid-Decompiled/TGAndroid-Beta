package ii;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.q80;
public final class t4 implements View.OnClickListener {
    public final int f12706a;
    public final w4 f12707b;

    public t4(w4 w4Var, int i10) {
        this.f12706a = i10;
        this.f12707b = w4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f12706a) {
            case 0:
                final w4 w4Var = this.f12707b;
                ArrayList arrayList = w4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (w4Var.N != null && w4Var.f12251a != null) {
                    List m10 = w4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final u uVar = (u) m10.get(indexOf);
                        q80 E = w4Var.N.f12636a.f12809f3.E((View) arrayList.get(indexOf));
                        boolean z10 = uVar.f12721n;
                        if (z10) {
                            i10 = R.drawable.msg_spoiler_off;
                        } else {
                            i10 = R.drawable.msg_spoiler;
                        }
                        if (z10) {
                            i11 = R.string.DisablePhotoSpoiler;
                        } else {
                            i11 = R.string.EnablePhotoSpoiler;
                        }
                        E.c(i10, LocaleController.getString(i11), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        w4 w4Var2 = w4Var;
                                        q3 q3Var = w4Var2.N;
                                        if (q3Var != null && (aVar3 = w4Var2.f12251a) != null) {
                                            x3 x3Var = q3Var.f12636a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                i2 i2Var = x3Var.H3;
                                                if (i2Var != null) {
                                                    i2Var.d();
                                                }
                                                uVar2.f12721n = !uVar2.f12721n;
                                                TL_iv.PageBlock O3 = x3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.f12721n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.f12721n;
                                                }
                                                x3Var.o4(aVar3);
                                                i2 i2Var2 = x3Var.H3;
                                                if (i2Var2 != null) {
                                                    i2Var2.h();
                                                }
                                                x3Var.f12809f3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        w4 w4Var3 = w4Var;
                                        q3 q3Var2 = w4Var3.N;
                                        if (q3Var2 != null && (aVar4 = w4Var3.f12251a) != null) {
                                            x3.O1(aVar4, uVar, q3Var2.f12636a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        E.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        w4 w4Var2 = w4Var;
                                        q3 q3Var = w4Var2.N;
                                        if (q3Var != null && (aVar3 = w4Var2.f12251a) != null) {
                                            x3 x3Var = q3Var.f12636a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                i2 i2Var = x3Var.H3;
                                                if (i2Var != null) {
                                                    i2Var.d();
                                                }
                                                uVar2.f12721n = !uVar2.f12721n;
                                                TL_iv.PageBlock O3 = x3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.f12721n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.f12721n;
                                                }
                                                x3Var.o4(aVar3);
                                                i2 i2Var2 = x3Var.H3;
                                                if (i2Var2 != null) {
                                                    i2Var2.h();
                                                }
                                                x3Var.f12809f3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        w4 w4Var3 = w4Var;
                                        q3 q3Var2 = w4Var3.N;
                                        if (q3Var2 != null && (aVar4 = w4Var3.f12251a) != null) {
                                            x3.O1(aVar4, uVar, q3Var2.f12636a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        E.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (w4Var.H) {
                            E.f30122u = false;
                            E.v = true;
                            E.f30120s = 0;
                        }
                        E.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                w4 w4Var2 = this.f12707b;
                q3 q3Var = w4Var2.N;
                if (q3Var != null && (aVar = w4Var2.f12251a) != null) {
                    x3 x3Var = q3Var.f12636a;
                    x3Var.Z3 = aVar;
                    x3Var.f12809f3.k(0);
                    return;
                }
                return;
            default:
                w4 w4Var3 = this.f12707b;
                q3 q3Var2 = w4Var3.N;
                if (q3Var2 != null && (aVar2 = w4Var3.f12251a) != null) {
                    x3 x3Var2 = q3Var2.f12636a;
                    x3Var2.getClass();
                    if (x3.C3(aVar2.f12234b)) {
                        i2 i2Var = x3Var2.H3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> h32 = x3.h3(aVar2.f12234b);
                        TL_iv.PageBlock pageBlock = aVar2.f12234b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (h32 == null) {
                                h32 = new ArrayList<>();
                            }
                            pageblockcollage.items = h32;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (h32 == null) {
                                h32 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = h32;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.f12234b = pageblockslideshow;
                        i2 i2Var2 = x3Var2.H3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        View A1 = x3Var2.A1(aVar2);
                        if (A1 instanceof w4) {
                            w4 w4Var4 = (w4) A1;
                            ValueAnimator valueAnimator = w4Var4.f12780i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                w4Var4.f12780i0 = null;
                            }
                            if (w4Var4.getParent() != null) {
                                w4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = w4Var4.f12779h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                w4Var4.f12779h0 = null;
                            }
                            w4Var4.W = 0;
                            w4Var4.f12772a0 = 0.0f;
                            w4Var4.o(true);
                            w4Var4.requestLayout();
                            w4Var4.invalidate();
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
