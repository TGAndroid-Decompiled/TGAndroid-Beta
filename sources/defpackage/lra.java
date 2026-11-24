package defpackage;
public final class lra implements i8c {
    public final byte a = 0;
    public final boolean[] b;
    public final i8c c;
    public final p8c d;

    public lra(p8c p8cVar, boolean[] zArr, i8c i8cVar) {
        this.d = p8cVar;
        this.b = zArr;
        this.c = i8cVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        String str = "failed";
        p8c p8cVar = this.d;
        i8c i8cVar = this.c;
        boolean[] zArr = this.b;
        Long l = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (b) {
            case 0:
                if (p8cVar != null) {
                    p8cVar.a(Boolean.TRUE);
                }
                zArr[0] = true;
                if (bool.booleanValue()) {
                    str = "paid";
                }
                i8cVar.a(str, l);
                return;
            default:
                zArr[0] = true;
                if (bool.booleanValue()) {
                    str = "paid";
                }
                i8cVar.a(str, l);
                if (p8cVar != null) {
                    p8cVar.a(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public lra(boolean[] zArr, i8c i8cVar, p8c p8cVar) {
        this.b = zArr;
        this.c = i8cVar;
        this.d = p8cVar;
    }
}
