package c3;

import a5.n;
import android.content.Context;
import android.text.TextUtils;
import cg.p2;
import d5.k;
import gf.j0;
import ig.q0;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.om0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.r40;
import org.telegram.ui.rn;
import org.telegram.ui.tc0;
import org.telegram.ui.v40;
import org.telegram.ui.zg;
import pf.k1;
import pf.l1;
import qf.p;
import qf.v;
import w2.i;

public final class d implements e3.b, k, NativeInstance.PayloadCallback, a2, Utilities.Callback3Return, MediaDataController.KeywordResultCallback {

    public final int f2424a;

    public final int f2425b;

    public final Object f2426c;
    public final Object d;

    public d(int i10, Object obj, Object obj2, int i11) {
        this.f2424a = i11;
        this.f2425b = i10;
        this.f2426c = obj;
        this.d = obj2;
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f2424a) {
            case 3:
                rn rnVar = (rn) this.f2426c;
                boolean[] zArr = (boolean[]) this.d;
                rnVar.getMessagesController().pinMessage(rnVar.f42026e, rnVar.f42039f, this.f2425b, false, !zArr[1], zArr[0]);
                ec ecVarB = mc.B(rnVar, true, null, null, rnVar.f41983aa);
                ecVarB.j();
                jb jbVar = ecVarB.f28016e;
                jbVar.postDelayed(new zg(0, jbVar), 550L);
                break;
            case 4:
                rn.Q0((rn) this.f2426c, this.f2425b, (MessageObject) this.d);
                break;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f2426c;
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.d;
                String strTrim = editTextBoldCursor.getText().toString().trim();
                if (strTrim.length() <= this.f2425b && !strTrim.isEmpty()) {
                    stringCallback.run(strTrim);
                    b2Var.dismiss();
                } else {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                }
                break;
            case 6:
                om0 om0Var = (om0) this.f2426c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String string = om0Var.getText().toString();
                if (string.length() <= 12) {
                    MessagesController.getInstance(this.f2425b).renameSavedReactionTag(q0.d(reaction), string);
                    b2Var.dismiss();
                } else {
                    AndroidUtilities.shakeView(om0Var);
                }
                break;
            case 7:
            case 12:
            default:
                p pVar = (p) this.f2426c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String string2 = pVar.getText().toString();
                if (string2.length() <= 32) {
                    v vVarD = v.d(this.f2425b);
                    TL_account.TL_businessChatLink tL_businessChatLinkC = vVarD.c(tL_businessChatLink.link);
                    if (tL_businessChatLinkC != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = tL_businessChatLinkC.message;
                        tL_inputBusinessChatLink.entities = tL_businessChatLinkC.entities;
                        tL_inputBusinessChatLink.title = string2;
                        vVarD.b(tL_businessChatLinkC, tL_inputBusinessChatLink, null);
                    }
                    b2Var.dismiss();
                } else {
                    AndroidUtilities.shakeView(pVar);
                }
                break;
            case 8:
                r40 r40Var = (r40) this.f2426c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                v40 v40Var = r40Var.f41806n;
                ChatObject.Call call = v40Var.f43351b.W0;
                String string3 = editTextBoldCursor2.getText().toString();
                int i11 = this.f2425b;
                call.toggleRecord(string3, i11);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                v40Var.f43351b.k1().j(i11 == 0 ? 39 : 100, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.f2426c;
                HashMap map = (HashMap) this.d;
                ArrayList arrayList = launchActivity.Z;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((n2) i0.a.i(1, arrayList))) {
                    tc0 tc0Var = new tc0(0);
                    tc0Var.B0 = new p2(map, this.f2425b, 10);
                    launchActivity.p0(tc0Var);
                }
                break;
            case 10:
                ((tc0) this.f2426c).w0(900, (TLRPC.User) this.d, this.f2425b);
                break;
            case 11:
                PasscodeActivity.U((PasscodeActivity) this.f2426c, (fc0) this.d, this.f2425b);
                break;
            case 13:
                SessionsActivity.X((SessionsActivity) this.f2426c, this.f2425b, (boolean[]) this.d);
                break;
            case 14:
                StickersActivity.a0((StickersActivity) this.f2426c, (ArrayList) this.d, this.f2425b);
                break;
        }
    }

    @Override
    public Object i() {
        g gVar = (g) this.f2426c;
        ((n) gVar.d).y((i) this.d, this.f2425b + 1, false);
        return null;
    }

    @Override
    public void invoke(Object obj) {
        h3.b2 b2Var = (h3.b2) this.f2426c;
        h3.b2 b2Var2 = (h3.b2) this.d;
        h3.a2 a2Var = (h3.a2) obj;
        int i10 = this.f2425b;
        a2Var.onPositionDiscontinuity(i10);
        a2Var.onPositionDiscontinuity(b2Var, b2Var2, i10);
    }

    @Override
    public void run(int i10, String str) {
        ((VoIPService) this.f2426c).lambda$createGroupInstance$66(this.f2425b, (boolean[]) this.d, i10, str);
    }

    public d(Object obj, int i10, Object obj2, int i11) {
        this.f2424a = i11;
        this.f2426c = obj;
        this.f2425b = i10;
        this.d = obj2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        k1 k1Var = (k1) this.f2426c;
        HashMap map = (HashMap) this.d;
        l1 l1Var = k1Var.f45863a;
        int i10 = l1Var.L;
        HashMap map2 = l1Var.E;
        if (this.f2425b != i10) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i11)).emoji;
            ArrayList arrayList2 = map != null ? (ArrayList) map.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                k1Var.a();
                if (!map2.containsKey(arrayList2)) {
                    map2.put(arrayList2, str2);
                    l1Var.F.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            l1Var.l();
        }
    }

    public d(Object obj, Object obj2, int i10, int i11) {
        this.f2424a = i11;
        this.f2426c = obj;
        this.d = obj2;
        this.f2425b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.f2426c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        TLRPC.Document document = (TLRPC.Document) obj2;
        int i10 = this.f2425b;
        String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i10));
        String str = TextUtils.isEmpty(strFindAnimatedEmojiEmoticon) ? "😀" : strFindAnimatedEmojiEmoticon;
        b2 b2Var = new b2(context, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new j0(b2Var, i10, document, obj, tL_stickers_addStickerToSet, 8));
        try {
            b2Var.q(350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }
}
