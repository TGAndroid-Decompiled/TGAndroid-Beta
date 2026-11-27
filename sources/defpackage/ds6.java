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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class ds6 implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public ds6(zu1 zu1Var, ArrayList arrayList, int i) {
        this.a = (byte) 9;
        this.c = zu1Var;
        this.d = arrayList;
        this.b = i;
    }

    private final void a() {
        fb fbVar = (fb) this.c;
        String str = (String) this.d;
        wa waVar = fbVar.x;
        ArrayList arrayList = fbVar.y;
        arrayList.clear();
        bw9.a().getClass();
        ArrayList arrayList2 = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str).getJSONArray(1);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList2.add(jSONArray.getString(i));
            }
        } catch (Exception e) {
            cc4.g(e, false);
            try {
                JSONArray jSONArray2 = new JSONObject(str).getJSONObject("gossip").getJSONArray("results");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList2.add(jSONArray2.getJSONObject(i2).getString("key"));
                }
            } catch (Exception e2) {
                cc4.g(e2, false);
                try {
                    JSONArray jSONArray3 = new JSONArray(str);
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        String string = jSONArray3.getJSONObject(i3).getString("phrase");
                        if (!TextUtils.isEmpty(string)) {
                            arrayList2.add(string);
                        }
                    }
                } catch (Exception e3) {
                    cc4.g(e3, false);
                }
            }
        }
        arrayList.addAll(arrayList2);
        waVar.g3.O(true);
        if (this.b != (!arrayList.isEmpty())) {
            waVar.f3.g1(0, 0);
        }
    }

    private final void b() {
        id idVar = (id) this.c;
        View view = (View) this.d;
        if (view instanceof xmb) {
            xmb xmbVar = (xmb) view;
            if (xmbVar.a) {
                xmbVar.a = false;
                xmbVar.invalidate();
            }
        }
        if (this.b) {
            idVar.dismiss();
        }
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds6.c():void");
    }

    private final void d() {
        ((zu1) this.c).fb(this.b ? 1 : 0, (ArrayList) this.d, false, false);
    }

    private final void e() {
        ((zu1) this.c).Zc((r47) this.d, this.b);
    }

    private final void f() {
        int i;
        TLObject tLObject = (TLObject) this.d;
        zu1 zu1Var = ((ju1) this.c).a;
        zu1Var.pc.b();
        boolean z = tLObject instanceof TLRPC.TL_messages_stickerSet;
        boolean z2 = this.b;
        if (z) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            ls6.d0(zu1.z2(zu1Var)).L1(tL_messages_stickerSet, false);
            if (zu1Var.getParentActivity() != null && zu1Var.getParentActivity() != null) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (z2) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(tL_inputStickerSetID);
                    ly3 ly3Var = new ly3(zu1Var, zu1Var.getParentActivity(), zu1Var.Ba, arrayList);
                    boolean Y7 = zu1Var.Y7();
                    ly3Var.i0 = Y7;
                    ly3Var.n = Y7;
                    zu1Var.showDialog(ly3Var);
                    return;
                }
                s4b s4bVar = new s4b(zu1Var.getParentActivity(), zu1Var, tL_inputStickerSetID, null, zu1Var.a0, zu1Var.Ba);
                boolean Y72 = zu1Var.Y7();
                s4bVar.i0 = Y72;
                s4bVar.n = Y72;
                zu1Var.showDialog(s4bVar);
                return;
            }
            return;
        }
        d31 b0 = d31.b0(zu1Var);
        if (z2) {
            i = 2131754428;
        } else {
            i = 2131754378;
        }
        b0.Q(2131624012, 36, ob6.M0(i, null)).k(true);
    }

    private final void g() {
        n12 n12Var = (n12) this.c;
        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
        if (!n12Var.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
            n12Var.w0(true);
            editTextBoldCursor.requestFocus();
            if (this.b) {
                hl.c3(new dy1(n12Var, editTextBoldCursor, (byte) 6));
            }
        }
    }

    private final void h() {
        ((icc) this.c).a((Bitmap) this.d, Boolean.valueOf(this.b));
    }

    private final void i() {
        s92 s92Var = (s92) this.c;
        u92 u92Var = s92Var.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, u92Var.o2, u92Var.getContext());
        String M0 = ob6.M0(2131743327, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131743328, null);
        alertDialog$Builder.j(ob6.M0(2131747558, null), new bh(s92Var, (TLRPC.TL_username) this.d, this.b, (byte) 6));
        alertDialog$Builder.o();
    }

    private final void j() {
        ja2 ja2Var = (ja2) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        na2 na2Var = ja2Var.y.d;
        na2Var.P = false;
        if (!this.b && chat.join_request) {
            chat.join_request = false;
            na2Var.Q = true;
            na2Var.getMessagesController().q5(chat.id, 0L, false, false, false, new ia2(ja2Var, (byte) 1), new ea2(ja2Var, chat, (byte) 4));
        }
    }

    private final void k() {
        ((kn2) this.c).Z0((pcc) this.d, this.b, false);
    }

    private final void l() {
        boolean z;
        String G;
        int i;
        ArrayList arrayList = (ArrayList) this.d;
        uj3 uj3Var = ((lj3) this.c).b;
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
                ip7 notificationsController = uj3Var.getNotificationsController();
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
        c21 c21Var = new c21(uj3Var.getParentActivity(), null);
        TextView textView = c21Var.b;
        if (z) {
            G = ob6.G(i3, "NotificationsMutedHintChats", new Object[0]);
        } else {
            G = ob6.G(i3, "NotificationsUnmutedHintChats", new Object[0]);
        }
        textView.setText(G);
        if (z) {
            c21Var.h(2131624054, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
        } else {
            c21Var.h(2131624060, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
        }
        v21.g(uj3Var, c21Var, 1500).j();
    }

    private final void m() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds6.m():void");
    }

    private final void n() {
        nd4 nd4Var;
        xb4 xb4Var = (xb4) this.c;
        boolean z = this.b;
        String str = (String) this.d;
        if (!z) {
            nd4Var = (nd4) xb4Var.h.get(str);
        } else {
            nd4Var = (nd4) xb4Var.n.get(str);
        }
        xb4Var.y.remove(str);
        if (nd4Var != null) {
            xb4Var.n.remove(str);
            xb4Var.e.remove(nd4Var);
            xb4Var.f.remove(nd4Var);
            if (nd4Var.m != 3) {
                nd4Var.m = (byte) 2;
                Utilities.d.c(new jd4(nd4Var, (byte) 1));
                String str2 = nd4Var.l;
                if (str2 == null) {
                    Set set = u60.a;
                } else {
                    u60.a.remove(str2);
                }
                nd4Var.o.a();
                nd4Var.b();
            }
        }
    }

    private final void o() {
        ((je4) this.c).b0((nn4) this.d, !this.b);
    }

    private final void p() {
        ((qn4) this.c).a1((nn4) this.d, !this.b);
    }

    private final void q() {
        vt4 vt4Var = (vt4) this.c;
        TLObject tLObject = (TLObject) this.d;
        ArrayList arrayList = vt4Var.c;
        if (tLObject instanceof TLRPC.messages_BotResults) {
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            vt4Var.h = messages_botresults.next_offset;
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
            vt4Var.d = false;
            vt4Var.F(false);
            vt4Var.f();
        }
    }

    private final void r() {
        p35 p35Var = (p35) this.c;
        i02 i02Var = (i02) this.d;
        boolean z = this.b;
        if (!p35Var.b) {
            try {
                if (i02Var.b == ((k35) i02Var.c).l()) {
                    tne.b = p35Var;
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null && !launchActivity.isFinishing() && !launchActivity.isDestroyed() && !launchActivity.u().P()) {
                        p35Var.e = launchActivity;
                        try {
                            if (z) {
                                p35Var.a();
                            } else if (Build.VERSION.SDK_INT >= 30) {
                                p35Var.d();
                            } else {
                                p35Var.b();
                            }
                            return;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            p35Var.a();
                            return;
                        }
                    }
                    p35Var.c("AUTH_UNAVAILABLE");
                    return;
                }
                p35Var.c("STORAGE_CANCELED");
            } catch (Exception e2) {
                cc4.g(e2, true);
                p35Var.c("AUTH_UNAVAILABLE");
            }
        }
    }

    private final void s() {
        ka5 ka5Var = (ka5) this.c;
        ka5 ka5Var2 = (ka5) this.d;
        if (this.b) {
            ka5Var.y.removeView(ka5Var2);
        }
        ka5Var2.setVisibility(8);
        ka5Var.A0 = null;
    }

    private final void t() {
        in5 in5Var = (in5) this.c;
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
                            HashMap hashMap = in5Var.l;
                            SparseArray sparseArray = in5Var.m;
                            String str = (String) sparseArray.get(A);
                            if (str != null) {
                                gn5 gn5Var = (gn5) hashMap.get(str);
                                if (gn5Var != null) {
                                    ArrayList arrayList = gn5Var.c;
                                    int indexOf = arrayList.indexOf(imageReceiver);
                                    if (indexOf >= 0) {
                                        arrayList.remove(indexOf);
                                        gn5Var.d.remove(indexOf);
                                    }
                                    if (arrayList.isEmpty()) {
                                        hashMap.remove(str);
                                    }
                                }
                                sparseArray.remove(A);
                            }
                        }
                        wm5 wm5Var = (wm5) in5Var.k.get(A);
                        if (wm5Var != null) {
                            wm5Var.b(imageReceiver);
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

    private final void u() {
        LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.c;
        languageSelectActivity.getClass();
        ((id) this.d).dismiss();
        if (!this.b) {
            hl.d3(new jz5(languageSelectActivity, (byte) 2), 10L);
        }
    }

    private final void v() {
        String str = LaunchActivity.C1;
        ((LaunchActivity) this.c).u0((e) this.d, this.b, false);
    }

    private final void w() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds6.w():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds6.run():void");
    }

    public ds6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public ds6(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
