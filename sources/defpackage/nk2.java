package defpackage;

import android.view.TextureView;
import android.view.View;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class nk2 implements Runnable {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final Object e;

    public nk2(Object obj, int i, int i2, int i3, byte b) {
        this.a = b;
        this.e = obj;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        Object obj = this.e;
        switch (b) {
            case 0:
                pk2 pk2Var = (pk2) ((ok2) obj).b;
                f4b f4bVar = pk2Var.n;
                if (f4bVar != null) {
                    if (f4bVar.k0 != i3 || f4bVar.l0 != i2 || f4bVar.Q != i) {
                        f4bVar.k0 = i3;
                        f4bVar.l0 = i2;
                        f4bVar.Q = i;
                        TextureView textureView = pk2Var.e;
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
                ad7 ad7Var = (ad7) obj;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = ad7Var.b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i3);
                        sQLitePreparedStatement.bindInteger(2, i2);
                        sQLitePreparedStatement.bindInteger(3, i);
                        sQLitePreparedStatement.step();
                    } catch (Exception e) {
                        ad7Var.n(e, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 2:
                ye9 ye9Var = (ye9) obj;
                View C4 = ye9Var.C4(i3);
                if (C4 instanceof eib) {
                    ye9Var.v3.a0(i2, i, (eib) C4);
                    return;
                }
                return;
            default:
                ((oe9) obj).b.y4(i3, i2, i);
                return;
        }
    }
}
