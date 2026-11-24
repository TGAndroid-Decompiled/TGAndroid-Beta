package defpackage;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PremiumPreviewFragment;
public final class cm0 extends ViewOutlineProvider {
    public final byte a;
    public final Object b;

    public cm0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f;
        a aVar;
        byte b = this.a;
        float f2 = 0.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((im0) obj).getOutline(outline);
                return;
            case 1:
                su suVar = (su) obj;
                rs0 rs0Var = (rs0) suVar.c;
                RectF rectF = (RectF) suVar.b;
                d53 d53Var = rs0.F;
                rs0Var.i0(rectF);
                eq eqVar = rs0Var.s;
                if (eqVar != null) {
                    float height = ((RectF) eqVar.a).height() / 2.0f;
                    float m0 = rs0Var.m0();
                    f2 = Math.min(gm.R1(height, m0, rs0Var.x), Math.max(height, m0));
                }
                outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, f2);
                return;
            case 2:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((oa1) obj).d);
                return;
            case 3:
                yv1 yv1Var = (yv1) obj;
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(2131296593);
                if (imageReceiver != null) {
                    int[] iArr = imageReceiver.X0;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        i = Math.max(i, iArr[i2]);
                    }
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i);
                    return;
                }
                outline.setOval(0, 0, gm.b3(yv1Var.f8(), yv1Var.U7()), gm.b3(yv1Var.f8(), yv1Var.U7()));
                return;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                i22 i22Var = chatAttachAlertPhotoLayout.b;
                float f3 = i22Var.D2[1];
                lc1 lc1Var = i22Var.B4;
                if (lc1Var != null) {
                    f = lc1Var.d() + gm.L(16.0f);
                } else {
                    f = 0.0f;
                }
                int min = (int) Math.min((i22Var.b.getTranslationY() + ((f3 - f) + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.c0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.e0) {
                    min = gm.U1(chatAttachAlertPhotoLayout.f0, min, view.getMeasuredHeight());
                }
                boolean z = chatAttachAlertPhotoLayout.e0;
                if (z) {
                    RectF rectF2 = gm.P;
                    float f4 = chatAttachAlertPhotoLayout.o1;
                    float f5 = 1.0f - chatAttachAlertPhotoLayout.f0;
                    rectF2.set((0.0f * f5) + f4, (f5 * chatAttachAlertPhotoLayout.a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, chatAttachAlertPhotoLayout.m1);
                    outline.setRect((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, Math.min(min, (int) rectF2.bottom));
                    return;
                } else if (!z && !chatAttachAlertPhotoLayout.c0) {
                    int L = gm.L(16.0f);
                    outline.setRoundRect(0, (int) chatAttachAlertPhotoLayout.a0, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 5:
                q68 q68Var = (q68) view;
                if (q68Var.getTag() != null) {
                    int intValue = ((Integer) q68Var.getTag()).intValue();
                    p62 p62Var = (p62) obj;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = p62Var.w;
                    if (p62Var.d && chatAttachAlertPhotoLayout2.U0 == chatAttachAlertPhotoLayout2.V0 && !chatAttachAlertPhotoLayout2.P0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.h1) {
                        intValue++;
                    }
                    if (intValue == 0) {
                        int L2 = gm.L(16.0f);
                        outline.setRoundRect(0, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight() + L2, L2);
                        return;
                    } else if (intValue == chatAttachAlertPhotoLayout2.N0 - 1) {
                        int L3 = gm.L(16.0f);
                        outline.setRoundRect(-L3, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + L3, L3);
                        return;
                    } else {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    }
                }
                return;
            case 6:
                outline.setRoundRect(0, ((f57) obj).U + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), gm.L(8.0f));
                return;
            case 7:
                int L4 = gm.L(12.0f);
                aVar = ((d) ((PremiumPreviewFragment) obj)).actionBar;
                outline.setRoundRect(L4, gm.L(12.0f) + aVar.getBottom(), view.getWidth() - gm.L(12.0f), gm.L(16.0f) + view.getMeasuredHeight(), gm.L(16.0f));
                return;
            case 8:
                phc phcVar = (phc) obj;
                float f6 = phcVar.R;
                if (f6 >= 0.0f) {
                    if (f6 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), phcVar.R);
                        return;
                    }
                } else if (!phcVar.N) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (phcVar.N) {
                        f2 = gm.L(4.0f);
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f2);
                    return;
                }
            default:
                akc akcVar = (akc) obj;
                int i3 = (akcVar.b > 1.0f ? 1 : (akcVar.b == 1.0f ? 0 : -1));
                float f7 = akcVar.P;
                if (i3 < 0) {
                    outline.setRect((int) f7, (int) akcVar.O, (int) (view.getMeasuredWidth() - akcVar.P), (int) (view.getMeasuredHeight() - akcVar.O));
                    return;
                } else {
                    outline.setRoundRect((int) f7, (int) akcVar.O, (int) (view.getMeasuredWidth() - akcVar.P), (int) (view.getMeasuredHeight() - akcVar.O), akcVar.b);
                    return;
                }
        }
    }
}
