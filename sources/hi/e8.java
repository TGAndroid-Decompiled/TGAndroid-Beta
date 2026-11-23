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
public final class e8 extends v4.u0 {
    public final int f14600a;
    public boolean f14601b;
    public final Object f14602c;

    public e8(int i7, FrameLayout frameLayout) {
        this.f14600a = i7;
        this.f14602c = frameLayout;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        int i10;
        mj0 mj0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i11 = this.f14600a;
        Object obj = this.f14602c;
        boolean z10 = false;
        switch (i11) {
            case 0:
                k8 k8Var = (k8) obj;
                ek0 ek0Var = k8Var.f14934f;
                if (i7 == 1) {
                    p8 p8Var = k8Var.f14930a0;
                    int i12 = p8.Y1;
                    if (p8Var.d && k8Var.f14940y != null) {
                        p8Var.N0();
                    }
                }
                if (i7 == 0) {
                    k8Var.T = !ek0Var.canScrollVertically(-1);
                    ek0Var.canScrollVertically(1);
                }
                if (i7 != 0) {
                    z10 = true;
                }
                k8Var.N = z10;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                zl zlVar = chatAttachAlertPhotoLayout.F;
                ui uiVar = chatAttachAlertPhotoLayout.f37519b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = uiVar.Y2;
                    if (q0Var != null) {
                        i10 = org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L + i10;
                    int i14 = uiVar.f30210t0;
                    if (((uiVar.Z3[0] - i14) - i13) + i14 < (uiVar.M2.getAlpha() * uiVar.M2.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var = (mj0) zlVar.K(0)) != null) {
                        View view = mj0Var.f59165a;
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
                if (i7 == 0 && this.f14601b) {
                    this.f14601b = false;
                    ((org.telegram.ui.Wallet.j6) obj).f();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11 = this.f14600a;
        Object obj = this.f14602c;
        switch (i11) {
            case 0:
                k8 k8Var = (k8) obj;
                p8 p8Var = k8Var.f14930a0;
                ek0 ek0Var = k8Var.f14934f;
                boolean canScrollVertically = ek0Var.canScrollVertically(1);
                if (canScrollVertically != this.f14601b) {
                    k8Var.f14936r.invalidate();
                    this.f14601b = canScrollVertically;
                }
                k8Var.f14933e.invalidate();
                int i12 = p8.Y1;
                p8Var.f30176b.invalidate();
                if (k8Var.f14929a == 6 && ek0Var.getChildCount() > 0 && RecyclerView.R(ek0Var.getChildAt(0)) >= np.u1(p8Var.f30173a).R1().L.size()) {
                    np.u1(p8Var.f30173a).R1().S();
                    return;
                }
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ui uiVar = chatAttachAlertPhotoLayout.f37519b;
                zl zlVar = chatAttachAlertPhotoLayout.F;
                if (zlVar.getChildCount() > 0) {
                    uiVar.N1(chatAttachAlertPhotoLayout, i10);
                    float f10 = 0.0f;
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z10 = this.f14601b;
                        boolean z11 = uiVar.M1;
                        if (z10 != z11) {
                            this.f14601b = z11;
                            ViewPropertyAnimator animate = zlVar.getFastScroll().animate();
                            if (this.f14601b) {
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
                    this.f14601b = true;
                    return;
                }
                return;
        }
    }

    public e8(org.telegram.ui.Wallet.j6 j6Var) {
        this.f14600a = 2;
        this.f14602c = j6Var;
        this.f14601b = false;
    }
}
