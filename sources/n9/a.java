package n9;

import android.util.Log;
import e3.g;
import e5.f;
import i9.i;
import i9.k;
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
import k9.a2;
public final class a {
    public static final Charset f15866e = Charset.forName("UTF-8");
    public static final int f15867f = 15;
    public static final l9.a f15868g = new Object();
    public static final f h = new f(21);
    public static final i f15869i = new i(2);
    public final AtomicInteger f15870a = new AtomicInteger(0);
    public final b f15871b;
    public final g f15872c;
    public final k d;

    public a(b bVar, g gVar, k kVar) {
        this.f15871b = bVar;
        this.f15872c = gVar;
        this.d = kVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f15866e);
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

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f15866e);
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

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        b bVar = this.f15871b;
        arrayList.addAll(b.e(bVar.f15876e.listFiles()));
        arrayList.addAll(b.e(bVar.f15877f.listFiles()));
        f fVar = h;
        Collections.sort(arrayList, fVar);
        List e6 = b.e(bVar.d.listFiles());
        Collections.sort(e6, fVar);
        arrayList.addAll(e6);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(b.e(this.f15871b.f15875c.list())).descendingSet();
    }

    public final void d(a2 a2Var, String str, boolean z4) {
        String str2;
        b bVar = this.f15871b;
        int i10 = this.f15872c.d().f44248a.f2264a;
        f15868g.getClass();
        String d = l9.a.f12136a.d(a2Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f15870a.getAndIncrement()));
        if (z4) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            f(bVar.b(str, android.support.v4.media.a.o("event", format, str2)), d);
        } catch (IOException e6) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e6);
        }
        i iVar = new i(3);
        bVar.getClass();
        File file = new File(bVar.f15875c, str);
        file.mkdirs();
        List<File> e10 = b.e(file.listFiles(iVar));
        Collections.sort(e10, new f(22));
        int size = e10.size();
        for (File file2 : e10) {
            if (size > i10) {
                b.d(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
