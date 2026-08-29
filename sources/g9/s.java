package g9;

import android.content.Context;
import i9.o0;
import i9.p0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
public final class s {
    public static final HashMap f7210f;
    public static final String f7211g;
    public final Context f7212a;
    public final y f7213b;
    public final a f7214c;
    public final l d;
    public final e3.f f7215e;

    static {
        HashMap hashMap = new HashMap();
        f7210f = hashMap;
        u3.c.i(5, hashMap, "armeabi", 6, "armeabi-v7a");
        u3.c.i(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f7211g = "Crashlytics Android SDK/18.6.0";
    }

    public s(Context context, y yVar, a aVar, l lVar, e3.f fVar) {
        this.f7212a = context;
        this.f7213b = yVar;
        this.f7214c = aVar;
        this.d = lVar;
        this.f7215e = fVar;
    }

    public static p0 c(com.google.firebase.messaging.s sVar, int i10) {
        int i11;
        String str = (String) sVar.f5186c;
        String str2 = (String) sVar.f5185b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar.d;
        int i12 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) sVar.f5187e;
        if (i10 >= 8) {
            com.google.firebase.messaging.s sVar3 = sVar2;
            while (sVar3 != null) {
                sVar3 = (com.google.firebase.messaging.s) sVar3.f5187e;
                i12++;
            }
            i11 = i12;
        } else {
            i11 = 0;
        }
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            p0 p0Var = null;
            if (sVar2 != null && i11 == 0) {
                p0Var = c(sVar2, i10 + 1);
            }
            return new p0(str, str2, d, p0Var, i11);
        }
        throw new NullPointerException("Null frames");
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        long j10;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ?? obj = new Object();
            obj.f214e = Integer.valueOf(i10);
            long j11 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j10 = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j10 = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j11 = stackTraceElement.getLineNumber();
            }
            obj.f211a = Long.valueOf(j10);
            if (str != null) {
                obj.f212b = str;
                obj.f213c = fileName;
                obj.d = Long.valueOf(j11);
                arrayList.add(obj.i());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final List a() {
        a aVar = this.f7214c;
        String str = aVar.f7142e;
        if (str != null) {
            return Collections.singletonList(new o0(str, 0L, 0L, aVar.f7140b));
        }
        throw new NullPointerException("Null name");
    }

    public final i9.u0 b(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: g9.s.b(int):i9.u0");
    }
}
