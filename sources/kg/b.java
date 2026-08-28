package kg;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import kh.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.Components.voip.s1;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.PremiumPreviewFragment;
public final class b extends ViewOutlineProvider {
    public final int f14800a;
    public final Object f14801b;

    public b(Object obj, int i9) {
        this.f14800a = i9;
        this.f14801b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f10;
        float f11;
        int i9 = this.f14800a;
        Object obj = this.f14801b;
        switch (i9) {
            case 0:
                c cVar = ((d) obj).h;
                d.h(outline, cVar.f14812m, cVar.f14803b);
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ki kiVar = chatAttachAlertPhotoLayout.f27493b;
                float f12 = kiVar.C0[1];
                i iVar = kiVar.f30173x2;
                if (iVar != null) {
                    f10 = iVar.d() + AndroidUtilities.dp(16.0f);
                } else {
                    f10 = 0.0f;
                }
                int min = (int) Math.min((kiVar.getContainerView().getTranslationY() + ((f12 - f10) + chatAttachAlertPhotoLayout.S0)) - chatAttachAlertPhotoLayout.L.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.U) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.W) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.f26246a0);
                }
                boolean z10 = chatAttachAlertPhotoLayout.W;
                if (z10) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f13 = chatAttachAlertPhotoLayout.f26265j1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f26241m1;
                    float f14 = 1.0f - chatAttachAlertPhotoLayout.f26246a0;
                    rectF.set((0.0f * f14) + f13, (f14 * chatAttachAlertPhotoLayout.S) + chatAttachAlertPhotoLayout.f26259g1, chatAttachAlertPhotoLayout.f26263i1, chatAttachAlertPhotoLayout.f26261h1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.U) {
                    int dp = AndroidUtilities.dp(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f26241m1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.S, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 2:
                int i10 = ((f50) obj).J0;
                outline.setOval(0, 0, i10, i10);
                return;
            case 3:
                outline.setRoundRect(0, ((wa0) obj).P + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                return;
            case 4:
                s1 s1Var = (s1) obj;
                float f15 = s1Var.M;
                if (f15 >= 0.0f) {
                    if (f15 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), s1Var.M);
                        return;
                    }
                } else if (!s1Var.I) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (s1Var.I) {
                        f11 = AndroidUtilities.dp(4.0f);
                    } else {
                        f11 = 0.0f;
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f11);
                    return;
                }
            case 5:
                r2 r2Var = (r2) obj;
                if (r2Var.f33774b < 1.0f) {
                    outline.setRect((int) r2Var.K, (int) r2Var.J, (int) (view.getMeasuredWidth() - r2Var.K), (int) (view.getMeasuredHeight() - r2Var.J));
                    return;
                } else {
                    outline.setRoundRect((int) r2Var.K, (int) r2Var.J, (int) (view.getMeasuredWidth() - r2Var.K), (int) (view.getMeasuredHeight() - r2Var.J), r2Var.f33774b);
                    return;
                }
            default:
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + PremiumPreviewFragment.d0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                return;
        }
    }
}
