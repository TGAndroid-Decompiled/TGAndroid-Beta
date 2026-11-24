package defpackage;

import java.io.IOException;
public final class qge extends IOException {
    public qge(Exception exc) {
        super("Error in decoding CborValue from bytes", exc);
    }
}
