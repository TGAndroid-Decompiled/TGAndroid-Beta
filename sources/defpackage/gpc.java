package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
public abstract class gpc extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final dpc[] y = new dpc[3];
    public final dpc a;
    public final Rect b;
    public final Runnable c;
    public final short d;
    public fpc e;
    public boolean f;
    public boolean h;
    public boolean n;
    public float r;
    public float s;
    public boolean w;
    public boolean x;

    public gpc(Context context, Runnable runnable, int i) {
        super(context);
        this.b = new Rect();
        this.h = true;
        this.c = runnable;
        dpc[] dpcVarArr = y;
        if (dpcVarArr[i] == null) {
            dpcVarArr[i] = new dpc(context.getApplicationContext(), i);
        }
        dpc dpcVar = dpcVarArr[i];
        this.a = dpcVar;
        dpcVar.getClass();
        this.d = (short) 378;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j) {
        boolean z;
        epc epcVar;
        if (this.f && !this.h) {
            this.c.run();
            if (this.e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.b)) {
                    z = true;
                } else {
                    z = false;
                }
                fpc fpcVar = this.e;
                if (z) {
                    epcVar = new epc(this.r, this.s, this.w, this.x);
                } else {
                    epcVar = null;
                }
                fpcVar.e = epcVar;
                this.a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.n = false;
        this.f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.n = false;
        short s = this.d;
        surfaceTexture.setDefaultBufferSize(s, s);
        fpc fpcVar = new fpc(this, new Surface(surfaceTexture), this.d);
        this.e = fpcVar;
        dpc dpcVar = this.a;
        dpcVar.e.add(fpcVar);
        dpcVar.f = (fpc[]) dpcVar.e.toArray(new fpc[0]);
        dpcVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.n = false;
        fpc fpcVar = this.e;
        this.e = null;
        if (fpcVar != null) {
            dpc dpcVar = this.a;
            dpcVar.getClass();
            fpcVar.c = false;
            dpcVar.e.remove(fpcVar);
            dpcVar.f = (fpc[]) dpcVar.e.toArray(new fpc[0]);
            dpcVar.b.post(new qhc(dpcVar, fpcVar, (byte) 20));
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        short s = this.d;
        surfaceTexture.setDefaultBufferSize(s, s);
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        fpc fpcVar;
        short s = this.d;
        surfaceTexture.setDefaultBufferSize(s, s);
        if (!this.n && (fpcVar = this.e) != null && fpcVar.d) {
            this.n = true;
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setPaused(boolean z) {
        this.h = z;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f && !z) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        fpc fpcVar = this.e;
        if (fpcVar != null) {
            fpcVar.e = null;
            this.a.c();
        }
    }
}
