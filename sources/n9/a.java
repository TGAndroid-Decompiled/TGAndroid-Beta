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
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f14855f = 15;
    public static final l9.a f14856g = new Object();
    public static final f h = new f(23);
    public static final i f14857i = new i(2);
    public final AtomicInteger f14858a = new AtomicInteger(0);
    public final b f14859b;
    public final g f14860c;
    public final k d;

    public a(b bVar, g gVar, k kVar) {
        this.f14859b = bVar;
        this.f14860c = gVar;
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
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
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
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
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
        b bVar = this.f14859b;
        arrayList.addAll(b.e(bVar.e.listFiles()));
        arrayList.addAll(b.e(bVar.f14864f.listFiles()));
        f fVar = h;
        Collections.sort(arrayList, fVar);
        List e6 = b.e(bVar.d.listFiles());
        Collections.sort(e6, fVar);
        arrayList.addAll(e6);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(b.e(this.f14859b.f14863c.list())).descendingSet();
    }

    public final void d(a2 a2Var, String str, boolean z4) {
        String str2;
        b bVar = this.f14859b;
        int i10 = this.f14860c.d().f41061a.f2081a;
        f14856g.getClass();
        String e6 = l9.a.f11729a.e(a2Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f14858a.getAndIncrement()));
        if (z4) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            f(bVar.b(str, android.support.v4.media.a.o("event", format, str2)), e6);
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        i iVar = new i(3);
        bVar.getClass();
        File file = new File(bVar.f14863c, str);
        file.mkdirs();
        List<File> e11 = b.e(file.listFiles(iVar));
        Collections.sort(e11, new f(24));
        int size = e11.size();
        for (File file2 : e11) {
            if (size > i10) {
                b.d(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
