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
import org.telegram.ui.Components.s80;
public final class s4 implements View.OnClickListener {
    public final int f12690a;
    public final v4 f12691b;

    public s4(v4 v4Var, int i10) {
        this.f12690a = i10;
        this.f12691b = v4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f12690a) {
            case 0:
                final v4 v4Var = this.f12691b;
                ArrayList arrayList = v4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (v4Var.N != null && v4Var.f12249a != null) {
                    List m10 = v4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final u uVar = (u) m10.get(indexOf);
                        s80 J = v4Var.N.f12642a.f12807f3.J((View) arrayList.get(indexOf));
                        boolean z10 = uVar.f12721n;
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
                        J.c(i10, LocaleController.getString(i11), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        v4 v4Var2 = v4Var;
                                        q3 q3Var = v4Var2.N;
                                        if (q3Var != null && (aVar3 = v4Var2.f12249a) != null) {
                                            x3 x3Var = q3Var.f12642a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                i2 i2Var = x3Var.H3;
                                                if (i2Var != null) {
                                                    i2Var.d();
                                                }
                                                uVar2.f12721n = !uVar2.f12721n;
                                                TL_iv.PageBlock O3 = x3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.f12721n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.f12721n;
                                                }
                                                x3Var.o4(aVar3);
                                                i2 i2Var2 = x3Var.H3;
                                                if (i2Var2 != null) {
                                                    i2Var2.h();
                                                }
                                                x3Var.f12807f3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        v4 v4Var3 = v4Var;
                                        q3 q3Var2 = v4Var3.N;
                                        if (q3Var2 != null && (aVar4 = v4Var3.f12249a) != null) {
                                            x3.O1(aVar4, uVar, q3Var2.f12642a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        J.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        v4 v4Var2 = v4Var;
                                        q3 q3Var = v4Var2.N;
                                        if (q3Var != null && (aVar3 = v4Var2.f12249a) != null) {
                                            x3 x3Var = q3Var.f12642a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                i2 i2Var = x3Var.H3;
                                                if (i2Var != null) {
                                                    i2Var.d();
                                                }
                                                uVar2.f12721n = !uVar2.f12721n;
                                                TL_iv.PageBlock O3 = x3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.f12721n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.f12721n;
                                                }
                                                x3Var.o4(aVar3);
                                                i2 i2Var2 = x3Var.H3;
                                                if (i2Var2 != null) {
                                                    i2Var2.h();
                                                }
                                                x3Var.f12807f3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        v4 v4Var3 = v4Var;
                                        q3 q3Var2 = v4Var3.N;
                                        if (q3Var2 != null && (aVar4 = v4Var3.f12249a) != null) {
                                            x3.O1(aVar4, uVar, q3Var2.f12642a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        J.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (v4Var.H) {
                            J.f30474u = false;
                            J.v = true;
                            J.f30472s = 0;
                        }
                        J.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                v4 v4Var2 = this.f12691b;
                q3 q3Var = v4Var2.N;
                if (q3Var != null && (aVar = v4Var2.f12249a) != null) {
                    x3 x3Var = q3Var.f12642a;
                    x3Var.Z3 = aVar;
                    x3Var.f12807f3.m(0);
                    return;
                }
                return;
            default:
                v4 v4Var3 = this.f12691b;
                q3 q3Var2 = v4Var3.N;
                if (q3Var2 != null && (aVar2 = v4Var3.f12249a) != null) {
                    x3 x3Var2 = q3Var2.f12642a;
                    x3Var2.getClass();
                    if (x3.C3(aVar2.f12232b)) {
                        i2 i2Var = x3Var2.H3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> h32 = x3.h3(aVar2.f12232b);
                        TL_iv.PageBlock pageBlock = aVar2.f12232b;
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
                        aVar2.f12232b = pageblockslideshow;
                        i2 i2Var2 = x3Var2.H3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        View A1 = x3Var2.A1(aVar2);
                        if (A1 instanceof v4) {
                            v4 v4Var4 = (v4) A1;
                            ValueAnimator valueAnimator = v4Var4.f12758i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                v4Var4.f12758i0 = null;
                            }
                            if (v4Var4.getParent() != null) {
                                v4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = v4Var4.f12757h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                v4Var4.f12757h0 = null;
                            }
                            v4Var4.W = 0;
                            v4Var4.f12750a0 = 0.0f;
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
