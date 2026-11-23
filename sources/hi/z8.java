package hi;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xl;
public final class z8 extends v4.u0 {
    public final int f15922a;
    public boolean f15923b;
    public final Object f15924c;

    public z8(int i7, FrameLayout frameLayout) {
        this.f15922a = i7;
        this.f15924c = frameLayout;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        int i10;
        mj0 mj0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i11 = this.f15922a;
        Object obj = this.f15924c;
        boolean z10 = false;
        switch (i11) {
            case 0:
                f9 f9Var = (f9) obj;
                ek0 ek0Var = f9Var.f14499f;
                if (i7 == 1) {
                    k9 k9Var = f9Var.f14495a0;
                    int i12 = k9.Y1;
                    if (k9Var.d && f9Var.f14505y != null) {
                        k9Var.N0();
                    }
                }
                if (i7 == 0) {
                    f9Var.T = !ek0Var.canScrollVertically(-1);
                    ek0Var.canScrollVertically(1);
                }
                if (i7 != 0) {
                    z10 = true;
                }
                f9Var.N = z10;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                xl xlVar = chatAttachAlertPhotoLayout.F;
                ti tiVar = chatAttachAlertPhotoLayout.f37135b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = tiVar.Y2;
                    if (q0Var != null) {
                        i10 = org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L + i10;
                    int i14 = tiVar.f30260t0;
                    if (((tiVar.Z3[0] - i14) - i13) + i14 < (tiVar.M2.getAlpha() * tiVar.M2.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var = (mj0) xlVar.K(0)) != null) {
                        View view = mj0Var.f59245a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            xlVar.w0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 == 0 && this.f15923b) {
                    this.f15923b = false;
                    ((org.telegram.ui.Wallet.k6) obj).f();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11 = this.f15922a;
        Object obj = this.f15924c;
        switch (i11) {
            case 0:
                f9 f9Var = (f9) obj;
                k9 k9Var = f9Var.f14495a0;
                ek0 ek0Var = f9Var.f14499f;
                boolean canScrollVertically = ek0Var.canScrollVertically(1);
                if (canScrollVertically != this.f15923b) {
                    f9Var.f14501r.invalidate();
                    this.f15923b = canScrollVertically;
                }
                f9Var.f14498e.invalidate();
                int i12 = k9.Y1;
                k9Var.f30226b.invalidate();
                if (f9Var.f14494a == 6 && ek0Var.getChildCount() > 0 && RecyclerView.R(ek0Var.getChildAt(0)) >= mp.u1(k9Var.f30223a).R1().L.size()) {
                    mp.u1(k9Var.f30223a).R1().S();
                    return;
                }
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ti tiVar = chatAttachAlertPhotoLayout.f37135b;
                xl xlVar = chatAttachAlertPhotoLayout.F;
                if (xlVar.getChildCount() > 0) {
                    tiVar.N1(chatAttachAlertPhotoLayout, i10);
                    float f10 = 0.0f;
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z10 = this.f15923b;
                        boolean z11 = tiVar.M1;
                        if (z10 != z11) {
                            this.f15923b = z11;
                            ViewPropertyAnimator animate = xlVar.getFastScroll().animate();
                            if (this.f15923b) {
                                f10 = 1.0f;
                            }
                            m10.n(animate, f10, 100L);
                        }
                    } else {
                        xlVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i10 != 0) {
                        chatAttachAlertPhotoLayout.Y();
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 != 0 || i10 != 0) {
                    this.f15923b = true;
                    return;
                }
                return;
        }
    }

    public z8(org.telegram.ui.Wallet.k6 k6Var) {
        this.f15922a = 2;
        this.f15924c = k6Var;
        this.f15923b = false;
    }
}
