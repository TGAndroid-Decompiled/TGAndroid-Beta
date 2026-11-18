package org.telegram.messenger;
public abstract class lv {
    public boolean f25442a;
    public boolean f25443b;
    public long f25444c = 104857600;

    public final boolean a() {
        if (!this.f25442a && !this.f25443b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.f25443b = false;
            this.f25442a = false;
            return;
        }
        this.f25442a = true;
        this.f25443b = true;
    }
}
