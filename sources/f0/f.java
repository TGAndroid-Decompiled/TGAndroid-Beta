package f0;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
public final class f {
    public final String f6256a;
    public final HashMap f6257b = new HashMap();

    public f(String str) {
        this.f6256a = str;
    }

    public final File a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        if (indexOf != -1) {
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f6257b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    String path = canonicalFile.getPath();
                    String path2 = file.getPath();
                    String a2 = FileProvider.a(path);
                    String a10 = FileProvider.a(path2);
                    if (a2.startsWith(a10 + '/')) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            }
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        throw new IllegalArgumentException("Unable to find path from root: " + uri);
    }
}
