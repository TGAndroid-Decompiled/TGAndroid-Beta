package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.a;
public abstract class f0f {
    public static volatile File a;

    public static File a(String str) {
        File file = a;
        if (file == null) {
            file = new File(a.b.getCacheDir(), "wallpaper/image");
            a = file;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }

    public static Bitmap b(String str) {
        File a2 = a(str);
        Bitmap bitmap = null;
        if (!a2.exists()) {
            return null;
        }
        try {
            bitmap = BitmapFactory.decodeFile(a2.getAbsolutePath());
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        if (bitmap == null) {
            a2.delete();
        }
        return bitmap;
    }

    public static String c(long j) {
        StringBuilder o = wi8.o(j, "photo_", "_w");
        ConcurrentHashMap concurrentHashMap = btc.a;
        Point point = gm.q;
        o.append(Math.min(1440, Math.min(point.x, point.y)));
        return o.toString();
    }

    public static void d(String str, Bitmap bitmap) {
        boolean compress;
        if (bitmap != null && !bitmap.isRecycled()) {
            File a2 = a(str);
            File parentFile = a2.getParentFile();
            StringBuilder k = b10.k(str, ".");
            k.append(Thread.currentThread().getId());
            k.append(".tmp");
            File file = new File(parentFile, k.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (bitmap.hasAlpha()) {
                    compress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                } else {
                    compress = bitmap.compress(Bitmap.CompressFormat.JPEG, 92, fileOutputStream);
                }
                if (!compress) {
                    fileOutputStream.close();
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.getFD().sync();
                    fileOutputStream.close();
                    if (file.renameTo(a2)) {
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
