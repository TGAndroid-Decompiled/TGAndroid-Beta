package i0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import g7.y7;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class i extends g {

    public final Class f10504f;

    public final Constructor f10505g;
    public final Method h;

    public final Method f10506i;

    public final Method f10507j;

    public final Method f10508k;

    public final Method f10509l;

    public i() throws NoSuchMethodException {
        Method methodM;
        Constructor<?> constructor;
        Method methodL;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodL = l(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodM = m(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e9.getClass().getName()), e9);
            methodM = null;
            constructor = null;
            methodL = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f10504f = cls;
        this.f10505g = constructor;
        this.h = methodL;
        this.f10506i = method;
        this.f10507j = method2;
        this.f10508k = method3;
        this.f10509l = methodM;
    }

    public static Method l(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override
    public final Typeface a(Context context, h0.e eVar, Resources resources, int i10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.a(context, eVar, resources, i10);
        }
        try {
            objNewInstance = this.f10505g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            h0.f[] fVarArr = eVar.f7713a;
            int length = fVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                h0.f fVar = fVarArr[i11];
                Context context2 = context;
                if (i(context2, objNewInstance, fVar.f7714a, fVar.f7717e, fVar.f7715b, fVar.f7716c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.d))) {
                    i11++;
                    context = context2;
                } else {
                    try {
                        this.f10508k.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            if (k(objNewInstance)) {
                return j(objNewInstance);
            }
        }
        return null;
    }

    @Override
    public final Typeface b(Context context, o0.j[] jVarArr, int i10) throws IOException {
        Object objNewInstance;
        Typeface typefaceJ;
        boolean zBooleanValue;
        if (jVarArr.length >= 1) {
            Method method = this.h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (o0.j jVar : jVarArr) {
                        if (jVar.f19112e == 0) {
                            Uri uri = jVar.f19109a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, y7.e(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f10505g.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = jVarArr.length;
                        int i11 = 0;
                        boolean z10 = false;
                        while (true) {
                            Method method2 = this.f10508k;
                            if (i11 >= length) {
                                if (!z10) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!k(objNewInstance) || (typefaceJ = j(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceJ, i10);
                            }
                            o0.j jVar2 = jVarArr[i11];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(jVar2.f19109a);
                            if (byteBuffer != null) {
                                try {
                                    try {
                                        zBooleanValue = ((Boolean) this.f10506i.invoke(objNewInstance, byteBuffer, Integer.valueOf(jVar2.f19110b), null, Integer.valueOf(jVar2.f19111c), Integer.valueOf(jVar2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                } catch (IllegalAccessException | InvocationTargetException unused3) {
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z10 = true;
                            }
                            i11++;
                        }
                    }
                } else {
                    o0.j jVarF = f(jVarArr, i10);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(jVarF.f19109a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(jVarF.f19111c).setItalic(jVarF.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused4) {
            }
        }
        return null;
    }

    @Override
    public final Typeface e(Context context, Resources resources, int i10, String str, int i11) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.e(context, resources, i10, str, i11);
        }
        try {
            objNewInstance = this.f10505g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!i(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f10508k.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (k(objNewInstance)) {
                return j(objNewInstance);
            }
        }
        return null;
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
            Object objNewInstance = Array.newInstance((Class<?>) this.f10504f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f10509l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f10507j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method m(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
