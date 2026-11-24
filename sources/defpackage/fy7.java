package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
public final class fy7 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        gy7 gy7Var = (gy7) view;
        TL_account.Passkey passkey = (TL_account.Passkey) c6cVar.H;
        View.OnClickListener onClickListener = c6cVar.E;
        ylb ylbVar = gy7Var.d;
        FrameLayout frameLayout = gy7Var.e;
        bf0 bf0Var = gy7Var.f;
        gy7Var.w = passkey.id;
        long j = passkey.software_emoji_id;
        if (j != 0) {
            bf0Var.setAnimatedEmojiDrawable(vm.m(gy7Var.c, j, null, 3));
            frameLayout.setBackground(null);
            bf0Var.setColorFilter(null);
            gy7Var.a = false;
            bf0Var.setScaleX(1.0f);
            bf0Var.setScaleY(1.0f);
        } else {
            int L = gm.L(4.0f);
            int i = cmb.F6;
            anb.B(frameLayout, cmb.b0(L, cmb.p1(0.04f, cmb.v0(i, ylbVar))), anb.K(0.04f, i), ylbVar);
            gy7Var.a();
            bf0Var.setImageResource(2131232038);
            bf0Var.setScaleX(0.666f);
            bf0Var.setScaleY(0.666f);
            bf0Var.setAnimatedEmojiDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(passkey.name);
        TextView textView = gy7Var.h;
        if (isEmpty) {
            textView.setText(jb6.M0(2131747361, null));
        } else {
            textView.setText(passkey.name);
        }
        int i2 = passkey.last_usage_date;
        TextView textView2 = gy7Var.n;
        if (i2 != 0) {
            textView2.setText(jb6.a0(null, null, 2131747367, jb6.x(i2, false)));
        } else {
            textView2.setText(jb6.a0(null, null, 2131747380, jb6.x(passkey.date, false)));
        }
        gy7Var.r.setOnClickListener(onClickListener);
        gy7Var.s = z;
        gy7Var.setWillNotDraw(!z);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new gy7(i, ylbVar, context);
    }
}
