package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
public final class t03 {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final vl5 b;
    public final ds c;
    public final mj4 d;
    public final ex8 e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        aq1.q(5, hashMap, "armeabi", 6, "armeabi-v7a");
        aq1.q(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.1.1";
    }

    public t03(Context context, vl5 vl5Var, ds dsVar, mj4 mj4Var, ex8 ex8Var) {
        this.a = context;
        this.b = vl5Var;
        this.c = dsVar;
        this.d = mj4Var;
        this.e = ex8Var;
    }

    public static w90 c(e7a e7aVar, int i) {
        w90 w90Var;
        String str = (String) e7aVar.b;
        String str2 = (String) e7aVar.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) e7aVar.c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        e7a e7aVar2 = (e7a) e7aVar.d;
        if (i >= 8) {
            e7a e7aVar3 = e7aVar2;
            while (e7aVar3 != null) {
                e7aVar3 = (e7a) e7aVar3.d;
                i2++;
            }
        }
        int i3 = i2;
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            byte b = (byte) (0 | 1);
            if (e7aVar2 != null && i3 == 0) {
                w90Var = c(e7aVar2, i + 1);
            } else {
                w90Var = null;
            }
            if (b == 1) {
                return new w90(str, str2, d, w90Var, i3);
            }
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" overflowCount");
            }
            dq9.m(ts2.n("Missing required properties:", sb));
            return null;
        }
        gxc.d("Null frames");
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

    public static x90 e() {
        return new x90(0L, "0", "0");
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        ds dsVar = this.c;
        String str = dsVar.e;
        if (str != null) {
            String str2 = dsVar.b;
            if (b == 3) {
                return Collections.singletonList(new v90(str, str2, 0L, 0L));
            }
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((b & 2) == 0) {
                sb.append(" size");
            }
            dq9.m(ts2.n("Missing required properties:", sb));
            return null;
        }
        gxc.d("Null name");
        return null;
    }

    public final defpackage.da0 b(int r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t03.b(int):da0");
    }
}
