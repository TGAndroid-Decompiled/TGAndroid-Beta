package jg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.fz;
public final class f1 extends LinearLayout implements z5 {
    public ShapeDrawable f17070a;
    public final e6 f17071b;
    public final i9 f17072c;
    public final t8 d;
    public final TextView f17073e;
    public final TextView f17074f;

    public f1(Context context, e6 e6Var, boolean z10) {
        super(context);
        m6 M;
        this.d = new t8((e6) null);
        this.f17071b = e6Var;
        setOrientation(0);
        i9 i9Var = new i9(context);
        this.f17072c = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(i9Var, ja.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ja.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.f17073e = textView;
        textView.setTextSize(1, 15.0f);
        int i7 = j6.G6;
        q6.U(textView, i7, e6Var);
        linearLayout.addView(textView, ja.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f17074f = textView2;
        textView2.setTextSize(1, 13.0f);
        if (z10) {
            M = q6.K(0.5f, i7);
        } else {
            M = q6.M(j6.f29260z6);
        }
        q6.V(textView2, M, e6Var);
        linearLayout.addView(textView2, ja.o(-1, -2));
    }

    public final void a(int i7, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f17074f;
        TextView textView2 = this.f17073e;
        i9 i9Var = this.f17072c;
        if (i7 == 0) {
            ShapeDrawable d02 = j6.d0(org.telegram.messenger.g0.L(28.0f), j6.w0(j6.Fi, this.f17071b));
            this.f17070a = d02;
            fq fqVar = new fq(d02, getContext().getResources().getDrawable(2131231830).mutate());
            fqVar.f34676s = org.telegram.messenger.g0.L(-0.66f);
            fqVar.f34677w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            fqVar.f34672e = L;
            fqVar.f34673f = L2;
            i9Var.setImageDrawable(fqVar);
            textView2.setText(hd.a0(null, null, 2131749344, str));
            textView.setText(hd.M0(2131749345, null));
            return;
        }
        t8 t8Var = this.d;
        t8Var.q(chat);
        i9Var.f(chat, t8Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.a0(null, null, 2131749342, str + "@" + t3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        fz fzVar = new fz(8);
        fzVar.f47239f = j6.x0(null, j6.Ck, false);
        fzVar.f47240n = false;
        spannableStringBuilder.setSpan(fzVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(hd.M0(2131749343, null));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f17070a;
            if (shapeDrawable != null) {
                j6.C1(j6.w0(j6.Fi, this.f17071b), shapeDrawable);
                i9 i9Var = this.f17072c;
                if (i9Var != null) {
                    i9Var.invalidate();
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
