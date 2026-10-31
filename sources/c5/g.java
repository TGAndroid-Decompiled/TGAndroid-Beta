package c5;

import c3.i0;
public final class g {
    public int f3785a;
    public int f3786b;
    public String f3787c;

    public static c3.a a() {
        ?? obj = new Object();
        obj.f3594c = 0;
        obj.f3592a = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i10 = this.f3785a;
        int i11 = com.google.android.gms.internal.play_billing.u.f5211a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f5125c;
        Integer valueOf = Integer.valueOf(i10);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return i0.n("Response Code: ", jVar.toString(), ", Debug Message: ", this.f3787c);
    }
}
