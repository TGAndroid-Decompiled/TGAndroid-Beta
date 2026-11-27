package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class ktc extends FrameLayout {
    public final vnb a;
    public final FrameLayout b;
    public final rb0 c;
    public final de0 d;
    public ShapeDrawable e;
    public final TextView f;
    public final jtc h;
    public final ImageView n;
    public TLRPC.User r;
    public String s;

    public ktc(vnb vnbVar, Context context, Runnable runnable, Runnable runnable2) {
        super(context);
        this.c = new rb0((vnb) null);
        this.a = vnbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, tre.c(-1.0f, -1));
        int i = aob.a7;
        int v0 = aob.v0(i, vnbVar);
        int v02 = aob.v0(i, vnbVar);
        int i2 = aob.i6;
        hf0 Z = aob.Z(v0, aob.v(v02, aob.v0(i2, vnbVar)), hl.L(32.0f), hl.L(32.0f));
        uob M = yob.M(i);
        uob p = yob.p(i, i2);
        frameLayout.setBackground(Z);
        yob.j(frameLayout, Z, M, p, vnbVar);
        iye.b(this, 0.02f, 1.2f);
        de0 de0Var = new de0(context);
        this.d = de0Var;
        de0Var.setRoundRadius(hl.L(18.0f));
        frameLayout.addView(de0Var, tre.d(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 14.0f);
        yob.X(textView, aob.G6, vnbVar);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(hl.o());
        frameLayout.addView(textView, tre.d(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        jtc jtcVar = new jtc(this, context);
        this.h = jtcVar;
        frameLayout.addView(jtcVar, tre.d(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(2131232033);
        yob.s(imageView, aob.D6, vnbVar, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, tre.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new cg(this, vnbVar, runnable, runnable2, (byte) 20));
    }

    public final void a(String str, TLRPC.User user) {
        long j;
        boolean z;
        TLRPC.User user2 = this.r;
        long j2 = 0;
        if (user2 == null) {
            j = 0;
        } else {
            j = user2.id;
        }
        if (user != null) {
            j2 = user.id;
        }
        if (j != j2) {
            z = true;
        } else {
            z = false;
        }
        this.r = user;
        this.s = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.r;
        TextView textView = this.f;
        ImageView imageView = this.n;
        jtc jtcVar = this.h;
        de0 de0Var = this.d;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.r;
            rb0 rb0Var = this.c;
            rb0Var.q(user4);
            de0Var.f(this.r, rb0Var);
            textView.setText(lbc.r(this.r));
            if (!TextUtils.isEmpty(str)) {
                jtcVar.c(str, z);
                imageView.setVisibility(0);
                return;
            }
            jtcVar.c(null, z);
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(0);
            if (this.e == null) {
                ShapeDrawable K = aob.K(hl.L(34.0f), -1);
                this.e = K;
                yob.x(de0Var, K, aob.Fi, this.a, PorterDuff.Mode.SRC_IN);
            }
            de0Var.setImageDrawable(new zm2(this.e, getContext().getResources().getDrawable(2131231833).mutate()));
            textView.setText(ob6.M0(2131742749, null));
            jtcVar.c(str, z);
            imageView.setVisibility(8);
        } else {
            setClickable(false);
            setVisibility(8);
            jtcVar.c(null, true);
        }
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FrameLayout frameLayout = this.b;
        int round = Math.round((getMeasuredHeight() - (frameLayout.getScaleY() * frameLayout.getMeasuredHeight())) / 2.0f);
        frameLayout.layout(0, round, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + round);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        jtc jtcVar = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jtcVar.getLayoutParams();
        int ceil = ((int) Math.ceil(jtcVar.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
        setMeasuredDimension(View.resolveSize(Math.max(getMeasuredWidth(), ceil), i), getMeasuredHeight());
        int max = Math.max(getMeasuredWidth(), ceil);
        float measuredWidth = getMeasuredWidth() / max;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        FrameLayout frameLayout = this.b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
