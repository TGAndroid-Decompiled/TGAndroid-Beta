package defpackage;
public final class bi7 implements tf7 {
    public final long a;
    public final long b;
    public final long c;

    public bi7(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override
    public final ko4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi7)) {
            return false;
        }
        bi7 bi7Var = (bi7) obj;
        if (this.a == bi7Var.a && this.b == bi7Var.b && this.c == bi7Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b = tse.b(this.b);
        return tse.b(this.c) + ((b + ((tse.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override
    public final void b(lt6 lt6Var) {
    }
}
