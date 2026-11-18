package org.telegram.messenger;
public final class hz {
    public char f24526a;
    public String f24527b;
    public int f24528c;
    public int d;

    public static void c(char c10) {
        throw new RuntimeException("Unexpected char '" + c10 + "'.");
    }

    public final float a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hz.a():float");
    }

    public final char b() {
        int i7 = this.f24528c;
        int i10 = this.d;
        if (i7 < i10) {
            this.f24528c = i7 + 1;
        }
        int i11 = this.f24528c;
        if (i11 == i10) {
            return (char) 0;
        }
        return this.f24527b.charAt(i11);
    }

    public final void d() {
        while (true) {
            int i7 = this.f24528c;
            if (i7 < this.d && Character.isWhitespace(this.f24527b.charAt(i7))) {
                this.f24526a = b();
            } else {
                return;
            }
        }
    }
}
