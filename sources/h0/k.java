package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;
public abstract class k {
    public static final ThreadLocal f9181a = new ThreadLocal();
    public static final WeakHashMap f9182b = new WeakHashMap(0);
    public static final Object f9183c = new Object();

    public static void a(j jVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f9183c) {
            try {
                WeakHashMap weakHashMap = f9182b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(jVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(jVar, sparseArray);
                }
                sparseArray.append(i10, new i(colorStateList, jVar.f9179a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
