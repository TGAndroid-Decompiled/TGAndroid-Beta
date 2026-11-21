package hi;

import android.view.TextureView;
import android.view.View;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.tr;
public final class d0 implements Runnable {
    public final int f14456a;
    public final int f14457b;
    public final int f14458c;
    public final int d;
    public final Object f14459e;

    public d0(Object obj, int i7, int i10, int i11, int i12) {
        this.f14456a = i12;
        this.f14459e = obj;
        this.f14457b = i7;
        this.f14458c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f14456a) {
            case 0:
                f0 f0Var = (f0) ((e0) this.f14459e).f14580b;
                c7 c7Var = f0Var.f14623n;
                if (c7Var != null) {
                    int i7 = c7Var.f14359k0;
                    int i10 = this.f14457b;
                    int i11 = this.f14458c;
                    int i12 = this.d;
                    if (i7 != i10 || c7Var.f14361l0 != i11 || c7Var.Q != i12) {
                        c7Var.f14359k0 = i10;
                        c7Var.f14361l0 = i11;
                        c7Var.Q = i12;
                        TextureView textureView = f0Var.f14615e;
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
                oi.t3 t3Var = (oi.t3) this.f14459e;
                View D4 = t3Var.D4(this.f14457b);
                if (D4 instanceof org.telegram.ui.Cells.i9) {
                    t3Var.f22437v3.b0(this.f14458c, this.d, (org.telegram.ui.Cells.i9) D4);
                    return;
                }
                return;
            case 2:
                oi.t3.O1(((oi.j3) this.f14459e).f22197b, this.f14457b, this.f14458c, this.d);
                return;
            default:
                tr trVar = (tr) this.f14459e;
                int i13 = this.f14457b;
                int i14 = this.f14458c;
                int i15 = this.d;
                trVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = trVar.f27082b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i13);
                        sQLitePreparedStatement.bindInteger(2, i14);
                        sQLitePreparedStatement.bindInteger(3, i15);
                        sQLitePreparedStatement.step();
                    } catch (Exception e10) {
                        trVar.o(e10, true);
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
