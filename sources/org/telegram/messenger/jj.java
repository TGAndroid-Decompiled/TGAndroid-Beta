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
    public final boolean f18292a;
    public final NotificationCenter.NotificationCenterDelegate f18293b;
    public final Object f18294c;
    public final Object d;
    public final Object f18295e;
    public final Object f18296f;

    public jj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, yn ynVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f18293b = sendMessagesHelper;
        this.f18292a = z10;
        this.f18294c = messageObject;
        this.d = keyboardButtonProto;
        this.f18295e = twoStepVerificationActivity;
        this.f18296f = ynVar;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18293b;
        TLRPC.Document document = (TLRPC.Document) this.f18294c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f18296f;
        int i12 = ChatActivityEnterView.f23847n5;
        chatActivityEnterView.d(document, str, this.f18295e, sendAnimationData, this.f18292a, z10, i10, i11);
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f18293b).lambda$sendCallback$40(this.f18292a, (MessageObject) this.f18294c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.f18295e, (yn) this.f18296f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f18293b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.f18295e;
        gg.e1 e1Var = (gg.e1) this.f18296f;
        ((String[]) this.f18294c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f18292a && !y31.X().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        e1Var.run();
    }

    public jj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f18293b = chatActivityEnterView;
        this.f18294c = document;
        this.d = str;
        this.f18295e = obj;
        this.f18296f = sendAnimationData;
        this.f18292a = z10;
    }

    public jj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, gg.e1 e1Var) {
        this.f18293b = profileActivity;
        this.f18294c = strArr;
        this.d = zArr;
        this.f18295e = str;
        this.f18292a = z10;
        this.f18296f = e1Var;
    }
}
