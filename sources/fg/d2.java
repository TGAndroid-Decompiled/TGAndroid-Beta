package fg;

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
import eg.w2;
import java.util.ArrayList;
import k7.c6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bw0;
import org.telegram.ui.ib1;
import org.telegram.ui.rw0;
public class d2 extends sa implements NotificationCenter.NotificationCenterDelegate {
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
    public g90[] L0;
    public g90 M0;
    public final ArrayList U;
    public int V;
    public final TLRPC.User W;
    public final n X;
    public final TL_stars.StarGift Y;
    public boolean Z;
    public final bw0 f6274a0;
    public int f6275b0;
    public int f6276c0;
    public int f6277d0;
    public int f6278e0;
    public int f6279f0;
    public int f6280g0;
    public int f6281h0;
    public int f6282i0;
    public int f6283j0;
    public int f6284k0;
    public final s00 f6285l0;
    public final p1 m0;
    public h f6286n0;
    public i f6287o0;
    public ib1 f6288p0;
    public final org.telegram.ui.ActionBar.p2 f6289q0;
    public Integer f6290r0;
    public float f6291s0;
    public float f6292t0;
    public float f6293u0;
    public float f6294v0;
    public float f6295w0;
    public View f6296x0;
    public View f6297y0;
    public TLRPC.InputStickerSet f6298z0;

    public d2(org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.User user, g6 g6Var) {
        this(p2Var, i10, user, null, null, g6Var);
    }

    public static void P(d2 d2Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(d2Var.f6298z0);
        x1 x1Var = new x1(d2Var, 0);
        org.telegram.ui.ActionBar.p2 p2Var = d2Var.f6289q0;
        if (p2Var != null) {
            x1Var.setParentFragment(p2Var);
        }
        new y1(d2Var, x1Var, d2Var.getContext(), d2Var.resourcesProvider, arrayList).show();
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
                bw0 bw0Var = this.f6274a0;
                bw0Var.a((rw0) arrayList.get(i12), false);
                bw0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((rw0) arrayList.get(i12)).f41059e = i13;
                i13 += bw0Var.getMeasuredHeight();
                i12++;
            } else {
                this.f6275b0 = i13;
                this.container.getLocationOnScreen(this.C0);
                return;
            }
        }
    }

    @Override
    public final void F(qv0 qv0Var) {
        this.V = UserConfig.selectedAccount;
        b1 b1Var = new b1(getContext(), this.resourcesProvider, false);
        b1Var.a(PremiumPreviewFragment.o0(this.V, null), new androidx.mediarouter.app.c(this, 6), false);
        this.I0 = new FrameLayout(getContext());
        View view = new View(getContext());
        view.setBackgroundColor(getThemedColor(k6.f21660d7));
        this.I0.addView(view, c6.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (!UserConfig.getInstance(this.V).isPremium() && !(this instanceof hg.m1)) {
            this.I0.addView(b1Var, c6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            this.I0.setBackgroundColor(getThemedColor(k6.f21731h5));
            qv0Var.addView(this.I0, c6.e(-1, 68, 80));
        }
    }

    public void W(ib1 ib1Var) {
        ib1Var.addView(this.f6297y0, c6.p(140, 140, 1.0f, 17, 10, 10, 10, 10));
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
        g90[] g90VarArr = this.L0;
        if (g90VarArr != null && this.M0 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.A0;
            TLRPC.User user = this.W;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.L0[0].setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TelegramPremiumUserStatusCollectibleDialogTitle, DialogObject.getShortName(user), str2), new t1(this, 0)));
                org.telegram.ui.b.n(R.string.TelegramPremiumUserStatusDialogSubtitle, this.M0);
            } else if (this.f6298z0 != null) {
                String formatString = LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogTitle, ContactsController.formatName(user.first_name, user.last_name), "<STICKERSET>");
                Integer num = this.f6290r0;
                if (num == null) {
                    intValue6 = getThemedColor(k6.f21961u6);
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
                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.V).getStickerSet(this.f6298z0, false);
                    if (stickerSet != null && !stickerSet.documents.isEmpty()) {
                        document = stickerSet.documents.get(0);
                        if (stickerSet.set != null) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= stickerSet.documents.size()) {
                                    break;
                                } else if (stickerSet.documents.get(i10).f20849id == stickerSet.set.thumb_document_id) {
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
                        spannableStringBuilder2.setSpan(new l90(AndroidUtilities.dp(100.0f), this.L0[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new l0(this, 1), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.L0[1].setOnLinkPressListener(new f90() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            d2.P(d2.this);
                        }
                    });
                    if (document != null) {
                        g90[] g90VarArr2 = this.L0;
                        if (g90VarArr2 != null) {
                            g90VarArr2[1].setText(spannableStringBuilder);
                            if (this.L0[1].getVisibility() != 0) {
                                if (z4) {
                                    this.L0[1].setAlpha(0.0f);
                                    this.L0[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.L0[1].animate().alpha(1.0f);
                                    pr prVar = pr.f30183f;
                                    org.telegram.ui.b.p(alpha, prVar, 200L);
                                    this.L0[0].animate().alpha(0.0f).setInterpolator(prVar).setDuration(200L).withEndAction(new t1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new w1(this, 1));
                                    ofFloat.setInterpolator(prVar);
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
                g90VarArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDefaultDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
                this.M0.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogSubtitle, ContactsController.formatName(user.first_name, user.last_name))));
            } else {
                n nVar = this.X;
                if (nVar != null) {
                    if (this.Z) {
                        g90 g90Var = g90VarArr[0];
                        int i11 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogTitleWithPlural;
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        String formatString2 = LocaleController.formatString(i11, str, LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                        Integer num2 = this.f6290r0;
                        if (num2 == null) {
                            intValue4 = getThemedColor(k6.f21961u6);
                        } else {
                            intValue4 = num2.intValue();
                        }
                        g90Var.setText(AndroidUtilities.replaceSingleLink(formatString2, intValue4));
                        g90 g90Var2 = this.M0;
                        int i12 = R.string.TelegramPremiumUserGiftedPremiumOutboundDialogSubtitle;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        String formatString3 = LocaleController.formatString(i12, str3);
                        Integer num3 = this.f6290r0;
                        if (num3 == null) {
                            intValue5 = getThemedColor(k6.f21961u6);
                        } else {
                            intValue5 = num3.intValue();
                        }
                        g90Var2.setText(AndroidUtilities.replaceSingleLink(formatString3, intValue5));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f20990id != 777000) {
                        g90 g90Var3 = this.L0[0];
                        String formatString4 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPlural, user.first_name, LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                        Integer num4 = this.f6290r0;
                        if (num4 == null) {
                            intValue3 = getThemedColor(k6.f21961u6);
                        } else {
                            intValue3 = num4.intValue();
                        }
                        g90Var3.setText(AndroidUtilities.replaceSingleLink(formatString4, intValue3));
                        org.telegram.ui.b.n(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.M0);
                    } else {
                        g90 g90Var4 = this.L0[0];
                        String formatString5 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPluralSomeone, LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                        Integer num5 = this.f6290r0;
                        if (num5 == null) {
                            intValue2 = getThemedColor(k6.f21961u6);
                        } else {
                            intValue2 = num5.intValue();
                        }
                        g90Var4.setText(AndroidUtilities.replaceSingleLink(formatString5, intValue2));
                        org.telegram.ui.b.n(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.M0);
                    }
                } else {
                    TL_stars.StarGift starGift = this.Y;
                    if (starGift != null) {
                        g90VarArr[0].setText(LocaleController.getString(R.string.Gift2PremiumTitle));
                        this.L0[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.M0.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            org.telegram.ui.b.n(R.string.Gift2PremiumSubtitle, this.M0);
                        }
                        this.M0.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        g90VarArr[0].setText(LocaleController.getString(R.string.TelegramPremium));
                        org.telegram.ui.b.n(R.string.TelegramPremiumSubscribedSubtitle, this.M0);
                    } else {
                        g90 g90Var5 = g90VarArr[0];
                        String formatString6 = LocaleController.formatString(R.string.TelegramPremiumUserDialogTitle, ContactsController.formatName(user.first_name, user.last_name));
                        Integer num6 = this.f6290r0;
                        if (num6 == null) {
                            intValue = getThemedColor(k6.f21961u6);
                        } else {
                            intValue = num6.intValue();
                        }
                        g90Var5.setText(AndroidUtilities.replaceSingleLink(formatString6, intValue));
                        org.telegram.ui.b.n(R.string.TelegramPremiumUserDialogSubtitle, this.M0);
                    }
                }
            }
            try {
                g90 g90Var6 = this.L0[0];
                g90Var6.setText(Emoji.replaceEmoji(g90Var6.getText(), this.L0[0].getPaint().getFontMetricsInt(), false));
            } catch (Exception unused2) {
            }
        }
    }

    public void b0() {
        int i10 = this.f6276c0;
        int i11 = i10 + 1;
        this.f6276c0 = i11;
        this.f6277d0 = i10;
        this.f6280g0 = i11;
        int size = this.U.size() + i11;
        this.f6281h0 = size;
        this.f6276c0 = size + 1;
        this.f6282i0 = size;
        if (!UserConfig.getInstance(this.V).isPremium() && this.X == null) {
            int i12 = this.f6276c0;
            this.f6276c0 = i12 + 1;
            this.f6283j0 = i12;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i10 == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.f6298z0) != null && inputStickerSet.f20863id == ((Long) objArr[0]).longValue()) {
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
        s00 s00Var = this.f6285l0;
        if (s00Var.f30922c) {
            s00Var.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        View view;
        Drawable drawable;
        int i10;
        View view2 = this.f6297y0;
        if (view2 != null) {
            if (this.E0) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            view2.setVisibility(i10);
        }
        super.mainContainerDispatchDraw(canvas);
        if (this.f6296x0 != null && this.E0) {
            View view3 = this.f6297y0;
            if (view3 == null) {
                view = this.f6287o0;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f6291s0, this.f6292t0};
            this.f6296x0.getMatrix().mapPoints(fArr);
            View view4 = this.f6296x0;
            if (view4 instanceof l5) {
                drawable = ((l5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.t1) {
                drawable = ((org.telegram.ui.Cells.t1) view4).f23807cc;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.C0;
            float f10 = (-iArr[0]) + this.f6293u0 + fArr[0];
            float f11 = (-iArr[1]) + this.f6294v0 + fArr[1];
            if (AndroidUtilities.isTablet()) {
                ViewGroup view5 = this.f6289q0.getParentLayout().getView();
                f10 += view5.getX() + view5.getPaddingLeft();
                f11 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f6295w0 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f12 = measuredHeight / intrinsicWidth;
            float f13 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.container && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float lerp = AndroidUtilities.lerp(f10, measuredWidth, pr.h.getInterpolation(this.D0));
            float lerp2 = AndroidUtilities.lerp(f11, measuredHeight2, this.D0);
            float f14 = this.f6295w0;
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
        if (this.f6296x0 == null) {
            return false;
        }
        this.F0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.D0 = 0.0f;
        this.E0 = true;
        this.f6288p0.invalidate();
        View view = this.f6296x0;
        if (view instanceof l5) {
            drawable = ((l5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            j5 j5Var = t1Var.f23807cc;
            t1Var.a3();
            drawable = j5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.f6296x0;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view2).a3();
        } else {
            view2.invalidate();
        }
        i iVar = this.f6287o0;
        if (iVar != null) {
            iVar.j(100L);
        }
        this.F0.addUpdateListener(new w1(this, 0));
        this.F0.addListener(new w2(2, this, drawable));
        this.F0.setDuration(600L);
        this.F0.setInterpolator(pr.h);
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
            AndroidUtilities.runOnUIThread(new t1(this, 1), 200L);
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        i iVar = this.f6287o0;
        if (iVar != null) {
            iVar.setDialogVisible(true);
        }
        this.f6286n0.setPaused(true);
        dialog.setOnDismissListener(new d0(this, 1));
        dialog.show();
        return true;
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        return new c2(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    public d2(org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.User user, n nVar, TL_stars.StarGift starGift, g6 g6Var) {
        super(p2Var, false, false, g6Var);
        ArrayList arrayList = new ArrayList();
        this.U = arrayList;
        this.C0 = new int[2];
        this.D0 = 0.0f;
        fixNavigationBar();
        this.f6289q0 = p2Var;
        this.v = 0.26f;
        this.W = user;
        this.V = i10;
        this.X = nVar;
        this.Y = starGift;
        this.f6274a0 = new bw0(getContext(), null);
        PremiumPreviewFragment.n0(i10, arrayList);
        if (nVar != null || UserConfig.getInstance(i10).isPremium()) {
            this.I0.setVisibility(8);
        }
        p1 p1Var = new p1(k6.Lj, k6.Mj, k6.Nj, k6.Oj, null);
        this.m0 = p1Var;
        p1Var.f6496m = true;
        p1Var.f6498o = 1.0f;
        p1Var.f6499p = 0.0f;
        p1Var.f6500q = 0.0f;
        p1Var.f6487b = 0.0f;
        p1Var.f6488c = 0.0f;
        b0();
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.d.setOnItemClickListener(new v1(this, i10, p2Var, 0));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.r0("profile");
        s00 s00Var = new s00(getContext());
        this.f6285l0 = s00Var;
        this.container.addView(s00Var, c6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.J0 = frameLayout;
        this.containerView.addView(frameLayout, c6.e(-1, 140, 87));
    }

    public void Y(View view) {
    }

    public void V(int i10, View view) {
    }
}
