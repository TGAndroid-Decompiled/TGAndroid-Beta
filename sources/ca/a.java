package ca;

import java.io.File;
import java.io.FilenameFilter;
public final class a implements FilenameFilter {
    public final int f5043a;

    @Override
    public final boolean accept(File file, String str) {
        switch (this.f5043a) {
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
