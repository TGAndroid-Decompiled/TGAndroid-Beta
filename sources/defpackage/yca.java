package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yca {
    public static final uo3 m = new uo3("ShapeDetector", true);
    public static final double n = 176.7766952966369d;
    public int a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;
    public zj3 e;
    public Context f;
    public SharedPreferences g;
    public boolean h;
    public ArrayList i;
    public AtomicBoolean j;
    public AtomicBoolean k;
    public vca l;

    public static pz5 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((wca) arrayList.get(0)).a;
        double d2 = ((wca) arrayList.get(0)).b;
        pz5 pz5Var = new pz5((byte) 1);
        pz5Var.b = d;
        pz5Var.c = d2;
        pz5Var.d = d;
        pz5Var.e = d2;
        for (int i = 1; i < arrayList.size(); i++) {
            wca wcaVar = (wca) arrayList.get(i);
            double d3 = wcaVar.a;
            double d4 = wcaVar.b;
            if (pz5Var.b >= d3) {
                pz5Var.b = d3;
            }
            if (pz5Var.c >= d4) {
                pz5Var.c = d4;
            }
            if (pz5Var.d <= d3) {
                pz5Var.d = d3;
            }
            if (pz5Var.e <= d4) {
                pz5Var.e = d4;
            }
        }
        return pz5Var;
    }

    public static wca b(ArrayList arrayList) {
        wca wcaVar = new wca(0.0d, 0.0d);
        for (int i = 0; i < arrayList.size(); i++) {
            wca wcaVar2 = (wca) arrayList.get(i);
            wcaVar.a += wcaVar2.a;
            wcaVar.b += wcaVar2.b;
        }
        wcaVar.a /= arrayList.size();
        wcaVar.b /= arrayList.size();
        return wcaVar;
    }

    public static double d(ArrayList arrayList, wca wcaVar, ArrayList arrayList2, double d) {
        wca wcaVar2 = wcaVar;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d2 = 0.0d;
        int i = 0;
        while (i < min) {
            wca wcaVar3 = (wca) arrayList.get(i);
            double d3 = wcaVar3.a;
            double d4 = cos;
            double d5 = wcaVar2.a;
            double d6 = d3 - d5;
            double d7 = wcaVar3.b;
            double d8 = wcaVar2.b;
            double d9 = d7 - d8;
            d2 += ((wca) arrayList2.get(i)).a(((d6 * d4) - (d9 * sin)) + d5, (d9 * d4) + (d6 * sin) + d8);
            i++;
            wcaVar2 = wcaVar;
            cos = d4;
        }
        return d2 / arrayList.size();
    }

    public static int e(int i, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            wca wcaVar = (wca) arrayList.get(max - 1);
            wca wcaVar2 = (wca) arrayList.get(max);
            int i2 = max + 1;
            wca wcaVar3 = (wca) arrayList.get(i2);
            wcaVar.getClass();
            double a = wcaVar.a(wcaVar2.a, wcaVar2.b);
            double a2 = wcaVar.a(wcaVar3.a, wcaVar3.b);
            double a3 = wcaVar2.a(wcaVar3.a, wcaVar3.b);
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
            wca wcaVar = (wca) arrayList.get(i);
            arrayList2.add(new wca(wcaVar.a, wcaVar.b));
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
            alertDialog$Builder.e(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new oh((Object) this, arrayList, (byte) 12));
            alertDialog$Builder.o();
            this.i = null;
        }
    }
}
