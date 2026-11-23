package fh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.r5;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.voip.o2;
import org.telegram.ui.Components.voip.r1;
import org.telegram.ui.Components.z40;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bn;
public final class a extends ViewOutlineProvider {
    public final int f11605a;
    public final Object f11606b;

    public a(Object obj, int i7) {
        this.f11605a = i7;
        this.f11606b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f10;
        int i7 = this.f11605a;
        float f11 = 0.0f;
        Object obj = this.f11606b;
        switch (i7) {
            case 0:
                ((g) obj).getOutline(outline);
                return;
            case 1:
                bn bnVar = (bn) obj;
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(2131296593);
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
                ti tiVar = chatAttachAlertPhotoLayout.f37135b;
                float f12 = tiVar.E2[1];
                hi.j jVar = tiVar.C4;
                if (jVar != null) {
                    f10 = jVar.d() + g0.L(16.0f);
                } else {
                    f10 = 0.0f;
                }
                int min = (int) Math.min((tiVar.f30226b.getTranslationY() + ((f12 - f10) + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f32871c0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f32875e0) {
                    min = g0.W1(chatAttachAlertPhotoLayout.f32877f0, min, view.getMeasuredHeight());
                }
                boolean z10 = chatAttachAlertPhotoLayout.f32875e0;
                if (z10) {
                    RectF rectF = g0.P;
                    float f13 = chatAttachAlertPhotoLayout.f32894o1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f32862r1;
                    float f14 = 1.0f - chatAttachAlertPhotoLayout.f32877f0;
                    rectF.set((0.0f * f14) + f13, (f14 * chatAttachAlertPhotoLayout.f32867a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, chatAttachAlertPhotoLayout.f32890m1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f32871c0) {
                    int L = g0.L(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f32862r1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.f32867a0, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 3:
                r5 r5Var = (r5) view;
                if (r5Var.getTag() != null) {
                    int intValue = ((Integer) r5Var.getTag()).intValue();
                    hm hmVar = (hm) obj;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = hmVar.f35771w;
                    if (hmVar.d && chatAttachAlertPhotoLayout2.U0 == chatAttachAlertPhotoLayout2.V0 && !chatAttachAlertPhotoLayout2.P0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.f32882h1) {
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
                outline.setRoundRect(0, ((na0) obj).U + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), g0.L(8.0f));
                return;
            case 6:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((org.telegram.ui.Components.voip.k) obj).d);
                return;
            case 7:
                r1 r1Var = (r1) obj;
                float f15 = r1Var.R;
                if (f15 >= 0.0f) {
                    if (f15 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), r1Var.R);
                        return;
                    }
                } else if (!r1Var.N) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (r1Var.N) {
                        f11 = g0.L(4.0f);
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f11);
                    return;
                }
            case 8:
                o2 o2Var = (o2) obj;
                if (o2Var.f41108b < 1.0f) {
                    outline.setRect((int) o2Var.P, (int) o2Var.O, (int) (view.getMeasuredWidth() - o2Var.P), (int) (view.getMeasuredHeight() - o2Var.O));
                    return;
                } else {
                    outline.setRoundRect((int) o2Var.P, (int) o2Var.O, (int) (view.getMeasuredWidth() - o2Var.P), (int) (view.getMeasuredHeight() - o2Var.O), o2Var.f41108b);
                    return;
                }
            default:
                outline.setRoundRect(g0.L(12.0f), g0.L(12.0f) + PremiumPreviewFragment.j0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - g0.L(12.0f), g0.L(16.0f) + view.getMeasuredHeight(), g0.L(16.0f));
                return;
        }
    }
}
