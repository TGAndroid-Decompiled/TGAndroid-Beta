package defpackage;

import java.io.IOException;
public final class xmd extends IOException {
    public static xmd a() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static xmd b() {
        return new IOException("Failed to parse the message.");
    }
}
