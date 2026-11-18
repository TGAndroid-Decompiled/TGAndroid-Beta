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
    public static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public boolean E = true;
    public final ArrayList F = new ArrayList(1);
    public int G;
    public j2.m H;
    public i7 f26751a;
    public Uri f26752b;
    public long f26753c;
    public long d;
    public long f26754e;
    public boolean f26755f;
    public long h;
    public CountDownLatch f26756n;
    public RandomAccessFile f26757r;
    public TLRPC.TL_document f26758s;
    public Object f26759w;
    public int f26760x;
    public File f26761y;

    public static Uri i(int i7, Object obj, TLRPC.Document document) {
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
            sb2.append(document.f28409id);
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
        CountDownLatch countDownLatch = this.f26756n;
        this.f26756n = null;
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

    @Override
    public final void close() {
        a8.d("FileStreamLoadOperation " + this.f26758s.f28409id + " close me=" + this);
        i7 i7Var = this.f26751a;
        if (i7Var != null) {
            Utilities.d.c(new e7(i7Var, this, 0));
        }
        RandomAccessFile randomAccessFile = this.f26757r;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            this.f26757r = null;
        }
        this.f26752b = null;
        I.remove(Long.valueOf(this.f26758s.f28409id));
        if (this.f26755f) {
            this.f26755f = false;
            j2.m mVar = this.H;
            String str = h2.l0.f13783a;
            for (int i7 = 0; i7 < this.G; i7++) {
                ((b3.g) ((j2.c0) this.F.get(i7))).f(mVar, this.E);
            }
            this.H = null;
        }
        CountDownLatch countDownLatch = this.f26756n;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.f26756n = null;
        }
    }

    public final void e(int i7) {
        j2.m mVar = this.H;
        String str = h2.l0.f13783a;
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
                    gVar.f2889i += i7;
                }
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override
    public final Uri getUri() {
        return this.f26752b;
    }

    public final int h() {
        Integer num = (Integer) ConcurrentMap$EL.getOrDefault(J, Long.valueOf(this.f26758s.f28409id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
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
