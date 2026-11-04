package ei;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
public final class y7 extends View {
    public Paint f11245a;
    public boolean f11246b;
    public a3.o f11247c;
    public org.telegram.ui.Components.u5 d;
    public org.telegram.ui.Components.u5 f11248e;
    public float f11249f;

    public final void a(boolean z10) {
        a3.o oVar = this.f11247c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f10 = streamMaxVolume;
        int max = (int) Math.max(1.0f, f10 / 15.0f);
        if (z10) {
            int i3 = streamVolume + max;
            if (i3 <= streamMaxVolume) {
                streamMaxVolume = i3;
            }
        } else {
            streamMaxVolume = streamVolume - max;
            if (streamMaxVolume < 0) {
                streamMaxVolume = 0;
            }
        }
        audioManager.setStreamVolume(3, streamMaxVolume, 0);
        float f11 = streamMaxVolume / f10;
        this.f11249f = f11;
        if (!this.f11246b) {
            this.f11248e.e(true, f11);
        }
        invalidate();
        this.f11246b = true;
        org.telegram.messenger.g0.r(oVar);
        org.telegram.messenger.g0.i3(oVar, 2000L);
    }

    public final void b() {
        int i3;
        a3.o oVar = this.f11247c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (Build.VERSION.SDK_INT >= 28) {
            i3 = audioManager.getStreamMinVolume(3);
        } else {
            i3 = 0;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamVolume <= i3) {
            a(true);
        } else if (!this.f11246b) {
            float f10 = streamVolume / streamMaxVolume;
            this.f11249f = f10;
            this.f11248e.e(true, f10);
            this.f11246b = true;
            invalidate();
            org.telegram.messenger.g0.r(oVar);
            org.telegram.messenger.g0.i3(oVar, 2000L);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint = this.f11245a;
        super.onDraw(canvas);
        org.telegram.ui.Components.u5 u5Var = this.f11248e;
        u5Var.e(false, this.f11249f);
        org.telegram.ui.Components.u5 u5Var2 = this.d;
        if (this.f11246b) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u5Var2.e(false, f10);
        if (u5Var2.f38645c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (u5Var2.f38645c * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * u5Var.f38645c, getMeasuredHeight());
            canvas.drawRoundRect(rectF, measuredHeight, measuredHeight, paint);
        }
    }

    @Override
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i3 == 24) {
            a(true);
            return true;
        } else if (keyEvent.getAction() == 0 && i3 == 25) {
            a(false);
            return true;
        } else {
            return super.onKeyDown(i3, keyEvent);
        }
    }
}
