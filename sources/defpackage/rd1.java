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
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ChatsWidgetConfigActivity;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.p;
import org.telegram.ui.LaunchActivity;
public final class rd1 implements t93, fd, ncc, on5, dz5, l39, bf7, cq0, gq5, t69, CameraController.VideoTakeCallback, b88, hcb, kk4, ResultCallback, nu3, n7 {
    public final byte a;
    public final Object b;

    public rd1(nq1 nq1Var, boolean z) {
        this.a = (byte) 9;
        this.b = nq1Var;
    }

    @Override
    public final void A(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 9:
                zu1 zu1Var = ((nq1) obj).b.b;
                zu1Var.Ia(zu1Var.s4, true);
                return;
            case 10:
                zu1 zu1Var2 = ((xs1) obj).m1;
                if (z) {
                    zu1Var2.i6();
                    UndoView undoView = zu1Var2.N3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        return;
                    }
                    return;
                }
                return;
            default:
                bg2 bg2Var = ((tf2) obj).m1;
                if (z && bg2.b0(bg2Var) != null) {
                    e eVar = (e) bg2.d0(bg2Var).getFragmentStack().get(bg2.c0(bg2Var).getFragmentStack().size() - 2);
                    if (eVar instanceof g92) {
                        eVar.removeSelfFromStack();
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", bg2Var.N);
                        g92 g92Var = new g92(bundle);
                        g92Var.p0(bg2Var.r);
                        ((ActionBarLayout) bg2.f0(bg2Var)).b(bg2.e0(bg2Var).getFragmentStack().size() - 1, g92Var);
                        bg2Var.finishFragment();
                        g92Var.c.j(76, 0L, null);
                        return;
                    }
                    bg2Var.finishFragment();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean a(kj4 kj4Var, int i, Bundle bundle) {
        wy1 wy1Var = (wy1) this.b;
        ChatActivityEnterView chatActivityEnterView = wy1Var.g2;
        if (chatActivityEnterView.T7) {
            return true;
        }
        int i2 = c11.a;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                ((iq5) kj4Var.b).g();
            } catch (Exception unused) {
                return false;
            }
        }
        iq5 iq5Var = (iq5) kj4Var.b;
        if (!iq5Var.getDescription().hasMimeType("image/gif") && !r7a.w0(iq5Var.e(), null)) {
            wy1Var.J(iq5Var.e(), iq5Var.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            jj.J(chatActivityEnterView.D3, chatActivityEnterView.E3.a(), new h01(wy1Var, kj4Var, (byte) 23), chatActivityEnterView.K4);
            return true;
        } else {
            wy1Var.L(kj4Var, true, 0, 0);
            return true;
        }
    }

    @Override
    public final void b(u93 u93Var) {
        ce1 ce1Var = (ce1) u93Var;
        ce1Var.clear();
        ((de1) this.b).b.add(ce1Var);
    }

    @Override
    public final void c(ArrayList arrayList) {
        jp1 jp1Var = (jp1) this.b;
        zu1 zu1Var = jp1Var.p;
        if (zu1Var.getParentActivity() != null && zu1Var.getParentActivity() != null) {
            ip1 ip1Var = new ip1(jp1Var, zu1Var, zu1Var.getParentActivity(), zu1Var.Ba, arrayList);
            boolean Y7 = zu1Var.Y7();
            ip1Var.i0 = Y7;
            ip1Var.n = Y7;
            ip1Var.p0 = false;
            zu1Var.M5(false);
            zu1Var.showDialog(ip1Var);
        }
    }

    public final sd1 d(rx6 rx6Var) {
        InputStream inputStream;
        td1 td1Var = (td1) this.b;
        URL url = (URL) rx6Var.b;
        String c = pse.c("CctTransportBackend");
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
        String str = (String) rx6Var.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                kj4 kj4Var = td1Var.a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                vw5 vw5Var = (vw5) kj4Var.b;
                bx5 bx5Var = new bx5(bufferedWriter, vw5Var.a, vw5Var.b, vw5Var.c, vw5Var.d);
                bx5Var.h((y70) rx6Var.c);
                bx5Var.j();
                bx5Var.b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c2 = pse.c("CctTransportBackend");
                if (Log.isLoggable(c2, 4)) {
                    Log.i(c2, String.format("Status Code: %d", valueOf));
                }
                pse.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                pse.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new sd1(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        sd1 sd1Var = new sd1(responseCode, null, ea0.a(new BufferedReader(new InputStreamReader(inputStream))).a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return sd1Var;
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
                return new sd1(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
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
        } catch (ConnectException e) {
            e = e;
            pse.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new sd1(500, null, 0L);
        } catch (UnknownHostException e2) {
            e = e2;
            pse.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new sd1(500, null, 0L);
        } catch (IOException e3) {
            e = e3;
            pse.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new sd1(400, null, 0L);
        } catch (o34 e4) {
            e = e4;
            pse.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new sd1(400, null, 0L);
        }
    }

    @Override
    public final boolean e(int i, View view) {
        Object O;
        u32 u32Var = (u32) this.b;
        j79 adapter = u32Var.r.getAdapter();
        m32 m32Var = u32Var.w;
        if (adapter == m32Var) {
            O = m32Var.E(i);
        } else {
            t32 t32Var = u32Var.E;
            O = t32Var.O(t32Var.S(i), t32Var.Q(i));
        }
        return u32Var.T(view, O);
    }

    @Override
    public final void g(int i) {
        hm2 hm2Var = ((p) this.b).a;
        boolean z = true;
        if (i != 1 && i != 2) {
            if (i == 3) {
                hm2Var.b();
                return;
            }
            return;
        }
        if (i != 2) {
            z = false;
        }
        hm2Var.a(z);
    }

    @Override
    public final void h() {
        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) this.b;
        int i = ChatsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.F);
        chatsWidgetConfigActivity.setResult(-1, intent);
        chatsWidgetConfigActivity.finish();
    }

    public final void i(String str) {
        zu1 zu1Var = ((it1) this.b).R;
        if (str.startsWith("@")) {
            zu1Var.getMessagesController().H3(str.substring(1), zu1Var, 0, null);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                zu1Var.a0.L1(null, str, false, false);
                if (zu1Var.a0.getFieldText() == null) {
                    zu1Var.E7(false);
                    return;
                }
                return;
            }
            zu1Var.Pa(0, str, null, null, false);
        } else {
            uj3 uj3Var = new uj3(null);
            uj3Var.p2 = str;
            zu1Var.presentFragment(uj3Var);
        }
    }

    @Override
    public final boolean j(long j, int i, int i2, int i3, icb icbVar) {
        b82 b82Var = (b82) ((a82) this.b).T;
        ImageReceiver imageReceiver = b82Var.a;
        icbVar.c = imageReceiver;
        icbVar.l = imageReceiver;
        a82 a82Var = b82Var.H;
        icbVar.m = a82Var;
        boolean z = a82Var.w;
        b82 b82Var2 = b82Var.L.e;
        icbVar.a = b82Var2;
        icbVar.k = b82Var2.getAlpha();
        icbVar.h = 0.0f;
        icbVar.i = hl.q.y;
        icbVar.g = (View) b82Var.getParent();
        return true;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        cj1 cj1Var = (cj1) this.b;
        b8c b8cVar = (b8c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        ej1 ej1Var = cj1Var.f;
        Object obj3 = b8cVar.H;
        if (obj3 instanceof TL_stars.StarsTransaction) {
            nza.l1(cj1Var.getContext(), true, ej1Var.e, cj1Var.c, (TL_stars.StarsTransaction) b8cVar.H, cj1Var.b);
        } else if (obj3 instanceof TL_stats.BroadcastRevenueTransaction) {
            ij1.N(cj1Var.getContext(), cj1Var.c, (TL_stats.BroadcastRevenueTransaction) b8cVar.H, ej1Var.e, cj1Var.b);
        }
    }

    @Override
    public final void l(Exception exc) {
        ((eq0) this.b).setClickable(false);
    }

    @Override
    public final void onComplete(Object obj) {
        af2 af2Var = (af2) this.b;
        Pair pair = (Pair) obj;
        if (pair != null) {
            af2Var.a.put((Long) pair.first, (Bitmap) pair.second);
        }
    }

    @Override
    public final void onFinishVideoRecording(String str, long j) {
        int i;
        int i2;
        no6 no6Var;
        g52 g52Var = (g52) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = g52Var.e;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        if (g52Var.a != null && !n12Var.P1 && chatAttachAlertPhotoLayout.Q != null) {
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
                    no6Var = new no6(i4, g52Var.a.getAbsolutePath(), 0, true, i3, i2);
                    no6Var.E = (int) (((float) j) / 1000.0f);
                    no6Var.c = str;
                    if (n12Var.N2 != 0) {
                        fo6 fo6Var = new fo6();
                        no6Var.A = fo6Var;
                        fo6Var.l = true;
                        fo6Var.u = false;
                        fo6Var.v = 1.0f;
                    }
                    chatAttachAlertPhotoLayout.l0(no6Var, false, false);
                }
            } catch (Exception unused2) {
                i = 0;
            }
            int i32 = i;
            int i42 = ChatAttachAlertPhotoLayout.v1;
            ChatAttachAlertPhotoLayout.v1 = i42 - 1;
            no6Var = new no6(i42, g52Var.a.getAbsolutePath(), 0, true, i32, i2);
            no6Var.E = (int) (((float) j) / 1000.0f);
            no6Var.c = str;
            if (n12Var.N2 != 0 && chatAttachAlertPhotoLayout.Q.isFrontface()) {
                fo6 fo6Var2 = new fo6();
                no6Var.A = fo6Var2;
                fo6Var2.l = true;
                fo6Var2.u = false;
                fo6Var2.v = 1.0f;
            }
            chatAttachAlertPhotoLayout.l0(no6Var, false, false);
        }
    }

    @Override
    public final boolean run() {
        TLRPC.Message message;
        hd5 hd5Var;
        wb2 wb2Var = (wb2) this.b;
        r47 r47Var = wb2Var.Q5;
        if (r47Var != null && (message = r47Var.k) != null) {
            if (r47Var.D != 29 || ((hd5Var = wb2Var.X5) != null && hd5Var.i)) {
                if ((message.noforwards && !r47.c3(message)) || wb2Var.Q5.R4() || wb2Var.Q5.y2()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        b29 y;
        al1 al1Var;
        dl1 dl1Var = (dl1) this.b;
        if (z && (y = dl1Var.J.y()) != null) {
            r47 r47Var = dl1Var.Q0;
            if (r47Var != null && !r47Var.o1) {
                r47Var.o1 = true;
                y.I(0, false, false);
                hl.c3(new zk1(y, (byte) 0));
                if (r47Var.n1 || dl1Var.M1) {
                    r47Var.n1 = false;
                    dl1Var.M1 = false;
                    try {
                        dl1Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (dl1Var.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) dl1Var.getContext()).w0.c(false);
                    }
                    TLRPC.VideoSize videoSize = dl1Var.J1;
                    if (videoSize != null && (al1Var = dl1Var.g1) != null) {
                        al1Var.q(dl1Var, dl1Var.I1, videoSize);
                    }
                }
            } else if (y.b0 < 1) {
                y.stop();
                y.I(y.e[0] - 1, false, false);
            }
        }
    }

    @Override
    public final void w(id idVar, int i) {
        int i2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                ((gi1) obj).h0(idVar);
                return;
            case 6:
                ((hm1) obj).run();
                return;
            case 8:
                zu1 zu1Var = ((oq1) obj).b;
                zu1Var.finishFragment();
                zu1Var.getNotificationCenter().k(128, zu1Var.e4);
                return;
            case 12:
                zu1 zu1Var2 = ((dt1) obj).a.R;
                i2 = ((e) zu1Var2).currentAccount;
                af2.e(i2).a(zu1Var2.l6, true, true);
                return;
            case 13:
                ((qy1) obj).a.V0.p();
                return;
            case 15:
                ((dy1) obj).run();
                uc7.e1().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 19:
                ((a72) obj).b.dismiss();
                return;
            case 20:
                ((i62) obj).a.F.p();
                return;
            case 22:
                ((m92) obj).b.d0();
                return;
            case 23:
                na2 na2Var = (na2) obj;
                boolean z = na2Var.s;
                if (!z || na2Var.h.linked_chat_id != 0) {
                    id[] idVarArr = {new id(3, null, na2Var.getParentActivity())};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z) {
                        tL_channels_setDiscussionGroup.broadcast = uc7.i1(na2Var.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = uc7.i1(na2Var.f);
                    }
                    hl.d3(new ba2(na2Var, idVarArr, na2Var.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ql(na2Var, idVarArr, (byte) 21)), (byte) 0), 500L);
                    return;
                }
                return;
            default:
                ((le) obj).a(1);
                return;
        }
    }

    @Override
    public final void x(long j, int i, x58 x58Var) {
        x58Var.run();
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
    }

    public rd1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void f(boolean z) {
    }

    @Override
    public final void onError(Throwable th) {
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }
}
