package ae;
public final class s0 implements c1 {
    public final boolean f497a;

    public s0(boolean z10) {
        this.f497a = z10;
    }

    @Override
    public final x1 c() {
        return null;
    }

    @Override
    public final boolean isActive() {
        return this.f497a;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Empty{");
        if (this.f497a) {
            str = "Active";
        } else {
            str = "New";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
