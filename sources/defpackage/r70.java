package defpackage;

import java.io.File;
import org.telegram.messenger.Utilities;
public final class r70 extends u61 {
    public final long e;

    public r70(File file) {
        super(file);
        this.e = Utilities.getLastUsageFileTime(file.getAbsolutePath());
    }
}
