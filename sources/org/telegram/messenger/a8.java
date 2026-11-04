package org.telegram.messenger;

import android.graphics.Typeface;
import android.os.Debug;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
public final class a8 {
    public static boolean f21471j = false;
    public static volatile a8 f21472k;
    public static long f21473l;
    public OutputStreamWriter f21474a;
    public FastDateFormat f21475b;
    public FastDateFormat f21476c;
    public p5 d;
    public File f21477e;
    public File f21478f;
    public boolean f21479g;
    public OutputStreamWriter h;
    public File f21480i;

    static {
        new AtomicInteger();
    }

    public static void a() {
        File[] listFiles;
        h();
        File P0 = g0.P0();
        if (P0 != null && (listFiles = P0.listFiles()) != null) {
            for (File file : listFiles) {
                if ((j().f21477e == null || !file.getAbsolutePath().equals(j().f21477e.getAbsolutePath())) && (j().f21478f == null || !file.getAbsolutePath().equals(j().f21478f.getAbsolutePath()))) {
                    j();
                    file.delete();
                }
            }
        }
    }

    public static void b(String str) {
        if (r2.f25040a) {
            h();
            Log.d("tmessages", str);
            if (j().f21474a != null) {
                j().d.c(new l4(str, 3));
            }
        }
    }

    public static void c(boolean z10) {
        if (!z10 && System.currentTimeMillis() - f21473l < 30000) {
            return;
        }
        f21473l = System.currentTimeMillis();
        try {
            File P0 = g0.P0();
            Debug.dumpHprofData(new File(P0, j().f21475b.format(System.currentTimeMillis()) + "_heap.hprof").getAbsolutePath());
        } catch (Exception e10) {
            g(e10, true);
        }
    }

    public static void d(String str) {
        if (r2.f25040a) {
            h();
            Log.e("tmessages", str);
            if (j().f21474a != null) {
                j().d.c(new l4(str, 2));
            }
        }
    }

    public static void e(String str, Throwable th2) {
        if (r2.f25040a) {
            h();
            Log.e("tmessages", str, th2);
            if (j().f21474a != null) {
                j().d.c(new y4(11, str, th2));
            }
        }
    }

    public static void f(Throwable th2) {
        g(th2, true);
    }

    public static void g(Throwable th2, boolean z10) {
        if (r2.f25040a) {
            if (!(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof z7) && z10) {
                Typeface typeface = g0.f22580a;
                t0.a(th2);
            }
            if (th2.getMessage() != null && th2.getMessage().contains("disk image is malformed") && !f21471j) {
                b("copy malformed files");
                f21471j = true;
                File file = new File(t0.h(), "malformed_database/");
                file.mkdirs();
                qr a02 = qr.a0(h10.f22829t0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(a02.f24938c);
                arrayList.add(a02.d);
                arrayList.add(a02.f24941e);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    try {
                        g0.E((File) arrayList.get(i3), new File(file, ((File) arrayList.get(i3)).getName()));
                    } catch (IOException e10) {
                        g(e10, true);
                    }
                }
            }
            h();
            th2.printStackTrace();
            if (j().f21474a != null) {
                j().d.c(new y7(0, th2));
            } else {
                th2.printStackTrace();
            }
        }
    }

    public static void h() {
        j().k();
    }

    public static void i(Throwable th2, boolean z10) {
        if (!r2.f25040a) {
            return;
        }
        if (th2 instanceof OutOfMemoryError) {
            j();
            c(false);
        }
        if (z10 && !(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof z7)) {
            Typeface typeface = g0.f22580a;
            t0.a(th2);
        }
        h();
        th2.printStackTrace();
        if (j().f21474a != null) {
            j().d.c(new y7(1, th2));
        } else {
            th2.printStackTrace();
        }
    }

    public static a8 j() {
        a8 a8Var;
        a8 a8Var2 = f21472k;
        if (a8Var2 == null) {
            synchronized (a8.class) {
                try {
                    a8 a8Var3 = f21472k;
                    a8Var = a8Var3;
                    if (a8Var3 == null) {
                        ?? obj = new Object();
                        obj.f21474a = null;
                        obj.f21475b = null;
                        obj.f21476c = null;
                        obj.d = null;
                        obj.f21477e = null;
                        obj.f21478f = null;
                        obj.h = null;
                        obj.f21480i = null;
                        f21472k = obj;
                        a8Var = obj;
                        if (r2.f25040a) {
                            obj.k();
                            a8Var = obj;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return a8Var;
        }
        return a8Var2;
    }

    public static void l(String str) {
        if (r2.f25040a) {
            h();
            Log.w("tmessages", str);
            if (j().f21474a != null) {
                j().d.c(new l4(str, 1));
            }
        }
    }

    public final void k() {
        File P0;
        if (!this.f21479g) {
            Locale locale = Locale.US;
            this.f21475b = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss.SSS", locale);
            FastDateFormat fastDateFormat = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss", locale);
            this.f21476c = fastDateFormat;
            String format = fastDateFormat.format(System.currentTimeMillis());
            try {
                P0 = g0.P0();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (P0 == null) {
                return;
            }
            this.f21477e = new File(P0, format + ".txt");
            this.f21480i = new File(P0, format + "_mtproto.txt");
            try {
                this.d = new p5("logQueue");
                this.f21477e.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.f21477e));
                this.f21474a = outputStreamWriter;
                outputStreamWriter.write("-----start log " + format + "-----\n");
                this.f21474a.flush();
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(this.f21480i));
                this.h = outputStreamWriter2;
                outputStreamWriter2.write("-----start log " + format + "-----\n");
                this.h.flush();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f21479g = true;
        }
    }
}
