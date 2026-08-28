package e9;

import android.content.Context;
import g9.o0;
import g9.p0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.ui.Cells.j2;
public final class r {
    public static final HashMap f5053f;
    public static final String f5054g;
    public final Context f5055a;
    public final x f5056b;
    public final a f5057c;
    public final g5.b d;
    public final c3.h f5058e;

    static {
        HashMap hashMap = new HashMap();
        f5053f = hashMap;
        j2.n(5, hashMap, "armeabi", 6, "armeabi-v7a");
        j2.n(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f5054g = "Crashlytics Android SDK/18.6.0";
    }

    public r(Context context, x xVar, a aVar, g5.b bVar, c3.h hVar) {
        this.f5055a = context;
        this.f5056b = xVar;
        this.f5057c = aVar;
        this.d = bVar;
        this.f5058e = hVar;
    }

    public static p0 c(com.google.firebase.messaging.t tVar, int i9) {
        int i10;
        String str = (String) tVar.f4178c;
        String str2 = (String) tVar.f4177b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) tVar.d;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.t tVar2 = (com.google.firebase.messaging.t) tVar.f4179e;
        if (i9 >= 8) {
            com.google.firebase.messaging.t tVar3 = tVar2;
            while (tVar3 != null) {
                tVar3 = (com.google.firebase.messaging.t) tVar3.f4179e;
                i11++;
            }
            i10 = i11;
        } else {
            i10 = 0;
        }
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            p0 p0Var = null;
            if (tVar2 != null && i10 == 0) {
                p0Var = c(tVar2, i9 + 1);
            }
            return new p0(str, str2, d, p0Var, i10);
        }
        throw new NullPointerException("Null frames");
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i9) {
        long j10;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ?? obj = new Object();
            obj.f1416e = Integer.valueOf(i9);
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
            obj.f1413a = Long.valueOf(j10);
            if (str != null) {
                obj.f1414b = str;
                obj.f1415c = fileName;
                obj.d = Long.valueOf(j11);
                arrayList.add(obj.k());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final List a() {
        a aVar = this.f5057c;
        String str = aVar.f4989e;
        if (str != null) {
            return Collections.singletonList(new o0(str, 0L, 0L, aVar.f4987b));
        }
        throw new NullPointerException("Null name");
    }

    public final g9.u0 b(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: e9.r.b(int):g9.u0");
    }
}
