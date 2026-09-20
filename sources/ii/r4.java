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
import org.telegram.ui.Components.v70;
public final class r4 implements View.OnClickListener {
    public final int f11605a;
    public final u4 f11606b;

    public r4(u4 u4Var, int i10) {
        this.f11605a = i10;
        this.f11606b = u4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f11605a) {
            case 0:
                final u4 u4Var = this.f11606b;
                ArrayList arrayList = u4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (u4Var.N != null && u4Var.f11221a != null) {
                    List m10 = u4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final u uVar = (u) m10.get(indexOf);
                        v70 F = u4Var.N.f11563a.f11715h3.F((View) arrayList.get(indexOf));
                        boolean z10 = uVar.f11649n;
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
                        F.c(i10, LocaleController.getString(i11), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        u4 u4Var2 = u4Var;
                                        p3 p3Var = u4Var2.N;
                                        if (p3Var != null && (aVar3 = u4Var2.f11221a) != null) {
                                            w3 w3Var = p3Var.f11563a;
                                            w3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                h2 h2Var = w3Var.J3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                uVar2.f11649n = !uVar2.f11649n;
                                                TL_iv.PageBlock O3 = w3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.f11649n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.f11649n;
                                                }
                                                w3Var.o4(aVar3);
                                                h2 h2Var2 = w3Var.J3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                w3Var.f11715h3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        u4 u4Var3 = u4Var;
                                        p3 p3Var2 = u4Var3.N;
                                        if (p3Var2 != null && (aVar4 = u4Var3.f11221a) != null) {
                                            w3.O1(aVar4, uVar, p3Var2.f11563a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        u4 u4Var2 = u4Var;
                                        p3 p3Var = u4Var2.N;
                                        if (p3Var != null && (aVar3 = u4Var2.f11221a) != null) {
                                            w3 w3Var = p3Var.f11563a;
                                            w3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                h2 h2Var = w3Var.J3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                uVar2.f11649n = !uVar2.f11649n;
                                                TL_iv.PageBlock O3 = w3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.f11649n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.f11649n;
                                                }
                                                w3Var.o4(aVar3);
                                                h2 h2Var2 = w3Var.J3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                w3Var.f11715h3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        u4 u4Var3 = u4Var;
                                        p3 p3Var2 = u4Var3.N;
                                        if (p3Var2 != null && (aVar4 = u4Var3.f11221a) != null) {
                                            w3.O1(aVar4, uVar, p3Var2.f11563a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        F.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (u4Var.H) {
                            F.f28996u = false;
                            F.v = true;
                            F.f28994s = 0;
                        }
                        F.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                u4 u4Var2 = this.f11606b;
                p3 p3Var = u4Var2.N;
                if (p3Var != null && (aVar = u4Var2.f11221a) != null) {
                    w3 w3Var = p3Var.f11563a;
                    w3Var.f11707b4 = aVar;
                    w3Var.f11715h3.m(0);
                    return;
                }
                return;
            default:
                u4 u4Var3 = this.f11606b;
                p3 p3Var2 = u4Var3.N;
                if (p3Var2 != null && (aVar2 = u4Var3.f11221a) != null) {
                    w3 w3Var2 = p3Var2.f11563a;
                    w3Var2.getClass();
                    if (w3.C3(aVar2.f11205b)) {
                        h2 h2Var = w3Var2.J3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> h32 = w3.h3(aVar2.f11205b);
                        TL_iv.PageBlock pageBlock = aVar2.f11205b;
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
                        aVar2.f11205b = pageblockslideshow;
                        h2 h2Var2 = w3Var2.J3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        View A1 = w3Var2.A1(aVar2);
                        if (A1 instanceof u4) {
                            u4 u4Var4 = (u4) A1;
                            ValueAnimator valueAnimator = u4Var4.f11672i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                u4Var4.f11672i0 = null;
                            }
                            if (u4Var4.getParent() != null) {
                                u4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = u4Var4.f11671h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                u4Var4.f11671h0 = null;
                            }
                            u4Var4.W = 0;
                            u4Var4.f11664a0 = 0.0f;
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
