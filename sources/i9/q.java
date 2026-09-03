package i9;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import k9.o0;
import k9.p0;
import q5.c0;
public final class q {
    public static final HashMap f7995f;
    public static final String f7996g;
    public final Context f7997a;
    public final w f7998b;
    public final a f7999c;
    public final c0 d;
    public final e3.g f8000e;

    static {
        HashMap hashMap = new HashMap();
        f7995f = hashMap;
        w.c.i(5, hashMap, "armeabi", 6, "armeabi-v7a");
        w.c.i(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f7996g = "Crashlytics Android SDK/18.6.0";
    }

    public q(Context context, w wVar, a aVar, c0 c0Var, e3.g gVar) {
        this.f7997a = context;
        this.f7998b = wVar;
        this.f7999c = aVar;
        this.d = c0Var;
        this.f8000e = gVar;
    }

    public static p0 c(sf.f fVar, int i10) {
        int i11;
        String str = (String) fVar.f47352c;
        String str2 = (String) fVar.f47351b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) fVar.d;
        int i12 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        sf.f fVar2 = (sf.f) fVar.f47353e;
        if (i10 >= 8) {
            sf.f fVar3 = fVar2;
            while (fVar3 != null) {
                fVar3 = (sf.f) fVar3.f47353e;
                i12++;
            }
            i11 = i12;
        } else {
            i11 = 0;
        }
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            p0 p0Var = null;
            if (fVar2 != null && i11 == 0) {
                p0Var = c(fVar2, i10 + 1);
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
            obj.f2318e = Integer.valueOf(i10);
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
            obj.f2315a = Long.valueOf(j10);
            if (str != null) {
                obj.f2316b = str;
                obj.f2317c = fileName;
                obj.d = Long.valueOf(j11);
                arrayList.add(obj.n());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final List a() {
        a aVar = this.f7999c;
        String str = aVar.f7934e;
        if (str != null) {
            return Collections.singletonList(new o0(str, 0L, 0L, aVar.f7932b));
        }
        throw new NullPointerException("Null name");
    }

    public final k9.u0 b(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: i9.q.b(int):k9.u0");
    }
}
