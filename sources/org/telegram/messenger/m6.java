package org.telegram.messenger;
public final class m6 {
    public final int f23988a;
    public final String f23989b;
    public final String f23990c;

    public m6(int i7, String str, String str2) {
        this.f23988a = i7;
        this.f23989b = str;
        this.f23990c = str2;
    }

    public String toString() {
        switch (this.f23988a) {
            case 1:
                return this.f23989b + ", " + this.f23990c;
            default:
                return super.toString();
        }
    }
}
