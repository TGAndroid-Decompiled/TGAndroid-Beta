package defpackage;
public final class ydb extends IllegalStateException {
    public final byte a;
    public final int b;

    public ydb(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydb.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ydb.class == obj.getClass()) {
                ydb ydbVar = (ydb) obj;
                if (this.a == ydbVar.a && this.b == ydbVar.b) {
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
