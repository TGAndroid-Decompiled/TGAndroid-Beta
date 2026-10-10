package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.f41;
import org.telegram.ui.vg1;
import org.telegram.ui.zn;
public final class hk implements vg1, org.telegram.ui.Components.f5, LanguageDetector.StringCallback {
    public final boolean f18090a;
    public final NotificationCenter.NotificationCenterDelegate f18091b;
    public final Object f18092c;
    public final Object d;
    public final Object f18093e;
    public final Object f18094f;

    public hk(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f18091b = sendMessagesHelper;
        this.f18090a = z10;
        this.f18092c = messageObject;
        this.d = keyboardButtonProto;
        this.f18093e = twoStepVerificationActivity;
        this.f18094f = znVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18091b;
        TLRPC.Document document = (TLRPC.Document) this.f18092c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f18094f;
        int i12 = ChatActivityEnterView.f23854n5;
        chatActivityEnterView.d(document, str, this.f18093e, sendAnimationData, this.f18090a, z10, i10, i11);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f18091b).lambda$sendCallback$43(this.f18090a, (MessageObject) this.f18092c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.f18093e, (zn) this.f18094f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f18091b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.f18093e;
        gg.d1 d1Var = (gg.d1) this.f18094f;
        ((String[]) this.f18092c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f18090a && !f41.Y().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        d1Var.run();
    }

    public hk(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f18091b = chatActivityEnterView;
        this.f18092c = document;
        this.d = str;
        this.f18093e = obj;
        this.f18094f = sendAnimationData;
        this.f18090a = z10;
    }

    public hk(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, gg.d1 d1Var) {
        this.f18091b = profileActivity;
        this.f18092c = strArr;
        this.d = zArr;
        this.f18093e = str;
        this.f18090a = z10;
        this.f18094f = d1Var;
    }
}
