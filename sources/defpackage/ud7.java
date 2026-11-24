package defpackage;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.SurfaceView;
import android.webkit.WebResourceRequest;
import android.widget.ImageView;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.p;
public final class ud7 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ud7(i58 i58Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        this.a = (byte) 22;
        this.b = i58Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    private final void a() {
        int i;
        cf7 cf7Var = (cf7) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        i77 i77Var = (i77) this.d;
        cf7Var.getClass();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
            if (ephemeralMessage.top_msg_id == 0) {
                TL_ephemeral.EphemeralMessage U = cf7Var.U(ephemeralMessage.id, pg3.n(ephemeralMessage.peer_id));
                if (U != null && (i = U.top_msg_id) != 0) {
                    ephemeralMessage.top_msg_id = i;
                    TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
                    if (messageReplyHeader != null) {
                        messageReplyHeader.forum_topic = true;
                    }
                    ephemeralMessage.flags |= 2;
                }
            }
        }
        cf7Var.d1(arrayList, true);
        i77Var.run();
    }

    private final void b() {
        gm.c3(new bl7((u35) this.d, cf7.Y(((ml7) this.b).a).g0(((TLRPC.TL_contact) this.c).user_id), (byte) 4));
    }

    private final void c() {
        TLRPC.User user;
        ml7 ml7Var = (ml7) this.b;
        TLObject tLObject = (TLObject) this.c;
        u35 u35Var = (u35) this.d;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            oc7.r1(ml7Var.a).d4(tL_contacts_resolvedPeer.users, false);
            oc7.r1(ml7Var.a).X3(tL_contacts_resolvedPeer.chats, false);
            long n = pg3.n(tL_contacts_resolvedPeer.peer);
            if (n >= 0) {
                user = oc7.r1(ml7Var.a).W1(Long.valueOf(n));
                u35Var.a(user);
            }
        }
        user = null;
        u35Var.a(user);
    }

    private final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud7.d():void");
    }

    private final void e() {
        boolean[] zArr = (boolean[]) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        tp7 tp7Var = (tp7) this.d;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
        }
        tp7Var.a(0L);
    }

    private final void f() {
        boolean[] zArr = (boolean[]) this.b;
        k11 k11Var = (k11) this.c;
        he heVar = (he) this.d;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        k11Var.c(false);
        heVar.dismiss();
    }

    private final void g() {
        ((ss7) this.b).h0((TLObject) this.d, (TLRPC.TL_error) this.c);
    }

    private final void h() {
        String G;
        xz7 xz7Var = (xz7) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        xz7Var.A1();
        if (tL_error == null) {
            TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xz7Var.getParentActivity());
            String a0 = jb6.a0("RestoreEmailSent", null, 2131745813, tL_auth_passwordRecovery.email_pattern);
            he heVar = alertDialog$Builder.a;
            heVar.U = a0;
            heVar.S = jb6.M0(2131745811, null);
            alertDialog$Builder.j(jb6.M0(2131747564, null), new cz6(xz7Var, tL_auth_passwordRecovery, (byte) 11));
            Dialog showDialog = xz7Var.showDialog(heVar);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = jb6.G(intValue, "Seconds", new Object[0]);
            } else {
                G = jb6.G(intValue / 60, "Minutes", new Object[0]);
            }
            xz7Var.P1(jb6.M0(2131689472, null), jb6.a0("FloodWaitTime", null, 2131750618, G));
        } else {
            xz7Var.P1(jb6.M0(2131689472, null), tL_error.text);
        }
    }

    private final void i() {
        ((wm4) this.b).b0(((TLRPC.TL_error) this.d).text, (String) this.c);
    }

    private final void j() {
        int i;
        nz7 nz7Var = (nz7) this.b;
        byte[] bArr = (byte[]) this.d;
        String str = (String) this.c;
        SecureRandom secureRandom = Utilities.b;
        xz7 xz7Var = nz7Var.e;
        secureRandom.setSeed(xz7Var.K.secure_random);
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        TL_account.Password password = xz7Var.K;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = nq9.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        byte[] j1 = xz7.j1();
        xz7Var.d1 = j1;
        xz7Var.c1 = Utilities.g(Utilities.o(32L, j1));
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = xz7Var.K.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] m = Utilities.m(gm.g1(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
            xz7Var.f1 = m;
            byte[] bArr2 = new byte[32];
            System.arraycopy(m, 0, bArr2, 0, 32);
            byte[] bArr3 = new byte[16];
            System.arraycopy(xz7Var.f1, 32, bArr3, 0, 16);
            byte[] bArr4 = xz7Var.d1;
            Utilities.b(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
            updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
            TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
            tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
            tL_secureSecretSettings.secure_secret = xz7Var.d1;
            tL_secureSecretSettings.secure_secret_id = xz7Var.c1;
            passwordinputsettings.flags |= 4;
        }
        i = ((d) xz7Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(updatepasswordsettings, new lz7(nz7Var, (byte) 2));
    }

    private final void k() {
        int i;
        int i2;
        int i3;
        tz7 tz7Var = (tz7) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.d;
        int i4 = tz7Var.M;
        xz7 xz7Var = tz7Var.R;
        xz7Var.A1();
        tz7Var.K = false;
        if (tL_error == null) {
            tz7Var.r();
            tz7Var.q();
            xz7Var.C1.c(xz7Var.F, (String) xz7Var.t1.get("phone"), null, null, null, null, null, null, null, null, new ny7(xz7Var, (byte) 6), null);
            return;
        }
        tz7Var.L = tL_error.text;
        if ((i4 == 3 && ((i3 = tz7Var.N) == 4 || i3 == 2)) || ((i4 == 2 && ((i = tz7Var.N) == 4 || i == 3)) || (i4 == 4 && tz7Var.N == 2))) {
            tz7Var.p();
        }
        if (i4 == 2) {
            gm.y3(true);
            nm7.e().a(tz7Var, nm7.k4);
        } else if (i4 == 3) {
            gm.x3(true);
            nm7.e().a(tz7Var, nm7.l4);
        }
        tz7Var.J = true;
        if (i4 != 3) {
            i2 = ((d) xz7Var).currentAccount;
            ik.c0(i2, tL_error, xz7Var, verifyphone, new Object[0]);
        }
        xz7Var.Q1(true, false);
        if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                tz7Var.d(true);
                xz7Var.N1(null, 0, true);
                return;
            }
            return;
        }
        int i5 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = tz7Var.d;
            if (i5 < editTextBoldCursorArr.length) {
                editTextBoldCursorArr[i5].setText("");
                i5++;
            } else {
                editTextBoldCursorArr[0].requestFocus();
                return;
            }
        }
    }

    private final void l() {
        ((p) this.b).m0((TL_account.Password) this.c, (byte[]) this.d);
    }

    private final void m() {
        ((p) this.b).u0((TLRPC.TL_error) this.c, (TLRPC.TL_payments_sendPaymentForm) this.d);
    }

    private final void n() {
        p pVar = (p) this.b;
        pVar.getClass();
        pVar.F0 = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
        ((bl7) this.d).run();
        pVar.J0(false);
        pVar.N0(true, false);
    }

    private final void o() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud7.o():void");
    }

    private final void p() {
        v48 v48Var = (v48) this.b;
        r63 r63Var = (r63) this.c;
        a58 a58Var = v48Var.x;
        ik.P(a58Var.getContext(), null, r63Var, new wu2(v48Var, (TL_stories.StoryItem) this.d, r63Var, (byte) 22));
        v48 v48Var2 = a58Var.j1;
        if (v48Var2 != null) {
            v48Var2.a();
        }
    }

    private final void q() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        t3b t3bVar = (t3b) this.b;
        TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.c;
        qac qacVar = (qac) this.d;
        for (int i = 0; i < t3bVar.i.size(); i++) {
            k47 k47Var = (k47) t3bVar.i.get(i);
            if (k47Var != null && (storyItem = k47Var.l) != null && (messageMedia = storyItem.media) != null && (document = storyItem2.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                qacVar.a(document2);
                return;
            }
        }
        qacVar.a(null);
    }

    private final void r() {
        i58 i58Var = (i58) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (tL_error == null) {
            i58Var.r1 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull M0 = oc7.r1(i58Var.a).M0(i58Var.p1);
            if (M0 != null) {
                M0.exported_invite = i58Var.r1;
            }
            i58Var.o1.setLink(i58Var.r1.link);
        }
        i58Var.q1 = false;
    }

    private final void s() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        boolean[] zArr = (boolean[]) this.c;
        j88 j88Var = (j88) this.d;
        Drawable[] drawableArr = PhotoViewer.d9;
        if (!zArr[0]) {
            ImageView imageView = photoViewer.x3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            SurfaceView surfaceView = photoViewer.D2;
            if (surfaceView != null) {
                surfaceView.setVisibility(4);
            }
            zArr[0] = true;
            j88Var.run();
        }
    }

    private final void t() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        n88 n88Var = (n88) this.d;
        Drawable[] drawableArr = PhotoViewer.d9;
        photoViewer.B4.f0((Bitmap) this.c);
        photoViewer.s5.setUndoCutState(true);
        photoViewer.k2(true, true);
        gm.r(n88Var);
        gm.d3(n88Var, 800L);
    }

    private final void u() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        String str = (String) this.c;
        Drawable[] drawableArr = PhotoViewer.d9;
        ((jn5) this.d).a();
        if (str.equals(photoViewer.B4.R)) {
            photoViewer.v4 = (byte) 2;
            photoViewer.w4 = str;
        }
    }

    private final void v() {
        ab8 ab8Var = (ab8) this.b;
        ab8 ab8Var2 = (ab8) this.c;
        int[] iArr = (int[]) this.d;
        PhotoViewer photoViewer = ab8Var.d;
        if (photoViewer.E != null && ab8Var2 == photoViewer.C8) {
            photoViewer.C8 = null;
            photoViewer.v8 = iArr[5];
            photoViewer.n8 = iArr[4];
            photoViewer.o8 = iArr[7];
            PhotoViewer photoViewer2 = ab8Var.d;
            photoViewer.w8 = ((photoViewer.l8 / 8) * photoViewer2.n8) / 1000.0f;
            boolean z = photoViewer2.p8;
            PhotoViewer photoViewer3 = ab8Var.d;
            boolean z2 = false;
            if (z) {
                photoViewer3.g8 = iArr[8];
                photoViewer3.S2();
                if (ab8Var.d.d8 > ab8Var.d.e8 - 1) {
                    PhotoViewer photoViewer4 = ab8Var.d;
                    photoViewer4.d8 = photoViewer4.e8 - 1;
                }
                PhotoViewer photoViewer5 = ab8Var.d;
                if (!photoViewer5.I4) {
                    kcc kccVar = photoViewer5.k1;
                    if (photoViewer5.e8 > 1) {
                        z2 = true;
                    }
                    PhotoViewer photoViewer6 = ab8Var.d;
                    kccVar.a(Math.min(photoViewer6.j8, ab8Var.d.k8), z2, photoViewer6.r);
                }
                if (e21.a) {
                    StringBuilder sb = new StringBuilder("compressionsCount = ");
                    sb.append(ab8Var.d.e8);
                    sb.append(" w = ");
                    sb.append(ab8Var.d.h8);
                    sb.append(" h = ");
                    sb.append(ab8Var.d.i8);
                    sb.append(" r = ");
                    b10.p(ab8Var.d.g8, sb);
                }
                ab8Var.d.T7.invalidate();
            } else {
                if (!photoViewer3.I4) {
                    photoViewer3.k1.a(Math.min(photoViewer3.j8, ab8Var.d.k8), false, photoViewer3.r);
                }
                ab8Var.d.e8 = 0;
            }
            ab8Var.d.P2();
            ab8Var.d.J2();
        }
    }

    private final void w() {
        InputStream errorStream;
        JSONObject optJSONObject;
        String optString;
        String str = (String) this.c;
        WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
        ya8 ya8Var = (ya8) ((sv) this.b).b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject put = new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0");
            outputStream.write(jSONObject.put("context", jSONObject2.put("client", put.put("originalUrl", "https://www.youtube.com/watch?v=" + ya8Var.x).put("platform", "DESKTOP"))).put("videoId", ya8Var.x).toString().getBytes("UTF-8"));
            outputStream.close();
            if (httpURLConnection.getResponseCode() == 200) {
                errorStream = httpURLConnection.getInputStream();
            } else {
                errorStream = httpURLConnection.getErrorStream();
            }
            byte[] bArr = new byte[10240];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = errorStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.close();
            errorStream.close();
            JSONObject optJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) != null && (optString = optJSONObject.optString("spec")) != null) {
                if (ya8Var.I == 0) {
                    ya8Var.s = optString;
                } else {
                    ya8Var.g(optString);
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    private final void x() {
        nv1 nv1Var;
        TLRPC.Message message;
        xg8 xg8Var = (xg8) this.b;
        yv1 yv1Var = (yv1) this.c;
        k47 k47Var = xg8Var.I;
        byte[] bArr = ((TLRPC.PollAnswer) this.d).option;
        if (k47Var != null && (message = k47Var.k) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
            k47.B0(message);
            ?? obj = new Object();
            obj.a = k47Var;
            obj.b = -1;
            obj.c = -1;
            obj.h = true;
            obj.e = bArr;
            obj.f();
            nv1Var = obj;
        } else {
            nv1Var = null;
        }
        yv1Var.ec(k47Var, nv1Var);
        xg8Var.b(false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud7.run():void");
    }

    public ud7(byte b, Object obj, Object obj2, String str) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = str;
    }

    public ud7(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
