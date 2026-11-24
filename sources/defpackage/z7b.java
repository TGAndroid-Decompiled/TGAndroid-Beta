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
public final class z7b extends FrameLayout implements vlb {
    public boolean E;
    public Path F;
    public Paint G;
    public final ylb a;
    public final pc0 b;
    public final bf0 c;
    public final lka d;
    public final lka e;
    public final jh2 f;
    public final RadioButton h;
    public final Paint n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final boolean[] x;
    public long y;

    public z7b(Context context, ylb ylbVar) {
        super(context);
        int i;
        pc0 pc0Var = new pc0((ylb) null);
        this.b = pc0Var;
        this.n = new Paint(1);
        this.r = false;
        this.s = true;
        this.w = true;
        this.x = new boolean[1];
        this.a = ylbVar;
        pc0Var.r = gm.L(40.0f);
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(20.0f));
        addView(bf0Var);
        lka lkaVar = new lka(context);
        this.d = lkaVar;
        lkaVar.setTypeface(gm.o());
        lkaVar.setTextSize(16);
        int i2 = cmb.i5;
        anb.W(lkaVar, i2, ylbVar);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        lkaVar.setGravity(i);
        nm7.i(lkaVar);
        addView(lkaVar);
        lka lkaVar2 = new lka(context);
        this.e = lkaVar2;
        lkaVar2.setTextSize(14);
        anb.W(lkaVar2, i2, ylbVar);
        lkaVar2.setGravity(jb6.a0 ? 5 : 3);
        nm7.i(lkaVar2);
        addView(lkaVar2);
        jh2 jh2Var = new jh2(21, ylbVar, context);
        this.f = jh2Var;
        int i3 = cmb.A5;
        int i4 = cmb.i7;
        jh2Var.b(i3, i4, cmb.B5);
        jh2Var.setDrawUnchecked(true);
        jh2Var.setDrawBackgroundAsArc(10);
        addView(jh2Var);
        jh2Var.a(false, false);
        jh2Var.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(gm.L(20.0f));
        anb.O(radioButton, i4, cmb.D5, ylbVar);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        lka lkaVar = this.e;
        lka lkaVar2 = this.d;
        if (charSequence == null) {
            lkaVar2.setTranslationY(0.0f);
            lkaVar.setVisibility(8);
            return;
        }
        lkaVar2.setTranslationY(gm.L(-9.0f));
        lkaVar.setTranslationY(gm.L(12.0f));
        lkaVar.l(charSequence, false);
        lkaVar.setVisibility(0);
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
        pc0 pc0Var = this.b;
        pc0Var.p(chat);
        if (sd2.c0(chat)) {
            f = 12.0f;
        } else {
            f = 20.0f;
        }
        int L = gm.L(f);
        bf0 bf0Var = this.c;
        bf0Var.setRoundRadius(L);
        bf0Var.f(chat, pc0Var);
        String str = chat.title;
        lka lkaVar = this.d;
        lkaVar.l(b10.e(lkaVar, str, false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        String str2 = "Members";
        if (this.r) {
            if (i <= 0) {
                i = chat.participants_count;
            }
            boolean V = sd2.V(chat);
            if (i >= 1) {
                if (V) {
                    str2 = "Subscribers";
                }
                lowerCase = jb6.G(i, str2, new Object[0]);
            } else {
                if (V) {
                    i4 = 2131751327;
                } else {
                    i4 = 2131754876;
                }
                lowerCase = jb6.M0(i4, null);
            }
        } else if (sd2.T(chat) && !chat.megagroup) {
            if (i >= 1) {
                lowerCase = jb6.H(',', "Subscribers", i - 1);
            } else if (!sd2.t0(chat)) {
                lowerCase = jb6.M0(2131752271, null).toLowerCase();
            } else {
                lowerCase = jb6.M0(2131752260, null).toLowerCase();
            }
        } else if (i >= 1) {
            lowerCase = jb6.H(',', "Members", i - 1);
        } else if (chat.has_geo) {
            lowerCase = jb6.M0(2131748399, null);
        } else if (!sd2.t0(chat)) {
            lowerCase = jb6.M0(2131748398, null).toLowerCase();
        } else {
            lowerCase = jb6.M0(2131748395, null).toLowerCase();
        }
        setSubtitle(lowerCase);
        if (zArr[0]) {
            i2 = cmb.m5;
        } else {
            i2 = cmb.q5;
        }
        anb.W(this.e, i2, this.a);
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
        hashSet.add(Integer.valueOf(cmb.F6));
    }

    public final void b(boolean z, float f) {
        RadioButton radioButton = this.h;
        jh2 jh2Var = this.f;
        if (z) {
            if (Math.abs(jh2Var.getAlpha() - f) > 0.1d) {
                jh2Var.animate().cancel();
                jh2Var.animate().alpha(f).start();
            }
            if (Math.abs(radioButton.getAlpha() - f) > 0.1d) {
                radioButton.animate().cancel();
                radioButton.animate().alpha(f).start();
                return;
            }
            return;
        }
        jh2Var.animate().cancel();
        jh2Var.setAlpha(f);
        radioButton.animate().cancel();
        radioButton.setAlpha(f);
    }

    public final void c(boolean z, boolean z2) {
        jh2 jh2Var = this.f;
        if (jh2Var.getVisibility() == 0) {
            jh2Var.a(z, z2);
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
        ylb ylbVar = this.a;
        lka lkaVar = this.d;
        lka lkaVar2 = this.e;
        pc0 pc0Var = this.b;
        int i3 = 0;
        if (i == 4) {
            lkaVar.l(jb6.M0(2131744214, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b10.e(lkaVar2, jb6.a0(null, null, 2131744210, m9c.r(user)), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(jb6.G(i2, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(jb6.M0(2131744215, null)));
            }
            anb.W(lkaVar2, cmb.m5, ylbVar);
            pc0Var.f(7);
            pc0Var.h(-15292942, -15630089);
        } else if (i == 2) {
            lkaVar.l(jb6.M0(2131744216, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b10.e(lkaVar2, jb6.a0(null, null, 2131744210, m9c.r(user)), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(jb6.G(i2, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(jb6.M0(2131744215, null)));
            }
            anb.W(lkaVar2, cmb.m5, ylbVar);
            pc0Var.f(4);
            pc0Var.h(-3905294, -6923014);
        } else if (i == 1) {
            lkaVar.l(jb6.M0(2131744218, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b10.e(lkaVar2, m9c.r(user), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(jb6.G(i2, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(jb6.M0(2131744217, null)));
            }
            anb.W(lkaVar2, cmb.m5, ylbVar);
            pc0Var.f(15);
            pc0Var.h(-7808710, -13781445);
        } else if (i == 3) {
            lkaVar.l(jb6.M0(2131744206, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b10.e(lkaVar2, m9c.r(user), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(jb6.G(i2, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(jb6.M0(2131744205, null)));
            }
            anb.W(lkaVar2, cmb.m5, ylbVar);
            pc0Var.f(6);
            pc0Var.h(-18621, -618956);
        }
        this.f.setVisibility(8);
        if (!this.s) {
            i3 = 8;
        }
        this.h.setVisibility(i3);
        bf0 bf0Var = this.c;
        bf0Var.setImageDrawable(pc0Var);
        bf0Var.setRoundRadius(gm.L(20.0f));
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
        if (jb6.a0) {
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
        this.c.setLayoutParams(qoe.d(40, 40.0f, i9, f, 0.0f, f2, 0.0f));
        boolean z2 = jb6.a0;
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
        this.d.setLayoutParams(qoe.d(-1, -2.0f, i10, f3, 0.0f, f4, 0.0f));
        boolean z3 = jb6.a0;
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
        this.e.setLayoutParams(qoe.d(-1, -2.0f, i12, f5, 0.0f, f6, 0.0f));
        if (jb6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        this.f.setLayoutParams(qoe.d(24, 24.0f, i6 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (jb6.a0) {
            i8 = 5;
        }
        this.h.setLayoutParams(qoe.d(22, 22.0f, i8 | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230876);
        pn2 pn2Var = new pn2(2, drawable);
        drawable.setBounds(0, gm.L(1.0f), gm.L(11.0f), gm.L(12.0f));
        spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
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
            int v0 = cmb.v0(cmb.c7, this.a);
            Paint paint2 = this.n;
            paint2.setColor(v0);
            if (jb6.a0) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - gm.L(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(gm.L(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7b.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
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
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gm.L(f), 1073741824));
        if (!this.s && this.r) {
            Path path = this.F;
            if (path == null) {
                this.F = new Path();
            } else {
                path.rewind();
            }
            if (jb6.a0) {
                measuredWidth = gm.L(31.0f);
            } else {
                measuredWidth = getMeasuredWidth() - gm.L(31.0f);
            }
            float f3 = measuredWidth;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (jb6.a0) {
                f2 = -1.0f;
            } else {
                f2 = 1.0f;
            }
            this.F.moveTo(f3, measuredHeight - gm.L(6.0f));
            this.F.lineTo((f2 * gm.L(6.0f)) + f3, measuredHeight);
            this.F.lineTo(f3, measuredHeight + gm.L(6.0f));
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.G.setStrokeCap(Paint.Cap.ROUND);
            }
            this.G.setStrokeWidth(gm.N(1.86f));
            this.G.setColor(cmb.p1(0.3f, cmb.v0(cmb.F6, this.a)));
        }
    }

    public void set(Object obj) {
        int i;
        boolean z = obj instanceof TLRPC.User;
        lka lkaVar = this.d;
        if (z) {
            lkaVar.setTypeface(gm.o());
            lkaVar.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            lkaVar.setTypeface(gm.o());
            lkaVar.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            lkaVar.setTypeface(null);
            int i2 = -gm.L(52.0f);
            if (jb6.a0) {
                i = -1;
            } else {
                i = 1;
            }
            lkaVar.setTranslationX(i2 * i);
            lkaVar.l((String) obj, false);
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
            i = cmb.mk;
        } else {
            i = cmb.A5;
        }
        this.f.b(i, cmb.i7, cmb.B5);
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
        pc0 pc0Var = this.b;
        pc0Var.q(user);
        int L = gm.L(20.0f);
        bf0 bf0Var = this.c;
        bf0Var.setRoundRadius(L);
        bf0Var.f(user, pc0Var);
        String r = m9c.r(user);
        lka lkaVar = this.d;
        int i2 = 0;
        lkaVar.l(b10.e(lkaVar, r, false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        boolean z = this.r;
        ylb ylbVar = this.a;
        lka lkaVar2 = this.e;
        if (z) {
            setSubtitle(jb6.M0(2131743033, null));
            anb.W(lkaVar2, cmb.q5, ylbVar);
        } else {
            setSubtitle(jb6.d0(z8c.t0, user, zArr, null));
            if (zArr[0]) {
                i = cmb.m5;
            } else {
                i = cmb.q5;
            }
            anb.W(lkaVar2, i, ylbVar);
        }
        if (!this.s) {
            i2 = 8;
        }
        jh2 jh2Var = this.f;
        jh2Var.setVisibility(i2);
        jh2Var.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.G;
            if (paint != null) {
                paint.setColor(cmb.p1(0.3f, cmb.v0(cmb.F6, this.a)));
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
