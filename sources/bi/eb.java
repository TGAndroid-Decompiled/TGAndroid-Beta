package bi;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yl;
public final class eb extends s4.s0 {
    public final int f2670a;
    public boolean f2671b;
    public final NotificationCenter.NotificationCenterDelegate f2672c;

    public eb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f2670a = i10;
        this.f2672c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        fl0 fl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f2670a) {
            case 0:
                kb kbVar = (kb) this.f2672c;
                vl0 vl0Var = kbVar.f3009f;
                rb rbVar = kbVar.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
                    if (z10 && kbVar.f3014x != null) {
                        rbVar.f1();
                    }
                }
                if (i10 == 0) {
                    kbVar.S = !vl0Var.canScrollVertically(-1);
                    vl0Var.canScrollVertically(1);
                }
                if (i10 == 0) {
                    z11 = false;
                }
                kbVar.M = z11;
                return;
            case 1:
            default:
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f2672c;
                yl ylVar = chatAttachAlertPhotoLayout.E;
                yi yiVar = chatAttachAlertPhotoLayout.f26422b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = yiVar.f29350a1;
                    if (w0Var != null) {
                        i11 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = yiVar.getBackgroundPaddingTop();
                    if (((yiVar.f29354b2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (yiVar.O0.getAlpha() * yiVar.O0.getMeasuredHeight()) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (fl0Var = (fl0) ylVar.K(0)) != null) {
                        View view = fl0Var.f41610a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            ylVar.v0(0, top2 - topScrollOffset2, null);
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
        switch (this.f2670a) {
            case 0:
                kb kbVar = (kb) this.f2672c;
                rb rbVar = kbVar.W;
                vl0 vl0Var = kbVar.f3009f;
                boolean canScrollVertically = vl0Var.canScrollVertically(1);
                if (canScrollVertically != this.f2671b) {
                    kbVar.f3011r.invalidate();
                    this.f2671b = canScrollVertically;
                }
                kbVar.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.h3) rbVar).containerView;
                viewGroup.invalidate();
                if (kbVar.f3006a == 6 && vl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(vl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.y6 y6Var = (org.telegram.ui.y6) this.f2672c;
                if (y6Var.f38911c.L0() <= 0 && !org.telegram.ui.y6.a0(y6Var).s()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.y6.b0(y6Var, z10);
                if (this.f2671b != y6Var.V.Z()) {
                    this.f2671b = y6Var.V.Z();
                    y6Var.V.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f2672c;
                yi yiVar = chatAttachAlertPhotoLayout.f26422b;
                yl ylVar = chatAttachAlertPhotoLayout.E;
                if (ylVar.getChildCount() > 0) {
                    yiVar.X1(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.f2671b;
                        boolean z12 = yiVar.R;
                        if (z11 != z12) {
                            this.f2671b = z12;
                            ViewPropertyAnimator animate = ylVar.getFastScroll().animate();
                            if (this.f2671b) {
                                f7 = 1.0f;
                            }
                            animate.alpha(f7).setDuration(100L).start();
                        }
                    } else {
                        ylVar.getFastScroll().setAlpha(0.0f);
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
