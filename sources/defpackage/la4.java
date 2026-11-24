package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a;
public final class la4 {
    public co3 a;
    public final int b;
    public SQLiteDatabase c;
    public File d;
    public File e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ka4 g = new Object();
    public boolean h;

    public la4(int i) {
        this.b = i;
    }

    public final void a() {
        File h = a.h();
        int i = this.b;
        if (i != 0) {
            File file = new File(h, tb4.n(i, "account", "/"));
            file.mkdirs();
            h = file;
        }
        File file2 = new File(h, "file_to_path_backup.db");
        try {
            gl.E(this.d, file2);
            fa4.b("file db backup created " + file2.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void b(int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la4.b(int, boolean):void");
    }

    public final void c() {
        if (!this.h) {
            if (!gi7.a) {
                int i = 0;
                while (!gi7.a) {
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
                    co3 co3Var = new co3("files_database_queue_" + this.b);
                    this.a = co3Var;
                    co3Var.setPriority(10);
                }
            }
        }
    }

    public final defpackage.ka4 e(java.io.File r11, defpackage.ka4 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la4.e(java.io.File, ka4):ka4");
    }

    public final java.lang.String f(final int r22, final int r23, final long r24, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la4.f(int, int, long, boolean):java.lang.String");
    }

    public final void g(int i) {
        if (i == 1) {
            ir2.y(this.c, "CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);");
            ir2.y(this.c, "PRAGMA user_version = 2");
            i = 2;
        }
        if (i == 2) {
            ir2.y(this.c, "CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);");
            ir2.y(this.c, "PRAGMA user_version = 3");
            i = 3;
        }
        if (i == 3) {
            ir2.y(this.c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_id INTEGER default 0");
            ir2.y(this.c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_type INTEGER default 0");
            ir2.y(this.c, "PRAGMA user_version = 4");
            i = 4;
        }
        if (i != 4 && i != 5 && i != 6) {
            return;
        }
        try {
            this.c.executeFast("ALTER TABLE paths ADD COLUMN flags INTEGER default 0").stepThis().dispose();
        } catch (Throwable th) {
            fa4.g(th, true);
        }
        ir2.y(this.c, "PRAGMA user_version = 7");
    }

    public final void h(Runnable runnable) {
        d();
        this.a.c(runnable);
    }
}
