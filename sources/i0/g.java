package i0;

import a0.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import h7.f8;
import h7.g8;
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
public final class g extends f8 {
    public static final Class f8198a;
    public static final Constructor f8199b;
    public static final Method f8200c;
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
        f8199b = constructor;
        f8198a = cls;
        f8200c = method2;
        d = method;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f8200c.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface h(Object obj) {
        try {
            Object newInstance = Array.newInstance(f8198a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override
    public final Typeface a(Context context, h0.e eVar, Resources resources, int i10) {
        Object obj;
        h0.f[] fVarArr;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f8199b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (h0.f fVar : eVar.f7475a) {
                int i11 = fVar.f7480f;
                File d10 = g8.d(context);
                if (d10 != null) {
                    try {
                        if (g8.b(d10, resources, i11)) {
                            try {
                                fileInputStream = new FileInputStream(d10);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer != null && g(obj, mappedByteBuffer, fVar.f7479e, fVar.f7477b, fVar.f7478c)) {
                                }
                            } finally {
                                break;
                            }
                        }
                    } finally {
                        d10.delete();
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
    public final Typeface b(Context context, o0.j[] jVarArr, int i10) {
        Object obj;
        try {
            obj = f8199b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i11 = 0;
            k kVar = new k(0);
            int length = jVarArr.length;
            while (true) {
                if (i11 < length) {
                    o0.j jVar = jVarArr[i11];
                    Uri uri = jVar.f19008a;
                    ByteBuffer byteBuffer = (ByteBuffer) kVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = g8.e(context, uri);
                        kVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !g(obj, byteBuffer, jVar.f19009b, jVar.f19010c, jVar.d)) {
                        break;
                    }
                    i11++;
                } else {
                    Typeface h = h(obj);
                    if (h != null) {
                        return Typeface.create(h, i10);
                    }
                }
            }
        }
        return null;
    }
}
