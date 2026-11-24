package defpackage;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.ui.ThemeActivity;
public final class ekb implements Runnable {
    public final byte a;
    public final ThemeActivity b;

    public ekb(ThemeActivity themeActivity, byte b) {
        this.a = b;
        this.b = themeActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ThemeActivity themeActivity = this.b;
        switch (b) {
            case 0:
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(a.b, Locale.getDefault()).getFromLocation(bkb.x, bkb.y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                gl.d3(new a5b(themeActivity, str, (byte) 8));
                return;
            default:
                themeActivity.b.f1(new dkb(themeActivity, (byte) 0), 700, true);
                return;
        }
    }
}
