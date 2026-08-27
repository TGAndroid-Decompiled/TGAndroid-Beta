package h7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class i8 {
    public static void a(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i10 = inputStream.read(bArr);
        while (i10 >= 0) {
            byteArrayOutputStream.write(bArr, 0, i10);
            i10 = inputStream.read(bArr);
        }
    }
}
