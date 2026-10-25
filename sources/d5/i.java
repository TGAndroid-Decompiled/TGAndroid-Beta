package d5;

import c3.h0;
public final class i {
    public int f7985a;
    public int f7986b;
    public String f7987c;

    public static c3.a a() {
        ?? obj = new Object();
        obj.f6001c = 0;
        obj.f5999a = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i10 = this.f7985a;
        int i11 = com.google.android.gms.internal.play_billing.u.f7329a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f7243c;
        Integer valueOf = Integer.valueOf(i10);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return h0.m("Response Code: ", jVar.toString(), ", Debug Message: ", this.f7987c);
    }
}
