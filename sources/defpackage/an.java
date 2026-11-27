package defpackage;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PasskeysActivity;
public final class an implements fn, ci0, fd, cf7, ot2, yn5, fy8, t69 {
    public final byte a;
    public final Object b;
    public final int c;
    public final Object d;
    public final Object e;

    public an(int i, bt1 bt1Var, wk5 wk5Var, zn5 zn5Var) {
        this.a = (byte) 7;
        this.c = i;
        this.d = bt1Var;
        this.b = wk5Var;
        this.e = zn5Var;
    }

    @Override
    public final void A(boolean z) {
        boolean z2;
        int i;
        uj3 uj3Var = (uj3) this.d;
        ArrayList arrayList = (ArrayList) this.b;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView w3 = uj3Var.w3();
        int i2 = this.c;
        if (w3 != null) {
            if (i2 == 102) {
                i = 27;
            } else {
                i = 26;
            }
            w3.n(arrayList2, i, null, null, new ah3(uj3Var, i2, arrayList2, z, hashSet), null);
        }
        if (i2 == 103) {
            z2 = true;
        } else {
            z2 = false;
        }
        uj3Var.A3(z2);
    }

    @Override
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        final bt1 bt1Var = (bt1) this.d;
        final wk5 wk5Var = (wk5) this.b;
        final zn5 zn5Var = (zn5) this.e;
        final int i = this.c;
        hl.c3(new Runnable() {
            @Override
            public final void run() {
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                TLRPC.InputFile inputFile3 = TLRPC.InputFile.this;
                if (inputFile3 != null) {
                    tL_photos_uploadProfilePhoto.file = inputFile3;
                    tL_photos_uploadProfilePhoto.flags |= 1;
                }
                TLRPC.InputFile inputFile4 = inputFile2;
                if (inputFile4 != null) {
                    tL_photos_uploadProfilePhoto.video = inputFile4;
                    int i2 = tL_photos_uploadProfilePhoto.flags;
                    tL_photos_uploadProfilePhoto.video_start_ts = d;
                    tL_photos_uploadProfilePhoto.flags = i2 | 6;
                }
                TLRPC.VideoSize videoSize2 = videoSize;
                if (videoSize2 != null) {
                    tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                    tL_photos_uploadProfilePhoto.flags |= 16;
                }
                int i3 = i;
                ConnectionsManager.getInstance(i3).sendRequest(tL_photos_uploadProfilePhoto, new eu0(i3, photoSize2, photoSize, bt1Var, wk5Var, (byte) 9));
                zn5Var.i();
            }
        });
    }

    @Override
    public final void a(gi0 gi0Var, List list) {
        hl.c3(new te(gi0Var, (e) this.d, list, this.c, (ekd) this.b, (tl8) this.e, (byte) 10));
    }

    @Override
    public final void accept(Object obj) {
        lp lpVar = (lp) this.d;
        ((zz6) obj).O(lpVar.b, (vz6) lpVar.c, (ja6) this.b, (jt6) this.e, this.c);
    }

    @Override
    public final void b(CharSequence charSequence) {
        hn hnVar = (hn) this.d;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j = hnVar.j(this.c - ((int) Math.ceil(Math.min(hnVar.d, hnVar.j))), charSequence);
        en enVar = new en(hnVar, j, hnVar.d, arrayList.size());
        en enVar2 = new en(hnVar, j, hnVar.j, arrayList2.size());
        arrayList2.add(enVar);
        arrayList.add(enVar2);
        float f = hnVar.d;
        float f2 = enVar.f;
        hnVar.d = f + f2;
        hnVar.j += f2;
        hnVar.f(enVar);
        hnVar.g(enVar2);
    }

    @Override
    public final void c(gi0 gi0Var, List list) {
        ArrayList arrayList = (ArrayList) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        pcc pccVar = (pcc) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wo8 wo8Var = (wo8) it.next();
            to8 a = wo8Var.a();
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(wo8Var.c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, di0.h().g(tL_premiumGiftCodeOption.currency)) * (a.b / 1000000.0d));
                        tL_premiumGiftCodeOption.currency = a.c;
                        break;
                    }
                }
            }
        }
        hl.c3(new gn0(chat, this.c, arrayList, pccVar, (byte) 0));
    }

    @Override
    public final boolean e(int i, View view) {
        int i2;
        ow9 ow9Var = (ow9) this.d;
        e eVar = (e) this.b;
        vnb vnbVar = (vnb) this.e;
        ArrayList arrayList = ow9Var.r;
        if (i >= 0 && i < arrayList.size()) {
            int i3 = this.c;
            if (yac.h(i3).p()) {
                if (!yac.h(i3).p()) {
                    new xk8(eVar, 24, true).show();
                    return true;
                }
                mw9 mw9Var = ((nw9) view).a;
                if (mw9Var != null) {
                    mw9Var.p();
                }
                lw9 lw9Var = (lw9) arrayList.get(i);
                fu5 I = fu5.I(eVar, view);
                I.i = (byte) 3;
                if (TextUtils.isEmpty(lw9Var.c)) {
                    i2 = 2131745609;
                } else {
                    i2 = 2131745597;
                }
                I.b(2131231905, ob6.M0(i2, null), new y36(ow9Var, i3, lw9Var, vnbVar, (byte) 25), false);
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final fd8 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final void w(id idVar, int i) {
        TL_bots.toggleUsername toggleusername;
        byte b = this.a;
        int i2 = this.c;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 2:
                final me1 me1Var = (me1) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z = tL_username.active;
                final String str = tL_username.username;
                final boolean z2 = !z;
                ve1 ve1Var = me1Var.a;
                long j = ve1Var.y;
                if (j == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z2;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = uc7.s1(ve1.Y(ve1Var)).o1(j);
                    toggleusername3.username = str;
                    toggleusername3.active = z2;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = ve1Var.getConnectionsManager();
                final int i3 = this.c;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        hl.c3(new le1(me1.this, str, tLObject, i3, z2, tL_error, tL_username, z));
                    }
                });
                ve1Var.x.add(tL_username.username);
                ((re1) view).setLoading(true);
                return;
            case 3:
                y13 y13Var = (y13) obj3;
                c51 c51Var = (c51) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!c51Var.R) {
                    c51Var.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i2).sendRequest(getgroupcallstreamrtmpurl, new w13(y13Var, c51Var, (byte) 1));
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                eja ejaVar = (eja) obj3;
                r47 r47Var = (r47) obj;
                id[] idVarArr = {new id(3, (vnb) obj2, ejaVar.getContext())};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) r47Var.k.media).poll;
                tL_poll.id = poll.id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i4 = this.c;
                tL_messages_editMessage.peer = uc7.s1(i4).j1(ejaVar.m1);
                tL_messages_editMessage.id = r47Var.e1();
                tL_messages_editMessage.flags |= 16384;
                hl.d3(new xfa(idVarArr, i4, ConnectionsManager.getInstance(i4).sendRequest(tL_messages_editMessage, new lh(ejaVar, idVarArr, i4, tL_messages_editMessage, (byte) 9)), (byte) 1), 500L);
                return;
            case 6:
                ((PasskeysActivity) obj3).b0((TL_account.Passkey) obj2, (String) obj, i2);
                return;
        }
    }

    @Override
    public final boolean x() {
        return false;
    }

    public an(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = obj2;
        this.e = obj3;
    }

    public an(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = i;
        this.e = obj3;
    }

    public an(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = i;
    }

    public an(ArrayList arrayList, TLRPC.Chat chat, int i, pcc pccVar) {
        this.a = (byte) 1;
        this.b = arrayList;
        this.d = chat;
        this.c = i;
        this.e = pccVar;
    }

    @Override
    public final void T() {
    }

    @Override
    public final void H(float f) {
    }

    @Override
    public final void O(boolean z, boolean z2) {
    }
}
