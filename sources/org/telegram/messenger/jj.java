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
import org.telegram.ui.pf1;
import org.telegram.ui.tn;
public final class jj implements pf1, org.telegram.ui.Components.b5, LanguageDetector.StringCallback {
    public final boolean f20705a;
    public final NotificationCenter.NotificationCenterDelegate f20706b;
    public final Object f20707c;
    public final Object d;
    public final Object f20708e;
    public final Object f20709f;

    public jj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, tn tnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f20706b = sendMessagesHelper;
        this.f20705a = z10;
        this.f20707c = messageObject;
        this.d = keyboardButtonProto;
        this.f20708e = twoStepVerificationActivity;
        this.f20709f = tnVar;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f20706b;
        TLRPC.Document document = (TLRPC.Document) this.f20707c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f20709f;
        int i12 = ChatActivityEnterView.f26085i5;
        chatActivityEnterView.a(document, str, this.f20708e, sendAnimationData, this.f20705a, z10, i10, i11);
    }

    @Override
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f20706b).lambda$sendCallback$40(this.f20705a, (MessageObject) this.f20707c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.f20708e, (tn) this.f20709f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f20706b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.f20708e;
        ih.m2 m2Var = (ih.m2) this.f20709f;
        ((String[]) this.f20707c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f20705a && !b31.Y().contains(str)) || ((chat = profileActivity.A2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        m2Var.run();
    }

    public jj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f20706b = chatActivityEnterView;
        this.f20707c = document;
        this.d = str;
        this.f20708e = obj;
        this.f20709f = sendAnimationData;
        this.f20705a = z10;
    }

    public jj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, ih.m2 m2Var) {
        this.f20706b = profileActivity;
        this.f20707c = strArr;
        this.d = zArr;
        this.f20708e = str;
        this.f20705a = z10;
        this.f20709f = m2Var;
    }
}
