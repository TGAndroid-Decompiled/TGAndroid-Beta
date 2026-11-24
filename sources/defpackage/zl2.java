package defpackage;

import android.view.TextureView;
import android.view.View;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class zl2 implements Runnable {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final Object e;

    public zl2(Object obj, int i, int i2, int i3, byte b) {
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
                bm2 bm2Var = (bm2) ((am2) obj).b;
                g6b g6bVar = bm2Var.n;
                if (g6bVar != null) {
                    if (g6bVar.k0 != i3 || g6bVar.l0 != i2 || g6bVar.Q != i) {
                        g6bVar.k0 = i3;
                        g6bVar.l0 = i2;
                        g6bVar.Q = i;
                        TextureView textureView = bm2Var.e;
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
                cf7 cf7Var = (cf7) obj;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = cf7Var.b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i3);
                        sQLitePreparedStatement.bindInteger(2, i2);
                        sQLitePreparedStatement.bindInteger(3, i);
                        sQLitePreparedStatement.step();
                    } catch (Exception e) {
                        cf7Var.n(e, true);
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
                ch9 ch9Var = (ch9) obj;
                View C4 = ch9Var.C4(i3);
                if (C4 instanceof fkb) {
                    ch9Var.v3.a0(i2, i, (fkb) C4);
                    return;
                }
                return;
            default:
                ((sg9) obj).b.y4(i3, i2, i);
                return;
        }
    }
}
