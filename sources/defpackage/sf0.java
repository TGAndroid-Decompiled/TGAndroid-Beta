package defpackage;

import java.util.Arrays;
public final class sf0 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    public sf0(java.lang.String r5, char[] r6, byte[] r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf0.<init>(java.lang.String, char[], byte[], boolean):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sf0) {
            sf0 sf0Var = (sf0) obj;
            if (this.h == sf0Var.h && Arrays.equals(this.b, sf0Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.b);
        if (this.h) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.a;
    }

    public sf0(java.lang.String r10, char[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf0.<init>(java.lang.String, char[]):void");
    }
}
