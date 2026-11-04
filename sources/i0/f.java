package i0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
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
public class f extends sc {
    public static Class f14503a = null;
    public static Constructor f14504b = null;
    public static Method f14505c = null;
    public static Method d = null;
    public static boolean f14506e = false;

    public static boolean g(Object obj, String str, int i3, boolean z10) {
        h();
        try {
            return ((Boolean) f14505c.invoke(obj, str, Integer.valueOf(i3), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void h() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f14506e) {
            return;
        }
        f14506e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f14504b = constructor;
        f14503a = cls;
        f14505c = method2;
        d = method;
    }

    @Override
    public Typeface a(Context context, h0.e eVar, Resources resources, int i3) {
        h0.f[] fVarArr;
        h();
        try {
            Object newInstance = f14504b.newInstance(null);
            for (h0.f fVar : eVar.f14067a) {
                File d10 = tc.d(context);
                if (d10 == null) {
                    return null;
                }
                try {
                    if (!tc.b(d10, resources, fVar.f14072f)) {
                        return null;
                    }
                    if (!g(newInstance, d10.getPath(), fVar.f14069b, fVar.f14070c)) {
                        return null;
                    }
                    d10.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d10.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance(f14503a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override
    public Typeface b(Context context, o0.i[] iVarArr, int i3) {
        File file;
        String readlink;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(iVarArr, i3).f20494a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                } else {
                    try {
                        readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                    } catch (ErrnoException unused) {
                    }
                    if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                        file = new File(readlink);
                        if (file != null && file.canRead()) {
                            Typeface createFromFile = Typeface.createFromFile(file);
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                        Typeface d10 = d(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return d10;
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile2 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile2;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    Typeface d102 = d(context, fileInputStream2);
                    fileInputStream2.close();
                    openFileDescriptor.close();
                    return d102;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
