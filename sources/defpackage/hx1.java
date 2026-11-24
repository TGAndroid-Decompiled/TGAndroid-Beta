package defpackage;

import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class hx1 implements TextWatcher {
    public boolean a;
    public boolean b;
    public String c;
    public boolean d;
    public boolean e;
    public final ChatActivityEnterView f;

    public hx1(ChatActivityEnterView chatActivityEnterView) {
        this.f = chatActivityEnterView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx1.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.d) {
            ChatActivityEnterView chatActivityEnterView = this.f;
            if (chatActivityEnterView.v3 && !chatActivityEnterView.o0()) {
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
            wx1 wx1Var = chatActivityEnterView.V0;
            if (wx1Var == null) {
                currentPage = na7.b1().getInt("selected_page", 0);
            } else {
                currentPage = wx1Var.getCurrentPage();
            }
            if (currentPage != 0 && (chatActivityEnterView.z3 || chatActivityEnterView.A3)) {
                z = true;
            } else {
                z = false;
            }
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            if (i2 != 0 ? isEmpty : !isEmpty) {
                if (z) {
                    chatActivityEnterView.E1(false, true);
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
                    chatActivityEnterView.c1(chatActivityEnterView.U, chatActivityEnterView.F0.getLineCount());
                }
                int lineCount = chatActivityEnterView.F0.getLineCount();
                chatActivityEnterView.U = lineCount;
                if (lineCount > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                chatActivityEnterView.S1(z6);
                if (chatActivityEnterView.U > 2 && charSequence != null && !TextUtils.isEmpty(charSequence.toString().trim())) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                chatActivityEnterView.Y1(z7);
            } else {
                this.e = false;
            }
            if (chatActivityEnterView.I3 == 1) {
                return;
            }
            if (chatActivityEnterView.r3 && !chatActivityEnterView.D0 && !chatActivityEnterView.E0 && !chatActivityEnterView.H3 && !chatActivityEnterView.N2 && chatActivityEnterView.P2 == null && i3 > i2 && charSequence.length() > 0 && charSequence.length() == i + i3 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                this.b = true;
            }
            chatActivityEnterView.N2 = false;
            chatActivityEnterView.N(true);
            CharSequence m1 = gl.m1(charSequence.toString());
            if (chatActivityEnterView.P3 != null && !chatActivityEnterView.H3) {
                int i4 = i3 + 1;
                if (i2 > i4 || i3 - i2 > 2 || TextUtils.isEmpty(charSequence)) {
                    chatActivityEnterView.O3 = true;
                }
                hy1 hy1Var = chatActivityEnterView.P3;
                if (i2 <= i4 && i3 - i2 <= 2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                hy1Var.C0(charSequence, z2, false);
            }
            if (chatActivityEnterView.I3 != 2 && i3 - i2 > 1) {
                this.a = true;
            }
            if (chatActivityEnterView.P2 == null && !chatActivityEnterView.X2 && m1.length() != 0 && chatActivityEnterView.s3 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.H3) {
                chatActivityEnterView.s3 = System.currentTimeMillis();
                hy1 hy1Var2 = chatActivityEnterView.P3;
                if (hy1Var2 != null) {
                    hy1Var2.W0();
                }
            }
            chatActivityEnterView.x2();
        }
    }
}
