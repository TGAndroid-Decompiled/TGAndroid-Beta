package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a31;
import org.telegram.ui.sf1;
import org.telegram.ui.wn;
public final class jk implements sf1, org.telegram.ui.Components.e5, LanguageDetector.StringCallback {
    public final boolean f20462a;
    public final NotificationCenter.NotificationCenterDelegate f20463b;
    public final Object f20464c;
    public final Object d;
    public final Object e;
    public final Object f20465f;

    public jk(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, wn wnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f20463b = sendMessagesHelper;
        this.f20462a = z10;
        this.f20464c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f20465f = wnVar;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f20463b;
        TLRPC.Document document = (TLRPC.Document) this.f20464c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f20465f;
        int i12 = ChatActivityEnterView.f25845r5;
        chatActivityEnterView.a(document, str, this.e, sendAnimationData, this.f20462a, z10, i10, i11);
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f20463b).lambda$sendCallback$43(this.f20462a, (MessageObject) this.f20464c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (wn) this.f20465f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f20463b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        ig.d1 d1Var = (ig.d1) this.f20465f;
        int i10 = ProfileActivity.R6;
        ((String[]) this.f20464c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f20462a && !a31.Z().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        d1Var.run();
    }

    public jk(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f20463b = chatActivityEnterView;
        this.f20464c = document;
        this.d = str;
        this.e = obj;
        this.f20465f = sendAnimationData;
        this.f20462a = z10;
    }

    public jk(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, ig.d1 d1Var) {
        this.f20463b = profileActivity;
        this.f20464c = strArr;
        this.d = zArr;
        this.e = str;
        this.f20462a = z10;
        this.f20465f = d1Var;
    }
}
