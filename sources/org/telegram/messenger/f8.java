package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import org.telegram.SQLite.SQLiteDatabase;
public final class f8 {
    public p5 f23453a;
    public final int f23454b;
    public SQLiteDatabase f23455c;
    public File d;
    public File f23456e;
    public final ConcurrentHashMap f23457f = new ConcurrentHashMap();
    public final e8 f23458g = new Object();
    public boolean h;

    public f8(int i7) {
        this.f23454b = i7;
    }

    public final void a() {
        File h = t0.h();
        int i7 = this.f23454b;
        if (i7 != 0) {
            File file = new File(h, i5.c.j(i7, "account", "/"));
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
            if (!xr.f27569a) {
                int i7 = 0;
                while (!xr.f27569a) {
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
        if (this.f23453a == null) {
            synchronized (this) {
                try {
                    if (this.f23453a == null) {
                        p5 p5Var = new p5("files_database_queue_" + this.f23454b);
                        this.f23453a = p5Var;
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
            k5.s(this.f23455c, "CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);");
            k5.s(this.f23455c, "PRAGMA user_version = 2");
            i7 = 2;
        }
        if (i7 == 2) {
            k5.s(this.f23455c, "CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);");
            k5.s(this.f23455c, "PRAGMA user_version = 3");
            i7 = 3;
        }
        if (i7 == 3) {
            k5.s(this.f23455c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_id INTEGER default 0");
            k5.s(this.f23455c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_type INTEGER default 0");
            k5.s(this.f23455c, "PRAGMA user_version = 4");
            i7 = 4;
        }
        if (i7 != 4 && i7 != 5 && i7 != 6) {
            return;
        }
        try {
            this.f23455c.executeFast("ALTER TABLE paths ADD COLUMN flags INTEGER default 0").stepThis().dispose();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        k5.s(this.f23455c, "PRAGMA user_version = 7");
    }

    public final void h(Runnable runnable) {
        d();
        this.f23453a.c(runnable);
    }
}
