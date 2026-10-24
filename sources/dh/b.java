package dh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import ei.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.voip.s1;
import org.telegram.ui.PremiumPreviewFragment;
public final class b extends ViewOutlineProvider {
    public final int f8006a;
    public final Object f8007b;

    public b(Object obj, int i10) {
        this.f8006a = i10;
        this.f8007b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f7;
        int i10 = this.f8006a;
        float f10 = 0.0f;
        Object obj = this.f8007b;
        switch (i10) {
            case 0:
                c cVar = ((d) obj).v;
                d.h(outline, cVar.f8017m, cVar.f8009b);
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ri riVar = chatAttachAlertPhotoLayout.f27704b;
                float f11 = riVar.J0[1];
                i iVar = riVar.H2;
                if (iVar != null) {
                    f7 = iVar.d() + AndroidUtilities.dp(16.0f);
                } else {
                    f7 = 0.0f;
                }
                int min = (int) Math.min((riVar.getContainerView().getTranslationY() + ((f11 - f7) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f24230b0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f24234d0) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.f24236e0);
                }
                boolean z10 = chatAttachAlertPhotoLayout.f24234d0;
                if (z10) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = chatAttachAlertPhotoLayout.f24254n1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f24223q1;
                    float f13 = 1.0f - chatAttachAlertPhotoLayout.f24236e0;
                    rectF.set((0.0f * f13) + f12, (f13 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f24249k1, chatAttachAlertPhotoLayout.f24251m1, chatAttachAlertPhotoLayout.l1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f24230b0) {
                    int dp = AndroidUtilities.dp(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f24223q1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.W, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 2:
                int i11 = ((l60) obj).X0;
                outline.setOval(0, 0, i11, i11);
                return;
            case 3:
                outline.setRoundRect(0, ((jc0) obj).T + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                return;
            case 4:
                s1 s1Var = (s1) obj;
                float f14 = s1Var.Q;
                if (f14 >= 0.0f) {
                    if (f14 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), s1Var.Q);
                        return;
                    }
                } else if (!s1Var.M) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (s1Var.M) {
                        f10 = AndroidUtilities.dp(4.0f);
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f10);
                    return;
                }
            case 5:
                q2 q2Var = (q2) obj;
                if (q2Var.f31801b < 1.0f) {
                    outline.setRect((int) q2Var.O, (int) q2Var.N, (int) (view.getMeasuredWidth() - q2Var.O), (int) (view.getMeasuredHeight() - q2Var.N));
                    return;
                } else {
                    outline.setRoundRect((int) q2Var.O, (int) q2Var.N, (int) (view.getMeasuredWidth() - q2Var.O), (int) (view.getMeasuredHeight() - q2Var.N), q2Var.f31801b);
                    return;
                }
            default:
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + PremiumPreviewFragment.e0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                return;
        }
    }
}
