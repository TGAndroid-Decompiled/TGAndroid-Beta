package defpackage;
public final class q24 implements hp5 {
    public final boolean a;

    public q24(boolean z) {
        this.a = z;
    }

    @Override
    public final qm7 b() {
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
