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
public final class f8 {
    public static boolean f15522j = false;
    public static volatile f8 f15523k;
    public static long f15524l;
    public OutputStreamWriter f15525a;
    public FastDateFormat f15526b;
    public FastDateFormat f15527c;
    public r5 d;
    public File e;
    public File f15528f;
    public boolean f15529g;
    public OutputStreamWriter h;
    public File f15530i;

    static {
        new AtomicInteger();
    }

    public static void a() {
        File[] listFiles;
        h();
        File P0 = i0.P0();
        if (P0 != null && (listFiles = P0.listFiles()) != null) {
            for (File file : listFiles) {
                if ((j().e == null || !file.getAbsolutePath().equals(j().e.getAbsolutePath())) && (j().f15528f == null || !file.getAbsolutePath().equals(j().f15528f.getAbsolutePath()))) {
                    j();
                    file.delete();
                }
            }
        }
    }

    public static void b(String str) {
        if (v2.f18448a) {
            h();
            Log.d("tmessages", str);
            if (j().f15525a != null) {
                j().d.c(new o4(str, 3));
            }
        }
    }

    public static void c(boolean z10) {
        if (!z10 && System.currentTimeMillis() - f15524l < 30000) {
            return;
        }
        f15524l = System.currentTimeMillis();
        try {
            File P0 = i0.P0();
            Debug.dumpHprofData(new File(P0, j().f15526b.format(System.currentTimeMillis()) + "_heap.hprof").getAbsolutePath());
        } catch (Exception e) {
            g(e, true);
        }
    }

    public static void d(String str) {
        if (v2.f18448a) {
            h();
            Log.e("tmessages", str);
            if (j().f15525a != null) {
                j().d.c(new o4(str, 2));
            }
        }
    }

    public static void e(String str, Throwable th2) {
        if (v2.f18448a) {
            h();
            Log.e("tmessages", str, th2);
            if (j().f15525a != null) {
                j().d.c(new t6(9, str, th2));
            }
        }
    }

    public static void f(Throwable th2) {
        g(th2, true);
    }

    public static void g(Throwable th2, boolean z10) {
        if (v2.f18448a) {
            if (!(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof e8) && z10) {
                Typeface typeface = i0.f15999a;
                w0.a(th2);
            }
            if (th2.getMessage() != null && th2.getMessage().contains("disk image is malformed") && !f15522j) {
                b("copy malformed files");
                f15522j = true;
                File file = new File(w0.h(), "malformed_database/");
                file.mkdirs();
                hs a02 = hs.a0(d20.f15147s0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(a02.f15942c);
                arrayList.add(a02.d);
                arrayList.add(a02.e);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    try {
                        i0.E((File) arrayList.get(i10), new File(file, ((File) arrayList.get(i10)).getName()));
                    } catch (IOException e) {
                        g(e, true);
                    }
                }
            }
            h();
            th2.printStackTrace();
            if (j().f15525a != null) {
                j().d.c(new d8(0, th2));
            } else {
                th2.printStackTrace();
            }
        }
    }

    public static void h() {
        j().k();
    }

    public static void i(Throwable th2, boolean z10) {
        if (!v2.f18448a) {
            return;
        }
        if (th2 instanceof OutOfMemoryError) {
            j();
            c(false);
        }
        if (z10 && !(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof e8)) {
            Typeface typeface = i0.f15999a;
            w0.a(th2);
        }
        h();
        th2.printStackTrace();
        if (j().f15525a != null) {
            j().d.c(new d8(1, th2));
        } else {
            th2.printStackTrace();
        }
    }

    public static f8 j() {
        f8 f8Var;
        f8 f8Var2 = f15523k;
        if (f8Var2 == null) {
            synchronized (f8.class) {
                try {
                    f8 f8Var3 = f15523k;
                    f8Var = f8Var3;
                    if (f8Var3 == null) {
                        ?? obj = new Object();
                        obj.f15525a = null;
                        obj.f15526b = null;
                        obj.f15527c = null;
                        obj.d = null;
                        obj.e = null;
                        obj.f15528f = null;
                        obj.h = null;
                        obj.f15530i = null;
                        f15523k = obj;
                        f8Var = obj;
                        if (v2.f18448a) {
                            obj.k();
                            f8Var = obj;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return f8Var;
        }
        return f8Var2;
    }

    public static void l(String str) {
        if (v2.f18448a) {
            h();
            Log.w("tmessages", str);
            if (j().f15525a != null) {
                j().d.c(new o4(str, 1));
            }
        }
    }

    public final void k() {
        File P0;
        if (!this.f15529g) {
            Locale locale = Locale.US;
            this.f15526b = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss.SSS", locale);
            FastDateFormat fastDateFormat = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss", locale);
            this.f15527c = fastDateFormat;
            String format = fastDateFormat.format(System.currentTimeMillis());
            try {
                P0 = i0.P0();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (P0 == null) {
                return;
            }
            this.e = new File(P0, format + ".txt");
            this.f15530i = new File(P0, format + "_mtproto.txt");
            try {
                this.d = new r5("logQueue");
                this.e.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.e));
                this.f15525a = outputStreamWriter;
                outputStreamWriter.write("-----start log " + format + "-----\n");
                this.f15525a.flush();
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(this.f15530i));
                this.h = outputStreamWriter2;
                outputStreamWriter2.write("-----start log " + format + "-----\n");
                this.h.flush();
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            this.f15529g = true;
        }
    }
}
