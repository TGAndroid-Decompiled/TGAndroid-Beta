package oi;
public final class c {
    public final String f21134a;
    public final String f21135b;

    public c(String str, String str2) {
        this.f21134a = str;
        this.f21135b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f21134a.equals(cVar.f21134a) || !this.f21135b.equals(cVar.f21135b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f21135b.hashCode() + (this.f21134a.hashCode() * 31);
    }
}
