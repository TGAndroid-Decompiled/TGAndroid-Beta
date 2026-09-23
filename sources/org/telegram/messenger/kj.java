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
import org.telegram.ui.x31;
import org.telegram.ui.xn;
public final class kj implements mg1, org.telegram.ui.Components.d5, LanguageDetector.StringCallback {
    public final boolean f16600a;
    public final NotificationCenter.NotificationCenterDelegate f16601b;
    public final Object f16602c;
    public final Object d;
    public final Object e;
    public final Object f16603f;

    public kj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f16601b = sendMessagesHelper;
        this.f16600a = z10;
        this.f16602c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f16603f = xnVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f16601b;
        TLRPC.Document document = (TLRPC.Document) this.f16602c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f16603f;
        int i12 = ChatActivityEnterView.f21701n5;
        chatActivityEnterView.d(document, str, this.e, sendAnimationData, this.f16600a, z10, i10, i11);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f16601b).lambda$sendCallback$40(this.f16600a, (MessageObject) this.f16602c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (xn) this.f16603f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f16601b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        gg.e1 e1Var = (gg.e1) this.f16603f;
        ((String[]) this.f16602c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f16600a && !x31.Y().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        e1Var.run();
    }

    public kj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f16601b = chatActivityEnterView;
        this.f16602c = document;
        this.d = str;
        this.e = obj;
        this.f16603f = sendAnimationData;
        this.f16600a = z10;
    }

    public kj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, gg.e1 e1Var) {
        this.f16601b = profileActivity;
        this.f16602c = strArr;
        this.d = zArr;
        this.e = str;
        this.f16600a = z10;
        this.f16603f = e1Var;
    }
}
