package lh;

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
import mh.j7;
import mh.l7;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class x3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap Q = new HashMap();
    public final TextView B;
    public final np C;
    public final FrameLayout D;
    public int E;
    public q70 F;
    public SpannableStringBuilder G;
    public int H;
    public boolean I;
    public int J;
    public final k2 K;
    public final xd.a L;
    public int M;
    public int N;
    public n2 O;
    public ViewGroup P;
    public final org.telegram.ui.ActionBar.p2 f13098a;
    public final int f13099b;
    public final long f13100c;
    public final l7 d;
    public final j7 f13101e;
    public final g6 f13102f;
    public final q2 h;
    public final l81 f13103n;
    public final FrameLayout f13104r;
    public final SpannableStringBuilder f13105s;
    public final SpannableStringBuilder v;
    public final qh.d f13106w;
    public int f13107x;
    public final LinearLayout f13108y;

    public x3(int r26, long r27, android.content.Context r29, org.telegram.ui.ActionBar.p2 r30, org.telegram.ui.ActionBar.g6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: lh.x3.<init>(int, long, android.content.Context, org.telegram.ui.ActionBar.p2, org.telegram.ui.ActionBar.g6):void");
    }

    public static void j(org.telegram.ui.ActionBar.g1 g1Var, l7 l7Var, Runnable runnable, int i10) {
        g1Var.setOnClickListener(new eg.k2(l7Var, i10, runnable, 2));
        g1Var.setOnLongClickListener(new i2(l7Var, i10, runnable));
    }

    public final void a() {
        l7 l7Var;
        n3 currentPage = getCurrentPage();
        if (currentPage != null && (l7Var = currentPage.f12863e) != null && currentPage.d) {
            int i10 = l7Var.d;
            new s3(this.f13098a, this.f13100c, i10, new eg.h3(this, i10, currentPage, 1)).show();
        }
    }

    public final boolean b() {
        j7 j7Var = this.f13101e;
        if (!j7Var.h() || j7Var.d().size() >= MessagesController.getInstance(this.f13099b).config.stargiftsCollectionsLimit.get()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        int i10 = this.f13099b;
        long j10 = this.f13100c;
        if (j10 >= 0) {
            if (j10 != 0 && j10 != UserConfig.getInstance(i10).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public final boolean d() {
        if (this.f13100c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        int i14 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.f13108y;
        qh.d dVar = this.f13106w;
        long j10 = this.f13100c;
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
                this.f13107x = 60;
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
            this.f13107x = 60;
            setVisibleHeight(this.N);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.J > 0) {
            ArrayList d = this.f13101e.d();
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
                this.f13103n.d(tL_starGiftCollection.collection_id, i10 + 1);
            }
        }
    }

    public final void f(boolean z4) {
        q2 q2Var = this.h;
        if (q2Var != null && this.f13103n != null) {
            q2Var.o(z4);
            e();
        }
    }

    public final boolean g() {
        if (this.I) {
            return true;
        }
        n3 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.f12865n) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f13104r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.y3.B(this.f13107x, Math.max(AndroidUtilities.dp(240.0f), this.N) + (-frameLayout.getTop()), 1);
        if (this.N < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.N, AndroidUtilities.dp(this.f13107x));
        }
        return (int) (AndroidUtilities.dp(this.f13107x) - translationY);
    }

    public l7 getCurrentList() {
        n3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f12863e;
        }
        return this.d;
    }

    public tl0 getCurrentListView() {
        n3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f12864f;
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
        if (currentPage != null && (l7Var = currentPage.f12863e) != l7Var2) {
            if (l7Var != null && (i11 = l7Var.f14407n) > 0) {
                return i11;
            }
        } else if (l7Var2 != null && (i10 = l7Var2.f14407n) > 0) {
            return i10;
        }
        int i12 = this.f13099b;
        long j10 = this.f13100c;
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
        if (l7Var != null && !l7Var.f14405l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < l7Var.f14405l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) l7Var.f14405l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.f20849id));
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.f20849id));
                    i10++;
                }
            }
        }
        return j10;
    }

    public float getTabsHeight() {
        View[] viewPages;
        q2 q2Var = this.h;
        float f10 = 0.0f;
        if (q2Var.getViewPages() != null) {
            for (View view : q2Var.getViewPages()) {
                if (view instanceof n3) {
                    f10 = (((n3) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        l81 l81Var = this.f13103n;
        if (l81Var != null) {
            return l81Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        View view;
        int i10;
        l70 l70Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        g6 g6Var = this.f13102f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        if (str != null) {
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        u2 u2Var = new u2(this, context, g6Var);
        u2Var.lineYFix = true;
        u2Var.setOnEditorActionListener(new v2(u2Var, callback, d2VarArr, view));
        MediaDataController.getInstance(this.f13099b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        u2Var.setTextSize(1, 18.0f);
        u2Var.setTextColor(k6.v0(k6.f21766j5, g6Var));
        u2Var.setHintColor(k6.v0(k6.Xh, g6Var));
        u2Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        u2Var.setFocusable(true);
        u2Var.setInputType(147457);
        u2Var.setLineColors(k6.v0(k6.f21785k6, g6Var), k6.v0(k6.f21803l6, g6Var), k6.v0(k6.f21876p7, g6Var));
        u2Var.setImeOptions(6);
        u2Var.setBackgroundDrawable(null);
        u2Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        u2Var.addTextChangedListener(new w2(u2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        u2Var.setText(str);
        linearLayout.addView(u2Var, k7.c6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f21166a.f21235a = AndroidUtilities.dp(292.0f);
        if (str != null) {
            i10 = R.string.Edit;
        } else {
            i10 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i10), new c1.b(23, u2Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k3.e(25));
        d2VarArr[0] = alertDialog$Builder.f21166a;
        q70 q70Var = this.F;
        if (q70Var != null && (l70Var = q70Var.f30319m) != null) {
            l70Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.f13098a.getClassGuid());
        d2VarArr[0].setOnDismissListener(new i(this, u2Var, findActivity, 1));
        d2VarArr[0].setOnShowListener(new j(1, u2Var));
        d2VarArr[0].show();
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        d2Var.f21243e0 = false;
        d2Var.d(-1);
        u2Var.setSelection(u2Var.getText().length());
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
            j7 j7Var = this.f13101e;
            if (i11 < j7Var.d().size()) {
                if (i11 >= 0 && i11 < j7Var.d().size()) {
                    l7Var = j7Var.e(((TL_stars.TL_starGiftCollection) j7Var.d().get(i11)).collection_id);
                } else {
                    l7Var = null;
                }
                if (l7Var != null) {
                    return l7Var.f14405l.isEmpty();
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
        q2 q2Var = this.h;
        if (q2Var != null) {
            float f11 = 1.0f;
            if (q2Var.getCurrentPosition() == q2Var.getNextPosition()) {
                if (!k(q2Var.getCurrentPosition())) {
                    f11 = 0.0f;
                }
                nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * f11;
            } else {
                if (k(q2Var.getCurrentPosition())) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float currentPositionAlpha = q2Var.getCurrentPositionAlpha() * f10;
                if (!k(q2Var.getNextPosition())) {
                    f11 = 0.0f;
                }
                nextPositionAlpha = ((q2Var.getNextPositionAlpha() * f11) + currentPositionAlpha) * (AndroidUtilities.dp(68.0f) + 2);
            }
            FrameLayout frameLayout = this.f13104r;
            float B = nextPositionAlpha + org.telegram.messenger.y3.B(this.f13107x, (-frameLayout.getTop()) + this.N, 1);
            int i10 = 0;
            if (this.N > AndroidUtilities.dp(184.0f)) {
                z4 = true;
            } else {
                z4 = false;
            }
            xd.a aVar = this.L;
            aVar.a(z4, true);
            float f12 = aVar.f50504e;
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f12);
            this.D.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
            frameLayout.setTranslationY(lerp - this.M);
            frameLayout.setAlpha(f12);
            if (f12 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            if (this.f13101e.h() && q2Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.v;
            } else {
                spannableStringBuilder = this.f13105s;
            }
            this.f13106w.g(spannableStringBuilder, true, true);
            ic icVar = ic.f27737w;
            if (icVar != null && (nbVar = icVar.f27741e) != null) {
                nbVar.updatePosition();
            }
        }
    }

    public final void m() {
        qh.d dVar = this.f13106w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = k6.Oh;
        g6 g6Var = this.f13102f;
        dVar.setBackground(k6.b0(dp, ((pr0) this).R.V0(k6.v0(i10, g6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    n3 n3Var = (n3) view;
                    g6 g6Var2 = n3Var.f12862c;
                    if (n3Var.f12867s != null) {
                        n3Var.f12868w.setTextColor(k6.v0(k6.G6, g6Var2));
                        TextView textView = n3Var.f12869x;
                        int i11 = k6.Oh;
                        textView.setTextColor(k6.v0(i11, g6Var2));
                        n3Var.f12869x.setBackground(k6.Y(k6.l1(0.1f, k6.v0(i11, g6Var2)), 4, 4));
                    } else {
                        n3Var.C.setTextColor(k6.v0(k6.G6, g6Var2));
                        n3Var.D.setTextColor(k6.v0(k6.f22036y6, g6Var2));
                        n3Var.E.j();
                    }
                }
            }
        }
        this.B.setTextColor(k6.v0(k6.f21766j5, g6Var));
        this.f13108y.setBackground(k6.Y(k6.v0(k6.f21750i6, g6Var), 24, 24));
    }

    public final void n() {
        boolean z4;
        View[] viewPages;
        if (this.f13101e.d().isEmpty() && !b()) {
            z4 = false;
        } else {
            z4 = true;
        }
        q2 q2Var = this.h;
        if (q2Var.getViewPages() != null) {
            for (View view : q2Var.getViewPages()) {
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
        l81 l81Var = this.f13103n;
        if (l81Var == null) {
            return;
        }
        float min = Math.min(this.H, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.H, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        l81Var.setTranslationY(min);
        l81Var.setScaleX(lerp);
        l81Var.setScaleY(lerp);
        q2 q2Var = this.h;
        if (q2Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : q2Var.getViewPages()) {
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
        l81Var.setAlpha(k7.o.a(f10, 0.0f, 1.0f) * clamp01);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f13099b;
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
            l7Var.f14408o = true;
            l7Var.a();
        }
        j7 j7Var = this.f13101e;
        if (j7Var != null) {
            j7Var.f14307j = true;
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
        int i10 = this.f13099b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        l7 l7Var = this.d;
        if (l7Var != null) {
            l7Var.f14408o = false;
        }
        j7 j7Var = this.f13101e;
        if (j7Var != null) {
            j7Var.f14307j = false;
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
                    h3 h3Var = n3Var.f12864f;
                    int paddingTop = h3Var.getPaddingTop();
                    h3Var.setPadding(AndroidUtilities.dp(9.0f), this.H, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(h3Var, new m2(n3Var, paddingTop - h3Var.getPaddingTop(), 0));
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
            this.f13103n.setReordering(z4);
            if (z4) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new h2(profileActivity, 0));
                }
            }
            if (!z4) {
                k2 k2Var = this.K;
                AndroidUtilities.cancelRunOnUIThread(k2Var);
                AndroidUtilities.runOnUIThread(k2Var);
            }
        }
    }

    public void setVisibleHeight(int i10) {
        View[] viewPages;
        this.N = i10;
        l();
        q2 q2Var = this.h;
        if (q2Var != null) {
            for (View view : q2Var.getViewPages()) {
                if (view instanceof n3) {
                    ((n3) view).setVisibleHeight(this.N);
                }
            }
        }
    }
}
