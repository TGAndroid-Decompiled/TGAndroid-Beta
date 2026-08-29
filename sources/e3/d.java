package e3;

import android.content.Context;
import android.text.TextUtils;
import eg.n2;
import f5.j;
import j3.a2;
import j7.l1;
import java.util.ArrayList;
import java.util.HashMap;
import jf.i0;
import kg.q0;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.q40;
import org.telegram.ui.rc0;
import org.telegram.ui.tn;
import org.telegram.ui.u40;
import org.telegram.ui.wg;
import rf.m1;
import sf.o;
import sf.u;
import y2.i;
public final class d implements g3.b, j, NativeInstance.PayloadCallback, b2, Utilities.Callback3Return, MediaDataController.KeywordResultCallback {
    public final int f5806a;
    public final int f5807b;
    public final Object f5808c;
    public final Object d;

    public d(int i10, Object obj, Object obj2, int i11) {
        this.f5806a = i11;
        this.f5807b = i10;
        this.f5808c = obj;
        this.d = obj2;
    }

    @Override
    public Object f() {
        ((androidx.biometric.e) ((f) this.f5808c).d).A((i) this.d, this.f5807b + 1, false);
        return null;
    }

    @Override
    public void g(c2 c2Var, int i10) {
        int i11;
        switch (this.f5806a) {
            case 3:
                tn tnVar = (tn) this.f5808c;
                boolean[] zArr = (boolean[]) this.d;
                tnVar.getMessagesController().pinMessage(tnVar.f42787e, tnVar.f42801f, this.f5807b, false, !zArr[1], zArr[0]);
                mc B = tc.B(tnVar, true, null, null, tnVar.f42746aa);
                B.j();
                rb rbVar = B.f30648e;
                rbVar.postDelayed(new wg(0, rbVar), 550L);
                return;
            case 4:
                tn.Q0((tn) this.f5808c, this.f5807b, (MessageObject) this.d);
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f5808c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (trim.length() <= this.f5807b && !trim.isEmpty()) {
                    stringCallback.run(trim);
                    c2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(editTextBoldCursor);
                return;
            case 6:
                ym0 ym0Var = (ym0) this.f5808c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj = ym0Var.getText().toString();
                if (obj.length() > 12) {
                    AndroidUtilities.shakeView(ym0Var);
                    return;
                }
                MessagesController.getInstance(this.f5807b).renameSavedReactionTag(q0.d(reaction), obj);
                c2Var.dismiss();
                return;
            case 7:
            case 12:
            default:
                o oVar = (o) this.f5808c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj2 = oVar.getText().toString();
                if (obj2.length() > 32) {
                    AndroidUtilities.shakeView(oVar);
                    return;
                }
                u d = u.d(this.f5807b);
                TL_account.TL_businessChatLink c3 = d.c(tL_businessChatLink.link);
                if (c3 != null) {
                    TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                    tL_inputBusinessChatLink.message = c3.message;
                    tL_inputBusinessChatLink.entities = c3.entities;
                    tL_inputBusinessChatLink.title = obj2;
                    d.b(c3, tL_inputBusinessChatLink, null);
                }
                c2Var.dismiss();
                return;
            case 8:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                u40 u40Var = ((q40) this.f5808c).f41532n;
                ChatObject.Call call = u40Var.f43179b.W0;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i12 = this.f5807b;
                call.toggleRecord(obj3, i12);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                UndoView k12 = u40Var.f43179b.k1();
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
                LaunchActivity launchActivity = (LaunchActivity) this.f5808c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.Z;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((o2) l1.i(1, arrayList))) {
                    rc0 rc0Var = new rc0(0);
                    rc0Var.B0 = new n2(hashMap, this.f5807b, 10);
                    launchActivity.p0(rc0Var);
                    return;
                }
                return;
            case 10:
                ((rc0) this.f5808c).w0(900, (TLRPC.User) this.d, this.f5807b);
                return;
            case 11:
                PasscodeActivity.U((PasscodeActivity) this.f5808c, (qc0) this.d, this.f5807b);
                return;
            case 13:
                SessionsActivity.X((SessionsActivity) this.f5808c, this.f5807b, (boolean[]) this.d);
                return;
            case 14:
                StickersActivity.a0((StickersActivity) this.f5808c, (ArrayList) this.d, this.f5807b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        a2 a2Var = (a2) obj;
        int i10 = this.f5807b;
        a2Var.onPositionDiscontinuity(i10);
        a2Var.onPositionDiscontinuity((j3.b2) this.f5808c, (j3.b2) this.d, i10);
    }

    @Override
    public void run(int i10, String str) {
        ((VoIPService) this.f5808c).lambda$createGroupInstance$66(this.f5807b, (boolean[]) this.d, i10, str);
    }

    public d(Object obj, int i10, Object obj2, int i11) {
        this.f5806a = i11;
        this.f5808c = obj;
        this.f5807b = i10;
        this.d = obj2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        rf.l1 l1Var = (rf.l1) this.f5808c;
        HashMap hashMap = (HashMap) this.d;
        m1 m1Var = l1Var.f47304a;
        int i10 = m1Var.L;
        HashMap hashMap2 = m1Var.E;
        if (this.f5807b != i10) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i11)).emoji;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                l1Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    m1Var.F.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            m1Var.l();
        }
    }

    public d(Object obj, Object obj2, int i10, int i11) {
        this.f5806a = i11;
        this.f5808c = obj;
        this.d = obj2;
        this.f5807b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f5808c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        int i10 = this.f5807b;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i10));
        String str = TextUtils.isEmpty(findAnimatedEmojiEmoticon) ? "😀" : findAnimatedEmojiEmoticon;
        c2 c2Var = new c2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new i0(c2Var, i10, document, obj, tL_stickers_addStickerToSet, 8));
        try {
            c2Var.q(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
