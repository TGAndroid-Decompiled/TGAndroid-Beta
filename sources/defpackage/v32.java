package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v32 extends FrameLayout {
    public final bf0 a;
    public final dg0 b;
    public final lka c;
    public final jh2 d;
    public final pc0 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String w;
    public boolean x;

    public v32(Context context, ylb ylbVar) {
        super(context);
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        float f3;
        float f4;
        int i4;
        int i5;
        float f5;
        float f6;
        float f7;
        float f8;
        this.e = new pc0(ylbVar);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(23.0f));
        boolean z = jb6.a0;
        if (z) {
            i = 5;
        } else {
            i = 3;
        }
        int i6 = i | 48;
        if (z) {
            f = 0.0f;
        } else {
            f = 14.0f;
        }
        if (z) {
            f2 = 14.0f;
        } else {
            f2 = 0.0f;
        }
        addView(bf0Var, qoe.d(46, 46.0f, i6, f, 9.0f, f2, 0.0f));
        dg0 dg0Var = new dg0(context, (byte) 1);
        this.b = dg0Var;
        nm7.i(dg0Var);
        anb.W(dg0Var, cmb.i5, ylbVar);
        dg0Var.setTypeface(gm.o());
        dg0Var.setTextSize(16);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        dg0Var.setGravity(i2 | 48);
        boolean z2 = jb6.a0;
        if (z2) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i7 = i3 | 48;
        if (z2) {
            f3 = 28.0f;
        } else {
            f3 = 72.0f;
        }
        if (z2) {
            f4 = 72.0f;
        } else {
            f4 = 28.0f;
        }
        addView(dg0Var, qoe.d(-1, 20.0f, i7, f3, 12.0f, f4, 0.0f));
        lka lkaVar = new lka(context);
        this.c = lkaVar;
        lkaVar.setTextSize(13);
        anb.W(lkaVar, cmb.p5, ylbVar);
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        lkaVar.setGravity(i4 | 48);
        boolean z3 = jb6.a0;
        if (z3) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        int i8 = i5 | 48;
        if (z3) {
            f5 = 28.0f;
        } else {
            f5 = 72.0f;
        }
        if (z3) {
            f6 = 72.0f;
        } else {
            f6 = 28.0f;
        }
        addView(lkaVar, qoe.d(-1, 20.0f, i8, f5, 36.0f, f6, 0.0f));
        jh2 jh2Var = new jh2(21, ylbVar, context);
        this.d = jh2Var;
        jh2Var.b(-1, cmb.c6, cmb.j7);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(3);
        boolean z4 = jb6.a0;
        int i9 = (z4 ? 5 : 3) | 48;
        if (z4) {
            f7 = 0.0f;
        } else {
            f7 = 44.0f;
        }
        if (z4) {
            f8 = 44.0f;
        } else {
            f8 = 0.0f;
        }
        addView(jh2Var, qoe.d(24, 24.0f, i9, f7, 37.0f, f8, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, u32 u32Var, boolean z) {
        bf0 bf0Var = this.a;
        dg0 dg0Var = this.b;
        String str = "";
        if (user == null && charSequence == null) {
            this.r = null;
            this.n = null;
            dg0Var.l("", false);
            this.c.l("", false);
            bf0Var.setImageDrawable(null);
        } else {
            this.r = null;
            this.n = charSequence;
            this.f = user;
            this.x = z;
            setWillNotDraw(!z);
            pc0 pc0Var = this.e;
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                pc0Var.q(user2);
                TLRPC.UserStatus userStatus = this.f.status;
            } else {
                CharSequence charSequence2 = this.n;
                long j = this.h;
                if (charSequence2 != null) {
                    pc0Var.j(j, charSequence2.toString(), null, null);
                } else {
                    pc0Var.j(j, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.n;
            if (charSequence3 != null) {
                dg0Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f;
                if (user3 != null) {
                    str = m9c.r(user3);
                }
                dg0Var.l(str, false);
            }
            setStatus(this.r);
            TLRPC.User user4 = this.f;
            if (user4 != null) {
                bf0Var.f(user4, pc0Var);
            } else {
                bf0Var.setImageDrawable(pc0Var);
            }
        }
        Utilities.e.c(new lx1(this, u32Var, (byte) 13));
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.x) {
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(70.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(70.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(64.0f) + (this.x ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i) {
        this.h = i;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.r = charSequence;
        if (charSequence != null) {
            this.c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.c.l(jb6.M0(2131747565, null), false);
            } else if (this.s != this.f && (str = this.w) != null) {
                this.c.l(str, false);
            } else {
                this.c.l("", false);
                Utilities.e.c(new t32(this, (byte) 0));
            }
        }
    }
}
