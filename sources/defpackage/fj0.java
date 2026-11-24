package defpackage;
public final class fj0 {
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
        hdd hddVar;
        int i = this.a;
        int i2 = yid.a;
        skd skdVar = hdd.c;
        Integer valueOf = Integer.valueOf(i);
        if (!skdVar.containsKey(valueOf)) {
            hddVar = hdd.RESPONSE_CODE_UNSPECIFIED;
        } else {
            hddVar = (hdd) skdVar.get(valueOf);
        }
        return td4.r("Response Code: ", hddVar.toString(), ", Debug Message: ", this.c);
    }
}
