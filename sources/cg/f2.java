package cg;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.c3;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.y80;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fw0;
import org.telegram.ui.qv0;
import org.telegram.ui.ua1;
public class f2 extends xa implements NotificationCenter.NotificationCenterDelegate {
    public boolean A0;
    public final int[] B0;
    public float C0;
    public boolean D0;
    public ValueAnimator E0;
    public boolean F0;
    public boolean G0;
    public FrameLayout H0;
    public final FrameLayout I0;
    public FrameLayout J0;
    public y80[] K0;
    public y80 L0;
    public final ArrayList T;
    public int U;
    public final TLRPC.User V;
    public final n W;
    public final TL_stars.StarGift X;
    public boolean Y;
    public final qv0 Z;
    public int f3122a0;
    public int f3123b0;
    public int f3124c0;
    public int f3125d0;
    public int f3126e0;
    public int f3127f0;
    public int f3128g0;
    public int f3129h0;
    public int f3130i0;
    public int f3131j0;
    public final n00 f3132k0;
    public final r1 f3133l0;
    public h m0;
    public i f3134n0;
    public ua1 f3135o0;
    public final org.telegram.ui.ActionBar.o2 f3136p0;
    public Integer f3137q0;
    public float f3138r0;
    public float f3139s0;
    public float f3140t0;
    public float f3141u0;
    public float f3142v0;
    public View f3143w0;
    public View f3144x0;
    public TLRPC.InputStickerSet f3145y0;
    public TLRPC.TL_emojiStatusCollectible f3146z0;

    public f2(org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.User user, c6 c6Var) {
        this(o2Var, i10, user, null, null, c6Var);
    }

    public static void P(f2 f2Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(f2Var.f3145y0);
        z1 z1Var = new z1(f2Var, 0);
        org.telegram.ui.ActionBar.o2 o2Var = f2Var.f3136p0;
        if (o2Var != null) {
            z1Var.setParentFragment(o2Var);
        }
        new a2(f2Var, z1Var, f2Var.getContext(), f2Var.resourcesProvider, arrayList).show();
    }

    @Override
    public final void D(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.T;
            if (i12 < arrayList.size()) {
                qv0 qv0Var = this.Z;
                qv0Var.a((fw0) arrayList.get(i12), false);
                qv0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((fw0) arrayList.get(i12)).f38246e = i13;
                i13 += qv0Var.getMeasuredHeight();
                i12++;
            } else {
                this.f3122a0 = i13;
                this.container.getLocationOnScreen(this.B0);
                return;
            }
        }
    }

    @Override
    public final void F(hv0 hv0Var) {
        this.U = UserConfig.selectedAccount;
        d1 d1Var = new d1(getContext(), this.resourcesProvider, false);
        d1Var.a(PremiumPreviewFragment.o0(this.U, null), new ag.o(this, 6), false);
        this.H0 = new FrameLayout(getContext());
        View view = new View(getContext());
        view.setBackgroundColor(getThemedColor(g6.f23063d7));
        this.H0.addView(view, f6.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (!UserConfig.getInstance(this.U).isPremium() && !(this instanceof eg.n1)) {
            this.H0.addView(d1Var, f6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            this.H0.setBackgroundColor(getThemedColor(g6.f23133h5));
            hv0Var.addView(this.H0, f6.e(-1, 68, 80));
        }
    }

    public void W(ua1 ua1Var) {
        ua1Var.addView(this.f3144x0, f6.p(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int X() {
        return 0;
    }

    public View Z(Context context, int i10) {
        return null;
    }

    public void a0(boolean z10) {
        int intValue;
        int intValue2;
        int intValue3;
        String str;
        int intValue4;
        int intValue5;
        int intValue6;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder2;
        y80[] y80VarArr = this.K0;
        if (y80VarArr != null && this.L0 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f3146z0;
            TLRPC.User user = this.V;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.K0[0].setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TelegramPremiumUserStatusCollectibleDialogTitle, DialogObject.getShortName(user), str2), new v1(this, 0)));
                org.telegram.ui.b.o(R.string.TelegramPremiumUserStatusDialogSubtitle, this.L0);
            } else if (this.f3145y0 != null) {
                String formatString = LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogTitle, ContactsController.formatName(user.first_name, user.last_name), "<STICKERSET>");
                Integer num = this.f3137q0;
                if (num == null) {
                    intValue6 = getThemedColor(g6.f23365u6);
                } else {
                    intValue6 = num.intValue();
                }
                CharSequence replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, intValue6);
                try {
                    replaceSingleLink = Emoji.replaceEmoji(replaceSingleLink, this.K0[0].getPaint().getFontMetricsInt(), false);
                } catch (Exception unused) {
                }
                if (replaceSingleLink instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) replaceSingleLink;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(replaceSingleLink);
                }
                int indexOf = replaceSingleLink.toString().indexOf("<STICKERSET>");
                if (indexOf >= 0) {
                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.U).getStickerSet(this.f3145y0, false);
                    if (stickerSet != null && !stickerSet.documents.isEmpty()) {
                        document = stickerSet.documents.get(0);
                        if (stickerSet.set != null) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= stickerSet.documents.size()) {
                                    break;
                                } else if (stickerSet.documents.get(i10).f22398id == stickerSet.set.thumb_document_id) {
                                    document = stickerSet.documents.get(i10);
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        document = null;
                    }
                    if (document != null) {
                        spannableStringBuilder2 = new SpannableStringBuilder("x");
                        spannableStringBuilder2.setSpan(new y5(document, this.K0[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (stickerSet != null && stickerSet.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) stickerSet.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new d90(AndroidUtilities.dp(100.0f), this.K0[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new l0(this, 1), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.K0[1].setOnLinkPressListener(new x80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            f2.P(f2.this);
                        }
                    });
                    if (document != null) {
                        y80[] y80VarArr2 = this.K0;
                        if (y80VarArr2 != null) {
                            y80VarArr2[1].setText(spannableStringBuilder);
                            if (this.K0[1].getVisibility() != 0) {
                                if (z10) {
                                    this.K0[1].setAlpha(0.0f);
                                    this.K0[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.K0[1].animate().alpha(1.0f);
                                    jr jrVar = jr.f29800f;
                                    org.telegram.ui.b.q(alpha, jrVar, 200L);
                                    this.K0[0].animate().alpha(0.0f).setInterpolator(jrVar).setDuration(200L).withEndAction(new v1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new y1(this, 1));
                                    ofFloat.setInterpolator(jrVar);
                                    ofFloat.setDuration(200L);
                                    ofFloat.start();
                                } else {
                                    this.K0[1].setAlpha(1.0f);
                                    this.K0[1].setVisibility(0);
                                    this.K0[0].setAlpha(0.0f);
                                    this.K0[0].setVisibility(8);
                                }
                            }
                        }
                    } else {
                        this.K0[0].setText(spannableStringBuilder, (TextView.BufferType) null);
                    }
                }
                org.telegram.ui.b.o(R.string.TelegramPremiumUserStatusDialogSubtitle, this.L0);
            } else if (this.A0) {
                y80VarArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDefaultDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
                this.L0.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogSubtitle, ContactsController.formatName(user.first_name, user.last_name))));
            } else {
                n nVar = this.W;
                if (nVar != null) {
                    if (this.Y) {
                        y80 y80Var = y80VarArr[0];
                        int i11 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogTitleWithPlural;
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        String formatString2 = LocaleController.formatString(i11, str, LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                        Integer num2 = this.f3137q0;
                        if (num2 == null) {
                            intValue4 = getThemedColor(g6.f23365u6);
                        } else {
                            intValue4 = num2.intValue();
                        }
                        y80Var.setText(AndroidUtilities.replaceSingleLink(formatString2, intValue4));
                        y80 y80Var2 = this.L0;
                        int i12 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogSubtitle;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        String formatString3 = LocaleController.formatString(i12, str3);
                        Integer num3 = this.f3137q0;
                        if (num3 == null) {
                            intValue5 = getThemedColor(g6.f23365u6);
                        } else {
                            intValue5 = num3.intValue();
                        }
                        y80Var2.setText(AndroidUtilities.replaceSingleLink(formatString3, intValue5));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f22539id != 777000) {
                        y80 y80Var3 = this.K0[0];
                        String formatString4 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPlural, user.first_name, LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                        Integer num4 = this.f3137q0;
                        if (num4 == null) {
                            intValue3 = getThemedColor(g6.f23365u6);
                        } else {
                            intValue3 = num4.intValue();
                        }
                        y80Var3.setText(AndroidUtilities.replaceSingleLink(formatString4, intValue3));
                        org.telegram.ui.b.o(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.L0);
                    } else {
                        y80 y80Var4 = this.K0[0];
                        String formatString5 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPluralSomeone, LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                        Integer num5 = this.f3137q0;
                        if (num5 == null) {
                            intValue2 = getThemedColor(g6.f23365u6);
                        } else {
                            intValue2 = num5.intValue();
                        }
                        y80Var4.setText(AndroidUtilities.replaceSingleLink(formatString5, intValue2));
                        org.telegram.ui.b.o(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.L0);
                    }
                } else {
                    TL_stars.StarGift starGift = this.X;
                    if (starGift != null) {
                        y80VarArr[0].setText(LocaleController.getString(R.string.Gift2PremiumTitle));
                        this.K0[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.L0.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            org.telegram.ui.b.o(R.string.Gift2PremiumSubtitle, this.L0);
                        }
                        this.L0.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        y80VarArr[0].setText(LocaleController.getString(R.string.TelegramPremium));
                        org.telegram.ui.b.o(R.string.TelegramPremiumSubscribedSubtitle, this.L0);
                    } else {
                        y80 y80Var5 = y80VarArr[0];
                        String formatString6 = LocaleController.formatString(R.string.TelegramPremiumUserDialogTitle, ContactsController.formatName(user.first_name, user.last_name));
                        Integer num6 = this.f3137q0;
                        if (num6 == null) {
                            intValue = getThemedColor(g6.f23365u6);
                        } else {
                            intValue = num6.intValue();
                        }
                        y80Var5.setText(AndroidUtilities.replaceSingleLink(formatString6, intValue));
                        org.telegram.ui.b.o(R.string.TelegramPremiumUserDialogSubtitle, this.L0);
                    }
                }
            }
            try {
                y80 y80Var6 = this.K0[0];
                y80Var6.setText(Emoji.replaceEmoji(y80Var6.getText(), this.K0[0].getPaint().getFontMetricsInt(), false));
            } catch (Exception unused2) {
            }
        }
    }

    public void b0() {
        int i10 = this.f3123b0;
        int i11 = i10 + 1;
        this.f3123b0 = i11;
        this.f3124c0 = i10;
        this.f3127f0 = i11;
        int size = this.T.size() + i11;
        this.f3128g0 = size;
        this.f3123b0 = size + 1;
        this.f3129h0 = size;
        if (!UserConfig.getInstance(this.U).isPremium() && this.W == null) {
            int i12 = this.f3123b0;
            this.f3123b0 = i12 + 1;
            this.f3130i0 = i12;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i10 == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.f3145y0) != null && inputStickerSet.f22412id == ((Long) objArr[0]).longValue()) {
            a0(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        ValueAnimator valueAnimator = this.E0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        n00 n00Var = this.f3132k0;
        if (n00Var.f30795c) {
            n00Var.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        View view;
        Drawable drawable;
        int i10;
        View view2 = this.f3144x0;
        if (view2 != null) {
            if (this.D0) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            view2.setVisibility(i10);
        }
        super.mainContainerDispatchDraw(canvas);
        if (this.f3143w0 != null && this.D0) {
            View view3 = this.f3144x0;
            if (view3 == null) {
                view = this.f3134n0;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f3138r0, this.f3139s0};
            this.f3143w0.getMatrix().mapPoints(fArr);
            View view4 = this.f3143w0;
            if (view4 instanceof h5) {
                drawable = ((h5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.s1) {
                drawable = ((org.telegram.ui.Cells.s1) view4).f25291bc;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.B0;
            float f9 = (-iArr[0]) + this.f3140t0 + fArr[0];
            float f10 = (-iArr[1]) + this.f3141u0 + fArr[1];
            if (AndroidUtilities.isTablet()) {
                ViewGroup view5 = this.f3136p0.getParentLayout().getView();
                f9 += view5.getX() + view5.getPaddingLeft();
                f10 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f3142v0 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f11 = measuredHeight / intrinsicWidth;
            float f12 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.container && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float lerp = AndroidUtilities.lerp(f9, measuredWidth, jr.h.getInterpolation(this.C0));
            float lerp2 = AndroidUtilities.lerp(f10, measuredHeight2, this.C0);
            float f13 = this.f3142v0;
            float f14 = this.C0;
            float f15 = (f11 * f14) + ((1.0f - f14) * f13);
            canvas.save();
            canvas.scale(f15, f15, lerp, lerp2);
            int i11 = (int) lerp;
            int i12 = (int) lerp2;
            drawable.setBounds(org.telegram.ui.b.v(2, i11, drawable), org.telegram.ui.b.f(2, i12, drawable), org.telegram.ui.b.A(2, i11, drawable), org.telegram.ui.b.y(2, i12, drawable));
            drawable.setAlpha((int) ((1.0f - Utilities.clamp(this.C0, 1.0f, 0.0f)) * 255.0f));
            drawable.draw(canvas);
            drawable.setAlpha(0);
            canvas.restore();
            float lerp3 = AndroidUtilities.lerp(f12, 1.0f, this.C0);
            canvas.scale(lerp3, lerp3, lerp, lerp2);
            canvas.translate(lerp - (view.getMeasuredWidth() / 2.0f), lerp2 - (view.getMeasuredHeight() / 2.0f));
            view.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        Drawable drawable;
        if (this.f3143w0 == null) {
            return false;
        }
        this.E0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C0 = 0.0f;
        this.D0 = true;
        this.f3135o0.invalidate();
        View view = this.f3143w0;
        if (view instanceof h5) {
            drawable = ((h5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            n5 n5Var = s1Var.f25291bc;
            s1Var.a3();
            drawable = n5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.f3143w0;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view2).a3();
        } else {
            view2.invalidate();
        }
        i iVar = this.f3134n0;
        if (iVar != null) {
            iVar.j(100L);
        }
        this.E0.addUpdateListener(new y1(this, 0));
        this.E0.addListener(new c3(2, this, drawable));
        this.E0.setDuration(600L);
        this.E0.setInterpolator(jr.h);
        this.E0.start();
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        if (this.F0) {
            AndroidUtilities.runOnUIThread(new v1(this, 1), 200L);
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        i iVar = this.f3134n0;
        if (iVar != null) {
            iVar.setDialogVisible(true);
        }
        this.m0.setPaused(true);
        dialog.setOnDismissListener(new d0(this, 1));
        dialog.show();
        return true;
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        return new e2(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    public f2(org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.User user, n nVar, TL_stars.StarGift starGift, c6 c6Var) {
        super(o2Var, false, false, c6Var);
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        this.B0 = new int[2];
        this.C0 = 0.0f;
        fixNavigationBar();
        this.f3136p0 = o2Var;
        this.v = 0.26f;
        this.V = user;
        this.U = i10;
        this.W = nVar;
        this.X = starGift;
        this.Z = new qv0(getContext(), null);
        PremiumPreviewFragment.n0(i10, arrayList);
        if (nVar != null || UserConfig.getInstance(i10).isPremium()) {
            this.H0.setVisibility(8);
        }
        r1 r1Var = new r1(g6.Lj, g6.Mj, g6.Nj, g6.Oj, null);
        this.f3133l0 = r1Var;
        r1Var.f3325m = true;
        r1Var.f3327o = 1.0f;
        r1Var.f3328p = 0.0f;
        r1Var.f3329q = 0.0f;
        r1Var.f3316b = 0.0f;
        r1Var.f3317c = 0.0f;
        b0();
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.d.setOnItemClickListener(new x1(this, i10, o2Var, 0));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.r0("profile");
        n00 n00Var = new n00(getContext());
        this.f3132k0 = n00Var;
        this.container.addView(n00Var, f6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.I0 = frameLayout;
        this.containerView.addView(frameLayout, f6.e(-1, 140, 87));
    }

    public void Y(View view) {
    }

    public void V(int i10, View view) {
    }
}
