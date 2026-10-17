package c5;

import com.google.android.gms.internal.cast.a6;
public final class i {
    public int f4756a;
    public int f4757b;
    public String f4758c;

    public static c3.a a() {
        ?? obj = new Object();
        obj.f4563c = 0;
        obj.f4561a = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i10 = this.f4756a;
        int i11 = com.google.android.gms.internal.play_billing.u.f7220a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f7134c;
        Integer valueOf = Integer.valueOf(i10);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return a6.k("Response Code: ", jVar.toString(), ", Debug Message: ", this.f4758c);
    }
}
