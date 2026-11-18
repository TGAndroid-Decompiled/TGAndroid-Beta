package org.telegram.messenger;
public final class hz {
    public char f24529a;
    public String f24530b;
    public int f24531c;
    public int d;

    public static void c(char c10) {
        throw new RuntimeException("Unexpected char '" + c10 + "'.");
    }

    public final float a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hz.a():float");
    }

    public final char b() {
        int i7 = this.f24531c;
        int i10 = this.d;
        if (i7 < i10) {
            this.f24531c = i7 + 1;
        }
        int i11 = this.f24531c;
        if (i11 == i10) {
            return (char) 0;
        }
        return this.f24530b.charAt(i11);
    }

    public final void d() {
        while (true) {
            int i7 = this.f24531c;
            if (i7 < this.d && Character.isWhitespace(this.f24530b.charAt(i7))) {
                this.f24529a = b();
            } else {
                return;
            }
        }
    }
}
