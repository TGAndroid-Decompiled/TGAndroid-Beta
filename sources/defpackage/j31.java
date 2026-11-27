package defpackage;

import android.os.SharedMemory;
import android.system.OsConstants;
import java.nio.ByteBuffer;
public final class j31 {
    public final SharedMemory a;

    public j31(SharedMemory sharedMemory) {
        this.a = sharedMemory;
    }

    public static j31 a(byte[] bArr) {
        SharedMemory sharedMemory;
        try {
            sharedMemory = SharedMemory.create("BundleableByteArray", bArr.length);
        } catch (Exception e) {
            e = e;
            sharedMemory = null;
        }
        try {
            ByteBuffer mapReadWrite = sharedMemory.mapReadWrite();
            mapReadWrite.put(bArr);
            SharedMemory.unmap(mapReadWrite);
            sharedMemory.setProtect(OsConstants.PROT_READ);
            return new j31(sharedMemory);
        } catch (Exception e2) {
            e = e2;
            efd.g("BundleableByteArray", "Failed to allocate shared memory for byte array, size=" + bArr.length, e);
            if (sharedMemory != null) {
                sharedMemory.close();
            }
            return null;
        }
    }

    public static byte[] b(android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j31.b(android.os.Bundle):byte[]");
    }
}
