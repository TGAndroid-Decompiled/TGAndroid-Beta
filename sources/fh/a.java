package fh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.voip.q1;
import org.telegram.ui.Components.z40;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bn;
public final class a extends ViewOutlineProvider {
    public final int f11611a;
    public final Object f11612b;

    public a(Object obj, int i7) {
        this.f11611a = i7;
        this.f11612b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f10;
        int i7 = this.f11611a;
        float f11 = 0.0f;
        Object obj = this.f11612b;
        switch (i7) {
            case 0:
                ((g) obj).getOutline(outline);
                return;
            case 1:
                bn bnVar = (bn) obj;
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(2131296591);
                if (imageReceiver != null) {
                    int[] iArr = imageReceiver.X0;
                    int i10 = 0;
                    for (int i11 = 0; i11 < 4; i11++) {
                        i10 = Math.max(i10, iArr[i11]);
                    }
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i10);
                    return;
                }
                outline.setOval(0, 0, g0.f3(bnVar.ba(), bnVar.S9()), g0.f3(bnVar.ba(), bnVar.S9()));
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                si siVar = chatAttachAlertPhotoLayout.f36766b;
                float f12 = siVar.E2[1];
                hi.i iVar = siVar.C4;
                if (iVar != null) {
                    f10 = iVar.d() + g0.L(16.0f);
                } else {
                    f10 = 0.0f;
                }
                int min = (int) Math.min((siVar.f30190b.getTranslationY() + ((f12 - f10) + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f32771c0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f32775e0) {
                    min = g0.W1(chatAttachAlertPhotoLayout.f32777f0, min, view.getMeasuredHeight());
                }
                boolean z10 = chatAttachAlertPhotoLayout.f32775e0;
                if (z10) {
                    RectF rectF = g0.P;
                    float f13 = chatAttachAlertPhotoLayout.f32794o1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f32762r1;
                    float f14 = 1.0f - chatAttachAlertPhotoLayout.f32777f0;
                    rectF.set((0.0f * f14) + f13, (f14 * chatAttachAlertPhotoLayout.f32767a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, chatAttachAlertPhotoLayout.f32790m1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f32771c0) {
                    int L = g0.L(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f32762r1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.f32767a0, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 3:
                s5 s5Var = (s5) view;
                if (s5Var.getTag() != null) {
                    int intValue = ((Integer) s5Var.getTag()).intValue();
                    hm hmVar = (hm) obj;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = hmVar.f35930w;
                    if (hmVar.d && chatAttachAlertPhotoLayout2.U0 == chatAttachAlertPhotoLayout2.V0 && !chatAttachAlertPhotoLayout2.P0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.f32782h1) {
                        intValue++;
                    }
                    if (intValue == 0) {
                        int L2 = g0.L(16.0f);
                        outline.setRoundRect(0, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight() + L2, L2);
                        return;
                    } else if (intValue == chatAttachAlertPhotoLayout2.N0 - 1) {
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
                int i12 = ((z40) obj).X0;
                outline.setOval(0, 0, i12, i12);
                return;
            case 5:
                outline.setRoundRect(0, ((oa0) obj).U + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), g0.L(8.0f));
                return;
            case 6:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((org.telegram.ui.Components.voip.k) obj).d);
                return;
            case 7:
                q1 q1Var = (q1) obj;
                float f15 = q1Var.R;
                if (f15 >= 0.0f) {
                    if (f15 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), q1Var.R);
                        return;
                    }
                } else if (!q1Var.N) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (q1Var.N) {
                        f11 = g0.L(4.0f);
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f11);
                    return;
                }
            case 8:
                n2 n2Var = (n2) obj;
                if (n2Var.f41076b < 1.0f) {
                    outline.setRect((int) n2Var.P, (int) n2Var.O, (int) (view.getMeasuredWidth() - n2Var.P), (int) (view.getMeasuredHeight() - n2Var.O));
                    return;
                } else {
                    outline.setRoundRect((int) n2Var.P, (int) n2Var.O, (int) (view.getMeasuredWidth() - n2Var.P), (int) (view.getMeasuredHeight() - n2Var.O), n2Var.f41076b);
                    return;
                }
            default:
                outline.setRoundRect(g0.L(12.0f), g0.L(12.0f) + PremiumPreviewFragment.j0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - g0.L(12.0f), g0.L(16.0f) + view.getMeasuredHeight(), g0.L(16.0f));
                return;
        }
    }
}
