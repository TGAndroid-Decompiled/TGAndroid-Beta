package ci;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.ai;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.yi;
public final class s9 extends s4.t0 {
    public final int f5958a;
    public boolean f5959b;
    public final Object f5960c;

    public s9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5958a = i10;
        this.f5960c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        bm0 bm0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f5958a) {
            case 0:
                y9 y9Var = (y9) this.f5960c;
                rm0 rm0Var = y9Var.f6363f;
                fa faVar = y9Var.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardVisible;
                    if (z10 && y9Var.f6368x != null) {
                        faVar.g1();
                    }
                }
                if (i10 == 0) {
                    y9Var.S = !rm0Var.canScrollVertically(-1);
                    rm0Var.canScrollVertically(1);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5960c;
                km kmVar = chatAttachAlertPhotoLayout.E;
                yi yiVar = chatAttachAlertPhotoLayout.f30245b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = yiVar.f33282d1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = yiVar.getBackgroundPaddingTop();
                    if (((yiVar.f33287e2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (yiVar.R0.getAlpha() * yiVar.R0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (bm0Var = (bm0) kmVar.K(0)) != null) {
                        View view = bm0Var.f47782a;
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
                if (i10 == 0 && this.f5959b) {
                    this.f5959b = false;
                    ((org.telegram.ui.Wallet.x4) this.f5960c).e();
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
        switch (this.f5958a) {
            case 0:
                y9 y9Var = (y9) this.f5960c;
                fa faVar = y9Var.W;
                rm0 rm0Var = y9Var.f6363f;
                boolean canScrollVertically = rm0Var.canScrollVertically(1);
                if (canScrollVertically != this.f5959b) {
                    y9Var.f6365r.invalidate();
                    this.f5959b = canScrollVertically;
                }
                y9Var.f6362e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) faVar).containerView;
                viewGroup.invalidate();
                if (y9Var.f6359a == 6 && rm0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(rm0Var.getChildAt(0));
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
                org.telegram.ui.x6 x6Var = (org.telegram.ui.x6) this.f5960c;
                if (x6Var.f44011c.L0() <= 0 && !org.telegram.ui.x6.a0(x6Var).t()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.x6.b0(x6Var, z10);
                if (this.f5959b != x6Var.V.Z()) {
                    this.f5959b = x6Var.V.Z();
                    x6Var.V.invalidate();
                    return;
                }
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5960c;
                yi yiVar = chatAttachAlertPhotoLayout.f30245b;
                km kmVar = chatAttachAlertPhotoLayout.E;
                if (kmVar.getChildCount() > 0) {
                    yiVar.b2(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.f5959b;
                        boolean z12 = yiVar.R;
                        if (z11 != z12) {
                            this.f5959b = z12;
                            ViewPropertyAnimator animate = kmVar.getFastScroll().animate();
                            if (this.f5959b) {
                                f7 = 1.0f;
                            }
                            ai.s(animate, f7, 100L);
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
                    this.f5959b = true;
                    return;
                }
                return;
        }
    }

    public s9(org.telegram.ui.Wallet.x4 x4Var) {
        this.f5958a = 3;
        this.f5960c = x4Var;
        this.f5959b = false;
    }
}
