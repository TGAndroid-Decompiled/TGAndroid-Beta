package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
public final class cw7 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        dw7 dw7Var = (dw7) view;
        TL_account.Passkey passkey = (TL_account.Passkey) c4cVar.H;
        View.OnClickListener onClickListener = c4cVar.E;
        wjb wjbVar = dw7Var.d;
        FrameLayout frameLayout = dw7Var.e;
        be0 be0Var = dw7Var.f;
        dw7Var.w = passkey.id;
        long j = passkey.software_emoji_id;
        if (j != 0) {
            be0Var.setAnimatedEmojiDrawable(vl.m(dw7Var.c, j, null, 3));
            frameLayout.setBackground(null);
            be0Var.setColorFilter(null);
            dw7Var.a = false;
            be0Var.setScaleX(1.0f);
            be0Var.setScaleY(1.0f);
        } else {
            int L = gl.L(4.0f);
            int i = bkb.F6;
            zkb.B(frameLayout, bkb.b0(L, bkb.p1(0.04f, bkb.v0(i, wjbVar))), zkb.K(0.04f, i), wjbVar);
            dw7Var.a();
            be0Var.setImageResource(2131232037);
            be0Var.setScaleX(0.666f);
            be0Var.setScaleY(0.666f);
            be0Var.setAnimatedEmojiDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(passkey.name);
        TextView textView = dw7Var.h;
        if (isEmpty) {
            textView.setText(k96.M0(2131747435, null));
        } else {
            textView.setText(passkey.name);
        }
        int i2 = passkey.last_usage_date;
        TextView textView2 = dw7Var.n;
        if (i2 != 0) {
            textView2.setText(k96.a0(null, null, 2131747441, k96.x(i2, false)));
        } else {
            textView2.setText(k96.a0(null, null, 2131747454, k96.x(passkey.date, false)));
        }
        dw7Var.r.setOnClickListener(onClickListener);
        dw7Var.s = z;
        dw7Var.setWillNotDraw(!z);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new dw7(i, wjbVar, context);
    }
}
