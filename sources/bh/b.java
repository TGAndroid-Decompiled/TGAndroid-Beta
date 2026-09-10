package bh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import bi.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.Components.voip.t1;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PremiumPreviewFragment;
public final class b extends ViewOutlineProvider {
    public final int f2255a;
    public final Object f2256b;

    public b(Object obj, int i10) {
        this.f2255a = i10;
        this.f2256b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f7;
        float f10;
        int i10 = this.f2255a;
        Object obj = this.f2256b;
        switch (i10) {
            case 0:
                c cVar = ((d) obj).h;
                d.h(outline, cVar.f2266m, cVar.f2258b);
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                yi yiVar = chatAttachAlertPhotoLayout.f26422b;
                float f11 = yiVar.G0[1];
                k kVar = yiVar.B2;
                if (kVar != null) {
                    f7 = kVar.d() + AndroidUtilities.dp(16.0f);
                } else {
                    f7 = 0.0f;
                }
                int min = (int) Math.min((yiVar.getContainerView().getTranslationY() + ((f11 - f7) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f20990b0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f20994d0) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.f20996e0);
                }
                boolean z10 = chatAttachAlertPhotoLayout.f20994d0;
                if (z10) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = chatAttachAlertPhotoLayout.f21014n1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f20983q1;
                    float f13 = 1.0f - chatAttachAlertPhotoLayout.f20996e0;
                    rectF.set((0.0f * f13) + f12, (f13 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f21009k1, chatAttachAlertPhotoLayout.f21011m1, chatAttachAlertPhotoLayout.l1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f20990b0) {
                    int dp = AndroidUtilities.dp(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f20983q1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.W, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 2:
                int i11 = ((f60) obj).N0;
                outline.setOval(0, 0, i11, i11);
                return;
            case 3:
                outline.setRoundRect(0, ((yb0) obj).T + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                return;
            case 4:
                t1 t1Var = (t1) obj;
                float f14 = t1Var.Q;
                if (f14 >= 0.0f) {
                    if (f14 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), t1Var.Q);
                        return;
                    }
                } else if (!t1Var.M) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (t1Var.M) {
                        f10 = AndroidUtilities.dp(4.0f);
                    } else {
                        f10 = 0.0f;
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f10);
                    return;
                }
            case 5:
                r2 r2Var = (r2) obj;
                if (r2Var.f28374b < 1.0f) {
                    outline.setRect((int) r2Var.O, (int) r2Var.N, (int) (view.getMeasuredWidth() - r2Var.O), (int) (view.getMeasuredHeight() - r2Var.N));
                    return;
                } else {
                    outline.setRoundRect((int) r2Var.O, (int) r2Var.N, (int) (view.getMeasuredWidth() - r2Var.O), (int) (view.getMeasuredHeight() - r2Var.N), r2Var.f28374b);
                    return;
                }
            default:
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + PremiumPreviewFragment.e0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                return;
        }
    }
}
