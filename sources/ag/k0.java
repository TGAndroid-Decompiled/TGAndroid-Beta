package ag;

import a8.ng;
import ai.h1;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import di.q8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.g50;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.ur;
import org.telegram.ui.Components.voip.j3;
import org.telegram.ui.Components.voip.k3;
import org.telegram.ui.Components.voip.l3;
import org.telegram.ui.Components.zr;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.cy;
import org.telegram.ui.ia;
import org.telegram.ui.ph1;
import org.telegram.ui.pv;
import org.telegram.ui.qa;
import org.telegram.ui.qu0;
import org.telegram.ui.ta;
import org.telegram.ui.ui;
import org.telegram.ui.xw0;
public final class k0 implements f50, b2, p6, bm0, MessagesStorage.BooleanCallback, d5.p, j3, e2.j, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f1329a;
    public final int f1330b;
    public final Object f1331c;
    public final Object d;
    public final Object e;

    public k0(int i10, ui uiVar, j5 j5Var, g50 g50Var) {
        this.f1329a = 0;
        this.f1330b = i10;
        this.f1331c = uiVar;
        this.d = j5Var;
        this.e = g50Var;
    }

    @Override
    public void R(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final ui uiVar = (ui) this.f1331c;
        final j5 j5Var = (j5) this.d;
        final g50 g50Var = (g50) this.e;
        final int i10 = this.f1330b;
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new p0(i12, photoSize2, photoSize, uiVar, j5Var, 0));
                g50Var.i();
            }
        });
    }

    @Override
    public void a(d5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new q0(iVar, (r2) this.f1331c, list, this.f1330b, (d5.g) this.d, (xw0) this.e, 14));
    }

    @Override
    public void accept(Object obj) {
        ng ngVar = (ng) this.f1331c;
        ((u2.k0) obj).h(ngVar.f639b, (u2.g0) ngVar.f640c, (u2.u) this.d, (u2.c0) this.e, this.f1330b);
    }

    @Override
    public void b(CharSequence charSequence) {
        r6 r6Var = (r6) this.f1331c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j10 = r6Var.j(this.f1330b - ((int) Math.ceil(Math.min(r6Var.d, r6Var.f32125j))), charSequence);
        o6 o6Var = new o6(r6Var, j10, r6Var.d, arrayList.size());
        o6 o6Var2 = new o6(r6Var, j10, r6Var.f32125j, arrayList2.size());
        arrayList2.add(o6Var);
        arrayList.add(o6Var2);
        float f7 = r6Var.d;
        float f10 = o6Var.f31162f;
        r6Var.d = f7 + f10;
        r6Var.f32125j += f10;
        r6Var.f(o6Var);
        r6Var.g(o6Var2);
    }

    @Override
    public boolean c(int i10, View view) {
        int i11;
        oo0 oo0Var = (oo0) this.f1331c;
        r2 r2Var = (r2) this.d;
        u6 u6Var = (u6) this.e;
        ArrayList arrayList = oo0Var.f31339r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i12 = this.f1330b;
            if (UserConfig.getInstance(i12).isPremium()) {
                if (!UserConfig.getInstance(i12).isPremium()) {
                    new tg.y0(r2Var, 24, true).show();
                    return true;
                }
                mo0 mo0Var = ((no0) view).f31047a;
                if (mo0Var != null) {
                    mo0Var.q();
                }
                lo0 lo0Var = (lo0) arrayList.get(i10);
                k80 H = k80.H(r2Var, view);
                H.f29848i = 3;
                int i13 = R.drawable.menu_tag_rename;
                if (TextUtils.isEmpty(lo0Var.f30235c)) {
                    i11 = R.string.SavedTagLabelTag;
                } else {
                    i11 = R.string.SavedTagRenameTag;
                }
                H.c(i13, LocaleController.getString(i11), new h1(oo0Var, i12, lo0Var, u6Var, 26), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public void d(k3 k3Var) {
        ph1 ph1Var = (ph1) this.f1331c;
        l3 l3Var = (l3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(ph1Var.S0);
            ph1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(ph1Var.f42510b, false, Integer.valueOf(this.f1330b));
            ph1Var.t(l3Var, voIPService);
        }
    }

    @Override
    public boolean e() {
        return true;
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
    public void h(e2 e2Var, int i10) {
        TL_bots.toggleUsername toggleusername;
        int i11 = this.f1329a;
        int i12 = this.f1330b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f1331c;
        switch (i11) {
            case 1:
                final ia iaVar = (ia) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                ta taVar = iaVar.f40195a;
                long j10 = taVar.f43712x;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = MessagesController.getInstance(ta.c0(taVar)).getInputUser(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = taVar.getConnectionsManager();
                final int i13 = this.f1330b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.zi(ia.this, str, tLObject, i13, z11, tL_error, tL_username, z10));
                    }
                });
                taVar.f43711w.add(tL_username.username);
                ((qa) view).setLoading(true);
                return;
            case 2:
            case 4:
            default:
                PasskeysActivity.W((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                return;
            case 3:
                zr zrVar = (zr) obj3;
                fi.d dVar = (fi.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new ur(zrVar, dVar, 1));
                    return;
                }
                return;
            case 5:
                aw0 aw0Var = (aw0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                e2[] e2VarArr = {new e2(aw0Var.getContext(), 3, (u6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                tL_poll.f22053id = poll.f22053id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i14 = this.f1330b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i14).getInputPeer(aw0Var.l1);
                tL_messages_editMessage.f22110id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new ns0(e2VarArr, i14, ConnectionsManager.getInstance(i14).sendRequest(tL_messages_editMessage, new q8(aw0Var, e2VarArr, i14, tL_messages_editMessage, 5)), 1), 500L);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(d5.i iVar, List list) {
        ArrayList arrayList = (ArrayList) this.f1331c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d5.o oVar = (d5.o) it.next();
            d5.l a2 = oVar.a();
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(oVar.f8001c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.f7990b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.f7991c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new vg.o(chat, this.f1330b, arrayList, callback, 1));
    }

    @Override
    public void run(boolean z10) {
        boolean z11;
        int i10;
        cy cyVar = (cy) this.f1331c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView g42 = cyVar.g4();
        int i11 = this.f1330b;
        if (g42 != null) {
            if (i11 == 102) {
                i10 = 27;
            } else {
                i10 = 26;
            }
            g42.n(arrayList2, i10, null, null, new pv(cyVar, i11, arrayList2, z10, hashSet), null);
        }
        if (i11 == 103) {
            z11 = true;
        } else {
            z11 = false;
        }
        cyVar.j4(z11);
    }

    @Override
    public boolean u() {
        return false;
    }

    public k0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1329a = i11;
        this.f1331c = obj;
        this.f1330b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public k0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f1329a = i11;
        this.f1331c = obj;
        this.d = obj2;
        this.f1330b = i10;
        this.e = obj3;
    }

    public k0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f1329a = i11;
        this.f1331c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1330b = i10;
    }

    @Override
    public void Q() {
    }

    @Override
    public void F(float f7) {
    }

    @Override
    public void L(boolean z10, boolean z11) {
    }
}
