package k9;

import a9.p;
import android.util.Log;
import c3.g;
import f9.i;
import f9.k;
import h9.a2;
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

public final class b {

    public static final Charset f15091e = Charset.forName("UTF-8");

    public static final int f15092f = 15;

    public static final i9.a f15093g = new i9.a();
    public static final a h = new a(0);

    public static final i f15094i = new i(2);

    public final AtomicInteger f15095a = new AtomicInteger(0);

    public final c f15096b;

    public final g f15097c;
    public final k d;

    public b(c cVar, g gVar, k kVar) {
        this.f15096b = cVar;
        this.f15097c = gVar;
        this.d = kVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f15091e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
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

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f15091e);
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

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.f15096b;
        arrayList.addAll(c.e(cVar.f15101e.listFiles()));
        arrayList.addAll(c.e(cVar.f15102f.listFiles()));
        a aVar = h;
        Collections.sort(arrayList, aVar);
        List listE = c.e(cVar.d.listFiles());
        Collections.sort(listE, aVar);
        arrayList.addAll(listE);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(c.e(this.f15096b.f15100c.list())).descendingSet();
    }

    public final void d(a2 a2Var, String str, boolean z10) {
        c cVar = this.f15096b;
        int i10 = this.f15097c.d().f17881a.f3426a;
        f15093g.getClass();
        int i11 = 1;
        try {
            f(cVar.b(str, p.m("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f15095a.getAndIncrement())), z10 ? "_" : "")), i9.a.f10965a.h(a2Var));
        } catch (IOException e9) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e9);
        }
        i iVar = new i(3);
        cVar.getClass();
        File file = new File(cVar.f15100c, str);
        file.mkdirs();
        List<File> listE = c.e(file.listFiles(iVar));
        Collections.sort(listE, new a(i11));
        int size = listE.size();
        for (File file2 : listE) {
            if (size <= i10) {
                return;
            }
            c.d(file2);
            size--;
        }
    }
}
