package ci;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.wl;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.zl0;
public final class r9 extends s4.s0 {
    public final int f5872a;
    public boolean f5873b;
    public final FrameLayout f5874c;

    public r9(int i10, FrameLayout frameLayout) {
        this.f5872a = i10;
        this.f5874c = frameLayout;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        il0 il0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f5872a) {
            case 0:
                x9 x9Var = (x9) this.f5874c;
                zl0 zl0Var = x9Var.f6307f;
                ea eaVar = x9Var.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
                    if (z10 && x9Var.f6312x != null) {
                        eaVar.f1();
                    }
                }
                if (i10 == 0) {
                    x9Var.S = !zl0Var.canScrollVertically(-1);
                    zl0Var.canScrollVertically(1);
                }
                if (i10 == 0) {
                    z11 = false;
                }
                x9Var.M = z11;
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5874c;
                wl wlVar = chatAttachAlertPhotoLayout.E;
                xi xiVar = chatAttachAlertPhotoLayout.f29741b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = xiVar.f32893a1;
                    if (v0Var != null) {
                        i11 = AndroidUtilities.dp(v0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = xiVar.getBackgroundPaddingTop();
                    if (((xiVar.f32897b2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (xiVar.O0.getAlpha() * xiVar.O0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var = (il0) wlVar.K(0)) != null) {
                        View view = il0Var.f46538a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            wlVar.w0(0, top2 - topScrollOffset2, null);
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
        switch (this.f5872a) {
            case 0:
                x9 x9Var = (x9) this.f5874c;
                ea eaVar = x9Var.W;
                zl0 zl0Var = x9Var.f6307f;
                boolean canScrollVertically = zl0Var.canScrollVertically(1);
                if (canScrollVertically != this.f5873b) {
                    x9Var.f6309r.invalidate();
                    this.f5873b = canScrollVertically;
                }
                x9Var.f6306e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) eaVar).containerView;
                viewGroup.invalidate();
                if (x9Var.f6303a == 6 && zl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(zl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.f3) eaVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5874c;
                xi xiVar = chatAttachAlertPhotoLayout.f29741b;
                wl wlVar = chatAttachAlertPhotoLayout.E;
                if (wlVar.getChildCount() > 0) {
                    xiVar.W1(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z10 = this.f5873b;
                        boolean z11 = xiVar.R;
                        if (z10 != z11) {
                            this.f5873b = z11;
                            ViewPropertyAnimator animate = wlVar.getFastScroll().animate();
                            if (this.f5873b) {
                                f7 = 1.0f;
                            }
                            bi.q(animate, f7, 100L);
                        }
                    } else {
                        wlVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i11 != 0) {
                        chatAttachAlertPhotoLayout.T();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
