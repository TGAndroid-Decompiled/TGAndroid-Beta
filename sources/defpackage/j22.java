package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j22 extends FrameLayout {
    public final be0 a;
    public final df0 b;
    public final jia c;
    public final wf2 d;
    public final pb0 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String w;
    public boolean x;

    public j22(Context context, wjb wjbVar) {
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
        this.e = new pb0(wjbVar);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(23.0f));
        boolean z = k96.a0;
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
        addView(be0Var, nme.d(46, 46.0f, i6, f, 9.0f, f2, 0.0f));
        df0 df0Var = new df0(context, (byte) 1);
        this.b = df0Var;
        kk7.i(df0Var);
        zkb.W(df0Var, bkb.i5, wjbVar);
        df0Var.setTypeface(gl.o());
        df0Var.setTextSize(16);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        df0Var.setGravity(i2 | 48);
        boolean z2 = k96.a0;
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
        addView(df0Var, nme.d(-1, 20.0f, i7, f3, 12.0f, f4, 0.0f));
        jia jiaVar = new jia(context);
        this.c = jiaVar;
        jiaVar.setTextSize(13);
        zkb.W(jiaVar, bkb.p5, wjbVar);
        if (k96.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        jiaVar.setGravity(i4 | 48);
        boolean z3 = k96.a0;
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
        addView(jiaVar, nme.d(-1, 20.0f, i8, f5, 36.0f, f6, 0.0f));
        wf2 wf2Var = new wf2(21, wjbVar, context);
        this.d = wf2Var;
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(3);
        boolean z4 = k96.a0;
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
        addView(wf2Var, nme.d(24, 24.0f, i9, f7, 37.0f, f8, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, i22 i22Var, boolean z) {
        be0 be0Var = this.a;
        df0 df0Var = this.b;
        String str = "";
        if (user == null && charSequence == null) {
            this.r = null;
            this.n = null;
            df0Var.l("", false);
            this.c.l("", false);
            be0Var.setImageDrawable(null);
        } else {
            this.r = null;
            this.n = charSequence;
            this.f = user;
            this.x = z;
            setWillNotDraw(!z);
            pb0 pb0Var = this.e;
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                pb0Var.q(user2);
                TLRPC.UserStatus userStatus = this.f.status;
            } else {
                CharSequence charSequence2 = this.n;
                long j = this.h;
                if (charSequence2 != null) {
                    pb0Var.j(j, charSequence2.toString(), null, null);
                } else {
                    pb0Var.j(j, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.n;
            if (charSequence3 != null) {
                df0Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f;
                if (user3 != null) {
                    str = l7c.q(user3);
                }
                df0Var.l(str, false);
            }
            setStatus(this.r);
            TLRPC.User user4 = this.f;
            if (user4 != null) {
                be0Var.f(user4, pb0Var);
            } else {
                be0Var.setImageDrawable(pb0Var);
            }
        }
        Utilities.e.c(new kx1(this, i22Var, (byte) 12));
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
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(70.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(70.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(64.0f) + (this.x ? 1 : 0), 1073741824));
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
                this.c.l(k96.M0(2131747639, null), false);
            } else if (this.s != this.f && (str = this.w) != null) {
                this.c.l(str, false);
            } else {
                this.c.l("", false);
                Utilities.e.c(new h22(this, (byte) 0));
            }
        }
    }
}
