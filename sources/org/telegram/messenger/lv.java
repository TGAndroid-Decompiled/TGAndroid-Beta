package org.telegram.messenger;
public abstract class lv {
    public boolean f25468a;
    public boolean f25469b;
    public long f25470c = 104857600;

    public final boolean a() {
        if (!this.f25468a && !this.f25469b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.f25469b = false;
            this.f25468a = false;
            return;
        }
        this.f25468a = true;
        this.f25469b = true;
    }
}
