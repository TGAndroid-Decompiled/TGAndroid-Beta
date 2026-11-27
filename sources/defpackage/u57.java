package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u57 extends FrameLayout {
    public final int E;
    public boolean F;
    public float G;
    public final int a;
    public final boolean b;
    public final vnb c;
    public final LinearLayout d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final long n;
    public final int r;
    public final int s;
    public final int w;
    public final int x;
    public final Runnable y;

    public u57(Context context, int i, r47 r47Var, Runnable runnable, vnb vnbVar) {
        super(context);
        int i2;
        int i3;
        int i4;
        int i5;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.F = false;
        this.G = -1.0f;
        this.b = i;
        int i6 = r47Var.K1;
        this.a = i6;
        this.c = vnbVar;
        this.y = runnable;
        int currentTime = ConnectionsManager.getInstance(i6).getCurrentTime();
        TLRPC.Message message = r47Var.k;
        this.E = currentTime - message.date;
        this.n = r47.B0(message);
        this.r = r47Var.e1();
        TLRPC.Message message2 = r47Var.k;
        if (message2 == null) {
            i2 = 0;
        } else {
            i2 = message2.date;
        }
        this.s = i2;
        if (message2 == null) {
            i3 = 0;
        } else {
            i3 = message2.edit_date;
        }
        this.w = i3;
        if (message2 != null && (messageFwdHeader = message2.fwd_from) != null) {
            i4 = messageFwdHeader.date;
        } else {
            i4 = 0;
        }
        this.x = i4;
        ImageView imageView = new ImageView(context);
        addView(imageView, tre.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (i == 1) {
            if (uc7.s1(i6).k4.f0.f) {
                i5 = 2131232503;
            } else {
                i5 = 2131231796;
            }
        } else if (i == 2) {
            i5 = 2131231830;
        } else if (r47.Q4(r47Var.k)) {
            i5 = 2131232303;
        } else {
            i5 = 2131232361;
        }
        Drawable mutate = context.getDrawable(i5).mutate();
        yob.x(this, mutate, aob.F8, vnbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new ya6(textView, hl.L(96.0f), hl.L(2.0f), vnbVar), 0, spannableStringBuilder.length() - 1, 17);
        int i7 = aob.j5;
        yob.Y(textView, yob.K(0.7f, i7), vnbVar);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, tre.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, tre.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        yob.X(textView2, i7, vnbVar);
        textView2.setTextSize(1, 14.0f);
        TextView m = ik8.m(linearLayout, textView2, tre.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f = m;
        int L = hl.L(20.0f);
        int i8 = aob.d7;
        ShapeDrawable b0 = aob.b0(L, aob.p1(0.75f, aob.v0(i8, vnbVar)));
        uob K = yob.K(0.75f, i8);
        m.setBackground(b0);
        yob.j(m, b0, K, null, vnbVar);
        yob.X(m, i7, vnbVar);
        m.setTextSize(1, 11.0f);
        m.setPadding(hl.L(5.33f), hl.L(2.0f), hl.L(5.33f), hl.L(2.33f));
        linearLayout.addView(m, tre.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(Context context, int i, long j, boolean z, Runnable runnable, Runnable runnable2, vnb vnbVar) {
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        q61 q61Var = new q61(1, vnbVar, context, false);
        q61Var.K(aob.v0(aob.h5, vnbVar));
        boolean M3 = uc7.s1(i).M3();
        LinearLayout j2 = uh9.j(context, 1);
        j2.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z) {
            i2 = 2131624077;
        } else {
            i2 = 2131624079;
        }
        imageView.f(i2, 70, 70, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = hl.L(80.0f);
        int i9 = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.v0(i9, vnbVar));
        uob M = yob.M(i9);
        imageView.setBackground(K);
        yob.j(imageView, K, M, null, vnbVar);
        j2.addView((View) imageView, tre.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        int i10 = aob.j5;
        yob.X(textView, i10, vnbVar);
        textView.setTextSize(1, 20.0f);
        if (z) {
            i3 = 2131746774;
        } else {
            i3 = 2131746684;
        }
        textView.setText(ob6.M0(i3, null));
        j2.addView(textView, tre.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        yob.X(textView2, i10, vnbVar);
        textView2.setTextSize(1, 14.0f);
        if (j > 0) {
            str = lbc.k(uc7.s1(i).X1(Long.valueOf(j)), true);
        } else {
            str = "";
        }
        String str2 = str;
        if (z) {
            if (M3) {
                i4 = 2131746770;
            } else {
                i4 = 2131746771;
            }
        } else if (M3) {
            i4 = 2131746680;
        } else {
            i4 = 2131746681;
        }
        uh9.r(null, null, i4, new Object[]{str2}, textView2);
        j2.addView(textView2, tre.t(-1, -2, 1, 32, 9, 32, 19));
        c51 i11 = xnb.i(24, vnbVar, context, true);
        if (z) {
            i5 = 2131746776;
        } else {
            i5 = 2131746686;
        }
        i11.i(ob6.M0(i5, null), false, true);
        j2.addView(i11, tre.r(-1, 48, 1));
        i11.setOnClickListener(new xm3(i11, z, i, q61Var, runnable2, context, vnbVar));
        if (!M3) {
            t57 t57Var = new t57(context, vnbVar);
            t57Var.setGravity(17);
            t57Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            yob.W(t57Var, aob.z6, vnbVar);
            t57Var.l(" " + ob6.M0(2131746758, null) + " ", false);
            t57Var.setTextSize(14);
            j2.addView(t57Var, tre.t(270, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(hl.o());
            textView3.setGravity(17);
            yob.X(textView3, i10, vnbVar);
            textView3.setTextSize(1, 20.0f);
            if (z) {
                i6 = 2131746773;
            } else {
                i6 = 2131746683;
            }
            textView3.setText(ob6.M0(i6, null));
            j2.addView(textView3, tre.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            yob.X(textView4, i10, vnbVar);
            textView4.setTextSize(1, 14.0f);
            if (z) {
                i7 = 2131746769;
            } else {
                i7 = 2131746679;
            }
            uh9.r(null, null, i7, new Object[]{str2}, textView4);
            j2.addView(textView4, tre.t(-1, -2, 1, 32, 9, 32, 19));
            ok8 ok8Var = new ok8(vnbVar, context, true);
            ok8Var.setOnClickListener(new hw2(z, q61Var, runnable));
            if (z) {
                i8 = 2131746775;
            } else {
                i8 = 2131746685;
            }
            ok8Var.c(ob6.M0(i8, null), false, false);
            j2.addView(ok8Var, tre.t(-1, 48, 1, 0, 0, 0, 4));
        }
        q61Var.O = j2;
        q61Var.show();
    }

    public final void a() {
        boolean z = this.b;
        String str = "LOC_ERR";
        if (z) {
            this.d.setAlpha(1.0f);
            this.h.setAlpha(0.0f);
            this.f.setVisibility(8);
            TextView textView = this.e;
            if (uc7.s1(this.a).k4.f0.f) {
                long j = this.s * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i = calendar.get(6);
                    int i2 = calendar.get(1);
                    calendar.setTimeInMillis(j);
                    int i3 = calendar.get(6);
                    int i4 = calendar.get(1);
                    if (i3 == i && i2 == i4) {
                        str = ob6.a0(null, null, 2131746917, ob6.D0().o0().format(new Date(j)));
                    } else if (i3 + 1 == i && i2 == i4) {
                        str = ob6.a0(null, null, 2131746916, ob6.D0().o0().format(new Date(j)));
                    } else if (Math.abs(System.currentTimeMillis() - j) < 31536000000L) {
                        str = ob6.a0(null, null, 2131746918, ob6.D0().p0().format(new Date(j)), ob6.D0().o0().format(new Date(j)));
                    } else {
                        str = ob6.a0(null, null, 2131746918, ob6.D0().B0().format(new Date(j)), ob6.D0().o0().format(new Date(j)));
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            } else {
                str = ob6.L(this.w);
            }
            textView.setText(str);
        } else if (z) {
            this.d.setAlpha(1.0f);
            this.h.setAlpha(0.0f);
            this.f.setVisibility(8);
            TextView textView2 = this.e;
            long j2 = this.x * 1000;
            try {
                Calendar calendar2 = Calendar.getInstance();
                int i5 = calendar2.get(6);
                int i6 = calendar2.get(1);
                calendar2.setTimeInMillis(j2);
                int i7 = calendar2.get(6);
                int i8 = calendar2.get(1);
                if (i7 == i5 && i6 == i8) {
                    str = ob6.a0(null, null, 2131746926, ob6.D0().o0().format(new Date(j2)));
                } else if (i7 + 1 == i5 && i6 == i8) {
                    str = ob6.a0(null, null, 2131746925, ob6.D0().o0().format(new Date(j2)));
                } else if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                    str = ob6.a0(null, null, 2131746927, ob6.D0().p0().format(new Date(j2)), ob6.D0().o0().format(new Date(j2)));
                } else {
                    str = ob6.a0(null, null, 2131746927, ob6.D0().B0().format(new Date(j2)), ob6.D0().o0().format(new Date(j2)));
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            textView2.setText(str);
        } else {
            setOnClickListener(null);
            this.d.setAlpha(0.0f);
            this.h.setAlpha(1.0f);
            this.f.setVisibility(0);
            TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
            tL_messages_getOutboxReadDate.peer = uc7.s1(this.a).j1(this.n);
            tL_messages_getOutboxReadDate.msg_id = this.r;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getOutboxReadDate, new w15(this, (byte) 10));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        z11 z11Var;
        super.onDetachedFromWindow();
        v21 v21Var = v21.x;
        if (v21Var != null && (z11Var = v21Var.e) != null && z11Var.getParent() != null && (v21Var.e.getParent().getParent() instanceof n11)) {
            v21Var.b();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (this.G < 0.0f) {
            this.G = 0.0f;
            boolean z = this.b;
            TextView textView = this.e;
            if (!z) {
                long currentTimeMillis = System.currentTimeMillis();
                float max = Math.max(this.G, hl.L(144.0f));
                this.G = max;
                float max2 = Math.max(max, textView.getPaint().measureText(ob6.M0(2131746920, null)) + hl.L(48.0f));
                this.G = max2;
                float max3 = Math.max(max2, textView.getPaint().measureText(ob6.M0(2131746924, null) + this.f.getPaint().measureText(ob6.M0(2131746922, null))) + hl.L(64.0f));
                this.G = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(ob6.a0(null, null, 2131746921, ob6.D0().o0().format(new Date(currentTimeMillis)))) + ((float) hl.L(48.0f)));
                this.G = max4;
                int i3 = this.E;
                if (i3 > 86400) {
                    f = 48.0f;
                    max4 = Math.max(max4, textView.getPaint().measureText(ob6.a0(null, null, 2131746919, ob6.D0().o0().format(new Date(currentTimeMillis)))) + hl.L(48.0f));
                    this.G = max4;
                } else {
                    f = 48.0f;
                }
                if (i3 > 172800) {
                    float max5 = Math.max(max4, textView.getPaint().measureText(ob6.a0(null, null, 2131746923, ob6.D0().p0().format(new Date(currentTimeMillis)), ob6.D0().o0().format(new Date(currentTimeMillis)))) + hl.L(f));
                    this.G = max5;
                    this.G = Math.max(max5, textView.getPaint().measureText(ob6.a0(null, null, 2131746923, ob6.D0().B0().format(new Date(currentTimeMillis)), ob6.D0().o0().format(new Date(currentTimeMillis)))) + hl.L(f));
                }
            } else {
                this.G = textView.getPaint().measureText(textView.getText().toString()) + hl.L(48.0f);
            }
        }
        int i4 = 1073741824;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = 1073741824;
        }
        float f2 = this.G;
        if (size >= f2 && mode != Integer.MIN_VALUE) {
            i4 = mode;
        } else {
            size = (int) f2;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i4), i2);
    }
}
