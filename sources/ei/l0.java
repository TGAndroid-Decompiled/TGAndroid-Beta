package ei;

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
import org.telegram.messenger.jz;
import org.telegram.ui.Components.ly0;
public final class l0 extends Drawable {
    public final int f10599a;
    public Object f10600b;
    public float f10601c;
    public Object d;

    public l0() {
        this.f10599a = 2;
    }

    @Override
    public final void draw(Canvas canvas) {
        float min;
        switch (this.f10599a) {
            case 0:
                Rect bounds = getBounds();
                canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
                Drawable drawable = (Drawable) this.f10600b;
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                ((ly0) this.d).c(bounds.centerX() - (((ly0) this.d).f35918c / 2.0f), org.telegram.messenger.g0.L(0.15f) + bounds.centerY(), drawable.getAlpha() / 255.0f, -1, canvas);
                canvas.restore();
                return;
            case 1:
                float f10 = this.f10601c;
                canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, f10, f10, (Paint) this.d);
                cg.r.e((Drawable) this.f10600b, getBounds().exactCenterX(), getBounds().exactCenterY(), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), 17);
                ((Drawable) this.f10600b).draw(canvas);
                return;
            case 2:
                Paint paint = (Paint) this.d;
                if (this.f10601c != org.telegram.messenger.g0.f22607p) {
                    f();
                }
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                canvas.drawPath((Path) this.f10600b, paint);
                canvas.drawRect(org.telegram.messenger.g0.N(7.56f), org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.L(18.0f) - org.telegram.messenger.g0.N(7.56f), org.telegram.messenger.g0.N(11.1f), paint);
                canvas.restore();
                return;
            default:
                org.telegram.ui.Components.voip.g gVar = (org.telegram.ui.Components.voip.g) this.d;
                int i3 = gVar.f39348e;
                Matrix matrix = gVar.f39351i;
                gVar.f39349f = getBounds().width();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getBounds());
                gVar.a(this.f10601c, canvas, rectF, null);
                jz jzVar = (jz) this.f10600b;
                if (jzVar != null) {
                    jzVar.f23762c = gVar.f39345a;
                    int i10 = gVar.f39349f;
                    float f11 = (((i3 * 2) + i10) * gVar.f39350g) - i3;
                    int i11 = (int) (i10 * 0.5f);
                    int width = getBounds().width();
                    int height = getBounds().height();
                    float f12 = width / jzVar.f23763e;
                    float f13 = height / jzVar.f23764f;
                    if (jzVar.f23776s) {
                        min = Math.max(f12, f13);
                    } else {
                        min = Math.min(f12, f13);
                    }
                    matrix.reset();
                    matrix.setScale(1.0f / min, 0.0f, i3 / 2.0f, 0.0f);
                    matrix.setTranslate((f11 - jzVar.getBounds().left) - (i3 / min), 0.0f);
                    gVar.f39346b.setLocalMatrix(matrix);
                    int i12 = i11 / 2;
                    jzVar.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
                    jzVar.draw(canvas);
                }
                gVar.f39357o.invalidate();
                return;
        }
    }

    public void f() {
        int L = org.telegram.messenger.g0.L(18.0f);
        Path path = (Path) this.f10600b;
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
        this.f10601c = org.telegram.messenger.g0.f22607p;
    }

    @Override
    public int getAlpha() {
        switch (this.f10599a) {
            case 0:
                return ((Drawable) this.f10600b).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f10599a) {
            case 0:
                return (int) (((Drawable) this.f10600b).getIntrinsicHeight() * this.f10601c);
            case 1:
            default:
                return super.getIntrinsicHeight();
            case 2:
                return org.telegram.messenger.g0.L(18.0f);
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f10599a) {
            case 0:
                return (int) (((Drawable) this.f10600b).getIntrinsicWidth() * this.f10601c);
            case 1:
            default:
                return super.getIntrinsicWidth();
            case 2:
                return org.telegram.messenger.g0.L(18.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f10599a) {
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
    public final void setAlpha(int i3) {
        switch (this.f10599a) {
            case 0:
                ((Drawable) this.f10600b).setAlpha(i3);
                return;
            case 1:
            case 2:
                return;
            default:
                org.telegram.ui.Components.voip.g gVar = (org.telegram.ui.Components.voip.g) this.d;
                gVar.f39345a.setAlpha(i3);
                gVar.f39347c.setAlpha(i3);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f10599a) {
            case 0:
                ((Drawable) this.f10600b).setColorFilter(colorFilter);
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    public l0(Context context, float f10) {
        this.f10599a = 1;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f10600b = context.getResources().getDrawable(2131232148);
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1552f, -16777216));
        this.f10601c = f10;
    }

    public l0(org.telegram.ui.Components.voip.g gVar, jz jzVar) {
        this.f10599a = 3;
        this.d = gVar;
        this.f10600b = jzVar;
    }

    public l0(Context context, int i3) {
        this.f10599a = 0;
        this.f10601c = 0.75f;
        this.f10600b = k2.p1.g(context, 2131231174);
        ly0 ly0Var = new ly0(k2.p1.i(i3, ""), 8.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        this.d = ly0Var;
        ly0Var.f35916a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private final void a(int i3) {
    }

    private final void b(int i3) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }
}
