package org.telegram.messenger;

import java.io.File;
public final class y0 extends u2 {
    public final long f27966e;

    public y0(File file) {
        super(file);
        this.f27966e = Utilities.getLastUsageFileTime(file.getAbsolutePath());
    }
}
