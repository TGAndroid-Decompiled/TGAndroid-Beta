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
public final class np6 implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public np6(yv1 yv1Var, ArrayList arrayList, int i) {
        this.a = (byte) 10;
        this.c = yv1Var;
        this.d = arrayList;
        this.b = i;
    }

    private final void a() {
        eb ebVar = (eb) this.c;
        String str = (String) this.d;
        va vaVar = ebVar.x;
        ArrayList arrayList = ebVar.y;
        arrayList.clear();
        ku9.a().getClass();
        ArrayList arrayList2 = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str).getJSONArray(1);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList2.add(jSONArray.getString(i));
            }
        } catch (Exception e) {
            fc4.g(e, false);
            try {
                JSONArray jSONArray2 = new JSONObject(str).getJSONObject("gossip").getJSONArray("results");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList2.add(jSONArray2.getJSONObject(i2).getString("key"));
                }
            } catch (Exception e2) {
                fc4.g(e2, false);
                try {
                    JSONArray jSONArray3 = new JSONArray(str);
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        String string = jSONArray3.getJSONObject(i3).getString("phrase");
                        if (!TextUtils.isEmpty(string)) {
                            arrayList2.add(string);
                        }
                    }
                } catch (Exception e3) {
                    fc4.g(e3, false);
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
        he heVar = (he) this.c;
        View view = (View) this.d;
        if (view instanceof clb) {
            clb clbVar = (clb) view;
            if (clbVar.a) {
                clbVar.a = false;
                clbVar.invalidate();
            }
        }
        if (this.b) {
            heVar.dismiss();
        }
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np6.c():void");
    }

    private final void d() {
        ((yv1) this.c).Zc((k47) this.d, this.b);
    }

    private final void e() {
        ((yv1) this.c).eb(this.b ? 1 : 0, (ArrayList) this.d, false, false);
    }

    private final void f() {
        int i;
        int i2;
        TLObject tLObject = (TLObject) this.d;
        yv1 yv1Var = ((iv1) this.c).a;
        yv1Var.oc.b();
        boolean z = tLObject instanceof TLRPC.TL_messages_stickerSet;
        boolean z2 = this.b;
        if (z) {
            i2 = ((d) yv1Var).currentAccount;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            hs6.d0(i2).L1(tL_messages_stickerSet, false);
            if (yv1Var.getParentActivity() != null && yv1Var.getParentActivity() != null) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (z2) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(tL_inputStickerSetID);
                    az3 az3Var = new az3(yv1Var, yv1Var.getParentActivity(), yv1Var.Ba, arrayList);
                    boolean Y7 = yv1Var.Y7();
                    az3Var.i0 = Y7;
                    az3Var.n = Y7;
                    yv1Var.showDialog(az3Var);
                    return;
                }
                x2b x2bVar = new x2b(yv1Var.getParentActivity(), yv1Var, tL_inputStickerSetID, null, yv1Var.a0, yv1Var.Ba);
                boolean Y72 = yv1Var.Y7();
                x2bVar.i0 = Y72;
                x2bVar.n = Y72;
                yv1Var.showDialog(x2bVar);
                return;
            }
            return;
        }
        c41 b0 = c41.b0(yv1Var);
        if (z2) {
            i = 2131754432;
        } else {
            i = 2131754382;
        }
        b0.Q(2131624012, 36, jb6.M0(i, null)).k(true);
    }

    private final void g() {
        i22 i22Var = (i22) this.c;
        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
        if (!i22Var.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
            i22Var.v0(true);
            editTextBoldCursor.requestFocus();
            if (this.b) {
                gm.c3(new lx1(i22Var, editTextBoldCursor, (byte) 7));
            }
        }
    }

    private final void h() {
        ((jac) this.c).a((Bitmap) this.d, Boolean.valueOf(this.b));
    }

    private final void i() {
        na2 na2Var = (na2) this.c;
        pa2 pa2Var = na2Var.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, pa2Var.o2, pa2Var.getContext());
        String M0 = jb6.M0(2131743359, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131743360, null);
        alertDialog$Builder.j(jb6.M0(2131747564, null), new ci(na2Var, (TLRPC.TL_username) this.d, this.b, (byte) 6));
        alertDialog$Builder.o();
    }

    private final void j() {
        eb2 eb2Var = (eb2) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        ib2 ib2Var = eb2Var.y.d;
        ib2Var.P = false;
        if (!this.b && chat.join_request) {
            chat.join_request = false;
            ib2Var.Q = true;
            ib2Var.getMessagesController().k5(chat.id, 0L, false, false, false, new db2(eb2Var, (byte) 1), new ra2(eb2Var, chat, (byte) 6));
        }
    }

    private final void k() {
        ((co2) this.c).Y0((qac) this.d, this.b, false);
    }

    private final void l() {
        boolean z;
        String G;
        int i;
        ArrayList arrayList = (ArrayList) this.d;
        nk3 nk3Var = ((dk3) this.c).b;
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
                lo7 notificationsController = nk3Var.getNotificationsController();
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
        b31 b31Var = new b31(nk3Var.getParentActivity(), null);
        TextView textView = b31Var.b;
        if (z) {
            G = jb6.G(i3, "NotificationsMutedHintChats", new Object[0]);
        } else {
            G = jb6.G(i3, "NotificationsUnmutedHintChats", new Object[0]);
        }
        textView.setText(G);
        if (z) {
            b31Var.d(2131624054, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
        } else {
            b31Var.d(2131624060, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
        }
        u31.g(nk3Var, b31Var, 1500).j();
    }

    private final void m() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np6.m():void");
    }

    private final void n() {
        EglRenderer.e((EglRenderer) this.c, this.b, (Runnable) this.d);
    }

    private final void o() {
        qd4 qd4Var;
        bc4 bc4Var = (bc4) this.c;
        boolean z = this.b;
        String str = (String) this.d;
        if (!z) {
            qd4Var = (qd4) bc4Var.h.get(str);
        } else {
            qd4Var = (qd4) bc4Var.n.get(str);
        }
        bc4Var.y.remove(str);
        if (qd4Var != null) {
            bc4Var.n.remove(str);
            bc4Var.e.remove(qd4Var);
            bc4Var.f.remove(qd4Var);
            if (qd4Var.m != 3) {
                qd4Var.m = (byte) 2;
                Utilities.d.c(new md4(qd4Var, (byte) 1));
                String str2 = qd4Var.l;
                if (str2 == null) {
                    Set set = s70.a;
                } else {
                    s70.a.remove(str2);
                }
                qd4Var.o.a();
                qd4Var.b();
            }
        }
    }

    private final void p() {
        ((me4) this.c).c0((in4) this.d, !this.b);
    }

    private final void q() {
        ((ln4) this.c).Z0((in4) this.d, !this.b);
    }

    private final void r() {
        st4 st4Var = (st4) this.c;
        TLObject tLObject = (TLObject) this.d;
        ArrayList arrayList = st4Var.c;
        if (tLObject instanceof TLRPC.messages_BotResults) {
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            st4Var.h = messages_botresults.next_offset;
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
            st4Var.d = false;
            st4Var.F(false);
            st4Var.f();
        }
    }

    private final void s() {
        l35 l35Var = (l35) this.c;
        d12 d12Var = (d12) this.d;
        boolean z = this.b;
        if (!l35Var.b) {
            try {
                if (d12Var.b == ((g35) d12Var.c).l()) {
                    cle.b = l35Var;
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null && !launchActivity.isFinishing() && !launchActivity.isDestroyed() && !launchActivity.u().P()) {
                        l35Var.e = launchActivity;
                        try {
                            if (z) {
                                l35Var.a();
                            } else if (Build.VERSION.SDK_INT >= 30) {
                                l35Var.d();
                            } else {
                                l35Var.b();
                            }
                            return;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            l35Var.a();
                            return;
                        }
                    }
                    l35Var.c("AUTH_UNAVAILABLE");
                    return;
                }
                l35Var.c("STORAGE_CANCELED");
            } catch (Exception e2) {
                fc4.g(e2, true);
                l35Var.c("AUTH_UNAVAILABLE");
            }
        }
    }

    private final void t() {
        ha5 ha5Var = (ha5) this.c;
        ha5 ha5Var2 = (ha5) this.d;
        if (this.b) {
            ha5Var.y.removeView(ha5Var2);
        }
        ha5Var2.setVisibility(8);
        ha5Var.A0 = null;
    }

    private final void u() {
        fn5 fn5Var = (fn5) this.c;
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
                            HashMap hashMap = fn5Var.l;
                            SparseArray sparseArray = fn5Var.m;
                            String str = (String) sparseArray.get(A);
                            if (str != null) {
                                dn5 dn5Var = (dn5) hashMap.get(str);
                                if (dn5Var != null) {
                                    ArrayList arrayList = dn5Var.c;
                                    int indexOf = arrayList.indexOf(imageReceiver);
                                    if (indexOf >= 0) {
                                        arrayList.remove(indexOf);
                                        dn5Var.d.remove(indexOf);
                                    }
                                    if (arrayList.isEmpty()) {
                                        hashMap.remove(str);
                                    }
                                }
                                sparseArray.remove(A);
                            }
                        }
                        tm5 tm5Var = (tm5) fn5Var.k.get(A);
                        if (tm5Var != null) {
                            tm5Var.b(imageReceiver);
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
        ((he) this.d).dismiss();
        if (!this.b) {
            gm.d3(new ez5(languageSelectActivity, (byte) 1), 10L);
        }
    }

    private final void w() {
        String str = LaunchActivity.C1;
        ((LaunchActivity) this.c).u0((d) this.d, this.b, false);
    }

    private final void x() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np6.x():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np6.run():void");
    }

    public np6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public np6(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
