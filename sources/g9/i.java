package g9;

import java.io.File;
import java.io.FilenameFilter;
public final class i implements FilenameFilter {
    public final int f7160a;

    @Override
    public final boolean accept(File file, String str) {
        switch (this.f7160a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith("event");
            default:
                if (str.startsWith("event") && !str.endsWith("_")) {
                    return true;
                }
                return false;
        }
    }
}
