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
public final class j38 extends View implements snb {
    public boolean E;
    public int F;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final vnb d;
    public final Drawable e;
    public final pkb f;
    public final hc h;
    public final Paint n;
    public pkb r;
    public int s;
    public boolean w;
    public b48 x;
    public b48 y;

    public j38(int i, long j, vnb vnbVar, Context context) {
        super(context);
        boolean z;
        boolean z2;
        int i2;
        int i3;
        this.n = new Paint(1);
        this.s = -1;
        uc7 s1 = uc7.s1(i);
        hr hrVar = s1.l4;
        TLRPC.Chat M0 = s1.M0(Long.valueOf(-j));
        this.a = i;
        if (j < 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        if (z && !xc2.V(M0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.c = z2;
        this.d = vnbVar;
        Drawable e = c00.e(context, 2131231794);
        this.e = e;
        yob.x(this, e, aob.q6, vnbVar, PorterDuff.Mode.SRC_IN);
        if (z) {
            if (z2) {
                i2 = 2131752527;
            } else {
                i2 = 2131752532;
            }
        } else {
            i2 = 2131752511;
        }
        String M02 = ob6.M0(i2, null);
        if (z && !z2 && uc7.s1(i).Y3.getInt("boostingappearance", 0) < 3) {
            lc7 lc7Var = s1.F3;
            int i4 = Integer.MAX_VALUE;
            if (lc7Var != null) {
                int min = Math.min(Integer.MAX_VALUE, lc7Var.e(false));
                int max = Math.max(0, s1.F3.e(false));
                int min2 = Math.min(min, s1.F3.f());
                int max2 = Math.max(max, s1.F3.f());
                i4 = min2;
                i3 = max2;
            } else {
                i3 = 0;
            }
            ds2 ds2Var = hrVar.d2;
            ds2 ds2Var2 = hrVar.o2;
            ds2 ds2Var3 = hrVar.n2;
            ds2 ds2Var4 = hrVar.f2;
            ds2 ds2Var5 = hrVar.e2;
            int min3 = Math.min(i4, ds2Var.f());
            int min4 = Math.min(i3, hrVar.d2.f());
            lc7 lc7Var2 = s1.G3;
            if (lc7Var2 != null) {
                int min5 = Math.min(min3, lc7Var2.e(false));
                int max3 = Math.max(min4, s1.G3.e(false));
                min3 = Math.min(min5, s1.G3.f());
                min4 = Math.max(max3, s1.G3.f());
            }
            int min6 = Math.min(min3, ds2Var5.f());
            int max4 = Math.max(min4, ds2Var5.f());
            int min7 = Math.min(min6, ds2Var4.f());
            int max5 = Math.max(max4, ds2Var4.f());
            int min8 = Math.min(min7, ds2Var3.f());
            int max6 = Math.max(max5, ds2Var3.f());
            int min9 = Math.min(min8, ds2Var2.f());
            int max7 = Math.max(max6, ds2Var2.f());
            int i5 = M0 != null ? M0.level : 0;
            if (i5 < max7) {
                this.h = new hc(Math.max(i5, min9), vnbVar, context, true);
            }
        }
        setContentDescription(M02);
        this.f = new pkb(M02, 16.0f, null);
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
        int L4 = hl.L(64.0f) / 2;
        if (ob6.a0) {
            L4 = getMeasuredWidth() - L4;
        }
        Drawable drawable = this.e;
        br3.d(drawable, L4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - hl.L(171.0f);
        int i2 = 0;
        hc hcVar = this.h;
        if (hcVar != null) {
            i = hl.L(8.0f) + hcVar.getIntrinsicWidth();
        } else {
            i = 0;
        }
        pkb pkbVar = this.f;
        pkbVar.p = measuredWidth4 - i;
        if (ob6.a0) {
            L = (getMeasuredWidth() - pkbVar.j()) - hl.L(71.0f);
        } else {
            L = hl.L(71.0f);
        }
        pkbVar.e(canvas, L, getMeasuredHeight() / 2.0f);
        if (hcVar != null) {
            int j = (int) (pkbVar.j() + L + hl.L(6.0f));
            hcVar.setBounds(j, 0, j, getHeight());
            hcVar.draw(canvas);
        }
        vnb vnbVar = this.d;
        boolean z = this.c;
        if (z && this.y != null) {
            if (ob6.a0) {
                measuredWidth3 = hl.L(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - hl.L(24.0f);
            }
            this.y.setBounds(measuredWidth3 - hl.L(11.0f), ik8.D(11.0f, getMeasuredHeight(), 2), measuredWidth3, (hl.L(11.0f) + getMeasuredHeight()) / 2);
            this.y.f(hl.N(3.0f), aob.v0(aob.d6, vnbVar));
            this.y.draw(canvas);
        } else if (this.x != null && this.y != null) {
            if (ob6.a0) {
                measuredWidth2 = hl.L(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - hl.L(24.0f);
            }
            this.y.setBounds(measuredWidth2 - hl.L(11.0f), ik8.D(11.0f, getMeasuredHeight(), 2), measuredWidth2, (hl.L(11.0f) + getMeasuredHeight()) / 2);
            b48 b48Var = this.y;
            float N = hl.N(3.0f);
            int i3 = aob.d6;
            b48Var.f(N, aob.v0(i3, vnbVar));
            this.y.draw(canvas);
            int L5 = measuredWidth2 - hl.L(18.0f);
            this.x.setBounds(L5 - hl.L(11.0f), ik8.D(11.0f, getMeasuredHeight(), 2), L5, (hl.L(11.0f) + getMeasuredHeight()) / 2);
            this.x.f(hl.N(3.0f), aob.v0(i3, vnbVar));
            this.x.draw(canvas);
        } else if (this.r != null && !z) {
            float measuredWidth5 = getMeasuredWidth() - hl.L(116.0f);
            float j2 = pkbVar.j();
            if (hcVar == null) {
                L2 = 0;
            } else {
                L2 = hl.L(12.0f) + hcVar.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(j2 + L2, getMeasuredWidth() - hl.L(164.0f)));
            int min2 = (int) Math.min(this.r.j(), min);
            RectF rectF = hl.P;
            if (ob6.a0) {
                x = hl.L(15.0f);
            } else {
                x = qu6.x(33.0f, getMeasuredWidth(), min2);
            }
            float f = x;
            float measuredHeight = (getMeasuredHeight() - hl.L(22.0f)) / 2.0f;
            if (ob6.a0) {
                measuredWidth = hl.L(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - hl.L(15.0f);
            }
            rectF.set(f, measuredHeight, measuredWidth, (hl.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), this.n);
            pkb pkbVar2 = this.r;
            pkbVar2.p = min;
            if (ob6.a0) {
                x2 = hl.L(24.0f);
            } else {
                x2 = qu6.x(24.0f, getMeasuredWidth(), min2);
            }
            pkbVar2.e(canvas, x2, getMeasuredHeight() / 2.0f);
        }
        if (this.w) {
            if (vnbVar != null) {
                paint = vnbVar.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = aob.j0;
            }
            Paint paint2 = paint;
            if (ob6.a0) {
                L3 = 0.0f;
            } else {
                L3 = hl.L(71.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth6 = getMeasuredWidth();
            if (ob6.a0) {
                i2 = hl.L(71.0f);
            }
            canvas.drawLine(L3, measuredHeight2, measuredWidth6 - i2, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(50.0f) + (this.w ? 1 : 0), 1073741824));
    }

    public void set(TLRPC.User user) {
        String trim;
        b48 b48Var;
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
        kc7 kc7Var = null;
        this.r = new pkb(pv3.m(trim, aob.o2.getFontMetricsInt(), false, null, 0), 13.0f, hl.o());
        b48 b48Var2 = this.x;
        if (b48Var2 != null) {
            b48Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i4 = this.a;
        if (z) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i5 = b48.j;
            int i6 = tL_emojiStatusCollectible.center_color | (-16777216);
            b48Var = new b48(i6, i6, i6, tL_emojiStatusCollectible.document_id);
            this.x = b48Var;
        } else {
            if (lbc.n(user) >= 0) {
                b48 c = b48.c(i4, lbc.n(user));
                c.a = hl.L(11.0f);
                c.d();
                b48Var = c;
            } else {
                b48Var = null;
            }
            this.x = b48Var;
        }
        if (b48Var != null) {
            b48Var.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z2 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.n;
        vnb vnbVar = this.d;
        if (z2) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            if (vnbVar != null) {
                o = vnbVar.a();
            } else {
                o = aob.I.o();
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
            paint.setColor(aob.p1(0.1f, i));
            b48 b48Var3 = new b48(intValue, i2, i3, tL_peerColorCollectible.gift_emoji_id);
            b48Var3.a = hl.L(11.0f);
            b48Var3.d();
            this.y = b48Var3;
            b48Var3.e(this);
            return;
        }
        int f = lbc.f(user);
        if (f < 7) {
            int i7 = aob.r8[f];
            this.s = i7;
            v0 = aob.v0(i7, vnbVar);
        } else {
            lc7 lc7Var = uc7.s1(yac.t0).F3;
            if (lc7Var != null) {
                kc7Var = lc7Var.d(f);
            }
            if (kc7Var != null) {
                this.s = -1;
                v0 = kc7Var.f();
            } else {
                int i8 = aob.r8[0];
                this.s = i8;
                v0 = aob.v0(i8, vnbVar);
            }
        }
        this.r.m(v0);
        paint.setColor(aob.p1(0.1f, v0));
        b48 a = b48.a(i4, f);
        a.a = hl.L(11.0f);
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
            i = aob.m6;
        } else {
            i = aob.q6;
        }
        vnb vnbVar = this.d;
        int v0 = aob.v0(i, vnbVar);
        if (!this.E || this.F != v0) {
            this.E = true;
            this.F = v0;
            this.e.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        }
        if (z) {
            i2 = aob.G6;
        } else {
            i2 = aob.q6;
        }
        this.f.m(aob.v0(i2, vnbVar));
        if (this.r != null && (paint = this.n) != null && (i3 = this.s) != -1) {
            int v02 = aob.v0(i3, vnbVar);
            this.r.m(v02);
            paint.setColor(aob.p1(0.1f, v02));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
