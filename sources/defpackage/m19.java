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
public final class m19 extends Path {
    public final wb2 a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final byte[] g;
    public int h;
    public final Paint i;
    public final jx2 j;
    public final mm k;
    public final ArrayList l;
    public final ArrayList m;
    public final float n;
    public final float o;
    public final float p;
    public l19 q;
    public final int r;
    public final kmb s;
    public final int t;
    public final ArrayList u;

    public m19(final wb2 wb2Var, final ViewParent viewParent, int i, ArrayList arrayList, int i2, int i3, float f) {
        int i4;
        float f2;
        int L;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new jx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        this.k = new mm(0.0f, new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                ViewParent viewParent2 = viewParent;
                wb2 wb2Var2 = wb2Var;
                switch (b) {
                    case 0:
                        wb2Var2.invalidate();
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        wb2Var2.invalidate();
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, k43.h);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = false;
        this.f = false;
        if (arrayList == null) {
            return;
        }
        int L2 = hl.L(4.0f);
        this.h = L2;
        paint.setPathEffect(new CornerPathEffect(L2));
        boolean z = false;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            o47 o47Var = (o47) arrayList.get(i5);
            if (o47Var != null && i2 <= o47Var.r && i3 >= (i4 = o47Var.n)) {
                int max = Math.max(0, i2 - i4);
                int i6 = o47Var.n;
                int min = Math.min(i3 - i6, o47Var.r - i6);
                float f3 = -f;
                this.n = f3;
                if (o47Var.I && !o47Var.J) {
                    if (o47Var.V) {
                        L = hl.L(14.0f);
                    } else {
                        L = hl.L(10.0f);
                    }
                    this.n = f3 + L;
                }
                this.o = o47Var.o(arrayList) + o47Var.f;
                if (o47Var.J) {
                    f2 = hl.L(10.0f);
                } else {
                    f2 = 0.0f;
                }
                this.p = f2;
                if (!z && !hl.J1(o47Var.e.getText())) {
                    z = false;
                } else {
                    z = true;
                }
                StaticLayout staticLayout = o47Var.e;
                if (z) {
                    staticLayout.getSelectionPath(max, min, this);
                } else {
                    e(staticLayout, max, min);
                }
                if (o47Var.K && o47Var.f()) {
                    this.m.add(Integer.valueOf(o47Var.c));
                }
            }
        }
        d();
    }

    public static void b(jx2 jx2Var, l19 l19Var, float f, float f2, Rect rect, float f3) {
        kmb kmbVar;
        float f4;
        kmb kmbVar2;
        float f5;
        float f6;
        float f7 = 0.0f;
        if (l19Var.j != null) {
            f4 = kmbVar.getX() - l19Var.k;
        } else {
            f4 = 0.0f;
        }
        if (l19Var.j != null) {
            f7 = kmbVar2.getY() - l19Var.l;
        }
        float R1 = hl.R1(rect.left - f, l19Var.a + f4, f3);
        if (l19Var.e) {
            f5 = rect.top - f2;
        } else {
            f5 = l19Var.g + f7;
        }
        float R12 = hl.R1(f5, l19Var.c + f7, f3);
        float R13 = hl.R1(rect.right - f, l19Var.b + f4, f3);
        if (l19Var.f) {
            f6 = rect.bottom - f2;
        } else {
            f6 = l19Var.h + f7;
        }
        jx2Var.addRect(R1, R12, R13, hl.R1(f6, l19Var.d + f7, f3), Path.Direction.CW);
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
        obj.a = f7 - hl.L(3.0f);
        obj.b = f10 + hl.L(3.0f);
        obj.c = f9;
        obj.d = f4 + f8;
        obj.i = this.r;
        kmb kmbVar = this.s;
        obj.j = kmbVar;
        if (kmbVar != null) {
            obj.k = kmbVar.getX();
            obj.l = kmbVar.getY();
        }
        l19 l19Var = this.q;
        if (l19Var != null) {
            float f11 = l19Var.d;
            l19Var.h = (f11 + f9) / 2.0f;
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
        jx2 jx2Var;
        ArrayList arrayList;
        Rect rect2 = rect;
        int i = 0;
        float e = this.k.e(false, 1.0f);
        canvas.save();
        boolean z = this.f;
        jx2 jx2Var2 = this.j;
        wb2 wb2Var = this.a;
        Paint paint = this.i;
        if (z) {
            int U1 = hl.U1(e, hl.L(4.0f), 0);
            if (this.h != U1) {
                this.h = U1;
                paint.setPathEffect(new CornerPathEffect(U1));
            }
            jx2Var2.rewind();
            int Y1 = wb2Var.Y1(this.g);
            RectF rectF = hl.P;
            rectF.set(wb2Var.getBackgroundDrawableLeft(), wb2Var.X1(Y1), wb2Var.getBackgroundDrawableRight(), wb2Var.W1(Y1));
            hl.W1(rect2, rectF, e, rectF);
            jx2Var2.addRect(rectF, Path.Direction.CW);
            jx2Var2.a();
        } else if (this.e) {
            int U12 = hl.U1(e, hl.L(4.0f), 0);
            if (this.h != U12) {
                this.h = U12;
                paint.setPathEffect(new CornerPathEffect(U12));
            }
            jx2Var2.rewind();
            int e2 = wb2Var.e2(-this.c);
            RectF rectF2 = hl.P;
            rectF2.set(wb2Var.getBackgroundDrawableLeft(), wb2Var.X1(e2), wb2Var.getBackgroundDrawableRight(), wb2Var.W1(e2));
            hl.W1(rect2, rectF2, e, rectF2);
            jx2Var2.addRect(rectF2, Path.Direction.CW);
            jx2Var2.a();
        } else {
            int i2 = this.t;
            ArrayList arrayList2 = this.l;
            if (i2 > 1) {
                canvas.translate(f, f2);
                jx2 jx2Var3 = null;
                int i3 = -1;
                int i4 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.u;
                    if (i4 >= size) {
                        break;
                    }
                    l19 l19Var = (l19) arrayList2.get(i4);
                    if (jx2Var3 != null) {
                        if (l19Var.e) {
                            jx2Var3.a();
                        }
                        jx2 jx2Var4 = jx2Var3;
                        float f4 = e;
                        Rect rect3 = rect2;
                        b(jx2Var4, l19Var, f, f2, rect3, f4);
                        jx2Var3 = jx2Var4;
                        rect2 = rect3;
                        e = f4;
                        i4++;
                    }
                    i3++;
                    if (i3 >= arrayList.size()) {
                        arrayList.add(new jx2());
                    }
                    jx2Var3 = (jx2) arrayList.get(i3);
                    jx2Var3.rewind();
                    jx2 jx2Var42 = jx2Var3;
                    float f42 = e;
                    Rect rect32 = rect2;
                    b(jx2Var42, l19Var, f, f2, rect32, f42);
                    jx2Var3 = jx2Var42;
                    rect2 = rect32;
                    e = f42;
                    i4++;
                }
                if (jx2Var3 != null) {
                    jx2Var3.a();
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
            jx2Var2.rewind();
            while (i < arrayList2.size()) {
                jx2 jx2Var5 = jx2Var2;
                b(jx2Var5, (l19) arrayList2.get(i), f, f2, rect2, e);
                i++;
                rect2 = rect;
                jx2Var2 = jx2Var5;
            }
            jx2Var = jx2Var2;
            jx2Var.a();
            int alpha2 = paint.getAlpha();
            paint.setAlpha((int) (alpha2 * f3));
            canvas.drawPath(jx2Var, paint);
            paint.setAlpha(alpha2);
            canvas.restore();
        }
        jx2Var = jx2Var2;
        int alpha22 = paint.getAlpha();
        paint.setAlpha((int) (alpha22 * f3));
        canvas.drawPath(jx2Var, paint);
        paint.setAlpha(alpha22);
        canvas.restore();
    }

    public final void d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i < arrayList.size()) {
                l19 l19Var = (l19) arrayList.get(i);
                if (i == 0 || ((l19) arrayList.get(i - 1)).i != l19Var.i) {
                    l19Var.e = true;
                    l19Var.c -= hl.L(0.66f);
                }
                if (i == arrayList.size() - 1 || ((l19) arrayList.get(i + 1)).i != l19Var.i) {
                    l19Var.f = true;
                    l19Var.d += hl.L(0.66f);
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

    public m19(wb2 wb2Var, int i, byte[] bArr) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new jx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = wb2Var;
        this.k = new mm(0.0f, new ib2(wb2Var, (byte) 13), 350L, 420L, k43.h);
        this.b = i;
        this.g = bArr;
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = true;
        int L = hl.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public m19(wb2 wb2Var, int i, int i2) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new jx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = wb2Var;
        this.k = new mm(0.0f, new ib2(wb2Var, (byte) 12), 350L, 420L, k43.h);
        this.b = i;
        int i3 = -i2;
        this.c = i3;
        this.d = i3;
        this.e = true;
        this.f = false;
        int L = hl.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public m19(final wb2 wb2Var, final ViewParent viewParent, int i, hl9 hl9Var, int i2, int i3) {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new jx2();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.t = 1;
        this.u = new ArrayList();
        this.a = null;
        this.k = new mm(0.0f, new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                ViewParent viewParent2 = viewParent;
                wb2 wb2Var2 = wb2Var;
                switch (b) {
                    case 0:
                        wb2Var2.invalidate();
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        wb2Var2.invalidate();
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, k43.h);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = false;
        this.f = false;
        if (hl9Var == null) {
            return;
        }
        ArrayList arrayList = hl9Var.n;
        int L = hl.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.p = -3.4028235E38f;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            kmb kmbVar = (kmb) arrayList.get(i4);
            Layout a = kmbVar == null ? null : kmbVar.a();
            if (a != null && a.getText() != null) {
                int intValue = ((Integer) hl9Var.o.get(i4)).intValue();
                int length = a.getText().length();
                int j = Utilities.j(i2 - intValue, length, 0);
                int j2 = Utilities.j(i3 - intValue, length, 0);
                if (j < j2) {
                    this.n = kmbVar.getX();
                    this.o = kmbVar.getY();
                    this.s = kmbVar;
                    this.q = null;
                    int size = this.l.size();
                    if (hl.J1(a.getText())) {
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
