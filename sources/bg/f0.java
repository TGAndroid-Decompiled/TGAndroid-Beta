package bg;

import a8.xa;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.clearcut.y0;
import fi.b8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.nr;
import org.telegram.messenger.r1;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.voip.d3;
import org.telegram.ui.Components.voip.e3;
import org.telegram.ui.Components.voip.f3;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.bh;
import org.telegram.ui.ca;
import org.telegram.ui.ec1;
import org.telegram.ui.ia;
import org.telegram.ui.la;
import org.telegram.ui.pu;
import org.telegram.ui.ts0;
import org.telegram.ui.uq0;
import org.telegram.ui.yw;
import ug.x0;
public final class f0 implements l30, q1, e6, ij0, nr, f5.n, d3, org.telegram.messenger.q1, h2.j {
    public final int f3236a;
    public final int f3237b;
    public final Object f3238c;
    public final Object d;
    public final Object f3239e;

    public f0(int i7, bh bhVar, o4 o4Var, m30 m30Var) {
        this.f3236a = 0;
        this.f3237b = i7;
        this.f3238c = bhVar;
        this.d = o4Var;
        this.f3239e = m30Var;
    }

    @Override
    public void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final bh bhVar = (bh) this.f3238c;
        final o4 o4Var = (o4) this.d;
        final m30 m30Var = (m30) this.f3239e;
        final int i7 = this.f3237b;
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
                int i11 = i7;
                ConnectionsManager.getInstance(i11).sendRequest(tL_photos_uploadProfilePhoto, new k0(i11, photoSize2, photoSize, bhVar, o4Var, 0));
                m30Var.i();
            }
        });
    }

    @Override
    public void a(f5.f fVar, List list) {
        ArrayList arrayList = (ArrayList) this.f3238c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        z10 z10Var = (z10) this.f3239e;
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
                    if (str != null && str.equals(mVar.f10996c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, r1.i().h(tL_premiumGiftCodeOption.currency)) * (a10.f10983b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a10.f10984c;
                        break;
                    }
                }
            }
        }
        org.telegram.messenger.g0.h3(new wg.m(chat, this.f3237b, arrayList, z10Var, 0));
    }

    @Override
    public void accept(Object obj) {
        xa xaVar = (xa) this.f3238c;
        ((x2.j0) obj).I(xaVar.f713b, (x2.f0) xaVar.f714c, (x2.t) this.d, (x2.b0) this.f3239e, this.f3237b);
    }

    @Override
    public boolean b(int i7, View view) {
        int i10;
        ul0 ul0Var = (ul0) this.f3238c;
        e2 e2Var = (e2) this.d;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f3239e;
        ArrayList arrayList = ul0Var.f40102r;
        if (i7 >= 0 && i7 < arrayList.size()) {
            int i11 = this.f3237b;
            if (m10.i(i11).q()) {
                if (!m10.i(i11).q()) {
                    new x0(e2Var, 24, true).show();
                    return true;
                }
                sl0 sl0Var = ((tl0) view).f39712a;
                if (sl0Var != null) {
                    sl0Var.p();
                }
                rl0 rl0Var = (rl0) arrayList.get(i7);
                m60 H = m60.H(e2Var, view);
                H.f37093i = 3;
                if (TextUtils.isEmpty(rl0Var.f38997c)) {
                    i10 = 2131745881;
                } else {
                    i10 = 2131745869;
                }
                H.c(2131231901, hd.M0(i10, null), new ci.p0(ul0Var, i11, rl0Var, e6Var, 26), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public void c(CharSequence charSequence) {
        g6 g6Var = (g6) this.f3238c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.f3239e;
        StaticLayout j3 = g6Var.j(this.f3237b - ((int) Math.ceil(Math.min(g6Var.d, g6Var.f34841j))), charSequence);
        d6 d6Var = new d6(g6Var, j3, g6Var.d, arrayList.size());
        d6 d6Var2 = new d6(g6Var, j3, g6Var.f34841j, arrayList2.size());
        arrayList2.add(d6Var);
        arrayList.add(d6Var2);
        float f10 = g6Var.d;
        float f11 = d6Var.f33850f;
        g6Var.d = f10 + f11;
        g6Var.f34841j += f11;
        g6Var.f(d6Var);
        g6Var.g(d6Var2);
    }

    @Override
    public void d(e3 e3Var) {
        ec1 ec1Var = (ec1) this.f3238c;
        f3 f3Var = (f3) this.d;
        VoIPService voIPService = (VoIPService) this.f3239e;
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.messenger.g0.r(ec1Var.S0);
            ec1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(ec1Var.f46674b, false, Integer.valueOf(this.f3237b));
            ec1Var.l(f3Var, voIPService);
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void f(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new l0(fVar, (e2) this.f3238c, list, this.f3237b, (y0) this.d, (ts0) this.f3239e, 13));
    }

    @Override
    public uq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void h(t1 t1Var, int i7) {
        TL_bots.toggleUsername toggleusername;
        int i10 = this.f3236a;
        int i11 = this.f3237b;
        Object obj = this.f3239e;
        Object obj2 = this.d;
        Object obj3 = this.f3238c;
        switch (i10) {
            case 1:
                final ca caVar = (ca) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                la laVar = caVar.f46050a;
                long j3 = laVar.f48916y;
                if (j3 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = np.s1(la.g0(laVar)).o1(j3);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = laVar.getConnectionsManager();
                final int i12 = this.f3237b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.h3(new org.telegram.messenger.iw(ca.this, str, tLObject, i12, z11, tL_error, tL_username, z10));
                    }
                });
                laVar.f48915x.add(tL_username.username);
                ((ia) view).setLoading(true);
                return;
            case 2:
            case 4:
            default:
                PasskeysActivity.a0((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i11);
                return;
            case 3:
                ar arVar = (ar) obj3;
                hi.d dVar = (hi.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new wq(arVar, dVar, 1));
                    return;
                }
                return;
            case 5:
                ys0 ys0Var = (ys0) obj3;
                gj gjVar = (gj) obj;
                t1[] t1VarArr = {new t1(3, ys0Var.getContext(), (org.telegram.ui.ActionBar.e6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) gjVar.f23819k.media).poll;
                tL_poll.f28077id = poll.f28077id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i13 = this.f3237b;
                tL_messages_editMessage.peer = np.s1(i13).j1(ys0Var.f42116m1);
                tL_messages_editMessage.f28135id = gjVar.e1();
                tL_messages_editMessage.flags |= 16384;
                org.telegram.messenger.g0.i3(new op0(t1VarArr, i13, ConnectionsManager.getInstance(i13).sendRequest(tL_messages_editMessage, new b8(ys0Var, t1VarArr, i13, tL_messages_editMessage, 5)), 1), 500L);
                return;
        }
    }

    @Override
    public void j(boolean z10) {
        boolean z11;
        int i7;
        yw ywVar = (yw) this.f3238c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.f3239e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView k42 = ywVar.k4();
        int i10 = this.f3237b;
        if (k42 != null) {
            if (i10 == 102) {
                i7 = 27;
            } else {
                i7 = 26;
            }
            k42.n(arrayList2, i7, null, null, new pu(ywVar, i10, arrayList2, z10, hashSet), null);
        }
        if (i10 == 103) {
            z11 = true;
        } else {
            z11 = false;
        }
        ywVar.n4(z11);
    }

    @Override
    public boolean x() {
        return false;
    }

    public f0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f3236a = i10;
        this.f3238c = obj;
        this.f3237b = i7;
        this.d = obj2;
        this.f3239e = obj3;
    }

    public f0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f3236a = i10;
        this.f3238c = obj;
        this.d = obj2;
        this.f3237b = i7;
        this.f3239e = obj3;
    }

    public f0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f3236a = i10;
        this.f3238c = obj;
        this.d = obj2;
        this.f3239e = obj3;
        this.f3237b = i7;
    }

    @Override
    public void U() {
    }

    @Override
    public void I(float f10) {
    }

    @Override
    public void O(boolean z10, boolean z11) {
    }
}
