package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;
public abstract class kc9 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static void a(jc9 jc9Var, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            WeakHashMap weakHashMap = b;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(jc9Var);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(jc9Var, sparseArray);
            }
            sparseArray.append(i, new ic9(colorStateList, jc9Var.a.getConfiguration(), theme));
        }
    }
}
