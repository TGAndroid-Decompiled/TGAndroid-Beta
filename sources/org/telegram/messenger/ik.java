package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.qf1;
import org.telegram.ui.un;
import org.telegram.ui.y21;
public final class ik implements qf1, org.telegram.ui.Components.e5, LanguageDetector.StringCallback {
    public final boolean f20371a;
    public final NotificationCenter.NotificationCenterDelegate f20372b;
    public final Object f20373c;
    public final Object d;
    public final Object e;
    public final Object f20374f;

    public ik(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, un unVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f20372b = sendMessagesHelper;
        this.f20371a = z10;
        this.f20373c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f20374f = unVar;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f20372b;
        TLRPC.Document document = (TLRPC.Document) this.f20373c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f20374f;
        int i12 = ChatActivityEnterView.f25843r5;
        chatActivityEnterView.a(document, str, this.e, sendAnimationData, this.f20371a, z10, i10, i11);
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f20372b).lambda$sendCallback$43(this.f20371a, (MessageObject) this.f20373c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (un) this.f20374f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f20372b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        ig.d1 d1Var = (ig.d1) this.f20374f;
        int i10 = ProfileActivity.R6;
        ((String[]) this.f20373c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f20371a && !y21.Z().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        d1Var.run();
    }

    public ik(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f20372b = chatActivityEnterView;
        this.f20373c = document;
        this.d = str;
        this.e = obj;
        this.f20374f = sendAnimationData;
        this.f20371a = z10;
    }

    public ik(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, ig.d1 d1Var) {
        this.f20372b = profileActivity;
        this.f20373c = strArr;
        this.d = zArr;
        this.e = str;
        this.f20371a = z10;
        this.f20374f = d1Var;
    }
}
