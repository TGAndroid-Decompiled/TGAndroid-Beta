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
public final class x8 implements g2.h, n7 {
    public static final ConcurrentHashMap H = new ConcurrentHashMap();
    public static final ConcurrentHashMap I = new ConcurrentHashMap();
    public boolean D = true;
    public final ArrayList E = new ArrayList(1);
    public int F;
    public g2.n G;
    public m7 f19222a;
    public Uri f19223b;
    public long f19224c;
    public long d;
    public long e;
    public boolean f19225f;
    public long h;
    public CountDownLatch f19226n;
    public RandomAccessFile f19227r;
    public TLRPC.TL_document f19228s;
    public Object f19229w;
    public int f19230x;
    public File f19231y;

    public static Uri f(int i10, Object obj, TLRPC.Document document) {
        String r10 = b8.r(null, document);
        b8.G(i10);
        File I2 = b8.I(document);
        if (I2 != null && I2.exists()) {
            return Uri.fromFile(I2);
        }
        try {
            StringBuilder sb2 = new StringBuilder("?account=");
            sb2.append(i10);
            sb2.append("&id=");
            sb2.append(document.f19799id);
            sb2.append("&hash=");
            sb2.append(document.access_hash);
            sb2.append("&dc=");
            sb2.append(document.dc_id);
            sb2.append("&size=");
            sb2.append(document.size);
            sb2.append("&mime=");
            sb2.append(URLEncoder.encode(document.mime_type, "UTF-8"));
            sb2.append("&rid=");
            sb2.append(b8.G(i10).F(obj));
            sb2.append("&name=");
            sb2.append(URLEncoder.encode(b8.B(document), "UTF-8"));
            sb2.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb2.append(Utilities.f(bArr));
            String sb3 = sb2.toString();
            return Uri.parse("tg://" + r10 + sb3);
        } catch (UnsupportedEncodingException e) {
            f8.g(e, true);
            return null;
        }
    }

    @Override
    public final void a() {
        CountDownLatch countDownLatch = this.f19226n;
        this.f19226n = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override
    public final void addTransferListener(g2.d0 d0Var) {
        d0Var.getClass();
        ArrayList arrayList = this.E;
        if (!arrayList.contains(d0Var)) {
            arrayList.add(d0Var);
            this.F++;
        }
    }

    public final void c(int i10) {
        g2.n nVar = this.G;
        String str = e2.l0.f6165a;
        for (int i11 = 0; i11 < this.F; i11++) {
            boolean z10 = this.D;
            y2.f fVar = (y2.f) ((g2.d0) this.E.get(i11));
            synchronized (fVar) {
                if (z10) {
                    if (nVar != null) {
                        try {
                            if ((nVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    fVar.f54149i += i10;
                }
            }
        }
    }

    @Override
    public final void close() {
        f8.d("FileStreamLoadOperation " + this.f19228s.f19799id + " close me=" + this);
        m7 m7Var = this.f19222a;
        if (m7Var != null) {
            Utilities.d.c(new i7(m7Var, this, 0));
        }
        RandomAccessFile randomAccessFile = this.f19227r;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e) {
                f8.g(e, true);
            }
            this.f19227r = null;
        }
        this.f19223b = null;
        H.remove(Long.valueOf(this.f19228s.f19799id));
        if (this.f19225f) {
            this.f19225f = false;
            g2.n nVar = this.G;
            String str = e2.l0.f6165a;
            for (int i10 = 0; i10 < this.F; i10++) {
                ((y2.f) ((g2.d0) this.E.get(i10))).f(nVar, this.D);
            }
            this.G = null;
        }
        CountDownLatch countDownLatch = this.f19226n;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.f19226n = null;
        }
    }

    public final int e() {
        Integer num = (Integer) ConcurrentMap$EL.getOrDefault(I, Long.valueOf(this.f19228s.f19799id), null);
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
        return this.f19223b;
    }

    @Override
    public final long open(g2.n r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.x8.open(g2.n):long");
    }

    @Override
    public final int read(byte[] r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.x8.read(byte[], int, int):int");
    }
}
