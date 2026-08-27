package oa;

import java.io.IOException;
import ma.u;

public final class e extends u {

    public volatile u f19379a;

    public final boolean f19380b;

    public final boolean f19381c;
    public final ma.g d;

    public final ta.a f19382e;

    public final f f19383f;

    public e(f fVar, boolean z10, boolean z11, ma.g gVar, ta.a aVar) {
        this.f19383f = fVar;
        this.f19380b = z10;
        this.f19381c = z11;
        this.d = gVar;
        this.f19382e = aVar;
    }

    @Override
    public final Object read(ua.a aVar) throws IOException {
        if (this.f19380b) {
            aVar.C();
            return null;
        }
        u uVarC = this.f19379a;
        if (uVarC == null) {
            uVarC = this.d.c(this.f19383f, this.f19382e);
            this.f19379a = uVarC;
        }
        return uVarC.read(aVar);
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        if (this.f19381c) {
            bVar.i();
            return;
        }
        u uVarC = this.f19379a;
        if (uVarC == null) {
            uVarC = this.d.c(this.f19383f, this.f19382e);
            this.f19379a = uVarC;
        }
        uVarC.write(bVar, obj);
    }
}
