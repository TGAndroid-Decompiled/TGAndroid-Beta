package defpackage;
public final class jba extends lba {
    public final byte f;
    public final iba g;
    public final mba h;

    public jba(mba mbaVar, iba ibaVar, byte b) {
        this.f = b;
        this.h = mbaVar;
        this.g = ibaVar;
    }

    @Override
    public final void a() {
        byte b = this.f;
        mba mbaVar = this.h;
        switch (b) {
            case 0:
                dba dbaVar = mbaVar.h;
                float f = dbaVar.i;
                float f2 = dbaVar.j;
                this.d = f;
                this.e = f2;
                return;
            default:
                dba dbaVar2 = mbaVar.h;
                float f3 = dbaVar2.d;
                float f4 = dbaVar2.e;
                this.d = f3;
                this.e = f4;
                return;
        }
    }

    @Override
    public final void b(float f, float f2) {
        byte b = this.f;
        iba ibaVar = this.g;
        mba mbaVar = this.h;
        switch (b) {
            case 0:
                dba dbaVar = mbaVar.h;
                dbaVar.i = f;
                dbaVar.j = f2;
                this.d = f;
                this.e = f2;
                ibaVar.a();
                return;
            default:
                dba dbaVar2 = mbaVar.h;
                dbaVar2.d = f;
                dbaVar2.e = f2;
                this.d = f;
                this.e = f2;
                ibaVar.a();
                return;
        }
    }
}
