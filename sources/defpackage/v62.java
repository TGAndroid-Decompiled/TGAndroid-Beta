package defpackage;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
public final class v62 {
    public long i;
    public r62 k;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public uib u;
    public long v;
    public final m37 x;
    public final s34 y;
    public final w62 z;
    public float a = 0.0f;
    public int b = 0;
    public long c = 0;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public final ArrayList h = new ArrayList();
    public final d53 j = d53.j;
    public final int l = gm.L(4.0f);
    public final int m = gm.L(2.0f) / 2;
    public final RectF t = new RectF();
    public final Paint w = new Paint(1);

    public v62(w62 w62Var) {
        Drawable drawable;
        this.z = w62Var;
        ylb ylbVar = w62Var.Q.n;
        if (ylbVar != null) {
            drawable = ylbVar.getDrawable("drawableMsgOutMedia");
        } else {
            drawable = null;
        }
        this.x = (m37) (drawable == null ? cmb.P0("drawableMsgOutMedia") : drawable);
        this.y = new s34();
    }

    public final float a() {
        Point point = gm.q;
        float R1 = gm.R1(this.g, this.e, this.j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.c)) / 200.0f)));
        return this.z.Q.getPreviewScale() * R1 * Math.max(point.x, point.y) * 0.5f;
    }

    public final void b(r62 r62Var, boolean z) {
        long j;
        ArrayList arrayList;
        this.k = r62Var;
        if (r62Var == null) {
            return;
        }
        HashMap hashMap = (HashMap) r62Var.g;
        r62Var.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - this.c;
        long j3 = 200;
        if (j2 < 200) {
            float f = ((float) j2) / 200.0f;
            this.g = gm.R1(this.g, this.e, f);
            this.f = gm.R1(this.f, this.d, f);
        } else {
            this.g = this.e;
            this.f = this.d;
        }
        this.d = r62Var.b / 1000.0f;
        this.e = r62Var.a;
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
            u62 u62Var = null;
            arrayList = this.h;
            if (i >= size) {
                break;
            }
            jo6 jo6Var = (jo6) arrayList2.get(i);
            c47 c47Var = (c47) hashMap.get(jo6Var);
            long j4 = j3;
            int i2 = i;
            this.i = Math.max(this.i, jo6Var.N);
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                u62 u62Var2 = (u62) arrayList.get(i3);
                if (u62Var2.b == jo6Var) {
                    u62Var = u62Var2;
                    break;
                }
                i3++;
            }
            if (u62Var == null) {
                u62 u62Var3 = new u62(this);
                u62Var3.f(jo6Var);
                u62Var3.d(r62Var, c47Var, z);
                arrayList.add(u62Var3);
            } else {
                u62Var.d(r62Var, c47Var, z);
            }
            i = i2 + 1;
            j3 = j4;
        }
        long j5 = j3;
        int size3 = arrayList.size();
        int i4 = 0;
        while (i4 < size3) {
            u62 u62Var4 = (u62) arrayList.get(i4);
            if (!hashMap.containsKey(u62Var4.b)) {
                if (u62Var4.k <= 0.0f && u62Var4.h + j5 <= elapsedRealtime) {
                    qna qnaVar = u62Var4.s;
                    if (qnaVar != null) {
                        qnaVar.b(u62Var4.O.z);
                        u62Var4.s = null;
                    }
                    arrayList.remove(i4);
                    i4--;
                    size3--;
                } else {
                    u62Var4.d(null, null, z);
                }
            }
            i4++;
        }
        this.z.invalidate();
    }
}
