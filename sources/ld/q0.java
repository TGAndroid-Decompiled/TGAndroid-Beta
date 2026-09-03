package ld;
public final class q0 implements a1 {
    public final boolean f12022a;

    public q0(boolean z4) {
        this.f12022a = z4;
    }

    @Override
    public final v1 c() {
        return null;
    }

    @Override
    public final boolean isActive() {
        return this.f12022a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f12022a) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
