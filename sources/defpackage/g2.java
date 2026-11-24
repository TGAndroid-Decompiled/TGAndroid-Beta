package defpackage;

import java.nio.ByteBuffer;
public abstract class g2 extends y1 {
    public static final z24 c;
    public static final z24 d;
    public int a;
    public int b;

    static {
        z74 z74Var = new z74(g2.class, "AbstractFullBox.java");
        c = z74Var.e(z74Var.d("setVersion", "com.googlecode.mp4parser.AbstractFullBox", "int", "version", "void"));
        d = z74Var.e(z74Var.d("setFlags", "com.googlecode.mp4parser.AbstractFullBox", "int", "flags", "void"));
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
        this.a = hle.i(byteBuffer);
        this.b = hle.a(byteBuffer.get()) + (hle.f(byteBuffer) << 8);
    }

    public final void g(int i) {
        oo1.r(z74.c(d, this, this, new Integer(i)));
        this.b = i;
    }

    @Override
    public void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
    }

    public final void h() {
        oo1.r(z74.c(c, this, this, new Integer(1)));
        this.a = 1;
    }

    public final void i(ByteBuffer byteBuffer) {
        ile.f(this.a, byteBuffer);
        ile.e(this.b, byteBuffer);
    }
}
