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
import org.telegram.ui.Components.n70;
public final class r4 implements View.OnClickListener {
    public final int f11604a;
    public final u4 f11605b;

    public r4(u4 u4Var, int i10) {
        this.f11604a = i10;
        this.f11605b = u4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f11604a) {
            case 0:
                final u4 u4Var = this.f11605b;
                ArrayList arrayList = u4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (u4Var.N != null && u4Var.f11220a != null) {
                    List m10 = u4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final u uVar = (u) m10.get(indexOf);
                        n70 D = u4Var.N.f11562a.f11714h3.D((View) arrayList.get(indexOf));
                        boolean z10 = uVar.f11648n;
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
                        D.c(i10, LocaleController.getString(i11), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        u4 u4Var2 = u4Var;
                                        p3 p3Var = u4Var2.N;
                                        if (p3Var != null && (aVar3 = u4Var2.f11220a) != null) {
                                            w3 w3Var = p3Var.f11562a;
                                            w3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                h2 h2Var = w3Var.J3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                uVar2.f11648n = !uVar2.f11648n;
                                                TL_iv.PageBlock O3 = w3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.f11648n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.f11648n;
                                                }
                                                w3Var.o4(aVar3);
                                                h2 h2Var2 = w3Var.J3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                w3Var.f11714h3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        u4 u4Var3 = u4Var;
                                        p3 p3Var2 = u4Var3.N;
                                        if (p3Var2 != null && (aVar4 = u4Var3.f11220a) != null) {
                                            w3.O1(aVar4, uVar, p3Var2.f11562a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        D.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        u4 u4Var2 = u4Var;
                                        p3 p3Var = u4Var2.N;
                                        if (p3Var != null && (aVar3 = u4Var2.f11220a) != null) {
                                            w3 w3Var = p3Var.f11562a;
                                            w3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                h2 h2Var = w3Var.J3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                uVar2.f11648n = !uVar2.f11648n;
                                                TL_iv.PageBlock O3 = w3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.f11648n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.f11648n;
                                                }
                                                w3Var.o4(aVar3);
                                                h2 h2Var2 = w3Var.J3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                w3Var.f11714h3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        u4 u4Var3 = u4Var;
                                        p3 p3Var2 = u4Var3.N;
                                        if (p3Var2 != null && (aVar4 = u4Var3.f11220a) != null) {
                                            w3.O1(aVar4, uVar, p3Var2.f11562a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        D.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (u4Var.H) {
                            D.f26386u = false;
                            D.v = true;
                            D.f26384s = 0;
                        }
                        D.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                u4 u4Var2 = this.f11605b;
                p3 p3Var = u4Var2.N;
                if (p3Var != null && (aVar = u4Var2.f11220a) != null) {
                    w3 w3Var = p3Var.f11562a;
                    w3Var.f11706b4 = aVar;
                    w3Var.f11714h3.h(0);
                    return;
                }
                return;
            default:
                u4 u4Var3 = this.f11605b;
                p3 p3Var2 = u4Var3.N;
                if (p3Var2 != null && (aVar2 = u4Var3.f11220a) != null) {
                    w3 w3Var2 = p3Var2.f11562a;
                    w3Var2.getClass();
                    if (w3.C3(aVar2.f11204b)) {
                        h2 h2Var = w3Var2.J3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> h32 = w3.h3(aVar2.f11204b);
                        TL_iv.PageBlock pageBlock = aVar2.f11204b;
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
                        aVar2.f11204b = pageblockslideshow;
                        h2 h2Var2 = w3Var2.J3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        View A1 = w3Var2.A1(aVar2);
                        if (A1 instanceof u4) {
                            u4 u4Var4 = (u4) A1;
                            ValueAnimator valueAnimator = u4Var4.f11671i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                u4Var4.f11671i0 = null;
                            }
                            if (u4Var4.getParent() != null) {
                                u4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = u4Var4.f11670h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                u4Var4.f11670h0 = null;
                            }
                            u4Var4.W = 0;
                            u4Var4.f11663a0 = 0.0f;
                            u4Var4.o(true);
                            u4Var4.requestLayout();
                            u4Var4.invalidate();
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
