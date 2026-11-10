package org.telegram.messenger;
public abstract class rv {
    public boolean f25349a;
    public boolean f25350b;
    public long f25351c = 104857600;

    public final boolean a() {
        if (!this.f25349a && !this.f25350b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.f25350b = false;
            this.f25349a = false;
            return;
        }
        this.f25349a = true;
        this.f25350b = true;
    }
}
