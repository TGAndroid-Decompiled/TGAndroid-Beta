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
    public Paint f9974a;
    public boolean f9975b;
    public ra f9976c;
    public org.telegram.ui.Components.v5 d;
    public org.telegram.ui.Components.v5 f9977e;
    public float f9978f;

    public final void a(boolean z9) {
        ra raVar = this.f9976c;
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
        this.f9978f = f11;
        if (!this.f9975b) {
            this.f9977e.e(true, f11);
        }
        invalidate();
        this.f9975b = true;
        org.telegram.messenger.g0.r(raVar);
        org.telegram.messenger.g0.i3(raVar, 2000L);
    }

    public final void b() {
        int i7;
        ra raVar = this.f9976c;
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
        } else if (!this.f9975b) {
            float f10 = streamVolume / streamMaxVolume;
            this.f9978f = f10;
            this.f9977e.e(true, f10);
            this.f9975b = true;
            invalidate();
            org.telegram.messenger.g0.r(raVar);
            org.telegram.messenger.g0.i3(raVar, 2000L);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint = this.f9974a;
        super.onDraw(canvas);
        org.telegram.ui.Components.v5 v5Var = this.f9977e;
        v5Var.e(false, this.f9978f);
        org.telegram.ui.Components.v5 v5Var2 = this.d;
        if (this.f9975b) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v5Var2.e(false, f10);
        if (v5Var2.f38854c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (v5Var2.f38854c * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * v5Var.f38854c, getMeasuredHeight());
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
