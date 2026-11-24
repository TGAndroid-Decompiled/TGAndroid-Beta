package defpackage;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.a;
public final class ub4 extends Thread {
    public final byte a = 1;
    public final Object b;

    public ub4(dia diaVar) {
        super("ExoPlayer:SimpleDecoder");
        this.b = diaVar;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                FilesMigrationService filesMigrationService = (FilesMigrationService) this.b;
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!TextUtils.isEmpty(gba.e0)) {
                    ArrayList c1 = gl.c1();
                    int size = c1.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            File file = (File) c1.get(i);
                            if (file.getAbsolutePath().startsWith(gba.e0)) {
                                externalStorageDirectory = file;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                File file2 = new File(a.b.getExternalFilesDir(null), "Telegram");
                File file3 = new File(externalStorageDirectory, "Telegram");
                filesMigrationService.a = FilesMigrationService.b(file3);
                long currentTimeMillis = System.currentTimeMillis();
                if (file3.canRead() && file3.canWrite()) {
                    filesMigrationService.c(file3, file2);
                }
                fa4.b("move time = " + (System.currentTimeMillis() - currentTimeMillis));
                a.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
                gl.c3(new s54(this, (byte) 7));
                return;
            default:
                do {
                    try {
                    } catch (InterruptedException e) {
                        ho9.n(e);
                        return;
                    }
                } while (((dia) this.b).j());
                return;
        }
    }

    public ub4(FilesMigrationService filesMigrationService) {
        this.b = filesMigrationService;
    }
}
