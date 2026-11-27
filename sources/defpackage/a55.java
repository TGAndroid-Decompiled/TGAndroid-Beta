package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.Objects;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class a55 {
    public final int a;
    public final c b;
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int e;
    public final ConnectionsManager f;
    public w45 g;
    public boolean h;

    public a55(c cVar) {
        this.e = -1;
        int i = cVar.a;
        this.a = i;
        this.b = cVar;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        this.f = connectionsManager;
        if (this.e >= 0) {
            return;
        }
        this.e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new ic((byte) 0), new yt4(this, (byte) 7));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return ob6.M0(2131742603, null);
        }
        if (str.length() <= 10) {
            return str;
        }
        return str.substring(0, 4) + "…" + str.substring(str.length() - 4);
    }

    public static defpackage.jl7 D(android.content.Context r30, final int r31, final defpackage.v45 r32, final org.telegram.tgnet.TLRPC.TL_urlAuthResultRequest r33, final defpackage.vnb r34, final defpackage.o45 r35, final java.lang.Runnable r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a55.D(android.content.Context, int, v45, org.telegram.tgnet.TLRPC$TL_urlAuthResultRequest, vnb, o45, java.lang.Runnable):jl7");
    }

    public static LinearLayout F(Context context, String str, vnb vnbVar) {
        LinearLayout j = uh9.j(context, 1);
        int L = hl.L(16.0f);
        int i = aob.d6;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        j.setBackground(b0);
        yob.j(j, b0, M, null, vnbVar);
        mf5 mf5Var = new mf5(context, vnbVar);
        mf5Var.setText(str);
        j.addView(mf5Var, tre.o(-1, -2));
        return j;
    }

    public static void G(String str, JSONObject jSONObject) {
        H(str, jSONObject);
        String x = x("type", jSONObject);
        char c = 65535;
        switch (x.hashCode()) {
            case -1388966911:
                if (x.equals("binary")) {
                    c = 0;
                    break;
                }
                break;
            case 3049826:
                if (x.equals("cell")) {
                    c = 1;
                    break;
                }
                break;
            case 3556653:
                if (x.equals("text")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                String x2 = x("bytes", jSONObject);
                if (x2.matches("[A-Za-z0-9+/]*={0,2}") && Base64.encodeToString(Base64.decode(x2, 2), 2).replace("=", "").equals(x2.replace("=", ""))) {
                    return;
                }
                lq5.j("Invalid base64 data");
                return;
            case 1:
                x("schema", jSONObject);
                if (!WalletEngine2.isValidCellBoc(x("cell", jSONObject))) {
                    lq5.j("Invalid data cell");
                    return;
                }
                return;
            case 2:
                x("text", jSONObject);
                return;
            default:
                lq5.j("Unknown signing data type");
                return;
        }
    }

    public static void H(String str, JSONObject jSONObject) {
        if (jSONObject.has("network") && !"-239".equals(x("network", jSONObject))) {
            lq5.j("Wrong network");
        } else if (jSONObject.has("from") && !WalletEngine2.sameTonConnectAddress(x("from", jSONObject), str)) {
            lq5.j("Wrong signer");
        }
    }

    public static void I(org.json.JSONObject r10, java.lang.String r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a55.I(org.json.JSONObject, java.lang.String, int):void");
    }

    public static SpannableStringBuilder a(long j) {
        String s = c.s(j, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s);
        int indexOf = s.indexOf(46);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder.length(), 33);
        }
        if (spannableStringBuilder.length() == 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != 'x') {
            spannableStringBuilder.append((CharSequence) " x");
        }
        wm2 wm2Var = new wm2(2131232843, 2);
        wm2Var.d = false;
        wm2Var.c(hl.L(16.0f));
        spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static LinearLayout b(Context context, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, vnb vnbVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(hl.L(12.0f), hl.L(5.0f), hl.L(12.0f), hl.L(5.0f));
        ImageView imageView = new ImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-14899731, -15431455});
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(2131231960);
        imageView.setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
        linearLayout.addView(imageView, tre.q(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(48);
        TextView textView = new TextView(context);
        ik8.v(textView, 1, 16.0f);
        int i = aob.G6;
        yob.X(textView, i, vnbVar);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setText(charSequence);
        LinearLayout.LayoutParams o = tre.o(-1, -2);
        o.weight = 0.0f;
        linearLayout2.addView(textView, o);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            yob.X(textView2, aob.z6, vnbVar);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(charSequence2);
            linearLayout2.addView(textView2, tre.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(context);
            t37 t37Var = new t37(0, false, false, null);
            t37Var.x = false;
            t37Var.w = Integer.valueOf(aob.v0(aob.am, vnbVar));
            textView3.setBackground(t37Var);
            textView3.setPadding(hl.L(19.0f), hl.L(9.0f), hl.L(15.0f), hl.L(8.0f));
            textView3.setTextSize(1, 15.0f);
            yob.X(textView3, i, vnbVar);
            textView3.setMaxLines(2);
            textView3.setText(str);
            linearLayout2.addView(textView3, tre.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, tre.p(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView4 = new TextView(context);
            textView4.setTypeface(hl.o());
            textView4.setTextSize(1, 14.0f);
            textView4.setGravity(21);
            textView4.setText(spannableStringBuilder);
            if (spannableStringBuilder.toString().startsWith("+")) {
                i = aob.lk;
            }
            yob.X(textView4, i, vnbVar);
            linearLayout.addView(textView4, tre.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject f(c35 c35Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i) {
        if (tonconnectsession.client_id != null) {
            JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(c35Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
            Object obj = jSONObject.get("id");
            if ((obj instanceof String) && ((String) obj).matches("[\\x20-\\x7e]{1,100}")) {
                try {
                    String string = jSONObject.getString("method");
                    JSONArray jSONArray = jSONObject.getJSONArray("params");
                    if ("disconnect".equals(string)) {
                        if (jSONArray.length() != 0) {
                            throw new IllegalArgumentException("Disconnect takes no parameters");
                        }
                    } else if (!"sendTransaction".equals(string) && !"signMessage".equals(string)) {
                        if ("signData".equals(string)) {
                            if (jSONArray.length() == 1 && (jSONArray.get(0) instanceof String)) {
                                JSONObject jSONObject2 = new JSONObject(jSONArray.getString(0));
                                G(str, jSONObject2);
                                jSONObject.put("data", jSONObject2);
                            } else {
                                throw new IllegalArgumentException("Expected one JSON data parameter");
                            }
                        } else {
                            jSONObject.put("errorCode", 400).put("errorMessage", "Method is not supported");
                        }
                    } else if (jSONArray.length() == 1 && (jSONArray.get(0) instanceof String)) {
                        JSONObject jSONObject3 = new JSONObject(jSONArray.getString(0));
                        I(jSONObject3, str, i);
                        jSONObject.put("transaction", jSONObject3);
                    } else {
                        throw new IllegalArgumentException("Expected one JSON transaction parameter");
                    }
                } catch (Exception e) {
                    jSONObject.put("errorCode", 1).put("errorMessage", e.getMessage());
                }
                if (tonconnectsession.closed || tonconnectsession.closing || tonconnectsession.pending || tonconnectsession.manifest == null) {
                    jSONObject.put("errorCode", 100).put("errorMessage", "Unknown app");
                }
                return jSONObject;
            }
            lq5.j("Request ID must contain 1–100 printable ASCII characters");
            return null;
        }
        lq5.j("Missing registered session key");
        return null;
    }

    public static TextView g(Context context, String str, vnb vnbVar) {
        TextView textView = new TextView(context);
        ik8.v(textView, 1, 14.0f);
        yob.X(textView, aob.Fi, vnbVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
        return textView;
    }

    public static String h(String str, Exception exc) {
        cc4.e("[gram-wallet] TON Connect ".concat(str), exc);
        String message = exc.getMessage();
        if (message != null && !message.isEmpty()) {
            return message;
        }
        return exc.getClass().getSimpleName();
    }

    public static SpannableStringBuilder j(long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new wm2(2131232842, 0), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) c.s(-j, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ob6.M0(2131749287, null));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String k(long j, long j2) {
        StringBuilder o = ik8.o(j, "tonconnect_reply.", ".");
        o.append(j2);
        return o.toString();
    }

    public static void m(String str, String str2) {
        if (str2 != null) {
            cc4.d("[gram-wallet] TON Connect " + str + ": " + str2);
        }
    }

    public static String n(String str) {
        URI create = URI.create(str);
        if ("https".equalsIgnoreCase(create.getScheme()) && create.getHost() != null) {
            return create.getHost().toLowerCase(Locale.ROOT);
        }
        lq5.j("Manifest URL must use HTTPS and include a host");
        return null;
    }

    public static void q(Context context, int i, long j, int i2, vnb vnbVar, w56 w56Var) {
        c C = c.C(i);
        a55 a55Var = C.g;
        g45 g45Var = new g45(context, i, C, vnbVar, w56Var);
        if (!a55Var.h && a55Var.g == null) {
            String string = uc7.s1(a55Var.a).X3.getString(k(j, i2), null);
            if (string != null) {
                a55Var.h = true;
                v35 v35Var = new v35(a55Var, g45Var, (byte) 2);
                try {
                    a55Var.E(j, i2, new JSONObject(string), v35Var);
                    return;
                } catch (Exception e) {
                    v35Var.a(h("restore response", e));
                    return;
                }
            }
            a55Var.h = true;
            a55Var.b.A0(new r77(a55Var, j, g45Var, i2, (byte) 6));
            return;
        }
        g45Var.a(null, "A TON Connect request is already open");
    }

    public static x45 r(c35 c35Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i) {
        JSONObject jSONObject = new JSONObject(str2);
        if (str3.equals(jSONObject.getString("manifestUrl"))) {
            String n = n(str3);
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && n.equals(n(tonconnectmanifest.url))) {
                return s(c35Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n, str4, tonconnectchallenge, i);
            }
            lq5.j("Manifest domain does not match the connection request");
            return null;
        }
        lq5.j("Manifest URL changed");
        return null;
    }

    public static x45 s(c35 c35Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i) {
        boolean z;
        JSONObject jSONObject;
        String str4;
        int i2;
        String str5;
        String str6;
        c35 c35Var2 = c35Var;
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2.length() != 0) {
            JSONObject jSONObject2 = new JSONObject();
            if (tonconnectchallenge != null) {
                z = true;
            } else {
                z = false;
            }
            String str7 = "account";
            JSONObject put = jSONObject2.put("account", z);
            HashSet hashSet = new HashSet();
            int i3 = 0;
            while (true) {
                String str8 = "ton_proof";
                TL_wallet.walletOwnershipProof walletownershipproof = null;
                String str9 = "ton_addr";
                if (i3 < jSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                    int i4 = i3;
                    if (hashSet.add(jSONObject3.getString("name"))) {
                        if ("ton_addr".equals(jSONObject3.getString("name")) && jSONObject3.has("network") && !"-239".equals(jSONObject3.getString("network"))) {
                            lq5.j("Requested network does not match the wallet network");
                            return null;
                        }
                        if ("ton_proof".equals(jSONObject3.getString("name"))) {
                            if (!str2.replaceFirst("\\.$", "").equals("telegram.org")) {
                                jSONObject3.getString("payload");
                            } else {
                                lq5.j("The telegram.org proof domain is reserved for wallet import");
                                return null;
                            }
                        }
                        i3 = i4 + 1;
                    } else {
                        lq5.j("Duplicate connect item");
                        return null;
                    }
                } else if (hashSet.contains("ton_addr")) {
                    if (tonconnectchallenge != null) {
                        put.put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2));
                    }
                    JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(c35Var2, tonconnectsession, str, bArr, put);
                    if (tonconnectchallenge == null) {
                        return new x45(jSONObject4);
                    }
                    if (tonconnectchallenge.event_id >= 0) {
                        JSONArray jSONArray3 = new JSONArray();
                        int i5 = 0;
                        while (i5 < jSONArray2.length()) {
                            JSONObject jSONObject5 = jSONArray2.getJSONObject(i5);
                            String string = jSONObject5.getString("name");
                            if (str9.equals(string)) {
                                jSONArray3.put(jSONObject4.getJSONObject(str7));
                                jSONObject = jSONObject4;
                                str4 = str9;
                                i2 = i5;
                                str5 = str7;
                                str6 = str8;
                            } else if (str8.equals(string)) {
                                String string2 = jSONObject5.getString("payload");
                                str4 = str9;
                                i2 = i5;
                                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(c35Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i));
                                str5 = str7;
                                TL_wallet.walletOwnershipProof walletownershipproof2 = new TL_wallet.walletOwnershipProof();
                                walletownershipproof2.timestamp = i;
                                str6 = str8;
                                jSONObject = jSONObject4;
                                walletownershipproof2.signature = Base64.decode(jSONObject6.getString("signature"), 2);
                                jSONArray3.put(new JSONObject().put("name", string).put("proof", new JSONObject().put("timestamp", i).put("domain", new JSONObject().put("lengthBytes", str2.getBytes(StandardCharsets.UTF_8).length).put("value", str2)).put("payload", string2).put("signature", jSONObject6.getString("signature"))));
                                walletownershipproof = walletownershipproof2;
                            } else {
                                jSONObject = jSONObject4;
                                str4 = str9;
                                i2 = i5;
                                str5 = str7;
                                str6 = str8;
                                jSONArray3.put(new JSONObject().put("name", string).put("error", new JSONObject().put("code", 400).put("message", "Method is not supported")));
                            }
                            i5 = i2 + 1;
                            c35Var2 = c35Var;
                            jSONArray2 = jSONArray;
                            str9 = str4;
                            str7 = str5;
                            str8 = str6;
                            jSONObject4 = jSONObject;
                        }
                        JSONObject jSONObject7 = jSONObject4;
                        JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "telegram").put("appVersion", f11.c).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", 255)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", 255)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                        if (str3 != null) {
                            put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                        }
                        JSONObject jSONObject8 = WalletEngine2.tonConnectCrypto(c35Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                        jSONObject8.put("challengeAnswer", jSONObject7.getString("challengeAnswer"));
                        x45 x45Var = new x45(jSONObject8);
                        x45Var.d = walletownershipproof;
                        return x45Var;
                    }
                    lq5.j("Invalid connect event ID");
                    return null;
                } else {
                    lq5.j("Missing ton_addr item");
                    return null;
                }
            }
        } else {
            lq5.j("Empty connect request");
            return null;
        }
    }

    public static x45 t(c35 c35Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j) {
        if (j >= 0 && tonconnectsession.client_id != null) {
            return new x45(WalletEngine2.tonConnectCrypto(c35Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j).put("payload", new JSONObject()))));
        }
        lq5.j("Invalid disconnect session or event ID");
        return null;
    }

    public static TextView v(Context context, CharSequence charSequence, int i, vnb vnbVar) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i);
        yob.X(textView, aob.G6, vnbVar);
        textView.setGravity(17);
        return textView;
    }

    public static boolean w(v45 v45Var) {
        if (v45Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(v45Var.a).getJSONArray("items");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if ("ton_proof".equals(jSONArray.getJSONObject(i).optString("name"))) {
                        return true;
                    }
                }
            } catch (Exception e) {
                h("read proof request", e);
            }
        }
        return false;
    }

    public static String x(String str, JSONObject jSONObject) {
        Object obj = jSONObject.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        lq5.j(str.concat(" must be a string"));
        return null;
    }

    public static String z(TLRPC.TL_error tL_error, String str) {
        String str2;
        String l;
        if (tL_error == null) {
            str2 = str.concat(" returned an empty or unsuccessful response");
        } else {
            str2 = tL_error.text;
            if (str2 == null) {
                str2 = "RPC error " + tL_error.code;
            }
        }
        StringBuilder p = ik8.p("[gram-wallet] TON Connect ", str, ": ");
        if (tL_error == null) {
            l = "";
        } else {
            l = uh9.l(new StringBuilder("code="), tL_error.code, " ");
        }
        p.append(l);
        p.append(str2);
        cc4.d(p.toString());
        return str2;
    }

    public final boolean A(w45 w45Var) {
        if (!w45Var.q) {
            String str = w45Var.h;
            c cVar = this.b;
            if (Objects.equals(str, cVar.x()) && Arrays.equals(w45Var.g, cVar.D())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B(w45 w45Var, c35 c35Var, pcc pccVar) {
        WalletEngine2 walletEngine2 = this.b.b;
        if (walletEngine2 != null) {
            boolean A = A(w45Var);
            int i = w45Var.b;
            TL_wallet.tonConnectSession tonconnectsession = w45Var.a;
            if (A && !i(w45Var)) {
                String string = uc7.s1(this.a).X3.getString(k(tonconnectsession.id, i).concat(".transfer"), null);
                if (string != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                        sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                        sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                        sendtransfer.random_id = jSONObject.getLong("randomId");
                        this.f.sendRequestTyped(sendtransfer, new ic((byte) 0), new pm1(this, pccVar, w45Var, c35Var, sendtransfer, (byte) 6));
                        return;
                    } catch (Exception e) {
                        pccVar.a(h("restore transfer", e));
                        return;
                    }
                }
                z45 z45Var = w45Var.f;
                walletEngine2.prepareTonConnectTransfer(c35Var, z45Var, "ton-connect:" + tonconnectsession.id + ":" + i, new nu0(this, w45Var, c35Var, pccVar, (byte) 9));
                return;
            }
        }
        y(w45Var, c35Var, null, 0, "Wallet unavailable or request expired", pccVar);
    }

    public final void E(long j, int i, JSONObject jSONObject, pcc pccVar) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j;
        tonconnectsubmitresponse.msg_id = i;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f.sendRequestTyped(tonconnectsubmitresponse, new ic((byte) 0), new ng(this, pccVar, jSONObject, j, i));
    }

    public final boolean c(v45 v45Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = v45Var.e;
        if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && (tonconnectmanifest = tonconnectsession2.manifest) != null && Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) && Objects.equals(v45Var.e.manifest.name, tonconnectsession.manifest.name)) {
            TLRPC.WebDocument webDocument = v45Var.e.manifest.icon;
            TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
            if ((webDocument == webDocument2 || (webDocument != null && webDocument2 != null && Objects.equals(webDocument.url, webDocument2.url))) && Arrays.equals(v45Var.e.nonce, tonconnectsession.nonce)) {
                c cVar = this.b;
                if (str.equals(cVar.x()) && Arrays.equals(bArr, cVar.D())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void d(int i, long j, pcc pccVar) {
        long j2 = i;
        uc7.s1(this.a).X3.edit().remove(k(j, j2)).remove(k(j, j2).concat(".transfer")).apply();
        w45 w45Var = this.g;
        if (w45Var != null && w45Var.a.id == j && w45Var.b == i) {
            w45Var.n = true;
        }
        pccVar.a(null);
    }

    public final void e(w45 w45Var, boolean z, pcc pccVar) {
        boolean z2 = w45Var.m;
        TL_wallet.tonConnectSession tonconnectsession = w45Var.a;
        if (z2) {
            return;
        }
        if (!w45Var.n && !i(w45Var) && A(w45Var) && (z || w45Var.l >= 0 || "disconnect".equals(w45Var.e) || w45Var.p)) {
            w45Var.m = true;
            gt gtVar = new gt(this, w45Var, pccVar, (byte) 22);
            String string = uc7.s1(this.a).X3.getString(k(tonconnectsession.id, w45Var.b), null);
            if (string != null) {
                try {
                    try {
                        E(tonconnectsession.id, w45Var.b, new JSONObject(string), gtVar);
                    } catch (Exception e) {
                        e = e;
                        gtVar = gtVar;
                        gtVar.a(h("restore response", e));
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } else {
                this.b.E(true, false, false, new o25(this, gtVar, w45Var, z, (byte) 1));
            }
        } else {
            pccVar.a("Request expired, was processed, or the wallet changed");
        }
    }

    public final boolean i(w45 w45Var) {
        long currentTime = this.f.getCurrentTime();
        if (w45Var.c > currentTime) {
            z45 z45Var = w45Var.f;
            if (z45Var != null) {
                long j = z45Var.a;
                if (j == 0 || j > currentTime) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void l(TL_wallet.tonConnectSession tonconnectsession, String str, m62 m62Var) {
        if (!this.c.remove(Long.valueOf(tonconnectsession.id))) {
            return;
        }
        if (str == null) {
            Collection.EL.removeIf(this.d, new b45(tonconnectsession, (byte) 1));
            this.b.T();
        }
        m62Var.a(str);
    }

    public final void o(int i, long j) {
        w45 w45Var = this.g;
        if (w45Var != null && w45Var.a.id == j && w45Var.b == i && !w45Var.m) {
            w45Var.n = true;
            Runnable runnable = w45Var.r;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void p(TL_wallet.tonConnectSession tonconnectsession) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectManifest tonconnectmanifest2;
        TLRPC.WebDocument webDocument;
        TLRPC.WebDocument webDocument2;
        b45 b45Var = new b45(tonconnectsession, (byte) 0);
        ArrayList arrayList = this.d;
        Collection.EL.removeIf(arrayList, b45Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        w45 w45Var = this.g;
        if (w45Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = w45Var.a;
            if (tonconnectsession2.id == tonconnectsession.id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                w45Var.q = true;
                o(w45Var.b, tonconnectsession.id);
            }
        }
        jn7.f(this.a).k(jn7.d4, this.b, tonconnectsession);
    }

    public final void u(w45 w45Var) {
        w45Var.r = null;
        if (!w45Var.m && this.g == w45Var) {
            this.g = null;
        }
    }

    public final void y(w45 w45Var, c35 c35Var, Object obj, int i, String str, pcc pccVar) {
        Utilities.e.c(new st(this, w45Var, i, obj, str, c35Var, pccVar, (byte) 6));
    }
}
