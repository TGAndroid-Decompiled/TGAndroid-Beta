package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.co;
import org.telegram.ui.h41;
import org.telegram.ui.ug1;
public final class kj implements ug1, org.telegram.ui.Components.d5, LanguageDetector.StringCallback {
    public final boolean f18220a;
    public final NotificationCenter.NotificationCenterDelegate f18221b;
    public final Object f18222c;
    public final Object d;
    public final Object f18223e;
    public final Object f18224f;

    public kj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, co coVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f18221b = sendMessagesHelper;
        this.f18220a = z10;
        this.f18222c = messageObject;
        this.d = keyboardButtonProto;
        this.f18223e = twoStepVerificationActivity;
        this.f18224f = coVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18221b;
        TLRPC.Document document = (TLRPC.Document) this.f18222c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f18224f;
        int i12 = ChatActivityEnterView.f23661m5;
        chatActivityEnterView.a(document, str, this.f18223e, sendAnimationData, this.f18220a, z10, i10, i11);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f18221b).lambda$sendCallback$40(this.f18220a, (MessageObject) this.f18222c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.f18223e, (co) this.f18224f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f18221b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.f18223e;
        hg.e1 e1Var = (hg.e1) this.f18224f;
        ((String[]) this.f18222c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f18220a && !h41.Y().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        e1Var.run();
    }

    public kj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f18221b = chatActivityEnterView;
        this.f18222c = document;
        this.d = str;
        this.f18223e = obj;
        this.f18224f = sendAnimationData;
        this.f18220a = z10;
    }

    public kj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, hg.e1 e1Var) {
        this.f18221b = profileActivity;
        this.f18222c = strArr;
        this.d = zArr;
        this.f18223e = str;
        this.f18220a = z10;
        this.f18224f = e1Var;
    }
}
