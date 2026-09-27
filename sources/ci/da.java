package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.qq;
public final class da extends FrameLayout {
    public Path E;
    public Paint F;
    public final org.telegram.ui.ActionBar.e6 f4551a;
    public final org.telegram.ui.Components.h9 f4552b;
    public final org.telegram.ui.Components.w9 f4553c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final pp f4554f;
    public final RadioButton h;
    public final Paint f4555n;
    public boolean f4556r;
    public boolean f4557s;
    public boolean v;
    public final boolean[] f4558w;
    public long f4559x;
    public boolean f4560y;

    public da(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.e6) null);
        this.f4552b = h9Var;
        this.f4555n = new Paint(1);
        this.f4556r = false;
        this.f4557s = true;
        this.v = true;
        this.f4558w = new boolean[1];
        this.f4551a = e6Var;
        h9Var.f24769r = AndroidUtilities.dp(40.0f);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f4553c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(16);
        int i11 = org.telegram.ui.ActionBar.i6.f19164j5;
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j5Var.setGravity(i10);
        NotificationCenter.listenEmojiLoading(j5Var);
        addView(j5Var);
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var2;
        j5Var2.setTextSize(14);
        j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        j5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(j5Var2);
        addView(j5Var2);
        pp ppVar = new pp(context, 21, e6Var);
        this.f4554f = ppVar;
        int i12 = org.telegram.ui.ActionBar.i6.B5;
        int i13 = org.telegram.ui.ActionBar.i6.f19166j7;
        ppVar.b(i12, i13, org.telegram.ui.ActionBar.i6.C5);
        ppVar.setDrawUnchecked(true);
        ppVar.setDrawBackgroundAsArc(10);
        addView(ppVar);
        ppVar.a(false, false);
        ppVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.i6.v0(i13, e6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E5, e6Var));
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.e;
        if (charSequence == null) {
            j5Var.setTranslationY(0.0f);
            j5Var2.setVisibility(8);
            return;
        }
        j5Var.setTranslationY(AndroidUtilities.dp(-9.0f));
        j5Var2.setTranslationY(AndroidUtilities.dp(12.0f));
        j5Var2.l(charSequence, false);
        j5Var2.setVisibility(0);
    }

    public final void a(int i10, TLRPC.Chat chat) {
        long j3;
        float f7;
        String lowerCase;
        int i11;
        int i12;
        float f10;
        int i13;
        if (chat == null) {
            j3 = 0;
        } else {
            j3 = -chat.f18329id;
        }
        this.f4559x = j3;
        org.telegram.ui.Components.h9 h9Var = this.f4552b;
        h9Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f7 = 12.0f;
        } else {
            f7 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        org.telegram.ui.Components.w9 w9Var = this.f4553c;
        w9Var.setRoundRadius(dp);
        w9Var.e(chat, h9Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.l(Emoji.replaceEmoji(str, j5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f4558w;
        zArr[0] = false;
        String str2 = "Members";
        if (this.f4556r) {
            if (i10 <= 0) {
                i10 = chat.participants_count;
            }
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            if (i10 >= 1) {
                if (isChannelAndNotMegaGroup) {
                    str2 = "Subscribers";
                }
                lowerCase = LocaleController.formatPluralString(str2, i10, new Object[0]);
            } else {
                if (isChannelAndNotMegaGroup) {
                    i13 = R.string.DiscussChannel;
                } else {
                    i13 = R.string.AccDescrGroup;
                }
                lowerCase = LocaleController.getString(i13);
            }
        } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
            if (i10 >= 1) {
                lowerCase = LocaleController.formatPluralStringComma("Subscribers", i10 - 1);
            } else if (!ChatObject.isPublic(chat)) {
                lowerCase = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
            } else {
                lowerCase = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
            }
        } else if (i10 >= 1) {
            lowerCase = LocaleController.formatPluralStringComma("Members", i10 - 1);
        } else if (chat.has_geo) {
            lowerCase = LocaleController.getString(R.string.MegaLocation);
        } else if (!ChatObject.isPublic(chat)) {
            lowerCase = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
        } else {
            lowerCase = LocaleController.getString(R.string.MegaPublic).toLowerCase();
        }
        setSubtitle(lowerCase);
        if (zArr[0]) {
            i11 = org.telegram.ui.ActionBar.i6.f19241n5;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.f19315r5;
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, this.f4551a));
        if (this.f4557s) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f4554f.setVisibility(i12);
        this.h.setVisibility(8);
        if (i10 > 200) {
            f10 = 0.3f;
        } else {
            f10 = 1.0f;
        }
        b(f10, false);
    }

    public final void b(float f7, boolean z10) {
        RadioButton radioButton = this.h;
        pp ppVar = this.f4554f;
        if (z10) {
            if (Math.abs(ppVar.getAlpha() - f7) > 0.1d) {
                ppVar.animate().cancel();
                ppVar.animate().alpha(f7).start();
            }
            if (Math.abs(radioButton.getAlpha() - f7) > 0.1d) {
                radioButton.animate().cancel();
                radioButton.animate().alpha(f7).start();
                return;
            }
            return;
        }
        ppVar.animate().cancel();
        ppVar.setAlpha(f7);
        radioButton.animate().cancel();
        radioButton.setAlpha(f7);
    }

    public final void c(boolean z10, boolean z11) {
        pp ppVar = this.f4554f;
        if (ppVar.getVisibility() == 0) {
            ppVar.a(z10, z11);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, z11);
        }
    }

    public final void d(boolean z10, boolean z11) {
        boolean z12;
        this.f4556r = z10;
        if (z11 != this.f4557s) {
            this.f4557s = z11;
            f();
        }
        if (!this.f4557s) {
            this.h.setVisibility(8);
            this.f4554f.setVisibility(8);
        }
        if (!this.f4560y && (this.f4557s || !this.f4556r)) {
            z12 = true;
        } else {
            z12 = false;
        }
        setWillNotDraw(z12);
    }

    public final void e(int i10, TLRPC.User user, int i11) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f4551a;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.e;
        org.telegram.ui.Components.h9 h9Var = this.f4552b;
        int i12 = 0;
        if (i10 == 4) {
            j5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionEveryone), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), j5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19241n5, e6Var));
            h9Var.g(7);
            h9Var.i(-15292942, -15630089);
        } else if (i10 == 2) {
            j5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), j5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19241n5, e6Var));
            h9Var.g(4);
            h9Var.i(-3905294, -6923014);
        } else if (i10 == 1) {
            j5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), j5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriendsDetail)));
            }
            j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19241n5, e6Var));
            h9Var.g(15);
            h9Var.i(-7808710, -13781445);
        } else if (i10 == 3) {
            j5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), j5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContactsDetail)));
            }
            j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19241n5, e6Var));
            h9Var.g(6);
            h9Var.i(-18621, -618956);
        }
        this.f4554f.setVisibility(8);
        if (!this.f4557s) {
            i12 = 8;
        }
        this.h.setVisibility(i12);
        org.telegram.ui.Components.w9 w9Var = this.f4553c;
        w9Var.setImageDrawable(h9Var);
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }

    public final void f() {
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        float f12;
        int i13;
        int i14;
        float f13;
        float f14;
        int i15;
        int i16;
        int i17 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 16;
        boolean z10 = this.f4557s;
        if (z10) {
            f7 = 53.0f;
        } else {
            f7 = 16.0f;
        }
        if (z10) {
            f10 = 53.0f;
        } else {
            f10 = 16.0f;
        }
        this.f4553c.setLayoutParams(w7.y5.d(40, 40.0f, i18, f7, 0.0f, f10, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i19 = i11 | 16;
        int i20 = 68;
        if (z11) {
            f11 = 20.0f;
        } else {
            if (this.f4557s) {
                i12 = 105;
            } else {
                i12 = 68;
            }
            f11 = i12;
        }
        if (z11) {
            if (this.f4557s) {
                i16 = 105;
            } else {
                i16 = 68;
            }
            f12 = i16;
        } else {
            f12 = 20.0f;
        }
        this.d.setLayoutParams(w7.y5.d(-1, -2.0f, i19, f11, 0.0f, f12, 0.0f));
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i21 = i13 | 16;
        if (z12) {
            f13 = 20.0f;
        } else {
            if (this.f4557s) {
                i14 = 105;
            } else {
                i14 = 68;
            }
            f13 = i14;
        }
        if (z12) {
            if (this.f4557s) {
                i20 = 105;
            }
            f14 = i20;
        } else {
            f14 = 20.0f;
        }
        this.e.setLayoutParams(w7.y5.d(-1, -2.0f, i21, f13, 0.0f, f14, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        this.f4554f.setLayoutParams(w7.y5.d(24, 24.0f, i15 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (LocaleController.isRTL) {
            i17 = 5;
        }
        this.h.setLayoutParams(w7.y5.d(22, 22.0f, i17 | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        qq qqVar = new qq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(qqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.f4560y) {
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19058d7, this.f4551a);
            Paint paint2 = this.f4555n;
            paint2.setColor(v02);
            if (LocaleController.isRTL) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(AndroidUtilities.dp(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
            }
        } else {
            canvas2 = canvas;
        }
        Path path = this.E;
        if (path != null && (paint = this.F) != null && !this.f4557s && this.f4556r && this.v) {
            canvas2.drawPath(path, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r7) {
        throw new UnsupportedOperationException("Method not decompiled: ci.da.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int measuredWidth;
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f4556r && !this.f4557s) {
            f7 = 62.0f;
        } else {
            f7 = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
        if (!this.f4557s && this.f4556r) {
            Path path = this.E;
            if (path == null) {
                this.E = new Path();
            } else {
                path.rewind();
            }
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(31.0f);
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(31.0f);
            }
            float f11 = measuredWidth;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (LocaleController.isRTL) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            this.E.moveTo(f11, measuredHeight - AndroidUtilities.dp(6.0f));
            this.E.lineTo((f10 * AndroidUtilities.dp(6.0f)) + f11, measuredHeight);
            this.E.lineTo(f11, measuredHeight + AndroidUtilities.dp(6.0f));
            if (this.F == null) {
                Paint paint = new Paint(1);
                this.F = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.F.setStrokeCap(Paint.Cap.ROUND);
            }
            this.F.setStrokeWidth(AndroidUtilities.dpf2(1.86f));
            this.F.setColor(org.telegram.ui.ActionBar.i6.l1(0.3f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, this.f4551a)));
        }
    }

    public void set(Object obj) {
        int i10;
        boolean z10 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        if (z10) {
            j5Var.setTypeface(AndroidUtilities.bold());
            j5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            j5Var.setTypeface(AndroidUtilities.bold());
            j5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            j5Var.setTypeface(null);
            int i11 = -AndroidUtilities.dp(52.0f);
            if (LocaleController.isRTL) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            j5Var.setTranslationX(i11 * i10);
            j5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        boolean z11;
        this.f4560y = z10;
        if (!z10 && (this.f4557s || !this.f4556r)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    public void setRedCheckbox(boolean z10) {
        int i10;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.i6.wj;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.B5;
        }
        this.f4554f.b(i10, org.telegram.ui.ActionBar.i6.f19166j7, org.telegram.ui.ActionBar.i6.C5);
    }

    public void setUser(TLRPC.User user) {
        long j3;
        int i10;
        if (user == null) {
            j3 = 0;
        } else {
            j3 = user.f18476id;
        }
        this.f4559x = j3;
        org.telegram.ui.Components.h9 h9Var = this.f4552b;
        h9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.w9 w9Var = this.f4553c;
        w9Var.setRoundRadius(dp);
        w9Var.e(user, h9Var);
        String userName = UserObject.getUserName(user);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        int i11 = 0;
        j5Var.l(Emoji.replaceEmoji(userName, j5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f4558w;
        zArr[0] = false;
        boolean z10 = this.f4556r;
        org.telegram.ui.ActionBar.e6 e6Var = this.f4551a;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.e;
        if (z10) {
            setSubtitle(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19315r5, e6Var));
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
            if (zArr[0]) {
                i10 = org.telegram.ui.ActionBar.i6.f19241n5;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.f19315r5;
            }
            j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        }
        if (!this.f4557s) {
            i11 = 8;
        }
        pp ppVar = this.f4554f;
        ppVar.setVisibility(i11);
        ppVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }
}
