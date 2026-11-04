package org.telegram.messenger;
public abstract class jv {
    public boolean f23727a;
    public boolean f23728b;
    public long f23729c = 104857600;

    public final boolean a() {
        if (!this.f23727a && !this.f23728b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.f23728b = false;
            this.f23727a = false;
            return;
        }
        this.f23727a = true;
        this.f23728b = true;
    }
}
