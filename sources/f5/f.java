package f5;

import com.google.android.gms.internal.vision.e2;
public final class f {
    public int f11283a;
    public int f11284b;
    public String f11285c;

    public static f3.a a() {
        ?? obj = new Object();
        obj.f11095c = 0;
        obj.f11093a = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i7 = this.f11283a;
        int i10 = com.google.android.gms.internal.play_billing.u.f7136a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f7041c;
        Integer valueOf = Integer.valueOf(i7);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return e2.l("Response Code: ", jVar.toString(), ", Debug Message: ", this.f11285c);
    }
}
