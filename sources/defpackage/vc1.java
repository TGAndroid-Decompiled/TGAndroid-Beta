package defpackage;
public final class vc1 implements qac {
    public final byte a;
    public final l9b b;

    public vc1(l9b l9bVar, byte b) {
        this.a = b;
        this.b = l9bVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        l9b l9bVar = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                l9bVar.setPeriod(num.intValue());
                qac qacVar = l9bVar.B1;
                if (qacVar != null) {
                    qacVar.a(num);
                    return;
                }
                return;
            default:
                qac qacVar2 = l9bVar.C1;
                if (qacVar2 != null) {
                    qacVar2.a(num);
                    return;
                }
                return;
        }
    }
}
