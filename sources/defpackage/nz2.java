package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.Optional;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
public final class nz2 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final byte f = 15;
    public static final lz2 g = new Object();
    public static final mz2 h = new mz2((byte) 0);
    public static final yx2 i = new yx2((byte) 3);
    public final AtomicInteger a = new AtomicInteger(0);
    public final jb4 b;
    public final dv8 c;
    public final zx2 d;

    public nz2(jb4 jb4Var, dv8 dv8Var, zx2 zx2Var) {
        this.b = jb4Var;
        this.c = dv8Var;
        this.d = zx2Var;
    }

    public static void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String f(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void g(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final dz2 a(String str, r80 r80Var) {
        String str2 = r80Var.b;
        if (Build.VERSION.SDK_INT >= 37 && (str2.equals("crash") || str2.equals("ndk-crash"))) {
            return (dz2) Optional.of(this.b.b(str, "profiling-manager-info")).filter(new sd((byte) 4)).flatMap(new xz((byte) 5)).map(new ve1(r80Var, (byte) 1)).orElse(r80Var);
        }
        return r80Var;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        jb4 jb4Var = this.b;
        arrayList.addAll(jb4.e(((File) jb4Var.f).listFiles()));
        arrayList.addAll(jb4.e(((File) jb4Var.g).listFiles()));
        mz2 mz2Var = h;
        Collections.sort(arrayList, mz2Var);
        List e2 = jb4.e(((File) jb4Var.e).listFiles());
        Collections.sort(e2, mz2Var);
        arrayList.addAll(e2);
        return arrayList;
    }

    public final NavigableSet d() {
        return new TreeSet(jb4.e(((File) this.b.d).list())).descendingSet();
    }

    public final void e(dz2 dz2Var, String str, boolean z) {
        String str2;
        jb4 jb4Var = this.b;
        int i2 = this.c.c().a.a;
        g.getClass();
        String q = lz2.a.q(dz2Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement()));
        if (z) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            g(jb4Var.b(str, tb4.y("event", format, str2)), q);
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        yx2 yx2Var = new yx2((byte) 4);
        File file = new File((File) jb4Var.d, str);
        file.mkdirs();
        List<File> e3 = jb4.e(file.listFiles(yx2Var));
        Collections.sort(e3, new mz2((byte) 1));
        int size = e3.size();
        for (File file2 : e3) {
            if (size > i2) {
                jb4.d(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
