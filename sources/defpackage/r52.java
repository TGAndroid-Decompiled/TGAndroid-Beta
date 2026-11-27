package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class r52 extends CameraView {
    public final t10 a;
    public boolean b;
    public final ChatAttachAlertPhotoLayout c;

    public r52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z, boolean z2) {
        super(context, z, z2);
        this.c = chatAttachAlertPhotoLayout;
        this.a = new t10(this, (byte) 6);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        RectF rectF;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        if (hl.m0) {
            return;
        }
        if (!this.b && (chatAttachAlertPhotoLayout.e0 || !chatAttachAlertPhotoLayout.c0)) {
            float translationY = (n12Var.b.getTranslationY() + (n12Var.D2[1] + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY();
            mb1 mb1Var = n12Var.B4;
            if (mb1Var != null) {
                f = mb1Var.d() + hl.L(8.0f);
            } else {
                f = 0.0f;
            }
            int min = (int) Math.min(translationY - f, getMeasuredHeight());
            boolean z = chatAttachAlertPhotoLayout.e0;
            if (z) {
                rectF = hl.P;
                float f2 = chatAttachAlertPhotoLayout.o1;
                float f3 = 1.0f - chatAttachAlertPhotoLayout.f0;
                rectF.set((0.0f * f3) + f2, (f3 * chatAttachAlertPhotoLayout.a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, hl.R1(Math.min(min, chatAttachAlertPhotoLayout.m1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f0));
            } else if (!z && !chatAttachAlertPhotoLayout.c0) {
                hl.P.set(0.0f, chatAttachAlertPhotoLayout.a0, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
                return;
            } else {
                rectF = hl.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
            }
            canvas.save();
            canvas.clipRect(rectF);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        v21.a(chatAttachAlertPhotoLayout.Q, this.a);
        chatAttachAlertPhotoLayout.F.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v21.h(this.c.Q);
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.c.F.invalidate();
    }

    @Override
    public final void showTexture(boolean z, boolean z2) {
        super.showTexture(z, z2);
        this.c.F.invalidate();
    }
}
