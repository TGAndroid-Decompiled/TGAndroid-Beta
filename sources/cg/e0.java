package cg;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import b8.kg;
import ei.i8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.ir;
import org.telegram.messenger.q1;
import org.telegram.messenger.r1;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.voip.o2;
import org.telegram.ui.Components.voip.p2;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.ba;
import org.telegram.ui.ha;
import org.telegram.ui.ka;
import org.telegram.ui.lu;
import org.telegram.ui.mq0;
import org.telegram.ui.ms0;
import org.telegram.ui.uw;
import org.telegram.ui.xg;
import org.telegram.ui.zb1;
public final class e0 implements e30, p1, e6, hj0, ir, e5.m, o2, g2.k, q1 {
    public final int f4643a;
    public final int f4644b;
    public final Object f4645c;
    public final Object d;
    public final Object f4646e;

    public e0(int i3, xg xgVar, q4 q4Var, f30 f30Var) {
        this.f4643a = 0;
        this.f4644b = i3;
        this.f4645c = xgVar;
        this.d = q4Var;
        this.f4646e = f30Var;
    }

    @Override
    public void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final xg xgVar = (xg) this.f4645c;
        final q4 q4Var = (q4) this.d;
        final f30 f30Var = (f30) this.f4646e;
        final int i3 = this.f4644b;
        org.telegram.messenger.g0.h3(new Runnable() {
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
                    int i10 = tL_photos_uploadProfilePhoto.flags;
                    tL_photos_uploadProfilePhoto.video_start_ts = d;
                    tL_photos_uploadProfilePhoto.flags = i10 | 6;
                }
                TLRPC.VideoSize videoSize2 = videoSize;
                if (videoSize2 != null) {
                    tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                    tL_photos_uploadProfilePhoto.flags |= 16;
                }
                int i11 = i3;
                ConnectionsManager.getInstance(i11).sendRequest(tL_photos_uploadProfilePhoto, new j0(i11, photoSize2, photoSize, xgVar, q4Var, 0));
                f30Var.i();
            }
        });
    }

    @Override
    public void a(e5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new k0(fVar, (d2) this.f4645c, list, this.f4644b, (ad.b) this.d, (ms0) this.f4646e, 13));
    }

    @Override
    public void accept(Object obj) {
        kg kgVar = (kg) this.f4645c;
        ((w2.k0) obj).K(kgVar.f2722b, (w2.g0) kgVar.f2723c, (w2.u) this.d, (w2.c0) this.f4646e, this.f4644b);
    }

    @Override
    public void b(CharSequence charSequence) {
        g6 g6Var = (g6) this.f4645c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.f4646e;
        StaticLayout j10 = g6Var.j(this.f4644b - ((int) Math.ceil(Math.min(g6Var.d, g6Var.f33990j))), charSequence);
        d6 d6Var = new d6(g6Var, j10, g6Var.d, arrayList.size());
        d6 d6Var2 = new d6(g6Var, j10, g6Var.f33990j, arrayList2.size());
        arrayList2.add(d6Var);
        arrayList.add(d6Var2);
        float f10 = g6Var.d;
        float f11 = d6Var.f32956f;
        g6Var.d = f10 + f11;
        g6Var.f33990j += f11;
        g6Var.f(d6Var);
        g6Var.g(d6Var2);
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean f(int i3, View view) {
        int i10;
        tl0 tl0Var = (tl0) this.f4645c;
        d2 d2Var = (d2) this.d;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f4646e;
        ArrayList arrayList = tl0Var.f38491r;
        if (i3 >= 0 && i3 < arrayList.size()) {
            int i11 = this.f4644b;
            if (h10.i(i11).q()) {
                if (!h10.i(i11).q()) {
                    new vg.v0(d2Var, 24, true).show();
                    return true;
                }
                rl0 rl0Var = ((sl0) view).f38056a;
                if (rl0Var != null) {
                    rl0Var.p();
                }
                ql0 ql0Var = (ql0) arrayList.get(i3);
                f60 H = f60.H(d2Var, view);
                H.f33729i = 3;
                if (TextUtils.isEmpty(ql0Var.f37492c)) {
                    i10 = 2131745891;
                } else {
                    i10 = 2131745879;
                }
                H.c(2131231901, bd.M0(i10, null), new bi.q0(tl0Var, i11, ql0Var, e6Var, 27), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public void g(s1 s1Var, int i3) {
        TL_bots.toggleUsername toggleusername;
        int i10 = this.f4643a;
        int i11 = this.f4644b;
        Object obj = this.f4646e;
        Object obj2 = this.d;
        Object obj3 = this.f4645c;
        switch (i10) {
            case 1:
                final ba baVar = (ba) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                ka kaVar = baVar.f44006a;
                long j10 = kaVar.f46848y;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = hp.s1(ka.g0(kaVar)).o1(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = kaVar.getConnectionsManager();
                final int i12 = this.f4644b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.h3(new org.telegram.messenger.dw(ba.this, str, tLObject, i12, z11, tL_error, tL_username, z10));
                    }
                });
                kaVar.f46847x.add(tL_username.username);
                ((ha) view).setLoading(true);
                return;
            case 2:
            case 4:
            default:
                PasskeysActivity.a0((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i11);
                return;
            case 3:
                tq tqVar = (tq) obj3;
                gi.d dVar = (gi.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new pq(tqVar, dVar, 1));
                    return;
                }
                return;
            case 5:
                ws0 ws0Var = (ws0) obj3;
                zi ziVar = (zi) obj;
                s1[] s1VarArr = {new s1(3, ws0Var.getContext(), (org.telegram.ui.ActionBar.e6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) ziVar.f26868k.media).poll;
                tL_poll.f27027id = poll.f27027id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i13 = this.f4644b;
                tL_messages_editMessage.peer = hp.s1(i13).j1(ws0Var.m1);
                tL_messages_editMessage.f27085id = ziVar.f1();
                tL_messages_editMessage.flags |= 16384;
                org.telegram.messenger.g0.i3(new mp0(s1VarArr, i13, ConnectionsManager.getInstance(i13).sendRequest(tL_messages_editMessage, new i8(ws0Var, s1VarArr, i13, tL_messages_editMessage, 5)), 1), 500L);
                return;
        }
    }

    @Override
    public mq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void i(p2 p2Var) {
        zb1 zb1Var = (zb1) this.f4645c;
        q2 q2Var = (q2) this.d;
        VoIPService voIPService = (VoIPService) this.f4646e;
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.messenger.g0.r(zb1Var.T0);
            zb1Var.S0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(zb1Var.f52607b, false, Integer.valueOf(this.f4644b));
            zb1Var.t(q2Var, voIPService);
        }
    }

    @Override
    public void k(e5.f fVar, List list) {
        ArrayList arrayList = (ArrayList) this.f4645c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        u10 u10Var = (u10) this.f4646e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e5.l lVar = (e5.l) it.next();
            e5.h a10 = lVar.a();
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(lVar.f9611c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, r1.i().h(tL_premiumGiftCodeOption.currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a10.f9598c;
                        break;
                    }
                }
            }
        }
        org.telegram.messenger.g0.h3(new xg.o(chat, this.f4644b, arrayList, u10Var, 0));
    }

    @Override
    public void o(boolean z10) {
        boolean z11;
        int i3;
        uw uwVar = (uw) this.f4645c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.f4646e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView k42 = uwVar.k4();
        int i10 = this.f4644b;
        if (k42 != null) {
            if (i10 == 102) {
                i3 = 27;
            } else {
                i3 = 26;
            }
            k42.n(arrayList2, i3, null, null, new lu(uwVar, i10, arrayList2, z10, hashSet), null);
        }
        if (i10 == 103) {
            z11 = true;
        } else {
            z11 = false;
        }
        uwVar.n4(z11);
    }

    @Override
    public boolean x() {
        return false;
    }

    public e0(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.f4643a = i10;
        this.f4645c = obj;
        this.f4644b = i3;
        this.d = obj2;
        this.f4646e = obj3;
    }

    public e0(Object obj, Object obj2, int i3, Object obj3, int i10) {
        this.f4643a = i10;
        this.f4645c = obj;
        this.d = obj2;
        this.f4644b = i3;
        this.f4646e = obj3;
    }

    public e0(Object obj, Object obj2, Object obj3, int i3, int i10) {
        this.f4643a = i10;
        this.f4645c = obj;
        this.d = obj2;
        this.f4646e = obj3;
        this.f4644b = i3;
    }

    @Override
    public void T() {
    }

    @Override
    public void H(float f10) {
    }

    @Override
    public void O(boolean z10, boolean z11) {
    }
}
