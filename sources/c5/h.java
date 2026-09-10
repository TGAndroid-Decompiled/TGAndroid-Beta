package c5;

import com.google.android.gms.internal.vision.e2;
public final class h {
    public int f4308a;
    public int f4309b;
    public String f4310c;

    public static c3.a a() {
        ?? obj = new Object();
        obj.f4124c = 0;
        obj.f4122a = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i10 = this.f4308a;
        int i11 = com.google.android.gms.internal.play_billing.u.f5668a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f5582c;
        Integer valueOf = Integer.valueOf(i10);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return e2.i("Response Code: ", jVar.toString(), ", Debug Message: ", this.f4310c);
    }
}
