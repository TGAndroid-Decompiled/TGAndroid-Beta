package org.telegram.messenger;
public abstract class rv {
    public boolean f25345a;
    public boolean f25346b;
    public long f25347c = 104857600;

    public final boolean a() {
        if (!this.f25345a && !this.f25346b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.f25346b = false;
            this.f25345a = false;
            return;
        }
        this.f25345a = true;
        this.f25346b = true;
    }
}
