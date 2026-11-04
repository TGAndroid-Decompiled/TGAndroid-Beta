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
public final class s8 implements i2.h, j7 {
    public static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public boolean E = true;
    public final ArrayList F = new ArrayList(1);
    public int G;
    public i2.n H;
    public i7 f25284a;
    public Uri f25285b;
    public long f25286c;
    public long d;
    public long f25287e;
    public boolean f25288f;
    public long h;
    public CountDownLatch f25289n;
    public RandomAccessFile f25290r;
    public TLRPC.TL_document f25291s;
    public Object f25292w;
    public int f25293x;
    public File f25294y;

    public static Uri i(int i3, Object obj, TLRPC.Document document) {
        String r5 = w7.r(null, document);
        w7.G(i3);
        File I2 = w7.I(document);
        if (I2 != null && I2.exists()) {
            return Uri.fromFile(I2);
        }
        try {
            StringBuilder sb2 = new StringBuilder("?account=");
            sb2.append(i3);
            sb2.append("&id=");
            sb2.append(document.f27007id);
            sb2.append("&hash=");
            sb2.append(document.access_hash);
            sb2.append("&dc=");
            sb2.append(document.dc_id);
            sb2.append("&size=");
            sb2.append(document.size);
            sb2.append("&mime=");
            sb2.append(URLEncoder.encode(document.mime_type, "UTF-8"));
            sb2.append("&rid=");
            sb2.append(w7.G(i3).F(obj));
            sb2.append("&name=");
            sb2.append(URLEncoder.encode(w7.B(document), "UTF-8"));
            sb2.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb2.append(Utilities.f(bArr));
            String sb3 = sb2.toString();
            return Uri.parse("tg://" + r5 + sb3);
        } catch (UnsupportedEncodingException e10) {
            a8.g(e10, true);
            return null;
        }
    }

    @Override
    public final void a() {
        CountDownLatch countDownLatch = this.f25289n;
        this.f25289n = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override
    public final void addTransferListener(i2.d0 d0Var) {
        d0Var.getClass();
        ArrayList arrayList = this.F;
        if (!arrayList.contains(d0Var)) {
            arrayList.add(d0Var);
            this.G++;
        }
    }

    public final void b(int i3) {
        i2.n nVar = this.H;
        String str = g2.n0.f11873a;
        for (int i10 = 0; i10 < this.G; i10++) {
            boolean z10 = this.E;
            a3.g gVar = (a3.g) ((i2.d0) this.F.get(i10));
            synchronized (gVar) {
                if (z10) {
                    if (nVar != null) {
                        try {
                            if ((nVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    gVar.f82i += i3;
                }
            }
        }
    }

    @Override
    public final void close() {
        a8.d("FileStreamLoadOperation " + this.f25291s.f27007id + " close me=" + this);
        i7 i7Var = this.f25284a;
        if (i7Var != null) {
            Utilities.d.c(new e7(i7Var, this, 0));
        }
        RandomAccessFile randomAccessFile = this.f25290r;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            this.f25290r = null;
        }
        this.f25285b = null;
        I.remove(Long.valueOf(this.f25291s.f27007id));
        if (this.f25288f) {
            this.f25288f = false;
            i2.n nVar = this.H;
            String str = g2.n0.f11873a;
            for (int i3 = 0; i3 < this.G; i3++) {
                ((a3.g) ((i2.d0) this.F.get(i3))).f(nVar, this.E);
            }
            this.H = null;
        }
        CountDownLatch countDownLatch = this.f25289n;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.f25289n = null;
        }
    }

    public final int f() {
        Integer num = (Integer) ConcurrentMap$EL.getOrDefault(J, Long.valueOf(this.f25291s.f27007id), null);
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
        return this.f25285b;
    }

    @Override
    public final long open(i2.n r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.s8.open(i2.n):long");
    }

    @Override
    public final int read(byte[] r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.s8.read(byte[], int, int):int");
    }
}
