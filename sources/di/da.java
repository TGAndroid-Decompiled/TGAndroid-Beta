package di;

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
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.br;
public final class da extends FrameLayout {
    public Path E;
    public Paint F;
    public final org.telegram.ui.ActionBar.c6 f6839a;
    public final org.telegram.ui.Components.k9 f6840b;
    public final org.telegram.ui.Components.z9 f6841c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final org.telegram.ui.ActionBar.h5 e;
    public final aq f6842f;
    public final RadioButton h;
    public final Paint f6843n;
    public boolean f6844r;
    public boolean f6845s;
    public boolean v;
    public final boolean[] f6846w;
    public long f6847x;
    public boolean f6848y;

    public da(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        this.f6840b = k9Var;
        this.f6843n = new Paint(1);
        this.f6844r = false;
        this.f6845s = true;
        this.v = true;
        this.f6846w = new boolean[1];
        this.f6839a = c6Var;
        k9Var.f26294r = AndroidUtilities.dp(40.0f);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f6841c = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(z9Var);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        int i11 = org.telegram.ui.ActionBar.g6.f19707j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h5Var.setGravity(i10);
        NotificationCenter.listenEmojiLoading(h5Var);
        addView(h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.e = h5Var2;
        h5Var2.setTextSize(14);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        h5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(h5Var2);
        addView(h5Var2);
        aq aqVar = new aq(context, 21, c6Var);
        this.f6842f = aqVar;
        int i12 = org.telegram.ui.ActionBar.g6.B5;
        int i13 = org.telegram.ui.ActionBar.g6.f19709j7;
        aqVar.b(i12, i13, org.telegram.ui.ActionBar.g6.C5);
        aqVar.setDrawUnchecked(true);
        aqVar.setDrawBackgroundAsArc(10);
        addView(aqVar);
        aqVar.a(false, false);
        aqVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.g6.w0(i13, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E5, c6Var));
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.e;
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
        float f7;
        String lowerCase;
        int i11;
        int i12;
        float f10;
        int i13;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f18916id;
        }
        this.f6847x = j10;
        org.telegram.ui.Components.k9 k9Var = this.f6840b;
        k9Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f7 = 12.0f;
        } else {
            f7 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        org.telegram.ui.Components.z9 z9Var = this.f6841c;
        z9Var.setRoundRadius(dp);
        z9Var.e(chat, k9Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.l(Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f6846w;
        zArr[0] = false;
        String str2 = "Members";
        if (this.f6844r) {
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
            i11 = org.telegram.ui.ActionBar.g6.f19783n5;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.f19857r5;
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, this.f6839a));
        if (this.f6845s) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f6842f.setVisibility(i12);
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
        aq aqVar = this.f6842f;
        if (z10) {
            if (Math.abs(aqVar.getAlpha() - f7) > 0.1d) {
                aqVar.animate().cancel();
                aqVar.animate().alpha(f7).start();
            }
            if (Math.abs(radioButton.getAlpha() - f7) > 0.1d) {
                radioButton.animate().cancel();
                radioButton.animate().alpha(f7).start();
                return;
            }
            return;
        }
        aqVar.animate().cancel();
        aqVar.setAlpha(f7);
        radioButton.animate().cancel();
        radioButton.setAlpha(f7);
    }

    public final void c(boolean z10, boolean z11) {
        aq aqVar = this.f6842f;
        if (aqVar.getVisibility() == 0) {
            aqVar.a(z10, z11);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, z11);
        }
    }

    public final void d(boolean z10, boolean z11) {
        boolean z12;
        this.f6844r = z10;
        if (z11 != this.f6845s) {
            this.f6845s = z11;
            f();
        }
        if (!this.f6845s) {
            this.h.setVisibility(8);
            this.f6842f.setVisibility(8);
        }
        if (!this.f6848y && (this.f6845s || !this.f6844r)) {
            z12 = true;
        } else {
            z12 = false;
        }
        setWillNotDraw(z12);
    }

    public final void e(int i10, TLRPC.User user, int i11) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f6839a;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.e;
        org.telegram.ui.Components.k9 k9Var = this.f6840b;
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
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19783n5, c6Var));
            k9Var.g(7);
            k9Var.i(-15292942, -15630089);
        } else if (i10 == 2) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19783n5, c6Var));
            k9Var.g(4);
            k9Var.i(-3905294, -6923014);
        } else if (i10 == 1) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriendsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19783n5, c6Var));
            k9Var.g(15);
            k9Var.i(-7808710, -13781445);
        } else if (i10 == 3) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContactsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19783n5, c6Var));
            k9Var.g(6);
            k9Var.i(-18621, -618956);
        }
        this.f6842f.setVisibility(8);
        if (!this.f6845s) {
            i12 = 8;
        }
        this.h.setVisibility(i12);
        org.telegram.ui.Components.z9 z9Var = this.f6841c;
        z9Var.setImageDrawable(k9Var);
        z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }

    public final void f() {
        int i10;
        float f7;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        float f12;
        int i15;
        int i16;
        int i17 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 16;
        boolean z10 = this.f6845s;
        float f13 = 53.0f;
        if (!z10) {
            f13 = 16.0f;
        }
        if (z10) {
            f7 = 53.0f;
        } else {
            f7 = 16.0f;
        }
        this.f6841c.setLayoutParams(w7.z5.a(40.0f, f13, 0.0f, f7, 0.0f, 40, i18));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i19 = i11 | 16;
        int i20 = 68;
        float f14 = 20.0f;
        if (z11) {
            f10 = 20.0f;
        } else {
            if (this.f6845s) {
                i12 = 105;
            } else {
                i12 = 68;
            }
            f10 = i12;
        }
        if (z11) {
            if (this.f6845s) {
                i16 = 105;
            } else {
                i16 = 68;
            }
            f11 = i16;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(w7.z5.a(-2.0f, f10, 0.0f, f11, 0.0f, -1, i19));
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i21 = i13 | 16;
        if (z12) {
            f12 = 20.0f;
        } else {
            if (this.f6845s) {
                i14 = 105;
            } else {
                i14 = 68;
            }
            f12 = i14;
        }
        if (z12) {
            if (this.f6845s) {
                i20 = 105;
            }
            f14 = i20;
        }
        this.e.setLayoutParams(w7.z5.a(-2.0f, f12, 0.0f, f14, 0.0f, -1, i21));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        this.f6842f.setLayoutParams(w7.z5.a(24.0f, 13.0f, 0.0f, 14.0f, 0.0f, 24, i15 | 16));
        if (LocaleController.isRTL) {
            i17 = 5;
        }
        this.h.setLayoutParams(w7.z5.a(22.0f, 14.0f, 0.0f, 15.0f, 0.0f, 22, i17 | 16));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        br brVar = new br(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(brVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.f6848y) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19602d7, this.f6839a);
            Paint paint2 = this.f6843n;
            paint2.setColor(w02);
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
        if (path != null && (paint = this.F) != null && !this.f6845s && this.f6844r && this.v) {
            canvas2.drawPath(path, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r7) {
        throw new UnsupportedOperationException("Method not decompiled: di.da.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int measuredWidth;
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f6844r && !this.f6845s) {
            f7 = 62.0f;
        } else {
            f7 = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
        if (!this.f6845s && this.f6844r) {
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
            this.F.setColor(org.telegram.ui.ActionBar.g6.m1(0.3f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, this.f6839a)));
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
        this.f6848y = z10;
        if (!z10 && (this.f6845s || !this.f6844r)) {
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
        this.f6842f.b(i10, org.telegram.ui.ActionBar.g6.f19709j7, org.telegram.ui.ActionBar.g6.C5);
    }

    public void setUser(TLRPC.User user) {
        long j10;
        int i10;
        if (user == null) {
            j10 = 0;
        } else {
            j10 = user.f19063id;
        }
        this.f6847x = j10;
        org.telegram.ui.Components.k9 k9Var = this.f6840b;
        k9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.z9 z9Var = this.f6841c;
        z9Var.setRoundRadius(dp);
        z9Var.e(user, k9Var);
        String userName = UserObject.getUserName(user);
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        int i11 = 0;
        h5Var.l(Emoji.replaceEmoji(userName, h5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f6846w;
        zArr[0] = false;
        boolean z10 = this.f6844r;
        org.telegram.ui.ActionBar.c6 c6Var = this.f6839a;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.e;
        if (z10) {
            setSubtitle(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19857r5, c6Var));
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
            if (zArr[0]) {
                i10 = org.telegram.ui.ActionBar.g6.f19783n5;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.f19857r5;
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        }
        if (!this.f6845s) {
            i11 = 8;
        }
        aq aqVar = this.f6842f;
        aqVar.setVisibility(i11);
        aqVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }
}
