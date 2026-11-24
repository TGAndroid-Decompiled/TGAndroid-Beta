package defpackage;
public final class f05 implements i8c {
    public final byte a;
    public final i8c b;

    public f05(i8c i8cVar, byte b) {
        this.a = b;
        this.b = i8cVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        i8c i8cVar = this.b;
        switch (b) {
            case 0:
                i8cVar.a((y05) obj, (String) obj2);
                return;
            default:
                i8cVar.a((Long) obj, (Boolean) obj2);
                return;
        }
    }
}
