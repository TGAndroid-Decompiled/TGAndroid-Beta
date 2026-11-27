package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class so7 extends nx0 implements fn7 {
    public final ro7 l1;
    public final e29 m1;
    public pcc n1;

    public so7(Context context, boolean z, pcc pccVar) {
        super(context, false);
        int i;
        this.n1 = pccVar;
        LinearLayout j = uh9.j(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.m1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624189, 46, 46, null);
        imageView.d();
        int L = hl.L(72.0f);
        int i2 = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.w0(null, i2, false));
        uob M = yob.M(i2);
        imageView.setBackground(K);
        yob.j(imageView, K, M, null, null);
        frameLayout.addView((View) imageView, tre.e(72, 72, 17));
        ro7 ro7Var = new ro7(context);
        this.l1 = ro7Var;
        frameLayout.addView(ro7Var, tre.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        ro7Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final so7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                so7 so7Var = this.b;
                switch (b) {
                    case 0:
                        e29 e29Var = so7Var.m1;
                        if (!e29Var.b()) {
                            e29Var.setProgress(0.0f);
                            e29Var.d();
                            return;
                        }
                        return;
                    default:
                        pcc pccVar2 = so7Var.n1;
                        if (pccVar2 != null) {
                            pccVar2.a(Boolean.TRUE);
                            so7Var.n1 = null;
                        }
                        so7Var.dismiss();
                        return;
                }
            }
        });
        j.addView(frameLayout, tre.o(-1, 110));
        TextView textView = new TextView(context);
        int i3 = aob.j5;
        yob.X(textView, i3, null);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setText(ob6.M0(2131747613, null));
        textView.setPadding(hl.L(30.0f), 0, hl.L(30.0f), 0);
        j.addView(textView, tre.o(-1, -2));
        TextView textView2 = new TextView(context);
        yob.X(textView2, i3, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setText(ob6.M0(2131747614, null));
        textView2.setPadding(hl.L(30.0f), hl.L(10.0f), hl.L(30.0f), hl.L(21.0f));
        j.addView(textView2, tre.o(-1, -2));
        j.addView(new b6(2131232230, context, ob6.M0(2131747617, null)), tre.o(-1, -2));
        j.addView(new b6(2131232226, context, ob6.M0(2131747616, null)), tre.o(-1, -2));
        j.addView(new b6(2131232112, context, ob6.M0(2131747615, null)), tre.o(-1, -2));
        this.O = j;
        L(aob.h5);
        TextView textView3 = new TextView(context);
        if (z) {
            i = 2131747611;
        } else {
            i = 2131747612;
        }
        textView3.setText(ob6.M0(i, null));
        textView3.setGravity(17);
        textView3.setTypeface(hl.o());
        textView3.setTextSize(1, 14.0f);
        yob.X(textView3, aob.Ji, null);
        hf0 e = rnb.e(aob.w0(null, i2, false), 24.0f);
        uob M2 = yob.M(i2);
        uob e2 = yob.e(i2);
        textView3.setBackground(e);
        yob.j(textView3, e, M2, e2, null);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final so7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                so7 so7Var = this.b;
                switch (b) {
                    case 0:
                        e29 e29Var = so7Var.m1;
                        if (!e29Var.b()) {
                            e29Var.setProgress(0.0f);
                            e29Var.d();
                            return;
                        }
                        return;
                    default:
                        pcc pccVar2 = so7Var.n1;
                        if (pccVar2 != null) {
                            pccVar2.a(Boolean.TRUE);
                            so7Var.n1 = null;
                        }
                        so7Var.dismiss();
                        return;
                }
            }
        });
        j.addView(textView3, tre.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        for (int i4 = 0; i4 < 4; i4++) {
            try {
                jn7.f(i4).b(this, 2);
            } catch (Exception unused) {
            }
        }
    }

    public static void E0() {
        long j = uc7.e1().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j;
        long j2 = 259200000;
        if (j >= 259200000) {
            j2 = 604800000;
            if (j >= 604800000) {
                j2 = 2592000000L;
            }
        }
        uc7.e1().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j2).apply();
    }

    public static boolean F0(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
            long j = uc7.e1().getLong("askNotificationsAfter", -1L);
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
            int i3 = uc7.r5;
            if ((intValue & 256) >= 0) {
                int i4 = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    i4 += jf7.Y(i5).L;
                }
                if (this.l1.a(i4)) {
                    e29 e29Var = this.m1;
                    if (!e29Var.b()) {
                        e29Var.setProgress(0.0f);
                        e29Var.d();
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        pcc pccVar = this.n1;
        if (pccVar != null) {
            pccVar.a(Boolean.FALSE);
            this.n1 = null;
            E0();
        }
        for (int i = 0; i < 4; i++) {
            try {
                jn7.f(i).n(this, 2);
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
