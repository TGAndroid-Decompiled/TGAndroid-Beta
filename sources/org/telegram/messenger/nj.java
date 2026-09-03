package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ig1;
import org.telegram.ui.t31;
import org.telegram.ui.zn;
public final class nj implements ig1, org.telegram.ui.Components.y4, LanguageDetector.StringCallback {
    public final boolean f17937a;
    public final NotificationCenter.NotificationCenterDelegate f17938b;
    public final Object f17939c;
    public final Object d;
    public final Object e;
    public final Object f17940f;

    public nj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z4) {
        this.f17938b = sendMessagesHelper;
        this.f17937a = z4;
        this.f17939c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f17940f = znVar;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17938b;
        TLRPC.Document document = (TLRPC.Document) this.f17939c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f17940f;
        int i12 = ChatActivityEnterView.f22702j5;
        chatActivityEnterView.d(document, str, this.e, sendAnimationData, this.f17937a, z4, i10, i11);
    }

    @Override
    public void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f17938b).lambda$sendCallback$40(this.f17937a, (MessageObject) this.f17939c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (zn) this.f17940f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z4;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f17938b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        kh.l2 l2Var = (kh.l2) this.f17940f;
        ((String[]) this.f17939c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f17937a && !t31.Y().contains(str)) || ((chat = profileActivity.B2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z4 = true;
        } else {
            z4 = false;
        }
        zArr[0] = z4;
        l2Var.run();
    }

    public nj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4) {
        this.f17938b = chatActivityEnterView;
        this.f17939c = document;
        this.d = str;
        this.e = obj;
        this.f17940f = sendAnimationData;
        this.f17937a = z4;
    }

    public nj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z4, kh.l2 l2Var) {
        this.f17938b = profileActivity;
        this.f17939c = strArr;
        this.d = zArr;
        this.e = str;
        this.f17937a = z4;
        this.f17940f = l2Var;
    }
}
