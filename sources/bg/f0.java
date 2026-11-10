package bg;

import a8.wa;
import ai.a1;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.clearcut.z0;
import di.j8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.q1;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.voip.a3;
import org.telegram.ui.Components.voip.b3;
import org.telegram.ui.Components.voip.z2;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.ca;
import org.telegram.ui.dh;
import org.telegram.ui.ia;
import org.telegram.ui.jc1;
import org.telegram.ui.la;
import org.telegram.ui.qu;
import org.telegram.ui.zq0;
import org.telegram.ui.zs0;
import org.telegram.ui.zw;
public final class f0 implements i30, r1, f6, dj0, qr, f5.m, z2, q1, h2.j {
    public final int f3278a;
    public final int f3279b;
    public final Object f3280c;
    public final Object d;
    public final Object f3281e;

    public f0(int i7, dh dhVar, r4 r4Var, j30 j30Var) {
        this.f3278a = 0;
        this.f3279b = i7;
        this.f3280c = dhVar;
        this.d = r4Var;
        this.f3281e = j30Var;
    }

    @Override
    public void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z9, final TLRPC.VideoSize videoSize) {
        final dh dhVar = (dh) this.f3280c;
        final r4 r4Var = (r4) this.d;
        final j30 j30Var = (j30) this.f3281e;
        final int i7 = this.f3279b;
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
                ConnectionsManager.getInstance(i11).sendRequest(tL_photos_uploadProfilePhoto, new k0(i11, photoSize2, photoSize, dhVar, r4Var, 0));
                j30Var.i();
            }
        });
    }

    @Override
    public void a(f5.f fVar, List list) {
        ArrayList arrayList = (ArrayList) this.f3280c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        c20 c20Var = (c20) this.f3281e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f5.l lVar = (f5.l) it.next();
            f5.h a10 = lVar.a();
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(lVar.f11173c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_premiumGiftCodeOption.currency)) * (a10.f11160b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a10.f11161c;
                        break;
                    }
                }
            }
        }
        org.telegram.messenger.g0.h3(new wg.m(chat, this.f3279b, arrayList, c20Var, 0));
    }

    @Override
    public void accept(Object obj) {
        wa waVar = (wa) this.f3280c;
        ((x2.j0) obj).I(waVar.f700b, (x2.f0) waVar.f701c, (x2.t) this.d, (x2.b0) this.f3281e, this.f3279b);
    }

    @Override
    public void b(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new l0(fVar, (f2) this.f3280c, list, this.f3279b, (z0) this.d, (zs0) this.f3281e, 12));
    }

    @Override
    public boolean c(int i7, View view) {
        int i10;
        ql0 ql0Var = (ql0) this.f3280c;
        f2 f2Var = (f2) this.d;
        h6 h6Var = (h6) this.f3281e;
        ArrayList arrayList = ql0Var.f37327r;
        if (i7 >= 0 && i7 < arrayList.size()) {
            int i11 = this.f3279b;
            if (p10.i(i11).q()) {
                if (!p10.i(i11).q()) {
                    new ug.w0(f2Var, 24, true).show();
                    return true;
                }
                ol0 ol0Var = ((pl0) view).f37009a;
                if (ol0Var != null) {
                    ol0Var.p();
                }
                nl0 nl0Var = (nl0) arrayList.get(i7);
                k60 H = k60.H(f2Var, view);
                H.f35201i = 3;
                if (TextUtils.isEmpty(nl0Var.f36334c)) {
                    i10 = 2131745881;
                } else {
                    i10 = 2131745869;
                }
                H.c(2131231901, id.M0(i10, null), new a1(ql0Var, i11, nl0Var, h6Var, 26), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public void d(a3 a3Var) {
        jc1 jc1Var = (jc1) this.f3280c;
        b3 b3Var = (b3) this.d;
        VoIPService voIPService = (VoIPService) this.f3281e;
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.messenger.g0.r(jc1Var.R0);
            jc1Var.Q0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(jc1Var.f46910b, false, Integer.valueOf(this.f3279b));
            jc1Var.l(b3Var, voIPService);
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void f(CharSequence charSequence) {
        org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f3280c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.f3281e;
        StaticLayout j3 = h6Var.j(this.f3279b - ((int) Math.ceil(Math.min(h6Var.d, h6Var.f34194j))), charSequence);
        e6 e6Var = new e6(h6Var, j3, h6Var.d, arrayList.size());
        e6 e6Var2 = new e6(h6Var, j3, h6Var.f34194j, arrayList2.size());
        arrayList2.add(e6Var);
        arrayList.add(e6Var2);
        float f10 = h6Var.d;
        float f11 = e6Var.f33177f;
        h6Var.d = f10 + f11;
        h6Var.f34194j += f11;
        h6Var.f(e6Var);
        h6Var.g(e6Var2);
    }

    @Override
    public void g(u1 u1Var, int i7) {
        TL_bots.toggleUsername toggleusername;
        int i10 = this.f3278a;
        int i11 = this.f3279b;
        Object obj = this.f3281e;
        Object obj2 = this.d;
        Object obj3 = this.f3280c;
        switch (i10) {
            case 1:
                final ca caVar = (ca) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z9 = tL_username.active;
                final String str = tL_username.username;
                final boolean z10 = !z9;
                la laVar = caVar.f44284a;
                long j3 = laVar.f47565y;
                if (j3 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z10;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = qp.s1(la.g0(laVar)).o1(j3);
                    toggleusername3.username = str;
                    toggleusername3.active = z10;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = laVar.getConnectionsManager();
                final int i12 = this.f3279b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.h3(new org.telegram.messenger.kw(ca.this, str, tLObject, i12, z10, tL_error, tL_username, z9));
                    }
                });
                laVar.f47564x.add(tL_username.username);
                ((ia) view).setLoading(true);
                return;
            case 2:
            case 4:
            default:
                PasskeysActivity.a0((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i11);
                return;
            case 3:
                sq sqVar = (sq) obj3;
                fi.d dVar = (fi.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new oq(sqVar, dVar, 1));
                    return;
                }
                return;
            case 5:
                ys0 ys0Var = (ys0) obj3;
                ij ijVar = (ij) obj;
                u1[] u1VarArr = {new u1(3, ys0Var.getContext(), (h6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) ijVar.f23266k.media).poll;
                tL_poll.f26986id = poll.f26986id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i13 = this.f3279b;
                tL_messages_editMessage.peer = qp.s1(i13).j1(ys0Var.l1);
                tL_messages_editMessage.f27044id = ijVar.e1();
                tL_messages_editMessage.flags |= 16384;
                org.telegram.messenger.g0.i3(new lp0(u1VarArr, i13, ConnectionsManager.getInstance(i13).sendRequest(tL_messages_editMessage, new j8(ys0Var, u1VarArr, i13, tL_messages_editMessage, 5)), 1), 500L);
                return;
        }
    }

    @Override
    public zq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void k(boolean z9) {
        boolean z10;
        int i7;
        zw zwVar = (zw) this.f3280c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.f3281e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView k42 = zwVar.k4();
        int i10 = this.f3279b;
        if (k42 != null) {
            if (i10 == 102) {
                i7 = 27;
            } else {
                i7 = 26;
            }
            k42.n(arrayList2, i7, null, null, new qu(zwVar, i10, arrayList2, z9, hashSet), null);
        }
        if (i10 == 103) {
            z10 = true;
        } else {
            z10 = false;
        }
        zwVar.n4(z10);
    }

    @Override
    public boolean x() {
        return false;
    }

    public f0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f3278a = i10;
        this.f3280c = obj;
        this.f3279b = i7;
        this.d = obj2;
        this.f3281e = obj3;
    }

    public f0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f3278a = i10;
        this.f3280c = obj;
        this.d = obj2;
        this.f3279b = i7;
        this.f3281e = obj3;
    }

    public f0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f3278a = i10;
        this.f3280c = obj;
        this.d = obj2;
        this.f3281e = obj3;
        this.f3279b = i7;
    }

    @Override
    public void T() {
    }

    @Override
    public void H(float f10) {
    }

    @Override
    public void O(boolean z9, boolean z10) {
    }
}
