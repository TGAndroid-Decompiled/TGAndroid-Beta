package k2;

import j$.util.Objects;
public final class o {
    public final int f13966a;
    public final int f13967b;
    public final int f13968c;
    public final boolean d;
    public final boolean e;
    public final int f13969f;
    public final b2.f f13970g;
    public final int h;
    public final int f13971i;
    public final boolean f13972j;
    public final boolean f13973k;

    public o(n nVar) {
        this.f13966a = nVar.f13957a;
        this.f13967b = nVar.f13958b;
        this.f13968c = nVar.f13959c;
        this.d = nVar.d;
        this.e = nVar.e;
        this.f13969f = nVar.f13960f;
        this.f13970g = nVar.f13961g;
        this.h = nVar.h;
        this.f13971i = nVar.f13962i;
        this.f13972j = nVar.f13963j;
        this.f13973k = nVar.f13964k;
    }

    public final n a() {
        ?? obj = new Object();
        obj.f13957a = this.f13966a;
        obj.f13958b = this.f13967b;
        obj.f13959c = this.f13968c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f13960f = this.f13969f;
        obj.f13961g = this.f13970g;
        obj.h = this.h;
        obj.f13962i = this.f13971i;
        obj.f13963j = this.f13972j;
        obj.f13964k = this.f13973k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o.class == obj.getClass()) {
                o oVar = (o) obj;
                if (this.f13966a == oVar.f13966a && this.f13967b == oVar.f13967b && this.f13968c == oVar.f13968c && this.d == oVar.d && this.e == oVar.e && this.f13969f == oVar.f13969f && this.h == oVar.h && this.f13971i == oVar.f13971i && this.f13972j == oVar.f13972j && this.f13973k == oVar.f13973k && this.f13970g.equals(oVar.f13970g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f13966a), Integer.valueOf(this.f13967b), Integer.valueOf(this.f13968c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f13969f), this.f13970g, Integer.valueOf(this.h), Integer.valueOf(this.f13971i), Boolean.valueOf(this.f13973k), Boolean.valueOf(this.f13972j));
    }
}
