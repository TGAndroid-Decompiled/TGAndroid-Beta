package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
public final class t73 extends az5 implements sr4 {
    public final byte b;
    public final o83 c;

    public t73(o83 o83Var, byte b) {
        super(0);
        this.b = b;
        this.c = o83Var;
    }

    @Override
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((ed4) this.c.j.getValue()).c;
            default:
                bd4 bd4Var = this.c.a;
                File canonicalFile = ((File) bd4Var.c.invoke()).getCanonicalFile();
                synchronized (bd4.e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = bd4.d;
                    if (!linkedHashSet.contains(absolutePath)) {
                        absolutePath.getClass();
                        linkedHashSet.add(absolutePath);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new ed4(canonicalFile, bd4Var.a, (nr5) bd4Var.b.invoke(canonicalFile), new ad4(canonicalFile, (byte) 0));
        }
    }
}
