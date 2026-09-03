package e3;

import android.content.Context;
import android.text.TextUtils;
import gg.m2;
import h5.j;
import j3.y1;
import j3.z1;
import java.util.ArrayList;
import java.util.HashMap;
import kf.i0;
import kf.k0;
import mg.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.cd0;
import org.telegram.ui.dh;
import org.telegram.ui.e50;
import org.telegram.ui.i50;
import org.telegram.ui.zn;
import tf.l1;
import tf.m1;
import uf.n;
import uf.t;
import y2.i;
public final class d implements g3.b, j, NativeInstance.PayloadCallback, c2, Utilities.Callback3Return, MediaDataController.KeywordResultCallback {
    public final int f5092a;
    public final int f5093b;
    public final Object f5094c;
    public final Object d;

    public d(int i10, Object obj, Object obj2, int i11) {
        this.f5092a = i11;
        this.f5093b = i10;
        this.f5094c = obj;
        this.d = obj2;
    }

    @Override
    public Object h() {
        ((af.d) ((g) this.f5094c).d).A((i) this.d, this.f5093b + 1, false);
        return null;
    }

    @Override
    public void invoke(Object obj) {
        y1 y1Var = (y1) obj;
        int i10 = this.f5093b;
        y1Var.onPositionDiscontinuity(i10);
        y1Var.onPositionDiscontinuity((z1) this.f5094c, (z1) this.d, i10);
    }

    @Override
    public void l(d2 d2Var, int i10) {
        int i11;
        switch (this.f5092a) {
            case 3:
                zn znVar = (zn) this.f5094c;
                boolean[] zArr = (boolean[]) this.d;
                znVar.getMessagesController().pinMessage(znVar.e, znVar.f40575f, this.f5093b, false, !zArr[1], zArr[0]);
                ic B = qc.B(znVar, true, null, null, znVar.f40534ba);
                B.j();
                nb nbVar = B.e;
                nbVar.postDelayed(new dh(0, nbVar), 550L);
                return;
            case 4:
                zn.Q0((zn) this.f5094c, this.f5093b, (MessageObject) this.d);
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f5094c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (trim.length() <= this.f5093b && !trim.isEmpty()) {
                    stringCallback.run(trim);
                    d2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(editTextBoldCursor);
                return;
            case 6:
                hn0 hn0Var = (hn0) this.f5094c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj = hn0Var.getText().toString();
                if (obj.length() > 12) {
                    AndroidUtilities.shakeView(hn0Var);
                    return;
                }
                MessagesController.getInstance(this.f5093b).renameSavedReactionTag(q0.d(reaction), obj);
                d2Var.dismiss();
                return;
            case 7:
            case 12:
            default:
                n nVar = (n) this.f5094c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj2 = nVar.getText().toString();
                if (obj2.length() > 32) {
                    AndroidUtilities.shakeView(nVar);
                    return;
                }
                t d = t.d(this.f5093b);
                TL_account.TL_businessChatLink c3 = d.c(tL_businessChatLink.link);
                if (c3 != null) {
                    TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                    tL_inputBusinessChatLink.message = c3.message;
                    tL_inputBusinessChatLink.entities = c3.entities;
                    tL_inputBusinessChatLink.title = obj2;
                    d.b(c3, tL_inputBusinessChatLink, null);
                }
                d2Var.dismiss();
                return;
            case 8:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                i50 i50Var = ((e50) this.f5094c).f33612n;
                ChatObject.Call call = i50Var.f34803b.X0;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i12 = this.f5093b;
                call.toggleRecord(obj3, i12);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                UndoView k12 = i50Var.f34803b.k1();
                if (i12 == 0) {
                    i11 = 39;
                } else {
                    i11 = 100;
                }
                k12.j(i11, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    return;
                }
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.f5094c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.f31588a0;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((p2) k0.i(1, arrayList))) {
                    cd0 cd0Var = new cd0(0);
                    cd0Var.C0 = new m2(hashMap, this.f5093b, 11);
                    launchActivity.p0(cd0Var);
                    return;
                }
                return;
            case 10:
                ((cd0) this.f5094c).w0(900, (TLRPC.User) this.d, this.f5093b);
                return;
            case 11:
                PasscodeActivity.U((PasscodeActivity) this.f5094c, (xc0) this.d, this.f5093b);
                return;
            case 13:
                SessionsActivity.X((SessionsActivity) this.f5094c, this.f5093b, (boolean[]) this.d);
                return;
            case 14:
                StickersActivity.a0((StickersActivity) this.f5094c, (ArrayList) this.d, this.f5093b);
                return;
        }
    }

    @Override
    public void run(int i10, String str) {
        ((VoIPService) this.f5094c).lambda$createGroupInstance$66(this.f5093b, (boolean[]) this.d, i10, str);
    }

    public d(Object obj, int i10, Object obj2, int i11) {
        this.f5092a = i11;
        this.f5094c = obj;
        this.f5093b = i10;
        this.d = obj2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        l1 l1Var = (l1) this.f5094c;
        HashMap hashMap = (HashMap) this.d;
        m1 m1Var = l1Var.f44850a;
        int i10 = m1Var.M;
        HashMap hashMap2 = m1Var.F;
        if (this.f5093b != i10) {
            return;
        }
        int size = arrayList.size();
        boolean z4 = false;
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i11)).emoji;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                l1Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    m1Var.G.add(arrayList2);
                    z4 = true;
                }
            }
        }
        if (z4) {
            m1Var.l();
        }
    }

    public d(Object obj, Object obj2, int i10, int i11) {
        this.f5092a = i11;
        this.f5094c = obj;
        this.d = obj2;
        this.f5093b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f5094c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        int i10 = this.f5093b;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i10));
        String str = TextUtils.isEmpty(findAnimatedEmojiEmoticon) ? "😀" : findAnimatedEmojiEmoticon;
        d2 d2Var = new d2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new i0(d2Var, i10, document, obj, tL_stickers_addStickerToSet, 8));
        try {
            d2Var.q(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
