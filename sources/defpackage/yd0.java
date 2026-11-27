package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class yd0 extends GradientDrawable {
    public final int[] a;
    public final qs b;
    public final qs c;
    public final qs d;
    public final ArrayList e;
    public final Paint f;
    public boolean g;

    public yd0(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.b = new vla(0);
        this.c = new vla(0);
        this.d = new vla(0);
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.g = false;
        setDither(true);
        this.a = iArr;
        paint.setDither(true);
    }

    public static GradientDrawable.Orientation c(int i) {
        if (i != 0) {
            if (i != 90) {
                if (i != 135) {
                    if (i != 180) {
                        if (i != 225) {
                            if (i != 270) {
                                if (i != 315) {
                                    return GradientDrawable.Orientation.BL_TR;
                                }
                                return GradientDrawable.Orientation.BR_TL;
                            }
                            return GradientDrawable.Orientation.RIGHT_LEFT;
                        }
                        return GradientDrawable.Orientation.TR_BL;
                    }
                    return GradientDrawable.Orientation.TOP_BOTTOM;
                }
                return GradientDrawable.Orientation.TL_BR;
            }
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
        return GradientDrawable.Orientation.BOTTOM_TOP;
    }

    public static Rect d(GradientDrawable.Orientation orientation, int i, int i2) {
        Rect rect = new Rect();
        switch (wd0.a[orientation.ordinal()]) {
            case 1:
                int i3 = i / 2;
                rect.left = i3;
                rect.top = 0;
                rect.right = i3;
                rect.bottom = i2;
                return rect;
            case 2:
                rect.left = i;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = i2;
                return rect;
            case 3:
                rect.left = i;
                int i4 = i2 / 2;
                rect.top = i4;
                rect.right = 0;
                rect.bottom = i4;
                return rect;
            case 4:
                rect.left = i;
                rect.top = i2;
                rect.right = 0;
                rect.bottom = 0;
                return rect;
            case 5:
                int i5 = i / 2;
                rect.left = i5;
                rect.top = i2;
                rect.right = i5;
                rect.bottom = 0;
                return rect;
            case 6:
                rect.left = 0;
                rect.top = i2;
                rect.right = i;
                rect.bottom = 0;
                return rect;
            case 7:
                rect.left = 0;
                int i6 = i2 / 2;
                rect.top = i6;
                rect.right = i;
                rect.bottom = i6;
                return rect;
            default:
                rect.left = 0;
                rect.top = 0;
                rect.right = i;
                rect.bottom = i2;
                return rect;
        }
    }

    public final void a() {
        if (!this.g) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                to3 to3Var = Utilities.e;
                Runnable[] runnableArr = (Runnable[]) this.e.remove(size);
                to3Var.getClass();
                for (Runnable runnable : runnableArr) {
                    to3Var.a(runnable);
                }
            }
            for (int i = this.b.c - 1; i >= 0; i--) {
                Bitmap bitmap = (Bitmap) this.b.g(i);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.c.clear();
            this.d.clear();
            this.g = true;
        }
    }

    public final xd0 b(Canvas canvas, final ViewGroup viewGroup) {
        if (this.g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        qs qsVar = this.b;
        int i = qsVar.c;
        int i2 = 0;
        while (true) {
            qs qsVar2 = this.d;
            if (i2 < i) {
                lr5 lr5Var = (lr5) qsVar.f(i2);
                if (lr5Var.a == width && lr5Var.b == height) {
                    Bitmap bitmap = (Bitmap) qsVar.i(i2);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f);
                    } else {
                        super.draw(canvas);
                    }
                    return (xd0) qsVar2.get(viewGroup);
                }
                i2++;
            } else {
                xd0 xd0Var = (xd0) qsVar2.remove(viewGroup);
                if (xd0Var != null) {
                    xd0Var.dispose();
                }
                lr5 lr5Var2 = new lr5(width, height);
                qsVar.put(lr5Var2, null);
                this.c.put(lr5Var2, Boolean.TRUE);
                final ud0 g = g(new lr5[]{lr5Var2}, new vd0(this, viewGroup), 0L);
                xd0 xd0Var2 = (xd0) qsVar2.put(viewGroup, new xd0() {
                    @Override
                    public final void dispose() {
                        yd0.this.d.remove(viewGroup);
                        g.dispose();
                    }
                });
                super.draw(canvas);
                return xd0Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        qs qsVar = this.b;
        int i = qsVar.c;
        float f = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            lr5 lr5Var = (lr5) qsVar.f(i2);
            float f2 = f;
            float sqrt = (float) Math.sqrt(Math.pow(height - lr5Var.b, 2.0d) + Math.pow(width - lr5Var.a, 2.0d));
            if (sqrt < f2 && (bitmap = (Bitmap) qsVar.i(i2)) != null && ((bool = (Boolean) this.c.get(lr5Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f = sqrt;
            } else {
                f = f2;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f);
        } else {
            super.draw(canvas);
        }
    }

    public final void e(Runnable[] runnableArr, Bitmap bitmap, lr5 lr5Var, int i, ksd[] ksdVarArr) {
        ArrayList arrayList = this.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        qs qsVar = this.b;
        if (bitmap != null) {
            qsVar.put(lr5Var, bitmap);
        } else {
            qsVar.remove(lr5Var);
            this.c.remove(lr5Var);
        }
        runnableArr[i] = null;
        boolean z = true;
        if (runnableArr.length > 1) {
            for (Runnable runnable : runnableArr) {
                if (runnable != null) {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            arrayList.remove(runnableArr);
        }
        ksd ksdVar = ksdVarArr[0];
        if (ksdVar != null) {
            ksdVar.b(lr5Var.a, lr5Var.b);
            if (!z) {
                ksdVarArr[0].a();
                ksdVarArr[0] = null;
            }
        }
    }

    public final ud0 f(ri6 ri6Var, ksd ksdVar, long j) {
        lr5[] lr5VarArr = (lr5[]) ri6Var.b;
        if (!this.g) {
            ArrayList arrayList = new ArrayList(lr5VarArr.length);
            for (lr5 lr5Var : lr5VarArr) {
                qs qsVar = this.b;
                if (!qsVar.containsKey(lr5Var)) {
                    qsVar.put(lr5Var, null);
                    arrayList.add(lr5Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((lr5[]) arrayList.toArray(new lr5[0]), ksdVar, j);
            }
        }
        return null;
    }

    public final void finalize() {
        try {
            a();
        } finally {
            super.finalize();
        }
    }

    public final ud0 g(lr5[] lr5VarArr, ksd ksdVar, long j) {
        yd0 yd0Var;
        if (lr5VarArr.length == 0) {
            return null;
        }
        ksd[] ksdVarArr = {ksdVar};
        Runnable[] runnableArr = new Runnable[lr5VarArr.length];
        this.e.add(runnableArr);
        int i = 0;
        while (i < lr5VarArr.length) {
            lr5 lr5Var = lr5VarArr[i];
            if (lr5Var.a != 0 && lr5Var.b != 0) {
                to3 to3Var = Utilities.e;
                yd0Var = this;
                td0 td0Var = new td0(yd0Var, lr5Var, runnableArr, i, ksdVarArr);
                runnableArr[i] = td0Var;
                to3Var.d(td0Var, j);
            } else {
                yd0Var = this;
            }
            i++;
            this = yd0Var;
        }
        return new ud0(this, ksdVarArr, runnableArr, lr5VarArr);
    }

    @Override
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.f.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f.setColorFilter(colorFilter);
    }
}
