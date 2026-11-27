package defpackage;

import java.io.IOException;
public final class mpd extends IOException {
    public static mpd a() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static mpd b() {
        return new IOException("Failed to parse the message.");
    }
}
