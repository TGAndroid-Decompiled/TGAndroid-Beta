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
    public final boolean f18086a;
    public final NotificationCenter.NotificationCenterDelegate f18087b;
    public final Object f18088c;
    public final Object d;
    public final Object f18089e;
    public final Object f18090f;

    public hk(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f18087b = sendMessagesHelper;
        this.f18086a = z10;
        this.f18088c = messageObject;
        this.d = keyboardButtonProto;
        this.f18089e = twoStepVerificationActivity;
        this.f18090f = znVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18087b;
        TLRPC.Document document = (TLRPC.Document) this.f18088c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f18090f;
        int i12 = ChatActivityEnterView.f23850n5;
        chatActivityEnterView.d(document, str, this.f18089e, sendAnimationData, this.f18086a, z10, i10, i11);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f18087b).lambda$sendCallback$43(this.f18086a, (MessageObject) this.f18088c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.f18089e, (zn) this.f18090f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f18087b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.f18089e;
        gg.d1 d1Var = (gg.d1) this.f18090f;
        ((String[]) this.f18088c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f18086a && !f41.Y().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        d1Var.run();
    }

    public hk(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f18087b = chatActivityEnterView;
        this.f18088c = document;
        this.d = str;
        this.f18089e = obj;
        this.f18090f = sendAnimationData;
        this.f18086a = z10;
    }

    public hk(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, gg.d1 d1Var) {
        this.f18087b = profileActivity;
        this.f18088c = strArr;
        this.d = zArr;
        this.f18089e = str;
        this.f18086a = z10;
        this.f18090f = d1Var;
    }
}
