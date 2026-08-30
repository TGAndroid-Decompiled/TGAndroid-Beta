package b7;

import java.io.IOException;
public final class c1 extends IOException {
    public c1(Exception exc) {
        super("Error in decoding CborValue from bytes", exc);
    }
}
