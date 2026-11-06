package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;
public abstract class j {
    public static final ThreadLocal f14027a = new ThreadLocal();
    public static final WeakHashMap f14028b = new WeakHashMap(0);
    public static final Object f14029c = new Object();

    public static void a(i iVar, int i7, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f14029c) {
            try {
                WeakHashMap weakHashMap = f14028b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(iVar, sparseArray);
                }
                sparseArray.append(i7, new h(colorStateList, iVar.f14025a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
