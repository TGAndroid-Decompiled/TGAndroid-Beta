package org.telegram.messenger;
public final class lz {
    public char f24919a;
    public String f24920b;
    public int f24921c;
    public int d;

    public static void c(char c10) {
        throw new RuntimeException("Unexpected char '" + c10 + "'.");
    }

    public final float a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lz.a():float");
    }

    public final char b() {
        int i7 = this.f24921c;
        int i10 = this.d;
        if (i7 < i10) {
            this.f24921c = i7 + 1;
        }
        int i11 = this.f24921c;
        if (i11 == i10) {
            return (char) 0;
        }
        return this.f24920b.charAt(i11);
    }

    public final void d() {
        while (true) {
            int i7 = this.f24921c;
            if (i7 < this.d && Character.isWhitespace(this.f24920b.charAt(i7))) {
                this.f24919a = b();
            } else {
                return;
            }
        }
    }
}
