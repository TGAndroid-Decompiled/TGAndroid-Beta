package k2;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.iz;
import org.telegram.messenger.t0;
public final class k extends Thread {
    public final int f17176a = 0;
    public final Object f17177b;

    public k(FilesMigrationService filesMigrationService) {
        this.f17177b = filesMigrationService;
    }

    @Override
    public final void run() {
        switch (this.f17176a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e10) {
                        throw new IllegalStateException(e10);
                    }
                } while (((l) this.f17177b).j());
                return;
            default:
                FilesMigrationService filesMigrationService = (FilesMigrationService) this.f17177b;
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!TextUtils.isEmpty(iz.f23377h0)) {
                    ArrayList d12 = g0.d1();
                    int size = d12.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            File file = (File) d12.get(i7);
                            if (file.getAbsolutePath().startsWith(iz.f23377h0)) {
                                externalStorageDirectory = file;
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                File file2 = new File(t0.f25555b.getExternalFilesDir(null), "Telegram");
                File file3 = new File(externalStorageDirectory, "Telegram");
                filesMigrationService.f21171a = FilesMigrationService.b(file3);
                long currentTimeMillis = System.currentTimeMillis();
                if (file3.canRead() && file3.canWrite()) {
                    filesMigrationService.c(file3, file2);
                }
                a8.b("move time = " + (System.currentTimeMillis() - currentTimeMillis));
                t0.f25555b.getSharedPreferences("systemConfig", 0).edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
                g0.h3(new org.telegram.messenger.a(this, 10));
                return;
        }
    }

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f17177b = lVar;
    }
}
