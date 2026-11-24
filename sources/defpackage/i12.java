package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
public final class i12 extends r59 {
    public final byte f3;
    public final Paint g3;
    public final Paint h3;
    public boolean i3;
    public boolean j3;
    public final Object k3;
    public final Object l3;

    public i12(Context context, byte b) {
        super(context, null);
        this.f3 = b;
        switch (b) {
            case 1:
                super(context, null);
                Paint paint = new Paint(1);
                this.g3 = paint;
                Paint paint2 = new Paint(1);
                this.h3 = paint2;
                this.k3 = new ln(this);
                this.l3 = new ln(this);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                return;
            default:
                d53 d53Var = d53.h;
                this.k3 = new fn0(320L, this, d53Var);
                this.l3 = new fn0(320L, this, d53Var);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, gm.L(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, gm.L(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                Paint paint3 = new Paint(1);
                this.g3 = paint3;
                Paint paint4 = new Paint(1);
                this.h3 = paint4;
                paint3.setShader(linearGradient);
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                paint4.setShader(linearGradient2);
                paint4.setXfermode(new PorterDuffXfermode(mode));
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        byte b = this.f3;
        Object obj = this.l3;
        Object obj2 = this.k3;
        switch (b) {
            case 0:
                this.j3 = false;
                this.i3 = false;
                super.dispatchDraw(canvas);
                ((fn0) obj2).a(this.i3, true);
                ((fn0) obj).a(this.j3, true);
                return;
            default:
                super.dispatchDraw(canvas);
                ln lnVar = (ln) obj2;
                float f2 = 1.0f;
                if (this.i3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                Paint paint = this.g3;
                paint.setAlpha((int) (lnVar.e(false, f) * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), gm.L(8.0f), paint);
                ln lnVar2 = (ln) obj;
                if (!this.j3) {
                    f2 = 0.0f;
                }
                Paint paint2 = this.h3;
                paint2.setAlpha((int) (lnVar2.e(false, f2) * 255.0f));
                canvas.save();
                canvas.translate(0.0f, getHeight() - gm.L(8.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), gm.L(8.0f), paint2);
                canvas.restore();
                return;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        boolean z2;
        switch (this.f3) {
            case 0:
                float x = view.getX();
                float width = view.getWidth() + x;
                boolean z3 = true;
                if (x < gm.L(10.0f)) {
                    z = true;
                } else {
                    z = false;
                }
                if (width > getMeasuredWidth() - gm.L(10.0f)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z && !z2) {
                    z3 = false;
                }
                this.i3 |= z;
                this.j3 |= z2;
                canvas.save();
                if (z3) {
                    canvas.clipRect(gm.L(19.0f), 0, getMeasuredWidth() - gm.L(19.0f), getMeasuredHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                if (z) {
                    float L = gm.L(11.0f);
                    canvas.saveLayer(L, getPaddingTop(), gm.L(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j);
                    canvas.save();
                    canvas.translate(kt6.B(1.0f, ((fn0) this.k3).e, gm.L(8.0f), L), 0.0f);
                    canvas.drawPaint(this.g3);
                    canvas.restore();
                    canvas.restore();
                }
                if (z2) {
                    float measuredWidth = getMeasuredWidth() - gm.L(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - gm.L(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j);
                    canvas.save();
                    canvas.translate(td4.A(1.0f, ((fn0) this.l3).e, gm.L(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.h3);
                    canvas.restore();
                    canvas.restore();
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void m0(int i) {
        switch (this.f3) {
            case 1:
                boolean canScrollVertically = canScrollVertically(-1);
                boolean canScrollVertically2 = canScrollVertically(1);
                if (canScrollVertically != this.i3 || canScrollVertically2 != this.j3) {
                    this.i3 = canScrollVertically;
                    this.j3 = canScrollVertically2;
                    invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int i3;
        switch (this.f3) {
            case 0:
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
                float f2 = 0.0f;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt instanceof d22) {
                        f2 = ((d22) childAt).a.d() + f2;
                    }
                }
                if (size > f2 && childCount > 0) {
                    i3 = (int) Math.floor((f - f2) / childCount);
                } else {
                    i3 = 0;
                }
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 instanceof d22) {
                        ((d22) childAt2).a.setAdditionalWidth(i3);
                    }
                }
                super.onMeasure(i, i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }
}
