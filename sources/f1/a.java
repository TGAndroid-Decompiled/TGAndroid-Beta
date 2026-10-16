package f1;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import androidx.biometric.e;
import b2.e1;
import b2.f;
import b2.u0;
import b2.u1;
import b2.z0;
import bi.g7;
import bi.h4;
import bi.v2;
import c3.g;
import c3.u;
import com.google.android.gms.tasks.OnSuccessListener;
import di.v0;
import e2.m0;
import e2.o;
import e2.x;
import f2.v;
import fi.d5;
import fi.l;
import fi.q3;
import i2.b0;
import ig.b2;
import ig.e2;
import ig.f1;
import ig.g1;
import ig.i1;
import ig.p1;
import ig.y1;
import j4.c0;
import j5.c;
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
import ji.a0;
import ji.d2;
import ji.d3;
import ji.e3;
import ji.h1;
import ji.i6;
import ji.k4;
import ji.l5;
import ji.o0;
import ji.t0;
import ji.u5;
import ji.w4;
import ji.x3;
import k5.i;
import k5.m;
import la.d;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.m61;
import org.telegram.ui.kg1;
import org.telegram.ui.sy;
import org.telegram.ui.yy;
import w7.k6;
public final class a implements OnSuccessListener, z1, Utilities.Callback5, g, o, v, lu, o0, sy {
    public final int f8832a;
    public final Object f8833b;

    public a(j2.a aVar, Object obj, int i10) {
        this.f8832a = i10;
        this.f8833b = obj;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean L(yy yyVar) {
        return false;
    }

    @Override
    public void a(long j10, x xVar) {
        switch (this.f8832a) {
            case 19:
                c3.b.c(j10, xVar, ((c0) this.f8833b).f12594c);
                return;
            default:
                c3.b.d(j10, xVar, ((c0) this.f8833b).f12594c);
                return;
        }
    }

    public j5.b b(e eVar) {
        InputStream inputStream;
        c cVar = (c) this.f8833b;
        URL url = (URL) eVar.f1200b;
        String c10 = k6.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f12851g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) eVar.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                w4 w4Var = cVar.f12847a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                d dVar = (d) w4Var.f13595b;
                la.e eVar2 = new la.e(bufferedWriter, dVar.f14646a, dVar.f14647b, dVar.f14648c, dVar.d);
                eVar2.h((i) eVar.f1201c);
                eVar2.j();
                eVar2.f14650b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c11 = k6.c("CctTransportBackend");
                if (Log.isLoggable(c11, 4)) {
                    Log.i(c11, String.format("Status Code: %d", valueOf));
                }
                k6.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                k6.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new j5.b(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        j5.b bVar = new j5.b(responseCode, null, m.a(new BufferedReader(new InputStreamReader(inputStream))).f14150a);
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
                return new j5.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
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
        } catch (ja.b e) {
            e = e;
            k6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new j5.b(400, null, 0L);
        } catch (ConnectException e7) {
            e = e7;
            k6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new j5.b(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            k6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new j5.b(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            k6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new j5.b(400, null, 0L);
        }
    }

    public void c(int i10) {
        a0 a0Var = (a0) this.f8833b;
        a0Var.f13125c = i10;
        a0Var.f(i10);
    }

    @Override
    public void g(a2 a2Var, int i10) {
        switch (this.f8832a) {
            case 1:
                ((fi.e) this.f8833b).run();
                return;
            case 2:
                l lVar = (l) this.f8833b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.P);
                updatestarrefprogram.commission_permille = 0;
                a2 a2Var2 = new a2(lVar.getParentActivity(), 3, null);
                a2Var2.q(150L);
                lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new fi.b(lVar, a2Var2, 0));
                return;
            case 13:
                y1 y1Var = ((p1) this.f8833b).f11608a;
                b2 f7 = b2.f(y1.b0(y1Var));
                ArrayList arrayList = y1Var.f11708b;
                int i11 = f7.f11451a;
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
                        ig.a2 c10 = f7.c(((Integer) arrayList.get(i13)).intValue());
                        f7.f11452b.remove(c10);
                        f7.a(c10.f11439b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f11438a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new g7(6));
                        if ("hello".equals(c10.f11439b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c10.f11439b)) {
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
                    messagesStorage.getStorageQueue().postRunnable(new v0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                y1.X(y1Var);
                return;
            default:
                ((h4) this.f8833b).run();
                return;
        }
    }

    @Override
    public l80 h(h1 h1Var) {
        return l80.H((d2) ((ya.c) this.f8833b).f48731b, h1Var);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8832a) {
            case 5:
                ((e1) obj).onAudioAttributesChanged((f) this.f8833b);
                return;
            case 6:
                ((e1) obj).onTrackSelectionParametersChanged((u1) this.f8833b);
                return;
            case 7:
                ((e1) obj).onCues((d2.c) this.f8833b);
                return;
            case 8:
                ((e1) obj).onMediaMetadataChanged(((b0) this.f8833b).f10929a.Q);
                return;
            case 9:
                ((e1) obj).onMetadata((u0) this.f8833b);
                return;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                ((j2.b) obj).b((u2.c0) this.f8833b);
                return;
            case 15:
                ((j2.b) obj).h((z0) this.f8833b);
                return;
            case 16:
                ((j2.b) obj).onSeekStarted((j2.a) this.f8833b);
                return;
            case 17:
                ((j2.b) obj).a((i2.e) this.f8833b);
                return;
        }
    }

    @Override
    public long l(long j10) {
        u uVar = (u) this.f8833b;
        return m0.j((j10 * uVar.e) / 1000000, 0L, uVar.f4293j - 1);
    }

    @Override
    public void onSuccess(Object obj) {
        ((e1.b) this.f8833b).invoke(obj);
    }

    @Override
    public void p() {
        switch (this.f8832a) {
            case 23:
                t0 t0Var = (t0) this.f8833b;
                h1 h1Var = t0Var.d;
                ji.a aVar = t0Var.f13524f;
                if (aVar != null) {
                    aVar.f13121s = true;
                    aVar.f13120r = h1Var.E;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f13107b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = ji.k6.f(h1Var.getText());
                    }
                }
                e3 e3Var = t0Var.h;
                if (e3Var != null && t0Var.f13524f != null) {
                    x3.P1(e3Var.f13244a);
                    return;
                }
                return;
            case 28:
                ((l5) this.f8833b).h();
                return;
            default:
                u5 u5Var = (u5) this.f8833b;
                ji.a aVar2 = u5Var.f13123a;
                if (aVar2 != null) {
                    aVar2.f13121s = true;
                    aVar2.f13120r = u5Var.f13564r.E;
                }
                u5Var.u();
                d3 d3Var = u5Var.E;
                if (d3Var != null && u5Var.f13123a != null) {
                    x3.P1(d3Var.f13235a);
                    return;
                }
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        f1 f1Var;
        f1 f1Var2;
        int i11;
        switch (this.f8832a) {
            case 3:
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((d5) this.f8833b).V((m61) obj);
                return;
            case 11:
                g1 g1Var = (g1) this.f8833b;
                m61 m61Var = (m61) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = m61Var.d;
                if (i12 == -1) {
                    boolean z10 = !g1Var.e;
                    g1Var.e = z10;
                    ((w8) view2).setChecked(z10);
                    g1Var.f11516a.W2.N(true);
                    g1Var.Y(true);
                    return;
                } else if (i12 == -2) {
                    ?? m2Var = new m2(null);
                    m2Var.f11497n = g1Var.f11521r;
                    m2Var.f11495c = new v2(18, g1Var, view2);
                    g1Var.presentFragment((m2) m2Var);
                    return;
                } else if (m61Var.f42904a == 5 && i12 >= 0 && i12 < g1Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue >= view2.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue <= AndroidUtilities.dp(76.0f)) {
                        if (g1Var.h[m61Var.d].isEmpty()) {
                            ((j5) view2).setChecked(true);
                            g1Var.h[m61Var.d].add(new f1(0, 1439));
                            g1Var.X(m61Var.d);
                        } else {
                            g1Var.h[m61Var.d].clear();
                            ((j5) view2).setChecked(false);
                        }
                        ((j5) view2).setValue(g1.a0(g1Var.h[m61Var.d]));
                        g1Var.Y(true);
                        return;
                    }
                    int i13 = (m61Var.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < g1Var.h[i13].size(); i15++) {
                        if (((f1) g1Var.h[i13].get(i15)).f11507b > i14) {
                            i14 = ((f1) g1Var.h[i13].get(i15)).f11507b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (m61Var.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < g1Var.h[i16].size(); i18++) {
                        if (((f1) g1Var.h[i16].get(i18)).f11506a < i17) {
                            i17 = ((f1) g1Var.h[i16].get(i18)).f11506a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = m61Var.f26946l;
                    ArrayList arrayList = g1Var.h[m61Var.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = g1Var.h[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    i1 i1Var = new i1(charSequence, arrayList, max, i19, 28 - i20);
                    i1Var.f11536f = new ig.t0(g1Var, 2);
                    i1Var.h = new q3(17, g1Var, m61Var);
                    g1Var.presentFragment(i1Var);
                    return;
                } else {
                    return;
                }
            case 12:
                final i1 i1Var2 = (i1) this.f8833b;
                m61 m61Var2 = (m61) obj;
                final View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = i1Var2.f11535c;
                int i23 = i1Var2.d;
                ArrayList arrayList3 = i1Var2.f11534b;
                int i24 = m61Var2.d;
                if (i24 == -1) {
                    i1Var2.f11538r = !i1Var2.f11538r;
                    arrayList3.clear();
                    if (i1Var2.f11538r) {
                        arrayList3.add(new f1(0, 1439));
                    }
                    w8 w8Var = (w8) view3;
                    boolean z11 = i1Var2.f11538r;
                    m61Var2.e = z11;
                    w8Var.setChecked(z11);
                    boolean z12 = i1Var2.f11538r;
                    if (z12) {
                        i11 = g6.f19637f6;
                    } else {
                        i11 = g6.f19618e6;
                    }
                    w8Var.b(g6.x0(null, i11, false), z12);
                    i1Var2.f11537n.W2.N(true);
                    ig.t0 t0Var = i1Var2.f11536f;
                    if (t0Var != null) {
                        t0Var.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !i1Var2.U()) {
                        int i25 = ((f1) i2.d.h(1, arrayList3)).f11507b;
                        int clamp = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new f1(clamp, Utilities.clamp((i25 + 1560) / 2, i23, clamp + 1)));
                    } else {
                        if (i1Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp2 = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new f1(clamp2, Utilities.clamp(1200, i23, clamp2 + 1)));
                    }
                    ig.t0 t0Var2 = i1Var2.f11536f;
                    if (t0Var2 != null) {
                        t0Var2.run();
                    }
                    i1Var2.f11537n.W2.N(true);
                    return;
                } else if (m61Var2.f42904a == 3 && (i10 = i24 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i26 = i10 - 1;
                    if (i26 >= 0) {
                        f1Var = (f1) arrayList3.get(i26);
                    } else {
                        f1Var = null;
                    }
                    final f1 f1Var3 = (f1) arrayList3.get(i10);
                    int i27 = i10 + 1;
                    if (i27 < arrayList3.size()) {
                        f1Var2 = (f1) arrayList3.get(i27);
                    } else {
                        f1Var2 = null;
                    }
                    int i28 = m61Var2.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = i1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = f1Var3.f11506a;
                        if (f1Var != null) {
                            i22 = f1Var.f11507b + 1;
                        }
                        g5.W(parentActivity, string, i29, i22, f1Var3.f11507b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        i1 i1Var3 = i1Var2;
                                        boolean V = i1Var3.V();
                                        int intValue = num.intValue();
                                        f1Var3.f11506a = intValue;
                                        ((r8) view3).u(f1.a(intValue), true);
                                        if (V != i1Var3.V()) {
                                            i1Var3.f11537n.W2.N(true);
                                        }
                                        t0 t0Var3 = i1Var3.f11536f;
                                        if (t0Var3 != null) {
                                            t0Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        i1 i1Var4 = i1Var2;
                                        boolean V2 = i1Var4.V();
                                        int intValue2 = num.intValue();
                                        f1Var3.f11507b = intValue2;
                                        ((r8) view3).u(f1.a(intValue2), true);
                                        if (V2 != i1Var4.V()) {
                                            i1Var4.f11537n.W2.N(true);
                                        }
                                        t0 t0Var4 = i1Var4.f11536f;
                                        if (t0Var4 != null) {
                                            t0Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = i1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i30 = f1Var3.f11507b;
                        int i31 = f1Var3.f11506a + 1;
                        if (f1Var2 != null) {
                            i23 = f1Var2.f11506a - 1;
                        }
                        g5.W(parentActivity2, string2, i30, i31, i23, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        i1 i1Var3 = i1Var2;
                                        boolean V = i1Var3.V();
                                        int intValue = num.intValue();
                                        f1Var3.f11506a = intValue;
                                        ((r8) view3).u(f1.a(intValue), true);
                                        if (V != i1Var3.V()) {
                                            i1Var3.f11537n.W2.N(true);
                                        }
                                        t0 t0Var3 = i1Var3.f11536f;
                                        if (t0Var3 != null) {
                                            t0Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        i1 i1Var4 = i1Var2;
                                        boolean V2 = i1Var4.V();
                                        int intValue2 = num.intValue();
                                        f1Var3.f11507b = intValue2;
                                        ((r8) view3).u(f1.a(intValue2), true);
                                        if (V2 != i1Var4.V()) {
                                            i1Var4.f11537n.W2.N(true);
                                        }
                                        t0 t0Var4 = i1Var4.f11536f;
                                        if (t0Var4 != null) {
                                            t0Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 2) {
                        arrayList3.remove(i10);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new f1(0, 1439));
                        }
                        i1Var2.f11537n.W2.N(true);
                        ig.t0 t0Var3 = i1Var2.f11536f;
                        if (t0Var3 != null) {
                            t0Var3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 14:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                e2.U((e2) this.f8833b, (m61) obj, (View) obj2);
                return;
            default:
                m61 m61Var3 = (m61) obj;
                View view4 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f7 = (Float) obj4;
                Float f10 = (Float) obj5;
                if (((x3[]) this.f8833b)[0] != null) {
                    num.intValue();
                    f7.floatValue();
                    f10.floatValue();
                    if (view4 instanceof i6) {
                        ((i6) view4).B();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, kg1 kg1Var) {
        k4 k4Var = (k4) this.f8833b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        k4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        yyVar.finishFragment();
        return true;
    }

    public a(j2.a aVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.f8832a = 18;
        this.f8833b = c0Var;
    }

    public a(Object obj, int i10) {
        this.f8832a = i10;
        this.f8833b = obj;
    }
}
