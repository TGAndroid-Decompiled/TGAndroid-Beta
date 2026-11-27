package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
public final class z7b implements a8b, mvc {
    public final byte a;
    public final File b;

    public z7b(File file, byte b) {
        this.a = b;
        this.b = file;
    }

    @Override
    public final InputStream b() {
        byte b = this.a;
        File file = this.b;
        switch (b) {
            case 2:
                return new FileInputStream(file);
            case 3:
                if (!file.exists()) {
                    return null;
                }
                return new FileInputStream(file);
            case 4:
                if (!file.exists()) {
                    return null;
                }
                return new FileInputStream(file);
            default:
                return new FileInputStream(file);
        }
    }

    @Override
    public final Bitmap i(BitmapFactory.Options options) {
        byte b = this.a;
        File file = this.b;
        switch (b) {
            case 0:
                return BitmapFactory.decodeFile(file.getPath(), options);
            default:
                return BitmapFactory.decodeFile(file.getPath(), options);
        }
    }
}
