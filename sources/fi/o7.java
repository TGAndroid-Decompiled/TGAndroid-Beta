package fi;

import a8.sa;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
public final class o7 extends View {
    public Paint f12381a;
    public boolean f12382b;
    public sa f12383c;
    public org.telegram.ui.Components.d6 d;
    public org.telegram.ui.Components.d6 f12384e;
    public float f12385f;

    public final void a(boolean z10) {
        sa saVar = this.f12383c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f10 = streamMaxVolume;
        int max = (int) Math.max(1.0f, f10 / 15.0f);
        if (z10) {
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
        this.f12385f = f11;
        if (!this.f12382b) {
            this.f12384e.e(true, f11);
        }
        invalidate();
        this.f12382b = true;
        org.telegram.messenger.g0.r(saVar);
        org.telegram.messenger.g0.h3(saVar, 2000L);
    }

    public final void b() {
        int i7;
        sa saVar = this.f12383c;
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
        } else if (!this.f12382b) {
            float f10 = streamVolume / streamMaxVolume;
            this.f12385f = f10;
            this.f12384e.e(true, f10);
            this.f12382b = true;
            invalidate();
            org.telegram.messenger.g0.r(saVar);
            org.telegram.messenger.g0.h3(saVar, 2000L);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint = this.f12381a;
        super.onDraw(canvas);
        org.telegram.ui.Components.d6 d6Var = this.f12384e;
        d6Var.e(false, this.f12385f);
        org.telegram.ui.Components.d6 d6Var2 = this.d;
        if (this.f12382b) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        d6Var2.e(false, f10);
        if (d6Var2.f34391c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (d6Var2.f34391c * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * d6Var.f34391c, getMeasuredHeight());
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
