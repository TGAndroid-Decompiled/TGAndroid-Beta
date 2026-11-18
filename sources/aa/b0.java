package aa;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.clearcut.d2;
import java.util.HashMap;
public final class b0 implements com.google.android.gms.internal.clearcut.g {
    public String f782a;

    public b0(String str) {
        this.f782a = str;
    }

    @Override
    public Object zzp() {
        Object obj;
        boolean z10;
        String str = this.f782a;
        ContentResolver contentResolver = com.google.android.gms.internal.clearcut.d.f6809g.getContentResolver();
        Uri uri = d2.f6824a;
        synchronized (d2.class) {
            d2.c(contentResolver);
            obj = d2.f6832k;
        }
        HashMap hashMap = d2.f6829g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) d2.a(hashMap, str, bool);
        if (bool2 != null) {
            z10 = bool2.booleanValue();
        } else {
            String b10 = d2.b(contentResolver, str);
            boolean z11 = false;
            if (b10 != null && !b10.equals("")) {
                if (d2.f6826c.matcher(b10).matches()) {
                    bool = Boolean.TRUE;
                    z11 = true;
                } else if (!d2.d.matcher(b10).matches()) {
                    Log.w("Gservices", p5.c.l("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
                }
                d2.e(obj, hashMap, str, bool);
                z10 = z11;
            }
            bool = bool2;
            d2.e(obj, hashMap, str, bool);
            z10 = z11;
        }
        return Boolean.valueOf(z10);
    }
}
