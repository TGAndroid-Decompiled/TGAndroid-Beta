package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k5 extends FrameLayout {
    public final lka a;
    public final TextView b;
    public final bf0 c;
    public final ImageView d;
    public final pc0 e;
    public int f;

    public k5(Activity activity, boolean z) {
        super(activity);
        setMinimumWidth(gm.L(196.0f));
        pc0 pc0Var = new pc0((ylb) null);
        this.e = pc0Var;
        pc0Var.s(gm.L(12.0f));
        bf0 bf0Var = new bf0(activity);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(18.0f));
        addView(bf0Var, qoe.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        lka lkaVar = new lka(activity);
        this.a = lkaVar;
        lkaVar.setTextSize(15);
        lkaVar.setTypeface(gm.o());
        lkaVar.setEllipsizeByGradient(true);
        lkaVar.setMaxLines(1);
        lkaVar.setGravity(19);
        if (z) {
            addView(lkaVar, qoe.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
            anb.W(lkaVar, cmb.dh, null);
            lkaVar.l(jb6.M0(2131743070, null), false);
            TextView textView = new TextView(activity);
            this.b = textView;
            anb.X(textView, cmb.eh, null);
            wi8.w(textView, 1, 15.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setMaxWidth(gm.L(320.0f));
            textView.setGravity(51);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            addView(textView, qoe.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
            return;
        }
        addView(lkaVar, qoe.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
        anb.W(lkaVar, cmb.D8, null);
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        imageView.setImageResource(2131230862);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.G9, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, qoe.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b == null) {
            anb.W(this.a, cmb.F9, null);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TextView textView;
        int i3;
        float f;
        ImageView imageView = this.d;
        if (imageView == null && ((textView = this.b) == null || getLayoutParams().width == -2)) {
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                float L = gm.L(196.0f);
                if (imageView != null) {
                    i3 = 50;
                } else {
                    i3 = 0;
                }
                float L2 = gm.L(i3 + 69);
                lka lkaVar = this.a;
                float measureText = lkaVar.getTextPaint().measureText(lkaVar.getText().toString());
                if (textView != null) {
                    f = textView.getPaint().measureText(textView.getText().toString());
                } else {
                    f = 0.0f;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(L, Math.max(measureText, f) + L2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
                return;
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
    }

    public void setObject(TLObject tLObject) {
        String str;
        boolean z = tLObject instanceof TLRPC.User;
        bf0 bf0Var = this.c;
        TextView textView = this.b;
        pc0 pc0Var = this.e;
        if (z) {
            TLRPC.User user = (TLRPC.User) tLObject;
            pc0Var.q(user);
            textView.setText(bw2.m(0, user.first_name, user.last_name));
            bf0Var.f(user, pc0Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        pc0Var.p(chat);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
        bf0Var.f(chat, pc0Var);
    }
}
