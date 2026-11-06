package di;

import a8.ra;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
public final class y7 extends View {
    public Paint f9986a;
    public boolean f9987b;
    public ra f9988c;
    public org.telegram.ui.Components.w5 d;
    public org.telegram.ui.Components.w5 f9989e;
    public float f9990f;

    public final void a(boolean z9) {
        ra raVar = this.f9988c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f10 = streamMaxVolume;
        int max = (int) Math.max(1.0f, f10 / 15.0f);
        if (z9) {
            int i7 = streamVolume + max;
            if (i7 <= streamMaxVolume) {
                streamMaxVolume = i7;
            }
        } else {
            streamMaxVolume = streamVolume - max;
            if (streamMaxVolume < 0) {
                streamMaxVolume = 0;
            }
        }
        audioManager.setStreamVolume(3, streamMaxVolume, 0);
        float f11 = streamMaxVolume / f10;
        this.f9990f = f11;
        if (!this.f9987b) {
            this.f9989e.e(true, f11);
        }
        invalidate();
        this.f9987b = true;
        org.telegram.messenger.g0.r(raVar);
        org.telegram.messenger.g0.i3(raVar, 2000L);
    }

    public final void b() {
        int i7;
        ra raVar = this.f9988c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (Build.VERSION.SDK_INT >= 28) {
            i7 = audioManager.getStreamMinVolume(3);
        } else {
            i7 = 0;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamVolume <= i7) {
            a(true);
        } else if (!this.f9987b) {
            float f10 = streamVolume / streamMaxVolume;
            this.f9990f = f10;
            this.f9989e.e(true, f10);
            this.f9987b = true;
            invalidate();
            org.telegram.messenger.g0.r(raVar);
            org.telegram.messenger.g0.i3(raVar, 2000L);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint = this.f9986a;
        super.onDraw(canvas);
        org.telegram.ui.Components.w5 w5Var = this.f9989e;
        w5Var.e(false, this.f9990f);
        org.telegram.ui.Components.w5 w5Var2 = this.d;
        if (this.f9987b) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w5Var2.e(false, f10);
        if (w5Var2.f39849c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (w5Var2.f39849c * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * w5Var.f39849c, getMeasuredHeight());
            canvas.drawRoundRect(rectF, measuredHeight, measuredHeight, paint);
        }
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i7 == 24) {
            a(true);
            return true;
        } else if (keyEvent.getAction() == 0 && i7 == 25) {
            a(false);
            return true;
        } else {
            return super.onKeyDown(i7, keyEvent);
        }
    }
}
