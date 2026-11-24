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
public final class n57 extends FrameLayout {
    public final int E;
    public boolean F;
    public float G;
    public final int a;
    public final boolean b;
    public final ylb c;
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

    public n57(Context context, int i, k47 k47Var, Runnable runnable, ylb ylbVar) {
        super(context);
        int i2;
        int i3;
        int i4;
        int i5;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.F = false;
        this.G = -1.0f;
        this.b = i;
        int i6 = k47Var.K1;
        this.a = i6;
        this.c = ylbVar;
        this.y = runnable;
        int currentTime = ConnectionsManager.getInstance(i6).getCurrentTime();
        TLRPC.Message message = k47Var.k;
        this.E = currentTime - message.date;
        this.n = k47.B0(message);
        this.r = k47Var.e1();
        TLRPC.Message message2 = k47Var.k;
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
        addView(imageView, qoe.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (i == 1) {
            if (oc7.r1(i6).l4.Y.f) {
                i5 = 2131232504;
            } else {
                i5 = 2131231797;
            }
        } else if (i == 2) {
            i5 = 2131231831;
        } else if (k47.Q4(k47Var.k)) {
            i5 = 2131232304;
        } else {
            i5 = 2131232362;
        }
        Drawable mutate = context.getDrawable(i5).mutate();
        anb.x(this, mutate, cmb.E8, ylbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new ta6(textView, gm.L(96.0f), gm.L(2.0f), ylbVar), 0, spannableStringBuilder.length() - 1, 17);
        int i7 = cmb.i5;
        anb.Y(textView, anb.K(0.7f, i7), ylbVar);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, qoe.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, qoe.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        anb.X(textView2, i7, ylbVar);
        textView2.setTextSize(1, 14.0f);
        TextView m = wi8.m(linearLayout, textView2, qoe.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f = m;
        int L = gm.L(20.0f);
        int i8 = cmb.c7;
        ShapeDrawable b0 = cmb.b0(L, cmb.p1(0.75f, cmb.v0(i8, ylbVar)));
        wmb K = anb.K(0.75f, i8);
        m.setBackground(b0);
        anb.j(m, b0, K, null, ylbVar);
        anb.X(m, i7, ylbVar);
        m.setTextSize(1, 11.0f);
        m.setPadding(gm.L(5.33f), gm.L(2.0f), gm.L(5.33f), gm.L(2.33f));
        linearLayout.addView(m, qoe.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(Context context, int i, long j, boolean z, Runnable runnable, Runnable runnable2, ylb ylbVar) {
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        p71 p71Var = new p71(1, ylbVar, context, false);
        p71Var.K(cmb.v0(cmb.g5, ylbVar));
        boolean H3 = oc7.r1(i).H3();
        LinearLayout i9 = hg9.i(context, 1);
        i9.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
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
        int L = gm.L(80.0f);
        int i10 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.v0(i10, ylbVar));
        wmb M = anb.M(i10);
        imageView.setBackground(K);
        anb.j(imageView, K, M, null, ylbVar);
        i9.addView((View) imageView, qoe.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        int i11 = cmb.i5;
        anb.X(textView, i11, ylbVar);
        textView.setTextSize(1, 20.0f);
        if (z) {
            i3 = 2131746780;
        } else {
            i3 = 2131746690;
        }
        textView.setText(jb6.M0(i3, null));
        i9.addView(textView, qoe.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        anb.X(textView2, i11, ylbVar);
        textView2.setTextSize(1, 14.0f);
        if (j > 0) {
            str = m9c.k(oc7.r1(i).W1(Long.valueOf(j)), true);
        } else {
            str = "";
        }
        String str2 = str;
        if (z) {
            if (H3) {
                i4 = 2131746776;
            } else {
                i4 = 2131746777;
            }
        } else if (H3) {
            i4 = 2131746686;
        } else {
            i4 = 2131746687;
        }
        hg9.q(null, null, i4, new Object[]{str2}, textView2);
        i9.addView(textView2, qoe.t(-1, -2, 1, 32, 9, 32, 19));
        b61 i12 = mlb.i(24, ylbVar, context, true);
        if (z) {
            i5 = 2131746782;
        } else {
            i5 = 2131746692;
        }
        i12.i(jb6.M0(i5, null), false, true);
        i9.addView(i12, qoe.r(-1, 48, 1));
        i12.setOnClickListener(new pn3(i12, z, i, p71Var, runnable2, context, ylbVar));
        if (!H3) {
            m57 m57Var = new m57(context, ylbVar);
            m57Var.setGravity(17);
            m57Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            anb.W(m57Var, cmb.y6, ylbVar);
            m57Var.l(" " + jb6.M0(2131746764, null) + " ", false);
            m57Var.setTextSize(14);
            i9.addView(m57Var, qoe.t(270, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(gm.o());
            textView3.setGravity(17);
            anb.X(textView3, i11, ylbVar);
            textView3.setTextSize(1, 20.0f);
            if (z) {
                i6 = 2131746779;
            } else {
                i6 = 2131746689;
            }
            textView3.setText(jb6.M0(i6, null));
            i9.addView(textView3, qoe.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            anb.X(textView4, i11, ylbVar);
            textView4.setTextSize(1, 14.0f);
            if (z) {
                i7 = 2131746775;
            } else {
                i7 = 2131746685;
            }
            hg9.q(null, null, i7, new Object[]{str2}, textView4);
            i9.addView(textView4, qoe.t(-1, -2, 1, 32, 9, 32, 19));
            cj8 cj8Var = new cj8(ylbVar, context, true);
            cj8Var.setOnClickListener(new xw2(z, p71Var, runnable));
            if (z) {
                i8 = 2131746781;
            } else {
                i8 = 2131746691;
            }
            cj8Var.c(jb6.M0(i8, null), false, false);
            i9.addView(cj8Var, qoe.t(-1, 48, 1, 0, 0, 0, 4));
        }
        p71Var.O = i9;
        p71Var.show();
    }

    public final void a() {
        boolean z = this.b;
        String str = "LOC_ERR";
        if (z) {
            this.d.setAlpha(1.0f);
            this.h.setAlpha(0.0f);
            this.f.setVisibility(8);
            TextView textView = this.e;
            if (oc7.r1(this.a).l4.Y.f) {
                long j = this.s * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i = calendar.get(6);
                    int i2 = calendar.get(1);
                    calendar.setTimeInMillis(j);
                    int i3 = calendar.get(6);
                    int i4 = calendar.get(1);
                    if (i3 == i && i2 == i4) {
                        str = jb6.a0(null, null, 2131746923, jb6.D0().o0().format(new Date(j)));
                    } else if (i3 + 1 == i && i2 == i4) {
                        str = jb6.a0(null, null, 2131746922, jb6.D0().o0().format(new Date(j)));
                    } else if (Math.abs(System.currentTimeMillis() - j) < 31536000000L) {
                        str = jb6.a0(null, null, 2131746924, jb6.D0().p0().format(new Date(j)), jb6.D0().o0().format(new Date(j)));
                    } else {
                        str = jb6.a0(null, null, 2131746924, jb6.D0().B0().format(new Date(j)), jb6.D0().o0().format(new Date(j)));
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            } else {
                str = jb6.L(this.w);
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
                    str = jb6.a0(null, null, 2131746932, jb6.D0().o0().format(new Date(j2)));
                } else if (i7 + 1 == i5 && i6 == i8) {
                    str = jb6.a0(null, null, 2131746931, jb6.D0().o0().format(new Date(j2)));
                } else if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                    str = jb6.a0(null, null, 2131746933, jb6.D0().p0().format(new Date(j2)), jb6.D0().o0().format(new Date(j2)));
                } else {
                    str = jb6.a0(null, null, 2131746933, jb6.D0().B0().format(new Date(j2)), jb6.D0().o0().format(new Date(j2)));
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
            textView2.setText(str);
        } else {
            setOnClickListener(null);
            this.d.setAlpha(0.0f);
            this.h.setAlpha(1.0f);
            this.f.setVisibility(0);
            TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
            tL_messages_getOutboxReadDate.peer = oc7.r1(this.a).i1(this.n);
            tL_messages_getOutboxReadDate.msg_id = this.r;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getOutboxReadDate, new r15(this, (byte) 10));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        y21 y21Var;
        super.onDetachedFromWindow();
        u31 u31Var = u31.x;
        if (u31Var != null && (y21Var = u31Var.e) != null && y21Var.getParent() != null && (u31Var.e.getParent().getParent() instanceof m21)) {
            u31Var.b();
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
                float max = Math.max(this.G, gm.L(144.0f));
                this.G = max;
                float max2 = Math.max(max, textView.getPaint().measureText(jb6.M0(2131746926, null)) + gm.L(48.0f));
                this.G = max2;
                float max3 = Math.max(max2, textView.getPaint().measureText(jb6.M0(2131746930, null) + this.f.getPaint().measureText(jb6.M0(2131746928, null))) + gm.L(64.0f));
                this.G = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(jb6.a0(null, null, 2131746927, jb6.D0().o0().format(new Date(currentTimeMillis)))) + ((float) gm.L(48.0f)));
                this.G = max4;
                int i3 = this.E;
                if (i3 > 86400) {
                    f = 48.0f;
                    max4 = Math.max(max4, textView.getPaint().measureText(jb6.a0(null, null, 2131746925, jb6.D0().o0().format(new Date(currentTimeMillis)))) + gm.L(48.0f));
                    this.G = max4;
                } else {
                    f = 48.0f;
                }
                if (i3 > 172800) {
                    float max5 = Math.max(max4, textView.getPaint().measureText(jb6.a0(null, null, 2131746929, jb6.D0().p0().format(new Date(currentTimeMillis)), jb6.D0().o0().format(new Date(currentTimeMillis)))) + gm.L(f));
                    this.G = max5;
                    this.G = Math.max(max5, textView.getPaint().measureText(jb6.a0(null, null, 2131746929, jb6.D0().B0().format(new Date(currentTimeMillis)), jb6.D0().o0().format(new Date(currentTimeMillis)))) + gm.L(f));
                }
            } else {
                this.G = textView.getPaint().measureText(textView.getText().toString()) + gm.L(48.0f);
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
