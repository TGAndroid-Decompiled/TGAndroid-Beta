package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.mg1;
import org.telegram.ui.xn;
import org.telegram.ui.y31;
public final class jj implements mg1, org.telegram.ui.Components.d5, LanguageDetector.StringCallback {
    public final boolean f16757a;
    public final NotificationCenter.NotificationCenterDelegate f16758b;
    public final Object f16759c;
    public final Object d;
    public final Object e;
    public final Object f16760f;

    public jj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f16758b = sendMessagesHelper;
        this.f16757a = z10;
        this.f16759c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f16760f = xnVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f16758b;
        TLRPC.Document document = (TLRPC.Document) this.f16759c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f16760f;
        int i12 = ChatActivityEnterView.f21955n5;
        chatActivityEnterView.d(document, str, this.e, sendAnimationData, this.f16757a, z10, i10, i11);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f16758b).lambda$sendCallback$40(this.f16757a, (MessageObject) this.f16759c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (xn) this.f16760f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f16758b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        gg.e1 e1Var = (gg.e1) this.f16760f;
        ((String[]) this.f16759c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f16757a && !y31.Y().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        e1Var.run();
    }

    public jj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f16758b = chatActivityEnterView;
        this.f16759c = document;
        this.d = str;
        this.e = obj;
        this.f16760f = sendAnimationData;
        this.f16757a = z10;
    }

    public jj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, gg.e1 e1Var) {
        this.f16758b = profileActivity;
        this.f16759c = strArr;
        this.d = zArr;
        this.e = str;
        this.f16757a = z10;
        this.f16760f = e1Var;
    }
}
