package defpackage;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class a09 extends Path {
    public final rc2 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final zx2 j;
    public final ln k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public zz8 q;
    public final int r;
    public final qkb s;
    public final int t;
    public final ArrayList u;

    public a09(final rc2 rc2Var, final ViewParent viewParent, int i, ArrayList arrayList, int i2, int i3, float f) {
        int i4;
        float f2;
        int L;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new zx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        this.k = new ln(0.0f, new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                ViewParent viewParent2 = viewParent;
                rc2 rc2Var2 = rc2Var;
                switch (b) {
                    case 0:
                        rc2Var2.invalidate();
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        rc2Var2.invalidate();
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, d53.h);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = false;
        this.f = false;
        if (arrayList == null) {
            return;
        }
        int L2 = gm.L(4.0f);
        this.h = L2;
        paint.setPathEffect(new CornerPathEffect(L2));
        boolean z = false;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            h47 h47Var = (h47) arrayList.get(i5);
            if (h47Var != null && i2 <= h47Var.r && i3 >= (i4 = h47Var.n)) {
                int max = Math.max(0, i2 - i4);
                int i6 = h47Var.n;
                int min = Math.min(i3 - i6, h47Var.r - i6);
                float f3 = -f;
                this.n = f3;
                if (h47Var.I && !h47Var.J) {
                    if (h47Var.V) {
                        L = gm.L(14.0f);
                    } else {
                        L = gm.L(10.0f);
                    }
                    this.n = f3 + L;
                }
                this.o = h47Var.o(arrayList) + h47Var.f;
                if (h47Var.J) {
                    f2 = gm.L(10.0f);
                } else {
                    f2 = 0.0f;
                }
                this.p = f2;
                if (!z && !gm.J1(h47Var.e.getText())) {
                    z = false;
                } else {
                    z = true;
                }
                StaticLayout staticLayout = h47Var.e;
                if (z) {
                    staticLayout.getSelectionPath(max, min, this);
                } else {
                    e(staticLayout, max, min);
                }
                if (h47Var.K && h47Var.f()) {
                    this.m.add(Integer.valueOf(h47Var.c));
                }
            }
        }
        d();
    }

    public static void b(zx2 zx2Var, zz8 zz8Var, float f, float f2, Rect rect, float f3) {
        qkb qkbVar;
        float f4;
        qkb qkbVar2;
        float f5;
        float f6;
        float f7 = 0.0f;
        if (zz8Var.j != null) {
            f4 = qkbVar.getX() - zz8Var.k;
        } else {
            f4 = 0.0f;
        }
        if (zz8Var.j != null) {
            f7 = qkbVar2.getY() - zz8Var.l;
        }
        float R1 = gm.R1(rect.left - f, zz8Var.a + f4, f3);
        if (zz8Var.e) {
            f5 = rect.top - f2;
        } else {
            f5 = zz8Var.g + f7;
        }
        float R12 = gm.R1(f5, zz8Var.c + f7, f3);
        float R13 = gm.R1(rect.right - f, zz8Var.b + f4, f3);
        if (zz8Var.f) {
            f6 = rect.bottom - f2;
        } else {
            f6 = zz8Var.h + f7;
        }
        zx2Var.addRect(R1, R12, R13, gm.R1(f6, zz8Var.d + f7, f3), Path.Direction.CW);
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f >= f3) {
            return;
        }
        float f5 = this.p;
        float max = Math.max(f5, f);
        float max2 = Math.max(f5, f3);
        float f6 = this.n;
        float f7 = max + f6;
        float f8 = this.o;
        float f9 = f2 + f8;
        float f10 = max2 + f6;
        ?? obj = new Object();
        obj.a = f7 - gm.L(3.0f);
        obj.b = f10 + gm.L(3.0f);
        obj.c = f9;
        obj.d = f4 + f8;
        obj.i = this.r;
        qkb qkbVar = this.s;
        obj.j = qkbVar;
        if (qkbVar != null) {
            obj.k = qkbVar.getX();
            obj.l = qkbVar.getY();
        }
        zz8 zz8Var = this.q;
        if (zz8Var != null) {
            float f11 = zz8Var.d;
            zz8Var.h = (f11 + f9) / 2.0f;
            obj.g = (f11 + f9) / 2.0f;
        }
        this.l.add(obj);
        this.q = obj;
    }

    @Override
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        a(f, f2, f3, f4);
    }

    public final void c(Canvas canvas, float f, float f2, Rect rect, float f3) {
        zx2 zx2Var;
        ArrayList arrayList;
        Rect rect2 = rect;
        int i = 0;
        float e = this.k.e(false, 1.0f);
        canvas.save();
        boolean z = this.f;
        zx2 zx2Var2 = this.j;
        rc2 rc2Var = this.a;
        Paint paint = this.i;
        if (z) {
            int U1 = gm.U1(e, gm.L(4.0f), 0);
            if (this.h != U1) {
                this.h = U1;
                paint.setPathEffect(new CornerPathEffect(U1));
            }
            zx2Var2.rewind();
            int Y1 = rc2Var.Y1(this.g);
            RectF rectF = gm.P;
            rectF.set(rc2Var.getBackgroundDrawableLeft(), rc2Var.X1(Y1), rc2Var.getBackgroundDrawableRight(), rc2Var.W1(Y1));
            gm.W1(rect2, rectF, e, rectF);
            zx2Var2.addRect(rectF, Path.Direction.CW);
            zx2Var2.a();
        } else if (this.e) {
            int U12 = gm.U1(e, gm.L(4.0f), 0);
            if (this.h != U12) {
                this.h = U12;
                paint.setPathEffect(new CornerPathEffect(U12));
            }
            zx2Var2.rewind();
            int e2 = rc2Var.e2(-this.c);
            RectF rectF2 = gm.P;
            rectF2.set(rc2Var.getBackgroundDrawableLeft(), rc2Var.X1(e2), rc2Var.getBackgroundDrawableRight(), rc2Var.W1(e2));
            gm.W1(rect2, rectF2, e, rectF2);
            zx2Var2.addRect(rectF2, Path.Direction.CW);
            zx2Var2.a();
        } else {
            int i2 = this.t;
            ArrayList arrayList2 = this.l;
            if (i2 > 1) {
                canvas.translate(f, f2);
                zx2 zx2Var3 = null;
                int i3 = -1;
                int i4 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.u;
                    if (i4 >= size) {
                        break;
                    }
                    zz8 zz8Var = (zz8) arrayList2.get(i4);
                    if (zx2Var3 != null) {
                        if (zz8Var.e) {
                            zx2Var3.a();
                        }
                        zx2 zx2Var4 = zx2Var3;
                        float f4 = e;
                        Rect rect3 = rect2;
                        b(zx2Var4, zz8Var, f, f2, rect3, f4);
                        zx2Var3 = zx2Var4;
                        rect2 = rect3;
                        e = f4;
                        i4++;
                    }
                    i3++;
                    if (i3 >= arrayList.size()) {
                        arrayList.add(new zx2());
                    }
                    zx2Var3 = (zx2) arrayList.get(i3);
                    zx2Var3.rewind();
                    zx2 zx2Var42 = zx2Var3;
                    float f42 = e;
                    Rect rect32 = rect2;
                    b(zx2Var42, zz8Var, f, f2, rect32, f42);
                    zx2Var3 = zx2Var42;
                    rect2 = rect32;
                    e = f42;
                    i4++;
                }
                if (zx2Var3 != null) {
                    zx2Var3.a();
                }
                int alpha = paint.getAlpha();
                canvas.saveLayerAlpha(rect2.left - f, rect2.top - f2, rect2.right - f, rect2.bottom - f2, (int) (alpha * f3), 31);
                paint.setAlpha(255);
                while (i <= i3) {
                    canvas.drawPath((Path) arrayList.get(i), paint);
                    i++;
                }
                paint.setAlpha(alpha);
                canvas.restore();
                canvas.restore();
                return;
            }
            canvas.translate(f, f2);
            zx2Var2.rewind();
            while (i < arrayList2.size()) {
                zx2 zx2Var5 = zx2Var2;
                b(zx2Var5, (zz8) arrayList2.get(i), f, f2, rect2, e);
                i++;
                rect2 = rect;
                zx2Var2 = zx2Var5;
            }
            zx2Var = zx2Var2;
            zx2Var.a();
            int alpha2 = paint.getAlpha();
            paint.setAlpha((int) (alpha2 * f3));
            canvas.drawPath(zx2Var, paint);
            paint.setAlpha(alpha2);
            canvas.restore();
        }
        zx2Var = zx2Var2;
        int alpha22 = paint.getAlpha();
        paint.setAlpha((int) (alpha22 * f3));
        canvas.drawPath(zx2Var, paint);
        paint.setAlpha(alpha22);
        canvas.restore();
    }

    public final void d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i < arrayList.size()) {
                zz8 zz8Var = (zz8) arrayList.get(i);
                if (i == 0 || ((zz8) arrayList.get(i - 1)).i != zz8Var.i) {
                    zz8Var.e = true;
                    zz8Var.c -= gm.L(0.66f);
                }
                if (i == arrayList.size() - 1 || ((zz8) arrayList.get(i + 1)).i != zz8Var.i) {
                    zz8Var.f = true;
                    zz8Var.d += gm.L(0.66f);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void e(Layout layout, int i, int i2) {
        float lineLeft;
        float lineRight;
        if (i != i2) {
            if (i2 < i) {
                i2 = i;
                i = i2;
            }
            int lineForOffset = layout.getLineForOffset(i);
            int lineForOffset2 = layout.getLineForOffset(i2);
            for (int i3 = lineForOffset; i3 <= lineForOffset2; i3++) {
                int lineStart = layout.getLineStart(i3);
                int lineEnd = layout.getLineEnd(i3);
                if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(layout.getText().charAt(lineStart)))) {
                    if (i3 == lineForOffset && i > lineStart) {
                        lineLeft = layout.getPrimaryHorizontal(i);
                    } else {
                        lineLeft = layout.getLineLeft(i3);
                    }
                    if (i3 == lineForOffset2 && i2 < lineEnd) {
                        lineRight = layout.getPrimaryHorizontal(i2);
                    } else {
                        lineRight = layout.getLineRight(i3);
                    }
                    a(Math.min(lineLeft, lineRight), layout.getLineTop(i3), Math.max(lineLeft, lineRight), layout.getLineBottom(i3));
                }
            }
        }
    }

    public a09(rc2 rc2Var, int i, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new zx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = rc2Var;
        this.k = new ln(0.0f, new dc2(rc2Var, (byte) 13), 350L, 420L, d53.h);
        this.b = i;
        this.g = bArr;
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = true;
        int L = gm.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public a09(rc2 rc2Var, int i, int i2) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new zx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = rc2Var;
        this.k = new ln(0.0f, new dc2(rc2Var, (byte) 12), 350L, 420L, d53.h);
        this.b = i;
        int i3 = -i2;
        this.c = i3;
        this.d = i3;
        this.e = true;
        this.f = false;
        int L = gm.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public a09(final rc2 rc2Var, final ViewParent viewParent, int i, uj9 uj9Var, int i2, int i3) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new zx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        this.k = new ln(0.0f, new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                ViewParent viewParent2 = viewParent;
                rc2 rc2Var2 = rc2Var;
                switch (b) {
                    case 0:
                        rc2Var2.invalidate();
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        rc2Var2.invalidate();
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, d53.h);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = false;
        this.f = false;
        if (uj9Var == null) {
            return;
        }
        ArrayList arrayList = uj9Var.n;
        int L = gm.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.p = -3.4028235E38f;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            qkb qkbVar = (qkb) arrayList.get(i4);
            Layout a = qkbVar == null ? null : qkbVar.a();
            if (a != null && a.getText() != null) {
                int intValue = ((Integer) uj9Var.o.get(i4)).intValue();
                int length = a.getText().length();
                int j = Utilities.j(i2 - intValue, length, 0);
                int j2 = Utilities.j(i3 - intValue, length, 0);
                if (j < j2) {
                    this.n = qkbVar.getX();
                    this.o = qkbVar.getY();
                    this.s = qkbVar;
                    this.q = null;
                    int size = this.l.size();
                    if (gm.J1(a.getText())) {
                        a.getSelectionPath(j, j2, this);
                    } else {
                        e(a, j, j2);
                    }
                    if (this.l.size() > size) {
                        this.r++;
                    }
                }
            }
        }
        this.t = Math.max(1, this.r);
        d();
    }
}
