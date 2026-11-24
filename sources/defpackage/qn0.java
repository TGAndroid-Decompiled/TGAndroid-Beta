package defpackage;

import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.scilab.forge.jlatexmath.ParseException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class qn0 implements ee, pac, gka, hka, k01, gla, t89, dja, xgc, e59, mm0, gk, ln5 {
    public final byte a;

    public static RenderNode c(Object obj) {
        return (RenderNode) obj;
    }

    public static Shader.TileMode e() {
        return Shader.TileMode.DECAL;
    }

    public static void g(String str) {
        throw new ParseException(str);
    }

    @Override
    public final void a(View view, RectF rectF) {
        view.invalidate();
    }

    @Override
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        byte b = this.a;
        return Boolean.FALSE;
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Drawable t = imageReceiver.t();
        if (t instanceof p09) {
            p09 p09Var = (p09) t;
            p09Var.K(0);
            p09Var.stop();
            p09Var.O(false, 0.0f);
        }
    }

    @Override
    public final void call() {
        throw null;
    }

    @Override
    public final void d(Object obj, float f) {
        switch (this.a) {
            case 8:
                wx0 wx0Var = (wx0) obj;
                wx0Var.c = f;
                wx0Var.f.invalidate();
                wx0Var.Y.setAlpha(f);
                wx0Var.J();
                wx0Var.H();
                return;
            case 27:
                ((x22) obj).setLoadProgress(f);
                return;
            default:
                ((d32) obj).setSwipeOffsetY(f);
                return;
        }
    }

    @Override
    public final float f(RecyclerView recyclerView) {
        return fja.j(recyclerView);
    }

    @Override
    public final float get(Object obj) {
        switch (this.a) {
            case 7:
                return ((wx0) obj).c;
            case 26:
                return ((x22) obj).c;
            default:
                return ((d32) obj).getSwipeOffsetY();
        }
    }

    @Override
    public final RecyclerView h(View view) {
        return ((ck1) view).a;
    }

    @Override
    public final void i(int i) {
        if (i == 0) {
            gda.z(3);
        } else if (i == 1) {
            gda.z(0);
        } else if (i == 2) {
            gda.z(1);
        } else if (i == 3) {
            gda.z(2);
        }
    }

    @Override
    public final int o(ylb ylbVar, boolean z) {
        return Integer.MIN_VALUE;
    }

    @Override
    public final void q(RecyclerView recyclerView) {
        hg9.d(recyclerView);
    }

    @Override
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 0:
                heVar.dismiss();
                return;
            case 1:
                heVar.dismiss();
                return;
            case 5:
                heVar.dismiss();
                return;
            case 6:
                heVar.dismiss();
                return;
            case 13:
                heVar.dismiss();
                return;
            default:
                heVar.dismiss();
                return;
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        switch (this.a) {
            case 23:
                MediaController.w().A0(1, i, z, false);
                return;
            default:
                MediaController.w().A0(1, i, z, false);
                return;
        }
    }

    public qn0(byte b) {
        this.a = b;
    }

    public qn0(Object obj, byte b) {
        this.a = b;
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void cancel() {
    }

    @Override
    public final void m() {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }
}
