package fi;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import bi.c7;
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
import ji.g6;
import ji.i6;
import ji.j5;
import ji.s5;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.xt;
import org.telegram.ui.eg1;
import org.telegram.ui.oy;
import org.telegram.ui.uy;
import w7.f6;
public final class f implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, c3.g, e2.m, f2.t, xt, ji.o0, oy {
    public final int f9643a;
    public final Object f9644b;

    public f(j2.a aVar, Object obj, int i10) {
        this.f9643a = i10;
        this.f9644b = obj;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean K(uy uyVar) {
        return false;
    }

    @Override
    public void a(long j3, e2.v vVar) {
        switch (this.f9643a) {
            case 19:
                c3.b.d(j3, vVar, ((j4.c0) this.f9644b).f13238c);
                return;
            default:
                c3.b.e(j3, vVar, ((j4.c0) this.f9644b).f13238c);
                return;
        }
    }

    public j5.b b(aa.a aVar) {
        InputStream inputStream;
        j5.c cVar = (j5.c) this.f9644b;
        URL url = (URL) aVar.f372c;
        String c10 = f6.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f13520g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) aVar.f371b;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                ji.u4 u4Var = cVar.f13515a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                ka.d dVar = (ka.d) u4Var.f14221b;
                ka.e eVar = new ka.e(bufferedWriter, dVar.f14880a, dVar.f14881b, dVar.f14882c, dVar.d);
                eVar.h((k5.i) aVar.d);
                eVar.j();
                eVar.f14884b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c11 = f6.c("CctTransportBackend");
                if (Log.isLoggable(c11, 4)) {
                    Log.i(c11, String.format("Status Code: %d", valueOf));
                }
                f6.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                f6.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
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
                        j5.b bVar = new j5.b(responseCode, null, k5.m.a(new BufferedReader(new InputStreamReader(inputStream))).f14793a);
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
        } catch (ia.b e7) {
            e = e7;
            f6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new j5.b(400, null, 0L);
        } catch (ConnectException e10) {
            e = e10;
            f6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new j5.b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            f6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new j5.b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            f6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new j5.b(400, null, 0L);
        }
    }

    public void c(int i10) {
        ji.a0 a0Var = (ji.a0) this.f9644b;
        a0Var.f13751c = i10;
        a0Var.f(i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f9643a) {
            case 0:
                ((e) this.f9644b).run();
                return;
            case 1:
                m mVar = (m) this.f9644b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = mVar.getMessagesController().getInputUser(mVar.P);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(mVar.getParentActivity(), 3, null);
                b2Var2.q(150L);
                mVar.getConnectionsManager().sendRequest(updatestarrefprogram, new b(mVar, b2Var2, 0));
                return;
            case 13:
                ig.y1 y1Var = ((ig.p1) this.f9644b).f12180a;
                ig.b2 f7 = ig.b2.f(ig.y1.b0(y1Var));
                ArrayList arrayList = y1Var.f12290b;
                int i11 = f7.f12006a;
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
                        f7.f12007b.remove(c10);
                        f7.a(c10.f11993b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f11992a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new c7(6));
                        if ("hello".equals(c10.f11993b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c10.f11993b)) {
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
                    messagesStorage.getStorageQueue().postRunnable(new di.w0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                ig.y1.X(y1Var);
                return;
            default:
                ((bi.e4) this.f9644b).run();
                return;
        }
    }

    @Override
    public n70 i(ji.h1 h1Var) {
        return n70.H((ji.c2) ((z2.b) this.f9644b).f50678a, h1Var);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f9643a) {
            case 4:
                ((b2.z0) obj).onMediaMetadataChanged((b2.n0) this.f9644b);
                return;
            case 5:
                ((b2.z0) obj).onAudioAttributesChanged((b2.e) this.f9644b);
                return;
            case 6:
                ((b2.z0) obj).onTrackSelectionParametersChanged((b2.q1) this.f9644b);
                return;
            case 7:
                ((b2.z0) obj).onCues((d2.c) this.f9644b);
                return;
            case 8:
                ((b2.z0) obj).onMediaMetadataChanged(((i2.c0) this.f9644b).f11471a.O);
                return;
            case 9:
                ((b2.z0) obj).onMetadata((b2.p0) this.f9644b);
                return;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                ((j2.b) obj).c((u2.b0) this.f9644b);
                return;
            case 15:
                ((j2.b) obj).h((b2.u0) this.f9644b);
                return;
            case 16:
                ((j2.b) obj).onSeekStarted((j2.a) this.f9644b);
                return;
            case 17:
                ((j2.b) obj).a((i2.h) this.f9644b);
                return;
        }
    }

    @Override
    public void j() {
        switch (this.f9643a) {
            case 23:
                ji.t0 t0Var = (ji.t0) this.f9644b;
                ji.h1 h1Var = t0Var.d;
                ji.a aVar = t0Var.f14181f;
                if (aVar != null) {
                    aVar.f13747s = true;
                    aVar.f13746r = h1Var.E;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f13732b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = i6.f(h1Var.getText());
                    }
                }
                ji.c3 c3Var = t0Var.h;
                if (c3Var != null && t0Var.f14181f != null) {
                    ji.v3.N1(c3Var.f13842a);
                    return;
                }
                return;
            case 28:
                ((j5) this.f9644b).h();
                return;
            default:
                s5 s5Var = (s5) this.f9644b;
                ji.a aVar2 = s5Var.f13749a;
                if (aVar2 != null) {
                    aVar2.f13747s = true;
                    aVar2.f13746r = s5Var.f14167r.E;
                }
                s5Var.u();
                ji.b3 b3Var = s5Var.E;
                if (b3Var != null && s5Var.f13749a != null) {
                    ji.v3.N1(b3Var.f13790a);
                    return;
                }
                return;
        }
    }

    @Override
    public long l(long j3) {
        c3.u uVar = (c3.u) this.f9644b;
        return e2.d0.i((j3 * uVar.f4301e) / 1000000, 0L, uVar.f4305j - 1);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        ig.f1 f1Var;
        ig.f1 f1Var2;
        int i11;
        switch (this.f9643a) {
            case 2:
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((e5) this.f9644b).V((h51) obj);
                return;
            case 11:
                ig.g1 g1Var = (ig.g1) this.f9644b;
                h51 h51Var = (h51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = h51Var.d;
                if (i12 == -1) {
                    boolean z10 = !g1Var.f12082e;
                    g1Var.f12082e = z10;
                    ((w8) view2).setChecked(z10);
                    g1Var.f12079a.Y2.N(true);
                    g1Var.Y(true);
                    return;
                } else if (i12 == -2) {
                    ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                    n2Var.f12057n = g1Var.f12085r;
                    n2Var.f12054c = new di.m2(17, g1Var, view2);
                    g1Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                    return;
                } else if (h51Var.f44071a == 5 && i12 >= 0 && i12 < g1Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue >= view2.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue <= AndroidUtilities.dp(76.0f)) {
                        if (g1Var.h[h51Var.d].isEmpty()) {
                            ((i5) view2).setChecked(true);
                            g1Var.h[h51Var.d].add(new ig.f1(0, 1439));
                            g1Var.X(h51Var.d);
                        } else {
                            g1Var.h[h51Var.d].clear();
                            ((i5) view2).setChecked(false);
                        }
                        ((i5) view2).setValue(ig.g1.a0(g1Var.h[h51Var.d]));
                        g1Var.Y(true);
                        return;
                    }
                    int i13 = (h51Var.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < g1Var.h[i13].size(); i15++) {
                        if (((ig.f1) g1Var.h[i13].get(i15)).f12068b > i14) {
                            i14 = ((ig.f1) g1Var.h[i13].get(i15)).f12068b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (h51Var.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < g1Var.h[i16].size(); i18++) {
                        if (((ig.f1) g1Var.h[i16].get(i18)).f12067a < i17) {
                            i17 = ((ig.f1) g1Var.h[i16].get(i18)).f12067a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = h51Var.f26594l;
                    ArrayList arrayList = g1Var.h[h51Var.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = g1Var.h[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    ig.i1 i1Var = new ig.i1(charSequence, arrayList, max, i19, 28 - i20);
                    i1Var.f12101f = new ig.t0(g1Var, 2);
                    i1Var.h = new j4(15, g1Var, h51Var);
                    g1Var.presentFragment(i1Var);
                    return;
                } else {
                    return;
                }
            case 12:
                final ig.i1 i1Var2 = (ig.i1) this.f9644b;
                h51 h51Var2 = (h51) obj;
                final View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = i1Var2.f12099c;
                int i23 = i1Var2.d;
                ArrayList arrayList3 = i1Var2.f12098b;
                int i24 = h51Var2.d;
                if (i24 == -1) {
                    i1Var2.f12103r = !i1Var2.f12103r;
                    arrayList3.clear();
                    if (i1Var2.f12103r) {
                        arrayList3.add(new ig.f1(0, 1439));
                    }
                    w8 w8Var = (w8) view3;
                    boolean z11 = i1Var2.f12103r;
                    h51Var2.f26588e = z11;
                    w8Var.setChecked(z11);
                    boolean z12 = i1Var2.f12103r;
                    if (z12) {
                        i11 = j6.f20700f6;
                    } else {
                        i11 = j6.f20683e6;
                    }
                    w8Var.b(j6.w0(null, i11, false), z12);
                    i1Var2.f12102n.Y2.N(true);
                    ig.t0 t0Var = i1Var2.f12101f;
                    if (t0Var != null) {
                        t0Var.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !i1Var2.U()) {
                        int i25 = ((ig.f1) i2.g.h(1, arrayList3)).f12068b;
                        int clamp = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new ig.f1(clamp, Utilities.clamp((i25 + 1560) / 2, i23, clamp + 1)));
                    } else {
                        if (i1Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp2 = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new ig.f1(clamp2, Utilities.clamp(1200, i23, clamp2 + 1)));
                    }
                    ig.t0 t0Var2 = i1Var2.f12101f;
                    if (t0Var2 != null) {
                        t0Var2.run();
                    }
                    i1Var2.f12102n.Y2.N(true);
                    return;
                } else if (h51Var2.f44071a == 3 && (i10 = i24 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i26 = i10 - 1;
                    if (i26 >= 0) {
                        f1Var = (ig.f1) arrayList3.get(i26);
                    } else {
                        f1Var = null;
                    }
                    final ig.f1 f1Var3 = (ig.f1) arrayList3.get(i10);
                    int i27 = i10 + 1;
                    if (i27 < arrayList3.size()) {
                        f1Var2 = (ig.f1) arrayList3.get(i27);
                    } else {
                        f1Var2 = null;
                    }
                    int i28 = h51Var2.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = i1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = f1Var3.f12067a;
                        if (f1Var != null) {
                            i22 = f1Var.f12068b + 1;
                        }
                        org.telegram.ui.Components.e5.X(parentActivity, string, i29, i22, f1Var3.f12068b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        i1 i1Var3 = i1Var2;
                                        boolean V = i1Var3.V();
                                        int intValue = num.intValue();
                                        f1Var3.f12067a = intValue;
                                        ((r8) view3).u(f1.a(intValue), true);
                                        if (V != i1Var3.V()) {
                                            i1Var3.f12102n.Y2.N(true);
                                        }
                                        t0 t0Var3 = i1Var3.f12101f;
                                        if (t0Var3 != null) {
                                            t0Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        i1 i1Var4 = i1Var2;
                                        boolean V2 = i1Var4.V();
                                        int intValue2 = num.intValue();
                                        f1Var3.f12068b = intValue2;
                                        ((r8) view3).u(f1.a(intValue2), true);
                                        if (V2 != i1Var4.V()) {
                                            i1Var4.f12102n.Y2.N(true);
                                        }
                                        t0 t0Var4 = i1Var4.f12101f;
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
                        int i30 = f1Var3.f12068b;
                        int i31 = f1Var3.f12067a + 1;
                        if (f1Var2 != null) {
                            i23 = f1Var2.f12067a - 1;
                        }
                        org.telegram.ui.Components.e5.X(parentActivity2, string2, i30, i31, i23, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        i1 i1Var3 = i1Var2;
                                        boolean V = i1Var3.V();
                                        int intValue = num.intValue();
                                        f1Var3.f12067a = intValue;
                                        ((r8) view3).u(f1.a(intValue), true);
                                        if (V != i1Var3.V()) {
                                            i1Var3.f12102n.Y2.N(true);
                                        }
                                        t0 t0Var3 = i1Var3.f12101f;
                                        if (t0Var3 != null) {
                                            t0Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        i1 i1Var4 = i1Var2;
                                        boolean V2 = i1Var4.V();
                                        int intValue2 = num.intValue();
                                        f1Var3.f12068b = intValue2;
                                        ((r8) view3).u(f1.a(intValue2), true);
                                        if (V2 != i1Var4.V()) {
                                            i1Var4.f12102n.Y2.N(true);
                                        }
                                        t0 t0Var4 = i1Var4.f12101f;
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
                            arrayList3.add(new ig.f1(0, 1439));
                        }
                        i1Var2.f12102n.Y2.N(true);
                        ig.t0 t0Var3 = i1Var2.f12101f;
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
                ig.e2.U((ig.e2) this.f9644b, (h51) obj, (View) obj2);
                return;
            default:
                h51 h51Var3 = (h51) obj;
                View view4 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f7 = (Float) obj4;
                Float f10 = (Float) obj5;
                if (((ji.v3[]) this.f9644b)[0] != null) {
                    num.intValue();
                    f7.floatValue();
                    f10.floatValue();
                    if (view4 instanceof g6) {
                        ((g6) view4).B();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        ji.i4 i4Var = (ji.i4) this.f9644b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        i4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        uyVar.finishFragment();
        return true;
    }

    public f(j2.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f9643a = 18;
        this.f9644b = b0Var;
    }

    public f(Object obj, int i10) {
        this.f9643a = i10;
        this.f9644b = obj;
    }
}
