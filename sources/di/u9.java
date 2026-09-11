package di;

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
public final class u9 extends s4.s0 {
    public final int f8257a;
    public boolean f8258b;
    public final NotificationCenter.NotificationCenterDelegate f8259c;

    public u9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f8257a = i10;
        this.f8259c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        vk0 vk0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f8257a) {
            case 0:
                ba baVar = (ba) this.f8259c;
                ll0 ll0Var = baVar.f6960f;
                ia iaVar = baVar.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardVisible;
                    if (z10 && baVar.f6965x != null) {
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f8259c;
                tl tlVar = chatAttachAlertPhotoLayout.E;
                vi viVar = chatAttachAlertPhotoLayout.f28753b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.f31262a1;
                    if (v0Var != null) {
                        i11 = AndroidUtilities.dp(v0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.f31266b2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (viVar.O0.getAlpha() * viVar.O0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var = (vk0) tlVar.K(0)) != null) {
                        View view = vk0Var.f45738a;
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
        switch (this.f8257a) {
            case 0:
                ba baVar = (ba) this.f8259c;
                ia iaVar = baVar.W;
                ll0 ll0Var = baVar.f6960f;
                boolean canScrollVertically = ll0Var.canScrollVertically(1);
                if (canScrollVertically != this.f8258b) {
                    baVar.f6962r.invalidate();
                    this.f8258b = canScrollVertically;
                }
                baVar.f6959e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) iaVar).containerView;
                viewGroup.invalidate();
                if (baVar.f6956a == 6 && ll0Var.getChildCount() > 0) {
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
                org.telegram.ui.z6 z6Var = (org.telegram.ui.z6) this.f8259c;
                if (z6Var.f43307c.L0() <= 0 && !org.telegram.ui.z6.a0(z6Var).s()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.z6.b0(z6Var, z10);
                if (this.f8258b != z6Var.V.Z()) {
                    this.f8258b = z6Var.V.Z();
                    z6Var.V.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f8259c;
                vi viVar = chatAttachAlertPhotoLayout.f28753b;
                tl tlVar = chatAttachAlertPhotoLayout.E;
                if (tlVar.getChildCount() > 0) {
                    viVar.X1(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.f8258b;
                        boolean z12 = viVar.R;
                        if (z11 != z12) {
                            this.f8258b = z12;
                            ViewPropertyAnimator animate = tlVar.getFastScroll().animate();
                            if (this.f8258b) {
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
