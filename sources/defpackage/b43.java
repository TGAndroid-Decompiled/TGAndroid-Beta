package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
public final class b43 extends ContentObserver {
    public final byte a = 0;
    public final Object b;

    public b43(kbb kbbVar) {
        super(new Handler());
        this.b = kbbVar;
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
                kbb kbbVar = (kbb) this.b;
                if (kbbVar.b && (cursor = kbbVar.c) != null && !cursor.isClosed()) {
                    kbbVar.a = kbbVar.c.requery();
                    return;
                }
                return;
            default:
                p5d p5dVar = (p5d) this.b;
                synchronized (p5dVar.d) {
                    p5dVar.e = null;
                }
                ((p5d) this.b).b();
                return;
        }
    }

    public b43(p5d p5dVar) {
        super(null);
        this.b = p5dVar;
    }
}
