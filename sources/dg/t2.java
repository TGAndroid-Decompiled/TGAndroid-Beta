package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.zz;
public final class t2 extends View {
    public cg.p1 B;
    public float C;
    public float D;
    public cg.f2 E;
    public Runnable F;
    public boolean G;
    public s2 H;
    public final Paint f4796a;
    public final Paint f4797b;
    public final Path f4798c;
    public final zz d;
    public final RectF e;
    public boolean f4799f;
    public boolean h;
    public float f4800n;
    public float f4801r;
    public long f4802s;
    public boolean v;
    public final z5 f4803w;
    public final z5 f4804x;
    public final z5 f4805y;

    public t2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f4796a = paint;
        Paint paint2 = new Paint(1);
        this.f4797b = paint2;
        this.f4798c = new Path();
        this.e = new RectF();
        this.v = true;
        this.f4803w = new z5(this);
        this.f4804x = new z5(this);
        this.f4805y = new z5(this);
        this.E = new cg.f2(1.0f, 0.016773745f, -1);
        this.G = true;
        this.d = new zz(context, new r2(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 637534208);
    }

    public final void a(float f10, float f11, float f12, Canvas canvas, boolean z4) {
        if (z4) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f10 - f12) - AndroidUtilities.dp(6.0f), (f11 - f12) - AndroidUtilities.dp(6.0f), f10 + f12 + AndroidUtilities.dp(6.0f), f11 + f12 + AndroidUtilities.dp(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f4801r * 255.0f), 31);
        }
        canvas.drawCircle(f10, f11, f12, this.f4797b);
        if (z4) {
            canvas.restore();
        }
    }

    public final void b(float f10, float f11) {
        this.C = f10;
        this.D = f11;
        invalidate();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: dg.t2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int height = (int) (getHeight() * 0.3f);
        this.e.set(0.0f, (getHeight() - height) / 2.0f, AndroidUtilities.dp(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f31508b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f4799f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f10) {
        this.E.f2386c = f10;
        invalidate();
    }

    public void setColorSwatch(cg.f2 f2Var) {
        this.E = f2Var;
        invalidate();
    }

    public void setDrawCenter(boolean z4) {
        this.G = z4;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.F = runnable;
    }

    public void setRenderView(cg.p1 p1Var) {
        this.B = p1Var;
    }

    public void setShowPreview(boolean z4) {
        this.v = z4;
        invalidate();
    }

    public void setValueOverride(s2 s2Var) {
        this.H = s2Var;
        invalidate();
    }

    public void setViewHidden(boolean z4) {
        this.h = z4;
        invalidate();
    }
}
