package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ChatsWidgetConfigActivity;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
public final class cd1 implements hd1, ma3, ee, oac, ln5, yy5, z19, ue7, cr0, dq5, h59, CameraController.VideoTakeCallback, o68, kab, kk4, ResultCallback, gv3 {
    public final byte a;
    public final Object b;

    public cd1(mr1 mr1Var, boolean z) {
        this.a = (byte) 10;
        this.b = mr1Var;
    }

    @Override
    public final boolean a(lj4 lj4Var, int i, Bundle bundle) {
        tz1 tz1Var = (tz1) this.b;
        ChatActivityEnterView chatActivityEnterView = tz1Var.f2;
        if (chatActivityEnterView.w7) {
            return true;
        }
        int i2 = b21.a;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                ((fq5) lj4Var.a).g();
            } catch (Exception unused) {
                return false;
            }
        }
        fq5 fq5Var = (fq5) lj4Var.a;
        if (!fq5Var.getDescription().hasMimeType("image/gif") && !a6a.w0(fq5Var.e(), null)) {
            tz1Var.J(fq5Var.e(), fq5Var.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            ik.J(chatActivityEnterView.E3, chatActivityEnterView.F3.a(), new g11(tz1Var, lj4Var, (byte) 22), chatActivityEnterView.L4);
            return true;
        } else {
            tz1Var.L(lj4Var, true, 0, 0);
            return true;
        }
    }

    @Override
    public final void b(na3 na3Var) {
        bf1 bf1Var = (bf1) na3Var;
        bf1Var.clear();
        ((cf1) this.b).b.add(bf1Var);
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        p09 y;
        zl1 zl1Var;
        cm1 cm1Var = (cm1) this.b;
        if (z && (y = cm1Var.J.y()) != null) {
            k47 k47Var = cm1Var.Q0;
            if (k47Var != null && !k47Var.o1) {
                k47Var.o1 = true;
                y.I(0, false, false);
                gm.c3(new xl1(y, (byte) 0));
                if (k47Var.n1 || cm1Var.M1) {
                    k47Var.n1 = false;
                    cm1Var.M1 = false;
                    try {
                        cm1Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (cm1Var.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) cm1Var.getContext()).w0.c(false);
                    }
                    TLRPC.VideoSize videoSize = cm1Var.J1;
                    if (videoSize != null && (zl1Var = cm1Var.g1) != null) {
                        zl1Var.r(cm1Var, cm1Var.I1, videoSize);
                    }
                }
            } else if (y.b0 < 1) {
                y.stop();
                y.I(y.e[0] - 1, false, false);
            }
        }
    }

    @Override
    public final void c(ArrayList arrayList) {
        iq1 iq1Var = (iq1) this.b;
        yv1 yv1Var = iq1Var.p;
        if (yv1Var.getParentActivity() != null && yv1Var.getParentActivity() != null) {
            hq1 hq1Var = new hq1(iq1Var, yv1Var, yv1Var.getParentActivity(), yv1Var.Ba, arrayList);
            boolean Y7 = yv1Var.Y7();
            hq1Var.i0 = Y7;
            hq1Var.n = Y7;
            hq1Var.p0 = false;
            yv1Var.N5(false);
            yv1Var.showDialog(hq1Var);
        }
    }

    public final re1 d(mx6 mx6Var) {
        InputStream inputStream;
        se1 se1Var = (se1) this.b;
        URL url = (URL) mx6Var.b;
        String c = aqe.c("CctTransportBackend");
        if (Log.isLoggable(c, 4)) {
            Log.i(c, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(130000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) mx6Var.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                lj4 lj4Var = se1Var.a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                qw5 qw5Var = (qw5) lj4Var.a;
                ww5 ww5Var = new ww5(bufferedWriter, qw5Var.a, qw5Var.b, qw5Var.c, qw5Var.d);
                ww5Var.h((w80) mx6Var.c);
                ww5Var.j();
                ww5Var.b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c2 = aqe.c("CctTransportBackend");
                if (Log.isLoggable(c2, 4)) {
                    Log.i(c2, String.format("Status Code: %d", valueOf));
                }
                aqe.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                aqe.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new re1(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        re1 re1Var = new re1(responseCode, null, cb0.a(new BufferedReader(new InputStreamReader(inputStream))).a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return re1Var;
                    } catch (Throwable th) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                return new re1(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (e44 e) {
            e = e;
            aqe.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new re1(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            aqe.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new re1(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            aqe.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new re1(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            aqe.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new re1(400, null, 0L);
        }
    }

    public final void f(String str) {
        yv1 yv1Var = ((hu1) this.b).R;
        if (str.startsWith("@")) {
            yv1Var.getMessagesController().C3(str.substring(1), yv1Var, 0, null);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                yv1Var.a0.E1(null, str, false, false);
                if (yv1Var.a0.getFieldText() == null) {
                    yv1Var.E7(false);
                    return;
                }
                return;
            }
            yv1Var.Oa(0, str, null, null, false);
        } else {
            nk3 nk3Var = new nk3(null);
            nk3Var.p2 = str;
            yv1Var.presentFragment(nk3Var);
        }
    }

    @Override
    public final boolean g(int i, View view) {
        Object O;
        p42 p42Var = (p42) this.b;
        y59 adapter = p42Var.r.getAdapter();
        h42 h42Var = p42Var.w;
        if (adapter == h42Var) {
            O = h42Var.E(i);
        } else {
            o42 o42Var = p42Var.E;
            O = o42Var.O(o42Var.S(i), o42Var.Q(i));
        }
        return p42Var.T(view, O);
    }

    @Override
    public final boolean h(long j, int i, int i2, int i3, lab labVar) {
        v82 v82Var = (v82) ((u82) this.b).T;
        ImageReceiver imageReceiver = v82Var.a;
        labVar.c = imageReceiver;
        labVar.l = imageReceiver;
        u82 u82Var = v82Var.H;
        labVar.m = u82Var;
        boolean z = u82Var.w;
        v82 v82Var2 = v82Var.L.e;
        labVar.a = v82Var2;
        labVar.k = v82Var2.getAlpha();
        labVar.h = 0.0f;
        labVar.i = gm.q.y;
        labVar.g = (View) v82Var.getParent();
        return true;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        ck1 ck1Var = (ck1) this.b;
        c6c c6cVar = (c6c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        ek1 ek1Var = ck1Var.f;
        Object obj3 = c6cVar.H;
        if (obj3 instanceof TL_stars.StarsTransaction) {
            nxa.l1(ck1Var.getContext(), true, ek1Var.e, ck1Var.c, (TL_stars.StarsTransaction) c6cVar.H, ck1Var.b);
        } else if (obj3 instanceof TL_stats.BroadcastRevenueTransaction) {
            ik1.N(ck1Var.getContext(), ck1Var.c, (TL_stats.BroadcastRevenueTransaction) c6cVar.H, ek1Var.e, ck1Var.b);
        }
    }

    @Override
    public final void l() {
        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) this.b;
        int i = ChatsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.F);
        chatsWidgetConfigActivity.setResult(-1, intent);
        chatsWidgetConfigActivity.finish();
    }

    @Override
    public final void o(Exception exc) {
        ((er0) this.b).setClickable(false);
    }

    @Override
    public final void onComplete(Object obj) {
        uf2 uf2Var = (uf2) this.b;
        Pair pair = (Pair) obj;
        if (pair != null) {
            uf2Var.a.put((Long) pair.first, (Bitmap) pair.second);
        }
    }

    @Override
    public final void onFinishVideoRecording(String str, long j) {
        int i;
        int i2;
        jo6 jo6Var;
        b62 b62Var = (b62) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = b62Var.e;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        if (b62Var.a != null && !i22Var.P1 && chatAttachAlertPhotoLayout.Q != null) {
            ChatAttachAlertPhotoLayout.r1 = false;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
                i = options.outWidth;
                try {
                    i2 = options.outHeight;
                } catch (Exception unused) {
                    i2 = 0;
                    int i3 = i;
                    int i4 = ChatAttachAlertPhotoLayout.v1;
                    ChatAttachAlertPhotoLayout.v1 = i4 - 1;
                    jo6Var = new jo6(i4, b62Var.a.getAbsolutePath(), 0, true, i3, i2);
                    jo6Var.E = (int) (((float) j) / 1000.0f);
                    jo6Var.c = str;
                    if (i22Var.N2 != 0) {
                        ao6 ao6Var = new ao6();
                        jo6Var.A = ao6Var;
                        ao6Var.l = true;
                        ao6Var.u = false;
                        ao6Var.v = 1.0f;
                    }
                    chatAttachAlertPhotoLayout.m0(jo6Var, false, false);
                }
            } catch (Exception unused2) {
                i = 0;
            }
            int i32 = i;
            int i42 = ChatAttachAlertPhotoLayout.v1;
            ChatAttachAlertPhotoLayout.v1 = i42 - 1;
            jo6Var = new jo6(i42, b62Var.a.getAbsolutePath(), 0, true, i32, i2);
            jo6Var.E = (int) (((float) j) / 1000.0f);
            jo6Var.c = str;
            if (i22Var.N2 != 0 && chatAttachAlertPhotoLayout.Q.isFrontface()) {
                ao6 ao6Var2 = new ao6();
                jo6Var.A = ao6Var2;
                ao6Var2.l = true;
                ao6Var2.u = false;
                ao6Var2.v = 1.0f;
            }
            chatAttachAlertPhotoLayout.m0(jo6Var, false, false);
        }
    }

    @Override
    public final void q0(long j, int i, j48 j48Var) {
        j48Var.run();
    }

    @Override
    public final void r(he heVar, int i) {
        int i2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                ((fj1) obj).i0(heVar);
                return;
            case 7:
                ((ho1) obj).run();
                return;
            case 9:
                yv1 yv1Var = ((nr1) obj).b;
                yv1Var.finishFragment();
                yv1Var.getNotificationCenter().k(128, yv1Var.e4);
                return;
            case 13:
                yv1 yv1Var2 = ((cu1) obj).a.R;
                i2 = ((d) yv1Var2).currentAccount;
                uf2.e(i2).a(yv1Var2.l6, true, true);
                return;
            case 14:
                ((nz1) obj).a.V0.p();
                return;
            case 16:
                ((lx1) obj).run();
                oc7.d1().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 20:
                ((v72) obj).b.dismiss();
                return;
            case 21:
                ((d72) obj).a.F.p();
                return;
            case 23:
                ((ha2) obj).b.e0();
                return;
            case 24:
                ib2 ib2Var = (ib2) obj;
                boolean z = ib2Var.s;
                if (!z || ib2Var.h.linked_chat_id != 0) {
                    he[] heVarArr = {new he(3, null, ib2Var.getParentActivity())};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z) {
                        tL_channels_setDiscussionGroup.broadcast = oc7.h1(ib2Var.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = oc7.h1(ib2Var.f);
                    }
                    gm.d3(new xa2(ib2Var, heVarArr, ib2Var.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new pm(ib2Var, heVarArr, (byte) 21)), (byte) 0), 500L);
                    return;
                }
                return;
            default:
                ((fi) obj).a(1);
                return;
        }
    }

    @Override
    public final boolean run() {
        TLRPC.Message message;
        dd5 dd5Var;
        rc2 rc2Var = (rc2) this.b;
        k47 k47Var = rc2Var.Q5;
        if (k47Var != null && (message = k47Var.k) != null) {
            if (k47Var.D != 29 || ((dd5Var = rc2Var.X5) != null && dd5Var.i)) {
                if ((message.noforwards && !k47.c3(message)) || rc2Var.Q5.R4() || rc2Var.Q5.y2()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void z(boolean z) {
        tk5 tk5Var;
        tk5 tk5Var2;
        tk5 tk5Var3;
        tk5 tk5Var4;
        tk5 tk5Var5;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 10:
                yv1 yv1Var = ((mr1) obj).b.b;
                yv1Var.Ha(yv1Var.s4, true);
                return;
            case 11:
                yv1 yv1Var2 = ((wt1) obj).m1;
                if (z) {
                    yv1Var2.i6();
                    UndoView undoView = yv1Var2.N3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        return;
                    }
                    return;
                }
                return;
            default:
                wg2 wg2Var = ((og2) obj).m1;
                if (z) {
                    tk5Var = ((d) wg2Var).parentLayout;
                    if (tk5Var != null) {
                        tk5Var2 = ((d) wg2Var).parentLayout;
                        List fragmentStack = tk5Var2.getFragmentStack();
                        tk5Var3 = ((d) wg2Var).parentLayout;
                        d dVar = (d) fragmentStack.get(tk5Var3.getFragmentStack().size() - 2);
                        if (dVar instanceof ba2) {
                            dVar.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", wg2Var.N);
                            ba2 ba2Var = new ba2(bundle);
                            ba2Var.q0(wg2Var.r);
                            tk5Var4 = ((d) wg2Var).parentLayout;
                            tk5Var5 = ((d) wg2Var).parentLayout;
                            ((ActionBarLayout) tk5Var4).b(tk5Var5.getFragmentStack().size() - 1, ba2Var);
                            wg2Var.finishFragment();
                            ba2Var.c.j(76, 0L, null);
                            return;
                        }
                        wg2Var.finishFragment();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
    }

    public cd1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void e(boolean z) {
    }

    @Override
    public final void onError(Throwable th) {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }
}
