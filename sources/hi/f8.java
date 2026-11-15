package hi;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ql;
import org.telegram.ui.Components.uj0;
public final class f8 extends v4.t0 {
    public final int f14313a;
    public boolean f14314b;
    public final Object f14315c;

    public f8(int i7, FrameLayout frameLayout) {
        this.f14313a = i7;
        this.f14315c = frameLayout;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        int i10;
        cj0 cj0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i11 = this.f14313a;
        Object obj = this.f14315c;
        boolean z10 = false;
        switch (i11) {
            case 0:
                l8 l8Var = (l8) obj;
                uj0 uj0Var = l8Var.f14604f;
                if (i7 == 1) {
                    q8 q8Var = l8Var.f14600a0;
                    int i12 = q8.Y1;
                    if (q8Var.d && l8Var.f14610y != null) {
                        q8Var.M0();
                    }
                }
                if (i7 == 0) {
                    l8Var.T = !uj0Var.canScrollVertically(-1);
                    uj0Var.canScrollVertically(1);
                }
                if (i7 != 0) {
                    z10 = true;
                }
                l8Var.N = z10;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ql qlVar = chatAttachAlertPhotoLayout.F;
                ki kiVar = chatAttachAlertPhotoLayout.f33609b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = kiVar.Y2;
                    if (q0Var != null) {
                        i10 = org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L + i10;
                    int i14 = kiVar.f29716t0;
                    if (((kiVar.Z3[0] - i14) - i13) + i14 < (kiVar.M2.getAlpha() * kiVar.M2.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cj0Var = (cj0) qlVar.K(0)) != null) {
                        View view = cj0Var.f58535a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            qlVar.w0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 == 0 && this.f14314b) {
                    this.f14314b = false;
                    ((org.telegram.ui.Wallet.u5) obj).f();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11 = this.f14313a;
        Object obj = this.f14315c;
        switch (i11) {
            case 0:
                l8 l8Var = (l8) obj;
                q8 q8Var = l8Var.f14600a0;
                uj0 uj0Var = l8Var.f14604f;
                boolean canScrollVertically = uj0Var.canScrollVertically(1);
                if (canScrollVertically != this.f14314b) {
                    l8Var.f14606r.invalidate();
                    this.f14314b = canScrollVertically;
                }
                l8Var.f14603e.invalidate();
                int i12 = q8.Y1;
                q8Var.f29682b.invalidate();
                if (l8Var.f14599a == 6 && uj0Var.getChildCount() > 0 && RecyclerView.R(uj0Var.getChildAt(0)) >= np.s1(q8Var.f29679a).P1().L.size()) {
                    np.s1(q8Var.f29679a).P1().S();
                    return;
                }
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ki kiVar = chatAttachAlertPhotoLayout.f33609b;
                ql qlVar = chatAttachAlertPhotoLayout.F;
                if (qlVar.getChildCount() > 0) {
                    kiVar.M1(chatAttachAlertPhotoLayout, i10);
                    float f10 = 0.0f;
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z10 = this.f14314b;
                        boolean z11 = kiVar.M1;
                        if (z10 != z11) {
                            this.f14314b = z11;
                            ViewPropertyAnimator animate = qlVar.getFastScroll().animate();
                            if (this.f14314b) {
                                f10 = 1.0f;
                            }
                            i20.m(animate, f10, 100L);
                        }
                    } else {
                        qlVar.getFastScroll().setAlpha(0.0f);
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
                    this.f14314b = true;
                    return;
                }
                return;
        }
    }

    public f8(org.telegram.ui.Wallet.u5 u5Var) {
        this.f14313a = 2;
        this.f14315c = u5Var;
        this.f14314b = false;
    }
}
