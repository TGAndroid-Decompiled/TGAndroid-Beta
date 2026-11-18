package org.telegram.messenger;
public abstract class lv {
    public boolean f25440a;
    public boolean f25441b;
    public long f25442c = 104857600;

    public final boolean a() {
        if (!this.f25440a && !this.f25441b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.f25441b = false;
            this.f25440a = false;
            return;
        }
        this.f25440a = true;
        this.f25441b = true;
    }
}
