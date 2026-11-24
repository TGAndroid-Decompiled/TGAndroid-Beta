package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class y07 extends LinearLayout {
    public final bf0 a;
    public final wb b;
    public final TextView c;
    public final pc0 d;
    public final ylb e;
    public Drawable f;
    public boolean h;
    public boolean n;

    public y07(Context context, ylb ylbVar) {
        super(context);
        this.h = false;
        this.e = ylbVar;
        setOrientation(0);
        pc0 pc0Var = new pc0((ylb) null);
        this.d = pc0Var;
        pc0Var.s(gm.L(18.0f));
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(14.0f));
        addView(bf0Var, qoe.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        wb wbVar = new wb(context, (byte) 26);
        this.b = wbVar;
        anb.X(wbVar, cmb.F6, ylbVar);
        wbVar.setTextSize(1, 15.0f);
        wbVar.setSingleLine(true);
        wbVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        wbVar.setEllipsize(truncateAt);
        addView(wbVar, qoe.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        anb.X(textView, cmb.z6, ylbVar);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, qoe.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f;
        if (drawable != null) {
            if (drawable instanceof vm) {
                ((vm) drawable).o(this);
            }
            this.f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f;
        if (drawable != null) {
            if (drawable instanceof vm) {
                f = 24.0f;
            } else {
                f = 20.0f;
            }
            int L = gm.L(f);
            if (this.f instanceof vm) {
                f2 = -2.0f;
            } else {
                f2 = 0.0f;
            }
            int L2 = gm.L(f2);
            Drawable drawable2 = this.f;
            wb wbVar = this.b;
            drawable2.setBounds(wbVar.getLeft() + L2, ((wbVar.getBottom() + wbVar.getTop()) - L) / 2, wbVar.getLeft() + L2 + L, ((wbVar.getBottom() + wbVar.getTop()) + L) / 2);
            Drawable drawable3 = this.f;
            if (drawable3 instanceof vm) {
                ((vm) drawable3).p(System.currentTimeMillis());
            }
            this.f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        Drawable drawable = this.f;
        if (drawable instanceof vm) {
            ((vm) drawable).b(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        Drawable drawable = this.f;
        if (drawable instanceof vm) {
            ((vm) drawable).o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(gm.L(52.0f), getHeight() - 1, getWidth() - gm.L(8.0f), getHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        wb wbVar = this.b;
        TextView textView = this.c;
        bf0 bf0Var = this.a;
        if (chat == null) {
            wbVar.setText("");
            textView.setText("");
            bf0Var.setImageDrawable(null);
            return;
        }
        pc0 pc0Var = this.d;
        pc0Var.p(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            bf0Var.f(chat, pc0Var);
        } else {
            bf0Var.setImageDrawable(pc0Var);
        }
        wbVar.setText(chat.title);
        String K = sd2.K(chat, false);
        if (K != null) {
            textView.setText("@".concat(K));
        } else {
            textView.setText("");
        }
        bf0Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z) {
        if (z != this.h) {
            this.h = z;
            setWillNotDraw(!z);
            invalidate();
        }
    }

    public void setEmojiSuggestion(ds6 ds6Var) {
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        String str = ds6Var.a;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f;
                if (drawable instanceof vm) {
                    ((vm) drawable).o(this);
                    this.f = null;
                }
                vm m = vm.m(z8c.t0, Long.parseLong(ds6Var.a.substring(9)), null, 0);
                this.f = m;
                if (this.n) {
                    m.b(this);
                }
            } catch (Exception unused) {
                this.f = gw3.g(ds6Var.a);
            }
        } else {
            this.f = gw3.g(ds6Var.a);
        }
        Drawable drawable2 = this.f;
        wb wbVar = this.b;
        if (drawable2 == null) {
            wbVar.setPadding(0, 0, 0, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(ds6Var.a);
            sb.append(":  ");
            sb.append(ds6Var.b);
            wbVar.setText(sb);
            return;
        }
        wbVar.setPadding(gm.L(22.0f), 0, 0, 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(":  ");
        sb2.append(ds6Var.b);
        wbVar.setText(sb2);
    }

    public void setIsDarkTheme(boolean z) {
        TextView textView = this.c;
        wb wbVar = this.b;
        if (z) {
            anb.q(wbVar);
            anb.q(textView);
            wbVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i = cmb.F6;
        ylb ylbVar = this.e;
        anb.X(wbVar, i, ylbVar);
        anb.X(textView, cmb.z6, ylbVar);
    }

    public void setText(String str) {
        a();
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        this.b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        wb wbVar = this.b;
        TextView textView = this.c;
        bf0 bf0Var = this.a;
        if (user == null) {
            wbVar.setText("");
            textView.setText("");
            bf0Var.setImageDrawable(null);
            return;
        }
        pc0 pc0Var = this.d;
        pc0Var.q(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            bf0Var.f(user, pc0Var);
        } else {
            bf0Var.setImageDrawable(pc0Var);
        }
        wbVar.setText(m9c.r(user));
        if (m9c.p(user) != null) {
            textView.setText("@" + m9c.p(user));
        } else {
            textView.setText("");
        }
        bf0Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
