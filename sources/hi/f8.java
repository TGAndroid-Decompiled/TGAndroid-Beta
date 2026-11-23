package hi;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.zl;
public final class f8 extends v4.t0 {
    public final int f14609a;
    public boolean f14610b;
    public final Object f14611c;

    public f8(int i7, FrameLayout frameLayout) {
        this.f14609a = i7;
        this.f14611c = frameLayout;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        int i10;
        mj0 mj0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i11 = this.f14609a;
        Object obj = this.f14611c;
        boolean z10 = false;
        switch (i11) {
            case 0:
                l8 l8Var = (l8) obj;
                ek0 ek0Var = l8Var.f14946f;
                if (i7 == 1) {
                    q8 q8Var = l8Var.f14942a0;
                    int i12 = q8.Y1;
                    if (q8Var.d && l8Var.f14952y != null) {
                        q8Var.N0();
                    }
                }
                if (i7 == 0) {
                    l8Var.T = !ek0Var.canScrollVertically(-1);
                    ek0Var.canScrollVertically(1);
                }
                if (i7 != 0) {
                    z10 = true;
                }
                l8Var.N = z10;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                zl zlVar = chatAttachAlertPhotoLayout.F;
                ui uiVar = chatAttachAlertPhotoLayout.f37477b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = uiVar.Y2;
                    if (q0Var != null) {
                        i10 = org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L + i10;
                    int i14 = uiVar.f30176t0;
                    if (((uiVar.Z3[0] - i14) - i13) + i14 < (uiVar.M2.getAlpha() * uiVar.M2.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var = (mj0) zlVar.K(0)) != null) {
                        View view = mj0Var.f59111a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            zlVar.w0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 == 0 && this.f14610b) {
                    this.f14610b = false;
                    ((org.telegram.ui.Wallet.j6) obj).f();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11 = this.f14609a;
        Object obj = this.f14611c;
        switch (i11) {
            case 0:
                l8 l8Var = (l8) obj;
                q8 q8Var = l8Var.f14942a0;
                ek0 ek0Var = l8Var.f14946f;
                boolean canScrollVertically = ek0Var.canScrollVertically(1);
                if (canScrollVertically != this.f14610b) {
                    l8Var.f14948r.invalidate();
                    this.f14610b = canScrollVertically;
                }
                l8Var.f14945e.invalidate();
                int i12 = q8.Y1;
                q8Var.f30142b.invalidate();
                if (l8Var.f14941a == 6 && ek0Var.getChildCount() > 0 && RecyclerView.R(ek0Var.getChildAt(0)) >= np.u1(q8Var.f30139a).R1().L.size()) {
                    np.u1(q8Var.f30139a).R1().S();
                    return;
                }
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ui uiVar = chatAttachAlertPhotoLayout.f37477b;
                zl zlVar = chatAttachAlertPhotoLayout.F;
                if (zlVar.getChildCount() > 0) {
                    uiVar.N1(chatAttachAlertPhotoLayout, i10);
                    float f10 = 0.0f;
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z10 = this.f14610b;
                        boolean z11 = uiVar.M1;
                        if (z10 != z11) {
                            this.f14610b = z11;
                            ViewPropertyAnimator animate = zlVar.getFastScroll().animate();
                            if (this.f14610b) {
                                f10 = 1.0f;
                            }
                            o10.n(animate, f10, 100L);
                        }
                    } else {
                        zlVar.getFastScroll().setAlpha(0.0f);
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
                    this.f14610b = true;
                    return;
                }
                return;
        }
    }

    public f8(org.telegram.ui.Wallet.j6 j6Var) {
        this.f14609a = 2;
        this.f14611c = j6Var;
        this.f14610b = false;
    }
}
