package ei;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.ti;
public final class e9 extends s4.r0 {
    public final int f8973a;
    public boolean f8974b;
    public final Object f8975c;

    public e9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f8973a = i10;
        this.f8975c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        sl0 sl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f8973a) {
            case 0:
                k9 k9Var = (k9) this.f8975c;
                im0 im0Var = k9Var.f9330f;
                r9 r9Var = k9Var.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                    if (z10 && k9Var.f9335x != null) {
                        r9Var.g1();
                    }
                }
                if (i10 == 0) {
                    k9Var.S = !im0Var.canScrollVertically(-1);
                    im0Var.canScrollVertically(1);
                }
                if (i10 == 0) {
                    z11 = false;
                }
                k9Var.M = z11;
                return;
            case 1:
            default:
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f8975c;
                em emVar = chatAttachAlertPhotoLayout.E;
                ti tiVar = chatAttachAlertPhotoLayout.f28238b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30568d1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
                    if (((tiVar.f30572e2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (tiVar.R0.getAlpha() * tiVar.R0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (sl0Var = (sl0) emVar.K(0)) != null) {
                        View view = sl0Var.f45938a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            emVar.v0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (i10 == 0 && this.f8974b) {
                    this.f8974b = false;
                    ((org.telegram.ui.Wallet.h5) this.f8975c).f();
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
        switch (this.f8973a) {
            case 0:
                k9 k9Var = (k9) this.f8975c;
                r9 r9Var = k9Var.W;
                im0 im0Var = k9Var.f9330f;
                boolean canScrollVertically = im0Var.canScrollVertically(1);
                if (canScrollVertically != this.f8974b) {
                    k9Var.f9332r.invalidate();
                    this.f8974b = canScrollVertically;
                }
                k9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) r9Var).containerView;
                viewGroup.invalidate();
                if (k9Var.f9327a == 6 && im0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(im0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.c7 c7Var = (org.telegram.ui.c7) this.f8975c;
                if (c7Var.f35844c.L0() <= 0 && !org.telegram.ui.c7.a0(c7Var).s()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.c7.b0(c7Var, z10);
                if (this.f8974b != c7Var.V.Z()) {
                    this.f8974b = c7Var.V.Z();
                    c7Var.V.invalidate();
                    return;
                }
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f8975c;
                ti tiVar = chatAttachAlertPhotoLayout.f28238b;
                em emVar = chatAttachAlertPhotoLayout.E;
                if (emVar.getChildCount() > 0) {
                    tiVar.b2(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.f8974b;
                        boolean z12 = tiVar.R;
                        if (z11 != z12) {
                            this.f8974b = z12;
                            ViewPropertyAnimator animate = emVar.getFastScroll().animate();
                            if (this.f8974b) {
                                f7 = 1.0f;
                            }
                            wh.s(animate, f7, 100L);
                        }
                    } else {
                        emVar.getFastScroll().setAlpha(0.0f);
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
                    this.f8974b = true;
                    return;
                }
                return;
        }
    }

    public e9(org.telegram.ui.Wallet.h5 h5Var) {
        this.f8973a = 3;
        this.f8975c = h5Var;
        this.f8974b = false;
    }
}
