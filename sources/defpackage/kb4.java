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
public final class kb4 implements o63, m94 {
    public static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public boolean E = true;
    public final ArrayList F = new ArrayList(1);
    public int G;
    public u63 H;
    public l94 a;
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
        String r = ba4.r(null, document);
        ba4.G(i);
        File I2 = ba4.I(document);
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
            sb.append(ba4.G(i).F(obj));
            sb.append("&name=");
            sb.append(URLEncoder.encode(ba4.B(document), "UTF-8"));
            sb.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb.append(Utilities.f(bArr));
            String sb2 = sb.toString();
            return Uri.parse("tg://" + r + sb2);
        } catch (UnsupportedEncodingException e) {
            fa4.g(e, true);
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
    public final void addTransferListener(vyb vybVar) {
        vybVar.getClass();
        ArrayList arrayList = this.F;
        if (!arrayList.contains(vybVar)) {
            arrayList.add(vybVar);
            this.G++;
        }
    }

    @Override
    public final void close() {
        fa4.d("FileStreamLoadOperation " + this.s.id + " close me=" + this);
        l94 l94Var = this.a;
        if (l94Var != null) {
            Utilities.d.c(new h94(l94Var, this, (byte) 0));
        }
        RandomAccessFile randomAccessFile = this.r;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e) {
                fa4.g(e, true);
            }
            this.r = null;
        }
        this.b = null;
        I.remove(Long.valueOf(this.s.id));
        if (this.f) {
            this.f = false;
            u63 u63Var = this.H;
            String str = g8c.a;
            for (int i = 0; i < this.G; i++) {
                ((s93) ((vyb) this.F.get(i))).g(u63Var, this.E);
            }
            this.H = null;
        }
        CountDownLatch countDownLatch = this.n;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.n = null;
        }
    }

    public final void e(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb4.e(int):void");
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
    public final long open(defpackage.u63 r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb4.open(u63):long");
    }

    @Override
    public final int read(byte[] r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb4.read(byte[], int, int):int");
    }
}
