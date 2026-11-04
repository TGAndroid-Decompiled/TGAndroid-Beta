package kg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.cz;
public final class c1 extends LinearLayout implements z5 {
    public ShapeDrawable f16938a;
    public final e6 f16939b;
    public final k9 f16940c;
    public final u8 d;
    public final TextView f16941e;
    public final TextView f16942f;

    public c1(Context context, e6 e6Var, boolean z10) {
        super(context);
        n6 N;
        this.d = new u8((e6) null);
        this.f16939b = e6Var;
        setOrientation(0);
        k9 k9Var = new k9(context);
        this.f16940c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(k9Var, mf.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, mf.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.f16941e = textView;
        textView.setTextSize(1, 15.0f);
        int i3 = k6.G6;
        r6.V(textView, i3, e6Var);
        linearLayout.addView(textView, mf.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f16942f = textView2;
        textView2.setTextSize(1, 13.0f);
        if (z10) {
            N = r6.L(0.5f, i3);
        } else {
            N = r6.N(k6.f28290z6);
        }
        r6.W(textView2, N, e6Var);
        linearLayout.addView(textView2, mf.o(-1, -2));
    }

    public final void a(int i3, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f16942f;
        TextView textView2 = this.f16941e;
        k9 k9Var = this.f16940c;
        if (i3 == 0) {
            ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(28.0f), k6.w0(k6.Ci, this.f16939b));
            this.f16938a = d02;
            xp xpVar = new xp(d02, getContext().getResources().getDrawable(2131231830).mutate());
            xpVar.f40445s = org.telegram.messenger.g0.L(-0.66f);
            xpVar.f40446w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            xpVar.f40441e = L;
            xpVar.f40442f = L2;
            k9Var.setImageDrawable(xpVar);
            textView2.setText(bd.a0(null, null, 2131749352, str));
            textView.setText(bd.M0(2131749353, null));
            return;
        }
        u8 u8Var = this.d;
        u8Var.q(chat);
        k9Var.e(chat, u8Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.a0(null, null, 2131749350, str + "@" + t3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        cz czVar = new cz(8);
        czVar.f44492f = k6.x0(null, k6.zk, false);
        czVar.f44493n = false;
        spannableStringBuilder.setSpan(czVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(bd.M0(2131749351, null));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f16938a;
            if (shapeDrawable != null) {
                k6.C1(k6.w0(k6.Ci, this.f16939b), shapeDrawable);
                k9 k9Var = this.f16940c;
                if (k9Var != null) {
                    k9Var.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
