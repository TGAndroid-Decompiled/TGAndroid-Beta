package ih;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v7 extends View {
    public Paint f12259a;
    public boolean f12260b;
    public androidx.activity.i f12261c;
    public org.telegram.ui.Components.y5 d;
    public org.telegram.ui.Components.y5 f12262e;
    public float f12263f;

    public final void a(boolean z10) {
        androidx.activity.i iVar = this.f12261c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f10 = streamMaxVolume;
        int max = (int) Math.max(1.0f, f10 / 15.0f);
        if (z10) {
            int i9 = streamVolume + max;
            if (i9 <= streamMaxVolume) {
                streamMaxVolume = i9;
            }
        } else {
            streamMaxVolume = streamVolume - max;
            if (streamMaxVolume < 0) {
                streamMaxVolume = 0;
            }
        }
        audioManager.setStreamVolume(3, streamMaxVolume, 0);
        float f11 = streamMaxVolume / f10;
        this.f12263f = f11;
        if (!this.f12260b) {
            this.f12262e.d(f11, true);
        }
        invalidate();
        this.f12260b = true;
        AndroidUtilities.cancelRunOnUIThread(iVar);
        AndroidUtilities.runOnUIThread(iVar, 2000L);
    }

    public final void b() {
        int i9;
        androidx.activity.i iVar = this.f12261c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (Build.VERSION.SDK_INT >= 28) {
            i9 = audioManager.getStreamMinVolume(3);
        } else {
            i9 = 0;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamVolume <= i9) {
            a(true);
        } else if (!this.f12260b) {
            float f10 = streamVolume / streamMaxVolume;
            this.f12263f = f10;
            this.f12262e.d(f10, true);
            this.f12260b = true;
            invalidate();
            AndroidUtilities.cancelRunOnUIThread(iVar);
            AndroidUtilities.runOnUIThread(iVar, 2000L);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint = this.f12259a;
        super.onDraw(canvas);
        org.telegram.ui.Components.y5 y5Var = this.f12262e;
        y5Var.d(this.f12263f, false);
        org.telegram.ui.Components.y5 y5Var2 = this.d;
        if (this.f12260b) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        y5Var2.d(f10, false);
        if (y5Var2.f34854c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (y5Var2.f34854c * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * y5Var.f34854c, getMeasuredHeight());
            canvas.drawRoundRect(rectF, measuredHeight, measuredHeight, paint);
        }
    }

    @Override
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i9 == 24) {
            a(true);
            return true;
        } else if (keyEvent.getAction() == 0 && i9 == 25) {
            a(false);
            return true;
        } else {
            return super.onKeyDown(i9, keyEvent);
        }
    }
}
