package f5;
public final class f {
    public int f11156a;
    public int f11157b;
    public String f11158c;

    public static f3.a a() {
        ?? obj = new Object();
        obj.f10968c = 0;
        obj.f10966a = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i7 = this.f11156a;
        int i10 = com.google.android.gms.internal.play_billing.u.f7469a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f7374c;
        Integer valueOf = Integer.valueOf(i7);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return com.google.android.recaptcha.internal.a.l("Response Code: ", jVar.toString(), ", Debug Message: ", this.f11158c);
    }
}
