package org.telegram.messenger;
public abstract class mv {
    public boolean f25646a;
    public boolean f25647b;
    public long f25648c = 104857600;

    public final boolean a() {
        if (!this.f25646a && !this.f25647b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.f25647b = false;
            this.f25646a = false;
            return;
        }
        this.f25646a = true;
        this.f25647b = true;
    }
}
