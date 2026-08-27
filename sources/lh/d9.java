package lh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.zk0;

public final class d9 extends f2.b1 {

    public final int f15873a;

    public boolean f15874b;

    public final NotificationCenter.NotificationCenterDelegate f15875c;

    public d9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f15873a = i10;
        this.f15875c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        lk0 lk0Var;
        switch (this.f15873a) {
            case 0:
                k9 k9Var = (k9) this.f15875c;
                zk0 zk0Var = k9Var.f16253f;
                q9 q9Var = k9Var.S;
                if (i10 == 1 && ((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible && k9Var.f16258x != null) {
                    q9Var.f1();
                }
                if (i10 == 0) {
                    k9Var.O = !zk0Var.canScrollVertically(-1);
                    zk0Var.canScrollVertically(1);
                }
                k9Var.I = i10 != 0;
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f15875c;
                gl glVar = chatAttachAlertPhotoLayout.A;
                gi giVar = chatAttachAlertPhotoLayout.f34900b;
                if (i10 == 0) {
                    int iDp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = giVar.W0;
                    int iDp2 = iDp + (v0Var != null ? AndroidUtilities.dp(v0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = giVar.getBackgroundPaddingTop();
                    if (((giVar.X1[0] - backgroundPaddingTop) - iDp2) + backgroundPaddingTop < (giVar.K0.getAlpha() * giVar.K0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (lk0Var = (lk0) glVar.K(0)) != null) {
                        View view = lk0Var.f5789a;
                        if (view.getTop() > chatAttachAlertPhotoLayout.getTopScrollOffset()) {
                            glVar.v0(0, view.getTop() - chatAttachAlertPhotoLayout.getTopScrollOffset(), null);
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f15873a) {
            case 0:
                k9 k9Var = (k9) this.f15875c;
                q9 q9Var = k9Var.S;
                zk0 zk0Var = k9Var.f16253f;
                boolean zCanScrollVertically = zk0Var.canScrollVertically(1);
                if (zCanScrollVertically != this.f15874b) {
                    k9Var.f16255r.invalidate();
                    this.f15874b = zCanScrollVertically;
                }
                k9Var.f16252e.invalidate();
                ((org.telegram.ui.ActionBar.e3) q9Var).containerView.invalidate();
                if (k9Var.f16249a == 6 && zk0Var.getChildCount() > 0 && RecyclerView.R(zk0Var.getChildAt(0)) >= MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getStoriesController().L.size()) {
                    MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getStoriesController().P();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.z6 z6Var = (org.telegram.ui.z6) this.f15875c;
                org.telegram.ui.z6.b0(z6Var, z6Var.f45041c.L0() > 0 || ((org.telegram.ui.ActionBar.n2) z6Var).actionBar.t());
                if (this.f15874b != z6Var.R.Z()) {
                    this.f15874b = z6Var.R.Z();
                    z6Var.R.invalidate();
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f15875c;
                gi giVar = chatAttachAlertPhotoLayout.f34900b;
                gl glVar = chatAttachAlertPhotoLayout.A;
                if (glVar.getChildCount() > 0) {
                    giVar.X1(chatAttachAlertPhotoLayout, i11);
                    if (chatAttachAlertPhotoLayout.C.h() > 30) {
                        boolean z10 = this.f15874b;
                        boolean z11 = giVar.N;
                        if (z10 != z11) {
                            this.f15874b = z11;
                            glVar.getFastScroll().animate().alpha(this.f15874b ? 1.0f : 0.0f).setDuration(100L).start();
                        }
                    } else {
                        glVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i11 != 0) {
                        chatAttachAlertPhotoLayout.V();
                    }
                    break;
                }
                break;
        }
    }
}
