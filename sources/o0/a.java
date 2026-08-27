package o0;

import android.database.Cursor;
import android.net.Uri;

public interface a {
    void close();

    Cursor d(Uri uri, String[] strArr, String[] strArr2);
}
