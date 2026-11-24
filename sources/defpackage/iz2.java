package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
public final class iz2 {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final wj5 b;
    public final dr c;
    public final sk4 d;
    public final dv8 e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        oo1.q(5, hashMap, "armeabi", 6, "armeabi-v7a");
        oo1.q(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.1.1";
    }

    public iz2(Context context, wj5 wj5Var, dr drVar, sk4 sk4Var, dv8 dv8Var) {
        this.a = context;
        this.b = wj5Var;
        this.c = drVar;
        this.d = sk4Var;
        this.e = dv8Var;
    }

    public static w80 c(wtc wtcVar, int i) {
        w80 w80Var;
        String str = (String) wtcVar.b;
        String str2 = (String) wtcVar.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) wtcVar.c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        wtc wtcVar2 = (wtc) wtcVar.d;
        if (i >= 8) {
            wtc wtcVar3 = wtcVar2;
            while (wtcVar3 != null) {
                wtcVar3 = (wtc) wtcVar3.d;
                i2++;
            }
        }
        int i3 = i2;
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            byte b = (byte) (0 | 1);
            if (wtcVar2 != null && i3 == 0) {
                w80Var = c(wtcVar2, i + 1);
            } else {
                w80Var = null;
            }
            if (b == 1) {
                return new w80(str, str2, d, w80Var, i3);
            }
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" overflowCount");
            }
            sc8.j(ir2.o("Missing required properties:", sb));
            return null;
        }
        fvc.f("Null frames");
        return null;
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        long j;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ?? obj = new Object();
            obj.e = i;
            obj.f = (byte) (obj.f | 4);
            long j2 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j2 = stackTraceElement.getLineNumber();
            }
            obj.a = j;
            obj.b = str;
            obj.c = fileName;
            obj.d = j2;
            obj.f = (byte) (((byte) (obj.f | 1)) | 2);
            arrayList.add(obj.a());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static x80 e() {
        return new x80(0L, "0", "0");
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        dr drVar = this.c;
        String str = drVar.e;
        if (str != null) {
            String str2 = drVar.b;
            if (b == 3) {
                return Collections.singletonList(new v80(str, str2, 0L, 0L));
            }
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((b & 2) == 0) {
                sb.append(" size");
            }
            sc8.j(ir2.o("Missing required properties:", sb));
            return null;
        }
        fvc.f("Null name");
        return null;
    }

    public final defpackage.d90 b(int r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz2.b(int):d90");
    }
}
