package fh;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import gh.l7;
import gh.n7;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class j4 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap P = new HashMap();
    public final TextView A;
    public final dp B;
    public final FrameLayout C;
    public int D;
    public x60 E;
    public SpannableStringBuilder F;
    public int G;
    public boolean H;
    public int I;
    public final t2 J;
    public final td.a K;
    public int L;
    public int M;
    public x2 N;
    public ViewGroup O;
    public final org.telegram.ui.ActionBar.o2 f6545a;
    public final int f6546b;
    public final long f6547c;
    public final n7 d;
    public final l7 f6548e;
    public final org.telegram.ui.ActionBar.b6 f6549f;
    public final c3 h;
    public final m71 f6550n;
    public final FrameLayout f6551r;
    public final SpannableStringBuilder f6552s;
    public final SpannableStringBuilder v;
    public final kh.d f6553w;
    public int f6554x;
    public final LinearLayout f6555y;

    public j4(int r26, long r27, android.content.Context r29, org.telegram.ui.ActionBar.o2 r30, org.telegram.ui.ActionBar.b6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: fh.j4.<init>(int, long, android.content.Context, org.telegram.ui.ActionBar.o2, org.telegram.ui.ActionBar.b6):void");
    }

    public static void j(org.telegram.ui.ActionBar.g1 g1Var, n7 n7Var, Runnable runnable, int i9) {
        g1Var.setOnClickListener(new a3(n7Var, i9, runnable, 1));
        g1Var.setOnLongClickListener(new r2(n7Var, i9, runnable));
    }

    public final void a() {
        n7 n7Var;
        y3 currentPage = getCurrentPage();
        if (currentPage != null && (n7Var = currentPage.f6883e) != null && currentPage.d) {
            int i9 = n7Var.d;
            new d4(this.f6545a, this.f6547c, i9, new v2(this, i9, currentPage, 0)).show();
        }
    }

    public final boolean b() {
        l7 l7Var = this.f6548e;
        if (!l7Var.h() || l7Var.d().size() >= MessagesController.getInstance(this.f6546b).config.stargiftsCollectionsLimit.get()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        int i9 = this.f6546b;
        long j10 = this.f6547c;
        if (j10 >= 0) {
            if (j10 != 0 && j10 != UserConfig.getInstance(i9).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i9).getChat(Long.valueOf(-j10)), 5);
    }

    public final boolean d() {
        if (this.f6547c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11;
        int i12;
        int i13 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.f6555y;
        kh.d dVar = this.f6553w;
        long j10 = this.f6547c;
        int i14 = 8;
        if (i9 == i13) {
            if (((Long) objArr[0]).longValue() == j10) {
                if (d()) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                dVar.setVisibility(i12);
                if (d()) {
                    i14 = 0;
                }
                linearLayout.setVisibility(i14);
                this.f6554x = 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.B.a(bool.booleanValue(), true);
                }
            }
        } else if (i9 == NotificationCenter.starUserGiftCollectionsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                f(true);
                n();
            }
        } else if (i9 == NotificationCenter.updateInterfaces) {
            if (d()) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            dVar.setVisibility(i11);
            if (d()) {
                i14 = 0;
            }
            linearLayout.setVisibility(i14);
            this.f6554x = 60;
            setVisibleHeight(this.M);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.I > 0) {
            ArrayList d = this.f6548e.d();
            int i9 = 0;
            while (true) {
                if (i9 < d.size()) {
                    if (((TL_stars.TL_starGiftCollection) d.get(i9)).collection_id == this.I) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i9);
                        break;
                    }
                    i9++;
                } else {
                    i9 = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            if (i9 >= 0 && tL_starGiftCollection != null) {
                this.I = 0;
                this.f6550n.d(tL_starGiftCollection.collection_id, i9 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        c3 c3Var = this.h;
        if (c3Var != null && this.f6550n != null) {
            c3Var.o(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.H) {
            return true;
        }
        y3 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.f6885n) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f6551r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.l0.B(this.f6554x, Math.max(AndroidUtilities.dp(240.0f), this.M) + (-frameLayout.getTop()), 1);
        if (this.M < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.M, AndroidUtilities.dp(this.f6554x));
        }
        return (int) (AndroidUtilities.dp(this.f6554x) - translationY);
    }

    public n7 getCurrentList() {
        y3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f6883e;
        }
        return this.d;
    }

    public wk0 getCurrentListView() {
        y3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f6884f;
        }
        return null;
    }

    public y3 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (y3) currentView;
    }

    public int getGiftsCount() {
        int i9;
        n7 n7Var;
        int i10;
        y3 currentPage = getCurrentPage();
        n7 n7Var2 = this.d;
        if (currentPage != null && (n7Var = currentPage.f6883e) != n7Var2) {
            if (n7Var != null && (i10 = n7Var.f8627n) > 0) {
                return i10;
            }
        } else if (n7Var2 != null && (i9 = n7Var2.f8627n) > 0) {
            return i9;
        }
        int i11 = this.f6546b;
        long j10 = this.f6547c;
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j10);
            if (userFull == null) {
                return 0;
            }
            return userFull.stargifts_count;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(-j10);
        if (chatFull == null) {
            return 0;
        }
        return chatFull.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j10 = 0;
        n7 n7Var = this.d;
        if (n7Var != null && !n7Var.f8625l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i9 = 0;
            for (int i10 = 0; i9 < 3 && i10 < n7Var.f8625l.size(); i10++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) n7Var.f8625l.get(i10)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.f22386id));
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.f22386id));
                    i9++;
                }
            }
        }
        return j10;
    }

    public float getTabsHeight() {
        View[] viewPages;
        c3 c3Var = this.h;
        float f10 = 0.0f;
        if (c3Var.getViewPages() != null) {
            for (View view : c3Var.getViewPages()) {
                if (view instanceof y3) {
                    f10 = (((y3) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        m71 m71Var = this.f6550n;
        if (m71Var != null) {
            return m71Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        View view;
        int i9;
        s60 s60Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        org.telegram.ui.ActionBar.b6 b6Var = this.f6549f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        if (str != null) {
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        g3 g3Var = new g3(this, context, b6Var);
        g3Var.lineYFix = true;
        g3Var.setOnEditorActionListener(new h3(g3Var, callback, c2VarArr, view));
        MediaDataController.getInstance(this.f6546b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        g3Var.setTextSize(1, 18.0f);
        g3Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var));
        g3Var.setHintColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xh, b6Var));
        g3Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        g3Var.setFocusable(true);
        g3Var.setInputType(147457);
        g3Var.setLineColors(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23127k6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23144l6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23212p7, b6Var));
        g3Var.setImeOptions(6);
        g3Var.setBackgroundDrawable(null);
        g3Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        g3Var.addTextChangedListener(new i3(g3Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        g3Var.setText(str);
        linearLayout.addView(g3Var, g7.e6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f22702a.f22761a = AndroidUtilities.dp(292.0f);
        if (str != null) {
            i9 = R.string.Edit;
        } else {
            i9 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i9), new b5.d(17, g3Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new a9.b(29));
        c2VarArr[0] = alertDialog$Builder.f22702a;
        x60 x60Var = this.E;
        if (x60Var != null && (s60Var = x60Var.f34570m) != null) {
            s60Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.f6545a.getClassGuid());
        c2VarArr[0].setOnDismissListener(new j(this, g3Var, findActivity, 1));
        c2VarArr[0].setOnShowListener(new k(1, g3Var));
        c2VarArr[0].show();
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        c2Var.f22767d0 = false;
        c2Var.d(-1);
        g3Var.setSelection(g3Var.getText().length());
    }

    public final void i() {
        y3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i9) {
        n7 n7Var;
        if (i9 == 0) {
            return false;
        }
        int i10 = i9 - 1;
        if (i10 >= 0) {
            l7 l7Var = this.f6548e;
            if (i10 < l7Var.d().size()) {
                if (i10 >= 0 && i10 < l7Var.d().size()) {
                    n7Var = l7Var.e(((TL_stars.TL_starGiftCollection) l7Var.d().get(i10)).collection_id);
                } else {
                    n7Var = null;
                }
                if (n7Var != null) {
                    return n7Var.f8625l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float f10;
        float nextPositionAlpha;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        lb lbVar;
        c3 c3Var = this.h;
        if (c3Var != null) {
            float f11 = 1.0f;
            if (c3Var.getCurrentPosition() == c3Var.getNextPosition()) {
                if (!k(c3Var.getCurrentPosition())) {
                    f11 = 0.0f;
                }
                nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * f11;
            } else {
                if (k(c3Var.getCurrentPosition())) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float currentPositionAlpha = c3Var.getCurrentPositionAlpha() * f10;
                if (!k(c3Var.getNextPosition())) {
                    f11 = 0.0f;
                }
                nextPositionAlpha = ((c3Var.getNextPositionAlpha() * f11) + currentPositionAlpha) * (AndroidUtilities.dp(68.0f) + 2);
            }
            FrameLayout frameLayout = this.f6551r;
            float B = nextPositionAlpha + org.telegram.messenger.l0.B(this.f6554x, (-frameLayout.getTop()) + this.M, 1);
            int i9 = 0;
            if (this.M > AndroidUtilities.dp(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            td.a aVar = this.K;
            aVar.a(z10, true);
            float f12 = aVar.f47775e;
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f12);
            this.C.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
            frameLayout.setTranslationY(lerp - this.L);
            frameLayout.setAlpha(f12);
            if (f12 <= 0.0f) {
                i9 = 4;
            }
            frameLayout.setVisibility(i9);
            if (this.f6548e.h() && c3Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.v;
            } else {
                spannableStringBuilder = this.f6552s;
            }
            this.f6553w.g(spannableStringBuilder, true, true);
            gc gcVar = gc.f28729w;
            if (gcVar != null && (lbVar = gcVar.f28733e) != null) {
                lbVar.updatePosition();
            }
        }
    }

    public final void m() {
        kh.d dVar = this.f6553w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i9 = org.telegram.ui.ActionBar.f6.Oh;
        org.telegram.ui.ActionBar.b6 b6Var = this.f6549f;
        dVar.setBackground(org.telegram.ui.ActionBar.f6.b0(dp, ((vq0) this).Q.V0(org.telegram.ui.ActionBar.f6.v0(i9, b6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    y3 y3Var = (y3) view;
                    org.telegram.ui.ActionBar.b6 b6Var2 = y3Var.f6882c;
                    if (y3Var.f6887s != null) {
                        y3Var.f6888w.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var2));
                        TextView textView = y3Var.f6889x;
                        int i10 = org.telegram.ui.ActionBar.f6.Oh;
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var2));
                        y3Var.f6889x.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var2)), 4, 4));
                    } else {
                        y3Var.B.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var2));
                        y3Var.C.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var2));
                        y3Var.D.j();
                    }
                }
            }
        }
        this.A.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var));
        this.f6555y.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 24, 24));
    }

    public final void n() {
        boolean z10;
        View[] viewPages;
        if (this.f6548e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        c3 c3Var = this.h;
        if (c3Var.getViewPages() != null) {
            for (View view : c3Var.getViewPages()) {
                if (view instanceof y3) {
                    ((y3) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f10;
        View[] viewPages;
        float f11;
        m71 m71Var = this.f6550n;
        if (m71Var == null) {
            return;
        }
        float min = Math.min(this.G, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.G, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        m71Var.setTranslationY(min);
        m71Var.setScaleX(lerp);
        m71Var.setScaleY(lerp);
        c3 c3Var = this.h;
        if (c3Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : c3Var.getViewPages()) {
                if (view instanceof y3) {
                    if (((y3) view).E) {
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
        m71Var.setAlpha(g7.n.a(f10, 0.0f, 1.0f) * clamp01);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = this.f6546b;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.updateInterfaces);
        y3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        n7 n7Var = this.d;
        if (n7Var != null) {
            n7Var.f8628o = true;
            n7Var.a();
        }
        l7 l7Var = this.f6548e;
        if (l7Var != null) {
            l7Var.f8508j = true;
            l7Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        y3 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i9 = this.f6546b;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.updateInterfaces);
        n7 n7Var = this.d;
        if (n7Var != null) {
            n7Var.f8628o = false;
        }
        l7 l7Var = this.f6548e;
        if (l7Var != null) {
            l7Var.f8508j = false;
        }
    }

    public abstract void p(boolean z10);

    public void setButtonOffset(int i9) {
        if (this.L != i9) {
            this.L = i9;
            l();
        }
    }

    public void setPaddingTop(int i9) {
        View[] viewPages;
        if (this.G != i9) {
            this.G = i9;
            for (View view : this.h.getViewPages()) {
                if (view instanceof y3) {
                    y3 y3Var = (y3) view;
                    s3 s3Var = y3Var.f6884f;
                    int paddingTop = s3Var.getPaddingTop();
                    s3Var.setPadding(AndroidUtilities.dp(9.0f), this.G, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(s3Var, new w2(y3Var, paddingTop - s3Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        y3 currentPage = getCurrentPage();
        if (currentPage != null) {
            y3.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            p(g());
            this.f6550n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new q2(profileActivity, 0));
                }
            }
            if (!z10) {
                t2 t2Var = this.J;
                AndroidUtilities.cancelRunOnUIThread(t2Var);
                AndroidUtilities.runOnUIThread(t2Var);
            }
        }
    }

    public void setVisibleHeight(int i9) {
        View[] viewPages;
        this.M = i9;
        l();
        c3 c3Var = this.h;
        if (c3Var != null) {
            for (View view : c3Var.getViewPages()) {
                if (view instanceof y3) {
                    ((y3) view).setVisibleHeight(this.M);
                }
            }
        }
    }
}
