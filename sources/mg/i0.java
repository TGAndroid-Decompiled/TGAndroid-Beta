package mg;

import ag.g3;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.as;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.a40;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.oq0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.Components.voip.s2;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zq;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.ea;
import org.telegram.ui.eu0;
import org.telegram.ui.fs0;
import org.telegram.ui.la;
import org.telegram.ui.oa;
import org.telegram.ui.pv;
import org.telegram.ui.q8;
import org.telegram.ui.rh;
import org.telegram.ui.zd1;
import org.telegram.ui.zx;
public final class i0 implements org.telegram.messenger.t1, org.telegram.ui.ActionBar.u1, c6, jk0, as, c5.n, q2, a40, e2.j {
    public final int f13135a;
    public final int f13136b;
    public final Object f13137c;
    public final Object d;
    public final Object e;

    public i0(int i10, rh rhVar, z4 z4Var, b40 b40Var) {
        this.f13135a = 10;
        this.f13136b = i10;
        this.f13137c = rhVar;
        this.d = z4Var;
        this.e = b40Var;
    }

    @Override
    public void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final rh rhVar = (rh) this.f13137c;
        final z4 z4Var = (z4) this.d;
        final b40 b40Var = (b40) this.e;
        final int i10 = this.f13136b;
        org.telegram.messenger.i0.g3(new Runnable() {
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
                    int i11 = tL_photos_uploadProfilePhoto.flags;
                    tL_photos_uploadProfilePhoto.video_start_ts = d;
                    tL_photos_uploadProfilePhoto.flags = i11 | 6;
                }
                TLRPC.VideoSize videoSize2 = videoSize;
                if (videoSize2 != null) {
                    tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                    tL_photos_uploadProfilePhoto.flags |= 16;
                }
                int i12 = i10;
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new q8(i12, photoSize2, photoSize, rhVar, z4Var, 10));
                b40Var.i();
            }
        });
    }

    @Override
    public void a(c5.g gVar, List list) {
        ArrayList arrayList = (ArrayList) this.f13137c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        r20 r20Var = (r20) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c5.m mVar = (c5.m) it.next();
            c5.i a2 = mVar.a();
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(mVar.f3801c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_premiumGiftCodeOption.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.f3790c;
                        break;
                    }
                }
            }
        }
        org.telegram.messenger.i0.g3(new a0(chat, this.f13136b, arrayList, r20Var, 0));
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f13137c;
        ((u2.k0) obj).G(aVar.f281b, (u2.g0) aVar.f282c, (u2.u) this.d, (u2.c0) this.e, this.f13136b);
    }

    @Override
    public void b(c5.g gVar, List list) {
        org.telegram.messenger.i0.g3(new m4.a1(gVar, (k2) this.f13137c, list, this.f13136b, (ba.a) this.d, (eu0) this.e, 11));
    }

    @Override
    public void c(CharSequence charSequence) {
        e6 e6Var = (e6) this.d;
        ArrayList arrayList = (ArrayList) this.f13137c;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j10 = e6Var.j(this.f13136b - ((int) Math.ceil(Math.min(e6Var.d, e6Var.f25750j))), charSequence);
        b6 b6Var = new b6(e6Var, j10, e6Var.d, arrayList.size());
        b6 b6Var2 = new b6(e6Var, j10, e6Var.f25750j, arrayList2.size());
        arrayList2.add(b6Var);
        arrayList.add(b6Var2);
        float f7 = e6Var.d;
        float f10 = b6Var.f24660f;
        e6Var.d = f7 + f10;
        e6Var.f25750j += f10;
        e6Var.f(b6Var);
        e6Var.g(b6Var2);
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean f(int i10, View view) {
        int i11;
        sm0 sm0Var = (sm0) this.f13137c;
        k2 k2Var = (k2) this.d;
        p6 p6Var = (p6) this.e;
        ArrayList arrayList = sm0Var.f30340r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i12 = this.f13136b;
            if (e20.i(i12).q()) {
                if (!e20.i(i12).q()) {
                    new kg.i1(k2Var, 24, true).show();
                    return true;
                }
                qm0 qm0Var = ((rm0) view).f30018a;
                if (qm0Var != null) {
                    qm0Var.p();
                }
                pm0 pm0Var = (pm0) arrayList.get(i10);
                z60 H = z60.H(k2Var, view);
                H.f33026i = 3;
                if (TextUtils.isEmpty(pm0Var.f29455c)) {
                    i11 = 2131745898;
                } else {
                    i11 = 2131745886;
                }
                H.c(2131231900, dd.L0(i11, null), new g3(sm0Var, i12, pm0Var, p6Var, 21), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public fs0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        TL_bots.toggleUsername toggleusername;
        int i11 = this.f13135a;
        int i12 = this.f13136b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f13137c;
        switch (i11) {
            case 1:
                final ea eaVar = (ea) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                oa oaVar = eaVar.f36783a;
                long j10 = oaVar.f40119y;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = wp.r1(oa.g0(oaVar)).n1(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = oaVar.getConnectionsManager();
                final int i13 = this.f13136b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.i0.g3(new org.telegram.messenger.xw(ea.this, str, tLObject, i13, z11, tL_error, tL_username, z10));
                    }
                });
                oaVar.f40118x.add(tL_username.username);
                ((la) view).setLoading(true);
                return;
            case 2:
            case 4:
            default:
                PasskeysActivity.a0((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                return;
            case 3:
                cr crVar = (cr) obj3;
                vh.d dVar = (vh.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new zq(crVar, dVar, 1));
                    return;
                }
                return;
            case 5:
                au0 au0Var = (au0) obj3;
                kj kjVar = (kj) obj;
                org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, au0Var.getContext(), (p6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) kjVar.f16690k.media).poll;
                tL_poll.f19820id = poll.f19820id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i14 = this.f13136b;
                tL_messages_editMessage.peer = wp.r1(i14).i1(au0Var.l1);
                tL_messages_editMessage.f19878id = kjVar.f1();
                tL_messages_editMessage.flags |= 16384;
                org.telegram.messenger.i0.h3(new oq0(x1VarArr, i14, ConnectionsManager.getInstance(i14).sendRequest(tL_messages_editMessage, new org.telegram.ui.b0(au0Var, x1VarArr, i14, tL_messages_editMessage, 3)), 1), 500L);
                return;
        }
    }

    @Override
    public void i(boolean z10) {
        boolean z11;
        int i10;
        zx zxVar = (zx) this.d;
        ArrayList arrayList = (ArrayList) this.f13137c;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView k42 = zxVar.k4();
        int i11 = this.f13136b;
        if (k42 != null) {
            if (i11 == 102) {
                i10 = 27;
            } else {
                i10 = 26;
            }
            k42.n(arrayList2, i10, null, null, new pv(zxVar, i11, arrayList2, z10, hashSet), null);
        }
        if (i11 == 103) {
            z11 = true;
        } else {
            z11 = false;
        }
        zxVar.n4(z11);
    }

    @Override
    public void j(r2 r2Var) {
        zd1 zd1Var = (zd1) this.f13137c;
        s2 s2Var = (s2) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.messenger.i0.r(zd1Var.S0);
            zd1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(zd1Var.f43938b, false, Integer.valueOf(this.f13136b));
            zd1Var.t(s2Var, voIPService);
        }
    }

    @Override
    public boolean y() {
        return false;
    }

    public i0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f13135a = i11;
        this.f13137c = obj;
        this.f13136b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public i0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f13135a = i11;
        this.f13137c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f13136b = i10;
    }

    public i0(Object obj, TLObject tLObject, int i10, Object obj2, int i11) {
        this.f13135a = i11;
        this.f13137c = obj;
        this.d = tLObject;
        this.f13136b = i10;
        this.e = obj2;
    }

    public i0(e6 e6Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        this.f13135a = 2;
        this.d = e6Var;
        this.f13136b = i10;
        this.f13137c = arrayList;
        this.e = arrayList2;
    }

    public i0(zx zxVar, ArrayList arrayList, int i10, HashSet hashSet) {
        this.f13135a = 6;
        this.d = zxVar;
        this.f13137c = arrayList;
        this.f13136b = i10;
        this.e = hashSet;
    }

    @Override
    public void I(float f7) {
    }

    @Override
    public void U() {
    }

    @Override
    public void P(boolean z10, boolean z11) {
    }
}
