package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;
public abstract class k {
    public static final ThreadLocal f9296a = new ThreadLocal();
    public static final WeakHashMap f9297b = new WeakHashMap(0);
    public static final Object f9298c = new Object();

    public static void a(j jVar, int i9, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f9298c) {
            try {
                WeakHashMap weakHashMap = f9297b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(jVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(jVar, sparseArray);
                }
                sparseArray.append(i9, new i(colorStateList, jVar.f9294a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
