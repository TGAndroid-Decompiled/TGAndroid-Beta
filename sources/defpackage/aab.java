package defpackage;
public final class aab extends IllegalStateException {
    public final byte a;
    public final int b;

    public aab(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aab.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && aab.class == obj.getClass()) {
                aab aabVar = (aab) obj;
                if (this.a == aabVar.a && this.b == aabVar.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.a) * 31) + this.b;
    }
}
