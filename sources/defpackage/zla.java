package defpackage;
public final class zla implements lf7 {
    public final float a;
    public final short b;

    public zla(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override
    public final go4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && zla.class == obj.getClass()) {
                zla zlaVar = (zla) obj;
                if (this.a == zlaVar.a && this.b == zlaVar.b) {
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
    public final void b(ht6 ht6Var) {
    }
}
