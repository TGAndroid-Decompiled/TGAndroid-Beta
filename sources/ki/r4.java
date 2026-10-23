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
import org.telegram.ui.Components.j80;
public final class r4 implements View.OnClickListener {
    public final int f15549a;
    public final u4 f15550b;

    public r4(u4 u4Var, int i10) {
        this.f15549a = i10;
        this.f15550b = u4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f15549a) {
            case 0:
                final u4 u4Var = this.f15550b;
                ArrayList arrayList = u4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (u4Var.N != null && u4Var.f15157a != null) {
                    List l4 = u4Var.l();
                    if (indexOf >= 0 && indexOf < l4.size() && indexOf < arrayList.size()) {
                        final t tVar = (t) l4.get(indexOf);
                        j80 M = u4Var.N.f15505a.f15656i3.M((View) arrayList.get(indexOf));
                        boolean z10 = tVar.f15578n;
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
                                        if (p3Var != null && (aVar3 = u4Var2.f15157a) != null) {
                                            w3 w3Var = p3Var.f15505a;
                                            w3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                h2 h2Var = w3Var.K3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                tVar2.f15578n = !tVar2.f15578n;
                                                TL_iv.PageBlock T3 = w3.T3(aVar3, tVar2);
                                                if (T3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) T3).spoiler = tVar2.f15578n;
                                                } else if (T3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) T3).spoiler = tVar2.f15578n;
                                                }
                                                w3Var.t4(aVar3);
                                                h2 h2Var2 = w3Var.K3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                w3Var.f15656i3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        u4 u4Var3 = u4Var;
                                        p3 p3Var2 = u4Var3.N;
                                        if (p3Var2 != null && (aVar4 = u4Var3.f15157a) != null) {
                                            w3.T1(aVar4, tVar, p3Var2.f15505a);
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
                                        if (p3Var != null && (aVar3 = u4Var2.f15157a) != null) {
                                            w3 w3Var = p3Var.f15505a;
                                            w3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                h2 h2Var = w3Var.K3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                tVar2.f15578n = !tVar2.f15578n;
                                                TL_iv.PageBlock T3 = w3.T3(aVar3, tVar2);
                                                if (T3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) T3).spoiler = tVar2.f15578n;
                                                } else if (T3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) T3).spoiler = tVar2.f15578n;
                                                }
                                                w3Var.t4(aVar3);
                                                h2 h2Var2 = w3Var.K3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                w3Var.f15656i3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        u4 u4Var3 = u4Var;
                                        p3 p3Var2 = u4Var3.N;
                                        if (p3Var2 != null && (aVar4 = u4Var3.f15157a) != null) {
                                            w3.T1(aVar4, tVar, p3Var2.f15505a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        M.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (u4Var.H) {
                            M.f27582u = false;
                            M.v = true;
                            M.f27580s = 0;
                        }
                        M.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                u4 u4Var2 = this.f15550b;
                p3 p3Var = u4Var2.N;
                if (p3Var != null && (aVar = u4Var2.f15157a) != null) {
                    w3 w3Var = p3Var.f15505a;
                    w3Var.f15648c4 = aVar;
                    w3Var.f15656i3.m(0);
                    return;
                }
                return;
            default:
                u4 u4Var3 = this.f15550b;
                p3 p3Var2 = u4Var3.N;
                if (p3Var2 != null && (aVar2 = u4Var3.f15157a) != null) {
                    w3 w3Var2 = p3Var2.f15505a;
                    w3Var2.getClass();
                    if (w3.H3(aVar2.f15141b)) {
                        h2 h2Var = w3Var2.K3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> m32 = w3.m3(aVar2.f15141b);
                        TL_iv.PageBlock pageBlock = aVar2.f15141b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (m32 == null) {
                                m32 = new ArrayList<>();
                            }
                            pageblockcollage.items = m32;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (m32 == null) {
                                m32 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = m32;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.f15141b = pageblockslideshow;
                        h2 h2Var2 = w3Var2.K3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        View F1 = w3Var2.F1(aVar2);
                        if (F1 instanceof u4) {
                            u4 u4Var4 = (u4) F1;
                            ValueAnimator valueAnimator = u4Var4.f15612i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                u4Var4.f15612i0 = null;
                            }
                            if (u4Var4.getParent() != null) {
                                u4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = u4Var4.f15611h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                u4Var4.f15611h0 = null;
                            }
                            u4Var4.W = 0;
                            u4Var4.f15604a0 = 0.0f;
                            u4Var4.n(true);
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
