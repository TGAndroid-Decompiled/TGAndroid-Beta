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
    public static boolean f21397j = false;
    public static volatile a8 f21398k;
    public static long f21399l;
    public OutputStreamWriter f21400a;
    public FastDateFormat f21401b;
    public FastDateFormat f21402c;
    public p5 d;
    public File f21403e;
    public File f21404f;
    public boolean f21405g;
    public OutputStreamWriter h;
    public File f21406i;

    static {
        new AtomicInteger();
    }

    public static void a() {
        File[] listFiles;
        h();
        File P0 = g0.P0();
        if (P0 != null && (listFiles = P0.listFiles()) != null) {
            for (File file : listFiles) {
                if ((j().f21403e == null || !file.getAbsolutePath().equals(j().f21403e.getAbsolutePath())) && (j().f21404f == null || !file.getAbsolutePath().equals(j().f21404f.getAbsolutePath()))) {
                    j();
                    file.delete();
                }
            }
        }
    }

    public static void b(String str) {
        if (r2.f25199a) {
            h();
            Log.d("tmessages", str);
            if (j().f21400a != null) {
                j().d.c(new l4(str, 3));
            }
        }
    }

    public static void c(boolean z9) {
        if (!z9 && System.currentTimeMillis() - f21399l < 30000) {
            return;
        }
        f21399l = System.currentTimeMillis();
        try {
            File P0 = g0.P0();
            Debug.dumpHprofData(new File(P0, j().f21401b.format(System.currentTimeMillis()) + "_heap.hprof").getAbsolutePath());
        } catch (Exception e10) {
            g(e10, true);
        }
    }

    public static void d(String str) {
        if (r2.f25199a) {
            h();
            Log.e("tmessages", str);
            if (j().f21400a != null) {
                j().d.c(new l4(str, 2));
            }
        }
    }

    public static void e(String str, Throwable th2) {
        if (r2.f25199a) {
            h();
            Log.e("tmessages", str, th2);
            if (j().f21400a != null) {
                j().d.c(new y4(11, str, th2));
            }
        }
    }

    public static void f(Throwable th2) {
        g(th2, true);
    }

    public static void g(Throwable th2, boolean z9) {
        if (r2.f25199a) {
            if (!(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof z7) && z9) {
                Typeface typeface = g0.f22516a;
                t0.a(th2);
            }
            if (th2.getMessage() != null && th2.getMessage().contains("disk image is malformed") && !f21397j) {
                b("copy malformed files");
                f21397j = true;
                File file = new File(t0.h(), "malformed_database/");
                file.mkdirs();
                yr a02 = yr.a0(p10.f24467s0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(a02.f26700c);
                arrayList.add(a02.d);
                arrayList.add(a02.f26703e);
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
            if (j().f21400a != null) {
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
        if (!r2.f25199a) {
            return;
        }
        if (th2 instanceof OutOfMemoryError) {
            j();
            c(false);
        }
        if (z9 && !(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof z7)) {
            Typeface typeface = g0.f22516a;
            t0.a(th2);
        }
        h();
        th2.printStackTrace();
        if (j().f21400a != null) {
            j().d.c(new y7(1, th2));
        } else {
            th2.printStackTrace();
        }
    }

    public static a8 j() {
        a8 a8Var;
        a8 a8Var2 = f21398k;
        if (a8Var2 == null) {
            synchronized (a8.class) {
                try {
                    a8 a8Var3 = f21398k;
                    a8Var = a8Var3;
                    if (a8Var3 == null) {
                        ?? obj = new Object();
                        obj.f21400a = null;
                        obj.f21401b = null;
                        obj.f21402c = null;
                        obj.d = null;
                        obj.f21403e = null;
                        obj.f21404f = null;
                        obj.h = null;
                        obj.f21406i = null;
                        f21398k = obj;
                        a8Var = obj;
                        if (r2.f25199a) {
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
        if (r2.f25199a) {
            h();
            Log.w("tmessages", str);
            if (j().f21400a != null) {
                j().d.c(new l4(str, 1));
            }
        }
    }

    public final void k() {
        File P0;
        if (!this.f21405g) {
            Locale locale = Locale.US;
            this.f21401b = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss.SSS", locale);
            FastDateFormat fastDateFormat = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss", locale);
            this.f21402c = fastDateFormat;
            String format = fastDateFormat.format(System.currentTimeMillis());
            try {
                P0 = g0.P0();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (P0 == null) {
                return;
            }
            this.f21403e = new File(P0, format + ".txt");
            this.f21406i = new File(P0, format + "_mtproto.txt");
            try {
                this.d = new p5("logQueue");
                this.f21403e.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.f21403e));
                this.f21400a = outputStreamWriter;
                outputStreamWriter.write("-----start log " + format + "-----\n");
                this.f21400a.flush();
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(this.f21406i));
                this.h = outputStreamWriter2;
                outputStreamWriter2.write("-----start log " + format + "-----\n");
                this.h.flush();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f21405g = true;
        }
    }
}
