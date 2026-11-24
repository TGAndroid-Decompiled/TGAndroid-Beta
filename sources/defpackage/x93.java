package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public final class x93 implements o63 {
    public final Context a;
    public final ArrayList b;
    public final o63 c;
    public a94 d;
    public kx e;
    public zu2 f;
    public o63 h;
    public l4c n;
    public h63 r;
    public kz8 s;
    public o63 w;

    public x93(Context context, o63 o63Var) {
        this.a = context.getApplicationContext();
        o63Var.getClass();
        this.c = o63Var;
        this.b = new ArrayList();
    }

    public static void e(o63 o63Var, vyb vybVar) {
        if (o63Var != null) {
            o63Var.addTransferListener(vybVar);
        }
    }

    public final void a(o63 o63Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                o63Var.addTransferListener((vyb) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addTransferListener(vyb vybVar) {
        vybVar.getClass();
        this.c.addTransferListener(vybVar);
        this.b.add(vybVar);
        e(this.d, vybVar);
        e(this.e, vybVar);
        e(this.f, vybVar);
        e(this.h, vybVar);
        e(this.n, vybVar);
        e(this.r, vybVar);
        e(this.s, vybVar);
    }

    @Override
    public final void close() {
        o63 o63Var = this.w;
        if (o63Var != null) {
            try {
                o63Var.close();
            } finally {
                this.w = null;
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        o63 o63Var = this.w;
        if (o63Var == null) {
            return Collections.EMPTY_MAP;
        }
        return o63Var.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        o63 o63Var = this.w;
        if (o63Var == null) {
            return null;
        }
        return o63Var.getUri();
    }

    @Override
    public final long open(u63 u63Var) {
        boolean z;
        o63 o63Var;
        if (this.w == null) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        Uri uri = u63Var.a;
        String scheme = uri.getScheme();
        String str = g8c.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.e == null) {
                    kx kxVar = new kx(context);
                    this.e = kxVar;
                    a(kxVar);
                }
                o63Var = this.e;
                this.w = o63Var;
            } else if ("content".equals(scheme)) {
                if (this.f == null) {
                    zu2 zu2Var = new zu2(context);
                    this.f = zu2Var;
                    a(zu2Var);
                }
                o63Var = this.f;
                this.w = o63Var;
            } else {
                boolean equals = "rtmp".equals(scheme);
                o63 o63Var2 = this.c;
                if (equals) {
                    o63Var = this.h;
                    if (o63Var == null) {
                        try {
                            o63 o63Var3 = (o63) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.h = o63Var3;
                            a(o63Var3);
                        } catch (ClassNotFoundException unused) {
                            lad.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            fyb.j("Error instantiating RTMP extension", e);
                            return 0L;
                        }
                        o63 o63Var4 = this.h;
                        if (o63Var4 == null) {
                            this.h = o63Var2;
                        } else {
                            o63Var2 = o63Var4;
                        }
                        o63Var = o63Var2;
                    }
                    this.w = o63Var;
                } else if ("udp".equals(scheme)) {
                    if (this.n == null) {
                        l4c l4cVar = new l4c();
                        this.n = l4cVar;
                        a(l4cVar);
                    }
                    o63Var = this.n;
                    this.w = o63Var;
                } else if ("data".equals(scheme)) {
                    if (this.r == null) {
                        ?? qf0Var = new qf0(false);
                        this.r = qf0Var;
                        a(qf0Var);
                    }
                    o63Var = this.r;
                    this.w = o63Var;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.w = o63Var2;
                    o63Var = o63Var2;
                } else {
                    if (this.s == null) {
                        kz8 kz8Var = new kz8(context);
                        this.s = kz8Var;
                        a(kz8Var);
                    }
                    o63Var = this.s;
                    this.w = o63Var;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.e == null) {
                    kx kxVar2 = new kx(context);
                    this.e = kxVar2;
                    a(kxVar2);
                }
                o63Var = this.e;
                this.w = o63Var;
            } else {
                if (this.d == null) {
                    ?? qf0Var2 = new qf0(false);
                    this.d = qf0Var2;
                    a(qf0Var2);
                }
                o63Var = this.d;
                this.w = o63Var;
            }
        }
        return o63Var.open(u63Var);
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        o63 o63Var = this.w;
        o63Var.getClass();
        return o63Var.read(bArr, i, i2);
    }
}
