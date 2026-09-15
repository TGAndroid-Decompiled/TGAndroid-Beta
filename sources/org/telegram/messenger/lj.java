package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bo;
import org.telegram.ui.e41;
import org.telegram.ui.tg1;
public final class lj implements tg1, org.telegram.ui.Components.b5, LanguageDetector.StringCallback {
    public final boolean f16699a;
    public final NotificationCenter.NotificationCenterDelegate f16700b;
    public final Object f16701c;
    public final Object d;
    public final Object e;
    public final Object f16702f;

    public lj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, bo boVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f16700b = sendMessagesHelper;
        this.f16699a = z10;
        this.f16701c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f16702f = boVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f16700b;
        TLRPC.Document document = (TLRPC.Document) this.f16701c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f16702f;
        int i12 = ChatActivityEnterView.f21731m5;
        chatActivityEnterView.d(document, str, this.e, sendAnimationData, this.f16699a, z10, i10, i11);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f16700b).lambda$sendCallback$40(this.f16699a, (MessageObject) this.f16701c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (bo) this.f16702f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f16700b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        gg.e1 e1Var = (gg.e1) this.f16702f;
        ((String[]) this.f16701c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f16699a && !e41.Y().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        e1Var.run();
    }

    public lj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f16700b = chatActivityEnterView;
        this.f16701c = document;
        this.d = str;
        this.e = obj;
        this.f16702f = sendAnimationData;
        this.f16699a = z10;
    }

    public lj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, gg.e1 e1Var) {
        this.f16700b = profileActivity;
        this.f16701c = strArr;
        this.d = zArr;
        this.e = str;
        this.f16699a = z10;
        this.f16702f = e1Var;
    }
}
