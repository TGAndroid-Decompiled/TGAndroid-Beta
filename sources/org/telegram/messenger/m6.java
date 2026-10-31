package org.telegram.messenger;

import java.io.IOException;
public abstract class m6 {
    public static final n6 f16869a;

    static {
        try {
            f16869a = new n6();
        } catch (IOException e) {
            throw new IllegalStateException("Unable to open emoji.pack", e);
        }
    }
}
