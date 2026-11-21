package i0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import c8.m0;
import c8.n0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class f extends m0 {
    public static Class f15922a = null;
    public static Constructor f15923b = null;
    public static Method f15924c = null;
    public static Method d = null;
    public static boolean f15925e = false;

    public static boolean g(Object obj, String str, int i7, boolean z10) {
        h();
        try {
            return ((Boolean) f15924c.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void h() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f15925e) {
            return;
        }
        f15925e = true;
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
        f15923b = constructor;
        f15922a = cls;
        f15924c = method2;
        d = method;
    }

    @Override
    public Typeface a(Context context, h0.e eVar, Resources resources, int i7) {
        h0.f[] fVarArr;
        h();
        try {
            Object newInstance = f15923b.newInstance(null);
            for (h0.f fVar : eVar.f13713a) {
                File d2 = n0.d(context);
                if (d2 == null) {
                    return null;
                }
                try {
                    if (!n0.b(d2, resources, fVar.f13718f)) {
                        return null;
                    }
                    if (!g(newInstance, d2.getPath(), fVar.f13715b, fVar.f13716c)) {
                        return null;
                    }
                    d2.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d2.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance(f15922a, 1);
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
    public Typeface b(Context context, o0.h[] hVarArr, int i7) {
        File file;
        String readlink;
        if (hVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(hVarArr, i7).f21601a, "r", null);
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
                        Typeface d2 = d(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return d2;
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile2 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile2;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    Typeface d22 = d(context, fileInputStream2);
                    fileInputStream2.close();
                    openFileDescriptor.close();
                    return d22;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
