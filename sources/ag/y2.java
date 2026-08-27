package ag;

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
import h7.z5;
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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gw0;
import org.telegram.ui.ra1;
import org.telegram.ui.rv0;

public class y2 extends qa implements NotificationCenter.NotificationCenterDelegate {
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
    public p80[] K0;
    public p80 L0;
    public final ArrayList T;
    public int U;
    public final TLRPC.User V;
    public final p W;
    public final TL_stars.StarGift X;
    public boolean Y;
    public final rv0 Z;

    public int f708a0;

    public int f709b0;

    public int f710c0;

    public int f711d0;

    public int f712e0;

    public int f713f0;

    public int f714g0;

    public int f715h0;

    public int f716i0;

    public int f717j0;

    public final f00 f718k0;

    public final i2 f719l0;
    public j m0;

    public k f720n0;

    public ra1 f721o0;

    public final org.telegram.ui.ActionBar.n2 f722p0;

    public Integer f723q0;

    public float f724r0;

    public float f725s0;

    public float f726t0;

    public float f727u0;

    public float f728v0;

    public View f729w0;

    public View f730x0;

    public TLRPC.InputStickerSet f731y0;

    public TLRPC.TL_emojiStatusCollectible f732z0;

    public y2(org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.User user, c6 c6Var) {
        this(n2Var, i10, user, null, null, c6Var);
    }

    public static void P(y2 y2Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y2Var.f731y0);
        r2 r2Var = new r2(y2Var, 0);
        org.telegram.ui.ActionBar.n2 n2Var = y2Var.f722p0;
        if (n2Var != null) {
            r2Var.setParentFragment(n2Var);
        }
        new s2(y2Var, r2Var, y2Var.getContext(), y2Var.resourcesProvider, arrayList).show();
    }

    @Override
    public final void E(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int measuredHeight = 0;
        while (true) {
            ArrayList arrayList = this.T;
            if (i12 >= arrayList.size()) {
                this.f708a0 = measuredHeight;
                this.container.getLocationOnScreen(this.B0);
                return;
            }
            gw0 gw0Var = (gw0) arrayList.get(i12);
            rv0 rv0Var = this.Z;
            rv0Var.a(gw0Var, false);
            rv0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            ((gw0) arrayList.get(i12)).f38489e = measuredHeight;
            measuredHeight += rv0Var.getMeasuredHeight();
            i12++;
        }
    }

    @Override
    public final void G(zu0 zu0Var) {
        this.U = UserConfig.selectedAccount;
        s1 s1Var = new s1(getContext(), this.resourcesProvider, false);
        s1Var.a(PremiumPreviewFragment.o0(this.U, null), new w0(this, 1), false);
        this.H0 = new FrameLayout(getContext());
        View view = new View(getContext());
        view.setBackgroundColor(getThemedColor(g6.f23054d7));
        this.H0.addView(view, z5.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (UserConfig.getInstance(this.U).isPremium() || (this instanceof cg.o1)) {
            return;
        }
        this.H0.addView(s1Var, z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        this.H0.setBackgroundColor(getThemedColor(g6.f23124h5));
        zu0Var.addView(this.H0, z5.e(-1, 68, 80));
    }

    public void W(ra1 ra1Var) {
        ra1Var.addView(this.f730x0, z5.p(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int X() {
        return 0;
    }

    public View Z(Context context, int i10) {
        return null;
    }

    public void a0(boolean z10) {
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder;
        p80[] p80VarArr = this.K0;
        if (p80VarArr == null || this.L0 == null) {
            return;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f732z0;
        int i10 = 2;
        int i11 = 1;
        TLRPC.User user = this.V;
        int i12 = 0;
        if (tL_emojiStatusCollectible != null) {
            String strSubstring = tL_emojiStatusCollectible.title;
            int iLastIndexOf = strSubstring.lastIndexOf(32);
            if (iLastIndexOf >= 0) {
                strSubstring = strSubstring.substring(0, iLastIndexOf);
            }
            this.K0[0].setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TelegramPremiumUserStatusCollectibleDialogTitle, DialogObject.getShortName(user), strSubstring), new n2(this, i12)));
            pa.q(R.string.TelegramPremiumUserStatusDialogSubtitle, this.L0);
        } else if (this.f731y0 != null) {
            String string = LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogTitle, ContactsController.formatName(user.first_name, user.last_name), "<STICKERSET>");
            Integer num = this.f723q0;
            CharSequence charSequenceReplaceSingleLink = AndroidUtilities.replaceSingleLink(string, num == null ? getThemedColor(g6.f23357u6) : num.intValue());
            try {
                charSequenceReplaceSingleLink = Emoji.replaceEmoji(charSequenceReplaceSingleLink, this.K0[0].getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
            SpannableStringBuilder spannableStringBuilder2 = charSequenceReplaceSingleLink instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequenceReplaceSingleLink : new SpannableStringBuilder(charSequenceReplaceSingleLink);
            int iIndexOf = charSequenceReplaceSingleLink.toString().indexOf("<STICKERSET>");
            if (iIndexOf >= 0) {
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.U).getStickerSet(this.f731y0, false);
                if (stickerSet == null || stickerSet.documents.isEmpty()) {
                    document = null;
                } else {
                    document = stickerSet.documents.get(0);
                    if (stickerSet.set != null) {
                        for (int i13 = 0; i13 < stickerSet.documents.size(); i13++) {
                            if (stickerSet.documents.get(i13).f22386id == stickerSet.set.thumb_document_id) {
                                document = stickerSet.documents.get(i13);
                                break;
                            }
                        }
                    }
                }
                if (document != null) {
                    spannableStringBuilder = new SpannableStringBuilder("x");
                    spannableStringBuilder.setSpan(new t5(document, this.K0[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                    if (stickerSet != null && stickerSet.set != null) {
                        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) stickerSet.set.title);
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder("xxxxxx");
                    spannableStringBuilder.setSpan(new u80(AndroidUtilities.dp(100.0f), this.K0[0]), 0, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder2.replace(iIndexOf, iIndexOf + 12, (CharSequence) spannableStringBuilder);
                spannableStringBuilder2.setSpan(new x0(this, i11), iIndexOf, spannableStringBuilder.length() + iIndexOf, 33);
                this.K0[1].setOnLinkPressListener(new o80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        y2.P(this.f582a);
                    }
                });
                if (document != null) {
                    p80[] p80VarArr2 = this.K0;
                    if (p80VarArr2 != null) {
                        p80VarArr2[1].setText(spannableStringBuilder2);
                        if (this.K0[1].getVisibility() != 0) {
                            if (z10) {
                                this.K0[1].setAlpha(0.0f);
                                this.K0[1].setVisibility(0);
                                ViewPropertyAnimator viewPropertyAnimatorAlpha = this.K0[1].animate().alpha(1.0f);
                                er erVar = er.f28122f;
                                rl.o(viewPropertyAnimatorAlpha, erVar, 200L);
                                this.K0[0].animate().alpha(0.0f).setInterpolator(erVar).setDuration(200L).withEndAction(new n2(this, i10)).start();
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                valueAnimatorOfFloat.addUpdateListener(new q2(this, i11));
                                valueAnimatorOfFloat.setInterpolator(erVar);
                                valueAnimatorOfFloat.setDuration(200L);
                                valueAnimatorOfFloat.start();
                            } else {
                                this.K0[1].setAlpha(1.0f);
                                this.K0[1].setVisibility(0);
                                this.K0[0].setAlpha(0.0f);
                                this.K0[0].setVisibility(8);
                            }
                        }
                    }
                } else {
                    this.K0[0].setText(spannableStringBuilder2, (TextView.BufferType) null);
                }
            }
            pa.q(R.string.TelegramPremiumUserStatusDialogSubtitle, this.L0);
        } else if (this.A0) {
            p80VarArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDefaultDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
            this.L0.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogSubtitle, ContactsController.formatName(user.first_name, user.last_name))));
        } else {
            p pVar = this.W;
            if (pVar == null) {
                TL_stars.StarGift starGift = this.X;
                if (starGift != null) {
                    p80VarArr[0].setText(LocaleController.getString(R.string.Gift2PremiumTitle));
                    this.K0[0].setTextSize(1, 20.0f);
                    if (starGift.limited_per_user) {
                        this.L0.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PremiumSubtitleMany", starGift.per_user_total)));
                    } else {
                        pa.q(R.string.Gift2PremiumSubtitle, this.L0);
                    }
                    this.L0.setTextSize(1, 14.0f);
                } else if (user == null) {
                    p80VarArr[0].setText(LocaleController.getString(R.string.TelegramPremium));
                    pa.q(R.string.TelegramPremiumSubscribedSubtitle, this.L0);
                } else {
                    p80 p80Var = p80VarArr[0];
                    String string2 = LocaleController.formatString(R.string.TelegramPremiumUserDialogTitle, ContactsController.formatName(user.first_name, user.last_name));
                    Integer num2 = this.f723q0;
                    p80Var.setText(AndroidUtilities.replaceSingleLink(string2, num2 == null ? getThemedColor(g6.f23357u6) : num2.intValue()));
                    pa.q(R.string.TelegramPremiumUserDialogSubtitle, this.L0);
                }
            } else if (this.Y) {
                p80 p80Var2 = p80VarArr[0];
                String string3 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumOutboundDialogTitleWithPlural, user != null ? user.first_name : "", LocaleController.formatPluralString("GiftMonths", pVar.d(), new Object[0]));
                Integer num3 = this.f723q0;
                p80Var2.setText(AndroidUtilities.replaceSingleLink(string3, num3 == null ? getThemedColor(g6.f23357u6) : num3.intValue()));
                p80 p80Var3 = this.L0;
                String string4 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumOutboundDialogSubtitle, user != null ? user.first_name : "");
                Integer num4 = this.f723q0;
                p80Var3.setText(AndroidUtilities.replaceSingleLink(string4, num4 == null ? getThemedColor(g6.f23357u6) : num4.intValue()));
            } else if (user == null || TextUtils.isEmpty(user.first_name) || user.f22527id == 777000) {
                p80 p80Var4 = this.K0[0];
                String string5 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPluralSomeone, LocaleController.formatPluralString("GiftMonths", pVar.d(), new Object[0]));
                Integer num5 = this.f723q0;
                p80Var4.setText(AndroidUtilities.replaceSingleLink(string5, num5 == null ? getThemedColor(g6.f23357u6) : num5.intValue()));
                pa.q(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.L0);
            } else {
                p80 p80Var5 = this.K0[0];
                String string6 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPlural, user.first_name, LocaleController.formatPluralString("GiftMonths", pVar.d(), new Object[0]));
                Integer num6 = this.f723q0;
                p80Var5.setText(AndroidUtilities.replaceSingleLink(string6, num6 == null ? getThemedColor(g6.f23357u6) : num6.intValue()));
                pa.q(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.L0);
            }
        }
        try {
            p80 p80Var6 = this.K0[0];
            p80Var6.setText(Emoji.replaceEmoji(p80Var6.getText(), this.K0[0].getPaint().getFontMetricsInt(), false));
        } catch (Exception unused2) {
        }
    }

    public void b0() {
        int i10 = this.f709b0;
        int i11 = i10 + 1;
        this.f709b0 = i11;
        this.f710c0 = i10;
        this.f713f0 = i11;
        int size = this.T.size() + i11;
        this.f714g0 = size;
        this.f709b0 = size + 1;
        this.f715h0 = size;
        if (UserConfig.getInstance(this.U).isPremium() || this.W != null) {
            return;
        }
        int i12 = this.f709b0;
        this.f709b0 = i12 + 1;
        this.f716i0 = i12;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i10 == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.f731y0) != null && inputStickerSet.f22400id == ((Long) objArr[0]).longValue()) {
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
        f00 f00Var = this.f718k0;
        if (f00Var.f28215c) {
            f00Var.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        View view = this.f730x0;
        if (view != null) {
            view.setVisibility(this.D0 ? 4 : 0);
        }
        super.mainContainerDispatchDraw(canvas);
        if (this.f729w0 == null || !this.D0) {
            return;
        }
        View view2 = this.f730x0;
        View view3 = view2 == null ? this.f720n0 : view2;
        if (view3 == view2) {
            view2.setVisibility(0);
        }
        canvas.save();
        float[] fArr = {this.f724r0, this.f725s0};
        this.f729w0.getMatrix().mapPoints(fArr);
        View view4 = this.f729w0;
        Drawable rightDrawable = view4 instanceof h5 ? ((h5) view4).getRightDrawable() : view4 instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view4).f25278bc : null;
        if (rightDrawable == null) {
            canvas.restore();
            return;
        }
        int[] iArr = this.B0;
        float x8 = (-iArr[0]) + this.f726t0 + fArr[0];
        float y10 = (-iArr[1]) + this.f727u0 + fArr[1];
        if (AndroidUtilities.isTablet()) {
            ViewGroup view5 = this.f722p0.getParentLayout().getView();
            x8 += view5.getX() + view5.getPaddingLeft();
            y10 += view5.getY() + view5.getPaddingTop();
        }
        float intrinsicWidth = this.f728v0 * rightDrawable.getIntrinsicWidth();
        float measuredHeight = view3.getMeasuredHeight() * 0.8f;
        float f10 = measuredHeight / intrinsicWidth;
        float f11 = intrinsicWidth / measuredHeight;
        float measuredWidth = view3.getMeasuredWidth() / 2.0f;
        for (View view6 = view3; view6 != this.container && view6 != null; view6 = (View) view6.getParent()) {
            measuredWidth += view6.getX();
        }
        float measuredHeight2 = (view3.getMeasuredHeight() / 2.0f) + ((View) view3.getParent().getParent()).getY() + ((View) view3.getParent()).getY() + view3.getY() + 0.0f;
        float fLerp = AndroidUtilities.lerp(x8, measuredWidth, er.h.getInterpolation(this.C0));
        float fLerp2 = AndroidUtilities.lerp(y10, measuredHeight2, this.C0);
        float f12 = this.f728v0;
        float f13 = this.C0;
        float f14 = (f10 * f13) + ((1.0f - f13) * f12);
        canvas.save();
        canvas.scale(f14, f14, fLerp, fLerp2);
        int i10 = (int) fLerp;
        int i11 = (int) fLerp2;
        rightDrawable.setBounds(rl.v(2, i10, rightDrawable), rl.e(2, i11, rightDrawable), rl.A(2, i10, rightDrawable), rl.y(2, i11, rightDrawable));
        rightDrawable.setAlpha((int) ((1.0f - Utilities.clamp(this.C0, 1.0f, 0.0f)) * 255.0f));
        rightDrawable.draw(canvas);
        rightDrawable.setAlpha(0);
        canvas.restore();
        float fLerp3 = AndroidUtilities.lerp(f11, 1.0f, this.C0);
        canvas.scale(fLerp3, fLerp3, fLerp, fLerp2);
        canvas.translate(fLerp - (view3.getMeasuredWidth() / 2.0f), fLerp2 - (view3.getMeasuredHeight() / 2.0f));
        view3.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        Drawable rightDrawable;
        int i10 = 0;
        if (this.f729w0 == null) {
            return false;
        }
        this.E0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C0 = 0.0f;
        int i11 = 1;
        this.D0 = true;
        this.f721o0.invalidate();
        View view = this.f729w0;
        if (view instanceof h5) {
            rightDrawable = ((h5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            i5 i5Var = s1Var.f25278bc;
            s1Var.Z2();
            rightDrawable = i5Var;
        } else {
            rightDrawable = null;
        }
        if (rightDrawable != null) {
            rightDrawable.setAlpha(0);
        }
        View view2 = this.f729w0;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view2).Z2();
        } else {
            view2.invalidate();
        }
        k kVar = this.f720n0;
        if (kVar != null) {
            kVar.j(100L);
        }
        this.E0.addUpdateListener(new q2(this, i10));
        this.E0.addListener(new x1(i11, this, rightDrawable));
        this.E0.setDuration(600L);
        this.E0.setInterpolator(er.h);
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
        int i10 = 1;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        if (this.F0) {
            AndroidUtilities.runOnUIThread(new n2(this, i10), 200L);
        }
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        k kVar = this.f720n0;
        if (kVar != null) {
            kVar.setDialogVisible(true);
        }
        this.m0.setPaused(true);
        dialog.setOnDismissListener(new j0(this, 1));
        dialog.show();
        return true;
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        return new x2(this);
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    public y2(org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.User user, p pVar, TL_stars.StarGift starGift, c6 c6Var) {
        super(n2Var, false, false, c6Var);
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        this.B0 = new int[2];
        this.C0 = 0.0f;
        fixNavigationBar();
        this.f722p0 = n2Var;
        this.v = 0.26f;
        this.V = user;
        this.U = i10;
        this.W = pVar;
        this.X = starGift;
        this.Z = new rv0(getContext(), null);
        PremiumPreviewFragment.n0(i10, arrayList);
        if (pVar != null || UserConfig.getInstance(i10).isPremium()) {
            this.H0.setVisibility(8);
        }
        i2 i2Var = new i2(g6.Lj, g6.Mj, g6.Nj, g6.Oj, null);
        this.f719l0 = i2Var;
        i2Var.f464m = true;
        i2Var.f466o = 1.0f;
        i2Var.f467p = 0.0f;
        i2Var.f468q = 0.0f;
        i2Var.f455b = 0.0f;
        i2Var.f456c = 0.0f;
        b0();
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.d.setOnItemClickListener(new p2(this, i10, n2Var, 0));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.r0("profile");
        f00 f00Var = new f00(getContext());
        this.f718k0 = f00Var;
        this.container.addView(f00Var, z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.I0 = frameLayout;
        this.containerView.addView(frameLayout, z5.e(-1, 140, 87));
    }

    public void Y(View view) {
    }

    public void V(int i10, View view) {
    }
}
