package ei;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.lk;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.ti;
public final class e9 extends s4.r0 {
    public final int f8972a;
    public boolean f8973b;
    public final Object f8974c;

    public e9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f8972a = i10;
        this.f8974c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        sl0 sl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f8972a) {
            case 0:
                k9 k9Var = (k9) this.f8974c;
                im0 im0Var = k9Var.f9329f;
                r9 r9Var = k9Var.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                    if (z10 && k9Var.f9334x != null) {
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f8974c;
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
                        View view = sl0Var.f45910a;
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
                if (i10 == 0 && this.f8973b) {
                    this.f8973b = false;
                    ((org.telegram.ui.Wallet.j5) this.f8974c).f();
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
        switch (this.f8972a) {
            case 0:
                k9 k9Var = (k9) this.f8974c;
                r9 r9Var = k9Var.W;
                im0 im0Var = k9Var.f9329f;
                boolean canScrollVertically = im0Var.canScrollVertically(1);
                if (canScrollVertically != this.f8973b) {
                    k9Var.f9331r.invalidate();
                    this.f8973b = canScrollVertically;
                }
                k9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) r9Var).containerView;
                viewGroup.invalidate();
                if (k9Var.f9326a == 6 && im0Var.getChildCount() > 0) {
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
                org.telegram.ui.c7 c7Var = (org.telegram.ui.c7) this.f8974c;
                if (c7Var.f35811c.L0() <= 0 && !org.telegram.ui.c7.a0(c7Var).s()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.c7.b0(c7Var, z10);
                if (this.f8973b != c7Var.V.Z()) {
                    this.f8973b = c7Var.V.Z();
                    c7Var.V.invalidate();
                    return;
                }
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f8974c;
                ti tiVar = chatAttachAlertPhotoLayout.f28238b;
                em emVar = chatAttachAlertPhotoLayout.E;
                if (emVar.getChildCount() > 0) {
                    tiVar.b2(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.f8973b;
                        boolean z12 = tiVar.R;
                        if (z11 != z12) {
                            this.f8973b = z12;
                            ViewPropertyAnimator animate = emVar.getFastScroll().animate();
                            if (this.f8973b) {
                                f7 = 1.0f;
                            }
                            lk.s(animate, f7, 100L);
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
                    this.f8973b = true;
                    return;
                }
                return;
        }
    }

    public e9(org.telegram.ui.Wallet.j5 j5Var) {
        this.f8972a = 3;
        this.f8974c = j5Var;
        this.f8973b = false;
    }
}
