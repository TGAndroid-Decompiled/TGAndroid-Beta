package ci;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.am;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.mm;
import org.telegram.ui.Components.wm0;
public final class s9 extends s4.t0 {
    public final int f5957a;
    public boolean f5958b;
    public final Object f5959c;

    public s9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5957a = i10;
        this.f5959c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        gm0 gm0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f5957a) {
            case 0:
                y9 y9Var = (y9) this.f5959c;
                wm0 wm0Var = y9Var.f6362f;
                fa faVar = y9Var.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardVisible;
                    if (z10 && y9Var.f6367x != null) {
                        faVar.g1();
                    }
                }
                if (i10 == 0) {
                    y9Var.S = !wm0Var.canScrollVertically(-1);
                    wm0Var.canScrollVertically(1);
                }
                if (i10 == 0) {
                    z11 = false;
                }
                y9Var.M = z11;
                return;
            case 1:
            default:
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5959c;
                mm mmVar = chatAttachAlertPhotoLayout.E;
                aj ajVar = chatAttachAlertPhotoLayout.f30570b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = ajVar.f24331d1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = ajVar.getBackgroundPaddingTop();
                    if (((ajVar.f24336e2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (ajVar.R0.getAlpha() * ajVar.R0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (gm0Var = (gm0) mmVar.K(0)) != null) {
                        View view = gm0Var.f47897a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            mmVar.v0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (i10 == 0 && this.f5958b) {
                    this.f5958b = false;
                    ((org.telegram.ui.Wallet.x4) this.f5959c).e();
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
        switch (this.f5957a) {
            case 0:
                y9 y9Var = (y9) this.f5959c;
                fa faVar = y9Var.W;
                wm0 wm0Var = y9Var.f6362f;
                boolean canScrollVertically = wm0Var.canScrollVertically(1);
                if (canScrollVertically != this.f5958b) {
                    y9Var.f6364r.invalidate();
                    this.f5958b = canScrollVertically;
                }
                y9Var.f6361e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) faVar).containerView;
                viewGroup.invalidate();
                if (y9Var.f6358a == 6 && wm0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(wm0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.e3) faVar).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.b7 b7Var = (org.telegram.ui.b7) this.f5959c;
                if (b7Var.f36083c.L0() <= 0 && !org.telegram.ui.b7.a0(b7Var).u()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                org.telegram.ui.b7.b0(b7Var, z10);
                if (this.f5958b != b7Var.V.Z()) {
                    this.f5958b = b7Var.V.Z();
                    b7Var.V.invalidate();
                    return;
                }
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5959c;
                aj ajVar = chatAttachAlertPhotoLayout.f30570b;
                mm mmVar = chatAttachAlertPhotoLayout.E;
                if (mmVar.getChildCount() > 0) {
                    ajVar.b2(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z11 = this.f5958b;
                        boolean z12 = ajVar.R;
                        if (z11 != z12) {
                            this.f5958b = z12;
                            ViewPropertyAnimator animate = mmVar.getFastScroll().animate();
                            if (this.f5958b) {
                                f7 = 1.0f;
                            }
                            am.s(animate, f7, 100L);
                        }
                    } else {
                        mmVar.getFastScroll().setAlpha(0.0f);
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
                    this.f5958b = true;
                    return;
                }
                return;
        }
    }

    public s9(org.telegram.ui.Wallet.x4 x4Var) {
        this.f5957a = 3;
        this.f5959c = x4Var;
        this.f5958b = false;
    }
}
