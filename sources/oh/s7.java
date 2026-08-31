package oh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s7 extends View {
    public Paint f17746a;
    public boolean f17747b;
    public m2.b f17748c;
    public org.telegram.ui.Components.z5 d;
    public org.telegram.ui.Components.z5 f17749e;
    public float f17750f;

    public final void a(boolean z4) {
        m2.b bVar = this.f17748c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f10 = streamMaxVolume;
        int max = (int) Math.max(1.0f, f10 / 15.0f);
        if (z4) {
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
        float f11 = streamMaxVolume / f10;
        this.f17750f = f11;
        if (!this.f17747b) {
            this.f17749e.d(f11, true);
        }
        invalidate();
        this.f17747b = true;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 2000L);
    }

    public final void b() {
        int i10;
        m2.b bVar = this.f17748c;
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
        } else if (!this.f17747b) {
            float f10 = streamVolume / streamMaxVolume;
            this.f17750f = f10;
            this.f17749e.d(f10, true);
            this.f17747b = true;
            invalidate();
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar, 2000L);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint = this.f17746a;
        super.onDraw(canvas);
        org.telegram.ui.Components.z5 z5Var = this.f17749e;
        z5Var.d(this.f17750f, false);
        org.telegram.ui.Components.z5 z5Var2 = this.d;
        if (this.f17747b) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        z5Var2.d(f10, false);
        if (z5Var2.f33725c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (z5Var2.f33725c * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * z5Var.f33725c, getMeasuredHeight());
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
