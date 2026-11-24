package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
public final class m53 extends ContentObserver {
    public final byte a = 0;
    public final Object b;

    public m53(mdb mdbVar) {
        super(new Handler());
        this.b = mdbVar;
    }

    @Override
    public final boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override
    public final void onChange(boolean z) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                mdb mdbVar = (mdb) this.b;
                if (mdbVar.b && (cursor = mdbVar.c) != null && !cursor.isClosed()) {
                    mdbVar.a = mdbVar.c.requery();
                    return;
                }
                return;
            default:
                r7d r7dVar = (r7d) this.b;
                synchronized (r7dVar.d) {
                    r7dVar.e = null;
                }
                ((r7d) this.b).b();
                return;
        }
    }

    public m53(r7d r7dVar) {
        super(null);
        this.b = r7dVar;
    }
}
