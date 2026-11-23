package j2;

import a8.ma;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import h2.l0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public final class n implements h {
    public final Context f17185a;
    public final ArrayList f17186b;
    public final h f17187c;
    public t d;
    public b f17188e;
    public e f17189f;
    public h h;
    public e0 f17190n;
    public f f17191r;
    public a0 f17192s;
    public h f17193w;

    public n(Context context, h hVar) {
        this.f17185a = context.getApplicationContext();
        hVar.getClass();
        this.f17187c = hVar;
        this.f17186b = new ArrayList();
    }

    public static void e(h hVar, c0 c0Var) {
        if (hVar != null) {
            hVar.addTransferListener(c0Var);
        }
    }

    public final void a(h hVar) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f17186b;
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
        this.f17187c.addTransferListener(c0Var);
        this.f17186b.add(c0Var);
        e(this.d, c0Var);
        e(this.f17188e, c0Var);
        e(this.f17189f, c0Var);
        e(this.h, c0Var);
        e(this.f17190n, c0Var);
        e(this.f17191r, c0Var);
        e(this.f17192s, c0Var);
    }

    @Override
    public final void close() {
        h hVar = this.f17193w;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f17193w = null;
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        h hVar = this.f17193w;
        if (hVar == null) {
            return Collections.EMPTY_MAP;
        }
        return hVar.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        h hVar = this.f17193w;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override
    public final long open(m mVar) {
        boolean z10;
        if (this.f17193w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        Uri uri = mVar.f17179a;
        String scheme = uri.getScheme();
        String str = l0.f13778a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f17185a;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.f17188e == null) {
                    b bVar = new b(context);
                    this.f17188e = bVar;
                    a(bVar);
                }
                this.f17193w = this.f17188e;
            } else if ("content".equals(scheme)) {
                if (this.f17189f == null) {
                    e eVar = new e(context);
                    this.f17189f = eVar;
                    a(eVar);
                }
                this.f17193w = this.f17189f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                h hVar = this.f17187c;
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
                    this.f17193w = this.h;
                } else if ("udp".equals(scheme)) {
                    if (this.f17190n == null) {
                        e0 e0Var = new e0();
                        this.f17190n = e0Var;
                        a(e0Var);
                    }
                    this.f17193w = this.f17190n;
                } else if ("data".equals(scheme)) {
                    if (this.f17191r == null) {
                        ?? cVar = new c(false);
                        this.f17191r = cVar;
                        a(cVar);
                    }
                    this.f17193w = this.f17191r;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f17193w = hVar;
                } else {
                    if (this.f17192s == null) {
                        a0 a0Var = new a0(context);
                        this.f17192s = a0Var;
                        a(a0Var);
                    }
                    this.f17193w = this.f17192s;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f17188e == null) {
                    b bVar2 = new b(context);
                    this.f17188e = bVar2;
                    a(bVar2);
                }
                this.f17193w = this.f17188e;
            } else {
                if (this.d == null) {
                    ?? cVar2 = new c(false);
                    this.d = cVar2;
                    a(cVar2);
                }
                this.f17193w = this.d;
            }
        }
        return this.f17193w.open(mVar);
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        h hVar = this.f17193w;
        hVar.getClass();
        return hVar.read(bArr, i7, i10);
    }
}
