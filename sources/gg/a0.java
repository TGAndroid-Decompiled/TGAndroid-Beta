package gg;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import nh.b8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.dr0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.voip.i3;
import org.telegram.ui.Components.voip.j3;
import org.telegram.ui.Components.voip.k3;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.bj;
import org.telegram.ui.cw;
import org.telegram.ui.ga;
import org.telegram.ui.ii1;
import org.telegram.ui.oa;
import org.telegram.ui.qu0;
import org.telegram.ui.qy;
import org.telegram.ui.ra;
import org.telegram.ui.xw0;
public final class a0 implements BillingController.ProductDetailsResponseListenerLegacy, w40, org.telegram.ui.ActionBar.c2, h6, jl0, MessagesStorage.BooleanCallback, p2.o, i3 {
    public final int f6539a;
    public final int f6540b;
    public final Object f6541c;
    public final Object d;
    public final Object e;

    public a0(int i10, bj bjVar, e5 e5Var, x40 x40Var) {
        this.f6539a = 1;
        this.f6540b = i10;
        this.f6541c = bjVar;
        this.d = e5Var;
        this.e = x40Var;
    }

    @Override
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z4, final TLRPC.VideoSize videoSize) {
        final bj bjVar = (bj) this.f6541c;
        final e5 e5Var = (e5) this.d;
        final x40 x40Var = (x40) this.e;
        final int i10 = this.f6540b;
        AndroidUtilities.runOnUIThread(new Runnable() {
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new i0(i12, photoSize2, photoSize, bjVar, e5Var, 0));
                x40Var.j();
            }
        });
    }

    @Override
    public void a(CharSequence charSequence) {
        j6 j6Var = (j6) this.d;
        ArrayList arrayList = (ArrayList) this.f6541c;
        StaticLayout h = j6Var.h(this.f6540b - ((int) Math.ceil(Math.min(j6Var.d, j6Var.h))), charSequence);
        g6 g6Var = new g6(j6Var, h, j6Var.d, arrayList.size());
        g6 g6Var2 = new g6(j6Var, h, j6Var.h, arrayList.size());
        ((ArrayList) this.e).add(g6Var);
        arrayList.add(g6Var2);
        float f10 = j6Var.d;
        float f11 = g6Var.f25066f;
        j6Var.d = f10 + f11;
        j6Var.h += f11;
        j6Var.e = Math.max(j6Var.e, h.getHeight());
        j6Var.f25851i = Math.max(j6Var.f25851i, h.getHeight());
    }

    @Override
    public void b(p2.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new kf.j0(hVar, (org.telegram.ui.ActionBar.p2) this.f6541c, list, this.f6540b, (p2.e) this.d, (xw0) this.e, 13));
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        nn0 nn0Var = (nn0) this.f6541c;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
        f6 f6Var = (f6) this.e;
        ArrayList arrayList = nn0Var.f27313r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i12 = this.f6540b;
            if (UserConfig.getInstance(i12).isPremium()) {
                if (!UserConfig.getInstance(i12).isPremium()) {
                    new eg.o1(p2Var, 24, true).show();
                    return true;
                }
                ln0 ln0Var = ((mn0) view).f27098a;
                if (ln0Var != null) {
                    ln0Var.q();
                }
                kn0 kn0Var = (kn0) arrayList.get(i10);
                p70 H = p70.H(p2Var, view);
                H.f27759i = 3;
                int i13 = R.drawable.menu_tag_rename;
                if (TextUtils.isEmpty(kn0Var.f26359c)) {
                    i11 = R.string.SavedTagLabelTag;
                } else {
                    i11 = R.string.SavedTagRenameTag;
                }
                H.c(i13, LocaleController.getString(i11), new cg.v1(nn0Var, i12, kn0Var, f6Var, 20), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void f(j3 j3Var) {
        ii1 ii1Var = (ii1) this.f6541c;
        k3 k3Var = (k3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(ii1Var.P0);
            ii1Var.O0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(ii1Var.f34947b, false, Integer.valueOf(this.f6540b));
            ii1Var.u(k3Var, voIPService);
        }
    }

    @Override
    public qu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TL_bots.toggleUsername toggleusername;
        int i11 = this.f6539a;
        int i12 = this.f6540b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f6541c;
        switch (i11) {
            case 2:
                final ga gaVar = (ga) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z4 = tL_username.active;
                final String str = tL_username.username;
                final boolean z10 = !z4;
                ra raVar = gaVar.f34369a;
                long j10 = raVar.f37783x;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z10;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = MessagesController.getInstance(ra.b0(raVar)).getInputUser(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z10;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = raVar.getConnectionsManager();
                final int i13 = this.f6540b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.fj(ga.this, str, tLObject, i13, z10, tL_error, tL_username, z4));
                    }
                });
                raVar.f37782w.add(tL_username.username);
                ((oa) view).setLoading(true);
                return;
            case 3:
            case 5:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                return;
            case 4:
                ir irVar = (ir) obj3;
                ph.d dVar = (ph.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new er(irVar, dVar, 1));
                    return;
                }
                return;
            case 6:
                yu0 yu0Var = (yu0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(yu0Var.getContext(), 3, (f6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                tL_poll.f19185id = poll.f19185id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i14 = this.f6540b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i14).getInputPeer(yu0Var.f31130g1);
                tL_messages_editMessage.f19242id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new dr0(d2VarArr, i14, ConnectionsManager.getInstance(i14).sendRequest(tL_messages_editMessage, new b8(yu0Var, d2VarArr, i14, tL_messages_editMessage, 4)), 1), 500L);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(p2.h hVar, List list) {
        ArrayList arrayList = (ArrayList) this.f6541c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p2.n nVar = (p2.n) it.next();
            p2.j a2 = nVar.a();
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(nVar.f41031c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.f41019b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.f41020c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new z(chat, this.f6540b, arrayList, callback, 1));
    }

    @Override
    public void run(boolean z4) {
        boolean z10;
        int i10;
        qy qyVar = (qy) this.d;
        ArrayList arrayList = (ArrayList) this.f6541c;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView Y3 = qyVar.Y3();
        int i11 = this.f6540b;
        if (Y3 != null) {
            if (i11 == 102) {
                i10 = 27;
            } else {
                i10 = 26;
            }
            Y3.n(arrayList2, i10, null, null, new cw(qyVar, i11, arrayList2, z4, hashSet), null);
        }
        if (i11 == 103) {
            z10 = true;
        } else {
            z10 = false;
        }
        qyVar.b4(z10);
    }

    @Override
    public boolean u() {
        return false;
    }

    public a0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f6539a = i11;
        this.f6541c = obj;
        this.f6540b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public a0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f6539a = i11;
        this.f6541c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f6540b = i10;
    }

    public a0(Object obj, TLObject tLObject, int i10, Object obj2, int i11) {
        this.f6539a = i11;
        this.f6541c = obj;
        this.d = tLObject;
        this.f6540b = i10;
        this.e = obj2;
    }

    public a0(j6 j6Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        this.f6539a = 3;
        this.d = j6Var;
        this.f6540b = i10;
        this.f6541c = arrayList;
        this.e = arrayList2;
    }

    public a0(qy qyVar, ArrayList arrayList, int i10, HashSet hashSet) {
        this.f6539a = 7;
        this.d = qyVar;
        this.f6541c = arrayList;
        this.f6540b = i10;
        this.e = hashSet;
    }

    @Override
    public void D(float f10) {
    }

    @Override
    public void P() {
    }

    @Override
    public void K(boolean z4, boolean z10) {
    }
}
