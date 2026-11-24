package defpackage;

import java.io.IOException;
public final class pee extends IOException {
    public pee(Exception exc) {
        super("Error in decoding CborValue from bytes", exc);
    }
}
