package i0;

import a0.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import b8.sc;
import b8.tc;
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
public final class g extends sc {
    public static final Class f14507a;
    public static final Constructor f14508b;
    public static final Method f14509c;
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
        f14508b = constructor;
        f14507a = cls;
        f14509c = method2;
        d = method;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i3, int i10, boolean z10) {
        try {
            return ((Boolean) f14509c.invoke(obj, byteBuffer, Integer.valueOf(i3), null, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface h(Object obj) {
        try {
            Object newInstance = Array.newInstance(f14507a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override
    public final Typeface a(Context context, h0.e eVar, Resources resources, int i3) {
        Object obj;
        h0.f[] fVarArr;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f14508b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (h0.f fVar : eVar.f14067a) {
                int i10 = fVar.f14072f;
                File d10 = tc.d(context);
                if (d10 != null) {
                    try {
                        if (tc.b(d10, resources, i10)) {
                            try {
                                fileInputStream = new FileInputStream(d10);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer != null && g(obj, mappedByteBuffer, fVar.f14071e, fVar.f14069b, fVar.f14070c)) {
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
    public final Typeface b(Context context, o0.i[] iVarArr, int i3) {
        Object obj;
        try {
            obj = f14508b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i10 = 0;
            l lVar = new l(0);
            int length = iVarArr.length;
            while (true) {
                if (i10 < length) {
                    o0.i iVar = iVarArr[i10];
                    Uri uri = iVar.f20494a;
                    ByteBuffer byteBuffer = (ByteBuffer) lVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = tc.e(context, uri);
                        lVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !g(obj, byteBuffer, iVar.f20495b, iVar.f20496c, iVar.d)) {
                        break;
                    }
                    i10++;
                } else {
                    Typeface h = h(obj);
                    if (h != null) {
                        return Typeface.create(h, i3);
                    }
                }
            }
        }
        return null;
    }
}
