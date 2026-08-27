package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
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
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cq;

public final class p9 extends FrameLayout {
    public Path A;
    public Paint B;

    public final org.telegram.ui.ActionBar.c6 f16536a;

    public final org.telegram.ui.Components.y8 f16537b;

    public final org.telegram.ui.Components.n9 f16538c;
    public final org.telegram.ui.ActionBar.h5 d;

    public final org.telegram.ui.ActionBar.h5 f16539e;

    public final bp f16540f;
    public final RadioButton h;

    public final Paint f16541n;

    public boolean f16542r;

    public boolean f16543s;
    public boolean v;

    public final boolean[] f16544w;

    public long f16545x;

    public boolean f16546y;

    public p9(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.f16537b = y8Var;
        this.f16541n = new Paint(1);
        this.f16542r = false;
        this.f16543s = true;
        this.v = true;
        this.f16544w = new boolean[1];
        this.f16536a = c6Var;
        y8Var.f34860r = AndroidUtilities.dp(40.0f);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f16538c = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(n9Var);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(h5Var);
        addView(h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f16539e = h5Var2;
        h5Var2.setTextSize(14);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        h5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(h5Var2);
        addView(h5Var2);
        bp bpVar = new bp(context, 21, c6Var);
        this.f16540f = bpVar;
        int i11 = org.telegram.ui.ActionBar.g6.B5;
        int i12 = org.telegram.ui.ActionBar.g6.f23163j7;
        bpVar.b(i11, i12, org.telegram.ui.ActionBar.g6.C5);
        bpVar.setDrawUnchecked(true);
        bpVar.setDrawBackgroundAsArc(10);
        addView(bpVar);
        bpVar.a(false, false);
        bpVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E5, c6Var));
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f16539e;
        if (charSequence == null) {
            h5Var.setTranslationY(0.0f);
            h5Var2.setVisibility(8);
        } else {
            h5Var.setTranslationY(AndroidUtilities.dp(-9.0f));
            h5Var2.setTranslationY(AndroidUtilities.dp(12.0f));
            h5Var2.l(charSequence, false);
            h5Var2.setVisibility(0);
        }
    }

    public final void a(int i10, TLRPC.Chat chat) {
        String lowerCase;
        this.f16545x = chat == null ? 0L : -chat.f22380id;
        org.telegram.ui.Components.y8 y8Var = this.f16537b;
        y8Var.q(chat);
        int iDp = AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f);
        org.telegram.ui.Components.n9 n9Var = this.f16538c;
        n9Var.setRoundRadius(iDp);
        n9Var.e(chat, y8Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.l(Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f16544w;
        zArr[0] = false;
        if (this.f16542r) {
            if (i10 <= 0) {
                i10 = chat.participants_count;
            }
            boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            if (i10 >= 1) {
                lowerCase = LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "Subscribers" : "Members", i10, new Object[0]);
            } else {
                lowerCase = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
            }
        } else if (!ChatObject.isChannel(chat) || chat.megagroup) {
            if (i10 >= 1) {
                lowerCase = LocaleController.formatPluralStringComma("Members", i10 - 1);
            } else if (chat.has_geo) {
                lowerCase = LocaleController.getString(R.string.MegaLocation);
            } else {
                lowerCase = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
            }
        } else if (i10 >= 1) {
            lowerCase = LocaleController.formatPluralStringComma("Subscribers", i10 - 1);
        } else {
            lowerCase = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
        }
        setSubtitle(lowerCase);
        this.f16539e.setTextColor(org.telegram.ui.ActionBar.g6.v0(zArr[0] ? org.telegram.ui.ActionBar.g6.f23233n5 : org.telegram.ui.ActionBar.g6.f23300r5, this.f16536a));
        this.f16540f.setVisibility(this.f16543s ? 0 : 8);
        this.h.setVisibility(8);
        b(i10 > 200 ? 0.3f : 1.0f, false);
    }

    public final void b(float f10, boolean z10) {
        RadioButton radioButton = this.h;
        bp bpVar = this.f16540f;
        if (!z10) {
            bpVar.animate().cancel();
            bpVar.setAlpha(f10);
            radioButton.animate().cancel();
            radioButton.setAlpha(f10);
            return;
        }
        if (Math.abs(bpVar.getAlpha() - f10) > 0.1d) {
            bpVar.animate().cancel();
            bpVar.animate().alpha(f10).start();
        }
        if (Math.abs(radioButton.getAlpha() - f10) > 0.1d) {
            radioButton.animate().cancel();
            radioButton.animate().alpha(f10).start();
        }
    }

    public final void c(boolean z10, boolean z11) {
        bp bpVar = this.f16540f;
        if (bpVar.getVisibility() == 0) {
            bpVar.a(z10, z11);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, z11);
        }
    }

    public final void d(boolean z10, boolean z11) {
        this.f16542r = z10;
        if (z11 != this.f16543s) {
            this.f16543s = z11;
            f();
        }
        if (!this.f16543s) {
            this.h.setVisibility(8);
            this.f16540f.setVisibility(8);
        }
        setWillNotDraw(!this.f16546y && (this.f16543s || !this.f16542r));
    }

    public final void e(int i10, TLRPC.User user, int i11) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f16536a;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f16539e;
        org.telegram.ui.Components.y8 y8Var = this.f16537b;
        if (i10 == 4) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionEveryone), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23233n5, c6Var));
            y8Var.g(7);
            y8Var.i(-15292942, -15630089);
        } else if (i10 == 2) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23233n5, c6Var));
            y8Var.g(4);
            y8Var.i(-3905294, -6923014);
        } else if (i10 == 1) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriendsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23233n5, c6Var));
            y8Var.g(15);
            y8Var.i(-7808710, -13781445);
        } else if (i10 == 3) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContactsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23233n5, c6Var));
            y8Var.g(6);
            y8Var.i(-18621, -618956);
        }
        this.f16540f.setVisibility(8);
        this.h.setVisibility(this.f16543s ? 0 : 8);
        org.telegram.ui.Components.n9 n9Var = this.f16538c;
        n9Var.setImageDrawable(y8Var);
        n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }

    public final void f() {
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = (LocaleController.isRTL ? 5 : 3) | 16;
        boolean z10 = this.f16543s;
        this.f16538c.setLayoutParams(h7.z5.d(40, 40.0f, i10, z10 ? 53.0f : 16.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        int i11 = (z11 ? 5 : 3) | 16;
        if (z11) {
            f10 = 20.0f;
        } else {
            f10 = this.f16543s ? 105 : 68;
        }
        if (z11) {
            f11 = this.f16543s ? 105 : 68;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(h7.z5.d(-1, -2.0f, i11, f10, 0.0f, f11, 0.0f));
        boolean z12 = LocaleController.isRTL;
        int i12 = (z12 ? 5 : 3) | 16;
        if (z12) {
            f12 = 20.0f;
        } else {
            f12 = this.f16543s ? 105 : 68;
        }
        if (z12) {
            f13 = this.f16543s ? 105 : 68;
        } else {
            f13 = 20.0f;
        }
        this.f16539e.setLayoutParams(h7.z5.d(-1, -2.0f, i12, f12, 0.0f, f13, 0.0f));
        this.f16540f.setLayoutParams(h7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        this.h.setLayoutParams(h7.z5.d(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        cq cqVar = new cq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(cqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.f16546y) {
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, this.f16536a);
            Paint paint2 = this.f16541n;
            paint2.setColor(iV0);
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
        if (path == null || (paint = this.B) == null || this.f16543s || !this.f16542r || !this.v) {
            return;
        }
        canvas2.drawPath(path, paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        boolean z11 = false;
        bp bpVar = this.f16540f;
        if (bpVar != null) {
            try {
                if (bpVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Exception unused) {
                return;
            }
        } else {
            z10 = false;
        }
        RadioButton radioButton = this.h;
        if (radioButton != null && radioButton.getVisibility() == 0) {
            z11 = true;
        }
        if (z10 || z11) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(z10 ? bpVar.f27188a.f26309q : radioButton.f26504f);
            accessibilityNodeInfo.setClassName(z10 ? "android.widget.CheckBox" : "android.widget.RadioButton");
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((!this.f16542r || this.f16543s) ? 56.0f : 62.0f), 1073741824));
        if (this.f16543s || !this.f16542r) {
            return;
        }
        Path path = this.A;
        if (path == null) {
            this.A = new Path();
        } else {
            path.rewind();
        }
        float fDp = LocaleController.isRTL ? AndroidUtilities.dp(31.0f) : getMeasuredWidth() - AndroidUtilities.dp(31.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f10 = LocaleController.isRTL ? -1.0f : 1.0f;
        this.A.moveTo(fDp, measuredHeight - AndroidUtilities.dp(6.0f));
        this.A.lineTo((f10 * AndroidUtilities.dp(6.0f)) + fDp, measuredHeight);
        this.A.lineTo(fDp, measuredHeight + AndroidUtilities.dp(6.0f));
        if (this.B == null) {
            Paint paint = new Paint(1);
            this.B = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.B.setStrokeCap(Paint.Cap.ROUND);
        }
        this.B.setStrokeWidth(AndroidUtilities.dpf2(1.86f));
        this.B.setColor(org.telegram.ui.ActionBar.g6.l1(0.3f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.f16536a)));
    }

    public void set(Object obj) {
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
            h5Var.setTranslationX((-AndroidUtilities.dp(52.0f)) * (LocaleController.isRTL ? -1 : 1));
            h5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        this.f16546y = z10;
        setWillNotDraw(!z10 && (this.f16543s || !this.f16542r));
    }

    public void setRedCheckbox(boolean z10) {
        this.f16540f.b(z10 ? org.telegram.ui.ActionBar.g6.wj : org.telegram.ui.ActionBar.g6.B5, org.telegram.ui.ActionBar.g6.f23163j7, org.telegram.ui.ActionBar.g6.C5);
    }

    public void setUser(TLRPC.User user) {
        this.f16545x = user == null ? 0L : user.f22527id;
        org.telegram.ui.Components.y8 y8Var = this.f16537b;
        y8Var.r(user);
        int iDp = AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.n9 n9Var = this.f16538c;
        n9Var.setRoundRadius(iDp);
        n9Var.e(user, y8Var);
        String userName = UserObject.getUserName(user);
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.l(Emoji.replaceEmoji(userName, h5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.f16544w;
        zArr[0] = false;
        boolean z10 = this.f16542r;
        org.telegram.ui.ActionBar.c6 c6Var = this.f16536a;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f16539e;
        if (z10) {
            setSubtitle(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23300r5, c6Var));
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(zArr[0] ? org.telegram.ui.ActionBar.g6.f23233n5 : org.telegram.ui.ActionBar.g6.f23300r5, c6Var));
        }
        int i10 = this.f16543s ? 0 : 8;
        bp bpVar = this.f16540f;
        bpVar.setVisibility(i10);
        bpVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }
}
