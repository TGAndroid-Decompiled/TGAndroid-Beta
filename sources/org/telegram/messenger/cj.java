package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b31;
import org.telegram.ui.nf1;
import org.telegram.ui.qn;
public final class cj implements nf1, org.telegram.ui.Components.x4, LanguageDetector.StringCallback {
    public final boolean f20019a;
    public final NotificationCenter.NotificationCenterDelegate f20020b;
    public final Object f20021c;
    public final Object d;
    public final Object f20022e;
    public final Object f20023f;

    public cj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, qn qnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f20020b = sendMessagesHelper;
        this.f20019a = z10;
        this.f20021c = messageObject;
        this.d = keyboardButtonProto;
        this.f20022e = twoStepVerificationActivity;
        this.f20023f = qnVar;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f20020b;
        TLRPC.Document document = (TLRPC.Document) this.f20021c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f20023f;
        int i11 = ChatActivityEnterView.f26074i5;
        chatActivityEnterView.a(document, str, this.f20022e, sendAnimationData, this.f20019a, z10, i9, i10);
    }

    @Override
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f20020b).lambda$sendCallback$40(this.f20019a, (MessageObject) this.f20021c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.f20022e, (qn) this.f20023f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f20020b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.f20022e;
        fh.u2 u2Var = (fh.u2) this.f20023f;
        ((String[]) this.f20021c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f20019a && !b31.X().contains(str)) || ((chat = profileActivity.A2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        u2Var.run();
    }

    public cj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f20020b = chatActivityEnterView;
        this.f20021c = document;
        this.d = str;
        this.f20022e = obj;
        this.f20023f = sendAnimationData;
        this.f20019a = z10;
    }

    public cj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, fh.u2 u2Var) {
        this.f20020b = profileActivity;
        this.f20021c = strArr;
        this.d = zArr;
        this.f20022e = str;
        this.f20019a = z10;
        this.f20023f = u2Var;
    }
}
