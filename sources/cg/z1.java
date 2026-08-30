package cg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class z1 {
    public static final DispatchQueue f2584m = new DispatchQueue("ShapeDetector");
    public static final double f2585n = Math.sqrt(125000.0d) / 2.0d;
    public int f2586a;
    public ArrayList f2587b;
    public ArrayList f2588c;
    public boolean d;
    public h0 e;
    public Context f2589f;
    public SharedPreferences f2590g;
    public boolean h;
    public ArrayList f2591i;
    public AtomicBoolean f2592j;
    public AtomicBoolean f2593k;
    public t1 f2594l;

    public static x1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((w1) arrayList.get(0)).f2559a;
        double d10 = ((w1) arrayList.get(0)).f2560b;
        ?? obj = new Object();
        obj.f2571a = d;
        obj.f2572b = d10;
        obj.f2573c = d;
        obj.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            w1 w1Var = (w1) arrayList.get(i10);
            double d11 = w1Var.f2559a;
            double d12 = w1Var.f2560b;
            if (obj.f2571a >= d11) {
                obj.f2571a = d11;
            }
            if (obj.f2572b >= d12) {
                obj.f2572b = d12;
            }
            if (obj.f2573c <= d11) {
                obj.f2573c = d11;
            }
            if (obj.d <= d12) {
                obj.d = d12;
            }
        }
        return obj;
    }

    public static w1 b(ArrayList arrayList) {
        w1 w1Var = new w1(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            w1 w1Var2 = (w1) arrayList.get(i10);
            w1Var.f2559a += w1Var2.f2559a;
            w1Var.f2560b += w1Var2.f2560b;
        }
        w1Var.f2559a /= arrayList.size();
        w1Var.f2560b /= arrayList.size();
        return w1Var;
    }

    public static double d(ArrayList arrayList, w1 w1Var, ArrayList arrayList2, double d) {
        w1 w1Var2 = w1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < min) {
            w1 w1Var3 = (w1) arrayList.get(i10);
            double d11 = w1Var3.f2559a;
            double d12 = cos;
            double d13 = w1Var2.f2559a;
            double d14 = d11 - d13;
            double d15 = w1Var3.f2560b;
            double d16 = w1Var2.f2560b;
            double d17 = d15 - d16;
            d10 += ((w1) arrayList2.get(i10)).a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i10++;
            w1Var2 = w1Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i10, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            w1 w1Var = (w1) arrayList.get(max - 1);
            w1 w1Var2 = (w1) arrayList.get(max);
            int i11 = max + 1;
            w1 w1Var3 = (w1) arrayList.get(i11);
            w1Var.getClass();
            double a2 = w1Var.a(w1Var2.f2559a, w1Var2.f2560b);
            double a10 = w1Var.a(w1Var3.f2559a, w1Var3.f2560b);
            double a11 = w1Var2.a(w1Var3.f2559a, w1Var3.f2560b);
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
            w1 w1Var = (w1) arrayList.get(i10);
            arrayList2.add(new w1(w1Var.f2559a, w1Var.f2560b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f2587b.clear();
        }
        f2584m.cancelRunnable(this.f2594l);
        this.f2593k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f2591i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f2589f);
            alertDialog$Builder.f19503a.O = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new u1(0, this, arrayList));
            alertDialog$Builder.o();
            this.f2591i = null;
        }
    }
}
