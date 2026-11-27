package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public final class qa3 implements h73 {
    public final Context a;
    public final ArrayList b;
    public final h73 c;
    public wa4 d;
    public lx e;
    public tv2 f;
    public h73 h;
    public k8c n;
    public a73 r;
    public x29 s;
    public h73 w;

    public qa3(Context context, h73 h73Var) {
        this.a = context.getApplicationContext();
        h73Var.getClass();
        this.c = h73Var;
        this.b = new ArrayList();
    }

    public static void f(h73 h73Var, v2c v2cVar) {
        if (h73Var != null) {
            h73Var.addTransferListener(v2cVar);
        }
    }

    public final void a(h73 h73Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                h73Var.addTransferListener((v2c) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addTransferListener(v2c v2cVar) {
        v2cVar.getClass();
        this.c.addTransferListener(v2cVar);
        this.b.add(v2cVar);
        f(this.d, v2cVar);
        f(this.e, v2cVar);
        f(this.f, v2cVar);
        f(this.h, v2cVar);
        f(this.n, v2cVar);
        f(this.r, v2cVar);
        f(this.s, v2cVar);
    }

    @Override
    public final void close() {
        h73 h73Var = this.w;
        if (h73Var != null) {
            try {
                h73Var.close();
            } finally {
                this.w = null;
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        h73 h73Var = this.w;
        if (h73Var == null) {
            return Collections.EMPTY_MAP;
        }
        return h73Var.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        h73 h73Var = this.w;
        if (h73Var == null) {
            return null;
        }
        return h73Var.getUri();
    }

    @Override
    public final long open(n73 n73Var) {
        boolean z;
        h73 h73Var;
        if (this.w == null) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        Uri uri = n73Var.a;
        String scheme = uri.getScheme();
        String str = gcc.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.e == null) {
                    lx lxVar = new lx(context);
                    this.e = lxVar;
                    a(lxVar);
                }
                h73Var = this.e;
                this.w = h73Var;
            } else if ("content".equals(scheme)) {
                if (this.f == null) {
                    tv2 tv2Var = new tv2(context);
                    this.f = tv2Var;
                    a(tv2Var);
                }
                h73Var = this.f;
                this.w = h73Var;
            } else {
                boolean equals = "rtmp".equals(scheme);
                h73 h73Var2 = this.c;
                if (equals) {
                    h73Var = this.h;
                    if (h73Var == null) {
                        try {
                            h73 h73Var3 = (h73) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.h = h73Var3;
                            a(h73Var3);
                        } catch (ClassNotFoundException unused) {
                            efd.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            grb.j("Error instantiating RTMP extension", e);
                            return 0L;
                        }
                        h73 h73Var4 = this.h;
                        if (h73Var4 == null) {
                            this.h = h73Var2;
                        } else {
                            h73Var2 = h73Var4;
                        }
                        h73Var = h73Var2;
                    }
                    this.w = h73Var;
                } else if ("udp".equals(scheme)) {
                    if (this.n == null) {
                        k8c k8cVar = new k8c();
                        this.n = k8cVar;
                        a(k8cVar);
                    }
                    h73Var = this.n;
                    this.w = h73Var;
                } else if ("data".equals(scheme)) {
                    if (this.r == null) {
                        ?? sf0Var = new sf0(false);
                        this.r = sf0Var;
                        a(sf0Var);
                    }
                    h73Var = this.r;
                    this.w = h73Var;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.w = h73Var2;
                    h73Var = h73Var2;
                } else {
                    if (this.s == null) {
                        x29 x29Var = new x29(context);
                        this.s = x29Var;
                        a(x29Var);
                    }
                    h73Var = this.s;
                    this.w = h73Var;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.e == null) {
                    lx lxVar2 = new lx(context);
                    this.e = lxVar2;
                    a(lxVar2);
                }
                h73Var = this.e;
                this.w = h73Var;
            } else {
                if (this.d == null) {
                    ?? sf0Var2 = new sf0(false);
                    this.d = sf0Var2;
                    a(sf0Var2);
                }
                h73Var = this.d;
                this.w = h73Var;
            }
        }
        return h73Var.open(n73Var);
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        h73 h73Var = this.w;
        h73Var.getClass();
        return h73Var.read(bArr, i, i2);
    }
}
