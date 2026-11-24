package defpackage;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
public final class mc4 {
    public final String a;
    public final HashMap b = new HashMap();

    public mc4(String str) {
        this.a = str;
    }

    public final File a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        if (indexOf != -1) {
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (FileProvider.e(canonicalFile.getPath()).startsWith(FileProvider.e(file.getPath()).concat("/"))) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    u36.i(file2, "Failed to resolve canonical path for ");
                    return null;
                }
            }
            u36.i(uri, "Unable to find configured root for ");
            return null;
        }
        u36.i(uri, "Unable to find path from root: ");
        return null;
    }
}
