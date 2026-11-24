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
public final class c09 extends FrameLayout implements tjb {
    public final Paint a;
    public final RectF b;
    public final float c;
    public final be0 d;
    public final ImageView e;
    public final TextView f;
    public final View h;
    public float n;
    public final Drawable r;
    public int s;
    public h19 w;

    public c09(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = gl.L(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, nme.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        Drawable mutate = context.getDrawable(2131232331).mutate();
        this.r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, nme.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        be0 be0Var = new be0(context);
        this.d = be0Var;
        addView(be0Var, nme.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(bkb.w0(null, bkb.m8, false));
        textView.setTypeface(gl.o());
        addView(textView, nme.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.n);
    }

    public final void a(int i, TLRPC.ReactionCount reactionCount) {
        int i2 = reactionCount.count;
        this.s = i2;
        this.f.setText(k96.S(null, i2));
        h19 d = h19.d(reactionCount.reaction);
        this.w = d;
        String str = d.f;
        ImageView imageView = this.e;
        be0 be0Var = this.d;
        if (str != null) {
            ArrayList arrayList = hq6.d0(i).h;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                if (tL_availableReaction.reaction.equals(this.w.f)) {
                    be0Var.n(gl5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", uo3.f(tL_availableReaction.static_icon, bkb.Z6, 1.0f, null), tL_availableReaction);
                    be0Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        be0Var.setAnimatedEmojiDrawable(new vl(0, i, this.w.g));
        be0Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.uk));
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
        h19 h19Var = this.w;
        int i = this.s;
        if (h19Var != null) {
            accessibilityNodeInfo.setText(k96.G(i, "AccDescrNumberOfPeopleReactions", h19Var));
        } else {
            accessibilityNodeInfo.setText(k96.G(i, "ReactionsCount", new Object[0]));
        }
    }

    public void setCounter(int i) {
        this.s = i;
        this.f.setText(k96.S(null, i));
        this.e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f) {
        this.n = f;
        int i = bkb.sk;
        int w0 = bkb.w0(null, i, false);
        int o = bm2.o(bkb.w0(null, i, false), 16);
        int i2 = bkb.vk;
        int f2 = bm2.f(f, bkb.w0(null, bkb.uk, false), bkb.w0(null, i2, false));
        this.a.setColor(bm2.f(f, o, w0));
        this.f.setTextColor(f2);
        this.r.setColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.MULTIPLY));
        int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        float f3 = this.c;
        View view = this.h;
        if (i3 == 0) {
            int i4 = (int) f3;
            int o2 = bm2.o(bkb.w0(null, i2, false), 76);
            zkb.R(view, bkb.i0(i4, i4, i4, i4, 0, o2, o2), null, zkb.g(i2, 76), null);
        } else if (f == 0.0f) {
            int i5 = (int) f3;
            int o3 = bm2.o(w0, 76);
            zkb.R(view, bkb.i0(i5, i5, i5, i5, 0, o3, o3), null, zkb.g(i, 76), null);
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
                int w0 = bkb.w0(null, bkb.sk, false);
                int o = bm2.o(w0, 16);
                int f = bm2.f(this.n, bkb.w0(null, bkb.uk, false), bkb.w0(null, bkb.vk, false));
                paint.setColor(bm2.f(this.n, o, w0));
                if (textView.getCurrentTextColor() != f) {
                    textView.setTextColor(f);
                    drawable.setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.MULTIPLY));
                }
                invalidate();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
