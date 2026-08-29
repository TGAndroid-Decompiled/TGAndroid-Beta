package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import i7.f6;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.t9;
public final class n extends gg.d {
    public final ImageView A;
    public boolean B;
    public TLRPC.User C;
    public TLRPC.Chat D;
    public TL_stories.TL_myBoost E;
    public final cw0 F;
    public final boolean[] f9007r;
    public final hp f9008s;
    public final ImageView v;
    public boolean f9009w;
    public final ImageView f9010x;
    public boolean f9011y;

    public n(Context context, boolean z10, boolean z11, c6 c6Var, boolean z12) {
        super(context, c6Var);
        int i10;
        int i11;
        int i12;
        float f9;
        float f10;
        int i13;
        float f11;
        float f12;
        this.f9007r = new boolean[1];
        this.B = true;
        this.F = new cw0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f7292f.setVisibility(8);
        if (z11) {
            hp hpVar = new hp(context, 21, c6Var);
            this.f9008s = hpVar;
            hpVar.b(g6.B5, g6.f23133h5, g6.f23190k7);
            hpVar.setDrawUnchecked(false);
            hpVar.setDrawBackgroundAsArc(3);
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i14 = i13 | 48;
            if (z13) {
                f11 = 0.0f;
            } else {
                f11 = 40.0f;
            }
            if (z13) {
                f12 = 39.0f;
            } else {
                f12 = 0.0f;
            }
            addView(hpVar, f6.d(24, 24.0f, i14, f11, 33.0f, f12, 0.0f));
            d();
        } else if (z10) {
            hp hpVar2 = new hp(context, 21, c6Var);
            this.f9008s = hpVar2;
            if (z12) {
                hpVar2.b(g6.f23153i7, g6.f23171j7, g6.C5);
            } else {
                hpVar2.b(g6.B5, g6.f23171j7, g6.C5);
            }
            hpVar2.setDrawUnchecked(true);
            hpVar2.setDrawBackgroundAsArc(10);
            addView(hpVar2);
            hpVar2.a(false, false);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            hpVar2.setLayoutParams(f6.d(24, 24.0f, i10 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.f9008s = null;
        }
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int v02 = g6.v0(g6.Ac, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, f6.d(32, 32.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f9010x = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i15 = g6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(i15, c6Var), mode));
        boolean z14 = LocaleController.isRTL;
        if (z14) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        int i16 = i12 | 16;
        if (z14) {
            f9 = 52.0f;
        } else {
            f9 = 12.0f;
        }
        if (z14) {
            f10 = 12.0f;
        } else {
            f10 = 52.0f;
        }
        addView(imageView2, f6.d(32, 32.0f, i16, f9, 0.0f, f10, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.A = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(g6.v0(i15, c6Var), mode));
        addView(imageView3, f6.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        imageView3.setVisibility(8);
    }

    public static String f(long j10) {
        long j11 = j10 / 3600000;
        long j12 = j10 % 3600000;
        long j13 = j12 / 60000;
        long j14 = (j12 % 60000) / 1000;
        StringBuilder sb2 = new StringBuilder();
        if (j11 > 0) {
            sb2.append(String.format("%02d", Long.valueOf(j11)));
            sb2.append(":");
        }
        sb2.append(String.format("%02d", Long.valueOf(j13)));
        sb2.append(":");
        sb2.append(String.format("%02d", Long.valueOf(j14)));
        return sb2.toString();
    }

    @Override
    public final boolean b() {
        hp hpVar = this.f9008s;
        if (hpVar != null && hpVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        hp hpVar = this.f9008s;
        if (hpVar != null && hpVar.getVisibility() == 0) {
            hpVar.a(z10, z11);
        }
    }

    public final void g(boolean z10, boolean z11) {
        float f9;
        int i10;
        float f10;
        Runnable runnable;
        if (this.B == z10) {
            return;
        }
        this.B = z10;
        float f11 = 0.0f;
        int i11 = 0;
        ImageView imageView = this.A;
        ImageView imageView2 = this.f9010x;
        if (z11) {
            imageView2.setVisibility(0);
            ViewPropertyAnimator animate = imageView2.animate();
            if (z10 && this.f9009w) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            Runnable runnable2 = null;
            if (z10 && this.f9009w) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final n f9005b;

                    {
                        this.f9005b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f9005b.f9010x.setVisibility(8);
                                return;
                            default:
                                this.f9005b.A.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha.withEndAction(runnable).start();
            imageView.setVisibility(0);
            ViewPropertyAnimator animate2 = imageView.animate();
            if (z10 && this.f9011y) {
                f11 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z10 || !this.f9011y) {
                runnable2 = new Runnable(this) {
                    public final n f9005b;

                    {
                        this.f9005b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f9005b.f9010x.setVisibility(8);
                                return;
                            default:
                                this.f9005b.A.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z10 && this.f9009w) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        imageView2.setAlpha(f9);
        if (z10 && this.f9009w) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        imageView.animate().cancel();
        if (z10 && this.f9011y) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
        imageView.setVisibility((z10 && this.f9011y) ? 8 : 8);
    }

    public TL_stories.TL_myBoost getBoost() {
        return this.E;
    }

    public TLRPC.Chat getChat() {
        return this.D;
    }

    public TLRPC.User getUser() {
        return this.C;
    }

    public final void h(int i10, TLRPC.Chat chat) {
        float f9;
        int i11;
        String string;
        float f10;
        String str;
        this.v.setVisibility(8);
        this.D = chat;
        this.C = null;
        e9 e9Var = this.f7289b;
        e9Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f9 = 12.0f;
        } else {
            f9 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        t9 t9Var = this.f7290c;
        t9Var.setRoundRadius(dp);
        t9Var.e(chat, e9Var);
        String str2 = chat.title;
        gg.c cVar = this.d;
        cVar.k(str2);
        cVar.i(null);
        if (i10 <= 0) {
            i10 = chat.participants_count;
        }
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (i10 >= 1) {
            if (isChannelAndNotMegaGroup) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            string = LocaleController.formatPluralString(str, i10, new Object[0]);
        } else {
            if (isChannelAndNotMegaGroup) {
                i11 = R.string.DiscussChannel;
            } else {
                i11 = R.string.AccDescrGroup;
            }
            string = LocaleController.getString(i11);
        }
        setSubtitle(string);
        this.f7291e.setTextColor(g6.v0(g6.f23310r5, this.f7288a));
        if (i10 > 200) {
            f10 = 0.3f;
        } else {
            f10 = 1.0f;
        }
        i(f10, false);
    }

    public final void i(float f9, boolean z10) {
        hp hpVar = this.f9008s;
        if (hpVar != null) {
            if (z10) {
                if (Math.abs(hpVar.getAlpha() - f9) > 0.1d) {
                    hpVar.animate().cancel();
                    hpVar.animate().alpha(f9).start();
                    return;
                }
                return;
            }
            hpVar.animate().cancel();
            hpVar.setAlpha(f9);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F.f27580a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F.f27580a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.v.setVisibility(8);
        this.E = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.D = chat;
        e9 e9Var = this.f7289b;
        e9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        t9 t9Var = this.f7290c;
        t9Var.setRoundRadius(dp);
        t9Var.e(this.D, e9Var);
        String str = this.D.title;
        gg.c cVar = this.d;
        cVar.k(str);
        int v02 = g6.v0(g6.f23310r5, this.f7288a);
        h5 h5Var = this.f7291e;
        h5Var.setTextColor(v02);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 > 0) {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i10 * 1000) - System.currentTimeMillis())));
            cVar.setAlpha(0.65f);
            h5Var.setAlpha(0.65f);
            i(0.3f, false);
            return;
        }
        cVar.setAlpha(1.0f);
        h5Var.setAlpha(1.0f);
        i(1.0f, false);
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.v;
        if (onClickListener != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
            return;
        }
        imageView.setVisibility(8);
    }

    public void setUser(TLRPC.User user) {
        int i10;
        n5 a2;
        this.v.setVisibility(8);
        this.C = user;
        this.D = null;
        e9 e9Var = this.f7289b;
        e9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        t9 t9Var = this.f7290c;
        t9Var.setRoundRadius(dp);
        t9Var.e(user, e9Var);
        String userName = UserObject.getUserName(user);
        gg.c cVar = this.d;
        cVar.k(userName);
        boolean[] zArr = this.f9007r;
        zArr[0] = false;
        if (UserObject.isBot(user)) {
            int i11 = user.bot_active_users;
            if (i11 > 0) {
                setSubtitle(LocaleController.formatPluralStringComma("BotUsers", i11, ','));
            } else {
                setSubtitle(LocaleController.getString(R.string.Bot));
            }
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
        }
        if (zArr[0]) {
            i10 = g6.f23240n5;
        } else {
            i10 = g6.f23310r5;
        }
        this.f7291e.setTextColor(g6.v0(i10, this.f7288a));
        hp hpVar = this.f9008s;
        if (hpVar != null) {
            hpVar.setAlpha(1.0f);
        }
        int w02 = g6.w0(null, g6.f23453z9, false);
        boolean u10 = com.google.android.recaptcha.internal.a.u(user);
        cw0 cw0Var = this.F;
        if (u10) {
            a2 = cw0Var.a(user, null, w02, false);
        } else {
            a2 = cw0Var.a(null, null, w02, false);
        }
        cVar.i(a2);
    }
}
