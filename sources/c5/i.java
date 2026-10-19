package c5;

import com.google.android.gms.internal.play_billing.k3;
public final class i {
    public int f4754a;
    public int f4755b;
    public String f4756c;

    public static c3.a a() {
        ?? obj = new Object();
        obj.f4562c = 0;
        obj.f4560a = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i10 = this.f4754a;
        int i11 = com.google.android.gms.internal.play_billing.u.f7220a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f7133c;
        Integer valueOf = Integer.valueOf(i10);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return k3.k("Response Code: ", jVar.toString(), ", Debug Message: ", this.f4756c);
    }
}
