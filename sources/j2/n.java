package j2;

import a8.ja;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import h2.l0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public final class n implements h {
    public final Context f16809a;
    public final ArrayList f16810b;
    public final h f16811c;
    public t d;
    public b f16812e;
    public e f16813f;
    public h h;
    public e0 f16814n;
    public f f16815r;
    public a0 f16816s;
    public h f16817w;

    public n(Context context, h hVar) {
        this.f16809a = context.getApplicationContext();
        hVar.getClass();
        this.f16811c = hVar;
        this.f16810b = new ArrayList();
    }

    public static void b(h hVar, c0 c0Var) {
        if (hVar != null) {
            hVar.addTransferListener(c0Var);
        }
    }

    public final void a(h hVar) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f16810b;
            if (i7 < arrayList.size()) {
                hVar.addTransferListener((c0) arrayList.get(i7));
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f16811c.addTransferListener(c0Var);
        this.f16810b.add(c0Var);
        b(this.d, c0Var);
        b(this.f16812e, c0Var);
        b(this.f16813f, c0Var);
        b(this.h, c0Var);
        b(this.f16814n, c0Var);
        b(this.f16815r, c0Var);
        b(this.f16816s, c0Var);
    }

    @Override
    public final void close() {
        h hVar = this.f16817w;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f16817w = null;
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        h hVar = this.f16817w;
        if (hVar == null) {
            return Collections.EMPTY_MAP;
        }
        return hVar.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        h hVar = this.f16817w;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override
    public final long open(m mVar) {
        boolean z10;
        if (this.f16817w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.p(z10);
        Uri uri = mVar.f16803a;
        String scheme = uri.getScheme();
        String str = l0.f13471a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f16809a;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.f16812e == null) {
                    b bVar = new b(context);
                    this.f16812e = bVar;
                    a(bVar);
                }
                this.f16817w = this.f16812e;
            } else if ("content".equals(scheme)) {
                if (this.f16813f == null) {
                    e eVar = new e(context);
                    this.f16813f = eVar;
                    a(eVar);
                }
                this.f16817w = this.f16813f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                h hVar = this.f16811c;
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
                    this.f16817w = this.h;
                } else if ("udp".equals(scheme)) {
                    if (this.f16814n == null) {
                        e0 e0Var = new e0();
                        this.f16814n = e0Var;
                        a(e0Var);
                    }
                    this.f16817w = this.f16814n;
                } else if ("data".equals(scheme)) {
                    if (this.f16815r == null) {
                        ?? cVar = new c(false);
                        this.f16815r = cVar;
                        a(cVar);
                    }
                    this.f16817w = this.f16815r;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f16817w = hVar;
                } else {
                    if (this.f16816s == null) {
                        a0 a0Var = new a0(context);
                        this.f16816s = a0Var;
                        a(a0Var);
                    }
                    this.f16817w = this.f16816s;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f16812e == null) {
                    b bVar2 = new b(context);
                    this.f16812e = bVar2;
                    a(bVar2);
                }
                this.f16817w = this.f16812e;
            } else {
                if (this.d == null) {
                    ?? cVar2 = new c(false);
                    this.d = cVar2;
                    a(cVar2);
                }
                this.f16817w = this.d;
            }
        }
        return this.f16817w.open(mVar);
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        h hVar = this.f16817w;
        hVar.getClass();
        return hVar.read(bArr, i7, i10);
    }
}
