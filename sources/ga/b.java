package ga;

import a8.p0;
import aa.h;
import aa.j;
import aa.l;
import aa.m;
import android.os.Build;
import android.util.Log;
import da.e2;
import da.k2;
import da.q2;
import da.s0;
import da.t0;
import da.u0;
import da.u1;
import da.v0;
import da.w0;
import da.z0;
import da.z1;
import j$.util.Optional;
import j$.util.function.Function$CC;
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
import java.util.function.Function;
public final class b {
    public static final Charset f13609e = Charset.forName("UTF-8");
    public static final int f13610f = 15;
    public static final ea.a f13611g = new Object();
    public static final a3.c h = new a3.c(28);
    public static final h f13612i = new h(3);
    public final AtomicInteger f13613a = new AtomicInteger(0);
    public final d f13614b;
    public final ia.c f13615c;
    public final j d;

    public b(d dVar, ia.c cVar, j jVar) {
        this.f13614b = dVar;
        this.f13615c = cVar;
        this.d = jVar;
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
                    String str = new String(byteArrayOutputStream.toByteArray(), f13609e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void g(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f13609e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final q2 a(String str, final t0 t0Var) {
        String str2 = t0Var.f8522b;
        if (Build.VERSION.SDK_INT >= 37) {
            if (!str2.equals("crash") && !str2.equals("ndk-crash")) {
                return t0Var;
            }
            return (q2) Optional.of(this.f13614b.b(str, "profiling-manager-info")).filter(new m(3)).flatMap(new l(1)).map(new Function() {
                public Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override
                public final Object apply(Object obj) {
                    z1 z1Var = (z1) obj;
                    t0 t0Var2 = t0.this;
                    s0 a10 = t0Var2.a();
                    k2 k2Var = t0Var2.f8523c;
                    u0 a11 = k2Var.a();
                    w0 w0Var = (w0) ((v0) k2Var).f8545a;
                    List list = w0Var.f8553a;
                    e2 e2Var = w0Var.f8554b;
                    u1 u1Var = w0Var.f8555c;
                    z0 z0Var = w0Var.f8556e;
                    List list2 = w0Var.f8557f;
                    if (list2 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        if (list2 == null) {
                            sb2.append(" binaries");
                        }
                        throw new IllegalStateException(p0.q("Missing required properties:", sb2));
                    }
                    a11.f8532a = new w0(list, e2Var, u1Var, z1Var, z0Var, list2);
                    a10.f8512c = a11.a();
                    return a10.a();
                }

                public Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(t0Var);
        }
        return t0Var;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        d dVar = this.f13614b;
        arrayList.addAll(d.i(((File) dVar.h).listFiles()));
        arrayList.addAll(d.i(((File) dVar.f13622n).listFiles()));
        a3.c cVar = h;
        Collections.sort(arrayList, cVar);
        List i7 = d.i(((File) dVar.f13621f).listFiles());
        Collections.sort(i7, cVar);
        arrayList.addAll(i7);
        return arrayList;
    }

    public final NavigableSet d() {
        return new TreeSet(d.i(((File) this.f13614b.f13620e).list())).descendingSet();
    }

    public final void e(q2 q2Var, String str, boolean z9) {
        String str2;
        d dVar = this.f13614b;
        int i7 = this.f13615c.b().f15415a.f3009a;
        f13611g.getClass();
        String u10 = ea.a.f10731a.u(q2Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f13613a.getAndIncrement()));
        if (z9) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            g(dVar.b(str, p0.p("event", format, str2)), u10);
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        h hVar = new h(4);
        dVar.getClass();
        File file = new File((File) dVar.f13620e, str);
        file.mkdirs();
        List<File> i10 = d.i(file.listFiles(hVar));
        Collections.sort(i10, new a3.c(29));
        int size = i10.size();
        for (File file2 : i10) {
            if (size > i7) {
                d.h(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
