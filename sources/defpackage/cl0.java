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
public final class cl0 extends ViewOutlineProvider {
    public final byte a;
    public final Object b;

    public cl0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f;
        a aVar;
        float f2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((il0) obj).getOutline(outline);
                return;
            case 1:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((f91) obj).d);
                return;
            case 2:
                mu1 mu1Var = (mu1) obj;
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
                outline.setOval(0, 0, gl.c3(mu1Var.U7(), mu1Var.K7()), gl.c3(mu1Var.U7(), mu1Var.K7()));
                return;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                x02 x02Var = chatAttachAlertPhotoLayout.b;
                float f3 = x02Var.D2[1];
                eb1 eb1Var = x02Var.B4;
                if (eb1Var != null) {
                    f = eb1Var.d() + gl.L(16.0f);
                } else {
                    f = 0.0f;
                }
                int min = (int) Math.min((x02Var.b.getTranslationY() + ((f3 - f) + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.c0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.e0) {
                    min = gl.U1(chatAttachAlertPhotoLayout.f0, min, view.getMeasuredHeight());
                }
                boolean z = chatAttachAlertPhotoLayout.e0;
                if (z) {
                    RectF rectF = gl.P;
                    float f4 = chatAttachAlertPhotoLayout.o1;
                    float f5 = 1.0f - chatAttachAlertPhotoLayout.f0;
                    rectF.set((f5 * 0.0f) + f4, (f5 * chatAttachAlertPhotoLayout.a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, chatAttachAlertPhotoLayout.m1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z && !chatAttachAlertPhotoLayout.c0) {
                    int L = gl.L(16.0f);
                    outline.setRoundRect(0, (int) chatAttachAlertPhotoLayout.a0, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 4:
                o48 o48Var = (o48) view;
                if (o48Var.getTag() != null) {
                    int intValue = ((Integer) o48Var.getTag()).intValue();
                    e52 e52Var = (e52) obj;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = e52Var.w;
                    if (e52Var.d && chatAttachAlertPhotoLayout2.U0 == chatAttachAlertPhotoLayout2.V0 && !chatAttachAlertPhotoLayout2.P0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.h1) {
                        intValue++;
                    }
                    if (intValue == 0) {
                        int L2 = gl.L(16.0f);
                        outline.setRoundRect(0, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight() + L2, L2);
                        return;
                    } else if (intValue == chatAttachAlertPhotoLayout2.N0 - 1) {
                        int L3 = gl.L(16.0f);
                        outline.setRoundRect(-L3, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + L3, L3);
                        return;
                    } else {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    }
                }
                return;
            case 5:
                outline.setRoundRect(0, ((f37) obj).U + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), gl.L(8.0f));
                return;
            case 6:
                int L4 = gl.L(12.0f);
                aVar = ((d) ((PremiumPreviewFragment) obj)).actionBar;
                outline.setRoundRect(L4, gl.L(12.0f) + aVar.getBottom(), view.getWidth() - gl.L(12.0f), gl.L(16.0f) + view.getMeasuredHeight(), gl.L(16.0f));
                return;
            case 7:
                pfc pfcVar = (pfc) obj;
                float f6 = pfcVar.R;
                if (f6 >= 0.0f) {
                    if (f6 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), pfcVar.R);
                        return;
                    }
                } else if (!pfcVar.N) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (pfcVar.N) {
                        f2 = gl.L(4.0f);
                    } else {
                        f2 = 0.0f;
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f2);
                    return;
                }
            default:
                aic aicVar = (aic) obj;
                int i3 = (aicVar.b > 1.0f ? 1 : (aicVar.b == 1.0f ? 0 : -1));
                float f7 = aicVar.P;
                if (i3 < 0) {
                    outline.setRect((int) f7, (int) aicVar.O, (int) (view.getMeasuredWidth() - aicVar.P), (int) (view.getMeasuredHeight() - aicVar.O));
                    return;
                } else {
                    outline.setRoundRect((int) f7, (int) aicVar.O, (int) (view.getMeasuredWidth() - aicVar.P), (int) (view.getMeasuredHeight() - aicVar.O), aicVar.b);
                    return;
                }
        }
    }
}
