package jh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class r7 extends View {

    public Paint f13916a;

    public boolean f13917b;

    public a8.b f13918c;
    public org.telegram.ui.Components.y5 d;

    public org.telegram.ui.Components.y5 f13919e;

    public float f13920f;

    public final void a(boolean z10) {
        a8.b bVar = this.f13918c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f10 = streamMaxVolume;
        int iMax = (int) Math.max(1.0f, f10 / 15.0f);
        if (z10) {
            int i10 = streamVolume + iMax;
            if (i10 <= streamMaxVolume) {
                streamMaxVolume = i10;
            }
        } else {
            streamMaxVolume = streamVolume - iMax;
            if (streamMaxVolume < 0) {
                streamMaxVolume = 0;
            }
        }
        audioManager.setStreamVolume(3, streamMaxVolume, 0);
        float f11 = streamMaxVolume / f10;
        this.f13920f = f11;
        if (!this.f13917b) {
            this.f13919e.d(f11, true);
        }
        invalidate();
        this.f13917b = true;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 2000L);
    }

    public final void b() {
        a8.b bVar = this.f13918c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamVolume <= streamMinVolume) {
            a(true);
            return;
        }
        if (this.f13917b) {
            return;
        }
        float f10 = streamVolume / streamMaxVolume;
        this.f13920f = f10;
        this.f13919e.d(f10, true);
        this.f13917b = true;
        invalidate();
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 2000L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f13916a;
        super.onDraw(canvas);
        org.telegram.ui.Components.y5 y5Var = this.f13919e;
        y5Var.d(this.f13920f, false);
        org.telegram.ui.Components.y5 y5Var2 = this.d;
        y5Var2.d(this.f13917b ? 1.0f : 0.0f, false);
        if (y5Var2.f34812c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (y5Var2.f34812c * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * y5Var.f34812c, getMeasuredHeight());
            canvas.drawRoundRect(rectF, measuredHeight, measuredHeight, paint);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i10 == 24) {
            a(true);
            return true;
        }
        if (keyEvent.getAction() != 0 || i10 != 25) {
            return super.onKeyDown(i10, keyEvent);
        }
        a(false);
        return true;
    }
}
