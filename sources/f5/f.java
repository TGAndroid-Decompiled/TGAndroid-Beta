package f5;

import com.google.android.gms.internal.vision.e2;
public final class f {
    public int f11286a;
    public int f11287b;
    public String f11288c;

    public static f3.a a() {
        ?? obj = new Object();
        obj.f11098c = 0;
        obj.f11096a = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i7 = this.f11286a;
        int i10 = com.google.android.gms.internal.play_billing.u.f7139a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f7044c;
        Integer valueOf = Integer.valueOf(i7);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return e2.l("Response Code: ", jVar.toString(), ", Debug Message: ", this.f11288c);
    }
}
