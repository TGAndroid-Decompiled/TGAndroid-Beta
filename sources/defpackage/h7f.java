package defpackage;
public final class h7f {
    public Object a;
    public ief b;
    public fgf c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        ief iefVar = this.b;
        if (iefVar != null) {
            ucf ucfVar = iefVar.b;
            ucfVar.getClass();
            if (obj == null) {
                obj = y4f.h;
            }
            if (y4f.f.d(ucfVar, null, obj)) {
                y4f.d(ucfVar);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        fgf fgfVar;
        ief iefVar = this.b;
        if (iefVar != null) {
            ucf ucfVar = iefVar.b;
            if (!ucfVar.isDone()) {
                if (y4f.f.d(ucfVar, null, new z5e(new i2("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)), (byte) 4)))) {
                    y4f.d(ucfVar);
                }
            }
        }
        if (!this.d && (fgfVar = this.c) != null) {
            fgfVar.i(null);
        }
    }
}
