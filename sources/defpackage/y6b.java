package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
public final class y6b extends View {
    public Paint a;
    public boolean b;
    public bva c;
    public mm d;
    public mm e;
    public float f;

    public final void a(boolean z) {
        bva bvaVar = this.c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f = streamMaxVolume;
        int max = (int) Math.max(1.0f, f / 15.0f);
        if (z) {
            int i = streamVolume + max;
            if (i <= streamMaxVolume) {
                streamMaxVolume = i;
            }
        } else {
            streamMaxVolume = streamVolume - max;
            if (streamMaxVolume < 0) {
                streamMaxVolume = 0;
            }
        }
        audioManager.setStreamVolume(3, streamMaxVolume, 0);
        float f2 = streamMaxVolume / f;
        this.f = f2;
        if (!this.b) {
            this.e.e(true, f2);
        }
        invalidate();
        this.b = true;
        hl.r(bvaVar);
        hl.d3(bvaVar, 2000L);
    }

    public final void b() {
        int i;
        bva bvaVar = this.c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (Build.VERSION.SDK_INT >= 28) {
            i = audioManager.getStreamMinVolume(3);
        } else {
            i = 0;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamVolume <= i) {
            a(true);
        } else if (!this.b) {
            float f = streamVolume / streamMaxVolume;
            this.f = f;
            this.e.e(true, f);
            this.b = true;
            invalidate();
            hl.r(bvaVar);
            hl.d3(bvaVar, 2000L);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        Paint paint = this.a;
        super.onDraw(canvas);
        mm mmVar = this.e;
        mmVar.e(false, this.f);
        mm mmVar2 = this.d;
        if (this.b) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        mmVar2.e(false, f);
        if (mmVar2.c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (mmVar2.c * 255.0f));
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * mmVar.c, getMeasuredHeight());
            canvas.drawRoundRect(rectF, measuredHeight, measuredHeight, paint);
        }
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i == 24) {
            a(true);
            return true;
        } else if (keyEvent.getAction() == 0 && i == 25) {
            a(false);
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }
}
