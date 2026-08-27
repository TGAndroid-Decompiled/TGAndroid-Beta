package g7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;

public abstract class o7 {
    public static ColorStateList a(Context context, int i10) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        h0.i iVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        h0.j jVar = new h0.j(resources, theme);
        synchronized (h0.k.f7730c) {
            try {
                SparseArray sparseArray = (SparseArray) h0.k.f7729b.get(jVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (iVar = (h0.i) sparseArray.get(i10)) == null) {
                    colorStateList = null;
                } else {
                    if (iVar.f7724b.equals(resources.getConfiguration())) {
                        if (theme != null || iVar.f7725c != 0) {
                            if (theme == null || iVar.f7725c != theme.hashCode()) {
                            }
                        }
                        colorStateList = iVar.f7723a;
                    }
                    sparseArray.remove(i10);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = h0.k.f7728a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            try {
                colorStateListA = h0.c.a(resources, resources.getXml(i10), theme);
            } catch (Exception e9) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e9);
            }
        }
        if (colorStateListA == null) {
            return Build.VERSION.SDK_INT >= 23 ? h0.h.a(resources, i10, theme) : resources.getColorStateList(i10);
        }
        h0.k.a(jVar, i10, colorStateListA, theme);
        return colorStateListA;
    }

    public static Drawable b(Context context, int i10) {
        return m.n2.d().g(context, i10);
    }
}
