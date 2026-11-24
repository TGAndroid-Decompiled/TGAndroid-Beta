package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
public final class jj4 {
    public static h93 a(c7a c7aVar, ai4 ai4Var, nx2 nx2Var, pr4 pr4Var) {
        n34 n34Var = n34.a;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new h93(new ed4(c7aVar, new e93(nx2Var, (byte) 1), pr4Var), lm2.a(new hj1(n34Var, null, (byte) 3)), ai4Var, nx2Var);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new h93(new ed4(c7aVar, cd4.c, pr4Var), lm2.a(new hj1(n34Var, null, (byte) 3)), ai4Var, nx2Var);
        }
    }

    public static void b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            if (parentFile.exists() && !parentFile.isDirectory() && rr5.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                zg.e(parentFile, "Failed to delete conflicting file: ");
            } else if (!parentFile.isDirectory()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                    } catch (Exception e) {
                        throw new IOException("Failed to create directory: " + parentFile, e);
                    }
                } else if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
                    zg.e(parentFile, "Failed to create directory: ");
                }
            }
        }
    }
}
