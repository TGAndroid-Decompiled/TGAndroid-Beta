package defpackage;

import android.graphics.Typeface;
import android.os.Debug;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
public final class fc4 {
    public static boolean j = false;
    public static volatile fc4 k;
    public static long l;
    public OutputStreamWriter a;
    public FastDateFormat b;
    public FastDateFormat c;
    public mp3 d;
    public File e;
    public File f;
    public boolean g;
    public OutputStreamWriter h;
    public File i;

    public static void a() {
        File[] listFiles;
        h();
        File O0 = gm.O0();
        if (O0 != null && (listFiles = O0.listFiles()) != null) {
            for (File file : listFiles) {
                if ((j().e == null || !file.getAbsolutePath().equals(j().e.getAbsolutePath())) && (j().f == null || !file.getAbsolutePath().equals(j().f.getAbsolutePath()))) {
                    j();
                    file.delete();
                }
            }
        }
    }

    public static void b(String str) {
        if (e21.a) {
            h();
            Log.d("tmessages", str);
            if (j().a != null) {
                j().d.c(new iv2(str, (byte) 4));
            }
        }
    }

    public static void c(boolean z) {
        if (!z && System.currentTimeMillis() - l < 30000) {
            return;
        }
        l = System.currentTimeMillis();
        try {
            File O0 = gm.O0();
            Debug.dumpHprofData(new File(O0, j().b.format(System.currentTimeMillis()) + "_heap.hprof").getAbsolutePath());
        } catch (Exception e) {
            g(e, true);
        }
    }

    public static void d(String str) {
        if (e21.a) {
            h();
            Log.e("tmessages", str);
            if (j().a != null) {
                j().d.c(new iv2(str, (byte) 3));
            }
        }
    }

    public static void e(String str, Throwable th) {
        if (e21.a) {
            h();
            Log.e("tmessages", str, th);
            if (j().a != null) {
                j().d.c(new pv3(str, th, (byte) 25));
            }
        }
    }

    public static void f(Throwable th) {
        g(th, true);
    }

    public static void g(Throwable th, boolean z) {
        if (e21.a) {
            if (!(th instanceof InterruptedException) && !(th instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th instanceof ec4) && z) {
                Typeface typeface = gm.a;
                a.a(th);
            }
            if (th.getMessage() != null && th.getMessage().contains("disk image is malformed") && !j) {
                b("copy malformed files");
                j = true;
                File file = new File(a.h(), "malformed_database/");
                file.mkdirs();
                cf7 Y = cf7.Y(z8c.t0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Y.c);
                arrayList.add(Y.d);
                arrayList.add(Y.e);
                for (int i = 0; i < arrayList.size(); i++) {
                    try {
                        gm.E((File) arrayList.get(i), new File(file, ((File) arrayList.get(i)).getName()));
                    } catch (IOException e) {
                        g(e, true);
                    }
                }
            }
            h();
            th.printStackTrace();
            if (j().a != null) {
                j().d.c(new dc4(th, (byte) 0));
            } else {
                th.printStackTrace();
            }
        }
    }

    public static void h() {
        j().k();
    }

    public static void i(Throwable th, boolean z) {
        if (!e21.a) {
            return;
        }
        if (th instanceof OutOfMemoryError) {
            j();
            c(false);
        }
        if (z && !(th instanceof InterruptedException) && !(th instanceof MediaCodecVideoConvertor.ConversionCanceledException) && !(th instanceof ec4)) {
            Typeface typeface = gm.a;
            a.a(th);
        }
        h();
        th.printStackTrace();
        if (j().a != null) {
            j().d.c(new dc4(th, (byte) 1));
        } else {
            th.printStackTrace();
        }
    }

    public static fc4 j() {
        fc4 fc4Var;
        fc4 fc4Var2 = k;
        if (fc4Var2 == null) {
            synchronized (fc4.class) {
                fc4 fc4Var3 = k;
                fc4Var = fc4Var3;
                if (fc4Var3 == null) {
                    ?? obj = new Object();
                    obj.a = null;
                    obj.b = null;
                    obj.c = null;
                    obj.d = null;
                    obj.e = null;
                    obj.f = null;
                    obj.h = null;
                    obj.i = null;
                    k = obj;
                    fc4Var = obj;
                    if (e21.a) {
                        obj.k();
                        fc4Var = obj;
                    }
                }
            }
            return fc4Var;
        }
        return fc4Var2;
    }

    public static void l(String str) {
        if (e21.a) {
            h();
            Log.w("tmessages", str);
            if (j().a != null) {
                j().d.c(new iv2(str, (byte) 2));
            }
        }
    }

    public final void k() {
        File O0;
        if (!this.g) {
            Locale locale = Locale.US;
            this.b = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss.SSS", locale);
            FastDateFormat fastDateFormat = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss", locale);
            this.c = fastDateFormat;
            String format = fastDateFormat.format(System.currentTimeMillis());
            try {
                O0 = gm.O0();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (O0 == null) {
                return;
            }
            this.e = new File(O0, format + ".txt");
            this.i = new File(O0, format + "_mtproto.txt");
            try {
                this.d = new mp3("logQueue");
                this.e.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.e));
                this.a = outputStreamWriter;
                outputStreamWriter.write("-----start log " + format + "-----\n");
                this.a.flush();
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(this.i));
                this.h = outputStreamWriter2;
                outputStreamWriter2.write("-----start log " + format + "-----\n");
                this.h.flush();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.g = true;
        }
    }
}
