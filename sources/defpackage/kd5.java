package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class kd5 extends FrameLayout {
    public final n84 a;
    public final hd5 b;
    public final TextView c;
    public final l46 d;
    public final wjb e;
    public final i46 f;
    public final Paint[] h;
    public ValueAnimator n;

    public kd5(Context context, wjb wjbVar) {
        super(context);
        this.e = wjbVar;
        LinearLayout j = de9.j(context, 1);
        n84 n84Var = new n84(context, 1, 0, (byte) 1);
        this.a = n84Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i = bkb.Ck;
        canvas.drawColor(bm2.f(0.5f, bkb.v0(i, wjbVar), bkb.v0(bkb.g5, wjbVar)));
        n84Var.setBackgroundBitmap(createBitmap);
        uq4 uq4Var = n84Var.b;
        uq4Var.z = i;
        uq4Var.A = bkb.Bk;
        uq4Var.b();
        j.addView(n84Var, nme.r(160, 160, 1));
        hd5 hd5Var = new hd5(this, context);
        this.b = hd5Var;
        this.h = new Paint[20];
        a(0.0f);
        bra braVar = hd5Var.a;
        braVar.q = false;
        braVar.J = false;
        braVar.K = true;
        braVar.H = true;
        braVar.l = new z02(this, (byte) 3);
        braVar.c();
        n84Var.setStarParticlesView(hd5Var);
        TextView textView = new TextView(context);
        this.c = textView;
        ug8.v(textView, 1, 22.0f);
        int i2 = bkb.F6;
        zkb.X(textView, i2, wjbVar);
        textView.setGravity(1);
        j.addView(textView, nme.t(-2, -2, 1, 24, -8, 24, 0));
        i46 i46Var = new i46(this);
        this.f = i46Var;
        l46 l46Var = new l46(context, i46Var, wjbVar);
        this.d = l46Var;
        l46Var.setTextSize(1, 15.0f);
        l46Var.setGravity(17);
        zkb.X(l46Var, i2, wjbVar);
        l46Var.setMovementMethod(LinkMovementMethod.getInstance());
        zkb.G(l46Var, bkb.I6, wjbVar);
        l46Var.setImportantForAccessibility(2);
        j.addView(l46Var, nme.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(hd5Var, nme.e(-1, 234, 48));
        addView(j);
        setWillNotDraw(false);
    }

    public final void a(float f) {
        int i = bkb.Bk;
        wjb wjbVar = this.e;
        int v0 = bkb.v0(i, wjbVar);
        int v02 = bkb.v0(bkb.Ck, wjbVar);
        int f2 = bm2.f(f, v0, -371690);
        int f3 = bm2.f(f, v02, -14281);
        int i2 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i2 < paintArr.length) {
                paintArr[i2] = new Paint(1);
                paintArr[i2].setColorFilter(new PorterDuffColorFilter(bm2.f(i2 / (paintArr.length - 1), f2, f3), PorterDuff.Mode.SRC_IN));
                i2++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i46 i46Var = this.f;
        if (i46Var != null) {
            canvas.save();
            l46 l46Var = this.d;
            canvas.translate(l46Var.getLeft(), l46Var.getTop());
            if (i46Var.g(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        n84 n84Var = this.a;
        float measuredHeight = n84Var.getMeasuredHeight() / 2.0f;
        hd5 hd5Var = this.b;
        hd5Var.setTranslationY((measuredHeight + n84Var.getTop()) - (hd5Var.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -gl.L(6.0f);
        setLayoutParams(marginLayoutParams);
        int i2 = bkb.Z6;
        wjb wjbVar = this.e;
        zkb.h(i2, wjbVar, this);
        this.c.setText(k96.a0("BoostingBoostsViaGifts", null, 2131753559, new Object[0]));
        if (hc2.V(chat)) {
            i = 2131753507;
        } else {
            i = 2131753502;
        }
        String a0 = k96.a0(null, null, i, new Object[0]);
        l46 l46Var = this.d;
        l46Var.setText(a0);
        zkb.X(l46Var, bkb.q5, wjbVar);
    }

    public void setPaused(boolean z) {
        this.a.setPaused(z);
        this.b.setPaused(z);
    }

    public void setStars(final boolean z) {
        final float f;
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        n84 n84Var = this.a;
        final float f2 = n84Var.b.l;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        gl.r(n84Var.f0);
        n84Var.a();
        n84Var.l();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i;
                kd5 kd5Var = kd5.this;
                float[] fArr2 = fArr;
                float f3 = f2;
                float f4 = f;
                boolean z2 = z;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f5 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                kd5Var.a.b.l = gl.R1(f3, f4, floatValue);
                uq4 uq4Var = kd5Var.a.b;
                float f6 = uq4Var.f;
                float f7 = f5 * 360.0f;
                if (z2) {
                    i = 1;
                } else {
                    i = -1;
                }
                uq4Var.f = (f7 * i) + f6;
                kd5Var.a.b.b();
                kd5Var.a(kd5Var.a.b.l);
            }
        });
        this.n.addListener(new jd5(this, fArr, f2, f, z));
        this.n.setDuration(680L);
        this.n.setInterpolator(s33.h);
        this.n.start();
    }
}
