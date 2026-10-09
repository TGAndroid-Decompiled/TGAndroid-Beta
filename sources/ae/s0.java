package ae;
public final class s0 implements c1 {
    public final boolean f495a;

    public s0(boolean z10) {
        this.f495a = z10;
    }

    @Override
    public final x1 c() {
        return null;
    }

    @Override
    public final boolean isActive() {
        return this.f495a;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Empty{");
        if (this.f495a) {
            str = "Active";
        } else {
            str = "New";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
