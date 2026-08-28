package kh;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.wk0;
public final class g9 extends f2.d1 {
    public final int f15320a;
    public boolean f15321b;
    public final NotificationCenter.NotificationCenterDelegate f15322c;

    public g9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.f15320a = i9;
        this.f15322c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i9) {
        boolean z10;
        int i10;
        ik0 ik0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f15320a) {
            case 0:
                n9 n9Var = (n9) this.f15322c;
                wk0 wk0Var = n9Var.f15771f;
                t9 t9Var = n9Var.S;
                boolean z11 = true;
                if (i9 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                    if (z10 && n9Var.f15776x != null) {
                        t9Var.f1();
                    }
                }
                if (i9 == 0) {
                    n9Var.O = !wk0Var.canScrollVertically(-1);
                    wk0Var.canScrollVertically(1);
                }
                if (i9 == 0) {
                    z11 = false;
                }
                n9Var.I = z11;
                return;
            case 1:
            default:
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f15322c;
                kl klVar = chatAttachAlertPhotoLayout.A;
                ki kiVar = chatAttachAlertPhotoLayout.f27493b;
                if (i9 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = kiVar.W0;
                    if (w0Var != null) {
                        i10 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i11 = dp + i10;
                    int backgroundPaddingTop = kiVar.getBackgroundPaddingTop();
                    if (((kiVar.X1[0] - backgroundPaddingTop) - i11) + backgroundPaddingTop < (kiVar.K0.getAlpha() * kiVar.K0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (ik0Var = (ik0) klVar.K(0)) != null) {
                        View view = ik0Var.f5501a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            klVar.v0(0, top2 - topScrollOffset2, null);
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
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ViewGroup viewGroup;
        int i11;
        int i12;
        boolean z10;
        switch (this.f15320a) {
            case 0:
                n9 n9Var = (n9) this.f15322c;
                t9 t9Var = n9Var.S;
                wk0 wk0Var = n9Var.f15771f;
                boolean canScrollVertically = wk0Var.canScrollVertically(1);
                if (canScrollVertically != this.f15321b) {
                    n9Var.f15773r.invalidate();
                    this.f15321b = canScrollVertically;
                }
                n9Var.f15770e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) t9Var).containerView;
                viewGroup.invalidate();
                if (n9Var.f15767a == 6 && wk0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(wk0Var.getChildAt(0));
                    i11 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                    if (R >= MessagesController.getInstance(i11).getStoriesController().L.size()) {
                        i12 = ((org.telegram.ui.ActionBar.f3) t9Var).currentAccount;
                        MessagesController.getInstance(i12).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.y6 y6Var = (org.telegram.ui.y6) this.f15322c;
                if (y6Var.f44740c.L0() <= 0 && !org.telegram.ui.y6.Z(y6Var).s()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.y6.a0(y6Var, z10);
                if (this.f15321b != y6Var.R.Z()) {
                    this.f15321b = y6Var.R.Z();
                    y6Var.R.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f15322c;
                ki kiVar = chatAttachAlertPhotoLayout.f27493b;
                kl klVar = chatAttachAlertPhotoLayout.A;
                if (klVar.getChildCount() > 0) {
                    kiVar.X1(chatAttachAlertPhotoLayout, i10);
                    float f10 = 0.0f;
                    if (chatAttachAlertPhotoLayout.C.h() > 30) {
                        boolean z11 = this.f15321b;
                        boolean z12 = kiVar.N;
                        if (z11 != z12) {
                            this.f15321b = z12;
                            ViewPropertyAnimator animate = klVar.getFastScroll().animate();
                            if (this.f15321b) {
                                f10 = 1.0f;
                            }
                            animate.alpha(f10).setDuration(100L).start();
                        }
                    } else {
                        klVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i10 != 0) {
                        chatAttachAlertPhotoLayout.U();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
