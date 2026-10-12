package j2;

import b2.k0;
import e2.m;
import e9.i0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import m4.b0;
import m4.b1;
import m4.c0;
import m4.g1;
import m4.n;
import m4.q;
import m4.r;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class e implements m, d9.e, i5.g, b0, b1, e2.h {
    public final int f13686a;

    public e(int i10) {
        this.f13686a = i10;
    }

    public static ki.b b() {
        InputStream open = ApplicationLoader.applicationContext.getAssets().open("grammars.dat");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = open.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    open.close();
                    return new ki.b(new PrismaHighlighter(byteArray));
                }
            }
        } catch (Throwable th2) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override
    public void accept(Object obj) {
        g1 g1Var = (g1) obj;
        switch (this.f13686a) {
            case 22:
                g1Var.e();
                return;
            case 23:
                g1Var.e0();
                return;
            case 24:
                g1Var.z0();
                return;
            case 25:
                g1Var.G0();
                return;
            case 26:
            default:
                g1Var.F();
                return;
            case 27:
                g1Var.V();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        return i0.z(Integer.valueOf(((v2.h) obj).f49289a));
    }

    @Override
    public void d(q qVar, int i10) {
        switch (this.f13686a) {
            case 17:
                qVar.getClass();
                return;
            case 18:
                qVar.b(i10);
                return;
            default:
                qVar.getClass();
                return;
        }
    }

    @Override
    public Object h(c0 c0Var, r rVar, int i10) {
        switch (this.f13686a) {
            case 20:
                c0Var.getClass();
                throw new ClassCastException();
            case 21:
                c0Var.getClass();
                throw new ClassCastException();
            case 26:
                return c0Var.n(rVar);
            default:
                c0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f13686a) {
            case 0:
                bVar.getClass();
                return;
            case 1:
                bVar.getClass();
                return;
            case 2:
                bVar.getClass();
                return;
            case 3:
                bVar.getClass();
                return;
            case 4:
                bVar.getClass();
                return;
            default:
                bVar.getClass();
                return;
        }
    }

    public e(int i10, Object obj, Object obj2) {
        this.f13686a = i10;
    }

    public e(a aVar, float f7) {
        this.f13686a = 5;
    }

    public e(a aVar, int i10) {
        this.f13686a = 3;
    }

    public e(a aVar, k0 k0Var, int i10) {
        this.f13686a = 4;
    }

    public e(a aVar, boolean z10) {
        this.f13686a = 1;
    }

    public e(Object obj, int i10) {
        this.f13686a = i10;
    }

    public e(String str, int i10, int i11, n nVar) {
        this.f13686a = 21;
    }

    @Override
    public void a(Exception exc) {
    }
}
