package m4;

import android.graphics.BlendMode;
import android.graphics.RectF;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.vr;
import org.telegram.utils.code.highlight.PrismaHighlighter;
import v7.q8;
public final class v0 implements e2.j, g1, n2.m, d9.k, a2, mw0, Utilities.Callback2Return, ih.h, vl0, aw0, bw0 {
    public final int f16760a;

    public v0(int i10) {
        this.f16760a = i10;
    }

    public static mi.b a() {
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

    public static BlendMode c() {
        return BlendMode.SOFT_LIGHT;
    }

    @Override
    public void accept(Object obj) {
        m1 m1Var = (m1) obj;
        switch (this.f16760a) {
            case 0:
                m1Var.stop();
                return;
            case 1:
                m1Var.c0();
                return;
            case 2:
                m1Var.G();
                return;
            case 3:
            default:
                m1Var.u();
                return;
            case 4:
                m1Var.b();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.n0.u(e9.s.x(qVar.Y.f47422b, new sg.y(10)));
    }

    @Override
    public void b(Object obj, float f7) {
        vr vrVar = (vr) obj;
        switch (this.f16760a) {
            case 27:
                vrVar.f42253b = f7;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    return;
                }
                return;
            default:
                vrVar.f42254c = f7;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public Object e(f0 f0Var, v vVar, int i10) {
        switch (this.f16760a) {
            case 3:
                f0Var.getClass();
                throw new ClassCastException();
            case 4:
            case 6:
            default:
                pb.a aVar = f0Var.e;
                f0Var.s(vVar);
                aVar.getClass();
                return q8.b(new s1(-6));
            case 5:
                f0Var.getClass();
                throw new ClassCastException();
            case 7:
                f0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f16760a) {
            case 17:
                b2Var.dismiss();
                return;
            case 21:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        vr vrVar = (vr) obj;
        switch (this.f16760a) {
            case 26:
                return vrVar.f42253b;
            default:
                return vrVar.f42254c;
        }
    }

    @Override
    public void h(int i10) {
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
    public void i(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.f16760a) {
            case 20:
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
