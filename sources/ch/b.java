package ch;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import ci.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.voip.s2;
import org.telegram.ui.Components.voip.u1;
import org.telegram.ui.PremiumPreviewFragment;
public final class b extends ViewOutlineProvider {
    public final int f4267a;
    public final Object f4268b;

    public b(Object obj, int i10) {
        this.f4267a = i10;
        this.f4268b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f7;
        float f10;
        int i10 = this.f4267a;
        Object obj = this.f4268b;
        switch (i10) {
            case 0:
                c cVar = ((d) obj).f4287j;
                d.h(outline, cVar.f4278m, cVar.f4270b);
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                vi viVar = chatAttachAlertPhotoLayout.f26786b;
                float f11 = viVar.G0[1];
                i iVar = viVar.B2;
                if (iVar != null) {
                    f7 = iVar.d() + AndroidUtilities.dp(16.0f);
                } else {
                    f7 = 0.0f;
                }
                int min = (int) Math.min((viVar.getContainerView().getTranslationY() + ((f11 - f7) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f22142b0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f22146d0) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.f22148e0);
                }
                boolean z10 = chatAttachAlertPhotoLayout.f22146d0;
                if (z10) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = chatAttachAlertPhotoLayout.f22166n1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f22135q1;
                    float f13 = 1.0f - chatAttachAlertPhotoLayout.f22148e0;
                    rectF.set((0.0f * f13) + f12, (f13 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f22161k1, chatAttachAlertPhotoLayout.f22163m1, chatAttachAlertPhotoLayout.l1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f22142b0) {
                    int dp = AndroidUtilities.dp(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f22135q1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.W, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 2:
                int i11 = ((c60) obj).S0;
                outline.setOval(0, 0, i11, i11);
                return;
            case 3:
                outline.setRoundRect(0, ((ac0) obj).T + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
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
                    } else {
                        f10 = 0.0f;
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f10);
                    return;
                }
            case 5:
                s2 s2Var = (s2) obj;
                if (s2Var.f29570b < 1.0f) {
                    outline.setRect((int) s2Var.O, (int) s2Var.N, (int) (view.getMeasuredWidth() - s2Var.O), (int) (view.getMeasuredHeight() - s2Var.N));
                    return;
                } else {
                    outline.setRoundRect((int) s2Var.O, (int) s2Var.N, (int) (view.getMeasuredWidth() - s2Var.O), (int) (view.getMeasuredHeight() - s2Var.N), s2Var.f29570b);
                    return;
                }
            default:
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + PremiumPreviewFragment.e0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                return;
        }
    }
}
