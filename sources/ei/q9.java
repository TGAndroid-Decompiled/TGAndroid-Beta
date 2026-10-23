package ei;

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
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
public final class q9 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public Path E;
    public Paint F;
    public final org.telegram.ui.ActionBar.g6 f9668a;
    public final org.telegram.ui.Components.h9 f9669b;
    public final org.telegram.ui.Components.w9 f9670c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final org.telegram.ui.ActionBar.n5 e;
    public final xp f9671f;
    public final RadioButton h;
    public final Paint f9672n;
    public boolean f9673r;
    public boolean f9674s;
    public boolean v;
    public final boolean[] f9675w;
    public long f9676x;
    public boolean f9677y;

    public q9(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        this.f9669b = h9Var;
        this.f9672n = new Paint(1);
        this.f9673r = false;
        this.f9674s = true;
        this.v = true;
        this.f9675w = new boolean[1];
        this.f9668a = g6Var;
        h9Var.f26851r = AndroidUtilities.dp(40.0f);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f9670c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setTextSize(16);
        int i11 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.r6.Z(n5Var, i11, g6Var);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        n5Var.setGravity(i10);
        NotificationCenter.listenEmojiLoading(n5Var);
        addView(n5Var);
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.e = n5Var2;
        n5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.r6.Z(n5Var2, i11, g6Var);
        n5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(n5Var2);
        addView(n5Var2);
        xp xpVar = new xp(context, 21, g6Var);
        this.f9671f = xpVar;
        int i12 = org.telegram.ui.ActionBar.k6.B5;
        int i13 = org.telegram.ui.ActionBar.k6.f21291j7;
        xpVar.b(i12, i13, org.telegram.ui.ActionBar.k6.C5);
        xpVar.setDrawUnchecked(true);
        xpVar.setDrawBackgroundAsArc(10);
        addView(xpVar);
        xpVar.a(false, false);
        xpVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.r6.Q(radioButton, i13, org.telegram.ui.ActionBar.k6.E5, g6Var);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.e;
        if (charSequence == null) {
            n5Var.setTranslationY(0.0f);
            n5Var2.setVisibility(8);
            return;
        }
        n5Var.setTranslationY(AndroidUtilities.dp(-9.0f));
        n5Var2.setTranslationY(AndroidUtilities.dp(12.0f));
        n5Var2.l(charSequence, false);
        n5Var2.setVisibility(0);
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
            j10 = -chat.f20343id;
        }
        this.f9676x = j10;
        org.telegram.ui.Components.h9 h9Var = this.f9669b;
        h9Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f7 = 12.0f;
        } else {
            f7 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        org.telegram.ui.Components.w9 w9Var = this.f9670c;
        w9Var.setRoundRadius(dp);
        w9Var.e(chat, h9Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.l(Emoji.replaceEmoji(str, n5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f9675w;
        zArr[0] = false;
        String str2 = "Members";
        if (this.f9673r) {
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
            i11 = org.telegram.ui.ActionBar.k6.f21365n5;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f21439r5;
        }
        org.telegram.ui.ActionBar.r6.Z(this.e, i11, this.f9668a);
        if (this.f9674s) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.f9671f.setVisibility(i12);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
    }

    public final void b(float f7, boolean z10) {
        RadioButton radioButton = this.h;
        xp xpVar = this.f9671f;
        if (z10) {
            if (Math.abs(xpVar.getAlpha() - f7) > 0.1d) {
                xpVar.animate().cancel();
                xpVar.animate().alpha(f7).start();
            }
            if (Math.abs(radioButton.getAlpha() - f7) > 0.1d) {
                radioButton.animate().cancel();
                radioButton.animate().alpha(f7).start();
                return;
            }
            return;
        }
        xpVar.animate().cancel();
        xpVar.setAlpha(f7);
        radioButton.animate().cancel();
        radioButton.setAlpha(f7);
    }

    public final void c(boolean z10, boolean z11) {
        xp xpVar = this.f9671f;
        if (xpVar.getVisibility() == 0) {
            xpVar.a(z10, z11);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, z11);
        }
    }

    public final void d(boolean z10, boolean z11) {
        boolean z12;
        this.f9673r = z10;
        if (z11 != this.f9674s) {
            this.f9674s = z11;
            f();
        }
        if (!this.f9674s) {
            this.h.setVisibility(8);
            this.f9671f.setVisibility(8);
        }
        if (!this.f9677y && (this.f9674s || !this.f9673r)) {
            z12 = true;
        } else {
            z12 = false;
        }
        setWillNotDraw(z12);
    }

    public final void e(int i10, TLRPC.User user, int i11) {
        org.telegram.ui.ActionBar.g6 g6Var = this.f9668a;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.e;
        org.telegram.ui.Components.h9 h9Var = this.f9669b;
        int i12 = 0;
        if (i10 == 4) {
            n5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionEveryone), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), n5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            org.telegram.ui.ActionBar.r6.Z(n5Var2, org.telegram.ui.ActionBar.k6.f21365n5, g6Var);
            h9Var.g(7);
            h9Var.i(-15292942, -15630089);
        } else if (i10 == 2) {
            n5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), n5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            org.telegram.ui.ActionBar.r6.Z(n5Var2, org.telegram.ui.ActionBar.k6.f21365n5, g6Var);
            h9Var.g(4);
            h9Var.i(-3905294, -6923014);
        } else if (i10 == 1) {
            n5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), n5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriendsDetail)));
            }
            org.telegram.ui.ActionBar.r6.Z(n5Var2, org.telegram.ui.ActionBar.k6.f21365n5, g6Var);
            h9Var.g(15);
            h9Var.i(-7808710, -13781445);
        } else if (i10 == 3) {
            n5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), n5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContactsDetail)));
            }
            org.telegram.ui.ActionBar.r6.Z(n5Var2, org.telegram.ui.ActionBar.k6.f21365n5, g6Var);
            h9Var.g(6);
            h9Var.i(-18621, -618956);
        }
        this.f9671f.setVisibility(8);
        if (!this.f9674s) {
            i12 = 8;
        }
        this.h.setVisibility(i12);
        org.telegram.ui.Components.w9 w9Var = this.f9670c;
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
        int i15;
        int i16;
        int i17 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 16;
        boolean z10 = this.f9674s;
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
        this.f9670c.setLayoutParams(w7.z5.d(40, 40.0f, i18, f7, 0.0f, f10, 0.0f));
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
            if (this.f9674s) {
                i12 = 105;
            } else {
                i12 = 68;
            }
            f11 = i12;
        }
        if (z11) {
            if (this.f9674s) {
                i16 = 105;
            } else {
                i16 = 68;
            }
            f12 = i16;
        } else {
            f12 = 20.0f;
        }
        this.d.setLayoutParams(w7.z5.d(-1, -2.0f, i19, f11, 0.0f, f12, 0.0f));
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
            if (this.f9674s) {
                i14 = 105;
            } else {
                i14 = 68;
            }
            f13 = i14;
        }
        if (z12) {
            if (this.f9674s) {
                i20 = 105;
            }
            f14 = i20;
        }
        this.e.setLayoutParams(w7.z5.d(-1, -2.0f, i21, f13, 0.0f, f14, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        this.f9671f.setLayoutParams(w7.z5.d(24, 24.0f, i15 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (LocaleController.isRTL) {
            i17 = 5;
        }
        this.h.setLayoutParams(w7.z5.d(22, 22.0f, i17 | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        xq xqVar = new xq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(xqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.f9677y) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d7, this.f9668a);
            Paint paint2 = this.f9672n;
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
        if (path != null && (paint = this.F) != null && !this.f9674s && this.f9673r && this.v) {
            canvas2.drawPath(path, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r7) {
        throw new UnsupportedOperationException("Method not decompiled: ei.q9.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int measuredWidth;
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f9673r && !this.f9674s) {
            f7 = 62.0f;
        } else {
            f7 = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
        if (!this.f9674s && this.f9673r) {
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
            this.F.setColor(org.telegram.ui.ActionBar.k6.o1(0.3f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f9668a)));
        }
    }

    public void set(Object obj) {
        int i10;
        boolean z10 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        if (z10) {
            n5Var.setTypeface(AndroidUtilities.bold());
            n5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            n5Var.setTypeface(AndroidUtilities.bold());
            n5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            n5Var.setTypeface(null);
            int i11 = -AndroidUtilities.dp(52.0f);
            if (LocaleController.isRTL) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            n5Var.setTranslationX(i11 * i10);
            n5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        boolean z11;
        this.f9677y = z10;
        if (!z10 && (this.f9674s || !this.f9673r)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    public void setRedCheckbox(boolean z10) {
        int i10;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.k6.wj;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.B5;
        }
        this.f9671f.b(i10, org.telegram.ui.ActionBar.k6.f21291j7, org.telegram.ui.ActionBar.k6.C5);
    }

    public void setUser(TLRPC.User user) {
        long j10;
        int i10;
        if (user == null) {
            j10 = 0;
        } else {
            j10 = user.f20490id;
        }
        this.f9676x = j10;
        org.telegram.ui.Components.h9 h9Var = this.f9669b;
        h9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.w9 w9Var = this.f9670c;
        w9Var.setRoundRadius(dp);
        w9Var.e(user, h9Var);
        String userName = UserObject.getUserName(user);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        int i11 = 0;
        n5Var.l(Emoji.replaceEmoji(userName, n5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f9675w;
        zArr[0] = false;
        boolean z10 = this.f9673r;
        org.telegram.ui.ActionBar.g6 g6Var = this.f9668a;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.e;
        if (z10) {
            setSubtitle(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            org.telegram.ui.ActionBar.r6.Z(n5Var2, org.telegram.ui.ActionBar.k6.f21439r5, g6Var);
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
            if (zArr[0]) {
                i10 = org.telegram.ui.ActionBar.k6.f21365n5;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f21439r5;
            }
            org.telegram.ui.ActionBar.r6.Z(n5Var2, i10, g6Var);
        }
        if (!this.f9674s) {
            i11 = 8;
        }
        xp xpVar = this.f9671f;
        xpVar.setVisibility(i11);
        xpVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.F;
            if (paint != null) {
                paint.setColor(org.telegram.ui.ActionBar.k6.o1(0.3f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f9668a)));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
