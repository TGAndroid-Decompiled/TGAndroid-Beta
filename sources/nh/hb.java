package nh;
public final class hb implements Runnable {
    public final int f17859a;
    public final qb f17860b;

    public hb(qb qbVar, int i10) {
        this.f17859a = i10;
        this.f17860b = qbVar;
    }

    @Override
    public final void run() {
        switch (this.f17859a) {
            case 0:
                qb qbVar = this.f17860b;
                ob obVar = qbVar.I;
                if (obVar != null) {
                    long j10 = obVar.f18315a;
                    if (j10 > 0) {
                        qbVar.D = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                kb kbVar = this.f17860b.f18413a;
                if (kbVar != null) {
                    kbVar.y1();
                    return;
                }
                return;
            default:
                kb kbVar2 = this.f17860b.f18413a;
                if (kbVar2 != null) {
                    kbVar2.a0();
                    return;
                }
                return;
        }
    }
}
