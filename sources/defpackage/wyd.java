package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
public final class wyd {
    public Object A;
    public final pi5 a;
    public final Object[] b;
    public final Class c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int[] m;
    public int n;
    public int o;
    public int p = Integer.MAX_VALUE;
    public int q = Integer.MIN_VALUE;
    public int r = 0;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public Field x;
    public Object y;
    public Object z;

    public wyd(Class cls, String str, Object[] objArr) {
        this.c = cls;
        pi5 pi5Var = new pi5(str, (byte) 4);
        this.a = pi5Var;
        this.b = objArr;
        this.d = pi5Var.b();
        int b = pi5Var.b();
        this.e = b;
        if (b == 0) {
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.k = 0;
            this.j = 0;
            this.l = 0;
            this.m = null;
            return;
        }
        int b2 = pi5Var.b();
        this.f = b2;
        int b3 = pi5Var.b();
        this.g = pi5Var.b();
        this.h = pi5Var.b();
        this.k = pi5Var.b();
        this.j = pi5Var.b();
        this.i = pi5Var.b();
        this.l = pi5Var.b();
        int b4 = pi5Var.b();
        this.m = b4 != 0 ? new int[b4] : null;
        this.n = (b2 << 1) + b3;
    }

    public static Field b(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + name.length() + String.valueOf(str).length() + 40);
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            xi4.l(c00.k(sb, " not found. Known fields are ", arrays));
            return null;
        }
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyd.a():boolean");
    }

    public final Object c() {
        int i = this.n;
        this.n = i + 1;
        return this.b[i];
    }
}
