package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class hd extends Drawable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public hd(int i, ylb ylbVar, Context context, boolean z) {
        String str;
        this.a = (byte) 3;
        if (z) {
            str = "BoostLevelPlus";
        } else {
            str = "BoostLevel";
        }
        this.c = new uib(jb6.G(i, str, new Object[0]), 12.0f, gm.o());
        Drawable d = b10.d(context, 2131231981);
        this.b = d;
        d.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.d = new nj8(cmb.Bk, cmb.Ck, -1, -1, ylbVar);
    }

    public final void c(int i) {
        Rect rect = (Rect) this.c;
        if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == i) {
            return;
        }
        rect.set(0, 0, 0, i);
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                Drawable drawable = (Drawable) obj2;
                drawable.setBounds(getBounds());
                drawable.draw(canvas);
                float e = ((ln) obj3).e(false, 1.0f);
                float width = (bounds.width() * 0.352f) + bounds.left;
                float height = (bounds.height() * 0.248f) + bounds.top;
                float width2 = bounds.width() * 0.105f * ((float) (1.0d - Math.sin(gm.s(e, 0.0f, 2.0f, 1.5f) * 3.141592653589793d)));
                float width3 = (bounds.width() * 0.215f) + bounds.left;
                float height2 = (bounds.height() * 0.43f) + bounds.top;
                float width4 = bounds.width() * 0.09f * ((float) (1.0d - Math.sin(gm.s(e, 1.0f, 2.0f, 1.5f) * 3.141592653589793d)));
                Drawable drawable2 = (Drawable) obj;
                drawable2.setBounds((int) (width - width2), (int) (height - width2), (int) (width + width2), (int) (height + width2));
                drawable2.draw(canvas);
                drawable2.setBounds((int) (width3 - width4), (int) (height2 - width4), (int) (width3 + width4), (int) (height2 + width4));
                drawable2.draw(canvas);
                return;
            case 1:
                Paint paint = (Paint) obj2;
                Rect rect = (Rect) obj3;
                if (!rect.isEmpty() && paint.getAlpha() != 0 && !gm.m0) {
                    canvas.drawRect(rect, paint);
                    return;
                }
                return;
            case 2:
                Paint paint2 = (Paint) obj3;
                rc2 rc2Var = (rc2) obj2;
                int v = cmb.v(cmb.v0(cmb.qa, rc2Var.cc), cmb.p1(0.5f, cmb.v0(cmb.x6, rc2Var.cc)));
                int[] iArr = (int[]) obj;
                if (v != iArr[0]) {
                    int alpha = paint2.getAlpha();
                    iArr[0] = v;
                    paint2.setColor(v);
                    paint2.setAlpha(alpha);
                }
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint2);
                return;
            case 3:
                int i = getBounds().left;
                int centerY = getBounds().centerY();
                RectF rectF = gm.P;
                float f = centerY;
                rectF.set(i, f - (gm.L(18.33f) / 2.0f), getIntrinsicWidth() + i, (gm.L(18.33f) / 2.0f) + f);
                nj8 nj8Var = (nj8) obj3;
                nj8Var.e(rectF);
                canvas.drawRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), nj8Var.f);
                Drawable drawable3 = (Drawable) obj2;
                drawable3.setBounds(gm.L(3.33f) + i, (int) (f - ((drawable3.getIntrinsicHeight() * 0.875f) / 2.0f)), (int) ((drawable3.getIntrinsicWidth() * 0.875f) + gm.L(3.33f) + i), (int) kt6.d(drawable3.getIntrinsicHeight(), 0.875f, 2.0f, f));
                drawable3.draw(canvas);
                ((uib) obj).c(gm.L(3.66f) + i + (drawable3.getIntrinsicWidth() * 0.875f), f, 1.0f, -1, canvas);
                return;
            default:
                Rect bounds2 = getBounds();
                float L = gm.L(25.0f);
                tca tcaVar = (tca) obj3;
                float min = Math.min(bounds2.top, tcaVar.r1 - tcaVar.l1.getY());
                Paint paint3 = (Paint) obj2;
                paint3.setColor(cmb.v0(cmb.g5, tcaVar.J0));
                Path path = (Path) obj;
                path.rewind();
                path.addRoundRect(bounds2.left, min, bounds2.right, bounds2.bottom + L, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(bounds2);
                canvas.drawPath(path, paint3);
                canvas.restore();
                return;
        }
    }

    @Override
    public final int getAlpha() {
        switch (this.a) {
            case 1:
                return ((Paint) this.b).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return ((Drawable) this.b).getIntrinsicHeight();
            case 3:
                return gm.L(18.33f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return ((Drawable) this.b).getIntrinsicWidth();
            case 3:
                float intrinsicWidth = ((Drawable) this.b).getIntrinsicWidth() * 0.875f;
                return (int) (((uib) this.c).j() + intrinsicWidth + gm.L(9.66f));
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.a) {
            case 0:
            case 2:
            case 3:
                return -2;
            case 1:
                return 0;
            default:
                return -3;
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 1:
                super.onBoundsChange(rect);
                Rect rect2 = (Rect) this.d;
                rect2.set(rect);
                int i = rect2.left;
                Rect rect3 = (Rect) this.c;
                rect2.left = Math.max(0, rect3.left) + i;
                rect2.top = Math.max(0, rect3.top) + rect2.top;
                rect2.right -= Math.max(0, rect3.right);
                rect2.bottom -= Math.max(0, rect3.bottom);
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((Drawable) obj).setAlpha(i);
                ((Drawable) obj2).setAlpha(i);
                return;
            case 1:
                ((Paint) obj).setAlpha(i);
                invalidateSelf();
                return;
            case 2:
                ((Paint) this.d).setAlpha(cmb.p1(i / 255.0f, ((int[]) obj2)[0]));
                return;
            case 3:
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Drawable) obj).setColorFilter(colorFilter);
                ((Drawable) this.c).setColorFilter(colorFilter);
                return;
            case 1:
                ((Paint) obj).setColorFilter(colorFilter);
                return;
            case 2:
                ((Paint) this.d).setColorFilter(colorFilter);
                return;
            case 3:
            default:
                return;
        }
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }

    public hd() {
        this.a = (byte) 1;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Rect();
        this.d = new Rect();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setColor(-16777216);
    }

    public hd(rc2 rc2Var, int[] iArr, Paint paint) {
        this.a = (byte) 2;
        this.b = rc2Var;
        this.c = iArr;
        this.d = paint;
    }

    public hd(tca tcaVar) {
        this.a = (byte) 4;
        this.d = tcaVar;
        this.b = new Paint(1);
        this.c = new Path();
    }

    public hd(Context context) {
        this.a = (byte) 0;
        this.d = new ln(new gd(this, (byte) 0), 1200L, d53.h, 0);
        this.b = b10.d(context, 2131231497);
        this.c = b10.d(context, 2131231498);
    }
}
