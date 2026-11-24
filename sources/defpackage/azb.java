package defpackage;
public final class azb implements zw5, yw5 {
    public final String a;
    public final String b;
    public final i8c c;

    public azb(i8c i8cVar, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i8cVar;
    }

    @Override
    public final void a(String str) {
        rzb.D0(this.a, str, this.b, this.c);
    }

    @Override
    public final void n(Exception exc) {
        rzb.D0(this.a, "en", this.b, this.c);
    }
}
