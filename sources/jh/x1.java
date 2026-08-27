package jh;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.cq;
import org.telegram.ui.LaunchActivity;

public final class x1 implements View.OnClickListener {

    public final int f14119a;

    public final e4 f14120b;

    public x1(e4 e4Var, int i10) {
        this.f14119a = i10;
        this.f14120b = e4Var;
    }

    @Override
    public final void onClick(View view) {
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        boolean z10;
        CharSequence charSequenceReplaceEmoji;
        lh.w3 w3Var;
        int measuredWidth;
        r6 r6Var;
        int i10 = this.f14119a;
        e4 e4Var = this.f14120b;
        switch (i10) {
            case 0:
                i9 i9Var = e4Var.F0;
                i9Var.p();
                AndroidUtilities.runOnUIThread(new l3(i9Var, 1), 30L);
                break;
            case 1:
                g2 g2Var = e4Var.H0;
                g2Var.q(!g2Var.f14011b0, true);
                break;
            case 2:
                j3 j3Var = e4Var.Y0;
                TL_stories.StoryItem storyItem = e4Var.K1.f13141a;
                if (storyItem != null) {
                    if (e4Var.f13295y1) {
                        e4Var.F0(storyItem.privacy.isEmpty() ? new lh.o9(3, e4Var.f13296y2, new ArrayList()) : new lh.o9(e4Var.f13296y2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (e4Var.B0 == null) {
                            lh.w3 w3Var2 = new lh.w3(e4Var.getContext(), 1);
                            w3Var2.q(true);
                            w3Var2.G = Layout.Alignment.ALIGN_CENTER;
                            w3Var2.f16984h0 = new v1(e4Var, 9);
                            e4Var.B0 = w3Var2;
                            w3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            j3Var.addView(e4Var.B0, h7.z5.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User user = MessagesController.getInstance(e4Var.f13296y2).getUser(Long.valueOf(e4Var.f13291x1));
                        if (user != null) {
                            String strSubstring = user.first_name;
                            int iIndexOf = strSubstring.indexOf(32);
                            if (iIndexOf > 0) {
                                strSubstring = strSubstring.substring(0, iIndexOf);
                            }
                            if (!storyItem.close_friends) {
                                if (storyItem.contacts) {
                                    e4Var.B0.l(11.0f, 6.0f, 11.0f, 7.0f);
                                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, strSubstring));
                                    z10 = false;
                                } else if (storyItem.selected_contacts) {
                                    e4Var.B0.l(15.0f, 8.0f, 15.0f, 8.0f);
                                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, strSubstring));
                                }
                                charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilderReplaceTags, e4Var.B0.getTextPaint().getFontMetricsInt(), false);
                                w3Var = e4Var.B0;
                                if (z10) {
                                    measuredWidth = lh.w3.a(charSequenceReplaceEmoji, w3Var.getTextPaint());
                                } else {
                                    measuredWidth = j3Var.getMeasuredWidth();
                                }
                                w3Var.h = measuredWidth;
                                e4Var.B0.t(charSequenceReplaceEmoji);
                                e4Var.B0.m(1.0f, (-(j3Var.getWidth() - e4Var.f13294y0.getCenterX())) / AndroidUtilities.density);
                                i9 i9Var2 = ((z8) e4Var.M1).d;
                                i9Var2.f13477e1 = true;
                                i9Var2.P();
                                if (e4Var.B0.R) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                e4Var.B0.v();
                            } else {
                                e4Var.B0.l(15.0f, 8.0f, 15.0f, 8.0f);
                                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, strSubstring));
                            }
                            z10 = true;
                            charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilderReplaceTags, e4Var.B0.getTextPaint().getFontMetricsInt(), false);
                            w3Var = e4Var.B0;
                            if (z10) {
                                measuredWidth = lh.w3.a(charSequenceReplaceEmoji, w3Var.getTextPaint());
                            } else {
                                measuredWidth = j3Var.getMeasuredWidth();
                            }
                            w3Var.h = measuredWidth;
                            e4Var.B0.t(charSequenceReplaceEmoji);
                            e4Var.B0.m(1.0f, (-(j3Var.getWidth() - e4Var.f13294y0.getCenterX())) / AndroidUtilities.density);
                            i9 i9Var3 = ((z8) e4Var.M1).d;
                            i9Var3.f13477e1 = true;
                            i9Var3.P();
                            if (e4Var.B0.R) {
                                BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                            }
                            e4Var.B0.v();
                            break;
                        }
                    }
                }
                break;
            case 3:
                if (ApplicationLoader.isStandaloneBuild()) {
                    LaunchActivity launchActivity = LaunchActivity.C1;
                    if (launchActivity != null) {
                        launchActivity.z(true);
                    }
                } else if (!BuildVars.isHuaweiStoreApp()) {
                    we.e.s(e4Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                } else {
                    we.e.s(e4Var.getContext(), BuildVars.HUAWEI_STORE_URL);
                }
                break;
            case 4:
                c4 c4Var = e4Var.K1;
                if (c4Var != null && (r6Var = c4Var.f13142b) != null) {
                    r6Var.E = false;
                    r6Var.d = false;
                    r6Var.h = 0.0f;
                    r6Var.f13911r = 0.0f;
                    r6Var.f13910n = 0.0f;
                    if (r6Var.f13908e != null) {
                        try {
                            new File(r6Var.f13908e).delete();
                            r6Var.f13908e = null;
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    r6Var.d();
                    e4Var.f1(false);
                    break;
                }
                break;
            case 5:
                d1 d1Var = d1.S;
                if (d1Var != null) {
                    boolean zO = d1Var.o();
                    d1 d1Var2 = d1.S;
                    boolean z11 = !zO;
                    if (d1Var2.f13179n && d1Var2.f13180r != z11) {
                        d1Var2.f13180r = z11;
                        NativeInstance nativeInstance = d1Var2.A;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z11);
                        }
                    }
                    e4Var.W1.b(z11, true);
                    break;
                }
                break;
            case 6:
                g2 g2Var2 = e4Var.H0;
                if (!e4Var.D0(false)) {
                    hh.u7 u7VarY = hh.u7.y(e4Var.f13296y2, false);
                    if (u7VarY.f10154e && u7VarY.f10155f.amount <= 0) {
                        g2Var2.k(e4Var.D0(false));
                    } else {
                        g2Var2.p();
                    }
                } else {
                    g2Var2.k(e4Var.D0(false));
                }
                break;
            case 7:
                Context context = e4Var.getContext();
                org.telegram.ui.ActionBar.c6 c6Var = e4Var.f13290x0;
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, c6Var, false, false);
                e3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
                LinearLayout linearLayout = new LinearLayout(e4Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(e4Var.getContext());
                n9Var.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(e4Var.f13296y2).setPlaceholderImage(n9Var, "tg_superplaceholders_android_2", "😎", "150_150");
                linearLayout.addView(n9Var, h7.z5.t(150, 150, 1, 0, 16, 0, 16));
                TextView textView = new TextView(e4Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                rl.l(org.telegram.ui.ActionBar.g6.f23161j5, c6Var, textView, 1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, h7.z5.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(e4Var.getContext());
                textView2.setGravity(17);
                rl.l(org.telegram.ui.ActionBar.g6.f23300r5, c6Var, textView2, 1, 14.0f);
                org.telegram.messenger.y1.p(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, h7.z5.t(-1, -2, 1, 32, 9, 32, 19));
                lh.d dVar = new lh.d(e4Var.getContext(), c6Var, true);
                dVar.g(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                cq cqVar = new cq(R.drawable.mini_switch_lock, 0);
                cqVar.setTopOffset(1);
                spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
                dVar.f(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, h7.z5.q(-1, 48, 1));
                dVar.setOnClickListener(new ag.q0(24, e4Var, e3Var));
                e3Var.setCustomView(linearLayout);
                ((z8) e4Var.M1).h(e3Var);
                x3 x3Var = e4Var.f13261p1;
                if (x3Var != null) {
                    x3Var.a();
                }
                break;
            case 8:
                if (e4Var.f13237g3) {
                    o5.q();
                } else {
                    ((z8) e4Var.M1).h(new o5(e4Var.getContext(), e4Var.Y0.getY() + e4Var.getY(), 0, e4Var.f13290x0));
                }
                x3 x3Var2 = e4Var.f13261p1;
                if (x3Var2 != null) {
                    x3Var2.a();
                }
                break;
            case 9:
                ((z8) e4Var.M1).h(new o5(e4Var.getContext(), e4Var.Y0.getY() + e4Var.getY(), 0, e4Var.f13290x0));
                x3 x3Var3 = e4Var.f13261p1;
                if (x3Var3 != null) {
                    x3Var3.a();
                }
                break;
            case 10:
                n3 n3Var = e4Var.G0;
                boolean z12 = n3Var.f13062r0;
                t9 t9Var = n3Var.S;
                if (!z12) {
                    e4Var.f13228d3 = true;
                    n3Var.D(false);
                    break;
                } else if (!t9Var.y()) {
                    n3Var.C();
                    break;
                } else if (t9Var.y() && Math.abs(n3Var.f13048c0 - n3Var.f13050e0) < AndroidUtilities.touchSlop && Math.abs(n3Var.f13049d0 - n3Var.f13051f0) < AndroidUtilities.touchSlop) {
                    w9 w9Var = t9Var.o(n3Var.getContext()).f25826r;
                    w9Var.m();
                    if (!w9Var.f25872i && w9Var.f25865e) {
                        w9Var.f(false);
                        break;
                    }
                }
                break;
            case 11:
                e4Var.Y0(true);
                break;
            case 12:
                e4Var.e1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = e4Var.K1.f13141a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    e4Var.n0(new v1(e4Var, 10));
                } else {
                    e4Var.L0(null);
                }
                break;
        }
    }
}
