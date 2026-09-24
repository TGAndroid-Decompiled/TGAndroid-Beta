package n7;

import java.io.IOException;
public final class x0 extends IOException {
    public x0(Exception exc) {
        super("Error in decoding CborValue from bytes", exc);
    }
}
