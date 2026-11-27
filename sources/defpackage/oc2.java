package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e;
public final class oc2 {
    public final b8 a;
    public final b8 b;
    public final b8 c;
    public final b8 d;
    public final b8 e;
    public final mc2 f;
    public final int g;
    public n8 h;
    public final nc2 i;
    public long j;
    public int k;
    public int l;
    public final FrameLayout m;
    public final TextView n;
    public boolean o;

    public oc2(Context context, int i, fj8 fj8Var, boolean z, final nc2 nc2Var, vnb vnbVar) {
        int i2;
        mc2 mc2Var;
        final byte b;
        Integer num;
        this.g = i;
        this.i = nc2Var;
        if (z) {
            i2 = 2131232580;
        } else {
            i2 = 0;
        }
        mc2 mc2Var2 = new mc2(context, i2, vnbVar, 0, (byte) 0);
        mc2Var2.V = new Path();
        this.f = mc2Var2;
        mc2Var2.setFitItems(true);
        if (fj8Var != null) {
            num = 1;
            mc2Var = mc2Var2;
            b = 1;
            b8 c = s7.c(false, false, mc2Var, 2131232062, ob6.M0(2131753749, null), false, vnbVar);
            this.a = c;
            c.setOnClickListener(new y60(fj8Var, (byte) 1));
        } else {
            mc2Var = mc2Var2;
            b = 1;
            num = 1;
        }
        b8 c2 = s7.c(false, false, mc2Var, 2131232408, ob6.M0(2131745003, null), false, vnbVar);
        this.b = c2;
        c2.setOnClickListener(new View.OnClickListener(this) {
            public final oc2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = r3;
                nc2 nc2Var2 = nc2Var;
                oc2 oc2Var = this.b;
                switch (b2) {
                    case 0:
                        oc2Var.a();
                        nc2Var2.p();
                        return;
                    case 1:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.l);
                        return;
                    case 2:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.k);
                        return;
                    case 3:
                        oc2Var.a();
                        nc2Var2.m();
                        return;
                    case 4:
                        oc2Var.a();
                        hl.c3(new go1(nc2Var2, (byte) 28));
                        return;
                    default:
                        nc2Var2.i();
                        oc2Var.a();
                        return;
                }
            }
        });
        b8 c3 = s7.c(false, false, mc2Var, 2131232262, ob6.M0(2131748065, null), false, vnbVar);
        this.d = c3;
        c3.setOnClickListener(new View.OnClickListener(this) {
            public final oc2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = b;
                nc2 nc2Var2 = nc2Var;
                oc2 oc2Var = this.b;
                switch (b2) {
                    case 0:
                        oc2Var.a();
                        nc2Var2.p();
                        return;
                    case 1:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.l);
                        return;
                    case 2:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.k);
                        return;
                    case 3:
                        oc2Var.a();
                        nc2Var2.m();
                        return;
                    case 4:
                        oc2Var.a();
                        hl.c3(new go1(nc2Var2, (byte) 28));
                        return;
                    default:
                        nc2Var2.i();
                        oc2Var.a();
                        return;
                }
            }
        });
        b8 c4 = s7.c(false, false, mc2Var, 2131232262, ob6.M0(2131748065, null), false, vnbVar);
        this.e = c4;
        c4.setOnClickListener(new View.OnClickListener(this) {
            public final oc2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = b;
                nc2 nc2Var2 = nc2Var;
                oc2 oc2Var = this.b;
                switch (b2) {
                    case 0:
                        oc2Var.a();
                        nc2Var2.p();
                        return;
                    case 1:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.l);
                        return;
                    case 2:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.k);
                        return;
                    case 3:
                        oc2Var.a();
                        nc2Var2.m();
                        return;
                    case 4:
                        oc2Var.a();
                        hl.c3(new go1(nc2Var2, (byte) 28));
                        return;
                    default:
                        nc2Var2.i();
                        oc2Var.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        s7.c(false, false, mc2Var, 2131232263, ob6.M0(2131748062, null), false, vnbVar).setOnClickListener(new lc2(this, context, vnbVar, i, nc2Var, (byte) 0));
        s7.c(false, false, mc2Var, 2131232111, ob6.M0(2131747644, null), false, vnbVar).setOnClickListener(new View.OnClickListener(this) {
            public final oc2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = b;
                nc2 nc2Var2 = nc2Var;
                oc2 oc2Var = this.b;
                switch (b2) {
                    case 0:
                        oc2Var.a();
                        nc2Var2.p();
                        return;
                    case 1:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.l);
                        return;
                    case 2:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.k);
                        return;
                    case 3:
                        oc2Var.a();
                        nc2Var2.m();
                        return;
                    case 4:
                        oc2Var.a();
                        hl.c3(new go1(nc2Var2, (byte) 28));
                        return;
                    default:
                        nc2Var2.i();
                        oc2Var.a();
                        return;
                }
            }
        });
        b8 c5 = s7.c(false, false, mc2Var, 0, "", false, vnbVar);
        this.c = c5;
        c5.setOnClickListener(new View.OnClickListener(this) {
            public final oc2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = b;
                nc2 nc2Var2 = nc2Var;
                oc2 oc2Var = this.b;
                switch (b2) {
                    case 0:
                        oc2Var.a();
                        nc2Var2.p();
                        return;
                    case 1:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.l);
                        return;
                    case 2:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.k);
                        return;
                    case 3:
                        oc2Var.a();
                        nc2Var2.m();
                        return;
                    case 4:
                        oc2Var.a();
                        hl.c3(new go1(nc2Var2, (byte) 28));
                        return;
                    default:
                        nc2Var2.i();
                        oc2Var.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        yob.h(aob.H8, vnbVar, frameLayout);
        mc2Var.a(frameLayout, tre.o(-1, 8));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setPadding(hl.L(13.0f), hl.L(8.0f), hl.L(13.0f), hl.L(8.0f));
        textView.setTextSize(b, 13.0f);
        yob.X(textView, aob.E8, vnbVar);
        frameLayout.setTag(2131296439, num2);
        textView.setTag(2131296439, num2);
        mc2Var.a(textView, tre.o(-2, -2));
        int i3 = aob.I5;
        hf0 Y = aob.Y(aob.v0(i3, vnbVar), 0, 6);
        uob M = yob.M(i3);
        textView.setBackground(Y);
        yob.j(textView, Y, null, M, vnbVar);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final oc2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = b;
                nc2 nc2Var2 = nc2Var;
                oc2 oc2Var = this.b;
                switch (b2) {
                    case 0:
                        oc2Var.a();
                        nc2Var2.p();
                        return;
                    case 1:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.l);
                        return;
                    case 2:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.k);
                        return;
                    case 3:
                        oc2Var.a();
                        nc2Var2.m();
                        return;
                    case 4:
                        oc2Var.a();
                        hl.c3(new go1(nc2Var2, (byte) 28));
                        return;
                    default:
                        nc2Var2.i();
                        oc2Var.a();
                        return;
                }
            }
        });
    }

    public static String b(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i / 86400;
        int i3 = i - (86400 * i2);
        int i4 = i3 / 3600;
        int i5 = (i3 - (i4 * 3600)) / 60;
        if (i2 != 0) {
            sb.append(i2);
            sb.append(ob6.M0(2131745420, null));
        }
        if (i4 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i4);
            sb.append(ob6.M0(2131745419, null));
        }
        if (i5 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i5);
            sb.append(ob6.M0(2131745418, null));
        }
        return ob6.a0("MuteForButton", null, 2131748063, sb.toString());
    }

    public static void c(b8 b8Var, int i) {
        int w0 = aob.w0(null, i, false);
        b8Var.c(i, i);
        b8Var.h(0.1f, i);
        if (b8Var.getTextView() != null && b8Var.getTextView().getCurrentTextColor() == w0) {
            return;
        }
        b8Var.d(w0, w0);
        b8Var.setSelectorColor(aob.p1(0.1f, w0));
    }

    public final void a() {
        n8 n8Var = this.h;
        if (n8Var != null) {
            n8Var.d(true);
            this.h.d(true);
        }
        this.i.dismiss();
        this.j = System.currentTimeMillis();
    }

    public final void d(e eVar, View view, float f, float f2, boolean z) {
        float measuredWidth;
        float measuredHeight;
        if (eVar.getFragmentView() != null) {
            mc2 mc2Var = this.f;
            n8 n8Var = new n8(mc2Var, -2, -2);
            this.h = n8Var;
            n8Var.e = true;
            n8Var.c = (short) 220;
            n8Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(2131755192);
            this.h.setFocusable(true);
            mc2Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != eVar.getFragmentView()) {
                if (view.getParent() == null) {
                    return;
                }
                f += view.getX();
                f2 += view.getY();
                view = (View) view.getParent();
            }
            if (z) {
                measuredWidth = f - hl.N(8.0f);
                measuredHeight = hl.N(16.0f);
            } else {
                measuredWidth = f - (mc2Var.getMeasuredWidth() / 2.0f);
                measuredHeight = mc2Var.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(eVar.getFragmentView(), 0, (int) measuredWidth, (int) (f2 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j, long j2, HashSet hashSet) {
        int i;
        int i2;
        int i3;
        if (System.currentTimeMillis() - this.j < 200) {
            hl.c3(new o30(this, j, j2, hashSet, (byte) 1));
            return;
        }
        int i4 = this.g;
        boolean p2 = uc7.s1(i4).p2(j, j2, null);
        b8 b8Var = this.c;
        b8 b8Var2 = this.b;
        if (p2) {
            b8Var.j(ob6.M0(2131743503, null), 2131232417, null);
            i = aob.x6;
            b8Var2.setVisibility(8);
        } else {
            b8Var.j(ob6.M0(2131748060, null), 2131232261, null);
            int i5 = aob.q7;
            b8Var2.setVisibility(0);
            if (uc7.s1(i4).q2(j, j2)) {
                b8Var2.j(ob6.M0(2131745005, null), 2131232407, null);
            } else {
                b8Var2.j(ob6.M0(2131745003, null), 2131232408, null);
            }
            i = i5;
        }
        if (this.o) {
            this.a.setVisibility(8);
        }
        if (!p2 && !this.o) {
            SharedPreferences sharedPreferences = uc7.s1(i4).X3;
            i3 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i2 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        } else {
            i2 = 0;
            i3 = 0;
        }
        b8 b8Var3 = this.d;
        if (i3 != 0) {
            this.l = i3;
            b8Var3.setVisibility(0);
            b8Var3.getImageView().setImageDrawable(rsb.a(i3));
            b8Var3.setText(b(i3));
        } else {
            b8Var3.setVisibility(8);
        }
        b8 b8Var4 = this.e;
        if (i2 != 0) {
            this.k = i2;
            b8Var4.setVisibility(0);
            b8Var4.getImageView().setImageDrawable(rsb.a(i2));
            b8Var4.setText(b(i2));
        } else {
            b8Var4.setVisibility(8);
        }
        c(b8Var, i);
        FrameLayout frameLayout = this.m;
        TextView textView = this.n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(hl.N2(ob6.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), aob.n6, 1, null, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
