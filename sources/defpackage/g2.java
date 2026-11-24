package defpackage;

import java.nio.ByteBuffer;
public abstract class g2 extends y1 {
    public static final ai4 c;
    public static final ai4 d;
    public int a;
    public int b;

    static {
        i94 i94Var = new i94(g2.class, "AbstractFullBox.java");
        c = i94Var.e(i94Var.d("setVersion", "com.googlecode.mp4parser.AbstractFullBox", "int", "version", "void"));
        d = i94Var.e(i94Var.d("setFlags", "com.googlecode.mp4parser.AbstractFullBox", "int", "flags", "void"));
    }

    @Override
    public void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
    }

    public final int d() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.b;
    }

    public final int e() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.a;
    }

    public final void f(ByteBuffer byteBuffer) {
        this.a = jne.i(byteBuffer);
        this.b = jne.a(byteBuffer.get()) + (jne.f(byteBuffer) << 8);
    }

    public final void g(int i) {
        aq1.r(i94.c(d, this, this, new Integer(i)));
        this.b = i;
    }

    @Override
    public void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
    }

    public final void h() {
        aq1.r(i94.c(c, this, this, new Integer(1)));
        this.a = 1;
    }

    public final void i(ByteBuffer byteBuffer) {
        kne.f(this.a, byteBuffer);
        kne.e(this.b, byteBuffer);
    }
}
