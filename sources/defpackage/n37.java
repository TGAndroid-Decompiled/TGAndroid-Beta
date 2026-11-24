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
public final class n37 extends FrameLayout {
    public final int E;
    public boolean F;
    public float G;
    public final int a;
    public final boolean b;
    public final wjb c;
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

    public n37(Context context, int i, k27 k27Var, Runnable runnable, wjb wjbVar) {
        super(context);
        int i2;
        int i3;
        int i4;
        int i5;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.F = false;
        this.G = -1.0f;
        this.b = i;
        int i6 = k27Var.K1;
        this.a = i6;
        this.c = wjbVar;
        this.y = runnable;
        int currentTime = ConnectionsManager.getInstance(i6).getCurrentTime();
        TLRPC.Message message = k27Var.k;
        this.E = currentTime - message.date;
        this.n = k27.B0(message);
        this.r = k27Var.e1();
        TLRPC.Message message2 = k27Var.k;
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
        addView(imageView, nme.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (i == 1) {
            if (na7.q1(i6).k4.Y.f) {
                i5 = 2131232492;
            } else {
                i5 = 2131231796;
            }
        } else if (i == 2) {
            i5 = 2131231830;
        } else if (k27.Q4(k27Var.k)) {
            i5 = 2131232303;
        } else {
            i5 = 2131232361;
        }
        Drawable mutate = context.getDrawable(i5).mutate();
        zkb.x(this, mutate, bkb.E8, wjbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new u86(textView, gl.L(96.0f), gl.L(2.0f), wjbVar), 0, spannableStringBuilder.length() - 1, 17);
        int i7 = bkb.i5;
        zkb.Y(textView, zkb.K(0.7f, i7), wjbVar);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, nme.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, nme.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        zkb.X(textView2, i7, wjbVar);
        textView2.setTextSize(1, 14.0f);
        TextView m = ug8.m(linearLayout, textView2, nme.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f = m;
        int L = gl.L(20.0f);
        int i8 = bkb.c7;
        ShapeDrawable b0 = bkb.b0(L, bkb.p1(0.75f, bkb.v0(i8, wjbVar)));
        vkb K = zkb.K(0.75f, i8);
        m.setBackground(b0);
        zkb.j(m, b0, K, null, wjbVar);
        zkb.X(m, i7, wjbVar);
        m.setTextSize(1, 11.0f);
        m.setPadding(gl.L(5.33f), gl.L(2.0f), gl.L(5.33f), gl.L(2.33f));
        linearLayout.addView(m, nme.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(Context context, int i, long j, boolean z, Runnable runnable, Runnable runnable2, wjb wjbVar) {
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        i61 i61Var = new i61(1, wjbVar, context, false);
        i61Var.L(bkb.v0(bkb.g5, wjbVar));
        boolean F3 = na7.q1(i).F3();
        LinearLayout j2 = de9.j(context, 1);
        j2.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
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
        int L = gl.L(80.0f);
        int i9 = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.v0(i9, wjbVar));
        vkb M = zkb.M(i9);
        imageView.setBackground(K);
        zkb.j(imageView, K, M, null, wjbVar);
        j2.addView((View) imageView, nme.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        int i10 = bkb.i5;
        zkb.X(textView, i10, wjbVar);
        textView.setTextSize(1, 20.0f);
        if (z) {
            i3 = 2131746854;
        } else {
            i3 = 2131746764;
        }
        textView.setText(k96.M0(i3, null));
        j2.addView(textView, nme.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        zkb.X(textView2, i10, wjbVar);
        textView2.setTextSize(1, 14.0f);
        if (j > 0) {
            str = l7c.k(na7.q1(i).V1(Long.valueOf(j)), true);
        } else {
            str = "";
        }
        String str2 = str;
        if (z) {
            if (F3) {
                i4 = 2131746850;
            } else {
                i4 = 2131746851;
            }
        } else if (F3) {
            i4 = 2131746760;
        } else {
            i4 = 2131746761;
        }
        de9.r(null, null, i4, new Object[]{str2}, textView2);
        j2.addView(textView2, nme.t(-1, -2, 1, 32, 9, 32, 19));
        u41 i11 = yjb.i(24, wjbVar, context, true);
        if (z) {
            i5 = 2131746856;
        } else {
            i5 = 2131746766;
        }
        i11.i(k96.M0(i5, null), false, true);
        j2.addView(i11, nme.r(-1, 48, 1));
        i11.setOnClickListener(new em3(i11, z, i, i61Var, runnable2, context, wjbVar));
        if (!F3) {
            m37 m37Var = new m37(context, wjbVar);
            m37Var.setGravity(17);
            m37Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            zkb.W(m37Var, bkb.y6, wjbVar);
            m37Var.l(" " + k96.M0(2131746838, null) + " ", false);
            m37Var.setTextSize(14);
            j2.addView(m37Var, nme.t(270, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(gl.o());
            textView3.setGravity(17);
            zkb.X(textView3, i10, wjbVar);
            textView3.setTextSize(1, 20.0f);
            if (z) {
                i6 = 2131746853;
            } else {
                i6 = 2131746763;
            }
            textView3.setText(k96.M0(i6, null));
            j2.addView(textView3, nme.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            zkb.X(textView4, i10, wjbVar);
            textView4.setTextSize(1, 14.0f);
            if (z) {
                i7 = 2131746849;
            } else {
                i7 = 2131746759;
            }
            de9.r(null, null, i7, new Object[]{str2}, textView4);
            j2.addView(textView4, nme.t(-1, -2, 1, 32, 9, 32, 19));
            ah8 ah8Var = new ah8(wjbVar, context, true);
            ah8Var.setOnClickListener(new nv2(z, i61Var, runnable));
            if (z) {
                i8 = 2131746855;
            } else {
                i8 = 2131746765;
            }
            ah8Var.c(k96.M0(i8, null), false, false);
            j2.addView(ah8Var, nme.t(-1, 48, 1, 0, 0, 0, 4));
        }
        i61Var.O = j2;
        i61Var.show();
    }

    public final void a() {
        boolean z = this.b;
        String str = "LOC_ERR";
        if (z) {
            this.d.setAlpha(1.0f);
            this.h.setAlpha(0.0f);
            this.f.setVisibility(8);
            TextView textView = this.e;
            if (na7.q1(this.a).k4.Y.f) {
                long j = this.s * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i = calendar.get(6);
                    int i2 = calendar.get(1);
                    calendar.setTimeInMillis(j);
                    int i3 = calendar.get(6);
                    int i4 = calendar.get(1);
                    if (i3 == i && i2 == i4) {
                        str = k96.a0(null, null, 2131746997, k96.D0().o0().format(new Date(j)));
                    } else if (i3 + 1 == i && i2 == i4) {
                        str = k96.a0(null, null, 2131746996, k96.D0().o0().format(new Date(j)));
                    } else if (Math.abs(System.currentTimeMillis() - j) < 31536000000L) {
                        str = k96.a0(null, null, 2131746998, k96.D0().p0().format(new Date(j)), k96.D0().o0().format(new Date(j)));
                    } else {
                        str = k96.a0(null, null, 2131746998, k96.D0().B0().format(new Date(j)), k96.D0().o0().format(new Date(j)));
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            } else {
                str = k96.L(this.w);
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
                    str = k96.a0(null, null, 2131747006, k96.D0().o0().format(new Date(j2)));
                } else if (i7 + 1 == i5 && i6 == i8) {
                    str = k96.a0(null, null, 2131747005, k96.D0().o0().format(new Date(j2)));
                } else if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                    str = k96.a0(null, null, 2131747007, k96.D0().p0().format(new Date(j2)), k96.D0().o0().format(new Date(j2)));
                } else {
                    str = k96.a0(null, null, 2131747007, k96.D0().B0().format(new Date(j2)), k96.D0().o0().format(new Date(j2)));
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            textView2.setText(str);
        } else {
            setOnClickListener(null);
            this.d.setAlpha(0.0f);
            this.h.setAlpha(1.0f);
            this.f.setVisibility(0);
            TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
            tL_messages_getOutboxReadDate.peer = na7.q1(this.a).h1(this.n);
            tL_messages_getOutboxReadDate.msg_id = this.r;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getOutboxReadDate, new n35(this, (byte) 9));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        q11 q11Var;
        super.onDetachedFromWindow();
        m21 m21Var = m21.w;
        if (m21Var != null && (q11Var = m21Var.e) != null && q11Var.getParent() != null && (m21Var.e.getParent().getParent() instanceof e11)) {
            m21Var.b();
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
                float max = Math.max(this.G, gl.L(144.0f));
                this.G = max;
                float max2 = Math.max(max, textView.getPaint().measureText(k96.M0(2131747000, null)) + gl.L(48.0f));
                this.G = max2;
                float max3 = Math.max(max2, textView.getPaint().measureText(k96.M0(2131747004, null) + this.f.getPaint().measureText(k96.M0(2131747002, null))) + gl.L(64.0f));
                this.G = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(k96.a0(null, null, 2131747001, k96.D0().o0().format(new Date(currentTimeMillis)))) + ((float) gl.L(48.0f)));
                this.G = max4;
                int i3 = this.E;
                if (i3 > 86400) {
                    f = 48.0f;
                    max4 = Math.max(max4, textView.getPaint().measureText(k96.a0(null, null, 2131746999, k96.D0().o0().format(new Date(currentTimeMillis)))) + gl.L(48.0f));
                    this.G = max4;
                } else {
                    f = 48.0f;
                }
                if (i3 > 172800) {
                    float max5 = Math.max(max4, textView.getPaint().measureText(k96.a0(null, null, 2131747003, k96.D0().p0().format(new Date(currentTimeMillis)), k96.D0().o0().format(new Date(currentTimeMillis)))) + gl.L(f));
                    this.G = max5;
                    this.G = Math.max(max5, textView.getPaint().measureText(k96.a0(null, null, 2131747003, k96.D0().B0().format(new Date(currentTimeMillis)), k96.D0().o0().format(new Date(currentTimeMillis)))) + gl.L(f));
                }
            } else {
                this.G = textView.getPaint().measureText(textView.getText().toString()) + gl.L(48.0f);
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
