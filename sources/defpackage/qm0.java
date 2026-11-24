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
public final class qm0 implements ed, o8c, eia, fia, dz0, eja, r69, bha, xec, b39, gj, ll5, js4 {
    public final byte a;

    public static RenderNode e(Object obj) {
        return (RenderNode) obj;
    }

    public static Shader.TileMode f() {
        return Shader.TileMode.DECAL;
    }

    public static void g(String str) {
        throw new ParseException(str);
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Drawable t = imageReceiver.t();
        if (t instanceof oy8) {
            oy8 oy8Var = (oy8) t;
            oy8Var.K(0);
            oy8Var.stop();
            oy8Var.O(false, 0.0f);
        }
    }

    @Override
    public final void a(View view, RectF rectF) {
        view.invalidate();
    }

    @Override
    public final void b(Object obj, float f) {
        switch (this.a) {
            case 8:
                ow0 ow0Var = (ow0) obj;
                ow0Var.c = f;
                ow0Var.f.invalidate();
                ow0Var.Y.setAlpha(f);
                ow0Var.J();
                ow0Var.H();
                return;
            case 26:
                ((m12) obj).setLoadProgress(f);
                return;
            default:
                ((r12) obj).setSwipeOffsetY(f);
                return;
        }
    }

    @Override
    public final float c(RecyclerView recyclerView) {
        return dha.j(recyclerView);
    }

    @Override
    public final void call() {
        throw null;
    }

    @Override
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        byte b = this.a;
        return Boolean.FALSE;
    }

    @Override
    public final float get(Object obj) {
        switch (this.a) {
            case 7:
                return ((ow0) obj).c;
            case 25:
                return ((m12) obj).c;
            default:
                return ((r12) obj).getSwipeOffsetY();
        }
    }

    @Override
    public final RecyclerView h(View view) {
        return ((ti1) view).a;
    }

    @Override
    public final void k(int i) {
        if (i == 0) {
            gba.z(3);
        } else if (i == 1) {
            gba.z(0);
        } else if (i == 2) {
            gba.z(1);
        } else if (i == 3) {
            gba.z(2);
        }
    }

    @Override
    public final Object m(Object obj) {
        Void r1 = (Void) obj;
        gia giaVar = r12.c0;
        return Boolean.FALSE;
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        switch (this.a) {
            case 22:
                MediaController.w().A0(1, i, z, false);
                return;
            default:
                MediaController.w().A0(1, i, z, false);
                return;
        }
    }

    @Override
    public final void t(RecyclerView recyclerView) {
        de9.d(recyclerView);
    }

    @Override
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 0:
                hdVar.dismiss();
                return;
            case 1:
                hdVar.dismiss();
                return;
            case 5:
                hdVar.dismiss();
                return;
            case 6:
                hdVar.dismiss();
                return;
            case 13:
                hdVar.dismiss();
                return;
            default:
                hdVar.dismiss();
                return;
        }
    }

    public qm0(byte b) {
        this.a = b;
    }

    public qm0(Object obj, byte b) {
        this.a = b;
    }

    @Override
    public final void cancel() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }
}
