package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d6;
public final class w2 extends View {
    public ag.t1 A;
    public float B;
    public float C;
    public ag.k2 D;
    public Runnable E;
    public boolean F;
    public v2 G;
    public final Paint f2590a;
    public final Paint f2591b;
    public final Path f2592c;
    public final o4.g d;
    public final RectF f2593e;
    public boolean f2594f;
    public boolean h;
    public float f2595n;
    public float f2596r;
    public long f2597s;
    public boolean v;
    public final d6 f2598w;
    public final d6 f2599x;
    public final d6 f2600y;

    public w2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f2590a = paint;
        Paint paint2 = new Paint(1);
        this.f2591b = paint2;
        this.f2592c = new Path();
        this.f2593e = new RectF();
        this.v = true;
        this.f2598w = new d6(this);
        this.f2599x = new d6(this);
        this.f2600y = new d6(this);
        this.D = new ag.k2(1.0f, 0.016773745f, -1);
        this.F = true;
        this.d = new o4.g(context, new u2(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 637534208);
    }

    public final void a(float f9, float f10, float f11, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f9 - f11) - AndroidUtilities.dp(6.0f), (f10 - f11) - AndroidUtilities.dp(6.0f), f9 + f11 + AndroidUtilities.dp(6.0f), f10 + f11 + AndroidUtilities.dp(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f2596r * 255.0f), 31);
        }
        canvas.drawCircle(f9, f10, f11, this.f2591b);
        if (z10) {
            canvas.restore();
        }
    }

    public final void b(float f9, float f10) {
        this.B = f9;
        this.C = f10;
        invalidate();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: bg.w2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int height = (int) (getHeight() * 0.3f);
        this.f2593e.set(0.0f, (getHeight() - height) / 2.0f, AndroidUtilities.dp(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f19159b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f2594f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f9) {
        this.D.f573c = f9;
        invalidate();
    }

    public void setColorSwatch(ag.k2 k2Var) {
        this.D = k2Var;
        invalidate();
    }

    public void setDrawCenter(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.E = runnable;
    }

    public void setRenderView(ag.t1 t1Var) {
        this.A = t1Var;
    }

    public void setShowPreview(boolean z10) {
        this.v = z10;
        invalidate();
    }

    public void setValueOverride(v2 v2Var) {
        this.G = v2Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
