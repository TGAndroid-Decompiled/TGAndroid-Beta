package gh;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.voip.c1;
import org.telegram.ui.Components.voip.z1;
import org.telegram.ui.Components.x90;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.wm;
public final class a extends ViewOutlineProvider {
    public final int f12274a;
    public final Object f12275b;

    public a(Object obj, int i3) {
        this.f12274a = i3;
        this.f12275b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f10;
        int i3 = this.f12274a;
        float f11 = 0.0f;
        Object obj = this.f12275b;
        switch (i3) {
            case 0:
                ((g) obj).getOutline(outline);
                return;
            case 1:
                wm wmVar = (wm) obj;
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
                outline.setOval(0, 0, g0.g3(wmVar.Z9(), wmVar.Q9()), g0.g3(wmVar.Z9(), wmVar.Q9()));
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                bi biVar = chatAttachAlertPhotoLayout.f38416b;
                float f12 = biVar.B2[1];
                gi.i iVar = biVar.f32301z4;
                if (iVar != null) {
                    f10 = iVar.d() + g0.L(16.0f);
                } else {
                    f10 = 0.0f;
                }
                int min = (int) Math.min((biVar.f28586b.getTranslationY() + ((f12 - f10) + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.f31267c0) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f31271e0) {
                    min = g0.W1(chatAttachAlertPhotoLayout.f31273f0, min, view.getMeasuredHeight());
                }
                boolean z10 = chatAttachAlertPhotoLayout.f31271e0;
                if (z10) {
                    RectF rectF = g0.P;
                    float f13 = chatAttachAlertPhotoLayout.f31290o1;
                    boolean z11 = ChatAttachAlertPhotoLayout.f31258r1;
                    float f14 = 1.0f - chatAttachAlertPhotoLayout.f31273f0;
                    rectF.set((0.0f * f14) + f13, (f14 * chatAttachAlertPhotoLayout.f31263a0) + chatAttachAlertPhotoLayout.f31285l1, chatAttachAlertPhotoLayout.f31288n1, chatAttachAlertPhotoLayout.m1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z10 && !chatAttachAlertPhotoLayout.f31267c0) {
                    int L = g0.L(16.0f);
                    boolean z12 = ChatAttachAlertPhotoLayout.f31258r1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.f31263a0, view.getMeasuredWidth() + L, Math.min(min, view.getMeasuredHeight()) + L, L);
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
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = slVar.f38055w;
                    if (slVar.d && chatAttachAlertPhotoLayout2.U0 == chatAttachAlertPhotoLayout2.V0 && !chatAttachAlertPhotoLayout2.P0) {
                        intValue++;
                    }
                    if (chatAttachAlertPhotoLayout2.f31278h1) {
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
                int i12 = ((k40) obj).X0;
                outline.setOval(0, 0, i12, i12);
                return;
            case 5:
                outline.setRoundRect(0, ((x90) obj).U + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), g0.L(8.0f));
                return;
            case 6:
                c1 c1Var = (c1) obj;
                float f15 = c1Var.R;
                if (f15 >= 0.0f) {
                    if (f15 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), c1Var.R);
                        return;
                    }
                } else if (!c1Var.N) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (c1Var.N) {
                        f11 = g0.L(4.0f);
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f11);
                    return;
                }
            case 7:
                z1 z1Var = (z1) obj;
                if (z1Var.f39732b < 1.0f) {
                    outline.setRect((int) z1Var.P, (int) z1Var.O, (int) (view.getMeasuredWidth() - z1Var.P), (int) (view.getMeasuredHeight() - z1Var.O));
                    return;
                } else {
                    outline.setRoundRect((int) z1Var.P, (int) z1Var.O, (int) (view.getMeasuredWidth() - z1Var.P), (int) (view.getMeasuredHeight() - z1Var.O), z1Var.f39732b);
                    return;
                }
            default:
                outline.setRoundRect(g0.L(12.0f), g0.L(12.0f) + PremiumPreviewFragment.j0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - g0.L(12.0f), g0.L(16.0f) + view.getMeasuredHeight(), g0.L(16.0f));
                return;
        }
    }
}
