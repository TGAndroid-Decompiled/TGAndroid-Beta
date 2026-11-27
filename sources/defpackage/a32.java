package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a32 extends FrameLayout {
    public final de0 a;
    public final ff0 b;
    public final ema c;
    public final og2 d;
    public final rb0 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String w;
    public boolean x;

    public a32(Context context, vnb vnbVar) {
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
        this.e = new rb0(vnbVar);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(23.0f));
        boolean z = ob6.a0;
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
        addView(de0Var, tre.d(46, 46.0f, i6, f, 9.0f, f2, 0.0f));
        ff0 ff0Var = new ff0(context, (byte) 1);
        this.b = ff0Var;
        jn7.i(ff0Var);
        yob.W(ff0Var, aob.j5, vnbVar);
        ff0Var.setTypeface(hl.o());
        ff0Var.setTextSize(16);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        ff0Var.setGravity(i2 | 48);
        boolean z2 = ob6.a0;
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
        addView(ff0Var, tre.d(-1, 20.0f, i7, f3, 12.0f, f4, 0.0f));
        ema emaVar = new ema(context);
        this.c = emaVar;
        emaVar.setTextSize(13);
        yob.W(emaVar, aob.q5, vnbVar);
        if (ob6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        emaVar.setGravity(i4 | 48);
        boolean z3 = ob6.a0;
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
        addView(emaVar, tre.d(-1, 20.0f, i8, f5, 36.0f, f6, 0.0f));
        og2 og2Var = new og2(21, vnbVar, context);
        this.d = og2Var;
        og2Var.b(-1, aob.d6, aob.k7);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(3);
        boolean z4 = ob6.a0;
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
        addView(og2Var, tre.d(24, 24.0f, i9, f7, 37.0f, f8, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, z22 z22Var, boolean z) {
        de0 de0Var = this.a;
        ff0 ff0Var = this.b;
        String str = "";
        if (user == null && charSequence == null) {
            this.r = null;
            this.n = null;
            ff0Var.l("", false);
            this.c.l("", false);
            de0Var.setImageDrawable(null);
        } else {
            this.r = null;
            this.n = charSequence;
            this.f = user;
            this.x = z;
            setWillNotDraw(!z);
            rb0 rb0Var = this.e;
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                rb0Var.q(user2);
                TLRPC.UserStatus userStatus = this.f.status;
            } else {
                CharSequence charSequence2 = this.n;
                long j = this.h;
                if (charSequence2 != null) {
                    rb0Var.j(j, charSequence2.toString(), null, null);
                } else {
                    rb0Var.j(j, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.n;
            if (charSequence3 != null) {
                ff0Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f;
                if (user3 != null) {
                    str = lbc.r(user3);
                }
                ff0Var.l(str, false);
            }
            setStatus(this.r);
            TLRPC.User user4 = this.f;
            if (user4 != null) {
                de0Var.f(user4, rb0Var);
            } else {
                de0Var.setImageDrawable(rb0Var);
            }
        }
        Utilities.e.c(new dy1(this, z22Var, (byte) 12));
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
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(70.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(70.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(64.0f) + (this.x ? 1 : 0), 1073741824));
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
                this.c.l(ob6.M0(2131747559, null), false);
            } else if (this.s != this.f && (str = this.w) != null) {
                this.c.l(str, false);
            } else {
                this.c.l("", false);
                Utilities.e.c(new y22(this, (byte) 0));
            }
        }
    }
}
