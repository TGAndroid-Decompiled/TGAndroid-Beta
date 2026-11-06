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
public final class s8 implements j2.h, j7 {
    public static final ConcurrentHashMap H = new ConcurrentHashMap();
    public static final ConcurrentHashMap I = new ConcurrentHashMap();
    public boolean D = true;
    public final ArrayList E = new ArrayList(1);
    public int F;
    public j2.m G;
    public i7 f25427a;
    public Uri f25428b;
    public long f25429c;
    public long d;
    public long f25430e;
    public boolean f25431f;
    public long h;
    public CountDownLatch f25432n;
    public RandomAccessFile f25433r;
    public TLRPC.TL_document f25434s;
    public Object f25435w;
    public int f25436x;
    public File f25437y;

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
            sb2.append(document.f26959id);
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
        CountDownLatch countDownLatch = this.f25432n;
        this.f25432n = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override
    public final void addTransferListener(j2.d0 d0Var) {
        d0Var.getClass();
        ArrayList arrayList = this.E;
        if (!arrayList.contains(d0Var)) {
            arrayList.add(d0Var);
            this.F++;
        }
    }

    @Override
    public final void close() {
        a8.d("FileStreamLoadOperation " + this.f25434s.f26959id + " close me=" + this);
        i7 i7Var = this.f25427a;
        if (i7Var != null) {
            Utilities.d.c(new e7(i7Var, this, 0));
        }
        RandomAccessFile randomAccessFile = this.f25433r;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            this.f25433r = null;
        }
        this.f25428b = null;
        H.remove(Long.valueOf(this.f25434s.f26959id));
        if (this.f25431f) {
            this.f25431f = false;
            j2.m mVar = this.G;
            String str = h2.m0.f14112a;
            for (int i7 = 0; i7 < this.F; i7++) {
                ((b3.g) ((j2.d0) this.E.get(i7))).f(mVar, this.D);
            }
            this.G = null;
        }
        CountDownLatch countDownLatch = this.f25432n;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.f25432n = null;
        }
    }

    public final void d(int i7) {
        j2.m mVar = this.G;
        String str = h2.m0.f14112a;
        for (int i10 = 0; i10 < this.F; i10++) {
            boolean z9 = this.D;
            b3.g gVar = (b3.g) ((j2.d0) this.E.get(i10));
            synchronized (gVar) {
                if (z9) {
                    if (mVar != null) {
                        try {
                            if ((mVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    gVar.f2940i += i7;
                }
            }
        }
    }

    public final int e() {
        Integer num = (Integer) ConcurrentMap$EL.getOrDefault(I, Long.valueOf(this.f25434s.f26959id), null);
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
        return this.f25428b;
    }

    @Override
    public final long open(j2.m r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.s8.open(j2.m):long");
    }

    @Override
    public final int read(byte[] r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.s8.read(byte[], int, int):int");
    }
}
