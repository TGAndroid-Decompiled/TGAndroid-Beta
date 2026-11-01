package h2;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.uz;
import org.telegram.messenger.w0;
public final class k extends Thread {
    public final int f7590a = 0;
    public final Object f7591b;

    public k(FilesMigrationService filesMigrationService) {
        this.f7591b = filesMigrationService;
    }

    @Override
    public final void run() {
        switch (this.f7590a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (((l) this.f7591b).j());
                return;
            default:
                FilesMigrationService filesMigrationService = (FilesMigrationService) this.f7591b;
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!TextUtils.isEmpty(uz.f18519h0)) {
                    ArrayList d12 = i0.d1();
                    int size = d12.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            File file = (File) d12.get(i10);
                            if (file.getAbsolutePath().startsWith(uz.f18519h0)) {
                                externalStorageDirectory = file;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                File file2 = new File(w0.f18945b.getExternalFilesDir(null), "Telegram");
                File file3 = new File(externalStorageDirectory, "Telegram");
                filesMigrationService.f14363a = FilesMigrationService.b(file3);
                long currentTimeMillis = System.currentTimeMillis();
                if (file3.canRead() && file3.canWrite()) {
                    filesMigrationService.c(file3, file2);
                }
                f8.b("move time = " + (System.currentTimeMillis() - currentTimeMillis));
                w0.f18945b.getSharedPreferences("systemConfig", 0).edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
                i0.g3(new org.telegram.messenger.a(this, 10));
                return;
        }
    }

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f7591b = lVar;
    }
}
