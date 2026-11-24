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
    public final jia a;
    public final TextView b;
    public final be0 c;
    public final ImageView d;
    public final pb0 e;
    public int f;

    public k5(Activity activity, boolean z) {
        super(activity);
        setMinimumWidth(gl.L(196.0f));
        pb0 pb0Var = new pb0((wjb) null);
        this.e = pb0Var;
        pb0Var.s(gl.L(12.0f));
        be0 be0Var = new be0(activity);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(18.0f));
        addView(be0Var, nme.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        jia jiaVar = new jia(activity);
        this.a = jiaVar;
        jiaVar.setTextSize(15);
        jiaVar.setTypeface(gl.o());
        jiaVar.setEllipsizeByGradient(true);
        jiaVar.setMaxLines(1);
        jiaVar.setGravity(19);
        if (z) {
            addView(jiaVar, nme.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
            zkb.W(jiaVar, bkb.dh, null);
            jiaVar.l(k96.M0(2131743144, null), false);
            TextView textView = new TextView(activity);
            this.b = textView;
            zkb.X(textView, bkb.eh, null);
            ug8.w(textView, 1, 15.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setMaxWidth(gl.L(320.0f));
            textView.setGravity(51);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            addView(textView, nme.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
            return;
        }
        addView(jiaVar, nme.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
        zkb.W(jiaVar, bkb.D8, null);
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        imageView.setImageResource(2131230862);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.G9, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, nme.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b == null) {
            zkb.W(this.a, bkb.F9, null);
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
                float L = gl.L(196.0f);
                if (imageView != null) {
                    i3 = 50;
                } else {
                    i3 = 0;
                }
                float L2 = gl.L(i3 + 69);
                jia jiaVar = this.a;
                float measureText = jiaVar.getTextPaint().measureText(jiaVar.getText().toString());
                if (textView != null) {
                    f = textView.getPaint().measureText(textView.getText().toString());
                } else {
                    f = 0.0f;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(L, Math.max(measureText, f) + L2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824));
                return;
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824));
    }

    public void setObject(TLObject tLObject) {
        String str;
        boolean z = tLObject instanceof TLRPC.User;
        be0 be0Var = this.c;
        TextView textView = this.b;
        pb0 pb0Var = this.e;
        if (z) {
            TLRPC.User user = (TLRPC.User) tLObject;
            pb0Var.q(user);
            textView.setText(qu2.m(0, user.first_name, user.last_name));
            be0Var.f(user, pb0Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        pb0Var.p(chat);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
        be0Var.f(chat, pb0Var);
    }
}
