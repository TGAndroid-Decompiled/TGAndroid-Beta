package defpackage;
public final class ada extends cda {
    public final byte f;
    public final zca g;
    public final dda h;

    public ada(dda ddaVar, zca zcaVar, byte b) {
        this.f = b;
        this.h = ddaVar;
        this.g = zcaVar;
    }

    @Override
    public final void a() {
        byte b = this.f;
        dda ddaVar = this.h;
        switch (b) {
            case 0:
                uca ucaVar = ddaVar.h;
                float f = ucaVar.i;
                float f2 = ucaVar.j;
                this.d = f;
                this.e = f2;
                return;
            default:
                uca ucaVar2 = ddaVar.h;
                float f3 = ucaVar2.d;
                float f4 = ucaVar2.e;
                this.d = f3;
                this.e = f4;
                return;
        }
    }

    @Override
    public final void b(float f, float f2) {
        byte b = this.f;
        zca zcaVar = this.g;
        dda ddaVar = this.h;
        switch (b) {
            case 0:
                uca ucaVar = ddaVar.h;
                ucaVar.i = f;
                ucaVar.j = f2;
                this.d = f;
                this.e = f2;
                zcaVar.a();
                return;
            default:
                uca ucaVar2 = ddaVar.h;
                ucaVar2.d = f;
                ucaVar2.e = f2;
                this.d = f;
                this.e = f2;
                zcaVar.a();
                return;
        }
    }
}
