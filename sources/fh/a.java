package fh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.voip.o2;
import org.telegram.ui.Components.voip.r1;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.an;
public final class a extends ViewOutlineProvider {
    public final int f11294a;
    public final Object f11295b;

    public a(Object obj, int i7) {
        this.f11294a = i7;
        this.f11295b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f10;
        int i7 = this.f11294a;
        float f11 = 0.0f;
        Object obj = this.f11295b;
        switch (i7) {
            case 0:
                ((g) obj).getOutline(outline);
                return;
            case 1:
                an anVar = (an) obj;
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
                outline.setOval(0, 0, g0.g3(anVar.ba(), anVar.S9()), g0.g3(anVar.ba(), anVar.S9()));
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                ki kiVar = chatAttachAlertPhotoLayout.f33609b;
                float f12 = kiVar.E2[1];
                hi.i iVar = kiVar.C4;
                if (iVar != null) {
                    f10 = iVar.d() + g0.L(16.0f);
                } else {
                    f10 = 0.0f;
                }
                int min = (int) Math.min((kiVar.f29682b.getTranslationY() + ((f12 - f10) + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f32374c0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f32378e0) {
                    min = g0.W1(chatAttachAlertPhotoLayout.f32380f0, min, view.getMeasuredHeight());
                }
                boolean z10 = chatAttachAlertPhotoLayout.f32378e0;
                if (z10) {
                    RectF rectF = g0.P;
                    float f13 = chatAttachAlertPhotoLayout.f32397o1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f32365r1;
                    float f14 = 1.0f - chatAttachAlertPhotoLayout.f32380f0;
                    rectF.set((0.0f * f14) + f13, (f14 * chatAttachAlertPhotoLayout.f32370a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, chatAttachAlertPhotoLayout.f32393m1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f32374c0) {
                    int L = g0.L(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f32365r1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.f32370a0, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 3:
                q5 q5Var = (q5) view;
                if (q5Var.getTag() != null) {
                    int intValue = ((Integer) q5Var.getTag()).intValue();
                    am amVar = (am) obj;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = amVar.f33023w;
                    if (amVar.d && chatAttachAlertPhotoLayout2.U0 == chatAttachAlertPhotoLayout2.V0 && !chatAttachAlertPhotoLayout2.P0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.f32385h1) {
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
                int i12 = ((r40) obj).X0;
                outline.setOval(0, 0, i12, i12);
                return;
            case 5:
                outline.setRoundRect(0, ((ea0) obj).U + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), g0.L(8.0f));
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
                if (o2Var.f40831b < 1.0f) {
                    outline.setRect((int) o2Var.P, (int) o2Var.O, (int) (view.getMeasuredWidth() - o2Var.P), (int) (view.getMeasuredHeight() - o2Var.O));
                    return;
                } else {
                    outline.setRoundRect((int) o2Var.P, (int) o2Var.O, (int) (view.getMeasuredWidth() - o2Var.P), (int) (view.getMeasuredHeight() - o2Var.O), o2Var.f40831b);
                    return;
                }
            default:
                outline.setRoundRect(g0.L(12.0f), g0.L(12.0f) + PremiumPreviewFragment.j0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - g0.L(12.0f), g0.L(16.0f) + view.getMeasuredHeight(), g0.L(16.0f));
                return;
        }
    }
}
