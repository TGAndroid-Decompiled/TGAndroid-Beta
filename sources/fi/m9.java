package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.zq;
public final class m9 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public Path E;
    public Paint F;
    public final org.telegram.ui.ActionBar.u6 f11259a;
    public final org.telegram.ui.Components.j9 f11260b;
    public final org.telegram.ui.Components.y9 f11261c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final org.telegram.ui.ActionBar.b6 e;
    public final aq f11262f;
    public final RadioButton h;
    public final Paint f11263n;
    public boolean f11264r;
    public boolean f11265s;
    public boolean v;
    public final boolean[] f11266w;
    public long f11267x;
    public boolean f11268y;

    public m9(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.f11260b = j9Var;
        this.f11263n = new Paint(1);
        this.f11264r = false;
        this.f11265s = true;
        this.v = true;
        this.f11266w = new boolean[1];
        this.f11259a = u6Var;
        j9Var.f29560r = AndroidUtilities.dp(40.0f);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f11261c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(y9Var);
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.d = b6Var;
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setTextSize(16);
        int i11 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i11, u6Var);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        b6Var.setGravity(i10);
        NotificationCenter.listenEmojiLoading(b6Var);
        addView(b6Var);
        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
        this.e = b6Var2;
        b6Var2.setTextSize(14);
        org.telegram.ui.ActionBar.f7.Y(b6Var2, i11, u6Var);
        b6Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(b6Var2);
        addView(b6Var2);
        aq aqVar = new aq(context, 21, u6Var);
        this.f11262f = aqVar;
        int i12 = org.telegram.ui.ActionBar.y6.B5;
        int i13 = org.telegram.ui.ActionBar.y6.f23467j7;
        aqVar.b(i12, i13, org.telegram.ui.ActionBar.y6.C5);
        aqVar.setDrawUnchecked(true);
        aqVar.setDrawBackgroundAsArc(10);
        addView(aqVar);
        aqVar.a(false, false);
        aqVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.f7.P(radioButton, i13, org.telegram.ui.ActionBar.y6.E5, u6Var);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        org.telegram.ui.ActionBar.b6 b6Var2 = this.e;
        if (charSequence == null) {
            b6Var.setTranslationY(0.0f);
            b6Var2.setVisibility(8);
            return;
        }
        b6Var.setTranslationY(AndroidUtilities.dp(-9.0f));
        b6Var2.setTranslationY(AndroidUtilities.dp(12.0f));
        b6Var2.l(charSequence, false);
        b6Var2.setVisibility(0);
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
            j10 = -chat.f22028id;
        }
        this.f11267x = j10;
        org.telegram.ui.Components.j9 j9Var = this.f11260b;
        j9Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f7 = 12.0f;
        } else {
            f7 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        org.telegram.ui.Components.y9 y9Var = this.f11261c;
        y9Var.setRoundRadius(dp);
        y9Var.f(chat, j9Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        b6Var.l(Emoji.replaceEmoji(str, b6Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f11266w;
        zArr[0] = false;
        String str2 = "Members";
        if (this.f11264r) {
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
            i11 = org.telegram.ui.ActionBar.y6.f23540n5;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.f23615r5;
        }
        org.telegram.ui.ActionBar.f7.Y(this.e, i11, this.f11259a);
        if (this.f11265s) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f11262f.setVisibility(i12);
        this.h.setVisibility(8);
        if (i10 > 200) {
            f10 = 0.3f;
        } else {
            f10 = 1.0f;
        }
        b(f10, false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
    }

    public final void b(float f7, boolean z10) {
        RadioButton radioButton = this.h;
        aq aqVar = this.f11262f;
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
        aq aqVar = this.f11262f;
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
        this.f11264r = z10;
        if (z11 != this.f11265s) {
            this.f11265s = z11;
            f();
        }
        if (!this.f11265s) {
            this.h.setVisibility(8);
            this.f11262f.setVisibility(8);
        }
        if (!this.f11268y && (this.f11265s || !this.f11264r)) {
            z12 = true;
        } else {
            z12 = false;
        }
        setWillNotDraw(z12);
    }

    public final void e(int i10, TLRPC.User user, int i11) {
        org.telegram.ui.ActionBar.u6 u6Var = this.f11259a;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        org.telegram.ui.ActionBar.b6 b6Var2 = this.e;
        org.telegram.ui.Components.j9 j9Var = this.f11260b;
        int i12 = 0;
        if (i10 == 4) {
            b6Var.l(LocaleController.getString(R.string.StoryPrivacyOptionEveryone), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), b6Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            org.telegram.ui.ActionBar.f7.Y(b6Var2, org.telegram.ui.ActionBar.y6.f23540n5, u6Var);
            j9Var.g(7);
            j9Var.i(-15292942, -15630089);
        } else if (i10 == 2) {
            b6Var.l(LocaleController.getString(R.string.StoryPrivacyOptionContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), b6Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            org.telegram.ui.ActionBar.f7.Y(b6Var2, org.telegram.ui.ActionBar.y6.f23540n5, u6Var);
            j9Var.g(4);
            j9Var.i(-3905294, -6923014);
        } else if (i10 == 1) {
            b6Var.l(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), b6Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriendsDetail)));
            }
            org.telegram.ui.ActionBar.f7.Y(b6Var2, org.telegram.ui.ActionBar.y6.f23540n5, u6Var);
            j9Var.g(15);
            j9Var.i(-7808710, -13781445);
        } else if (i10 == 3) {
            b6Var.l(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), b6Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContactsDetail)));
            }
            org.telegram.ui.ActionBar.f7.Y(b6Var2, org.telegram.ui.ActionBar.y6.f23540n5, u6Var);
            j9Var.g(6);
            j9Var.i(-18621, -618956);
        }
        this.f11262f.setVisibility(8);
        if (!this.f11265s) {
            i12 = 8;
        }
        this.h.setVisibility(i12);
        org.telegram.ui.Components.y9 y9Var = this.f11261c;
        y9Var.setImageDrawable(j9Var);
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
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
        int i15;
        int i16;
        int i17 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 16;
        boolean z10 = this.f11265s;
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
        this.f11261c.setLayoutParams(kb1.h(40, 40.0f, i18, f7, 0.0f, f10, 0.0f));
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
            f11 = 20.0f;
        } else {
            if (this.f11265s) {
                i12 = 105;
            } else {
                i12 = 68;
            }
            f11 = i12;
        }
        if (z11) {
            if (this.f11265s) {
                i16 = 105;
            } else {
                i16 = 68;
            }
            f12 = i16;
        } else {
            f12 = 20.0f;
        }
        this.d.setLayoutParams(kb1.h(-1, -2.0f, i19, f11, 0.0f, f12, 0.0f));
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
            if (this.f11265s) {
                i14 = 105;
            } else {
                i14 = 68;
            }
            f13 = i14;
        }
        if (z12) {
            if (this.f11265s) {
                i20 = 105;
            }
            f14 = i20;
        }
        this.e.setLayoutParams(kb1.h(-1, -2.0f, i21, f13, 0.0f, f14, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        this.f11262f.setLayoutParams(kb1.h(24, 24.0f, i15 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (LocaleController.isRTL) {
            i17 = 5;
        }
        this.h.setLayoutParams(kb1.h(22, 22.0f, i17 | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        zq zqVar = new zq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.f11268y) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23358d7, this.f11259a);
            Paint paint2 = this.f11263n;
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
        if (path != null && (paint = this.F) != null && !this.f11265s && this.f11264r && this.v) {
            canvas2.drawPath(path, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r7) {
        throw new UnsupportedOperationException("Method not decompiled: fi.m9.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int measuredWidth;
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f11264r && !this.f11265s) {
            f7 = 62.0f;
        } else {
            f7 = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
        if (!this.f11265s && this.f11264r) {
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
            this.F.setColor(org.telegram.ui.ActionBar.y6.o1(0.3f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.f11259a)));
        }
    }

    public void set(Object obj) {
        int i10;
        boolean z10 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (z10) {
            b6Var.setTypeface(AndroidUtilities.bold());
            b6Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            b6Var.setTypeface(AndroidUtilities.bold());
            b6Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            b6Var.setTypeface(null);
            int i11 = -AndroidUtilities.dp(52.0f);
            if (LocaleController.isRTL) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            b6Var.setTranslationX(i11 * i10);
            b6Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        boolean z11;
        this.f11268y = z10;
        if (!z10 && (this.f11265s || !this.f11264r)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    public void setRedCheckbox(boolean z10) {
        int i10;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.y6.wj;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.B5;
        }
        this.f11262f.b(i10, org.telegram.ui.ActionBar.y6.f23467j7, org.telegram.ui.ActionBar.y6.C5);
    }

    public void setUser(TLRPC.User user) {
        long j10;
        int i10;
        if (user == null) {
            j10 = 0;
        } else {
            j10 = user.f22177id;
        }
        this.f11267x = j10;
        org.telegram.ui.Components.j9 j9Var = this.f11260b;
        j9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.y9 y9Var = this.f11261c;
        y9Var.setRoundRadius(dp);
        y9Var.f(user, j9Var);
        String userName = UserObject.getUserName(user);
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        int i11 = 0;
        b6Var.l(Emoji.replaceEmoji(userName, b6Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f11266w;
        zArr[0] = false;
        boolean z10 = this.f11264r;
        org.telegram.ui.ActionBar.u6 u6Var = this.f11259a;
        org.telegram.ui.ActionBar.b6 b6Var2 = this.e;
        if (z10) {
            setSubtitle(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            org.telegram.ui.ActionBar.f7.Y(b6Var2, org.telegram.ui.ActionBar.y6.f23615r5, u6Var);
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
            if (zArr[0]) {
                i10 = org.telegram.ui.ActionBar.y6.f23540n5;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.f23615r5;
            }
            org.telegram.ui.ActionBar.f7.Y(b6Var2, i10, u6Var);
        }
        if (!this.f11265s) {
            i11 = 8;
        }
        aq aqVar = this.f11262f;
        aqVar.setVisibility(i11);
        aqVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.F;
            if (paint != null) {
                paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.3f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.f11259a)));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
