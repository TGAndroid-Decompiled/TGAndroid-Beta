package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.hf1;
import org.telegram.ui.qn;
import org.telegram.ui.r21;
public final class dk implements hf1, org.telegram.ui.Components.e5, LanguageDetector.StringCallback {
    public final boolean f18217a;
    public final NotificationCenter.NotificationCenterDelegate f18218b;
    public final Object f18219c;
    public final Object d;
    public final Object e;
    public final Object f18220f;

    public dk(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, qn qnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f18218b = sendMessagesHelper;
        this.f18217a = z10;
        this.f18219c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f18220f = qnVar;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18218b;
        TLRPC.Document document = (TLRPC.Document) this.f18219c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f18220f;
        int i12 = ChatActivityEnterView.f23907n5;
        chatActivityEnterView.e(document, str, this.e, sendAnimationData, this.f18217a, z10, i10, i11);
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f18218b).lambda$sendCallback$43(this.f18217a, (MessageObject) this.f18219c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (qn) this.f18220f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f18218b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        hg.d1 d1Var = (hg.d1) this.f18220f;
        ((String[]) this.f18219c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f18217a && !r21.Y().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        d1Var.run();
    }

    public dk(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f18218b = chatActivityEnterView;
        this.f18219c = document;
        this.d = str;
        this.e = obj;
        this.f18220f = sendAnimationData;
        this.f18217a = z10;
    }

    public dk(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, hg.d1 d1Var) {
        this.f18218b = profileActivity;
        this.f18219c = strArr;
        this.d = zArr;
        this.e = str;
        this.f18217a = z10;
        this.f18220f = d1Var;
    }
}
