package defpackage;

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.a;
public final class iia implements Runnable {
    public final byte a;
    public final FrameLayout b;
    public final double c;
    public final double d;

    public iia(FrameLayout frameLayout, double d, double d2, byte b) {
        this.a = b;
        this.b = frameLayout;
        this.c = d;
        this.d = d2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                jia jiaVar = (jia) this.b;
                double d = this.c;
                double d2 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(a.b, jb6.D0().y).getFromLocation(d, d2, 1);
                    if (fromLocation.isEmpty()) {
                        String c = dd6.c(d2, d);
                        jiaVar.L = c;
                        if (c == null) {
                            jiaVar.L = "";
                        } else {
                            jiaVar.L = "🌊 " + ((Object) jiaVar.L);
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
                        jiaVar.L = sb.toString();
                        String b = dd6.b(address.getCountryCode());
                        if (b != null && gw3.g(b) != null) {
                            jiaVar.L = b + " " + ((Object) jiaVar.L);
                        }
                    }
                } catch (Exception unused) {
                }
                gm.c3(new iia(jiaVar, d, d2, (byte) 1));
                return;
            case 1:
                jia jiaVar2 = (jia) this.b;
                double d3 = this.c;
                double d4 = this.d;
                jiaVar2.I = d3;
                jiaVar2.J = d4;
                jiaVar2.H = false;
                CharSequence charSequence = jiaVar2.L;
                lka lkaVar = jiaVar2.d;
                CharSequence m = gw3.m(charSequence, lkaVar.getPaint().getFontMetricsInt(), false, null, 0);
                jiaVar2.L = m;
                lkaVar.l(m, false);
                return;
            default:
                ((n52) this.b).g0(this.c, this.d);
                return;
        }
    }
}
