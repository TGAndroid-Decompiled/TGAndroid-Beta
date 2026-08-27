package id;

public final class r0 implements b1 {

    public final boolean f11187a;

    public r0(boolean z10) {
        this.f11187a = z10;
    }

    @Override
    public final w1 c() {
        return null;
    }

    @Override
    public final boolean isActive() {
        return this.f11187a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Empty{");
        sb2.append(this.f11187a ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
