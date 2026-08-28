package kh;

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
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.eq;
public final class s9 extends FrameLayout {
    public Path A;
    public Paint B;
    public final org.telegram.ui.ActionBar.b6 f16059a;
    public final org.telegram.ui.Components.z8 f16060b;
    public final org.telegram.ui.Components.o9 f16061c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final org.telegram.ui.ActionBar.h5 f16062e;
    public final dp f16063f;
    public final RadioButton h;
    public final Paint f16064n;
    public boolean f16065r;
    public boolean f16066s;
    public boolean v;
    public final boolean[] f16067w;
    public long f16068x;
    public boolean f16069y;

    public s9(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.f16060b = z8Var;
        this.f16064n = new Paint(1);
        this.f16065r = false;
        this.f16066s = true;
        this.v = true;
        this.f16067w = new boolean[1];
        this.f16059a = b6Var;
        z8Var.f35236r = AndroidUtilities.dp(40.0f);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f16061c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(o9Var);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        h5Var.setGravity(i9);
        NotificationCenter.listenEmojiLoading(h5Var);
        addView(h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f16062e = h5Var2;
        h5Var2.setTextSize(14);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        h5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(h5Var2);
        addView(h5Var2);
        dp dpVar = new dp(context, 21, b6Var);
        this.f16063f = dpVar;
        int i11 = org.telegram.ui.ActionBar.f6.B5;
        int i12 = org.telegram.ui.ActionBar.f6.f23110j7;
        dpVar.b(i11, i12, org.telegram.ui.ActionBar.f6.C5);
        dpVar.setDrawUnchecked(true);
        dpVar.setDrawBackgroundAsArc(10);
        addView(dpVar);
        dpVar.a(false, false);
        dpVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.f6.v0(i12, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E5, b6Var));
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f16062e;
        if (charSequence == null) {
            h5Var.setTranslationY(0.0f);
            h5Var2.setVisibility(8);
            return;
        }
        h5Var.setTranslationY(AndroidUtilities.dp(-9.0f));
        h5Var2.setTranslationY(AndroidUtilities.dp(12.0f));
        h5Var2.l(charSequence, false);
        h5Var2.setVisibility(0);
    }

    public final void a(int i9, TLRPC.Chat chat) {
        long j10;
        float f10;
        String lowerCase;
        int i10;
        int i11;
        float f11;
        int i12;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f22380id;
        }
        this.f16068x = j10;
        org.telegram.ui.Components.z8 z8Var = this.f16060b;
        z8Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f10 = 12.0f;
        } else {
            f10 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        org.telegram.ui.Components.o9 o9Var = this.f16061c;
        o9Var.setRoundRadius(dp);
        o9Var.e(chat, z8Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.l(Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f16067w;
        zArr[0] = false;
        String str2 = "Members";
        if (this.f16065r) {
            if (i9 <= 0) {
                i9 = chat.participants_count;
            }
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            if (i9 >= 1) {
                if (isChannelAndNotMegaGroup) {
                    str2 = "Subscribers";
                }
                lowerCase = LocaleController.formatPluralString(str2, i9, new Object[0]);
            } else {
                if (isChannelAndNotMegaGroup) {
                    i12 = R.string.DiscussChannel;
                } else {
                    i12 = R.string.AccDescrGroup;
                }
                lowerCase = LocaleController.getString(i12);
            }
        } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
            if (i9 >= 1) {
                lowerCase = LocaleController.formatPluralStringComma("Subscribers", i9 - 1);
            } else if (!ChatObject.isPublic(chat)) {
                lowerCase = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
            } else {
                lowerCase = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
            }
        } else if (i9 >= 1) {
            lowerCase = LocaleController.formatPluralStringComma("Members", i9 - 1);
        } else if (chat.has_geo) {
            lowerCase = LocaleController.getString(R.string.MegaLocation);
        } else if (!ChatObject.isPublic(chat)) {
            lowerCase = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
        } else {
            lowerCase = LocaleController.getString(R.string.MegaPublic).toLowerCase();
        }
        setSubtitle(lowerCase);
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.f6.f23178n5;
        } else {
            i10 = org.telegram.ui.ActionBar.f6.f23247r5;
        }
        this.f16062e.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, this.f16059a));
        if (this.f16066s) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f16063f.setVisibility(i11);
        this.h.setVisibility(8);
        if (i9 > 200) {
            f11 = 0.3f;
        } else {
            f11 = 1.0f;
        }
        b(f11, false);
    }

    public final void b(float f10, boolean z10) {
        RadioButton radioButton = this.h;
        dp dpVar = this.f16063f;
        if (z10) {
            if (Math.abs(dpVar.getAlpha() - f10) > 0.1d) {
                dpVar.animate().cancel();
                dpVar.animate().alpha(f10).start();
            }
            if (Math.abs(radioButton.getAlpha() - f10) > 0.1d) {
                radioButton.animate().cancel();
                radioButton.animate().alpha(f10).start();
                return;
            }
            return;
        }
        dpVar.animate().cancel();
        dpVar.setAlpha(f10);
        radioButton.animate().cancel();
        radioButton.setAlpha(f10);
    }

    public final void c(boolean z10, boolean z11) {
        dp dpVar = this.f16063f;
        if (dpVar.getVisibility() == 0) {
            dpVar.a(z10, z11);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, z11);
        }
    }

    public final void d(boolean z10, boolean z11) {
        boolean z12;
        this.f16065r = z10;
        if (z11 != this.f16066s) {
            this.f16066s = z11;
            f();
        }
        if (!this.f16066s) {
            this.h.setVisibility(8);
            this.f16063f.setVisibility(8);
        }
        if (!this.f16069y && (this.f16066s || !this.f16065r)) {
            z12 = true;
        } else {
            z12 = false;
        }
        setWillNotDraw(z12);
    }

    public final void e(int i9, TLRPC.User user, int i10) {
        org.telegram.ui.ActionBar.b6 b6Var = this.f16059a;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f16062e;
        org.telegram.ui.Components.z8 z8Var = this.f16060b;
        int i11 = 0;
        if (i9 == 4) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionEveryone), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i10 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i10, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23178n5, b6Var));
            z8Var.g(7);
            z8Var.i(-15292942, -15630089);
        } else if (i9 == 2) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionContacts), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i10 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i10, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23178n5, b6Var));
            z8Var.g(4);
            z8Var.i(-3905294, -6923014);
        } else if (i9 == 1) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i10 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i10, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriendsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23178n5, b6Var));
            z8Var.g(15);
            z8Var.i(-7808710, -13781445);
        } else if (i9 == 3) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i10 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i10, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContactsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23178n5, b6Var));
            z8Var.g(6);
            z8Var.i(-18621, -618956);
        }
        this.f16063f.setVisibility(8);
        if (!this.f16066s) {
            i11 = 8;
        }
        this.h.setVisibility(i11);
        org.telegram.ui.Components.o9 o9Var = this.f16061c;
        o9Var.setImageDrawable(z8Var);
        o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }

    public final void f() {
        int i9;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        float f13;
        int i12;
        int i13;
        float f14;
        float f15;
        int i14;
        int i15;
        int i16 = 3;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        int i17 = i9 | 16;
        boolean z10 = this.f16066s;
        if (z10) {
            f10 = 53.0f;
        } else {
            f10 = 16.0f;
        }
        if (z10) {
            f11 = 53.0f;
        } else {
            f11 = 16.0f;
        }
        this.f16061c.setLayoutParams(g7.e6.d(40, 40.0f, i17, f10, 0.0f, f11, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 16;
        int i19 = 68;
        if (z11) {
            f12 = 20.0f;
        } else {
            if (this.f16066s) {
                i11 = 105;
            } else {
                i11 = 68;
            }
            f12 = i11;
        }
        if (z11) {
            if (this.f16066s) {
                i15 = 105;
            } else {
                i15 = 68;
            }
            f13 = i15;
        } else {
            f13 = 20.0f;
        }
        this.d.setLayoutParams(g7.e6.d(-1, -2.0f, i18, f12, 0.0f, f13, 0.0f));
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i20 = i12 | 16;
        if (z12) {
            f14 = 20.0f;
        } else {
            if (this.f16066s) {
                i13 = 105;
            } else {
                i13 = 68;
            }
            f14 = i13;
        }
        if (z12) {
            if (this.f16066s) {
                i19 = 105;
            }
            f15 = i19;
        } else {
            f15 = 20.0f;
        }
        this.f16062e.setLayoutParams(g7.e6.d(-1, -2.0f, i20, f14, 0.0f, f15, 0.0f));
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        this.f16063f.setLayoutParams(g7.e6.d(24, 24.0f, i14 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (LocaleController.isRTL) {
            i16 = 5;
        }
        this.h.setLayoutParams(g7.e6.d(22, 22.0f, i16 | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        eq eqVar = new eq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.f16069y) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, this.f16059a);
            Paint paint2 = this.f16064n;
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
        Path path = this.A;
        if (path != null && (paint = this.B) != null && !this.f16066s && this.f16065r && this.v) {
            canvas2.drawPath(path, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r7) {
        throw new UnsupportedOperationException("Method not decompiled: kh.s9.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int measuredWidth;
        float f11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        if (this.f16065r && !this.f16066s) {
            f10 = 62.0f;
        } else {
            f10 = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
        if (!this.f16066s && this.f16065r) {
            Path path = this.A;
            if (path == null) {
                this.A = new Path();
            } else {
                path.rewind();
            }
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(31.0f);
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(31.0f);
            }
            float f12 = measuredWidth;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (LocaleController.isRTL) {
                f11 = -1.0f;
            } else {
                f11 = 1.0f;
            }
            this.A.moveTo(f12, measuredHeight - AndroidUtilities.dp(6.0f));
            this.A.lineTo((f11 * AndroidUtilities.dp(6.0f)) + f12, measuredHeight);
            this.A.lineTo(f12, measuredHeight + AndroidUtilities.dp(6.0f));
            if (this.B == null) {
                Paint paint = new Paint(1);
                this.B = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.B.setStrokeCap(Paint.Cap.ROUND);
            }
            this.B.setStrokeWidth(AndroidUtilities.dpf2(1.86f));
            this.B.setColor(org.telegram.ui.ActionBar.f6.l1(0.3f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, this.f16059a)));
        }
    }

    public void set(Object obj) {
        int i9;
        boolean z10 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        if (z10) {
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            h5Var.setTypeface(null);
            int i10 = -AndroidUtilities.dp(52.0f);
            if (LocaleController.isRTL) {
                i9 = -1;
            } else {
                i9 = 1;
            }
            h5Var.setTranslationX(i10 * i9);
            h5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        boolean z11;
        this.f16069y = z10;
        if (!z10 && (this.f16066s || !this.f16065r)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    public void setRedCheckbox(boolean z10) {
        int i9;
        if (z10) {
            i9 = org.telegram.ui.ActionBar.f6.wj;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.B5;
        }
        this.f16063f.b(i9, org.telegram.ui.ActionBar.f6.f23110j7, org.telegram.ui.ActionBar.f6.C5);
    }

    public void setUser(TLRPC.User user) {
        long j10;
        int i9;
        if (user == null) {
            j10 = 0;
        } else {
            j10 = user.f22527id;
        }
        this.f16068x = j10;
        org.telegram.ui.Components.z8 z8Var = this.f16060b;
        z8Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.o9 o9Var = this.f16061c;
        o9Var.setRoundRadius(dp);
        o9Var.e(user, z8Var);
        String userName = UserObject.getUserName(user);
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        int i10 = 0;
        h5Var.l(Emoji.replaceEmoji(userName, h5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f16067w;
        zArr[0] = false;
        boolean z10 = this.f16065r;
        org.telegram.ui.ActionBar.b6 b6Var = this.f16059a;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f16062e;
        if (z10) {
            setSubtitle(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23247r5, b6Var));
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
            if (zArr[0]) {
                i9 = org.telegram.ui.ActionBar.f6.f23178n5;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.f23247r5;
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        }
        if (!this.f16066s) {
            i10 = 8;
        }
        dp dpVar = this.f16063f;
        dpVar.setVisibility(i10);
        dpVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }
}
