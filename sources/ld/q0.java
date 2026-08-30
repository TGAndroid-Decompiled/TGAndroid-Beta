package ld;
public final class q0 implements a1 {
    public final boolean f11912a;

    public q0(boolean z4) {
        this.f11912a = z4;
    }

    @Override
    public final v1 c() {
        return null;
    }

    @Override
    public final boolean isActive() {
        return this.f11912a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f11912a) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
