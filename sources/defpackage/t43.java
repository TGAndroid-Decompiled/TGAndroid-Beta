package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
public final class t43 extends ContentObserver {
    public final byte a = 0;
    public final Object b;

    public t43(gfb gfbVar) {
        super(new Handler());
        this.b = gfbVar;
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
                gfb gfbVar = (gfb) this.b;
                if (gfbVar.b && (cursor = gfbVar.c) != null && !cursor.isClosed()) {
                    gfbVar.a = gfbVar.c.requery();
                    return;
                }
                return;
            default:
                iad iadVar = (iad) this.b;
                synchronized (iadVar.d) {
                    iadVar.e = null;
                }
                ((iad) this.b).b();
                return;
        }
    }

    public t43(iad iadVar) {
        super(null);
        this.b = iadVar;
    }
}
