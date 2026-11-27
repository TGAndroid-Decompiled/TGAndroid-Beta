package defpackage;

import java.io.IOException;
public final class gje extends IOException {
    public gje(Exception exc) {
        super("Error in decoding CborValue from bytes", exc);
    }
}
