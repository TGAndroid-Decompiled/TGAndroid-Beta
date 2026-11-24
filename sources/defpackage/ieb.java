package defpackage;
public final class ieb {
    public char a;
    public String b;
    public int c;
    public int d;

    public static void c(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    public final float a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ieb.a():float");
    }

    public final char b() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            i++;
            this.c = i;
        }
        if (i == i2) {
            return (char) 0;
        }
        return this.b.charAt(i);
    }

    public final void d() {
        while (true) {
            int i = this.c;
            if (i < this.d && Character.isWhitespace(this.b.charAt(i))) {
                this.a = b();
            } else {
                return;
            }
        }
    }
}
