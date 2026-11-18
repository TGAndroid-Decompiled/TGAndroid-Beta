package hi;

import android.view.TextureView;
import android.view.View;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.tr;
public final class c0 implements Runnable {
    public final int f14298a;
    public final int f14299b;
    public final int f14300c;
    public final int d;
    public final Object f14301e;

    public c0(Object obj, int i7, int i10, int i11, int i12) {
        this.f14298a = i12;
        this.f14301e = obj;
        this.f14299b = i7;
        this.f14300c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f14298a) {
            case 0:
                e0 e0Var = (e0) ((d0) this.f14301e).f14355b;
                d7 d7Var = e0Var.f14517n;
                if (d7Var != null) {
                    int i7 = d7Var.f14409k0;
                    int i10 = this.f14299b;
                    int i11 = this.f14300c;
                    int i12 = this.d;
                    if (i7 != i10 || d7Var.f14411l0 != i11 || d7Var.Q != i12) {
                        d7Var.f14409k0 = i10;
                        d7Var.f14411l0 = i11;
                        d7Var.Q = i12;
                        TextureView textureView = e0Var.f14509e;
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
                oi.s3 s3Var = (oi.s3) this.f14301e;
                View D4 = s3Var.D4(this.f14299b);
                if (D4 instanceof org.telegram.ui.Cells.i9) {
                    s3Var.f22346v3.b0(this.f14300c, this.d, (org.telegram.ui.Cells.i9) D4);
                    return;
                }
                return;
            case 2:
                oi.s3.O1(((oi.i3) this.f14301e).f22106b, this.f14299b, this.f14300c, this.d);
                return;
            default:
                tr trVar = (tr) this.f14301e;
                int i13 = this.f14299b;
                int i14 = this.f14300c;
                int i15 = this.d;
                trVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = trVar.f27054b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
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
