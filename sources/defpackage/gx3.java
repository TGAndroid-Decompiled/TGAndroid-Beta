package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
public final class gx3 {
    public static final Object i = new Object();
    public static volatile gx3 j;
    public final ReentrantReadWriteLock a;
    public final ss b;
    public volatile byte c;
    public final Handler d;
    public final tj e;
    public final fx3 f;
    public final boolean g;
    public final eb3 h;

    public gx3(wn4 wn4Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = (byte) 3;
        fx3 fx3Var = wn4Var.a;
        this.f = fx3Var;
        boolean z = wn4Var.b;
        this.g = z;
        this.h = wn4Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ss(0);
        tj tjVar = new tj(this);
        this.e = tjVar;
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
                fx3Var.b(new cx3(tjVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static gx3 a() {
        gx3 gx3Var;
        boolean z;
        synchronized (i) {
            gx3Var = j;
            if (gx3Var != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return gx3Var;
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
                tj tjVar = this.e;
                gx3 gx3Var = (gx3) tjVar.b;
                try {
                    gx3Var.f.b(new cx3(tjVar));
                    return;
                } catch (Throwable th) {
                    gx3Var.d(th);
                    return;
                }
            } finally {
                this.a.writeLock().unlock();
            }
        }
        grb.i("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = (byte) 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new ex3(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final java.lang.CharSequence e(int r11, int r12, java.lang.CharSequence r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx3.e(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void f(dx3 dx3Var) {
        ewe.a(dx3Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(dx3Var);
            } else {
                this.d.post(new ex3(Arrays.asList(dx3Var), this.c, null));
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
