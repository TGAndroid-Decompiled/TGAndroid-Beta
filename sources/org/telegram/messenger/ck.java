package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.jf1;
import org.telegram.ui.sn;
import org.telegram.ui.t21;
public final class ck implements jf1, org.telegram.ui.Components.e5, LanguageDetector.StringCallback {
    public final boolean f18137a;
    public final NotificationCenter.NotificationCenterDelegate f18138b;
    public final Object f18139c;
    public final Object d;
    public final Object e;
    public final Object f18140f;

    public ck(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, sn snVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f18138b = sendMessagesHelper;
        this.f18137a = z10;
        this.f18139c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f18140f = snVar;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18138b;
        TLRPC.Document document = (TLRPC.Document) this.f18139c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f18140f;
        int i12 = ChatActivityEnterView.f23911n5;
        chatActivityEnterView.e(document, str, this.e, sendAnimationData, this.f18137a, z10, i10, i11);
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f18138b).lambda$sendCallback$43(this.f18137a, (MessageObject) this.f18139c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (sn) this.f18140f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f18138b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        hg.d1 d1Var = (hg.d1) this.f18140f;
        ((String[]) this.f18139c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f18137a && !t21.Y().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        d1Var.run();
    }

    public ck(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f18138b = chatActivityEnterView;
        this.f18139c = document;
        this.d = str;
        this.e = obj;
        this.f18140f = sendAnimationData;
        this.f18137a = z10;
    }

    public ck(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, hg.d1 d1Var) {
        this.f18138b = profileActivity;
        this.f18139c = strArr;
        this.d = zArr;
        this.e = str;
        this.f18137a = z10;
        this.f18140f = d1Var;
    }
}
