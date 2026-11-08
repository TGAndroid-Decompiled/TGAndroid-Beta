package org.telegram.messenger;

import java.io.IOException;
public abstract class k6 {
    public static final l6 f23659a;

    static {
        try {
            f23659a = new l6();
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to open emoji.pack", e10);
        }
    }
}
