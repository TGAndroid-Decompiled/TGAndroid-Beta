package ji;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.m80;
public final class u4 implements View.OnClickListener {
    public final int f13558a;
    public final y4 f13559b;

    public u4(y4 y4Var, int i10) {
        this.f13558a = i10;
        this.f13559b = y4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f13558a) {
            case 0:
                final y4 y4Var = this.f13559b;
                ArrayList arrayList = y4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (y4Var.N != null && y4Var.f13119a != null) {
                    List m10 = y4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final u uVar = (u) m10.get(indexOf);
                        m80 Y = y4Var.N.f13477a.f13627f3.Y((View) arrayList.get(indexOf));
                        boolean z10 = uVar.f13545n;
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
                        Y.c(i10, LocaleController.getString(i11), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        y4 y4Var2 = y4Var;
                                        q3 q3Var = y4Var2.N;
                                        if (q3Var != null && (aVar3 = y4Var2.f13119a) != null) {
                                            x3 x3Var = q3Var.f13477a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                h2 h2Var = x3Var.H3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                uVar2.f13545n = !uVar2.f13545n;
                                                TL_iv.PageBlock O3 = x3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.f13545n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.f13545n;
                                                }
                                                x3Var.o4(aVar3);
                                                h2 h2Var2 = x3Var.H3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                x3Var.f13627f3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        y4 y4Var3 = y4Var;
                                        q3 q3Var2 = y4Var3.N;
                                        if (q3Var2 != null && (aVar4 = y4Var3.f13119a) != null) {
                                            x3.O1(aVar4, uVar, q3Var2.f13477a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        Y.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        y4 y4Var2 = y4Var;
                                        q3 q3Var = y4Var2.N;
                                        if (q3Var != null && (aVar3 = y4Var2.f13119a) != null) {
                                            x3 x3Var = q3Var.f13477a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                h2 h2Var = x3Var.H3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                uVar2.f13545n = !uVar2.f13545n;
                                                TL_iv.PageBlock O3 = x3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.f13545n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.f13545n;
                                                }
                                                x3Var.o4(aVar3);
                                                h2 h2Var2 = x3Var.H3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                x3Var.f13627f3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        y4 y4Var3 = y4Var;
                                        q3 q3Var2 = y4Var3.N;
                                        if (q3Var2 != null && (aVar4 = y4Var3.f13119a) != null) {
                                            x3.O1(aVar4, uVar, q3Var2.f13477a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        Y.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (y4Var.H) {
                            Y.f27300u = false;
                            Y.v = true;
                            Y.f27298s = 0;
                        }
                        Y.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                y4 y4Var2 = this.f13559b;
                q3 q3Var = y4Var2.N;
                if (q3Var != null && (aVar = y4Var2.f13119a) != null) {
                    x3 x3Var = q3Var.f13477a;
                    x3Var.Z3 = aVar;
                    x3Var.f13627f3.m(0);
                    return;
                }
                return;
            default:
                y4 y4Var3 = this.f13559b;
                q3 q3Var2 = y4Var3.N;
                if (q3Var2 != null && (aVar2 = y4Var3.f13119a) != null) {
                    x3 x3Var2 = q3Var2.f13477a;
                    x3Var2.getClass();
                    if (x3.C3(aVar2.f13103b)) {
                        h2 h2Var = x3Var2.H3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> h32 = x3.h3(aVar2.f13103b);
                        TL_iv.PageBlock pageBlock = aVar2.f13103b;
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
                        aVar2.f13103b = pageblockslideshow;
                        h2 h2Var2 = x3Var2.H3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        View A1 = x3Var2.A1(aVar2);
                        if (A1 instanceof y4) {
                            y4 y4Var4 = (y4) A1;
                            ValueAnimator valueAnimator = y4Var4.f13679i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                y4Var4.f13679i0 = null;
                            }
                            if (y4Var4.getParent() != null) {
                                y4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = y4Var4.f13678h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                y4Var4.f13678h0 = null;
                            }
                            y4Var4.W = 0;
                            y4Var4.f13671a0 = 0.0f;
                            y4Var4.o(true);
                            y4Var4.requestLayout();
                            y4Var4.invalidate();
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
