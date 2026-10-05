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
import org.telegram.ui.Components.b80;
public final class t4 implements View.OnClickListener {
    public final int f12659a;
    public final w4 f12660b;

    public t4(w4 w4Var, int i10) {
        this.f12659a = i10;
        this.f12660b = w4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f12659a) {
            case 0:
                final w4 w4Var = this.f12660b;
                ArrayList arrayList = w4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (w4Var.N != null && w4Var.f12204a != null) {
                    List m10 = w4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final u uVar = (u) m10.get(indexOf);
                        b80 f02 = w4Var.N.f12589a.f12770o3.f0((View) arrayList.get(indexOf));
                        boolean z10 = uVar.f12674n;
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
                        f02.c(i10, LocaleController.getString(i11), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        w4 w4Var2 = w4Var;
                                        q3 q3Var = w4Var2.N;
                                        if (q3Var != null && (aVar3 = w4Var2.f12204a) != null) {
                                            x3 x3Var = q3Var.f12589a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                i2 i2Var = x3Var.Q3;
                                                if (i2Var != null) {
                                                    i2Var.d();
                                                }
                                                uVar2.f12674n = !uVar2.f12674n;
                                                TL_iv.PageBlock O3 = x3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.f12674n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.f12674n;
                                                }
                                                x3Var.o4(aVar3);
                                                i2 i2Var2 = x3Var.Q3;
                                                if (i2Var2 != null) {
                                                    i2Var2.h();
                                                }
                                                x3Var.f12770o3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        w4 w4Var3 = w4Var;
                                        q3 q3Var2 = w4Var3.N;
                                        if (q3Var2 != null && (aVar4 = w4Var3.f12204a) != null) {
                                            x3.O1(aVar4, uVar, q3Var2.f12589a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        f02.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        w4 w4Var2 = w4Var;
                                        q3 q3Var = w4Var2.N;
                                        if (q3Var != null && (aVar3 = w4Var2.f12204a) != null) {
                                            x3 x3Var = q3Var.f12589a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                i2 i2Var = x3Var.Q3;
                                                if (i2Var != null) {
                                                    i2Var.d();
                                                }
                                                uVar2.f12674n = !uVar2.f12674n;
                                                TL_iv.PageBlock O3 = x3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.f12674n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.f12674n;
                                                }
                                                x3Var.o4(aVar3);
                                                i2 i2Var2 = x3Var.Q3;
                                                if (i2Var2 != null) {
                                                    i2Var2.h();
                                                }
                                                x3Var.f12770o3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        w4 w4Var3 = w4Var;
                                        q3 q3Var2 = w4Var3.N;
                                        if (q3Var2 != null && (aVar4 = w4Var3.f12204a) != null) {
                                            x3.O1(aVar4, uVar, q3Var2.f12589a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        f02.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (w4Var.H) {
                            f02.f24887u = false;
                            f02.v = true;
                            f02.f24885s = 0;
                        }
                        f02.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                w4 w4Var2 = this.f12660b;
                q3 q3Var = w4Var2.N;
                if (q3Var != null && (aVar = w4Var2.f12204a) != null) {
                    x3 x3Var = q3Var.f12589a;
                    x3Var.f12763i4 = aVar;
                    x3Var.f12770o3.r(0);
                    return;
                }
                return;
            default:
                w4 w4Var3 = this.f12660b;
                q3 q3Var2 = w4Var3.N;
                if (q3Var2 != null && (aVar2 = w4Var3.f12204a) != null) {
                    x3 x3Var2 = q3Var2.f12589a;
                    x3Var2.getClass();
                    if (x3.C3(aVar2.f12187b)) {
                        i2 i2Var = x3Var2.Q3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> h32 = x3.h3(aVar2.f12187b);
                        TL_iv.PageBlock pageBlock = aVar2.f12187b;
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
                        aVar2.f12187b = pageblockslideshow;
                        i2 i2Var2 = x3Var2.Q3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        View A1 = x3Var2.A1(aVar2);
                        if (A1 instanceof w4) {
                            w4 w4Var4 = (w4) A1;
                            ValueAnimator valueAnimator = w4Var4.f12733i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                w4Var4.f12733i0 = null;
                            }
                            if (w4Var4.getParent() != null) {
                                w4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = w4Var4.f12732h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                w4Var4.f12732h0 = null;
                            }
                            w4Var4.W = 0;
                            w4Var4.f12725a0 = 0.0f;
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
