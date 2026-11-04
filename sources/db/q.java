package db;

import android.os.Build;
import b8.tb;
import gi.w5;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
public final class q {
    public static l1.b0 a(l1.z0 z0Var, w5 w5Var, be.c cVar, od.a aVar) {
        ed.o oVar = ed.o.f9953a;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new l1.b0(new l1.f0(z0Var, new l1.y(cVar, 1), aVar), tb.a(new ae.d(oVar, (fd.c) null, 7)), w5Var, cVar);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new l1.b0(new l1.f0(z0Var, l1.e0.f17523b, aVar), tb.a(new ae.d(oVar, (fd.c) null, 7)), w5Var, cVar);
        }
    }

    public static void b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            if (parentFile.exists() && !parentFile.isDirectory() && kotlin.jvm.internal.j.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                throw new IOException("Failed to delete conflicting file: " + parentFile);
            } else if (!parentFile.isDirectory()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                    } catch (Exception e10) {
                        throw new IOException("Failed to create directory: " + parentFile, e10);
                    }
                } else if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
                    throw new IOException("Failed to create directory: " + parentFile);
                }
            }
        }
    }
}
