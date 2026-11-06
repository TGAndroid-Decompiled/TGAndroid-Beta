package org.telegram.messenger;
public final class m6 {
    public final int f23984a;
    public final String f23985b;
    public final String f23986c;

    public m6(int i7, String str, String str2) {
        this.f23984a = i7;
        this.f23985b = str;
        this.f23986c = str2;
    }

    public String toString() {
        switch (this.f23984a) {
            case 1:
                return this.f23985b + ", " + this.f23986c;
            default:
                return super.toString();
        }
    }
}
