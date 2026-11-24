package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
public final class g52 {
    public float a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;

    public g52(Context context, s34 s34Var) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.e = context;
        this.f = s34Var;
    }

    public static float b(int i, int i2, float[] fArr) {
        float f = 0.0f;
        while (i < i2) {
            f += fArr[i];
            i++;
        }
        return 1000.0f / f;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g52.a():void");
    }

    public g52(m52 m52Var, ArrayList arrayList) {
        this.h = m52Var;
        this.e = new ArrayList();
        this.g = new HashMap();
        this.f = arrayList;
        a();
    }
}
