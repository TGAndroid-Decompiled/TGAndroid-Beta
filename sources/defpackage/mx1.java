package defpackage;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class mx1 implements gk, zy5, c5c {
    public final Object a;
    public final boolean b;
    public final jm7 c;
    public final Object d;
    public final Object e;
    public final Object f;

    public mx1(yv1 yv1Var, k47 k47Var, a6a a6aVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, TwoStepVerificationActivity twoStepVerificationActivity, boolean z) {
        this.c = a6aVar;
        this.b = z;
        this.d = k47Var;
        this.a = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f = yv1Var;
    }

    @Override
    public final void a(String str) {
        boolean z;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean[] zArr = (boolean[]) this.e;
        String str2 = (String) this.a;
        qu quVar = (qu) this.f;
        RectF rectF = ProfileActivity.e7;
        ((String[]) this.d)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.b && !qc9.c0().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || sd2.t0(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z = true;
        } else {
            z = false;
        }
        zArr[0] = z;
        quVar.run();
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((a6a) this.c).m0(this.b, (k47) this.d, (TL_keyboard.KeyboardButtonProto) this.a, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.e, (yv1) this.f);
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        String str = (String) this.a;
        g47 g47Var = (g47) this.f;
        int i3 = ChatActivityEnterView.z7;
        chatActivityEnterView.e(document, str, this.e, g47Var, this.b, z, i, i2);
    }

    public mx1(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, g47 g47Var, boolean z) {
        this.c = chatActivityEnterView;
        this.d = document;
        this.a = str;
        this.e = obj;
        this.f = g47Var;
        this.b = z;
    }

    public mx1(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z, qu quVar) {
        this.c = profileActivity;
        this.d = strArr;
        this.e = zArr;
        this.a = str;
        this.b = z;
        this.f = quVar;
    }
}
