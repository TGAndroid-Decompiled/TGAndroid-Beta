package m1;

import java.io.File;
import java.util.LinkedHashSet;
public final class l extends kotlin.jvm.internal.k implements rd.a {
    public final int f20014b;
    public final b0 f20015c;

    public l(b0 b0Var, int i7) {
        super(0);
        this.f20014b = i7;
        this.f20015c = b0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.f20014b) {
            case 0:
                return ((i0) this.f20015c.f19935j.getValue()).f19995c;
            default:
                f0 f0Var = this.f20015c.f19928a;
                File canonicalFile = ((File) f0Var.f19970c.invoke()).getCanonicalFile();
                synchronized (f0.f19967e) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = f0.d;
                    if (!linkedHashSet.contains(path)) {
                        kotlin.jvm.internal.j.d(path, "path");
                        linkedHashSet.add(path);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new i0(canonicalFile, f0Var.f19968a, (m0) f0Var.f19969b.invoke(canonicalFile), new androidx.lifecycle.k0(canonicalFile, 1));
        }
    }
}
