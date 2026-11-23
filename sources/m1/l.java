package m1;

import java.io.File;
import java.util.LinkedHashSet;
public final class l extends kotlin.jvm.internal.k implements rd.a {
    public final int f20409b;
    public final b0 f20410c;

    public l(b0 b0Var, int i7) {
        super(0);
        this.f20409b = i7;
        this.f20410c = b0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.f20409b) {
            case 0:
                return ((i0) this.f20410c.f20330j.getValue()).f20390c;
            default:
                f0 f0Var = this.f20410c.f20323a;
                File canonicalFile = ((File) f0Var.f20365c.invoke()).getCanonicalFile();
                synchronized (f0.f20362e) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = f0.d;
                    if (!linkedHashSet.contains(path)) {
                        kotlin.jvm.internal.j.d(path, "path");
                        linkedHashSet.add(path);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new i0(canonicalFile, f0Var.f20363a, (m0) f0Var.f20364b.invoke(canonicalFile), new androidx.lifecycle.k0(canonicalFile, 1));
        }
    }
}
