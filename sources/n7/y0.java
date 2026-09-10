package n7;

import java.io.IOException;
public final class y0 extends IOException {
    public y0(Exception exc) {
        super("Error in decoding CborValue from bytes", exc);
    }
}
