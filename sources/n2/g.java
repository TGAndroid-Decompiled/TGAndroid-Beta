package n2;

import j3.r0;
public final class g {
    public int f18319a;
    public int f18320b;
    public String f18321c;

    public static j3.a a() {
        ?? obj = new Object();
        obj.f13205b = 0;
        obj.f13206c = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i9 = this.f18319a;
        int i10 = com.google.android.gms.internal.play_billing.u.f3688a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f3593c;
        Integer valueOf = Integer.valueOf(i9);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return r0.o("Response Code: ", jVar.toString(), ", Debug Message: ", this.f18321c);
    }
}
