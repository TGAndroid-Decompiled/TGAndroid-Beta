package org.telegram.messenger;

import java.io.File;
public final class y0 extends t2 {
    public final long f26553e;

    public y0(File file) {
        super(file);
        this.f26553e = Utilities.getLastUsageFileTime(file.getAbsolutePath());
    }
}
