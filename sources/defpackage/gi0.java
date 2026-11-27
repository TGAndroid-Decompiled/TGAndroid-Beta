package defpackage;
public final class gi0 {
    public int a;
    public int b;
    public String c;

    public static h1 a() {
        ?? obj = new Object();
        obj.b = 0;
        obj.c = "";
        return obj;
    }

    public final String toString() {
        yfd yfdVar;
        int i = this.a;
        int i2 = old.a;
        hnd hndVar = yfd.c;
        Integer valueOf = Integer.valueOf(i);
        if (!hndVar.containsKey(valueOf)) {
            yfdVar = yfd.RESPONSE_CODE_UNSPECIFIED;
        } else {
            yfdVar = (yfd) hndVar.get(valueOf);
        }
        return qd4.q("Response Code: ", yfdVar.toString(), ", Debug Message: ", this.c);
    }
}
