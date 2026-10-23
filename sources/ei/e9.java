package ei;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.sl;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wl0;
public final class e9 extends s4.r0 {
    public final int f8982a;
    public boolean f8983b;
    public final Object f8984c;

    public e9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f8982a = i10;
        this.f8984c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        wl0 wl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f8982a) {
            case 0:
                k9 k9Var = (k9) this.f8984c;
                mm0 mm0Var = k9Var.f9339f;
                r9 r9Var = k9Var.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.h3) r9Var).keyboardVisible;
                    if (z10 && k9Var.f9344x != null) {
                        r9Var.g1();
                    }
                }
                if (i10 == 0) {
                    k9Var.S = !mm0Var.canScrollVertically(-1);
                    mm0Var.canScrollVertically(1);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f8984c;
                em emVar = chatAttachAlertPhotoLayout.E;
                ti tiVar = chatAttachAlertPhotoLayout.f28366b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30724d1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
                    if (((tiVar.f30728e2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (tiVar.R0.getAlpha() * tiVar.R0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var = (wl0) emVar.K(0)) != null) {
                        View view = wl0Var.f46343a;
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
                if (i10 == 0 && this.f8983b) {
                    this.f8983b = false;
                    ((org.telegram.ui.Wallet.k5) this.f8984c).f();
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
        switch (this.f8982a) {
            case 0:
                k9 k9Var = (k9) this.f8984c;
                r9 r9Var = k9Var.W;
                mm0 mm0Var = k9Var.f9339f;
                boolean canScrollVertically = mm0Var.canScrollVertically(1);
                if (canScrollVertically != this.f8983b) {
                    k9Var.f9341r.invalidate();
                    this.f8983b = canScrollVertically;
                }
                k9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.h3) r9Var).containerView;
                viewGroup.invalidate();
                if (k9Var.f9336a == 6 && mm0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(mm0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.h3) r9Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.h3) r9Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.c7 c7Var = (org.telegram.ui.c7) this.f8984c;
                if (c7Var.f36259c.L0() <= 0 && !org.telegram.ui.c7.a0(c7Var).s()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.c7.b0(c7Var, z10);
                if (this.f8983b != c7Var.V.Y()) {
                    this.f8983b = c7Var.V.Y();
                    c7Var.V.invalidate();
                    return;
                }
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f8984c;
                ti tiVar = chatAttachAlertPhotoLayout.f28366b;
                em emVar = chatAttachAlertPhotoLayout.E;
                if (emVar.getChildCount() > 0) {
                    tiVar.f2(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.f8983b;
                        boolean z12 = tiVar.R;
                        if (z11 != z12) {
                            this.f8983b = z12;
                            ViewPropertyAnimator animate = emVar.getFastScroll().animate();
                            if (this.f8983b) {
                                f7 = 1.0f;
                            }
                            sl.s(animate, f7, 100L);
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
                    this.f8983b = true;
                    return;
                }
                return;
        }
    }

    public e9(org.telegram.ui.Wallet.k5 k5Var) {
        this.f8982a = 3;
        this.f8984c = k5Var;
        this.f8983b = false;
    }
}
