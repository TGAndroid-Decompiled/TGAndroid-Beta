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
    public Paint f1360a;
    public boolean f1361b;
    public q4 f1362c;
    public org.telegram.ui.Components.c6 d;
    public org.telegram.ui.Components.c6 e;
    public float f1363f;

    public final void a(boolean z10) {
        q4 q4Var = this.f1362c;
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
        this.f1363f = f10;
        if (!this.f1361b) {
            this.e.d(f10, true);
        }
        invalidate();
        this.f1361b = true;
        AndroidUtilities.cancelRunOnUIThread(q4Var);
        AndroidUtilities.runOnUIThread(q4Var, 2000L);
    }

    public final void b() {
        int i10;
        q4 q4Var = this.f1362c;
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
        } else if (!this.f1361b) {
            float f7 = streamVolume / streamMaxVolume;
            this.f1363f = f7;
            this.e.d(f7, true);
            this.f1361b = true;
            invalidate();
            AndroidUtilities.cancelRunOnUIThread(q4Var);
            AndroidUtilities.runOnUIThread(q4Var, 2000L);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint = this.f1360a;
        super.onDraw(canvas);
        org.telegram.ui.Components.c6 c6Var = this.e;
        c6Var.d(this.f1363f, false);
        org.telegram.ui.Components.c6 c6Var2 = this.d;
        if (this.f1361b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        c6Var2.d(f7, false);
        if (c6Var2.f22953c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (c6Var2.f22953c * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * c6Var.f22953c, getMeasuredHeight());
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
