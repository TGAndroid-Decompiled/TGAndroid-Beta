package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
public final class wrc extends it4 {
    public final yrc j0;

    public wrc(yrc yrcVar, Context context) {
        super(context, 1, 4);
        this.j0 = yrcVar;
    }

    @Override
    public final void h() {
        yrc yrcVar = this.j0;
        if (yrcVar.e == this) {
            yrcVar.h();
        }
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        int round = Math.round(Math.min(i, i2) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        super.onSurfaceTextureAvailable(surfaceTexture, round, round);
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        int round = Math.round(Math.min(i, i2) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        this.E = round;
        this.y = round;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int round = Math.round(Math.min(getWidth(), getHeight()) * 3.5f);
        if (round > 0) {
            surfaceTexture.setDefaultBufferSize(round, round);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.j0.y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
