package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;
public abstract class k {
    public static final ThreadLocal f10816a = new ThreadLocal();
    public static final WeakHashMap f10817b = new WeakHashMap(0);
    public static final Object f10818c = new Object();

    public static void a(j jVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f10818c) {
            try {
                WeakHashMap weakHashMap = f10817b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(jVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(jVar, sparseArray);
                }
                sparseArray.append(i10, new i(colorStateList, jVar.f10814a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
