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
    public final boolean f18422a;
    public final NotificationCenter.NotificationCenterDelegate f18423b;
    public final Object f18424c;
    public final Object d;
    public final Object f18425e;
    public final Object f18426f;

    public nk(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f18423b = sendMessagesHelper;
        this.f18422a = z10;
        this.f18424c = messageObject;
        this.d = keyboardButtonProto;
        this.f18425e = twoStepVerificationActivity;
        this.f18426f = eoVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18423b;
        TLRPC.Document document = (TLRPC.Document) this.f18424c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f18426f;
        int i12 = ChatActivityEnterView.S5;
        chatActivityEnterView.d(document, str, this.f18425e, sendAnimationData, this.f18422a, z10, i10, i11);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f18423b).lambda$sendCallback$43(this.f18422a, (MessageObject) this.f18424c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.f18425e, (eo) this.f18426f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f18423b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.f18425e;
        gg.d1 d1Var = (gg.d1) this.f18426f;
        ((String[]) this.f18424c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f18422a && !h41.Y().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        d1Var.run();
    }

    public nk(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f18423b = chatActivityEnterView;
        this.f18424c = document;
        this.d = str;
        this.f18425e = obj;
        this.f18426f = sendAnimationData;
        this.f18422a = z10;
    }

    public nk(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, gg.d1 d1Var) {
        this.f18423b = profileActivity;
        this.f18424c = strArr;
        this.d = zArr;
        this.f18425e = str;
        this.f18422a = z10;
        this.f18426f = d1Var;
    }
}
