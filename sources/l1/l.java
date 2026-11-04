package l1;

import java.io.File;
import java.util.LinkedHashSet;
public final class l extends kotlin.jvm.internal.k implements od.a {
    public final int f17580b;
    public final b0 f17581c;

    public l(b0 b0Var, int i3) {
        super(0);
        this.f17580b = i3;
        this.f17581c = b0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.f17580b) {
            case 0:
                return ((i0) this.f17581c.f17497j.getValue()).f17560c;
            default:
                f0 f0Var = this.f17581c.f17490a;
                File canonicalFile = ((File) f0Var.f17535c.invoke()).getCanonicalFile();
                synchronized (f0.f17532e) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = f0.d;
                    if (!linkedHashSet.contains(path)) {
                        kotlin.jvm.internal.j.d(path, "path");
                        linkedHashSet.add(path);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new i0(canonicalFile, f0Var.f17533a, (m0) f0Var.f17534b.invoke(canonicalFile), new androidx.lifecycle.k0(canonicalFile, 1));
        }
    }
}
