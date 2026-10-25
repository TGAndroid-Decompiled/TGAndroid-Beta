package m4;

import a8.qd;
import android.graphics.BlendMode;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.ee;
import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class x0 implements h1, e2.j, j5.g, n2.l, e9.k, b2, yw0, Utilities.Callback2Return, jw0, jh.i {
    public final int f18298a;

    public x0(int i10) {
        this.f18298a = i10;
    }

    public static ni.b a() {
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
                    return new ni.b(new PrismaHighlighter(byteArray));
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

    public static BlendMode e() {
        return BlendMode.SOFT_LIGHT;
    }

    @Override
    public void accept(Object obj) {
        n1 n1Var = (n1) obj;
        switch (this.f18298a) {
            case 1:
                n1Var.stop();
                return;
            case 2:
                n1Var.c0();
                return;
            case 3:
                n1Var.G();
                return;
            case 4:
            default:
                n1Var.u();
                return;
            case 5:
                n1Var.a();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return f9.i0.u(f9.o.x(qVar.Y.f49413b, new s0.b(20)));
    }

    @Override
    public float b(RecyclerView recyclerView) {
        return b10.c(recyclerView);
    }

    @Override
    public Object c(f0 f0Var, w wVar, int i10) {
        switch (this.f18298a) {
            case 0:
                f0Var.getClass();
                throw new ClassCastException();
            case 4:
                f0Var.getClass();
                throw new ClassCastException();
            case 6:
                f0Var.getClass();
                throw new ClassCastException();
            case 8:
                f0Var.getClass();
                throw new ClassCastException();
            default:
                qb.a aVar = f0Var.e;
                f0Var.s(wVar);
                aVar.getClass();
                return qd.b(new t1(-6));
        }
    }

    @Override
    public void h(e2 e2Var, int i10) {
        switch (this.f18298a) {
            case 23:
                e2Var.dismiss();
                return;
            default:
                e2Var.dismiss();
                return;
        }
    }

    @Override
    public RecyclerView i(View view) {
        return ((ee) view).f39088a;
    }

    @Override
    public void j(int i10) {
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
    public void k(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public void n(RecyclerView recyclerView) {
        b10.b(recyclerView);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return LocaleController.formatPluralString("MaximumReactionsValue", num.intValue(), new Object[0]);
        }
        return "" + num;
    }

    @Override
    public void m() {
    }

    @Override
    public void release() {
    }

    @Override
    public void d(Exception exc) {
    }
}
