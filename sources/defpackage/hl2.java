package defpackage;

import android.view.TextureView;
import android.view.View;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class hl2 implements Runnable {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final Object e;

    public hl2(Object obj, int i, int i2, int i3, byte b) {
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
                jl2 jl2Var = (jl2) ((il2) obj).b;
                c8b c8bVar = jl2Var.n;
                if (c8bVar != null) {
                    if (c8bVar.k0 != i3 || c8bVar.l0 != i2 || c8bVar.Q != i) {
                        c8bVar.k0 = i3;
                        c8bVar.l0 = i2;
                        c8bVar.Q = i;
                        TextureView textureView = jl2Var.e;
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
                jf7 jf7Var = (jf7) obj;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = jf7Var.b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i3);
                        sQLitePreparedStatement.bindInteger(2, i2);
                        sQLitePreparedStatement.bindInteger(3, i);
                        sQLitePreparedStatement.step();
                    } catch (Exception e) {
                        jf7Var.n(e, true);
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
                pi9 pi9Var = (pi9) obj;
                View D4 = pi9Var.D4(i3);
                if (D4 instanceof zlb) {
                    pi9Var.v3.a0(i2, i, (zlb) D4);
                    return;
                }
                return;
            default:
                ((fi9) obj).b.z4(i3, i2, i);
                return;
        }
    }
}
