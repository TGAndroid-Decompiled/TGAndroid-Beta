package defpackage;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class k52 {
    public long i;
    public g52 k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public tgb u;
    public long v;
    public final m17 x;
    public final h24 y;
    public final l52 z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final s33 j = s33.j;
    public final int l = gl.L(4.0f);
    public final int m = gl.L(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public k52(l52 l52Var) {
        Drawable drawable;
        this.z = l52Var;
        wjb wjbVar = l52Var.Q.n;
        if (wjbVar != null) {
            drawable = wjbVar.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.x = (m17) (drawable == null ? bkb.P0("drawableMsgOutMedia") : drawable);
        this.y = new h24();
    }

    public final float a() {
        Point point = gl.q;
        float R1 = gl.R1(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.c)) / 200.0f)));
        return this.z.Q.getPreviewScale() * R1 * Math.max(point.x, point.y) * 0.5f;
    }

    public final void b(g52 g52Var, boolean z) {
        long j;
        ArrayList arrayList;
        this.k = g52Var;
        if (g52Var == null) {
            return;
        }
        HashMap hashMap = (HashMap) g52Var.g;
        g52Var.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - this.c;
        long j3 = 200;
        if (j2 < 200) {
            float f = ((float) j2) / 200.0f;
            this.g = gl.R1(this.g, this.e, f);
            this.f = gl.R1(this.f, this.d, f);
        } else {
            this.g = this.e;
            this.f = this.d;
        }
        this.d = g52Var.b / 1000.0f;
        this.e = g52Var.a;
        if (z) {
            j = elapsedRealtime;
        } else {
            j = 0;
        }
        this.c = j;
        this.i = 0L;
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        int size = arrayList2.size();
        int i = 0;
        while (true) {
            j52 j52Var = null;
            arrayList = this.h;
            if (i >= size) {
                break;
            }
            jm6 jm6Var = (jm6) arrayList2.get(i);
            c27 c27Var = (c27) hashMap.get(jm6Var);
            long j4 = j3;
            int i2 = i;
            this.i = Math.max(this.i, jm6Var.N);
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                j52 j52Var2 = (j52) arrayList.get(i3);
                if (j52Var2.b == jm6Var) {
                    j52Var = j52Var2;
                    break;
                }
                i3++;
            }
            if (j52Var == null) {
                j52 j52Var3 = new j52(this);
                j52Var3.f(jm6Var);
                j52Var3.d(g52Var, c27Var, z);
                arrayList.add(j52Var3);
            } else {
                j52Var.d(g52Var, c27Var, z);
            }
            i = i2 + 1;
            j3 = j4;
        }
        long j5 = j3;
        int size3 = arrayList.size();
        int i4 = 0;
        while (i4 < size3) {
            j52 j52Var4 = (j52) arrayList.get(i4);
            if (!hashMap.containsKey(j52Var4.b)) {
                if (j52Var4.k <= 0.0f && j52Var4.h + j5 <= elapsedRealtime) {
                    pla plaVar = j52Var4.s;
                    if (plaVar != null) {
                        plaVar.b(j52Var4.O.z);
                        j52Var4.s = null;
                    }
                    arrayList.remove(i4);
                    i4--;
                    size3--;
                } else {
                    j52Var4.d(null, null, z);
                }
            }
            i4++;
        }
        this.z.invalidate();
    }
}
