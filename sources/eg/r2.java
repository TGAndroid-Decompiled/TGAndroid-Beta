package eg;

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
public final class r2 extends View {
    public dg.o1 B;
    public float C;
    public float D;
    public dg.e2 E;
    public Runnable F;
    public boolean G;
    public q2 H;
    public final Paint f5453a;
    public final Paint f5454b;
    public final Path f5455c;
    public final org.telegram.ui.Cells.f1 d;
    public final RectF f5456e;
    public boolean f5457f;
    public boolean h;
    public float f5458n;
    public float f5459r;
    public long f5460s;
    public boolean v;
    public final z5 f5461w;
    public final z5 f5462x;
    public final z5 f5463y;

    public r2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f5453a = paint;
        Paint paint2 = new Paint(1);
        this.f5454b = paint2;
        this.f5455c = new Path();
        this.f5456e = new RectF();
        this.v = true;
        this.f5461w = new z5(this);
        this.f5462x = new z5(this);
        this.f5463y = new z5(this);
        this.E = new dg.e2(1.0f, 0.016773745f, -1);
        this.G = true;
        this.d = new org.telegram.ui.Cells.f1(context, new p2(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 637534208);
    }

    public final void a(float f10, float f11, float f12, Canvas canvas, boolean z4) {
        if (z4) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f10 - f12) - AndroidUtilities.dp(6.0f), (f11 - f12) - AndroidUtilities.dp(6.0f), f10 + f12 + AndroidUtilities.dp(6.0f), f11 + f12 + AndroidUtilities.dp(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f5459r * 255.0f), 31);
        }
        canvas.drawCircle(f10, f11, f12, this.f5454b);
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
        throw new UnsupportedOperationException("Method not decompiled: eg.r2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int height = (int) (getHeight() * 0.3f);
        this.f5456e.set(0.0f, (getHeight() - height) / 2.0f, AndroidUtilities.dp(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f22790b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f5457f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f10) {
        this.E.f4526c = f10;
        invalidate();
    }

    public void setColorSwatch(dg.e2 e2Var) {
        this.E = e2Var;
        invalidate();
    }

    public void setDrawCenter(boolean z4) {
        this.G = z4;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.F = runnable;
    }

    public void setRenderView(dg.o1 o1Var) {
        this.B = o1Var;
    }

    public void setShowPreview(boolean z4) {
        this.v = z4;
        invalidate();
    }

    public void setValueOverride(q2 q2Var) {
        this.H = q2Var;
        invalidate();
    }

    public void setViewHidden(boolean z4) {
        this.h = z4;
        invalidate();
    }
}
