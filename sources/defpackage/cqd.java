package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
public abstract class cqd {
    public static void a(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        inputStream.getClass();
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    public static final byte[] b(InputStream inputStream) {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        a(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }
}
