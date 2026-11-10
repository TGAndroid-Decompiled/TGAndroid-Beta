package fh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.Components.voip.n1;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.cn;
public final class a extends ViewOutlineProvider {
    public final int f11485a;
    public final Object f11486b;

    public a(Object obj, int i7) {
        this.f11485a = i7;
        this.f11486b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f10;
        int i7 = this.f11485a;
        float f11 = 0.0f;
        Object obj = this.f11486b;
        switch (i7) {
            case 0:
                ((g) obj).getOutline(outline);
                return;
            case 1:
                cn cnVar = (cn) obj;
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(2131296591);
                if (imageReceiver != null) {
                    int[] iArr = imageReceiver.W0;
                    int i10 = 0;
                    for (int i11 = 0; i11 < 4; i11++) {
                        i10 = Math.max(i10, iArr[i11]);
                    }
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i10);
                    return;
                }
                outline.setOval(0, 0, g0.g3(cnVar.aa(), cnVar.R9()), g0.g3(cnVar.aa(), cnVar.R9()));
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ci ciVar = chatAttachAlertPhotoLayout.f38656b;
                float f12 = ciVar.D2[1];
                fi.i iVar = ciVar.B4;
                if (iVar != null) {
                    f10 = iVar.d() + g0.L(16.0f);
                } else {
                    f10 = 0.0f;
                }
                int min = (int) Math.min((ciVar.f28672b.getTranslationY() + ((f12 - f10) + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f31211b0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f31215d0) {
                    min = g0.W1(chatAttachAlertPhotoLayout.f31217e0, min, view.getMeasuredHeight());
                }
                boolean z9 = chatAttachAlertPhotoLayout.f31215d0;
                if (z9) {
                    RectF rectF = g0.P;
                    float f13 = chatAttachAlertPhotoLayout.n1;
                    boolean z10 = ChatAttachAlertPhotoLayout.f31204q1;
                    float f14 = 1.0f - chatAttachAlertPhotoLayout.f31217e0;
                    rectF.set((0.0f * f14) + f13, (f14 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f31230k1, chatAttachAlertPhotoLayout.f31232m1, chatAttachAlertPhotoLayout.l1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z9 && !chatAttachAlertPhotoLayout.f31211b0) {
                    int L = g0.L(16.0f);
                    boolean z11 = ChatAttachAlertPhotoLayout.f31204q1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.W, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 3:
                q5 q5Var = (q5) view;
                if (q5Var.getTag() != null) {
                    int intValue = ((Integer) q5Var.getTag()).intValue();
                    sl slVar = (sl) obj;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = slVar.f38024w;
                    if (slVar.d && chatAttachAlertPhotoLayout2.T0 == chatAttachAlertPhotoLayout2.U0 && !chatAttachAlertPhotoLayout2.O0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.f31222g1) {
                        intValue++;
                    }
                    if (intValue == 0) {
                        int L2 = g0.L(16.0f);
                        outline.setRoundRect(0, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight() + L2, L2);
                        return;
                    } else if (intValue == chatAttachAlertPhotoLayout2.M0 - 1) {
                        int L3 = g0.L(16.0f);
                        outline.setRoundRect(-L3, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + L3, L3);
                        return;
                    } else {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    }
                }
                return;
            case 4:
                int i12 = ((o40) obj).W0;
                outline.setOval(0, 0, i12, i12);
                return;
            case 5:
                outline.setRoundRect(0, ((ca0) obj).T + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), g0.L(8.0f));
                return;
            case 6:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((org.telegram.ui.Components.voip.k) obj).d);
                return;
            case 7:
                n1 n1Var = (n1) obj;
                float f15 = n1Var.Q;
                if (f15 >= 0.0f) {
                    if (f15 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), n1Var.Q);
                        return;
                    }
                } else if (!n1Var.M) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (n1Var.M) {
                        f11 = g0.L(4.0f);
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f11);
                    return;
                }
            case 8:
                k2 k2Var = (k2) obj;
                if (k2Var.f39341b < 1.0f) {
                    outline.setRect((int) k2Var.O, (int) k2Var.N, (int) (view.getMeasuredWidth() - k2Var.O), (int) (view.getMeasuredHeight() - k2Var.N));
                    return;
                } else {
                    outline.setRoundRect((int) k2Var.O, (int) k2Var.N, (int) (view.getMeasuredWidth() - k2Var.O), (int) (view.getMeasuredHeight() - k2Var.N), k2Var.f39341b);
                    return;
                }
            default:
                outline.setRoundRect(g0.L(12.0f), g0.L(12.0f) + PremiumPreviewFragment.j0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - g0.L(12.0f), g0.L(16.0f) + view.getMeasuredHeight(), g0.L(16.0f));
                return;
        }
    }
}
