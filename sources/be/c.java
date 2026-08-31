package be;

import java.util.HashMap;
public final class c {
    public b f1926b;
    public final HashMap f1927c = new HashMap();
    public final boolean f1925a = true;

    public final boolean a(Long l10) {
        boolean z4;
        synchronized (this.f1927c) {
            try {
                b bVar = (b) this.f1927c.get(l10);
                if (bVar != null && !bVar.isEmpty()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } finally {
            }
        }
        return z4;
    }
}
