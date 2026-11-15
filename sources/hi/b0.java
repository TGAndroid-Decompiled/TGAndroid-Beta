package hi;

import android.view.TextureView;
import android.view.View;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.vr;
public final class b0 implements Runnable {
    public final int f13914a;
    public final int f13915b;
    public final int f13916c;
    public final int d;
    public final Object f13917e;

    public b0(Object obj, int i7, int i10, int i11, int i12) {
        this.f13914a = i12;
        this.f13917e = obj;
        this.f13915b = i7;
        this.f13916c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f13914a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.f13917e).f13956b;
                d7 d7Var = d0Var.f14083n;
                if (d7Var != null) {
                    int i7 = d7Var.f14147k0;
                    int i10 = this.f13915b;
                    int i11 = this.f13916c;
                    int i12 = this.d;
                    if (i7 != i10 || d7Var.f14149l0 != i11 || d7Var.Q != i12) {
                        d7Var.f14147k0 = i10;
                        d7Var.f14149l0 = i11;
                        d7Var.Q = i12;
                        TextureView textureView = d0Var.f14075e;
                        if (textureView != null) {
                            textureView.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                oi.q3 q3Var = (oi.q3) this.f13917e;
                View D4 = q3Var.D4(this.f13915b);
                if (D4 instanceof org.telegram.ui.Cells.g9) {
                    q3Var.f21943v3.b0(this.f13916c, this.d, (org.telegram.ui.Cells.g9) D4);
                    return;
                }
                return;
            case 2:
                oi.q3.O1(((oi.g3) this.f13917e).f21712b, this.f13915b, this.f13916c, this.d);
                return;
            default:
                vr vrVar = (vr) this.f13917e;
                int i13 = this.f13915b;
                int i14 = this.f13916c;
                int i15 = this.d;
                vrVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = vrVar.f27222b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i13);
                        sQLitePreparedStatement.bindInteger(2, i14);
                        sQLitePreparedStatement.bindInteger(3, i15);
                        sQLitePreparedStatement.step();
                    } catch (Exception e10) {
                        vrVar.o(e10, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
        }
    }
}
