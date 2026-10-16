package k2;

import android.os.Bundle;
import b2.h1;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import m4.f1;
import m4.g1;
import m4.m1;
import m4.o1;
import m4.s1;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.utils.code.highlight.PrismaHighlighter;
import v7.q8;
public final class y0 implements d9.k, i5.g, m4.d0, g1, e2.j, f1 {
    public final int f14062a;

    public y0(int i10) {
        this.f14062a = i10;
    }

    public static li.b e() {
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
    public void a(m1 m1Var, m4.v vVar, List list) {
        switch (this.f14062a) {
            case 27:
                m1Var.x0(list);
                return;
            default:
                m1Var.x0(list);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        m1 m1Var = (m1) obj;
        switch (this.f14062a) {
            case 14:
                m1Var.B0();
                return;
            case 15:
                m1Var.e();
                return;
            case 16:
                m1Var.f0();
                return;
            case 17:
            case 22:
            default:
                m1Var.K();
                return;
            case 18:
                m1Var.C0();
                return;
            case 19:
                m1Var.J0();
                return;
            case 20:
                m1Var.V();
                return;
            case 21:
                m1Var.E();
                return;
            case 23:
                m1Var.I0();
                return;
            case 24:
                m1Var.H0();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        return e9.n0.y(Integer.valueOf(((v2.i) obj).f46507a));
    }

    @Override
    public Object c(m4.e0 e0Var, m4.v vVar, int i10) {
        switch (this.f14062a) {
            case 12:
                e0Var.getClass();
                throw new ClassCastException();
            case 13:
                e0Var.getClass();
                throw new ClassCastException();
            case 17:
                return e0Var.n(vVar);
            case 22:
                e0Var.getClass();
                throw new ClassCastException();
            case 25:
                pb.a aVar = e0Var.e;
                e0Var.s(vVar);
                aVar.getClass();
                return q8.b(new s1(-6));
            default:
                e0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override
    public void d(m4.u uVar, int i10) {
        switch (this.f14062a) {
            case 9:
                uVar.getClass();
                return;
            case 10:
                uVar.b(i10);
                return;
            default:
                uVar.getClass();
                return;
        }
    }

    public y0(Object obj, int i10) {
        this.f14062a = i10;
    }

    public y0(String str, int i10, int i11, m4.q qVar, int i12) {
        this.f14062a = i12;
    }

    public y0(String str, h1 h1Var) {
        this.f14062a = 25;
    }

    public y0(boolean z10, o1 o1Var, Bundle bundle) {
        this.f14062a = 17;
    }

    @Override
    public void b(Exception exc) {
    }
}
