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
public final class bic extends ekc {
    public final Path s;
    public final RectF w;
    public up x;
    public final iic y;

    public bic(Activity activity, boolean z, iic iicVar) {
        super(activity);
        this.y = iicVar;
        this.c = new po(null);
        this.a = activity;
        setSystemUiVisibility(1792);
        gm.e2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z) {
            this.e = true;
        }
        this.s = new Path();
        this.w = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        iic iicVar = this.y;
        if (iicVar.E0 && getAlpha() != 0.0f) {
            float scaleX = iicVar.d0.getScaleX() * iicVar.d0.getWidth();
            float scaleY = iicVar.d0.getScaleY() * iicVar.d0.getHeight();
            float x = iicVar.d0.getX() + ((iicVar.d0.getWidth() - scaleX) / 2.0f);
            float y = iicVar.d0.getY() + ((iicVar.d0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.s;
            path.rewind();
            RectF rectF = this.w;
            rectF.set(x, y, scaleX + x, scaleY + y);
            float L = gm.L(4.0f);
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
        iic iicVar = this.y;
        if (!iicVar.G0 && !iicVar.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                iicVar.g();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && iicVar.p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
            this.x = s4.j(this, new thc(this.y, (byte) 14));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        up upVar;
        if (Build.VERSION.SDK_INT >= 33 && (upVar = this.x) != null) {
            s4.l(this, upVar);
            this.x = null;
        }
        super.onDetachedFromWindow();
    }
}
