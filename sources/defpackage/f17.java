package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class f17 extends LinearLayout {
    public final de0 a;
    public final xb b;
    public final TextView c;
    public final rb0 d;
    public final vnb e;
    public Drawable f;
    public boolean h;
    public boolean n;

    public f17(Context context, vnb vnbVar) {
        super(context);
        this.h = false;
        this.e = vnbVar;
        setOrientation(0);
        rb0 rb0Var = new rb0((vnb) null);
        this.d = rb0Var;
        rb0Var.s(hl.L(18.0f));
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(14.0f));
        addView(de0Var, tre.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        xb xbVar = new xb(context, (byte) 26);
        this.b = xbVar;
        yob.X(xbVar, aob.G6, vnbVar);
        xbVar.setTextSize(1, 15.0f);
        xbVar.setSingleLine(true);
        xbVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xbVar.setEllipsize(truncateAt);
        addView(xbVar, tre.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        yob.X(textView, aob.A6, vnbVar);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, tre.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f;
        if (drawable != null) {
            if (drawable instanceof wl) {
                ((wl) drawable).o(this);
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
            if (drawable instanceof wl) {
                f = 24.0f;
            } else {
                f = 20.0f;
            }
            int L = hl.L(f);
            if (this.f instanceof wl) {
                f2 = -2.0f;
            } else {
                f2 = 0.0f;
            }
            int L2 = hl.L(f2);
            Drawable drawable2 = this.f;
            xb xbVar = this.b;
            drawable2.setBounds(xbVar.getLeft() + L2, ((xbVar.getBottom() + xbVar.getTop()) - L) / 2, xbVar.getLeft() + L2 + L, ((xbVar.getBottom() + xbVar.getTop()) + L) / 2);
            Drawable drawable3 = this.f;
            if (drawable3 instanceof wl) {
                ((wl) drawable3).p(System.currentTimeMillis());
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
        if (drawable instanceof wl) {
            ((wl) drawable).b(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        Drawable drawable = this.f;
        if (drawable instanceof wl) {
            ((wl) drawable).o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(hl.L(52.0f), getHeight() - 1, getWidth() - hl.L(8.0f), getHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        xb xbVar = this.b;
        TextView textView = this.c;
        de0 de0Var = this.a;
        if (chat == null) {
            xbVar.setText("");
            textView.setText("");
            de0Var.setImageDrawable(null);
            return;
        }
        rb0 rb0Var = this.d;
        rb0Var.p(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            de0Var.f(chat, rb0Var);
        } else {
            de0Var.setImageDrawable(rb0Var);
        }
        xbVar.setText(chat.title);
        String K = xc2.K(chat, false);
        if (K != null) {
            textView.setText("@".concat(K));
        } else {
            textView.setText("");
        }
        de0Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z) {
        if (z != this.h) {
            this.h = z;
            setWillNotDraw(!z);
            invalidate();
        }
    }

    public void setEmojiSuggestion(hs6 hs6Var) {
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        String str = hs6Var.a;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f;
                if (drawable instanceof wl) {
                    ((wl) drawable).o(this);
                    this.f = null;
                }
                wl m = wl.m(yac.t0, Long.parseLong(hs6Var.a.substring(9)), null, 0);
                this.f = m;
                if (this.n) {
                    m.b(this);
                }
            } catch (Exception unused) {
                this.f = pv3.g(hs6Var.a);
            }
        } else {
            this.f = pv3.g(hs6Var.a);
        }
        Drawable drawable2 = this.f;
        xb xbVar = this.b;
        if (drawable2 == null) {
            xbVar.setPadding(0, 0, 0, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(hs6Var.a);
            sb.append(":  ");
            sb.append(hs6Var.b);
            xbVar.setText(sb);
            return;
        }
        xbVar.setPadding(hl.L(22.0f), 0, 0, 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(":  ");
        sb2.append(hs6Var.b);
        xbVar.setText(sb2);
    }

    public void setIsDarkTheme(boolean z) {
        TextView textView = this.c;
        xb xbVar = this.b;
        if (z) {
            yob.q(xbVar);
            yob.q(textView);
            xbVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i = aob.G6;
        vnb vnbVar = this.e;
        yob.X(xbVar, i, vnbVar);
        yob.X(textView, aob.A6, vnbVar);
    }

    public void setText(String str) {
        a();
        this.a.setVisibility(4);
        this.c.setVisibility(4);
        this.b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        xb xbVar = this.b;
        TextView textView = this.c;
        de0 de0Var = this.a;
        if (user == null) {
            xbVar.setText("");
            textView.setText("");
            de0Var.setImageDrawable(null);
            return;
        }
        rb0 rb0Var = this.d;
        rb0Var.q(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            de0Var.f(user, rb0Var);
        } else {
            de0Var.setImageDrawable(rb0Var);
        }
        xbVar.setText(lbc.r(user));
        if (lbc.p(user) != null) {
            textView.setText("@" + lbc.p(user));
        } else {
            textView.setText("");
        }
        de0Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
