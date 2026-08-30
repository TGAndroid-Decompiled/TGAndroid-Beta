package g5;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public final class t implements m {
    public final Context f6439a;
    public final ArrayList f6440b;
    public final m f6441c;
    public a0 d;
    public c e;
    public i f6442f;
    public m h;
    public x0 f6443n;
    public k f6444r;
    public r0 f6445s;
    public m v;

    public t(Context context, m mVar) {
        this.f6439a = context.getApplicationContext();
        mVar.getClass();
        this.f6441c = mVar;
        this.f6440b = new ArrayList();
    }

    public static void b(m mVar, v0 v0Var) {
        if (mVar != null) {
            mVar.addTransferListener(v0Var);
        }
    }

    public final void a(m mVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6440b;
            if (i10 < arrayList.size()) {
                mVar.addTransferListener((v0) arrayList.get(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addTransferListener(v0 v0Var) {
        v0Var.getClass();
        this.f6441c.addTransferListener(v0Var);
        this.f6440b.add(v0Var);
        b(this.d, v0Var);
        b(this.e, v0Var);
        b(this.f6442f, v0Var);
        b(this.h, v0Var);
        b(this.f6443n, v0Var);
        b(this.f6444r, v0Var);
        b(this.f6445s, v0Var);
    }

    @Override
    public final void close() {
        m mVar = this.v;
        if (mVar != null) {
            try {
                mVar.close();
            } finally {
                this.v = null;
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        m mVar = this.v;
        if (mVar == null) {
            return Collections.EMPTY_MAP;
        }
        return mVar.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        m mVar = this.v;
        if (mVar == null) {
            return null;
        }
        return mVar.getUri();
    }

    @Override
    public final long open(p pVar) {
        boolean z4;
        if (this.v == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        Uri uri = pVar.f6401a;
        String scheme = uri.getScheme();
        int i10 = h5.d0.f6937a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f6439a;
        if (!isEmpty && !"file".equals(scheme2)) {
            if ("asset".equals(scheme)) {
                if (this.e == null) {
                    c cVar = new c(context);
                    this.e = cVar;
                    a(cVar);
                }
                this.v = this.e;
            } else if ("content".equals(scheme)) {
                if (this.f6442f == null) {
                    i iVar = new i(context);
                    this.f6442f = iVar;
                    a(iVar);
                }
                this.v = this.f6442f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                m mVar = this.f6441c;
                if (equals) {
                    if (this.h == null) {
                        try {
                            m mVar2 = (m) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.h = mVar2;
                            a(mVar2);
                        } catch (ClassNotFoundException unused) {
                            h5.a.K("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating RTMP extension", e);
                        }
                        if (this.h == null) {
                            this.h = mVar;
                        }
                    }
                    this.v = this.h;
                } else if ("udp".equals(scheme)) {
                    if (this.f6443n == null) {
                        x0 x0Var = new x0();
                        this.f6443n = x0Var;
                        a(x0Var);
                    }
                    this.v = this.f6443n;
                } else if ("data".equals(scheme)) {
                    if (this.f6444r == null) {
                        ?? gVar = new g(false);
                        this.f6444r = gVar;
                        a(gVar);
                    }
                    this.v = this.f6444r;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.v = mVar;
                } else {
                    if (this.f6445s == null) {
                        r0 r0Var = new r0(context);
                        this.f6445s = r0Var;
                        a(r0Var);
                    }
                    this.v = this.f6445s;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.e == null) {
                    c cVar2 = new c(context);
                    this.e = cVar2;
                    a(cVar2);
                }
                this.v = this.e;
            } else {
                if (this.d == null) {
                    ?? gVar2 = new g(false);
                    this.d = gVar2;
                    a(gVar2);
                }
                this.v = this.d;
            }
        }
        return this.v.open(pVar);
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        m mVar = this.v;
        mVar.getClass();
        return mVar.read(bArr, i10, i11);
    }
}
