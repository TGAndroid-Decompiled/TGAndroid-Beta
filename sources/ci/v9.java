package ci;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wl0;
public final class v9 extends s4.s0 {
    public final int f5665a;
    public boolean f5666b;
    public final NotificationCenter.NotificationCenterDelegate f5667c;

    public v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5665a = i10;
        this.f5667c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        gl0 gl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f5665a) {
            case 0:
                ba baVar = (ba) this.f5667c;
                wl0 wl0Var = baVar.f4404f;
                ia iaVar = baVar.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardVisible;
                    if (z10 && baVar.f4409x != null) {
                        iaVar.f1();
                    }
                }
                if (i10 == 0) {
                    baVar.S = !wl0Var.canScrollVertically(-1);
                    wl0Var.canScrollVertically(1);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5667c;
                tl tlVar = chatAttachAlertPhotoLayout.E;
                vi viVar = chatAttachAlertPhotoLayout.f26688b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.f29005a1;
                    if (v0Var != null) {
                        i11 = AndroidUtilities.dp(v0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.f29009b2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (viVar.O0.getAlpha() * viVar.O0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (gl0Var = (gl0) tlVar.L(0)) != null) {
                        View view = gl0Var.f42929a;
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
        switch (this.f5665a) {
            case 0:
                ba baVar = (ba) this.f5667c;
                ia iaVar = baVar.W;
                wl0 wl0Var = baVar.f4404f;
                boolean canScrollVertically = wl0Var.canScrollVertically(1);
                if (canScrollVertically != this.f5666b) {
                    baVar.f4406r.invalidate();
                    this.f5666b = canScrollVertically;
                }
                baVar.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) iaVar).containerView;
                viewGroup.invalidate();
                if (baVar.f4401a == 6 && wl0Var.getChildCount() > 0) {
                    int S = RecyclerView.S(wl0Var.getChildAt(0));
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
                org.telegram.ui.z6 z6Var = (org.telegram.ui.z6) this.f5667c;
                boolean z12 = false;
                if (!z6Var.f39984b.canScrollVertically(-1) && !org.telegram.ui.z6.i0(z6Var).s()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                le.b bVar = z6Var.Q;
                if (bVar != null) {
                    bVar.a(z10, true);
                }
                z6Var.z0();
                boolean z13 = this.f5666b;
                org.telegram.ui.h6 h6Var = z6Var.Z;
                org.telegram.ui.w6 w6Var = h6Var.f24157z0;
                if (w6Var != null && w6Var.isAttachedToWindow() && h6Var.f24157z0.getTop() <= h6Var.E0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z13 != z11) {
                    org.telegram.ui.h6 h6Var2 = z6Var.Z;
                    org.telegram.ui.w6 w6Var2 = h6Var2.f24157z0;
                    if (w6Var2 != null && w6Var2.isAttachedToWindow() && h6Var2.f24157z0.getTop() <= h6Var2.E0) {
                        z12 = true;
                    }
                    this.f5666b = z12;
                    z6Var.Z.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5667c;
                vi viVar = chatAttachAlertPhotoLayout.f26688b;
                tl tlVar = chatAttachAlertPhotoLayout.E;
                if (tlVar.getChildCount() > 0) {
                    viVar.X1(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z14 = this.f5666b;
                        boolean z15 = viVar.R;
                        if (z14 != z15) {
                            this.f5666b = z15;
                            ViewPropertyAnimator animate = tlVar.getFastScroll().animate();
                            if (this.f5666b) {
                                f7 = 1.0f;
                            }
                            wh.q(animate, f7, 100L);
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
