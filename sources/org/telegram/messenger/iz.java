package org.telegram.messenger;
public final class iz {
    public char f24770a;
    public String f24771b;
    public int f24772c;
    public int d;

    public static void c(char c10) {
        throw new RuntimeException("Unexpected char '" + c10 + "'.");
    }

    public final float a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.iz.a():float");
    }

    public final char b() {
        int i7 = this.f24772c;
        int i10 = this.d;
        if (i7 < i10) {
            this.f24772c = i7 + 1;
        }
        int i11 = this.f24772c;
        if (i11 == i10) {
            return (char) 0;
        }
        return this.f24771b.charAt(i11);
    }

    public final void d() {
        while (true) {
            int i7 = this.f24772c;
            if (i7 < this.d && Character.isWhitespace(this.f24771b.charAt(i7))) {
                this.f24770a = b();
            } else {
                return;
            }
        }
    }
}
