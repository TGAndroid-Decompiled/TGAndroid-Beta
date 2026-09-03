package lg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.Date;
import k7.c6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
public final class n extends jg.d {
    public final ImageView B;
    public boolean C;
    public TLRPC.User D;
    public TLRPC.Chat E;
    public TL_stories.TL_myBoost F;
    public final lw0 G;
    public final boolean[] f12574r;
    public final np f12575s;
    public final ImageView v;
    public boolean f12576w;
    public final ImageView f12577x;
    public boolean f12578y;

    public n(Context context, boolean z4, boolean z10, g6 g6Var, boolean z11) {
        super(context, g6Var);
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        float f12;
        float f13;
        this.f12574r = new boolean[1];
        this.C = true;
        this.G = new lw0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f10022f.setVisibility(8);
        if (z10) {
            np npVar = new np(context, 21, g6Var);
            this.f12575s = npVar;
            npVar.b(k6.B5, k6.f21733h5, k6.f21788k7);
            npVar.setDrawUnchecked(false);
            npVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i14 = i13 | 48;
            if (z12) {
                f12 = 0.0f;
            } else {
                f12 = 40.0f;
            }
            if (z12) {
                f13 = 39.0f;
            } else {
                f13 = 0.0f;
            }
            addView(npVar, c6.d(24, 24.0f, i14, f12, 33.0f, f13, 0.0f));
            d();
        } else if (z4) {
            np npVar2 = new np(context, 21, g6Var);
            this.f12575s = npVar2;
            if (z11) {
                npVar2.b(k6.f21753i7, k6.f21770j7, k6.C5);
            } else {
                npVar2.b(k6.B5, k6.f21770j7, k6.C5);
            }
            npVar2.setDrawUnchecked(true);
            npVar2.setDrawBackgroundAsArc(10);
            addView(npVar2);
            npVar2.a(false, false);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            npVar2.setLayoutParams(c6.d(24, 24.0f, i10 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.f12575s = null;
        }
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int v02 = k6.v0(k6.Ac, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, c6.d(32, 32.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f12577x = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i15 = k6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(k6.v0(i15, g6Var), mode));
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        int i16 = i12 | 16;
        if (z13) {
            f10 = 52.0f;
        } else {
            f10 = 12.0f;
        }
        if (z13) {
            f11 = 12.0f;
        } else {
            f11 = 52.0f;
        }
        addView(imageView2, c6.d(32, 32.0f, i16, f10, 0.0f, f11, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.B = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(k6.v0(i15, g6Var), mode));
        addView(imageView3, c6.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        imageView3.setVisibility(8);
    }

    public static String f(long j10) {
        long j11 = j10 / 3600000;
        long j12 = j10 % 3600000;
        long j13 = j12 / 60000;
        long j14 = (j12 % 60000) / 1000;
        StringBuilder sb = new StringBuilder();
        if (j11 > 0) {
            sb.append(String.format("%02d", Long.valueOf(j11)));
            sb.append(":");
        }
        sb.append(String.format("%02d", Long.valueOf(j13)));
        sb.append(":");
        sb.append(String.format("%02d", Long.valueOf(j14)));
        return sb.toString();
    }

    @Override
    public final boolean b() {
        np npVar = this.f12575s;
        if (npVar != null && npVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z4, boolean z10) {
        np npVar = this.f12575s;
        if (npVar != null && npVar.getVisibility() == 0) {
            npVar.a(z4, z10);
        }
    }

    public final void g(boolean z4, boolean z10) {
        float f10;
        int i10;
        float f11;
        Runnable runnable;
        if (this.C == z4) {
            return;
        }
        this.C = z4;
        float f12 = 0.0f;
        int i11 = 0;
        ImageView imageView = this.B;
        ImageView imageView2 = this.f12577x;
        if (z10) {
            imageView2.setVisibility(0);
            ViewPropertyAnimator animate = imageView2.animate();
            if (z4 && this.f12576w) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            Runnable runnable2 = null;
            if (z4 && this.f12576w) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final n f12572b;

                    {
                        this.f12572b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f12572b.f12577x.setVisibility(8);
                                return;
                            default:
                                this.f12572b.B.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha.withEndAction(runnable).start();
            imageView.setVisibility(0);
            ViewPropertyAnimator animate2 = imageView.animate();
            if (z4 && this.f12578y) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f12);
            if (!z4 || !this.f12578y) {
                runnable2 = new Runnable(this) {
                    public final n f12572b;

                    {
                        this.f12572b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f12572b.f12577x.setVisibility(8);
                                return;
                            default:
                                this.f12572b.B.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z4 && this.f12576w) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        imageView2.setAlpha(f10);
        if (z4 && this.f12576w) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        imageView.animate().cancel();
        if (z4 && this.f12578y) {
            f12 = 1.0f;
        }
        imageView.setAlpha(f12);
        imageView.setVisibility((z4 && this.f12578y) ? 8 : 8);
    }

    public TL_stories.TL_myBoost getBoost() {
        return this.F;
    }

    public TLRPC.Chat getChat() {
        return this.E;
    }

    public TLRPC.User getUser() {
        return this.D;
    }

    public final void h(int i10, TLRPC.Chat chat) {
        float f10;
        int i11;
        String string;
        float f11;
        String str;
        this.v.setVisibility(8);
        this.E = chat;
        this.D = null;
        z8 z8Var = this.f10019b;
        z8Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f10 = 12.0f;
        } else {
            f10 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        p9 p9Var = this.f10020c;
        p9Var.setRoundRadius(dp);
        p9Var.e(chat, z8Var);
        String str2 = chat.title;
        jg.c cVar = this.d;
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
        this.f10021e.setTextColor(k6.v0(k6.f21913r5, this.f10018a));
        if (i10 > 200) {
            f11 = 0.3f;
        } else {
            f11 = 1.0f;
        }
        i(f11, false);
    }

    public final void i(float f10, boolean z4) {
        np npVar = this.f12575s;
        if (npVar != null) {
            if (z4) {
                if (Math.abs(npVar.getAlpha() - f10) > 0.1d) {
                    npVar.animate().cancel();
                    npVar.animate().alpha(f10).start();
                    return;
                }
                return;
            }
            npVar.animate().cancel();
            npVar.setAlpha(f10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G.f28891a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G.f28891a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.v.setVisibility(8);
        this.F = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.E = chat;
        z8 z8Var = this.f10019b;
        z8Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        p9 p9Var = this.f10020c;
        p9Var.setRoundRadius(dp);
        p9Var.e(this.E, z8Var);
        String str = this.E.title;
        jg.c cVar = this.d;
        cVar.k(str);
        int v02 = k6.v0(k6.f21913r5, this.f10018a);
        l5 l5Var = this.f10021e;
        l5Var.setTextColor(v02);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 > 0) {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i10 * 1000) - System.currentTimeMillis())));
            cVar.setAlpha(0.65f);
            l5Var.setAlpha(0.65f);
            i(0.3f, false);
            return;
        }
        cVar.setAlpha(1.0f);
        l5Var.setAlpha(1.0f);
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
        j5 a2;
        this.v.setVisibility(8);
        this.D = user;
        this.E = null;
        z8 z8Var = this.f10019b;
        z8Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        p9 p9Var = this.f10020c;
        p9Var.setRoundRadius(dp);
        p9Var.e(user, z8Var);
        String userName = UserObject.getUserName(user);
        jg.c cVar = this.d;
        cVar.k(userName);
        boolean[] zArr = this.f12574r;
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
            i10 = k6.f21840n5;
        } else {
            i10 = k6.f21913r5;
        }
        this.f10021e.setTextColor(k6.v0(i10, this.f10018a));
        np npVar = this.f12575s;
        if (npVar != null) {
            npVar.setAlpha(1.0f);
        }
        int w02 = k6.w0(null, k6.f22058z9, false);
        boolean s6 = e2.c.s(user);
        lw0 lw0Var = this.G;
        if (s6) {
            a2 = lw0Var.a(user, null, w02, false);
        } else {
            a2 = lw0Var.a(null, null, w02, false);
        }
        cVar.i(a2);
    }
}
