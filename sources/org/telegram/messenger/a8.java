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
    public static boolean f22881j = false;
    public static volatile a8 f22882k;
    public static long f22883l;
    public OutputStreamWriter f22884a;
    public FastDateFormat f22885b;
    public FastDateFormat f22886c;
    public q5 d;
    public File f22887e;
    public File f22888f;
    public boolean f22889g;
    public OutputStreamWriter h;
    public File f22890i;

    static {
        new AtomicInteger();
    }

    public static void a() {
        File[] listFiles;
        h();
        File P0 = g0.P0();
        if (P0 != null && (listFiles = P0.listFiles()) != null) {
            for (File file : listFiles) {
                if ((j().f22887e == null || !file.getAbsolutePath().equals(j().f22887e.getAbsolutePath())) && (j().f22888f == null || !file.getAbsolutePath().equals(j().f22888f.getAbsolutePath()))) {
                    j();
                    file.delete();
                }
            }
        }
    }

    public static void b(String str) {
        if (s2.f26730a) {
            h();
            Log.d("tmessages", str);
            if (j().f22884a != null) {
                j().d.c(new n4(str, 3));
            }
        }
    }

    public static void c(boolean z10) {
        if (!z10 && System.currentTimeMillis() - f22883l < 30000) {
            return;
        }
        f22883l = System.currentTimeMillis();
        try {
            File P0 = g0.P0();
            Debug.dumpHprofData(new File(P0, j().f22885b.format(System.currentTimeMillis()) + "_heap.hprof").getAbsolutePath());
        } catch (Exception e10) {
            g(e10, true);
        }
    }

    public static void d(String str) {
        if (s2.f26730a) {
            h();
            Log.e("tmessages", str);
            if (j().f22884a != null) {
                j().d.c(new n4(str, 2));
            }
        }
    }

    public static void e(String str, Throwable th2) {
        if (s2.f26730a) {
            h();
            Log.e("tmessages", str, th2);
            if (j().f22884a != null) {
                j().d.c(new z4(11, str, th2));
            }
        }
    }

    public static void f(Throwable th2) {
        g(th2, true);
    }

    public static void g(Throwable th2, boolean z10) {
        if (s2.f26730a) {
            if (!(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof z7) && z10) {
                Typeface typeface = g0.f24018a;
                t0.a(th2);
            }
            if (th2.getMessage() != null && th2.getMessage().contains("disk image is malformed") && !f22881j) {
                b("copy malformed files");
                f22881j = true;
                File file = new File(t0.h(), "malformed_database/");
                file.mkdirs();
                ur a02 = ur.a0(k10.f24968t0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(a02.f27254c);
                arrayList.add(a02.d);
                arrayList.add(a02.f27257e);
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
            if (j().f22884a != null) {
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
        if (!s2.f26730a) {
            return;
        }
        if (th2 instanceof OutOfMemoryError) {
            j();
            c(false);
        }
        if (z10 && !(th2 instanceof InterruptedException) && !(th2 instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th2 instanceof z7)) {
            Typeface typeface = g0.f24018a;
            t0.a(th2);
        }
        h();
        th2.printStackTrace();
        if (j().f22884a != null) {
            j().d.c(new y7(1, th2));
        } else {
            th2.printStackTrace();
        }
    }

    public static a8 j() {
        a8 a8Var;
        a8 a8Var2 = f22882k;
        if (a8Var2 == null) {
            synchronized (a8.class) {
                try {
                    a8 a8Var3 = f22882k;
                    a8Var = a8Var3;
                    if (a8Var3 == null) {
                        ?? obj = new Object();
                        obj.f22884a = null;
                        obj.f22885b = null;
                        obj.f22886c = null;
                        obj.d = null;
                        obj.f22887e = null;
                        obj.f22888f = null;
                        obj.h = null;
                        obj.f22890i = null;
                        f22882k = obj;
                        a8Var = obj;
                        if (s2.f26730a) {
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
        if (s2.f26730a) {
            h();
            Log.w("tmessages", str);
            if (j().f22884a != null) {
                j().d.c(new n4(str, 1));
            }
        }
    }

    public final void k() {
        File P0;
        if (!this.f22889g) {
            Locale locale = Locale.US;
            this.f22885b = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss.SSS", locale);
            FastDateFormat fastDateFormat = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss", locale);
            this.f22886c = fastDateFormat;
            String format = fastDateFormat.format(System.currentTimeMillis());
            try {
                P0 = g0.P0();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (P0 == null) {
                return;
            }
            this.f22887e = new File(P0, format + ".txt");
            this.f22890i = new File(P0, format + "_mtproto.txt");
            try {
                this.d = new q5("logQueue");
                this.f22887e.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.f22887e));
                this.f22884a = outputStreamWriter;
                outputStreamWriter.write("-----start log " + format + "-----\n");
                this.f22884a.flush();
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(this.f22890i));
                this.h = outputStreamWriter2;
                outputStreamWriter2.write("-----start log " + format + "-----\n");
                this.h.flush();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f22889g = true;
        }
    }
}
