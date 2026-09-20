package ci;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.rk;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vl0;
public final class v9 extends s4.s0 {
    public final int f5666a;
    public boolean f5667b;
    public final NotificationCenter.NotificationCenterDelegate f5668c;

    public v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5666a = i10;
        this.f5668c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        fl0 fl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f5666a) {
            case 0:
                ba baVar = (ba) this.f5668c;
                vl0 vl0Var = baVar.f4405f;
                ia iaVar = baVar.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardVisible;
                    if (z10 && baVar.f4410x != null) {
                        iaVar.f1();
                    }
                }
                if (i10 == 0) {
                    baVar.S = !vl0Var.canScrollVertically(-1);
                    vl0Var.canScrollVertically(1);
                }
                if (i10 == 0) {
                    z11 = false;
                }
                baVar.M = z11;
                return;
            case 1:
            default:
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5668c;
                tl tlVar = chatAttachAlertPhotoLayout.E;
                vi viVar = chatAttachAlertPhotoLayout.f26655b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.f29082a1;
                    if (v0Var != null) {
                        i11 = AndroidUtilities.dp(v0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.f29086b2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (viVar.O0.getAlpha() * viVar.O0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (fl0Var = (fl0) tlVar.L(0)) != null) {
                        View view = fl0Var.f42974a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            tlVar.w0(0, top2 - topScrollOffset2, null);
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
        switch (this.f5666a) {
            case 0:
                ba baVar = (ba) this.f5668c;
                ia iaVar = baVar.W;
                vl0 vl0Var = baVar.f4405f;
                boolean canScrollVertically = vl0Var.canScrollVertically(1);
                if (canScrollVertically != this.f5667b) {
                    baVar.f4407r.invalidate();
                    this.f5667b = canScrollVertically;
                }
                baVar.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) iaVar).containerView;
                viewGroup.invalidate();
                if (baVar.f4402a == 6 && vl0Var.getChildCount() > 0) {
                    int S = RecyclerView.S(vl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                    if (S >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.z6 z6Var = (org.telegram.ui.z6) this.f5668c;
                boolean z12 = false;
                if (!z6Var.f40109b.canScrollVertically(-1) && !org.telegram.ui.z6.i0(z6Var).s()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                le.b bVar = z6Var.Q;
                if (bVar != null) {
                    bVar.a(z10, true);
                }
                z6Var.z0();
                boolean z13 = this.f5667b;
                org.telegram.ui.h6 h6Var = z6Var.Z;
                org.telegram.ui.w6 w6Var = h6Var.f23847z0;
                if (w6Var != null && w6Var.isAttachedToWindow() && h6Var.f23847z0.getTop() <= h6Var.E0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z13 != z11) {
                    org.telegram.ui.h6 h6Var2 = z6Var.Z;
                    org.telegram.ui.w6 w6Var2 = h6Var2.f23847z0;
                    if (w6Var2 != null && w6Var2.isAttachedToWindow() && h6Var2.f23847z0.getTop() <= h6Var2.E0) {
                        z12 = true;
                    }
                    this.f5667b = z12;
                    z6Var.Z.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5668c;
                vi viVar = chatAttachAlertPhotoLayout.f26655b;
                tl tlVar = chatAttachAlertPhotoLayout.E;
                if (tlVar.getChildCount() > 0) {
                    viVar.X1(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z14 = this.f5667b;
                        boolean z15 = viVar.R;
                        if (z14 != z15) {
                            this.f5667b = z15;
                            ViewPropertyAnimator animate = tlVar.getFastScroll().animate();
                            if (this.f5667b) {
                                f7 = 1.0f;
                            }
                            rk.r(animate, f7, 100L);
                        }
                    } else {
                        tlVar.getFastScroll().setAlpha(0.0f);
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
