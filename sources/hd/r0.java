package hd;
public final class r0 implements b1 {
    public final boolean f10478a;

    public r0(boolean z10) {
        this.f10478a = z10;
    }

    @Override
    public final w1 c() {
        return null;
    }

    @Override
    public final boolean isActive() {
        return this.f10478a;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Empty{");
        if (this.f10478a) {
            str = "Active";
        } else {
            str = "New";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
