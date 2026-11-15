package org.telegram.messenger;
public abstract class pv {
    public boolean f25992a;
    public boolean f25993b;
    public long f25994c = 104857600;

    public final boolean a() {
        if (!this.f25992a && !this.f25993b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.f25993b = false;
            this.f25992a = false;
            return;
        }
        this.f25992a = true;
        this.f25993b = true;
    }
}
