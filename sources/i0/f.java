package i0;

import a8.sc;
import a8.tc;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class f extends sc {
    public static Class f13458a = null;
    public static Constructor f13459b = null;
    public static Method f13460c = null;
    public static Method d = null;
    public static boolean e = false;

    public static boolean g(Object obj, String str, int i10, boolean z10) {
        h();
        try {
            return ((Boolean) f13460c.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void h() {
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
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f13459b = constructor;
        f13458a = cls;
        f13460c = method2;
        d = method;
    }

    @Override
    public Typeface a(Context context, h0.e eVar, Resources resources, int i10) {
        h0.f[] fVarArr;
        h();
        try {
            Object newInstance = f13459b.newInstance(null);
            for (h0.f fVar : eVar.f12530a) {
                File d10 = tc.d(context);
                if (d10 == null) {
                    return null;
                }
                try {
                    if (!tc.b(d10, resources, fVar.f12534f)) {
                        return null;
                    }
                    if (!g(newInstance, d10.getPath(), fVar.f12532b, fVar.f12533c)) {
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
                Object newInstance2 = Array.newInstance(f13458a, 1);
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
    public Typeface b(Context context, o0.h[] hVarArr, int i10) {
        File file;
        FileInputStream fileInputStream;
        String readlink;
        if (hVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(hVarArr, i10).f18937a, "r", null);
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
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile;
                            }
                            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            Typeface d10 = d(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return d10;
                        }
                        Typeface d102 = d(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return d102;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile2 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile2;
                    }
                    fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
