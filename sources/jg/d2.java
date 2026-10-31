package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.t5;
public final class d2 extends View {
    public final t5 D;
    public ig.c1 E;
    public float F;
    public float G;
    public ig.q1 H;
    public Runnable I;
    public boolean J;
    public c2 K;
    public final Paint f9921a;
    public final Paint f9922b;
    public final Path f9923c;
    public final m2.t d;
    public final RectF e;
    public boolean f9924f;
    public boolean h;
    public float f9925n;
    public float f9926r;
    public long f9927s;
    public boolean f9928w;
    public final t5 f9929x;
    public final t5 f9930y;

    public d2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f9921a = paint;
        Paint paint2 = new Paint(1);
        this.f9922b = paint2;
        this.f9923c = new Path();
        this.e = new RectF();
        this.f9928w = true;
        this.f9929x = new t5(this);
        this.f9930y = new t5(this);
        this.D = new t5(this);
        this.H = new ig.q1(1.0f, 0.016773745f, -1);
        this.J = true;
        this.d = new m2.t(context, new b2(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(org.telegram.messenger.i0.L(4.0f), 0.0f, org.telegram.messenger.i0.L(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(org.telegram.messenger.i0.L(3.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), 637534208);
    }

    public final void a(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set((f7 - f11) - org.telegram.messenger.i0.L(6.0f), (f10 - f11) - org.telegram.messenger.i0.L(6.0f), f7 + f11 + org.telegram.messenger.i0.L(6.0f), f10 + f11 + org.telegram.messenger.i0.L(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f9926r * 255.0f), 31);
        }
        canvas.drawCircle(f7, f10, f11, this.f9922b);
        if (z10) {
            canvas.restore();
        }
    }

    public final void b(float f7, float f10) {
        this.F = f7;
        this.G = f10;
        invalidate();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: jg.d2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int height = (int) (getHeight() * 0.3f);
        this.e.set(0.0f, (getHeight() - height) / 2.0f, org.telegram.messenger.i0.L(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f12684b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f9924f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f7) {
        this.H.f8434c = f7;
        invalidate();
    }

    public void setColorSwatch(ig.q1 q1Var) {
        this.H = q1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.I = runnable;
    }

    public void setRenderView(ig.c1 c1Var) {
        this.E = c1Var;
    }

    public void setShowPreview(boolean z10) {
        this.f9928w = z10;
        invalidate();
    }

    public void setValueOverride(c2 c2Var) {
        this.K = c2Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
