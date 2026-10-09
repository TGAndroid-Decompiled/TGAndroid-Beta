package ci;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.yi;
public final class s9 extends s4.t0 {
    public final int f5959a;
    public boolean f5960b;
    public final Object f5961c;

    public s9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5959a = i10;
        this.f5961c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        am0 am0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f5959a) {
            case 0:
                y9 y9Var = (y9) this.f5961c;
                qm0 qm0Var = y9Var.f6364f;
                fa faVar = y9Var.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) faVar).keyboardVisible;
                    if (z10 && y9Var.f6369x != null) {
                        faVar.g1();
                    }
                }
                if (i10 == 0) {
                    y9Var.S = !qm0Var.canScrollVertically(-1);
                    qm0Var.canScrollVertically(1);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5961c;
                km kmVar = chatAttachAlertPhotoLayout.E;
                yi yiVar = chatAttachAlertPhotoLayout.f30173b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = yiVar.f33221d1;
                    if (v0Var != null) {
                        i11 = AndroidUtilities.dp(v0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = yiVar.getBackgroundPaddingTop();
                    if (((yiVar.f33226e2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (yiVar.R0.getAlpha() * yiVar.R0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (am0Var = (am0) kmVar.K(0)) != null) {
                        View view = am0Var.f47656a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            kmVar.v0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (i10 == 0 && this.f5960b) {
                    this.f5960b = false;
                    ((org.telegram.ui.Wallet.u4) this.f5961c).e();
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
        switch (this.f5959a) {
            case 0:
                y9 y9Var = (y9) this.f5961c;
                fa faVar = y9Var.W;
                qm0 qm0Var = y9Var.f6364f;
                boolean canScrollVertically = qm0Var.canScrollVertically(1);
                if (canScrollVertically != this.f5960b) {
                    y9Var.f6366r.invalidate();
                    this.f5960b = canScrollVertically;
                }
                y9Var.f6363e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) faVar).containerView;
                viewGroup.invalidate();
                if (y9Var.f6360a == 6 && qm0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(qm0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.f3) faVar).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.f3) faVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.y6 y6Var = (org.telegram.ui.y6) this.f5961c;
                if (y6Var.f44249c.L0() <= 0 && !org.telegram.ui.y6.a0(y6Var).t()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.y6.b0(y6Var, z10);
                if (this.f5960b != y6Var.V.Z()) {
                    this.f5960b = y6Var.V.Z();
                    y6Var.V.invalidate();
                    return;
                }
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5961c;
                yi yiVar = chatAttachAlertPhotoLayout.f30173b;
                km kmVar = chatAttachAlertPhotoLayout.E;
                if (kmVar.getChildCount() > 0) {
                    yiVar.b2(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.f5960b;
                        boolean z12 = yiVar.R;
                        if (z11 != z12) {
                            this.f5960b = z12;
                            ViewPropertyAnimator animate = kmVar.getFastScroll().animate();
                            if (this.f5960b) {
                                f7 = 1.0f;
                            }
                            bi.s(animate, f7, 100L);
                        }
                    } else {
                        kmVar.getFastScroll().setAlpha(0.0f);
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
                    this.f5960b = true;
                    return;
                }
                return;
        }
    }

    public s9(org.telegram.ui.Wallet.u4 u4Var) {
        this.f5959a = 3;
        this.f5961c = u4Var;
        this.f5960b = false;
    }
}
