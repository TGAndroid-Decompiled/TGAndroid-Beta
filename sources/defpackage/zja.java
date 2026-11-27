package defpackage;

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.a;
public final class zja implements Runnable {
    public final byte a;
    public final FrameLayout b;
    public final double c;
    public final double d;

    public zja(FrameLayout frameLayout, double d, double d2, byte b) {
        this.a = b;
        this.b = frameLayout;
        this.c = d;
        this.d = d2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                aka akaVar = (aka) this.b;
                double d = this.c;
                double d2 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(a.b, ob6.D0().y).getFromLocation(d, d2, 1);
                    if (fromLocation.isEmpty()) {
                        String c = id6.c(d2, d);
                        akaVar.L = c;
                        if (c == null) {
                            akaVar.L = "";
                        } else {
                            akaVar.L = "🌊 " + ((Object) akaVar.L);
                        }
                    } else {
                        Address address = fromLocation.get(0);
                        StringBuilder sb = new StringBuilder();
                        HashSet hashSet = new HashSet();
                        hashSet.add(address.getSubAdminArea());
                        hashSet.add(address.getAdminArea());
                        hashSet.add(address.getLocality());
                        hashSet.add(address.getCountryName());
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (!TextUtils.isEmpty(str)) {
                                if (sb.length() > 0) {
                                    sb.append(", ");
                                }
                                sb.append(str);
                            }
                        }
                        akaVar.L = sb.toString();
                        String b = id6.b(address.getCountryCode());
                        if (b != null && pv3.g(b) != null) {
                            akaVar.L = b + " " + ((Object) akaVar.L);
                        }
                    }
                } catch (Exception unused) {
                }
                hl.c3(new zja(akaVar, d, d2, (byte) 1));
                return;
            case 1:
                aka akaVar2 = (aka) this.b;
                double d3 = this.c;
                double d4 = this.d;
                akaVar2.I = d3;
                akaVar2.J = d4;
                akaVar2.H = false;
                CharSequence charSequence = akaVar2.L;
                ema emaVar = akaVar2.d;
                CharSequence m = pv3.m(charSequence, emaVar.getPaint().getFontMetricsInt(), false, null, 0);
                akaVar2.L = m;
                emaVar.l(m, false);
                return;
            default:
                ((s42) this.b).f0(this.c, this.d);
                return;
        }
    }
}
