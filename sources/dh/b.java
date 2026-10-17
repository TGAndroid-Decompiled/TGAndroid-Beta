package dh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import ei.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.voip.s1;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.n5;
import w7.i6;
import zh.b0;
import zh.b1;
public final class b extends ViewOutlineProvider {
    public final int f7996a;
    public final Object f7997b;

    public b(Object obj, int i10) {
        this.f7996a = i10;
        this.f7997b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f7;
        int i10 = this.f7996a;
        float f10 = 0.0f;
        Object obj = this.f7997b;
        switch (i10) {
            case 0:
                c cVar = ((d) obj).f8016j;
                d.h(outline, cVar.f8007m, cVar.f7999b);
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ti tiVar = chatAttachAlertPhotoLayout.f28238b;
                float f11 = tiVar.J0[1];
                i iVar = tiVar.E2;
                if (iVar != null) {
                    f7 = iVar.d() + AndroidUtilities.dp(16.0f);
                } else {
                    f7 = 0.0f;
                }
                int min = (int) Math.min((tiVar.getContainerView().getTranslationY() + ((f11 - f7) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f24080b0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f24084d0) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.f24086e0);
                }
                boolean z10 = chatAttachAlertPhotoLayout.f24084d0;
                if (z10) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = chatAttachAlertPhotoLayout.f24104n1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f24073q1;
                    float f13 = 1.0f - chatAttachAlertPhotoLayout.f24086e0;
                    rectF.set((0.0f * f13) + f12, (f13 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f24099k1, chatAttachAlertPhotoLayout.f24101m1, chatAttachAlertPhotoLayout.l1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f24080b0) {
                    int dp = AndroidUtilities.dp(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f24073q1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.W, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 2:
                int i11 = ((m60) obj).X0;
                outline.setOval(0, 0, i11, i11);
                return;
            case 3:
                outline.setRoundRect(0, ((ic0) obj).T + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
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
                if (q2Var.f31685b < 1.0f) {
                    outline.setRect((int) q2Var.O, (int) q2Var.N, (int) (view.getMeasuredWidth() - q2Var.O), (int) (view.getMeasuredHeight() - q2Var.N));
                    return;
                } else {
                    outline.setRoundRect((int) q2Var.O, (int) q2Var.N, (int) (view.getMeasuredWidth() - q2Var.O), (int) (view.getMeasuredHeight() - q2Var.N), q2Var.f31685b);
                    return;
                }
            case 6:
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + PremiumPreviewFragment.e0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                return;
            case 7:
                n5 n5Var = (n5) obj;
                i6.a(n5Var.f34637c, view.getWidth(), view.getHeight());
                outline.setConvexPath(n5Var.f34637c);
                return;
            default:
                float dp2 = AndroidUtilities.dp(32.0f);
                if (Build.VERSION.SDK_INT >= 31) {
                    dp2 = b0.g((b1) obj, dp2);
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), dp2);
                return;
        }
    }
}
