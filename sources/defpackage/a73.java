package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
public final class a73 extends vw5 implements op4 {
    public final byte b;
    public final v73 c;

    public a73(v73 v73Var, byte b) {
        super(0);
        this.b = b;
        this.c = v73Var;
    }

    @Override
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((hb4) this.c.j.getValue()).c;
            default:
                eb4 eb4Var = this.c.a;
                File canonicalFile = ((File) eb4Var.c.invoke()).getCanonicalFile();
                synchronized (eb4.e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = eb4.d;
                    if (!linkedHashSet.contains(absolutePath)) {
                        absolutePath.getClass();
                        linkedHashSet.add(absolutePath);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new hb4(canonicalFile, eb4Var.a, (kp5) eb4Var.b.invoke(canonicalFile), new db4(canonicalFile, (byte) 0));
        }
    }
}
