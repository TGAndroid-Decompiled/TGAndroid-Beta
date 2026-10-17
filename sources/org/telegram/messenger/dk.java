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
public final class dk implements jf1, org.telegram.ui.Components.e5, LanguageDetector.StringCallback {
    public final boolean f18211a;
    public final NotificationCenter.NotificationCenterDelegate f18212b;
    public final Object f18213c;
    public final Object d;
    public final Object e;
    public final Object f18214f;

    public dk(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, sn snVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f18212b = sendMessagesHelper;
        this.f18211a = z10;
        this.f18213c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f18214f = snVar;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18212b;
        TLRPC.Document document = (TLRPC.Document) this.f18213c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f18214f;
        int i12 = ChatActivityEnterView.f23904n5;
        chatActivityEnterView.e(document, str, this.e, sendAnimationData, this.f18211a, z10, i10, i11);
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f18212b).lambda$sendCallback$43(this.f18211a, (MessageObject) this.f18213c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (sn) this.f18214f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f18212b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        hg.d1 d1Var = (hg.d1) this.f18214f;
        ((String[]) this.f18213c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f18211a && !t21.Y().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        d1Var.run();
    }

    public dk(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f18212b = chatActivityEnterView;
        this.f18213c = document;
        this.d = str;
        this.e = obj;
        this.f18214f = sendAnimationData;
        this.f18211a = z10;
    }

    public dk(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, hg.d1 d1Var) {
        this.f18212b = profileActivity;
        this.f18213c = strArr;
        this.d = zArr;
        this.e = str;
        this.f18211a = z10;
        this.f18214f = d1Var;
    }
}
