package ci;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j8 extends View {
    public Paint f5547a;
    public boolean f5548b;
    public androidx.activity.i f5549c;
    public org.telegram.ui.Components.f6 d;
    public org.telegram.ui.Components.f6 e;
    public float f5550f;

    public final void a(boolean z10) {
        androidx.activity.i iVar = this.f5549c;
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
        this.f5550f = f10;
        if (!this.f5548b) {
            this.e.d(f10, true);
        }
        invalidate();
        this.f5548b = true;
        AndroidUtilities.cancelRunOnUIThread(iVar);
        AndroidUtilities.runOnUIThread(iVar, 2000L);
    }

    public final void b() {
        int i10;
        androidx.activity.i iVar = this.f5549c;
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
        } else if (!this.f5548b) {
            float f7 = streamVolume / streamMaxVolume;
            this.f5550f = f7;
            this.e.d(f7, true);
            this.f5548b = true;
            invalidate();
            AndroidUtilities.cancelRunOnUIThread(iVar);
            AndroidUtilities.runOnUIThread(iVar, 2000L);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint = this.f5547a;
        super.onDraw(canvas);
        org.telegram.ui.Components.f6 f6Var = this.e;
        f6Var.d(this.f5550f, false);
        org.telegram.ui.Components.f6 f6Var2 = this.d;
        if (this.f5548b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        f6Var2.d(f7, false);
        if (f6Var2.f26086c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (f6Var2.f26086c * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * f6Var.f26086c, getMeasuredHeight());
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
