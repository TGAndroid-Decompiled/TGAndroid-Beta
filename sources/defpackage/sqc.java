package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
public abstract class sqc {
    public static final Pattern a = Pattern.compile("^(.+_\\d+_.+_v\\d+(_debug)?\\.jpg|-?\\d+_-?\\d+\\.jpg|wallpaper_thumb_-?\\d+\\.png)$");
    public static final Object b = new Object();
    public static volatile File c;

    public static boolean a(File file, File file2) {
        boolean renameTo;
        if (file == null) {
            return false;
        }
        if (file.equals(file2)) {
            return true;
        }
        synchronized (b) {
            File parentFile = file2.getParentFile();
            File file3 = new File(parentFile, file2.getName() + ".tmp");
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            try {
                fileOutputStream.getChannel().transferFrom(fileInputStream.getChannel(), 0L, fileInputStream.getChannel().size());
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                fileInputStream.close();
                renameTo = file3.renameTo(file2);
                if (!renameTo) {
                    file3.delete();
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return renameTo;
    }

    public static File b(String str) {
        File file = c;
        if (file == null) {
            file = new File(a.h(), "wallpaper");
            file.mkdirs();
            c = file;
        }
        if (str == null) {
            return new File(file, ".none");
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            synchronized (b) {
                File file3 = new File(a.h(), str);
                if (file3.isFile() && !file2.exists() && !file3.renameTo(file2)) {
                    return file3;
                }
                return file2;
            }
        }
        return file2;
    }

    public static boolean c(Bitmap bitmap, Bitmap.CompressFormat compressFormat, File file) {
        if (bitmap == null) {
            return false;
        }
        synchronized (b) {
            File parentFile = file.getParentFile();
            File file2 = new File(parentFile, file.getName() + ".tmp");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            if (!bitmap.compress(compressFormat, 87, fileOutputStream)) {
                fileOutputStream.close();
                file2.delete();
                return false;
            }
            fileOutputStream.flush();
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
            boolean renameTo = file2.renameTo(file);
            if (!renameTo) {
                file2.delete();
            }
            return renameTo;
        }
    }

    public static File d(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            str2 = Utilities.a(str) + ".wp";
        }
        return b(str2);
    }

    public static File e(String str) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        return b(str);
    }
}
