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
import org.telegram.ui.k41;
import org.telegram.ui.zg1;
public final class tj implements zg1, org.telegram.ui.Components.c5, LanguageDetector.StringCallback {
    public final boolean f16430a;
    public final NotificationCenter.NotificationCenterDelegate f16431b;
    public final Object f16432c;
    public final Object d;
    public final Object e;
    public final Object f16433f;

    public tj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f16431b = sendMessagesHelper;
        this.f16430a = z10;
        this.f16432c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f16433f = eoVar;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f16431b;
        TLRPC.Document document = (TLRPC.Document) this.f16432c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f16433f;
        int i12 = ChatActivityEnterView.f20816m5;
        chatActivityEnterView.d(document, str, this.e, sendAnimationData, this.f16430a, z10, i10, i11);
    }

    @Override
    public void d(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f16431b).lambda$sendCallback$40(this.f16430a, (MessageObject) this.f16432c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (eo) this.f16433f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f16431b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        fg.f1 f1Var = (fg.f1) this.f16433f;
        ((String[]) this.f16432c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f16430a && !k41.Y().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        f1Var.run();
    }

    public tj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f16431b = chatActivityEnterView;
        this.f16432c = document;
        this.d = str;
        this.e = obj;
        this.f16433f = sendAnimationData;
        this.f16430a = z10;
    }

    public tj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, fg.f1 f1Var) {
        this.f16431b = profileActivity;
        this.f16432c = strArr;
        this.d = zArr;
        this.e = str;
        this.f16430a = z10;
        this.f16433f = f1Var;
    }
}
