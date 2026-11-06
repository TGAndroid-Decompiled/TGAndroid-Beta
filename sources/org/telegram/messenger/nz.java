package org.telegram.messenger;
public final class nz {
    public char f24241a;
    public String f24242b;
    public int f24243c;
    public int d;

    public static void c(char c10) {
        throw new RuntimeException("Unexpected char '" + c10 + "'.");
    }

    public final float a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nz.a():float");
    }

    public final char b() {
        int i7 = this.f24243c;
        int i10 = this.d;
        if (i7 < i10) {
            this.f24243c = i7 + 1;
        }
        int i11 = this.f24243c;
        if (i11 == i10) {
            return (char) 0;
        }
        return this.f24242b.charAt(i11);
    }

    public final void d() {
        while (true) {
            int i7 = this.f24243c;
            if (i7 < this.d && Character.isWhitespace(this.f24242b.charAt(i7))) {
                this.f24241a = b();
            } else {
                return;
            }
        }
    }
}
