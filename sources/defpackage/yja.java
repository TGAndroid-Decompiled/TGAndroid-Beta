package defpackage;
public final class yja implements jd7 {
    public final float a;
    public final short b;

    public yja(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override
    public final fm4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && yja.class == obj.getClass()) {
                yja yjaVar = (yja) obj;
                if (this.a == yjaVar.a && this.b == yjaVar.b) {
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
    public final void b(hr6 hr6Var) {
    }
}
