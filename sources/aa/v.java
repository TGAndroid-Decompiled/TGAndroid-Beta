package aa;

import a8.p0;
import android.content.Context;
import da.x0;
import da.y0;
import da.z0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
public final class v {
    public static final HashMap f869f;
    public static final String f870g;
    public final Context f871a;
    public final b0 f872b;
    public final a f873c;
    public final j2.n d;
    public final ia.c f874e;

    static {
        HashMap hashMap = new HashMap();
        f869f = hashMap;
        com.google.android.recaptcha.internal.a.p(5, hashMap, "armeabi", 6, "armeabi-v7a");
        com.google.android.recaptcha.internal.a.p(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f870g = "Crashlytics Android SDK/20.1.1";
    }

    public v(Context context, b0 b0Var, a aVar, j2.n nVar, ia.c cVar) {
        this.f871a = context;
        this.f872b = b0Var;
        this.f873c = aVar;
        this.d = nVar;
        this.f874e = cVar;
    }

    public static y0 c(ab.b0 b0Var, int i7) {
        String str = (String) b0Var.f908c;
        String str2 = (String) b0Var.f907b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b0Var.d;
        int i10 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ab.b0 b0Var2 = (ab.b0) b0Var.f909e;
        if (i7 >= 8) {
            ab.b0 b0Var3 = b0Var2;
            while (b0Var3 != null) {
                b0Var3 = (ab.b0) b0Var3.f909e;
                i10++;
            }
        }
        int i11 = i10;
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            byte b10 = (byte) (0 | 1);
            y0 y0Var = null;
            if (b0Var2 != null && i11 == 0) {
                y0Var = c(b0Var2, i7 + 1);
            }
            if (b10 == 1) {
                return new y0(str, str2, d, y0Var, i11);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException(p0.q("Missing required properties:", sb2));
        }
        throw new NullPointerException("Null frames");
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i7) {
        long j3;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ?? obj = new Object();
            obj.f8284e = i7;
            obj.f8285f = (byte) (obj.f8285f | 4);
            long j10 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j3 = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j3 = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j10 = stackTraceElement.getLineNumber();
            }
            obj.f8281a = j3;
            byte b10 = (byte) (obj.f8285f | 1);
            obj.f8285f = b10;
            if (str != null) {
                obj.f8282b = str;
                obj.f8283c = fileName;
                obj.d = j10;
                obj.f8285f = (byte) (b10 | 2);
                arrayList.add(obj.a());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static z0 e() {
        byte b10 = (byte) 1;
        if (b10 == 1) {
            return new z0(0L, "0", "0");
        }
        StringBuilder sb2 = new StringBuilder();
        if (b10 == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(p0.q("Missing required properties:", sb2));
    }

    public final List a() {
        byte b10 = (byte) (((byte) (0 | 1)) | 2);
        a aVar = this.f873c;
        String str = aVar.f770e;
        if (str != null) {
            String str2 = aVar.f768b;
            if (b10 == 3) {
                return Collections.singletonList(new x0(str, str2, 0L, 0L));
            }
            StringBuilder sb2 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((b10 & 2) == 0) {
                sb2.append(" size");
            }
            throw new IllegalStateException(p0.q("Missing required properties:", sb2));
        }
        throw new NullPointerException("Null name");
    }

    public final da.g1 b(int r17) {
        throw new UnsupportedOperationException("Method not decompiled: aa.v.b(int):da.g1");
    }
}
