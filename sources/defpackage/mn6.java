package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.webrtc.EglRenderer;
public final class mn6 implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public mn6(mu1 mu1Var, ArrayList arrayList, int i) {
        this.a = (byte) 10;
        this.c = mu1Var;
        this.d = arrayList;
        this.b = i;
    }

    private final void a() {
        eb ebVar = (eb) this.c;
        String str = (String) this.d;
        va vaVar = ebVar.x;
        ArrayList arrayList = ebVar.y;
        arrayList.clear();
        is9.a().getClass();
        ArrayList arrayList2 = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str).getJSONArray(1);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList2.add(jSONArray.getString(i));
            }
        } catch (Exception e) {
            fa4.g(e, false);
            try {
                JSONArray jSONArray2 = new JSONObject(str).getJSONObject("gossip").getJSONArray("results");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList2.add(jSONArray2.getJSONObject(i2).getString("key"));
                }
            } catch (Exception e2) {
                fa4.g(e2, false);
                try {
                    JSONArray jSONArray3 = new JSONArray(str);
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        String string = jSONArray3.getJSONObject(i3).getString("phrase");
                        if (!TextUtils.isEmpty(string)) {
                            arrayList2.add(string);
                        }
                    }
                } catch (Exception e3) {
                    fa4.g(e3, false);
                }
            }
        }
        arrayList.addAll(arrayList2);
        vaVar.g3.O(true);
        if (this.b != (!arrayList.isEmpty())) {
            vaVar.f3.g1(0, 0);
        }
    }

    private final void b() {
        hd hdVar = (hd) this.c;
        View view = (View) this.d;
        if (view instanceof bjb) {
            bjb bjbVar = (bjb) view;
            if (bjbVar.a) {
                bjbVar.a = false;
                bjbVar.invalidate();
            }
        }
        if (this.b) {
            hdVar.dismiss();
        }
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn6.c():void");
    }

    private final void d() {
        ((mu1) this.c).Lc((k27) this.d, this.b);
    }

    private final void e() {
        ((mu1) this.c).Sa(this.b ? 1 : 0, (ArrayList) this.d, false, false);
    }

    private final void f() {
        int i;
        int i2;
        TLObject tLObject = (TLObject) this.d;
        mu1 mu1Var = ((wt1) this.c).a;
        mu1Var.ec.b();
        boolean z = tLObject instanceof TLRPC.TL_messages_stickerSet;
        boolean z2 = this.b;
        if (z) {
            i2 = ((d) mu1Var).currentAccount;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            hq6.d0(i2).L1(tL_messages_stickerSet, false);
            if (mu1Var.getParentActivity() != null && mu1Var.getParentActivity() != null) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (z2) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(tL_inputStickerSetID);
                    qx3 qx3Var = new qx3(mu1Var, mu1Var.getParentActivity(), mu1Var.Ba, arrayList);
                    boolean O7 = mu1Var.O7();
                    qx3Var.i0 = O7;
                    qx3Var.n = O7;
                    mu1Var.showDialog(qx3Var);
                    return;
                }
                u0b u0bVar = new u0b(mu1Var.getParentActivity(), mu1Var, tL_inputStickerSetID, null, mu1Var.a0, mu1Var.Ba);
                boolean O72 = mu1Var.O7();
                u0bVar.i0 = O72;
                u0bVar.n = O72;
                mu1Var.showDialog(u0bVar);
                return;
            }
            return;
        }
        u21 b0 = u21.b0(mu1Var);
        if (z2) {
            i = 2131754432;
        } else {
            i = 2131754382;
        }
        b0.Q(2131624012, 36, k96.M0(i, null)).k(true);
    }

    private final void g() {
        x02 x02Var = (x02) this.c;
        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
        if (!x02Var.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
            x02Var.v0(true);
            editTextBoldCursor.requestFocus();
            if (this.b) {
                gl.d3(new kx1(x02Var, editTextBoldCursor, (byte) 6));
            }
        }
    }

    private final void h() {
        ((i8c) this.c).a((Bitmap) this.d, Boolean.valueOf(this.b));
    }

    private final void i() {
        c92 c92Var = (c92) this.c;
        e92 e92Var = c92Var.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e92Var.o2, e92Var.getContext());
        String M0 = k96.M0(2131743433, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131743434, null);
        alertDialog$Builder.j(k96.M0(2131747638, null), new ch(c92Var, (TLRPC.TL_username) this.d, this.b, (byte) 6));
        alertDialog$Builder.o();
    }

    private final void j() {
        t92 t92Var = (t92) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        x92 x92Var = t92Var.y.d;
        x92Var.P = false;
        if (!this.b && chat.join_request) {
            chat.join_request = false;
            x92Var.Q = true;
            x92Var.getMessagesController().h5(chat.id, 0L, false, false, false, new s92(t92Var, (byte) 1), new n92(t92Var, chat, (byte) 5));
        }
    }

    private final void k() {
        ((qm2) this.c).Y0((p8c) this.d, this.b, false);
    }

    private final void l() {
        boolean z;
        String G;
        int i;
        ArrayList arrayList = (ArrayList) this.d;
        cj3 cj3Var = ((ti3) this.c).b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = arrayList.size();
            z = this.b;
            if (i2 >= size) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i2);
            if (dialog != null) {
                im7 notificationsController = cj3Var.getNotificationsController();
                long j = dialog.id;
                if (z) {
                    i = 3;
                } else {
                    i = 4;
                }
                notificationsController.T(j, i, 0L);
                i3++;
            }
            i2++;
        }
        t11 t11Var = new t11(cj3Var.getParentActivity(), null);
        TextView textView = t11Var.b;
        if (z) {
            G = k96.G(i3, "NotificationsMutedHintChats", new Object[0]);
        } else {
            G = k96.G(i3, "NotificationsUnmutedHintChats", new Object[0]);
        }
        textView.setText(G);
        if (z) {
            t11Var.d(2131624054, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
        } else {
            t11Var.d(2131624060, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
        }
        m21.g(cj3Var, t11Var, 1500).j();
    }

    private final void m() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn6.m():void");
    }

    private final void n() {
        EglRenderer.e((EglRenderer) this.c, this.b, (Runnable) this.d);
    }

    private final void o() {
        qb4 qb4Var;
        ba4 ba4Var = (ba4) this.c;
        boolean z = this.b;
        String str = (String) this.d;
        if (!z) {
            qb4Var = (qb4) ba4Var.h.get(str);
        } else {
            qb4Var = (qb4) ba4Var.n.get(str);
        }
        ba4Var.y.remove(str);
        if (qb4Var != null) {
            ba4Var.n.remove(str);
            ba4Var.e.remove(qb4Var);
            ba4Var.f.remove(qb4Var);
            if (qb4Var.m != 3) {
                qb4Var.m = (byte) 2;
                Utilities.d.c(new mb4(qb4Var, (byte) 1));
                String str2 = qb4Var.l;
                if (str2 == null) {
                    Set set = s60.a;
                } else {
                    s60.a.remove(str2);
                }
                qb4Var.o.a();
                qb4Var.b();
            }
        }
    }

    private final void p() {
        ((mc4) this.c).b0((il4) this.d, !this.b);
    }

    private final void q() {
        ((ll4) this.c).Z0((il4) this.d, !this.b);
    }

    private final void r() {
        rr4 rr4Var = (rr4) this.c;
        TLObject tLObject = (TLObject) this.d;
        ArrayList arrayList = rr4Var.c;
        if (tLObject instanceof TLRPC.messages_BotResults) {
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            rr4Var.h = messages_botresults.next_offset;
            if (this.b) {
                arrayList.clear();
            }
            for (int i = 0; i < messages_botresults.results.size(); i++) {
                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i);
                TLRPC.Document document = botInlineResult.document;
                if (document != null) {
                    arrayList.add(document);
                } else {
                    TLRPC.Photo photo = botInlineResult.photo;
                    if (photo != null) {
                        arrayList.add(photo);
                    } else if (botInlineResult.content != null) {
                        arrayList.add(botInlineResult);
                    }
                }
            }
            rr4Var.d = false;
            rr4Var.F(false);
            rr4Var.f();
        }
    }

    private final void s() {
        l15 l15Var = (l15) this.c;
        rz1 rz1Var = (rz1) this.d;
        boolean z = this.b;
        if (!l15Var.b) {
            try {
                if (rz1Var.b == ((g15) rz1Var.c).l()) {
                    bje.b = l15Var;
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null && !launchActivity.isFinishing() && !launchActivity.isDestroyed() && !launchActivity.u().P()) {
                        l15Var.e = launchActivity;
                        try {
                            if (z) {
                                l15Var.a();
                            } else if (Build.VERSION.SDK_INT >= 30) {
                                l15Var.d();
                            } else {
                                l15Var.b();
                            }
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            l15Var.a();
                            return;
                        }
                    }
                    l15Var.c("AUTH_UNAVAILABLE");
                    return;
                }
                l15Var.c("STORAGE_CANCELED");
            } catch (Exception e2) {
                fa4.g(e2, true);
                l15Var.c("AUTH_UNAVAILABLE");
            }
        }
    }

    private final void t() {
        h85 h85Var = (h85) this.c;
        h85 h85Var2 = (h85) this.d;
        if (this.b) {
            h85Var.y.removeView(h85Var2);
        }
        h85Var2.setVisibility(8);
        h85Var.A0 = null;
    }

    private final void u() {
        fl5 fl5Var = (fl5) this.c;
        ImageReceiver imageReceiver = (ImageReceiver) this.d;
        int i = 0;
        while (true) {
            int i2 = 3;
            if (i < 3) {
                if (i <= 0 || this.b) {
                    if (i == 0) {
                        i2 = 1;
                    } else if (i == 1) {
                        i2 = 0;
                    }
                    int A = imageReceiver.A(i2);
                    if (A != 0) {
                        if (i == 0) {
                            HashMap hashMap = fl5Var.l;
                            SparseArray sparseArray = fl5Var.m;
                            String str = (String) sparseArray.get(A);
                            if (str != null) {
                                dl5 dl5Var = (dl5) hashMap.get(str);
                                if (dl5Var != null) {
                                    ArrayList arrayList = dl5Var.c;
                                    int indexOf = arrayList.indexOf(imageReceiver);
                                    if (indexOf >= 0) {
                                        arrayList.remove(indexOf);
                                        dl5Var.d.remove(indexOf);
                                    }
                                    if (arrayList.isEmpty()) {
                                        hashMap.remove(str);
                                    }
                                }
                                sparseArray.remove(A);
                            }
                        }
                        tk5 tk5Var = (tk5) fl5Var.k.get(A);
                        if (tk5Var != null) {
                            tk5Var.b(imageReceiver);
                        }
                    }
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void v() {
        LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.c;
        languageSelectActivity.getClass();
        ((hd) this.d).dismiss();
        if (!this.b) {
            gl.e3(new ex5(languageSelectActivity, (byte) 1), 10L);
        }
    }

    private final void w() {
        String str = LaunchActivity.C1;
        ((LaunchActivity) this.c).u0((d) this.d, this.b, false);
    }

    private final void x() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn6.x():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn6.run():void");
    }

    public mn6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public mn6(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
