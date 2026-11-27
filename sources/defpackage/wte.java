package defpackage;

import java.io.IOException;
public class wte extends IOException {
    public static wte a() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static wte b() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static wte c() {
        return new IOException("Protocol message had invalid UTF-8.");
    }
}
