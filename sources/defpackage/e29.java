package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class e29 extends FrameLayout implements vlb {
    public final Paint a;
    public final RectF b;
    public final float c;
    public final bf0 d;
    public final ImageView e;
    public final TextView f;
    public final View h;
    public float n;
    public final Drawable r;
    public int s;
    public k39 w;

    public e29(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = gm.L(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, qoe.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        Drawable mutate = context.getDrawable(2131232332).mutate();
        this.r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, qoe.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        bf0 bf0Var = new bf0(context);
        this.d = bf0Var;
        addView(bf0Var, qoe.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(cmb.w0(null, cmb.m8, false));
        textView.setTypeface(gm.o());
        addView(textView, qoe.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.n);
    }

    public final void a(int i, TLRPC.ReactionCount reactionCount) {
        int i2 = reactionCount.count;
        this.s = i2;
        this.f.setText(jb6.S(null, i2));
        k39 d = k39.d(reactionCount.reaction);
        this.w = d;
        String str = d.f;
        ImageView imageView = this.e;
        bf0 bf0Var = this.d;
        if (str != null) {
            ArrayList arrayList = hs6.d0(i).h;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                if (tL_availableReaction.reaction.equals(this.w.f)) {
                    bf0Var.n(gn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", eq3.f(tL_availableReaction.static_icon, cmb.Z6, 1.0f, null), tL_availableReaction);
                    bf0Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        bf0Var.setAnimatedEmojiDrawable(new vm(0, i, this.w.g));
        bf0Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.uk));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f = this.c;
        canvas.drawRoundRect(rectF, f, f, this.a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        k39 k39Var = this.w;
        int i = this.s;
        if (k39Var != null) {
            accessibilityNodeInfo.setText(jb6.G(i, "AccDescrNumberOfPeopleReactions", k39Var));
        } else {
            accessibilityNodeInfo.setText(jb6.G(i, "ReactionsCount", new Object[0]));
        }
    }

    public void setCounter(int i) {
        this.s = i;
        this.f.setText(jb6.S(null, i));
        this.e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f) {
        this.n = f;
        int i = cmb.sk;
        int w0 = cmb.w0(null, i, false);
        int p = on2.p(cmb.w0(null, i, false), 16);
        int i2 = cmb.vk;
        int f2 = on2.f(f, cmb.w0(null, cmb.uk, false), cmb.w0(null, i2, false));
        this.a.setColor(on2.f(f, p, w0));
        this.f.setTextColor(f2);
        this.r.setColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.MULTIPLY));
        int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        float f3 = this.c;
        View view = this.h;
        if (i3 == 0) {
            int i4 = (int) f3;
            int p2 = on2.p(cmb.w0(null, i2, false), 76);
            anb.R(view, cmb.i0(i4, i4, i4, i4, 0, p2, p2), null, anb.g(i2, 76), null);
        } else if (f == 0.0f) {
            int i5 = (int) f3;
            int p3 = on2.p(w0, 76);
            anb.R(view, cmb.i0(i5, i5, i5, i5, 0, p3, p3), null, anb.g(i, 76), null);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextView textView;
        Drawable drawable;
        Paint paint = this.a;
        if (paint != null && (textView = this.f) != null && (drawable = this.r) != null) {
            try {
                int w0 = cmb.w0(null, cmb.sk, false);
                int p = on2.p(w0, 16);
                int f = on2.f(this.n, cmb.w0(null, cmb.uk, false), cmb.w0(null, cmb.vk, false));
                paint.setColor(on2.f(this.n, p, w0));
                if (textView.getCurrentTextColor() != f) {
                    textView.setTextColor(f);
                    drawable.setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.MULTIPLY));
                }
                invalidate();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
