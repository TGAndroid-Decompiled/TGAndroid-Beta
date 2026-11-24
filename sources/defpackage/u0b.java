package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class u0b extends r59 implements vlb {
    public static final s0b F3 = new a81();
    public static final t0b G3 = new a81();
    public final ln A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f3;
    public r0b[] g3;
    public final m0b h3;
    public final ln i3;
    public Drawable j3;
    public Drawable k3;
    public Paint l3;
    public final Paint m3;
    public int n3;
    public int o3;
    public qac p3;
    public qac q3;
    public boolean r3;
    public boolean s3;
    public xd9 t3;
    public int u3;
    public qac v3;
    public float w3;
    public ValueAnimator x3;
    public boolean y3;
    public final ln z3;

    public u0b(int i, ylb ylbVar, Context context) {
        super(context, ylbVar);
        this.f3 = 6.5f;
        this.g3 = null;
        d53 d53Var = d53.h;
        this.i3 = new ln(360L, this, d53Var);
        Paint paint = new Paint(1);
        this.m3 = paint;
        this.u3 = -1;
        this.w3 = 0.0f;
        this.y3 = true;
        this.z3 = new ln(350L, this, d53Var);
        this.A3 = new ln(350L, this, d53Var);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, gm.L(2.0f), 0);
        m0b m0bVar = new m0b(this);
        this.h3 = m0bVar;
        setAdapter(m0bVar);
        u46 u46Var = new u46();
        setLayoutManager(u46Var);
        u46Var.i1(0);
        setSelectorRadius(gm.L(15.0f));
        setSelectorType(1);
        int i2 = cmb.h6;
        anb.l(this, 20, i2, ylbVar);
        paint.setColor(cmb.v0(i2, this.o2));
        setWillNotDraw(false);
        setOnItemClickListener(new s19(this, (byte) 17));
        long currentTimeMillis = System.currentTimeMillis();
        F3.c(z8c.t0, Integer.valueOf(i), new rz3(this, currentTimeMillis, (byte) 1));
    }

    public static void A1(View view, RectF rectF) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f = 1.0f;
        float width = (view.getWidth() / 2.0f) - gm.L(1.0f);
        if (view instanceof q0b) {
            q0b q0bVar = (q0b) view;
            f = td4.A(1.0f, q0bVar.F, 0.15f, 0.85f) * q0bVar.E;
        }
        float f2 = width * f;
        rectF.set(left - f2, top - f2, left + f2, top + f2);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof q0b) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.n3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f) {
        this.w3 = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof q0b) {
                float s = gm.s(f, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((q0b) childAt).j();
                }
                childAt.setAlpha(s);
                childAt.setScaleX(s);
                childAt.setScaleY(s);
            }
        }
        invalidate();
    }

    public static void z1(u0b u0bVar, float f) {
        u0bVar.setCategoriesShownT(f);
    }

    public boolean B1() {
        return e86.e(8200);
    }

    public final void C1(TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j) {
        r0b[] r0bVarArr;
        this.g3 = new r0b[tL_messages_emojiGroups.groups.size()];
        boolean z = false;
        int i = 0;
        while (true) {
            int size = tL_messages_emojiGroups.groups.size();
            r0bVarArr = this.g3;
            if (i >= size) {
                break;
            }
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i);
            ?? obj = new Object();
            obj.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.a = "premium";
            } else {
                obj.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            r0bVarArr[i] = obj;
            i++;
        }
        this.g3 = E1(r0bVarArr);
        this.h3.f();
        setCategoriesShownT(0.0f);
        boolean z2 = this.y3;
        if (System.currentTimeMillis() - j > 16) {
            z = true;
        }
        J1(z2, z);
    }

    public final void D1(ValueAnimator valueAnimator) {
        setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void F1() {
        int L = (gm.L(34.0f) * this.u3) + ((-getScrollToStartWidth()) - Math.max(0, this.o3));
        scrollBy(L, 0);
        post(new nsa((hx3) this, L));
    }

    public final void G1() {
        x0(-getScrollToStartWidth(), 0, d53.h);
    }

    public void H1(int i) {
        boolean z;
        if (this.u3 < 0 && i >= 0) {
            this.A3.e(true, i);
        }
        this.u3 = i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof q0b) {
                int R = RecyclerView.R(childAt);
                q0b q0bVar = (q0b) childAt;
                if (this.u3 == R - 1) {
                    z = true;
                } else {
                    z = false;
                }
                q0bVar.l(z, true);
            }
        }
        invalidate();
    }

    public final void I1(r0b r0bVar) {
        int i;
        if (this.g3 != null) {
            i = 0;
            while (true) {
                r0b[] r0bVarArr = this.g3;
                if (i >= r0bVarArr.length) {
                    break;
                } else if (r0bVarArr[i] == r0bVar) {
                    break;
                } else {
                    i++;
                }
            }
            H1(i);
        }
        i = -1;
        H1(i);
    }

    public final void J1(boolean z, boolean z2) {
        int length;
        this.y3 = z;
        ?? r5 = z;
        if (this.g3 == null) {
            r5 = 0;
        }
        if (this.w3 == ((float) r5)) {
            return;
        }
        ValueAnimator valueAnimator = this.x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x3 = null;
        }
        float f = 0.0f;
        if (z2) {
            float f2 = this.w3;
            if (r5 != 0) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.x3 = ofFloat;
            ofFloat.addUpdateListener(new rha(this, (byte) 11));
            this.x3.addListener(new c39(this, (byte) 24));
            this.x3.setInterpolator(d53.h);
            ValueAnimator valueAnimator2 = this.x3;
            r0b[] r0bVarArr = this.g3;
            if (r0bVarArr == null) {
                length = 5;
            } else {
                length = r0bVarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.x3.start();
            return;
        }
        if (r5 != 0) {
            f = 1.0f;
        }
        setCategoriesShownT(f);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof q0b) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u0b.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.u3;
    }

    public r0b getSelectedCategory() {
        int i;
        r0b[] r0bVarArr = this.g3;
        if (r0bVarArr != null && (i = this.u3) >= 0 && i < r0bVarArr.length) {
            return r0bVarArr[i];
        }
        return null;
    }

    @Override
    public final void m0(int i) {
        boolean z;
        boolean z2;
        qac qacVar;
        int i2 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z2 = true;
            if (childAt instanceof q0b) {
                z = true;
            } else {
                if (childAt.getRight() > this.o3) {
                    z2 = false;
                }
                z = false;
            }
        } else {
            z = false;
            z2 = false;
        }
        boolean z3 = this.r3;
        if (z3 != z2) {
            this.r3 = z2;
            qac qacVar2 = this.p3;
            if (qacVar2 != null) {
                if (z2) {
                    i2 = Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3));
                }
                qacVar2.a(Integer.valueOf(i2));
            }
            invalidate();
        } else if (z3 && (qacVar = this.p3) != null) {
            qacVar.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3))));
        }
        if (this.s3 != z) {
            this.s3 = z;
            qac qacVar3 = this.q3;
            if (qacVar3 != null) {
                qacVar3.a(Boolean.valueOf(z));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.y3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xd9 xd9Var = this.t3;
        if (xd9Var != null) {
            xd9Var.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        Paint paint = this.l3;
        if (paint == null) {
            paint = new Paint(1);
            this.l3 = paint;
        }
        paint.setColor(i);
        Drawable mutate = getContext().getResources().getDrawable(2131231231).mutate();
        this.j3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231230).mutate();
        this.k3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i, mode));
    }

    public void setDontOccupyWidth(int i) {
        this.o3 = i;
    }

    public void setOnCategoryClick(qac qacVar) {
        this.v3 = qacVar;
    }

    public void setOnScrollFully(qac qacVar) {
        this.q3 = qacVar;
    }

    public void setOnScrollIntoOccupiedWidth(qac qacVar) {
        this.p3 = qacVar;
    }

    public void setShownButtonsAtStart(float f) {
        this.f3 = f;
    }

    @Override
    public final void updateColors() {
        try {
            this.m3.setColor(cmb.v0(cmb.h6, this.o2));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public r0b[] E1(r0b[] r0bVarArr) {
        return r0bVarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
