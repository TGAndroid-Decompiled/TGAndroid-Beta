package lg;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import lh.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.Components.voip.s1;
import org.telegram.ui.PremiumPreviewFragment;

public final class b extends ViewOutlineProvider {

    public final int f15578a;

    public final Object f15579b;

    public b(Object obj, int i10) {
        this.f15578a = i10;
        this.f15579b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int i10 = this.f15578a;
        Object obj = this.f15579b;
        switch (i10) {
            case 0:
                c cVar = ((d) obj).h;
                d.h(outline, cVar.f15590m, cVar.f15581b);
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                gi giVar = chatAttachAlertPhotoLayout.f34900b;
                float f10 = giVar.C0[1];
                i iVar = giVar.f28709x2;
                int iMin = (int) Math.min((giVar.getContainerView().getTranslationY() + ((f10 - (iVar != null ? iVar.d() + AndroidUtilities.dp(16.0f) : 0.0f)) + chatAttachAlertPhotoLayout.S0)) - chatAttachAlertPhotoLayout.L.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.U) {
                    iMin = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.W) {
                    iMin = AndroidUtilities.lerp(iMin, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.f26242a0);
                }
                boolean z10 = chatAttachAlertPhotoLayout.W;
                if (z10) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f11 = chatAttachAlertPhotoLayout.f26261j1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f26237m1;
                    float f12 = 1.0f - chatAttachAlertPhotoLayout.f26242a0;
                    rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.S) + chatAttachAlertPhotoLayout.f26255g1, chatAttachAlertPhotoLayout.f26259i1, chatAttachAlertPhotoLayout.f26257h1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(iMin, (int) rectF.bottom));
                } else if (z10 || chatAttachAlertPhotoLayout.U) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(iMin, view.getMeasuredHeight()));
                } else {
                    int iDp = AndroidUtilities.dp(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f26237m1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.S, view.getMeasuredWidth() + iDp, Math.min(iMin, view.getMeasuredHeight()) + iDp, iDp);
                }
                break;
            case 2:
                int i11 = ((k50) obj).J0;
                outline.setOval(0, 0, i11, i11);
                break;
            case 3:
                outline.setRoundRect(0, ((ab0) obj).P + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                break;
            case 4:
                s1 s1Var = (s1) obj;
                float f13 = s1Var.M;
                if (f13 < 0.0f) {
                    if (!s1Var.I) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), s1Var.I ? AndroidUtilities.dp(4.0f) : 0.0f);
                    }
                } else if (f13 >= 1.0f) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), s1Var.M);
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                break;
            case 5:
                r2 r2Var = (r2) obj;
                if (r2Var.f33824b >= 1.0f) {
                    outline.setRoundRect((int) r2Var.K, (int) r2Var.J, (int) (view.getMeasuredWidth() - r2Var.K), (int) (view.getMeasuredHeight() - r2Var.J), r2Var.f33824b);
                } else {
                    outline.setRect((int) r2Var.K, (int) r2Var.J, (int) (view.getMeasuredWidth() - r2Var.K), (int) (view.getMeasuredHeight() - r2Var.J));
                }
                break;
            default:
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + ((n2) ((PremiumPreviewFragment) obj)).actionBar.getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                break;
        }
    }
}
