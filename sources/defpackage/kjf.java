package defpackage;
public abstract class kjf implements Cloneable {
    public final ljf a;
    public ljf b;

    public kjf(ljf ljfVar) {
        this.a = ljfVar;
        if (!ljfVar.g()) {
            this.b = (ljf) ljfVar.h(4, null);
        } else {
            lq5.j("Default instance must be immutable.");
            throw null;
        }
    }

    public final defpackage.ljf a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjf.a():ljf");
    }

    public final ljf b() {
        boolean g = this.b.g();
        ljf ljfVar = this.b;
        if (!g) {
            return ljfVar;
        }
        ljfVar.getClass();
        glf.c.a(ljfVar.getClass()).a(ljfVar);
        ljfVar.d();
        return this.b;
    }

    public final void c() {
        if (!this.b.g()) {
            ljf ljfVar = (ljf) this.a.h(4, null);
            glf.c.a(ljfVar.getClass()).c(ljfVar, this.b);
            this.b = ljfVar;
        }
    }

    public final Object clone() {
        kjf kjfVar = (kjf) this.a.h(5, null);
        kjfVar.b = b();
        return kjfVar;
    }
}
