package defpackage;
public final class pta implements qac {
    public final byte a = 1;
    public final jva b;
    public final int c;
    public final qac d;
    public final boolean[] e;
    public final qac f;

    public pta(jva jvaVar, int i, qac qacVar, boolean[] zArr, qac qacVar2) {
        this.b = jvaVar;
        this.c = i;
        this.d = qacVar;
        this.e = zArr;
        this.f = qacVar2;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        String str = "failed";
        qac qacVar = this.f;
        boolean[] zArr = this.e;
        qac qacVar2 = this.d;
        int i = this.c;
        jva jvaVar = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                zArr[0] = true;
                if (i > 0) {
                    jvaVar.O();
                }
                if (qacVar2 != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    }
                    qacVar2.a(str);
                }
                if (qacVar != null) {
                    qacVar.a(Boolean.TRUE);
                    return;
                }
                return;
            default:
                if (i > 0) {
                    jvaVar.O();
                }
                if (qacVar2 != null) {
                    qacVar2.a(Boolean.TRUE);
                }
                zArr[0] = true;
                if (qacVar != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    }
                    qacVar.a(str);
                    return;
                }
                return;
        }
    }

    public pta(jva jvaVar, boolean[] zArr, int i, qac qacVar, qac qacVar2) {
        this.b = jvaVar;
        this.e = zArr;
        this.c = i;
        this.d = qacVar;
        this.f = qacVar2;
    }
}
