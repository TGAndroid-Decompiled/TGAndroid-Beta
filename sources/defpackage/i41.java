package defpackage;

import android.os.SharedMemory;
import android.system.OsConstants;
import java.nio.ByteBuffer;
public final class i41 {
    public final SharedMemory a;

    public i41(SharedMemory sharedMemory) {
        this.a = sharedMemory;
    }

    public static i41 a(byte[] bArr) {
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
            return new i41(sharedMemory);
        } catch (Exception e2) {
            e = e2;
            ncd.g("BundleableByteArray", "Failed to allocate shared memory for byte array, size=" + bArr.length, e);
            if (sharedMemory != null) {
                sharedMemory.close();
            }
            return null;
        }
    }

    public static byte[] b(android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i41.b(android.os.Bundle):byte[]");
    }
}
