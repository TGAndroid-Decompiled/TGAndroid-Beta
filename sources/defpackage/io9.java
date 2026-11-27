package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class io9 implements je8 {
    public final me8 a = fc3.b().k(this);
    public ne8 b;

    @Override
    public final boolean A0() {
        return false;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final boolean E0() {
        return false;
    }

    @Override
    public final boolean G(boolean z, float f, cz9 cz9Var) {
        return false;
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final void J(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View K(LaunchActivity launchActivity) {
        return null;
    }

    @Override
    public final View P() {
        return null;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final int S() {
        return 1;
    }

    @Override
    public final int U() {
        return 1;
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final boolean Y() {
        return false;
    }

    public final void a() {
        this.a.b();
    }

    @Override
    public final dg8 a0() {
        return null;
    }

    @Override
    public final void b() {
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null) {
            MediaController.z().U(r47Var, true);
        }
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final void g(long j) {
        r47 r47Var = MediaController.z().v0;
        long duration = getDuration();
        if (r47Var != null && duration > 0) {
            MediaController.z().k0(r47Var, ((float) j) / ((float) duration));
        }
    }

    @Override
    public final void g0() {
        this.b = null;
        MediaController z = MediaController.z();
        boolean z2 = this.a.f;
        if (z.I0 == this) {
            z.I0 = null;
            kfc kfcVar = z.F0;
            if (kfcVar != null) {
                kfcVar.z0(null);
            }
            if (z2) {
                z.m(true, true, false, false);
            }
        }
    }

    @Override
    public final long getDuration() {
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null) {
            return (long) (r47Var.L0() * 1000.0d);
        }
        return 0L;
    }

    @Override
    public final boolean i() {
        if (MediaController.z().v0 != null && !MediaController.z().G()) {
            return true;
        }
        return false;
    }

    @Override
    public final void j() {
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null) {
            MediaController.z().V(r47Var);
        }
    }

    @Override
    public final long k() {
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null) {
            return (long) (r47Var.L0() * r47Var.b0 * 1000.0d);
        }
        return 0L;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final int q0() {
        return 1;
    }

    @Override
    public final float r0() {
        return 0.0f;
    }

    @Override
    public final void s(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        surfaceTexture.release();
    }

    @Override
    public final boolean v() {
        TLRPC.Message message;
        r47 r47Var = MediaController.z().v0;
        if (r47Var == null) {
            return false;
        }
        if (!r47Var.f4() && ((message = r47Var.k) == null || !message.noforwards)) {
            long B0 = r47.B0(message);
            if (!wf3.B(B0) && !uc7.s1(r47Var.K1).E2(B0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void T() {
    }

    @Override
    public final void p0() {
    }

    @Override
    public final void G0(int i) {
    }

    @Override
    public final void L(View view) {
    }

    @Override
    public final void N(View view) {
    }

    @Override
    public final void R(ne8 ne8Var) {
    }

    @Override
    public final void V(float f) {
    }

    @Override
    public final void l(View view) {
    }

    @Override
    public final void o0(View view) {
    }

    @Override
    public final void u0(int i, ArrayList arrayList) {
    }

    @Override
    public final void v0(Canvas canvas, int i, int i2) {
    }
}
