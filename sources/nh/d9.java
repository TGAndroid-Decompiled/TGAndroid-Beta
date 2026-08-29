package nh;

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
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.iq;
public final class d9 extends FrameLayout {
    public Path A;
    public Paint B;
    public final org.telegram.ui.ActionBar.c6 f17538a;
    public final org.telegram.ui.Components.e9 f17539b;
    public final org.telegram.ui.Components.t9 f17540c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final org.telegram.ui.ActionBar.h5 f17541e;
    public final hp f17542f;
    public final RadioButton h;
    public final Paint f17543n;
    public boolean f17544r;
    public boolean f17545s;
    public boolean v;
    public final boolean[] f17546w;
    public long f17547x;
    public boolean f17548y;

    public d9(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.f17539b = e9Var;
        this.f17543n = new Paint(1);
        this.f17544r = false;
        this.f17545s = true;
        this.v = true;
        this.f17546w = new boolean[1];
        this.f17538a = c6Var;
        e9Var.f27966r = AndroidUtilities.dp(40.0f);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f17540c = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(t9Var);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h5Var.setGravity(i10);
        NotificationCenter.listenEmojiLoading(h5Var);
        addView(h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f17541e = h5Var2;
        h5Var2.setTextSize(14);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        h5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(h5Var2);
        addView(h5Var2);
        hp hpVar = new hp(context, 21, c6Var);
        this.f17542f = hpVar;
        int i12 = org.telegram.ui.ActionBar.g6.B5;
        int i13 = org.telegram.ui.ActionBar.g6.f23171j7;
        hpVar.b(i12, i13, org.telegram.ui.ActionBar.g6.C5);
        hpVar.setDrawUnchecked(true);
        hpVar.setDrawBackgroundAsArc(10);
        addView(hpVar);
        hpVar.a(false, false);
        hpVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.g6.v0(i13, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E5, c6Var));
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f17541e;
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

    public final void a(int i10, TLRPC.Chat chat) {
        long j10;
        float f9;
        String lowerCase;
        int i11;
        int i12;
        float f10;
        int i13;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f22392id;
        }
        this.f17547x = j10;
        org.telegram.ui.Components.e9 e9Var = this.f17539b;
        e9Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f9 = 12.0f;
        } else {
            f9 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        org.telegram.ui.Components.t9 t9Var = this.f17540c;
        t9Var.setRoundRadius(dp);
        t9Var.e(chat, e9Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.l(Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f17546w;
        zArr[0] = false;
        String str2 = "Members";
        if (this.f17544r) {
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
            i11 = org.telegram.ui.ActionBar.g6.f23240n5;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.f23310r5;
        }
        this.f17541e.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, this.f17538a));
        if (this.f17545s) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f17542f.setVisibility(i12);
        this.h.setVisibility(8);
        if (i10 > 200) {
            f10 = 0.3f;
        } else {
            f10 = 1.0f;
        }
        b(f10, false);
    }

    public final void b(float f9, boolean z10) {
        RadioButton radioButton = this.h;
        hp hpVar = this.f17542f;
        if (z10) {
            if (Math.abs(hpVar.getAlpha() - f9) > 0.1d) {
                hpVar.animate().cancel();
                hpVar.animate().alpha(f9).start();
            }
            if (Math.abs(radioButton.getAlpha() - f9) > 0.1d) {
                radioButton.animate().cancel();
                radioButton.animate().alpha(f9).start();
                return;
            }
            return;
        }
        hpVar.animate().cancel();
        hpVar.setAlpha(f9);
        radioButton.animate().cancel();
        radioButton.setAlpha(f9);
    }

    public final void c(boolean z10, boolean z11) {
        hp hpVar = this.f17542f;
        if (hpVar.getVisibility() == 0) {
            hpVar.a(z10, z11);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, z11);
        }
    }

    public final void d(boolean z10, boolean z11) {
        boolean z12;
        this.f17544r = z10;
        if (z11 != this.f17545s) {
            this.f17545s = z11;
            f();
        }
        if (!this.f17545s) {
            this.h.setVisibility(8);
            this.f17542f.setVisibility(8);
        }
        if (!this.f17548y && (this.f17545s || !this.f17544r)) {
            z12 = true;
        } else {
            z12 = false;
        }
        setWillNotDraw(z12);
    }

    public final void e(int i10, TLRPC.User user, int i11) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f17538a;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f17541e;
        org.telegram.ui.Components.e9 e9Var = this.f17539b;
        int i12 = 0;
        if (i10 == 4) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionEveryone), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23240n5, c6Var));
            e9Var.g(7);
            e9Var.i(-15292942, -15630089);
        } else if (i10 == 2) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23240n5, c6Var));
            e9Var.g(4);
            e9Var.i(-3905294, -6923014);
        } else if (i10 == 1) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriendsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23240n5, c6Var));
            e9Var.g(15);
            e9Var.i(-7808710, -13781445);
        } else if (i10 == 3) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContactsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23240n5, c6Var));
            e9Var.g(6);
            e9Var.i(-18621, -618956);
        }
        this.f17542f.setVisibility(8);
        if (!this.f17545s) {
            i12 = 8;
        }
        this.h.setVisibility(i12);
        org.telegram.ui.Components.t9 t9Var = this.f17540c;
        t9Var.setImageDrawable(e9Var);
        t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }

    public final void f() {
        int i10;
        float f9;
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
        boolean z10 = this.f17545s;
        if (z10) {
            f9 = 53.0f;
        } else {
            f9 = 16.0f;
        }
        if (z10) {
            f10 = 53.0f;
        } else {
            f10 = 16.0f;
        }
        this.f17540c.setLayoutParams(i7.f6.d(40, 40.0f, i18, f9, 0.0f, f10, 0.0f));
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
            if (this.f17545s) {
                i12 = 105;
            } else {
                i12 = 68;
            }
            f11 = i12;
        }
        if (z11) {
            if (this.f17545s) {
                i16 = 105;
            } else {
                i16 = 68;
            }
            f12 = i16;
        } else {
            f12 = 20.0f;
        }
        this.d.setLayoutParams(i7.f6.d(-1, -2.0f, i19, f11, 0.0f, f12, 0.0f));
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
            if (this.f17545s) {
                i14 = 105;
            } else {
                i14 = 68;
            }
            f13 = i14;
        }
        if (z12) {
            if (this.f17545s) {
                i20 = 105;
            }
            f14 = i20;
        } else {
            f14 = 20.0f;
        }
        this.f17541e.setLayoutParams(i7.f6.d(-1, -2.0f, i21, f13, 0.0f, f14, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        this.f17542f.setLayoutParams(i7.f6.d(24, 24.0f, i15 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (LocaleController.isRTL) {
            i17 = 5;
        }
        this.h.setLayoutParams(i7.f6.d(22, 22.0f, i17 | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        iq iqVar = new iq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(iqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.f17548y) {
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, this.f17538a);
            Paint paint2 = this.f17543n;
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
        if (path != null && (paint = this.B) != null && !this.f17545s && this.f17544r && this.v) {
            canvas2.drawPath(path, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r7) {
        throw new UnsupportedOperationException("Method not decompiled: nh.d9.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int measuredWidth;
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f17544r && !this.f17545s) {
            f9 = 62.0f;
        } else {
            f9 = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9), 1073741824));
        if (!this.f17545s && this.f17544r) {
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
            float f11 = measuredWidth;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (LocaleController.isRTL) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            this.A.moveTo(f11, measuredHeight - AndroidUtilities.dp(6.0f));
            this.A.lineTo((f10 * AndroidUtilities.dp(6.0f)) + f11, measuredHeight);
            this.A.lineTo(f11, measuredHeight + AndroidUtilities.dp(6.0f));
            if (this.B == null) {
                Paint paint = new Paint(1);
                this.B = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.B.setStrokeCap(Paint.Cap.ROUND);
            }
            this.B.setStrokeWidth(AndroidUtilities.dpf2(1.86f));
            this.B.setColor(org.telegram.ui.ActionBar.g6.l1(0.3f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.f17538a)));
        }
    }

    public void set(Object obj) {
        int i10;
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
            int i11 = -AndroidUtilities.dp(52.0f);
            if (LocaleController.isRTL) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            h5Var.setTranslationX(i11 * i10);
            h5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        boolean z11;
        this.f17548y = z10;
        if (!z10 && (this.f17545s || !this.f17544r)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    public void setRedCheckbox(boolean z10) {
        int i10;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.g6.wj;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.B5;
        }
        this.f17542f.b(i10, org.telegram.ui.ActionBar.g6.f23171j7, org.telegram.ui.ActionBar.g6.C5);
    }

    public void setUser(TLRPC.User user) {
        long j10;
        int i10;
        if (user == null) {
            j10 = 0;
        } else {
            j10 = user.f22539id;
        }
        this.f17547x = j10;
        org.telegram.ui.Components.e9 e9Var = this.f17539b;
        e9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.t9 t9Var = this.f17540c;
        t9Var.setRoundRadius(dp);
        t9Var.e(user, e9Var);
        String userName = UserObject.getUserName(user);
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        int i11 = 0;
        h5Var.l(Emoji.replaceEmoji(userName, h5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f17546w;
        zArr[0] = false;
        boolean z10 = this.f17544r;
        org.telegram.ui.ActionBar.c6 c6Var = this.f17538a;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f17541e;
        if (z10) {
            setSubtitle(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23310r5, c6Var));
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
            if (zArr[0]) {
                i10 = org.telegram.ui.ActionBar.g6.f23240n5;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.f23310r5;
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        }
        if (!this.f17545s) {
            i11 = 8;
        }
        hp hpVar = this.f17542f;
        hpVar.setVisibility(i11);
        hpVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }
}
