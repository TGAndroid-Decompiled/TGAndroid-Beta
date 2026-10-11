package g2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public final class n implements h {
    public final Context f10272a;
    public final ArrayList f10273b;
    public final h f10274c;
    public t d;
    public b f10275e;
    public e f10276f;
    public h h;
    public e0 f10277n;
    public f f10278r;
    public a0 f10279s;
    public h v;

    public n(Context context, h hVar) {
        this.f10272a = context.getApplicationContext();
        hVar.getClass();
        this.f10274c = hVar;
        this.f10273b = new ArrayList();
    }

    public static void d(h hVar, c0 c0Var) {
        if (hVar != null) {
            hVar.addTransferListener(c0Var);
        }
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f10274c.addTransferListener(c0Var);
        this.f10273b.add(c0Var);
        d(this.d, c0Var);
        d(this.f10275e, c0Var);
        d(this.f10276f, c0Var);
        d(this.h, c0Var);
        d(this.f10277n, c0Var);
        d(this.f10278r, c0Var);
        d(this.f10279s, c0Var);
    }

    public final void b(h hVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f10273b;
            if (i10 < arrayList.size()) {
                hVar.addTransferListener((c0) arrayList.get(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void close() {
        h hVar = this.v;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.v = null;
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        h hVar = this.v;
        if (hVar == null) {
            return Collections.EMPTY_MAP;
        }
        return hVar.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        h hVar = this.v;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override
    public final long open(m mVar) {
        boolean z10;
        if (this.v == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        Uri uri = mVar.f10266a;
        String scheme = uri.getScheme();
        String str = e2.d0.f8531a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f10272a;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.f10275e == null) {
                    b bVar = new b(context);
                    this.f10275e = bVar;
                    b(bVar);
                }
                this.v = this.f10275e;
            } else if ("content".equals(scheme)) {
                if (this.f10276f == null) {
                    e eVar = new e(context);
                    this.f10276f = eVar;
                    b(eVar);
                }
                this.v = this.f10276f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                h hVar = this.f10274c;
                if (equals) {
                    if (this.h == null) {
                        try {
                            h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.h = hVar2;
                            b(hVar2);
                        } catch (ClassNotFoundException unused) {
                            e2.a.n("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e7) {
                            throw new RuntimeException("Error instantiating RTMP extension", e7);
                        }
                        if (this.h == null) {
                            this.h = hVar;
                        }
                    }
                    this.v = this.h;
                } else if ("udp".equals(scheme)) {
                    if (this.f10277n == null) {
                        e0 e0Var = new e0();
                        this.f10277n = e0Var;
                        b(e0Var);
                    }
                    this.v = this.f10277n;
                } else if ("data".equals(scheme)) {
                    if (this.f10278r == null) {
                        ?? cVar = new c(false);
                        this.f10278r = cVar;
                        b(cVar);
                    }
                    this.v = this.f10278r;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.v = hVar;
                } else {
                    if (this.f10279s == null) {
                        a0 a0Var = new a0(context);
                        this.f10279s = a0Var;
                        b(a0Var);
                    }
                    this.v = this.f10279s;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f10275e == null) {
                    b bVar2 = new b(context);
                    this.f10275e = bVar2;
                    b(bVar2);
                }
                this.v = this.f10275e;
            } else {
                if (this.d == null) {
                    ?? cVar2 = new c(false);
                    this.d = cVar2;
                    b(cVar2);
                }
                this.v = this.d;
            }
        }
        return this.v.open(mVar);
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        h hVar = this.v;
        hVar.getClass();
        return hVar.read(bArr, i10, i11);
    }
}
