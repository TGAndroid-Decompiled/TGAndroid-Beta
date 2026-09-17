package c5;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.clearcut.e2;
import java.util.HashMap;
import org.telegram.ui.Cells.p6;
public final class i implements com.google.android.gms.internal.clearcut.g {
    public String f4403a;

    @Override
    public Object zzp() {
        Object obj;
        boolean z10;
        String str = this.f4403a;
        ContentResolver contentResolver = com.google.android.gms.internal.clearcut.d.f5569g.getContentResolver();
        Uri uri = e2.f5586a;
        synchronized (e2.class) {
            e2.c(contentResolver);
            obj = e2.f5594k;
        }
        HashMap hashMap = e2.f5591g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) e2.a(hashMap, str, bool);
        if (bool2 != null) {
            z10 = bool2.booleanValue();
        } else {
            String b10 = e2.b(contentResolver, str);
            boolean z11 = false;
            if (b10 != null && !b10.equals("")) {
                if (e2.f5588c.matcher(b10).matches()) {
                    bool = Boolean.TRUE;
                    z11 = true;
                } else if (!e2.d.matcher(b10).matches()) {
                    Log.w("Gservices", p6.j("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
                }
                e2.e(obj, hashMap, str, bool);
                z10 = z11;
            }
            bool = bool2;
            e2.e(obj, hashMap, str, bool);
            z10 = z11;
        }
        return Boolean.valueOf(z10);
    }
}
