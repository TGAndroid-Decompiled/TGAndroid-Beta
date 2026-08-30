package kh;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import lh.j7;
import lh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class x3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap Q = new HashMap();
    public final TextView B;
    public final lp C;
    public final FrameLayout D;
    public int E;
    public o70 F;
    public SpannableStringBuilder G;
    public int H;
    public boolean I;
    public int J;
    public final l2 K;
    public final xd.a L;
    public int M;
    public int N;
    public o2 O;
    public ViewGroup P;
    public final org.telegram.ui.ActionBar.p2 f10939a;
    public final int f10940b;
    public final long f10941c;
    public final l7 d;
    public final j7 e;
    public final org.telegram.ui.ActionBar.f6 f10942f;
    public final r2 h;
    public final k81 f10943n;
    public final FrameLayout f10944r;
    public final SpannableStringBuilder f10945s;
    public final SpannableStringBuilder v;
    public final ph.d f10946w;
    public int f10947x;
    public final LinearLayout f10948y;

    public x3(int r26, long r27, android.content.Context r29, org.telegram.ui.ActionBar.p2 r30, org.telegram.ui.ActionBar.f6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: kh.x3.<init>(int, long, android.content.Context, org.telegram.ui.ActionBar.p2, org.telegram.ui.ActionBar.f6):void");
    }

    public static void j(org.telegram.ui.ActionBar.g1 g1Var, l7 l7Var, Runnable runnable, int i10) {
        g1Var.setOnClickListener(new dg.m2(l7Var, i10, runnable, 2));
        g1Var.setOnLongClickListener(new j2(l7Var, i10, runnable));
    }

    public final void a() {
        l7 l7Var;
        n3 currentPage = getCurrentPage();
        if (currentPage != null && (l7Var = currentPage.e) != null && currentPage.d) {
            int i10 = l7Var.d;
            new s3(this.f10939a, this.f10941c, i10, new dg.j3(this, i10, currentPage, 1)).show();
        }
    }

    public final boolean b() {
        j7 j7Var = this.e;
        if (!j7Var.h() || j7Var.d().size() >= MessagesController.getInstance(this.f10940b).config.stargiftsCollectionsLimit.get()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        int i10 = this.f10940b;
        long j10 = this.f10941c;
        if (j10 >= 0) {
            if (j10 != 0 && j10 != UserConfig.getInstance(i10).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public final boolean d() {
        if (this.f10941c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        int i14 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.f10948y;
        ph.d dVar = this.f10946w;
        long j10 = this.f10941c;
        int i15 = 8;
        if (i10 == i14) {
            if (((Long) objArr[0]).longValue() == j10) {
                if (d()) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                dVar.setVisibility(i13);
                if (d()) {
                    i15 = 0;
                }
                linearLayout.setVisibility(i15);
                this.f10947x = 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.C.a(bool.booleanValue(), true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftCollectionsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                f(true);
                n();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (d()) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            dVar.setVisibility(i12);
            if (d()) {
                i15 = 0;
            }
            linearLayout.setVisibility(i15);
            this.f10947x = 60;
            setVisibleHeight(this.N);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.J > 0) {
            ArrayList d = this.e.d();
            int i10 = 0;
            while (true) {
                if (i10 < d.size()) {
                    if (((TL_stars.TL_starGiftCollection) d.get(i10)).collection_id == this.J) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            if (i10 >= 0 && tL_starGiftCollection != null) {
                this.J = 0;
                this.f10943n.d(tL_starGiftCollection.collection_id, i10 + 1);
            }
        }
    }

    public final void f(boolean z4) {
        r2 r2Var = this.h;
        if (r2Var != null && this.f10943n != null) {
            r2Var.o(z4);
            e();
        }
    }

    public final boolean g() {
        if (this.I) {
            return true;
        }
        n3 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.f10723n) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f10944r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.y3.B(this.f10947x, Math.max(AndroidUtilities.dp(240.0f), this.N) + (-frameLayout.getTop()), 1);
        if (this.N < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.N, AndroidUtilities.dp(this.f10947x));
        }
        return (int) (AndroidUtilities.dp(this.f10947x) - translationY);
    }

    public l7 getCurrentList() {
        n3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.e;
        }
        return this.d;
    }

    public sl0 getCurrentListView() {
        n3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f10722f;
        }
        return null;
    }

    public n3 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (n3) currentView;
    }

    public int getGiftsCount() {
        int i10;
        l7 l7Var;
        int i11;
        n3 currentPage = getCurrentPage();
        l7 l7Var2 = this.d;
        if (currentPage != null && (l7Var = currentPage.e) != l7Var2) {
            if (l7Var != null && (i11 = l7Var.f12774n) > 0) {
                return i11;
            }
        } else if (l7Var2 != null && (i10 = l7Var2.f12774n) > 0) {
            return i10;
        }
        int i12 = this.f10940b;
        long j10 = this.f10941c;
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
            if (userFull == null) {
                return 0;
            }
            return userFull.stargifts_count;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(-j10);
        if (chatFull == null) {
            return 0;
        }
        return chatFull.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j10 = 0;
        l7 l7Var = this.d;
        if (l7Var != null && !l7Var.f12772l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < l7Var.f12772l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) l7Var.f12772l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.f19190id));
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.f19190id));
                    i10++;
                }
            }
        }
        return j10;
    }

    public float getTabsHeight() {
        View[] viewPages;
        r2 r2Var = this.h;
        float f10 = 0.0f;
        if (r2Var.getViewPages() != null) {
            for (View view : r2Var.getViewPages()) {
                if (view instanceof n3) {
                    f10 = (((n3) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        k81 k81Var = this.f10943n;
        if (k81Var != null) {
            return k81Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        View view;
        int i10;
        j70 j70Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        org.telegram.ui.ActionBar.f6 f6Var = this.f10942f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        if (str != null) {
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        v2 v2Var = new v2(this, context, f6Var);
        v2Var.lineYFix = true;
        v2Var.setOnEditorActionListener(new w2(v2Var, callback, d2VarArr, view));
        MediaDataController.getInstance(this.f10940b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        v2Var.setTextSize(1, 18.0f);
        v2Var.setTextColor(j6.v0(j6.f20012j5, f6Var));
        v2Var.setHintColor(j6.v0(j6.Xh, f6Var));
        v2Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        v2Var.setFocusable(true);
        v2Var.setInputType(147457);
        v2Var.setLineColors(j6.v0(j6.f20031k6, f6Var), j6.v0(j6.f20049l6, f6Var), j6.v0(j6.f20122p7, f6Var));
        v2Var.setImeOptions(6);
        v2Var.setBackgroundDrawable(null);
        v2Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        v2Var.addTextChangedListener(new x2(v2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        v2Var.setText(str);
        linearLayout.addView(v2Var, k7.b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f19503a.f19584a = AndroidUtilities.dp(292.0f);
        if (str != null) {
            i10 = R.string.Edit;
        } else {
            i10 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i10), new c1.b(23, v2Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k3.e(10));
        d2VarArr[0] = alertDialog$Builder.f19503a;
        o70 o70Var = this.F;
        if (o70Var != null && (j70Var = o70Var.f27479m) != null) {
            j70Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.f10939a.getClassGuid());
        d2VarArr[0].setOnDismissListener(new i(this, v2Var, findActivity, 1));
        d2VarArr[0].setOnShowListener(new j(1, v2Var));
        d2VarArr[0].show();
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        d2Var.f19591e0 = false;
        d2Var.d(-1);
        v2Var.setSelection(v2Var.getText().length());
    }

    public final void i() {
        n3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i10) {
        l7 l7Var;
        if (i10 == 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            j7 j7Var = this.e;
            if (i11 < j7Var.d().size()) {
                if (i11 >= 0 && i11 < j7Var.d().size()) {
                    l7Var = j7Var.e(((TL_stars.TL_starGiftCollection) j7Var.d().get(i11)).collection_id);
                } else {
                    l7Var = null;
                }
                if (l7Var != null) {
                    return l7Var.f12772l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float f10;
        float nextPositionAlpha;
        boolean z4;
        SpannableStringBuilder spannableStringBuilder;
        nb nbVar;
        r2 r2Var = this.h;
        if (r2Var != null) {
            float f11 = 1.0f;
            if (r2Var.getCurrentPosition() == r2Var.getNextPosition()) {
                if (!k(r2Var.getCurrentPosition())) {
                    f11 = 0.0f;
                }
                nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * f11;
            } else {
                if (k(r2Var.getCurrentPosition())) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float currentPositionAlpha = r2Var.getCurrentPositionAlpha() * f10;
                if (!k(r2Var.getNextPosition())) {
                    f11 = 0.0f;
                }
                nextPositionAlpha = ((r2Var.getNextPositionAlpha() * f11) + currentPositionAlpha) * (AndroidUtilities.dp(68.0f) + 2);
            }
            FrameLayout frameLayout = this.f10944r;
            float B = nextPositionAlpha + org.telegram.messenger.y3.B(this.f10947x, (-frameLayout.getTop()) + this.N, 1);
            int i10 = 0;
            if (this.N > AndroidUtilities.dp(184.0f)) {
                z4 = true;
            } else {
                z4 = false;
            }
            xd.a aVar = this.L;
            aVar.a(z4, true);
            float f12 = aVar.e;
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f12);
            this.D.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
            frameLayout.setTranslationY(lerp - this.M);
            frameLayout.setAlpha(f12);
            if (f12 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            if (this.e.h() && r2Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.v;
            } else {
                spannableStringBuilder = this.f10945s;
            }
            this.f10946w.g(spannableStringBuilder, true, true);
            ic icVar = ic.f25665w;
            if (icVar != null && (nbVar = icVar.e) != null) {
                nbVar.updatePosition();
            }
        }
    }

    public final void m() {
        ph.d dVar = this.f10946w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = j6.Oh;
        org.telegram.ui.ActionBar.f6 f6Var = this.f10942f;
        dVar.setBackground(j6.b0(dp, ((or0) this).R.V0(j6.v0(i10, f6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    n3 n3Var = (n3) view;
                    org.telegram.ui.ActionBar.f6 f6Var2 = n3Var.f10721c;
                    if (n3Var.f10725s != null) {
                        n3Var.f10726w.setTextColor(j6.v0(j6.G6, f6Var2));
                        TextView textView = n3Var.f10727x;
                        int i11 = j6.Oh;
                        textView.setTextColor(j6.v0(i11, f6Var2));
                        n3Var.f10727x.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i11, f6Var2)), 4, 4));
                    } else {
                        n3Var.C.setTextColor(j6.v0(j6.G6, f6Var2));
                        n3Var.D.setTextColor(j6.v0(j6.f20281y6, f6Var2));
                        n3Var.E.j();
                    }
                }
            }
        }
        this.B.setTextColor(j6.v0(j6.f20012j5, f6Var));
        this.f10948y.setBackground(j6.Y(j6.v0(j6.f19996i6, f6Var), 24, 24));
    }

    public final void n() {
        boolean z4;
        View[] viewPages;
        if (this.e.d().isEmpty() && !b()) {
            z4 = false;
        } else {
            z4 = true;
        }
        r2 r2Var = this.h;
        if (r2Var.getViewPages() != null) {
            for (View view : r2Var.getViewPages()) {
                if (view instanceof n3) {
                    ((n3) view).setHasTabs(z4);
                }
            }
        }
    }

    public final void o() {
        float f10;
        View[] viewPages;
        float f11;
        k81 k81Var = this.f10943n;
        if (k81Var == null) {
            return;
        }
        float min = Math.min(this.H, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.H, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        k81Var.setTranslationY(min);
        k81Var.setScaleX(lerp);
        k81Var.setScaleY(lerp);
        r2 r2Var = this.h;
        if (r2Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : r2Var.getViewPages()) {
                if (view instanceof n3) {
                    if (((n3) view).F) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    f10 += f11;
                }
            }
        } else {
            f10 = 0.0f;
        }
        k81Var.setAlpha(k7.n.a(f10, 0.0f, 1.0f) * clamp01);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f10940b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        n3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        l7 l7Var = this.d;
        if (l7Var != null) {
            l7Var.f12775o = true;
            l7Var.a();
        }
        j7 j7Var = this.e;
        if (j7Var != null) {
            j7Var.f12676j = true;
            j7Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        n3 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.f10940b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        l7 l7Var = this.d;
        if (l7Var != null) {
            l7Var.f12775o = false;
        }
        j7 j7Var = this.e;
        if (j7Var != null) {
            j7Var.f12676j = false;
        }
    }

    public abstract void p(boolean z4);

    public void setButtonOffset(int i10) {
        if (this.M != i10) {
            this.M = i10;
            l();
        }
    }

    public void setPaddingTop(int i10) {
        View[] viewPages;
        if (this.H != i10) {
            this.H = i10;
            for (View view : this.h.getViewPages()) {
                if (view instanceof n3) {
                    n3 n3Var = (n3) view;
                    h3 h3Var = n3Var.f10722f;
                    int paddingTop = h3Var.getPaddingTop();
                    h3Var.setPadding(AndroidUtilities.dp(9.0f), this.H, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(h3Var, new n2(n3Var, paddingTop - h3Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z4) {
        n3 currentPage = getCurrentPage();
        if (currentPage != null) {
            n3.d(currentPage, z4);
        }
    }

    public void setReorderingCollections(boolean z4) {
        if (this.I != z4) {
            this.I = z4;
            p(g());
            this.f10943n.setReordering(z4);
            if (z4) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new i2(profileActivity, 0));
                }
            }
            if (!z4) {
                l2 l2Var = this.K;
                AndroidUtilities.cancelRunOnUIThread(l2Var);
                AndroidUtilities.runOnUIThread(l2Var);
            }
        }
    }

    public void setVisibleHeight(int i10) {
        View[] viewPages;
        this.N = i10;
        l();
        r2 r2Var = this.h;
        if (r2Var != null) {
            for (View view : r2Var.getViewPages()) {
                if (view instanceof n3) {
                    ((n3) view).setVisibleHeight(this.N);
                }
            }
        }
    }
}
