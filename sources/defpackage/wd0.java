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
public final class wd0 extends GradientDrawable {
    public final int[] a;
    public final ps b;
    public final ps c;
    public final ps d;
    public final ArrayList e;
    public final Paint f;
    public boolean g;

    public wd0(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.b = new aia(0);
        this.c = new aia(0);
        this.d = new aia(0);
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
        switch (ud0.a[orientation.ordinal()]) {
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
                co3 co3Var = Utilities.e;
                Runnable[] runnableArr = (Runnable[]) this.e.remove(size);
                co3Var.getClass();
                for (Runnable runnable : runnableArr) {
                    co3Var.a(runnable);
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

    public final vd0 b(Canvas canvas, final ViewGroup viewGroup) {
        if (this.g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        ps psVar = this.b;
        int i = psVar.c;
        int i2 = 0;
        while (true) {
            ps psVar2 = this.d;
            if (i2 < i) {
                ip5 ip5Var = (ip5) psVar.f(i2);
                if (ip5Var.a == width && ip5Var.b == height) {
                    Bitmap bitmap = (Bitmap) psVar.i(i2);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f);
                    } else {
                        super.draw(canvas);
                    }
                    return (vd0) psVar2.get(viewGroup);
                }
                i2++;
            } else {
                vd0 vd0Var = (vd0) psVar2.remove(viewGroup);
                if (vd0Var != null) {
                    vd0Var.dispose();
                }
                ip5 ip5Var2 = new ip5(width, height);
                psVar.put(ip5Var2, null);
                this.c.put(ip5Var2, Boolean.TRUE);
                final sd0 g = g(new ip5[]{ip5Var2}, new td0(this, viewGroup), 0L);
                vd0 vd0Var2 = (vd0) psVar2.put(viewGroup, new vd0() {
                    @Override
                    public final void dispose() {
                        wd0.this.d.remove(viewGroup);
                        g.dispose();
                    }
                });
                super.draw(canvas);
                return vd0Var2;
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
        ps psVar = this.b;
        int i = psVar.c;
        float f = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            ip5 ip5Var = (ip5) psVar.f(i2);
            float f2 = f;
            float sqrt = (float) Math.sqrt(Math.pow(height - ip5Var.b, 2.0d) + Math.pow(width - ip5Var.a, 2.0d));
            if (sqrt < f2 && (bitmap = (Bitmap) psVar.i(i2)) != null && ((bool = (Boolean) this.c.get(ip5Var)) == null || !bool.booleanValue())) {
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

    public final void e(Runnable[] runnableArr, Bitmap bitmap, ip5 ip5Var, int i, tnd[] tndVarArr) {
        ArrayList arrayList = this.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        ps psVar = this.b;
        if (bitmap != null) {
            psVar.put(ip5Var, bitmap);
        } else {
            psVar.remove(ip5Var);
            this.c.remove(ip5Var);
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
        tnd tndVar = tndVarArr[0];
        if (tndVar != null) {
            tndVar.b(ip5Var.a, ip5Var.b);
            if (!z) {
                tndVarArr[0].a();
                tndVarArr[0] = null;
            }
        }
    }

    public final sd0 f(l69 l69Var, tnd tndVar, long j) {
        ip5[] ip5VarArr = (ip5[]) l69Var.b;
        if (!this.g) {
            ArrayList arrayList = new ArrayList(ip5VarArr.length);
            for (ip5 ip5Var : ip5VarArr) {
                ps psVar = this.b;
                if (!psVar.containsKey(ip5Var)) {
                    psVar.put(ip5Var, null);
                    arrayList.add(ip5Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((ip5[]) arrayList.toArray(new ip5[0]), tndVar, j);
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

    public final sd0 g(ip5[] ip5VarArr, tnd tndVar, long j) {
        wd0 wd0Var;
        if (ip5VarArr.length == 0) {
            return null;
        }
        tnd[] tndVarArr = {tndVar};
        Runnable[] runnableArr = new Runnable[ip5VarArr.length];
        this.e.add(runnableArr);
        int i = 0;
        while (i < ip5VarArr.length) {
            ip5 ip5Var = ip5VarArr[i];
            if (ip5Var.a != 0 && ip5Var.b != 0) {
                co3 co3Var = Utilities.e;
                wd0Var = this;
                rd0 rd0Var = new rd0(wd0Var, ip5Var, runnableArr, i, tndVarArr);
                runnableArr[i] = rd0Var;
                co3Var.d(rd0Var, j);
            } else {
                wd0Var = this;
            }
            i++;
            this = wd0Var;
        }
        return new sd0(this, tndVarArr, runnableArr, ip5VarArr);
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
