package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
public final class p8c implements yeb {
    public final byte a;
    public final mq9 b;

    public p8c(mq9 mq9Var, byte b) {
        this.a = b;
        this.b = mq9Var;
    }

    @Override
    public final Object e() {
        SQLiteDatabase a;
        byte b = this.a;
        mq9 mq9Var = this.b;
        switch (b) {
            case 0:
                mq9Var.getClass();
                int i = ak2.e;
                xvc xvcVar = new xvc((byte) 3, false);
                xvcVar.b = null;
                xvcVar.c = new ArrayList();
                xvcVar.d = null;
                xvcVar.e = "";
                HashMap hashMap = new HashMap();
                a = mq9Var.a();
                a.beginTransaction();
                try {
                    ak2 ak2Var = (ak2) mq9.h(a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new jq9(mq9Var, hashMap, xvcVar, (byte) 1));
                    a.setTransactionSuccessful();
                    return ak2Var;
                } finally {
                }
            default:
                long a2 = mq9Var.b.a() - mq9Var.d.d;
                a = mq9Var.a();
                a.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(a2)};
                    Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i2 = rawQuery.getInt(0);
                        mq9Var.e(i2, wd6.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a.delete("events", "timestamp_ms < ?", strArr);
                    a.setTransactionSuccessful();
                    a.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
        }
    }
}
