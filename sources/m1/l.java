package m1;

import java.io.File;
import java.util.LinkedHashSet;
public final class l extends kotlin.jvm.internal.k implements rd.a {
    public final int f20471b;
    public final b0 f20472c;

    public l(b0 b0Var, int i7) {
        super(0);
        this.f20471b = i7;
        this.f20472c = b0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.f20471b) {
            case 0:
                return ((i0) this.f20472c.f20392j.getValue()).f20452c;
            default:
                f0 f0Var = this.f20472c.f20385a;
                File canonicalFile = ((File) f0Var.f20427c.invoke()).getCanonicalFile();
                synchronized (f0.f20424e) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = f0.d;
                    if (!linkedHashSet.contains(path)) {
                        kotlin.jvm.internal.j.d(path, "path");
                        linkedHashSet.add(path);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new i0(canonicalFile, f0Var.f20425a, (m0) f0Var.f20426b.invoke(canonicalFile), new androidx.lifecycle.k0(canonicalFile, 1));
        }
    }
}
