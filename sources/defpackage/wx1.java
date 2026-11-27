package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wx1 implements TextWatcher {
    public final byte a;
    public boolean b;
    public final View c;

    public wx1(ChatActivityEnterView chatActivityEnterView) {
        this.a = (byte) 0;
        this.c = chatActivityEnterView;
        this.b = true;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        tx1 tx1Var;
        zu1 zu1Var;
        int j;
        byte b = this.a;
        View view = this.c;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) view;
                if (this.b && !chatActivityEnterView.G3 && chatActivityEnterView.H3 <= 0 && (tx1Var = chatActivityEnterView.F0) != null && tx1Var.hasFocus() && editable != null && !TextUtils.isEmpty(editable.toString().trim()) && (zu1Var = chatActivityEnterView.E3) != null && !zu1Var.y() && !chatActivityEnterView.k6 && chatActivityEnterView.l() != 0 && fc.b(chatActivityEnterView.R, chatActivityEnterView.l()) != null) {
                    hl.d3(new go1(this, (byte) 13), 250L);
                    return;
                }
                return;
            case 1:
                if6 if6Var = (if6) view;
                ImageView imageView = if6Var.f;
                if (this.b) {
                    if (imageView.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (if6Var.E) {
                            imageView.callOnClick();
                        }
                        hl.T3(imageView, true, 0.1f, true, true);
                        return;
                    } else if (imageView.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        hl.T3(imageView, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                pt8 pt8Var = (pt8) view;
                if (!this.b && editable.length() > 12) {
                    this.b = true;
                    editable.delete(12, editable.length());
                    hl.z3(pt8Var);
                    try {
                        pt8Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.b = false;
                    return;
                }
                return;
            default:
                rlb rlbVar = (rlb) view;
                qlb qlbVar = rlbVar.s0;
                if (this.b && rlbVar.y0 > 0 && rlbVar.z0 > 0 && !rlbVar.B0 && qlbVar.getLayout() != null) {
                    int height = qlbVar.getLayout().getHeight();
                    float f = hl.q.y / 3.0f;
                    float f2 = height;
                    if (f2 > f && (j = Utilities.j((int) ((f / f2) * rlbVar.getBaseFontSize()), rlbVar.z0, rlbVar.y0)) != rlbVar.getBaseFontSize()) {
                        rlbVar.setBaseFontSize(j);
                        Runnable runnable = rlbVar.A0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                rlbVar.t();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = false;
        switch (this.a) {
            case 0:
                if (charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) {
                    z = true;
                }
                this.b = z;
                return;
            case 1:
            case 2:
                return;
            default:
                if (i3 > 3) {
                    z = true;
                }
                this.b = z;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    public wx1(if6 if6Var, boolean z) {
        this.a = (byte) 1;
        this.c = if6Var;
        this.b = z;
    }

    public wx1(View view, byte b) {
        this.a = b;
        this.c = view;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }
}
