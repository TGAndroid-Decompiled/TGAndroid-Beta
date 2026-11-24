package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class tl7 extends fx0 implements gk7 {
    public final sl7 l1;
    public final ry8 m1;
    public p8c n1;

    public tl7(Context context, boolean z, p8c p8cVar) {
        super(context, false);
        int i;
        this.n1 = p8cVar;
        LinearLayout j = de9.j(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.m1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624189, 46, 46, null);
        imageView.d();
        int L = gl.L(72.0f);
        int i2 = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.w0(null, i2, false));
        vkb M = zkb.M(i2);
        imageView.setBackground(K);
        zkb.j(imageView, K, M, null, null);
        frameLayout.addView((View) imageView, nme.e(72, 72, 17));
        sl7 sl7Var = new sl7(context);
        this.l1 = sl7Var;
        frameLayout.addView(sl7Var, nme.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        sl7Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final tl7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                tl7 tl7Var = this.b;
                switch (b) {
                    case 0:
                        ry8 ry8Var = tl7Var.m1;
                        if (!ry8Var.b()) {
                            ry8Var.setProgress(0.0f);
                            ry8Var.d();
                            return;
                        }
                        return;
                    default:
                        p8c p8cVar2 = tl7Var.n1;
                        if (p8cVar2 != null) {
                            p8cVar2.a(Boolean.TRUE);
                            tl7Var.n1 = null;
                        }
                        tl7Var.dismiss();
                        return;
                }
            }
        });
        j.addView(frameLayout, nme.o(-1, 110));
        TextView textView = new TextView(context);
        int i3 = bkb.i5;
        zkb.X(textView, i3, null);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setText(k96.M0(2131747693, null));
        textView.setPadding(gl.L(30.0f), 0, gl.L(30.0f), 0);
        j.addView(textView, nme.o(-1, -2));
        TextView textView2 = new TextView(context);
        zkb.X(textView2, i3, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setText(k96.M0(2131747694, null));
        textView2.setPadding(gl.L(30.0f), gl.L(10.0f), gl.L(30.0f), gl.L(21.0f));
        j.addView(textView2, nme.o(-1, -2));
        j.addView(new a6(2131232230, context, k96.M0(2131747697, null)), nme.o(-1, -2));
        j.addView(new a6(2131232226, context, k96.M0(2131747696, null)), nme.o(-1, -2));
        j.addView(new a6(2131232112, context, k96.M0(2131747695, null)), nme.o(-1, -2));
        this.O = j;
        M(bkb.g5);
        TextView textView3 = new TextView(context);
        if (z) {
            i = 2131747691;
        } else {
            i = 2131747692;
        }
        textView3.setText(k96.M0(i, null));
        textView3.setGravity(17);
        textView3.setTypeface(gl.o());
        textView3.setTextSize(1, 14.0f);
        zkb.X(textView3, bkb.Ii, null);
        ff0 e = sjb.e(bkb.w0(null, i2, false), 24.0f);
        vkb M2 = zkb.M(i2);
        vkb e2 = zkb.e(i2);
        textView3.setBackground(e);
        zkb.j(textView3, e, M2, e2, null);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final tl7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                tl7 tl7Var = this.b;
                switch (b) {
                    case 0:
                        ry8 ry8Var = tl7Var.m1;
                        if (!ry8Var.b()) {
                            ry8Var.setProgress(0.0f);
                            ry8Var.d();
                            return;
                        }
                        return;
                    default:
                        p8c p8cVar2 = tl7Var.n1;
                        if (p8cVar2 != null) {
                            p8cVar2.a(Boolean.TRUE);
                            tl7Var.n1 = null;
                        }
                        tl7Var.dismiss();
                        return;
                }
            }
        });
        j.addView(textView3, nme.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        for (int i4 = 0; i4 < 4; i4++) {
            try {
                kk7.f(i4).b(this, 2);
            } catch (Exception unused) {
            }
        }
    }

    public static void D0() {
        long j = na7.c1().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j;
        long j2 = 259200000;
        if (j >= 259200000) {
            j2 = 604800000;
            if (j >= 604800000) {
                j2 = 2592000000L;
            }
        }
        na7.c1().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j2).apply();
    }

    public static boolean E0(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
            long j = na7.c1().getLong("askNotificationsAfter", -1L);
            if (j != -2) {
                if (j < 0 || System.currentTimeMillis() >= j) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = na7.q5;
            if ((intValue & 256) >= 0) {
                int i4 = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    i4 += ad7.Y(i5).L;
                }
                if (this.l1.a(i4)) {
                    ry8 ry8Var = this.m1;
                    if (!ry8Var.b()) {
                        ry8Var.setProgress(0.0f);
                        ry8Var.d();
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        p8c p8cVar = this.n1;
        if (p8cVar != null) {
            p8cVar.a(Boolean.FALSE);
            this.n1 = null;
            D0();
        }
        for (int i = 0; i < 4; i++) {
            try {
                kk7.f(i).n(this, 2);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
