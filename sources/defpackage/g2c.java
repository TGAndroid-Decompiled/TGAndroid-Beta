package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
public abstract class g2c extends FrameLayout implements vlb {
    public final int a;
    public final long b;
    public final d c;
    public final ylb d;
    public final rj e;
    public final Drawable f;
    public final SpannableString h;
    public final ImageView n;
    public final boolean[] r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public g2c(yv1 yv1Var, ylb ylbVar, Activity activity) {
        super(activity);
        final int currentAccount = yv1Var.getCurrentAccount();
        final long a = yv1Var.a();
        this.r = new boolean[1];
        this.a = currentAccount;
        this.b = a;
        this.c = yv1Var;
        this.d = ylbVar;
        rj rjVar = new rj(activity, true, true, false, (byte) 4);
        this.e = rjVar;
        rjVar.b(0.3f, 450L, d53.h);
        rjVar.setTextSize(gm.L(14.0f));
        rjVar.setTypeface(gm.o());
        rjVar.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
        rjVar.setGravity(1);
        rjVar.setIgnoreRTL(!jb6.a0);
        rjVar.n = false;
        final zs1 zs1Var = (zs1) this;
        rjVar.setOnClickListener(new oha(zs1Var, (byte) 27));
        addView(rjVar, qoe.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(2131232414).mutate();
        this.f = mutate;
        mutate.setBounds(0, gm.L(-6.0f), gm.L(20.0f), gm.L(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232243);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                String a0;
                int i;
                int i2 = currentAccount;
                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-a));
                boolean p = z8c.h(i2).p();
                zs1 zs1Var2 = zs1.this;
                if (!p && (L0 == null || !L0.autotranslation)) {
                    yv1 yv1Var2 = zs1Var2.E;
                    i = ((d) yv1Var2).currentAccount;
                    SharedPreferences.Editor edit = oc7.r1(i).W3.edit();
                    edit.putInt("dialog_show_translate_count" + yv1Var2.a(), 140).commit();
                    yv1Var2.zd(true);
                    return;
                }
                int i3 = zs1Var2.a;
                b3c b3cVar = oc7.r1(i3).i4;
                Context context = zs1Var2.getContext();
                ylb ylbVar2 = zs1Var2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232584, 1, ylbVar2, context);
                m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                anb.h(cmb.F8, ylbVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                LinearLayout linearLayout = new LinearLayout(zs1Var2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(zs1Var2.getContext());
                scrollView.b = new ln(350L, (View) scrollView, d53.h);
                LinearLayout linearLayout2 = new LinearLayout(zs1Var2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
                int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                a8 a8Var = new a8(0, zs1Var2.d, zs1Var2.getContext(), true, false);
                a8Var.j(jb6.M0(2131743640, null), 2131232414, null);
                long j = zs1Var2.b;
                a8Var.setSubtext(s1c.E0(s1c.J0(b3cVar.l(j), null, null)));
                a8Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                a8 a8Var2 = new a8(0, zs1Var2.d, zs1Var2.getContext(), true, false);
                a8Var2.j(jb6.M0(2131753721, null), 2131231244, null);
                a8Var2.setOnClickListener(new hn1(actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 3));
                linearLayout.addView(a8Var2);
                linearLayout.addView((View) scrollView, qoe.o(-1, 420));
                String str = (String) b3cVar.e.get(Long.valueOf(j));
                s1c.J0(str, null, null);
                boolean[] zArr = zs1Var2.r;
                String J0 = s1c.J0(str, zArr, null);
                String l = b3cVar.l(j);
                ArrayList n = b3c.n(l);
                ArrayList m = b3c.m();
                linearLayout2.addView(new j8(zs1Var2.getContext(), ylbVar2), qoe.o(-1, 8));
                a8Var.setOnClickListener(new wh(new r35(zs1Var2, new boolean[1], l, linearLayout2, n, str, b3cVar, m8Var, m), actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 18));
                if (z8c.h(i3).p() && J0 != null) {
                    a8 a8Var3 = new a8(0, zs1Var2.d, zs1Var2.getContext(), false, false);
                    if (zArr[0]) {
                        a0 = jb6.a0(null, null, 2131751294, J0);
                    } else {
                        a0 = jb6.a0(null, null, 2131751293, J0);
                    }
                    a8Var3.setMultiline(false);
                    a8Var3.j(hg5.b(a0, a8Var3.getTextView().getPaint()), 2131232074, null);
                    a8Var3.setOnClickListener(new oh(zs1Var2, str, b3cVar, J0, m8Var, (byte) 15));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var3);
                }
                a8 a8Var4 = new a8(0, zs1Var2.d, zs1Var2.getContext(), false, false);
                a8Var4.j(jb6.M0(2131749082, null), 2131232093, null);
                a8Var4.setOnClickListener(new jw4(zs1Var2, b3cVar, m8Var, (byte) 24));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new j8(zs1Var2.getContext(), ylbVar2), qoe.o(-1, 8));
                l66 l66Var = new l66(zs1Var2.getContext(), null);
                l66Var.setPadding(gm.L(13.0f), gm.L(8.33f), gm.L(13.0f), gm.L(8.33f));
                l66Var.setDisablePaddingsOffsetY(true);
                int i4 = cmb.i5;
                anb.X(l66Var, i4, ylbVar2);
                anb.G(l66Var, cmb.Wc, ylbVar2);
                l66Var.setEmojiColor(cmb.v0(i4, ylbVar2));
                CharSequence concat = TextUtils.concat(gm.S2(jb6.M0(2131751963, null)), " ", gm.N2(jb6.M0(2131751962, null), -1, 2, new b7b(zs1Var2, m8Var, (byte) 27), null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new gn(5197252827247841976L, l66Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                l66Var.setText(hg5.b(gm.G2(gm.G2(concat, spannableStringBuilder2, "🥚 "), spannableStringBuilder, "🥚"), l66Var.getPaint()));
                int i5 = cmb.h6;
                fg0 Y = cmb.Y(cmb.v0(i5, ylbVar2), 0, 12);
                wmb M = anb.M(i5);
                l66Var.setBackground(Y);
                anb.j(l66Var, Y, null, M, ylbVar2);
                l66Var.setOnClickListener(new fyb(zs1Var2, m8Var, (byte) 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l66Var);
                m8Var.e = true;
                m8Var.c = (short) 220;
                m8Var.setOutsideTouchable(true);
                m8Var.setClippingEnabled(true);
                m8Var.setAnimationStyle(2131755192);
                m8Var.setFocusable(true);
                m8Var.setInputMethodMode(2);
                m8Var.setSoftInputMode(0);
                ImageView imageView2 = zs1Var2.n;
                m8Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - gm.L(8.0f));
            }
        });
        addView(imageView, qoe.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, ylb ylbVar) {
        my0 h = hg9.h(1, ylbVar, context, false);
        h.w0 = false;
        h.v0 = false;
        my0[] my0VarArr = new my0[1];
        LinearLayout i = hg9.i(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(1);
        gradientDrawable.setColors(new int[]{-15982491, -16379606});
        gradientDrawable.setGradientRadius(gm.L(150.0f));
        float L = gm.L(12.0f);
        gradientDrawable.setCornerRadii(new float[]{L, L, L, L, 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, qoe.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131231010);
        linearLayout.addView(imageView, qoe.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231011);
        linearLayout.addView(imageView2, qoe.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder S2 = gm.S2(jb6.M0(2131751961, null));
        z5c[] z5cVarArr = (z5c[]) S2.getSpans(0, S2.length(), z5c.class);
        for (int i2 = 0; i2 < z5cVarArr.length; i2++) {
            S2.setSpan(new ForegroundColorSpan(-1), S2.getSpanStart(z5cVarArr[i2]), S2.getSpanEnd(z5cVarArr[i2]), S2.getSpanFlags(z5cVarArr[i2]));
        }
        textView.setText(S2);
        linearLayout.addView(textView, qoe.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        i.addView(frameLayout, qoe.c(-2.0f, -1));
        i.addView(new a6(context, 2131231865, jb6.M0(2131751971, null), gm.N2(jb6.M0(2131751973, null), -1, 0, new wva(my0VarArr, context, (byte) 1), null), ylbVar), qoe.t(-1, -2, 49, 32, 16, 32, 16));
        i.addView(new a6(context, 2131232384, jb6.M0(2131751969, null), jb6.M0(2131751970, null), ylbVar), qoe.t(-1, -2, 49, 32, 0, 32, 16));
        i.addView(new a6(context, 2131231832, jb6.M0(2131751966, null), gm.N2(jb6.M0(2131751968, null), -1, 0, new wva(my0VarArr, context, (byte) 2), null), ylbVar), qoe.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        anb.h(cmb.c7, ylbVar, view);
        i.addView(view, qoe.n(1.0f / gm.p, -1, 7, 24, 0, 24, 0));
        l66 l66Var = new l66(context, null);
        l66Var.setTextSize(1, 12.0f);
        anb.X(l66Var, cmb.x6, ylbVar);
        anb.G(l66Var, cmb.Wc, ylbVar);
        l66Var.setGravity(17);
        l66Var.setText(gm.N2(jb6.M0(2131751965, null), -1, 0, new wva(my0VarArr, context, (byte) 3), null));
        l66Var.setPadding(0, gm.L(18.0f), 0, gm.L(18.0f));
        l66Var.setDisablePaddingsOffsetY(true);
        i.addView(l66Var, qoe.t(-1, -2, 7, 32, 0, 32, 0));
        b61 i3 = mlb.i(24, ylbVar, context, true);
        i3.setText(wsa.k2(jb6.M0(2131743575, null)));
        i3.setOnClickListener(new f5(my0VarArr, (byte) 7));
        i.addView(i3, qoe.t(-1, 48, 7, 16, 0, 16, 16));
        h.O = i;
        my0VarArr[0] = h;
        h.J();
        my0VarArr[0].show();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Xe));
        hashSet.add(Integer.valueOf(cmb.Te));
    }

    public final void b() {
        String a0;
        int i;
        int i2 = this.a;
        b3c b3cVar = oc7.r1(i2).i4;
        oc7 r1 = oc7.r1(i2);
        long j = this.b;
        TLRPC.Chat L0 = r1.L0(Long.valueOf(-j));
        boolean A = b3cVar.A(j);
        rj rjVar = this.e;
        SpannableString spannableString = this.h;
        if (A) {
            String J0 = s1c.J0((String) b3cVar.e.get(Long.valueOf(j)), null, null);
            if (!TextUtils.isEmpty(J0)) {
                rjVar.setText(TextUtils.concat(spannableString, " ", jb6.a0(null, null, 2131745067, J0)));
            } else {
                rjVar.setText(TextUtils.concat(spannableString, " ", jb6.M0(2131745068, null)));
            }
        } else {
            String l = b3cVar.l(j);
            if (l == null) {
                l = "en";
            }
            boolean[] zArr = this.r;
            String J02 = s1c.J0(l, zArr, null);
            if (zArr[0]) {
                a0 = jb6.a0(null, null, 2131743639, J02);
            } else {
                a0 = jb6.a0(null, null, 2131743638, J02);
            }
            rjVar.setText(TextUtils.concat(spannableString, " ", a0));
        }
        if (!z8c.h(i2).p() && (L0 == null || !L0.autotranslation)) {
            i = 2131232102;
        } else {
            i = 2131232243;
        }
        this.n.setImageResource(i);
    }

    public void setLeftMargin(float f) {
        this.e.setTranslationX(f / 2.0f);
    }

    @Override
    public final void updateColors() {
        int i = cmb.Xe;
        ylb ylbVar = this.d;
        int v0 = cmb.v0(i, ylbVar);
        int i2 = cmb.h6;
        int v02 = cmb.v0(i2, ylbVar);
        int i3 = cmb.Te;
        int v03 = cmb.v0(i3, ylbVar);
        if (this.y && v0 == this.s && v02 == this.w && v03 == this.x) {
            return;
        }
        this.y = true;
        this.s = v0;
        this.w = v02;
        this.x = v03;
        int v04 = cmb.v0(i, ylbVar);
        rj rjVar = this.e;
        rjVar.setTextColor(v04);
        int v05 = cmb.v0(i, ylbVar) & 436207615;
        int L = gm.L(3.0f);
        rjVar.setBackground(cmb.W(gm.L(15.0f), v05, L, L, L, L));
        fg0 N = cmb.N(cmb.v0(i2, ylbVar), 0, 0);
        ImageView imageView = this.n;
        imageView.setBackground(N);
        int v06 = cmb.v0(i3, ylbVar);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v06, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(cmb.v0(i, ylbVar), mode));
    }
}
