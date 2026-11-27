package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public abstract class z1b extends FrameLayout {
    public final x1b a;
    public final y1b b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final rb0 n;
    public final q6b r;
    public final vnb s;
    public t1b w;
    public final TLRPC.ChatFull x;
    public boolean y;

    public z1b(Context context, TLRPC.ChatFull chatFull, vnb vnbVar) {
        super(context);
        int i;
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        this.h = new Paint(1);
        this.n = new rb0((vnb) null);
        this.r = new q6b(null, false);
        this.x = chatFull;
        this.s = vnbVar;
        x1b x1bVar = new x1b(this, context, vnbVar);
        this.a = x1bVar;
        setClipChildren(false);
        boolean z = ob6.a0;
        if (!z) {
            i = 8388611;
        } else {
            i = 8388613;
        }
        int i3 = i | 16;
        if (!z) {
            f = 12.0f;
        } else {
            f = 16.0f;
        }
        if (!z) {
            f2 = 16.0f;
        } else {
            f2 = 12.0f;
        }
        addView(x1bVar, tre.d(46, 46.0f, i3, f, 0.0f, f2, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout j = uh9.j(context, 0);
        ?? emaVar = new ema(context);
        this.b = emaVar;
        jn7.i(emaVar);
        emaVar.setTypeface(hl.o());
        emaVar.setTextSize(16);
        emaVar.setMaxLines(1);
        emaVar.setTextColor(-16777216);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        emaVar.setGravity(i2);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!ob6.a0) {
            j.addView((View) emaVar, tre.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            j.addView(textView, tre.r(-2, -2, 80));
        } else {
            j.addView(textView, tre.r(-2, -2, 80));
            j.addView((View) emaVar, tre.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(j, tre.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-16777216);
        textView2.setLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(-16777216);
        textView3.setGravity(16);
        TextView textView4 = new TextView(context);
        this.f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout j2 = uh9.j(context, 0);
        if (!ob6.a0) {
            j2.addView(textView2, tre.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            j2.addView(textView4, tre.r(-2, -2, 16));
            j2.addView(textView3, tre.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            j2.addView(textView3, tre.t(-2, -2, 16, 0, 0, 10, 0));
            j2.addView(textView4, tre.r(-2, -2, 16));
            j2.addView(textView2, tre.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(j2, tre.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z2 = ob6.a0;
        if (!z2) {
            f3 = 72.0f;
        } else {
            f3 = 18.0f;
        }
        if (!z2) {
            f4 = 18.0f;
        } else {
            f4 = 72.0f;
        }
        addView(linearLayout, tre.d(-1, -2.0f, 0, f3, 0.0f, f4, 0.0f));
        int i4 = aob.j5;
        yob.W(emaVar, i4, null);
        yob.X(textView, i4, null);
        int i5 = aob.A6;
        yob.X(textView2, i5, null);
        yob.X(textView3, i5, null);
        yob.X(textView4, i5, null);
        Drawable mutate = context.getDrawable(2131231978).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.x(textView4, mutate, i5, null, mode);
        Drawable mutate2 = context.getDrawable(2131231979).mutate();
        yob.x(textView3, mutate2, i5, null, mode);
        zm2 zm2Var = new zm2(null, mutate, 0, hl.L(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        zm2Var.h = intrinsicWidth;
        zm2Var.n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(zm2Var, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(hl.L(2.0f));
        zm2 zm2Var2 = new zm2(null, mutate2, 0, hl.L(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        zm2Var2.h = intrinsicWidth2;
        zm2Var2.n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(zm2Var2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(hl.L(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.y) {
            int v0 = aob.v0(aob.d7, this.s);
            Paint paint = this.h;
            paint.setColor(v0);
            if (ob6.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - hl.L(72.0f), getHeight(), paint);
            } else {
                canvas.drawRect(hl.L(72.0f), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public de0 getImageView() {
        return this.a;
    }

    public t1b getPostInfo() {
        return this.w;
    }

    public q6b getStoryAvatarParams() {
        return this.r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(p1b p1bVar) {
        TLRPC.User user = p1bVar.a;
        rb0 rb0Var = this.n;
        rb0Var.q(user);
        TLRPC.User user2 = p1bVar.a;
        x1b x1bVar = this.a;
        x1bVar.f(user2, rb0Var);
        x1bVar.setRoundRadius(hl.L(46.0f) >> 1);
        this.b.k(p1bVar.a.first_name);
        this.e.setText(p1bVar.b);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
