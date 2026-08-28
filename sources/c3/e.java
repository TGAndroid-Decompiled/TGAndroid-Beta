package c3;

import a5.m;
import android.content.Context;
import android.text.TextUtils;
import bg.x2;
import d5.k;
import ff.j0;
import h3.a2;
import hg.r0;
import java.util.ArrayList;
import java.util.HashMap;
import of.w1;
import of.y1;
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
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.n40;
import org.telegram.ui.pc0;
import org.telegram.ui.qn;
import org.telegram.ui.r40;
import org.telegram.ui.xg;
import pf.o;
import pf.u;
import w2.i;
public final class e implements e3.b, k, MediaDataController.KeywordResultCallback, NativeInstance.PayloadCallback, b2, Utilities.Callback3Return {
    public final int f2290a;
    public final int f2291b;
    public final Object f2292c;
    public final Object d;

    public e(int i9, Object obj, Object obj2, int i10) {
        this.f2290a = i10;
        this.f2291b = i9;
        this.f2292c = obj;
        this.d = obj2;
    }

    @Override
    public void f(c2 c2Var, int i9) {
        int i10;
        switch (this.f2290a) {
            case 4:
                qn qnVar = (qn) this.f2292c;
                boolean[] zArr = (boolean[]) this.d;
                qnVar.getMessagesController().pinMessage(qnVar.f41890e, qnVar.f41903f, this.f2291b, false, !zArr[1], zArr[0]);
                gc B = oc.B(qnVar, true, null, null, qnVar.f41848aa);
                B.j();
                lb lbVar = B.f28733e;
                lbVar.postDelayed(new xg(0, lbVar), 550L);
                return;
            case 5:
                qn.Q0((qn) this.f2292c, this.f2291b, (MessageObject) this.d);
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f2292c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (trim.length() <= this.f2291b && !trim.isEmpty()) {
                    stringCallback.run(trim);
                    c2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(editTextBoldCursor);
                return;
            case 7:
                mm0 mm0Var = (mm0) this.f2292c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj = mm0Var.getText().toString();
                if (obj.length() > 12) {
                    AndroidUtilities.shakeView(mm0Var);
                    return;
                }
                MessagesController.getInstance(this.f2291b).renameSavedReactionTag(r0.d(reaction), obj);
                c2Var.dismiss();
                return;
            case 8:
            case 13:
            default:
                o oVar = (o) this.f2292c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj2 = oVar.getText().toString();
                if (obj2.length() > 32) {
                    AndroidUtilities.shakeView(oVar);
                    return;
                }
                u d = u.d(this.f2291b);
                TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                if (c10 != null) {
                    TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                    tL_inputBusinessChatLink.message = c10.message;
                    tL_inputBusinessChatLink.entities = c10.entities;
                    tL_inputBusinessChatLink.title = obj2;
                    d.b(c10, tL_inputBusinessChatLink, null);
                }
                c2Var.dismiss();
                return;
            case 9:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                r40 r40Var = ((n40) this.f2292c).f40589n;
                ChatObject.Call call = r40Var.f42265b.W0;
                String obj3 = editTextBoldCursor2.getText().toString();
                int i11 = this.f2291b;
                call.toggleRecord(obj3, i11);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                UndoView k12 = r40Var.f42265b.k1();
                if (i11 == 0) {
                    i10 = 39;
                } else {
                    i10 = 100;
                }
                k12.j(i10, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    return;
                }
                return;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.f2292c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.Z;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((o2) j3.r0.j(1, arrayList))) {
                    pc0 pc0Var = new pc0(0);
                    pc0Var.B0 = new x2(hashMap, this.f2291b, 10);
                    launchActivity.p0(pc0Var);
                    return;
                }
                return;
            case 11:
                ((pc0) this.f2292c).v0(900, (TLRPC.User) this.d, this.f2291b);
                return;
            case 12:
                PasscodeActivity.T((PasscodeActivity) this.f2292c, (bc0) this.d, this.f2291b);
                return;
            case 14:
                SessionsActivity.W((SessionsActivity) this.f2292c, this.f2291b, (boolean[]) this.d);
                return;
            case 15:
                StickersActivity.Z((StickersActivity) this.f2292c, (ArrayList) this.d, this.f2291b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        a2 a2Var = (a2) obj;
        int i9 = this.f2291b;
        a2Var.onPositionDiscontinuity(i9);
        a2Var.onPositionDiscontinuity((h3.b2) this.f2292c, (h3.b2) this.d, i9);
    }

    @Override
    public Object j() {
        ((m) ((h) this.f2292c).d).A((i) this.d, this.f2291b + 1, false);
        return null;
    }

    @Override
    public void run(int i9, String str) {
        ((VoIPService) this.f2292c).lambda$createGroupInstance$66(this.f2291b, (boolean[]) this.d, i9, str);
    }

    public e(Object obj, int i9, Object obj2, int i10) {
        this.f2290a = i10;
        this.f2292c = obj;
        this.f2291b = i9;
        this.d = obj2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        w1 w1Var = (w1) this.f2292c;
        HashMap hashMap = (HashMap) this.d;
        y1 y1Var = w1Var.f19543a;
        int i9 = y1Var.L;
        HashMap hashMap2 = y1Var.E;
        if (this.f2291b != i9) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                w1Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    y1Var.F.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            y1Var.l();
        }
    }

    public e(Object obj, Object obj2, int i9, int i10) {
        this.f2290a = i10;
        this.f2292c = obj;
        this.d = obj2;
        this.f2291b = i9;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f2292c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        int i9 = this.f2291b;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i9));
        String str = TextUtils.isEmpty(findAnimatedEmojiEmoticon) ? "😀" : findAnimatedEmojiEmoticon;
        c2 c2Var = new c2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new j0(c2Var, i9, document, obj, tL_stickers_addStickerToSet, 9));
        try {
            c2Var.q(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
