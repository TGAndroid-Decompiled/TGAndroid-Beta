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
public final class g28 extends View implements vlb {
    public boolean E;
    public int F;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final ylb d;
    public final Drawable e;
    public final uib f;
    public final hd h;
    public final Paint n;
    public uib r;
    public int s;
    public boolean w;
    public x28 x;
    public x28 y;

    public g28(int i, long j, ylb ylbVar, Context context) {
        super(context);
        boolean z;
        boolean z2;
        int i2;
        int i3;
        this.n = new Paint(1);
        this.s = -1;
        oc7 r1 = oc7.r1(i);
        gs gsVar = r1.l4;
        TLRPC.Chat L0 = r1.L0(Long.valueOf(-j));
        this.a = i;
        if (j < 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        if (z && !sd2.V(L0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.c = z2;
        this.d = ylbVar;
        Drawable d = b10.d(context, 2131231795);
        this.e = d;
        anb.x(this, d, cmb.p6, ylbVar, PorterDuff.Mode.SRC_IN);
        if (z) {
            if (z2) {
                i2 = 2131752499;
            } else {
                i2 = 2131752504;
            }
        } else {
            i2 = 2131752483;
        }
        String M0 = jb6.M0(i2, null);
        if (z && !z2 && oc7.r1(i).X3.getInt("boostingappearance", 0) < 3) {
            fc7 fc7Var = r1.E3;
            int i4 = Integer.MAX_VALUE;
            if (fc7Var != null) {
                int min = Math.min(Integer.MAX_VALUE, fc7Var.e(false));
                int max = Math.max(0, r1.E3.e(false));
                int min2 = Math.min(min, r1.E3.f());
                int max2 = Math.max(max, r1.E3.f());
                i4 = min2;
                i3 = max2;
            } else {
                i3 = 0;
            }
            vs2 vs2Var = gsVar.V1;
            vs2 vs2Var2 = gsVar.g2;
            vs2 vs2Var3 = gsVar.f2;
            vs2 vs2Var4 = gsVar.X1;
            vs2 vs2Var5 = gsVar.W1;
            int min3 = Math.min(i4, vs2Var.f());
            int min4 = Math.min(i3, gsVar.V1.f());
            fc7 fc7Var2 = r1.F3;
            if (fc7Var2 != null) {
                int min5 = Math.min(min3, fc7Var2.e(false));
                int max3 = Math.max(min4, r1.F3.e(false));
                min3 = Math.min(min5, r1.F3.f());
                min4 = Math.max(max3, r1.F3.f());
            }
            int min6 = Math.min(min3, vs2Var5.f());
            int max4 = Math.max(min4, vs2Var5.f());
            int min7 = Math.min(min6, vs2Var4.f());
            int max5 = Math.max(max4, vs2Var4.f());
            int min8 = Math.min(min7, vs2Var3.f());
            int max6 = Math.max(max5, vs2Var3.f());
            int min9 = Math.min(min8, vs2Var2.f());
            int max7 = Math.max(max6, vs2Var2.f());
            int i5 = L0 != null ? L0.level : 0;
            if (i5 < max7) {
                this.h = new hd(Math.max(i5, min9), ylbVar, context, true);
            }
        }
        setContentDescription(M0);
        this.f = new uib(M0, 16.0f, null);
        updateColors();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        float L;
        int L2;
        int y;
        int measuredWidth;
        int y2;
        int measuredWidth2;
        Paint paint;
        float L3;
        int measuredWidth3;
        int L4 = gm.L(64.0f) / 2;
        if (jb6.a0) {
            L4 = getMeasuredWidth() - L4;
        }
        Drawable drawable = this.e;
        ur3.d(drawable, L4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - gm.L(171.0f);
        int i2 = 0;
        hd hdVar = this.h;
        if (hdVar != null) {
            i = gm.L(8.0f) + hdVar.getIntrinsicWidth();
        } else {
            i = 0;
        }
        uib uibVar = this.f;
        uibVar.p = measuredWidth4 - i;
        if (jb6.a0) {
            L = (getMeasuredWidth() - uibVar.j()) - gm.L(71.0f);
        } else {
            L = gm.L(71.0f);
        }
        uibVar.e(canvas, L, getMeasuredHeight() / 2.0f);
        if (hdVar != null) {
            int j = (int) (uibVar.j() + L + gm.L(6.0f));
            hdVar.setBounds(j, 0, j, getHeight());
            hdVar.draw(canvas);
        }
        ylb ylbVar = this.d;
        boolean z = this.c;
        if (z && this.y != null) {
            if (jb6.a0) {
                measuredWidth3 = gm.L(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - gm.L(24.0f);
            }
            this.y.setBounds(measuredWidth3 - gm.L(11.0f), wi8.D(11.0f, getMeasuredHeight(), 2), measuredWidth3, (gm.L(11.0f) + getMeasuredHeight()) / 2);
            this.y.f(gm.N(3.0f), cmb.v0(cmb.c6, ylbVar));
            this.y.draw(canvas);
        } else if (this.x != null && this.y != null) {
            if (jb6.a0) {
                measuredWidth2 = gm.L(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - gm.L(24.0f);
            }
            this.y.setBounds(measuredWidth2 - gm.L(11.0f), wi8.D(11.0f, getMeasuredHeight(), 2), measuredWidth2, (gm.L(11.0f) + getMeasuredHeight()) / 2);
            x28 x28Var = this.y;
            float N = gm.N(3.0f);
            int i3 = cmb.c6;
            x28Var.f(N, cmb.v0(i3, ylbVar));
            this.y.draw(canvas);
            int L5 = measuredWidth2 - gm.L(18.0f);
            this.x.setBounds(L5 - gm.L(11.0f), wi8.D(11.0f, getMeasuredHeight(), 2), L5, (gm.L(11.0f) + getMeasuredHeight()) / 2);
            this.x.f(gm.N(3.0f), cmb.v0(i3, ylbVar));
            this.x.draw(canvas);
        } else if (this.r != null && !z) {
            float measuredWidth5 = getMeasuredWidth() - gm.L(116.0f);
            float j2 = uibVar.j();
            if (hdVar == null) {
                L2 = 0;
            } else {
                L2 = gm.L(12.0f) + hdVar.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(j2 + L2, getMeasuredWidth() - gm.L(164.0f)));
            int min2 = (int) Math.min(this.r.j(), min);
            RectF rectF = gm.P;
            if (jb6.a0) {
                y = gm.L(15.0f);
            } else {
                y = kt6.y(33.0f, getMeasuredWidth(), min2);
            }
            float f = y;
            float measuredHeight = (getMeasuredHeight() - gm.L(22.0f)) / 2.0f;
            if (jb6.a0) {
                measuredWidth = gm.L(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - gm.L(15.0f);
            }
            rectF.set(f, measuredHeight, measuredWidth, (gm.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), this.n);
            uib uibVar2 = this.r;
            uibVar2.p = min;
            if (jb6.a0) {
                y2 = gm.L(24.0f);
            } else {
                y2 = kt6.y(24.0f, getMeasuredWidth(), min2);
            }
            uibVar2.e(canvas, y2, getMeasuredHeight() / 2.0f);
        }
        if (this.w) {
            if (ylbVar != null) {
                paint = ylbVar.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = cmb.j0;
            }
            Paint paint2 = paint;
            if (jb6.a0) {
                L3 = 0.0f;
            } else {
                L3 = gm.L(71.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth6 = getMeasuredWidth();
            if (jb6.a0) {
                i2 = gm.L(71.0f);
            }
            canvas.drawLine(L3, measuredHeight2, measuredWidth6 - i2, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(50.0f) + (this.w ? 1 : 0), 1073741824));
    }

    public void set(TLRPC.User user) {
        String trim;
        x28 x28Var;
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
        ec7 ec7Var = null;
        this.r = new uib(gw3.m(trim, cmb.n2.getFontMetricsInt(), false, null, 0), 13.0f, gm.o());
        x28 x28Var2 = this.x;
        if (x28Var2 != null) {
            x28Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i4 = this.a;
        if (z) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i5 = x28.j;
            int i6 = tL_emojiStatusCollectible.center_color | (-16777216);
            x28Var = new x28(i6, i6, i6, tL_emojiStatusCollectible.document_id);
            this.x = x28Var;
        } else {
            if (m9c.n(user) >= 0) {
                x28 c = x28.c(i4, m9c.n(user));
                c.a = gm.L(11.0f);
                c.d();
                x28Var = c;
            } else {
                x28Var = null;
            }
            this.x = x28Var;
        }
        if (x28Var != null) {
            x28Var.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z2 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.n;
        ylb ylbVar = this.d;
        if (z2) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            if (ylbVar != null) {
                o = ylbVar.a();
            } else {
                o = cmb.I.o();
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
            paint.setColor(cmb.p1(0.1f, i));
            x28 x28Var3 = new x28(intValue, i2, i3, tL_peerColorCollectible.gift_emoji_id);
            x28Var3.a = gm.L(11.0f);
            x28Var3.d();
            this.y = x28Var3;
            x28Var3.e(this);
            return;
        }
        int f = m9c.f(user);
        if (f < 7) {
            int i7 = cmb.q8[f];
            this.s = i7;
            v0 = cmb.v0(i7, ylbVar);
        } else {
            fc7 fc7Var = oc7.r1(z8c.t0).E3;
            if (fc7Var != null) {
                ec7Var = fc7Var.d(f);
            }
            if (ec7Var != null) {
                this.s = -1;
                v0 = ec7Var.f();
            } else {
                int i8 = cmb.q8[0];
                this.s = i8;
                v0 = cmb.v0(i8, ylbVar);
            }
        }
        this.r.m(v0);
        paint.setColor(cmb.p1(0.1f, v0));
        x28 a = x28.a(i4, f);
        a.a = gm.L(11.0f);
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
            i = cmb.l6;
        } else {
            i = cmb.p6;
        }
        ylb ylbVar = this.d;
        int v0 = cmb.v0(i, ylbVar);
        if (!this.E || this.F != v0) {
            this.E = true;
            this.F = v0;
            this.e.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        }
        if (z) {
            i2 = cmb.F6;
        } else {
            i2 = cmb.p6;
        }
        this.f.m(cmb.v0(i2, ylbVar));
        if (this.r != null && (paint = this.n) != null && (i3 = this.s) != -1) {
            int v02 = cmb.v0(i3, ylbVar);
            this.r.m(v02);
            paint.setColor(cmb.p1(0.1f, v02));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
