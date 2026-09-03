package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ig1;
import org.telegram.ui.t31;
import org.telegram.ui.xn;
public final class nj implements ig1, org.telegram.ui.Components.y4, LanguageDetector.StringCallback {
    public final boolean f19497a;
    public final NotificationCenter.NotificationCenterDelegate f19498b;
    public final Object f19499c;
    public final Object d;
    public final Object f19500e;
    public final Object f19501f;

    public nj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z4) {
        this.f19498b = sendMessagesHelper;
        this.f19497a = z4;
        this.f19499c = messageObject;
        this.d = keyboardButtonProto;
        this.f19500e = twoStepVerificationActivity;
        this.f19501f = xnVar;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f19498b;
        TLRPC.Document document = (TLRPC.Document) this.f19499c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f19501f;
        int i12 = ChatActivityEnterView.f24570j5;
        chatActivityEnterView.d(document, str, this.f19500e, sendAnimationData, this.f19497a, z4, i10, i11);
    }

    @Override
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f19498b).lambda$sendCallback$40(this.f19497a, (MessageObject) this.f19499c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.f19500e, (xn) this.f19501f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z4;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f19498b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.f19500e;
        lh.l2 l2Var = (lh.l2) this.f19501f;
        ((String[]) this.f19499c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f19497a && !t31.Y().contains(str)) || ((chat = profileActivity.B2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z4 = true;
        } else {
            z4 = false;
        }
        zArr[0] = z4;
        l2Var.run();
    }

    public nj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4) {
        this.f19498b = chatActivityEnterView;
        this.f19499c = document;
        this.d = str;
        this.f19500e = obj;
        this.f19501f = sendAnimationData;
        this.f19497a = z4;
    }

    public nj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z4, lh.l2 l2Var) {
        this.f19498b = profileActivity;
        this.f19499c = strArr;
        this.d = zArr;
        this.f19500e = str;
        this.f19497a = z4;
        this.f19501f = l2Var;
    }
}
