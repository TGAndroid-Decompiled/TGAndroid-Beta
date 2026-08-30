package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.n31;
import org.telegram.ui.xn;
public final class nj implements ag1, org.telegram.ui.Components.y4, LanguageDetector.StringCallback {
    public final boolean f17960a;
    public final NotificationCenter.NotificationCenterDelegate f17961b;
    public final Object f17962c;
    public final Object d;
    public final Object e;
    public final Object f17963f;

    public nj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z4) {
        this.f17961b = sendMessagesHelper;
        this.f17960a = z4;
        this.f17962c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f17963f = xnVar;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17961b;
        TLRPC.Document document = (TLRPC.Document) this.f17962c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f17963f;
        int i12 = ChatActivityEnterView.f22729j5;
        chatActivityEnterView.d(document, str, this.e, sendAnimationData, this.f17960a, z4, i10, i11);
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f17961b).lambda$sendCallback$40(this.f17960a, (MessageObject) this.f17962c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (xn) this.f17963f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z4;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f17961b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        kh.m2 m2Var = (kh.m2) this.f17963f;
        ((String[]) this.f17962c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f17960a && !n31.Y().contains(str)) || ((chat = profileActivity.B2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z4 = true;
        } else {
            z4 = false;
        }
        zArr[0] = z4;
        m2Var.run();
    }

    public nj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4) {
        this.f17961b = chatActivityEnterView;
        this.f17962c = document;
        this.d = str;
        this.e = obj;
        this.f17963f = sendAnimationData;
        this.f17960a = z4;
    }

    public nj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z4, kh.m2 m2Var) {
        this.f17961b = profileActivity;
        this.f17962c = strArr;
        this.d = zArr;
        this.e = str;
        this.f17960a = z4;
        this.f17963f = m2Var;
    }
}
