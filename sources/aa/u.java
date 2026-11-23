package aa;

import a8.p0;
import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import da.x0;
import da.y0;
import da.z0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
public final class u {
    public static final HashMap f865f;
    public static final String f866g;
    public final Context f867a;
    public final a0 f868b;
    public final a f869c;
    public final wf.b d;
    public final ia.c f870e;

    static {
        HashMap hashMap = new HashMap();
        f865f = hashMap;
        e2.p(5, hashMap, "armeabi", 6, "armeabi-v7a");
        e2.p(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f866g = "Crashlytics Android SDK/20.1.1";
    }

    public u(Context context, a0 a0Var, a aVar, wf.b bVar, ia.c cVar) {
        this.f867a = context;
        this.f868b = a0Var;
        this.f869c = aVar;
        this.d = bVar;
        this.f870e = cVar;
    }

    public static y0 c(ab.c0 c0Var, int i7) {
        String str = (String) c0Var.f909c;
        String str2 = (String) c0Var.f908b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c0Var.d;
        int i10 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ab.c0 c0Var2 = (ab.c0) c0Var.f910e;
        if (i7 >= 8) {
            ab.c0 c0Var3 = c0Var2;
            while (c0Var3 != null) {
                c0Var3 = (ab.c0) c0Var3.f910e;
                i10++;
            }
        }
        int i11 = i10;
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            byte b10 = (byte) (0 | 1);
            y0 y0Var = null;
            if (c0Var2 != null && i11 == 0) {
                y0Var = c(c0Var2, i7 + 1);
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
            obj.f7945e = i7;
            obj.f7946f = (byte) (obj.f7946f | 4);
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
            obj.f7942a = j3;
            byte b10 = (byte) (obj.f7946f | 1);
            obj.f7946f = b10;
            if (str != null) {
                obj.f7943b = str;
                obj.f7944c = fileName;
                obj.d = j10;
                obj.f7946f = (byte) (b10 | 2);
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
        a aVar = this.f869c;
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
        throw new UnsupportedOperationException("Method not decompiled: aa.u.b(int):da.g1");
    }
}
