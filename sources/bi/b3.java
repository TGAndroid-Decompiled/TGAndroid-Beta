package bi;

import android.view.TextureView;
import android.view.View;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.hs;
import org.telegram.ui.Cells.j9;
public final class b3 implements Runnable {
    public final int f2862a;
    public final int f2863b;
    public final int f2864c;
    public final int d;
    public final Object e;

    public b3(Object obj, int i10, int i11, int i12, int i13) {
        this.f2862a = i13;
        this.e = obj;
        this.f2863b = i10;
        this.f2864c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f2862a) {
            case 0:
                d4 d4Var = (d4) this.e;
                View D4 = d4Var.D4(this.f2863b);
                if (D4 instanceof j9) {
                    d4Var.f2950u3.b0(this.f2864c, this.d, (j9) D4);
                    return;
                }
                return;
            case 1:
                d4.N1(((s3) this.e).f3343b, this.f2863b, this.f2864c, this.d);
                return;
            case 2:
                hs hsVar = (hs) this.e;
                int i10 = this.f2863b;
                int i11 = this.f2864c;
                int i12 = this.d;
                hsVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = hsVar.f15940b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i10);
                        sQLitePreparedStatement.bindInteger(2, i11);
                        sQLitePreparedStatement.bindInteger(3, i12);
                        sQLitePreparedStatement.step();
                    } catch (Exception e) {
                        hsVar.o(e, true);
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
            default:
                vh.w wVar = (vh.w) ((kg.j2) this.e).f11134b;
                vh.n5 n5Var = wVar.f52081n;
                if (n5Var != null) {
                    int i13 = n5Var.f51537k0;
                    int i14 = this.f2863b;
                    int i15 = this.f2864c;
                    int i16 = this.d;
                    if (i13 != i14 || n5Var.f51539l0 != i15 || n5Var.Q != i16) {
                        n5Var.f51537k0 = i14;
                        n5Var.f51539l0 = i15;
                        n5Var.Q = i16;
                        TextureView textureView = wVar.e;
                        if (textureView != null) {
                            textureView.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
