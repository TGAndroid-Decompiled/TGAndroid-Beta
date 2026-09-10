package hi;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.w70;
public final class u4 implements View.OnClickListener {
    public final int f9890a;
    public final x4 f9891b;

    public u4(x4 x4Var, int i10) {
        this.f9890a = i10;
        this.f9891b = x4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f9890a) {
            case 0:
                final x4 x4Var = this.f9891b;
                ArrayList arrayList = x4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (x4Var.N != null && x4Var.f9464a != null) {
                    List m10 = x4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final v vVar = (v) m10.get(indexOf);
                        w70 a02 = x4Var.N.f9848a.f10001h3.a0((View) arrayList.get(indexOf));
                        boolean z10 = vVar.f9904n;
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
                        a02.c(i10, LocaleController.getString(i11), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        x4 x4Var2 = x4Var;
                                        s3 s3Var = x4Var2.N;
                                        if (s3Var != null && (aVar3 = x4Var2.f9464a) != null) {
                                            z3 z3Var = s3Var.f9848a;
                                            z3Var.getClass();
                                            v vVar2 = vVar;
                                            if (vVar2 != null) {
                                                k2 k2Var = z3Var.J3;
                                                if (k2Var != null) {
                                                    k2Var.d();
                                                }
                                                vVar2.f9904n = !vVar2.f9904n;
                                                TL_iv.PageBlock M3 = z3.M3(aVar3, vVar2);
                                                if (M3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) M3).spoiler = vVar2.f9904n;
                                                } else if (M3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) M3).spoiler = vVar2.f9904n;
                                                }
                                                z3Var.m4(aVar3);
                                                k2 k2Var2 = z3Var.J3;
                                                if (k2Var2 != null) {
                                                    k2Var2.h();
                                                }
                                                z3Var.f10001h3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        x4 x4Var3 = x4Var;
                                        s3 s3Var2 = x4Var3.N;
                                        if (s3Var2 != null && (aVar4 = x4Var3.f9464a) != null) {
                                            z3.M1(aVar4, vVar, s3Var2.f9848a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        a02.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        x4 x4Var2 = x4Var;
                                        s3 s3Var = x4Var2.N;
                                        if (s3Var != null && (aVar3 = x4Var2.f9464a) != null) {
                                            z3 z3Var = s3Var.f9848a;
                                            z3Var.getClass();
                                            v vVar2 = vVar;
                                            if (vVar2 != null) {
                                                k2 k2Var = z3Var.J3;
                                                if (k2Var != null) {
                                                    k2Var.d();
                                                }
                                                vVar2.f9904n = !vVar2.f9904n;
                                                TL_iv.PageBlock M3 = z3.M3(aVar3, vVar2);
                                                if (M3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) M3).spoiler = vVar2.f9904n;
                                                } else if (M3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) M3).spoiler = vVar2.f9904n;
                                                }
                                                z3Var.m4(aVar3);
                                                k2 k2Var2 = z3Var.J3;
                                                if (k2Var2 != null) {
                                                    k2Var2.h();
                                                }
                                                z3Var.f10001h3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        x4 x4Var3 = x4Var;
                                        s3 s3Var2 = x4Var3.N;
                                        if (s3Var2 != null && (aVar4 = x4Var3.f9464a) != null) {
                                            z3.M1(aVar4, vVar, s3Var2.f9848a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        a02.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (x4Var.H) {
                            a02.f28703u = false;
                            a02.v = true;
                            a02.f28701s = 0;
                        }
                        a02.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                x4 x4Var2 = this.f9891b;
                s3 s3Var = x4Var2.N;
                if (s3Var != null && (aVar = x4Var2.f9464a) != null) {
                    z3 z3Var = s3Var.f9848a;
                    z3Var.f9993b4 = aVar;
                    z3Var.f10001h3.q(0);
                    return;
                }
                return;
            default:
                x4 x4Var3 = this.f9891b;
                s3 s3Var2 = x4Var3.N;
                if (s3Var2 != null && (aVar2 = x4Var3.f9464a) != null) {
                    z3 z3Var2 = s3Var2.f9848a;
                    z3Var2.getClass();
                    if (z3.A3(aVar2.f9421b)) {
                        k2 k2Var = z3Var2.J3;
                        if (k2Var != null) {
                            k2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> f32 = z3.f3(aVar2.f9421b);
                        TL_iv.PageBlock pageBlock = aVar2.f9421b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (f32 == null) {
                                f32 = new ArrayList<>();
                            }
                            pageblockcollage.items = f32;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (f32 == null) {
                                f32 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = f32;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.f9421b = pageblockslideshow;
                        k2 k2Var2 = z3Var2.J3;
                        if (k2Var2 != null) {
                            k2Var2.h();
                        }
                        View y12 = z3Var2.y1(aVar2);
                        if (y12 instanceof x4) {
                            x4 x4Var4 = (x4) y12;
                            ValueAnimator valueAnimator = x4Var4.f9953i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                x4Var4.f9953i0 = null;
                            }
                            if (x4Var4.getParent() != null) {
                                x4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = x4Var4.f9952h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                x4Var4.f9952h0 = null;
                            }
                            x4Var4.W = 0;
                            x4Var4.f9945a0 = 0.0f;
                            x4Var4.o(true);
                            x4Var4.requestLayout();
                            x4Var4.invalidate();
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
