package g5;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public final class t implements m {
    public final Context f6928a;
    public final ArrayList f6929b;
    public final m f6930c;
    public a0 d;
    public c f6931e;
    public i f6932f;
    public m h;
    public x0 f6933n;
    public k f6934r;
    public r0 f6935s;
    public m v;

    public t(Context context, m mVar) {
        this.f6928a = context.getApplicationContext();
        mVar.getClass();
        this.f6930c = mVar;
        this.f6929b = new ArrayList();
    }

    public static void d(m mVar, v0 v0Var) {
        if (mVar != null) {
            mVar.addTransferListener(v0Var);
        }
    }

    public final void a(m mVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6929b;
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
        this.f6930c.addTransferListener(v0Var);
        this.f6929b.add(v0Var);
        d(this.d, v0Var);
        d(this.f6931e, v0Var);
        d(this.f6932f, v0Var);
        d(this.h, v0Var);
        d(this.f6933n, v0Var);
        d(this.f6934r, v0Var);
        d(this.f6935s, v0Var);
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
        Uri uri = pVar.f6885a;
        String scheme = uri.getScheme();
        int i10 = h5.d0.f7237a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f6928a;
        if (!isEmpty && !"file".equals(scheme2)) {
            if ("asset".equals(scheme)) {
                if (this.f6931e == null) {
                    c cVar = new c(context);
                    this.f6931e = cVar;
                    a(cVar);
                }
                this.v = this.f6931e;
            } else if ("content".equals(scheme)) {
                if (this.f6932f == null) {
                    i iVar = new i(context);
                    this.f6932f = iVar;
                    a(iVar);
                }
                this.v = this.f6932f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                m mVar = this.f6930c;
                if (equals) {
                    if (this.h == null) {
                        try {
                            m mVar2 = (m) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.h = mVar2;
                            a(mVar2);
                        } catch (ClassNotFoundException unused) {
                            h5.a.K("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e6) {
                            throw new RuntimeException("Error instantiating RTMP extension", e6);
                        }
                        if (this.h == null) {
                            this.h = mVar;
                        }
                    }
                    this.v = this.h;
                } else if ("udp".equals(scheme)) {
                    if (this.f6933n == null) {
                        x0 x0Var = new x0();
                        this.f6933n = x0Var;
                        a(x0Var);
                    }
                    this.v = this.f6933n;
                } else if ("data".equals(scheme)) {
                    if (this.f6934r == null) {
                        ?? gVar = new g(false);
                        this.f6934r = gVar;
                        a(gVar);
                    }
                    this.v = this.f6934r;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.v = mVar;
                } else {
                    if (this.f6935s == null) {
                        r0 r0Var = new r0(context);
                        this.f6935s = r0Var;
                        a(r0Var);
                    }
                    this.v = this.f6935s;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f6931e == null) {
                    c cVar2 = new c(context);
                    this.f6931e = cVar2;
                    a(cVar2);
                }
                this.v = this.f6931e;
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
