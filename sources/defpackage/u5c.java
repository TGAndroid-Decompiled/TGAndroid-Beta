package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
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
public final class u5c extends xye {
    public static final Class a;
    public static final Constructor b;
    public static final Method c;
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
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) {
        try {
            Object newInstance = Array.newInstance(a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override
    public final Typeface a(Context context, yn4 yn4Var, Resources resources, int i) {
        Object obj;
        zn4[] zn4VarArr;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (zn4 zn4Var : yn4Var.a) {
                int i2 = zn4Var.f;
                File c2 = aze.c(context);
                if (c2 != null) {
                    try {
                        if (aze.a(c2, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(c2);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                } finally {
                                    break;
                                }
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            if (mappedByteBuffer != null && f(obj, mappedByteBuffer, zn4Var.e, zn4Var.b, zn4Var.c)) {
                            }
                        }
                    } finally {
                        c2.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return g(obj);
        }
        return null;
    }

    @Override
    public final Typeface b(Context context, co4[] co4VarArr, int i) {
        Object obj;
        try {
            obj = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i2 = 0;
            cka ckaVar = new cka(0);
            int length = co4VarArr.length;
            while (true) {
                if (i2 < length) {
                    co4 co4Var = co4VarArr[i2];
                    Uri uri = co4Var.a;
                    ByteBuffer byteBuffer = (ByteBuffer) ckaVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = aze.d(context, uri);
                        ckaVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !f(obj, byteBuffer, co4Var.b, co4Var.c, co4Var.d)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface g = g(obj);
                    if (g != null) {
                        return Typeface.create(g, i);
                    }
                }
            }
        }
        return null;
    }
}
