package j3;
public final class e implements h3.g {
    public static final e h = new e(0, 0, 1, 1, 0);
    public final int f13225a;
    public final int f13226b;
    public final int f13227c;
    public final int d;
    public final int f13228e;
    public android.support.v4.media.c f13229f;

    static {
        int i9 = d5.f0.f4349a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public e(int i9, int i10, int i11, int i12, int i13) {
        this.f13225a = i9;
        this.f13226b = i10;
        this.f13227c = i11;
        this.d = i12;
        this.f13228e = i13;
    }

    public final android.support.v4.media.c a() {
        if (this.f13229f == null) {
            this.f13229f = new android.support.v4.media.c(this);
        }
        return this.f13229f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f13225a == eVar.f13225a && this.f13226b == eVar.f13226b && this.f13227c == eVar.f13227c && this.d == eVar.d && this.f13228e == eVar.f13228e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f13225a) * 31) + this.f13226b) * 31) + this.f13227c) * 31) + this.d) * 31) + this.f13228e;
    }
}
