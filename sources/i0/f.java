package i0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import f7.j8;
import f7.k8;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class f extends j8 {
    public static Class f10856a = null;
    public static Constructor f10857b = null;
    public static Method f10858c = null;
    public static Method d = null;
    public static boolean f10859e = false;

    public static boolean g(Object obj, String str, int i9, boolean z10) {
        h();
        try {
            return ((Boolean) f10858c.invoke(obj, str, Integer.valueOf(i9), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void h() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f10859e) {
            return;
        }
        f10859e = true;
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
        f10857b = constructor;
        f10856a = cls;
        f10858c = method2;
        d = method;
    }

    @Override
    public Typeface a(Context context, h0.e eVar, Resources resources, int i9) {
        h0.f[] fVarArr;
        h();
        try {
            Object newInstance = f10857b.newInstance(null);
            for (h0.f fVar : eVar.f9281a) {
                File d9 = k8.d(context);
                if (d9 == null) {
                    return null;
                }
                try {
                    if (!k8.b(d9, resources, fVar.f9286f)) {
                        return null;
                    }
                    if (!g(newInstance, d9.getPath(), fVar.f9283b, fVar.f9284c)) {
                        return null;
                    }
                    d9.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d9.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance(f10856a, 1);
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
    public Typeface b(Context context, o0.i[] iVarArr, int i9) {
        File file;
        FileInputStream fileInputStream;
        String readlink;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(iVarArr, i9).f18765a, "r", null);
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
                            Typeface d9 = d(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return d9;
                        }
                        Typeface d92 = d(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return d92;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
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
