package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uac extends FrameLayout implements snb {
    public final vnb a;
    public final de0 b;
    public final ff0 c;
    public final ema d;
    public final ImageView e;
    public final rb0 f;
    public String h;
    public int n;
    public final int r;
    public int s;
    public int w;
    public final boolean x;

    public uac(Context context, vnb vnbVar) {
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
        this.r = yac.t0;
        this.x = true;
        this.a = vnbVar;
        this.s = aob.v0(aob.y6, vnbVar);
        this.w = aob.v0(aob.n6, vnbVar);
        this.f = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.setRoundRadius(hl.L(24.0f));
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
            f = 11.0f;
        }
        if (z) {
            f2 = 11.0f;
        } else {
            f2 = 0.0f;
        }
        addView(de0Var, tre.d(48, 48.0f, i6, f, 11.0f, f2, 0.0f));
        ff0 ff0Var = new ff0(context, (byte) 5);
        this.c = ff0Var;
        jn7.i(ff0Var);
        yob.W(ff0Var, aob.G6, vnbVar);
        ff0Var.setTextSize(17);
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
        addView(ff0Var, tre.d(-1, 20.0f, i7, f3, 14.5f, f4, 0.0f));
        ema emaVar = new ema(context);
        this.d = emaVar;
        emaVar.setTextSize(14);
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
        addView(emaVar, tre.d(-1, 20.0f, i8, f5, 37.5f, f6, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.m6, vnbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z4 = ob6.a0;
        int i9 = (z4 ? 5 : 3) | 16;
        if (z4) {
            f7 = 0.0f;
        } else {
            f7 = 16.0f;
        }
        if (z4) {
            f8 = 16.0f;
        } else {
            f8 = 0.0f;
        }
        addView(imageView, tre.d(-2, -2.0f, i9, f7, 0.0f, f8, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String str2;
        TLRPC.UserStatus userStatus;
        float f;
        de0 de0Var = this.b;
        ema emaVar = this.d;
        ff0 ff0Var = this.c;
        if (tLObject == null && str == null) {
            this.h = null;
            ff0Var.k("");
            emaVar.l("", false);
            de0Var.setImageDrawable(null);
            return;
        }
        this.h = str;
        if (tLObject instanceof TLRPC.User) {
            user = (TLRPC.User) tLObject;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            user = null;
        } else {
            chat = null;
            user = null;
        }
        rb0 rb0Var = this.f;
        if (user != null) {
            rb0Var.q(user);
        } else if (chat != null) {
            rb0Var.p(chat);
        } else {
            rb0Var.j(this.n, "#", null, null);
        }
        if (user != null) {
            str2 = lbc.r(user);
        } else {
            str2 = chat.title;
        }
        ff0Var.k(str2);
        if (this.h != null) {
            emaVar.setTextColor(this.s);
            emaVar.l(this.h, false);
            if (de0Var != null) {
                de0Var.f(user, rb0Var);
            }
        } else if (user != null) {
            if (user.bot) {
                emaVar.setTextColor(this.s);
                if (user.bot_chat_history) {
                    emaVar.l(ob6.M0(2131752927, null), false);
                } else {
                    emaVar.l(ob6.M0(2131752928, null), false);
                }
            } else {
                long j = user.id;
                int i = this.r;
                if (j != yac.h(i).e() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i).getCurrentTime()) && !uc7.s1(i).a0.containsKey(Long.valueOf(user.id)))) {
                    emaVar.setTextColor(this.s);
                    emaVar.l(ob6.d0(i, user, null, null), false);
                } else {
                    emaVar.setTextColor(this.w);
                    emaVar.l(ob6.M0(2131747553, null), false);
                }
            }
            de0Var.f(user, rb0Var);
        } else if (chat != null) {
            emaVar.setTextColor(this.s);
            if (xc2.T(chat) && !chat.megagroup) {
                int i2 = chat.participants_count;
                if (i2 != 0) {
                    emaVar.l(ob6.G(i2, "Subscribers", new Object[0]), false);
                } else if (!xc2.t0(chat)) {
                    emaVar.l(ob6.M0(2131752299, null), false);
                } else {
                    emaVar.l(ob6.M0(2131752288, null), false);
                }
            } else {
                int i3 = chat.participants_count;
                if (i3 != 0) {
                    emaVar.l(ob6.G(i3, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    emaVar.l(ob6.M0(2131748396, null), false);
                } else if (!xc2.t0(chat)) {
                    emaVar.l(ob6.M0(2131748395, null), false);
                } else {
                    emaVar.l(ob6.M0(2131748392, null), false);
                }
            }
            de0Var.f(chat, rb0Var);
        } else {
            de0Var.setImageDrawable(rb0Var);
        }
        if (chat != null && chat.forum) {
            f = 14.0f;
        } else {
            f = 24.0f;
        }
        de0Var.setRoundRadius(hl.L(f));
        ImageView imageView = this.e;
        if (imageView.getVisibility() == 0) {
            imageView.setVisibility(8);
            imageView.setImageResource(0);
            return;
        }
        imageView.getVisibility();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(70.0f), 1073741824));
    }

    public void setCurrentId(int i) {
        this.n = i;
    }

    public void setNameTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
    }

    @Override
    public final void updateColors() {
        int i;
        int i2;
        try {
            int i3 = this.s;
            int i4 = this.w;
            vnb vnbVar = this.a;
            if (this.x) {
                this.s = aob.v0(aob.y6, vnbVar);
                this.w = aob.v0(aob.n6, vnbVar);
            }
            ema emaVar = this.d;
            if (emaVar != null) {
                int textColor = emaVar.getTextColor();
                if (textColor == i4 && i4 != (i2 = this.w)) {
                    emaVar.setTextColor(i2);
                } else if (textColor == i3 && i3 != (i = this.s)) {
                    emaVar.setTextColor(i);
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z) {
    }
}
