package fi;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vl0;
public final class a9 extends s4.u0 {
    public final int f10514a;
    public boolean f10515b;
    public final Object f10516c;

    public a9(int i10, FrameLayout frameLayout) {
        this.f10514a = i10;
        this.f10516c = frameLayout;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        vl0 vl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        switch (this.f10514a) {
            case 0:
                g9 g9Var = (g9) this.f10516c;
                mm0 mm0Var = g9Var.f10923f;
                n9 n9Var = g9Var.W;
                boolean z11 = true;
                if (i10 == 1) {
                    z10 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
                    if (z10 && g9Var.f10928x != null) {
                        n9Var.g1();
                    }
                }
                if (i10 == 0) {
                    g9Var.S = !mm0Var.canScrollVertically(-1);
                    mm0Var.canScrollVertically(1);
                }
                if (i10 == 0) {
                    z11 = false;
                }
                g9Var.M = z11;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f10516c;
                fm fmVar = chatAttachAlertPhotoLayout.E;
                ti tiVar = chatAttachAlertPhotoLayout.f30215b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = tiVar.f33015d1;
                    if (w0Var != null) {
                        i11 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
                    if (((tiVar.f33019e2[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (tiVar.R0.getAlpha() * tiVar.R0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vl0Var = (vl0) fmVar.K(0)) != null) {
                        View view = vl0Var.f47738a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            fmVar.w0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i10 == 0 && this.f10515b) {
                    this.f10515b = false;
                    ((org.telegram.ui.Wallet.i5) this.f10516c).f();
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
        switch (this.f10514a) {
            case 0:
                g9 g9Var = (g9) this.f10516c;
                n9 n9Var = g9Var.W;
                mm0 mm0Var = g9Var.f10923f;
                boolean canScrollVertically = mm0Var.canScrollVertically(1);
                if (canScrollVertically != this.f10515b) {
                    g9Var.f10925r.invalidate();
                    this.f10515b = canScrollVertically;
                }
                g9Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.k3) n9Var).containerView;
                viewGroup.invalidate();
                if (g9Var.f10920a == 6 && mm0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(mm0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f10516c;
                ti tiVar = chatAttachAlertPhotoLayout.f30215b;
                fm fmVar = chatAttachAlertPhotoLayout.E;
                if (fmVar.getChildCount() > 0) {
                    tiVar.e2(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.h() > 30) {
                        boolean z10 = this.f10515b;
                        boolean z11 = tiVar.R;
                        if (z10 != z11) {
                            this.f10515b = z11;
                            ViewPropertyAnimator animate = fmVar.getFastScroll().animate();
                            if (this.f10515b) {
                                f7 = 1.0f;
                            }
                            vh.p(animate, f7, 100L);
                        }
                    } else {
                        fmVar.getFastScroll().setAlpha(0.0f);
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
                    this.f10515b = true;
                    return;
                }
                return;
        }
    }

    public a9(org.telegram.ui.Wallet.i5 i5Var) {
        this.f10514a = 2;
        this.f10516c = i5Var;
        this.f10515b = false;
    }
}
