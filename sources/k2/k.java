package k2;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
public final class k extends Thread {
    public final int f18159a = 0;
    public final Object f18160b;

    public k(FilesMigrationService filesMigrationService) {
        this.f18160b = filesMigrationService;
    }

    @Override
    public final void run() {
        switch (this.f18159a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e10) {
                        throw new IllegalStateException(e10);
                    }
                } while (((l) this.f18160b).j());
                return;
            default:
                FilesMigrationService filesMigrationService = (FilesMigrationService) this.f18160b;
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!TextUtils.isEmpty(bz.f23193h0)) {
                    ArrayList d12 = g0.d1();
                    int size = d12.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            File file = (File) d12.get(i7);
                            if (file.getAbsolutePath().startsWith(bz.f23193h0)) {
                                externalStorageDirectory = file;
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                File file2 = new File(t0.f26941b.getExternalFilesDir(null), "Telegram");
                File file3 = new File(externalStorageDirectory, "Telegram");
                filesMigrationService.f22644a = FilesMigrationService.b(file3);
                long currentTimeMillis = System.currentTimeMillis();
                if (file3.canRead() && file3.canWrite()) {
                    filesMigrationService.c(file3, file2);
                }
                a8.b("move time = " + (System.currentTimeMillis() - currentTimeMillis));
                t0.f26941b.getSharedPreferences("systemConfig", 0).edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
                g0.g3(new org.telegram.messenger.a(this, 10));
                return;
        }
    }

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f18160b = lVar;
    }
}
