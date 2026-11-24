package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
public final class zb1 {
    public static final int[] p = {16842910, 16842919};
    public zx2 a;
    public final ArrayList b = new ArrayList();
    public int c;
    public boolean d;
    public final fg0 e;
    public final View f;
    public final Paint g;
    public Runnable h;
    public boolean i;
    public Runnable j;
    public final o1 k;
    public boolean l;
    public final CornerPathEffect m;
    public boolean n;
    public final Paint o;

    public zb1(View view) {
        Paint paint = new Paint(1);
        this.g = paint;
        this.k = new o1(this, (byte) 12);
        this.f = view;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(gm.L(12.0f));
        this.m = cornerPathEffect;
        paint.setPathEffect(cornerPathEffect);
        Paint paint2 = new Paint(1);
        this.o = paint2;
        paint2.setFilterBitmap(true);
        paint2.setPathEffect(new CornerPathEffect(gm.L(12.0f)));
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        paint3.setColor(-1);
        ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{cmb.w0(null, cmb.h6, false) & 436207615}), null, new yb1(this, paint3));
        this.e = rippleDrawable;
        rippleDrawable.setCallback(view);
    }

    public final void a(RectF rectF) {
        int i = this.c + 1;
        this.c = i;
        ArrayList arrayList = this.b;
        if (i > arrayList.size()) {
            arrayList.add(new RectF());
        }
        ((RectF) arrayList.get(this.c - 1)).set(rectF);
    }

    public final boolean b(MotionEvent motionEvent) {
        Runnable runnable;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        View view = this.f;
        o1 o1Var = this.k;
        fg0 fg0Var = this.e;
        if (action == 0) {
            for (int i = 0; i < this.c; i++) {
                float f = x;
                float f2 = y;
                if (((RectF) this.b.get(i)).contains(f, f2)) {
                    this.d = true;
                    if (fg0Var != null) {
                        fg0Var.setHotspot(f, f2);
                        fg0Var.setState(p);
                    }
                    gm.r(o1Var);
                    if (this.l) {
                        gm.d3(o1Var, ViewConfiguration.getLongPressTimeout());
                    }
                    view.invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.d && fg0Var != null) {
                fg0Var.setHotspot(x, y);
            }
        } else {
            if (this.d) {
                if (motionEvent.getAction() == 1 && (runnable = this.h) != null) {
                    runnable.run();
                }
                view.playSoundEffect(0);
                if (fg0Var != null) {
                    fg0Var.setState(StateSet.NOTHING);
                }
                this.d = false;
                view.invalidate();
            }
            gm.r(o1Var);
        }
        return this.d;
    }

    public final void c(Canvas canvas, Paint paint) {
        int i = this.c;
        CornerPathEffect cornerPathEffect = this.m;
        fg0 fg0Var = this.e;
        int i2 = 0;
        ArrayList arrayList = this.b;
        if (i > 1) {
            if (!this.i) {
                zx2 zx2Var = this.a;
                if (zx2Var == null) {
                    this.a = new zx2(0);
                } else {
                    zx2Var.rewind();
                }
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int i7 = this.c;
                    if (i2 >= i7) {
                        break;
                    }
                    int i8 = i2 + 1;
                    if (i8 < i7) {
                        float f = ((RectF) arrayList.get(i2)).right;
                        float f2 = ((RectF) arrayList.get(i8)).right;
                        if (Math.abs(f - f2) < gm.L(4.0f)) {
                            float max = Math.max(f, f2);
                            ((RectF) arrayList.get(i2)).right = max;
                            ((RectF) arrayList.get(i8)).right = max;
                        }
                    }
                    if (i2 == 0 || ((RectF) arrayList.get(i2)).bottom > i3) {
                        i3 = (int) ((RectF) arrayList.get(i2)).bottom;
                    }
                    if (i2 == 0 || ((RectF) arrayList.get(i2)).right > i4) {
                        i4 = (int) ((RectF) arrayList.get(i2)).right;
                    }
                    if (i2 == 0 || ((RectF) arrayList.get(i2)).left < i5) {
                        i5 = (int) ((RectF) arrayList.get(i2)).left;
                    }
                    if (i2 == 0 || ((RectF) arrayList.get(i2)).top < i6) {
                        i6 = (int) ((RectF) arrayList.get(i2)).top;
                    }
                    this.a.addRect((RectF) arrayList.get(i2), Path.Direction.CCW);
                    if (fg0Var != null) {
                        fg0Var.setBounds(i5, i6, i4, i3);
                    }
                    i2 = i8;
                }
                this.a.a();
                this.i = true;
            }
            paint.setPathEffect(cornerPathEffect);
            zx2 zx2Var2 = this.a;
            if (zx2Var2 != null) {
                canvas.drawPath(zx2Var2, paint);
            }
        } else if (i == 1) {
            if (fg0Var != null) {
                fg0Var.setBounds((int) ((RectF) arrayList.get(0)).left, (int) ((RectF) arrayList.get(0)).top, (int) ((RectF) arrayList.get(0)).right, (int) ((RectF) arrayList.get(0)).bottom);
            }
            if (this.n) {
                paint.setPathEffect(null);
                float min = Math.min(((RectF) arrayList.get(0)).width(), ((RectF) arrayList.get(0)).height()) / 2.0f;
                canvas.drawRoundRect((RectF) arrayList.get(0), min, min, paint);
                return;
            }
            paint.setPathEffect(cornerPathEffect);
            canvas.drawRoundRect((RectF) arrayList.get(0), 0.0f, 0.0f, paint);
        }
    }
}
