package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.ActionBar.d;
public final class yb2 {
    public final a8 a;
    public final a8 b;
    public final a8 c;
    public final a8 d;
    public final a8 e;
    public final wb2 f;
    public final int g;
    public m8 h;
    public final xb2 i;
    public long j;
    public int k;
    public int l;
    public final FrameLayout m;
    public final TextView n;
    public boolean o;

    public yb2(Context context, int i, rf8 rf8Var, boolean z, final xb2 xb2Var, wjb wjbVar) {
        int i2;
        wb2 wb2Var;
        final byte b;
        Integer num;
        this.g = i;
        this.i = xb2Var;
        if (z) {
            i2 = 2131232569;
        } else {
            i2 = 0;
        }
        wb2 wb2Var2 = new wb2(context, i2, wjbVar, 0, (byte) 0);
        wb2Var2.V = new Path();
        this.f = wb2Var2;
        wb2Var2.setFitItems(true);
        if (rf8Var != null) {
            num = 1;
            wb2Var = wb2Var2;
            b = 1;
            a8 c = r7.c(false, false, wb2Var, 2131232062, k96.M0(2131753753, null), false, wjbVar);
            this.a = c;
            c.setOnClickListener(new w60(rf8Var, (byte) 1));
        } else {
            wb2Var = wb2Var2;
            b = 1;
            num = 1;
        }
        a8 c2 = r7.c(false, false, wb2Var, 2131232408, k96.M0(2131745083, null), false, wjbVar);
        this.b = c2;
        c2.setOnClickListener(new View.OnClickListener(this) {
            public final yb2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = r3;
                xb2 xb2Var2 = xb2Var;
                yb2 yb2Var = this.b;
                switch (b2) {
                    case 0:
                        yb2Var.a();
                        xb2Var2.n();
                        return;
                    case 1:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.l);
                        return;
                    case 2:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.k);
                        return;
                    case 3:
                        yb2Var.a();
                        xb2Var2.l();
                        return;
                    case 4:
                        yb2Var.a();
                        gl.d3(new hq1(xb2Var2, (byte) 22));
                        return;
                    default:
                        xb2Var2.a();
                        yb2Var.a();
                        return;
                }
            }
        });
        a8 c3 = r7.c(false, false, wb2Var, 2131232262, k96.M0(2131748119, null), false, wjbVar);
        this.d = c3;
        c3.setOnClickListener(new View.OnClickListener(this) {
            public final yb2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = b;
                xb2 xb2Var2 = xb2Var;
                yb2 yb2Var = this.b;
                switch (b2) {
                    case 0:
                        yb2Var.a();
                        xb2Var2.n();
                        return;
                    case 1:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.l);
                        return;
                    case 2:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.k);
                        return;
                    case 3:
                        yb2Var.a();
                        xb2Var2.l();
                        return;
                    case 4:
                        yb2Var.a();
                        gl.d3(new hq1(xb2Var2, (byte) 22));
                        return;
                    default:
                        xb2Var2.a();
                        yb2Var.a();
                        return;
                }
            }
        });
        a8 c4 = r7.c(false, false, wb2Var, 2131232262, k96.M0(2131748119, null), false, wjbVar);
        this.e = c4;
        c4.setOnClickListener(new View.OnClickListener(this) {
            public final yb2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = b;
                xb2 xb2Var2 = xb2Var;
                yb2 yb2Var = this.b;
                switch (b2) {
                    case 0:
                        yb2Var.a();
                        xb2Var2.n();
                        return;
                    case 1:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.l);
                        return;
                    case 2:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.k);
                        return;
                    case 3:
                        yb2Var.a();
                        xb2Var2.l();
                        return;
                    case 4:
                        yb2Var.a();
                        gl.d3(new hq1(xb2Var2, (byte) 22));
                        return;
                    default:
                        xb2Var2.a();
                        yb2Var.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        r7.c(false, false, wb2Var, 2131232263, k96.M0(2131748116, null), false, wjbVar).setOnClickListener(new vb2(this, context, wjbVar, i, xb2Var, (byte) 0));
        r7.c(false, false, wb2Var, 2131232111, k96.M0(2131747724, null), false, wjbVar).setOnClickListener(new View.OnClickListener(this) {
            public final yb2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = b;
                xb2 xb2Var2 = xb2Var;
                yb2 yb2Var = this.b;
                switch (b2) {
                    case 0:
                        yb2Var.a();
                        xb2Var2.n();
                        return;
                    case 1:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.l);
                        return;
                    case 2:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.k);
                        return;
                    case 3:
                        yb2Var.a();
                        xb2Var2.l();
                        return;
                    case 4:
                        yb2Var.a();
                        gl.d3(new hq1(xb2Var2, (byte) 22));
                        return;
                    default:
                        xb2Var2.a();
                        yb2Var.a();
                        return;
                }
            }
        });
        a8 c5 = r7.c(false, false, wb2Var, 0, "", false, wjbVar);
        this.c = c5;
        c5.setOnClickListener(new View.OnClickListener(this) {
            public final yb2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = b;
                xb2 xb2Var2 = xb2Var;
                yb2 yb2Var = this.b;
                switch (b2) {
                    case 0:
                        yb2Var.a();
                        xb2Var2.n();
                        return;
                    case 1:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.l);
                        return;
                    case 2:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.k);
                        return;
                    case 3:
                        yb2Var.a();
                        xb2Var2.l();
                        return;
                    case 4:
                        yb2Var.a();
                        gl.d3(new hq1(xb2Var2, (byte) 22));
                        return;
                    default:
                        xb2Var2.a();
                        yb2Var.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        zkb.h(bkb.G8, wjbVar, frameLayout);
        wb2Var.a(frameLayout, nme.o(-1, 8));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setPadding(gl.L(13.0f), gl.L(8.0f), gl.L(13.0f), gl.L(8.0f));
        textView.setTextSize(b, 13.0f);
        zkb.X(textView, bkb.D8, wjbVar);
        frameLayout.setTag(2131296439, num2);
        textView.setTag(2131296439, num2);
        wb2Var.a(textView, nme.o(-2, -2));
        int i3 = bkb.H5;
        ff0 Y = bkb.Y(bkb.v0(i3, wjbVar), 0, 6);
        vkb M = zkb.M(i3);
        textView.setBackground(Y);
        zkb.j(textView, Y, null, M, wjbVar);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final yb2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = b;
                xb2 xb2Var2 = xb2Var;
                yb2 yb2Var = this.b;
                switch (b2) {
                    case 0:
                        yb2Var.a();
                        xb2Var2.n();
                        return;
                    case 1:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.l);
                        return;
                    case 2:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.k);
                        return;
                    case 3:
                        yb2Var.a();
                        xb2Var2.l();
                        return;
                    case 4:
                        yb2Var.a();
                        gl.d3(new hq1(xb2Var2, (byte) 22));
                        return;
                    default:
                        xb2Var2.a();
                        yb2Var.a();
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
            sb.append(k96.M0(2131745500, null));
        }
        if (i4 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i4);
            sb.append(k96.M0(2131745499, null));
        }
        if (i5 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i5);
            sb.append(k96.M0(2131745498, null));
        }
        return k96.a0("MuteForButton", null, 2131748117, sb.toString());
    }

    public static void c(a8 a8Var, int i) {
        int w0 = bkb.w0(null, i, false);
        a8Var.c(i, i);
        a8Var.h(0.1f, i);
        if (a8Var.getTextView() != null && a8Var.getTextView().getCurrentTextColor() == w0) {
            return;
        }
        a8Var.d(w0, w0);
        a8Var.setSelectorColor(bkb.p1(0.1f, w0));
    }

    public final void a() {
        m8 m8Var = this.h;
        if (m8Var != null) {
            m8Var.d(true);
            this.h.d(true);
        }
        this.i.dismiss();
        this.j = System.currentTimeMillis();
    }

    public final void d(d dVar, View view, float f, float f2, boolean z) {
        float measuredWidth;
        float measuredHeight;
        if (dVar.getFragmentView() != null) {
            wb2 wb2Var = this.f;
            m8 m8Var = new m8(wb2Var, -2, -2);
            this.h = m8Var;
            m8Var.e = true;
            m8Var.c = (short) 220;
            m8Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(2131755192);
            this.h.setFocusable(true);
            wb2Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != dVar.getFragmentView()) {
                if (view.getParent() == null) {
                    return;
                }
                f += view.getX();
                f2 += view.getY();
                view = (View) view.getParent();
            }
            if (z) {
                measuredWidth = f - gl.N(8.0f);
                measuredHeight = gl.N(16.0f);
            } else {
                measuredWidth = f - (wb2Var.getMeasuredWidth() / 2.0f);
                measuredHeight = wb2Var.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(dVar.getFragmentView(), 0, (int) measuredWidth, (int) (f2 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j, long j2, HashSet hashSet) {
        int i;
        int i2;
        int i3;
        if (System.currentTimeMillis() - this.j < 200) {
            gl.d3(new n30(this, j, j2, hashSet, (byte) 1));
            return;
        }
        int i4 = this.g;
        boolean n2 = na7.q1(i4).n2(j, j2, null);
        a8 a8Var = this.c;
        a8 a8Var2 = this.b;
        if (n2) {
            a8Var.j(k96.M0(2131743609, null), 2131232417, null);
            i = bkb.w6;
            a8Var2.setVisibility(8);
        } else {
            a8Var.j(k96.M0(2131748114, null), 2131232261, null);
            int i5 = bkb.p7;
            a8Var2.setVisibility(0);
            if (na7.q1(i4).o2(j, j2)) {
                a8Var2.j(k96.M0(2131745085, null), 2131232407, null);
            } else {
                a8Var2.j(k96.M0(2131745083, null), 2131232408, null);
            }
            i = i5;
        }
        if (this.o) {
            this.a.setVisibility(8);
        }
        if (!n2 && !this.o) {
            SharedPreferences sharedPreferences = na7.q1(i4).W3;
            i3 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i2 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        } else {
            i2 = 0;
            i3 = 0;
        }
        a8 a8Var3 = this.d;
        if (i3 != 0) {
            this.l = i3;
            a8Var3.setVisibility(0);
            a8Var3.getImageView().setImageDrawable(rob.a(i3));
            a8Var3.setText(b(i3));
        } else {
            a8Var3.setVisibility(8);
        }
        a8 a8Var4 = this.e;
        if (i2 != 0) {
            this.k = i2;
            a8Var4.setVisibility(0);
            a8Var4.getImageView().setImageDrawable(rob.a(i2));
            a8Var4.setText(b(i2));
        } else {
            a8Var4.setVisibility(8);
        }
        c(a8Var, i);
        FrameLayout frameLayout = this.m;
        TextView textView = this.n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(gl.O2(k96.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), bkb.m6, 1, null, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
