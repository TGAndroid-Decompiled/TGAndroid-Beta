package m1;

import java.io.File;
import java.util.LinkedHashSet;
public final class l extends kotlin.jvm.internal.k implements rd.a {
    public final int f20375b;
    public final b0 f20376c;

    public l(b0 b0Var, int i7) {
        super(0);
        this.f20375b = i7;
        this.f20376c = b0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.f20375b) {
            case 0:
                return ((i0) this.f20376c.f20296j.getValue()).f20356c;
            default:
                f0 f0Var = this.f20376c.f20289a;
                File canonicalFile = ((File) f0Var.f20331c.invoke()).getCanonicalFile();
                synchronized (f0.f20328e) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = f0.d;
                    if (!linkedHashSet.contains(path)) {
                        kotlin.jvm.internal.j.d(path, "path");
                        linkedHashSet.add(path);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new i0(canonicalFile, f0Var.f20329a, (m0) f0Var.f20330b.invoke(canonicalFile), new androidx.lifecycle.k0(canonicalFile, 1));
        }
    }
}
