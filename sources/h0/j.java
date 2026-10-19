package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;
public abstract class j {
    public static final ThreadLocal f11605a = new ThreadLocal();
    public static final WeakHashMap f11606b = new WeakHashMap(0);
    public static final Object f11607c = new Object();

    public static void a(i iVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f11607c) {
            try {
                WeakHashMap weakHashMap = f11606b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(iVar, sparseArray);
                }
                sparseArray.append(i10, new h(colorStateList, iVar.f11603a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
