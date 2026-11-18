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
    public static boolean f22841j = false;
    public static volatile a8 f22842k;
    public static long f22843l;
    public OutputStreamWriter f22844a;
    public FastDateFormat f22845b;
    public FastDateFormat f22846c;
    public q5 d;
    public File f22847e;
    public File f22848f;
    public boolean f22849g;
    public OutputStreamWriter h;
    public File f22850i;

    static {
        new AtomicInteger();
    }

    public static void a() {
        File[] listFiles;
        h();
        File P0 = g0.P0();
        if (P0 != null && (listFiles = P0.listFiles()) != null) {
            for (File file : listFiles) {
                if ((j().f22847e == null || !file.getAbsolutePath().equals(j().f22847e.getAbsolutePath())) && (j().f22848f == null || !file.getAbsolutePath().equals(j().f22848f.getAbsolutePath()))) {
                    j();
                    file.delete();
                }
            }
        }
    }

    public static void b(String str) {
        if (s2.f26723a) {
            h();
            Log.d("tmessages", str);
            if (j().f22844a != null) {
                j().d.c(new n4(str, 3));
            }
        }
    }

    public static void c(boolean z10) {
        if (!z10 && System.currentTimeMillis() - f22843l < 30000) {
            return;
        }
        f22843l = System.currentTimeMillis();
        try {
            File P0 = g0.P0();
            Debug.dumpHprofData(new File(P0, j().f22845b.format(System.currentTimeMillis()) + "_heap.hprof").getAbsolutePath());
        } catch (Exception e10) {
            g(e10, true);
        }
    }

    public static void d(String str) {
        if (s2.f26723a) {
            h();
            Log.e("tmessages", str);
            if (j().f22844a != null) {
                j().d.c(new n4(str, 2));
            }
        }
    }

    public static void e(String str, Throwable th2) {
        if (s2.f26723a) {
            h();
            Log.e("tmessages", str, th2);
            if (j().f22844a != null) {
                j().d.c(new z4(11, str, th2));
            }
        }
    }

    public static void f(Throwable th2) {
        g(th2, true);
    }

    public static void g(Throwable th2, boolean z10) {
        if (s2.f26723a) {
            if (!(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof z7) && z10) {
                Typeface typeface = g0.f24093a;
                t0.a(th2);
            }
            if (th2.getMessage() != null && th2.getMessage().contains("disk image is malformed") && !f22841j) {
                b("copy malformed files");
                f22841j = true;
                File file = new File(t0.h(), "malformed_database/");
                file.mkdirs();
                tr a02 = tr.a0(j10.f24773t0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(a02.f27058c);
                arrayList.add(a02.d);
                arrayList.add(a02.f27061e);
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
            if (j().f22844a != null) {
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
        if (!s2.f26723a) {
            return;
        }
        if (th2 instanceof OutOfMemoryError) {
            j();
            c(false);
        }
        if (z10 && !(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof z7)) {
            Typeface typeface = g0.f24093a;
            t0.a(th2);
        }
        h();
        th2.printStackTrace();
        if (j().f22844a != null) {
            j().d.c(new y7(1, th2));
        } else {
            th2.printStackTrace();
        }
    }

    public static a8 j() {
        a8 a8Var;
        a8 a8Var2 = f22842k;
        if (a8Var2 == null) {
            synchronized (a8.class) {
                try {
                    a8 a8Var3 = f22842k;
                    a8Var = a8Var3;
                    if (a8Var3 == null) {
                        ?? obj = new Object();
                        obj.f22844a = null;
                        obj.f22845b = null;
                        obj.f22846c = null;
                        obj.d = null;
                        obj.f22847e = null;
                        obj.f22848f = null;
                        obj.h = null;
                        obj.f22850i = null;
                        f22842k = obj;
                        a8Var = obj;
                        if (s2.f26723a) {
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
        if (s2.f26723a) {
            h();
            Log.w("tmessages", str);
            if (j().f22844a != null) {
                j().d.c(new n4(str, 1));
            }
        }
    }

    public final void k() {
        File P0;
        if (!this.f22849g) {
            Locale locale = Locale.US;
            this.f22845b = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss.SSS", locale);
            FastDateFormat fastDateFormat = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss", locale);
            this.f22846c = fastDateFormat;
            String format = fastDateFormat.format(System.currentTimeMillis());
            try {
                P0 = g0.P0();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (P0 == null) {
                return;
            }
            this.f22847e = new File(P0, format + ".txt");
            this.f22850i = new File(P0, format + "_mtproto.txt");
            try {
                this.d = new q5("logQueue");
                this.f22847e.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.f22847e));
                this.f22844a = outputStreamWriter;
                outputStreamWriter.write("-----start log " + format + "-----\n");
                this.f22844a.flush();
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(this.f22850i));
                this.h = outputStreamWriter2;
                outputStreamWriter2.write("-----start log " + format + "-----\n");
                this.h.flush();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f22849g = true;
        }
    }
}
