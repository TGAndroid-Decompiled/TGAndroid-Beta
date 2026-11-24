package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class yy6 extends LinearLayout {
    public final be0 a;
    public final wb b;
    public final TextView c;
    public final pb0 d;
    public final wjb e;
    public Drawable f;
    public boolean h;
    public boolean n;

    public yy6(Context context, wjb wjbVar) {
        super(context);
        this.h = false;
        this.e = wjbVar;
        setOrientation(0);
        pb0 pb0Var = new pb0((wjb) null);
        this.d = pb0Var;
        pb0Var.s(gl.L(18.0f));
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(14.0f));
        addView(be0Var, nme.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        wb wbVar = new wb(context, (byte) 26);
        this.b = wbVar;
        zkb.X(wbVar, bkb.F6, wjbVar);
        wbVar.setTextSize(1, 15.0f);
        wbVar.setSingleLine(true);
        wbVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        wbVar.setEllipsize(truncateAt);
        addView(wbVar, nme.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        zkb.X(textView, bkb.z6, wjbVar);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, nme.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f;
        if (drawable != null) {
            if (drawable instanceof vl) {
                ((vl) drawable).o(this);
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
            if (drawable instanceof vl) {
                f = 24.0f;
            } else {
                f = 20.0f;
            }
            int L = gl.L(f);
            if (this.f instanceof vl) {
                f2 = -2.0f;
            } else {
                f2 = 0.0f;
            }
            int L2 = gl.L(f2);
            Drawable drawable2 = this.f;
            wb wbVar = this.b;
            drawable2.setBounds(wbVar.getLeft() + L2, ((wbVar.getBottom() + wbVar.getTop()) - L) / 2, wbVar.getLeft() + L2 + L, ((wbVar.getBottom() + wbVar.getTop()) + L) / 2);
            Drawable drawable3 = this.f;
            if (drawable3 instanceof vl) {
                ((vl) drawable3).p(System.currentTimeMillis());
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
        if (drawable instanceof vl) {
            ((vl) drawable).b(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        Drawable drawable = this.f;
        if (drawable instanceof vl) {
            ((vl) drawable).o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(gl.L(52.0f), getHeight() - 1, getWidth() - gl.L(8.0f), getHeight() - 1, bkb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        wb wbVar = this.b;
        TextView textView = this.c;
        be0 be0Var = this.a;
        if (chat == null) {
            wbVar.setText("");
            textView.setText("");
            be0Var.setImageDrawable(null);
            return;
        }
        pb0 pb0Var = this.d;
        pb0Var.p(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            be0Var.f(chat, pb0Var);
        } else {
            be0Var.setImageDrawable(pb0Var);
        }
        wbVar.setText(chat.title);
        String K = hc2.K(chat, false);
        if (K != null) {
            textView.setText("@".concat(K));
        } else {
            textView.setText("");
        }
        be0Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z) {
        if (z != this.h) {
            this.h = z;
            setWillNotDraw(!z);
            invalidate();
        }
    }

    public void setEmojiSuggestion(dq6 dq6Var) {
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        String str = dq6Var.a;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f;
                if (drawable instanceof vl) {
                    ((vl) drawable).o(this);
                    this.f = null;
                }
                vl m = vl.m(y6c.t0, Long.parseLong(dq6Var.a.substring(9)), null, 0);
                this.f = m;
                if (this.n) {
                    m.b(this);
                }
            } catch (Exception unused) {
                this.f = vu3.g(dq6Var.a);
            }
        } else {
            this.f = vu3.g(dq6Var.a);
        }
        Drawable drawable2 = this.f;
        wb wbVar = this.b;
        if (drawable2 == null) {
            wbVar.setPadding(0, 0, 0, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(dq6Var.a);
            sb.append(":  ");
            sb.append(dq6Var.b);
            wbVar.setText(sb);
            return;
        }
        wbVar.setPadding(gl.L(22.0f), 0, 0, 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(":  ");
        sb2.append(dq6Var.b);
        wbVar.setText(sb2);
    }

    public void setIsDarkTheme(boolean z) {
        TextView textView = this.c;
        wb wbVar = this.b;
        if (z) {
            zkb.q(wbVar);
            zkb.q(textView);
            wbVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i = bkb.F6;
        wjb wjbVar = this.e;
        zkb.X(wbVar, i, wjbVar);
        zkb.X(textView, bkb.z6, wjbVar);
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
        be0 be0Var = this.a;
        if (user == null) {
            wbVar.setText("");
            textView.setText("");
            be0Var.setImageDrawable(null);
            return;
        }
        pb0 pb0Var = this.d;
        pb0Var.q(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            be0Var.f(user, pb0Var);
        } else {
            be0Var.setImageDrawable(pb0Var);
        }
        wbVar.setText(l7c.r(user));
        if (l7c.p(user) != null) {
            textView.setText("@" + l7c.p(user));
        } else {
            textView.setText("");
        }
        be0Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
