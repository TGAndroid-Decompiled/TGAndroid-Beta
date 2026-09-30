package ci;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.wl;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.zl0;
public final class s9 extends s4.s0 {
    public final int f5507a;
    public boolean f5508b;
    public final NotificationCenter.NotificationCenterDelegate f5509c;

    public s9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5507a = i10;
        this.f5509c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        jl0 jl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f5507a) {
            case 0:
                y9 y9Var = (y9) this.f5509c;
                zl0 zl0Var = y9Var.f5895f;
                fa faVar = y9Var.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardVisible;
                    if (z10 && y9Var.f5900x != null) {
                        faVar.f1();
                    }
                }
                if (i10 == 0) {
                    y9Var.S = !zl0Var.canScrollVertically(-1);
                    zl0Var.canScrollVertically(1);
                }
                if (i10 == 0) {
                    z11 = false;
                }
                y9Var.M = z11;
                return;
            case 1:
            default:
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5509c;
                wl wlVar = chatAttachAlertPhotoLayout.E;
                xi xiVar = chatAttachAlertPhotoLayout.f27362b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = xiVar.f30254a1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = xiVar.getBackgroundPaddingTop();
                    if (((xiVar.f30258b2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (xiVar.O0.getAlpha() * xiVar.O0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (jl0Var = (jl0) wlVar.K(0)) != null) {
                        View view = jl0Var.f43068a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            wlVar.w0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        int i12;
        int i13;
        boolean z10;
        switch (this.f5507a) {
            case 0:
                y9 y9Var = (y9) this.f5509c;
                fa faVar = y9Var.W;
                zl0 zl0Var = y9Var.f5895f;
                boolean canScrollVertically = zl0Var.canScrollVertically(1);
                if (canScrollVertically != this.f5508b) {
                    y9Var.f5897r.invalidate();
                    this.f5508b = canScrollVertically;
                }
                y9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) faVar).containerView;
                viewGroup.invalidate();
                if (y9Var.f5892a == 6 && zl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(zl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.z6 z6Var = (org.telegram.ui.z6) this.f5509c;
                if (z6Var.f40460c.L0() <= 0 && !org.telegram.ui.z6.a0(z6Var).s()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.z6.b0(z6Var, z10);
                if (this.f5508b != z6Var.V.Z()) {
                    this.f5508b = z6Var.V.Z();
                    z6Var.V.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5509c;
                xi xiVar = chatAttachAlertPhotoLayout.f27362b;
                wl wlVar = chatAttachAlertPhotoLayout.E;
                if (wlVar.getChildCount() > 0) {
                    xiVar.X1(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.f5508b;
                        boolean z12 = xiVar.R;
                        if (z11 != z12) {
                            this.f5508b = z12;
                            ViewPropertyAnimator animate = wlVar.getFastScroll().animate();
                            if (this.f5508b) {
                                f7 = 1.0f;
                            }
                            ok.r(animate, f7, 100L);
                        }
                    } else {
                        wlVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i11 != 0) {
                        chatAttachAlertPhotoLayout.V();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
