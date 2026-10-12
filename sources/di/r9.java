package di;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.yh;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wl0;
public final class r9 extends s4.r0 {
    public final int f7721a;
    public boolean f7722b;
    public final Object f7723c;

    public r9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f7721a = i10;
        this.f7723c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        wl0 wl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f7721a) {
            case 0:
                x9 x9Var = (x9) this.f7723c;
                mm0 mm0Var = x9Var.f8097f;
                ea eaVar = x9Var.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.e3) eaVar).keyboardVisible;
                    if (z10 && x9Var.f8102x != null) {
                        eaVar.g1();
                    }
                }
                if (i10 == 0) {
                    x9Var.S = !mm0Var.canScrollVertically(-1);
                    mm0Var.canScrollVertically(1);
                }
                if (i10 == 0) {
                    z11 = false;
                }
                x9Var.M = z11;
                return;
            case 1:
            default:
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f7723c;
                hm hmVar = chatAttachAlertPhotoLayout.E;
                vi viVar = chatAttachAlertPhotoLayout.f27671b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = viVar.f29995d1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.f29999e2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (viVar.R0.getAlpha() * viVar.R0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var = (wl0) hmVar.K(0)) != null) {
                        View view = wl0Var.f44838a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            hmVar.v0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (i10 == 0 && this.f7722b) {
                    this.f7722b = false;
                    ((org.telegram.ui.Wallet.v4) this.f7723c).e();
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
        switch (this.f7721a) {
            case 0:
                x9 x9Var = (x9) this.f7723c;
                ea eaVar = x9Var.W;
                mm0 mm0Var = x9Var.f8097f;
                boolean canScrollVertically = mm0Var.canScrollVertically(1);
                if (canScrollVertically != this.f7722b) {
                    x9Var.f8099r.invalidate();
                    this.f7722b = canScrollVertically;
                }
                x9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) eaVar).containerView;
                viewGroup.invalidate();
                if (x9Var.f8094a == 6 && mm0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(mm0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.d7 d7Var = (org.telegram.ui.d7) this.f7723c;
                if (d7Var.f35165c.L0() <= 0 && !org.telegram.ui.d7.a0(d7Var).t()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.d7.b0(d7Var, z10);
                if (this.f7722b != d7Var.V.Z()) {
                    this.f7722b = d7Var.V.Z();
                    d7Var.V.invalidate();
                    return;
                }
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f7723c;
                vi viVar = chatAttachAlertPhotoLayout.f27671b;
                hm hmVar = chatAttachAlertPhotoLayout.E;
                if (hmVar.getChildCount() > 0) {
                    viVar.b2(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.f7722b;
                        boolean z12 = viVar.R;
                        if (z11 != z12) {
                            this.f7722b = z12;
                            ViewPropertyAnimator animate = hmVar.getFastScroll().animate();
                            if (this.f7722b) {
                                f7 = 1.0f;
                            }
                            yh.r(animate, f7, 100L);
                        }
                    } else {
                        hmVar.getFastScroll().setAlpha(0.0f);
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
                    this.f7722b = true;
                    return;
                }
                return;
        }
    }

    public r9(org.telegram.ui.Wallet.v4 v4Var) {
        this.f7721a = 3;
        this.f7723c = v4Var;
        this.f7722b = false;
    }
}
