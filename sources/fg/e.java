package fg;

import ag.i0;
import ag.n;
import ag.o;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import f2.n1;
import gg.e0;
import gg.f0;
import gg.s;
import gg.v;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.th;
public abstract class e extends il0 {
    public final c6 f6738c;
    public boolean d;
    public o2 f6739e;
    public TLRPC.TL_payments_checkedGiftCode f6740f;
    public String h;
    public FrameLayout f6741n;

    public e(c6 c6Var) {
        this.f6738c = c6Var;
    }

    @Override
    public final boolean D(n1 n1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override
    public final int h() {
        return 5;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    i11 = 3;
                    if (i10 != 3) {
                        i11 = 4;
                        if (i10 != 4) {
                            return 5;
                        }
                    }
                }
            }
            return i11;
        }
        return 0;
    }

    @Override
    public final void v(n1 n1Var, int i10) {
        int i11;
        int i12;
        int i13;
        char c3;
        String formatPluralString;
        String string;
        int i14 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 == 4) {
                            gg.a aVar = (gg.a) view;
                            aVar.setOkStyle(this.d);
                            aVar.setOnClickListener(new n(7, this, aVar));
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f6740f;
                            if (tL_payments_checkedGiftCode.boost != null || tL_payments_checkedGiftCode.flags == -1) {
                                aVar.f7279e = false;
                                nh.d dVar = aVar.f7276a;
                                dVar.setShowZero(false);
                                dVar.setEnabled(true);
                                dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
                                aVar.setOnClickListener(new o(this, 9));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    f0 f0Var = (f0) view;
                    f0Var.setTextGravity(17);
                    f0Var.setTextColor(g6.w0(null, g6.G6, false));
                    f0Var.setTopPadding(14);
                    f0Var.setBottomPadding(15);
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f6740f;
                    if (tL_payments_checkedGiftCode2.boost != null) {
                        String str = this.h;
                        if (str != null && !str.isEmpty()) {
                            f0Var.setFixedSize(14);
                            f0Var.setText(null);
                            return;
                        }
                        f0Var.setText(LocaleController.getString(R.string.BoostingLinkNotActivated));
                        return;
                    } else if (this.d) {
                        if (tL_payments_checkedGiftCode2.to_id == -1) {
                            string = LocaleController.getString(R.string.BoostingSendLinkToAnyone);
                        } else {
                            string = LocaleController.getString(R.string.BoostingSendLinkToFriends);
                        }
                        f0Var.setText(AndroidUtilities.replaceSingleTag(string, g6.gc, 0, new c(this, 1), this.f6738c));
                        return;
                    } else {
                        Date date = new Date(this.f6740f.used_date * 1000);
                        f0Var.setText(LocaleController.formatString("BoostingUsedLinkDate", R.string.BoostingUsedLinkDate, LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date))));
                        return;
                    }
                }
                e0 e0Var = (e0) view;
                final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f6740f;
                final i0 i0Var = new i0(this, 11);
                t9 t9Var = e0Var.h;
                FrameLayout frameLayout = e0Var.f7306w;
                t9 t9Var2 = e0Var.f7302f;
                TextView textView = e0Var.f7298a;
                TextView textView2 = e0Var.f7299b;
                c6 c6Var = e0Var.f7303n;
                Date date2 = new Date(tL_payments_checkedGiftCode3.date * 1000);
                e0Var.f7301e.setText(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
                TextView textView3 = e0Var.d;
                if (tL_payments_checkedGiftCode3.via_giveaway) {
                    i11 = g6.f23222m5;
                } else {
                    i11 = g6.f23169j5;
                }
                textView3.setTextColor(g6.v0(i11, c6Var));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_payments_checkedGiftCode3.from_id)));
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (tL_payments_checkedGiftCode3.via_giveaway) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "**");
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.BoostingGiveaway));
                    spannableStringBuilder.append((CharSequence) "**");
                    textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder.toString(), g6.gc, 0, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    i0Var.run(tL_payments_checkedGiftCode3);
                                    return;
                                default:
                                    i0Var.run(tL_payments_checkedGiftCode3);
                                    return;
                            }
                        }
                    }, c6Var));
                    textView3.setOnClickListener(new n(9, i0Var, tL_payments_checkedGiftCode3));
                } else {
                    if (isChannelAndNotMegaGroup) {
                        i12 = R.string.BoostingYouWereSelected;
                    } else {
                        i12 = R.string.BoostingYouWereSelectedGroup;
                    }
                    textView3.setText(LocaleController.getString(i12));
                    textView3.setOnClickListener(null);
                }
                int i15 = tL_payments_checkedGiftCode3.months;
                if (i15 == 12) {
                    i13 = 1;
                    formatPluralString = LocaleController.formatPluralString("Years", 1, new Object[0]);
                    c3 = 0;
                } else {
                    i13 = 1;
                    c3 = 0;
                    formatPluralString = LocaleController.formatPluralString("Months", i15, new Object[0]);
                }
                TextView textView4 = e0Var.f7300c;
                int i16 = R.string.BoostingTelegramPremiumFor;
                String str2 = formatPluralString;
                Object[] objArr = new Object[i13];
                objArr[c3] = str2;
                textView4.setText(LocaleController.formatString("BoostingTelegramPremiumFor", i16, objArr));
                if (chat != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) "**");
                    spannableStringBuilder2.append((CharSequence) chat.title);
                    spannableStringBuilder2.append((CharSequence) "**");
                    textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder2.toString(), g6.gc, 0, new ef.c(15, i0Var, chat), c6Var), textView.getPaint().getFontMetricsInt(), false));
                    t9Var2.e(chat, new e9(chat));
                    frameLayout.setOnClickListener(new n(10, i0Var, chat));
                } else {
                    final TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode3.from_id.user_id));
                    textView.setText(Emoji.replaceEmoji(UserObject.getFirstName(user), textView.getPaint().getFontMetricsInt(), false));
                    t9Var2.e(user, new e9(0, user));
                    frameLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    i0Var.run(user);
                                    return;
                                default:
                                    i0Var.run(user);
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
                    textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder3.toString(), g6.gc, 0, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    i0Var.run(tL_payments_checkedGiftCode3);
                                    return;
                                default:
                                    i0Var.run(tL_payments_checkedGiftCode3);
                                    return;
                            }
                        }
                    }, c6Var));
                    textView2.setText(LocaleController.getString(R.string.BoostingNoRecipient));
                    textView2.setTextColor(g6.v0(g6.f23169j5, c6Var));
                    ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
                    ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
                    t9Var.setVisibility(8);
                } else {
                    final TLRPC.User user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode3.to_id));
                    if (user2 != null) {
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        spannableStringBuilder4.append((CharSequence) "**");
                        spannableStringBuilder4.append((CharSequence) UserObject.getFirstName(user2));
                        spannableStringBuilder4.append((CharSequence) "**");
                        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder4.toString(), g6.gc, 0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        i0Var.run(user2);
                                        return;
                                    default:
                                        i0Var.run(user2);
                                        return;
                                }
                            }
                        }, c6Var), textView2.getPaint().getFontMetricsInt(), false));
                        t9Var.e(user2, new e9(0, user2));
                        e0Var.f7307x.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        i0Var.run(user2);
                                        return;
                                    default:
                                        i0Var.run(user2);
                                        return;
                                }
                            }
                        });
                    }
                }
                if (tL_payments_checkedGiftCode3.boost != null) {
                    e0Var.f7308y.setVisibility(8);
                    return;
                }
                return;
            }
            v vVar = (v) view;
            vVar.setSlug(this.h);
            if (this.f6740f.boost != null && this.h == null) {
                vVar.a(new c(this, 0));
            }
            String str3 = this.h;
            if ((str3 == null || str3.isEmpty()) && this.f6740f.to_id == -1) {
                vVar.a(new c(this, 0));
                return;
            }
            return;
        }
        s sVar = (s) view;
        if (this.d) {
            sVar.f7334c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            sVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllows", R.string.BoostingLinkAllows, new Object[0])));
        } else {
            sVar.f7334c.setText(LocaleController.formatString("BoostingUsedGiftLink", R.string.BoostingUsedGiftLink, new Object[0]));
            sVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkUsed", R.string.BoostingLinkUsed, new Object[0])));
        }
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f6740f;
        if (tL_payments_checkedGiftCode4.boost != null) {
            long j10 = tL_payments_checkedGiftCode4.to_id;
            final i0 i0Var2 = new i0(this, 11);
            sVar.f7334c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingLinkAllowsToUser));
            final TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
            sVar.d.setText(AndroidUtilities.replaceCharSequence("%1$s", replaceTags, AndroidUtilities.replaceSingleTag("**" + UserObject.getUserName(user3) + "**", g6.gc, 2, new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            i0Var2.run(user3);
                            return;
                        default:
                            i0Var2.run(user3);
                            return;
                    }
                }
            }, sVar.f7335e)));
        }
        if (this.f6740f.to_id == -1) {
            sVar.f7334c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            sVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllowsAnyone", R.string.BoostingLinkAllowsAnyone, new Object[0])));
        }
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        View vVar;
        Context context = viewGroup.getContext();
        c6 c6Var = this.f6738c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            vVar = new s(context, c6Var);
                        } else {
                            vVar = new View(context);
                        }
                    } else {
                        vVar = new gg.a(context, c6Var);
                        vVar.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
                    }
                } else {
                    vVar = new f0(context, c6Var);
                }
            } else {
                vVar = new e0(context, c6Var);
            }
        } else {
            vVar = new v(context, c6Var);
        }
        return th.m(vVar, vVar, -1, -2);
    }
}
