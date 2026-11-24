package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class r85 implements vn5 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public gn5 d;
    public final long e;
    public final g95 f;

    public r85(g95 g95Var, long j) {
        this.f = g95Var;
        this.e = j;
    }

    @Override
    public final void H(float f) {
        this.f.l1.O(this.d, f);
        a(f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gm.c3(new xi1(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, (byte) 3));
    }

    public final void a(float f) {
        this.a = f;
        p85 p85Var = this.f.J1;
        if (p85Var != null) {
            for (int i = 0; i < p85Var.getChildCount(); i++) {
                View childAt = p85Var.getChildAt(i);
                if (childAt instanceof wb5) {
                    wb5 wb5Var = (wb5) childAt;
                    if (wb5Var.c()) {
                        sb5 sb5Var = wb5Var.y;
                        sb5Var.setProgress(f);
                        if (f < 1.0f) {
                            gm.T3(sb5Var, true, 1.0f, true, true);
                        } else {
                            gm.T3(sb5Var, false, 1.0f, true, true);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final qb8 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void T() {
    }

    @Override
    public final void O(boolean z, boolean z2) {
    }
}
