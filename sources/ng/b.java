package ng;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import nh.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.voip.t1;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.PremiumPreviewFragment;
public final class b extends ViewOutlineProvider {
    public final int f17324a;
    public final Object f17325b;

    public b(Object obj, int i10) {
        this.f17324a = i10;
        this.f17325b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f9;
        float f10;
        int i10 = this.f17324a;
        Object obj = this.f17325b;
        switch (i10) {
            case 0:
                c cVar = ((d) obj).h;
                d.h(outline, cVar.f17336m, cVar.f17327b);
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ni niVar = chatAttachAlertPhotoLayout.f28403b;
                float f11 = niVar.C0[1];
                i iVar = niVar.f31064x2;
                if (iVar != null) {
                    f9 = iVar.d() + AndroidUtilities.dp(16.0f);
                } else {
                    f9 = 0.0f;
                }
                int min = (int) Math.min((niVar.getContainerView().getTranslationY() + ((f11 - f9) + chatAttachAlertPhotoLayout.S0)) - chatAttachAlertPhotoLayout.L.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.U) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.W) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.f26257a0);
                }
                boolean z10 = chatAttachAlertPhotoLayout.W;
                if (z10) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = chatAttachAlertPhotoLayout.f26276j1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f26252m1;
                    float f13 = 1.0f - chatAttachAlertPhotoLayout.f26257a0;
                    rectF.set((0.0f * f13) + f12, (f13 * chatAttachAlertPhotoLayout.S) + chatAttachAlertPhotoLayout.f26270g1, chatAttachAlertPhotoLayout.f26274i1, chatAttachAlertPhotoLayout.f26272h1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.U) {
                    int dp = AndroidUtilities.dp(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f26252m1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.S, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 2:
                int i11 = ((s50) obj).J0;
                outline.setOval(0, 0, i11, i11);
                return;
            case 3:
                outline.setRoundRect(0, ((lb0) obj).P + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                return;
            case 4:
                t1 t1Var = (t1) obj;
                float f14 = t1Var.M;
                if (f14 >= 0.0f) {
                    if (f14 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), t1Var.M);
                        return;
                    }
                } else if (!t1Var.I) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (t1Var.I) {
                        f10 = AndroidUtilities.dp(4.0f);
                    } else {
                        f10 = 0.0f;
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f10);
                    return;
                }
            case 5:
                u2 u2Var = (u2) obj;
                if (u2Var.f34054b < 1.0f) {
                    outline.setRect((int) u2Var.K, (int) u2Var.J, (int) (view.getMeasuredWidth() - u2Var.K), (int) (view.getMeasuredHeight() - u2Var.J));
                    return;
                } else {
                    outline.setRoundRect((int) u2Var.K, (int) u2Var.J, (int) (view.getMeasuredWidth() - u2Var.K), (int) (view.getMeasuredHeight() - u2Var.J), u2Var.f34054b);
                    return;
                }
            default:
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + PremiumPreviewFragment.e0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                return;
        }
    }
}
