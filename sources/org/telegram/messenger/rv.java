package org.telegram.messenger;
public abstract class rv {
    public boolean f25342a;
    public boolean f25343b;
    public long f25344c = 104857600;

    public final boolean a() {
        if (!this.f25342a && !this.f25343b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.f25343b = false;
            this.f25342a = false;
            return;
        }
        this.f25342a = true;
        this.f25343b = true;
    }
}
