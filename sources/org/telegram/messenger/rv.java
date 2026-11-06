package org.telegram.messenger;
public abstract class rv {
    public boolean f25350a;
    public boolean f25351b;
    public long f25352c = 104857600;

    public final boolean a() {
        if (!this.f25350a && !this.f25351b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.f25351b = false;
            this.f25350a = false;
            return;
        }
        this.f25350a = true;
        this.f25351b = true;
    }
}
