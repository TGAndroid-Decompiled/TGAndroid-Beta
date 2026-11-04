package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import org.telegram.SQLite.SQLiteDatabase;
public final class f8 {
    public p5 f22461a;
    public final int f22462b;
    public SQLiteDatabase f22463c;
    public File d;
    public File f22464e;
    public final ConcurrentHashMap f22465f = new ConcurrentHashMap();
    public final e8 f22466g = new Object();
    public boolean h;

    public f8(int i3) {
        this.f22462b = i3;
    }

    public final void a() {
        File h = t0.h();
        int i3 = this.f22462b;
        if (i3 != 0) {
            File file = new File(h, k2.p1.j(i3, "account", "/"));
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
            if (!sr.f25403a) {
                int i3 = 0;
                while (!sr.f25403a) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                    i3++;
                    if (i3 > 5) {
                        break;
                    }
                }
            }
            b(0, false);
            this.h = true;
        }
    }

    public final void d() {
        if (this.f22461a == null) {
            synchronized (this) {
                try {
                    if (this.f22461a == null) {
                        p5 p5Var = new p5("files_database_queue_" + this.f22462b);
                        this.f22461a = p5Var;
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

    public final void g(int i3) {
        if (i3 == 1) {
            k2.p1.y(this.f22463c, "CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);");
            k2.p1.y(this.f22463c, "PRAGMA user_version = 2");
            i3 = 2;
        }
        if (i3 == 2) {
            k2.p1.y(this.f22463c, "CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);");
            k2.p1.y(this.f22463c, "PRAGMA user_version = 3");
            i3 = 3;
        }
        if (i3 == 3) {
            k2.p1.y(this.f22463c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_id INTEGER default 0");
            k2.p1.y(this.f22463c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_type INTEGER default 0");
            k2.p1.y(this.f22463c, "PRAGMA user_version = 4");
            i3 = 4;
        }
        if (i3 != 4 && i3 != 5 && i3 != 6) {
            return;
        }
        try {
            this.f22463c.executeFast("ALTER TABLE paths ADD COLUMN flags INTEGER default 0").stepThis().dispose();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        k2.p1.y(this.f22463c, "PRAGMA user_version = 7");
    }

    public final void h(Runnable runnable) {
        d();
        this.f22461a.c(runnable);
    }
}
