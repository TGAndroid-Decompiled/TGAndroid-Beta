package c5;

import com.google.android.gms.internal.vision.e2;
public final class h {
    public int f4203a;
    public int f4204b;
    public String f4205c;

    public static c3.a a() {
        ?? obj = new Object();
        obj.f4002c = 0;
        obj.f4000a = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i10 = this.f4203a;
        int i11 = com.google.android.gms.internal.play_billing.u.f7423a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f7328c;
        Integer valueOf = Integer.valueOf(i10);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return e2.j("Response Code: ", jVar.toString(), ", Debug Message: ", this.f4205c);
    }
}
