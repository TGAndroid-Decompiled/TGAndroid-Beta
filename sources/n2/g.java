package n2;

public final class g {

    public int f18147a;

    public int f18148b;

    public String f18149c;

    public static j3.a a() {
        j3.a aVar = new j3.a();
        aVar.f12302b = 0;
        aVar.f12303c = "";
        return aVar;
    }

    public final String toString() {
        int i10 = this.f18147a;
        int i11 = com.google.android.gms.internal.play_billing.u.f4131a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f4040c;
        Integer numValueOf = Integer.valueOf(i10);
        return i0.a.n("Response Code: ", (!a0Var.containsKey(numValueOf) ? com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED : (com.google.android.gms.internal.play_billing.j) a0Var.get(numValueOf)).toString(), ", Debug Message: ", this.f18149c);
    }
}
