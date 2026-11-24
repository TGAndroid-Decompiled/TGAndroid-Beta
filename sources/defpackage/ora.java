package defpackage;
public final class ora implements p8c {
    public final byte a = 1;
    public final gta b;
    public final int c;
    public final p8c d;
    public final boolean[] e;
    public final p8c f;

    public ora(gta gtaVar, int i, p8c p8cVar, boolean[] zArr, p8c p8cVar2) {
        this.b = gtaVar;
        this.c = i;
        this.d = p8cVar;
        this.e = zArr;
        this.f = p8cVar2;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        String str = "failed";
        p8c p8cVar = this.f;
        boolean[] zArr = this.e;
        p8c p8cVar2 = this.d;
        int i = this.c;
        gta gtaVar = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                zArr[0] = true;
                if (i > 0) {
                    gtaVar.O();
                }
                if (p8cVar2 != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    }
                    p8cVar2.a(str);
                }
                if (p8cVar != null) {
                    p8cVar.a(Boolean.TRUE);
                    return;
                }
                return;
            default:
                if (i > 0) {
                    gtaVar.O();
                }
                if (p8cVar2 != null) {
                    p8cVar2.a(Boolean.TRUE);
                }
                zArr[0] = true;
                if (p8cVar != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    }
                    p8cVar.a(str);
                    return;
                }
                return;
        }
    }

    public ora(gta gtaVar, boolean[] zArr, int i, p8c p8cVar, p8c p8cVar2) {
        this.b = gtaVar;
        this.e = zArr;
        this.c = i;
        this.d = p8cVar;
        this.f = p8cVar2;
    }
}
