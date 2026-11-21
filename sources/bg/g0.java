package bg;

import a8.xa;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import bi.x4;
import com.google.android.gms.internal.clearcut.y0;
import fi.y7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.r1;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.aq0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.voip.c3;
import org.telegram.ui.Components.voip.d3;
import org.telegram.ui.Components.voip.e3;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.x30;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.bh;
import org.telegram.ui.ca;
import org.telegram.ui.cx;
import org.telegram.ui.hc1;
import org.telegram.ui.ia;
import org.telegram.ui.la;
import org.telegram.ui.pu;
import org.telegram.ui.wq0;
import org.telegram.ui.xs0;
public final class g0 implements w30, q1, l6, sj0, lr, f5.n, c3, org.telegram.messenger.q1, h2.j {
    public final int f3245a;
    public final int f3246b;
    public final Object f3247c;
    public final Object d;
    public final Object f3248e;

    public g0(int i7, bh bhVar, r4 r4Var, x30 x30Var) {
        this.f3245a = 0;
        this.f3246b = i7;
        this.f3247c = bhVar;
        this.d = r4Var;
        this.f3248e = x30Var;
    }

    @Override
    public void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final bh bhVar = (bh) this.f3247c;
        final r4 r4Var = (r4) this.d;
        final x30 x30Var = (x30) this.f3248e;
        final int i7 = this.f3246b;
        org.telegram.messenger.g0.g3(new Runnable() {
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
                int i11 = i7;
                ConnectionsManager.getInstance(i11).sendRequest(tL_photos_uploadProfilePhoto, new l0(i11, photoSize2, photoSize, bhVar, r4Var, 0));
                x30Var.i();
            }
        });
    }

    @Override
    public void a(f5.f fVar, List list) {
        ArrayList arrayList = (ArrayList) this.f3247c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        x10 x10Var = (x10) this.f3248e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f5.m mVar = (f5.m) it.next();
            f5.i a10 = mVar.a();
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(mVar.f11330c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, r1.i().h(tL_premiumGiftCodeOption.currency)) * (a10.f11317b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a10.f11318c;
                        break;
                    }
                }
            }
        }
        org.telegram.messenger.g0.g3(new wg.m(chat, this.f3246b, arrayList, x10Var, 0));
    }

    @Override
    public void accept(Object obj) {
        xa xaVar = (xa) this.f3247c;
        ((x2.k0) obj).I(xaVar.f713b, (x2.g0) xaVar.f714c, (x2.u) this.d, (x2.c0) this.f3248e, this.f3246b);
    }

    @Override
    public void b(f5.f fVar, List list) {
        org.telegram.messenger.g0.g3(new m0(fVar, (g2) this.f3247c, list, this.f3246b, (y0) this.d, (xs0) this.f3248e, 12));
    }

    @Override
    public boolean c(int i7, View view) {
        int i10;
        em0 em0Var = (em0) this.f3247c;
        g2 g2Var = (g2) this.d;
        h6 h6Var = (h6) this.f3248e;
        ArrayList arrayList = em0Var.f34910r;
        if (i7 >= 0 && i7 < arrayList.size()) {
            int i11 = this.f3246b;
            if (j10.i(i11).q()) {
                if (!j10.i(i11).q()) {
                    new ug.y0(g2Var, 24, true).show();
                    return true;
                }
                cm0 cm0Var = ((dm0) view).f34531a;
                if (cm0Var != null) {
                    cm0Var.p();
                }
                bm0 bm0Var = (bm0) arrayList.get(i7);
                a70 I = a70.I(g2Var, view);
                I.f33365i = 3;
                if (TextUtils.isEmpty(bm0Var.f33865c)) {
                    i10 = 2131745685;
                } else {
                    i10 = 2131745673;
                }
                I.c(2131231902, gd.N0(i10, null), new x4(em0Var, i11, bm0Var, h6Var, 27), false);
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override
    public void d(boolean z10) {
        boolean z11;
        int i7;
        cx cxVar = (cx) this.f3247c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.f3248e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView l42 = cxVar.l4();
        int i10 = this.f3246b;
        if (l42 != null) {
            if (i10 == 102) {
                i7 = 27;
            } else {
                i7 = 26;
            }
            l42.n(arrayList2, i7, null, null, new pu(cxVar, i10, arrayList2, z10, hashSet), null);
        }
        if (i10 == 103) {
            z11 = true;
        } else {
            z11 = false;
        }
        cxVar.p4(z11);
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void f(CharSequence charSequence) {
        n6 n6Var = (n6) this.f3247c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.f3248e;
        StaticLayout j3 = n6Var.j(this.f3246b - ((int) Math.ceil(Math.min(n6Var.d, n6Var.f37799j))), charSequence);
        k6 k6Var = new k6(n6Var, j3, n6Var.d, arrayList.size());
        k6 k6Var2 = new k6(n6Var, j3, n6Var.f37799j, arrayList2.size());
        arrayList2.add(k6Var);
        arrayList.add(k6Var2);
        float f10 = n6Var.d;
        float f11 = k6Var.f36810f;
        n6Var.d = f10 + f11;
        n6Var.f37799j += f11;
        n6Var.f(k6Var);
        n6Var.g(k6Var2);
    }

    @Override
    public void g(d3 d3Var) {
        hc1 hc1Var = (hc1) this.f3247c;
        e3 e3Var = (e3) this.d;
        VoIPService voIPService = (VoIPService) this.f3248e;
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.messenger.g0.r(hc1Var.S0);
            hc1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(hc1Var.f48329b, false, Integer.valueOf(this.f3246b));
            hc1Var.l(e3Var, voIPService);
        }
    }

    @Override
    public wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void h(t1 t1Var, int i7) {
        TL_bots.toggleUsername toggleusername;
        int i10 = this.f3245a;
        int i11 = this.f3246b;
        Object obj = this.f3248e;
        Object obj2 = this.d;
        Object obj3 = this.f3247c;
        switch (i10) {
            case 1:
                final ca caVar = (ca) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                la laVar = caVar.f46498a;
                long j3 = laVar.f49537y;
                if (j3 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = mp.u1(la.g0(laVar)).q1(j3);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = laVar.getConnectionsManager();
                final int i12 = this.f3246b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.g3(new org.telegram.messenger.ew(ca.this, str, tLObject, i12, z11, tL_error, tL_username, z10));
                    }
                });
                laVar.f49536x.add(tL_username.username);
                ((ia) view).setLoading(true);
                return;
            case 2:
            case 4:
            default:
                PasskeysActivity.a0((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i11);
                return;
            case 3:
                jr jrVar = (jr) obj3;
                hi.e eVar = (hi.e) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!eVar.R) {
                    eVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new fr(jrVar, eVar, 1));
                    return;
                }
                return;
            case 5:
                jt0 jt0Var = (jt0) obj3;
                fj fjVar = (fj) obj;
                t1[] t1VarArr = {new t1(3, jt0Var.getContext(), (h6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) fjVar.f23993k.media).poll;
                tL_poll.f28457id = poll.f28457id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i13 = this.f3246b;
                tL_messages_editMessage.peer = mp.u1(i13).l1(jt0Var.f36653m1);
                tL_messages_editMessage.f28515id = fjVar.e1();
                tL_messages_editMessage.flags |= 16384;
                org.telegram.messenger.g0.h3(new aq0(t1VarArr, i13, ConnectionsManager.getInstance(i13).sendRequest(tL_messages_editMessage, new y7(jt0Var, t1VarArr, i13, tL_messages_editMessage, 5)), 1), 500L);
                return;
        }
    }

    @Override
    public boolean x() {
        return false;
    }

    public g0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f3245a = i10;
        this.f3247c = obj;
        this.f3246b = i7;
        this.d = obj2;
        this.f3248e = obj3;
    }

    public g0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f3245a = i10;
        this.f3247c = obj;
        this.d = obj2;
        this.f3246b = i7;
        this.f3248e = obj3;
    }

    public g0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f3245a = i10;
        this.f3247c = obj;
        this.d = obj2;
        this.f3248e = obj3;
        this.f3246b = i7;
    }

    @Override
    public void U() {
    }

    @Override
    public void I(float f10) {
    }

    @Override
    public void Q(boolean z10, boolean z11) {
    }
}
