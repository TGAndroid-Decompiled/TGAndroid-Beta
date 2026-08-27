package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a31;
import org.telegram.ui.mf1;
import org.telegram.ui.rn;

public final class gj implements mf1, org.telegram.ui.Components.x4, LanguageDetector.StringCallback {

    public final boolean f20410a;

    public final NotificationCenter.NotificationCenterDelegate f20411b;

    public final Object f20412c;
    public final Object d;

    public final Object f20413e;

    public final Object f20414f;

    public gj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, rn rnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f20411b = sendMessagesHelper;
        this.f20410a = z10;
        this.f20412c = messageObject;
        this.d = keyboardButtonProto;
        this.f20413e = twoStepVerificationActivity;
        this.f20414f = rnVar;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f20411b;
        TLRPC.Document document = (TLRPC.Document) this.f20412c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f20414f;
        int i12 = ChatActivityEnterView.f26070i5;
        chatActivityEnterView.e(document, str, this.f20413e, sendAnimationData, this.f20410a, z10, i10, i11);
    }

    @Override
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f20411b).lambda$sendCallback$40(this.f20410a, (MessageObject) this.f20412c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.f20413e, (rn) this.f20414f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f20411b;
        String[] strArr = (String[]) this.f20412c;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.f20413e;
        gh.p2 p2Var = (gh.p2) this.f20414f;
        strArr[0] = str;
        zArr[0] = str != null && (!str.equals(str2) || str.equals("und")) && ((this.f20410a && !a31.Y().contains(str)) || ((chat = profileActivity.A2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str)))));
        p2Var.run();
    }

    public gj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f20411b = chatActivityEnterView;
        this.f20412c = document;
        this.d = str;
        this.f20413e = obj;
        this.f20414f = sendAnimationData;
        this.f20410a = z10;
    }

    public gj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, gh.p2 p2Var) {
        this.f20411b = profileActivity;
        this.f20412c = strArr;
        this.d = zArr;
        this.f20413e = str;
        this.f20410a = z10;
        this.f20414f = p2Var;
    }
}
