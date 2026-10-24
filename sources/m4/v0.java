package m4;

import android.graphics.BlendMode;
import android.graphics.RectF;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.yl0;
import org.telegram.utils.code.highlight.PrismaHighlighter;
import v7.q8;
public final class v0 implements e2.j, f1, g1, n2.m, d9.k, z1, qw0, Utilities.Callback2Return, ih.i, yl0 {
    public final int f16824a;

    public v0(int i10) {
        this.f16824a = i10;
    }

    public static mi.b c() {
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
                    return new mi.b(new PrismaHighlighter(byteArray));
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

    public static BlendMode d() {
        return BlendMode.SOFT_LIGHT;
    }

    @Override
    public Object a(f0 f0Var, v vVar, int i10) {
        switch (this.f16824a) {
            case 3:
                f0Var.getClass();
                throw new ClassCastException();
            case 7:
                f0Var.getClass();
                throw new ClassCastException();
            case 9:
                f0Var.getClass();
                throw new ClassCastException();
            case 11:
                f0Var.getClass();
                throw new ClassCastException();
            default:
                pb.a aVar = f0Var.e;
                f0Var.s(vVar);
                aVar.getClass();
                return q8.b(new s1(-6));
        }
    }

    @Override
    public void accept(Object obj) {
        m1 m1Var = (m1) obj;
        switch (this.f16824a) {
            case 0:
                m1Var.K();
                return;
            case 1:
            case 2:
            case 3:
            case 7:
            default:
                m1Var.u();
                return;
            case 4:
                m1Var.stop();
                return;
            case 5:
                m1Var.c0();
                return;
            case 6:
                m1Var.G();
                return;
            case 8:
                m1Var.b();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.f();
        return e9.n0.u(e9.s.x(qVar.Y.f47888b, new s0.b(22)));
    }

    @Override
    public void b(m1 m1Var, v vVar, List list) {
        switch (this.f16824a) {
            case 1:
                m1Var.x0(list);
                return;
            default:
                m1Var.x0(list);
                return;
        }
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f16824a) {
            case 21:
                c2Var.dismiss();
                return;
            case 25:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void i(int i10) {
        if (i10 == 0) {
            SharedConfig.setKeepMedia(3);
        } else if (i10 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i10 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i10 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override
    public void j(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.f16824a) {
            case 24:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralString("MaximumReactionsValue", num2.intValue(), new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override
    public void m() {
    }

    @Override
    public void release() {
    }
}
