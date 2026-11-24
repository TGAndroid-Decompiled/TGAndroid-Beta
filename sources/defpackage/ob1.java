package defpackage;
public final class ob1 implements p8c {
    public final byte a;
    public final j7b b;

    public ob1(j7b j7bVar, byte b) {
        this.a = b;
        this.b = j7bVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        j7b j7bVar = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                j7bVar.setPeriod(num.intValue());
                p8c p8cVar = j7bVar.B1;
                if (p8cVar != null) {
                    p8cVar.a(num);
                    return;
                }
                return;
            default:
                p8c p8cVar2 = j7bVar.C1;
                if (p8cVar2 != null) {
                    p8cVar2.a(num);
                    return;
                }
                return;
        }
    }
}
