package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.co;
import org.telegram.ui.h41;
import org.telegram.ui.ug1;
public final class kj implements ug1, org.telegram.ui.Components.d5, LanguageDetector.StringCallback {
    public final boolean f18247a;
    public final NotificationCenter.NotificationCenterDelegate f18248b;
    public final Object f18249c;
    public final Object d;
    public final Object f18250e;
    public final Object f18251f;

    public kj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, co coVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f18248b = sendMessagesHelper;
        this.f18247a = z10;
        this.f18249c = messageObject;
        this.d = keyboardButtonProto;
        this.f18250e = twoStepVerificationActivity;
        this.f18251f = coVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18248b;
        TLRPC.Document document = (TLRPC.Document) this.f18249c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f18251f;
        int i12 = ChatActivityEnterView.f23689m5;
        chatActivityEnterView.a(document, str, this.f18250e, sendAnimationData, this.f18247a, z10, i10, i11);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f18248b).lambda$sendCallback$40(this.f18247a, (MessageObject) this.f18249c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.f18250e, (co) this.f18251f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f18248b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.f18250e;
        hg.e1 e1Var = (hg.e1) this.f18251f;
        ((String[]) this.f18249c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f18247a && !h41.Y().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        e1Var.run();
    }

    public kj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f18248b = chatActivityEnterView;
        this.f18249c = document;
        this.d = str;
        this.f18250e = obj;
        this.f18251f = sendAnimationData;
        this.f18247a = z10;
    }

    public kj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, hg.e1 e1Var) {
        this.f18248b = profileActivity;
        this.f18249c = strArr;
        this.d = zArr;
        this.f18250e = str;
        this.f18247a = z10;
        this.f18251f = e1Var;
    }
}
