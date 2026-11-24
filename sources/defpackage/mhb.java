package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class mhb extends TableLayout implements vlb {
    public final ylb a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;
    public ArrayList n;
    public ArrayList r;

    public mhb(Context context, ylb ylbVar) {
        super(context);
        this.b = new Path();
        this.c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, gm.L(0.66f));
        this.f = max;
        this.h = max / 2.0f;
        this.a = ylbVar;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final khb a(CharSequence charSequence) {
        xna xnaVar = new xna(getContext());
        int i = cmb.F6;
        ylb ylbVar = this.a;
        anb.X(xnaVar, i, ylbVar);
        anb.G(xnaVar, cmb.Wc, ylbVar);
        xnaVar.setTextSize(1, 14.0f);
        xnaVar.setText(gw3.m(charSequence, xnaVar.getPaint().getFontMetricsInt(), false, null, 0));
        nm7.i(xnaVar);
        xnaVar.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        khb khbVar = new khb(this, xnaVar, true);
        tableRow.addView(khbVar, layoutParams);
        addView(tableRow);
        return khbVar;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        fn fnVar = new fn(getContext());
        anb.X(fnVar, cmb.F6, this.a);
        fnVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        k47.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        fnVar.setText(k47.A5(gw3.m(spannableStringBuilder, fnVar.getPaint().getFontMetricsInt(), false, null, 0), arrayList, fnVar.getPaint().getFontMetricsInt(), false));
        nm7.i(fnVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new khb(this, fnVar, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new lhb(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new jhb(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return f(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        x51 x51Var = new x51(getContext());
        int i = cmb.F6;
        ylb ylbVar = this.a;
        anb.X(x51Var, i, ylbVar);
        x51Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gw3.m(charSequence, x51Var.getPaint().getFontMetricsInt(), false, null, 0));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) y51.b(str2, runnable, ylbVar, num));
        }
        x51Var.setText(spannableStringBuilder);
        nm7.i(x51Var);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new lhb(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new jhb(this, x51Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow f(String str, CharSequence charSequence, lhb[] lhbVarArr, x51[] x51VarArr) {
        x51 x51Var = new x51(getContext());
        anb.X(x51Var, cmb.F6, this.a);
        x51Var.setTextSize(1, 14.0f);
        x51Var.setText(gw3.m(charSequence, x51Var.getPaint().getFontMetricsInt(), false, null, 0));
        nm7.i(x51Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        lhb lhbVar = new lhb(this, str);
        if (lhbVarArr != null) {
            lhbVarArr[0] = lhbVar;
        }
        tableRow.addView(lhbVar, layoutParams);
        tableRow.addView(new jhb(this, x51Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (x51VarArr != null) {
            x51VarArr[0] = x51Var;
        }
        return tableRow;
    }

    public final void g(int i, String str) {
        long j = i * 1000;
        f(str, jb6.a0(null, null, 2131742446, jb6.D0().r0().format(new Date(j)), jb6.D0().o0().format(new Date(j))), null, null);
    }

    public final TableRow h(String str, CharSequence charSequence, Runnable runnable, String str2, zmc zmcVar) {
        Context context = getContext();
        ylb ylbVar = this.a;
        x51 x51Var = new x51(context, ylbVar);
        x51Var.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
        x51Var.setEllipsize(TextUtils.TruncateAt.END);
        int i = cmb.Wc;
        anb.X(x51Var, i, ylbVar);
        anb.G(x51Var, i, ylbVar);
        x51Var.setTextSize(1, 14.0f);
        x51Var.setSingleLine(true);
        x51Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new vl(runnable, (byte) 5), 0, spannableStringBuilder.length(), 33);
        x51Var.setText(spannableStringBuilder);
        if (str2 != null) {
            x51Var.P = new y51(str2, zmcVar, ylbVar);
        }
        return l(x51Var, str);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(String str, CharSequence charSequence, int i, uva uvaVar, String str2, ymc ymcVar) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final l66 l66Var = new l66(getContext(), null);
        l66Var.setTypeface(gm.n1("fonts/rmono.ttf"));
        float f = i;
        l66Var.setTextSize(1, f);
        int i2 = cmb.i5;
        ylb ylbVar = this.a;
        anb.X(l66Var, i2, ylbVar);
        l66Var.setMaxLines(4);
        int i3 = 0;
        l66Var.setSingleLine(false);
        l66Var.setText(charSequence);
        l66Var.setDisablePaddingsOffsetY(true);
        l66Var.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(10.66f), gm.L(9.33f));
        frameLayout.addView(l66Var, qoe.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str2 != null) {
            y51 y51Var = new y51(str2, ymcVar, ylbVar);
            final x51 x51Var = new x51(getContext(), ylbVar);
            x51Var.setTextSize(1, f);
            x51Var.setPadding(0, gm.L(9.33f), 0, gm.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(y51Var, 0, spannableString.length(), 33);
            x51Var.setText(spannableString);
            if (uvaVar != null) {
                i3 = 34;
            }
            float f2 = i3 + 12.66f;
            ((FrameLayout.LayoutParams) l66Var.getLayoutParams()).rightMargin = gm.L(f2) + y51Var.a();
            frameLayout.addView(x51Var, qoe.d(-2, -2.0f, 53, 0.0f, 0.0f, f2, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    l66 l66Var2 = l66.this;
                    if (l66Var2.getLayout() != null && l66Var2.getLayout().getLineCount() > 0) {
                        int left = l66Var2.getLeft();
                        float lineRight = l66Var2.getLayout().getLineRight(0);
                        x51 x51Var2 = x51Var;
                        x51Var2.setTranslationX(Math.min(0.0f, ((lineRight + (l66Var2.getPaddingLeft() + left)) + gm.L(6.0f)) - x51Var2.getLeft()));
                    }
                }
            });
        }
        if (uvaVar != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131232109);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i4 = cmb.u6;
            anb.s(imageView, i4, ylbVar, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new r39(charSequence, uvaVar, (byte) 27));
            rve.a(imageView);
            fg0 f0 = cmb.f0(cmb.p1(0.1f, cmb.v0(i4, ylbVar)), 7, -1);
            wmb K = anb.K(0.1f, i4);
            imageView.setBackground(f0);
            anb.j(imageView, f0, null, K, ylbVar);
            frameLayout.addView(imageView, qoe.e(30, 30, 21));
        }
        return l(frameLayout, str);
    }

    public final void k(String str, CharSequence charSequence, int i, uva uvaVar) {
        j(str, charSequence, i, uvaVar, null, null);
    }

    public final TableRow l(View view, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new lhb(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new jhb(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(String str, int i, long j, Runnable runnable, String str2, Runnable runnable2) {
        String str3;
        boolean z;
        String str4;
        boolean z2;
        boolean z3;
        Context context = getContext();
        ylb ylbVar = this.a;
        x51 x51Var = new x51(context, ylbVar);
        x51Var.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
        x51Var.setEllipsize(TextUtils.TruncateAt.END);
        int i2 = cmb.Ei;
        anb.X(x51Var, i2, ylbVar);
        anb.G(x51Var, i2, ylbVar);
        x51Var.setTextSize(1, 14.0f);
        x51Var.setSingleLine(true);
        x51Var.setDisablePaddingsOffsetY(true);
        ed0 ed0Var = new ed0(24.0f, i, x51Var);
        int i3 = (j > 2666000L ? 1 : (j == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = ed0Var.b;
        if (i3 == 0) {
            str4 = jb6.M0(2131744638, null);
            sn2 a = ixa.a(44, "anonymous");
            int L = gm.L(16.0f);
            int L2 = gm.L(16.0f);
            a.e = L;
            a.f = L2;
            imageReceiver.g0(a);
            z2 = false;
            z3 = false;
        } else if (m9c.C(j)) {
            str4 = jb6.M0(2131744614, null);
            sn2 a2 = ixa.a(44, "fragment");
            int L3 = gm.L(16.0f);
            int L4 = gm.L(16.0f);
            a2.e = L3;
            a2.f = L4;
            imageReceiver.g0(a2);
            z3 = true;
            z2 = false;
        } else {
            if (j >= 0) {
                TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
                if (W1 == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String r = m9c.r(W1);
                ed0Var.e(W1);
                str4 = r;
            } else {
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
                if (L0 == null) {
                    str3 = "";
                    z = true;
                } else {
                    str3 = L0.title;
                    z = false;
                }
                ed0Var.b(L0);
                str4 = str3;
                z2 = z;
            }
            z3 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str4));
        spannableStringBuilder.setSpan(ed0Var, 0, 1, 33);
        if (z3) {
            spannableStringBuilder.setSpan(new vl(runnable, (byte) 4), 3, spannableStringBuilder.length(), 33);
        }
        if (str2 != null) {
            x51Var.P = new y51(str2, runnable2, ylbVar);
        }
        x51Var.setText(spannableStringBuilder);
        if (z2) {
            return null;
        }
        return l(x51Var, str);
    }

    public final void n(String str, int i, long j, Runnable runnable) {
        m(str, i, j, runnable, null, null);
    }

    public final TableRow o(String str, final int i, final long j, Runnable runnable) {
        String str2;
        String str3;
        boolean z;
        Context context = getContext();
        ylb ylbVar = this.a;
        final j66 j66Var = new j66(context, ylbVar);
        j66Var.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
        int i2 = cmb.Ei;
        anb.W(j66Var, i2, ylbVar);
        j66Var.setLinkTextColor(cmb.v0(i2, ylbVar));
        j66Var.setTextSize(14);
        ed0 ed0Var = new ed0(24.0f, i, j66Var);
        int i3 = (j > 2666000L ? 1 : (j == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = ed0Var.b;
        if (i3 == 0) {
            str3 = jb6.M0(2131744638, null);
            sn2 a = ixa.a(44, "anonymous");
            int L = gm.L(16.0f);
            int L2 = gm.L(16.0f);
            a.e = L;
            a.f = L2;
            imageReceiver.g0(a);
            z = false;
        } else {
            if (m9c.C(j)) {
                str3 = jb6.M0(2131744614, null);
                sn2 a2 = ixa.a(44, "fragment");
                int L3 = gm.L(16.0f);
                int L4 = gm.L(16.0f);
                a2.e = L3;
                a2.f = L4;
                imageReceiver.g0(a2);
            } else if (j >= 0) {
                TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
                String r = m9c.r(W1);
                ed0Var.e(W1);
                str3 = r;
            } else {
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
                if (L0 == null) {
                    str2 = "";
                } else {
                    str2 = L0.title;
                }
                ed0Var.b(L0);
                str3 = str2;
            }
            z = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(ed0Var, 0, 1, 33);
        if (z) {
            j66Var.setClickable(true);
            spannableStringBuilder.setSpan(new vl(runnable, (byte) 3), 3, spannableStringBuilder.length(), 33);
        }
        final int v0 = cmb.v0(i2, ylbVar);
        final tm tmVar = new tm(gm.L(20.0f), j66Var);
        tmVar.k(Integer.valueOf(v0));
        tmVar.J = gm.L(12.0f);
        tmVar.K = 0;
        if (this.n == null) {
            this.n = new ArrayList();
            this.r = new ArrayList();
        }
        this.n.add(j66Var);
        this.r.add(tmVar);
        j66Var.addOnAttachStateChangeListener(new eq1(tmVar, (byte) 2));
        final Drawable mutate = getContext().getResources().getDrawable(2131232313).mutate();
        anb.x(this, mutate, i2, ylbVar, PorterDuff.Mode.SRC_IN);
        qac qacVar = new qac() {
            @Override
            public final void a(java.lang.Object r10) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ihb.a(java.lang.Object):void");
            }
        };
        qacVar.a(null);
        j66Var.i(tmVar);
        nm7.f(i).h(j66Var, 2, qacVar);
        nm7.f(i).h(j66Var, nm7.q5, qacVar);
        j66Var.l(spannableStringBuilder, false);
        return l(j66Var, str);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        super.onLayout(z, i, i2, i3, i4);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i5 = cmb.gi;
        ylb ylbVar = this.a;
        paint.setColor(cmb.v0(i5, ylbVar));
        paint2.setColor(cmb.v0(cmb.fi, ylbVar));
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            if (getChildAt(i6) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i6);
                int childCount2 = tableRow.getChildCount();
                for (int i7 = 0; i7 < childCount2; i7++) {
                    View childAt = tableRow.getChildAt(i7);
                    boolean z7 = true;
                    if (childAt instanceof lhb) {
                        lhb lhbVar = (lhb) childAt;
                        if (i6 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i6 != childCount - 1) {
                            z7 = false;
                        }
                        if (lhbVar.b != z6 || lhbVar.c != z7) {
                            lhbVar.b = z6;
                            lhbVar.c = z7;
                            lhbVar.invalidate();
                        }
                    } else if (childAt instanceof jhb) {
                        jhb jhbVar = (jhb) childAt;
                        if (i6 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i6 == childCount - 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (jhbVar.b != z3 || jhbVar.c != z4) {
                            jhbVar.b = z3;
                            jhbVar.c = z4;
                            jhbVar.invalidate();
                        }
                        if (i7 == 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i7 != childCount2 - 1) {
                            z7 = false;
                        }
                        if (jhbVar.d != z5 || jhbVar.e != z7) {
                            jhbVar.d = z5;
                            jhbVar.e = z7;
                            jhbVar.invalidate();
                        }
                    } else if (childAt instanceof khb) {
                        khb khbVar = (khb) childAt;
                        if (i6 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i6 != childCount - 1) {
                            z7 = false;
                        }
                        if (khbVar.c != z2 || khbVar.d != z7) {
                            khbVar.c = z2;
                            khbVar.d = z7;
                            khbVar.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        int i = cmb.gi;
        ylb ylbVar = this.a;
        this.e.setColor(cmb.v0(i, ylbVar));
        this.d.setColor(cmb.v0(cmb.fi, ylbVar));
        try {
            if (this.n != null && this.r != null) {
                int v0 = cmb.v0(cmb.Ei, ylbVar);
                for (int i2 = 0; i2 < this.n.size(); i2++) {
                    j66 j66Var = (j66) this.n.get(i2);
                    if (j66Var != null) {
                        j66Var.setLinkTextColor(v0);
                        j66Var.invalidate();
                    }
                }
                for (int i3 = 0; i3 < this.r.size(); i3++) {
                    tm tmVar = (tm) this.r.get(i3);
                    if (tmVar != null) {
                        tmVar.k(Integer.valueOf(v0));
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            childAt.invalidate();
            if (childAt instanceof ViewGroup) {
                int i5 = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    if (i5 < viewGroup.getChildCount()) {
                        viewGroup.getChildAt(i5).invalidate();
                        i5++;
                    }
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
