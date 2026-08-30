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
import q5.g0;
import vh.v2;
public final class q {
    public static final HashMap f7428f;
    public static final String f7429g;
    public final Context f7430a;
    public final w f7431b;
    public final a f7432c;
    public final g0 d;
    public final e3.g e;

    static {
        HashMap hashMap = new HashMap();
        f7428f = hashMap;
        v2.i(5, hashMap, "armeabi", 6, "armeabi-v7a");
        v2.i(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f7429g = "Crashlytics Android SDK/18.6.0";
    }

    public q(Context context, w wVar, a aVar, g0 g0Var, e3.g gVar) {
        this.f7430a = context;
        this.f7431b = wVar;
        this.f7432c = aVar;
        this.d = g0Var;
        this.e = gVar;
    }

    public static p0 c(com.google.firebase.messaging.r rVar, int i10) {
        int i11;
        String str = (String) rVar.f4029c;
        String str2 = (String) rVar.f4028b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) rVar.d;
        int i12 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.r rVar2 = (com.google.firebase.messaging.r) rVar.e;
        if (i10 >= 8) {
            com.google.firebase.messaging.r rVar3 = rVar2;
            while (rVar3 != null) {
                rVar3 = (com.google.firebase.messaging.r) rVar3.e;
                i12++;
            }
            i11 = i12;
        } else {
            i11 = 0;
        }
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            p0 p0Var = null;
            if (rVar2 != null && i11 == 0) {
                p0Var = c(rVar2, i10 + 1);
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
            obj.e = Integer.valueOf(i10);
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
            obj.f2129a = Long.valueOf(j10);
            if (str != null) {
                obj.f2130b = str;
                obj.f2131c = fileName;
                obj.d = Long.valueOf(j11);
                arrayList.add(obj.q());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final List a() {
        a aVar = this.f7432c;
        String str = aVar.e;
        if (str != null) {
            return Collections.singletonList(new o0(str, 0L, 0L, aVar.f7370b));
        }
        throw new NullPointerException("Null name");
    }

    public final k9.u0 b(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: i9.q.b(int):k9.u0");
    }
}
