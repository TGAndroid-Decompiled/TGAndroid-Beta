package lh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s7 extends View {
    public Paint f16241a;
    public boolean f16242b;
    public m7 f16243c;
    public org.telegram.ui.Components.d6 d;
    public org.telegram.ui.Components.d6 f16244e;
    public float f16245f;

    public final void a(boolean z10) {
        m7 m7Var = this.f16243c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f9 = streamMaxVolume;
        int max = (int) Math.max(1.0f, f9 / 15.0f);
        if (z10) {
            int i10 = streamVolume + max;
            if (i10 <= streamMaxVolume) {
                streamMaxVolume = i10;
            }
        } else {
            streamMaxVolume = streamVolume - max;
            if (streamMaxVolume < 0) {
                streamMaxVolume = 0;
            }
        }
        audioManager.setStreamVolume(3, streamMaxVolume, 0);
        float f10 = streamMaxVolume / f9;
        this.f16245f = f10;
        if (!this.f16242b) {
            this.f16244e.d(f10, true);
        }
        invalidate();
        this.f16242b = true;
        AndroidUtilities.cancelRunOnUIThread(m7Var);
        AndroidUtilities.runOnUIThread(m7Var, 2000L);
    }

    public final void b() {
        int i10;
        m7 m7Var = this.f16243c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (Build.VERSION.SDK_INT >= 28) {
            i10 = audioManager.getStreamMinVolume(3);
        } else {
            i10 = 0;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamVolume <= i10) {
            a(true);
        } else if (!this.f16242b) {
            float f9 = streamVolume / streamMaxVolume;
            this.f16245f = f9;
            this.f16244e.d(f9, true);
            this.f16242b = true;
            invalidate();
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            AndroidUtilities.runOnUIThread(m7Var, 2000L);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        Paint paint = this.f16241a;
        super.onDraw(canvas);
        org.telegram.ui.Components.d6 d6Var = this.f16244e;
        d6Var.d(this.f16245f, false);
        org.telegram.ui.Components.d6 d6Var2 = this.d;
        if (this.f16242b) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        d6Var2.d(f9, false);
        if (d6Var2.f27666c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (d6Var2.f27666c * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * d6Var.f27666c, getMeasuredHeight());
            canvas.drawRoundRect(rectF, measuredHeight, measuredHeight, paint);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i10 == 24) {
            a(true);
            return true;
        } else if (keyEvent.getAction() == 0 && i10 == 25) {
            a(false);
            return true;
        } else {
            return super.onKeyDown(i10, keyEvent);
        }
    }
}
