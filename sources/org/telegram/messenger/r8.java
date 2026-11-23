package org.telegram.messenger;

import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class r8 implements j2.h, j7 {
    public static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public boolean E = true;
    public final ArrayList F = new ArrayList(1);
    public int G;
    public j2.m H;
    public i7 f26647a;
    public Uri f26648b;
    public long f26649c;
    public long d;
    public long f26650e;
    public boolean f26651f;
    public long h;
    public CountDownLatch f26652n;
    public RandomAccessFile f26653r;
    public TLRPC.TL_document f26654s;
    public Object f26655w;
    public int f26656x;
    public File f26657y;

    public static Uri f(int i7, Object obj, TLRPC.Document document) {
        String r10 = w7.r(null, document);
        w7.G(i7);
        File I2 = w7.I(document);
        if (I2 != null && I2.exists()) {
            return Uri.fromFile(I2);
        }
        try {
            StringBuilder sb2 = new StringBuilder("?account=");
            sb2.append(i7);
            sb2.append("&id=");
            sb2.append(document.f28498id);
            sb2.append("&hash=");
            sb2.append(document.access_hash);
            sb2.append("&dc=");
            sb2.append(document.dc_id);
            sb2.append("&size=");
            sb2.append(document.size);
            sb2.append("&mime=");
            sb2.append(URLEncoder.encode(document.mime_type, "UTF-8"));
            sb2.append("&rid=");
            sb2.append(w7.G(i7).F(obj));
            sb2.append("&name=");
            sb2.append(URLEncoder.encode(w7.B(document), "UTF-8"));
            sb2.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb2.append(Utilities.f(bArr));
            String sb3 = sb2.toString();
            return Uri.parse("tg://" + r10 + sb3);
        } catch (UnsupportedEncodingException e10) {
            a8.g(e10, true);
            return null;
        }
    }

    @Override
    public final void a() {
        CountDownLatch countDownLatch = this.f26652n;
        this.f26652n = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override
    public final void addTransferListener(j2.c0 c0Var) {
        c0Var.getClass();
        ArrayList arrayList = this.F;
        if (!arrayList.contains(c0Var)) {
            arrayList.add(c0Var);
            this.G++;
        }
    }

    public final void c(int i7) {
        j2.m mVar = this.H;
        String str = h2.l0.f13778a;
        for (int i10 = 0; i10 < this.G; i10++) {
            boolean z10 = this.E;
            b3.g gVar = (b3.g) ((j2.c0) this.F.get(i10));
            synchronized (gVar) {
                if (z10) {
                    if (mVar != null) {
                        try {
                            if ((mVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    gVar.f2860i += i7;
                }
            }
        }
    }

    @Override
    public final void close() {
        a8.d("FileStreamLoadOperation " + this.f26654s.f28498id + " close me=" + this);
        i7 i7Var = this.f26647a;
        if (i7Var != null) {
            Utilities.d.c(new e7(i7Var, this, 0));
        }
        RandomAccessFile randomAccessFile = this.f26653r;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            this.f26653r = null;
        }
        this.f26648b = null;
        I.remove(Long.valueOf(this.f26654s.f28498id));
        if (this.f26651f) {
            this.f26651f = false;
            j2.m mVar = this.H;
            String str = h2.l0.f13778a;
            for (int i7 = 0; i7 < this.G; i7++) {
                ((b3.g) ((j2.c0) this.F.get(i7))).f(mVar, this.E);
            }
            this.H = null;
        }
        CountDownLatch countDownLatch = this.f26652n;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.f26652n = null;
        }
    }

    public final int e() {
        Integer num = (Integer) ConcurrentMap$EL.getOrDefault(J, Long.valueOf(this.f26654s.f28498id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    @Override
    public final Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override
    public final Uri getUri() {
        return this.f26648b;
    }

    @Override
    public final long open(j2.m r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.r8.open(j2.m):long");
    }

    @Override
    public final int read(byte[] r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.r8.read(byte[], int, int):int");
    }
}
