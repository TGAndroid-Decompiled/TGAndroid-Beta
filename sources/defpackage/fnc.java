package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
public abstract class fnc extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final cnc[] y = new cnc[3];
    public final cnc a;
    public final Rect b;
    public final Runnable c;
    public final short d;
    public enc e;
    public boolean f;
    public boolean h;
    public boolean n;
    public float r;
    public float s;
    public boolean w;
    public boolean x;

    public fnc(Context context, Runnable runnable, int i) {
        super(context);
        this.b = new Rect();
        this.h = true;
        this.c = runnable;
        cnc[] cncVarArr = y;
        if (cncVarArr[i] == null) {
            cncVarArr[i] = new cnc(context.getApplicationContext(), i);
        }
        cnc cncVar = cncVarArr[i];
        this.a = cncVar;
        cncVar.getClass();
        this.d = (short) 378;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j) {
        boolean z;
        dnc dncVar;
        if (this.f && !this.h) {
            this.c.run();
            if (this.e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.b)) {
                    z = true;
                } else {
                    z = false;
                }
                enc encVar = this.e;
                if (z) {
                    dncVar = new dnc(this.r, this.s, this.w, this.x);
                } else {
                    dncVar = null;
                }
                encVar.e = dncVar;
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
        enc encVar = new enc(this, new Surface(surfaceTexture), this.d);
        this.e = encVar;
        cnc cncVar = this.a;
        cncVar.e.add(encVar);
        cncVar.f = (enc[]) cncVar.e.toArray(new enc[0]);
        cncVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.n = false;
        enc encVar = this.e;
        this.e = null;
        if (encVar != null) {
            cnc cncVar = this.a;
            cncVar.getClass();
            encVar.c = false;
            cncVar.e.remove(encVar);
            cncVar.f = (enc[]) cncVar.e.toArray(new enc[0]);
            cncVar.b.post(new mhc(cncVar, encVar, (byte) 18));
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
        enc encVar;
        short s = this.d;
        surfaceTexture.setDefaultBufferSize(s, s);
        if (!this.n && (encVar = this.e) != null && encVar.d) {
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
        enc encVar = this.e;
        if (encVar != null) {
            encVar.e = null;
            this.a.c();
        }
    }
}
