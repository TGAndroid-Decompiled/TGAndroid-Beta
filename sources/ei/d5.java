package ei;

import ai.u7;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import ci.rc;
import com.google.android.gms.tasks.OnSuccessListener;
import ii.e6;
import ii.g6;
import ii.h5;
import ii.p5;
import ii.q5;
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
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o70;
import org.telegram.ui.ly;
import org.telegram.ui.ry;
import org.telegram.ui.wf1;
import w7.f6;
public final class d5 implements Utilities.Callback5, OnSuccessListener, c3.g, org.telegram.ui.ActionBar.a2, e2.m, au, ii.p0, ly, q5, f2.s {
    public final int f8286a;
    public final Object f8287b;

    public d5(j2.a aVar, Object obj, int i10) {
        this.f8286a = i10;
        this.f8287b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(ry ryVar) {
        return false;
    }

    @Override
    public o70 a(ii.i1 i1Var) {
        return o70.H((ii.e2) ((a6.i) this.f8287b).f303b, i1Var);
    }

    @Override
    public void b(long j3, e2.v vVar) {
        switch (this.f8286a) {
            case 26:
                c3.b.d(j3, vVar, ((j4.c0) this.f8287b).f12620c);
                return;
            default:
                c3.b.e(j3, vVar, ((j4.c0) this.f8287b).f12620c);
                return;
        }
    }

    public ii.b0 c(aa.a aVar) {
        InputStream inputStream;
        j5.b bVar = (j5.b) this.f8287b;
        URL url = (URL) aVar.f360c;
        String c10 = f6.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f12874g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) aVar.f359b;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                ka.c cVar = bVar.f12870a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                ka.e eVar = (ka.e) cVar.f13554b;
                ka.f fVar = new ka.f(bufferedWriter, eVar.f13558a, eVar.f13559b, eVar.f13560c, eVar.d);
                fVar.h((k5.i) aVar.d);
                fVar.j();
                fVar.f13562b.flush();
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
                        return new ii.b0(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        ii.b0 b0Var = new ii.b0(responseCode, null, k5.m.a(new BufferedReader(new InputStreamReader(inputStream))).f13477a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return b0Var;
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
                return new ii.b0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
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
        } catch (ia.b e) {
            e = e;
            f6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ii.b0(400, null, 0L);
        } catch (ConnectException e7) {
            e = e7;
            f6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ii.b0(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            f6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ii.b0(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            f6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ii.b0(400, null, 0L);
        }
    }

    public void d(int i10) {
        ii.a0 a0Var = (ii.a0) this.f8287b;
        a0Var.f11209c = i10;
        a0Var.f(i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f8286a) {
            case 5:
                hg.z1 z1Var = ((hg.q1) this.f8287b).f10380a;
                hg.c2 f7 = hg.c2.f(hg.z1.b0(z1Var));
                ArrayList arrayList = z1Var.f10477b;
                int i11 = f7.f10224a;
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
                        hg.b2 c10 = f7.c(((Integer) arrayList.get(i13)).intValue());
                        f7.f10225b.remove(c10);
                        f7.a(c10.f10206b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f10205a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new u7(6));
                        if ("hello".equals(c10.f10206b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c10.f10206b)) {
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
                    messagesStorage.getStorageQueue().postRunnable(new ci.w0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                hg.z1.X(z1Var);
                return;
            default:
                ((ai.s4) this.f8287b).run();
                return;
        }
    }

    @Override
    public void i() {
        switch (this.f8286a) {
            case 14:
                ii.u0 u0Var = (ii.u0) this.f8287b;
                ii.i1 i1Var = u0Var.d;
                ii.a aVar = u0Var.f11647f;
                if (aVar != null) {
                    aVar.f11205s = true;
                    aVar.f11204r = i1Var.E;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f11191b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = g6.f(i1Var.getText());
                    }
                }
                ii.e3 e3Var = u0Var.h;
                if (e3Var != null && u0Var.f11647f != null) {
                    ii.x3.O1(e3Var.f11342a);
                    return;
                }
                return;
            case 19:
                ((h5) this.f8287b).h();
                return;
            default:
                p5 p5Var = (p5) this.f8287b;
                ii.a aVar2 = p5Var.f11207a;
                if (aVar2 != null) {
                    aVar2.f11205s = true;
                    aVar2.f11204r = p5Var.f11556r.E;
                }
                p5Var.u();
                ii.d3 d3Var = p5Var.E;
                if (d3Var != null && p5Var.f11207a != null) {
                    ii.x3.O1(d3Var.f11293a);
                    return;
                }
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8286a) {
            case 7:
                ((b2.z0) obj).onAudioAttributesChanged((b2.e) this.f8287b);
                return;
            case 8:
                ((b2.z0) obj).onTrackSelectionParametersChanged((b2.q1) this.f8287b);
                return;
            case 9:
                ((b2.z0) obj).onCues((d2.d) this.f8287b);
                return;
            case 10:
                ((b2.z0) obj).onMediaMetadataChanged(((i2.c0) this.f8287b).f10616a.O);
                return;
            case 11:
                ((b2.z0) obj).onMetadata((b2.p0) this.f8287b);
                return;
            case 22:
                ((j2.b) obj).h((b2.u0) this.f8287b);
                return;
            case 23:
                ((j2.b) obj).onSeekStarted((j2.a) this.f8287b);
                return;
            case 24:
                ((j2.b) obj).a((i2.g) this.f8287b);
                return;
            default:
                ((j2.b) obj).b((u2.b0) this.f8287b);
                return;
        }
    }

    @Override
    public long m(long j3) {
        c3.u uVar = (c3.u) this.f8287b;
        return e2.d0.i((j3 * uVar.e) / 1000000, 0L, uVar.f3800j - 1);
    }

    @Override
    public void onSuccess(Object obj) {
        ((e1.b) this.f8287b).invoke(obj);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        hg.g1 g1Var;
        hg.g1 g1Var2;
        int i11;
        switch (this.f8286a) {
            case 0:
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((e5) this.f8287b).V((h51) obj);
                return;
            case 1:
            case 2:
            case 5:
            default:
                h51 h51Var = (h51) obj;
                View view2 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f7 = (Float) obj4;
                Float f10 = (Float) obj5;
                if (((ii.x3[]) this.f8287b)[0] != null) {
                    num.intValue();
                    f7.floatValue();
                    f10.floatValue();
                    if (view2 instanceof e6) {
                        ((e6) view2).B();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                hg.h1 h1Var = (hg.h1) this.f8287b;
                h51 h51Var2 = (h51) obj;
                View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = h51Var2.d;
                if (i12 == -1) {
                    boolean z10 = !h1Var.e;
                    h1Var.e = z10;
                    ((x8) view3).setChecked(z10);
                    h1Var.f10288a.Y2.N(true);
                    h1Var.Y(true);
                    return;
                } else if (i12 == -2) {
                    ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                    n2Var.f10271n = h1Var.f10293r;
                    n2Var.f10269c = new ai.g3(18, h1Var, view3);
                    h1Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                    return;
                } else if (h51Var2.f15508a == 5 && i12 >= 0 && i12 < h1Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue >= view3.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue <= AndroidUtilities.dp(76.0f)) {
                        if (h1Var.h[h51Var2.d].isEmpty()) {
                            ((j5) view3).setChecked(true);
                            h1Var.h[h51Var2.d].add(new hg.g1(0, 1439));
                            h1Var.X(h51Var2.d);
                        } else {
                            h1Var.h[h51Var2.d].clear();
                            ((j5) view3).setChecked(false);
                        }
                        ((j5) view3).setValue(hg.h1.a0(h1Var.h[h51Var2.d]));
                        h1Var.Y(true);
                        return;
                    }
                    int i13 = (h51Var2.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < h1Var.h[i13].size(); i15++) {
                        if (((hg.g1) h1Var.h[i13].get(i15)).f10278b > i14) {
                            i14 = ((hg.g1) h1Var.h[i13].get(i15)).f10278b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (h51Var2.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < h1Var.h[i16].size(); i18++) {
                        if (((hg.g1) h1Var.h[i16].get(i18)).f10277a < i17) {
                            i17 = ((hg.g1) h1Var.h[i16].get(i18)).f10277a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = h51Var2.f24507l;
                    ArrayList arrayList = h1Var.h[h51Var2.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = h1Var.h[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    hg.j1 j1Var = new hg.j1(charSequence, arrayList, max, i19, 28 - i20);
                    j1Var.f10304f = new rc(h1Var, 23);
                    j1Var.h = new gg.x1(5, h1Var, h51Var2);
                    h1Var.presentFragment(j1Var);
                    return;
                } else {
                    return;
                }
            case 4:
                final hg.j1 j1Var2 = (hg.j1) this.f8287b;
                h51 h51Var3 = (h51) obj;
                final View view4 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = j1Var2.f10303c;
                int i23 = j1Var2.d;
                ArrayList arrayList3 = j1Var2.f10302b;
                int i24 = h51Var3.d;
                if (i24 == -1) {
                    j1Var2.f10306r = !j1Var2.f10306r;
                    arrayList3.clear();
                    if (j1Var2.f10306r) {
                        arrayList3.add(new hg.g1(0, 1439));
                    }
                    x8 x8Var = (x8) view4;
                    boolean z11 = j1Var2.f10306r;
                    h51Var3.e = z11;
                    x8Var.setChecked(z11);
                    boolean z12 = j1Var2.f10306r;
                    if (z12) {
                        i11 = h6.f18825f6;
                    } else {
                        i11 = h6.f18808e6;
                    }
                    x8Var.b(h6.w0(null, i11, false), z12);
                    j1Var2.f10305n.Y2.N(true);
                    rc rcVar = j1Var2.f10304f;
                    if (rcVar != null) {
                        rcVar.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !j1Var2.U()) {
                        int i25 = ((hg.g1) hg.c.h(1, arrayList3)).f10278b;
                        int clamp = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new hg.g1(clamp, Utilities.clamp((i25 + 1560) / 2, i23, clamp + 1)));
                    } else {
                        if (j1Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp2 = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new hg.g1(clamp2, Utilities.clamp(1200, i23, clamp2 + 1)));
                    }
                    rc rcVar2 = j1Var2.f10304f;
                    if (rcVar2 != null) {
                        rcVar2.run();
                    }
                    j1Var2.f10305n.Y2.N(true);
                    return;
                } else if (h51Var3.f15508a == 3 && (i10 = i24 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i26 = i10 - 1;
                    if (i26 >= 0) {
                        g1Var = (hg.g1) arrayList3.get(i26);
                    } else {
                        g1Var = null;
                    }
                    final hg.g1 g1Var3 = (hg.g1) arrayList3.get(i10);
                    int i27 = i10 + 1;
                    if (i27 < arrayList3.size()) {
                        g1Var2 = (hg.g1) arrayList3.get(i27);
                    } else {
                        g1Var2 = null;
                    }
                    int i28 = h51Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = j1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = g1Var3.f10277a;
                        if (g1Var != null) {
                            i22 = g1Var.f10278b + 1;
                        }
                        org.telegram.ui.Components.e5.X(parentActivity, string, i29, i22, g1Var3.f10278b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        j1 j1Var3 = j1Var2;
                                        boolean V = j1Var3.V();
                                        int intValue = num2.intValue();
                                        g1Var3.f10277a = intValue;
                                        ((s8) view4).u(g1.a(intValue), true);
                                        if (V != j1Var3.V()) {
                                            j1Var3.f10305n.Y2.N(true);
                                        }
                                        rc rcVar3 = j1Var3.f10304f;
                                        if (rcVar3 != null) {
                                            rcVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        j1 j1Var4 = j1Var2;
                                        boolean V2 = j1Var4.V();
                                        int intValue2 = num2.intValue();
                                        g1Var3.f10278b = intValue2;
                                        ((s8) view4).u(g1.a(intValue2), true);
                                        if (V2 != j1Var4.V()) {
                                            j1Var4.f10305n.Y2.N(true);
                                        }
                                        rc rcVar4 = j1Var4.f10304f;
                                        if (rcVar4 != null) {
                                            rcVar4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = j1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i30 = g1Var3.f10278b;
                        int i31 = g1Var3.f10277a + 1;
                        if (g1Var2 != null) {
                            i23 = g1Var2.f10277a - 1;
                        }
                        org.telegram.ui.Components.e5.X(parentActivity2, string2, i30, i31, i23, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        j1 j1Var3 = j1Var2;
                                        boolean V = j1Var3.V();
                                        int intValue = num2.intValue();
                                        g1Var3.f10277a = intValue;
                                        ((s8) view4).u(g1.a(intValue), true);
                                        if (V != j1Var3.V()) {
                                            j1Var3.f10305n.Y2.N(true);
                                        }
                                        rc rcVar3 = j1Var3.f10304f;
                                        if (rcVar3 != null) {
                                            rcVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        j1 j1Var4 = j1Var2;
                                        boolean V2 = j1Var4.V();
                                        int intValue2 = num2.intValue();
                                        g1Var3.f10278b = intValue2;
                                        ((s8) view4).u(g1.a(intValue2), true);
                                        if (V2 != j1Var4.V()) {
                                            j1Var4.f10305n.Y2.N(true);
                                        }
                                        rc rcVar4 = j1Var4.f10304f;
                                        if (rcVar4 != null) {
                                            rcVar4.run();
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
                            arrayList3.add(new hg.g1(0, 1439));
                        }
                        j1Var2.f10305n.Y2.N(true);
                        rc rcVar3 = j1Var2.f10304f;
                        if (rcVar3 != null) {
                            rcVar3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                hg.f2.U((hg.f2) this.f8287b, (h51) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean u(ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        ii.j4 j4Var = (ii.j4) this.f8287b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        j4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        ryVar.finishFragment();
        return true;
    }

    public d5(j2.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f8286a = 25;
        this.f8287b = b0Var;
    }

    public d5(Object obj, int i10) {
        this.f8286a = i10;
        this.f8287b = obj;
    }
}
