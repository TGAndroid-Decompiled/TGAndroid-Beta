package defpackage;

import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xx1 implements TextWatcher {
    public boolean a;
    public boolean b;
    public String c;
    public boolean d;
    public boolean e;
    public final ChatActivityEnterView f;

    public xx1(ChatActivityEnterView chatActivityEnterView) {
        this.f = chatActivityEnterView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx1.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.d) {
            ChatActivityEnterView chatActivityEnterView = this.f;
            if (chatActivityEnterView.u3 && !chatActivityEnterView.r0()) {
                this.c = charSequence.toString();
            }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int currentPage;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (!this.d) {
            ChatActivityEnterView chatActivityEnterView = this.f;
            my1 my1Var = chatActivityEnterView.V0;
            if (my1Var == null) {
                currentPage = uc7.d1().getInt("selected_page", 0);
            } else {
                currentPage = my1Var.getCurrentPage();
            }
            if (currentPage != 0 && (chatActivityEnterView.y3 || chatActivityEnterView.z3)) {
                z = true;
            } else {
                z = false;
            }
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            if (i2 != 0 ? isEmpty : !isEmpty) {
                if (z) {
                    chatActivityEnterView.O1(false, true);
                }
            }
            if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
                if (chatActivityEnterView.F0.getLineCount() >= 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (chatActivityEnterView.U >= 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 != z4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.e = z5;
                if (!chatActivityEnterView.T && chatActivityEnterView.F0.getMeasuredWidth() > 0) {
                    chatActivityEnterView.h1(chatActivityEnterView.U, chatActivityEnterView.F0.getLineCount());
                }
                int lineCount = chatActivityEnterView.F0.getLineCount();
                chatActivityEnterView.U = lineCount;
                if (lineCount > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                chatActivityEnterView.d2(z6);
                if (chatActivityEnterView.U > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                chatActivityEnterView.k2(z7);
            } else {
                this.e = false;
            }
            if (chatActivityEnterView.H3 == 1) {
                return;
            }
            if (chatActivityEnterView.q3 && !chatActivityEnterView.D0 && !chatActivityEnterView.E0 && !chatActivityEnterView.G3 && !chatActivityEnterView.M2 && chatActivityEnterView.O2 == null && i3 > i2 && charSequence.length() > 0 && charSequence.length() == i + i3 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                this.b = true;
            }
            chatActivityEnterView.M2 = false;
            chatActivityEnterView.P(true);
            CharSequence m1 = hl.m1(charSequence.toString());
            if (chatActivityEnterView.O3 != null && !chatActivityEnterView.G3) {
                int i4 = i3 + 1;
                if (i2 > i4 || i3 - i2 > 2 || TextUtils.isEmpty(charSequence)) {
                    chatActivityEnterView.N3 = true;
                }
                xy1 xy1Var = chatActivityEnterView.O3;
                if (i2 <= i4 && i3 - i2 <= 2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                xy1Var.R0(charSequence, z2, false);
            }
            if (chatActivityEnterView.H3 != 2 && i3 - i2 > 1) {
                this.a = true;
            }
            if (chatActivityEnterView.O2 == null && !chatActivityEnterView.W2 && m1.length() != 0 && chatActivityEnterView.r3 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.G3) {
                chatActivityEnterView.r3 = System.currentTimeMillis();
                xy1 xy1Var2 = chatActivityEnterView.O3;
                if (xy1Var2 != null) {
                    xy1Var2.p1();
                }
            }
            chatActivityEnterView.K2();
        }
    }
}
