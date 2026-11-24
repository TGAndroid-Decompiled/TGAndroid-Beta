package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.KeyEvent;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;
public final class agc extends eic {
    public final Path s;
    public final RectF w;
    public uo x;
    public final hgc y;

    public agc(Activity activity, boolean z, hgc hgcVar) {
        super(activity);
        this.y = hgcVar;
        this.c = new on(null);
        this.a = activity;
        setSystemUiVisibility(1792);
        gl.e2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z) {
            this.e = true;
        }
        this.s = new Path();
        this.w = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        hgc hgcVar = this.y;
        if (hgcVar.E0 && getAlpha() != 0.0f) {
            float scaleX = hgcVar.d0.getScaleX() * hgcVar.d0.getWidth();
            float scaleY = hgcVar.d0.getScaleY() * hgcVar.d0.getHeight();
            float x = hgcVar.d0.getX() + ((hgcVar.d0.getWidth() - scaleX) / 2.0f);
            float y = hgcVar.d0.getY() + ((hgcVar.d0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.s;
            path.rewind();
            RectF rectF = this.w;
            rectF.set(x, y, scaleX + x, scaleY + y);
            float L = gl.L(4.0f);
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            path.close();
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        VoIPServiceState sharedState;
        hgc hgcVar = this.y;
        if (!hgcVar.G0 && !hgcVar.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                hgcVar.g();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && hgcVar.p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
                sharedState.stopRinging();
                return true;
            } else {
                return super.dispatchKeyEvent(keyEvent);
            }
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.y.l1) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 33 && this.x == null) {
            this.x = s4.j(this, new sfc(this.y, (byte) 14));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        uo uoVar;
        if (Build.VERSION.SDK_INT >= 33 && (uoVar = this.x) != null) {
            s4.l(this, uoVar);
            this.x = null;
        }
        super.onDetachedFromWindow();
    }
}
