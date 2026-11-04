package gi;

import android.view.TextureView;
import android.view.View;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.qr;
public final class b0 implements Runnable {
    public final int f12424a;
    public final int f12425b;
    public final int f12426c;
    public final int d;
    public final Object f12427e;

    public b0(Object obj, int i3, int i10, int i11, int i12) {
        this.f12424a = i12;
        this.f12427e = obj;
        this.f12425b = i3;
        this.f12426c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f12424a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.f12427e).f12476b;
                f7 f7Var = d0Var.f12544n;
                if (f7Var != null) {
                    int i3 = f7Var.f12726k0;
                    int i10 = this.f12425b;
                    int i11 = this.f12426c;
                    int i12 = this.d;
                    if (i3 != i10 || f7Var.f12728l0 != i11 || f7Var.Q != i12) {
                        f7Var.f12726k0 = i10;
                        f7Var.f12728l0 = i11;
                        f7Var.Q = i12;
                        TextureView textureView = d0Var.f12536e;
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
                mi.t3 t3Var = (mi.t3) this.f12427e;
                View D4 = t3Var.D4(this.f12425b);
                if (D4 instanceof org.telegram.ui.Cells.g9) {
                    t3Var.f19928v3.b0(this.f12426c, this.d, (org.telegram.ui.Cells.g9) D4);
                    return;
                }
                return;
            case 2:
                mi.t3.O1(((mi.j3) this.f12427e).f19702b, this.f12425b, this.f12426c, this.d);
                return;
            default:
                qr qrVar = (qr) this.f12427e;
                int i13 = this.f12425b;
                int i14 = this.f12426c;
                int i15 = this.d;
                qrVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = qrVar.f24936b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i13);
                        sQLitePreparedStatement.bindInteger(2, i14);
                        sQLitePreparedStatement.bindInteger(3, i15);
                        sQLitePreparedStatement.step();
                    } catch (Exception e10) {
                        qrVar.o(e10, true);
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
