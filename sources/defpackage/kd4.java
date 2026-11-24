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
public final class kd4 implements a83, mb4 {
    public static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public boolean E = true;
    public final ArrayList F = new ArrayList(1);
    public int G;
    public g83 H;
    public lb4 a;
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
        String r = bc4.r(null, document);
        bc4.G(i);
        File I2 = bc4.I(document);
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
            sb.append(bc4.G(i).F(obj));
            sb.append("&name=");
            sb.append(URLEncoder.encode(bc4.B(document), "UTF-8"));
            sb.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb.append(Utilities.f(bArr));
            String sb2 = sb.toString();
            return Uri.parse("tg://" + r + sb2);
        } catch (UnsupportedEncodingException e) {
            fc4.g(e, true);
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
    public final void addTransferListener(w0c w0cVar) {
        w0cVar.getClass();
        ArrayList arrayList = this.F;
        if (!arrayList.contains(w0cVar)) {
            arrayList.add(w0cVar);
            this.G++;
        }
    }

    @Override
    public final void close() {
        fc4.d("FileStreamLoadOperation " + this.s.id + " close me=" + this);
        lb4 lb4Var = this.a;
        if (lb4Var != null) {
            Utilities.d.c(new hb4(lb4Var, this, (byte) 0));
        }
        RandomAccessFile randomAccessFile = this.r;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e) {
                fc4.g(e, true);
            }
            this.r = null;
        }
        this.b = null;
        I.remove(Long.valueOf(this.s.id));
        if (this.f) {
            this.f = false;
            g83 g83Var = this.H;
            String str = hac.a;
            for (int i = 0; i < this.G; i++) {
                ((eb3) ((w0c) this.F.get(i))).g(g83Var, this.E);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd4.e(int):void");
    }

    @Override
    public final Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override
    public final Uri getUri() {
        return this.b;
    }

    public final int h() {
        Integer num = (Integer) ConcurrentMap$EL.getOrDefault(J, Long.valueOf(this.s.id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    @Override
    public final long open(defpackage.g83 r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd4.open(g83):long");
    }

    @Override
    public final int read(byte[] r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd4.read(byte[], int, int):int");
    }
}
