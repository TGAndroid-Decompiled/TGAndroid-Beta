package ch;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import ci.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.voip.s2;
import org.telegram.ui.Components.voip.u1;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.x50;
import org.telegram.ui.PremiumPreviewFragment;
public final class b extends ViewOutlineProvider {
    public final int f4260a;
    public final Object f4261b;

    public b(Object obj, int i10) {
        this.f4260a = i10;
        this.f4261b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f7;
        float f10;
        int i10 = this.f4260a;
        Object obj = this.f4261b;
        switch (i10) {
            case 0:
                c cVar = ((d) obj).f4280j;
                d.h(outline, cVar.f4271m, cVar.f4263b);
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                wi wiVar = chatAttachAlertPhotoLayout.f26744b;
                float f11 = wiVar.G0[1];
                i iVar = wiVar.B2;
                if (iVar != null) {
                    f7 = iVar.d() + AndroidUtilities.dp(16.0f);
                } else {
                    f7 = 0.0f;
                }
                int min = (int) Math.min((wiVar.getContainerView().getTranslationY() + ((f11 - f7) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f21876b0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f21880d0) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.f21882e0);
                }
                boolean z10 = chatAttachAlertPhotoLayout.f21880d0;
                if (z10) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = chatAttachAlertPhotoLayout.f21900n1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f21869q1;
                    float f13 = 1.0f - chatAttachAlertPhotoLayout.f21882e0;
                    rectF.set((0.0f * f13) + f12, (f13 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f21895k1, chatAttachAlertPhotoLayout.f21897m1, chatAttachAlertPhotoLayout.l1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f21876b0) {
                    int dp = AndroidUtilities.dp(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f21869q1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.W, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 2:
                int i11 = ((x50) obj).N0;
                outline.setOval(0, 0, i11, i11);
                return;
            case 3:
                outline.setRoundRect(0, ((ob0) obj).T + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
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
                if (s2Var.f29176b < 1.0f) {
                    outline.setRect((int) s2Var.O, (int) s2Var.N, (int) (view.getMeasuredWidth() - s2Var.O), (int) (view.getMeasuredHeight() - s2Var.N));
                    return;
                } else {
                    outline.setRoundRect((int) s2Var.O, (int) s2Var.N, (int) (view.getMeasuredWidth() - s2Var.O), (int) (view.getMeasuredHeight() - s2Var.N), s2Var.f29176b);
                    return;
                }
            default:
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + PremiumPreviewFragment.e0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                return;
        }
    }
}
