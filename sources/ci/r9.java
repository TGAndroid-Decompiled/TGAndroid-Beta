package ci;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.qk;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.vl;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yl0;
public final class r9 extends s4.s0 {
    public final int f5458a;
    public boolean f5459b;
    public final NotificationCenter.NotificationCenterDelegate f5460c;

    public r9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5458a = i10;
        this.f5460c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        il0 il0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f5458a) {
            case 0:
                x9 x9Var = (x9) this.f5460c;
                yl0 yl0Var = x9Var.f5853f;
                ea eaVar = x9Var.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.g3) eaVar).keyboardVisible;
                    if (z10 && x9Var.f5858x != null) {
                        eaVar.f1();
                    }
                }
                if (i10 == 0) {
                    x9Var.S = !yl0Var.canScrollVertically(-1);
                    yl0Var.canScrollVertically(1);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5460c;
                vl vlVar = chatAttachAlertPhotoLayout.E;
                wi wiVar = chatAttachAlertPhotoLayout.f27104b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = wiVar.f29946a1;
                    if (w0Var != null) {
                        i11 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = wiVar.getBackgroundPaddingTop();
                    if (((wiVar.f29950b2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (wiVar.O0.getAlpha() * wiVar.O0.getMeasuredHeight()) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (il0Var = (il0) vlVar.L(0)) != null) {
                        View view = il0Var.f43005a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            vlVar.w0(0, top2 - topScrollOffset2, null);
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
        boolean z11;
        switch (this.f5458a) {
            case 0:
                x9 x9Var = (x9) this.f5460c;
                ea eaVar = x9Var.W;
                yl0 yl0Var = x9Var.f5853f;
                boolean canScrollVertically = yl0Var.canScrollVertically(1);
                if (canScrollVertically != this.f5459b) {
                    x9Var.f5855r.invalidate();
                    this.f5459b = canScrollVertically;
                }
                x9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.g3) eaVar).containerView;
                viewGroup.invalidate();
                if (x9Var.f5850a == 6 && yl0Var.getChildCount() > 0) {
                    int S = RecyclerView.S(yl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.g3) eaVar).currentAccount;
                    if (S >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.g3) eaVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.b7 b7Var = (org.telegram.ui.b7) this.f5460c;
                boolean z12 = false;
                if (!b7Var.f32257b.canScrollVertically(-1) && !org.telegram.ui.b7.i0(b7Var).t()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                le.c cVar = b7Var.Q;
                if (cVar != null) {
                    cVar.a(z10, true);
                }
                b7Var.z0();
                boolean z13 = this.f5459b;
                org.telegram.ui.j6 j6Var = b7Var.Z;
                org.telegram.ui.y6 y6Var = j6Var.f25131z0;
                if (y6Var != null && y6Var.isAttachedToWindow() && j6Var.f25131z0.getTop() <= j6Var.E0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z13 != z11) {
                    org.telegram.ui.j6 j6Var2 = b7Var.Z;
                    org.telegram.ui.y6 y6Var2 = j6Var2.f25131z0;
                    if (y6Var2 != null && y6Var2.isAttachedToWindow() && j6Var2.f25131z0.getTop() <= j6Var2.E0) {
                        z12 = true;
                    }
                    this.f5459b = z12;
                    b7Var.Z.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5460c;
                wi wiVar = chatAttachAlertPhotoLayout.f27104b;
                vl vlVar = chatAttachAlertPhotoLayout.E;
                if (vlVar.getChildCount() > 0) {
                    wiVar.U1(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z14 = this.f5459b;
                        boolean z15 = wiVar.R;
                        if (z14 != z15) {
                            this.f5459b = z15;
                            ViewPropertyAnimator animate = vlVar.getFastScroll().animate();
                            if (this.f5459b) {
                                f7 = 1.0f;
                            }
                            qk.r(animate, f7, 100L);
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
