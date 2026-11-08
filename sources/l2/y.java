package l2;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import c8.cc;
import c8.zc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import li.a3;
import li.a6;
import li.b2;
import li.b3;
import li.c6;
import li.e5;
import li.g4;
import li.m5;
import li.n5;
import li.t3;
import org.telegram.messenger.a20;
import org.telegram.messenger.xr;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xs;
import org.telegram.ui.qw;
import org.telegram.ui.w91;
import org.telegram.ui.ww;
public final class y implements h2.o, xs, li.m0, a20, org.telegram.ui.ActionBar.r1, qw, n5, i2.u, oi.m, Vector.TLDeserializer, r0.m, org.telegram.ui.ActionBar.e1 {
    public final int f18088a;
    public final Object f18089b;

    public y(Object obj, int i7) {
        this.f18088a = i7;
        this.f18089b = obj;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ww wwVar) {
        return false;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = this.f18088a;
        Object obj = this.f18089b;
        switch (i7) {
            case 25:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f27227v1;
                i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
                i0.b I02 = org.telegram.messenger.g0.I0(k1Var, true);
                actionBarLayout.f27274t1 = I0;
                actionBarLayout.f27276u1 = I02;
                actionBarLayout.f27272s1 = k1Var;
                int childCount = actionBarLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i10), k1Var);
                }
                return r0.k1.f54201b;
            default:
                k3 k3Var = (k3) obj;
                k3Var.f27732s = k1Var.f54202a.f(2).d;
                k3Var.invalidate();
                return r0.k1.f54201b;
        }
    }

    @Override
    public k60 a(li.g1 g1Var) {
        return k60.H((b2) ((g6.d0) this.f18089b).f13555b, g1Var);
    }

    @Override
    public void b(long j3, h2.x xVar) {
        switch (this.f18088a) {
            case 17:
                f3.b.c(j3, xVar, ((m4.c0) this.f18089b).f19600c);
                return;
            default:
                f3.b.d(j3, xVar, ((m4.c0) this.f18089b).f19600c);
                return;
        }
    }

    public li.z c(h6.m mVar) {
        InputStream inputStream;
        m5.b bVar = (m5.b) this.f18089b;
        URL url = (URL) mVar.f14264b;
        String c10 = cc.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f19881g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) mVar.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                org.telegram.ui.Components.n nVar = bVar.f19876a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                pa.d dVar = (pa.d) nVar.f36175a;
                pa.e eVar = new pa.e(bufferedWriter, dVar.f53513a, dVar.f53514b, dVar.f53515c, dVar.d);
                eVar.h((n5.m) mVar.f14265c);
                eVar.j();
                eVar.f53517b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c11 = cc.c("CctTransportBackend");
                if (Log.isLoggable(c11, 4)) {
                    Log.i(c11, String.format("Status Code: %d", valueOf));
                }
                cc.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                cc.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new li.z(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        li.z zVar = new li.z(responseCode, null, n5.u.a(new BufferedReader(new InputStreamReader(inputStream))).f20480a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return zVar;
                    } catch (Throwable th2) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                return new li.z(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (ConnectException e10) {
            e = e10;
            cc.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new li.z(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            cc.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new li.z(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            cc.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new li.z(400, null, 0L);
        } catch (na.b e13) {
            e = e13;
            cc.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new li.z(400, null, 0L);
        }
    }

    public void d(int i7) {
        li.y yVar = (li.y) this.f18089b;
        yVar.f18991c = i7;
        yVar.e(i7);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z9) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f18088a) {
            case 23:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f18089b).lambda$readParams$0(inputSerializedData, i7, z9);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f18089b).lambda$readParams$0(inputSerializedData, i7, z9);
                return lambda$readParams$02;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f18088a) {
            case 8:
                ((aa.d0) this.f18089b).run();
                return;
            default:
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.f18089b;
                DialogInterface.OnCancelListener onCancelListener = u1Var2.J;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(u1Var2);
                }
                u1Var2.dismiss();
                return;
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        x31 x31Var = (x31) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((t3[]) this.f18089b)[0] != null && (view instanceof a6)) {
            ((a6) view).B();
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f18088a) {
            case 0:
                ((e2.a1) obj).x((g2.d) this.f18089b);
                return;
            case 1:
                ((e2.a1) obj).p(((c0) this.f18089b).f17774a.Q);
                return;
            case 2:
                ((e2.a1) obj).M((e2.q0) this.f18089b);
                return;
            case 13:
                ((m2.b) obj).G((e2.v0) this.f18089b);
                return;
            case 14:
                ((m2.b) obj).onSeekStarted((m2.a) this.f18089b);
                return;
            case 15:
                ((m2.b) obj).z((d) this.f18089b);
                return;
            default:
                ((m2.b) obj).b((x2.c0) this.f18089b);
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.f18089b;
        r0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = r0Var.d) != null && g1Var.isShowing()) {
            r0Var.d.d(true);
        }
    }

    @Override
    public void l(int i7) {
        boolean z9;
        int i10;
        oi.a aVar = (oi.a) this.f18089b;
        oi.q qVar = aVar.f21019a;
        oi.d dVar = aVar.f21024g;
        if (Build.VERSION.SDK_INT >= 31 && dVar != null) {
            ArrayList arrayList = dVar.f21055a;
            if (aVar.f21028l || oi.q.f().f21122a) {
                if (zc.a(i7, 4) || zc.a(i7, 2)) {
                    qi.a e10 = qVar.e();
                    ViewGroup viewGroup = aVar.f21030n;
                    if (viewGroup != null) {
                        e10.b(viewGroup.getY(), aVar.f21029m.getWidth(), aVar.f21030n.getY() + aVar.f21030n.getHeight());
                    }
                    dVar.f21056b = e10.f54154b;
                    while (dVar.f21056b > arrayList.size()) {
                        arrayList.add(new oi.b(arrayList.size()));
                    }
                    for (int i11 = 0; i11 < dVar.f21056b; i11++) {
                        oi.b bVar = (oi.b) arrayList.get(i11);
                        bVar.f21032a.set(e10.c(i11));
                        bVar.b(dVar.f21065m, dVar.f21066n, dVar.f21067o);
                        bVar.c(dVar.f21063k);
                        int i12 = dVar.f21068p;
                        int i13 = dVar.f21069q;
                        int i14 = dVar.f21070r;
                        int i15 = dVar.f21071s;
                        bVar.f21050u = i12;
                        bVar.v = i13;
                        bVar.f21051w = i14;
                        bVar.f21052x = i15;
                    }
                }
                dVar.f21057c = aVar.f21031o;
                dVar.d = aVar.f21029m;
                int i16 = 1;
                if (qVar.f21106j > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z10 = !z9;
                if (dVar.f21064l != z10) {
                    dVar.f21064l = z10;
                    if (!z9) {
                        i10 = 5;
                    } else {
                        i10 = 1;
                    }
                    dVar.f21065m = i10;
                    if (!z9) {
                        i16 = 10;
                    }
                    dVar.f21066n = i16;
                    dVar.f21067o = Math.max(i10, i16);
                    for (int i17 = 0; i17 < dVar.f21056b; i17++) {
                        ((oi.b) arrayList.get(i17)).b(dVar.f21065m, dVar.f21066n, dVar.f21067o);
                    }
                    dVar.f();
                }
                int i18 = qVar.f21107k;
                int i19 = qVar.f21108l;
                dVar.f21072t = i18;
                dVar.f21073u = i19;
                dVar.f();
                dVar.e();
                Runnable runnable = aVar.f21026j;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    @Override
    public void m() {
        switch (this.f18088a) {
            case 5:
                li.r0 r0Var = (li.r0) this.f18089b;
                li.g1 g1Var = r0Var.d;
                li.a aVar = r0Var.f18806f;
                if (aVar != null) {
                    aVar.f18407s = true;
                    aVar.f18406r = g1Var.f18593k2;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f18392b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = c6.f(g1Var.getText());
                    }
                }
                b3 b3Var = r0Var.h;
                if (b3Var != null && r0Var.f18806f != null) {
                    t3.S1(b3Var.f18477a);
                    return;
                }
                return;
            case 10:
                ((e5) this.f18089b).g();
                return;
            default:
                m5 m5Var = (m5) this.f18089b;
                li.a aVar2 = m5Var.f18989a;
                if (aVar2 != null) {
                    aVar2.f18407s = true;
                    aVar2.f18406r = m5Var.f18709r.f18593k2;
                }
                m5Var.w();
                a3 a3Var = m5Var.E;
                if (a3Var != null && m5Var.f18989a != null) {
                    t3.S1(a3Var.f18419a);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, w91 w91Var) {
        g4 g4Var = (g4) this.f18089b;
        if (arrayList.isEmpty() || ((xr) arrayList.get(0)).f26520a <= 0) {
            return false;
        }
        g4Var.run(((xr) arrayList.get(0)).f26520a);
        wwVar.finishFragment();
        return true;
    }

    public y(m2.a aVar, Object obj, int i7) {
        this.f18088a = i7;
        this.f18089b = obj;
    }

    public y(m2.a aVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z9) {
        this.f18088a = 16;
        this.f18089b = c0Var;
    }
}
