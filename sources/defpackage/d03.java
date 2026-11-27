package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
public final class d03 {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final yl5 b;
    public final er c;
    public final ym4 d;
    public final oy8 e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        bp1.q(5, hashMap, "armeabi", 6, "armeabi-v7a");
        bp1.q(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.1.1";
    }

    public d03(Context context, yl5 yl5Var, er erVar, ym4 ym4Var, oy8 oy8Var) {
        this.a = context;
        this.b = yl5Var;
        this.c = erVar;
        this.d = ym4Var;
        this.e = oy8Var;
    }

    public static y80 c(u8a u8aVar, int i) {
        y80 y80Var;
        String str = (String) u8aVar.b;
        String str2 = (String) u8aVar.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) u8aVar.c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        u8a u8aVar2 = (u8a) u8aVar.d;
        if (i >= 8) {
            u8a u8aVar3 = u8aVar2;
            while (u8aVar3 != null) {
                u8aVar3 = (u8a) u8aVar3.d;
                i2++;
            }
        }
        int i3 = i2;
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            byte b = (byte) (0 | 1);
            if (u8aVar2 != null && i3 == 0) {
                y80Var = c(u8aVar2, i + 1);
            } else {
                y80Var = null;
            }
            if (b == 1) {
                return new y80(str, str2, d, y80Var, i3);
            }
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" overflowCount");
            }
            grb.i(bs2.o("Missing required properties:", sb));
            return null;
        }
        p3d.h("Null frames");
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

    public static z80 e() {
        return new z80(0L, "0", "0");
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        er erVar = this.c;
        String str = erVar.e;
        if (str != null) {
            String str2 = erVar.b;
            if (b == 3) {
                return Collections.singletonList(new x80(str, str2, 0L, 0L));
            }
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((b & 2) == 0) {
                sb.append(" size");
            }
            grb.i(bs2.o("Missing required properties:", sb));
            return null;
        }
        p3d.h("Null name");
        return null;
    }

    public final defpackage.f90 b(int r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d03.b(int):f90");
    }
}
