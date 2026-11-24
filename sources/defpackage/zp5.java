package defpackage;

import java.io.IOException;
public class zp5 extends IOException {
    public boolean a;

    public static zp5 a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    public static yp5 b() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    public static zp5 c() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    public static zp5 d() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zp5 e() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
