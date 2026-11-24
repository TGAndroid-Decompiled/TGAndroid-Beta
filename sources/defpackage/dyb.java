package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
public final class dyb implements lac {
    public final oyb a;
    public final String b;
    public final long c;
    public final Boolean d;

    public dyb(oyb oybVar, String str, long j, Boolean bool) {
        this.a = oybVar;
        this.b = str;
        this.c = j;
        this.d = bool;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj;
        pwb pwbVar = (pwb) obj2;
        Integer num = (Integer) obj3;
        oyb oybVar = this.a;
        ArrayList arrayList2 = oybVar.N;
        boolean z = false;
        oybVar.O = 0;
        if (this.b.equals(oybVar.M)) {
            if (this.c == oybVar.V) {
                if (Objects.equals(this.d, oybVar.W)) {
                    arrayList2.addAll(arrayList);
                    oybVar.Q = pwbVar;
                    oybVar.R = (pwbVar == null || arrayList2.size() >= num.intValue()) ? true : true;
                    oybVar.n();
                }
            }
        }
    }
}
