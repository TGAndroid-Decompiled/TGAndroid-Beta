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
public abstract class t2b extends d79 implements snb {
    public static final r2b F3 = new b71();
    public static final s2b G3 = new b71();
    public final mm A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f3;
    public q2b[] g3;
    public final l2b h3;
    public final mm i3;
    public Drawable j3;
    public Drawable k3;
    public Paint l3;
    public final Paint m3;
    public int n3;
    public int o3;
    public pcc p3;
    public pcc q3;
    public boolean r3;
    public boolean s3;
    public nf9 t3;
    public int u3;
    public pcc v3;
    public float w3;
    public ValueAnimator x3;
    public boolean y3;
    public final mm z3;

    public t2b(int i, vnb vnbVar, Context context) {
        super(context, vnbVar);
        this.f3 = 6.5f;
        this.g3 = null;
        k43 k43Var = k43.h;
        this.i3 = new mm(360L, this, k43Var);
        Paint paint = new Paint(1);
        this.m3 = paint;
        this.u3 = -1;
        this.w3 = 0.0f;
        this.y3 = true;
        this.z3 = new mm(350L, this, k43Var);
        this.A3 = new mm(350L, this, k43Var);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, hl.L(2.0f), 0);
        l2b l2bVar = new l2b(this);
        this.h3 = l2bVar;
        setAdapter(l2bVar);
        x46 x46Var = new x46();
        setLayoutManager(x46Var);
        x46Var.i1(0);
        setSelectorRadius(hl.L(15.0f));
        setSelectorType(1);
        int i2 = aob.i6;
        yob.l(this, 20, i2, vnbVar);
        paint.setColor(aob.v0(i2, this.o2));
        setWillNotDraw(false);
        setOnItemClickListener(new t39(this, (byte) 16));
        long currentTimeMillis = System.currentTimeMillis();
        F3.c(yac.t0, Integer.valueOf(i), new cz3(this, currentTimeMillis, (byte) 1));
    }

    public static void A1(t2b t2bVar, float f) {
        t2bVar.setCategoriesShownT(f);
    }

    public static void B1(View view, RectF rectF) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f = 1.0f;
        float width = (view.getWidth() / 2.0f) - hl.L(1.0f);
        if (view instanceof p2b) {
            p2b p2bVar = (p2b) view;
            f = qd4.A(1.0f, p2bVar.F, 0.15f, 0.85f) * p2bVar.E;
        }
        float f2 = width * f;
        rectF.set(left - f2, top - f2, left + f2, top + f2);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof p2b) {
            return Math.max(0, getHeight() * (RecyclerView.S(childAt) - 1)) + this.n3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f) {
        this.w3 = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof p2b) {
                float s = hl.s(f, (getChildCount() - 1) - RecyclerView.S(childAt), getChildCount() - 1, 3.0f);
                if (s > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((p2b) childAt).j();
                }
                childAt.setAlpha(s);
                childAt.setScaleX(s);
                childAt.setScaleY(s);
            }
        }
        invalidate();
    }

    public boolean C1() {
        return i86.e(8200);
    }

    public final void D1(TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j) {
        q2b[] q2bVarArr;
        this.g3 = new q2b[tL_messages_emojiGroups.groups.size()];
        boolean z = false;
        int i = 0;
        while (true) {
            int size = tL_messages_emojiGroups.groups.size();
            q2bVarArr = this.g3;
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
            q2bVarArr[i] = obj;
            i++;
        }
        this.g3 = F1(q2bVarArr);
        this.h3.f();
        setCategoriesShownT(0.0f);
        boolean z2 = this.y3;
        if (System.currentTimeMillis() - j > 16) {
            z = true;
        }
        K1(z2, z);
    }

    public final void E1(ValueAnimator valueAnimator) {
        setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void G1() {
        int L = (hl.L(34.0f) * this.u3) + ((-getScrollToStartWidth()) - Math.max(0, this.o3));
        scrollBy(L, 0);
        post(new uoa((rw3) this, L));
    }

    public final void H1() {
        y0(-getScrollToStartWidth(), 0, k43.h);
    }

    public void I1(int i) {
        boolean z;
        if (this.u3 < 0 && i >= 0) {
            this.A3.e(true, i);
        }
        this.u3 = i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof p2b) {
                int S = RecyclerView.S(childAt);
                p2b p2bVar = (p2b) childAt;
                if (this.u3 == S - 1) {
                    z = true;
                } else {
                    z = false;
                }
                p2bVar.l(z, true);
            }
        }
        invalidate();
    }

    public final void J1(q2b q2bVar) {
        int i;
        if (this.g3 != null) {
            i = 0;
            while (true) {
                q2b[] q2bVarArr = this.g3;
                if (i >= q2bVarArr.length) {
                    break;
                } else if (q2bVarArr[i] == q2bVar) {
                    break;
                } else {
                    i++;
                }
            }
            I1(i);
        }
        i = -1;
        I1(i);
    }

    public final void K1(boolean z, boolean z2) {
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
            ofFloat.addUpdateListener(new ija(this, (byte) 11));
            this.x3.addListener(new po9(this, (byte) 21));
            this.x3.setInterpolator(k43.h);
            ValueAnimator valueAnimator2 = this.x3;
            q2b[] q2bVarArr = this.g3;
            if (q2bVarArr == null) {
                length = 5;
            } else {
                length = q2bVarArr.length;
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
            View F = F(motionEvent.getX(), motionEvent.getY());
            if (!(F instanceof p2b) || F.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2b.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.u3;
    }

    public q2b getSelectedCategory() {
        int i;
        q2b[] q2bVarArr = this.g3;
        if (q2bVarArr != null && (i = this.u3) >= 0 && i < q2bVarArr.length) {
            return q2bVarArr[i];
        }
        return null;
    }

    @Override
    public final void n0(int i) {
        boolean z;
        boolean z2;
        pcc pccVar;
        int i2 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z2 = true;
            if (childAt instanceof p2b) {
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
            pcc pccVar2 = this.p3;
            if (pccVar2 != null) {
                if (z2) {
                    i2 = Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3));
                }
                pccVar2.a(Integer.valueOf(i2));
            }
            invalidate();
        } else if (z3 && (pccVar = this.p3) != null) {
            pccVar.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3))));
        }
        if (this.s3 != z) {
            this.s3 = z;
            pcc pccVar3 = this.q3;
            if (pccVar3 != null) {
                pccVar3.a(Boolean.valueOf(z));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        K1(this.y3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nf9 nf9Var = this.t3;
        if (nf9Var != null) {
            nf9Var.requestLayout();
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
        Drawable mutate = getContext().getResources().getDrawable(2131231230).mutate();
        this.j3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231229).mutate();
        this.k3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i, mode));
    }

    public void setDontOccupyWidth(int i) {
        this.o3 = i;
    }

    public void setOnCategoryClick(pcc pccVar) {
        this.v3 = pccVar;
    }

    public void setOnScrollFully(pcc pccVar) {
        this.q3 = pccVar;
    }

    public void setOnScrollIntoOccupiedWidth(pcc pccVar) {
        this.p3 = pccVar;
    }

    public void setShownButtonsAtStart(float f) {
        this.f3 = f;
    }

    @Override
    public final void updateColors() {
        try {
            this.m3.setColor(aob.v0(aob.i6, this.o2));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public q2b[] F1(q2b[] q2bVarArr) {
        return q2bVarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
