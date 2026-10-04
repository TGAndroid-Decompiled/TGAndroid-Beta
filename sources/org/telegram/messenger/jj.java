package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.og1;
import org.telegram.ui.y31;
import org.telegram.ui.yn;
public final class jj implements og1, org.telegram.ui.Components.d5, LanguageDetector.StringCallback {
    public final boolean f18291a;
    public final NotificationCenter.NotificationCenterDelegate f18292b;
    public final Object f18293c;
    public final Object d;
    public final Object f18294e;
    public final Object f18295f;

    public jj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, yn ynVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f18292b = sendMessagesHelper;
        this.f18291a = z10;
        this.f18293c = messageObject;
        this.d = keyboardButtonProto;
        this.f18294e = twoStepVerificationActivity;
        this.f18295f = ynVar;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18292b;
        TLRPC.Document document = (TLRPC.Document) this.f18293c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f18295f;
        int i12 = ChatActivityEnterView.f23846n5;
        chatActivityEnterView.d(document, str, this.f18294e, sendAnimationData, this.f18291a, z10, i10, i11);
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f18292b).lambda$sendCallback$40(this.f18291a, (MessageObject) this.f18293c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.f18294e, (yn) this.f18295f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f18292b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.f18294e;
        gg.e1 e1Var = (gg.e1) this.f18295f;
        ((String[]) this.f18293c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f18291a && !y31.X().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        e1Var.run();
    }

    public jj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f18292b = chatActivityEnterView;
        this.f18293c = document;
        this.d = str;
        this.f18294e = obj;
        this.f18295f = sendAnimationData;
        this.f18291a = z10;
    }

    public jj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, gg.e1 e1Var) {
        this.f18292b = profileActivity;
        this.f18293c = strArr;
        this.d = zArr;
        this.f18294e = str;
        this.f18291a = z10;
        this.f18295f = e1Var;
    }
}
