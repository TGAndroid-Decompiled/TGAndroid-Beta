package hi;

import android.view.TextureView;
import android.view.View;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ur;
public final class c0 implements Runnable {
    public final int f14247a;
    public final int f14248b;
    public final int f14249c;
    public final int d;
    public final Object f14250e;

    public c0(Object obj, int i7, int i10, int i11, int i12) {
        this.f14247a = i12;
        this.f14250e = obj;
        this.f14248b = i7;
        this.f14249c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f14247a) {
            case 0:
                e0 e0Var = (e0) ((d0) this.f14250e).f14319b;
                d7 d7Var = e0Var.f14494n;
                if (d7Var != null) {
                    int i7 = d7Var.f14386k0;
                    int i10 = this.f14248b;
                    int i11 = this.f14249c;
                    int i12 = this.d;
                    if (i7 != i10 || d7Var.f14388l0 != i11 || d7Var.Q != i12) {
                        d7Var.f14386k0 = i10;
                        d7Var.f14388l0 = i11;
                        d7Var.Q = i12;
                        TextureView textureView = e0Var.f14486e;
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
                oi.s3 s3Var = (oi.s3) this.f14250e;
                View D4 = s3Var.D4(this.f14248b);
                if (D4 instanceof org.telegram.ui.Cells.i9) {
                    s3Var.f22377v3.b0(this.f14249c, this.d, (org.telegram.ui.Cells.i9) D4);
                    return;
                }
                return;
            case 2:
                oi.s3.O1(((oi.i3) this.f14250e).f22135b, this.f14248b, this.f14249c, this.d);
                return;
            default:
                ur urVar = (ur) this.f14250e;
                int i13 = this.f14248b;
                int i14 = this.f14249c;
                int i15 = this.d;
                urVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = urVar.f27216b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i13);
                        sQLitePreparedStatement.bindInteger(2, i14);
                        sQLitePreparedStatement.bindInteger(3, i15);
                        sQLitePreparedStatement.step();
                    } catch (Exception e10) {
                        urVar.o(e10, true);
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
