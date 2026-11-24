package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
public final class awb implements k8c {
    public final lwb a;
    public final String b;
    public final long c;
    public final Boolean d;

    public awb(lwb lwbVar, String str, long j, Boolean bool) {
        this.a = lwbVar;
        this.b = str;
        this.c = j;
        this.d = bool;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj;
        oub oubVar = (oub) obj2;
        Integer num = (Integer) obj3;
        lwb lwbVar = this.a;
        ArrayList arrayList2 = lwbVar.N;
        boolean z = false;
        lwbVar.O = 0;
        if (this.b.equals(lwbVar.M)) {
            if (this.c == lwbVar.V) {
                if (Objects.equals(this.d, lwbVar.W)) {
                    arrayList2.addAll(arrayList);
                    lwbVar.Q = oubVar;
                    lwbVar.R = (oubVar == null || arrayList2.size() >= num.intValue()) ? true : true;
                    lwbVar.n();
                }
            }
        }
    }
}
