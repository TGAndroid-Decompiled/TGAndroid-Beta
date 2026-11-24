package defpackage;
public final class e3d extends s3d {
    public final byte b = 0;
    public final Object c;

    public e3d(f3d f3dVar, f3d f3dVar2) {
        super(f3dVar2);
        this.c = f3dVar;
    }

    @Override
    public final void a() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((f3d) obj).I0(1);
                return;
            default:
                ((fh0) obj).a(new ot2(16, null, null));
                return;
        }
    }

    public e3d(i3d i3dVar, r3d r3dVar, fh0 fh0Var) {
        super(r3dVar);
        this.c = fh0Var;
    }
}
