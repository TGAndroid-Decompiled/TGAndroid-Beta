package defpackage;
public final class g34 implements ep5 {
    public final boolean a;

    public g34(boolean z) {
        this.a = z;
    }

    @Override
    public final ul7 b() {
        return null;
    }

    @Override
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.a) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
