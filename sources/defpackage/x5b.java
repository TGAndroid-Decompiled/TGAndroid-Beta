package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
public final class x5b extends FrameLayout implements tjb {
    public boolean E;
    public Path F;
    public Paint G;
    public final wjb a;
    public final pb0 b;
    public final be0 c;
    public final jia d;
    public final jia e;
    public final wf2 f;
    public final RadioButton h;
    public final Paint n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final boolean[] x;
    public long y;

    public x5b(Context context, wjb wjbVar) {
        super(context);
        int i;
        pb0 pb0Var = new pb0((wjb) null);
        this.b = pb0Var;
        this.n = new Paint(1);
        this.r = false;
        this.s = true;
        this.w = true;
        this.x = new boolean[1];
        this.a = wjbVar;
        pb0Var.r = gl.L(40.0f);
        be0 be0Var = new be0(context);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(20.0f));
        addView(be0Var);
        jia jiaVar = new jia(context);
        this.d = jiaVar;
        jiaVar.setTypeface(gl.o());
        jiaVar.setTextSize(16);
        int i2 = bkb.i5;
        zkb.W(jiaVar, i2, wjbVar);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        jiaVar.setGravity(i);
        kk7.i(jiaVar);
        addView(jiaVar);
        jia jiaVar2 = new jia(context);
        this.e = jiaVar2;
        jiaVar2.setTextSize(14);
        zkb.W(jiaVar2, i2, wjbVar);
        jiaVar2.setGravity(k96.a0 ? 5 : 3);
        kk7.i(jiaVar2);
        addView(jiaVar2);
        wf2 wf2Var = new wf2(21, wjbVar, context);
        this.f = wf2Var;
        int i3 = bkb.A5;
        int i4 = bkb.i7;
        wf2Var.b(i3, i4, bkb.B5);
        wf2Var.setDrawUnchecked(true);
        wf2Var.setDrawBackgroundAsArc(10);
        addView(wf2Var);
        wf2Var.a(false, false);
        wf2Var.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(gl.L(20.0f));
        zkb.O(radioButton, i4, bkb.D5, wjbVar);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        jia jiaVar = this.e;
        jia jiaVar2 = this.d;
        if (charSequence == null) {
            jiaVar2.setTranslationY(0.0f);
            jiaVar.setVisibility(8);
            return;
        }
        jiaVar2.setTranslationY(gl.L(-9.0f));
        jiaVar.setTranslationY(gl.L(12.0f));
        jiaVar.l(charSequence, false);
        jiaVar.setVisibility(0);
    }

    public final void a(int i, TLRPC.Chat chat) {
        long j;
        float f;
        String lowerCase;
        int i2;
        int i3;
        float f2;
        int i4;
        if (chat == null) {
            j = 0;
        } else {
            j = -chat.id;
        }
        this.y = j;
        pb0 pb0Var = this.b;
        pb0Var.p(chat);
        if (hc2.c0(chat)) {
            f = 12.0f;
        } else {
            f = 20.0f;
        }
        int L = gl.L(f);
        be0 be0Var = this.c;
        be0Var.setRoundRadius(L);
        be0Var.f(chat, pb0Var);
        String str = chat.title;
        jia jiaVar = this.d;
        jiaVar.l(b00.e(jiaVar, str, false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        String str2 = "Members";
        if (this.r) {
            if (i <= 0) {
                i = chat.participants_count;
            }
            boolean V = hc2.V(chat);
            if (i >= 1) {
                if (V) {
                    str2 = "Subscribers";
                }
                lowerCase = k96.G(i, str2, new Object[0]);
            } else {
                if (V) {
                    i4 = 2131751378;
                } else {
                    i4 = 2131754876;
                }
                lowerCase = k96.M0(i4, null);
            }
        } else if (hc2.T(chat) && !chat.megagroup) {
            if (i >= 1) {
                lowerCase = k96.H(',', "Subscribers", i - 1);
            } else if (!hc2.t0(chat)) {
                lowerCase = k96.M0(2131752317, null).toLowerCase();
            } else {
                lowerCase = k96.M0(2131752306, null).toLowerCase();
            }
        } else if (i >= 1) {
            lowerCase = k96.H(',', "Members", i - 1);
        } else if (chat.has_geo) {
            lowerCase = k96.M0(2131748450, null);
        } else if (!hc2.t0(chat)) {
            lowerCase = k96.M0(2131748449, null).toLowerCase();
        } else {
            lowerCase = k96.M0(2131748446, null).toLowerCase();
        }
        setSubtitle(lowerCase);
        if (zArr[0]) {
            i2 = bkb.m5;
        } else {
            i2 = bkb.q5;
        }
        zkb.W(this.e, i2, this.a);
        if (this.s) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f.setVisibility(i3);
        this.h.setVisibility(8);
        if (i > 200) {
            f2 = 0.3f;
        } else {
            f2 = 1.0f;
        }
        b(false, f2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
    }

    public final void b(boolean z, float f) {
        RadioButton radioButton = this.h;
        wf2 wf2Var = this.f;
        if (z) {
            if (Math.abs(wf2Var.getAlpha() - f) > 0.1d) {
                wf2Var.animate().cancel();
                wf2Var.animate().alpha(f).start();
            }
            if (Math.abs(radioButton.getAlpha() - f) > 0.1d) {
                radioButton.animate().cancel();
                radioButton.animate().alpha(f).start();
                return;
            }
            return;
        }
        wf2Var.animate().cancel();
        wf2Var.setAlpha(f);
        radioButton.animate().cancel();
        radioButton.setAlpha(f);
    }

    public final void c(boolean z, boolean z2) {
        wf2 wf2Var = this.f;
        if (wf2Var.getVisibility() == 0) {
            wf2Var.a(z, z2);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z, z2);
        }
    }

    public final void d(boolean z, boolean z2) {
        boolean z3;
        this.r = z;
        if (z2 != this.s) {
            this.s = z2;
            f();
        }
        if (!this.s) {
            this.h.setVisibility(8);
            this.f.setVisibility(8);
        }
        if (!this.E && (this.s || !this.r)) {
            z3 = true;
        } else {
            z3 = false;
        }
        setWillNotDraw(z3);
    }

    public final void e(int i, int i2, TLRPC.User user) {
        wjb wjbVar = this.a;
        jia jiaVar = this.d;
        jia jiaVar2 = this.e;
        pb0 pb0Var = this.b;
        int i3 = 0;
        if (i == 4) {
            jiaVar.l(k96.M0(2131744288, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b00.e(jiaVar2, k96.a0(null, null, 2131744284, l7c.r(user)), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(k96.G(i2, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(k96.M0(2131744289, null)));
            }
            zkb.W(jiaVar2, bkb.m5, wjbVar);
            pb0Var.f(7);
            pb0Var.h(-15292942, -15630089);
        } else if (i == 2) {
            jiaVar.l(k96.M0(2131744290, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b00.e(jiaVar2, k96.a0(null, null, 2131744284, l7c.r(user)), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(k96.G(i2, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(k96.M0(2131744289, null)));
            }
            zkb.W(jiaVar2, bkb.m5, wjbVar);
            pb0Var.f(4);
            pb0Var.h(-3905294, -6923014);
        } else if (i == 1) {
            jiaVar.l(k96.M0(2131744292, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b00.e(jiaVar2, l7c.r(user), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(k96.G(i2, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(k96.M0(2131744291, null)));
            }
            zkb.W(jiaVar2, bkb.m5, wjbVar);
            pb0Var.f(15);
            pb0Var.h(-7808710, -13781445);
        } else if (i == 3) {
            jiaVar.l(k96.M0(2131744280, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b00.e(jiaVar2, l7c.r(user), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(k96.G(i2, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(k96.M0(2131744279, null)));
            }
            zkb.W(jiaVar2, bkb.m5, wjbVar);
            pb0Var.f(6);
            pb0Var.h(-18621, -618956);
        }
        this.f.setVisibility(8);
        if (!this.s) {
            i3 = 8;
        }
        this.h.setVisibility(i3);
        be0 be0Var = this.c;
        be0Var.setImageDrawable(pb0Var);
        be0Var.setRoundRadius(gl.L(20.0f));
    }

    public final void f() {
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        float f3;
        float f4;
        int i4;
        int i5;
        float f5;
        int i6;
        int i7;
        int i8 = 3;
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        int i9 = i | 16;
        boolean z = this.s;
        if (z) {
            f = 53.0f;
        } else {
            f = 16.0f;
        }
        if (z) {
            f2 = 53.0f;
        } else {
            f2 = 16.0f;
        }
        this.c.setLayoutParams(nme.d(40, 40.0f, i9, f, 0.0f, f2, 0.0f));
        boolean z2 = k96.a0;
        if (z2) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i10 = i2 | 16;
        int i11 = 68;
        float f6 = 20.0f;
        if (z2) {
            f3 = 20.0f;
        } else {
            if (this.s) {
                i3 = 105;
            } else {
                i3 = 68;
            }
            f3 = i3;
        }
        if (z2) {
            if (this.s) {
                i7 = 105;
            } else {
                i7 = 68;
            }
            f4 = i7;
        } else {
            f4 = 20.0f;
        }
        this.d.setLayoutParams(nme.d(-1, -2.0f, i10, f3, 0.0f, f4, 0.0f));
        boolean z3 = k96.a0;
        if (z3) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i12 = i4 | 16;
        if (z3) {
            f5 = 20.0f;
        } else {
            if (this.s) {
                i5 = 105;
            } else {
                i5 = 68;
            }
            f5 = i5;
        }
        if (z3) {
            if (this.s) {
                i11 = 105;
            }
            f6 = i11;
        }
        this.e.setLayoutParams(nme.d(-1, -2.0f, i12, f5, 0.0f, f6, 0.0f));
        if (k96.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        this.f.setLayoutParams(nme.d(24, 24.0f, i6 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (k96.a0) {
            i8 = 5;
        }
        this.h.setLayoutParams(nme.d(22, 22.0f, i8 | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230875);
        cm2 cm2Var = new cm2(2, drawable);
        drawable.setBounds(0, gl.L(1.0f), gl.L(11.0f), gl.L(12.0f));
        spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.E) {
            int v0 = bkb.v0(bkb.c7, this.a);
            Paint paint2 = this.n;
            paint2.setColor(v0);
            if (k96.a0) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - gl.L(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(gl.L(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
            }
        } else {
            canvas2 = canvas;
        }
        Path path = this.F;
        if (path != null && (paint = this.G) != null && !this.s && this.r && this.w) {
            canvas2.drawPath(path, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x5b.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int measuredWidth;
        float f2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.r && !this.s) {
            f = 62.0f;
        } else {
            f = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gl.L(f), 1073741824));
        if (!this.s && this.r) {
            Path path = this.F;
            if (path == null) {
                this.F = new Path();
            } else {
                path.rewind();
            }
            if (k96.a0) {
                measuredWidth = gl.L(31.0f);
            } else {
                measuredWidth = getMeasuredWidth() - gl.L(31.0f);
            }
            float f3 = measuredWidth;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (k96.a0) {
                f2 = -1.0f;
            } else {
                f2 = 1.0f;
            }
            this.F.moveTo(f3, measuredHeight - gl.L(6.0f));
            this.F.lineTo((f2 * gl.L(6.0f)) + f3, measuredHeight);
            this.F.lineTo(f3, measuredHeight + gl.L(6.0f));
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.G.setStrokeCap(Paint.Cap.ROUND);
            }
            this.G.setStrokeWidth(gl.N(1.86f));
            this.G.setColor(bkb.p1(0.3f, bkb.v0(bkb.F6, this.a)));
        }
    }

    public void set(Object obj) {
        int i;
        boolean z = obj instanceof TLRPC.User;
        jia jiaVar = this.d;
        if (z) {
            jiaVar.setTypeface(gl.o());
            jiaVar.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            jiaVar.setTypeface(gl.o());
            jiaVar.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            jiaVar.setTypeface(null);
            int i2 = -gl.L(52.0f);
            if (k96.a0) {
                i = -1;
            } else {
                i = 1;
            }
            jiaVar.setTranslationX(i2 * i);
            jiaVar.l((String) obj, false);
        }
    }

    public void setDivider(boolean z) {
        boolean z2;
        this.E = z;
        if (!z && (this.s || !this.r)) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
    }

    public void setRedCheckbox(boolean z) {
        int i;
        if (z) {
            i = bkb.mk;
        } else {
            i = bkb.A5;
        }
        this.f.b(i, bkb.i7, bkb.B5);
    }

    public void setUser(TLRPC.User user) {
        long j;
        int i;
        if (user == null) {
            j = 0;
        } else {
            j = user.id;
        }
        this.y = j;
        pb0 pb0Var = this.b;
        pb0Var.q(user);
        int L = gl.L(20.0f);
        be0 be0Var = this.c;
        be0Var.setRoundRadius(L);
        be0Var.f(user, pb0Var);
        String r = l7c.r(user);
        jia jiaVar = this.d;
        int i2 = 0;
        jiaVar.l(b00.e(jiaVar, r, false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        boolean z = this.r;
        wjb wjbVar = this.a;
        jia jiaVar2 = this.e;
        if (z) {
            setSubtitle(k96.M0(2131743107, null));
            zkb.W(jiaVar2, bkb.q5, wjbVar);
        } else {
            setSubtitle(k96.d0(y6c.t0, user, zArr, null));
            if (zArr[0]) {
                i = bkb.m5;
            } else {
                i = bkb.q5;
            }
            zkb.W(jiaVar2, i, wjbVar);
        }
        if (!this.s) {
            i2 = 8;
        }
        wf2 wf2Var = this.f;
        wf2Var.setVisibility(i2);
        wf2Var.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.G;
            if (paint != null) {
                paint.setColor(bkb.p1(0.3f, bkb.v0(bkb.F6, this.a)));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
