package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xca {
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
    public uca l;

    public static pz5 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((vca) arrayList.get(0)).a;
        double d2 = ((vca) arrayList.get(0)).b;
        pz5 pz5Var = new pz5((byte) 1);
        pz5Var.b = d;
        pz5Var.c = d2;
        pz5Var.d = d;
        pz5Var.e = d2;
        for (int i = 1; i < arrayList.size(); i++) {
            vca vcaVar = (vca) arrayList.get(i);
            double d3 = vcaVar.a;
            double d4 = vcaVar.b;
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

    public static vca b(ArrayList arrayList) {
        vca vcaVar = new vca(0.0d, 0.0d);
        for (int i = 0; i < arrayList.size(); i++) {
            vca vcaVar2 = (vca) arrayList.get(i);
            vcaVar.a += vcaVar2.a;
            vcaVar.b += vcaVar2.b;
        }
        vcaVar.a /= arrayList.size();
        vcaVar.b /= arrayList.size();
        return vcaVar;
    }

    public static double d(ArrayList arrayList, vca vcaVar, ArrayList arrayList2, double d) {
        vca vcaVar2 = vcaVar;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d2 = 0.0d;
        int i = 0;
        while (i < min) {
            vca vcaVar3 = (vca) arrayList.get(i);
            double d3 = vcaVar3.a;
            double d4 = cos;
            double d5 = vcaVar2.a;
            double d6 = d3 - d5;
            double d7 = vcaVar3.b;
            double d8 = vcaVar2.b;
            double d9 = d7 - d8;
            d2 += ((vca) arrayList2.get(i)).a(((d6 * d4) - (d9 * sin)) + d5, (d9 * d4) + (d6 * sin) + d8);
            i++;
            vcaVar2 = vcaVar;
            cos = d4;
        }
        return d2 / arrayList.size();
    }

    public static int e(int i, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            vca vcaVar = (vca) arrayList.get(max - 1);
            vca vcaVar2 = (vca) arrayList.get(max);
            int i2 = max + 1;
            vca vcaVar3 = (vca) arrayList.get(i2);
            vcaVar.getClass();
            double a = vcaVar.a(vcaVar2.a, vcaVar2.b);
            double a2 = vcaVar.a(vcaVar3.a, vcaVar3.b);
            double a3 = vcaVar2.a(vcaVar3.a, vcaVar3.b);
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
            vca vcaVar = (vca) arrayList.get(i);
            arrayList2.add(new vca(vcaVar.a, vcaVar.b));
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
