package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.of1;
import org.telegram.ui.sn;
import org.telegram.ui.v21;
public final class fk implements of1, org.telegram.ui.Components.d5, LanguageDetector.StringCallback {
    public final boolean f18460a;
    public final NotificationCenter.NotificationCenterDelegate f18461b;
    public final Object f18462c;
    public final Object d;
    public final Object e;
    public final Object f18463f;

    public fk(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, sn snVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f18461b = sendMessagesHelper;
        this.f18460a = z10;
        this.f18462c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f18463f = snVar;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18461b;
        TLRPC.Document document = (TLRPC.Document) this.f18462c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f18463f;
        int i12 = ChatActivityEnterView.f24050r5;
        chatActivityEnterView.a(document, str, this.e, sendAnimationData, this.f18460a, z10, i10, i11);
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f18461b).lambda$sendCallback$43(this.f18460a, (MessageObject) this.f18462c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (sn) this.f18463f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f18461b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        hg.d1 d1Var = (hg.d1) this.f18463f;
        ((String[]) this.f18462c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f18460a && !v21.Y().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        d1Var.run();
    }

    public fk(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f18461b = chatActivityEnterView;
        this.f18462c = document;
        this.d = str;
        this.e = obj;
        this.f18463f = sendAnimationData;
        this.f18460a = z10;
    }

    public fk(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, hg.d1 d1Var) {
        this.f18461b = profileActivity;
        this.f18462c = strArr;
        this.d = zArr;
        this.e = str;
        this.f18460a = z10;
        this.f18463f = d1Var;
    }
}
