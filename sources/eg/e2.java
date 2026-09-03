package eg;

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
import dg.y2;
import java.util.ArrayList;
import k7.b6;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.u5;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gw0;
import org.telegram.ui.pb1;
import org.telegram.ui.ww0;
public class e2 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_emojiStatusCollectible A0;
    public boolean B0;
    public final int[] C0;
    public float D0;
    public boolean E0;
    public ValueAnimator F0;
    public boolean G0;
    public boolean H0;
    public FrameLayout I0;
    public final FrameLayout J0;
    public FrameLayout K0;
    public f90[] L0;
    public f90 M0;
    public final ArrayList U;
    public int V;
    public final TLRPC.User W;
    public final n X;
    public final TL_stars.StarGift Y;
    public boolean Z;
    public final gw0 f5247a0;
    public int f5248b0;
    public int f5249c0;
    public int f5250d0;
    public int f5251e0;
    public int f5252f0;
    public int f5253g0;
    public int f5254h0;
    public int f5255i0;
    public int f5256j0;
    public int f5257k0;
    public final s00 f5258l0;
    public final q1 m0;
    public h f5259n0;
    public i f5260o0;
    public pb1 f5261p0;
    public final org.telegram.ui.ActionBar.p2 f5262q0;
    public Integer f5263r0;
    public float f5264s0;
    public float f5265t0;
    public float f5266u0;
    public float f5267v0;
    public float f5268w0;
    public View f5269x0;
    public View f5270y0;
    public TLRPC.InputStickerSet f5271z0;

    public e2(org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.User user, f6 f6Var) {
        this(p2Var, i10, user, null, null, f6Var);
    }

    public static void P(e2 e2Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(e2Var.f5271z0);
        y1 y1Var = new y1(e2Var, 0);
        org.telegram.ui.ActionBar.p2 p2Var = e2Var.f5262q0;
        if (p2Var != null) {
            y1Var.setParentFragment(p2Var);
        }
        new z1(e2Var, y1Var, e2Var.getContext(), e2Var.resourcesProvider, arrayList).show();
    }

    @Override
    public final void D(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.U;
            if (i12 < arrayList.size()) {
                gw0 gw0Var = this.f5247a0;
                gw0Var.a((ww0) arrayList.get(i12), false);
                gw0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((ww0) arrayList.get(i12)).e = i13;
                i13 += gw0Var.getMeasuredHeight();
                i12++;
            } else {
                this.f5248b0 = i13;
                this.container.getLocationOnScreen(this.C0);
                return;
            }
        }
    }

    @Override
    public final void F(qv0 qv0Var) {
        this.V = UserConfig.selectedAccount;
        c1 c1Var = new c1(getContext(), this.resourcesProvider, false);
        c1Var.a(PremiumPreviewFragment.o0(this.V, null), new androidx.mediarouter.app.c(this, 6), false);
        this.I0 = new FrameLayout(getContext());
        View view = new View(getContext());
        view.setBackgroundColor(getThemedColor(j6.f19882d7));
        this.I0.addView(view, b6.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (!UserConfig.getInstance(this.V).isPremium() && !(this instanceof gg.m1)) {
            this.I0.addView(c1Var, b6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            this.I0.setBackgroundColor(getThemedColor(j6.f19952h5));
            qv0Var.addView(this.I0, b6.e(-1, 68, 80));
        }
    }

    public void W(pb1 pb1Var) {
        pb1Var.addView(this.f5270y0, b6.p(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int X() {
        return 0;
    }

    public View Z(Context context, int i10) {
        return null;
    }

    public void a0(boolean z4) {
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
        f90[] f90VarArr = this.L0;
        if (f90VarArr != null && this.M0 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.A0;
            TLRPC.User user = this.W;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.L0[0].setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TelegramPremiumUserStatusCollectibleDialogTitle, DialogObject.getShortName(user), str2), new u1(this, 0)));
                org.telegram.ui.b.n(R.string.TelegramPremiumUserStatusDialogSubtitle, this.M0);
            } else if (this.f5271z0 != null) {
                String formatString = LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogTitle, ContactsController.formatName(user.first_name, user.last_name), "<STICKERSET>");
                Integer num = this.f5263r0;
                if (num == null) {
                    intValue6 = getThemedColor(j6.f20182u6);
                } else {
                    intValue6 = num.intValue();
                }
                CharSequence replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, intValue6);
                try {
                    replaceSingleLink = Emoji.replaceEmoji(replaceSingleLink, this.L0[0].getPaint().getFontMetricsInt(), false);
                } catch (Exception unused) {
                }
                if (replaceSingleLink instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) replaceSingleLink;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(replaceSingleLink);
                }
                int indexOf = replaceSingleLink.toString().indexOf("<STICKERSET>");
                if (indexOf >= 0) {
                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.V).getStickerSet(this.f5271z0, false);
                    if (stickerSet != null && !stickerSet.documents.isEmpty()) {
                        document = stickerSet.documents.get(0);
                        if (stickerSet.set != null) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= stickerSet.documents.size()) {
                                    break;
                                } else if (stickerSet.documents.get(i10).f19165id == stickerSet.set.thumb_document_id) {
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
                        spannableStringBuilder2.setSpan(new u5(document, this.L0[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (stickerSet != null && stickerSet.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) stickerSet.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new k90(AndroidUtilities.dp(100.0f), this.L0[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new l0(this, 1), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.L0[1].setOnLinkPressListener(new e90() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            e2.P(e2.this);
                        }
                    });
                    if (document != null) {
                        f90[] f90VarArr2 = this.L0;
                        if (f90VarArr2 != null) {
                            f90VarArr2[1].setText(spannableStringBuilder);
                            if (this.L0[1].getVisibility() != 0) {
                                if (z4) {
                                    this.L0[1].setAlpha(0.0f);
                                    this.L0[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.L0[1].animate().alpha(1.0f);
                                    mr mrVar = mr.f27122f;
                                    org.telegram.ui.b.p(alpha, mrVar, 200L);
                                    this.L0[0].animate().alpha(0.0f).setInterpolator(mrVar).setDuration(200L).withEndAction(new u1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new x1(this, 1));
                                    ofFloat.setInterpolator(mrVar);
                                    ofFloat.setDuration(200L);
                                    ofFloat.start();
                                } else {
                                    this.L0[1].setAlpha(1.0f);
                                    this.L0[1].setVisibility(0);
                                    this.L0[0].setAlpha(0.0f);
                                    this.L0[0].setVisibility(8);
                                }
                            }
                        }
                    } else {
                        this.L0[0].setText(spannableStringBuilder, (TextView.BufferType) null);
                    }
                }
                org.telegram.ui.b.n(R.string.TelegramPremiumUserStatusDialogSubtitle, this.M0);
            } else if (this.B0) {
                f90VarArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDefaultDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
                this.M0.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogSubtitle, ContactsController.formatName(user.first_name, user.last_name))));
            } else {
                n nVar = this.X;
                if (nVar != null) {
                    if (this.Z) {
                        f90 f90Var = f90VarArr[0];
                        int i11 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogTitleWithPlural;
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        String formatString2 = LocaleController.formatString(i11, str, LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                        Integer num2 = this.f5263r0;
                        if (num2 == null) {
                            intValue4 = getThemedColor(j6.f20182u6);
                        } else {
                            intValue4 = num2.intValue();
                        }
                        f90Var.setText(AndroidUtilities.replaceSingleLink(formatString2, intValue4));
                        f90 f90Var2 = this.M0;
                        int i12 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogSubtitle;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        String formatString3 = LocaleController.formatString(i12, str3);
                        Integer num3 = this.f5263r0;
                        if (num3 == null) {
                            intValue5 = getThemedColor(j6.f20182u6);
                        } else {
                            intValue5 = num3.intValue();
                        }
                        f90Var2.setText(AndroidUtilities.replaceSingleLink(formatString3, intValue5));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f19306id != 777000) {
                        f90 f90Var3 = this.L0[0];
                        String formatString4 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPlural, user.first_name, LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                        Integer num4 = this.f5263r0;
                        if (num4 == null) {
                            intValue3 = getThemedColor(j6.f20182u6);
                        } else {
                            intValue3 = num4.intValue();
                        }
                        f90Var3.setText(AndroidUtilities.replaceSingleLink(formatString4, intValue3));
                        org.telegram.ui.b.n(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.M0);
                    } else {
                        f90 f90Var4 = this.L0[0];
                        String formatString5 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPluralSomeone, LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                        Integer num5 = this.f5263r0;
                        if (num5 == null) {
                            intValue2 = getThemedColor(j6.f20182u6);
                        } else {
                            intValue2 = num5.intValue();
                        }
                        f90Var4.setText(AndroidUtilities.replaceSingleLink(formatString5, intValue2));
                        org.telegram.ui.b.n(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.M0);
                    }
                } else {
                    TL_stars.StarGift starGift = this.Y;
                    if (starGift != null) {
                        f90VarArr[0].setText(LocaleController.getString(R.string.Gift2PremiumTitle));
                        this.L0[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.M0.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            org.telegram.ui.b.n(R.string.Gift2PremiumSubtitle, this.M0);
                        }
                        this.M0.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        f90VarArr[0].setText(LocaleController.getString(R.string.TelegramPremium));
                        org.telegram.ui.b.n(R.string.TelegramPremiumSubscribedSubtitle, this.M0);
                    } else {
                        f90 f90Var5 = f90VarArr[0];
                        String formatString6 = LocaleController.formatString(R.string.TelegramPremiumUserDialogTitle, ContactsController.formatName(user.first_name, user.last_name));
                        Integer num6 = this.f5263r0;
                        if (num6 == null) {
                            intValue = getThemedColor(j6.f20182u6);
                        } else {
                            intValue = num6.intValue();
                        }
                        f90Var5.setText(AndroidUtilities.replaceSingleLink(formatString6, intValue));
                        org.telegram.ui.b.n(R.string.TelegramPremiumUserDialogSubtitle, this.M0);
                    }
                }
            }
            try {
                f90 f90Var6 = this.L0[0];
                f90Var6.setText(Emoji.replaceEmoji(f90Var6.getText(), this.L0[0].getPaint().getFontMetricsInt(), false));
            } catch (Exception unused2) {
            }
        }
    }

    public void b0() {
        int i10 = this.f5249c0;
        int i11 = i10 + 1;
        this.f5249c0 = i11;
        this.f5250d0 = i10;
        this.f5253g0 = i11;
        int size = this.U.size() + i11;
        this.f5254h0 = size;
        this.f5249c0 = size + 1;
        this.f5255i0 = size;
        if (!UserConfig.getInstance(this.V).isPremium() && this.X == null) {
            int i12 = this.f5249c0;
            this.f5249c0 = i12 + 1;
            this.f5256j0 = i12;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i10 == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.f5271z0) != null && inputStickerSet.f19179id == ((Long) objArr[0]).longValue()) {
            a0(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        ValueAnimator valueAnimator = this.F0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        s00 s00Var = this.f5258l0;
        if (s00Var.f28628c) {
            s00Var.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        View view;
        Drawable drawable;
        int i10;
        View view2 = this.f5270y0;
        if (view2 != null) {
            if (this.E0) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            view2.setVisibility(i10);
        }
        super.mainContainerDispatchDraw(canvas);
        if (this.f5269x0 != null && this.E0) {
            View view3 = this.f5270y0;
            if (view3 == null) {
                view = this.f5260o0;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f5264s0, this.f5265t0};
            this.f5269x0.getMatrix().mapPoints(fArr);
            View view4 = this.f5269x0;
            if (view4 instanceof k5) {
                drawable = ((k5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.s1) {
                drawable = ((org.telegram.ui.Cells.s1) view4).f21944cc;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.C0;
            float f10 = (-iArr[0]) + this.f5266u0 + fArr[0];
            float f11 = (-iArr[1]) + this.f5267v0 + fArr[1];
            if (AndroidUtilities.isTablet()) {
                ViewGroup view5 = this.f5262q0.getParentLayout().getView();
                f10 += view5.getX() + view5.getPaddingLeft();
                f11 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f5268w0 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f12 = measuredHeight / intrinsicWidth;
            float f13 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.container && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float lerp = AndroidUtilities.lerp(f10, measuredWidth, mr.h.getInterpolation(this.D0));
            float lerp2 = AndroidUtilities.lerp(f11, measuredHeight2, this.D0);
            float f14 = this.f5268w0;
            float f15 = this.D0;
            float f16 = (f12 * f15) + ((1.0f - f15) * f14);
            canvas.save();
            canvas.scale(f16, f16, lerp, lerp2);
            int i11 = (int) lerp;
            int i12 = (int) lerp2;
            drawable.setBounds(org.telegram.ui.b.u(2, i11, drawable), org.telegram.ui.b.f(2, i12, drawable), org.telegram.ui.b.A(2, i11, drawable), org.telegram.ui.b.y(2, i12, drawable));
            drawable.setAlpha((int) ((1.0f - Utilities.clamp(this.D0, 1.0f, 0.0f)) * 255.0f));
            drawable.draw(canvas);
            drawable.setAlpha(0);
            canvas.restore();
            float lerp3 = AndroidUtilities.lerp(f13, 1.0f, this.D0);
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
        if (this.f5269x0 == null) {
            return false;
        }
        this.F0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.D0 = 0.0f;
        this.E0 = true;
        this.f5261p0.invalidate();
        View view = this.f5269x0;
        if (view instanceof k5) {
            drawable = ((k5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            j5 j5Var = s1Var.f21944cc;
            s1Var.a3();
            drawable = j5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.f5269x0;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view2).a3();
        } else {
            view2.invalidate();
        }
        i iVar = this.f5260o0;
        if (iVar != null) {
            iVar.j(100L);
        }
        this.F0.addUpdateListener(new x1(this, 0));
        this.F0.addListener(new y2(2, this, drawable));
        this.F0.setDuration(600L);
        this.F0.setInterpolator(mr.h);
        this.F0.start();
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
        if (this.G0) {
            AndroidUtilities.runOnUIThread(new u1(this, 1), 200L);
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        i iVar = this.f5260o0;
        if (iVar != null) {
            iVar.setDialogVisible(true);
        }
        this.f5259n0.setPaused(true);
        dialog.setOnDismissListener(new d0(this, 1));
        dialog.show();
        return true;
    }

    @Override
    public final ql0 v(rl0 rl0Var) {
        return new d2(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    public e2(org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.User user, n nVar, TL_stars.StarGift starGift, f6 f6Var) {
        super(p2Var, false, false, f6Var);
        ArrayList arrayList = new ArrayList();
        this.U = arrayList;
        this.C0 = new int[2];
        this.D0 = 0.0f;
        fixNavigationBar();
        this.f5262q0 = p2Var;
        this.v = 0.26f;
        this.W = user;
        this.V = i10;
        this.X = nVar;
        this.Y = starGift;
        this.f5247a0 = new gw0(getContext(), null);
        PremiumPreviewFragment.n0(i10, arrayList);
        if (nVar != null || UserConfig.getInstance(i10).isPremium()) {
            this.I0.setVisibility(8);
        }
        q1 q1Var = new q1(j6.Lj, j6.Mj, j6.Nj, j6.Oj, null);
        this.m0 = q1Var;
        q1Var.f5452m = true;
        q1Var.f5454o = 1.0f;
        q1Var.f5455p = 0.0f;
        q1Var.f5456q = 0.0f;
        q1Var.f5444b = 0.0f;
        q1Var.f5445c = 0.0f;
        b0();
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.d.setOnItemClickListener(new w1(this, i10, p2Var, 0));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.r0("profile");
        s00 s00Var = new s00(getContext());
        this.f5258l0 = s00Var;
        this.container.addView(s00Var, b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.J0 = frameLayout;
        this.containerView.addView(frameLayout, b6.e(-1, 140, 87));
    }

    public void Y(View view) {
    }

    public void V(int i10, View view) {
    }
}
