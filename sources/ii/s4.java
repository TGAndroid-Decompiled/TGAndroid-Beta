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
import org.telegram.ui.Components.z70;
public final class s4 implements View.OnClickListener {
    public final int f11614a;
    public final v4 f11615b;

    public s4(v4 v4Var, int i10) {
        this.f11614a = i10;
        this.f11615b = v4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f11614a) {
            case 0:
                final v4 v4Var = this.f11615b;
                ArrayList arrayList = v4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (v4Var.N != null && v4Var.f11207a != null) {
                    List m10 = v4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final u uVar = (u) m10.get(indexOf);
                        z70 F = v4Var.N.f11569a.f11728h3.F((View) arrayList.get(indexOf));
                        boolean z10 = uVar.f11643n;
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
                                        v4 v4Var2 = v4Var;
                                        q3 q3Var = v4Var2.N;
                                        if (q3Var != null && (aVar3 = v4Var2.f11207a) != null) {
                                            x3 x3Var = q3Var.f11569a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                i2 i2Var = x3Var.J3;
                                                if (i2Var != null) {
                                                    i2Var.d();
                                                }
                                                uVar2.f11643n = !uVar2.f11643n;
                                                TL_iv.PageBlock N3 = x3.N3(aVar3, uVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = uVar2.f11643n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = uVar2.f11643n;
                                                }
                                                x3Var.n4(aVar3);
                                                i2 i2Var2 = x3Var.J3;
                                                if (i2Var2 != null) {
                                                    i2Var2.h();
                                                }
                                                x3Var.f11728h3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        v4 v4Var3 = v4Var;
                                        q3 q3Var2 = v4Var3.N;
                                        if (q3Var2 != null && (aVar4 = v4Var3.f11207a) != null) {
                                            x3.N1(aVar4, uVar, q3Var2.f11569a);
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
                                        v4 v4Var2 = v4Var;
                                        q3 q3Var = v4Var2.N;
                                        if (q3Var != null && (aVar3 = v4Var2.f11207a) != null) {
                                            x3 x3Var = q3Var.f11569a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                i2 i2Var = x3Var.J3;
                                                if (i2Var != null) {
                                                    i2Var.d();
                                                }
                                                uVar2.f11643n = !uVar2.f11643n;
                                                TL_iv.PageBlock N3 = x3.N3(aVar3, uVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = uVar2.f11643n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = uVar2.f11643n;
                                                }
                                                x3Var.n4(aVar3);
                                                i2 i2Var2 = x3Var.J3;
                                                if (i2Var2 != null) {
                                                    i2Var2.h();
                                                }
                                                x3Var.f11728h3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        v4 v4Var3 = v4Var;
                                        q3 q3Var2 = v4Var3.N;
                                        if (q3Var2 != null && (aVar4 = v4Var3.f11207a) != null) {
                                            x3.N1(aVar4, uVar, q3Var2.f11569a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        F.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (v4Var.H) {
                            F.f30841u = false;
                            F.v = true;
                            F.f30839s = 0;
                        }
                        F.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                v4 v4Var2 = this.f11615b;
                q3 q3Var = v4Var2.N;
                if (q3Var != null && (aVar = v4Var2.f11207a) != null) {
                    x3 x3Var = q3Var.f11569a;
                    x3Var.f11720b4 = aVar;
                    x3Var.f11728h3.i(0);
                    return;
                }
                return;
            default:
                v4 v4Var3 = this.f11615b;
                q3 q3Var2 = v4Var3.N;
                if (q3Var2 != null && (aVar2 = v4Var3.f11207a) != null) {
                    x3 x3Var2 = q3Var2.f11569a;
                    x3Var2.getClass();
                    if (x3.B3(aVar2.f11191b)) {
                        i2 i2Var = x3Var2.J3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> g32 = x3.g3(aVar2.f11191b);
                        TL_iv.PageBlock pageBlock = aVar2.f11191b;
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
                        aVar2.f11191b = pageblockslideshow;
                        i2 i2Var2 = x3Var2.J3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        View z12 = x3Var2.z1(aVar2);
                        if (z12 instanceof v4) {
                            v4 v4Var4 = (v4) z12;
                            ValueAnimator valueAnimator = v4Var4.f11678i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                v4Var4.f11678i0 = null;
                            }
                            if (v4Var4.getParent() != null) {
                                v4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = v4Var4.f11677h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                v4Var4.f11677h0 = null;
                            }
                            v4Var4.W = 0;
                            v4Var4.f11670a0 = 0.0f;
                            v4Var4.o(true);
                            v4Var4.requestLayout();
                            v4Var4.invalidate();
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
