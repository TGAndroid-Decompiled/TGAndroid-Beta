package j2;

import a8.ia;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import h2.m0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public final class o implements h {
    public final Context f16458a;
    public final ArrayList f16459b;
    public final h f16460c;
    public u d;
    public b f16461e;
    public e f16462f;
    public h h;
    public f0 f16463n;
    public f f16464r;
    public b0 f16465s;
    public h f16466w;

    public o(Context context, h hVar) {
        this.f16458a = context.getApplicationContext();
        hVar.getClass();
        this.f16460c = hVar;
        this.f16459b = new ArrayList();
    }

    public static void d(h hVar, d0 d0Var) {
        if (hVar != null) {
            hVar.addTransferListener(d0Var);
        }
    }

    public final void a(h hVar) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f16459b;
            if (i7 < arrayList.size()) {
                hVar.addTransferListener((d0) arrayList.get(i7));
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.f16460c.addTransferListener(d0Var);
        this.f16459b.add(d0Var);
        d(this.d, d0Var);
        d(this.f16461e, d0Var);
        d(this.f16462f, d0Var);
        d(this.h, d0Var);
        d(this.f16463n, d0Var);
        d(this.f16464r, d0Var);
        d(this.f16465s, d0Var);
    }

    @Override
    public final void close() {
        h hVar = this.f16466w;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f16466w = null;
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        h hVar = this.f16466w;
        if (hVar == null) {
            return Collections.EMPTY_MAP;
        }
        return hVar.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        h hVar = this.f16466w;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override
    public final long open(m mVar) {
        boolean z9;
        if (this.f16466w == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        Uri uri = mVar.f16449a;
        String scheme = uri.getScheme();
        String str = m0.f14112a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f16458a;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.f16461e == null) {
                    b bVar = new b(context);
                    this.f16461e = bVar;
                    a(bVar);
                }
                this.f16466w = this.f16461e;
            } else if ("content".equals(scheme)) {
                if (this.f16462f == null) {
                    e eVar = new e(context);
                    this.f16462f = eVar;
                    a(eVar);
                }
                this.f16466w = this.f16462f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                h hVar = this.f16460c;
                if (equals) {
                    if (this.h == null) {
                        try {
                            h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.h = hVar2;
                            a(hVar2);
                        } catch (ClassNotFoundException unused) {
                            h2.a.l("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e10) {
                            throw new RuntimeException("Error instantiating RTMP extension", e10);
                        }
                        if (this.h == null) {
                            this.h = hVar;
                        }
                    }
                    this.f16466w = this.h;
                } else if ("udp".equals(scheme)) {
                    if (this.f16463n == null) {
                        f0 f0Var = new f0();
                        this.f16463n = f0Var;
                        a(f0Var);
                    }
                    this.f16466w = this.f16463n;
                } else if ("data".equals(scheme)) {
                    if (this.f16464r == null) {
                        ?? cVar = new c(false);
                        this.f16464r = cVar;
                        a(cVar);
                    }
                    this.f16466w = this.f16464r;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f16466w = hVar;
                } else {
                    if (this.f16465s == null) {
                        b0 b0Var = new b0(context);
                        this.f16465s = b0Var;
                        a(b0Var);
                    }
                    this.f16466w = this.f16465s;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f16461e == null) {
                    b bVar2 = new b(context);
                    this.f16461e = bVar2;
                    a(bVar2);
                }
                this.f16466w = this.f16461e;
            } else {
                if (this.d == null) {
                    ?? cVar2 = new c(false);
                    this.d = cVar2;
                    a(cVar2);
                }
                this.f16466w = this.d;
            }
        }
        return this.f16466w.open(mVar);
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        h hVar = this.f16466w;
        hVar.getClass();
        return hVar.read(bArr, i7, i10);
    }
}
