package defpackage;
public final class ccb extends IllegalStateException {
    public final byte a;
    public final int b;

    public ccb(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccb.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ccb.class == obj.getClass()) {
                ccb ccbVar = (ccb) obj;
                if (this.a == ccbVar.a && this.b == ccbVar.b) {
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
