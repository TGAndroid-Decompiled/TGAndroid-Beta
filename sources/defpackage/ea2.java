package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ea2 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public ea2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        k26 k26Var = (k26) this.b;
        vw8 vw8Var = (vw8) this.c;
        synchronized (k26Var) {
            if (k26Var.b == null) {
                k26Var.a.add(vw8Var);
            } else {
                k26Var.b.add(vw8Var.get());
            }
        }
    }

    @Override
    public final void run() {
        qd3 qd3Var;
        int i;
        int i2 = 4;
        avc avcVar = null;
        switch (this.a) {
            case 0:
                na2 na2Var = (na2) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    na2Var.getMessagesController().c4(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    na2Var.w = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (xc2.c0(next) || xc2.p0(next)) {
                            it.remove();
                        }
                    }
                }
                na2Var.x = false;
                na2Var.y = true;
                na2Var.f0();
                return;
            case 1:
                ((ja2) this.b).y.d.Q = false;
                ((lw5) this.c).run();
                return;
            case 2:
                ((ja2) this.b).y.d.P = false;
                ((mw5) this.c).run();
                return;
            case 3:
                na2 na2Var2 = ((ja2) this.b).y.d;
                na2Var2.P = false;
                na2Var2.Q = false;
                ((Runnable) this.c).run();
                return;
            case 4:
                ja2 ja2Var = (ja2) this.b;
                ((TLRPC.Chat) this.c).join_request = true;
                ja2Var.h = true;
                ja2Var.c.setChecked(true);
                return;
            case 5:
                wb2 wb2Var = (wb2) this.b;
                r47 r47Var = (r47) this.c;
                if (wb2Var.Q5 == r47Var && wb2Var.B8 && wb2Var.eb != null) {
                    if (((qe8) ve8.b.get(Long.valueOf(r47Var.F0().id))) != null) {
                        wb2Var.G8 = wb2Var.F8;
                        wb2Var.E8 = true;
                        wb2Var.eb.l1(wb2Var, false);
                        return;
                    }
                    wb2Var.eb.A0(wb2Var, false);
                    return;
                }
                return;
            case 6:
                ((wb2) this.b).Q0.draw((Canvas) this.c);
                return;
            case 7:
                ((wb2) this.b).post(new ib2((wb2) this.c, (byte) 6));
                return;
            case 8:
                ((gc2) this.b).a.getMessagesController().O1().k.j((ArrayList) this.c);
                return;
            case 9:
                ((ke2) this.b).b.M0((ArrayList) this.c);
                return;
            case 10:
                ((le2) this.b).b.M0((ArrayList) this.c);
                return;
            case 11:
                ((ResultCallback) this.b).onError((TLRPC.TL_error) this.c);
                return;
            case 12:
                ((le2) this.b).onError((TLRPC.TL_error) this.c);
                return;
            case 13:
                ze2 ze2Var = ((af2) this.b).f;
                ze2Var.b = System.currentTimeMillis();
                ze2Var.c = true;
                ((le2) this.c).onComplete(null);
                return;
            case 14:
                qt0 qt0Var = (qt0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    avcVar = new avc(bitmap, 0, null);
                }
                qt0Var.a(avcVar);
                return;
            case 15:
                ((bg2) this.b).getMessagesController().e3(0, ((TLRPC.Updates) this.c).chats.get(0).id, true);
                return;
            case 16:
                TLRPC.User user = (TLRPC.User) this.c;
                bg2 bg2Var = ((rf2) this.b).a;
                if (d31.a(bg2Var)) {
                    d31.C(user.first_name, bg2Var).j();
                    return;
                }
                return;
            case 17:
                dg2 dg2Var = (dg2) this.b;
                y31.a(dg2Var.a).b();
                ((oe7) this.c).run();
                dg2Var.dismiss();
                return;
            case 18:
                ((mg2) this.b).b0((TLObject) this.c);
                return;
            case 19:
                dj2 dj2Var = (dj2) this.b;
                View view = (View) this.c;
                cj2 cj2Var = (cj2) dj2Var.d;
                if ((dj2Var.a & 2) != 0) {
                    boolean W0 = cj2Var.W0(view, dj2Var.b, dj2Var.c);
                    int i3 = dj2Var.a;
                    if (W0) {
                        dj2Var.a = i3 & (-3);
                        dj2Var.e = null;
                        view.performHapticFeedback(0);
                        dj2Var.a = (dj2Var.a | 4) & (-11);
                        dj2Var.e = null;
                        return;
                    }
                    dj2Var.a = i3 | 8;
                    return;
                }
                return;
            case 20:
                ((zo2) this.b).a((SpannableString) this.c);
                return;
            case 21:
                io2 io2Var = (io2) this.b;
                io2Var.getClass();
                io2Var.presentFragment(zu1.ha(((do2) this.c).b.id));
                return;
            case 22:
                ((xo2) this.b).t1.presentFragment(zu1.ha(((do2) this.c).b.id));
                return;
            case 23:
                au7 au7Var = (au7) this.b;
                vw8 vw8Var = (vw8) this.c;
                if (au7Var.b == au7.d) {
                    synchronized (au7Var) {
                        qd3Var = au7Var.a;
                        au7Var.a = null;
                        au7Var.b = vw8Var;
                    }
                    qd3Var.f(vw8Var);
                    return;
                }
                grb.i("provide() can be called only once.");
                return;
            case 24:
                a();
                return;
            case 25:
                ((ConferenceCall) this.b).lambda$processUpdates$4((TLRPC.Updates) this.c);
                return;
            case 26:
                ((rx6) this.b).E((us2) this.c);
                return;
            case 27:
                ((lv2) this.b).j(((Long) this.c).longValue());
                return;
            case 28:
                lv2 lv2Var = (lv2) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    TLRPC.User user2 = (TLRPC.User) entry.getKey();
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
                    user2.contact = true;
                    lv2Var.f0.add(tL_contact);
                    lv2Var.g0.put(Long.valueOf(user2.id), tL_contact);
                }
                lv2Var.d(true);
                jn7 notificationCenter = lv2Var.getNotificationCenter();
                int i4 = uc7.s5;
                notificationCenter.k(2, 1);
                lv2Var.getNotificationCenter().k(25, new Object[0]);
                return;
            default:
                lv2 lv2Var2 = (lv2) this.b;
                on8 on8Var = (on8) this.c;
                AccountManager accountManager = AccountManager.get(a.b);
                try {
                    Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
                    lv2Var2.a = null;
                    int i5 = 0;
                    while (i5 < accountsByType.length) {
                        Account account = accountsByType[i5];
                        int i6 = 0;
                        while (true) {
                            if (i6 < i2) {
                                TLRPC.User f = yac.h(i6).f();
                                if (f != null) {
                                    String str = account.name;
                                    i = i2;
                                    if (str.equals("" + f.id)) {
                                        accountManager.removeAccount(account, null, null);
                                    }
                                } else {
                                    i = i2;
                                }
                                i6++;
                                i2 = i;
                            } else {
                                i = i2;
                            }
                        }
                        i5++;
                        i2 = i;
                    }
                } catch (Throwable unused) {
                }
                try {
                    Account account2 = new Account("" + lv2Var2.getUserConfig().e(), "org.telegram.messenger");
                    lv2Var2.a = account2;
                    accountManager.addAccountExplicitly(account2, "", null);
                } catch (Exception unused2) {
                }
                lv2Var2.getMessagesStorage().a1(new HashMap(), false, true);
                lv2Var2.getMessagesStorage().d1(new ArrayList(), true);
                lv2Var2.b0.clear();
                lv2Var2.f0.clear();
                lv2Var2.g0.clear();
                lv2Var2.h0.clear();
                lv2Var2.j0.clear();
                lv2Var2.i0.clear();
                lv2Var2.c0.clear();
                lv2Var2.d0.clear();
                lv2Var2.e0.clear();
                lv2Var2.x.clear();
                lv2Var2.k0.clear();
                lv2Var2.l0.clear();
                lv2Var2.m0.clear();
                lv2Var2.getNotificationCenter().k(25, new Object[0]);
                lv2Var2.A(0L, false);
                on8Var.run();
                return;
        }
    }
}
