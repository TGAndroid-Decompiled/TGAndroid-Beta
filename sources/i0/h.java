package i0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
public class h extends f {
    public final Class f7227f;
    public final Constructor f7228g;
    public final Method h;
    public final Method f7229i;
    public final Method f7230j;
    public final Method f7231k;
    public final Method f7232l;

    public h() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = l(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = m(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f7227f = cls;
        this.f7228g = constructor;
        this.h = method2;
        this.f7229i = method3;
        this.f7230j = method4;
        this.f7231k = method5;
        this.f7232l = method;
    }

    public static Method l(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override
    public final Typeface a(Context context, h0.e eVar, Resources resources, int i10) {
        Object obj;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.f7228g.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                h0.f[] fVarArr = eVar.f6860a;
                int length = fVarArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        h0.f fVar = fVarArr[i11];
                        Context context2 = context;
                        if (!i(context2, obj, fVar.f6861a, fVar.e, fVar.f6862b, fVar.f6863c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.d))) {
                            try {
                                this.f7231k.invoke(obj, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        } else {
                            i11++;
                            context = context2;
                        }
                    } else if (k(obj)) {
                        return j(obj);
                    }
                }
            }
            return null;
        }
        return super.a(context, eVar, resources, i10);
    }

    @Override
    public final android.graphics.Typeface b(android.content.Context r18, o0.i[] r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: i0.h.b(android.content.Context, o0.i[], int):android.graphics.Typeface");
    }

    @Override
    public final Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        Object obj;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.f7228g.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!i(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.f7231k.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (k(obj)) {
                    return j(obj);
                }
            }
            return null;
        }
        return super.e(context, resources, i10, str, i11);
    }

    public final boolean i(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f7227f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f7232l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f7230j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method m(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
