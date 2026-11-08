package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import org.telegram.SQLite.SQLiteDatabase;
public final class f8 {
    public p5 f22378a;
    public final int f22379b;
    public SQLiteDatabase f22380c;
    public File d;
    public File f22381e;
    public final ConcurrentHashMap f22382f = new ConcurrentHashMap();
    public final e8 f22383g = new Object();
    public boolean h;

    public f8(int i7) {
        this.f22379b = i7;
    }

    public final void a() {
        File h = t0.h();
        int i7 = this.f22379b;
        if (i7 != 0) {
            File file = new File(h, jg.g.k(i7, "account", "/"));
            file.mkdirs();
            h = file;
        }
        File file2 = new File(h, "file_to_path_backup.db");
        try {
            g0.E(this.d, file2);
            a8.b("file db backup created " + file2.getAbsolutePath());
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public final void b(int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.f8.b(int, boolean):void");
    }

    public final void c() {
        if (!this.h) {
            if (!as.f21508a) {
                int i7 = 0;
                while (!as.f21508a) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                    i7++;
                    if (i7 > 5) {
                        break;
                    }
                }
            }
            b(0, false);
            this.h = true;
        }
    }

    public final void d() {
        if (this.f22378a == null) {
            synchronized (this) {
                try {
                    if (this.f22378a == null) {
                        p5 p5Var = new p5("files_database_queue_" + this.f22379b);
                        this.f22378a = p5Var;
                        p5Var.setPriority(10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final org.telegram.messenger.e8 e(java.io.File r12, org.telegram.messenger.e8 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.f8.e(java.io.File, org.telegram.messenger.e8):org.telegram.messenger.e8");
    }

    public final java.lang.String f(final int r22, final int r23, final long r24, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.f8.f(int, int, long, boolean):java.lang.String");
    }

    public final void g(int i7) {
        if (i7 == 1) {
            jg.g.z(this.f22380c, "CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);");
            jg.g.z(this.f22380c, "PRAGMA user_version = 2");
            i7 = 2;
        }
        if (i7 == 2) {
            jg.g.z(this.f22380c, "CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);");
            jg.g.z(this.f22380c, "PRAGMA user_version = 3");
            i7 = 3;
        }
        if (i7 == 3) {
            jg.g.z(this.f22380c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_id INTEGER default 0");
            jg.g.z(this.f22380c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_type INTEGER default 0");
            jg.g.z(this.f22380c, "PRAGMA user_version = 4");
            i7 = 4;
        }
        if (i7 != 4 && i7 != 5 && i7 != 6) {
            return;
        }
        try {
            this.f22380c.executeFast("ALTER TABLE paths ADD COLUMN flags INTEGER default 0").stepThis().dispose();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        jg.g.z(this.f22380c, "PRAGMA user_version = 7");
    }

    public final void h(Runnable runnable) {
        d();
        this.f22378a.c(runnable);
    }
}
