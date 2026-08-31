package dg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y1 {
    public static final DispatchQueue f4725m = new DispatchQueue("ShapeDetector");
    public static final double f4726n = Math.sqrt(125000.0d) / 2.0d;
    public int f4727a;
    public ArrayList f4728b;
    public ArrayList f4729c;
    public boolean d;
    public h0 f4730e;
    public Context f4731f;
    public SharedPreferences f4732g;
    public boolean h;
    public ArrayList f4733i;
    public AtomicBoolean f4734j;
    public AtomicBoolean f4735k;
    public s1 f4736l;

    public static w1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((v1) arrayList.get(0)).f4694a;
        double d10 = ((v1) arrayList.get(0)).f4695b;
        ?? obj = new Object();
        obj.f4707a = d;
        obj.f4708b = d10;
        obj.f4709c = d;
        obj.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            v1 v1Var = (v1) arrayList.get(i10);
            double d11 = v1Var.f4694a;
            double d12 = v1Var.f4695b;
            if (obj.f4707a >= d11) {
                obj.f4707a = d11;
            }
            if (obj.f4708b >= d12) {
                obj.f4708b = d12;
            }
            if (obj.f4709c <= d11) {
                obj.f4709c = d11;
            }
            if (obj.d <= d12) {
                obj.d = d12;
            }
        }
        return obj;
    }

    public static v1 b(ArrayList arrayList) {
        v1 v1Var = new v1(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            v1 v1Var2 = (v1) arrayList.get(i10);
            v1Var.f4694a += v1Var2.f4694a;
            v1Var.f4695b += v1Var2.f4695b;
        }
        v1Var.f4694a /= arrayList.size();
        v1Var.f4695b /= arrayList.size();
        return v1Var;
    }

    public static double d(ArrayList arrayList, v1 v1Var, ArrayList arrayList2, double d) {
        v1 v1Var2 = v1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < min) {
            v1 v1Var3 = (v1) arrayList.get(i10);
            double d11 = v1Var3.f4694a;
            double d12 = cos;
            double d13 = v1Var2.f4694a;
            double d14 = d11 - d13;
            double d15 = v1Var3.f4695b;
            double d16 = v1Var2.f4695b;
            double d17 = d15 - d16;
            d10 += ((v1) arrayList2.get(i10)).a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i10++;
            v1Var2 = v1Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i10, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            v1 v1Var = (v1) arrayList.get(max - 1);
            v1 v1Var2 = (v1) arrayList.get(max);
            int i11 = max + 1;
            v1 v1Var3 = (v1) arrayList.get(i11);
            v1Var.getClass();
            double a2 = v1Var.a(v1Var2.f4694a, v1Var2.f4695b);
            double a10 = v1Var.a(v1Var3.f4694a, v1Var3.f4695b);
            double a11 = v1Var2.a(v1Var3.f4694a, v1Var3.f4695b);
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
            v1 v1Var = (v1) arrayList.get(i10);
            arrayList2.add(new v1(v1Var.f4694a, v1Var.f4695b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f4728b.clear();
        }
        f4725m.cancelRunnable(this.f4736l);
        this.f4735k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f4733i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f4731f);
            alertDialog$Builder.f21166a.O = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new t1(0, this, arrayList));
            alertDialog$Builder.o();
            this.f4733i = null;
        }
    }
}
