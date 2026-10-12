package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bh1;
import org.telegram.ui.fo;
import org.telegram.ui.l41;
public final class kk implements bh1, org.telegram.ui.Components.f5, LanguageDetector.StringCallback {
    public final boolean f17721a;
    public final NotificationCenter.NotificationCenterDelegate f17722b;
    public final Object f17723c;
    public final Object d;
    public final Object e;
    public final Object f17724f;

    public kk(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, fo foVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f17722b = sendMessagesHelper;
        this.f17721a = z10;
        this.f17723c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f17724f = foVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17722b;
        TLRPC.Document document = (TLRPC.Document) this.f17723c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f17724f;
        int i12 = ChatActivityEnterView.f22849n5;
        chatActivityEnterView.a(document, str, this.e, sendAnimationData, this.f17721a, z10, i10, i11);
    }

    @Override
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f17722b).lambda$sendCallback$43(this.f17721a, (MessageObject) this.f17723c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (fo) this.f17724f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f17722b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        hg.d1 d1Var = (hg.d1) this.f17724f;
        ((String[]) this.f17723c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f17721a && !l41.Y().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        d1Var.run();
    }

    public kk(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f17722b = chatActivityEnterView;
        this.f17723c = document;
        this.d = str;
        this.e = obj;
        this.f17724f = sendAnimationData;
        this.f17721a = z10;
    }

    public kk(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, hg.d1 d1Var) {
        this.f17722b = profileActivity;
        this.f17723c = strArr;
        this.d = zArr;
        this.e = str;
        this.f17721a = z10;
        this.f17724f = d1Var;
    }
}
