package org.telegram.messenger;

import java.util.ArrayList;
public final class a00 {
    public final String f21361b;
    public int f21360a = 0;
    public final ArrayList d = new ArrayList();
    public final long f21362c = System.currentTimeMillis();

    public a00(String str) {
        this.f21361b = str;
    }

    public static void a(zz zzVar) {
        if (zzVar != null) {
            if (zzVar.f26949b < 0) {
                a00 a00Var = zzVar.f26951e;
                int i7 = a00Var.f21360a;
                a00Var.f21360a = i7 - 1;
                zzVar.d = i7;
            }
            zzVar.f26949b = System.currentTimeMillis();
        }
    }

    public static void b(a00 a00Var) {
        if (a00Var != null) {
            ArrayList arrayList = a00Var.d;
            long currentTimeMillis = System.currentTimeMillis() - a00Var.f21362c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a00Var.f21361b);
            sb2.append(" total=");
            sb2.append(currentTimeMillis);
            sb2.append("ms\n");
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7) != null) {
                    sb2.append("#");
                    sb2.append(i7);
                    int i10 = ((zz) arrayList.get(i7)).d;
                    for (int i11 = 0; i11 < i10; i11++) {
                        sb2.append(" ");
                    }
                    sb2.append(" ");
                    sb2.append(arrayList.get(i7));
                    sb2.append("\n");
                }
            }
            a8.b(sb2.toString());
        }
    }

    public static void c(a00 a00Var, String str) {
        if (a00Var != null) {
            a00Var.d.add(new zz(a00Var, str));
        }
    }

    public static zz d(a00 a00Var, String str) {
        if (a00Var != null) {
            zz zzVar = new zz(a00Var, str);
            a00Var.d.add(zzVar);
            return zzVar;
        }
        return null;
    }
}
