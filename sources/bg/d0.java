package bg;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import ih.f8;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.kq0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.voip.h3;
import org.telegram.ui.Components.voip.i3;
import org.telegram.ui.Components.voip.j3;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.ba;
import org.telegram.ui.bu0;
import org.telegram.ui.dy;
import org.telegram.ui.hw0;
import org.telegram.ui.ja;
import org.telegram.ui.ma;
import org.telegram.ui.mh1;
import org.telegram.ui.ri;
import org.telegram.ui.rv;
public final class d0 implements BillingController.ProductDetailsResponseListenerLegacy, d40, org.telegram.ui.ActionBar.b2, g6, ok0, MessagesStorage.BooleanCallback, n2.m, h3 {
    public final int f1727a;
    public final int f1728b;
    public final Object f1729c;
    public final Object d;
    public final Object f1730e;

    public d0(int i9, ri riVar, b5 b5Var, e40 e40Var) {
        this.f1727a = 1;
        this.f1728b = i9;
        this.f1729c = riVar;
        this.d = b5Var;
        this.f1730e = e40Var;
    }

    @Override
    public void P(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final ri riVar = (ri) this.f1729c;
        final b5 b5Var = (b5) this.d;
        final e40 e40Var = (e40) this.f1730e;
        final int i9 = this.f1728b;
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
                    int i10 = tL_photos_uploadProfilePhoto.flags;
                    tL_photos_uploadProfilePhoto.video_start_ts = d;
                    tL_photos_uploadProfilePhoto.flags = i10 | 6;
                }
                TLRPC.VideoSize videoSize2 = videoSize;
                if (videoSize2 != null) {
                    tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                    tL_photos_uploadProfilePhoto.flags |= 16;
                }
                int i11 = i9;
                ConnectionsManager.getInstance(i11).sendRequest(tL_photos_uploadProfilePhoto, new j0(i11, photoSize2, photoSize, riVar, b5Var, 0));
                e40Var.j();
            }
        });
    }

    @Override
    public boolean a(int i9, View view) {
        int i10;
        sm0 sm0Var = (sm0) this.f1729c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        b6 b6Var = (b6) this.f1730e;
        ArrayList arrayList = sm0Var.f32524r;
        if (i9 >= 0 && i9 < arrayList.size()) {
            int i11 = this.f1728b;
            if (UserConfig.getInstance(i11).isPremium()) {
                if (!UserConfig.getInstance(i11).isPremium()) {
                    new zf.x0(o2Var, 24, true).show();
                    return true;
                }
                qm0 qm0Var = ((rm0) view).f32200a;
                if (qm0Var != null) {
                    qm0Var.q();
                }
                pm0 pm0Var = (pm0) arrayList.get(i9);
                x60 H = x60.H(o2Var, view);
                H.f34562i = 3;
                int i12 = R.drawable.menu_tag_rename;
                if (TextUtils.isEmpty(pm0Var.f31695c)) {
                    i10 = R.string.SavedTagLabelTag;
                } else {
                    i10 = R.string.SavedTagRenameTag;
                }
                H.c(i12, LocaleController.getString(i10), new c3.d(sm0Var, i11, pm0Var, b6Var, 21), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(CharSequence charSequence) {
        i6 i6Var = (i6) this.d;
        ArrayList arrayList = (ArrayList) this.f1729c;
        StaticLayout h = i6Var.h(this.f1728b - ((int) Math.ceil(Math.min(i6Var.d, i6Var.h))), charSequence);
        f6 f6Var = new f6(i6Var, h, i6Var.d, arrayList.size());
        f6 f6Var2 = new f6(i6Var, h, i6Var.h, arrayList.size());
        ((ArrayList) this.f1730e).add(f6Var);
        arrayList.add(f6Var2);
        float f10 = i6Var.d;
        float f11 = f6Var.f28312f;
        i6Var.d = f10 + f11;
        i6Var.h += f11;
        i6Var.f29335e = Math.max(i6Var.f29335e, h.getHeight());
        i6Var.f29338i = Math.max(i6Var.f29338i, h.getHeight());
    }

    @Override
    public void c(n2.g gVar, List list) {
        AndroidUtilities.runOnUIThread(new ff.k0(gVar, (org.telegram.ui.ActionBar.o2) this.f1729c, list, this.f1728b, (n2.e) this.d, (hw0) this.f1730e, 13));
    }

    @Override
    public void d(i3 i3Var) {
        mh1 mh1Var = (mh1) this.f1729c;
        j3 j3Var = (j3) this.d;
        VoIPService voIPService = (VoIPService) this.f1730e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(mh1Var.O0);
            mh1Var.N0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(mh1Var.f40431b, false, Integer.valueOf(this.f1728b));
            mh1Var.u(j3Var, voIPService);
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        TL_bots.toggleUsername toggleusername;
        int i10 = this.f1727a;
        int i11 = this.f1728b;
        Object obj = this.f1730e;
        Object obj2 = this.d;
        Object obj3 = this.f1729c;
        switch (i10) {
            case 2:
                final ba baVar = (ba) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                ma maVar = baVar.f36798a;
                long j10 = maVar.f40370x;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = MessagesController.getInstance(ma.a0(maVar)).getInputUser(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = maVar.getConnectionsManager();
                final int i12 = this.f1728b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.ti(ba.this, str, tLObject, i12, z11, tL_error, tL_username, z10));
                    }
                });
                maVar.f40369w.add(tL_username.username);
                ((ja) view).setLoading(true);
                return;
            case 3:
            case 5:
            default:
                PasskeysActivity.U((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i11);
                return;
            case 4:
                cr crVar = (cr) obj3;
                kh.d dVar = (kh.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new xq(crVar, dVar, 1));
                    return;
                }
                return;
            case 6:
                eu0 eu0Var = (eu0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(eu0Var.getContext(), 3, (b6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                tL_poll.f22406id = poll.f22406id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i13 = this.f1728b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i13).getInputPeer(eu0Var.f28136f1);
                tL_messages_editMessage.f22463id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new kq0(c2VarArr, i13, ConnectionsManager.getInstance(i13).sendRequest(tL_messages_editMessage, new f8(eu0Var, c2VarArr, i13, tL_messages_editMessage, 5)), 1), 500L);
                return;
        }
    }

    @Override
    public bu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void onProductDetailsResponse(n2.g gVar, List list) {
        ArrayList arrayList = (ArrayList) this.f1729c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f1730e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n2.l lVar = (n2.l) it.next();
            n2.i a2 = lVar.a();
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(lVar.f18335c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.f18324c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new c0(chat, this.f1728b, arrayList, callback, 1));
    }

    @Override
    public void run(boolean z10) {
        boolean z11;
        int i9;
        dy dyVar = (dy) this.d;
        ArrayList arrayList = (ArrayList) this.f1729c;
        HashSet hashSet = (HashSet) this.f1730e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView Y3 = dyVar.Y3();
        int i10 = this.f1728b;
        if (Y3 != null) {
            if (i10 == 102) {
                i9 = 27;
            } else {
                i9 = 26;
            }
            Y3.n(arrayList2, i9, null, null, new rv(dyVar, i10, arrayList2, z10, hashSet), null);
        }
        if (i10 == 103) {
            z11 = true;
        } else {
            z11 = false;
        }
        dyVar.b4(z11);
    }

    @Override
    public boolean u() {
        return false;
    }

    public d0(Object obj, int i9, Object obj2, Object obj3, int i10) {
        this.f1727a = i10;
        this.f1729c = obj;
        this.f1728b = i9;
        this.d = obj2;
        this.f1730e = obj3;
    }

    public d0(Object obj, Object obj2, Object obj3, int i9, int i10) {
        this.f1727a = i10;
        this.f1729c = obj;
        this.d = obj2;
        this.f1730e = obj3;
        this.f1728b = i9;
    }

    public d0(Object obj, TLObject tLObject, int i9, Object obj2, int i10) {
        this.f1727a = i10;
        this.f1729c = obj;
        this.d = tLObject;
        this.f1728b = i9;
        this.f1730e = obj2;
    }

    public d0(i6 i6Var, int i9, ArrayList arrayList, ArrayList arrayList2) {
        this.f1727a = 3;
        this.d = i6Var;
        this.f1728b = i9;
        this.f1729c = arrayList;
        this.f1730e = arrayList2;
    }

    public d0(dy dyVar, ArrayList arrayList, int i9, HashSet hashSet) {
        this.f1727a = 7;
        this.d = dyVar;
        this.f1729c = arrayList;
        this.f1728b = i9;
        this.f1730e = hashSet;
    }

    @Override
    public void D(float f10) {
    }

    @Override
    public void O() {
    }

    @Override
    public void J(boolean z10, boolean z11) {
    }
}
