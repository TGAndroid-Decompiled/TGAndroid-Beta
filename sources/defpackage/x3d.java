package defpackage;

import java.util.Arrays;
public final class x3d {
    public final gp a;
    public final o94 b;

    public x3d(gp gpVar, o94 o94Var) {
        this.a = gpVar;
        this.b = o94Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x3d) {
            x3d x3dVar = (x3d) obj;
            if (fse.a(this.a, x3dVar.a) && fse.a(this.b, x3dVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        wm4 wm4Var = new wm4(this);
        wm4Var.a(this.a, "key");
        wm4Var.a(this.b, "feature");
        return wm4Var.toString();
    }
}
