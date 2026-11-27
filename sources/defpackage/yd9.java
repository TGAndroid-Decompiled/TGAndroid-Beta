package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;
public abstract class yd9 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static void a(xd9 xd9Var, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            WeakHashMap weakHashMap = b;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(xd9Var);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(xd9Var, sparseArray);
            }
            sparseArray.append(i, new wd9(colorStateList, xd9Var.a.getConfiguration(), theme));
        }
    }
}
