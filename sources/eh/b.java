package eh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import fi.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.voip.v1;
import org.telegram.ui.PremiumPreviewFragment;
public final class b extends ViewOutlineProvider {
    public final int f9947a;
    public final Object f9948b;

    public b(Object obj, int i10) {
        this.f9947a = i10;
        this.f9948b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f7;
        int i10 = this.f9947a;
        float f10 = 0.0f;
        Object obj = this.f9948b;
        switch (i10) {
            case 0:
                c cVar = ((d) obj).f9966x;
                d.r(outline, cVar.f9958m, cVar.f9950b);
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ti tiVar = chatAttachAlertPhotoLayout.f30215b;
                float f11 = tiVar.J0[1];
                i iVar = tiVar.H2;
                if (iVar != null) {
                    f7 = iVar.d() + AndroidUtilities.dp(16.0f);
                } else {
                    f7 = 0.0f;
                }
                int min = (int) Math.min((tiVar.getContainerView().getTranslationY() + ((f11 - f7) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f26022b0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f26026d0) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.f26028e0);
                }
                boolean z10 = chatAttachAlertPhotoLayout.f26026d0;
                if (z10) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = chatAttachAlertPhotoLayout.f26046n1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f26015q1;
                    float f13 = 1.0f - chatAttachAlertPhotoLayout.f26028e0;
                    rectF.set((0.0f * f13) + f12, (f13 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f26041k1, chatAttachAlertPhotoLayout.f26043m1, chatAttachAlertPhotoLayout.l1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f26022b0) {
                    int dp = AndroidUtilities.dp(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f26015q1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.W, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 2:
                int i11 = ((o60) obj).X0;
                outline.setOval(0, 0, i11, i11);
                return;
            case 3:
                outline.setRoundRect(0, ((hc0) obj).T + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                return;
            case 4:
                v1 v1Var = (v1) obj;
                float f14 = v1Var.Q;
                if (f14 >= 0.0f) {
                    if (f14 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), v1Var.Q);
                        return;
                    }
                } else if (!v1Var.M) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (v1Var.M) {
                        f10 = AndroidUtilities.dp(4.0f);
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f10);
                    return;
                }
            case 5:
                t2 t2Var = (t2) obj;
                if (t2Var.f34114b < 1.0f) {
                    outline.setRect((int) t2Var.O, (int) t2Var.N, (int) (view.getMeasuredWidth() - t2Var.O), (int) (view.getMeasuredHeight() - t2Var.N));
                    return;
                } else {
                    outline.setRoundRect((int) t2Var.O, (int) t2Var.N, (int) (view.getMeasuredWidth() - t2Var.O), (int) (view.getMeasuredHeight() - t2Var.N), t2Var.f34114b);
                    return;
                }
            default:
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + PremiumPreviewFragment.f0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                return;
        }
    }
}
