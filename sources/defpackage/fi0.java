package defpackage;
public final class fi0 {
    public int a;
    public int b;
    public String c;

    public static g1 a() {
        ?? obj = new Object();
        obj.b = 0;
        obj.c = "";
        return obj;
    }

    public final String toString() {
        fbd fbdVar;
        int i = this.a;
        int i2 = xgd.a;
        qid qidVar = fbd.c;
        Integer valueOf = Integer.valueOf(i);
        if (!qidVar.containsKey(valueOf)) {
            fbdVar = fbd.RESPONSE_CODE_UNSPECIFIED;
        } else {
            fbdVar = (fbd) qidVar.get(valueOf);
        }
        return tb4.q("Response Code: ", fbdVar.toString(), ", Debug Message: ", this.c);
    }
}
