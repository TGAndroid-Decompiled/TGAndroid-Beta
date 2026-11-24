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
public abstract class g0c extends FrameLayout implements tjb {
    public final int a;
    public final long b;
    public final d c;
    public final wjb d;
    public final ri e;
    public final Drawable f;
    public final SpannableString h;
    public final ImageView n;
    public final boolean[] r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public g0c(mu1 mu1Var, wjb wjbVar, Activity activity) {
        super(activity);
        final int currentAccount = mu1Var.getCurrentAccount();
        final long a = mu1Var.a();
        this.r = new boolean[1];
        this.a = currentAccount;
        this.b = a;
        this.c = mu1Var;
        this.d = wjbVar;
        ri riVar = new ri(activity, true, true, false, (byte) 4);
        this.e = riVar;
        riVar.b(0.3f, 450L, s33.h);
        riVar.setTextSize(gl.L(14.0f));
        riVar.setTypeface(gl.o());
        riVar.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        riVar.setGravity(1);
        riVar.setIgnoreRTL(!k96.a0);
        riVar.n = false;
        final mr1 mr1Var = (mr1) this;
        riVar.setOnClickListener(new bna(mr1Var, (byte) 24));
        addView(riVar, nme.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(2131232413).mutate();
        this.f = mutate;
        mutate.setBounds(0, gl.L(-6.0f), gl.L(20.0f), gl.L(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232242);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                String a0;
                int i;
                int i2 = currentAccount;
                TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-a));
                boolean p = y6c.h(i2).p();
                mr1 mr1Var2 = mr1.this;
                if (!p && (K0 == null || !K0.autotranslation)) {
                    mu1 mu1Var2 = mr1Var2.E;
                    i = ((d) mu1Var2).currentAccount;
                    SharedPreferences.Editor edit = na7.q1(i).W3.edit();
                    edit.putInt("dialog_show_translate_count" + mu1Var2.a(), 140).commit();
                    mu1Var2.nd(true);
                    return;
                }
                int i3 = mr1Var2.a;
                b1c b1cVar = na7.q1(i3).i4;
                Context context = mr1Var2.getContext();
                wjb wjbVar2 = mr1Var2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232572, 1, wjbVar2, context);
                m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                zkb.h(bkb.F8, wjbVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                LinearLayout linearLayout = new LinearLayout(mr1Var2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(mr1Var2.getContext());
                scrollView.b = new lm(350L, (View) scrollView, s33.h);
                LinearLayout linearLayout2 = new LinearLayout(mr1Var2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
                int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                a8 a8Var = new a8(0, mr1Var2.d, mr1Var2.getContext(), true, false);
                a8Var.j(k96.M0(2131743714, null), 2131232413, null);
                long j = mr1Var2.b;
                a8Var.setSubtext(rzb.E0(rzb.J0(b1cVar.l(j), null, null)));
                a8Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                a8 a8Var2 = new a8(0, mr1Var2.d, mr1Var2.getContext(), true, false);
                a8Var2.j(k96.M0(2131753753, null), 2131231243, null);
                a8Var2.setOnClickListener(new zl1(actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 3));
                linearLayout.addView(a8Var2);
                linearLayout.addView((View) scrollView, nme.o(-1, 420));
                String str = (String) b1cVar.e.get(Long.valueOf(j));
                rzb.J0(str, null, null);
                boolean[] zArr = mr1Var2.r;
                String J0 = rzb.J0(str, zArr, null);
                String l = b1cVar.l(j);
                ArrayList n = b1c.n(l);
                ArrayList m = b1c.m();
                linearLayout2.addView(new j8(mr1Var2.getContext(), wjbVar2), nme.o(-1, 8));
                a8Var.setOnClickListener(new wg(new r15(mr1Var2, new boolean[1], l, linearLayout2, n, str, b1cVar, m8Var, m), actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 18));
                if (y6c.h(i3).p() && J0 != null) {
                    a8 a8Var3 = new a8(0, mr1Var2.d, mr1Var2.getContext(), false, false);
                    if (zArr[0]) {
                        a0 = k96.a0(null, null, 2131751345, J0);
                    } else {
                        a0 = k96.a0(null, null, 2131751344, J0);
                    }
                    a8Var3.setMultiline(false);
                    a8Var3.j(je5.b(a0, a8Var3.getTextView().getPaint()), 2131232073, null);
                    a8Var3.setOnClickListener(new og(mr1Var2, str, b1cVar, J0, m8Var, (byte) 15));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var3);
                }
                a8 a8Var4 = new a8(0, mr1Var2.d, mr1Var2.getContext(), false, false);
                a8Var4.j(k96.M0(2131749133, null), 2131232092, null);
                a8Var4.setOnClickListener(new hu4(mr1Var2, b1cVar, m8Var, (byte) 24));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new j8(mr1Var2.getContext(), wjbVar2), nme.o(-1, 8));
                l46 l46Var = new l46(mr1Var2.getContext(), null);
                l46Var.setPadding(gl.L(13.0f), gl.L(8.33f), gl.L(13.0f), gl.L(8.33f));
                l46Var.setDisablePaddingsOffsetY(true);
                int i4 = bkb.i5;
                zkb.X(l46Var, i4, wjbVar2);
                zkb.G(l46Var, bkb.Wc, wjbVar2);
                l46Var.setEmojiColor(bkb.v0(i4, wjbVar2));
                CharSequence concat = TextUtils.concat(gl.S2(k96.M0(2131752014, null)), " ", gl.N2(k96.M0(2131752013, null), -1, 2, new a5b(mr1Var2, m8Var, (byte) 25), null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new gm(5197252827247841976L, l46Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                l46Var.setText(je5.b(gl.G2(gl.G2(concat, spannableStringBuilder2, "🥚 "), spannableStringBuilder, "🥚"), l46Var.getPaint()));
                int i5 = bkb.h6;
                ff0 Y = bkb.Y(bkb.v0(i5, wjbVar2), 0, 12);
                vkb M = zkb.M(i5);
                l46Var.setBackground(Y);
                zkb.j(l46Var, Y, null, M, wjbVar2);
                l46Var.setOnClickListener(new vzb(mr1Var2, m8Var, (byte) 2));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l46Var);
                m8Var.e = true;
                m8Var.c = (short) 220;
                m8Var.setOutsideTouchable(true);
                m8Var.setClippingEnabled(true);
                m8Var.setAnimationStyle(2131755192);
                m8Var.setFocusable(true);
                m8Var.setInputMethodMode(2);
                m8Var.setSoftInputMode(0);
                ImageView imageView2 = mr1Var2.n;
                m8Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - gl.L(8.0f));
            }
        });
        addView(imageView, nme.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, wjb wjbVar) {
        fx0 h = de9.h(1, wjbVar, context, false);
        h.w0 = false;
        h.v0 = false;
        fx0[] fx0VarArr = new fx0[1];
        LinearLayout j = de9.j(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(1);
        gradientDrawable.setColors(new int[]{-15982491, -16379606});
        gradientDrawable.setGradientRadius(gl.L(150.0f));
        float L = gl.L(12.0f);
        gradientDrawable.setCornerRadii(new float[]{L, L, L, L, 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, nme.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131231009);
        linearLayout.addView(imageView, nme.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231010);
        linearLayout.addView(imageView2, nme.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder S2 = gl.S2(k96.M0(2131752012, null));
        z3c[] z3cVarArr = (z3c[]) S2.getSpans(0, S2.length(), z3c.class);
        for (int i = 0; i < z3cVarArr.length; i++) {
            S2.setSpan(new ForegroundColorSpan(-1), S2.getSpanStart(z3cVarArr[i]), S2.getSpanEnd(z3cVarArr[i]), S2.getSpanFlags(z3cVarArr[i]));
        }
        textView.setText(S2);
        linearLayout.addView(textView, nme.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        j.addView(frameLayout, nme.c(-2.0f, -1));
        j.addView(new a6(context, 2131231864, k96.M0(2131752022, null), gl.N2(k96.M0(2131752024, null), -1, 0, new sta(fx0VarArr, context, (byte) 1), null), wjbVar), nme.t(-1, -2, 49, 32, 16, 32, 16));
        j.addView(new a6(context, 2131232383, k96.M0(2131752020, null), k96.M0(2131752021, null), wjbVar), nme.t(-1, -2, 49, 32, 0, 32, 16));
        j.addView(new a6(context, 2131231831, k96.M0(2131752017, null), gl.N2(k96.M0(2131752019, null), -1, 0, new sta(fx0VarArr, context, (byte) 2), null), wjbVar), nme.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        zkb.h(bkb.c7, wjbVar, view);
        j.addView(view, nme.n(1.0f / gl.p, -1, 7, 24, 0, 24, 0));
        l46 l46Var = new l46(context, null);
        l46Var.setTextSize(1, 12.0f);
        zkb.X(l46Var, bkb.x6, wjbVar);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        l46Var.setGravity(17);
        l46Var.setText(gl.N2(k96.M0(2131752016, null), -1, 0, new sta(fx0VarArr, context, (byte) 3), null));
        l46Var.setPadding(0, gl.L(18.0f), 0, gl.L(18.0f));
        l46Var.setDisablePaddingsOffsetY(true);
        j.addView(l46Var, nme.t(-1, -2, 7, 32, 0, 32, 0));
        u41 i2 = yjb.i(24, wjbVar, context, true);
        i2.setText(vqa.k2(k96.M0(2131743649, null)));
        i2.setOnClickListener(new f5(fx0VarArr, (byte) 7));
        j.addView(i2, nme.t(-1, 48, 7, 16, 0, 16, 16));
        h.O = j;
        fx0VarArr[0] = h;
        h.K();
        fx0VarArr[0].show();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Xe));
        hashSet.add(Integer.valueOf(bkb.Te));
    }

    public final void b() {
        String a0;
        int i;
        int i2 = this.a;
        b1c b1cVar = na7.q1(i2).i4;
        na7 q1 = na7.q1(i2);
        long j = this.b;
        TLRPC.Chat K0 = q1.K0(Long.valueOf(-j));
        boolean A = b1cVar.A(j);
        ri riVar = this.e;
        SpannableString spannableString = this.h;
        if (A) {
            String J0 = rzb.J0((String) b1cVar.e.get(Long.valueOf(j)), null, null);
            if (!TextUtils.isEmpty(J0)) {
                riVar.setText(TextUtils.concat(spannableString, " ", k96.a0(null, null, 2131745141, J0)));
            } else {
                riVar.setText(TextUtils.concat(spannableString, " ", k96.M0(2131745142, null)));
            }
        } else {
            String l = b1cVar.l(j);
            if (l == null) {
                l = "en";
            }
            boolean[] zArr = this.r;
            String J02 = rzb.J0(l, zArr, null);
            if (zArr[0]) {
                a0 = k96.a0(null, null, 2131743713, J02);
            } else {
                a0 = k96.a0(null, null, 2131743712, J02);
            }
            riVar.setText(TextUtils.concat(spannableString, " ", a0));
        }
        if (!y6c.h(i2).p() && (K0 == null || !K0.autotranslation)) {
            i = 2131232101;
        } else {
            i = 2131232242;
        }
        this.n.setImageResource(i);
    }

    public void setLeftMargin(float f) {
        this.e.setTranslationX(f / 2.0f);
    }

    @Override
    public final void updateColors() {
        int i = bkb.Xe;
        wjb wjbVar = this.d;
        int v0 = bkb.v0(i, wjbVar);
        int i2 = bkb.h6;
        int v02 = bkb.v0(i2, wjbVar);
        int i3 = bkb.Te;
        int v03 = bkb.v0(i3, wjbVar);
        if (this.y && v0 == this.s && v02 == this.w && v03 == this.x) {
            return;
        }
        this.y = true;
        this.s = v0;
        this.w = v02;
        this.x = v03;
        int v04 = bkb.v0(i, wjbVar);
        ri riVar = this.e;
        riVar.setTextColor(v04);
        int v05 = bkb.v0(i, wjbVar) & 436207615;
        int L = gl.L(3.0f);
        riVar.setBackground(bkb.W(gl.L(15.0f), v05, L, L, L, L));
        ff0 N = bkb.N(bkb.v0(i2, wjbVar), 0, 0);
        ImageView imageView = this.n;
        imageView.setBackground(N);
        int v06 = bkb.v0(i3, wjbVar);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v06, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(bkb.v0(i, wjbVar), mode));
    }
}
