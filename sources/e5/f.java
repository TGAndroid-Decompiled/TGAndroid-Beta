package e5;
public final class f {
    public int f9593a;
    public int f9594b;
    public String f9595c;

    public static e3.a a() {
        ?? obj = new Object();
        obj.f9405c = 0;
        obj.f9403a = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i3 = this.f9593a;
        int i10 = com.google.android.gms.internal.play_billing.u.f7521a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f7426c;
        Integer valueOf = Integer.valueOf(i3);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return com.google.android.recaptcha.internal.a.k("Response Code: ", jVar.toString(), ", Debug Message: ", this.f9595c);
    }
}
