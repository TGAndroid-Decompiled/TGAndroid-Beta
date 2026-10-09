package c5;

import com.google.android.gms.internal.vision.e2;
public final class h {
    public int f4254a;
    public int f4255b;
    public String f4256c;

    public static c3.a a() {
        ?? obj = new Object();
        obj.f4052c = 0;
        obj.f4050a = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i10 = this.f4254a;
        int i11 = com.google.android.gms.internal.play_billing.u.f7473a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f7378c;
        Integer valueOf = Integer.valueOf(i10);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return e2.j("Response Code: ", jVar.toString(), ", Debug Message: ", this.f4256c);
    }
}
