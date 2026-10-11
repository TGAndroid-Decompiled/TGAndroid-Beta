package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.e41;
import org.telegram.ui.ug1;
import org.telegram.ui.zn;
public final class hk implements ug1, org.telegram.ui.Components.f5, LanguageDetector.StringCallback {
    public final boolean f18127a;
    public final NotificationCenter.NotificationCenterDelegate f18128b;
    public final Object f18129c;
    public final Object d;
    public final Object f18130e;
    public final Object f18131f;

    public hk(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f18128b = sendMessagesHelper;
        this.f18127a = z10;
        this.f18129c = messageObject;
        this.d = keyboardButtonProto;
        this.f18130e = twoStepVerificationActivity;
        this.f18131f = znVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18128b;
        TLRPC.Document document = (TLRPC.Document) this.f18129c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f18131f;
        int i12 = ChatActivityEnterView.f23878n5;
        chatActivityEnterView.d(document, str, this.f18130e, sendAnimationData, this.f18127a, z10, i10, i11);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f18128b).lambda$sendCallback$43(this.f18127a, (MessageObject) this.f18129c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.f18130e, (zn) this.f18131f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f18128b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.f18130e;
        gg.d1 d1Var = (gg.d1) this.f18131f;
        ((String[]) this.f18129c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f18127a && !e41.Y().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        d1Var.run();
    }

    public hk(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f18128b = chatActivityEnterView;
        this.f18129c = document;
        this.d = str;
        this.f18130e = obj;
        this.f18131f = sendAnimationData;
        this.f18127a = z10;
    }

    public hk(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, gg.d1 d1Var) {
        this.f18128b = profileActivity;
        this.f18129c = strArr;
        this.d = zArr;
        this.f18130e = str;
        this.f18127a = z10;
        this.f18131f = d1Var;
    }
}
