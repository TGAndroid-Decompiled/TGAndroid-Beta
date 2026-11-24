package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class t3c extends vwe {
    public static Class a = null;
    public static Constructor b = null;
    public static Method c = null;
    public static Method d = null;
    public static boolean e = false;

    public static boolean f(Object obj, String str, int i, boolean z) {
        g();
        try {
            return ((Boolean) c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            sdb.b(e2);
            return false;
        }
    }

    public static void g() {
        Method method;
        Class<?> cls;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    @Override
    public Typeface a(Context context, xl4 xl4Var, Resources resources, int i) {
        yl4[] yl4VarArr;
        g();
        try {
            Object newInstance = b.newInstance(null);
            for (yl4 yl4Var : xl4Var.a) {
                File c2 = ywe.c(context);
                if (c2 == null) {
                    return null;
                }
                try {
                    if (ywe.a(c2, resources, yl4Var.f) && f(newInstance, c2.getPath(), yl4Var.b, yl4Var.c)) {
                        c2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    c2.delete();
                    throw th;
                }
                c2.delete();
                return null;
            }
            g();
            try {
                Object newInstance2 = Array.newInstance(a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                sdb.b(e2);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            sdb.b(e3);
            return null;
        }
    }

    @Override
    public android.graphics.Typeface b(android.content.Context r3, defpackage.bm4[] r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3c.b(android.content.Context, bm4[], int):android.graphics.Typeface");
    }
}
