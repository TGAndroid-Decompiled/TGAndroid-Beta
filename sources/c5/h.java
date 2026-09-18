package c5;

import com.google.android.gms.internal.vision.e2;
public final class h {
    public int f3894a;
    public int f3895b;
    public String f3896c;

    public static c3.a a() {
        ?? obj = new Object();
        obj.f3710c = 0;
        obj.f3708a = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i10 = this.f3894a;
        int i11 = com.google.android.gms.internal.play_billing.u.f6894a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f6808c;
        Integer valueOf = Integer.valueOf(i10);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return e2.j("Response Code: ", jVar.toString(), ", Debug Message: ", this.f3896c);
    }
}
