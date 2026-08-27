package m5;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

public final class e implements com.google.android.gms.common.api.b {

    public final CastDevice f17766a;

    public final n5.e0 f17767b;

    public final Bundle f17768c;
    public final String d = UUID.randomUUID().toString();

    public e(j9.a aVar) {
        this.f17766a = (CastDevice) aVar.f12863b;
        this.f17767b = (n5.e0) aVar.f12864c;
        this.f17768c = (Bundle) aVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (y5.l.l(this.f17766a, eVar.f17766a)) {
            Bundle bundle = eVar.f17768c;
            Bundle bundle2 = this.f17768c;
            if (bundle2 == null || bundle == null) {
                if (bundle2 == bundle) {
                    if (y5.l.l(this.d, eVar.d)) {
                        return true;
                    }
                }
            } else if (bundle2.size() == bundle.size()) {
                Set<String> setKeySet = bundle2.keySet();
                if (setKeySet.containsAll(bundle.keySet())) {
                    for (String str : setKeySet) {
                        if (!y5.l.l(bundle2.get(str), bundle.get(str))) {
                        }
                    }
                    if (y5.l.l(this.d, eVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17766a, this.f17768c, 0, this.d});
    }
}
