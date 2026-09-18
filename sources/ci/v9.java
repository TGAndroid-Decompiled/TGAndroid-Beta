package ci;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wk0;
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
        wk0 wk0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f5665a) {
            case 0:
                ba baVar = (ba) this.f5667c;
                ml0 ml0Var = baVar.f4404f;
                ia iaVar = baVar.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.g3) iaVar).keyboardVisible;
                    if (z10 && baVar.f4409x != null) {
                        iaVar.f1();
                    }
                }
                if (i10 == 0) {
                    baVar.S = !ml0Var.canScrollVertically(-1);
                    ml0Var.canScrollVertically(1);
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
                vi viVar = chatAttachAlertPhotoLayout.f26463b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = viVar.f28729a1;
                    if (w0Var != null) {
                        i11 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.f28733b2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (viVar.O0.getAlpha() * viVar.O0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wk0Var = (wk0) tlVar.L(0)) != null) {
                        View view = wk0Var.f42702a;
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
                ml0 ml0Var = baVar.f4404f;
                boolean canScrollVertically = ml0Var.canScrollVertically(1);
                if (canScrollVertically != this.f5666b) {
                    baVar.f4406r.invalidate();
                    this.f5666b = canScrollVertically;
                }
                baVar.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.g3) iaVar).containerView;
                viewGroup.invalidate();
                if (baVar.f4401a == 6 && ml0Var.getChildCount() > 0) {
                    int S = RecyclerView.S(ml0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.g3) iaVar).currentAccount;
                    if (S >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.g3) iaVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.a7 a7Var = (org.telegram.ui.a7) this.f5667c;
                boolean z12 = false;
                if (!a7Var.f31738b.canScrollVertically(-1) && !org.telegram.ui.a7.i0(a7Var).s()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                le.b bVar = a7Var.Q;
                if (bVar != null) {
                    bVar.a(z10, true);
                }
                a7Var.z0();
                boolean z13 = this.f5666b;
                org.telegram.ui.i6 i6Var = a7Var.Z;
                org.telegram.ui.x6 x6Var = i6Var.f29666z0;
                if (x6Var != null && x6Var.isAttachedToWindow() && i6Var.f29666z0.getTop() <= i6Var.E0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z13 != z11) {
                    org.telegram.ui.i6 i6Var2 = a7Var.Z;
                    org.telegram.ui.x6 x6Var2 = i6Var2.f29666z0;
                    if (x6Var2 != null && x6Var2.isAttachedToWindow() && i6Var2.f29666z0.getTop() <= i6Var2.E0) {
                        z12 = true;
                    }
                    this.f5666b = z12;
                    a7Var.Z.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5667c;
                vi viVar = chatAttachAlertPhotoLayout.f26463b;
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
                            animate.alpha(f7).setDuration(100L).start();
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
