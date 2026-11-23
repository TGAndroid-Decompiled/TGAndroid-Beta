package fi;

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
import org.telegram.messenger.mz;
import org.telegram.ui.Components.xy0;
public final class i0 extends Drawable {
    public final int f12124a;
    public Object f12125b;
    public float f12126c;
    public Object d;

    public i0() {
        this.f12124a = 2;
    }

    @Override
    public final void draw(Canvas canvas) {
        float min;
        switch (this.f12124a) {
            case 0:
                Rect bounds = getBounds();
                canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
                Drawable drawable = (Drawable) this.f12125b;
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                ((xy0) this.d).c(bounds.centerX() - (((xy0) this.d).f42246c / 2.0f), org.telegram.messenger.g0.L(0.15f) + bounds.centerY(), drawable.getAlpha() / 255.0f, -1, canvas);
                canvas.restore();
                return;
            case 1:
                float f10 = this.f12126c;
                canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, f10, f10, (Paint) this.d);
                bg.t.e((Drawable) this.f12125b, getBounds().exactCenterX(), getBounds().exactCenterY(), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), 17);
                ((Drawable) this.f12125b).draw(canvas);
                return;
            case 2:
                Paint paint = (Paint) this.d;
                if (this.f12126c != org.telegram.messenger.g0.f24045p) {
                    f();
                }
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                canvas.drawPath((Path) this.f12125b, paint);
                canvas.drawRect(org.telegram.messenger.g0.N(7.56f), org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.L(18.0f) - org.telegram.messenger.g0.N(7.56f), org.telegram.messenger.g0.N(11.1f), paint);
                canvas.restore();
                return;
            default:
                org.telegram.ui.Components.voip.n nVar = (org.telegram.ui.Components.voip.n) this.d;
                int i7 = nVar.f41185e;
                Matrix matrix = nVar.f41188i;
                nVar.f41186f = getBounds().width();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getBounds());
                nVar.a(this.f12126c, canvas, rectF, null);
                mz mzVar = (mz) this.f12125b;
                if (mzVar != null) {
                    mzVar.f25691c = nVar.f41182a;
                    int i10 = nVar.f41186f;
                    float f11 = (((i7 * 2) + i10) * nVar.f41187g) - i7;
                    int i11 = (int) (i10 * 0.5f);
                    int width = getBounds().width();
                    int height = getBounds().height();
                    float f12 = width / mzVar.f25692e;
                    float f13 = height / mzVar.f25693f;
                    if (mzVar.f25705s) {
                        min = Math.max(f12, f13);
                    } else {
                        min = Math.min(f12, f13);
                    }
                    matrix.reset();
                    matrix.setScale(1.0f / min, 0.0f, i7 / 2.0f, 0.0f);
                    matrix.setTranslate((f11 - mzVar.getBounds().left) - (i7 / min), 0.0f);
                    nVar.f41183b.setLocalMatrix(matrix);
                    int i12 = i11 / 2;
                    mzVar.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
                    mzVar.draw(canvas);
                }
                nVar.f41194o.invalidate();
                return;
        }
    }

    public void f() {
        int L = org.telegram.messenger.g0.L(18.0f);
        Path path = (Path) this.f12125b;
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
        this.f12126c = org.telegram.messenger.g0.f24045p;
    }

    @Override
    public int getAlpha() {
        switch (this.f12124a) {
            case 0:
                return ((Drawable) this.f12125b).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f12124a) {
            case 0:
                return (int) (((Drawable) this.f12125b).getIntrinsicHeight() * this.f12126c);
            case 1:
            default:
                return super.getIntrinsicHeight();
            case 2:
                return org.telegram.messenger.g0.L(18.0f);
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f12124a) {
            case 0:
                return (int) (((Drawable) this.f12125b).getIntrinsicWidth() * this.f12126c);
            case 1:
            default:
                return super.getIntrinsicWidth();
            case 2:
                return org.telegram.messenger.g0.L(18.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f12124a) {
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
        switch (this.f12124a) {
            case 0:
                ((Drawable) this.f12125b).setAlpha(i7);
                return;
            case 1:
            case 2:
                return;
            default:
                org.telegram.ui.Components.voip.n nVar = (org.telegram.ui.Components.voip.n) this.d;
                nVar.f41182a.setAlpha(i7);
                nVar.f41184c.setAlpha(i7);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f12124a) {
            case 0:
                ((Drawable) this.f12125b).setColorFilter(colorFilter);
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    public i0(Context context, float f10) {
        this.f12124a = 1;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f12125b = context.getResources().getDrawable(2131232150);
        paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.1552f, -16777216));
        this.f12126c = f10;
    }

    public i0(org.telegram.ui.Components.voip.n nVar, mz mzVar) {
        this.f12124a = 3;
        this.d = nVar;
        this.f12125b = mzVar;
    }

    public i0(Context context, int i7) {
        this.f12124a = 0;
        this.f12126c = 0.75f;
        this.f12125b = i5.c.g(context, 2131231174);
        xy0 xy0Var = new xy0(i5.c.i(i7, ""), 8.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        this.d = xy0Var;
        xy0Var.f42244a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
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
