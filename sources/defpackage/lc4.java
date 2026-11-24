package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a;
public final class lc4 {
    public mp3 a;
    public final int b;
    public SQLiteDatabase c;
    public File d;
    public File e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final kc4 g = new Object();
    public boolean h;

    public lc4(int i) {
        this.b = i;
    }

    public final void a() {
        File h = a.h();
        int i = this.b;
        if (i != 0) {
            File file = new File(h, td4.o(i, "account", "/"));
            file.mkdirs();
            h = file;
        }
        File file2 = new File(h, "file_to_path_backup.db");
        try {
            gm.E(this.d, file2);
            fc4.b("file db backup created " + file2.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void b(int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc4.b(int, boolean):void");
    }

    public final void c() {
        if (!this.h) {
            if (!ik7.a) {
                int i = 0;
                while (!ik7.a) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i++;
                    if (i > 5) {
                        break;
                    }
                }
            }
            b(0, false);
            this.h = true;
        }
    }

    public final void d() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    mp3 mp3Var = new mp3("files_database_queue_" + this.b);
                    this.a = mp3Var;
                    mp3Var.setPriority(10);
                }
            }
        }
    }

    public final defpackage.kc4 e(java.io.File r11, defpackage.kc4 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc4.e(java.io.File, kc4):kc4");
    }

    public final java.lang.String f(final int r22, final int r23, final long r24, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc4.f(int, int, long, boolean):java.lang.String");
    }

    public final void g(int i) {
        if (i == 1) {
            ts2.x(this.c, "CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);");
            ts2.x(this.c, "PRAGMA user_version = 2");
            i = 2;
        }
        if (i == 2) {
            ts2.x(this.c, "CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);");
            ts2.x(this.c, "PRAGMA user_version = 3");
            i = 3;
        }
        if (i == 3) {
            ts2.x(this.c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_id INTEGER default 0");
            ts2.x(this.c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_type INTEGER default 0");
            ts2.x(this.c, "PRAGMA user_version = 4");
            i = 4;
        }
        if (i != 4 && i != 5 && i != 6) {
            return;
        }
        try {
            this.c.executeFast("ALTER TABLE paths ADD COLUMN flags INTEGER default 0").stepThis().dispose();
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        ts2.x(this.c, "PRAGMA user_version = 7");
    }

    public final void h(Runnable runnable) {
        d();
        this.a.c(runnable);
    }
}
