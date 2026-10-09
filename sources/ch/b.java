package ch;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import ci.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.voip.s2;
import org.telegram.ui.Components.voip.u1;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.c5;
import w7.g6;
public final class b extends ViewOutlineProvider {
    public final int f4663a;
    public final Object f4664b;

    public b(Object obj, int i10) {
        this.f4663a = i10;
        this.f4664b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f7;
        int i10 = this.f4663a;
        float f10 = 0.0f;
        Object obj = this.f4664b;
        switch (i10) {
            case 0:
                c cVar = ((d) obj).f4685j;
                d.h(outline, cVar.f4675m, cVar.f4666b);
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                yi yiVar = chatAttachAlertPhotoLayout.f30173b;
                float f11 = yiVar.J0[1];
                i iVar = yiVar.E2;
                if (iVar != null) {
                    f7 = iVar.d() + AndroidUtilities.dp(16.0f);
                } else {
                    f7 = 0.0f;
                }
                int min = (int) Math.min((yiVar.getContainerView().getTranslationY() + ((f11 - f7) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f24028b0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f24032d0) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.f24034e0);
                }
                boolean z10 = chatAttachAlertPhotoLayout.f24032d0;
                if (z10) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = chatAttachAlertPhotoLayout.f24052n1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f24021q1;
                    float f13 = 1.0f - chatAttachAlertPhotoLayout.f24034e0;
                    rectF.set((0.0f * f13) + f12, (f13 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f24047k1, chatAttachAlertPhotoLayout.f24049m1, chatAttachAlertPhotoLayout.l1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f24028b0) {
                    int dp = AndroidUtilities.dp(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f24021q1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.W, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 2:
                int i11 = ((t60) obj).X0;
                outline.setOval(0, 0, i11, i11);
                return;
            case 3:
                outline.setRoundRect(0, ((pc0) obj).T + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                return;
            case 4:
                u1 u1Var = (u1) obj;
                float f14 = u1Var.Q;
                if (f14 >= 0.0f) {
                    if (f14 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), u1Var.Q);
                        return;
                    }
                } else if (!u1Var.M) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (u1Var.M) {
                        f10 = AndroidUtilities.dp(4.0f);
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f10);
                    return;
                }
            case 5:
                s2 s2Var = (s2) obj;
                if (s2Var.f32212b < 1.0f) {
                    outline.setRect((int) s2Var.O, (int) s2Var.N, (int) (view.getMeasuredWidth() - s2Var.O), (int) (view.getMeasuredHeight() - s2Var.N));
                    return;
                } else {
                    outline.setRoundRect((int) s2Var.O, (int) s2Var.N, (int) (view.getMeasuredWidth() - s2Var.O), (int) (view.getMeasuredHeight() - s2Var.N), s2Var.f32212b);
                    return;
                }
            case 6:
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + PremiumPreviewFragment.e0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                return;
            default:
                c5 c5Var = (c5) obj;
                g6.a(c5Var.f34726c, view.getWidth(), view.getHeight());
                outline.setConvexPath(c5Var.f34726c);
                return;
        }
    }
}
