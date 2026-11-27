package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class e66 {
    public static final Pattern k = Pattern.compile("^[a-z0-9_]{1,32}$");
    public final LaunchActivity a;
    public final int b;
    public final l01 c;
    public final boolean d;
    public id e;
    public boolean f;
    public boolean g;
    public int h = -1;
    public l77 i;
    public boolean j;

    public e66(LaunchActivity launchActivity, int i, l01 l01Var, boolean z) {
        this.a = launchActivity;
        this.b = i;
        this.c = l01Var;
        this.d = z;
    }

    public static d31 d() {
        e S = LaunchActivity.S();
        if (S == null) {
            return d31.Y();
        }
        return d31.b0(S);
    }

    public static boolean p(java.lang.String r2) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e66.p(java.lang.String):boolean");
    }

    public static boolean q(java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e66.q(java.lang.String):boolean");
    }

    public static String r(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int i = 960;
        if (bytes.length <= 960) {
            return str;
        }
        while ((bytes[i] & 192) == 128) {
            i--;
        }
        return new String(bytes, 0, i, StandardCharsets.UTF_8);
    }

    public static Uri s(Uri uri) {
        String schemeSpecificPart;
        if (uri != null && uri.isOpaque()) {
            String scheme = uri.getScheme();
            if (scheme == null || uri.getAuthority() != null || (schemeSpecificPart = uri.getSchemeSpecificPart()) == null) {
                return uri;
            }
            return Uri.parse(scheme + "://" + schemeSpecificPart);
        }
        return uri;
    }

    public final boolean a() {
        if (!this.j) {
            LaunchActivity launchActivity = this.a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed() && LaunchActivity.G1 && !xea.w && !xea.B && yac.t0 == this.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b() {
        this.j = true;
        l77 l77Var = this.i;
        if (l77Var != null) {
            hl.r(l77Var);
        }
        if (this.h >= 0) {
            ConnectionsManager.getInstance(this.b).cancelRequest(this.h, true);
            this.h = -1;
        }
    }

    public final void c() {
        if (this.g) {
            return;
        }
        id idVar = this.e;
        if (idVar != null) {
            idVar.dismiss();
        }
        l01 l01Var = this.c;
        if (l01Var != null) {
            l01Var.b();
        }
        this.g = true;
    }

    public final wk5 e() {
        return this.a.N();
    }

    public final yac f() {
        return yac.h(this.b);
    }

    public final boolean g(Uri uri) {
        String str;
        String str2;
        String str3;
        String path;
        Uri s;
        List<String> pathSegments;
        int i;
        String str4;
        Long l;
        String str5;
        boolean z;
        boolean z2;
        Uri uri2 = uri;
        if (uri2 != null) {
            cc4.b("link manager handle " + uri2);
            String scheme = uri2.getScheme();
            if ("tonsite".equalsIgnoreCase(scheme)) {
                m01.r(this.a, uri2, true, true);
                return true;
            } else if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                if ("tg".equalsIgnoreCase(scheme)) {
                    LaunchActivity launchActivity = this.a;
                    Uri s2 = s(Uri.parse(uri2.toString().replaceFirst("(?i)^tg:(//)?sendgrams&", "tg://sendgrams?")));
                    List<String> pathSegments2 = s2.getPathSegments();
                    if (pathSegments2 != null) {
                        ArrayList arrayList = new ArrayList(pathSegments2);
                        String authority = s2.getAuthority();
                        if (!TextUtils.isEmpty(authority)) {
                            arrayList.add(0, authority);
                        }
                        if (!arrayList.isEmpty()) {
                            String str6 = (String) arrayList.get(0);
                            if (arrayList.size() > 1) {
                                str5 = (String) arrayList.get(1);
                            } else {
                                str5 = null;
                            }
                            if ("sendgrams".equalsIgnoreCase(str6)) {
                                return l(s2);
                            }
                            if ("newbot".equalsIgnoreCase(str6)) {
                                j(s2.getQueryParameter("manager"), s2.getQueryParameter("username"), s2.getQueryParameter("name"));
                                return true;
                            } else if ("botinvite".equalsIgnoreCase(str6)) {
                                String queryParameter = s2.getQueryParameter("username");
                                if (TextUtils.isEmpty(queryParameter)) {
                                    return true;
                                }
                                o();
                                uc7.s1(this.b).a2().a(queryParameter, null, new zj3(this, (byte) 22));
                                return true;
                            } else {
                                if ("resolve".equalsIgnoreCase(str6)) {
                                    List<String> pathSegments3 = s2.getPathSegments();
                                    if (pathSegments3 != null) {
                                        ArrayList arrayList2 = new ArrayList(pathSegments3);
                                        String authority2 = s2.getAuthority();
                                        if (!TextUtils.isEmpty(authority2)) {
                                            i = 0;
                                            arrayList2.add(0, authority2);
                                        } else {
                                            i = 0;
                                        }
                                        if (!arrayList2.isEmpty()) {
                                            arrayList2.remove(i);
                                            String queryParameter2 = s2.getQueryParameter("domain");
                                            String queryParameter3 = s2.getQueryParameter("startapp");
                                            if ("sendgrams".equalsIgnoreCase(queryParameter2)) {
                                                return l(s2);
                                            }
                                            if ("oauth".equalsIgnoreCase(queryParameter2) && !TextUtils.isEmpty(queryParameter3)) {
                                                return k(s2, queryParameter3);
                                            }
                                        }
                                        return i;
                                    }
                                } else if ("invoice".equalsIgnoreCase(str6)) {
                                    return i(s2.getQueryParameter("slug"));
                                } else {
                                    if ("oauth".equalsIgnoreCase(str6)) {
                                        return k(s2, s2.getQueryParameter("token"));
                                    }
                                    if ("settings".equalsIgnoreCase(str6)) {
                                        return m(arrayList.subList(1, arrayList.size()));
                                    }
                                    if ("chats".equalsIgnoreCase(str6)) {
                                        "search".equalsIgnoreCase(str5);
                                        "edit".equalsIgnoreCase(str5);
                                        "emoji-status".equalsIgnoreCase(str5);
                                    }
                                    if ("new".equalsIgnoreCase(str6)) {
                                        if ("group".equalsIgnoreCase(str5)) {
                                            u(new rc5(new Bundle()), false);
                                            return true;
                                        } else if ("contact".equalsIgnoreCase(str5)) {
                                            new rl7(LaunchActivity.S(), launchActivity).show();
                                            return true;
                                        } else if ("channel".equalsIgnoreCase(str5)) {
                                            SharedPreferences e1 = uc7.e1();
                                            boolean z3 = f11.a;
                                            u(new v8(0), false);
                                            e1.edit().putBoolean("channel_intro", true).commit();
                                            return true;
                                        } else {
                                            u(new ContactsActivity(bs2.l("destroyAfterSelect", true)), false);
                                            return true;
                                        }
                                    } else if ("post".equalsIgnoreCase(str6)) {
                                        ?? r1 = "video".equalsIgnoreCase(str5);
                                        if ("live".equalsIgnoreCase(str5)) {
                                            r1 = -1;
                                        }
                                        rbb C = rbb.C(launchActivity, this.b);
                                        if (C.P1 == r1) {
                                            z = true;
                                        } else {
                                            C.P1 = r1;
                                            ?? r2 = C.R0;
                                            if (r2 != 0) {
                                                r2.a(r1);
                                            }
                                            z = true;
                                            if (r1 == 1) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            C.h0(z2, true);
                                            el2 el2Var = C.J0;
                                            if (el2Var != null) {
                                                el2Var.a(false, true);
                                            }
                                            C.l0(false);
                                        }
                                        C.Q(null);
                                        return z;
                                    } else if ("contacts".equalsIgnoreCase(str6)) {
                                        if ("new".equalsIgnoreCase(str5)) {
                                            new rl7(LaunchActivity.S(), launchActivity).show();
                                            return true;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putBoolean("needPhonebook", true);
                                        bundle.putBoolean("needFinishFragment", true);
                                        u(new ContactsActivity(bundle), false);
                                        "search".equalsIgnoreCase(str5);
                                        "sort".equalsIgnoreCase(str5);
                                        if ("invite".equalsIgnoreCase(str5)) {
                                            x("phonebookRow");
                                            return true;
                                        }
                                        return true;
                                    } else if ("addstyle".equalsIgnoreCase(str6)) {
                                        return h(s2.getQueryParameter("slug"));
                                    }
                                }
                                return false;
                            }
                        }
                    }
                } else {
                    if ("ton".equalsIgnoreCase(scheme)) {
                        if (uc7.s1(this.b).k4.v0.f && (pathSegments = (s = s(uri2)).getPathSegments()) != null) {
                            ArrayList arrayList3 = new ArrayList(pathSegments);
                            String authority3 = s.getAuthority();
                            if (!TextUtils.isEmpty(authority3)) {
                                i = 0;
                                arrayList3.add(0, authority3);
                            } else {
                                i = 0;
                            }
                            if (!arrayList3.isEmpty()) {
                                String str7 = (String) arrayList3.get(i);
                                if (arrayList3.size() > 1) {
                                    str4 = (String) arrayList3.get(1);
                                } else {
                                    str4 = null;
                                }
                                if ("transfer".equalsIgnoreCase(str7)) {
                                    if (arrayList3.size() == 2 && WalletEngine2.isValidRecipientAddress(str4)) {
                                        try {
                                            l = Long.valueOf(Long.parseLong(s.getQueryParameter("amount")));
                                        } catch (Throwable unused) {
                                            l = null;
                                        }
                                        String queryParameter4 = s.getQueryParameter("text");
                                        if (TextUtils.isEmpty(queryParameter4)) {
                                            queryParameter4 = s.getQueryParameter("comment");
                                        }
                                        String r = r(queryParameter4);
                                        boolean booleanQueryParameter = s.getBooleanQueryParameter("encrypted", false);
                                        try {
                                            euc eucVar = new euc(str4);
                                            if (l != null && l.longValue() > 0) {
                                                eucVar.s = l.longValue();
                                            }
                                            if (!TextUtils.isEmpty(r)) {
                                                eucVar.h0 = r;
                                                eucVar.i0 = booleanQueryParameter;
                                            }
                                            eucVar.g0 = true;
                                            u(eucVar, false);
                                            return true;
                                        } catch (Throwable th) {
                                            cc4.g(th, true);
                                        }
                                    }
                                    return true;
                                }
                                return false;
                            }
                            return i;
                        }
                    } else if ("tc".equalsIgnoreCase(scheme)) {
                        return n(uri);
                    }
                    return false;
                }
            } else {
                String host = uri2.getHost();
                if (host != null) {
                    Matcher matcher = LaunchActivity.D1.matcher(host.toLowerCase());
                    boolean find = matcher.find();
                    if ("telegram.me".equalsIgnoreCase(host) || "t.me".equalsIgnoreCase(host) || "telegram.dog".equalsIgnoreCase(host) || find) {
                        if (find) {
                            StringBuilder sb = new StringBuilder("https://t.me/");
                            sb.append(matcher.group(1));
                            String str8 = "";
                            if (TextUtils.isEmpty(uri2.getPath())) {
                                path = "";
                            } else {
                                path = uri2.getPath();
                            }
                            sb.append(path);
                            if (!TextUtils.isEmpty(uri2.getQuery())) {
                                str8 = "?" + uri2.getQuery();
                            }
                            sb.append(str8);
                            uri2 = Uri.parse(sb.toString());
                        }
                        String path2 = uri2.getPath();
                        if (path2 != null && path2.length() > 1) {
                            String substring = path2.substring(1);
                            List<String> pathSegments4 = uri2.getPathSegments();
                            if (pathSegments4 != null && !pathSegments4.isEmpty()) {
                                String str9 = pathSegments4.get(0);
                                if (pathSegments4.size() > 1) {
                                    str = pathSegments4.get(1);
                                } else {
                                    str = null;
                                }
                                if ("sendgrams".equalsIgnoreCase(str9)) {
                                    return l(uri2);
                                }
                                if ("getpremium".equalsIgnoreCase(str9)) {
                                    String queryParameter5 = uri2.getQueryParameter("ref");
                                    if (queryParameter5 != null) {
                                        String lowerCase = queryParameter5.toLowerCase(Locale.ROOT);
                                        if (k.matcher(lowerCase).matches()) {
                                            str3 = c00.i("tme_getpremium_", lowerCase);
                                            u(new PremiumPreviewFragment(0, str3), false);
                                            return true;
                                        }
                                    }
                                    str3 = "tme_getpremium";
                                    u(new PremiumPreviewFragment(0, str3), false);
                                    return true;
                                } else if ("$".equalsIgnoreCase(str9)) {
                                    return i(substring.substring(1));
                                } else {
                                    if ("invoice".equalsIgnoreCase(str9)) {
                                        return i(str);
                                    }
                                    if ("addstyle".equalsIgnoreCase(str9)) {
                                        return h(str);
                                    }
                                    if ("oauth".equalsIgnoreCase(str9)) {
                                        return k(uri2, uri2.getQueryParameter("startapp"));
                                    }
                                    if ("newbot".equalsIgnoreCase(str9)) {
                                        if (pathSegments4.size() >= 2) {
                                            if (pathSegments4.size() >= 3) {
                                                str2 = pathSegments4.get(2);
                                            } else {
                                                str2 = null;
                                            }
                                            j(str, str2, uri2.getQueryParameter("name"));
                                            return true;
                                        }
                                        return true;
                                    } else if ("botinvite".equalsIgnoreCase(str9)) {
                                        if (pathSegments4.size() < 2 || TextUtils.isEmpty(str)) {
                                            return true;
                                        }
                                        o();
                                        uc7.s1(this.b).a2().a(str, null, new zj3(this, (byte) 22));
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    public final boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        TL_aicompose.getTone gettone = new TL_aicompose.getTone();
        TL_aicompose.inputAiComposeToneSlug inputaicomposetoneslug = new TL_aicompose.inputAiComposeToneSlug();
        inputaicomposetoneslug.slug = str;
        gettone.tone = inputaicomposetoneslug;
        o();
        ConnectionsManager.getInstance(this.b).sendRequestTyped(gettone, new ic((byte) 0), new yt4(this, (byte) 13));
        return true;
    }

    public final boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        o();
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
        tL_inputInvoiceSlug.slug = str;
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
        this.h = ConnectionsManager.getInstance(this.b).sendRequest(tL_payments_getPaymentForm, new m65(this, tL_inputInvoiceSlug, str, (byte) 5));
        return true;
    }

    public final void j(String str, String str2, String str3) {
        TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot = new TLRPC.TL_requestPeerTypeCreateBot();
        tL_requestPeerTypeCreateBot.bot_managed = true;
        if (!TextUtils.isEmpty(str3)) {
            tL_requestPeerTypeCreateBot.flags |= 2;
            tL_requestPeerTypeCreateBot.suggested_name = str3;
        }
        if (!TextUtils.isEmpty(str2)) {
            tL_requestPeerTypeCreateBot.flags |= 4;
            tL_requestPeerTypeCreateBot.suggested_username = str2;
        }
        e S = LaunchActivity.S();
        if (S != null && S.getContext() != null) {
            o();
            TLRPC.User[] userArr = {null};
            uc7.s1(this.b).a2().a(str, null, new gt(this, userArr, new g65(this, S, userArr, tL_requestPeerTypeCreateBot, (byte) 12), (byte) 25));
        }
    }

    public final boolean k(Uri uri, String str) {
        if (!this.d) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        o();
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.flags |= 4;
        tL_messages_requestUrlAuth.url = uri.toString();
        ConnectionsManager.getInstance(this.b).sendRequestTyped(tL_messages_requestUrlAuth, new ic((byte) 0), new qe2(this, tL_messages_requestUrlAuth, (byte) 26));
        return true;
    }

    public final boolean l(Uri uri) {
        Uri uri2;
        long j;
        if (!uc7.s1(this.b).k4.v0.f) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("startapp");
        if (queryParameter != null && queryParameter.startsWith("tonconnect-")) {
            String replace = queryParameter.substring(11).replace("--", "%").replace("__", "=").replace("-", "&").replace("%5F", "_").replace("%2D", "-").replace("%2E", ".");
            uri2 = Uri.parse("tc://connect?" + replace);
        } else {
            uri2 = null;
        }
        if (uri2 != null) {
            n(uri2);
            return true;
        }
        String queryParameter2 = uri.getQueryParameter("to");
        String queryParameter3 = uri.getQueryParameter("amount");
        String queryParameter4 = uri.getQueryParameter("text");
        if (TextUtils.isEmpty(queryParameter4)) {
            queryParameter4 = uri.getQueryParameter("comment");
        }
        String r = r(queryParameter4);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("encrypted", false);
        if (queryParameter3 != null) {
            if (!TextUtils.isEmpty(queryParameter2) && queryParameter3.matches("[0-9]+(?:\\.[0-9]+)?")) {
                try {
                    j = new BigDecimal(queryParameter3).movePointRight(9).longValueExact();
                } catch (ArithmeticException | NumberFormatException unused) {
                }
            }
            return true;
        }
        j = 0;
        long j2 = j;
        if (TextUtils.isEmpty(queryParameter2)) {
            u(new uqc(), false);
            return true;
        }
        if (!queryParameter2.startsWith("@") && !queryParameter2.matches("[a-zA-Z0-9_]{1,32}")) {
            if (WalletEngine2.isValidRecipientAddress(queryParameter2)) {
                euc eucVar = new euc(queryParameter2);
                eucVar.s = j2;
                eucVar.h0 = r;
                eucVar.i0 = booleanQueryParameter;
                eucVar.g0 = true;
                u(eucVar, false);
                return true;
            }
        } else {
            if (queryParameter2.startsWith("@")) {
                queryParameter2 = queryParameter2.substring(1);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = queryParameter2;
                o();
                this.h = ConnectionsManager.getInstance(this.b).sendRequest(tL_contacts_resolveUsername, new e87(this, j2, r, booleanQueryParameter));
                return true;
            }
        }
        return true;
    }

    public final boolean m(java.util.List r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e66.m(java.util.List):boolean");
    }

    public final boolean n(Uri uri) {
        Uri s = s(uri);
        List<String> pathSegments = s.getPathSegments();
        if (pathSegments != null) {
            ArrayList arrayList = new ArrayList(pathSegments);
            String authority = s.getAuthority();
            if (!TextUtils.isEmpty(authority)) {
                arrayList.add(0, authority);
            }
            if (arrayList.isEmpty() || "connect".equalsIgnoreCase((String) arrayList.get(0))) {
                try {
                    if ("2".equals(s.getQueryParameter("v"))) {
                        String queryParameter = s.getQueryParameter("id");
                        String queryParameter2 = s.getQueryParameter("r");
                        String queryParameter3 = s.getQueryParameter("trace_id");
                        String queryParameter4 = s.getQueryParameter("e");
                        String queryParameter5 = s.getQueryParameter("ret");
                        String str = (queryParameter5 == null || !p(queryParameter5)) ? "back" : "back";
                        if (queryParameter2 == null) {
                            if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter3)) {
                                o();
                                v(queryParameter, 0, queryParameter3, str);
                                return true;
                            }
                        } else {
                            String string = new JSONObject(queryParameter2).getString("manifestUrl");
                            o();
                            c C = c.C(this.b);
                            C.A0(new nn0(this, C, queryParameter, string, queryParameter2, queryParameter3, queryParameter4, str, (byte) 6));
                            return false;
                        }
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return false;
                }
            }
        }
        return false;
    }

    public final void o() {
        if (!this.f && !this.g) {
            l01 l01Var = this.c;
            if (l01Var == null) {
                id idVar = this.e;
                if (idVar == null) {
                    idVar = new id(3, null, this.a);
                    this.e = idVar;
                }
                idVar.setOnCancelListener(new cs0(this, (byte) 10));
                this.e.q(300L);
            } else {
                l01Var.b = new a66(this, (byte) 0);
                l01Var.d();
            }
            this.f = true;
        }
    }

    public final void t(e eVar) {
        u(eVar, false);
    }

    public final void u(e eVar, boolean z) {
        LaunchActivity launchActivity = this.a;
        launchActivity.u0(eVar, z, false);
        if (hl.O1()) {
            launchActivity.p0.W(true, true);
            launchActivity.r0.W(true, true);
        }
    }

    public final void v(String str, int i, String str2, String str3) {
        if (!this.j) {
            LaunchActivity launchActivity = this.a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                tonconnectgetpending.dapp_client_id = str;
                this.h = ConnectionsManager.getInstance(this.b).sendRequestTyped(tonconnectgetpending, new ic((byte) 0), new g45(this, str, str2, str3, i));
                return;
            }
        }
        c();
    }

    public final void w(String str) {
        LaunchActivity launchActivity = this.a;
        if (!launchActivity.isFinishing() && !launchActivity.isDestroyed() && !"none".equals(str)) {
            if ("back".equals(str)) {
                if (this.d) {
                    launchActivity.moveTaskToBack(true);
                    return;
                }
                return;
            }
            m01.w(launchActivity, str, false);
        }
    }

    public final void x(String str) {
        hl.f3(this.a.N(), str);
    }
}
