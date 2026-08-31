package hg;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import oh.b8;
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
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.voip.j3;
import org.telegram.ui.Components.voip.k3;
import org.telegram.ui.Components.voip.l3;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.bw;
import org.telegram.ui.ci1;
import org.telegram.ui.ea;
import org.telegram.ui.lu0;
import org.telegram.ui.ma;
import org.telegram.ui.pa;
import org.telegram.ui.py;
import org.telegram.ui.sw0;
import org.telegram.ui.zi;
public final class a0 implements BillingController.ProductDetailsResponseListenerLegacy, x40, org.telegram.ui.ActionBar.c2, h6, ll0, MessagesStorage.BooleanCallback, p2.n, j3 {
    public final int f7389a;
    public final int f7390b;
    public final Object f7391c;
    public final Object d;
    public final Object f7392e;

    public a0(int i10, zi ziVar, f5 f5Var, y40 y40Var) {
        this.f7389a = 1;
        this.f7390b = i10;
        this.f7391c = ziVar;
        this.d = f5Var;
        this.f7392e = y40Var;
    }

    @Override
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z4, final TLRPC.VideoSize videoSize) {
        final zi ziVar = (zi) this.f7391c;
        final f5 f5Var = (f5) this.d;
        final y40 y40Var = (y40) this.f7392e;
        final int i10 = this.f7390b;
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new i0(i12, photoSize2, photoSize, ziVar, f5Var, 0));
                y40Var.j();
            }
        });
    }

    @Override
    public void a(CharSequence charSequence) {
        j6 j6Var = (j6) this.d;
        ArrayList arrayList = (ArrayList) this.f7391c;
        StaticLayout h = j6Var.h(this.f7390b - ((int) Math.ceil(Math.min(j6Var.d, j6Var.h))), charSequence);
        g6 g6Var = new g6(j6Var, h, j6Var.d, arrayList.size());
        g6 g6Var2 = new g6(j6Var, h, j6Var.h, arrayList.size());
        ((ArrayList) this.f7392e).add(g6Var);
        arrayList.add(g6Var2);
        float f10 = j6Var.d;
        float f11 = g6Var.f27121f;
        j6Var.d = f10 + f11;
        j6Var.h += f11;
        j6Var.f28031e = Math.max(j6Var.f28031e, h.getHeight());
        j6Var.f28034i = Math.max(j6Var.f28034i, h.getHeight());
    }

    @Override
    public void b(p2.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new lf.j0(hVar, (org.telegram.ui.ActionBar.p2) this.f7391c, list, this.f7390b, (p2.e) this.d, (sw0) this.f7392e, 13));
    }

    @Override
    public void d(k3 k3Var) {
        ci1 ci1Var = (ci1) this.f7391c;
        l3 l3Var = (l3) this.d;
        VoIPService voIPService = (VoIPService) this.f7392e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(ci1Var.P0);
            ci1Var.O0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(ci1Var.f35821b, false, Integer.valueOf(this.f7390b));
            ci1Var.u(l3Var, voIPService);
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean f(int i10, View view) {
        int i11;
        pn0 pn0Var = (pn0) this.f7391c;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f7392e;
        ArrayList arrayList = pn0Var.f30134r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i12 = this.f7390b;
            if (UserConfig.getInstance(i12).isPremium()) {
                if (!UserConfig.getInstance(i12).isPremium()) {
                    new fg.n1(p2Var, 24, true).show();
                    return true;
                }
                nn0 nn0Var = ((on0) view).f29821a;
                if (nn0Var != null) {
                    nn0Var.q();
                }
                mn0 mn0Var = (mn0) arrayList.get(i10);
                q70 H = q70.H(p2Var, view);
                H.f30311i = 3;
                int i13 = R.drawable.menu_tag_rename;
                if (TextUtils.isEmpty(mn0Var.f29158c)) {
                    i11 = R.string.SavedTagLabelTag;
                } else {
                    i11 = R.string.SavedTagRenameTag;
                }
                H.c(i13, LocaleController.getString(i11), new dg.u1(pn0Var, i12, mn0Var, g6Var, 20), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public lu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TL_bots.toggleUsername toggleusername;
        int i11 = this.f7389a;
        int i12 = this.f7390b;
        Object obj = this.f7392e;
        Object obj2 = this.d;
        Object obj3 = this.f7391c;
        switch (i11) {
            case 2:
                final ea eaVar = (ea) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z4 = tL_username.active;
                final String str = tL_username.username;
                final boolean z10 = !z4;
                pa paVar = eaVar.f36453a;
                long j10 = paVar.f40000x;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z10;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = MessagesController.getInstance(pa.b0(paVar)).getInputUser(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z10;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = paVar.getConnectionsManager();
                final int i13 = this.f7390b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.fj(ea.this, str, tLObject, i13, z10, tL_error, tL_username, z4));
                    }
                });
                paVar.f39999w.add(tL_username.username);
                ((ma) view).setLoading(true);
                return;
            case 3:
            case 5:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                return;
            case 4:
                lr lrVar = (lr) obj3;
                qh.d dVar = (qh.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new hr(lrVar, dVar, 1));
                    return;
                }
                return;
            case 6:
                zu0 zu0Var = (zu0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(zu0Var.getContext(), 3, (org.telegram.ui.ActionBar.g6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                tL_poll.f20869id = poll.f20869id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i14 = this.f7390b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i14).getInputPeer(zu0Var.f33979g1);
                tL_messages_editMessage.f20926id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new er0(d2VarArr, i14, ConnectionsManager.getInstance(i14).sendRequest(tL_messages_editMessage, new b8(zu0Var, d2VarArr, i14, tL_messages_editMessage, 4)), 1), 500L);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(p2.h hVar, List list) {
        ArrayList arrayList = (ArrayList) this.f7391c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f7392e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p2.m mVar = (p2.m) it.next();
            p2.j a2 = mVar.a();
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(mVar.f44161c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.f44149b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.f44150c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new z(chat, this.f7390b, arrayList, callback, 1));
    }

    @Override
    public void run(boolean z4) {
        boolean z10;
        int i10;
        py pyVar = (py) this.d;
        ArrayList arrayList = (ArrayList) this.f7391c;
        HashSet hashSet = (HashSet) this.f7392e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView Y3 = pyVar.Y3();
        int i11 = this.f7390b;
        if (Y3 != null) {
            if (i11 == 102) {
                i10 = 27;
            } else {
                i10 = 26;
            }
            Y3.n(arrayList2, i10, null, null, new bw(pyVar, i11, arrayList2, z4, hashSet), null);
        }
        if (i11 == 103) {
            z10 = true;
        } else {
            z10 = false;
        }
        pyVar.b4(z10);
    }

    @Override
    public boolean u() {
        return false;
    }

    public a0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f7389a = i11;
        this.f7391c = obj;
        this.f7390b = i10;
        this.d = obj2;
        this.f7392e = obj3;
    }

    public a0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f7389a = i11;
        this.f7391c = obj;
        this.d = obj2;
        this.f7392e = obj3;
        this.f7390b = i10;
    }

    public a0(Object obj, TLObject tLObject, int i10, Object obj2, int i11) {
        this.f7389a = i11;
        this.f7391c = obj;
        this.d = tLObject;
        this.f7390b = i10;
        this.f7392e = obj2;
    }

    public a0(j6 j6Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        this.f7389a = 3;
        this.d = j6Var;
        this.f7390b = i10;
        this.f7391c = arrayList;
        this.f7392e = arrayList2;
    }

    public a0(py pyVar, ArrayList arrayList, int i10, HashSet hashSet) {
        this.f7389a = 7;
        this.d = pyVar;
        this.f7391c = arrayList;
        this.f7390b = i10;
        this.f7392e = hashSet;
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
