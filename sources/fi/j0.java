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
import org.telegram.messenger.pz;
import org.telegram.ui.Components.oy0;
public final class j0 extends Drawable {
    public final int f11888a;
    public Object f11889b;
    public float f11890c;
    public Object d;

    public j0() {
        this.f11888a = 2;
    }

    @Override
    public final void draw(Canvas canvas) {
        float min;
        switch (this.f11888a) {
            case 0:
                Rect bounds = getBounds();
                canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
                Drawable drawable = (Drawable) this.f11889b;
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                ((oy0) this.d).c(bounds.centerX() - (((oy0) this.d).f38103c / 2.0f), org.telegram.messenger.g0.L(0.15f) + bounds.centerY(), drawable.getAlpha() / 255.0f, -1, canvas);
                canvas.restore();
                return;
            case 1:
                float f10 = this.f11890c;
                canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, f10, f10, (Paint) this.d);
                bg.s.e((Drawable) this.f11889b, getBounds().exactCenterX(), getBounds().exactCenterY(), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), 17);
                ((Drawable) this.f11889b).draw(canvas);
                return;
            case 2:
                Paint paint = (Paint) this.d;
                if (this.f11890c != org.telegram.messenger.g0.f23610p) {
                    f();
                }
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                canvas.drawPath((Path) this.f11889b, paint);
                canvas.drawRect(org.telegram.messenger.g0.N(7.56f), org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.L(18.0f) - org.telegram.messenger.g0.N(7.56f), org.telegram.messenger.g0.N(11.1f), paint);
                canvas.restore();
                return;
            default:
                org.telegram.ui.Components.voip.n nVar = (org.telegram.ui.Components.voip.n) this.d;
                int i7 = nVar.f40797e;
                Matrix matrix = nVar.f40800i;
                nVar.f40798f = getBounds().width();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getBounds());
                nVar.a(this.f11890c, canvas, rectF, null);
                pz pzVar = (pz) this.f11889b;
                if (pzVar != null) {
                    pzVar.f26028c = nVar.f40794a;
                    int i10 = nVar.f40798f;
                    float f11 = (((i7 * 2) + i10) * nVar.f40799g) - i7;
                    int i11 = (int) (i10 * 0.5f);
                    int width = getBounds().width();
                    int height = getBounds().height();
                    float f12 = width / pzVar.f26029e;
                    float f13 = height / pzVar.f26030f;
                    if (pzVar.f26042s) {
                        min = Math.max(f12, f13);
                    } else {
                        min = Math.min(f12, f13);
                    }
                    matrix.reset();
                    matrix.setScale(1.0f / min, 0.0f, i7 / 2.0f, 0.0f);
                    matrix.setTranslate((f11 - pzVar.getBounds().left) - (i7 / min), 0.0f);
                    nVar.f40795b.setLocalMatrix(matrix);
                    int i12 = i11 / 2;
                    pzVar.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
                    pzVar.draw(canvas);
                }
                nVar.f40806o.invalidate();
                return;
        }
    }

    public void f() {
        int L = org.telegram.messenger.g0.L(18.0f);
        Path path = (Path) this.f11889b;
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
        this.f11890c = org.telegram.messenger.g0.f23610p;
    }

    @Override
    public int getAlpha() {
        switch (this.f11888a) {
            case 0:
                return ((Drawable) this.f11889b).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f11888a) {
            case 0:
                return (int) (((Drawable) this.f11889b).getIntrinsicHeight() * this.f11890c);
            case 1:
            default:
                return super.getIntrinsicHeight();
            case 2:
                return org.telegram.messenger.g0.L(18.0f);
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f11888a) {
            case 0:
                return (int) (((Drawable) this.f11889b).getIntrinsicWidth() * this.f11890c);
            case 1:
            default:
                return super.getIntrinsicWidth();
            case 2:
                return org.telegram.messenger.g0.L(18.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f11888a) {
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
        switch (this.f11888a) {
            case 0:
                ((Drawable) this.f11889b).setAlpha(i7);
                return;
            case 1:
            case 2:
                return;
            default:
                org.telegram.ui.Components.voip.n nVar = (org.telegram.ui.Components.voip.n) this.d;
                nVar.f40794a.setAlpha(i7);
                nVar.f40796c.setAlpha(i7);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f11888a) {
            case 0:
                ((Drawable) this.f11889b).setColorFilter(colorFilter);
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    public j0(Context context, float f10) {
        this.f11888a = 1;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f11889b = context.getResources().getDrawable(2131232149);
        paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.1552f, -16777216));
        this.f11890c = f10;
    }

    public j0(org.telegram.ui.Components.voip.n nVar, pz pzVar) {
        this.f11888a = 3;
        this.d = nVar;
        this.f11889b = pzVar;
    }

    public j0(Context context, int i7) {
        this.f11888a = 0;
        this.f11890c = 0.75f;
        this.f11889b = i5.c.g(context, 2131231174);
        oy0 oy0Var = new oy0(i5.c.i(i7, ""), 8.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        this.d = oy0Var;
        oy0Var.f38101a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
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
