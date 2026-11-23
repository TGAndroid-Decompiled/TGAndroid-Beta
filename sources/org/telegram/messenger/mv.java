package org.telegram.messenger;
public abstract class mv {
    public boolean f25610a;
    public boolean f25611b;
    public long f25612c = 104857600;

    public final boolean a() {
        if (!this.f25610a && !this.f25611b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.f25611b = false;
            this.f25610a = false;
            return;
        }
        this.f25610a = true;
        this.f25611b = true;
    }
}
