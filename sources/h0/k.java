package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;
public abstract class k {
    public static final ThreadLocal f6873a = new ThreadLocal();
    public static final WeakHashMap f6874b = new WeakHashMap(0);
    public static final Object f6875c = new Object();

    public static void a(j jVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f6875c) {
            try {
                WeakHashMap weakHashMap = f6874b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(jVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(jVar, sparseArray);
                }
                sparseArray.append(i10, new i(colorStateList, jVar.f6871a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
