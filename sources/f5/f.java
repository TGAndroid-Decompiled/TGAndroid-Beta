package f5;

import com.google.android.gms.internal.vision.e2;
public final class f {
    public int f10978a;
    public int f10979b;
    public String f10980c;

    public static f3.a a() {
        ?? obj = new Object();
        obj.f10776c = 0;
        obj.f10774a = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i7 = this.f10978a;
        int i10 = com.google.android.gms.internal.play_billing.u.f6856a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f6761c;
        Integer valueOf = Integer.valueOf(i7);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return e2.l("Response Code: ", jVar.toString(), ", Debug Message: ", this.f10980c);
    }
}
