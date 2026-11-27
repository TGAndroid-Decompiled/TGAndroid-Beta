package defpackage;
public final class zca extends bda {
    public final byte f;
    public final yca g;
    public final cda h;

    public zca(cda cdaVar, yca ycaVar, byte b) {
        this.f = b;
        this.h = cdaVar;
        this.g = ycaVar;
    }

    @Override
    public final void a() {
        byte b = this.f;
        cda cdaVar = this.h;
        switch (b) {
            case 0:
                tca tcaVar = cdaVar.h;
                float f = tcaVar.i;
                float f2 = tcaVar.j;
                this.d = f;
                this.e = f2;
                return;
            default:
                tca tcaVar2 = cdaVar.h;
                float f3 = tcaVar2.d;
                float f4 = tcaVar2.e;
                this.d = f3;
                this.e = f4;
                return;
        }
    }

    @Override
    public final void b(float f, float f2) {
        byte b = this.f;
        yca ycaVar = this.g;
        cda cdaVar = this.h;
        switch (b) {
            case 0:
                tca tcaVar = cdaVar.h;
                tcaVar.i = f;
                tcaVar.j = f2;
                this.d = f;
                this.e = f2;
                ycaVar.a();
                return;
            default:
                tca tcaVar2 = cdaVar.h;
                tcaVar2.d = f;
                tcaVar2.e = f2;
                this.d = f;
                this.e = f2;
                ycaVar.a();
                return;
        }
    }
}
