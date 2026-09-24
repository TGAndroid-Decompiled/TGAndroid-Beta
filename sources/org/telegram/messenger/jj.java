package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.mg1;
import org.telegram.ui.w31;
import org.telegram.ui.wn;
public final class jj implements mg1, org.telegram.ui.Components.d5, LanguageDetector.StringCallback {
    public final boolean f16745a;
    public final NotificationCenter.NotificationCenterDelegate f16746b;
    public final Object f16747c;
    public final Object d;
    public final Object e;
    public final Object f16748f;

    public jj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, wn wnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f16746b = sendMessagesHelper;
        this.f16745a = z10;
        this.f16747c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f16748f = wnVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f16746b;
        TLRPC.Document document = (TLRPC.Document) this.f16747c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f16748f;
        int i12 = ChatActivityEnterView.f21938n5;
        chatActivityEnterView.d(document, str, this.e, sendAnimationData, this.f16745a, z10, i10, i11);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f16746b).lambda$sendCallback$40(this.f16745a, (MessageObject) this.f16747c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (wn) this.f16748f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f16746b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        gg.e1 e1Var = (gg.e1) this.f16748f;
        ((String[]) this.f16747c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f16745a && !w31.Y().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        e1Var.run();
    }

    public jj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f16746b = chatActivityEnterView;
        this.f16747c = document;
        this.d = str;
        this.e = obj;
        this.f16748f = sendAnimationData;
        this.f16745a = z10;
    }

    public jj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, gg.e1 e1Var) {
        this.f16746b = profileActivity;
        this.f16747c = strArr;
        this.d = zArr;
        this.e = str;
        this.f16745a = z10;
        this.f16748f = e1Var;
    }
}
