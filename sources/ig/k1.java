package ig;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.s5;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k1 {
    public static final s5 f8343m = new s5("ShapeDetector", true);
    public static final double f8344n = Math.sqrt(125000.0d) / 2.0d;
    public int f8345a;
    public ArrayList f8346b;
    public ArrayList f8347c;
    public boolean d;
    public ag.l e;
    public Context f8348f;
    public SharedPreferences f8349g;
    public boolean h;
    public ArrayList f8350i;
    public AtomicBoolean f8351j;
    public AtomicBoolean f8352k;
    public g1 f8353l;

    public static i1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((h1) arrayList.get(0)).f8322a;
        double d10 = ((h1) arrayList.get(0)).f8323b;
        i1 i1Var = new i1(0);
        i1Var.f8330b = d;
        i1Var.f8331c = d10;
        i1Var.d = d;
        i1Var.e = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            h1 h1Var = (h1) arrayList.get(i10);
            double d11 = h1Var.f8322a;
            double d12 = h1Var.f8323b;
            if (i1Var.f8330b >= d11) {
                i1Var.f8330b = d11;
            }
            if (i1Var.f8331c >= d12) {
                i1Var.f8331c = d12;
            }
            if (i1Var.d <= d11) {
                i1Var.d = d11;
            }
            if (i1Var.e <= d12) {
                i1Var.e = d12;
            }
        }
        return i1Var;
    }

    public static h1 b(ArrayList arrayList) {
        h1 h1Var = new h1(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h1 h1Var2 = (h1) arrayList.get(i10);
            h1Var.f8322a += h1Var2.f8322a;
            h1Var.f8323b += h1Var2.f8323b;
        }
        h1Var.f8322a /= arrayList.size();
        h1Var.f8323b /= arrayList.size();
        return h1Var;
    }

    public static double d(ArrayList arrayList, h1 h1Var, ArrayList arrayList2, double d) {
        h1 h1Var2 = h1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < min) {
            h1 h1Var3 = (h1) arrayList.get(i10);
            double d11 = h1Var3.f8322a;
            double d12 = cos;
            double d13 = h1Var2.f8322a;
            double d14 = d11 - d13;
            double d15 = h1Var3.f8323b;
            double d16 = h1Var2.f8323b;
            double d17 = d15 - d16;
            d10 += ((h1) arrayList2.get(i10)).a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i10++;
            h1Var2 = h1Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i10, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            h1 h1Var = (h1) arrayList.get(max - 1);
            h1 h1Var2 = (h1) arrayList.get(max);
            int i11 = max + 1;
            h1 h1Var3 = (h1) arrayList.get(i11);
            h1Var.getClass();
            double a2 = h1Var.a(h1Var2.f8322a, h1Var2.f8323b);
            double a10 = h1Var.a(h1Var3.f8322a, h1Var3.f8323b);
            double a11 = h1Var2.a(h1Var3.f8322a, h1Var3.f8323b);
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
            h1 h1Var = (h1) arrayList.get(i10);
            arrayList2.add(new h1(h1Var.f8322a, h1Var.f8323b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f8346b.clear();
        }
        f8343m.cancelRunnable(this.f8353l);
        this.f8352k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f8350i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f8348f);
            alertDialog$Builder.f20134a.R = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new eg.j(1, this, arrayList));
            alertDialog$Builder.p();
            this.f8350i = null;
        }
    }
}
