package defpackage;
public final class oh7 implements tf7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public oh7(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
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
        if (obj != null && oh7.class == obj.getClass()) {
            oh7 oh7Var = (oh7) obj;
            if (this.a == oh7Var.a && this.b == oh7Var.b && this.c == oh7Var.c && this.d == oh7Var.d && this.e == oh7Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b = tse.b(this.b);
        int b2 = tse.b(this.c);
        int b3 = tse.b(this.d);
        return tse.b(this.e) + ((b3 + ((b2 + ((b + ((tse.b(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void b(lt6 lt6Var) {
    }
}
