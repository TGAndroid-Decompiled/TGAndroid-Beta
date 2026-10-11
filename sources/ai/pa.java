package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class pa extends View {
    public Paint f1586a;
    public boolean f1587b;
    public r4 f1588c;
    public org.telegram.ui.Components.g6 d;
    public org.telegram.ui.Components.g6 f1589e;
    public float f1590f;

    public final void a(boolean z10) {
        r4 r4Var = this.f1588c;
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
        this.f1590f = f10;
        if (!this.f1587b) {
            this.f1589e.d(f10, true);
        }
        invalidate();
        this.f1587b = true;
        AndroidUtilities.cancelRunOnUIThread(r4Var);
        AndroidUtilities.runOnUIThread(r4Var, 2000L);
    }

    public final void b() {
        int i10;
        r4 r4Var = this.f1588c;
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
        } else if (!this.f1587b) {
            float f7 = streamVolume / streamMaxVolume;
            this.f1590f = f7;
            this.f1589e.d(f7, true);
            this.f1587b = true;
            invalidate();
            AndroidUtilities.cancelRunOnUIThread(r4Var);
            AndroidUtilities.runOnUIThread(r4Var, 2000L);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint = this.f1586a;
        super.onDraw(canvas);
        org.telegram.ui.Components.g6 g6Var = this.f1589e;
        g6Var.d(this.f1590f, false);
        org.telegram.ui.Components.g6 g6Var2 = this.d;
        if (this.f1587b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        g6Var2.d(f7, false);
        if (g6Var2.f26613c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (g6Var2.f26613c * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * g6Var.f26613c, getMeasuredHeight());
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
