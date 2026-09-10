package og;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class p1 {
    public static final DispatchQueue f14450m = new DispatchQueue("ShapeDetector");
    public static final double f14451n = Math.sqrt(125000.0d) / 2.0d;
    public int f14452a;
    public ArrayList f14453b;
    public ArrayList f14454c;
    public boolean d;
    public ai.b e;
    public Context f14455f;
    public SharedPreferences f14456g;
    public boolean h;
    public ArrayList f14457i;
    public AtomicBoolean f14458j;
    public AtomicBoolean f14459k;
    public l1 f14460l;

    public static n1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((m1) arrayList.get(0)).f14427a;
        double d10 = ((m1) arrayList.get(0)).f14428b;
        ?? obj = new Object();
        obj.f14433a = d;
        obj.f14434b = d10;
        obj.f14435c = d;
        obj.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            m1 m1Var = (m1) arrayList.get(i10);
            double d11 = m1Var.f14427a;
            double d12 = m1Var.f14428b;
            if (obj.f14433a >= d11) {
                obj.f14433a = d11;
            }
            if (obj.f14434b >= d12) {
                obj.f14434b = d12;
            }
            if (obj.f14435c <= d11) {
                obj.f14435c = d11;
            }
            if (obj.d <= d12) {
                obj.d = d12;
            }
        }
        return obj;
    }

    public static m1 b(ArrayList arrayList) {
        m1 m1Var = new m1(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            m1 m1Var2 = (m1) arrayList.get(i10);
            m1Var.f14427a += m1Var2.f14427a;
            m1Var.f14428b += m1Var2.f14428b;
        }
        m1Var.f14427a /= arrayList.size();
        m1Var.f14428b /= arrayList.size();
        return m1Var;
    }

    public static double d(ArrayList arrayList, m1 m1Var, ArrayList arrayList2, double d) {
        m1 m1Var2 = m1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < min) {
            m1 m1Var3 = (m1) arrayList.get(i10);
            double d11 = m1Var3.f14427a;
            double d12 = cos;
            double d13 = m1Var2.f14427a;
            double d14 = d11 - d13;
            double d15 = m1Var3.f14428b;
            double d16 = m1Var2.f14428b;
            double d17 = d15 - d16;
            d10 += ((m1) arrayList2.get(i10)).a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i10++;
            m1Var2 = m1Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i10, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            m1 m1Var = (m1) arrayList.get(max - 1);
            m1 m1Var2 = (m1) arrayList.get(max);
            int i11 = max + 1;
            m1 m1Var3 = (m1) arrayList.get(i11);
            m1Var.getClass();
            double a2 = m1Var.a(m1Var2.f14427a, m1Var2.f14428b);
            double a10 = m1Var.a(m1Var3.f14427a, m1Var3.f14428b);
            double a11 = m1Var2.a(m1Var3.f14427a, m1Var3.f14428b);
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
            m1 m1Var = (m1) arrayList.get(i10);
            arrayList2.add(new m1(m1Var.f14427a, m1Var.f14428b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f14453b.clear();
        }
        f14450m.cancelRunnable(this.f14460l);
        this.f14459k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f14457i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f14455f);
            alertDialog$Builder.f17528a.R = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new kg.j(1, this, arrayList));
            alertDialog$Builder.o();
            this.f14457i = null;
        }
    }
}
