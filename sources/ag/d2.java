package ag;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d2 {
    public static final DispatchQueue f441m = new DispatchQueue("ShapeDetector");
    public static final double f442n = Math.sqrt(125000.0d) / 2.0d;
    public int f443a;
    public ArrayList f444b;
    public ArrayList f445c;
    public boolean d;
    public i0 f446e;
    public Context f447f;
    public SharedPreferences f448g;
    public boolean h;
    public ArrayList f449i;
    public AtomicBoolean f450j;
    public AtomicBoolean f451k;
    public x1 f452l;

    public static b2 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((a2) arrayList.get(0)).f414a;
        double d10 = ((a2) arrayList.get(0)).f415b;
        ?? obj = new Object();
        obj.f419a = d;
        obj.f420b = d10;
        obj.f421c = d;
        obj.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            a2 a2Var = (a2) arrayList.get(i10);
            double d11 = a2Var.f414a;
            double d12 = a2Var.f415b;
            if (obj.f419a >= d11) {
                obj.f419a = d11;
            }
            if (obj.f420b >= d12) {
                obj.f420b = d12;
            }
            if (obj.f421c <= d11) {
                obj.f421c = d11;
            }
            if (obj.d <= d12) {
                obj.d = d12;
            }
        }
        return obj;
    }

    public static a2 b(ArrayList arrayList) {
        a2 a2Var = new a2(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            a2 a2Var2 = (a2) arrayList.get(i10);
            a2Var.f414a += a2Var2.f414a;
            a2Var.f415b += a2Var2.f415b;
        }
        a2Var.f414a /= arrayList.size();
        a2Var.f415b /= arrayList.size();
        return a2Var;
    }

    public static double d(ArrayList arrayList, a2 a2Var, ArrayList arrayList2, double d) {
        a2 a2Var2 = a2Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < min) {
            a2 a2Var3 = (a2) arrayList.get(i10);
            double d11 = a2Var3.f414a;
            double d12 = cos;
            double d13 = a2Var2.f414a;
            double d14 = d11 - d13;
            double d15 = a2Var3.f415b;
            double d16 = a2Var2.f415b;
            double d17 = d15 - d16;
            d10 += ((a2) arrayList2.get(i10)).a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i10++;
            a2Var2 = a2Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i10, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            a2 a2Var = (a2) arrayList.get(max - 1);
            a2 a2Var2 = (a2) arrayList.get(max);
            int i11 = max + 1;
            a2 a2Var3 = (a2) arrayList.get(i11);
            a2Var.getClass();
            double a2 = a2Var.a(a2Var2.f414a, a2Var2.f415b);
            double a10 = a2Var.a(a2Var3.f414a, a2Var3.f415b);
            double a11 = a2Var2.a(a2Var3.f414a, a2Var3.f415b);
            if ((Math.acos((((a10 * a10) + (a2 * a2)) - (a11 * a11)) / ((a2 * 2.0d) * a10)) / 3.141592653589793d) * 180.0d > 18.0d) {
                if (i10 > 0) {
                    i10--;
                } else {
                    return max;
                }
            }
            max = i11;
        }
        return -1;
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            a2 a2Var = (a2) arrayList.get(i10);
            arrayList2.add(new a2(a2Var.f414a, a2Var.f415b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f444b.clear();
        }
        f441m.cancelRunnable(this.f452l);
        this.f451k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f449i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f447f);
            alertDialog$Builder.f22714a.N = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new y1(0, this, arrayList));
            alertDialog$Builder.o();
            this.f449i = null;
        }
    }
}
