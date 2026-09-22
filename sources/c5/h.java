package c5;

import com.google.android.gms.internal.vision.e2;
public final class h {
    public int f3891a;
    public int f3892b;
    public String f3893c;

    public static c3.a a() {
        ?? obj = new Object();
        obj.f3707c = 0;
        obj.f3705a = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i10 = this.f3891a;
        int i11 = com.google.android.gms.internal.play_billing.u.f6891a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f6805c;
        Integer valueOf = Integer.valueOf(i10);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return e2.j("Response Code: ", jVar.toString(), ", Debug Message: ", this.f3893c);
    }
}
