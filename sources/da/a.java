package da;

import java.io.File;
import java.io.FilenameFilter;
public final class a implements FilenameFilter {
    public final int f8266a;

    @Override
    public final boolean accept(File file, String str) {
        switch (this.f8266a) {
            case 0:
                return str.startsWith("event");
            case 1:
                if (str.startsWith("event") && !str.endsWith("_")) {
                    return true;
                }
                return false;
            case 2:
                return str.endsWith(".html");
            case 3:
                return str.startsWith("aqs.");
            default:
                return str.startsWith(".ae");
        }
    }
}
