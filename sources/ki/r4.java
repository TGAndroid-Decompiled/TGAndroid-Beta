package ki;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.i80;
public final class r4 implements View.OnClickListener {
    public final int f15489a;
    public final u4 f15490b;

    public r4(u4 u4Var, int i10) {
        this.f15489a = i10;
        this.f15490b = u4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f15489a) {
            case 0:
                final u4 u4Var = this.f15490b;
                ArrayList arrayList = u4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (u4Var.N != null && u4Var.f15111a != null) {
                    List m10 = u4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final t tVar = (t) m10.get(indexOf);
                        i80 M = u4Var.N.f15445a.f15592f3.M((View) arrayList.get(indexOf));
                        boolean z10 = tVar.f15518n;
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
                        M.c(i10, LocaleController.getString(i11), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        u4 u4Var2 = u4Var;
                                        p3 p3Var = u4Var2.N;
                                        if (p3Var != null && (aVar3 = u4Var2.f15111a) != null) {
                                            w3 w3Var = p3Var.f15445a;
                                            w3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                h2 h2Var = w3Var.H3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                tVar2.f15518n = !tVar2.f15518n;
                                                TL_iv.PageBlock O3 = w3.O3(aVar3, tVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = tVar2.f15518n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = tVar2.f15518n;
                                                }
                                                w3Var.o4(aVar3);
                                                h2 h2Var2 = w3Var.H3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                w3Var.f15592f3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        u4 u4Var3 = u4Var;
                                        p3 p3Var2 = u4Var3.N;
                                        if (p3Var2 != null && (aVar4 = u4Var3.f15111a) != null) {
                                            w3.O1(aVar4, tVar, p3Var2.f15445a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        M.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        u4 u4Var2 = u4Var;
                                        p3 p3Var = u4Var2.N;
                                        if (p3Var != null && (aVar3 = u4Var2.f15111a) != null) {
                                            w3 w3Var = p3Var.f15445a;
                                            w3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                h2 h2Var = w3Var.H3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                tVar2.f15518n = !tVar2.f15518n;
                                                TL_iv.PageBlock O3 = w3.O3(aVar3, tVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = tVar2.f15518n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = tVar2.f15518n;
                                                }
                                                w3Var.o4(aVar3);
                                                h2 h2Var2 = w3Var.H3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                w3Var.f15592f3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        u4 u4Var3 = u4Var;
                                        p3 p3Var2 = u4Var3.N;
                                        if (p3Var2 != null && (aVar4 = u4Var3.f15111a) != null) {
                                            w3.O1(aVar4, tVar, p3Var2.f15445a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        M.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (u4Var.H) {
                            M.f27187u = false;
                            M.v = true;
                            M.f27185s = 0;
                        }
                        M.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                u4 u4Var2 = this.f15490b;
                p3 p3Var = u4Var2.N;
                if (p3Var != null && (aVar = u4Var2.f15111a) != null) {
                    w3 w3Var = p3Var.f15445a;
                    w3Var.Z3 = aVar;
                    w3Var.f15592f3.m(0);
                    return;
                }
                return;
            default:
                u4 u4Var3 = this.f15490b;
                p3 p3Var2 = u4Var3.N;
                if (p3Var2 != null && (aVar2 = u4Var3.f15111a) != null) {
                    w3 w3Var2 = p3Var2.f15445a;
                    w3Var2.getClass();
                    if (w3.C3(aVar2.f15095b)) {
                        h2 h2Var = w3Var2.H3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> h32 = w3.h3(aVar2.f15095b);
                        TL_iv.PageBlock pageBlock = aVar2.f15095b;
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
                        aVar2.f15095b = pageblockslideshow;
                        h2 h2Var2 = w3Var2.H3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        View A1 = w3Var2.A1(aVar2);
                        if (A1 instanceof u4) {
                            u4 u4Var4 = (u4) A1;
                            ValueAnimator valueAnimator = u4Var4.f15553i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                u4Var4.f15553i0 = null;
                            }
                            if (u4Var4.getParent() != null) {
                                u4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = u4Var4.f15552h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                u4Var4.f15552h0 = null;
                            }
                            u4Var4.W = 0;
                            u4Var4.f15545a0 = 0.0f;
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
