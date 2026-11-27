package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v85 implements yn5 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public jn5 d;
    public final long e;
    public final j95 f;

    public v85(j95 j95Var, long j) {
        this.f = j95Var;
        this.e = j;
    }

    @Override
    public final void H(float f) {
        this.f.l1.O(this.d, f);
        a(f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        hl.c3(new yh1(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, (byte) 3));
    }

    public final void a(float f) {
        this.a = f;
        t85 t85Var = this.f.J1;
        if (t85Var != null) {
            for (int i = 0; i < t85Var.getChildCount(); i++) {
                View childAt = t85Var.getChildAt(i);
                if (childAt instanceof zb5) {
                    zb5 zb5Var = (zb5) childAt;
                    if (zb5Var.c()) {
                        vb5 vb5Var = zb5Var.y;
                        vb5Var.setProgress(f);
                        if (f < 1.0f) {
                            hl.T3(vb5Var, true, 1.0f, true, true);
                        } else {
                            hl.T3(vb5Var, false, 1.0f, true, true);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final fd8 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void T() {
    }

    @Override
    public final void O(boolean z, boolean z2) {
    }
}
