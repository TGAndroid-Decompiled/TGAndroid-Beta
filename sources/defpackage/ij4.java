package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
public final class ij4 {
    public static o83 a(s8a s8aVar, j09 j09Var, xw2 xw2Var, sr4 sr4Var) {
        x24 x24Var = x24.a;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new o83(new bd4(s8aVar, new l83(xw2Var, (byte) 1), sr4Var), tl2.a(new ii1(x24Var, null, (byte) 3)), j09Var, xw2Var);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new o83(new bd4(s8aVar, zc4.c, sr4Var), tl2.a(new ii1(x24Var, null, (byte) 3)), j09Var, xw2Var);
        }
    }

    public static void b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            if (parentFile.exists() && !parentFile.isDirectory() && ur5.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                bg.e(parentFile, "Failed to delete conflicting file: ");
            } else if (!parentFile.isDirectory()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                    } catch (Exception e) {
                        throw new IOException("Failed to create directory: " + parentFile, e);
                    }
                } else if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
                    bg.e(parentFile, "Failed to create directory: ");
                }
            }
        }
    }
}
