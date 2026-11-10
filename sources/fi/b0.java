package fi;

import android.view.TextureView;
import android.view.View;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.yr;
public final class b0 implements Runnable {
    public final int f11636a;
    public final int f11637b;
    public final int f11638c;
    public final int d;
    public final Object f11639e;

    public b0(Object obj, int i7, int i10, int i11, int i12) {
        this.f11636a = i12;
        this.f11639e = obj;
        this.f11637b = i7;
        this.f11638c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f11636a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.f11639e).f11726b;
                e7 e7Var = d0Var.f11783n;
                if (e7Var != null) {
                    int i7 = e7Var.f11904k0;
                    int i10 = this.f11637b;
                    int i11 = this.f11638c;
                    int i12 = this.d;
                    if (i7 != i10 || e7Var.f11906l0 != i11 || e7Var.Q != i12) {
                        e7Var.f11904k0 = i10;
                        e7Var.f11906l0 = i11;
                        e7Var.Q = i12;
                        TextureView textureView = d0Var.f11775e;
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
                li.t3 t3Var = (li.t3) this.f11639e;
                View D4 = t3Var.D4(this.f11637b);
                if (D4 instanceof org.telegram.ui.Cells.h9) {
                    t3Var.f18904u3.b0(this.f11638c, this.d, (org.telegram.ui.Cells.h9) D4);
                    return;
                }
                return;
            case 2:
                li.t3.O1(((li.i3) this.f11639e).f18643b, this.f11637b, this.f11638c, this.d);
                return;
            default:
                yr yrVar = (yr) this.f11639e;
                int i13 = this.f11637b;
                int i14 = this.f11638c;
                int i15 = this.d;
                yrVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = yrVar.f26725b.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i13);
                        sQLitePreparedStatement.bindInteger(2, i14);
                        sQLitePreparedStatement.bindInteger(3, i15);
                        sQLitePreparedStatement.step();
                    } catch (Exception e10) {
                        yrVar.o(e10, true);
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
