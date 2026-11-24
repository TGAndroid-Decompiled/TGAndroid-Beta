package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public final class jb3 implements a83 {
    public final Context a;
    public final ArrayList b;
    public final a83 c;
    public ab4 d;
    public ly e;
    public jw2 f;
    public a83 h;
    public l6c n;
    public t73 r;
    public l19 s;
    public a83 w;

    public jb3(Context context, a83 a83Var) {
        this.a = context.getApplicationContext();
        a83Var.getClass();
        this.c = a83Var;
        this.b = new ArrayList();
    }

    public static void e(a83 a83Var, w0c w0cVar) {
        if (a83Var != null) {
            a83Var.addTransferListener(w0cVar);
        }
    }

    public final void a(a83 a83Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                a83Var.addTransferListener((w0c) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addTransferListener(w0c w0cVar) {
        w0cVar.getClass();
        this.c.addTransferListener(w0cVar);
        this.b.add(w0cVar);
        e(this.d, w0cVar);
        e(this.e, w0cVar);
        e(this.f, w0cVar);
        e(this.h, w0cVar);
        e(this.n, w0cVar);
        e(this.r, w0cVar);
        e(this.s, w0cVar);
    }

    @Override
    public final void close() {
        a83 a83Var = this.w;
        if (a83Var != null) {
            try {
                a83Var.close();
            } finally {
                this.w = null;
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        a83 a83Var = this.w;
        if (a83Var == null) {
            return Collections.EMPTY_MAP;
        }
        return a83Var.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        a83 a83Var = this.w;
        if (a83Var == null) {
            return null;
        }
        return a83Var.getUri();
    }

    @Override
    public final long open(g83 g83Var) {
        boolean z;
        a83 a83Var;
        if (this.w == null) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        Uri uri = g83Var.a;
        String scheme = uri.getScheme();
        String str = hac.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.e == null) {
                    ly lyVar = new ly(context);
                    this.e = lyVar;
                    a(lyVar);
                }
                a83Var = this.e;
                this.w = a83Var;
            } else if ("content".equals(scheme)) {
                if (this.f == null) {
                    jw2 jw2Var = new jw2(context);
                    this.f = jw2Var;
                    a(jw2Var);
                }
                a83Var = this.f;
                this.w = a83Var;
            } else {
                boolean equals = "rtmp".equals(scheme);
                a83 a83Var2 = this.c;
                if (equals) {
                    a83Var = this.h;
                    if (a83Var == null) {
                        try {
                            a83 a83Var3 = (a83) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.h = a83Var3;
                            a(a83Var3);
                        } catch (ClassNotFoundException unused) {
                            ncd.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            rjb.k("Error instantiating RTMP extension", e);
                            return 0L;
                        }
                        a83 a83Var4 = this.h;
                        if (a83Var4 == null) {
                            this.h = a83Var2;
                        } else {
                            a83Var2 = a83Var4;
                        }
                        a83Var = a83Var2;
                    }
                    this.w = a83Var;
                } else if ("udp".equals(scheme)) {
                    if (this.n == null) {
                        l6c l6cVar = new l6c();
                        this.n = l6cVar;
                        a(l6cVar);
                    }
                    a83Var = this.n;
                    this.w = a83Var;
                } else if ("data".equals(scheme)) {
                    if (this.r == null) {
                        ?? qg0Var = new qg0(false);
                        this.r = qg0Var;
                        a(qg0Var);
                    }
                    a83Var = this.r;
                    this.w = a83Var;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.w = a83Var2;
                    a83Var = a83Var2;
                } else {
                    if (this.s == null) {
                        l19 l19Var = new l19(context);
                        this.s = l19Var;
                        a(l19Var);
                    }
                    a83Var = this.s;
                    this.w = a83Var;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.e == null) {
                    ly lyVar2 = new ly(context);
                    this.e = lyVar2;
                    a(lyVar2);
                }
                a83Var = this.e;
                this.w = a83Var;
            } else {
                if (this.d == null) {
                    ?? qg0Var2 = new qg0(false);
                    this.d = qg0Var2;
                    a(qg0Var2);
                }
                a83Var = this.d;
                this.w = a83Var;
            }
        }
        return a83Var.open(g83Var);
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        a83 a83Var = this.w;
        a83Var.getClass();
        return a83Var.read(bArr, i, i2);
    }
}
