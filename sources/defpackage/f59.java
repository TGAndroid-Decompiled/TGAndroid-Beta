package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class f59 extends c79 {
    public final j59 c;

    public f59(j59 j59Var) {
        this.c = j59Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.c.T1.size() + 3;
    }

    @Override
    public final int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        String str;
        int i2 = f89Var.f;
        View view = f89Var.a;
        j59 j59Var = this.c;
        if (i2 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) j59Var.T1.get(i - 3);
            e3a e3aVar = (e3a) view;
            e3aVar.setBoost(tL_myBoost);
            e3aVar.c(j59Var.S1.contains(tL_myBoost), false);
        } else if (i2 == 2) {
            mf5 mf5Var = (mf5) view;
            mf5Var.setTextSize(15.0f);
            mf5Var.setPadding(0, 0, 0, hl.L(2.0f));
            mf5Var.setText(ob6.M0(2131753288, null));
        } else if (i2 == 0) {
            i59 i59Var = (i59) view;
            j59Var.W1 = i59Var;
            TLRPC.Chat chat = j59Var.U1;
            p66 p66Var = i59Var.e;
            try {
                int b = on0.b();
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder S2 = hl.S2(ob6.G(b, "BoostingReassignBoostTextPluralWithLink", str, "%3$s"));
                SpannableStringBuilder N2 = hl.N2(ob6.M0(2131753313, "BoostingReassignBoostTextLink"), aob.Xc, 2, new ax0(j59Var, (byte) 4), null);
                int indexOf = TextUtils.indexOf(S2, "%3$s");
                S2.replace(indexOf, indexOf + 4, (CharSequence) N2);
                p66Var.setText(S2, TextView.BufferType.EDITABLE);
                p66Var.post(new oe7(i59Var, indexOf, (byte) 13));
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = viewGroup.getContext();
        j59 j59Var = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        view = new View(context);
                    } else {
                        view = new e3a(context, true, false, j59Var.J0, true);
                    }
                } else {
                    view = new mf5(context, 22);
                }
            } else {
                int i2 = aob.a7;
                view = new sca(context, aob.w0(null, i2, false), 0);
                yob.h(i2, null, view);
            }
        } else {
            i59 i59Var = new i59(context);
            i59Var.a(j59Var.S1, j59Var.U1);
            view = i59Var;
        }
        return qu6.h(view, view, -1, -2);
    }
}
