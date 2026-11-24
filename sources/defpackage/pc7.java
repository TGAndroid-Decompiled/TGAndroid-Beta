package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;
public final class pc7 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public pc7(g38 g38Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        this.a = (byte) 19;
        this.b = g38Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc7.a():void");
    }

    private final void b() {
        ((wk4) this.b).a0(((TLRPC.TL_error) this.c).text, (String) this.d);
    }

    private final void c() {
        int i;
        lx7 lx7Var = (lx7) this.b;
        byte[] bArr = (byte[]) this.c;
        String str = (String) this.d;
        SecureRandom secureRandom = Utilities.b;
        vx7 vx7Var = lx7Var.e;
        secureRandom.setSeed(vx7Var.K.secure_random);
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        TL_account.Password password = vx7Var.K;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = mo9.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        byte[] i1 = vx7.i1();
        vx7Var.d1 = i1;
        vx7Var.c1 = Utilities.g(Utilities.o(32L, i1));
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = vx7Var.K.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] m = Utilities.m(gl.g1(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
            vx7Var.f1 = m;
            byte[] bArr2 = new byte[32];
            System.arraycopy(m, 0, bArr2, 0, 32);
            byte[] bArr3 = new byte[16];
            System.arraycopy(vx7Var.f1, 32, bArr3, 0, 16);
            byte[] bArr4 = vx7Var.d1;
            Utilities.b(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
            updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
            TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
            tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
            tL_secureSecretSettings.secure_secret = vx7Var.d1;
            tL_secureSecretSettings.secure_secret_id = vx7Var.c1;
            passwordinputsettings.flags |= 4;
        }
        i = ((d) vx7Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(updatepasswordsettings, new jx7(lx7Var, (byte) 2));
    }

    private final void d() {
        int i;
        int i2;
        int i3;
        rx7 rx7Var = (rx7) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.d;
        int i4 = rx7Var.M;
        vx7 vx7Var = rx7Var.R;
        vx7Var.z1();
        rx7Var.K = false;
        if (tL_error == null) {
            rx7Var.r();
            rx7Var.q();
            vx7Var.C1.c(vx7Var.F, (String) vx7Var.t1.get("phone"), null, null, null, null, null, null, null, null, new kw7(vx7Var, (byte) 6), null);
            return;
        }
        rx7Var.L = tL_error.text;
        if ((i4 == 3 && ((i3 = rx7Var.N) == 4 || i3 == 2)) || ((i4 == 2 && ((i = rx7Var.N) == 4 || i == 3)) || (i4 == 4 && rx7Var.N == 2))) {
            rx7Var.p();
        }
        if (i4 == 2) {
            gl.z3(true);
            kk7.e().a(rx7Var, kk7.i4);
        } else if (i4 == 3) {
            gl.y3(true);
            kk7.e().a(rx7Var, kk7.j4);
        }
        rx7Var.J = true;
        if (i4 != 3) {
            i2 = ((d) vx7Var).currentAccount;
            ij.c0(i2, tL_error, vx7Var, verifyphone, new Object[0]);
        }
        vx7Var.P1(true, false);
        if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                rx7Var.d(true);
                vx7Var.M1(null, 0, true);
                return;
            }
            return;
        }
        int i5 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = rx7Var.d;
            if (i5 < editTextBoldCursorArr.length) {
                editTextBoldCursorArr[i5].setText("");
                i5++;
            } else {
                editTextBoldCursorArr[0].requestFocus();
                return;
            }
        }
    }

    private final void e() {
        ((p) this.b).t0((TLRPC.TL_error) this.c, (TLRPC.TL_payments_sendPaymentForm) this.d);
    }

    private final void f() {
        p pVar = (p) this.b;
        pVar.getClass();
        pVar.F0 = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
        ((bj7) this.d).run();
        pVar.I0(false);
        pVar.M0(true, false);
    }

    private final void g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc7.g():void");
    }

    private final void h() {
        s28 s28Var = (s28) this.b;
        f53 f53Var = (f53) this.c;
        y28 y28Var = s28Var.x;
        ij.P(y28Var.getContext(), null, f53Var, new lt2(s28Var, (TL_stories.StoryItem) this.d, f53Var, (byte) 22));
        s28 s28Var2 = y28Var.j1;
        if (s28Var2 != null) {
            s28Var2.a();
        }
    }

    private final void i() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        s1b s1bVar = (s1b) this.b;
        TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.c;
        p8c p8cVar = (p8c) this.d;
        for (int i = 0; i < s1bVar.i.size(); i++) {
            k27 k27Var = (k27) s1bVar.i.get(i);
            if (k27Var != null && (storyItem = k27Var.l) != null && (messageMedia = storyItem.media) != null && (document = storyItem2.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                p8cVar.a(document2);
                return;
            }
        }
        p8cVar.a(null);
    }

    private final void j() {
        g38 g38Var = (g38) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (tL_error == null) {
            g38Var.r1 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull L0 = na7.q1(g38Var.a).L0(g38Var.p1);
            if (L0 != null) {
                L0.exported_invite = g38Var.r1;
            }
            g38Var.o1.setLink(g38Var.r1.link);
        }
        g38Var.q1 = false;
    }

    private final void k() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        boolean[] zArr = (boolean[]) this.c;
        h68 h68Var = (h68) this.d;
        Drawable[] drawableArr = PhotoViewer.f9;
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
            h68Var.run();
        }
    }

    private final void l() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        String str = (String) this.d;
        Drawable[] drawableArr = PhotoViewer.f9;
        ((jl5) this.c).a();
        if (str.equals(photoViewer.C4.R)) {
            photoViewer.w4 = (byte) 2;
            photoViewer.x4 = str;
        }
    }

    private final void m() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        l68 l68Var = (l68) this.d;
        Drawable[] drawableArr = PhotoViewer.f9;
        photoViewer.C4.f0((Bitmap) this.c);
        photoViewer.t5.setUndoCutState(true);
        photoViewer.j2(true, true);
        gl.r(l68Var);
        gl.e3(l68Var, 800L);
    }

    private final void n() {
        y88 y88Var = (y88) this.b;
        y88 y88Var2 = (y88) this.c;
        int[] iArr = (int[]) this.d;
        PhotoViewer photoViewer = y88Var.d;
        if (photoViewer.E != null && y88Var2 == photoViewer.D8) {
            photoViewer.D8 = null;
            photoViewer.w8 = iArr[5];
            photoViewer.o8 = iArr[4];
            photoViewer.p8 = iArr[7];
            PhotoViewer photoViewer2 = y88Var.d;
            photoViewer.x8 = ((photoViewer.m8 / 8) * photoViewer2.o8) / 1000.0f;
            boolean z = photoViewer2.q8;
            PhotoViewer photoViewer3 = y88Var.d;
            boolean z2 = false;
            if (z) {
                photoViewer3.h8 = iArr[8];
                photoViewer3.R2();
                if (y88Var.d.e8 > y88Var.d.f8 - 1) {
                    PhotoViewer photoViewer4 = y88Var.d;
                    photoViewer4.e8 = photoViewer4.f8 - 1;
                }
                PhotoViewer photoViewer5 = y88Var.d;
                if (!photoViewer5.J4) {
                    iac iacVar = photoViewer5.k1;
                    if (photoViewer5.f8 > 1) {
                        z2 = true;
                    }
                    PhotoViewer photoViewer6 = y88Var.d;
                    iacVar.a(Math.min(photoViewer6.k8, y88Var.d.l8), z2, photoViewer6.r);
                }
                if (w01.a) {
                    StringBuilder sb = new StringBuilder("compressionsCount = ");
                    sb.append(y88Var.d.f8);
                    sb.append(" w = ");
                    sb.append(y88Var.d.i8);
                    sb.append(" h = ");
                    sb.append(y88Var.d.j8);
                    sb.append(" r = ");
                    b00.p(y88Var.d.h8, sb);
                }
                y88Var.d.U7.invalidate();
            } else {
                if (!photoViewer3.J4) {
                    photoViewer3.k1.a(Math.min(photoViewer3.k8, y88Var.d.l8), false, photoViewer3.r);
                }
                y88Var.d.f8 = 0;
            }
            y88Var.d.O2();
            y88Var.d.I2();
        }
    }

    private final void o() {
        InputStream errorStream;
        JSONObject optJSONObject;
        String optString;
        String str = (String) this.c;
        WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
        x88 x88Var = (x88) ((su) this.b).b;
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
            outputStream.write(jSONObject.put("context", jSONObject2.put("client", put.put("originalUrl", "https://www.youtube.com/watch?v=" + x88Var.x).put("platform", "DESKTOP"))).put("videoId", x88Var.x).toString().getBytes("UTF-8"));
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
                if (x88Var.I == 0) {
                    x88Var.s = optString;
                } else {
                    x88Var.g(optString);
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    private final void p() {
        bu1 bu1Var;
        TLRPC.Message message;
        ve8 ve8Var = (ve8) this.b;
        mu1 mu1Var = (mu1) this.c;
        k27 k27Var = ve8Var.I;
        byte[] bArr = ((TLRPC.PollAnswer) this.d).option;
        if (k27Var != null && (message = k27Var.k) != null && (message.media instanceof TLRPC.TL_messageMediaPoll)) {
            k27.B0(message);
            ?? obj = new Object();
            obj.a = k27Var;
            obj.b = -1;
            obj.c = -1;
            obj.h = true;
            obj.e = bArr;
            obj.f();
            bu1Var = obj;
        } else {
            bu1Var = null;
        }
        mu1Var.Qb(k27Var, bu1Var);
        ve8Var.b(false);
    }

    private final void q() {
        gf8 gf8Var = (gf8) this.b;
        ff8 ff8Var = (ff8) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (gf8Var.isShowing()) {
            gf8Var.u1.remove(ff8Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                na7.q1(gf8Var.a).a4(tL_messages_votesList.users, false);
                ff8Var.b.addAll(tL_messages_votesList.votes);
                ff8Var.c = tL_messages_votesList.next_offset;
                gf8Var.D0(null);
                gf8Var.m1.X(true);
            }
        }
    }

    private final void r() {
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        premiumPreviewFragment.getClass();
        if (tL_error != null) {
            u21.e0(tL_error);
        } else if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            yjb.x(null, 2131743640, u21.b0(premiumPreviewFragment), null);
        }
    }

    private final void s() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        String str = (String) this.d;
        RectF rectF = ProfileActivity.Z6;
        if (gl.g((String) this.c)) {
            u21.b0(profileActivity).i(str).j();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc7.run():void");
    }

    public pc7(sm7 sm7Var, String str, ArrayList arrayList) {
        this.a = (byte) 4;
        this.b = sm7Var;
        this.d = str;
        this.c = arrayList;
    }

    public pc7(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
