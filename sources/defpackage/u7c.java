package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
public class u7c extends s7c {
    public final Class f;
    public final Constructor g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;

    public u7c() {
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
            method2 = k(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = l(cls2);
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
        this.f = cls;
        this.g = constructor;
        this.h = method2;
        this.i = method3;
        this.j = method4;
        this.k = method5;
        this.l = method;
    }

    public static Method k(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override
    public final Typeface a(Context context, co4 co4Var, Resources resources, int i) {
        Object obj;
        if (this.h == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            return super.a(context, co4Var, resources, i);
        }
        try {
            obj = this.g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            do4[] do4VarArr = co4Var.a;
            int length = do4VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    do4 do4Var = do4VarArr[i2];
                    String str = do4Var.a;
                    int i3 = do4Var.e;
                    int i4 = do4Var.b;
                    boolean z = do4Var.c;
                    FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(do4Var.d);
                    u7c u7cVar = this;
                    Context context2 = context;
                    if (!u7cVar.h(context2, obj, str, i3, i4, z ? 1 : 0, fromFontVariationSettings)) {
                        try {
                            u7cVar.k.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    } else {
                        i2++;
                        this = u7cVar;
                        context = context2;
                    }
                } else {
                    u7c u7cVar2 = this;
                    if (u7cVar2.j(obj)) {
                        return u7cVar2.i(obj);
                    }
                }
            }
        }
        return null;
    }

    @Override
    public final Typeface b(Context context, go4[] go4VarArr, int i) {
        Object obj;
        Typeface i2;
        boolean z;
        if (go4VarArr.length >= 1) {
            if (this.h == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
                go4 e = p1f.e(go4VarArr, i);
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(e.a, "r", null);
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                            return null;
                        }
                    } else {
                        Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(e.c).setItalic(e.d).build();
                        openFileDescriptor.close();
                        return build;
                    }
                } catch (IOException | IllegalAccessException | InvocationTargetException unused) {
                }
            } else {
                HashMap hashMap = new HashMap();
                for (go4 go4Var : go4VarArr) {
                    if (go4Var.e == 0) {
                        Uri uri = go4Var.a;
                        if (!hashMap.containsKey(uri)) {
                            hashMap.put(uri, r1f.d(context, uri));
                        }
                    }
                }
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
                try {
                    obj = this.g.newInstance(null);
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                    obj = null;
                }
                if (obj != null) {
                    int length = go4VarArr.length;
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        Method method = this.k;
                        if (i3 < length) {
                            go4 go4Var2 = go4VarArr[i3];
                            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(go4Var2.a);
                            if (byteBuffer != null) {
                                try {
                                    z = ((Boolean) this.i.invoke(obj, byteBuffer, Integer.valueOf(go4Var2.b), null, Integer.valueOf(go4Var2.c), Integer.valueOf(go4Var2.d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused3) {
                                    z = false;
                                }
                                if (!z) {
                                    method.invoke(obj, null);
                                    break;
                                }
                                z2 = true;
                            }
                            i3++;
                            z2 = z2;
                        } else if (!z2) {
                            method.invoke(obj, null);
                        } else if (j(obj) && (i2 = i(obj)) != null) {
                            return Typeface.create(i2, i);
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        if (this.h == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            return super.d(context, resources, i, str, i2);
        }
        try {
            obj = this.g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!h(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.k.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (j(obj)) {
                return i(obj);
            }
        }
        return null;
    }

    public final boolean h(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean j(Object obj) {
        try {
            return ((Boolean) this.j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method l(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
