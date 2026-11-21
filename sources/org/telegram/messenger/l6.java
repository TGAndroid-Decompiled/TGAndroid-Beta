package org.telegram.messenger;

import java.io.IOException;
public abstract class l6 {
    public static final m6 f25357a;

    static {
        try {
            f25357a = new m6();
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to open emoji.pack", e10);
        }
    }
}
