package defpackage;

import java.io.File;
import org.telegram.messenger.Utilities;
public final class r60 extends n51 {
    public final long e;

    public r60(File file) {
        super(file);
        this.e = Utilities.getLastUsageFileTime(file.getAbsolutePath());
    }
}
