package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q7 extends FrameLayout implements x74, tjb {
    public int E;
    public int F;
    public fm2 G;
    public int H;
    public int I;
    public ColorFilter J;
    public int K;
    public final fm0 a;
    public fm2 b;
    public final be0 c;
    public final ImageView d;
    public final TextView e;
    public rf4 f;
    public final b1 h;
    public final wjb n;
    public boolean r;
    public boolean s;
    public int w;
    public int x;
    public fm2 y;

    public q7(Context context, wjb wjbVar) {
        super(context);
        this.a = new fm0(0, this, s33.h, 380L, false);
        this.h = new b1(this, (byte) 4);
        this.n = wjbVar;
        be0 be0Var = new be0(context);
        this.c = be0Var;
        addView(be0Var, nme.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(2131231272);
        addView(imageView, nme.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, nme.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.x = gl.L(28.0f);
        updateColors();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i = this.x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i, i, bkb.l0(this.w));
        super.dispatchDraw(canvas);
    }

    public rf4 getFilter() {
        return this.f;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(135.0f), Integer.MIN_VALUE), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            updateColors();
            invalidate();
        }
    }

    public void setData(rf4 rf4Var) {
        this.f = rf4Var;
        this.s = false;
        String str = rf4Var.c;
        if (str == null) {
            str = k96.M0(rf4Var.b, null);
        }
        this.e.setText(str);
        fm2 M = bkb.M(gl.L(32.0f), rf4Var.a);
        this.b = M;
        int i = bkb.Ei;
        wjb wjbVar = this.n;
        bkb.z1(M, bkb.v0(i, wjbVar), false);
        fm2 fm2Var = this.b;
        int i2 = bkb.Ii;
        bkb.z1(fm2Var, bkb.v0(i2, wjbVar), true);
        byte b = rf4Var.d;
        float f = 16.0f;
        be0 be0Var = this.c;
        if (b == 4) {
            TLObject tLObject = rf4Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (y6c.h(y6c.t0).f().id == user.id) {
                    fm2 M2 = bkb.M(gl.L(32.0f), 2131231002);
                    int L = gl.L(16.0f);
                    int L2 = gl.L(16.0f);
                    M2.e = L;
                    M2.f = L2;
                    bkb.z1(M2, bkb.v0(i, wjbVar), false);
                    bkb.z1(M2, bkb.v0(i2, wjbVar), true);
                    be0Var.setImageDrawable(M2);
                    return;
                }
                be0Var.getImageReceiver().q0(gl.L(16.0f));
                be0Var.getImageReceiver().U(user, this.b, null);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = hc2.Y(chat);
                ImageReceiver imageReceiver = be0Var.getImageReceiver();
                if (this.s) {
                    f = 10.0f;
                }
                int L3 = gl.L(f);
                this.x = L3;
                imageReceiver.q0(L3);
                be0Var.getImageReceiver().U(chat, this.b, null);
            }
        } else if (b == 7) {
            fm2 M3 = bkb.M(gl.L(32.0f), 2131230995);
            int L4 = gl.L(16.0f);
            int L5 = gl.L(16.0f);
            M3.e = L4;
            M3.f = L5;
            bkb.z1(M3, bkb.v0(i, wjbVar), false);
            bkb.z1(M3, bkb.v0(i2, wjbVar), true);
            be0Var.setImageDrawable(M3);
            this.y = M3;
            this.E = bkb.v0(i, wjbVar);
            this.F = bkb.v0(i2, wjbVar);
        } else {
            be0Var.setImageDrawable(this.b);
        }
    }

    public void setExpanded(boolean z) {
        TextView textView = this.e;
        if (z) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z) {
        fm0 fm0Var = this.a;
        if (fm0Var.f != z) {
            b1 b1Var = this.h;
            gl.r(b1Var);
            fm0Var.a(z, true);
            if (z) {
                gl.d3(b1Var, 2000L);
            }
        }
    }

    @Override
    public final void updateColors() {
        int v0;
        float f = this.a.e;
        boolean z = this.r;
        wjb wjbVar = this.n;
        if (z) {
            v0 = bkb.p1(0.075f, bkb.v0(bkb.F6, wjbVar));
        } else {
            v0 = bkb.v0(bkb.Si, wjbVar);
        }
        int i = bkb.Ei;
        int v02 = bkb.v0(i, wjbVar);
        int v03 = bkb.v0(bkb.F6, wjbVar);
        int i2 = bkb.Ii;
        int v04 = bkb.v0(i2, wjbVar);
        this.w = bm2.f(f, v0, v02);
        this.e.setTextColor(bm2.f(f, v03, v04));
        ImageView imageView = this.d;
        if (imageView.getColorFilter() != this.J || this.K != v04) {
            imageView.setColorFilter(v04);
            this.J = imageView.getColorFilter();
            this.K = v04;
        }
        imageView.setAlpha(f);
        float f2 = 0.82f * f;
        imageView.setScaleX(f2);
        imageView.setScaleY(f2);
        int v05 = bkb.v0(i, wjbVar);
        int v06 = bkb.v0(i2, wjbVar);
        fm2 fm2Var = this.b;
        if (fm2Var != null && (fm2Var != this.G || v05 != this.H || v06 != this.I)) {
            bkb.z1(fm2Var, v05, false);
            bkb.z1(this.b, v06, true);
            this.G = this.b;
            this.H = v05;
            this.I = v06;
        }
        float f3 = 1.0f - f;
        be0 be0Var = this.c;
        be0Var.setAlpha(f3);
        rf4 rf4Var = this.f;
        if (rf4Var != null && rf4Var.d == 7) {
            fm2 fm2Var2 = this.y;
            if (fm2Var2 != null) {
                if (v05 != this.E || v06 != this.F) {
                    bkb.z1(fm2Var2, v05, false);
                    bkb.z1(this.y, v06, true);
                    this.E = v05;
                    this.F = v06;
                    be0Var.invalidate();
                }
            } else {
                setData(rf4Var);
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void F(float f, int i) {
    }
}
