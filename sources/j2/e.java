package j2;

import b2.k0;
import e2.m;
import e9.i0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import m4.a0;
import m4.b0;
import m4.b1;
import m4.g1;
import m4.n;
import m4.q;
import m4.r;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class e implements m, d9.e, i5.g, a0, b1, e2.h {
    public final int f13688a;

    public e(int i10) {
        this.f13688a = i10;
    }

    public static li.b b() {
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
                    return new li.b(new PrismaHighlighter(byteArray));
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
        switch (this.f13688a) {
            case 24:
                g1Var.e();
                return;
            case 25:
                g1Var.e0();
                return;
            case 26:
                g1Var.z0();
                return;
            case 27:
                g1Var.G0();
                return;
            default:
                g1Var.V();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        return i0.z(Integer.valueOf(((v2.h) obj).f49182a));
    }

    @Override
    public void d(q qVar, int i10) {
        switch (this.f13688a) {
            case 19:
                qVar.getClass();
                return;
            case 20:
                qVar.b(i10);
                return;
            default:
                qVar.getClass();
                return;
        }
    }

    @Override
    public Object h(b0 b0Var, r rVar, int i10) {
        switch (this.f13688a) {
            case 22:
                b0Var.getClass();
                throw new ClassCastException();
            case 23:
                b0Var.getClass();
                throw new ClassCastException();
            default:
                return b0Var.n(rVar);
        }
    }

    @Override
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f13688a) {
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
        this.f13688a = i10;
    }

    public e(a aVar, float f7) {
        this.f13688a = 5;
    }

    public e(a aVar, int i10) {
        this.f13688a = 3;
    }

    public e(a aVar, k0 k0Var, int i10) {
        this.f13688a = 4;
    }

    public e(a aVar, boolean z10) {
        this.f13688a = 1;
    }

    public e(Object obj, int i10) {
        this.f13688a = i10;
    }

    public e(String str, int i10, int i11, n nVar) {
        this.f13688a = 23;
    }

    @Override
    public void a(Exception exc) {
    }
}
