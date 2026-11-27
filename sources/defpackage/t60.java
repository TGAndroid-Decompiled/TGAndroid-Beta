package defpackage;

import java.io.File;
import org.telegram.messenger.Utilities;
public final class t60 extends v51 {
    public final long e;

    public t60(File file) {
        super(file);
        this.e = Utilities.getLastUsageFileTime(file.getAbsolutePath());
    }
}
