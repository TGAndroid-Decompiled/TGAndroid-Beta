package e3;

import android.content.Context;
import android.text.TextUtils;
import gg.m2;
import h5.j;
import j3.y1;
import j3.z1;
import java.util.ArrayList;
import java.util.HashMap;
import kh.a2;
import lf.i0;
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
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ad0;
import org.telegram.ui.bh;
import org.telegram.ui.c50;
import org.telegram.ui.g50;
import org.telegram.ui.xn;
import tf.l1;
import tf.m1;
import uf.n;
import uf.t;
import y2.i;
public final class d implements g3.b, j, NativeInstance.PayloadCallback, c2, Utilities.Callback3Return, MediaDataController.KeywordResultCallback {
    public final int f5086a;
    public final int f5087b;
    public final Object f5088c;
    public final Object d;

    public d(int i10, Object obj, Object obj2, int i11) {
        this.f5086a = i11;
        this.f5087b = i10;
        this.f5088c = obj;
        this.d = obj2;
    }

    @Override
    public Object g() {
        ((androidx.biometric.e) ((g) this.f5088c).d).A((i) this.d, this.f5087b + 1, false);
        return null;
    }

    @Override
    public void i(d2 d2Var, int i10) {
        int i11;
        switch (this.f5086a) {
            case 3:
                xn xnVar = (xn) this.f5088c;
                boolean[] zArr = (boolean[]) this.d;
                xnVar.getMessagesController().pinMessage(xnVar.e, xnVar.f40009f, this.f5087b, false, !zArr[1], zArr[0]);
                ic B = qc.B(xnVar, true, null, null, xnVar.f39968ba);
                B.j();
                nb nbVar = B.e;
                nbVar.postDelayed(new bh(0, nbVar), 550L);
                return;
            case 4:
                xn.Q0((xn) this.f5088c, this.f5087b, (MessageObject) this.d);
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f5088c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (trim.length() <= this.f5087b && !trim.isEmpty()) {
                    stringCallback.run(trim);
                    d2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(editTextBoldCursor);
                return;
            case 6:
                in0 in0Var = (in0) this.f5088c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj = in0Var.getText().toString();
                if (obj.length() > 12) {
                    AndroidUtilities.shakeView(in0Var);
                    return;
                }
                MessagesController.getInstance(this.f5087b).renameSavedReactionTag(q0.d(reaction), obj);
                d2Var.dismiss();
                return;
            case 7:
            case 12:
            default:
                n nVar = (n) this.f5088c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj2 = nVar.getText().toString();
                if (obj2.length() > 32) {
                    AndroidUtilities.shakeView(nVar);
                    return;
                }
                t d = t.d(this.f5087b);
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
                g50 g50Var = ((c50) this.f5088c).f33096n;
                ChatObject.Call call = g50Var.f34449b.X0;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i12 = this.f5087b;
                call.toggleRecord(obj3, i12);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                UndoView k12 = g50Var.f34449b.k1();
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
                LaunchActivity launchActivity = (LaunchActivity) this.f5088c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.f31614a0;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((p2) a2.i(1, arrayList))) {
                    ad0 ad0Var = new ad0(0);
                    ad0Var.C0 = new m2(hashMap, this.f5087b, 11);
                    launchActivity.p0(ad0Var);
                    return;
                }
                return;
            case 10:
                ((ad0) this.f5088c).w0(900, (TLRPC.User) this.d, this.f5087b);
                return;
            case 11:
                PasscodeActivity.U((PasscodeActivity) this.f5088c, (wc0) this.d, this.f5087b);
                return;
            case 13:
                SessionsActivity.X((SessionsActivity) this.f5088c, this.f5087b, (boolean[]) this.d);
                return;
            case 14:
                StickersActivity.a0((StickersActivity) this.f5088c, (ArrayList) this.d, this.f5087b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        y1 y1Var = (y1) obj;
        int i10 = this.f5087b;
        y1Var.onPositionDiscontinuity(i10);
        y1Var.onPositionDiscontinuity((z1) this.f5088c, (z1) this.d, i10);
    }

    @Override
    public void run(int i10, String str) {
        ((VoIPService) this.f5088c).lambda$createGroupInstance$66(this.f5087b, (boolean[]) this.d, i10, str);
    }

    public d(Object obj, int i10, Object obj2, int i11) {
        this.f5086a = i11;
        this.f5088c = obj;
        this.f5087b = i10;
        this.d = obj2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        l1 l1Var = (l1) this.f5088c;
        HashMap hashMap = (HashMap) this.d;
        m1 m1Var = l1Var.f44788a;
        int i10 = m1Var.M;
        HashMap hashMap2 = m1Var.F;
        if (this.f5087b != i10) {
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
        this.f5086a = i11;
        this.f5088c = obj;
        this.d = obj2;
        this.f5087b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f5088c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        int i10 = this.f5087b;
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
