package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eo;
import org.telegram.ui.h41;
import org.telegram.ui.xg1;
public final class nk implements xg1, org.telegram.ui.Components.f5, LanguageDetector.StringCallback {
    public final boolean f18421a;
    public final NotificationCenter.NotificationCenterDelegate f18422b;
    public final Object f18423c;
    public final Object d;
    public final Object f18424e;
    public final Object f18425f;

    public nk(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f18422b = sendMessagesHelper;
        this.f18421a = z10;
        this.f18423c = messageObject;
        this.d = keyboardButtonProto;
        this.f18424e = twoStepVerificationActivity;
        this.f18425f = eoVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18422b;
        TLRPC.Document document = (TLRPC.Document) this.f18423c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f18425f;
        int i12 = ChatActivityEnterView.Q5;
        chatActivityEnterView.d(document, str, this.f18424e, sendAnimationData, this.f18421a, z10, i10, i11);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f18422b).lambda$sendCallback$43(this.f18421a, (MessageObject) this.f18423c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.f18424e, (eo) this.f18425f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f18422b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.f18424e;
        gg.d1 d1Var = (gg.d1) this.f18425f;
        ((String[]) this.f18423c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f18421a && !h41.Y().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        d1Var.run();
    }

    public nk(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f18422b = chatActivityEnterView;
        this.f18423c = document;
        this.d = str;
        this.f18424e = obj;
        this.f18425f = sendAnimationData;
        this.f18421a = z10;
    }

    public nk(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, gg.d1 d1Var) {
        this.f18422b = profileActivity;
        this.f18423c = strArr;
        this.d = zArr;
        this.f18424e = str;
        this.f18421a = z10;
        this.f18425f = d1Var;
    }
}
