package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oa extends View {
    public Paint f1363a;
    public boolean f1364b;
    public q4 f1365c;
    public org.telegram.ui.Components.e6 d;
    public org.telegram.ui.Components.e6 e;
    public float f1366f;

    public final void a(boolean z10) {
        q4 q4Var = this.f1365c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f7 = streamMaxVolume;
        int max = (int) Math.max(1.0f, f7 / 15.0f);
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
        float f10 = streamMaxVolume / f7;
        this.f1366f = f10;
        if (!this.f1364b) {
            this.e.d(f10, true);
        }
        invalidate();
        this.f1364b = true;
        AndroidUtilities.cancelRunOnUIThread(q4Var);
        AndroidUtilities.runOnUIThread(q4Var, 2000L);
    }

    public final void b() {
        int i10;
        q4 q4Var = this.f1365c;
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
        } else if (!this.f1364b) {
            float f7 = streamVolume / streamMaxVolume;
            this.f1366f = f7;
            this.e.d(f7, true);
            this.f1364b = true;
            invalidate();
            AndroidUtilities.cancelRunOnUIThread(q4Var);
            AndroidUtilities.runOnUIThread(q4Var, 2000L);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint = this.f1363a;
        super.onDraw(canvas);
        org.telegram.ui.Components.e6 e6Var = this.e;
        e6Var.d(this.f1366f, false);
        org.telegram.ui.Components.e6 e6Var2 = this.d;
        if (this.f1364b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e6Var2.d(f7, false);
        if (e6Var2.f23817c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (e6Var2.f23817c * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * e6Var.f23817c, getMeasuredHeight());
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
