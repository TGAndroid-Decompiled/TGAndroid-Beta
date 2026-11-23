package org.telegram.messenger;
public abstract class lv {
    public boolean f25559a;
    public boolean f25560b;
    public long f25561c = 104857600;

    public final boolean a() {
        if (!this.f25559a && !this.f25560b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.f25560b = false;
            this.f25559a = false;
            return;
        }
        this.f25559a = true;
        this.f25560b = true;
    }
}
