package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
public final class gu2 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public gu2(rc1 rc1Var, Throwable th) {
        this.a = (byte) 8;
        Map map = Collections.EMPTY_MAP;
        this.b = rc1Var;
        this.c = th;
    }

    @Override
    public final void run() {
        TLRPC.User f;
        String concat;
        String str;
        o39 o39Var;
        float f2;
        long j;
        int i = 0;
        boolean equals = false;
        int i2 = 0;
        switch (this.a) {
            case 0:
                qu2 qu2Var = (qu2) this.b;
                ak8 ak8Var = (ak8) this.c;
                AccountManager accountManager = AccountManager.get(a.b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    qu2Var.a = null;
                    int i3 = 0;
                    while (i3 < accountsByType.length) {
                        Account account = accountsByType[i3];
                        int i4 = i;
                        while (true) {
                            if (i4 >= 4) {
                                break;
                            }
                            if (y6c.h(i4).f() != null) {
                                if (account.name.equals("" + f.id)) {
                                    accountManager.removeAccount(account, null, null);
                                }
                            }
                            i4++;
                        }
                        i3++;
                        i = 0;
                    }
                } catch (Throwable unused) {
                }
                try {
                    Account account2 = new Account("" + qu2Var.getUserConfig().e(), "org.telegram.messenger");
                    qu2Var.a = account2;
                    accountManager.addAccountExplicitly(account2, "", null);
                } catch (Exception unused2) {
                }
                qu2Var.getMessagesStorage().W0(new HashMap(), false, true);
                qu2Var.getMessagesStorage().Z0(new ArrayList(), true);
                qu2Var.b0.clear();
                qu2Var.f0.clear();
                qu2Var.g0.clear();
                qu2Var.h0.clear();
                qu2Var.j0.clear();
                qu2Var.i0.clear();
                qu2Var.c0.clear();
                qu2Var.d0.clear();
                qu2Var.e0.clear();
                qu2Var.x.clear();
                qu2Var.k0.clear();
                qu2Var.l0.clear();
                qu2Var.m0.clear();
                qu2Var.getNotificationCenter().k(25, new Object[0]);
                qu2Var.A(0L, false);
                ak8Var.run();
                return;
            case 1:
                ((qu2) this.b).a((TLRPC.User) this.c);
                return;
            case 2:
                qu2 qu2Var2 = (qu2) this.b;
                SparseArray sparseArray = (SparseArray) this.c;
                if (!qu2Var2.s) {
                    qu2Var2.s = true;
                    HashMap hashMap = new HashMap();
                    HashMap H = qu2Var2.H();
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry : H.entrySet()) {
                        nu2 nu2Var = (nu2) entry.getValue();
                        for (int i5 = 0; i5 < nu2Var.g.size(); i5++) {
                            hashMap2.put((String) nu2Var.g.get(i5), nu2Var.b);
                        }
                    }
                    for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                        nu2 nu2Var2 = (nu2) sparseArray.valueAt(i6);
                        int i7 = 0;
                        while (true) {
                            if (i7 >= nu2Var2.g.size()) {
                                break;
                            }
                            String str2 = (String) hashMap2.get((String) nu2Var2.g.get(i7));
                            if (str2 != null) {
                                nu2Var2.b = str2;
                                hashMap.put(str2, nu2Var2);
                            } else {
                                i7++;
                            }
                        }
                    }
                    if (w01.a) {
                        fa4.b("migrated contacts " + hashMap.size() + " of " + sparseArray.size());
                    }
                    qu2Var2.getMessagesStorage().W0(hashMap, true, false);
                    return;
                }
                return;
            case 3:
                o39 o39Var2 = (o39) this.b;
                Object obj = this.c;
                if (o39Var2 != null) {
                    o39Var2.setOnItemClickListener((c39) obj);
                    return;
                }
                return;
            case 4:
                v22 v22Var = (v22) this.b;
                String str3 = "";
                String lowerCase = ((String) this.c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    gl.d3(new gu2(v22Var, new ArrayList(), (byte) 5));
                    return;
                }
                String J3 = gl.J3(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = v22Var.f;
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    mx2 mx2Var = (mx2) obj2;
                    String str4 = mx2Var.a;
                    if (str4 == null) {
                        str4 = str3;
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = gl.J3(mx2Var.a).toLowerCase();
                    String str5 = mx2Var.b;
                    if (str5 == null) {
                        str5 = str3;
                    }
                    String lowerCase4 = str5.toLowerCase();
                    String lowerCase5 = gl.J3(mx2Var.b).toLowerCase();
                    String str6 = mx2Var.c;
                    if (str6 == null) {
                        str6 = str3;
                    }
                    if (TextUtils.isEmpty(str6)) {
                        concat = str3;
                    } else {
                        concat = "+".concat(str6);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        str = str3;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(J3) && !lowerCase3.contains(" ".concat(J3)) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(J3) && !lowerCase5.contains(" ".concat(J3)) && !str6.startsWith(lowerCase) && !concat.startsWith(lowerCase)) {
                            str3 = str;
                        }
                    } else {
                        str = str3;
                    }
                    arrayList.add(mx2Var);
                    str3 = str;
                }
                gl.d3(new gu2(v22Var, arrayList, (byte) 5));
                return;
            case 5:
                v22 v22Var2 = (v22) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                qx2 qx2Var = (qx2) v22Var2.n;
                if (qx2Var.f) {
                    v22Var2.e = arrayList3;
                    if (qx2Var.e && (o39Var = qx2Var.a) != null) {
                        w39 adapter = o39Var.getAdapter();
                        v22 v22Var3 = qx2Var.d;
                        if (adapter != v22Var3) {
                            qx2Var.a.setAdapter(v22Var3);
                            qx2Var.a.setFastScrollVisible(false);
                        }
                    }
                    v22Var2.f();
                    return;
                }
                return;
            case 6:
                ((dy2) this.b).b((String) this.c, Boolean.FALSE);
                return;
            case 7:
                jb4 jb4Var = ((dy2) ((rc1) this.b).f).d;
                String b = qv5.b(1024, (String) this.c);
                synchronized (((AtomicMarkableReference) jb4Var.g)) {
                    String str7 = (String) ((AtomicMarkableReference) jb4Var.g).getReference();
                    if (b == null) {
                        if (str7 == null) {
                            equals = true;
                        }
                    } else {
                        equals = b.equals(str7);
                    }
                    if (!equals) {
                        ((AtomicMarkableReference) jb4Var.g).set(b, true);
                        ((pz2) ((mv6) jb4Var.c).c).a(new cib(jb4Var, (byte) 23));
                        return;
                    }
                    return;
                }
            case 8:
                Throwable th = (Throwable) this.c;
                Map map = Collections.EMPTY_MAP;
                dy2 dy2Var = (dy2) ((rc1) this.b).f;
                Thread currentThread = Thread.currentThread();
                dy2Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                oz2 oz2Var = dy2Var.n;
                if (oz2Var == null || !oz2Var.e.get()) {
                    long j2 = currentTimeMillis / 1000;
                    String e = dy2Var.e();
                    if (e == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    k44 k44Var = new k44(e, j2, map);
                    n6a n6aVar = dy2Var.m;
                    String concat2 = "Persisting non-fatal event for session ".concat(e);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat2, null);
                    }
                    n6aVar.g(th, currentThread, "error", k44Var, false);
                    return;
                }
                return;
            case 9:
                ((fx0) this.b).dismiss();
                d01.t((Context) this.c, "https://t.me/BotFather?start=deletebot");
                return;
            case 10:
                it3 it3Var = (it3) this.b;
                TreeSet treeSet = (TreeSet) this.c;
                String charSequence = it3Var.getText().toString();
                String str8 = "bot";
                str8 = (a03.a(charSequence, "bot") || a03.c(charSequence, treeSet) != null) ? "" : "";
                ht3 ht3Var = it3Var.d;
                ht3Var.setRightText(str8);
                int L = gl.L(15.0f);
                if (TextUtils.isEmpty(str8)) {
                    f2 = 21.0f;
                } else {
                    f2 = 63.0f;
                }
                ht3Var.setPadding(0, L, gl.L(f2), gl.L(15.0f));
                return;
            case 11:
                na7.q1(((q03) this.b).a).Q3((TLRPC.Updates) this.c, false);
                return;
            case 12:
                ((o13) this.b).onResult((b13) this.c);
                return;
            case 13:
                k03 k03Var = (k03) this.c;
                o13 o13Var = ((y03) this.b).f;
                if (o13Var != null) {
                    o13Var.onResult(k03Var);
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            case 14:
                ((o13) this.b).L((d03) this.c);
                return;
            case 15:
                f13 f13Var = (f13) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    f13Var.W1 = groupcallstreamrtmpurl.url;
                    f13Var.X1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f13Var.X1);
                    f13Var.Y1 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.a |= 256;
                    obj3.b = 0;
                    obj3.c = spannableStringBuilder.length();
                    f13Var.Y1.setSpan(new wib(obj3, 0), 0, f13Var.Y1.length(), 0);
                    f13Var.Z1.O(false);
                    return;
                }
                return;
            case 16:
                ((w13) this.b).e().L((ts4) this.c);
                return;
            case 17:
                ((w13) this.b).e().onResult((xs4) this.c);
                return;
            case 18:
                ((w13) this.b).e().L(((c59) this.c).a);
                return;
            case 19:
                ((o13) this.b).L(this.c);
                return;
            case 20:
                b13 b13Var = (b13) this.c;
                o13 o13Var2 = ((d23) this.b).f;
                if (o13Var2 != null) {
                    o13Var2.onResult(b13Var);
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            case 21:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((o13) this.b, (Exception) this.c);
                return;
            case 22:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((o13) this.b, (c59) this.c);
                return;
            case 23:
                m43 m43Var = (m43) this.b;
                t09 t09Var = (t09) this.c;
                m43Var.l = true;
                m43Var.a.invalidate();
                t09Var.d1 = false;
                t09Var.invalidate();
                m43Var.c(true);
                return;
            case 24:
                u43 u43Var = (u43) this.b;
                pa paVar = (pa) this.c;
                u43Var.getText().delete(u43Var.getText().getSpanStart(paVar), u43Var.getText().getSpanEnd(paVar));
                u43Var.setCursorVisible(true);
                u43Var.setLongClickable(true);
                return;
            case 25:
                y43 y43Var = (y43) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(y43Var.c);
                StrictMode.ThreadPolicy threadPolicy = y43Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 26:
                q83 q83Var = (q83) this.b;
                vf6 vf6Var = (vf6) this.c;
                r83 r83Var = q83Var.U2;
                Activity parentActivity = r83Var.getParentActivity();
                g74 g74Var = r83Var.b;
                int m = vf6Var.m();
                if (vf6Var.m() == 1) {
                    j = ((TLRPC.Dialog) vf6Var.n(0)).id;
                } else {
                    j = 0;
                }
                u21.x(parentActivity, g74Var, m, j, bkb.v0(bkb.vj, q83Var.J0), bkb.v0(bkb.xj, q83Var.J0)).j();
                return;
            case 27:
                ca3 ca3Var = (ca3) this.b;
                fm4 fm4Var = (fm4) this.c;
                da3 da3Var = ca3Var.d;
                if (da3Var.F != 0 && !ca3Var.c) {
                    Looper looper = da3Var.J;
                    looper.getClass();
                    ca3Var.b = da3Var.b(looper, ca3Var.a, fm4Var, false);
                    da3Var.y.add(ca3Var);
                    return;
                }
                return;
            case 28:
                ra3 ra3Var = (ra3) this.b;
                Uri uri = (Uri) this.c;
                ra3Var.s = false;
                if (ra3Var.a.equals(ra3Var.y.I) || ra3Var.x) {
                    ra3Var.b(uri);
                    return;
                }
                return;
            default:
                d dVar = (d) this.c;
                hc3 hc3Var = (hc3) ((fc3) this.b).c;
                hc3Var.a();
                hc3Var.c();
                int w0 = bkb.w0(null, bkb.p6, false);
                oy8 oy8Var = hc3Var.d;
                oy8Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
                boolean i1 = bkb.i1();
                wgb wgbVar = hc3Var.e;
                if (i1) {
                    wgbVar.p(k96.M0(2131745274, null), oy8Var, true);
                    wgbVar.x += 2;
                } else {
                    wgbVar.p(k96.M0(2131745275, null), oy8Var, true);
                    wgbVar.x += 2;
                }
                bkb.K1(dVar);
                return;
        }
    }

    public gu2(q83 q83Var, vf6 vf6Var, int i) {
        this.a = (byte) 26;
        this.b = q83Var;
        this.c = vf6Var;
    }

    public gu2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
