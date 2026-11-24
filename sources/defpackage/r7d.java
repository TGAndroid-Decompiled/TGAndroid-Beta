package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public final class r7d {
    public static final ConcurrentHashMap h = new ConcurrentHashMap();
    public static final String[] i = {"key", "value"};
    public final ContentResolver a;
    public final Uri b;
    public volatile HashMap e;
    public final Object d = new Object();
    public final Object f = new Object();
    public final ArrayList g = new ArrayList();
    public final m53 c = new m53(this);

    public r7d(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.b = uri;
    }

    public final HashMap a() {
        try {
            HashMap hashMap = new HashMap();
            Cursor query = this.a.query(this.b, i, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
                return hashMap;
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    public final void b() {
        synchronized (this.f) {
            Iterator it = this.g.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
        }
    }
}
