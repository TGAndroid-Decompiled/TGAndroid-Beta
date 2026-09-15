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
    public final int f11601a;
    public final u4 f11602b;

    public r4(u4 u4Var, int i10) {
        this.f11601a = i10;
        this.f11602b = u4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f11601a) {
            case 0:
                final u4 u4Var = this.f11602b;
                ArrayList arrayList = u4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (u4Var.N != null && u4Var.f11217a != null) {
                    List m10 = u4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final u uVar = (u) m10.get(indexOf);
                        n70 D = u4Var.N.f11559a.f11711h3.D((View) arrayList.get(indexOf));
                        boolean z10 = uVar.f11645n;
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
                                        if (p3Var != null && (aVar3 = u4Var2.f11217a) != null) {
                                            w3 w3Var = p3Var.f11559a;
                                            w3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                h2 h2Var = w3Var.J3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                uVar2.f11645n = !uVar2.f11645n;
                                                TL_iv.PageBlock N3 = w3.N3(aVar3, uVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = uVar2.f11645n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = uVar2.f11645n;
                                                }
                                                w3Var.n4(aVar3);
                                                h2 h2Var2 = w3Var.J3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                w3Var.f11711h3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        u4 u4Var3 = u4Var;
                                        p3 p3Var2 = u4Var3.N;
                                        if (p3Var2 != null && (aVar4 = u4Var3.f11217a) != null) {
                                            w3.N1(aVar4, uVar, p3Var2.f11559a);
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
                                        if (p3Var != null && (aVar3 = u4Var2.f11217a) != null) {
                                            w3 w3Var = p3Var.f11559a;
                                            w3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                h2 h2Var = w3Var.J3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                uVar2.f11645n = !uVar2.f11645n;
                                                TL_iv.PageBlock N3 = w3.N3(aVar3, uVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = uVar2.f11645n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = uVar2.f11645n;
                                                }
                                                w3Var.n4(aVar3);
                                                h2 h2Var2 = w3Var.J3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                w3Var.f11711h3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        u4 u4Var3 = u4Var;
                                        p3 p3Var2 = u4Var3.N;
                                        if (p3Var2 != null && (aVar4 = u4Var3.f11217a) != null) {
                                            w3.N1(aVar4, uVar, p3Var2.f11559a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        D.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (u4Var.H) {
                            D.f26370u = false;
                            D.v = true;
                            D.f26368s = 0;
                        }
                        D.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                u4 u4Var2 = this.f11602b;
                p3 p3Var = u4Var2.N;
                if (p3Var != null && (aVar = u4Var2.f11217a) != null) {
                    w3 w3Var = p3Var.f11559a;
                    w3Var.f11703b4 = aVar;
                    w3Var.f11711h3.h(0);
                    return;
                }
                return;
            default:
                u4 u4Var3 = this.f11602b;
                p3 p3Var2 = u4Var3.N;
                if (p3Var2 != null && (aVar2 = u4Var3.f11217a) != null) {
                    w3 w3Var2 = p3Var2.f11559a;
                    w3Var2.getClass();
                    if (w3.B3(aVar2.f11201b)) {
                        h2 h2Var = w3Var2.J3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> g32 = w3.g3(aVar2.f11201b);
                        TL_iv.PageBlock pageBlock = aVar2.f11201b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (g32 == null) {
                                g32 = new ArrayList<>();
                            }
                            pageblockcollage.items = g32;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (g32 == null) {
                                g32 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = g32;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.f11201b = pageblockslideshow;
                        h2 h2Var2 = w3Var2.J3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        View z12 = w3Var2.z1(aVar2);
                        if (z12 instanceof u4) {
                            u4 u4Var4 = (u4) z12;
                            ValueAnimator valueAnimator = u4Var4.f11668i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                u4Var4.f11668i0 = null;
                            }
                            if (u4Var4.getParent() != null) {
                                u4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = u4Var4.f11667h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                u4Var4.f11667h0 = null;
                            }
                            u4Var4.W = 0;
                            u4Var4.f11660a0 = 0.0f;
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
