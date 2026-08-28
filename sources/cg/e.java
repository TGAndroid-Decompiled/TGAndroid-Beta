package cg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.i;
import bg.u1;
import dg.g0;
import dg.h0;
import dg.u;
import dg.x;
import f2.q1;
import j3.r0;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.z8;
public abstract class e extends vk0 {
    public final b6 f2399c;
    public boolean d;
    public o2 f2400e;
    public TLRPC.TL_payments_checkedGiftCode f2401f;
    public String h;
    public FrameLayout f2402n;

    public e(b6 b6Var) {
        this.f2399c = b6Var;
    }

    @Override
    public final boolean D(q1 q1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override
    public final int h() {
        return 5;
    }

    @Override
    public final int j(int i9) {
        if (i9 != 0) {
            int i10 = 1;
            if (i9 != 1) {
                i10 = 2;
                if (i9 != 2) {
                    i10 = 3;
                    if (i9 != 3) {
                        i10 = 4;
                        if (i9 != 4) {
                            return 5;
                        }
                    }
                }
            }
            return i10;
        }
        return 0;
    }

    @Override
    public final void v(q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12;
        char c10;
        String formatPluralString;
        String string;
        int i13 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 == 4) {
                            dg.a aVar = (dg.a) view;
                            aVar.setOkStyle(this.d);
                            aVar.setOnClickListener(new u1(3, this, aVar));
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f2401f;
                            if (tL_payments_checkedGiftCode.boost != null || tL_payments_checkedGiftCode.flags == -1) {
                                aVar.f4486e = false;
                                kh.d dVar = aVar.f4483a;
                                dVar.setShowZero(false);
                                dVar.setEnabled(true);
                                dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
                                aVar.setOnClickListener(new androidx.mediarouter.app.c(this, 3));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    h0 h0Var = (h0) view;
                    h0Var.setTextGravity(17);
                    h0Var.setTextColor(f6.w0(null, f6.G6, false));
                    h0Var.setTopPadding(14);
                    h0Var.setBottomPadding(15);
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f2401f;
                    if (tL_payments_checkedGiftCode2.boost != null) {
                        String str = this.h;
                        if (str != null && !str.isEmpty()) {
                            h0Var.setFixedSize(14);
                            h0Var.setText(null);
                            return;
                        }
                        h0Var.setText(LocaleController.getString(R.string.BoostingLinkNotActivated));
                        return;
                    } else if (this.d) {
                        if (tL_payments_checkedGiftCode2.to_id == -1) {
                            string = LocaleController.getString(R.string.BoostingSendLinkToAnyone);
                        } else {
                            string = LocaleController.getString(R.string.BoostingSendLinkToFriends);
                        }
                        h0Var.setText(AndroidUtilities.replaceSingleTag(string, f6.f23061gc, 0, new c(this, 1), this.f2399c));
                        return;
                    } else {
                        Date date = new Date(this.f2401f.used_date * 1000);
                        h0Var.setText(LocaleController.formatString("BoostingUsedLinkDate", R.string.BoostingUsedLinkDate, LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date))));
                        return;
                    }
                }
                g0 g0Var = (g0) view;
                final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f2401f;
                final i iVar = new i(this, 4);
                o9 o9Var = g0Var.h;
                FrameLayout frameLayout = g0Var.f4522w;
                o9 o9Var2 = g0Var.f4518f;
                TextView textView = g0Var.f4514a;
                TextView textView2 = g0Var.f4515b;
                b6 b6Var = g0Var.f4519n;
                Date date2 = new Date(tL_payments_checkedGiftCode3.date * 1000);
                g0Var.f4517e.setText(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
                TextView textView3 = g0Var.d;
                if (tL_payments_checkedGiftCode3.via_giveaway) {
                    i10 = f6.f23161m5;
                } else {
                    i10 = f6.f23108j5;
                }
                textView3.setTextColor(f6.v0(i10, b6Var));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_payments_checkedGiftCode3.from_id)));
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (tL_payments_checkedGiftCode3.via_giveaway) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "**");
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.BoostingGiveaway));
                    spannableStringBuilder.append((CharSequence) "**");
                    textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder.toString(), f6.f23061gc, 0, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    iVar.run(tL_payments_checkedGiftCode3);
                                    return;
                                default:
                                    iVar.run(tL_payments_checkedGiftCode3);
                                    return;
                            }
                        }
                    }, b6Var));
                    textView3.setOnClickListener(new u1(5, iVar, tL_payments_checkedGiftCode3));
                } else {
                    if (isChannelAndNotMegaGroup) {
                        i11 = R.string.BoostingYouWereSelected;
                    } else {
                        i11 = R.string.BoostingYouWereSelectedGroup;
                    }
                    textView3.setText(LocaleController.getString(i11));
                    textView3.setOnClickListener(null);
                }
                int i14 = tL_payments_checkedGiftCode3.months;
                if (i14 == 12) {
                    i12 = 1;
                    formatPluralString = LocaleController.formatPluralString("Years", 1, new Object[0]);
                    c10 = 0;
                } else {
                    i12 = 1;
                    c10 = 0;
                    formatPluralString = LocaleController.formatPluralString("Months", i14, new Object[0]);
                }
                TextView textView4 = g0Var.f4516c;
                int i15 = R.string.BoostingTelegramPremiumFor;
                String str2 = formatPluralString;
                Object[] objArr = new Object[i12];
                objArr[c10] = str2;
                textView4.setText(LocaleController.formatString("BoostingTelegramPremiumFor", i15, objArr));
                if (chat != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) "**");
                    spannableStringBuilder2.append((CharSequence) chat.title);
                    spannableStringBuilder2.append((CharSequence) "**");
                    textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder2.toString(), f6.f23061gc, 0, new a1.e(26, iVar, chat), b6Var), textView.getPaint().getFontMetricsInt(), false));
                    o9Var2.e(chat, new z8(chat));
                    frameLayout.setOnClickListener(new u1(6, iVar, chat));
                } else {
                    final TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode3.from_id.user_id));
                    textView.setText(Emoji.replaceEmoji(UserObject.getFirstName(user), textView.getPaint().getFontMetricsInt(), false));
                    o9Var2.e(user, new z8(0, user));
                    frameLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    iVar.run(user);
                                    return;
                                default:
                                    iVar.run(user);
                                    return;
                            }
                        }
                    });
                }
                if (tL_payments_checkedGiftCode3.to_id == -1 && tL_payments_checkedGiftCode3.via_giveaway) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) "**");
                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.BoostingIncompleteGiveaway));
                    spannableStringBuilder3.append((CharSequence) "**");
                    textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder3.toString(), f6.f23061gc, 0, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    iVar.run(tL_payments_checkedGiftCode3);
                                    return;
                                default:
                                    iVar.run(tL_payments_checkedGiftCode3);
                                    return;
                            }
                        }
                    }, b6Var));
                    textView2.setText(LocaleController.getString(R.string.BoostingNoRecipient));
                    textView2.setTextColor(f6.v0(f6.f23108j5, b6Var));
                    ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
                    ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
                    o9Var.setVisibility(8);
                } else {
                    final TLRPC.User user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode3.to_id));
                    if (user2 != null) {
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        spannableStringBuilder4.append((CharSequence) "**");
                        spannableStringBuilder4.append((CharSequence) UserObject.getFirstName(user2));
                        spannableStringBuilder4.append((CharSequence) "**");
                        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder4.toString(), f6.f23061gc, 0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        iVar.run(user2);
                                        return;
                                    default:
                                        iVar.run(user2);
                                        return;
                                }
                            }
                        }, b6Var), textView2.getPaint().getFontMetricsInt(), false));
                        o9Var.e(user2, new z8(0, user2));
                        g0Var.f4523x.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        iVar.run(user2);
                                        return;
                                    default:
                                        iVar.run(user2);
                                        return;
                                }
                            }
                        });
                    }
                }
                if (tL_payments_checkedGiftCode3.boost != null) {
                    g0Var.f4524y.setVisibility(8);
                    return;
                }
                return;
            }
            x xVar = (x) view;
            xVar.setSlug(this.h);
            if (this.f2401f.boost != null && this.h == null) {
                xVar.a(new c(this, 0));
            }
            String str3 = this.h;
            if ((str3 == null || str3.isEmpty()) && this.f2401f.to_id == -1) {
                xVar.a(new c(this, 0));
                return;
            }
            return;
        }
        u uVar = (u) view;
        if (this.d) {
            uVar.f4552c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            uVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllows", R.string.BoostingLinkAllows, new Object[0])));
        } else {
            uVar.f4552c.setText(LocaleController.formatString("BoostingUsedGiftLink", R.string.BoostingUsedGiftLink, new Object[0]));
            uVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkUsed", R.string.BoostingLinkUsed, new Object[0])));
        }
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f2401f;
        if (tL_payments_checkedGiftCode4.boost != null) {
            long j10 = tL_payments_checkedGiftCode4.to_id;
            final i iVar2 = new i(this, 4);
            uVar.f4552c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingLinkAllowsToUser));
            final TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
            uVar.d.setText(AndroidUtilities.replaceCharSequence("%1$s", replaceTags, AndroidUtilities.replaceSingleTag("**" + UserObject.getUserName(user3) + "**", f6.f23061gc, 2, new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            iVar2.run(user3);
                            return;
                        default:
                            iVar2.run(user3);
                            return;
                    }
                }
            }, uVar.f4553e)));
        }
        if (this.f2401f.to_id == -1) {
            uVar.f4552c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            uVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllowsAnyone", R.string.BoostingLinkAllowsAnyone, new Object[0])));
        }
    }

    @Override
    public final q1 x(ViewGroup viewGroup, int i9) {
        View xVar;
        Context context = viewGroup.getContext();
        b6 b6Var = this.f2399c;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            xVar = new u(context, b6Var);
                        } else {
                            xVar = new View(context);
                        }
                    } else {
                        xVar = new dg.a(context, b6Var);
                        xVar.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
                    }
                } else {
                    xVar = new h0(context, b6Var);
                }
            } else {
                xVar = new g0(context, b6Var);
            }
        } else {
            xVar = new x(context, b6Var);
        }
        return r0.s(xVar, xVar, -1, -2);
    }
}
