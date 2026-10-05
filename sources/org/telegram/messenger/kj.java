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
import org.telegram.ui.w31;
import org.telegram.ui.yn;
public final class kj implements mg1, org.telegram.ui.Components.d5, LanguageDetector.StringCallback {
    public final boolean f18399a;
    public final NotificationCenter.NotificationCenterDelegate f18400b;
    public final Object f18401c;
    public final Object d;
    public final Object f18402e;
    public final Object f18403f;

    public kj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, yn ynVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f18400b = sendMessagesHelper;
        this.f18399a = z10;
        this.f18401c = messageObject;
        this.d = keyboardButtonProto;
        this.f18402e = twoStepVerificationActivity;
        this.f18403f = ynVar;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18400b;
        TLRPC.Document document = (TLRPC.Document) this.f18401c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f18403f;
        int i12 = ChatActivityEnterView.f23854n5;
        chatActivityEnterView.d(document, str, this.f18402e, sendAnimationData, this.f18399a, z10, i10, i11);
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f18400b).lambda$sendCallback$40(this.f18399a, (MessageObject) this.f18401c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.f18402e, (yn) this.f18403f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f18400b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.f18402e;
        gg.e1 e1Var = (gg.e1) this.f18403f;
        ((String[]) this.f18401c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f18399a && !w31.X().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        e1Var.run();
    }

    public kj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f18400b = chatActivityEnterView;
        this.f18401c = document;
        this.d = str;
        this.f18402e = obj;
        this.f18403f = sendAnimationData;
        this.f18399a = z10;
    }

    public kj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, gg.e1 e1Var) {
        this.f18400b = profileActivity;
        this.f18401c = strArr;
        this.d = zArr;
        this.f18402e = str;
        this.f18399a = z10;
        this.f18403f = e1Var;
    }
}
