package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class d08 extends View implements tjb {
    public boolean E;
    public int F;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final wjb d;
    public final Drawable e;
    public final tgb f;
    public final gc h;
    public final Paint n;
    public tgb r;
    public int s;
    public boolean w;
    public u08 x;
    public u08 y;

    public d08(int i, long j, wjb wjbVar, Context context) {
        super(context);
        boolean z;
        boolean z2;
        int i2;
        int i3;
        this.n = new Paint(1);
        this.s = -1;
        na7 q1 = na7.q1(i);
        gr grVar = q1.k4;
        TLRPC.Chat K0 = q1.K0(Long.valueOf(-j));
        this.a = i;
        if (j < 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        if (z && !hc2.V(K0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.c = z2;
        this.d = wjbVar;
        Drawable d = b00.d(context, 2131231794);
        this.e = d;
        zkb.x(this, d, bkb.p6, wjbVar, PorterDuff.Mode.SRC_IN);
        if (z) {
            if (z2) {
                i2 = 2131752534;
            } else {
                i2 = 2131752539;
            }
        } else {
            i2 = 2131752518;
        }
        String M0 = k96.M0(i2, null);
        if (z && !z2 && na7.q1(i).X3.getInt("boostingappearance", 0) < 3) {
            ea7 ea7Var = q1.E3;
            int i4 = Integer.MAX_VALUE;
            if (ea7Var != null) {
                int min = Math.min(Integer.MAX_VALUE, ea7Var.e(false));
                int max = Math.max(0, q1.E3.e(false));
                int min2 = Math.min(min, q1.E3.f());
                int max2 = Math.max(max, q1.E3.f());
                i4 = min2;
                i3 = max2;
            } else {
                i3 = 0;
            }
            kr2 kr2Var = grVar.V1;
            kr2 kr2Var2 = grVar.g2;
            kr2 kr2Var3 = grVar.f2;
            kr2 kr2Var4 = grVar.X1;
            kr2 kr2Var5 = grVar.W1;
            int min3 = Math.min(i4, kr2Var.f());
            int min4 = Math.min(i3, grVar.V1.f());
            ea7 ea7Var2 = q1.F3;
            if (ea7Var2 != null) {
                int min5 = Math.min(min3, ea7Var2.e(false));
                int max3 = Math.max(min4, q1.F3.e(false));
                min3 = Math.min(min5, q1.F3.f());
                min4 = Math.max(max3, q1.F3.f());
            }
            int min6 = Math.min(min3, kr2Var5.f());
            int max4 = Math.max(min4, kr2Var5.f());
            int min7 = Math.min(min6, kr2Var4.f());
            int max5 = Math.max(max4, kr2Var4.f());
            int min8 = Math.min(min7, kr2Var3.f());
            int max6 = Math.max(max5, kr2Var3.f());
            int min9 = Math.min(min8, kr2Var2.f());
            int max7 = Math.max(max6, kr2Var2.f());
            int i5 = K0 != null ? K0.level : 0;
            if (i5 < max7) {
                this.h = new gc(Math.max(i5, min9), wjbVar, context, true);
            }
        }
        setContentDescription(M0);
        this.f = new tgb(M0, 16.0f, null);
        updateColors();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        float L;
        int L2;
        int x;
        int measuredWidth;
        int x2;
        int measuredWidth2;
        Paint paint;
        float L3;
        int measuredWidth3;
        int L4 = gl.L(64.0f) / 2;
        if (k96.a0) {
            L4 = getMeasuredWidth() - L4;
        }
        Drawable drawable = this.e;
        kq3.d(drawable, L4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - gl.L(171.0f);
        int i2 = 0;
        gc gcVar = this.h;
        if (gcVar != null) {
            i = gl.L(8.0f) + gcVar.getIntrinsicWidth();
        } else {
            i = 0;
        }
        tgb tgbVar = this.f;
        tgbVar.p = measuredWidth4 - i;
        if (k96.a0) {
            L = (getMeasuredWidth() - tgbVar.j()) - gl.L(71.0f);
        } else {
            L = gl.L(71.0f);
        }
        tgbVar.e(canvas, L, getMeasuredHeight() / 2.0f);
        if (gcVar != null) {
            int j = (int) (tgbVar.j() + L + gl.L(6.0f));
            gcVar.setBounds(j, 0, j, getHeight());
            gcVar.draw(canvas);
        }
        wjb wjbVar = this.d;
        boolean z = this.c;
        if (z && this.y != null) {
            if (k96.a0) {
                measuredWidth3 = gl.L(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - gl.L(24.0f);
            }
            this.y.setBounds(measuredWidth3 - gl.L(11.0f), ug8.D(11.0f, getMeasuredHeight(), 2), measuredWidth3, (gl.L(11.0f) + getMeasuredHeight()) / 2);
            this.y.f(gl.N(3.0f), bkb.v0(bkb.c6, wjbVar));
            this.y.draw(canvas);
        } else if (this.x != null && this.y != null) {
            if (k96.a0) {
                measuredWidth2 = gl.L(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - gl.L(24.0f);
            }
            this.y.setBounds(measuredWidth2 - gl.L(11.0f), ug8.D(11.0f, getMeasuredHeight(), 2), measuredWidth2, (gl.L(11.0f) + getMeasuredHeight()) / 2);
            u08 u08Var = this.y;
            float N = gl.N(3.0f);
            int i3 = bkb.c6;
            u08Var.f(N, bkb.v0(i3, wjbVar));
            this.y.draw(canvas);
            int L5 = measuredWidth2 - gl.L(18.0f);
            this.x.setBounds(L5 - gl.L(11.0f), ug8.D(11.0f, getMeasuredHeight(), 2), L5, (gl.L(11.0f) + getMeasuredHeight()) / 2);
            this.x.f(gl.N(3.0f), bkb.v0(i3, wjbVar));
            this.x.draw(canvas);
        } else if (this.r != null && !z) {
            float measuredWidth5 = getMeasuredWidth() - gl.L(116.0f);
            float j2 = tgbVar.j();
            if (gcVar == null) {
                L2 = 0;
            } else {
                L2 = gl.L(12.0f) + gcVar.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(j2 + L2, getMeasuredWidth() - gl.L(164.0f)));
            int min2 = (int) Math.min(this.r.j(), min);
            RectF rectF = gl.P;
            if (k96.a0) {
                x = gl.L(15.0f);
            } else {
                x = ls6.x(33.0f, getMeasuredWidth(), min2);
            }
            float f = x;
            float measuredHeight = (getMeasuredHeight() - gl.L(22.0f)) / 2.0f;
            if (k96.a0) {
                measuredWidth = gl.L(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - gl.L(15.0f);
            }
            rectF.set(f, measuredHeight, measuredWidth, (gl.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), this.n);
            tgb tgbVar2 = this.r;
            tgbVar2.p = min;
            if (k96.a0) {
                x2 = gl.L(24.0f);
            } else {
                x2 = ls6.x(24.0f, getMeasuredWidth(), min2);
            }
            tgbVar2.e(canvas, x2, getMeasuredHeight() / 2.0f);
        }
        if (this.w) {
            if (wjbVar != null) {
                paint = wjbVar.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = bkb.j0;
            }
            Paint paint2 = paint;
            if (k96.a0) {
                L3 = 0.0f;
            } else {
                L3 = gl.L(71.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth6 = getMeasuredWidth();
            if (k96.a0) {
                i2 = gl.L(71.0f);
            }
            canvas.drawLine(L3, measuredHeight2, measuredWidth6 - i2, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(50.0f) + (this.w ? 1 : 0), 1073741824));
    }

    public void set(TLRPC.User user) {
        String trim;
        u08 u08Var;
        int v0;
        boolean o;
        int i;
        ArrayList<Integer> arrayList;
        int i2;
        int i3;
        if (user == null) {
            return;
        }
        String str = user.first_name;
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        int indexOf = trim.indexOf(" ");
        if (indexOf > 0) {
            trim = trim.substring(0, indexOf);
        }
        da7 da7Var = null;
        this.r = new tgb(vu3.m(trim, bkb.n2.getFontMetricsInt(), false, null, 0), 13.0f, gl.o());
        u08 u08Var2 = this.x;
        if (u08Var2 != null) {
            u08Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i4 = this.a;
        if (z) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i5 = u08.j;
            int i6 = tL_emojiStatusCollectible.center_color | (-16777216);
            u08Var = new u08(i6, i6, i6, tL_emojiStatusCollectible.document_id);
            this.x = u08Var;
        } else {
            if (l7c.n(user) >= 0) {
                u08 c = u08.c(i4, l7c.n(user));
                c.a = gl.L(11.0f);
                c.d();
                u08Var = c;
            } else {
                u08Var = null;
            }
            this.x = u08Var;
        }
        if (u08Var != null) {
            u08Var.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z2 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.n;
        wjb wjbVar = this.d;
        if (z2) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            if (wjbVar != null) {
                o = wjbVar.a();
            } else {
                o = bkb.I.o();
            }
            if (o && (tL_peerColorCollectible.flags & 1) != 0) {
                i = tL_peerColorCollectible.dark_accent_color;
            } else {
                i = tL_peerColorCollectible.accent_color;
            }
            if (!o || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            if (arrayList.size() >= 2) {
                i2 = arrayList.get(1).intValue() | (-16777216);
            } else {
                i2 = intValue;
            }
            if (arrayList.size() >= 3) {
                i3 = arrayList.get(2).intValue() | (-16777216);
            } else {
                i3 = intValue;
            }
            this.r.m(i);
            paint.setColor(bkb.p1(0.1f, i));
            u08 u08Var3 = new u08(intValue, i2, i3, tL_peerColorCollectible.gift_emoji_id);
            u08Var3.a = gl.L(11.0f);
            u08Var3.d();
            this.y = u08Var3;
            u08Var3.e(this);
            return;
        }
        int f = l7c.f(user);
        if (f < 7) {
            int i7 = bkb.q8[f];
            this.s = i7;
            v0 = bkb.v0(i7, wjbVar);
        } else {
            ea7 ea7Var = na7.q1(y6c.t0).E3;
            if (ea7Var != null) {
                da7Var = ea7Var.d(f);
            }
            if (da7Var != null) {
                this.s = -1;
                v0 = da7Var.f();
            } else {
                int i8 = bkb.q8[0];
                this.s = i8;
                v0 = bkb.v0(i8, wjbVar);
            }
        }
        this.r.m(v0);
        paint.setColor(bkb.p1(0.1f, v0));
        u08 a = u08.a(i4, f);
        a.a = gl.L(11.0f);
        a.d();
        this.y = a;
    }

    @Override
    public final void updateColors() {
        int i;
        int i2;
        Paint paint;
        int i3;
        boolean z = this.b;
        if (z) {
            i = bkb.l6;
        } else {
            i = bkb.p6;
        }
        wjb wjbVar = this.d;
        int v0 = bkb.v0(i, wjbVar);
        if (!this.E || this.F != v0) {
            this.E = true;
            this.F = v0;
            this.e.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        }
        if (z) {
            i2 = bkb.F6;
        } else {
            i2 = bkb.p6;
        }
        this.f.m(bkb.v0(i2, wjbVar));
        if (this.r != null && (paint = this.n) != null && (i3 = this.s) != -1) {
            int v02 = bkb.v0(i3, wjbVar);
            this.r.m(v02);
            paint.setColor(bkb.p1(0.1f, v02));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
