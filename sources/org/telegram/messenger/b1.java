package org.telegram.messenger;

import java.io.File;
public final class b1 extends x2 {
    public final long e;

    public b1(File file) {
        super(file);
        this.e = Utilities.getLastUsageFileTime(file.getAbsolutePath());
    }
}
