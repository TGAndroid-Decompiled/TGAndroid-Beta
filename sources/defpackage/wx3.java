package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
public final class wx3 {
    public static final Object i = new Object();
    public static volatile wx3 j;
    public final ReentrantReadWriteLock a;
    public final st b;
    public volatile byte c;
    public final Handler d;
    public final sk e;
    public final vx3 f;
    public final boolean g;
    public final xb3 h;

    public wx3(sn4 sn4Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = (byte) 3;
        vx3 vx3Var = sn4Var.a;
        this.f = vx3Var;
        boolean z = sn4Var.b;
        this.g = z;
        this.h = sn4Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new st(0);
        sk skVar = new sk(this);
        this.e = skVar;
        reentrantReadWriteLock.writeLock().lock();
        if (!z) {
            try {
                this.c = (byte) 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                vx3Var.c(new sx3(skVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static wx3 a() {
        wx3 wx3Var;
        boolean z;
        synchronized (i) {
            wx3Var = j;
            if (wx3Var != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return wx3Var;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z;
        if (this.g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (b() == 1) {
                return;
            }
            this.a.writeLock().lock();
            try {
                if (this.c == 0) {
                    return;
                }
                this.c = (byte) 0;
                this.a.writeLock().unlock();
                sk skVar = this.e;
                wx3 wx3Var = (wx3) skVar.b;
                try {
                    wx3Var.f.c(new sx3(skVar));
                    return;
                } catch (Throwable th) {
                    wx3Var.d(th);
                    return;
                }
            } finally {
                this.a.writeLock().unlock();
            }
        }
        dq9.m("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = (byte) 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new ux3(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final java.lang.CharSequence e(int r11, int r12, java.lang.CharSequence r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx3.e(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void f(tx3 tx3Var) {
        nte.a(tx3Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(tx3Var);
            } else {
                this.d.post(new ux3(Arrays.asList(tx3Var), this.c, null));
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
