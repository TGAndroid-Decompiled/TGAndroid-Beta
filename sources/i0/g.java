package i0;

import a0.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import c8.j0;
import c8.k0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
public final class g extends j0 {
    public static final Class f15132a;
    public static final Constructor f15133b;
    public static final Method f15134c;
    public static final Method d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f15133b = constructor;
        f15132a = cls;
        f15134c = method2;
        d = method;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i7, int i10, boolean z9) {
        try {
            return ((Boolean) f15134c.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i10), Boolean.valueOf(z9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface h(Object obj) {
        try {
            Object newInstance = Array.newInstance(f15132a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override
    public final Typeface a(Context context, h0.e eVar, Resources resources, int i7) {
        Object obj;
        h0.f[] fVarArr;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f15133b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (h0.f fVar : eVar.f14012a) {
                int i10 = fVar.f14017f;
                File d2 = k0.d(context);
                if (d2 != null) {
                    try {
                        if (k0.b(d2, resources, i10)) {
                            try {
                                fileInputStream = new FileInputStream(d2);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer != null && g(obj, mappedByteBuffer, fVar.f14016e, fVar.f14014b, fVar.f14015c)) {
                                }
                            } finally {
                                break;
                            }
                        }
                    } finally {
                        d2.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return h(obj);
        }
        return null;
    }

    @Override
    public final Typeface b(Context context, o0.h[] hVarArr, int i7) {
        Object obj;
        try {
            obj = f15133b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i10 = 0;
            l lVar = new l(0);
            int length = hVarArr.length;
            while (true) {
                if (i10 < length) {
                    o0.h hVar = hVarArr[i10];
                    Uri uri = hVar.f20691a;
                    ByteBuffer byteBuffer = (ByteBuffer) lVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = k0.e(context, uri);
                        lVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !g(obj, byteBuffer, hVar.f20692b, hVar.f20693c, hVar.d)) {
                        break;
                    }
                    i10++;
                } else {
                    Typeface h = h(obj);
                    if (h != null) {
                        return Typeface.create(h, i7);
                    }
                }
            }
        }
        return null;
    }
}
