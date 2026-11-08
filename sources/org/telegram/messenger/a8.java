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
    public static boolean f21395j = false;
    public static volatile a8 f21396k;
    public static long f21397l;
    public OutputStreamWriter f21398a;
    public FastDateFormat f21399b;
    public FastDateFormat f21400c;
    public p5 d;
    public File f21401e;
    public File f21402f;
    public boolean f21403g;
    public OutputStreamWriter h;
    public File f21404i;

    static {
        new AtomicInteger();
    }

    public static void a() {
        File[] listFiles;
        h();
        File P0 = g0.P0();
        if (P0 != null && (listFiles = P0.listFiles()) != null) {
            for (File file : listFiles) {
                if ((j().f21401e == null || !file.getAbsolutePath().equals(j().f21401e.getAbsolutePath())) && (j().f21402f == null || !file.getAbsolutePath().equals(j().f21402f.getAbsolutePath()))) {
                    j();
                    file.delete();
                }
            }
        }
    }

    public static void b(String str) {
        if (r2.f25212a) {
            h();
            Log.d("tmessages", str);
            if (j().f21398a != null) {
                j().d.c(new l4(str, 3));
            }
        }
    }

    public static void c(boolean z9) {
        if (!z9 && System.currentTimeMillis() - f21397l < 30000) {
            return;
        }
        f21397l = System.currentTimeMillis();
        try {
            File P0 = g0.P0();
            Debug.dumpHprofData(new File(P0, j().f21399b.format(System.currentTimeMillis()) + "_heap.hprof").getAbsolutePath());
        } catch (Exception e10) {
            g(e10, true);
        }
    }

    public static void d(String str) {
        if (r2.f25212a) {
            h();
            Log.e("tmessages", str);
            if (j().f21398a != null) {
                j().d.c(new l4(str, 2));
            }
        }
    }

    public static void e(String str, Throwable th2) {
        if (r2.f25212a) {
            h();
            Log.e("tmessages", str, th2);
            if (j().f21398a != null) {
                j().d.c(new x4(11, str, th2));
            }
        }
    }

    public static void f(Throwable th2) {
        g(th2, true);
    }

    public static void g(Throwable th2, boolean z9) {
        if (r2.f25212a) {
            if (!(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof z7) && z9) {
                Typeface typeface = g0.f22535a;
                t0.a(th2);
            }
            if (th2.getMessage() != null && th2.getMessage().contains("disk image is malformed") && !f21395j) {
                b("copy malformed files");
                f21395j = true;
                File file = new File(t0.h(), "malformed_database/");
                file.mkdirs();
                yr a02 = yr.a0(p10.f24470s0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(a02.f26723c);
                arrayList.add(a02.d);
                arrayList.add(a02.f26726e);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    try {
                        g0.E((File) arrayList.get(i7), new File(file, ((File) arrayList.get(i7)).getName()));
                    } catch (IOException e10) {
                        g(e10, true);
                    }
                }
            }
            h();
            th2.printStackTrace();
            if (j().f21398a != null) {
                j().d.c(new y7(0, th2));
            } else {
                th2.printStackTrace();
            }
        }
    }

    public static void h() {
        j().k();
    }

    public static void i(Throwable th2, boolean z9) {
        if (!r2.f25212a) {
            return;
        }
        if (th2 instanceof OutOfMemoryError) {
            j();
            c(false);
        }
        if (z9 && !(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof z7)) {
            Typeface typeface = g0.f22535a;
            t0.a(th2);
        }
        h();
        th2.printStackTrace();
        if (j().f21398a != null) {
            j().d.c(new y7(1, th2));
        } else {
            th2.printStackTrace();
        }
    }

    public static a8 j() {
        a8 a8Var;
        a8 a8Var2 = f21396k;
        if (a8Var2 == null) {
            synchronized (a8.class) {
                try {
                    a8 a8Var3 = f21396k;
                    a8Var = a8Var3;
                    if (a8Var3 == null) {
                        ?? obj = new Object();
                        obj.f21398a = null;
                        obj.f21399b = null;
                        obj.f21400c = null;
                        obj.d = null;
                        obj.f21401e = null;
                        obj.f21402f = null;
                        obj.h = null;
                        obj.f21404i = null;
                        f21396k = obj;
                        a8Var = obj;
                        if (r2.f25212a) {
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
        if (r2.f25212a) {
            h();
            Log.w("tmessages", str);
            if (j().f21398a != null) {
                j().d.c(new l4(str, 1));
            }
        }
    }

    public final void k() {
        File P0;
        if (!this.f21403g) {
            Locale locale = Locale.US;
            this.f21399b = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss.SSS", locale);
            FastDateFormat fastDateFormat = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss", locale);
            this.f21400c = fastDateFormat;
            String format = fastDateFormat.format(System.currentTimeMillis());
            try {
                P0 = g0.P0();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (P0 == null) {
                return;
            }
            this.f21401e = new File(P0, format + ".txt");
            this.f21404i = new File(P0, format + "_mtproto.txt");
            try {
                this.d = new p5("logQueue");
                this.f21401e.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.f21401e));
                this.f21398a = outputStreamWriter;
                outputStreamWriter.write("-----start log " + format + "-----\n");
                this.f21398a.flush();
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(this.f21404i));
                this.h = outputStreamWriter2;
                outputStreamWriter2.write("-----start log " + format + "-----\n");
                this.h.flush();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f21403g = true;
        }
    }
}
