package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.view.ViewConfiguration;
import java.util.ArrayList;
public final class q66 {
    public static final ArrayList s = new ArrayList();
    public int a;
    public int b;
    public Paint c;
    public Paint d;
    public int e;
    public int f;
    public final CharacterStyle i;
    public final float j;
    public final float k;
    public Rect m;
    public float n;
    public final long q;
    public final ArrayList g = new ArrayList();
    public int h = 0;
    public final Path l = new Path();
    public long o = -1;
    public long p = -1;
    public final boolean r = !i86.e(360928);

    public q66(CharacterStyle characterStyle, vnb vnbVar, float f, float f2, int i) {
        this.i = characterStyle;
        d(aob.v0(aob.Ce, vnbVar));
        this.j = f;
        this.k = f2;
        this.q = Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean a(Canvas canvas) {
        int L;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float min;
        boolean z5 = this.r;
        if (z5) {
            L = 0;
        } else {
            L = hl.L(4.0f);
        }
        if (this.a != L) {
            z = true;
        } else {
            z = false;
        }
        if (this.c == null) {
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.c.setColor(this.b);
            this.e = Color.alpha(this.b);
        }
        if (this.d == null) {
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.d.setColor(this.b);
            this.f = Color.alpha(this.b);
        }
        if (z) {
            this.a = L;
            Paint paint3 = this.c;
            if (L <= 0) {
                paint3.setPathEffect(null);
                this.d.setPathEffect(null);
            } else {
                paint3.setPathEffect(new CornerPathEffect(this.a));
                this.d.setPathEffect(new CornerPathEffect(this.a));
            }
        }
        Rect rect = this.m;
        float f2 = this.k;
        float f3 = this.j;
        ArrayList arrayList = this.g;
        if (rect == null && this.h > 0) {
            RectF rectF = hl.P;
            ((f66) arrayList.get(0)).computeBounds(rectF, false);
            this.m = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i = 1; i < this.h; i++) {
                RectF rectF2 = hl.P;
                ((f66) arrayList.get(i)).computeBounds(rectF2, false);
                Rect rect2 = this.m;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.m;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.m;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.m;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z2 = 0;
            z3 = z5;
            z4 = true;
            f = f3;
            this.n = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.m.top - f2, 2.0d) + Math.pow(this.m.left - f3, 2.0d), Math.pow(this.m.top - f2, 2.0d) + Math.pow(this.m.right - f3, 2.0d)), Math.max(Math.pow(this.m.bottom - f2, 2.0d) + Math.pow(this.m.left - f3, 2.0d), Math.pow(this.m.bottom - f2, 2.0d) + Math.pow(this.m.right - f3, 2.0d))));
        } else {
            z2 = 0;
            z3 = z5;
            z4 = true;
            f = f3;
        }
        if (z3) {
            for (int i2 = z2; i2 < this.h; i2++) {
                canvas.drawPath((Path) arrayList.get(i2), this.d);
            }
            return z2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.o;
        if (j < 0) {
            this.o = elapsedRealtime;
            j = elapsedRealtime;
        }
        float interpolation = k43.f.getInterpolation(Math.min(1.0f, ((float) (elapsedRealtime - j)) / ((float) this.q)));
        long j2 = this.p;
        if (j2 < 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, Math.max(0.0f, ((float) ((elapsedRealtime - 75) - j2)) / 100.0f));
        }
        float f4 = 1.0f - min;
        this.c.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.e * 0.2f * f4));
        this.c.setStrokeWidth(Math.min(1.0f, 0.0f) * hl.L(5.0f));
        for (int i3 = z2; i3 < this.h; i3++) {
            ((f66) arrayList.get(i3)).a();
            canvas.drawPath((Path) arrayList.get(i3), this.c);
        }
        this.d.setAlpha((int) (this.f * 0.8f * f4));
        this.d.setStrokeWidth(Math.min(1.0f, 0.0f) * hl.L(5.0f));
        int i4 = (interpolation > 1.0f ? 1 : (interpolation == 1.0f ? 0 : -1));
        if (i4 < 0) {
            float f5 = interpolation * this.n;
            canvas.save();
            Path path = this.l;
            path.reset();
            path.addCircle(f, f2, f5, Path.Direction.CW);
            canvas.clipPath(path);
            for (int i5 = z2; i5 < this.h; i5++) {
                canvas.drawPath((Path) arrayList.get(i5), this.d);
            }
            canvas.restore();
        } else {
            for (int i6 = z2; i6 < this.h; i6++) {
                canvas.drawPath((Path) arrayList.get(i6), this.d);
            }
        }
        if (i4 >= 0 && this.p < 0) {
            return z2;
        }
        return z4;
    }

    public final f66 b() {
        f66 f66Var;
        ArrayList arrayList = s;
        if (!arrayList.isEmpty()) {
            f66Var = (f66) arrayList.remove(0);
        } else {
            f66Var = new f66(0);
        }
        f66Var.c = !this.r;
        f66Var.reset();
        ArrayList arrayList2 = this.g;
        arrayList2.add(f66Var);
        this.h = arrayList2.size();
        return f66Var;
    }

    public final void c() {
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return;
        }
        s.addAll(arrayList);
        arrayList.clear();
        this.h = 0;
    }

    public final void d(int i) {
        this.b = i;
        Paint paint = this.c;
        if (paint != null) {
            paint.setColor(i);
            this.e = Color.alpha(i);
        }
        Paint paint2 = this.d;
        if (paint2 != null) {
            paint2.setColor(i);
            this.f = Color.alpha(i);
        }
    }
}
