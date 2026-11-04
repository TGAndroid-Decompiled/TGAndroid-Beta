package org.telegram.messenger;
public final class fz {
    public char f22575a;
    public String f22576b;
    public int f22577c;
    public int d;

    public static void c(char c2) {
        throw new RuntimeException("Unexpected char '" + c2 + "'.");
    }

    public final float a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fz.a():float");
    }

    public final char b() {
        int i3 = this.f22577c;
        int i10 = this.d;
        if (i3 < i10) {
            this.f22577c = i3 + 1;
        }
        int i11 = this.f22577c;
        if (i11 == i10) {
            return (char) 0;
        }
        return this.f22576b.charAt(i11);
    }

    public final void d() {
        while (true) {
            int i3 = this.f22577c;
            if (i3 < this.d && Character.isWhitespace(this.f22576b.charAt(i3))) {
                this.f22575a = b();
            } else {
                return;
            }
        }
    }
}
