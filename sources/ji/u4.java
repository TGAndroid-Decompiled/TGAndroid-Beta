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
import org.telegram.ui.Components.l80;
public final class u4 implements View.OnClickListener {
    public final int f13561a;
    public final y4 f13562b;

    public u4(y4 y4Var, int i10) {
        this.f13561a = i10;
        this.f13562b = y4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f13561a) {
            case 0:
                final y4 y4Var = this.f13562b;
                ArrayList arrayList = y4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (y4Var.N != null && y4Var.f13123a != null) {
                    List m10 = y4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final u uVar = (u) m10.get(indexOf);
                        l80 R = y4Var.N.f13480a.f13630f3.R((View) arrayList.get(indexOf));
                        boolean z10 = uVar.f13548n;
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
                        R.c(i10, LocaleController.getString(i11), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        y4 y4Var2 = y4Var;
                                        q3 q3Var = y4Var2.N;
                                        if (q3Var != null && (aVar3 = y4Var2.f13123a) != null) {
                                            x3 x3Var = q3Var.f13480a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                h2 h2Var = x3Var.H3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                uVar2.f13548n = !uVar2.f13548n;
                                                TL_iv.PageBlock O3 = x3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.f13548n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.f13548n;
                                                }
                                                x3Var.o4(aVar3);
                                                h2 h2Var2 = x3Var.H3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                x3Var.f13630f3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        y4 y4Var3 = y4Var;
                                        q3 q3Var2 = y4Var3.N;
                                        if (q3Var2 != null && (aVar4 = y4Var3.f13123a) != null) {
                                            x3.O1(aVar4, uVar, q3Var2.f13480a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        R.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        y4 y4Var2 = y4Var;
                                        q3 q3Var = y4Var2.N;
                                        if (q3Var != null && (aVar3 = y4Var2.f13123a) != null) {
                                            x3 x3Var = q3Var.f13480a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                h2 h2Var = x3Var.H3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                uVar2.f13548n = !uVar2.f13548n;
                                                TL_iv.PageBlock O3 = x3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.f13548n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.f13548n;
                                                }
                                                x3Var.o4(aVar3);
                                                h2 h2Var2 = x3Var.H3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                x3Var.f13630f3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        y4 y4Var3 = y4Var;
                                        q3 q3Var2 = y4Var3.N;
                                        if (q3Var2 != null && (aVar4 = y4Var3.f13123a) != null) {
                                            x3.O1(aVar4, uVar, q3Var2.f13480a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        R.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (y4Var.H) {
                            R.f26670u = false;
                            R.v = true;
                            R.f26668s = 0;
                        }
                        R.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                y4 y4Var2 = this.f13562b;
                q3 q3Var = y4Var2.N;
                if (q3Var != null && (aVar = y4Var2.f13123a) != null) {
                    x3 x3Var = q3Var.f13480a;
                    x3Var.Z3 = aVar;
                    x3Var.f13630f3.m(0);
                    return;
                }
                return;
            default:
                y4 y4Var3 = this.f13562b;
                q3 q3Var2 = y4Var3.N;
                if (q3Var2 != null && (aVar2 = y4Var3.f13123a) != null) {
                    x3 x3Var2 = q3Var2.f13480a;
                    x3Var2.getClass();
                    if (x3.C3(aVar2.f13107b)) {
                        h2 h2Var = x3Var2.H3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> h32 = x3.h3(aVar2.f13107b);
                        TL_iv.PageBlock pageBlock = aVar2.f13107b;
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
                        aVar2.f13107b = pageblockslideshow;
                        h2 h2Var2 = x3Var2.H3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        View A1 = x3Var2.A1(aVar2);
                        if (A1 instanceof y4) {
                            y4 y4Var4 = (y4) A1;
                            ValueAnimator valueAnimator = y4Var4.f13682i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                y4Var4.f13682i0 = null;
                            }
                            if (y4Var4.getParent() != null) {
                                y4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = y4Var4.f13681h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                y4Var4.f13681h0 = null;
                            }
                            y4Var4.W = 0;
                            y4Var4.f13674a0 = 0.0f;
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
