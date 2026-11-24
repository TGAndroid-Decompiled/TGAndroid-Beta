package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
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
public final class mv2 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public mv2(zd1 zd1Var, Throwable th) {
        this.a = (byte) 9;
        Map map = Collections.EMPTY_MAP;
        this.b = zd1Var;
        this.c = th;
    }

    @Override
    public final void run() {
        TLRPC.User f;
        String concat;
        String str;
        r59 r59Var;
        float f2;
        long j;
        int i = 0;
        boolean equals = false;
        int i2 = 0;
        switch (this.a) {
            case 0:
                bw2 bw2Var = (bw2) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    TLRPC.User user = (TLRPC.User) entry.getKey();
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
                    user.contact = true;
                    bw2Var.f0.add(tL_contact);
                    bw2Var.g0.put(Long.valueOf(user.id), tL_contact);
                }
                bw2Var.d(true);
                nm7 notificationCenter = bw2Var.getNotificationCenter();
                int i3 = oc7.s5;
                notificationCenter.k(2, 1);
                bw2Var.getNotificationCenter().k(25, new Object[0]);
                return;
            case 1:
                bw2 bw2Var2 = (bw2) this.b;
                dm8 dm8Var = (dm8) this.c;
                AccountManager accountManager = AccountManager.get(a.b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    bw2Var2.a = null;
                    int i4 = 0;
                    while (i4 < accountsByType.length) {
                        Account account = accountsByType[i4];
                        int i5 = i;
                        while (true) {
                            if (i5 >= 4) {
                                break;
                            }
                            if (z8c.h(i5).f() != null) {
                                if (account.name.equals("" + f.id)) {
                                    accountManager.removeAccount(account, null, null);
                                }
                            }
                            i5++;
                        }
                        i4++;
                        i = 0;
                    }
                } catch (Throwable unused) {
                }
                try {
                    Account account2 = new Account("" + bw2Var2.getUserConfig().e(), "org.telegram.messenger");
                    bw2Var2.a = account2;
                    accountManager.addAccountExplicitly(account2, "", null);
                } catch (Exception unused2) {
                }
                bw2Var2.getMessagesStorage().W0(new HashMap(), false, true);
                bw2Var2.getMessagesStorage().Z0(new ArrayList(), true);
                bw2Var2.b0.clear();
                bw2Var2.f0.clear();
                bw2Var2.g0.clear();
                bw2Var2.h0.clear();
                bw2Var2.j0.clear();
                bw2Var2.i0.clear();
                bw2Var2.c0.clear();
                bw2Var2.d0.clear();
                bw2Var2.e0.clear();
                bw2Var2.x.clear();
                bw2Var2.k0.clear();
                bw2Var2.l0.clear();
                bw2Var2.m0.clear();
                bw2Var2.getNotificationCenter().k(25, new Object[0]);
                bw2Var2.A(0L, false);
                dm8Var.run();
                return;
            case 2:
                ((bw2) this.b).a((TLRPC.User) this.c);
                return;
            case 3:
                bw2 bw2Var3 = (bw2) this.b;
                SparseArray sparseArray = (SparseArray) this.c;
                if (!bw2Var3.s) {
                    bw2Var3.s = true;
                    HashMap hashMap = new HashMap();
                    HashMap H = bw2Var3.H();
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry2 : H.entrySet()) {
                        yv2 yv2Var = (yv2) entry2.getValue();
                        for (int i6 = 0; i6 < yv2Var.g.size(); i6++) {
                            hashMap2.put((String) yv2Var.g.get(i6), yv2Var.b);
                        }
                    }
                    for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                        yv2 yv2Var2 = (yv2) sparseArray.valueAt(i7);
                        int i8 = 0;
                        while (true) {
                            if (i8 >= yv2Var2.g.size()) {
                                break;
                            }
                            String str2 = (String) hashMap2.get((String) yv2Var2.g.get(i8));
                            if (str2 != null) {
                                yv2Var2.b = str2;
                                hashMap.put(str2, yv2Var2);
                            } else {
                                i8++;
                            }
                        }
                    }
                    if (e21.a) {
                        fc4.b("migrated contacts " + hashMap.size() + " of " + sparseArray.size());
                    }
                    bw2Var3.getMessagesStorage().W0(hashMap, true, false);
                    return;
                }
                return;
            case 4:
                r59 r59Var2 = (r59) this.b;
                Object obj = this.c;
                if (r59Var2 != null) {
                    r59Var2.setOnItemClickListener((f59) obj);
                    return;
                }
                return;
            case 5:
                h42 h42Var = (h42) this.b;
                String str3 = "";
                String lowerCase = ((String) this.c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    gm.c3(new mv2(h42Var, new ArrayList(), (byte) 6));
                    return;
                }
                String I3 = gm.I3(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = h42Var.f;
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    wy2 wy2Var = (wy2) obj2;
                    String str4 = wy2Var.a;
                    if (str4 == null) {
                        str4 = str3;
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = gm.I3(wy2Var.a).toLowerCase();
                    String str5 = wy2Var.b;
                    if (str5 == null) {
                        str5 = str3;
                    }
                    String lowerCase4 = str5.toLowerCase();
                    String lowerCase5 = gm.I3(wy2Var.b).toLowerCase();
                    String str6 = wy2Var.c;
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
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(I3) && !lowerCase3.contains(" ".concat(I3)) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(I3) && !lowerCase5.contains(" ".concat(I3)) && !str6.startsWith(lowerCase) && !concat.startsWith(lowerCase)) {
                            str3 = str;
                        }
                    } else {
                        str = str3;
                    }
                    arrayList.add(wy2Var);
                    str3 = str;
                }
                gm.c3(new mv2(h42Var, arrayList, (byte) 6));
                return;
            case 6:
                h42 h42Var2 = (h42) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                az2 az2Var = (az2) h42Var2.n;
                if (az2Var.f) {
                    h42Var2.e = arrayList3;
                    if (az2Var.e && (r59Var = az2Var.a) != null) {
                        y59 adapter = r59Var.getAdapter();
                        h42 h42Var3 = az2Var.d;
                        if (adapter != h42Var3) {
                            az2Var.a.setAdapter(h42Var3);
                            az2Var.a.setFastScrollVisible(false);
                        }
                    }
                    h42Var2.f();
                    return;
                }
                return;
            case 7:
                ((nz2) this.b).b((String) this.c, Boolean.FALSE);
                return;
            case 8:
                jd4 jd4Var = ((nz2) ((zd1) this.b).f).d;
                String b = qx5.b(1024, (String) this.c);
                synchronized (((AtomicMarkableReference) jd4Var.g)) {
                    String str7 = (String) ((AtomicMarkableReference) jd4Var.g).getReference();
                    if (b == null) {
                        if (str7 == null) {
                            equals = true;
                        }
                    } else {
                        equals = b.equals(str7);
                    }
                    if (!equals) {
                        ((AtomicMarkableReference) jd4Var.g).set(b, true);
                        ((a13) ((mx6) jd4Var.c).c).a(new f8c(jd4Var, (byte) 1));
                        return;
                    }
                    return;
                }
            case 9:
                Throwable th = (Throwable) this.c;
                Map map = Collections.EMPTY_MAP;
                nz2 nz2Var = (nz2) ((zd1) this.b).f;
                Thread currentThread = Thread.currentThread();
                nz2Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                z03 z03Var = nz2Var.n;
                if (z03Var == null || !z03Var.e.get()) {
                    long j2 = currentTimeMillis / 1000;
                    String e = nz2Var.e();
                    if (e == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    v54 v54Var = new v54(e, j2, map);
                    p8a p8aVar = nz2Var.m;
                    String concat2 = "Persisting non-fatal event for session ".concat(e);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat2, null);
                    }
                    p8aVar.g(th, currentThread, "error", v54Var, false);
                    return;
                }
                return;
            case 10:
                ((my0) this.b).dismiss();
                l11.u((Context) this.c, "https://t.me/BotFather?start=deletebot");
                return;
            case 11:
                su3 su3Var = (su3) this.b;
                TreeSet treeSet = (TreeSet) this.c;
                String charSequence = su3Var.getText().toString();
                String str8 = "bot";
                str8 = (l13.a(charSequence, "bot") || l13.c(charSequence, treeSet) != null) ? "" : "";
                ru3 ru3Var = su3Var.d;
                ru3Var.setRightText(str8);
                int L = gm.L(15.0f);
                if (TextUtils.isEmpty(str8)) {
                    f2 = 21.0f;
                } else {
                    f2 = 63.0f;
                }
                ru3Var.setPadding(0, L, gm.L(f2), gm.L(15.0f));
                return;
            case 12:
                oc7.r1(((c23) this.b).a).T3((TLRPC.Updates) this.c, false);
                return;
            case 13:
                ((a33) this.b).onResult((n23) this.c);
                return;
            case 14:
                w13 w13Var = (w13) this.c;
                a33 a33Var = ((k23) this.b).f;
                if (a33Var != null) {
                    a33Var.onResult(w13Var);
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
            case 15:
                ((a33) this.b).A((o13) this.c);
                return;
            case 16:
                r23 r23Var = (r23) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    r23Var.W1 = groupcallstreamrtmpurl.url;
                    r23Var.X1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r23Var.X1);
                    r23Var.Y1 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.a |= 256;
                    obj3.b = 0;
                    obj3.c = spannableStringBuilder.length();
                    r23Var.Y1.setSpan(new xkb(obj3, 0), 0, r23Var.Y1.length(), 0);
                    r23Var.Z1.O(false);
                    return;
                }
                return;
            case 17:
                ((h33) this.b).e().A((uu4) this.c);
                return;
            case 18:
                ((h33) this.b).e().onResult((yu4) this.c);
                return;
            case 19:
                ((h33) this.b).e().A(((e79) this.c).a);
                return;
            case 20:
                ((a33) this.b).A(this.c);
                return;
            case 21:
                n23 n23Var = (n23) this.c;
                a33 a33Var2 = ((o33) this.b).f;
                if (a33Var2 != null) {
                    a33Var2.onResult(n23Var);
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
            case 22:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((a33) this.b, (Exception) this.c);
                return;
            case 23:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((a33) this.b, (e79) this.c);
                return;
            case 24:
                x53 x53Var = (x53) this.b;
                v29 v29Var = (v29) this.c;
                x53Var.l = true;
                x53Var.a.invalidate();
                v29Var.d1 = false;
                v29Var.invalidate();
                x53Var.c(true);
                return;
            case 25:
                f63 f63Var = (f63) this.b;
                pa paVar = (pa) this.c;
                f63Var.getText().delete(f63Var.getText().getSpanStart(paVar), f63Var.getText().getSpanEnd(paVar));
                f63Var.setCursorVisible(true);
                f63Var.setLongClickable(true);
                return;
            case 26:
                j63 j63Var = (j63) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(j63Var.c);
                StrictMode.ThreadPolicy threadPolicy = j63Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 27:
                ca3 ca3Var = (ca3) this.b;
                vh6 vh6Var = (vh6) this.c;
                da3 da3Var = ca3Var.U2;
                Activity parentActivity = da3Var.getParentActivity();
                p84 p84Var = da3Var.b;
                int m = vh6Var.m();
                if (vh6Var.m() == 1) {
                    j = ((TLRPC.Dialog) vh6Var.n(0)).id;
                } else {
                    j = 0;
                }
                c41.x(parentActivity, p84Var, m, j, cmb.v0(cmb.vj, ca3Var.J0), cmb.v0(cmb.xj, ca3Var.J0)).j();
                return;
            case 28:
                ob3 ob3Var = (ob3) this.b;
                go4 go4Var = (go4) this.c;
                pb3 pb3Var = ob3Var.d;
                if (pb3Var.F != 0 && !ob3Var.c) {
                    Looper looper = pb3Var.J;
                    looper.getClass();
                    ob3Var.b = pb3Var.b(looper, ob3Var.a, go4Var, false);
                    pb3Var.y.add(ob3Var);
                    return;
                }
                return;
            default:
                dc3 dc3Var = (dc3) this.b;
                Uri uri = (Uri) this.c;
                dc3Var.s = false;
                if (dc3Var.a.equals(dc3Var.y.I) || dc3Var.x) {
                    dc3Var.b(uri);
                    return;
                }
                return;
        }
    }

    public mv2(ca3 ca3Var, vh6 vh6Var, int i) {
        this.a = (byte) 27;
        this.b = ca3Var;
        this.c = vh6Var;
    }

    public mv2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
