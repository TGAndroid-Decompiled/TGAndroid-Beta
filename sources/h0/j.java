package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;
public abstract class j {
    public static final ThreadLocal f14082a = new ThreadLocal();
    public static final WeakHashMap f14083b = new WeakHashMap(0);
    public static final Object f14084c = new Object();

    public static void a(i iVar, int i3, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f14084c) {
            try {
                WeakHashMap weakHashMap = f14083b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(iVar, sparseArray);
                }
                sparseArray.append(i3, new h(colorStateList, iVar.f14080a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
