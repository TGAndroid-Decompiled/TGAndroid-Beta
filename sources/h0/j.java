package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;
public abstract class j {
    public static final ThreadLocal f7558a = new ThreadLocal();
    public static final WeakHashMap f7559b = new WeakHashMap(0);
    public static final Object f7560c = new Object();

    public static void a(i iVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f7560c) {
            try {
                WeakHashMap weakHashMap = f7559b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(iVar, sparseArray);
                }
                sparseArray.append(i10, new h(colorStateList, iVar.f7556a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
