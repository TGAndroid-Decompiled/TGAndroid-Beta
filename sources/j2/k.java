package j2;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
public final class k extends Thread {
    public final int f16161a = 0;
    public final Object f16162b;

    public k(FilesMigrationService filesMigrationService) {
        this.f16162b = filesMigrationService;
    }

    @Override
    public final void run() {
        switch (this.f16161a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e10) {
                        throw new IllegalStateException(e10);
                    }
                } while (((l) this.f16162b).j());
                return;
            default:
                FilesMigrationService filesMigrationService = (FilesMigrationService) this.f16162b;
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!TextUtils.isEmpty(az.f21632h0)) {
                    ArrayList d12 = g0.d1();
                    int size = d12.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            File file = (File) d12.get(i3);
                            if (file.getAbsolutePath().startsWith(az.f21632h0)) {
                                externalStorageDirectory = file;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                File file2 = new File(t0.f25457b.getExternalFilesDir(null), "Telegram");
                File file3 = new File(externalStorageDirectory, "Telegram");
                filesMigrationService.f21224a = FilesMigrationService.b(file3);
                long currentTimeMillis = System.currentTimeMillis();
                if (file3.canRead() && file3.canWrite()) {
                    filesMigrationService.c(file3, file2);
                }
                a8.b("move time = " + (System.currentTimeMillis() - currentTimeMillis));
                t0.f25457b.getSharedPreferences("systemConfig", 0).edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
                g0.h3(new org.telegram.messenger.a(this, 10));
                return;
        }
    }

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f16162b = lVar;
    }
}
