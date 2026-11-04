package l5;

import ai.g5;
import ai.o1;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import c0.i;
import c0.j;
import ci.u8;
import d2.a1;
import d2.y0;
import e5.u;
import ei.u5;
import g2.k;
import g9.i0;
import gi.x0;
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
import l9.w;
import lg.c1;
import lg.n;
import lg.r1;
import lg.t1;
import lg.u1;
import lg.x1;
import m2.s;
import m2.t;
import mi.b3;
import mi.b6;
import mi.c2;
import mi.c3;
import mi.d6;
import mi.f5;
import mi.h1;
import mi.h4;
import mi.n0;
import mi.n5;
import mi.o5;
import mi.s0;
import mi.t3;
import mi.y;
import o4.d0;
import o4.d1;
import o4.e0;
import o4.f1;
import o4.l1;
import o4.v;
import oa.e;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.pr;
import org.telegram.messenger.qr;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.vs;
import org.telegram.ui.m91;
import org.telegram.ui.nw;
import org.telegram.ui.uw;
import r0.k1;
import r0.m;
public final class b implements s10, p1, vs, n0, nw, o5, j, d0, f1, k, d1, f9.k, Vector.TLDeserializer, m, org.telegram.ui.ActionBar.d1 {
    public final int f18040a;
    public final Object f18041b;

    public b(Object obj, int i3) {
        this.f18040a = i3;
        this.f18041b = obj;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(uw uwVar) {
        return false;
    }

    @Override
    public k1 R0(View view, k1 k1Var) {
        ActionBarLayout actionBarLayout = (ActionBarLayout) this.f18041b;
        Drawable drawable = ActionBarLayout.f27273w1;
        i0.b I0 = g0.I0(k1Var, false);
        i0.b I02 = g0.I0(k1Var, true);
        actionBarLayout.f27322u1 = I0;
        actionBarLayout.f27324v1 = I02;
        actionBarLayout.f27320t1 = k1Var;
        int childCount = actionBarLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            actionBarLayout.o(actionBarLayout.getChildAt(i3), k1Var);
        }
        return k1.f54025b;
    }

    @Override
    public Object a(i iVar) {
        e0 e0Var = (e0) this.f18041b;
        e0Var.f20631o.post(new s(14, e0Var, iVar));
        return "onPlayRequested";
    }

    @Override
    public void accept(Object obj) {
        ((l1) obj).c((y0) this.f18041b);
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f18040a) {
            case 21:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                k9.a aVar = (k9.a) ((t) this.f18041b).f19007c;
                if (aVar.a(Math.max(height, width))) {
                    if (aVar.a(height)) {
                        height--;
                    }
                    if (aVar.a(width)) {
                        width--;
                    }
                    return cg.n0.e(Bitmap.createScaledBitmap(bitmap, width, height, true));
                }
                return bitmap;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i3 = ((u) this.f18041b).f9633b;
                if (width2 > i3 || bitmap2.getHeight() > i3) {
                    float f10 = i3;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f10 / width3, f10 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return cg.n0.e(bitmap2);
        }
    }

    @Override
    public void b(l1 l1Var, v vVar) {
        ((k) this.f18041b).accept(l1Var);
    }

    public c c(k4.j jVar) {
        InputStream inputStream;
        d dVar = (d) this.f18041b;
        URL url = (URL) jVar.f16869a;
        String c2 = x7.m.c("CctTransportBackend");
        if (Log.isLoggable(c2, 4)) {
            Log.i(c2, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.f18050g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) jVar.f16871c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                hi.d dVar2 = dVar.f18045a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                oa.d dVar3 = (oa.d) dVar2.f14429b;
                e eVar = new e(bufferedWriter, dVar3.f20947a, dVar3.f20948b, dVar3.f20949c, dVar3.d);
                eVar.h((m5.m) jVar.f16870b);
                eVar.j();
                eVar.f20951b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c10 = x7.m.c("CctTransportBackend");
                if (Log.isLoggable(c10, 4)) {
                    Log.i(c10, String.format("Status Code: %d", valueOf));
                }
                x7.m.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                x7.m.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new c(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        c cVar = new c(responseCode, null, m5.u.a(new BufferedReader(new InputStreamReader(inputStream))).f19168a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return cVar;
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
                return new c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
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
            x7.m.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            x7.m.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            x7.m.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c(400, null, 0L);
        } catch (ma.b e13) {
            e = e13;
            x7.m.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c(400, null, 0L);
        }
    }

    @Override
    public void d(o4.u uVar, int i3) {
        uVar.a(i3, (a1) this.f18041b);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i3, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f18040a) {
            case 24:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f18041b).lambda$readParams$0(inputSerializedData, i3, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f18041b).lambda$readParams$0(inputSerializedData, i3, z10);
                return lambda$readParams$02;
        }
    }

    public void e(int i3) {
        y yVar = (y) this.f18041b;
        yVar.f20031c = i3;
        yVar.e(i3);
    }

    @Override
    public void g(s1 s1Var, int i3) {
        switch (this.f18040a) {
            case 3:
                r1 r1Var = (r1) ((g5) this.f18041b).f663b;
                u1 f10 = u1.f(r1.g0(r1Var));
                ArrayList arrayList = r1Var.f18451b;
                int i10 = f10.f18484a;
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (f10.c(((Integer) arrayList.get(i11)).intValue()) == null) {
                        arrayList.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        t1 c2 = f10.c(((Integer) arrayList.get(i12)).intValue());
                        f10.f18485b.remove(c2);
                        f10.a(c2.f18474b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c2.f18473a;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_deleteQuickReplyShortcut, new u5(6));
                        if ("hello".equals(c2.f18474b)) {
                            ConnectionsManager.getInstance(i10).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull b22 = hp.s1(i10).b2(h10.i(i10).e());
                            if (b22 != null) {
                                b22.flags2 &= -5;
                                b22.business_greeting_message = null;
                                qr.a0(i10).j2(b22, true);
                            }
                        } else if ("away".equals(c2.f18474b)) {
                            ConnectionsManager.getInstance(i10).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull b23 = hp.s1(i10).b2(h10.i(i10).e());
                            if (b23 != null) {
                                b23.flags2 &= -9;
                                b23.business_away_message = null;
                                qr.a0(i10).j2(b23, true);
                            }
                        }
                    }
                    f10.l();
                    qr a02 = qr.a0(i10);
                    a02.f24934a.c(new x0(a02, arrayList, 2));
                    hs.f(i10).k(121, new Object[0]);
                }
                r1.c0(r1Var);
                return;
            case 10:
                ((u8) this.f18041b).run();
                return;
            default:
                s1 s1Var2 = (s1) this.f18041b;
                DialogInterface.OnCancelListener onCancelListener = s1Var2.K;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(s1Var2);
                }
                s1Var2.dismiss();
                return;
        }
    }

    @Override
    public f60 h(h1 h1Var) {
        return f60.H((c2) ((hi.d) this.f18041b).f14429b, h1Var);
    }

    @Override
    public Object i(e0 e0Var, v vVar, int i3) {
        int i10 = this.f18040a;
        Object obj = this.f18041b;
        switch (i10) {
            case 17:
                return e0Var.l(vVar, (i0) obj);
            default:
                d1 d1Var = (d1) obj;
                w wVar = w.f18167b;
                if (!e0Var.j()) {
                    d1Var.b(e0Var.f20636t, vVar);
                    o4.h1.R0(e0Var, vVar, i3, new o4.r1(0));
                }
                return w.f18167b;
        }
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i3;
        c1 c1Var;
        c1 c1Var2;
        int i10;
        int i11 = this.f18040a;
        Object obj3 = this.f18041b;
        switch (i11) {
            case 1:
                lg.d1 d1Var = (lg.d1) obj3;
                r31 r31Var = (r31) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                float floatValue = ((Float) serializable).floatValue();
                Float f10 = (Float) serializable2;
                int i12 = r31Var.d;
                if (i12 == -1) {
                    boolean z10 = !d1Var.d;
                    d1Var.d = z10;
                    ((q8) view).setChecked(z10);
                    d1Var.f18265a.f35594g3.O(true);
                    d1Var.d0(true);
                    return;
                } else if (i12 == -2) {
                    ?? d2Var = new d2(null);
                    d2Var.f18513n = d1Var.f18270n;
                    d2Var.f18510c = new o1(29, d1Var, view);
                    d1Var.presentFragment((d2) d2Var);
                    return;
                } else if (r31Var.f54715a == 5 && i12 >= 0 && i12 < d1Var.f18269f.length) {
                    if (!bd.f21784a0 ? floatValue >= view.getMeasuredWidth() - g0.L(76.0f) : floatValue <= g0.L(76.0f)) {
                        if (d1Var.f18269f[r31Var.d].isEmpty()) {
                            ((h5) view).setChecked(true);
                            d1Var.f18269f[r31Var.d].add(new c1(0, 1439));
                            d1Var.c0(r31Var.d);
                        } else {
                            d1Var.f18269f[r31Var.d].clear();
                            ((h5) view).setChecked(false);
                        }
                        ((h5) view).setValue(lg.d1.f0(d1Var.f18269f[r31Var.d]));
                        d1Var.d0(true);
                        return;
                    }
                    int i13 = (r31Var.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < d1Var.f18269f[i13].size(); i15++) {
                        if (((c1) d1Var.f18269f[i13].get(i15)).f18262b > i14) {
                            i14 = ((c1) d1Var.f18269f[i13].get(i15)).f18262b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (r31Var.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < d1Var.f18269f[i16].size(); i18++) {
                        if (((c1) d1Var.f18269f[i16].get(i18)).f18261a < i17) {
                            i17 = ((c1) d1Var.f18269f[i16].get(i18)).f18261a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = r31Var.f37627l;
                    ArrayList arrayList = d1Var.f18269f[r31Var.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = d1Var.f18269f[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    lg.f1 f1Var = new lg.f1(charSequence, arrayList, max, i19, 28 - i20);
                    f1Var.f18302f = new n(d1Var, 4);
                    f1Var.h = new ii.e(25, d1Var, r31Var);
                    d1Var.presentFragment(f1Var);
                    return;
                } else {
                    return;
                }
            case 2:
                final lg.f1 f1Var2 = (lg.f1) obj3;
                r31 r31Var2 = (r31) obj;
                final View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f11 = (Float) serializable;
                Float f12 = (Float) serializable2;
                int i22 = f1Var2.f18300c;
                int i23 = f1Var2.d;
                ArrayList arrayList3 = f1Var2.f18299b;
                int i24 = r31Var2.d;
                if (i24 == -1) {
                    f1Var2.f18304r = !f1Var2.f18304r;
                    arrayList3.clear();
                    if (f1Var2.f18304r) {
                        arrayList3.add(new c1(0, 1439));
                    }
                    q8 q8Var = (q8) view2;
                    boolean z11 = f1Var2.f18304r;
                    r31Var2.f37621e = z11;
                    q8Var.setChecked(z11);
                    boolean z12 = f1Var2.f18304r;
                    if (z12) {
                        i10 = k6.f27917f6;
                    } else {
                        i10 = k6.f27898e6;
                    }
                    q8Var.b(k6.x0(null, i10, false), z12);
                    f1Var2.f18303n.f35594g3.O(true);
                    n nVar = f1Var2.f18302f;
                    if (nVar != null) {
                        nVar.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !f1Var2.Z()) {
                        int i25 = ((c1) k2.p1.h(1, arrayList3)).f18262b;
                        int j10 = Utilities.j(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new c1(j10, Utilities.j((i25 + 1560) / 2, i23, j10 + 1)));
                    } else {
                        if (f1Var2.Z()) {
                            arrayList3.clear();
                        }
                        int j11 = Utilities.j(480, i23 - 1, i22);
                        arrayList3.add(new c1(j11, Utilities.j(1200, i23, j11 + 1)));
                    }
                    n nVar2 = f1Var2.f18302f;
                    if (nVar2 != null) {
                        nVar2.run();
                    }
                    f1Var2.f18303n.f35594g3.O(true);
                    return;
                } else if (r31Var2.f54715a == 3 && (i3 = i24 / 3) >= 0 && i3 < arrayList3.size()) {
                    int i26 = i3 - 1;
                    if (i26 >= 0) {
                        c1Var = (c1) arrayList3.get(i26);
                    } else {
                        c1Var = null;
                    }
                    final c1 c1Var3 = (c1) arrayList3.get(i3);
                    int i27 = i3 + 1;
                    if (i27 < arrayList3.size()) {
                        c1Var2 = (c1) arrayList3.get(i27);
                    } else {
                        c1Var2 = null;
                    }
                    int i28 = r31Var2.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = f1Var2.getParentActivity();
                        String M0 = bd.M0(2131752750, null);
                        int i29 = c1Var3.f18261a;
                        if (c1Var != null) {
                            i22 = c1Var.f18262b + 1;
                        }
                        t4.W(parentActivity, M0, i29, i22, c1Var3.f18262b - 1, new u10() {
                            @Override
                            public final void a(Object obj4) {
                                Integer num3 = (Integer) obj4;
                                switch (r4) {
                                    case 0:
                                        f1 f1Var3 = f1Var2;
                                        boolean a02 = f1Var3.a0();
                                        int intValue = num3.intValue();
                                        c1Var3.f18261a = intValue;
                                        ((l8) view2).w(c1.a(intValue), true);
                                        if (a02 != f1Var3.a0()) {
                                            f1Var3.f18303n.f35594g3.O(true);
                                        }
                                        n nVar3 = f1Var3.f18302f;
                                        if (nVar3 != null) {
                                            nVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        f1 f1Var4 = f1Var2;
                                        boolean a03 = f1Var4.a0();
                                        int intValue2 = num3.intValue();
                                        c1Var3.f18262b = intValue2;
                                        ((l8) view2).w(c1.a(intValue2), true);
                                        if (a03 != f1Var4.a0()) {
                                            f1Var4.f18303n.f35594g3.O(true);
                                        }
                                        n nVar4 = f1Var4.f18302f;
                                        if (nVar4 != null) {
                                            nVar4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = f1Var2.getParentActivity();
                        String M02 = bd.M0(2131752756, null);
                        int i30 = c1Var3.f18262b;
                        int i31 = c1Var3.f18261a + 1;
                        if (c1Var2 != null) {
                            i23 = c1Var2.f18261a - 1;
                        }
                        t4.W(parentActivity2, M02, i30, i31, i23, new u10() {
                            @Override
                            public final void a(Object obj4) {
                                Integer num3 = (Integer) obj4;
                                switch (r4) {
                                    case 0:
                                        f1 f1Var3 = f1Var2;
                                        boolean a02 = f1Var3.a0();
                                        int intValue = num3.intValue();
                                        c1Var3.f18261a = intValue;
                                        ((l8) view2).w(c1.a(intValue), true);
                                        if (a02 != f1Var3.a0()) {
                                            f1Var3.f18303n.f35594g3.O(true);
                                        }
                                        n nVar3 = f1Var3.f18302f;
                                        if (nVar3 != null) {
                                            nVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        f1 f1Var4 = f1Var2;
                                        boolean a03 = f1Var4.a0();
                                        int intValue2 = num3.intValue();
                                        c1Var3.f18262b = intValue2;
                                        ((l8) view2).w(c1.a(intValue2), true);
                                        if (a03 != f1Var4.a0()) {
                                            f1Var4.f18303n.f35594g3.O(true);
                                        }
                                        n nVar4 = f1Var4.f18302f;
                                        if (nVar4 != null) {
                                            nVar4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 2) {
                        arrayList3.remove(i3);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new c1(0, 1439));
                        }
                        f1Var2.f18303n.f35594g3.O(true);
                        n nVar3 = f1Var2.f18302f;
                        if (nVar3 != null) {
                            nVar3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 3:
            default:
                r31 r31Var3 = (r31) obj;
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f13 = (Float) serializable;
                Float f14 = (Float) serializable2;
                if (((t3[]) obj3)[0] != null && (view3 instanceof b6)) {
                    ((b6) view3).B();
                    return;
                }
                return;
            case 4:
                Integer num4 = (Integer) number;
                Float f15 = (Float) serializable;
                Float f16 = (Float) serializable2;
                x1.Z((x1) obj3, (r31) obj, (View) obj2);
                return;
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        q0 q0Var = (q0) this.f18041b;
        q0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var = q0Var.d) != null && f1Var.isShowing()) {
            q0Var.d.d(true);
        }
    }

    @Override
    public void m() {
        switch (this.f18040a) {
            case 7:
                s0 s0Var = (s0) this.f18041b;
                h1 h1Var = s0Var.d;
                mi.a aVar = s0Var.f19875f;
                if (aVar != null) {
                    aVar.f19446s = true;
                    aVar.f19445r = h1Var.f19656l2;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f19431b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = d6.f(h1Var.getText());
                    }
                }
                c3 c3Var = s0Var.h;
                if (c3Var != null && s0Var.f19875f != null) {
                    t3.S1(c3Var.f19543a);
                    return;
                }
                return;
            case 12:
                ((f5) this.f18041b).g();
                return;
            default:
                n5 n5Var = (n5) this.f18041b;
                mi.a aVar2 = n5Var.f20029a;
                if (aVar2 != null) {
                    aVar2.f19446s = true;
                    aVar2.f19445r = n5Var.f19769r.f19656l2;
                }
                n5Var.w();
                b3 b3Var = n5Var.F;
                if (b3Var != null && n5Var.f20029a != null) {
                    t3.S1(b3Var.f19478a);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        h4 h4Var = (h4) this.f18041b;
        if (arrayList.isEmpty() || ((pr) arrayList.get(0)).f24797a <= 0) {
            return false;
        }
        h4Var.run(((pr) arrayList.get(0)).f24797a);
        uwVar.finishFragment();
        return true;
    }
}
