package defpackage;
public final class sna implements sf7 {
    public final float a;
    public final short b;

    public sna(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override
    public final ko4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sna.class == obj.getClass()) {
                sna snaVar = (sna) obj;
                if (this.a == snaVar.a && this.b == snaVar.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + ((int) this.b);
    }

    @Override
    public final void b(lt6 lt6Var) {
    }
}
