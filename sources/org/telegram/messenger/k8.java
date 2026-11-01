package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import org.telegram.SQLite.SQLiteDatabase;
public final class k8 {
    public r5 f16578a;
    public final int f16579b;
    public SQLiteDatabase f16580c;
    public File d;
    public File e;
    public final ConcurrentHashMap f16581f = new ConcurrentHashMap();
    public final j8 f16582g = new Object();
    public boolean h;

    public k8(int i10) {
        this.f16579b = i10;
    }

    public final void a() {
        File h = w0.h();
        int i10 = this.f16579b;
        if (i10 != 0) {
            File file = new File(h, i0.a.j(i10, "account", "/"));
            file.mkdirs();
            h = file;
        }
        File file2 = new File(h, "file_to_path_backup.db");
        try {
            i0.E(this.d, file2);
            f8.b("file db backup created " + file2.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void b(int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.k8.b(int, boolean):void");
    }

    public final void c() {
        if (!this.h) {
            if (!ks.f16782a) {
                int i10 = 0;
                while (!ks.f16782a) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i10++;
                    if (i10 > 5) {
                        break;
                    }
                }
            }
            b(0, false);
            this.h = true;
        }
    }

    public final void d() {
        if (this.f16578a == null) {
            synchronized (this) {
                try {
                    if (this.f16578a == null) {
                        r5 r5Var = new r5("files_database_queue_" + this.f16579b);
                        this.f16578a = r5Var;
                        r5Var.setPriority(10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final org.telegram.messenger.j8 e(java.io.File r12, org.telegram.messenger.j8 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.k8.e(java.io.File, org.telegram.messenger.j8):org.telegram.messenger.j8");
    }

    public final java.lang.String f(final int r22, final int r23, final long r24, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.k8.f(int, int, long, boolean):java.lang.String");
    }

    public final void g(int i10) {
        if (i10 == 1) {
            m5.s(this.f16580c, "CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);");
            m5.s(this.f16580c, "PRAGMA user_version = 2");
            i10 = 2;
        }
        if (i10 == 2) {
            m5.s(this.f16580c, "CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);");
            m5.s(this.f16580c, "PRAGMA user_version = 3");
            i10 = 3;
        }
        if (i10 == 3) {
            m5.s(this.f16580c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_id INTEGER default 0");
            m5.s(this.f16580c, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_type INTEGER default 0");
            m5.s(this.f16580c, "PRAGMA user_version = 4");
            i10 = 4;
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            return;
        }
        try {
            this.f16580c.executeFast("ALTER TABLE paths ADD COLUMN flags INTEGER default 0").stepThis().dispose();
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        m5.s(this.f16580c, "PRAGMA user_version = 7");
    }

    public final void h(Runnable runnable) {
        d();
        this.f16578a.c(runnable);
    }
}
