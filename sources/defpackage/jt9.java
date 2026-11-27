package defpackage;
public abstract class jt9 {
    public boolean a;
    public boolean b;
    public long c = 104857600;

    public final boolean a() {
        if (!this.a && !this.b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.b = false;
            this.a = false;
            return;
        }
        this.a = true;
        this.b = true;
    }
}
