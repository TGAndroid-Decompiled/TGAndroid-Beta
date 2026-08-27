package dg;

import ag.n0;
import ag.q0;
import ag.w0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import d5.u;
import eg.f0;
import eg.g0;
import eg.t;
import eg.w;
import f2.o1;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.yk0;

public abstract class e extends yk0 {

    public final c6 f4943c;
    public boolean d;

    public n2 f4944e;

    public TLRPC.TL_payments_checkedGiftCode f4945f;
    public String h;

    public FrameLayout f4946n;

    public e(c6 c6Var) {
        this.f4943c = c6Var;
    }

    @Override
    public final boolean D(o1 o1Var) {
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
        if (i10 == 0) {
            return 0;
        }
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

    @Override
    public final void v(o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 0) {
            t tVar = (t) view;
            if (this.d) {
                tVar.f5443c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                tVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllows", R.string.BoostingLinkAllows, new Object[0])));
            } else {
                tVar.f5443c.setText(LocaleController.formatString("BoostingUsedGiftLink", R.string.BoostingUsedGiftLink, new Object[0]));
                tVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkUsed", R.string.BoostingLinkUsed, new Object[0])));
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f4945f;
            if (tL_payments_checkedGiftCode.boost != null) {
                long j10 = tL_payments_checkedGiftCode.to_id;
                final n0 n0Var = new n0(this, 6);
                tVar.f5443c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingLinkAllowsToUser));
                final TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                final int i12 = 0;
                tVar.d.setText(AndroidUtilities.replaceCharSequence("%1$s", spannableStringBuilderReplaceTags, AndroidUtilities.replaceSingleTag("**" + UserObject.getUserName(user) + "**", g6.gc, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                n0Var.run(user);
                                break;
                            default:
                                n0Var.run(user);
                                break;
                        }
                    }
                }, tVar.f5444e)));
            }
            if (this.f4945f.to_id == -1) {
                tVar.f5443c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                tVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllowsAnyone", R.string.BoostingLinkAllowsAnyone, new Object[0])));
                return;
            }
            return;
        }
        int i13 = 1;
        if (i11 == 1) {
            w wVar = (w) view;
            wVar.setSlug(this.h);
            if (this.f4945f.boost != null && this.h == null) {
                wVar.a(new c(this, 0));
            }
            String str = this.h;
            if ((str == null || str.isEmpty()) && this.f4945f.to_id == -1) {
                wVar.a(new c(this, 0));
                return;
            }
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return;
                }
                eg.a aVar = (eg.a) view;
                aVar.setOkStyle(this.d);
                aVar.setOnClickListener(new q0(4, this, aVar));
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f4945f;
                if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                    aVar.f5385e = false;
                    lh.d dVar = aVar.f5382a;
                    dVar.setShowZero(false);
                    dVar.setEnabled(true);
                    dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
                    aVar.setOnClickListener(new w0(this, 5));
                    return;
                }
                return;
            }
            g0 g0Var = (g0) view;
            g0Var.setTextGravity(17);
            g0Var.setTextColor(g6.w0(null, g6.G6, false));
            g0Var.setTopPadding(14);
            g0Var.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f4945f;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.d) {
                    g0Var.setText(AndroidUtilities.replaceSingleTag(tL_payments_checkedGiftCode3.to_id == -1 ? LocaleController.getString(R.string.BoostingSendLinkToAnyone) : LocaleController.getString(R.string.BoostingSendLinkToFriends), g6.gc, 0, new c(this, i13), this.f4943c));
                    return;
                } else {
                    Date date = new Date(((long) this.f4945f.used_date) * 1000);
                    g0Var.setText(LocaleController.formatString("BoostingUsedLinkDate", R.string.BoostingUsedLinkDate, LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date))));
                    return;
                }
            }
            String str2 = this.h;
            if (str2 == null || str2.isEmpty()) {
                g0Var.setText(LocaleController.getString(R.string.BoostingLinkNotActivated));
                return;
            } else {
                g0Var.setFixedSize(14);
                g0Var.setText(null);
                return;
            }
        }
        f0 f0Var = (f0) view;
        final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f4945f;
        final n0 n0Var2 = new n0(this, 6);
        n9 n9Var = f0Var.h;
        FrameLayout frameLayout = f0Var.f5413w;
        n9 n9Var2 = f0Var.f5409f;
        TextView textView = f0Var.f5405a;
        TextView textView2 = f0Var.f5406b;
        c6 c6Var = f0Var.f5410n;
        Date date2 = new Date(((long) tL_payments_checkedGiftCode4.date) * 1000);
        f0Var.f5408e.setText(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
        TextView textView3 = f0Var.d;
        textView3.setTextColor(g6.v0(tL_payments_checkedGiftCode4.via_giveaway ? g6.f23214m5 : g6.f23161j5, c6Var));
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_payments_checkedGiftCode4.from_id)));
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.BoostingGiveaway));
            spannableStringBuilder.append((CharSequence) "**");
            final int i14 = 0;
            textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder.toString(), g6.gc, 0, new Runnable() {
                @Override
                public final void run() {
                    switch (i14) {
                        case 0:
                            n0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            n0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, c6Var));
            textView3.setOnClickListener(new q0(6, n0Var2, tL_payments_checkedGiftCode4));
        } else {
            textView3.setText(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.BoostingYouWereSelected : R.string.BoostingYouWereSelectedGroup));
            textView3.setOnClickListener(null);
        }
        int i15 = tL_payments_checkedGiftCode4.months;
        f0Var.f5407c.setText(LocaleController.formatString("BoostingTelegramPremiumFor", R.string.BoostingTelegramPremiumFor, i15 == 12 ? LocaleController.formatPluralString("Years", 1, new Object[0]) : LocaleController.formatPluralString("Months", i15, new Object[0])));
        if (chat != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) chat.title);
            spannableStringBuilder2.append((CharSequence) "**");
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder2.toString(), g6.gc, 0, new u(8, n0Var2, chat), c6Var), textView.getPaint().getFontMetricsInt(), false));
            n9Var2.e(chat, new y8(chat));
            frameLayout.setOnClickListener(new q0(7, n0Var2, chat));
        } else {
            final TLRPC.User user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final int i16 = 0;
            textView.setText(Emoji.replaceEmoji(UserObject.getFirstName(user2), textView.getPaint().getFontMetricsInt(), false));
            n9Var2.e(user2, new y8(0, user2));
            frameLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (i16) {
                        case 0:
                            n0Var2.run(user2);
                            break;
                        default:
                            n0Var2.run(user2);
                            break;
                    }
                }
            });
        }
        if (tL_payments_checkedGiftCode4.to_id == -1 && tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) "**");
            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.BoostingIncompleteGiveaway));
            spannableStringBuilder3.append((CharSequence) "**");
            final int i17 = 1;
            textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder3.toString(), g6.gc, 0, new Runnable() {
                @Override
                public final void run() {
                    switch (i17) {
                        case 0:
                            n0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            n0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, c6Var));
            textView2.setText(LocaleController.getString(R.string.BoostingNoRecipient));
            textView2.setTextColor(g6.v0(g6.f23161j5, c6Var));
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            n9Var.setVisibility(8);
        } else {
            final TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (user3 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                spannableStringBuilder4.append((CharSequence) UserObject.getFirstName(user3));
                spannableStringBuilder4.append((CharSequence) "**");
                final int i18 = 1;
                textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder4.toString(), g6.gc, 0, new Runnable() {
                    @Override
                    public final void run() {
                        switch (i18) {
                            case 0:
                                n0Var2.run(user3);
                                break;
                            default:
                                n0Var2.run(user3);
                                break;
                        }
                    }
                }, c6Var), textView2.getPaint().getFontMetricsInt(), false));
                n9Var.e(user3, new y8(0, user3));
                f0Var.f5414x.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        switch (i18) {
                            case 0:
                                n0Var2.run(user3);
                                break;
                            default:
                                n0Var2.run(user3);
                                break;
                        }
                    }
                });
            }
        }
        if (tL_payments_checkedGiftCode4.boost != null) {
            f0Var.f5415y.setVisibility(8);
        }
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        View wVar;
        Context context = viewGroup.getContext();
        c6 c6Var = this.f4943c;
        if (i10 == 1) {
            wVar = new w(context, c6Var);
        } else if (i10 == 2) {
            wVar = new f0(context, c6Var);
        } else if (i10 == 3) {
            wVar = new g0(context, c6Var);
        } else if (i10 != 4) {
            wVar = i10 != 5 ? new t(context, c6Var) : new View(context);
        } else {
            wVar = new eg.a(context, c6Var);
            wVar.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
        }
        return pa.l(wVar, wVar, -1, -2);
    }
}
