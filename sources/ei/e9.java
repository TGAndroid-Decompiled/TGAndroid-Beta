package ei;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.mk;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tl0;
public final class e9 extends s4.r0 {
    public final int f8971a;
    public boolean f8972b;
    public final Object f8973c;

    public e9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f8971a = i10;
        this.f8973c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        tl0 tl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f8971a) {
            case 0:
                k9 k9Var = (k9) this.f8973c;
                jm0 jm0Var = k9Var.f9328f;
                r9 r9Var = k9Var.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                    if (z10 && k9Var.f9333x != null) {
                        r9Var.g1();
                    }
                }
                if (i10 == 0) {
                    k9Var.S = !jm0Var.canScrollVertically(-1);
                    jm0Var.canScrollVertically(1);
                }
                if (i10 == 0) {
                    z11 = false;
                }
                k9Var.M = z11;
                return;
            case 1:
            default:
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f8973c;
                em emVar = chatAttachAlertPhotoLayout.E;
                ti tiVar = chatAttachAlertPhotoLayout.f28173b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30539d1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
                    if (((tiVar.f30543e2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (tiVar.R0.getAlpha() * tiVar.R0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (tl0Var = (tl0) emVar.K(0)) != null) {
                        View view = tl0Var.f45917a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            emVar.v0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (i10 == 0 && this.f8972b) {
                    this.f8972b = false;
                    ((org.telegram.ui.Wallet.k5) this.f8973c).f();
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
        switch (this.f8971a) {
            case 0:
                k9 k9Var = (k9) this.f8973c;
                r9 r9Var = k9Var.W;
                jm0 jm0Var = k9Var.f9328f;
                boolean canScrollVertically = jm0Var.canScrollVertically(1);
                if (canScrollVertically != this.f8972b) {
                    k9Var.f9330r.invalidate();
                    this.f8972b = canScrollVertically;
                }
                k9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) r9Var).containerView;
                viewGroup.invalidate();
                if (k9Var.f9325a == 6 && jm0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(jm0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.c7 c7Var = (org.telegram.ui.c7) this.f8973c;
                if (c7Var.f35835c.L0() <= 0 && !org.telegram.ui.c7.a0(c7Var).t()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.c7.b0(c7Var, z10);
                if (this.f8972b != c7Var.V.Z()) {
                    this.f8972b = c7Var.V.Z();
                    c7Var.V.invalidate();
                    return;
                }
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f8973c;
                ti tiVar = chatAttachAlertPhotoLayout.f28173b;
                em emVar = chatAttachAlertPhotoLayout.E;
                if (emVar.getChildCount() > 0) {
                    tiVar.b2(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.f8972b;
                        boolean z12 = tiVar.R;
                        if (z11 != z12) {
                            this.f8972b = z12;
                            ViewPropertyAnimator animate = emVar.getFastScroll().animate();
                            if (this.f8972b) {
                                f7 = 1.0f;
                            }
                            mk.s(animate, f7, 100L);
                        }
                    } else {
                        emVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i11 != 0) {
                        chatAttachAlertPhotoLayout.V();
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i10 != 0 || i11 != 0) {
                    this.f8972b = true;
                    return;
                }
                return;
        }
    }

    public e9(org.telegram.ui.Wallet.k5 k5Var) {
        this.f8971a = 3;
        this.f8973c = k5Var;
        this.f8972b = false;
    }
}
