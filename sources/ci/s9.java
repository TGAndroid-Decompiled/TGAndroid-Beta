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
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.vl;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xl0;
public final class s9 extends s4.s0 {
    public final int f5498a;
    public boolean f5499b;
    public final NotificationCenter.NotificationCenterDelegate f5500c;

    public s9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5498a = i10;
        this.f5500c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        hl0 hl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f5498a) {
            case 0:
                y9 y9Var = (y9) this.f5500c;
                xl0 xl0Var = y9Var.f5883f;
                fa faVar = y9Var.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardVisible;
                    if (z10 && y9Var.f5888x != null) {
                        faVar.f1();
                    }
                }
                if (i10 == 0) {
                    y9Var.S = !xl0Var.canScrollVertically(-1);
                    xl0Var.canScrollVertically(1);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5500c;
                vl vlVar = chatAttachAlertPhotoLayout.E;
                wi wiVar = chatAttachAlertPhotoLayout.f27043b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = wiVar.f30004a1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = wiVar.getBackgroundPaddingTop();
                    if (((wiVar.f30008b2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (wiVar.O0.getAlpha() * wiVar.O0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (hl0Var = (hl0) vlVar.K(0)) != null) {
                        View view = hl0Var.f42959a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            vlVar.v0(0, top2 - topScrollOffset2, null);
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
        switch (this.f5498a) {
            case 0:
                y9 y9Var = (y9) this.f5500c;
                fa faVar = y9Var.W;
                xl0 xl0Var = y9Var.f5883f;
                boolean canScrollVertically = xl0Var.canScrollVertically(1);
                if (canScrollVertically != this.f5499b) {
                    y9Var.f5885r.invalidate();
                    this.f5499b = canScrollVertically;
                }
                y9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) faVar).containerView;
                viewGroup.invalidate();
                if (y9Var.f5880a == 6 && xl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(xl0Var.getChildAt(0));
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
                org.telegram.ui.z6 z6Var = (org.telegram.ui.z6) this.f5500c;
                if (z6Var.f40349c.L0() <= 0 && !org.telegram.ui.z6.a0(z6Var).s()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.z6.b0(z6Var, z10);
                if (this.f5499b != z6Var.V.Z()) {
                    this.f5499b = z6Var.V.Z();
                    z6Var.V.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5500c;
                wi wiVar = chatAttachAlertPhotoLayout.f27043b;
                vl vlVar = chatAttachAlertPhotoLayout.E;
                if (vlVar.getChildCount() > 0) {
                    wiVar.X1(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.f5499b;
                        boolean z12 = wiVar.R;
                        if (z11 != z12) {
                            this.f5499b = z12;
                            ViewPropertyAnimator animate = vlVar.getFastScroll().animate();
                            if (this.f5499b) {
                                f7 = 1.0f;
                            }
                            ok.r(animate, f7, 100L);
                        }
                    } else {
                        vlVar.getFastScroll().setAlpha(0.0f);
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
