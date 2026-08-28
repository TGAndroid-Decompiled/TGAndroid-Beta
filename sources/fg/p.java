package fg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import g7.e6;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.z8;
public final class p extends dg.d {
    public final ImageView A;
    public boolean B;
    public TLRPC.User C;
    public TLRPC.Chat D;
    public TL_stories.TL_myBoost E;
    public final sv0 F;
    public final boolean[] f6323r;
    public final dp f6324s;
    public final ImageView v;
    public boolean f6325w;
    public final ImageView f6326x;
    public boolean f6327y;

    public p(Context context, boolean z10, boolean z11, b6 b6Var, boolean z12) {
        super(context, b6Var);
        int i9;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        float f13;
        this.f6323r = new boolean[1];
        this.B = true;
        this.F = new sv0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f4502f.setVisibility(8);
        if (z11) {
            dp dpVar = new dp(context, 21, b6Var);
            this.f6324s = dpVar;
            dpVar.b(f6.B5, f6.f23072h5, f6.f23128k7);
            dpVar.setDrawUnchecked(false);
            dpVar.setDrawBackgroundAsArc(3);
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i13 = i12 | 48;
            if (z13) {
                f12 = 0.0f;
            } else {
                f12 = 40.0f;
            }
            if (z13) {
                f13 = 39.0f;
            } else {
                f13 = 0.0f;
            }
            addView(dpVar, e6.d(24, 24.0f, i13, f12, 33.0f, f13, 0.0f));
            d();
        } else if (z10) {
            dp dpVar2 = new dp(context, 21, b6Var);
            this.f6324s = dpVar2;
            if (z12) {
                dpVar2.b(f6.f23093i7, f6.f23110j7, f6.C5);
            } else {
                dpVar2.b(f6.B5, f6.f23110j7, f6.C5);
            }
            dpVar2.setDrawUnchecked(true);
            dpVar2.setDrawBackgroundAsArc(10);
            addView(dpVar2);
            dpVar2.a(false, false);
            if (LocaleController.isRTL) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            dpVar2.setLayoutParams(e6.d(24, 24.0f, i9 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.f6324s = null;
        }
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int v02 = f6.v0(f6.Ac, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(imageView, e6.d(32, 32.0f, i10 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f6326x = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i14 = f6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(i14, b6Var), mode));
        boolean z14 = LocaleController.isRTL;
        if (z14) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        int i15 = i11 | 16;
        if (z14) {
            f10 = 52.0f;
        } else {
            f10 = 12.0f;
        }
        if (z14) {
            f11 = 12.0f;
        } else {
            f11 = 52.0f;
        }
        addView(imageView2, e6.d(32, 32.0f, i15, f10, 0.0f, f11, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.A = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(f6.v0(i14, b6Var), mode));
        addView(imageView3, e6.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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
        dp dpVar = this.f6324s;
        if (dpVar != null && dpVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        dp dpVar = this.f6324s;
        if (dpVar != null && dpVar.getVisibility() == 0) {
            dpVar.a(z10, z11);
        }
    }

    public final void g(boolean z10, boolean z11) {
        float f10;
        int i9;
        float f11;
        Runnable runnable;
        if (this.B == z10) {
            return;
        }
        this.B = z10;
        float f12 = 0.0f;
        int i10 = 0;
        ImageView imageView = this.A;
        ImageView imageView2 = this.f6326x;
        if (z11) {
            imageView2.setVisibility(0);
            ViewPropertyAnimator animate = imageView2.animate();
            if (z10 && this.f6325w) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            Runnable runnable2 = null;
            if (z10 && this.f6325w) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final p f6321b;

                    {
                        this.f6321b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f6321b.f6326x.setVisibility(8);
                                return;
                            default:
                                this.f6321b.A.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha.withEndAction(runnable).start();
            imageView.setVisibility(0);
            ViewPropertyAnimator animate2 = imageView.animate();
            if (z10 && this.f6327y) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f12);
            if (!z10 || !this.f6327y) {
                runnable2 = new Runnable(this) {
                    public final p f6321b;

                    {
                        this.f6321b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f6321b.f6326x.setVisibility(8);
                                return;
                            default:
                                this.f6321b.A.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z10 && this.f6325w) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        imageView2.setAlpha(f10);
        if (z10 && this.f6325w) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        imageView2.setVisibility(i9);
        imageView.animate().cancel();
        if (z10 && this.f6327y) {
            f12 = 1.0f;
        }
        imageView.setAlpha(f12);
        imageView.setVisibility((z10 && this.f6327y) ? 8 : 8);
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

    public final void h(int i9, TLRPC.Chat chat) {
        float f10;
        int i10;
        String string;
        float f11;
        String str;
        this.v.setVisibility(8);
        this.D = chat;
        this.C = null;
        z8 z8Var = this.f4499b;
        z8Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f10 = 12.0f;
        } else {
            f10 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        o9 o9Var = this.f4500c;
        o9Var.setRoundRadius(dp);
        o9Var.e(chat, z8Var);
        String str2 = chat.title;
        dg.c cVar = this.d;
        cVar.k(str2);
        cVar.i(null);
        if (i9 <= 0) {
            i9 = chat.participants_count;
        }
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (i9 >= 1) {
            if (isChannelAndNotMegaGroup) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            string = LocaleController.formatPluralString(str, i9, new Object[0]);
        } else {
            if (isChannelAndNotMegaGroup) {
                i10 = R.string.DiscussChannel;
            } else {
                i10 = R.string.AccDescrGroup;
            }
            string = LocaleController.getString(i10);
        }
        setSubtitle(string);
        this.f4501e.setTextColor(f6.v0(f6.f23247r5, this.f4498a));
        if (i9 > 200) {
            f11 = 0.3f;
        } else {
            f11 = 1.0f;
        }
        i(f11, false);
    }

    public final void i(float f10, boolean z10) {
        dp dpVar = this.f6324s;
        if (dpVar != null) {
            if (z10) {
                if (Math.abs(dpVar.getAlpha() - f10) > 0.1d) {
                    dpVar.animate().cancel();
                    dpVar.animate().alpha(f10).start();
                    return;
                }
                return;
            }
            dpVar.animate().cancel();
            dpVar.setAlpha(f10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F.f32559a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F.f32559a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.v.setVisibility(8);
        this.E = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.D = chat;
        z8 z8Var = this.f4499b;
        z8Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        o9 o9Var = this.f4500c;
        o9Var.setRoundRadius(dp);
        o9Var.e(this.D, z8Var);
        String str = this.D.title;
        dg.c cVar = this.d;
        cVar.k(str);
        int v02 = f6.v0(f6.f23247r5, this.f4498a);
        h5 h5Var = this.f4501e;
        h5Var.setTextColor(v02);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i9 = tL_myBoost.cooldown_until_date;
        if (i9 > 0) {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i9 * 1000) - System.currentTimeMillis())));
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
        int i9;
        i5 a2;
        this.v.setVisibility(8);
        this.C = user;
        this.D = null;
        z8 z8Var = this.f4499b;
        z8Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        o9 o9Var = this.f4500c;
        o9Var.setRoundRadius(dp);
        o9Var.e(user, z8Var);
        String userName = UserObject.getUserName(user);
        dg.c cVar = this.d;
        cVar.k(userName);
        boolean[] zArr = this.f6323r;
        zArr[0] = false;
        if (UserObject.isBot(user)) {
            int i10 = user.bot_active_users;
            if (i10 > 0) {
                setSubtitle(LocaleController.formatPluralStringComma("BotUsers", i10, ','));
            } else {
                setSubtitle(LocaleController.getString(R.string.Bot));
            }
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
        }
        if (zArr[0]) {
            i9 = f6.f23178n5;
        } else {
            i9 = f6.f23247r5;
        }
        this.f4501e.setTextColor(f6.v0(i9, this.f4498a));
        dp dpVar = this.f6324s;
        if (dpVar != null) {
            dpVar.setAlpha(1.0f);
        }
        int w02 = f6.w0(null, f6.f23389z9, false);
        boolean v = e2.c.v(user);
        sv0 sv0Var = this.F;
        if (v) {
            a2 = sv0Var.a(user, null, w02, false);
        } else {
            a2 = sv0Var.a(null, null, w02, false);
        }
        cVar.i(a2);
    }
}
