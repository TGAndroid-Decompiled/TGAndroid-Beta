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
    public final Context f16455a;
    public final ArrayList f16456b;
    public final h f16457c;
    public u d;
    public b f16458e;
    public e f16459f;
    public h h;
    public f0 f16460n;
    public f f16461r;
    public b0 f16462s;
    public h f16463w;

    public o(Context context, h hVar) {
        this.f16455a = context.getApplicationContext();
        hVar.getClass();
        this.f16457c = hVar;
        this.f16456b = new ArrayList();
    }

    public static void d(h hVar, d0 d0Var) {
        if (hVar != null) {
            hVar.addTransferListener(d0Var);
        }
    }

    public final void a(h hVar) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f16456b;
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
        this.f16457c.addTransferListener(d0Var);
        this.f16456b.add(d0Var);
        d(this.d, d0Var);
        d(this.f16458e, d0Var);
        d(this.f16459f, d0Var);
        d(this.h, d0Var);
        d(this.f16460n, d0Var);
        d(this.f16461r, d0Var);
        d(this.f16462s, d0Var);
    }

    @Override
    public final void close() {
        h hVar = this.f16463w;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f16463w = null;
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        h hVar = this.f16463w;
        if (hVar == null) {
            return Collections.EMPTY_MAP;
        }
        return hVar.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        h hVar = this.f16463w;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override
    public final long open(m mVar) {
        boolean z9;
        if (this.f16463w == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        Uri uri = mVar.f16446a;
        String scheme = uri.getScheme();
        String str = m0.f14112a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f16455a;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.f16458e == null) {
                    b bVar = new b(context);
                    this.f16458e = bVar;
                    a(bVar);
                }
                this.f16463w = this.f16458e;
            } else if ("content".equals(scheme)) {
                if (this.f16459f == null) {
                    e eVar = new e(context);
                    this.f16459f = eVar;
                    a(eVar);
                }
                this.f16463w = this.f16459f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                h hVar = this.f16457c;
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
                    this.f16463w = this.h;
                } else if ("udp".equals(scheme)) {
                    if (this.f16460n == null) {
                        f0 f0Var = new f0();
                        this.f16460n = f0Var;
                        a(f0Var);
                    }
                    this.f16463w = this.f16460n;
                } else if ("data".equals(scheme)) {
                    if (this.f16461r == null) {
                        ?? cVar = new c(false);
                        this.f16461r = cVar;
                        a(cVar);
                    }
                    this.f16463w = this.f16461r;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f16463w = hVar;
                } else {
                    if (this.f16462s == null) {
                        b0 b0Var = new b0(context);
                        this.f16462s = b0Var;
                        a(b0Var);
                    }
                    this.f16463w = this.f16462s;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f16458e == null) {
                    b bVar2 = new b(context);
                    this.f16458e = bVar2;
                    a(bVar2);
                }
                this.f16463w = this.f16458e;
            } else {
                if (this.d == null) {
                    ?? cVar2 = new c(false);
                    this.d = cVar2;
                    a(cVar2);
                }
                this.f16463w = this.d;
            }
        }
        return this.f16463w.open(mVar);
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        h hVar = this.f16463w;
        hVar.getClass();
        return hVar.read(bArr, i7, i10);
    }
}
