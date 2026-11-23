package fh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.voip.q1;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bn;
public final class a extends ViewOutlineProvider {
    public final int f11643a;
    public final Object f11644b;

    public a(Object obj, int i7) {
        this.f11643a = i7;
        this.f11644b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f10;
        int i7 = this.f11643a;
        float f11 = 0.0f;
        Object obj = this.f11644b;
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
                ui uiVar = chatAttachAlertPhotoLayout.f37520b;
                float f12 = uiVar.E2[1];
                hi.j jVar = uiVar.C4;
                if (jVar != null) {
                    f10 = jVar.d() + g0.L(16.0f);
                } else {
                    f10 = 0.0f;
                }
                int min = (int) Math.min((uiVar.f30176b.getTranslationY() + ((f12 - f10) + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f32807c0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f32811e0) {
                    min = g0.W1(chatAttachAlertPhotoLayout.f32813f0, min, view.getMeasuredHeight());
                }
                boolean z10 = chatAttachAlertPhotoLayout.f32811e0;
                if (z10) {
                    RectF rectF = g0.P;
                    float f13 = chatAttachAlertPhotoLayout.f32830o1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f32798r1;
                    float f14 = 1.0f - chatAttachAlertPhotoLayout.f32813f0;
                    rectF.set((0.0f * f14) + f13, (f14 * chatAttachAlertPhotoLayout.f32803a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, chatAttachAlertPhotoLayout.f32826m1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f32807c0) {
                    int L = g0.L(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f32798r1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.f32803a0, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 3:
                s5 s5Var = (s5) view;
                if (s5Var.getTag() != null) {
                    int intValue = ((Integer) s5Var.getTag()).intValue();
                    jm jmVar = (jm) obj;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = jmVar.f36561w;
                    if (jmVar.d && chatAttachAlertPhotoLayout2.U0 == chatAttachAlertPhotoLayout2.V0 && !chatAttachAlertPhotoLayout2.P0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.f32818h1) {
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
                int i12 = ((c50) obj).X0;
                outline.setOval(0, 0, i12, i12);
                return;
            case 5:
                outline.setRoundRect(0, ((qa0) obj).U + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), g0.L(8.0f));
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
                if (n2Var.f41213b < 1.0f) {
                    outline.setRect((int) n2Var.P, (int) n2Var.O, (int) (view.getMeasuredWidth() - n2Var.P), (int) (view.getMeasuredHeight() - n2Var.O));
                    return;
                } else {
                    outline.setRoundRect((int) n2Var.P, (int) n2Var.O, (int) (view.getMeasuredWidth() - n2Var.P), (int) (view.getMeasuredHeight() - n2Var.O), n2Var.f41213b);
                    return;
                }
            default:
                outline.setRoundRect(g0.L(12.0f), g0.L(12.0f) + PremiumPreviewFragment.j0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - g0.L(12.0f), g0.L(16.0f) + view.getMeasuredHeight(), g0.L(16.0f));
                return;
        }
    }
}
