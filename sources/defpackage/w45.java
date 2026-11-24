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
public final class w45 {
    public final int a;
    public final c b;
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int e;
    public final ConnectionsManager f;
    public s45 g;
    public boolean h;

    public w45(c cVar) {
        this.e = -1;
        int i = cVar.a;
        this.a = i;
        this.b = cVar;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        this.f = connectionsManager;
        if (this.e >= 0) {
            return;
        }
        this.e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new kc((byte) 0), new vt4(this, (byte) 7));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return jb6.M0(2131742635, null);
        }
        if (str.length() <= 10) {
            return str;
        }
        return str.substring(0, 4) + "…" + str.substring(str.length() - 4);
    }

    public static defpackage.el7 D(android.content.Context r30, final int r31, final defpackage.r45 r32, final org.telegram.tgnet.TLRPC.TL_urlAuthResultRequest r33, final defpackage.ylb r34, final defpackage.f45 r35, final java.lang.Runnable r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w45.D(android.content.Context, int, r45, org.telegram.tgnet.TLRPC$TL_urlAuthResultRequest, ylb, f45, java.lang.Runnable):el7");
    }

    public static LinearLayout F(Context context, String str, ylb ylbVar) {
        LinearLayout i = hg9.i(context, 1);
        int L = gm.L(16.0f);
        int i2 = cmb.c6;
        ShapeDrawable b0 = cmb.b0(L, cmb.v0(i2, ylbVar));
        wmb M = anb.M(i2);
        i.setBackground(b0);
        anb.j(i, b0, M, null, ylbVar);
        jf5 jf5Var = new jf5(context, ylbVar);
        jf5Var.setText(str);
        i.addView(jf5Var, qoe.o(-1, -2));
        return i;
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
                u36.j("Invalid base64 data");
                return;
            case 1:
                x("schema", jSONObject);
                if (!WalletEngine2.isValidCellBoc(x("cell", jSONObject))) {
                    u36.j("Invalid data cell");
                    return;
                }
                return;
            case 2:
                x("text", jSONObject);
                return;
            default:
                u36.j("Unknown signing data type");
                return;
        }
    }

    public static void H(String str, JSONObject jSONObject) {
        if (jSONObject.has("network") && !"-239".equals(x("network", jSONObject))) {
            u36.j("Wrong network");
        } else if (jSONObject.has("from") && !WalletEngine2.sameTonConnectAddress(x("from", jSONObject), str)) {
            u36.j("Wrong signer");
        }
    }

    public static void I(org.json.JSONObject r10, java.lang.String r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w45.I(org.json.JSONObject, java.lang.String, int):void");
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
        pn2 pn2Var = new pn2(2131232837, 2);
        pn2Var.d = false;
        pn2Var.c(gm.L(16.0f));
        spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static LinearLayout b(Context context, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, ylb ylbVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(gm.L(12.0f), gm.L(5.0f), gm.L(12.0f), gm.L(5.0f));
        ImageView imageView = new ImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-14899731, -15431455});
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(2131231961);
        imageView.setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
        linearLayout.addView(imageView, qoe.q(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(48);
        TextView textView = new TextView(context);
        wi8.v(textView, 1, 16.0f);
        int i = cmb.F6;
        anb.X(textView, i, ylbVar);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setText(charSequence);
        LinearLayout.LayoutParams o = qoe.o(-1, -2);
        o.weight = 0.0f;
        linearLayout2.addView(textView, o);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            anb.X(textView2, cmb.y6, ylbVar);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(charSequence2);
            linearLayout2.addView(textView2, qoe.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(context);
            m37 m37Var = new m37(0, false, false, null);
            m37Var.x = false;
            m37Var.w = Integer.valueOf(cmb.v0(cmb.Zl, ylbVar));
            textView3.setBackground(m37Var);
            textView3.setPadding(gm.L(19.0f), gm.L(9.0f), gm.L(15.0f), gm.L(8.0f));
            textView3.setTextSize(1, 15.0f);
            anb.X(textView3, i, ylbVar);
            textView3.setMaxLines(2);
            textView3.setText(str);
            linearLayout2.addView(textView3, qoe.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, qoe.p(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView4 = new TextView(context);
            textView4.setTypeface(gm.o());
            textView4.setTextSize(1, 14.0f);
            textView4.setGravity(21);
            textView4.setText(spannableStringBuilder);
            if (spannableStringBuilder.toString().startsWith("+")) {
                i = cmb.kk;
            }
            anb.X(textView4, i, ylbVar);
            linearLayout.addView(textView4, qoe.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject f(y25 y25Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i) {
        if (tonconnectsession.client_id != null) {
            JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(y25Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
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
            u36.j("Request ID must contain 1–100 printable ASCII characters");
            return null;
        }
        u36.j("Missing registered session key");
        return null;
    }

    public static TextView g(Context context, String str, ylb ylbVar) {
        TextView textView = new TextView(context);
        wi8.v(textView, 1, 14.0f);
        anb.X(textView, cmb.Ei, ylbVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
        return textView;
    }

    public static String h(String str, Exception exc) {
        fc4.e("[gram-wallet] TON Connect ".concat(str), exc);
        String message = exc.getMessage();
        if (message != null && !message.isEmpty()) {
            return message;
        }
        return exc.getClass().getSimpleName();
    }

    public static SpannableStringBuilder j(long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new pn2(2131232836, 0), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) c.s(-j, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) jb6.M0(2131749290, null));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String k(long j, long j2) {
        StringBuilder o = wi8.o(j, "tonconnect_reply.", ".");
        o.append(j2);
        return o.toString();
    }

    public static void m(String str, String str2) {
        if (str2 != null) {
            fc4.d("[gram-wallet] TON Connect " + str + ": " + str2);
        }
    }

    public static String n(String str) {
        URI create = URI.create(str);
        if ("https".equalsIgnoreCase(create.getScheme()) && create.getHost() != null) {
            return create.getHost().toLowerCase(Locale.ROOT);
        }
        u36.j("Manifest URL must use HTTPS and include a host");
        return null;
    }

    public static void q(Context context, int i, long j, int i2, ylb ylbVar, t56 t56Var) {
        c C = c.C(i);
        w45 w45Var = C.g;
        v35 v35Var = new v35(context, i, C, ylbVar, t56Var);
        if (!w45Var.h && w45Var.g == null) {
            String string = oc7.r1(w45Var.a).X3.getString(k(j, i2), null);
            if (string != null) {
                w45Var.h = true;
                u35 u35Var = new u35(w45Var, v35Var, (byte) 1);
                try {
                    w45Var.E(j, i2, new JSONObject(string), u35Var);
                    return;
                } catch (Exception e) {
                    u35Var.a(h("restore response", e));
                    return;
                }
            }
            w45Var.h = true;
            w45Var.b.x0(new o77(w45Var, j, v35Var, i2, (byte) 6));
            return;
        }
        v35Var.a(null, "A TON Connect request is already open");
    }

    public static t45 r(y25 y25Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i) {
        JSONObject jSONObject = new JSONObject(str2);
        if (str3.equals(jSONObject.getString("manifestUrl"))) {
            String n = n(str3);
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && n.equals(n(tonconnectmanifest.url))) {
                return s(y25Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n, str4, tonconnectchallenge, i);
            }
            u36.j("Manifest domain does not match the connection request");
            return null;
        }
        u36.j("Manifest URL changed");
        return null;
    }

    public static t45 s(y25 y25Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i) {
        boolean z;
        JSONObject jSONObject;
        String str4;
        int i2;
        String str5;
        String str6;
        y25 y25Var2 = y25Var;
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
                            u36.j("Requested network does not match the wallet network");
                            return null;
                        }
                        if ("ton_proof".equals(jSONObject3.getString("name"))) {
                            if (!str2.replaceFirst("\\.$", "").equals("telegram.org")) {
                                jSONObject3.getString("payload");
                            } else {
                                u36.j("The telegram.org proof domain is reserved for wallet import");
                                return null;
                            }
                        }
                        i3 = i4 + 1;
                    } else {
                        u36.j("Duplicate connect item");
                        return null;
                    }
                } else if (hashSet.contains("ton_addr")) {
                    if (tonconnectchallenge != null) {
                        put.put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2));
                    }
                    JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(y25Var2, tonconnectsession, str, bArr, put);
                    if (tonconnectchallenge == null) {
                        return new t45(jSONObject4);
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
                                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(y25Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i));
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
                            y25Var2 = y25Var;
                            jSONArray2 = jSONArray;
                            str9 = str4;
                            str7 = str5;
                            str8 = str6;
                            jSONObject4 = jSONObject;
                        }
                        JSONObject jSONObject7 = jSONObject4;
                        JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "telegram").put("appVersion", e21.c).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", 255)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", 255)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                        if (str3 != null) {
                            put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                        }
                        JSONObject jSONObject8 = WalletEngine2.tonConnectCrypto(y25Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                        jSONObject8.put("challengeAnswer", jSONObject7.getString("challengeAnswer"));
                        t45 t45Var = new t45(jSONObject8);
                        t45Var.d = walletownershipproof;
                        return t45Var;
                    }
                    u36.j("Invalid connect event ID");
                    return null;
                } else {
                    u36.j("Missing ton_addr item");
                    return null;
                }
            }
        } else {
            u36.j("Empty connect request");
            return null;
        }
    }

    public static t45 t(y25 y25Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j) {
        if (j >= 0 && tonconnectsession.client_id != null) {
            return new t45(WalletEngine2.tonConnectCrypto(y25Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j).put("payload", new JSONObject()))));
        }
        u36.j("Invalid disconnect session or event ID");
        return null;
    }

    public static TextView v(Context context, CharSequence charSequence, int i, ylb ylbVar) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i);
        anb.X(textView, cmb.F6, ylbVar);
        textView.setGravity(17);
        return textView;
    }

    public static boolean w(r45 r45Var) {
        if (r45Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(r45Var.a).getJSONArray("items");
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
        u36.j(str.concat(" must be a string"));
        return null;
    }

    public static String z(TLRPC.TL_error tL_error, String str) {
        String str2;
        String k;
        if (tL_error == null) {
            str2 = str.concat(" returned an empty or unsuccessful response");
        } else {
            str2 = tL_error.text;
            if (str2 == null) {
                str2 = "RPC error " + tL_error.code;
            }
        }
        StringBuilder p = wi8.p("[gram-wallet] TON Connect ", str, ": ");
        if (tL_error == null) {
            k = "";
        } else {
            k = hg9.k(new StringBuilder("code="), tL_error.code, " ");
        }
        p.append(k);
        p.append(str2);
        fc4.d(p.toString());
        return str2;
    }

    public final boolean A(s45 s45Var) {
        if (!s45Var.q) {
            String str = s45Var.h;
            c cVar = this.b;
            if (Objects.equals(str, cVar.x()) && Arrays.equals(s45Var.g, cVar.D())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B(s45 s45Var, y25 y25Var, qac qacVar) {
        WalletEngine2 walletEngine2 = this.b.b;
        if (walletEngine2 != null) {
            boolean A = A(s45Var);
            int i = s45Var.b;
            TL_wallet.tonConnectSession tonconnectsession = s45Var.a;
            if (A && !i(s45Var)) {
                String string = oc7.r1(this.a).X3.getString(k(tonconnectsession.id, i).concat(".transfer"), null);
                if (string != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                        sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                        sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                        sendtransfer.random_id = jSONObject.getLong("randomId");
                        this.f.sendRequestTyped(sendtransfer, new kc((byte) 0), new sm1(this, qacVar, s45Var, y25Var, sendtransfer, (byte) 6));
                        return;
                    } catch (Exception e) {
                        qacVar.a(h("restore transfer", e));
                        return;
                    }
                }
                v45 v45Var = s45Var.f;
                walletEngine2.prepareTonConnectTransfer(y25Var, v45Var, "ton-connect:" + tonconnectsession.id + ":" + i, new nv0(this, s45Var, y25Var, qacVar, (byte) 9));
                return;
            }
        }
        y(s45Var, y25Var, null, 0, "Wallet unavailable or request expired", qacVar);
    }

    public final void E(long j, int i, JSONObject jSONObject, qac qacVar) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j;
        tonconnectsubmitresponse.msg_id = i;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f.sendRequestTyped(tonconnectsubmitresponse, new kc((byte) 0), new yh(this, qacVar, jSONObject, j, i));
    }

    public final boolean c(r45 r45Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = r45Var.e;
        if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && (tonconnectmanifest = tonconnectsession2.manifest) != null && Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) && Objects.equals(r45Var.e.manifest.name, tonconnectsession.manifest.name)) {
            TLRPC.WebDocument webDocument = r45Var.e.manifest.icon;
            TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
            if ((webDocument == webDocument2 || (webDocument != null && webDocument2 != null && Objects.equals(webDocument.url, webDocument2.url))) && Arrays.equals(r45Var.e.nonce, tonconnectsession.nonce)) {
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

    public final void d(int i, long j, qac qacVar) {
        long j2 = i;
        oc7.r1(this.a).X3.edit().remove(k(j, j2)).remove(k(j, j2).concat(".transfer")).apply();
        s45 s45Var = this.g;
        if (s45Var != null && s45Var.a.id == j && s45Var.b == i) {
            s45Var.n = true;
        }
        qacVar.a(null);
    }

    public final void e(s45 s45Var, boolean z, qac qacVar) {
        boolean z2 = s45Var.m;
        TL_wallet.tonConnectSession tonconnectsession = s45Var.a;
        if (z2) {
            return;
        }
        if (!s45Var.n && !i(s45Var) && A(s45Var) && (z || s45Var.l >= 0 || "disconnect".equals(s45Var.e) || s45Var.p)) {
            s45Var.m = true;
            iu iuVar = new iu(this, s45Var, qacVar, (byte) 21);
            String string = oc7.r1(this.a).X3.getString(k(tonconnectsession.id, s45Var.b), null);
            if (string != null) {
                try {
                    try {
                        E(tonconnectsession.id, s45Var.b, new JSONObject(string), iuVar);
                    } catch (Exception e) {
                        e = e;
                        iuVar = iuVar;
                        iuVar.a(h("restore response", e));
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } else {
                this.b.E(true, false, false, new k25(this, iuVar, s45Var, z, (byte) 1));
            }
        } else {
            qacVar.a("Request expired, was processed, or the wallet changed");
        }
    }

    public final boolean i(s45 s45Var) {
        long currentTime = this.f.getCurrentTime();
        if (s45Var.c > currentTime) {
            v45 v45Var = s45Var.f;
            if (v45Var != null) {
                long j = v45Var.a;
                if (j == 0 || j > currentTime) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void l(TL_wallet.tonConnectSession tonconnectsession, String str, h72 h72Var) {
        if (!this.c.remove(Long.valueOf(tonconnectsession.id))) {
            return;
        }
        if (str == null) {
            Collection.EL.removeIf(this.d, new x35(tonconnectsession, (byte) 1));
            this.b.S();
        }
        h72Var.a(str);
    }

    public final void o(int i, long j) {
        s45 s45Var = this.g;
        if (s45Var != null && s45Var.a.id == j && s45Var.b == i && !s45Var.m) {
            s45Var.n = true;
            Runnable runnable = s45Var.r;
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
        x35 x35Var = new x35(tonconnectsession, (byte) 0);
        ArrayList arrayList = this.d;
        Collection.EL.removeIf(arrayList, x35Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        s45 s45Var = this.g;
        if (s45Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = s45Var.a;
            if (tonconnectsession2.id == tonconnectsession.id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                s45Var.q = true;
                o(s45Var.b, tonconnectsession.id);
            }
        }
        nm7.f(this.a).k(nm7.e4, this.b, tonconnectsession);
    }

    public final void u(s45 s45Var) {
        s45Var.r = null;
        if (!s45Var.m && this.g == s45Var) {
            this.g = null;
        }
    }

    public final void y(s45 s45Var, y25 y25Var, Object obj, int i, String str, qac qacVar) {
        Utilities.e.c(new qu(this, s45Var, i, obj, str, y25Var, qacVar, (byte) 6));
    }
}
