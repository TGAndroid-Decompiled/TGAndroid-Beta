package ba;

import java.io.File;
import java.io.FilenameFilter;
public final class a implements FilenameFilter {
    public final int f2545a;

    @Override
    public final boolean accept(File file, String str) {
        switch (this.f2545a) {
            case 0:
                return str.startsWith("event");
            case 1:
                if (str.startsWith("event") && !str.endsWith("_")) {
                    return true;
                }
                return false;
            case 2:
                return str.startsWith("aqs.");
            default:
                return str.startsWith(".ae");
        }
    }
}
