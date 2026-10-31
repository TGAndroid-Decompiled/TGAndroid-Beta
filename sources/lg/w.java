package lg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
public abstract class w extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final t[] f11994y = new t[3];
    public final t f11995a;
    public final Rect f11996b;
    public final Runnable f11997c;
    public final int d;
    public v e;
    public boolean f11998f;
    public boolean h;
    public boolean f11999n;
    public float f12000r;
    public float f12001s;
    public boolean f12002w;
    public boolean f12003x;

    public w(Context context, Runnable runnable, int i10) {
        super(context);
        this.f11996b = new Rect();
        this.h = true;
        this.f11997c = runnable;
        t[] tVarArr = f11994y;
        if (tVarArr[i10] == null) {
            tVarArr[i10] = new t(context.getApplicationContext(), i10);
        }
        t tVar = tVarArr[i10];
        this.f11995a = tVar;
        this.d = tVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override
    public final void doFrame(long j10) {
        boolean z10;
        u uVar;
        if (this.f11998f && !this.h) {
            this.f11997c.run();
            if (this.e != null) {
                if (isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.f11996b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v vVar = this.e;
                if (z10) {
                    uVar = new u(this.f12000r, this.f12001s, this.f12002w, this.f12003x);
                } else {
                    uVar = null;
                }
                vVar.e = uVar;
                this.f11995a.c();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11998f = true;
        setPaused(this.h);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f11999n = false;
        this.f11998f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f11999n = false;
        int i12 = this.d;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        v vVar = new v(this, new Surface(surfaceTexture), this.d);
        this.e = vVar;
        t tVar = this.f11995a;
        tVar.f11969f.add(vVar);
        tVar.f11970g = (v[]) tVar.f11969f.toArray(new v[0]);
        tVar.c();
        setPaused(this.h);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f11999n = false;
        v vVar = this.e;
        this.e = null;
        if (vVar != null) {
            t tVar = this.f11995a;
            tVar.getClass();
            vVar.f11987c = false;
            tVar.f11969f.remove(vVar);
            tVar.f11970g = (v[]) tVar.f11969f.toArray(new v[0]);
            tVar.f11967b.post(new k2.u(11, tVar, vVar));
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = this.d;
        surfaceTexture.setDefaultBufferSize(i12, i12);
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        v vVar;
        int i10 = this.d;
        surfaceTexture.setDefaultBufferSize(i10, i10);
        if (!this.f11999n && (vVar = this.e) != null && vVar.d) {
            this.f11999n = true;
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setPaused(boolean z10) {
        this.h = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f11998f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        v vVar = this.e;
        if (vVar != null) {
            vVar.e = null;
            this.f11995a.c();
        }
    }
}
