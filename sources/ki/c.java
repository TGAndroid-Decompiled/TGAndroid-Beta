package ki;

import android.os.Handler;
public final class c implements Runnable {
    public final int f13666a;
    public final i f13667b;
    public final l f13668c;

    public c(i iVar, l lVar, int i10) {
        this.f13666a = i10;
        this.f13667b = iVar;
        this.f13668c = lVar;
    }

    @Override
    public final void run() {
        q qVar;
        switch (this.f13666a) {
            case 0:
                i iVar = this.f13667b;
                c cVar = new c(iVar, this.f13668c, 2);
                Handler handler = iVar.f13722n;
                if (handler != null) {
                    handler.post(cVar);
                    return;
                }
                return;
            case 1:
                i iVar2 = this.f13667b;
                c cVar2 = new c(iVar2, this.f13668c, 3);
                Handler handler2 = iVar2.f13722n;
                if (handler2 != null) {
                    handler2.post(cVar2);
                    return;
                }
                return;
            case 2:
                i iVar3 = this.f13667b;
                l lVar = this.f13668c;
                if (iVar3.S && !iVar3.Y && iVar3.f13739w == lVar && iVar3.f13745z != null && (qVar = iVar3.v) != null) {
                    try {
                        long j3 = lVar.A;
                        if (j3 > 0) {
                            qVar.h = j3;
                            qVar.A = -1L;
                            qVar.B = 0L;
                            qVar.C = -1L;
                            qVar.f13814i = Long.MAX_VALUE;
                            qVar.f13805a0 = true;
                            m mVar = iVar3.f13715j;
                            mVar.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + i.m(iVar3.f13709f0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e) {
                        iVar3.d();
                        iVar3.t(e);
                        return;
                    }
                }
                return;
            default:
                i iVar4 = this.f13667b;
                l lVar2 = this.f13668c;
                if (iVar4.S && !iVar4.Y && iVar4.f13739w == lVar2) {
                    iVar4.d();
                    m mVar2 = iVar4.f13715j;
                    mVar2.b("common A/V start completed: segmentElapsedMs=" + i.m(iVar4.f13709f0));
                    s0 s0Var = (s0) iVar4.f13717k.f13371a;
                    s0Var.h.post(new b0(s0Var, 2));
                    return;
                }
                return;
        }
    }
}
