package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class b52 extends CameraView {
    public final s10 a;
    public boolean b;
    public final ChatAttachAlertPhotoLayout c;

    public b52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z, boolean z2) {
        super(context, z, z2);
        this.c = chatAttachAlertPhotoLayout;
        this.a = new s10(this, (byte) 6);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        RectF rectF;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        if (gl.m0) {
            return;
        }
        if (!this.b && (chatAttachAlertPhotoLayout.e0 || !chatAttachAlertPhotoLayout.c0)) {
            float translationY = (x02Var.b.getTranslationY() + (x02Var.D2[1] + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY();
            eb1 eb1Var = x02Var.B4;
            if (eb1Var != null) {
                f = eb1Var.d() + gl.L(8.0f);
            } else {
                f = 0.0f;
            }
            int min = (int) Math.min(translationY - f, getMeasuredHeight());
            boolean z = chatAttachAlertPhotoLayout.e0;
            if (z) {
                rectF = gl.P;
                float f2 = chatAttachAlertPhotoLayout.o1;
                float f3 = 1.0f - chatAttachAlertPhotoLayout.f0;
                rectF.set((0.0f * f3) + f2, (f3 * chatAttachAlertPhotoLayout.a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, gl.R1(Math.min(min, chatAttachAlertPhotoLayout.m1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f0));
            } else if (!z && !chatAttachAlertPhotoLayout.c0) {
                gl.P.set(0.0f, chatAttachAlertPhotoLayout.a0, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
                return;
            } else {
                rectF = gl.P;
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
        m21.a(chatAttachAlertPhotoLayout.Q, this.a);
        chatAttachAlertPhotoLayout.F.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m21.h(this.c.Q);
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
