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
public final class r7 extends FrameLayout implements s84, snb {
    public int E;
    public int F;
    public zm2 G;
    public int H;
    public int I;
    public ColorFilter J;
    public int K;
    public final fm0 a;
    public zm2 b;
    public final de0 c;
    public final ImageView d;
    public final TextView e;
    public ph4 f;
    public final c1 h;
    public final vnb n;
    public boolean r;
    public boolean s;
    public int w;
    public int x;
    public zm2 y;

    public r7(Context context, vnb vnbVar) {
        super(context);
        this.a = new fm0(0, this, k43.h, 380L, false);
        this.h = new c1(this, (byte) 4);
        this.n = vnbVar;
        de0 de0Var = new de0(context);
        this.c = de0Var;
        addView(de0Var, tre.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(2131231272);
        addView(imageView, tre.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, tre.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.x = hl.L(28.0f);
        updateColors();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i = this.x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i, i, aob.l0(this.w));
        super.dispatchDraw(canvas);
    }

    public ph4 getFilter() {
        return this.f;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(135.0f), Integer.MIN_VALUE), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setData(ph4 ph4Var) {
        this.f = ph4Var;
        this.s = false;
        String str = ph4Var.c;
        if (str == null) {
            str = ob6.M0(ph4Var.b, null);
        }
        this.e.setText(str);
        zm2 M = aob.M(hl.L(32.0f), ph4Var.a);
        this.b = M;
        int i = aob.Fi;
        vnb vnbVar = this.n;
        aob.z1(M, aob.v0(i, vnbVar), false);
        zm2 zm2Var = this.b;
        int i2 = aob.Ji;
        aob.z1(zm2Var, aob.v0(i2, vnbVar), true);
        byte b = ph4Var.d;
        float f = 16.0f;
        de0 de0Var = this.c;
        if (b == 4) {
            TLObject tLObject = ph4Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (yac.h(yac.t0).f().id == user.id) {
                    zm2 M2 = aob.M(hl.L(32.0f), 2131231002);
                    int L = hl.L(16.0f);
                    int L2 = hl.L(16.0f);
                    M2.e = L;
                    M2.f = L2;
                    aob.z1(M2, aob.v0(i, vnbVar), false);
                    aob.z1(M2, aob.v0(i2, vnbVar), true);
                    de0Var.setImageDrawable(M2);
                    return;
                }
                de0Var.getImageReceiver().q0(hl.L(16.0f));
                de0Var.getImageReceiver().U(user, this.b, null);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = xc2.Y(chat);
                ImageReceiver imageReceiver = de0Var.getImageReceiver();
                if (this.s) {
                    f = 10.0f;
                }
                int L3 = hl.L(f);
                this.x = L3;
                imageReceiver.q0(L3);
                de0Var.getImageReceiver().U(chat, this.b, null);
            }
        } else if (b == 7) {
            zm2 M3 = aob.M(hl.L(32.0f), 2131230995);
            int L4 = hl.L(16.0f);
            int L5 = hl.L(16.0f);
            M3.e = L4;
            M3.f = L5;
            aob.z1(M3, aob.v0(i, vnbVar), false);
            aob.z1(M3, aob.v0(i2, vnbVar), true);
            de0Var.setImageDrawable(M3);
            this.y = M3;
            this.E = aob.v0(i, vnbVar);
            this.F = aob.v0(i2, vnbVar);
        } else {
            de0Var.setImageDrawable(this.b);
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
            c1 c1Var = this.h;
            hl.r(c1Var);
            fm0Var.a(z, true);
            if (z) {
                hl.d3(c1Var, 2000L);
            }
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override
    public final void updateColors() {
        int v0;
        float f = this.a.e;
        boolean z = this.r;
        vnb vnbVar = this.n;
        if (z) {
            v0 = aob.p1(0.075f, aob.v0(aob.G6, vnbVar));
        } else {
            v0 = aob.v0(aob.Ti, vnbVar);
        }
        int i = aob.Fi;
        int v02 = aob.v0(i, vnbVar);
        int v03 = aob.v0(aob.G6, vnbVar);
        int i2 = aob.Ji;
        int v04 = aob.v0(i2, vnbVar);
        this.w = vm2.f(f, v0, v02);
        this.e.setTextColor(vm2.f(f, v03, v04));
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
        int v05 = aob.v0(i, vnbVar);
        int v06 = aob.v0(i2, vnbVar);
        zm2 zm2Var = this.b;
        if (zm2Var != null && (zm2Var != this.G || v05 != this.H || v06 != this.I)) {
            aob.z1(zm2Var, v05, false);
            aob.z1(this.b, v06, true);
            this.G = this.b;
            this.H = v05;
            this.I = v06;
        }
        float f3 = 1.0f - f;
        de0 de0Var = this.c;
        de0Var.setAlpha(f3);
        ph4 ph4Var = this.f;
        if (ph4Var != null && ph4Var.d == 7) {
            zm2 zm2Var2 = this.y;
            if (zm2Var2 != null) {
                if (v05 != this.E || v06 != this.F) {
                    aob.z1(zm2Var2, v05, false);
                    aob.z1(this.y, v06, true);
                    this.E = v05;
                    this.F = v06;
                    de0Var.invalidate();
                }
            } else {
                setData(ph4Var);
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void v0(float f, int i) {
    }
}
