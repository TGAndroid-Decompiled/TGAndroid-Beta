package org.telegram.messenger;
public abstract class cw {
    public boolean f15091a;
    public boolean f15092b;
    public long f15093c = 104857600;

    public final boolean a() {
        if (!this.f15091a && !this.f15092b) {
            return false;
        }
        return true;
    }

    public void b() {
        if (a()) {
            this.f15092b = false;
            this.f15091a = false;
            return;
        }
        this.f15091a = true;
        this.f15092b = true;
    }
}
