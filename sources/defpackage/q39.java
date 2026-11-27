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
public final class q39 extends FrameLayout implements snb {
    public final Paint a;
    public final RectF b;
    public final float c;
    public final de0 d;
    public final ImageView e;
    public final TextView f;
    public final View h;
    public float n;
    public final Drawable r;
    public int s;
    public w49 w;

    public q39(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = hl.L(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, tre.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        Drawable mutate = context.getDrawable(2131232331).mutate();
        this.r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, tre.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        de0 de0Var = new de0(context);
        this.d = de0Var;
        addView(de0Var, tre.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(aob.w0(null, aob.n8, false));
        textView.setTypeface(hl.o());
        addView(textView, tre.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.n);
    }

    public final void a(int i, TLRPC.ReactionCount reactionCount) {
        int i2 = reactionCount.count;
        this.s = i2;
        this.f.setText(ob6.S(null, i2));
        w49 d = w49.d(reactionCount.reaction);
        this.w = d;
        String str = d.f;
        ImageView imageView = this.e;
        de0 de0Var = this.d;
        if (str != null) {
            ArrayList arrayList = ls6.d0(i).h;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                if (tL_availableReaction.reaction.equals(this.w.f)) {
                    de0Var.n(jn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", lp3.f(tL_availableReaction.static_icon, aob.a7, 1.0f, null), tL_availableReaction);
                    de0Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        de0Var.setAnimatedEmojiDrawable(new wl(0, i, this.w.g));
        de0Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.vk));
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
        w49 w49Var = this.w;
        int i = this.s;
        if (w49Var != null) {
            accessibilityNodeInfo.setText(ob6.G(i, "AccDescrNumberOfPeopleReactions", w49Var));
        } else {
            accessibilityNodeInfo.setText(ob6.G(i, "ReactionsCount", new Object[0]));
        }
    }

    public void setCounter(int i) {
        this.s = i;
        this.f.setText(ob6.S(null, i));
        this.e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f) {
        this.n = f;
        int i = aob.tk;
        int w0 = aob.w0(null, i, false);
        int o = vm2.o(aob.w0(null, i, false), 16);
        int i2 = aob.wk;
        int f2 = vm2.f(f, aob.w0(null, aob.vk, false), aob.w0(null, i2, false));
        this.a.setColor(vm2.f(f, o, w0));
        this.f.setTextColor(f2);
        this.r.setColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.MULTIPLY));
        int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        float f3 = this.c;
        View view = this.h;
        if (i3 == 0) {
            int i4 = (int) f3;
            int o2 = vm2.o(aob.w0(null, i2, false), 76);
            yob.R(view, aob.i0(i4, i4, i4, i4, 0, o2, o2), null, yob.g(i2, 76), null);
        } else if (f == 0.0f) {
            int i5 = (int) f3;
            int o3 = vm2.o(w0, 76);
            yob.R(view, aob.i0(i5, i5, i5, i5, 0, o3, o3), null, yob.g(i, 76), null);
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
                int w0 = aob.w0(null, aob.tk, false);
                int o = vm2.o(w0, 16);
                int f = vm2.f(this.n, aob.w0(null, aob.vk, false), aob.w0(null, aob.wk, false));
                paint.setColor(vm2.f(this.n, o, w0));
                if (textView.getCurrentTextColor() != f) {
                    textView.setTextColor(f);
                    drawable.setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.MULTIPLY));
                }
                invalidate();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}
