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
import org.telegram.ui.Components.n70;
public final class s4 implements View.OnClickListener {
    public final int f14164a;
    public final w4 f14165b;

    public s4(w4 w4Var, int i10) {
        this.f14164a = i10;
        this.f14165b = w4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f14164a) {
            case 0:
                final w4 w4Var = this.f14165b;
                ArrayList arrayList = w4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (w4Var.N != null && w4Var.f13749a != null) {
                    List m10 = w4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final u uVar = (u) m10.get(indexOf);
                        n70 t10 = w4Var.N.f14098a.f14249h3.t((View) arrayList.get(indexOf));
                        boolean z10 = uVar.f14206n;
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
                        t10.c(i10, LocaleController.getString(i11), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        w4 w4Var2 = w4Var;
                                        o3 o3Var = w4Var2.N;
                                        if (o3Var != null && (aVar3 = w4Var2.f13749a) != null) {
                                            v3 v3Var = o3Var.f14098a;
                                            v3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                g2 g2Var = v3Var.J3;
                                                if (g2Var != null) {
                                                    g2Var.d();
                                                }
                                                uVar2.f14206n = !uVar2.f14206n;
                                                TL_iv.PageBlock M3 = v3.M3(aVar3, uVar2);
                                                if (M3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) M3).spoiler = uVar2.f14206n;
                                                } else if (M3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) M3).spoiler = uVar2.f14206n;
                                                }
                                                v3Var.m4(aVar3);
                                                g2 g2Var2 = v3Var.J3;
                                                if (g2Var2 != null) {
                                                    g2Var2.h();
                                                }
                                                v3Var.f14249h3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        w4 w4Var3 = w4Var;
                                        o3 o3Var2 = w4Var3.N;
                                        if (o3Var2 != null && (aVar4 = w4Var3.f13749a) != null) {
                                            v3.M1(aVar4, uVar, o3Var2.f14098a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        t10.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        w4 w4Var2 = w4Var;
                                        o3 o3Var = w4Var2.N;
                                        if (o3Var != null && (aVar3 = w4Var2.f13749a) != null) {
                                            v3 v3Var = o3Var.f14098a;
                                            v3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                g2 g2Var = v3Var.J3;
                                                if (g2Var != null) {
                                                    g2Var.d();
                                                }
                                                uVar2.f14206n = !uVar2.f14206n;
                                                TL_iv.PageBlock M3 = v3.M3(aVar3, uVar2);
                                                if (M3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) M3).spoiler = uVar2.f14206n;
                                                } else if (M3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) M3).spoiler = uVar2.f14206n;
                                                }
                                                v3Var.m4(aVar3);
                                                g2 g2Var2 = v3Var.J3;
                                                if (g2Var2 != null) {
                                                    g2Var2.h();
                                                }
                                                v3Var.f14249h3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        w4 w4Var3 = w4Var;
                                        o3 o3Var2 = w4Var3.N;
                                        if (o3Var2 != null && (aVar4 = w4Var3.f13749a) != null) {
                                            v3.M1(aVar4, uVar, o3Var2.f14098a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        t10.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (w4Var.H) {
                            t10.f28662u = false;
                            t10.v = true;
                            t10.f28660s = 0;
                        }
                        t10.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                w4 w4Var2 = this.f14165b;
                o3 o3Var = w4Var2.N;
                if (o3Var != null && (aVar = w4Var2.f13749a) != null) {
                    v3 v3Var = o3Var.f14098a;
                    v3Var.f14241b4 = aVar;
                    v3Var.f14249h3.e(0);
                    return;
                }
                return;
            default:
                w4 w4Var3 = this.f14165b;
                o3 o3Var2 = w4Var3.N;
                if (o3Var2 != null && (aVar2 = w4Var3.f13749a) != null) {
                    v3 v3Var2 = o3Var2.f14098a;
                    v3Var2.getClass();
                    if (v3.A3(aVar2.f13732b)) {
                        g2 g2Var = v3Var2.J3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> f32 = v3.f3(aVar2.f13732b);
                        TL_iv.PageBlock pageBlock = aVar2.f13732b;
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
                        aVar2.f13732b = pageblockslideshow;
                        g2 g2Var2 = v3Var2.J3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        View y12 = v3Var2.y1(aVar2);
                        if (y12 instanceof w4) {
                            w4 w4Var4 = (w4) y12;
                            ValueAnimator valueAnimator = w4Var4.f14301i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                w4Var4.f14301i0 = null;
                            }
                            if (w4Var4.getParent() != null) {
                                w4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = w4Var4.f14300h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                w4Var4.f14300h0 = null;
                            }
                            w4Var4.W = 0;
                            w4Var4.f14293a0 = 0.0f;
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
