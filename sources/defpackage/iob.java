package defpackage;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.ui.ThemeActivity;
public final class iob implements Runnable {
    public final byte a;
    public final ThemeActivity b;

    public iob(ThemeActivity themeActivity, byte b) {
        this.a = b;
        this.b = themeActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ThemeActivity themeActivity = this.b;
        switch (b) {
            case 0:
                themeActivity.b.g1(new job(themeActivity, (byte) 0), 700, true);
                return;
            default:
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(a.b, Locale.getDefault()).getFromLocation(aob.x, aob.y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                hl.c3(new hab(themeActivity, str, (byte) 5));
                return;
        }
    }
}
