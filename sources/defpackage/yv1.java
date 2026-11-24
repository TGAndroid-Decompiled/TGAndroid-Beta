package defpackage;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class yv1 implements gj, zw5, b3c {
    public final Object a;
    public final boolean b;
    public final gk7 c;
    public final Object d;
    public final Object e;
    public final Object f;

    public yv1(mu1 mu1Var, k27 k27Var, z3a z3aVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, TwoStepVerificationActivity twoStepVerificationActivity, boolean z) {
        this.c = z3aVar;
        this.b = z;
        this.d = k27Var;
        this.a = keyboardButtonProto;
        this.e = twoStepVerificationActivity;
        this.f = mu1Var;
    }

    @Override
    public final void a(String str) {
        boolean z;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean[] zArr = (boolean[]) this.e;
        String str2 = (String) this.a;
        qt qtVar = (qt) this.f;
        RectF rectF = ProfileActivity.Z6;
        ((String[]) this.d)[0] = str;
        if (str != null && ((!str.equals(str2) || str.equals("und")) && ((this.b && !qa9.b0().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || hc2.t0(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z = true;
        } else {
            z = false;
        }
        zArr[0] = z;
        qtVar.run();
    }

    @Override
    public final void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((z3a) this.c).m0(this.b, (k27) this.d, (TL_keyboard.KeyboardButtonProto) this.a, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.e, (mu1) this.f);
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        String str = (String) this.a;
        g27 g27Var = (g27) this.f;
        int i3 = ChatActivityEnterView.r7;
        chatActivityEnterView.e(document, str, this.e, g27Var, this.b, z, i, i2);
    }

    public yv1(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, g27 g27Var, boolean z) {
        this.c = chatActivityEnterView;
        this.d = document;
        this.a = str;
        this.e = obj;
        this.f = g27Var;
        this.b = z;
    }

    public yv1(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z, qt qtVar) {
        this.c = profileActivity;
        this.d = strArr;
        this.e = zArr;
        this.a = str;
        this.b = z;
        this.f = qtVar;
    }
}
