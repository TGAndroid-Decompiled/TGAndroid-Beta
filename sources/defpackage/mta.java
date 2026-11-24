package defpackage;
public final class mta implements jac {
    public final byte a = 0;
    public final boolean[] b;
    public final jac c;
    public final qac d;

    public mta(qac qacVar, boolean[] zArr, jac jacVar) {
        this.d = qacVar;
        this.b = zArr;
        this.c = jacVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        String str = "failed";
        qac qacVar = this.d;
        jac jacVar = this.c;
        boolean[] zArr = this.b;
        Long l = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (b) {
            case 0:
                if (qacVar != null) {
                    qacVar.a(Boolean.TRUE);
                }
                zArr[0] = true;
                if (bool.booleanValue()) {
                    str = "paid";
                }
                jacVar.a(str, l);
                return;
            default:
                zArr[0] = true;
                if (bool.booleanValue()) {
                    str = "paid";
                }
                jacVar.a(str, l);
                if (qacVar != null) {
                    qacVar.a(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public mta(boolean[] zArr, jac jacVar, qac qacVar) {
        this.b = zArr;
        this.c = jacVar;
        this.d = qacVar;
    }
}
