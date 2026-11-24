package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class h9a {
    public static final do3 m = new do3("ShapeDetector", true);
    public static final double n = 176.7766952966369d;
    public int a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;
    public hj3 e;
    public Context f;
    public SharedPreferences g;
    public boolean h;
    public ArrayList i;
    public AtomicBoolean j;
    public AtomicBoolean k;
    public e9a l;

    public static kx5 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((f9a) arrayList.get(0)).a;
        double d2 = ((f9a) arrayList.get(0)).b;
        kx5 kx5Var = new kx5((byte) 1);
        kx5Var.b = d;
        kx5Var.c = d2;
        kx5Var.d = d;
        kx5Var.e = d2;
        for (int i = 1; i < arrayList.size(); i++) {
            f9a f9aVar = (f9a) arrayList.get(i);
            double d3 = f9aVar.a;
            double d4 = f9aVar.b;
            if (kx5Var.b >= d3) {
                kx5Var.b = d3;
            }
            if (kx5Var.c >= d4) {
                kx5Var.c = d4;
            }
            if (kx5Var.d <= d3) {
                kx5Var.d = d3;
            }
            if (kx5Var.e <= d4) {
                kx5Var.e = d4;
            }
        }
        return kx5Var;
    }

    public static f9a b(ArrayList arrayList) {
        f9a f9aVar = new f9a(0.0d, 0.0d);
        for (int i = 0; i < arrayList.size(); i++) {
            f9a f9aVar2 = (f9a) arrayList.get(i);
            f9aVar.a += f9aVar2.a;
            f9aVar.b += f9aVar2.b;
        }
        f9aVar.a /= arrayList.size();
        f9aVar.b /= arrayList.size();
        return f9aVar;
    }

    public static double d(ArrayList arrayList, f9a f9aVar, ArrayList arrayList2, double d) {
        f9a f9aVar2 = f9aVar;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d2 = 0.0d;
        int i = 0;
        while (i < min) {
            f9a f9aVar3 = (f9a) arrayList.get(i);
            double d3 = f9aVar3.a;
            double d4 = cos;
            double d5 = f9aVar2.a;
            double d6 = d3 - d5;
            double d7 = f9aVar3.b;
            double d8 = f9aVar2.b;
            double d9 = d7 - d8;
            d2 += ((f9a) arrayList2.get(i)).a(((d6 * d4) - (d9 * sin)) + d5, (d9 * d4) + (d6 * sin) + d8);
            i++;
            f9aVar2 = f9aVar;
            cos = d4;
        }
        return d2 / arrayList.size();
    }

    public static int e(int i, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            f9a f9aVar = (f9a) arrayList.get(max - 1);
            f9a f9aVar2 = (f9a) arrayList.get(max);
            int i2 = max + 1;
            f9a f9aVar3 = (f9a) arrayList.get(i2);
            f9aVar.getClass();
            double a = f9aVar.a(f9aVar2.a, f9aVar2.b);
            double a2 = f9aVar.a(f9aVar3.a, f9aVar3.b);
            double a3 = f9aVar2.a(f9aVar3.a, f9aVar3.b);
            if ((Math.acos((((a2 * a2) + (a * a)) - (a3 * a3)) / ((a * 2.0d) * a2)) / 3.141592653589793d) * 180.0d > 18.0d) {
                if (i > 0) {
                    i--;
                } else {
                    return max;
                }
            }
            max = i2;
        }
        return -1;
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            f9a f9aVar = (f9a) arrayList.get(i);
            arrayList2.add(new f9a(f9aVar.a, f9aVar.b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.b.clear();
        }
        m.cancelRunnable(this.l);
        this.k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f);
            alertDialog$Builder.a.S = "Shape?";
            alertDialog$Builder.e(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new fe((Object) this, arrayList, (byte) 12));
            alertDialog$Builder.o();
            this.i = null;
        }
    }
}
