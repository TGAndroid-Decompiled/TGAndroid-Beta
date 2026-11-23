package hi;

import android.view.TextureView;
import android.view.View;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.tr;
public final class k0 implements Runnable {
    public final int f14763a;
    public final int f14764b;
    public final int f14765c;
    public final int d;
    public final Object f14766e;

    public k0(Object obj, int i7, int i10, int i11, int i12) {
        this.f14763a = i12;
        this.f14766e = obj;
        this.f14764b = i7;
        this.f14765c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f14763a) {
            case 0:
                m0 m0Var = (m0) ((l0) this.f14766e).f14808b;
                x7 x7Var = m0Var.f14875n;
                if (x7Var != null) {
                    int i7 = x7Var.f15757k0;
                    int i10 = this.f14764b;
                    int i11 = this.f14765c;
                    int i12 = this.d;
                    if (i7 != i10 || x7Var.f15759l0 != i11 || x7Var.Q != i12) {
                        x7Var.f15757k0 = i10;
                        x7Var.f15759l0 = i11;
                        x7Var.Q = i12;
                        TextureView textureView = m0Var.f14867e;
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
                oi.t3 t3Var = (oi.t3) this.f14766e;
                View D4 = t3Var.D4(this.f14764b);
                if (D4 instanceof org.telegram.ui.Cells.h9) {
                    t3Var.f22507v3.b0(this.f14765c, this.d, (org.telegram.ui.Cells.h9) D4);
                    return;
                }
                return;
            case 2:
                oi.t3.O1(((oi.j3) this.f14766e).f22265b, this.f14764b, this.f14765c, this.d);
                return;
            default:
                tr trVar = (tr) this.f14766e;
                int i13 = this.f14764b;
                int i14 = this.f14765c;
                int i15 = this.d;
                trVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = trVar.f27151b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
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
