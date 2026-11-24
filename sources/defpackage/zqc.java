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
public final class zqc extends FrameLayout {
    public final ylb a;
    public final FrameLayout b;
    public final pc0 c;
    public final bf0 d;
    public ShapeDrawable e;
    public final TextView f;
    public final yqc h;
    public final ImageView n;
    public TLRPC.User r;
    public String s;

    public zqc(ylb ylbVar, Context context, Runnable runnable, Runnable runnable2) {
        super(context);
        this.c = new pc0((ylb) null);
        this.a = ylbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, qoe.c(-1.0f, -1));
        int i = cmb.Z6;
        int v0 = cmb.v0(i, ylbVar);
        int v02 = cmb.v0(i, ylbVar);
        int i2 = cmb.h6;
        fg0 Z = cmb.Z(v0, cmb.v(v02, cmb.v0(i2, ylbVar)), gm.L(32.0f), gm.L(32.0f));
        wmb M = anb.M(i);
        wmb p = anb.p(i, i2);
        frameLayout.setBackground(Z);
        anb.j(frameLayout, Z, M, p, ylbVar);
        rve.b(this, 0.02f, 1.2f);
        bf0 bf0Var = new bf0(context);
        this.d = bf0Var;
        bf0Var.setRoundRadius(gm.L(18.0f));
        frameLayout.addView(bf0Var, qoe.d(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 14.0f);
        anb.X(textView, cmb.F6, ylbVar);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(gm.o());
        frameLayout.addView(textView, qoe.d(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        yqc yqcVar = new yqc(this, context);
        this.h = yqcVar;
        frameLayout.addView(yqcVar, qoe.d(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(2131232034);
        anb.s(imageView, cmb.C6, ylbVar, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, qoe.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new ef(this, ylbVar, runnable, runnable2, (byte) 20));
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
        yqc yqcVar = this.h;
        bf0 bf0Var = this.d;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.r;
            pc0 pc0Var = this.c;
            pc0Var.q(user4);
            bf0Var.f(this.r, pc0Var);
            textView.setText(m9c.r(this.r));
            if (!TextUtils.isEmpty(str)) {
                yqcVar.c(str, z);
                imageView.setVisibility(0);
                return;
            }
            yqcVar.c(null, z);
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(0);
            if (this.e == null) {
                ShapeDrawable K = cmb.K(gm.L(34.0f), -1);
                this.e = K;
                anb.x(bf0Var, K, cmb.Ei, this.a, PorterDuff.Mode.SRC_IN);
            }
            bf0Var.setImageDrawable(new sn2(this.e, getContext().getResources().getDrawable(2131231834).mutate()));
            textView.setText(jb6.M0(2131742781, null));
            yqcVar.c(str, z);
            imageView.setVisibility(8);
        } else {
            setClickable(false);
            setVisibility(8);
            yqcVar.c(null, true);
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
        yqc yqcVar = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yqcVar.getLayoutParams();
        int ceil = ((int) Math.ceil(yqcVar.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
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
