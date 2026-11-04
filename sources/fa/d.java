package fa;

import a1.g;
import a3.u;
import ai.t1;
import android.os.Build;
import android.util.Log;
import ca.e2;
import ca.k2;
import ca.q2;
import ca.s0;
import ca.t0;
import ca.u0;
import ca.u1;
import ca.v0;
import ca.w0;
import ca.z0;
import ca.z1;
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
import z9.i;
public final class d {
    public static final Charset f11530e = Charset.forName("UTF-8");
    public static final int f11531f = 15;
    public static final da.a f11532g = new Object();
    public static final u h = new u(16);
    public static final a f11533i = new a(0);
    public final AtomicInteger f11534a = new AtomicInteger(0);
    public final f f11535b;
    public final ha.c f11536c;
    public final i d;

    public d(f fVar, ha.c cVar, i iVar) {
        this.f11535b = fVar;
        this.f11536c = cVar;
        this.d = iVar;
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
                    String str = new String(byteArrayOutputStream.toByteArray(), f11530e);
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
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f11530e);
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
        String str2 = t0Var.f4545b;
        if (Build.VERSION.SDK_INT >= 37) {
            if (!str2.equals("crash") && !str2.equals("ndk-crash")) {
                return t0Var;
            }
            return (q2) Optional.of(this.f11535b.b(str, "profiling-manager-info")).filter(new t1(1)).flatMap(new b(0)).map(new Function() {
                public Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override
                public final Object apply(Object obj) {
                    z1 z1Var = (z1) obj;
                    t0 t0Var2 = t0.this;
                    s0 a10 = t0Var2.a();
                    k2 k2Var = t0Var2.f4546c;
                    u0 a11 = k2Var.a();
                    w0 w0Var = (w0) ((v0) k2Var).f4568a;
                    List list = w0Var.f4576a;
                    e2 e2Var = w0Var.f4577b;
                    u1 u1Var = w0Var.f4578c;
                    z0 z0Var = w0Var.f4579e;
                    List list2 = w0Var.f4580f;
                    if (list2 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        if (list2 == null) {
                            sb2.append(" binaries");
                        }
                        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
                    }
                    a11.f4555a = new w0(list, e2Var, u1Var, z1Var, z0Var, list2);
                    a10.f4535c = a11.a();
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
        f fVar = this.f11535b;
        arrayList.addAll(f.i(((File) fVar.h).listFiles()));
        arrayList.addAll(f.i(((File) fVar.f11543n).listFiles()));
        u uVar = h;
        Collections.sort(arrayList, uVar);
        List i3 = f.i(((File) fVar.f11542f).listFiles());
        Collections.sort(i3, uVar);
        arrayList.addAll(i3);
        return arrayList;
    }

    public final NavigableSet d() {
        return new TreeSet(f.i(((File) this.f11535b.f11541e).list())).descendingSet();
    }

    public final void e(q2 q2Var, String str, boolean z10) {
        String str2;
        f fVar = this.f11535b;
        int i3 = this.f11536c.b().f14367a.f156a;
        f11532g.getClass();
        String d22 = da.a.f8594a.d2(q2Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f11534a.getAndIncrement()));
        if (z10) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            g(fVar.b(str, g.q("event", format, str2)), d22);
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        a aVar = new a(1);
        fVar.getClass();
        File file = new File((File) fVar.f11541e, str);
        file.mkdirs();
        List<File> i10 = f.i(file.listFiles(aVar));
        Collections.sort(i10, new u(17));
        int size = i10.size();
        for (File file2 : i10) {
            if (size > i3) {
                f.h(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
