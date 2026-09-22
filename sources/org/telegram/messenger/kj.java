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
public final class kj implements vg1, org.telegram.ui.Components.c5, LanguageDetector.StringCallback {
    public final boolean f16847a;
    public final NotificationCenter.NotificationCenterDelegate f16848b;
    public final Object f16849c;
    public final Object d;
    public final Object e;
    public final Object f16850f;

    public kj(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f16848b = sendMessagesHelper;
        this.f16847a = z10;
        this.f16849c = messageObject;
        this.d = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f16850f = znVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f16848b;
        TLRPC.Document document = (TLRPC.Document) this.f16849c;
        String str = (String) this.d;
        MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f16850f;
        int i12 = ChatActivityEnterView.f21967n5;
        chatActivityEnterView.d(document, str, this.e, sendAnimationData, this.f16847a, z10, i10, i11);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((SendMessagesHelper) this.f16848b).lambda$sendCallback$40(this.f16847a, (MessageObject) this.f16849c, (TL_keyboard.KeyboardButtonProto) this.d, (TwoStepVerificationActivity) this.e, (zn) this.f16850f, tL_inputCheckPasswordSRP);
    }

    @Override
    public void run(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f16848b;
        boolean[] zArr = (boolean[]) this.d;
        String str2 = (String) this.e;
        gg.e1 e1Var = (gg.e1) this.f16850f;
        ((String[]) this.f16849c)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.f16847a && !f41.Y().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        e1Var.run();
    }

    public kj(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10) {
        this.f16848b = chatActivityEnterView;
        this.f16849c = document;
        this.d = str;
        this.e = obj;
        this.f16850f = sendAnimationData;
        this.f16847a = z10;
    }

    public kj(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, gg.e1 e1Var) {
        this.f16848b = profileActivity;
        this.f16849c = strArr;
        this.d = zArr;
        this.e = str;
        this.f16847a = z10;
        this.f16850f = e1Var;
    }
}
