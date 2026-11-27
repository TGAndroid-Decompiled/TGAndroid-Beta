package defpackage;

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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class hd4 implements h73, ib4 {
    public static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public boolean E = true;
    public final ArrayList F = new ArrayList(1);
    public int G;
    public n73 H;
    public hb4 a;
    public Uri b;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public long h;
    public CountDownLatch n;
    public RandomAccessFile r;
    public TLRPC.TL_document s;
    public Object w;
    public int x;
    public File y;

    public static Uri j(int i, Object obj, TLRPC.Document document) {
        String r = xb4.r(null, document);
        xb4.G(i);
        File I2 = xb4.I(document);
        if (I2 != null && I2.exists()) {
            return Uri.fromFile(I2);
        }
        try {
            StringBuilder sb = new StringBuilder("?account=");
            sb.append(i);
            sb.append("&id=");
            sb.append(document.id);
            sb.append("&hash=");
            sb.append(document.access_hash);
            sb.append("&dc=");
            sb.append(document.dc_id);
            sb.append("&size=");
            sb.append(document.size);
            sb.append("&mime=");
            sb.append(URLEncoder.encode(document.mime_type, "UTF-8"));
            sb.append("&rid=");
            sb.append(xb4.G(i).F(obj));
            sb.append("&name=");
            sb.append(URLEncoder.encode(xb4.B(document), "UTF-8"));
            sb.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb.append(Utilities.f(bArr));
            String sb2 = sb.toString();
            return Uri.parse("tg://" + r + sb2);
        } catch (UnsupportedEncodingException e) {
            cc4.g(e, true);
            return null;
        }
    }

    @Override
    public final void a() {
        CountDownLatch countDownLatch = this.n;
        this.n = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override
    public final void addTransferListener(v2c v2cVar) {
        v2cVar.getClass();
        ArrayList arrayList = this.F;
        if (!arrayList.contains(v2cVar)) {
            arrayList.add(v2cVar);
            this.G++;
        }
    }

    @Override
    public final void close() {
        cc4.d("FileStreamLoadOperation " + this.s.id + " close me=" + this);
        hb4 hb4Var = this.a;
        if (hb4Var != null) {
            Utilities.d.c(new ya4(hb4Var, this, (byte) 1));
        }
        RandomAccessFile randomAccessFile = this.r;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e) {
                cc4.g(e, true);
            }
            this.r = null;
        }
        this.b = null;
        I.remove(Long.valueOf(this.s.id));
        if (this.f) {
            this.f = false;
            n73 n73Var = this.H;
            String str = gcc.a;
            for (int i = 0; i < this.G; i++) {
                ((la3) ((v2c) this.F.get(i))).g(n73Var, this.E);
            }
            this.H = null;
        }
        CountDownLatch countDownLatch = this.n;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.n = null;
        }
    }

    public final void f(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd4.f(int):void");
    }

    @Override
    public final Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override
    public final Uri getUri() {
        return this.b;
    }

    public final int i() {
        Integer num = (Integer) ConcurrentMap$EL.getOrDefault(J, Long.valueOf(this.s.id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    @Override
    public final long open(defpackage.n73 r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd4.open(n73):long");
    }

    @Override
    public final int read(byte[] r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd4.read(byte[], int, int):int");
    }
}
