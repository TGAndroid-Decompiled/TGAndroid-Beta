package jg;

import a8.of;
import a8.pf;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import bi.s9;
import di.d6;
import fi.ua;
import hi.u2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import li.b3;
import li.c3;
import li.f6;
import li.g5;
import li.h5;
import li.i4;
import li.p5;
import li.q5;
import li.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.n5;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.u61;
import org.telegram.ui.cf1;
import org.telegram.ui.ey;
import org.telegram.ui.xx;
import org.webrtc.GlGenericDrawer;
public final class e1 implements Utilities.Callback5, org.telegram.ui.ActionBar.b2, hu, li.n0, xx, q5, c0.j, m4.e0, m4.h1, e2.j, m4.f1, e9.k, oe.d, oi.m, Vector.TLDeserializer, GlGenericDrawer.TextureCallback {
    public final int f15688a;
    public final Object f15689b;

    public e1(Object obj, int i10) {
        this.f15688a = i10;
        this.f15689b = obj;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        ((Switch) this.f15689b).invalidate();
    }

    @Override
    public boolean K(ey eyVar) {
        return false;
    }

    @Override
    public l80 a(li.g1 g1Var) {
        return l80.H((li.b2) ((s0) this.f15689b).f15827b, g1Var);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f15688a) {
            case 18:
                ((m4.n1) obj).f((b2.a1) this.f15689b);
                return;
            default:
                ((n2.j) obj).a((pa.d) this.f15689b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f15688a) {
            case 21:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                j9.a aVar = (j9.a) ((m4.w1) this.f15689b).f18293c;
                if (aVar.a(Math.max(height, width))) {
                    if (aVar.a(height)) {
                        height--;
                    }
                    if (aVar.a(width)) {
                        width--;
                    }
                    return ag.t0.e(Bitmap.createScaledBitmap(bitmap, width, height, true));
                }
                return bitmap;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i10 = ((d5.z) this.f15689b).f8026b;
                if (width2 > i10 || bitmap2.getHeight() > i10) {
                    float f7 = i10;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f7 / width3, f7 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return ag.t0.e(bitmap2);
        }
    }

    @Override
    public Object b(c0.i iVar) {
        m4.f0 f0Var = (m4.f0) this.f15689b;
        f0Var.f18051o.post(new k2.e0(12, f0Var, iVar));
        return "onPlayRequested";
    }

    @Override
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        int i11 = this.f15688a;
        Object obj = this.f15689b;
        switch (i11) {
            case 17:
                return f0Var.l(wVar, (f9.i0) obj);
            default:
                m4.f1 f1Var = (m4.f1) obj;
                k9.w wVar2 = k9.w.f16495b;
                if (!f0Var.j()) {
                    f1Var.e(f0Var.f18056t, wVar);
                    m4.j1.P0(f0Var, wVar, i10, new m4.t1(0));
                }
                return k9.w.f16495b;
        }
    }

    @Override
    public void d(m4.v vVar, int i10) {
        vVar.c(i10, (b2.c1) this.f15689b);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f15688a) {
            case 27:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f15689b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f15689b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void e(m4.n1 n1Var, m4.w wVar) {
        ((e2.j) this.f15689b).accept(n1Var);
    }

    public k5.b f(a8.h0 h0Var) {
        InputStream inputStream;
        k5.c cVar = (k5.c) this.f15689b;
        URL url = (URL) h0Var.f511b;
        String c10 = of.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f16394g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) h0Var.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                h5 h5Var = cVar.f16390a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                ma.d dVar = (ma.d) h5Var.f17284a;
                ma.e eVar = new ma.e(bufferedWriter, dVar.f18399a, dVar.f18400b, dVar.f18401c, dVar.d);
                eVar.h((l5.i) h0Var.f512c);
                eVar.j();
                eVar.f18403b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c11 = of.c("CctTransportBackend");
                if (Log.isLoggable(c11, 4)) {
                    Log.i(c11, String.format("Status Code: %d", valueOf));
                }
                of.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                of.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new k5.b(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        k5.b bVar = new k5.b(responseCode, null, l5.m.a(new BufferedReader(new InputStreamReader(inputStream))).f16909a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return bVar;
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
                return new k5.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
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
        } catch (ConnectException e) {
            e = e;
            of.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new k5.b(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            of.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new k5.b(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            of.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new k5.b(400, null, 0L);
        } catch (ka.b e12) {
            e = e12;
            of.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new k5.b(400, null, 0L);
        }
    }

    @Override
    public void g() {
        switch (this.f15688a) {
            case 7:
                li.s0 s0Var = (li.s0) this.f15689b;
                li.g1 g1Var = s0Var.d;
                li.a aVar = s0Var.f17462f;
                if (aVar != null) {
                    aVar.f17067s = true;
                    aVar.f17066r = g1Var.E;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f17053b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = f6.f(g1Var.getText());
                    }
                }
                c3 c3Var = s0Var.h;
                if (c3Var != null && s0Var.f17462f != null) {
                    v3.U1(c3Var.f17171a);
                    return;
                }
                return;
            case 12:
                ((g5) this.f15689b).g();
                return;
            default:
                p5 p5Var = (p5) this.f15689b;
                li.a aVar2 = p5Var.f17652a;
                if (aVar2 != null) {
                    aVar2.f17067s = true;
                    aVar2.f17066r = p5Var.f17411r.E;
                }
                p5Var.t();
                b3 b3Var = p5Var.E;
                if (b3Var != null && p5Var.f17652a != null) {
                    v3.U1(b3Var.f17153a);
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f15688a) {
            case 2:
                z1 z1Var = ((q1) this.f15689b).f15817a;
                c2 f7 = c2.f(z1.c0(z1Var));
                ArrayList arrayList = z1Var.f15914b;
                int i11 = f7.f15658a;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (f7.c(((Integer) arrayList.get(i12)).intValue()) == null) {
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        b2 c10 = f7.c(((Integer) arrayList.get(i13)).intValue());
                        f7.f15659b.remove(c10);
                        f7.a(c10.f15640b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f15639a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new d6(6));
                        if ("hello".equals(c10.f15640b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c10.f15640b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull userFull2 = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull2 != null) {
                                userFull2.flags2 &= -9;
                                userFull2.business_away_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull2, true);
                            }
                        }
                    }
                    f7.l();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
                    messagesStorage.getStorageQueue().postRunnable(new fi.w0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                z1.Y(z1Var);
                return;
            default:
                ((s9) this.f15689b).run();
                return;
        }
    }

    public void i(int i10) {
        li.z zVar = (li.z) this.f15689b;
        zVar.f17654c = i10;
        zVar.e(i10);
    }

    @Override
    public void k(int i10) {
        boolean z10;
        int i11;
        oi.a aVar = (oi.a) this.f15689b;
        oi.q qVar = aVar.f19418a;
        ch.f fVar = aVar.d;
        oi.d dVar = aVar.e;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (pf.a(i10, 4) || pf.a(i10, 2)) {
                qi.a e = qVar.e();
                ViewGroup viewGroup = aVar.h;
                if (viewGroup != null) {
                    e.b(viewGroup.getY(), aVar.f19422g.getWidth(), aVar.h.getY() + aVar.h.getHeight());
                }
                if (dVar != null) {
                    ArrayList arrayList = dVar.f19444a;
                    dVar.f19445b = e.f47103b;
                    while (dVar.f19445b > arrayList.size()) {
                        arrayList.add(new oi.b(arrayList.size()));
                    }
                    for (int i12 = 0; i12 < dVar.f19445b; i12++) {
                        oi.b bVar = (oi.b) arrayList.get(i12);
                        bVar.f19424a.set(e.c(i12));
                        bVar.b(dVar.f19450j, dVar.f19451k, dVar.f19452l);
                        int i13 = dVar.f19453m;
                        int i14 = dVar.f19454n;
                        int i15 = dVar.f19455o;
                        int i16 = dVar.f19456p;
                        bVar.f19438r = i13;
                        bVar.f19439s = i14;
                        bVar.f19440t = i15;
                        bVar.f19441u = i16;
                    }
                }
                fVar.h(e);
            }
            if (dVar != null) {
                dVar.f19446c = aVar.f19423i;
                dVar.d = aVar.f19422g;
                int i17 = 1;
                if (qVar.h > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = !z10;
                if (dVar.f19449i != z11) {
                    dVar.f19449i = z11;
                    if (!z10) {
                        i11 = 5;
                    } else {
                        i11 = 1;
                    }
                    dVar.f19450j = i11;
                    if (!z10) {
                        i17 = 10;
                    }
                    dVar.f19451k = i17;
                    dVar.f19452l = Math.max(i11, i17);
                    for (int i18 = 0; i18 < dVar.f19445b; i18++) {
                        ((oi.b) dVar.f19444a.get(i18)).b(dVar.f19450j, dVar.f19451k, dVar.f19452l);
                    }
                    dVar.f();
                }
                int i19 = qVar.f19486i;
                int i20 = qVar.f19487j;
                dVar.f19457q = i19;
                dVar.f19458r = i20;
                dVar.f();
                dVar.e();
            }
            fVar.e(aVar.f19423i, aVar.f19422g.getWidth(), aVar.f19422g.getHeight());
        }
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        switch (this.f15688a) {
            case 0:
                h1 h1Var = (h1) this.f15689b;
                u61 u61Var = (u61) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i11 = u61Var.d;
                if (i11 == -1) {
                    boolean z10 = !h1Var.d;
                    h1Var.d = z10;
                    ((a9) view).setChecked(z10);
                    h1Var.f15720a.f32504g3.O(true);
                    h1Var.Z(true);
                    return;
                } else if (i11 == -2) {
                    ?? r2Var = new r2(null);
                    r2Var.f15707n = h1Var.f15724n;
                    r2Var.f15705c = new ai.n1(26, h1Var, view);
                    h1Var.presentFragment((r2) r2Var);
                    return;
                } else if (u61Var.f47075a != 5 || i11 < 0 || i11 >= h1Var.f15723f.length) {
                    return;
                } else {
                    if (!LocaleController.isRTL ? floatValue >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue <= AndroidUtilities.dp(76.0f)) {
                        if (h1Var.f15723f[u61Var.d].isEmpty()) {
                            ((n5) view).setChecked(true);
                            h1Var.f15723f[u61Var.d].add(new g1(0, 1439));
                            h1Var.Y(u61Var.d);
                        } else {
                            h1Var.f15723f[u61Var.d].clear();
                            ((n5) view).setChecked(false);
                        }
                        ((n5) view).setValue(h1.b0(h1Var.f15723f[u61Var.d]));
                        h1Var.Z(true);
                        return;
                    }
                    int i12 = (u61Var.d + 6) % 7;
                    int i13 = 0;
                    for (int i14 = 0; i14 < h1Var.f15723f[i12].size(); i14++) {
                        if (((g1) h1Var.f15723f[i12].get(i14)).f15713b > i13) {
                            i13 = ((g1) h1Var.f15723f[i12].get(i14)).f15713b;
                        }
                    }
                    int max = Math.max(0, i13 - 1439);
                    int i15 = (u61Var.d + 1) % 7;
                    int i16 = 1440;
                    for (int i17 = 0; i17 < h1Var.f15723f[i15].size(); i17++) {
                        if (((g1) h1Var.f15723f[i15].get(i17)).f15712a < i16) {
                            i16 = ((g1) h1Var.f15723f[i15].get(i17)).f15712a;
                        }
                    }
                    int i18 = i16 + 1439;
                    CharSequence charSequence = u61Var.f33249l;
                    ArrayList arrayList = h1Var.f15723f[u61Var.d];
                    int i19 = 0;
                    for (int i20 = 0; i20 < 7; i20++) {
                        ArrayList arrayList2 = h1Var.f15723f[i20];
                        if (arrayList2 != null) {
                            i19 = Math.max(1, arrayList2.size()) + i19;
                        }
                    }
                    j1 j1Var = new j1(charSequence, arrayList, max, i18, 28 - i19);
                    j1Var.f15741f = new ua(h1Var, 27);
                    j1Var.h = new u2(23, h1Var, u61Var);
                    h1Var.presentFragment(j1Var);
                    return;
                }
            case 1:
                final j1 j1Var2 = (j1) this.f15689b;
                u61 u61Var2 = (u61) obj;
                final View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i21 = j1Var2.f15740c;
                int i22 = j1Var2.d;
                ArrayList arrayList3 = j1Var2.f15739b;
                int i23 = u61Var2.d;
                if (i23 == -1) {
                    j1Var2.f15743r = !j1Var2.f15743r;
                    arrayList3.clear();
                    if (j1Var2.f15743r) {
                        arrayList3.add(new g1(0, 1439));
                    }
                    a9 a9Var = (a9) view2;
                    boolean z11 = j1Var2.f15743r;
                    u61Var2.e = z11;
                    a9Var.setChecked(z11);
                    boolean z12 = j1Var2.f15743r;
                    a9Var.b(y6.x0(null, z12 ? y6.f23394f6 : y6.f23376e6, false), z12);
                    j1Var2.f15742n.f32504g3.O(true);
                    ua uaVar = j1Var2.f15741f;
                    if (uaVar != null) {
                        uaVar.run();
                        return;
                    }
                    return;
                } else if (i23 == -2) {
                    if (!arrayList3.isEmpty() && !j1Var2.V()) {
                        int i24 = ((g1) ic.a.g(1, arrayList3)).f15713b;
                        int clamp = Utilities.clamp(i24 + 30, i22 - 1, i21);
                        arrayList3.add(new g1(clamp, Utilities.clamp((i24 + 1560) / 2, i22, clamp + 1)));
                    } else {
                        if (j1Var2.V()) {
                            arrayList3.clear();
                        }
                        int clamp2 = Utilities.clamp(480, i22 - 1, i21);
                        arrayList3.add(new g1(clamp2, Utilities.clamp(1200, i22, clamp2 + 1)));
                    }
                    ua uaVar2 = j1Var2.f15741f;
                    if (uaVar2 != null) {
                        uaVar2.run();
                    }
                    j1Var2.f15742n.f32504g3.O(true);
                    return;
                } else if (u61Var2.f47075a != 3 || (i10 = i23 / 3) < 0 || i10 >= arrayList3.size()) {
                    return;
                } else {
                    int i25 = i10 - 1;
                    g1 g1Var = i25 >= 0 ? (g1) arrayList3.get(i25) : null;
                    final g1 g1Var2 = (g1) arrayList3.get(i10);
                    int i26 = i10 + 1;
                    g1 g1Var3 = i26 < arrayList3.size() ? (g1) arrayList3.get(i26) : null;
                    int i27 = u61Var2.d % 3;
                    if (i27 == 0) {
                        Activity parentActivity = j1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i28 = g1Var2.f15712a;
                        if (g1Var != null) {
                            i21 = g1Var.f15713b + 1;
                        }
                        org.telegram.ui.Components.g5.W(parentActivity, string, i28, i21, g1Var2.f15713b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        j1 j1Var3 = j1Var2;
                                        boolean W = j1Var3.W();
                                        int intValue = num.intValue();
                                        g1Var2.f15712a = intValue;
                                        ((v8) view2).w(g1.a(intValue), true);
                                        if (W != j1Var3.W()) {
                                            j1Var3.f15742n.f32504g3.O(true);
                                        }
                                        ua uaVar3 = j1Var3.f15741f;
                                        if (uaVar3 != null) {
                                            uaVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        j1 j1Var4 = j1Var2;
                                        boolean W2 = j1Var4.W();
                                        int intValue2 = num.intValue();
                                        g1Var2.f15713b = intValue2;
                                        ((v8) view2).w(g1.a(intValue2), true);
                                        if (W2 != j1Var4.W()) {
                                            j1Var4.f15742n.f32504g3.O(true);
                                        }
                                        ua uaVar4 = j1Var4.f15741f;
                                        if (uaVar4 != null) {
                                            uaVar4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i27 == 1) {
                        Activity parentActivity2 = j1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i29 = g1Var2.f15713b;
                        int i30 = g1Var2.f15712a + 1;
                        if (g1Var3 != null) {
                            i22 = g1Var3.f15712a - 1;
                        }
                        org.telegram.ui.Components.g5.W(parentActivity2, string2, i29, i30, i22, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        j1 j1Var3 = j1Var2;
                                        boolean W = j1Var3.W();
                                        int intValue = num.intValue();
                                        g1Var2.f15712a = intValue;
                                        ((v8) view2).w(g1.a(intValue), true);
                                        if (W != j1Var3.W()) {
                                            j1Var3.f15742n.f32504g3.O(true);
                                        }
                                        ua uaVar3 = j1Var3.f15741f;
                                        if (uaVar3 != null) {
                                            uaVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        j1 j1Var4 = j1Var2;
                                        boolean W2 = j1Var4.W();
                                        int intValue2 = num.intValue();
                                        g1Var2.f15713b = intValue2;
                                        ((v8) view2).w(g1.a(intValue2), true);
                                        if (W2 != j1Var4.W()) {
                                            j1Var4.f15742n.f32504g3.O(true);
                                        }
                                        ua uaVar4 = j1Var4.f15741f;
                                        if (uaVar4 != null) {
                                            uaVar4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i27 == 2) {
                        arrayList3.remove(i10);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new g1(0, 1439));
                        }
                        j1Var2.f15742n.f32504g3.O(true);
                        ua uaVar3 = j1Var2.f15741f;
                        if (uaVar3 != null) {
                            uaVar3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            case 2:
            default:
                u61 u61Var3 = (u61) obj;
                View view3 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f7 = (Float) obj4;
                Float f10 = (Float) obj5;
                if (((v3[]) this.f15689b)[0] != null) {
                    num.intValue();
                    f7.floatValue();
                    f10.floatValue();
                    if (view3 instanceof li.d6) {
                        ((li.d6) view3).A();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                f2.V((f2) this.f15689b, (u61) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        i4 i4Var = (i4) this.f15689b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        i4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        eyVar.finishFragment();
        return true;
    }

    @Override
    public void z(float f7, int i10) {
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f15689b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new d71(15, tVar, bitmap));
    }
}
