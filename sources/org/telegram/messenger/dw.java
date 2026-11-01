package org.telegram.messenger;
public abstract class dw {
    public boolean f15447a;
    public boolean f15448b;
    public long f15449c = 104857600;

    public final boolean a() {
        if (!this.f15447a && !this.f15448b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.f15448b = false;
            this.f15447a = false;
            return;
        }
        this.f15447a = true;
        this.f15448b = true;
    }
}
