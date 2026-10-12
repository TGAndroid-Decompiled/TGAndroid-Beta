package dh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import di.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.Components.voip.s1;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.b5;
import w7.j6;
public final class b extends ViewOutlineProvider {
    public final int f6538a;
    public final Object f6539b;

    public b(Object obj, int i10) {
        this.f6538a = i10;
        this.f6539b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f7;
        int i10 = this.f6538a;
        float f10 = 0.0f;
        Object obj = this.f6539b;
        switch (i10) {
            case 0:
                c cVar = ((d) obj).f6558j;
                d.h(outline, cVar.f6549m, cVar.f6541b);
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                vi viVar = chatAttachAlertPhotoLayout.f27671b;
                float f11 = viVar.J0[1];
                i iVar = viVar.E2;
                if (iVar != null) {
                    f7 = iVar.d() + AndroidUtilities.dp(16.0f);
                } else {
                    f7 = 0.0f;
                }
                int min = (int) Math.min((viVar.getContainerView().getTranslationY() + ((f11 - f7) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f23025b0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f23029d0) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.f23031e0);
                }
                boolean z10 = chatAttachAlertPhotoLayout.f23029d0;
                if (z10) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = chatAttachAlertPhotoLayout.f23049n1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f23018q1;
                    float f13 = 1.0f - chatAttachAlertPhotoLayout.f23031e0;
                    rectF.set((0.0f * f13) + f12, (f13 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f23044k1, chatAttachAlertPhotoLayout.f23046m1, chatAttachAlertPhotoLayout.l1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f23025b0) {
                    int dp = AndroidUtilities.dp(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f23018q1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.W, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 2:
                int i11 = ((p60) obj).X0;
                outline.setOval(0, 0, i11, i11);
                return;
            case 3:
                outline.setRoundRect(0, ((pc0) obj).T + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
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
                r2 r2Var = (r2) obj;
                if (r2Var.f30422b < 1.0f) {
                    outline.setRect((int) r2Var.O, (int) r2Var.N, (int) (view.getMeasuredWidth() - r2Var.O), (int) (view.getMeasuredHeight() - r2Var.N));
                    return;
                } else {
                    outline.setRoundRect((int) r2Var.O, (int) r2Var.N, (int) (view.getMeasuredWidth() - r2Var.O), (int) (view.getMeasuredHeight() - r2Var.N), r2Var.f30422b);
                    return;
                }
            case 6:
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + PremiumPreviewFragment.e0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                return;
            default:
                b5 b5Var = (b5) obj;
                j6.a(b5Var.f32963c, view.getWidth(), view.getHeight());
                outline.setConvexPath(b5Var.f32963c);
                return;
        }
    }
}
