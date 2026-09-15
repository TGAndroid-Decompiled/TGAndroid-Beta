package ci;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vk0;
public final class v9 extends s4.s0 {
    public final int f5660a;
    public boolean f5661b;
    public final NotificationCenter.NotificationCenterDelegate f5662c;

    public v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5660a = i10;
        this.f5662c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        vk0 vk0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f5660a) {
            case 0:
                ba baVar = (ba) this.f5662c;
                ll0 ll0Var = baVar.f4399f;
                ia iaVar = baVar.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardVisible;
                    if (z10 && baVar.f4404x != null) {
                        iaVar.f1();
                    }
                }
                if (i10 == 0) {
                    baVar.S = !ll0Var.canScrollVertically(-1);
                    ll0Var.canScrollVertically(1);
                }
                if (i10 == 0) {
                    z11 = false;
                }
                baVar.M = z11;
                return;
            case 1:
            default:
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5662c;
                tl tlVar = chatAttachAlertPhotoLayout.E;
                vi viVar = chatAttachAlertPhotoLayout.f26462b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.f28734a1;
                    if (v0Var != null) {
                        i11 = AndroidUtilities.dp(v0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.f28738b2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (viVar.O0.getAlpha() * viVar.O0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var = (vk0) tlVar.K(0)) != null) {
                        View view = vk0Var.f42675a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            tlVar.v0(0, top2 - topScrollOffset2, null);
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
        switch (this.f5660a) {
            case 0:
                ba baVar = (ba) this.f5662c;
                ia iaVar = baVar.W;
                ll0 ll0Var = baVar.f4399f;
                boolean canScrollVertically = ll0Var.canScrollVertically(1);
                if (canScrollVertically != this.f5661b) {
                    baVar.f4401r.invalidate();
                    this.f5661b = canScrollVertically;
                }
                baVar.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) iaVar).containerView;
                viewGroup.invalidate();
                if (baVar.f4396a == 6 && ll0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(ll0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.z6 z6Var = (org.telegram.ui.z6) this.f5662c;
                if (z6Var.f40078c.L0() <= 0 && !org.telegram.ui.z6.a0(z6Var).s()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.z6.b0(z6Var, z10);
                if (this.f5661b != z6Var.V.Z()) {
                    this.f5661b = z6Var.V.Z();
                    z6Var.V.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5662c;
                vi viVar = chatAttachAlertPhotoLayout.f26462b;
                tl tlVar = chatAttachAlertPhotoLayout.E;
                if (tlVar.getChildCount() > 0) {
                    viVar.X1(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.f5661b;
                        boolean z12 = viVar.R;
                        if (z11 != z12) {
                            this.f5661b = z12;
                            ViewPropertyAnimator animate = tlVar.getFastScroll().animate();
                            if (this.f5661b) {
                                f7 = 1.0f;
                            }
                            animate.alpha(f7).setDuration(100L).start();
                        }
                    } else {
                        tlVar.getFastScroll().setAlpha(0.0f);
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
