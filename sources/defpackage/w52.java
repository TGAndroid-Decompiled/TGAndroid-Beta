package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
public final class w52 {
    public float a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;

    public w52(Context context, aj3 aj3Var) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.e = context;
        this.f = aj3Var;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w52.a():void");
    }

    public w52(c62 c62Var, ArrayList arrayList) {
        this.h = c62Var;
        this.e = new ArrayList();
        this.g = new HashMap();
        this.f = arrayList;
        a();
    }
}
