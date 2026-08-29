package nh;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ol;
import org.telegram.ui.Components.vk0;
public final class s8 extends f2.a1 {
    public final int f18552a;
    public boolean f18553b;
    public final NotificationCenter.NotificationCenterDelegate f18554c;

    public s8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f18552a = i10;
        this.f18554c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        vk0 vk0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f18552a) {
            case 0:
                y8 y8Var = (y8) this.f18554c;
                jl0 jl0Var = y8Var.f18905f;
                e9 e9Var = y8Var.S;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                    if (z10 && y8Var.f18910x != null) {
                        e9Var.f1();
                    }
                }
                if (i10 == 0) {
                    y8Var.O = !jl0Var.canScrollVertically(-1);
                    jl0Var.canScrollVertically(1);
                }
                if (i10 == 0) {
                    z11 = false;
                }
                y8Var.I = z11;
                return;
            case 1:
            default:
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f18554c;
                ol olVar = chatAttachAlertPhotoLayout.A;
                ni niVar = chatAttachAlertPhotoLayout.f28403b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = niVar.W0;
                    if (w0Var != null) {
                        i11 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = niVar.getBackgroundPaddingTop();
                    if (((niVar.X1[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (niVar.K0.getAlpha() * niVar.K0.getMeasuredHeight()) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (vk0Var = (vk0) olVar.K(0)) != null) {
                        View view = vk0Var.f6432a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            olVar.v0(0, top2 - topScrollOffset2, null);
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
        switch (this.f18552a) {
            case 0:
                y8 y8Var = (y8) this.f18554c;
                e9 e9Var = y8Var.S;
                jl0 jl0Var = y8Var.f18905f;
                boolean canScrollVertically = jl0Var.canScrollVertically(1);
                if (canScrollVertically != this.f18553b) {
                    y8Var.f18907r.invalidate();
                    this.f18553b = canScrollVertically;
                }
                y8Var.f18904e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) e9Var).containerView;
                viewGroup.invalidate();
                if (y8Var.f18901a == 6 && jl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(jl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.x6 x6Var = (org.telegram.ui.x6) this.f18554c;
                if (x6Var.f44487c.L0() <= 0 && !org.telegram.ui.x6.a0(x6Var).s()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.x6.b0(x6Var, z10);
                if (this.f18553b != x6Var.R.Z()) {
                    this.f18553b = x6Var.R.Z();
                    x6Var.R.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f18554c;
                ni niVar = chatAttachAlertPhotoLayout.f28403b;
                ol olVar = chatAttachAlertPhotoLayout.A;
                if (olVar.getChildCount() > 0) {
                    niVar.X1(chatAttachAlertPhotoLayout, i11);
                    float f9 = 0.0f;
                    if (chatAttachAlertPhotoLayout.C.h() > 30) {
                        boolean z11 = this.f18553b;
                        boolean z12 = niVar.N;
                        if (z11 != z12) {
                            this.f18553b = z12;
                            ViewPropertyAnimator animate = olVar.getFastScroll().animate();
                            if (this.f18553b) {
                                f9 = 1.0f;
                            }
                            animate.alpha(f9).setDuration(100L).start();
                        }
                    } else {
                        olVar.getFastScroll().setAlpha(0.0f);
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
