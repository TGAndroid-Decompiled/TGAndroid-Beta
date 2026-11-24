package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hba {
    public static final np3 m = new np3("ShapeDetector", true);
    public static final double n = 176.7766952966369d;
    public int a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;
    public sk3 e;
    public Context f;
    public SharedPreferences g;
    public boolean h;
    public ArrayList i;
    public AtomicBoolean j;
    public AtomicBoolean k;
    public eba l;

    public static kz5 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((fba) arrayList.get(0)).a;
        double d2 = ((fba) arrayList.get(0)).b;
        kz5 kz5Var = new kz5((byte) 1);
        kz5Var.b = d;
        kz5Var.c = d2;
        kz5Var.d = d;
        kz5Var.e = d2;
        for (int i = 1; i < arrayList.size(); i++) {
            fba fbaVar = (fba) arrayList.get(i);
            double d3 = fbaVar.a;
            double d4 = fbaVar.b;
            if (kz5Var.b >= d3) {
                kz5Var.b = d3;
            }
            if (kz5Var.c >= d4) {
                kz5Var.c = d4;
            }
            if (kz5Var.d <= d3) {
                kz5Var.d = d3;
            }
            if (kz5Var.e <= d4) {
                kz5Var.e = d4;
            }
        }
        return kz5Var;
    }

    public static fba b(ArrayList arrayList) {
        fba fbaVar = new fba(0.0d, 0.0d);
        for (int i = 0; i < arrayList.size(); i++) {
            fba fbaVar2 = (fba) arrayList.get(i);
            fbaVar.a += fbaVar2.a;
            fbaVar.b += fbaVar2.b;
        }
        fbaVar.a /= arrayList.size();
        fbaVar.b /= arrayList.size();
        return fbaVar;
    }

    public static double d(ArrayList arrayList, fba fbaVar, ArrayList arrayList2, double d) {
        fba fbaVar2 = fbaVar;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d2 = 0.0d;
        int i = 0;
        while (i < min) {
            fba fbaVar3 = (fba) arrayList.get(i);
            double d3 = fbaVar3.a;
            double d4 = cos;
            double d5 = fbaVar2.a;
            double d6 = d3 - d5;
            double d7 = fbaVar3.b;
            double d8 = fbaVar2.b;
            double d9 = d7 - d8;
            d2 += ((fba) arrayList2.get(i)).a(((d6 * d4) - (d9 * sin)) + d5, (d9 * d4) + (d6 * sin) + d8);
            i++;
            fbaVar2 = fbaVar;
            cos = d4;
        }
        return d2 / arrayList.size();
    }

    public static int e(int i, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            fba fbaVar = (fba) arrayList.get(max - 1);
            fba fbaVar2 = (fba) arrayList.get(max);
            int i2 = max + 1;
            fba fbaVar3 = (fba) arrayList.get(i2);
            fbaVar.getClass();
            double a = fbaVar.a(fbaVar2.a, fbaVar2.b);
            double a2 = fbaVar.a(fbaVar3.a, fbaVar3.b);
            double a3 = fbaVar2.a(fbaVar3.a, fbaVar3.b);
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
            fba fbaVar = (fba) arrayList.get(i);
            arrayList2.add(new fba(fbaVar.a, fbaVar.b));
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
            alertDialog$Builder.e(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new ff((Object) this, arrayList, (byte) 12));
            alertDialog$Builder.o();
            this.i = null;
        }
    }
}
