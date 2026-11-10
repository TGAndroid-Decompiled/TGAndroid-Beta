package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.rz;
import org.telegram.ui.Components.my0;
public final class j0 extends Drawable {
    public final int f9153a;
    public Object f9154b;
    public float f9155c;
    public Object d;

    public j0() {
        this.f9153a = 2;
    }

    @Override
    public final void draw(Canvas canvas) {
        float min;
        switch (this.f9153a) {
            case 0:
                Rect bounds = getBounds();
                canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
                Drawable drawable = (Drawable) this.f9154b;
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                ((my0) this.d).c(bounds.centerX() - (((my0) this.d).f36133c / 2.0f), org.telegram.messenger.g0.L(0.15f) + bounds.centerY(), drawable.getAlpha() / 255.0f, -1, canvas);
                canvas.restore();
                return;
            case 1:
                float f10 = this.f9155c;
                canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, f10, f10, (Paint) this.d);
                bg.s.e((Drawable) this.f9154b, getBounds().exactCenterX(), getBounds().exactCenterY(), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), 17);
                ((Drawable) this.f9154b).draw(canvas);
                return;
            case 2:
                Paint paint = (Paint) this.d;
                if (this.f9155c != org.telegram.messenger.g0.f22566p) {
                    f();
                }
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                canvas.drawPath((Path) this.f9154b, paint);
                canvas.drawRect(org.telegram.messenger.g0.N(7.56f), org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.L(18.0f) - org.telegram.messenger.g0.N(7.56f), org.telegram.messenger.g0.N(11.1f), paint);
                canvas.restore();
                return;
            default:
                org.telegram.ui.Components.voip.n nVar = (org.telegram.ui.Components.voip.n) this.d;
                int i7 = nVar.f39382e;
                Matrix matrix = nVar.f39385i;
                nVar.f39383f = getBounds().width();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getBounds());
                nVar.a(this.f9155c, canvas, rectF, null);
                rz rzVar = (rz) this.f9154b;
                if (rzVar != null) {
                    rzVar.f25385c = nVar.f39379a;
                    int i10 = nVar.f39383f;
                    float f11 = (((i7 * 2) + i10) * nVar.f39384g) - i7;
                    int i11 = (int) (i10 * 0.5f);
                    int width = getBounds().width();
                    int height = getBounds().height();
                    float f12 = width / rzVar.f25386e;
                    float f13 = height / rzVar.f25387f;
                    if (rzVar.f25399s) {
                        min = Math.max(f12, f13);
                    } else {
                        min = Math.min(f12, f13);
                    }
                    matrix.reset();
                    matrix.setScale(1.0f / min, 0.0f, i7 / 2.0f, 0.0f);
                    matrix.setTranslate((f11 - rzVar.getBounds().left) - (i7 / min), 0.0f);
                    nVar.f39380b.setLocalMatrix(matrix);
                    int i12 = i11 / 2;
                    rzVar.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
                    rzVar.draw(canvas);
                }
                nVar.f39391o.invalidate();
                return;
        }
    }

    public void f() {
        int L = org.telegram.messenger.g0.L(18.0f);
        Path path = (Path) this.f9154b;
        path.reset();
        float f10 = L >> 1;
        path.moveTo(f10, org.telegram.messenger.g0.N(4.98f));
        path.lineTo(org.telegram.messenger.g0.N(4.95f), org.telegram.messenger.g0.N(9.0f));
        path.lineTo(L - org.telegram.messenger.g0.N(4.95f), org.telegram.messenger.g0.N(9.0f));
        path.lineTo(f10, org.telegram.messenger.g0.N(4.98f));
        Paint paint = (Paint) this.d;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.0f));
        this.f9155c = org.telegram.messenger.g0.f22566p;
    }

    @Override
    public int getAlpha() {
        switch (this.f9153a) {
            case 0:
                return ((Drawable) this.f9154b).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f9153a) {
            case 0:
                return (int) (((Drawable) this.f9154b).getIntrinsicHeight() * this.f9155c);
            case 1:
            default:
                return super.getIntrinsicHeight();
            case 2:
                return org.telegram.messenger.g0.L(18.0f);
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f9153a) {
            case 0:
                return (int) (((Drawable) this.f9154b).getIntrinsicWidth() * this.f9155c);
            case 1:
            default:
                return super.getIntrinsicWidth();
            case 2:
                return org.telegram.messenger.g0.L(18.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f9153a) {
            case 0:
                return -2;
            case 1:
                return -3;
            case 2:
                return 0;
            default:
                return -3;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f9153a) {
            case 0:
                ((Drawable) this.f9154b).setAlpha(i7);
                return;
            case 1:
            case 2:
                return;
            default:
                org.telegram.ui.Components.voip.n nVar = (org.telegram.ui.Components.voip.n) this.d;
                nVar.f39379a.setAlpha(i7);
                nVar.f39381c.setAlpha(i7);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f9153a) {
            case 0:
                ((Drawable) this.f9154b).setColorFilter(colorFilter);
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    public j0(Context context, float f10) {
        this.f9153a = 1;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f9154b = context.getResources().getDrawable(2131232148);
        paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.1552f, -16777216));
        this.f9155c = f10;
    }

    public j0(org.telegram.ui.Components.voip.n nVar, rz rzVar) {
        this.f9153a = 3;
        this.d = nVar;
        this.f9154b = rzVar;
    }

    public j0(Context context, int i7) {
        this.f9153a = 0;
        this.f9155c = 0.75f;
        this.f9154b = jg.g.h(context, 2131231174);
        my0 my0Var = new my0(jg.g.j(i7, ""), 8.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        this.d = my0Var;
        my0Var.f36131a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private final void a(int i7) {
    }

    private final void b(int i7) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }
}
