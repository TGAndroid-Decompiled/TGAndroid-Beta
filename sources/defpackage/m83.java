package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
public final class m83 extends vy5 implements pr4 {
    public final byte b;
    public final h93 c;

    public m83(h93 h93Var, byte b) {
        super(0);
        this.b = b;
        this.c = h93Var;
    }

    @Override
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((hd4) this.c.j.getValue()).c;
            default:
                ed4 ed4Var = this.c.a;
                File canonicalFile = ((File) ed4Var.c.invoke()).getCanonicalFile();
                synchronized (ed4.e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = ed4.d;
                    if (!linkedHashSet.contains(absolutePath)) {
                        absolutePath.getClass();
                        linkedHashSet.add(absolutePath);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new hd4(canonicalFile, ed4Var.a, (kr5) ed4Var.b.invoke(canonicalFile), new dd4(canonicalFile, (byte) 0));
        }
    }
}
