package org.telegram.messenger;
public final class m6 {
    public final int f23992a;
    public final String f23993b;
    public final String f23994c;

    public m6(int i7, String str, String str2) {
        this.f23992a = i7;
        this.f23993b = str;
        this.f23994c = str2;
    }

    public String toString() {
        switch (this.f23992a) {
            case 1:
                return this.f23993b + ", " + this.f23994c;
            default:
                return super.toString();
        }
    }
}
