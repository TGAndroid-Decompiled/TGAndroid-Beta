package n9;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class b {
    public final File f14861a;
    public final File f14862b;
    public final File f14863c;
    public final File d;
    public final File e;
    public final File f14864f;

    public b(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f14861a = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", "_");
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        c(file);
        this.f14862b = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f14863c = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.d = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.e = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.f14864f = file5;
    }

    public static void a(File file) {
        if (file.exists() && d(file)) {
            String str = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static synchronized void c(File file) {
        synchronized (b.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean d(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static List e(Object[] objArr) {
        if (objArr == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(objArr);
    }

    public final File b(String str, String str2) {
        File file = new File(this.f14863c, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
